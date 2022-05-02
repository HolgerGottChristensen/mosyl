/**
 */
package org.mdse.pts.schedule;

import depot.Root;

import network.Network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getNetworkreference <em>Networkreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getDepotreference <em>Depotreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getTrains <em>Trains</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Networkreference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkreference</em>' reference.
	 * @see #setNetworkreference(Network)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Networkreference()
	 * @model required="true"
	 * @generated
	 */
	Network getNetworkreference();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getNetworkreference <em>Networkreference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkreference</em>' reference.
	 * @see #getNetworkreference()
	 * @generated
	 */
	void setNetworkreference(Network value);

	/**
	 * Returns the value of the '<em><b>Depotreference</b></em>' reference list.
	 * The list contents are of type {@link depot.Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depotreference</em>' reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Depotreference()
	 * @model required="true"
	 * @generated
	 */
	EList<Root> getDepotreference();

	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.TrainSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Trains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrainSchedule> getTrains();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Schedule
