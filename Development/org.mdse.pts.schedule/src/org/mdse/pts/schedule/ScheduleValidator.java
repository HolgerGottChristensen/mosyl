package org.mdse.pts.schedule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.CoachClass;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.DepotValidator;
import org.mdse.pts.depot.DiningCoach;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.PassengerCoach;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;

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
		if (SchedulePackage.eINSTANCE.getRoute().equals(eClass)) {
			Route route = (Route) eObject;
			modelIsValid &= validateRoute(route);
		}
		if (SchedulePackage.eINSTANCE.getTime().equals(eClass)) {
			Time time = (Time) eObject;
			modelIsValid &= validateTime(time);
		}
		if (SchedulePackage.eINSTANCE.getStop().equals(eClass)) {
			Stop stop = (Stop) eObject;
			modelIsValid &= validateStop(stop);
		}
		
		if(!modelIsValid) {
			constraintViolated(eObject, eObject.toString() + ": some problem occured");
		}
		return modelIsValid;
	}
	
	private boolean validateStop(Stop stop) {
		boolean modelIsValid = false;
				
		modelIsValid &= validateLegsbetweenSameStopsHaveNames(stop);
				
		return modelIsValid;
	}
	
	private boolean validateTime(Time time) {
		boolean modelIsValid = false;
		
		modelIsValid &= validateTimeIsConsistent(time);
		
		return modelIsValid;
	}
	
	private boolean validateRoute(Route route) {
		boolean modelIsValid = false;
		
		modelIsValid &= validateRouteIsNavigateable(route);
		modelIsValid &= validateStopExistsOnceInRoute(route);
		
		return modelIsValid;
	}
	
	private boolean validateSchedule(Schedule schedule) {
		boolean modelIsValid = false;
		
		modelIsValid &= validateRouteIsUniqueToSchedule(schedule);
		modelIsValid &= validateRouteExistsInNetwork(schedule);
		modelIsValid &= validateTrainExistsInDepot(schedule);
		modelIsValid &= validateDepotExistsOnce(schedule);
		
		return modelIsValid;
	}
	
	private boolean validateTrainSchedule(TrainSchedule trainSchedule) {
		boolean modelIsValid = false;
		
		modelIsValid &= validateTrainCoachesForReversableStop(trainSchedule);
		
		return modelIsValid;
	}
	
	private boolean validateStopExistsOnceInRoute(Route route) {
		boolean stationExistsOnce = false;
		boolean stopExistsOnce = false;
		
		List<network.Station> stations = route.getStops().stream()
				.map(s -> s.getStation())
				.collect(Collectors.toList());
		HashSet<network.Station> stationSet = new HashSet<>(stations);
		stationExistsOnce = stationSet.size() == stations.size();
		stopExistsOnce = route.getStops().size() == new HashSet<>(route.getStops()).size();
		
		if(!stationExistsOnce || !stopExistsOnce) {
			constraintViolated(route, route.toString() + ": contains the same station/stop multiple times");
		}
		return stationExistsOnce;
	}
	
	private boolean validateDepotExistsOnce(Schedule schedule) {
		boolean depotExistsOnce = schedule.getDepot().size() == new HashSet<>(schedule.getDepot()).size();
		
		if(!depotExistsOnce) {
			constraintViolated(schedule, schedule.toString() + ": contains the same depot multiple times");
		}
		return depotExistsOnce;
	}
	
	private boolean validateRouteExistsInNetwork(Schedule schedule) {
		boolean existsInNetwork = true;
		
		for(Route r : schedule.getRoutes()) {
			for(Stop s : r.getStops()) {
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
		
		for(TrainSchedule ts1 : schedule.getTrains()) {
			for(TrainSchedule ts2 : schedule.getTrains()) {
				if(!ts1.equals(ts2)) {
					isUnique &= !ts1.getRoute().equals(ts2.getRoute()) && routeEqual(ts1.getRoute(), ts2.getRoute());
				}
			}
		}
		if(!isUnique) {
			constraintViolated(schedule, schedule.toString() + ": some route is used more than once by multiple train schedules");
		}
		return isUnique;
	}
	
	private boolean validateTrainCoachesForReversableStop(TrainSchedule trainSchedule) {
		if(trainSchedule.getRoute().getStops().stream().anyMatch(stop -> stop.isRotate())) {
			List<depot.Coach> coaches = trainSchedule.getTrain().getCoach().stream()
					.filter(coach -> Locomotive.class.isInstance(coach))
					.collect(Collectors.toList());
			boolean twiceLocomotive = 2 == coaches.size();
			if(!twiceLocomotive) {
				constraintViolated(trainSchedule, trainSchedule.toString() + ": train must have two locmotives for turning on route");
			}
			return twiceLocomotive;
		}
		return true;
	}
	
	private boolean validateRouteIsNavigateable(Route route) {
		//solve connected components problem
		boolean[] marked = new boolean[route.getStops().size()];
		int count = 0;
		Stop[] stopArray = (Stop[]) route.getStops().toArray();
		
		HashMap<network.Station, Stop> map = new HashMap<>();
		HashMap<network.Station, Integer> id = new HashMap<>();
		
		for(int s = 0; s < stopArray.length; s++) {
			map.put(stopArray[s].getStation(), stopArray[s]);
			id.put(stopArray[s].getStation(), s);
		}
		
		for(int s = 0; s < stopArray.length; s++) {
			if(!marked[s]) {
				dfs(map, id, stopArray, marked, s);
				count++;
			}
		}
		
		boolean singleComponent = count == 1;

		if(!singleComponent) {
			constraintViolated(route, route.toString() + ": route is not navigateable");
		}
		return singleComponent;
	}
	
	private boolean validateTimeIsConsistent(Time time) {
		boolean isConsistent = ((0 <= time.getHour()) && (time.getHour() <= 23)) && ((0 <= time.getMinute()) && (time.getMinute() <= 59));
		
		if(!isConsistent) {
			constraintViolated(time, time.getHour() + ":" + time.getMinute() + " is not a valid time");
		}
		return isConsistent;
	}
	
	private boolean validateLegsbetweenSameStopsHaveNames(Stop stop) {
		boolean specifiable = true;
		
		network.Station st = stop.getStation();
		
		List<network.Station> stationList = st.getLegs().stream()
				.map(l -> l.getStations().get(0).equals(st) ? l.getStations().get(1) : l.getStations().get(0))
				.collect(Collectors.toList());
		
		HashSet<network.Station> stationSet = new HashSet<>(stationList);
		specifiable = stationList.size() == stationSet.size() || stop.getVia() != null;
		
		if(!specifiable) {
			constraintViolated(stop, stop.getStation().getName() + ": is sourced for from a station with unspecifiable legs to this stop");
		}
		return specifiable;
	}
	
	//helper functions
	private void dfs(HashMap<network.Station, Stop> map, HashMap<network.Station, Integer> id, Stop[] stopArray, boolean[] marked, int v) {
		marked[v] = true;
		for(network.Leg l : stopArray[v].getStation().getLegs()) {
			for(network.Station s: l.getStations()) {
				if(!marked[id.get(s)]) {
					dfs(map, id, stopArray, marked, id.get(s));
				}
			}
		}
	}
	
	private boolean routeEqual(Route r1, Route r2) {
		if(r1.getStops().size() != r2.getStops().size()) return false;
		
		for(Stop s : r2.getStops()) {
			if (!r2.getStops().contains(s)) return false;
		}
		return true;
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}

}
