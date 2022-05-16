package org.mdse.pts.schedule.dsl.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.internal.xtend.expression.ast.LetExpression;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.TrainType;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.time.Time;
import org.mdse.pts.time.TimeFactory;
import org.mdse.pts.time.Weekday;
import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Table;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetableFactory;


public class Scheduler2TimetableConverter {
	
	public static int speed(Train train) {
		if(train.getType() == TrainType.INTERCITY) {
			return train.getCoach().size() < 8 ? 150 : 130;
		} else {
			return 80;
		}
	}
	
	public static Time timeFromMinutes(int minutes) {
		Time time = TimeFactory.eINSTANCE.createTime();
		time.setHour(minutes / 60 % 24);
		time.setMinute(minutes % 60);
		
		return time;
	}
	
	public static Weekday weekdayFromMinutes(Weekday wd, int minutes) {
		int offsetInDays = minutes / 60 / 24;
		
		return (Weekday.get((wd.getValue() + offsetInDays) % 7));
	}
	
	public static Leg getLegBetween(Stop s1, Stop s2) {
		if (s2.getVia() == null) {
			Optional<Leg> legOptional = s1.getStation().getLegs().stream().filter(x -> x.getStations().contains(s2.getStation())).findFirst();
			if (!legOptional.isPresent()) {
				throw new RuntimeException("No connection between the given stops");
			} else {
				return legOptional.get();
			}
		} else {
			return s2.getVia();
		}
	}
	
	public static Timetable convert(Schedule schedule) {
		
		List<TrainSchedule> trainSchedules = schedule.getTrains();
		Set<Station> stationSet = new HashSet<>();
		for(TrainSchedule ts : trainSchedules) {
			stationSet.addAll(ts.getStops().stream().map(s -> s.getStation()).collect(Collectors.toList()));
		}
		//TODO: create map from station to tables
		HashMap<Station, Table> tableMap = new HashMap<>();
		for(Station s : stationSet) {
			tableMap.put(s, TimetableFactory.eINSTANCE.createTable());
		}
		
		for(TrainSchedule ts : trainSchedules) {
			int trainSpeed = speed(ts.getTrain());
			
			for(StartTime startTime : ts.getStarttimes()) {
				for(Weekday weekday : startTime.getWeekdays()) {
					for(org.mdse.pts.schedule.Time time : startTime.getTimestamps()) {
						
						//TODO: set time
						int currentTime = time.getHour() * 60 + time.getMinute(); // convert start time to minutes
						Weekday startDay = weekday;
						
						for(int i = 1; i < ts.getStops().size(); i++) {
							Stop s1 = ts.getStops().get(i - 1);
							Stop s2 = ts.getStops().get(i);
							
							// Add stop time before next iteration
							currentTime += s1.getStoppedTime();
							
							Departure dp = TimetableFactory.eINSTANCE.createDeparture();
							dp.setTime(timeFromMinutes(currentTime));
							dp.setPlatform(s1.getPlatform());
							dp.setDestination(s2.getStation());
							dp.setTrain(ts.getTrain());
							dp.setWeekday(weekdayFromMinutes(startDay, currentTime));
							
							
							// Calculate time to arrive at next station
							Leg leg = getLegBetween(s1, s2);
							int legDistance = leg.getDistance();
							int travelTime = (int) Math.ceil((1.0 * legDistance / trainSpeed) * 60);
							currentTime += travelTime;
							
							
							Arrival ar = TimetableFactory.eINSTANCE.createArrival();
							ar.setTime(timeFromMinutes(currentTime));
							ar.setPlatform(s1.getPlatform());
							ar.setOrigin(s1.getStation());
							ar.setTrain(ts.getTrain());
							ar.setWeekday(weekdayFromMinutes(startDay, currentTime));
							
							
							
							
							// Add the arrivals and departures
							tableMap.get(s2.getStation()).getArrivals().add(ar);
							tableMap.get(s1.getStation()).getDepartures().add(dp);
						}
					}
				}
			}
		}
		
		Timetable tt = TimetableFactory.eINSTANCE.createTimetable();
		List<Station> stations = new ArrayList<>(stationSet);
		stations.sort((x, y) -> x.getName().compareTo(y.getName()));
		
		for(Station s : stations) {
			tt.getTable().add(tableMap.get(s));
			tt.getTable().get(tt.getTable().size() - 1).setStation(s);
		}
		
		// Sort all the arrivals and departures by weekday
		for(Table t : tt.getTable()) {
			
		    ArrayList<Arrival> arrivals = new ArrayList<Arrival>(t.getArrivals());
		    arrivals.sort((x, y) -> (y.getTime().getHour()*60 + y.getTime().getMinute()) - (x.getTime().getHour()*60 + x.getTime().getMinute()));
		    arrivals.sort((x, y) -> x.getWeekday().getValue() - y.getWeekday().getValue());
		    
		    
		    ArrayList<Departure> departures = new ArrayList<Departure>(t.getDepartures());
		    departures.sort((x, y) -> (y.getTime().getHour()*60 + y.getTime().getMinute()) - (x.getTime().getHour()*60 + x.getTime().getMinute()));
			departures.sort((x, y) -> x.getWeekday().getValue() - y.getWeekday().getValue());
			
			t.getArrivals().clear();
			t.getArrivals().addAll(arrivals);
			
			t.getDepartures().clear();
			t.getDepartures().addAll(departures);
		}
		
		return tt;
	}
}
