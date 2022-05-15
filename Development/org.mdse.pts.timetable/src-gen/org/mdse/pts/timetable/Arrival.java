/**
 */
package org.mdse.pts.timetable;

import org.mdse.pts.network.Station;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrival</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Arrival#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getArrival()
 * @model
 * @generated
 */
public interface Arrival extends Juncture {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Station)
	 * @see org.mdse.pts.timetable.TimetablePackage#getArrival_Origin()
	 * @model required="true"
	 * @generated
	 */
	Station getOrigin();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Arrival#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Station value);

} // Arrival
