package org.mdse.pts.schedule.dsl.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.*;

import depot.TrainType;
import network.Leg;
import network.Station;

public class Scheduler2TimetableConverter {

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
			for(StartTime startTime : ts.getStarttimes()) {
				for(Weekday weekday : startTime.getWeekdays()) {
					for(Time time : startTime.getTimestamps()) {
						
						//TODO: set time
						int minutes = time.getHour() * 60 + time.getMinute(); // convert start time to minutes
						Weekday currentDay = weekday;
						
						for(int i = 1; i < ts.getStops().size(); i++) {
							
							Departure dp = TimetableFactory.eINSTANCE.createDeparture();
							Arrival ar = TimetableFactory.eINSTANCE.createArrival();
							
							Weekday arrivalWeekday;
							Weekday departureWeekday;
							
							Stop s1 = ts.getStops().get(i - 1);
							Stop s2 = ts.getStops().get(i);
							Leg leg = s1.getStation().getLegs().stream()
									.filter(l -> l.getStations().contains(s1) && l.getStations().contains(s2))
									.findFirst()
									.get();
							int distance = leg.getDistance();
							TrainType trainType = ts.getTrain().getType();
							int trainSpeed = 0;
							if(trainType == TrainType.INTERCITY) {
								trainSpeed = ts.getTrain().getCoach().size() < 8 ? 150 : 130;
							} else {
								trainSpeed = 80;
							}
							int timeInMinutes = (int) Math.ceil((distance * 1.0 / trainSpeed) * 60);
							
							minutes += timeInMinutes;
							
							int arrivalInMinutes = minutes;
							int departureInMinutes = arrivalInMinutes + s2.getStoppedTime();
							
							int arrivalTimeMinutes = arrivalInMinutes % 60;
							int arrivalTimeHours = (arrivalInMinutes / 60) % 24;
							currentDay = (arrivalInMinutes / 60) < 24 ? weekday : Weekday.values()[(currentDay.ordinal() + 1) % 7];
							arrivalWeekday = currentDay;
							
							int departureTimeMinutes = departureInMinutes % 60;
							int departureTimeHours = (departureInMinutes / 60) % 24;
							currentDay = (arrivalInMinutes / 60) < 24 ? weekday : Weekday.values()[(currentDay.ordinal() + 1) % 7];
							departureWeekday = currentDay;
							//TODO: add this time to arrival for stop2 and departure for stop1
							//TODO  add calculated weekday
							
							ar.setPlatform(s2.getPlatform());
							ar.setOrigin(s1.getStation());
							ar.setTrain(ts.getTrain());
							Time arTime = TimetableFactory.eINSTANCE.createTime();
							arTime.setHour(arrivalTimeHours);
							arTime.setMinute(arrivalTimeMinutes);
							ar.setTime(arTime);
							ar.setWeekday(arrivalWeekday);
							
							dp.setPlatform(s1.getPlatform());
							dp.setDestination(s2.getStation());
							dp.setTrain(ts.getTrain());
							Time dpTime = TimetableFactory.eINSTANCE.createTime();
							dpTime.setHour(departureTimeHours);
							dpTime.setMinute(departureTimeMinutes);
							dp.setTime(dpTime);
							dp.setWeekday(departureWeekday);
							
							tableMap.get(s2.getStation()).getJunctures().add(ar);
							tableMap.get(s1.getStation()).getJunctures().add(dp);
						}
						
					}
				}
			}
		}
		
		Timetable tt = TimetableFactory.eINSTANCE.createTimetable();
		tt.getStation().addAll(stationSet);
		for(Station s : stationSet) {
			tt.getTable().add(tableMap.get(s));
		}
		return tt;
	}
}
