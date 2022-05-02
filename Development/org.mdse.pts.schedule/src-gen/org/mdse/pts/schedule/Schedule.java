/**
 */
package org.mdse.pts.schedule;

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
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {

	/**
	 * Returns the value of the '<em><b>Networkreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkreference</em>' containment reference.
	 * @see #setNetworkreference(NetworkReference)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Networkreference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NetworkReference getNetworkreference();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getNetworkreference <em>Networkreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkreference</em>' containment reference.
	 * @see #getNetworkreference()
	 * @generated
	 */
	void setNetworkreference(NetworkReference value);

	/**
	 * Returns the value of the '<em><b>Depotreference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.DepotReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depotreference</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Depotreference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DepotReference> getDepotreference();

	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Train}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_Trains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Train> getTrains();
} // Schedule
