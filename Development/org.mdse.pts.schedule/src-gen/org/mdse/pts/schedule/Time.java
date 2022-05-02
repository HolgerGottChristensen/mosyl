/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Time#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Time#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(byte)
	 * @see org.mdse.pts.schedule.SchedulePackage#getTime_Hour()
	 * @model required="true"
	 * @generated
	 */
	byte getHour();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Time#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(byte value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(byte)
	 * @see org.mdse.pts.schedule.SchedulePackage#getTime_Minute()
	 * @model required="true"
	 * @generated
	 */
	byte getMinute();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Time#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(byte value);

} // Time
