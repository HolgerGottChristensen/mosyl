/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.depot.Root;

import org.mdse.pts.network.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getDepot <em>Depot</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getTrains <em>Trains</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Network()
	 * @model required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Depot</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.pts.depot.Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depot</em>' reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Depot()
	 * @model required="true"
	 * @generated
	 */
	EList<Root> getDepot();

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

} // Schedule
