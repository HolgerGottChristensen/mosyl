/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.network.Station;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Table#getArrivals <em>Arrivals</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Table#getStation <em>Station</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Table#getDepartures <em>Departures</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Arrivals</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.timetable.Arrival}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrivals</em>' containment reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTable_Arrivals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arrival> getArrivals();

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see org.mdse.pts.timetable.TimetablePackage#getTable_Station()
	 * @model required="true"
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Table#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

	/**
	 * Returns the value of the '<em><b>Departures</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.timetable.Departure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departures</em>' containment reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTable_Departures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Departure> getDepartures();

} // Table
