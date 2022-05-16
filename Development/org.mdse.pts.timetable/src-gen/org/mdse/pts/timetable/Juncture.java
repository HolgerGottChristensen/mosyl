/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.depot.Train;

import org.mdse.pts.time.Time;
import org.mdse.pts.time.Weekday;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Juncture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Juncture#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Juncture#getTrain <em>Train</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Juncture#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Juncture#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture()
 * @model abstract="true"
 * @generated
 */
public interface Juncture extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Juncture#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture_Train()
	 * @model required="true"
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Juncture#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

	/**
	 * Returns the value of the '<em><b>Weekday</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mdse.pts.time.Weekday}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekday</em>' attribute.
	 * @see org.mdse.pts.time.Weekday
	 * @see #setWeekday(Weekday)
	 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture_Weekday()
	 * @model required="true"
	 * @generated
	 */
	Weekday getWeekday();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Juncture#getWeekday <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekday</em>' attribute.
	 * @see org.mdse.pts.time.Weekday
	 * @see #getWeekday()
	 * @generated
	 */
	void setWeekday(Weekday value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(Time)
	 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture_Time()
	 * @model required="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Juncture#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // Juncture
