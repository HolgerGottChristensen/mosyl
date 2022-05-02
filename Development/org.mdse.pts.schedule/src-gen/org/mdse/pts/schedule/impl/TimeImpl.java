/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.TimeImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TimeImpl#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends MinimalEObjectImpl.Container implements Time {
	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final byte HOUR_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected byte hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final byte MINUTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected byte minute = MINUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHour(byte newHour) {
		byte oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TIME__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(byte newMinute) {
		byte oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TIME__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.TIME__HOUR:
				return getHour();
			case SchedulePackage.TIME__MINUTE:
				return getMinute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.TIME__HOUR:
				setHour((Byte)newValue);
				return;
			case SchedulePackage.TIME__MINUTE:
				setMinute((Byte)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulePackage.TIME__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case SchedulePackage.TIME__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulePackage.TIME__HOUR:
				return hour != HOUR_EDEFAULT;
			case SchedulePackage.TIME__MINUTE:
				return minute != MINUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(')');
		return result.toString();
	}

} //TimeImpl
