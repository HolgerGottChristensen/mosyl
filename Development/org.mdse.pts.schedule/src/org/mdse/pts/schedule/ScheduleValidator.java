package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.Root;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;


public class ScheduleValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
		EValidator.Registry.INSTANCE.put(SchedulePackage.eINSTANCE, new ScheduleValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		if (SchedulePackage.eINSTANCE.getSchedule().equals(eClass)) {
			Schedule schedule = (Schedule) eObject;
			modelIsValid &= validateSchedule(schedule);
		}
		if (SchedulePackage.eINSTANCE.getTrainSchedule().equals(eClass)) {
			TrainSchedule trainSchedule = (TrainSchedule) eObject;
			modelIsValid &= validateTrainSchedule(trainSchedule);
		}
		if (SchedulePackage.eINSTANCE.getTime().equals(eClass)) {
			Time time = (Time) eObject;
			modelIsValid &= validateTime(time);
		}
		
		return modelIsValid;
	}
	
	private boolean validateTime(Time time) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateTimeIsConsistent(time);
		
		return modelIsValid;
	}
	
	private boolean validateSchedule(Schedule schedule) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateRouteIsUniqueToSchedule(schedule);
		modelIsValid &= validateRouteExistsInNetwork(schedule);
		modelIsValid &= validateTrainExistsInDepot(schedule);
		modelIsValid &= validateDepotExistsOnce(schedule);
		
		return modelIsValid;
	}
	
	private boolean validateTrainSchedule(TrainSchedule trainSchedule) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateTrainCoachesForReversableStop(trainSchedule);
		modelIsValid &= validateRouteIsNavigateable(trainSchedule);
		modelIsValid &= validateStopExistsOnceInRoute(trainSchedule);
		modelIsValid &= validateLegsbetweenStopsAreSpecifiable(trainSchedule);
		
		return modelIsValid;
	}
	
	// If there are two unnamed legs between the same two stations a via must be specified.
	// If there is only one unnamed leg, this is chosen unless there is a via.
	private boolean validateLegsbetweenStopsAreSpecifiable(TrainSchedule trainSchedule) {
		boolean specifiable = true;
		
		//iterate over all pair of stops with legs between them
		for(int i = 1; i < trainSchedule.getStops().size(); i++) {
			
			Stop fromStop = trainSchedule.getStops().get(i-1);
			Stop toStop = trainSchedule.getStops().get(i);
			Station fromStation = fromStop.getStation();
			Station toStation = toStop.getStation();
			
			//retrieve the list of legs between fromStop and toStop
			List<Leg> legList = fromStation.getLegs().stream()
					.filter(l -> l.getStations().contains(toStation))
					.filter(l -> l.getName() == null)
					.collect(Collectors.toList());
			//make sure that either there is one leg between them or the leg to choose is specified by "via"
			specifiable &= (legList.size() < 2 || toStop.getVia() != null);
		}
		if(!specifiable) {
			constraintViolated(trainSchedule, trainSchedule.toString() + ": has a stop sourced for from a station with unspecifiable legs to this stop");
		}
		return specifiable;
	}
	
	private boolean validateStopExistsOnceInRoute(TrainSchedule trainSchedule) {
		boolean stationExistsOnce = false;
		boolean stopExistsOnce = false;
		//retrieve stations in route
		List<Station> stations = trainSchedule.getStops().stream()
				.map(s -> s.getStation())
				.collect(Collectors.toList());
		//if set has different size than list, then station exists several times in route
		HashSet<Station> stationSet = new HashSet<>(stations);
		stationExistsOnce = stationSet.size() == stations.size();
		//if set has different size than list, then stops exists several times in route
		stopExistsOnce = trainSchedule.getStops().size() == new HashSet<>(trainSchedule.getStops()).size();
		System.out.println("station: " + stationExistsOnce);
		System.out.println("stop: " + stopExistsOnce);
		
		if(!stationExistsOnce || !stopExistsOnce) {
			constraintViolated(trainSchedule, trainSchedule.toString() + ": contains the same station/stop multiple times");
		}
		return stationExistsOnce;
	}
	
	private boolean validateDepotExistsOnce(Schedule schedule) {
		//if set has different size than list, then depot exists several times in system
		HashSet<Root> depots = new HashSet<>();
		for(Root r : schedule.getDepot()) {
			depots.add(r);
		}
		boolean depotExistsOnce = depots.size() == schedule.getDepot().size();
		if(!depotExistsOnce) {
			constraintViolated(schedule, schedule.toString() + ": contains the same depot multiple times");
		}
		return depotExistsOnce;
	}
	
	private boolean validateRouteExistsInNetwork(Schedule schedule) {
		boolean existsInNetwork = true;
		//for each schedule make sure that the station for each stop exists in the network
		for(TrainSchedule ts : schedule.getTrains()) {
			for(Stop s : ts.getStops()) {
				existsInNetwork &= schedule.getNetwork().getStations().contains(s.getStation());
			}
		}
		if(!existsInNetwork) {
			constraintViolated(schedule, schedule.toString() + ": some station does not exist in the network of the schedules");
		}
		return existsInNetwork;
	}
	
	private boolean validateTrainExistsInDepot(Schedule schedule) {
		boolean existsInDepot = true;
		//for all trains check if train exists in any depot
		existsInDepot &= schedule.getTrains().stream().allMatch(t -> {
			return schedule.getDepot().stream().anyMatch(d -> d.getDepot().getTrain().contains(t.getTrain()));
		});
		
		if(!existsInDepot) {
			constraintViolated(schedule, schedule.toString() + ": some train does not exist in the depots of the schedules");
		}
		return existsInDepot;
	}
	
	private boolean validateRouteIsUniqueToSchedule(Schedule schedule) {
		boolean isUnique = true;
		//check if any pair of schedules have the same route
		for(TrainSchedule ts1 : schedule.getTrains()) {
			for(TrainSchedule ts2 : schedule.getTrains()) {
				if(!ts1.equals(ts2)) {
					isUnique &= !routeEqual(ts1, ts2);
				}
			}
		}
		if(!isUnique) {
			constraintViolated(schedule, schedule.toString() + ": some route is used more than once by multiple train schedules");
		}
		return isUnique;
	}
	
	private boolean validateTrainCoachesForReversableStop(TrainSchedule trainSchedule) {
		//check if schedule has a stop where it rotates
		if(trainSchedule.getStops().stream().anyMatch(stop -> stop.isRotate())) {
			//retrieve locomotives from train
			List<Coach> coaches = trainSchedule.getTrain().getCoach().stream()
					.filter(coach -> Locomotive.class.isInstance(coach))
					.collect(Collectors.toList());
			//check if there is two coaches (from & back)
			boolean twiceLocomotive = 2 == coaches.size();
			if(!twiceLocomotive) {
				constraintViolated(trainSchedule, trainSchedule.toString() + ": train must have two locmotives for turning on route");
			}
			return twiceLocomotive;
		}
		return true;
	}
	
	private boolean validateTimeIsConsistent(Time time) {
		//hour should be between 0 and 23, minute should be between 0 and 59 (both inclusive)
		boolean isConsistent = ((0 <= time.getHour()) && (time.getHour() <= 23)) && ((0 <= time.getMinute()) && (time.getMinute() <= 59));
		
		if(!isConsistent) {
			constraintViolated(time, time.getHour() + ":" + time.getMinute() + " is not a valid time");
		}
		return isConsistent;
	}
	
	private boolean validateRouteIsNavigateable(TrainSchedule trainSchedule) {
		boolean navigateable = true;
		//iterate over pairs of stops that have legs between them
		for(int i = 1; i < trainSchedule.getStops().size(); i++) {	
			Stop fromStop = trainSchedule.getStops().get(i-1);
			Stop toStop = trainSchedule.getStops().get(i);
			Station fromStation = fromStop.getStation();
			Station toStation = toStop.getStation();
			//make sure that fromStop has a leg to toStop
			navigateable &= fromStation.getLegs().stream().anyMatch(l -> l.getStations().contains(toStation));
		}
		if(!navigateable) {
			constraintViolated(trainSchedule, trainSchedule.toString() + ": route is not navigateable");
		}
		return navigateable;
	}
	
	//helper functions
	private boolean routeEqual(TrainSchedule t1, TrainSchedule t2) {
		if(t1.getStops().size() != t2.getStops().size()) return false;
		boolean sameRoute = true;
		for(int i = 0; i < t1.getStops().size(); i++) {
			Stop s1 = t1.getStops().get(i);
			Stop s2 = t2.getStops().get(i);
			sameRoute &= s1.getStation().getName() == s2.getStation().getName() && s1.getVia() == s2.getVia();
		}
		return sameRoute;
		//return t1.getStops() == t2.getStops();
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}

}
