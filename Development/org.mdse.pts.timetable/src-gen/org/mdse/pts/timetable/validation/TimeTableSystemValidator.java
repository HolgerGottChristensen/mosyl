/**
 *
 * $Id$
 */
package org.mdse.pts.timetable.validation;

import org.eclipse.emf.common.util.EList;

import org.mdse.pts.timetable.Table;

/**
 * A sample validator interface for {@link org.mdse.pts.timetable.TimeTableSystem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TimeTableSystemValidator {
	boolean validate();

	boolean validateTable(EList<Table> value);
}
