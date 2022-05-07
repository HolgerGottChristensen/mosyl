/**
 */
package org.mdse.pts.schedule;

import depot.Train;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.TrainSchedule#getTrain <em>Train</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.TrainSchedule#getStarttimes <em>Starttimes</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.TrainSchedule#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getTrainSchedule()
 * @model
 * @generated
 */
public interface TrainSchedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrainSchedule_Train()
	 * @model required="true"
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.TrainSchedule#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

	/**
	 * Returns the value of the '<em><b>Starttimes</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.StartTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starttimes</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrainSchedule_Starttimes()
	 * @model containment="true"
	 * @generated
	 */
	EList<StartTime> getStarttimes();

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrainSchedule_Stops()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Stop> getStops();

} // TrainSchedule
