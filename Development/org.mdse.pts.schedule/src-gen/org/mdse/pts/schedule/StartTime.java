/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.mdse.pts.time.Weekday;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.StartTime#getWeekdays <em>Weekdays</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.StartTime#getTimestamps <em>Timestamps</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getStartTime()
 * @model
 * @generated
 */
public interface StartTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Weekdays</b></em>' attribute list.
	 * The list contents are of type {@link org.mdse.pts.time.Weekday}.
	 * The literals are from the enumeration {@link org.mdse.pts.time.Weekday}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekdays</em>' attribute list.
	 * @see org.mdse.pts.time.Weekday
	 * @see org.mdse.pts.schedule.SchedulePackage#getStartTime_Weekdays()
	 * @model required="true"
	 * @generated
	 */
	EList<Weekday> getWeekdays();

	/**
	 * Returns the value of the '<em><b>Timestamps</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamps</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getStartTime_Timestamps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Time> getTimestamps();

} // StartTime
