package org.mdse.pts.schedule;

//import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;


public class ScheduleValidator extends EObjectValidator implements IStartup {
	//private DiagnosticChain diagnostics;
	/*
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
		modelIsValid &= validateRouteIsNavigateable(trainSchedule);
		modelIsValid &= validateStopExistsOnceInRoute(trainSchedule);
		
		return modelIsValid;
	}
	
	private boolean validateStopExistsOnceInRoute(TrainSchedule trainSchedule) {
		boolean stationExistsOnce = false;
		boolean stopExistsOnce = false;
		
		List<network.Station> stations = trainSchedule.getStops().stream()
				.map(s -> s.getStation())
				.collect(Collectors.toList());
		HashSet<network.Station> stationSet = new HashSet<>(stations);
		stationExistsOnce = stationSet.size() == stations.size();
		stopExistsOnce = trainSchedule.getStops().size() == new HashSet<>(trainSchedule.getStops()).size();
		
		if(!stationExistsOnce || !stopExistsOnce) {
			constraintViolated(trainSchedule, trainSchedule.toString() + ": contains the same station/stop multiple times");
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
					isUnique &= routeEqual(ts1, ts2);
				}
			}
		}
		if(!isUnique) {
			constraintViolated(schedule, schedule.toString() + ": some route is used more than once by multiple train schedules");
		}
		return isUnique;
	}
	
	private boolean validateTrainCoachesForReversableStop(TrainSchedule trainSchedule) {
		if(trainSchedule.getStops().stream().anyMatch(stop -> stop.isRotate())) {
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
	
	private boolean validateRouteIsNavigateable(TrainSchedule schedule) {
		//solve connected components problem
		boolean[] marked = new boolean[schedule.getStops().size()];
		int count = 0;
		Stop[] stopArray = (Stop[]) schedule.getStops().toArray();
		
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
			constraintViolated(schedule, schedule.toString() + ": route is not navigateable");
		}
		return singleComponent;
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
	
	private boolean routeEqual(TrainSchedule t1, TrainSchedule t2) {
		if(t1.getStops().size() != t2.getStops().size()) return false;
		
		for(Stop s : t1.getStops()) {
			if (!t2.getStops().contains(s)) return false;
		}
		return true;
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}*/

	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
		
	}

}
