/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Table System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.TimeTableSystem#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getTimeTableSystem()
 * @model
 * @generated
 */
public interface TimeTableSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.timetable.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTimeTableSystem_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

} // TimeTableSystem
