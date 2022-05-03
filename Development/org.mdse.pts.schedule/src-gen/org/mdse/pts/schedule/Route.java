/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Route#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Stops()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Stop> getStops();

} // Route
