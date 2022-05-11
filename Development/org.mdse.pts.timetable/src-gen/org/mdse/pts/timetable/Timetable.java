/**
 */
package org.mdse.pts.timetable;

import network.Station;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Timetable#getTable <em>Table</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Timetable#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getTimetable()
 * @model
 * @generated
 */
public interface Timetable extends EObject {

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.timetable.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTimetable_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference list.
	 * The list contents are of type {@link network.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTimetable_Station()
	 * @model
	 * @generated
	 */
	EList<Station> getStation();
} // Timetable
