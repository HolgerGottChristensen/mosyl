/**
 */
package org.mdse.pts.timetable;

import org.mdse.pts.network.Station;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Departure#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getDeparture()
 * @model
 * @generated
 */
public interface Departure extends Juncture {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Station)
	 * @see org.mdse.pts.timetable.TimetablePackage#getDeparture_Destination()
	 * @model required="true"
	 * @generated
	 */
	Station getDestination();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Departure#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Station value);

} // Departure
