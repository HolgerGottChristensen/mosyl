package org.mdse.pts.timetable.jet;

import org.mdse.pts.timetable.*;
import java.util.*;

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
  protected final String TEXT_1 = NL + "<!-- TODO: Generate HTML Code -->" + NL + "<h1>";
  protected final String TEXT_2 = "</h1>" + NL + "<h1>";
  protected final String TEXT_3 = "</h1>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Timetable t = (Timetable) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( t.getStations().get(0).getName() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( t.getStations().get(0).getName() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
