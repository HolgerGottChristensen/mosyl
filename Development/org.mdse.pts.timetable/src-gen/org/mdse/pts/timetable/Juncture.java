/**
 */
package org.mdse.pts.timetable;

import depot.Train;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.mdse.pts.timetable.Juncture#getTime <em>Time</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Juncture#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture()
 * @model
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
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see org.mdse.pts.timetable.TimetablePackage#getJuncture_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Juncture#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

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

} // Juncture
