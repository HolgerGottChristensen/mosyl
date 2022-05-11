package org.mdse.pts.timetable.jet;

import org.mdse.pts.timetable.*;
import java.util.*;
import java.util.stream.Collectors;

public class TT2HTMLTemplate
{
  protected static String nl;
  public static synchronized TT2HTMLTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    TT2HTMLTemplate result = new TT2HTMLTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "\t" + NL + "" + NL + "<!-- TODO: Generate HTML Code -->'" + NL + "" + NL + "<html>" + NL + "\t<head></head>" + NL + "\t<body>" + NL + "\t\t<h1>";
  protected final String TEXT_3 = "</h1>" + NL + "\t\t<div>" + NL + "\t\t\t<div>" + NL + "\t\t\t\t<h2>Arrivals</h2>" + NL + "\t\t\t\t";
  protected final String TEXT_4 = NL + "\t\t\t\t\t<h3>";
  protected final String TEXT_5 = "</h3>" + NL + "\t\t\t\t\t";
  protected final String TEXT_6 = NL + "\t\t\t\t\t\t<p>";
  protected final String TEXT_7 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_8 = NL + "\t\t\t\t\t\tfrom ";
  protected final String TEXT_9 = " on platform ";
  protected final String TEXT_10 = "</p>" + NL + "\t\t\t\t\t";
  protected final String TEXT_11 = NL + "\t\t\t\t";
  protected final String TEXT_12 = NL + "\t\t\t</div>" + NL + "\t\t\t<div>" + NL + "\t\t\t\t<h2>Departures</h2>" + NL + "\t\t\t\t";
  protected final String TEXT_13 = NL + "\t\t\t\t\t\tto ";
  protected final String TEXT_14 = NL + "\t\t\t</div>" + NL + "\t\t</div>" + NL + "\t<body>" + NL + "</html>";
  protected final String TEXT_15 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Table t = (Table) argument; 
    HashMap<Weekday, List<Arrival>> arrivalsByDay = (HashMap<Weekday, List<Arrival>>) t.getJunctures().stream()
	.filter(j -> Arrival.class.isInstance(j))
	.collect(Collectors.toMap(Juncture::getWeekday, Function::identity));
    stringBuffer.append(TEXT_1);
    HashMap<Weekday, List<Departure>> departuresByDay = (HashMap<Weekday, List<Departure>>) t.getJunctures().stream()
	.filter(j -> Departure.class.isInstance(j))
	.collect(Collectors.toMap(Juncture::getWeekday, Function::identity));
    stringBuffer.append(TEXT_2);
    stringBuffer.append( t.getStation().getName());
    stringBuffer.append(TEXT_3);
     for(Weekday w: arrivalsByDay.keySet()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( w.toString());
    stringBuffer.append(TEXT_5);
     for(Arrival a : arrivalsByDay.get(w)) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append( a.getTime().getHours() + ":" + a.getTime().getMinutes());
    stringBuffer.append(TEXT_7);
    stringBuffer.append( a.getTrain().getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append( a.getOrigin().getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append( a.getPlatform());
    stringBuffer.append(TEXT_10);
     } 
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_12);
     for(Weekday w: departuresByDay.keySet()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( w.toString());
    stringBuffer.append(TEXT_5);
     for(Departure d : departuresByDay.get(w)) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append( d.getTime().getHours() + ":" + d.getTime().getMinutes());
    stringBuffer.append(TEXT_7);
    stringBuffer.append( d.getTrain().getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append( d.getDestination().getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append( d.getPlatform());
    stringBuffer.append(TEXT_10);
     } 
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
