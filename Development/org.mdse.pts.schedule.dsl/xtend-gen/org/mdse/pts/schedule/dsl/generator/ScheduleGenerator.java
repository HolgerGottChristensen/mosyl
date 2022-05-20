/**
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.time.Weekday;
import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Table;
import org.mdse.pts.timetable.TimeTableSystem;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ScheduleGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    URI _uRI = resource.getURI();
    String _plus = ("Generating for file: " + _uRI);
    InputOutput.<String>println(_plus);
    String name = resource.getURI().lastSegment();
    String strippedName = StringExtensions.toFirstUpper(name.substring(0, name.indexOf(".")));
    EObject _get = resource.getContents().get(0);
    final Schedule schedule = ((Schedule) _get);
    final TimeTableSystem timetable = Scheduler2TimetableConverter.convert(schedule);
    fsa.generateFile((strippedName + ".html"), this.toHTML(timetable));
  }

  protected CharSequence toHTML(final TimeTableSystem tt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("border-collapse: collapse;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("margin: 25px 0;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("font-size: 0.9em;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("font-family: sans-serif;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("min-width: 400px;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table thead tr {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("background-color: #009879;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("color: #ffffff;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("text-align: left;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table th {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("padding: 12px 15px;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table td {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("padding: 12px 15px;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("border-left: thin solid #dddddd;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table tbody tr {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("border-bottom: thin solid #dddddd;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table tbody tr:nth-of-type(even) {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("background-color: #f3f3f3;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table tbody tr:last-of-type {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("border-bottom: 2px solid #009879;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".styled-table tbody tr.active-row {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("font-weight: bold;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("color: #009879;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    {
      EList<Table> _table = tt.getTable();
      for(final Table t : _table) {
        _builder.append("\t");
        _builder.append("<h1>");
        String _name = t.getStation().getName();
        _builder.append(_name, "\t");
        _builder.append("</h1>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<h2>Arrivals</h2>");
        _builder.newLine();
        {
          int _length = ((Object[])Conversions.unwrapArray(t.getArrivals(), Object.class)).length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _builder.append("\t");
            _builder.append("<table class=\"styled-table\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t  ");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Weekday</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Time</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Train</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Origin</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Information</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Platform</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t  ");
            _builder.append("</tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<tbody>");
            _builder.newLine();
            {
              EList<Arrival> _arrivals = t.getArrivals();
              for(final Arrival w : _arrivals) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<tr>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<td>");
                Weekday _weekday = w.getWeekday();
                _builder.append(_weekday, "\t\t\t");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _format = String.format("%02d", Integer.valueOf(w.getTime().getHour()));
                _builder.append(_format, "\t\t  ");
                _builder.append(":");
                String _format_1 = String.format("%02d", Integer.valueOf(w.getTime().getMinute()));
                _builder.append(_format_1, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _name_1 = w.getTrain().getName();
                _builder.append(_name_1, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _name_2 = w.getOrigin().getName();
                _builder.append(_name_2, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td></td>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _platform = w.getPlatform();
                _builder.append(_platform, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("</tr>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</tbody>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</table>");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("<p>No arrivals for station</p>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<h2>Departures</h2>");
        _builder.newLine();
        {
          int _length_1 = ((Object[])Conversions.unwrapArray(t.getDepartures(), Object.class)).length;
          boolean _greaterThan_1 = (_length_1 > 0);
          if (_greaterThan_1) {
            _builder.append("\t");
            _builder.append("<table class=\"styled-table\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t  ");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Weekday</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Time</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Train</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Destination</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Information</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t    ");
            _builder.append("<th>Platform</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t  ");
            _builder.append("</tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<tbody>");
            _builder.newLine();
            {
              EList<Departure> _departures = t.getDepartures();
              for(final Departure w_1 : _departures) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<tr>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<td>");
                Weekday _weekday_1 = w_1.getWeekday();
                _builder.append(_weekday_1, "\t\t\t");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _format_2 = String.format("%02d", Integer.valueOf(w_1.getTime().getHour()));
                _builder.append(_format_2, "\t\t  ");
                _builder.append(":");
                String _format_3 = String.format("%02d", Integer.valueOf(w_1.getTime().getMinute()));
                _builder.append(_format_3, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _name_3 = w_1.getTrain().getName();
                _builder.append(_name_3, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _name_4 = w_1.getDestination().getName();
                _builder.append(_name_4, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td></td>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("  ");
                _builder.append("<td>");
                String _platform_1 = w_1.getPlatform();
                _builder.append(_platform_1, "\t\t  ");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("</tr>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</tbody>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</table>");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("<p>No departures for station</p>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("<hr>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
