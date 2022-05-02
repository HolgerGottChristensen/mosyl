/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Train#getTrainreference <em>Trainreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Train#getStarttimes <em>Starttimes</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Train#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Trainreference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.TrainReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trainreference</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrain_Trainreference()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainReference> getTrainreference();

	/**
	 * Returns the value of the '<em><b>Starttimes</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.StartTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starttimes</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrain_Starttimes()
	 * @model containment="true"
	 * @generated
	 */
	EList<StartTime> getStarttimes();

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrain_Stops()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Station> getStops();

} // Train
