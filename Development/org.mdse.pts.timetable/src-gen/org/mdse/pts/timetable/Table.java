/**
 */
package org.mdse.pts.timetable;

import network.Station;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Table#getJunctures <em>Junctures</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Table#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Junctures</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.timetable.Juncture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Junctures</em>' containment reference list.
	 * @see org.mdse.pts.timetable.TimetablePackage#getTable_Junctures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Juncture> getJunctures();

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

} // Table
