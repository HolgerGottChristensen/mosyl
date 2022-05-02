/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.schedule.LegReference;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Station;
import org.mdse.pts.schedule.StationReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#getStoppedTime <em>Stopped Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#getStationreference <em>Stationreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#getVia <em>Via</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationImpl extends MinimalEObjectImpl.Container implements Station {
	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoppedTime() <em>Stopped Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppedTime()
	 * @generated
	 * @ordered
	 */
	protected static final int STOPPED_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStoppedTime() <em>Stopped Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppedTime()
	 * @generated
	 * @ordered
	 */
	protected int stoppedTime = STOPPED_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStationreference() <em>Stationreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationreference()
	 * @generated
	 * @ordered
	 */
	protected StationReference stationreference;

	/**
	 * The cached value of the '{@link #getVia() <em>Via</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVia()
	 * @generated
	 * @ordered
	 */
	protected LegReference via;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStoppedTime() {
		return stoppedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoppedTime(int newStoppedTime) {
		int oldStoppedTime = stoppedTime;
		stoppedTime = newStoppedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__STOPPED_TIME, oldStoppedTime, stoppedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StationReference getStationreference() {
		return stationreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStationreference(StationReference newStationreference, NotificationChain msgs) {
		StationReference oldStationreference = stationreference;
		stationreference = newStationreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__STATIONREFERENCE, oldStationreference, newStationreference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStationreference(StationReference newStationreference) {
		if (newStationreference != stationreference) {
			NotificationChain msgs = null;
			if (stationreference != null)
				msgs = ((InternalEObject)stationreference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.STATION__STATIONREFERENCE, null, msgs);
			if (newStationreference != null)
				msgs = ((InternalEObject)newStationreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.STATION__STATIONREFERENCE, null, msgs);
			msgs = basicSetStationreference(newStationreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__STATIONREFERENCE, newStationreference, newStationreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegReference getVia() {
		return via;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVia(LegReference newVia, NotificationChain msgs) {
		LegReference oldVia = via;
		via = newVia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__VIA, oldVia, newVia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVia(LegReference newVia) {
		if (newVia != via) {
			NotificationChain msgs = null;
			if (via != null)
				msgs = ((InternalEObject)via).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.STATION__VIA, null, msgs);
			if (newVia != null)
				msgs = ((InternalEObject)newVia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.STATION__VIA, null, msgs);
			msgs = basicSetVia(newVia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__VIA, newVia, newVia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.STATION__STATIONREFERENCE:
				return basicSetStationreference(null, msgs);
			case SchedulePackage.STATION__VIA:
				return basicSetVia(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.STATION__PLATFORM:
				return getPlatform();
			case SchedulePackage.STATION__STOPPED_TIME:
				return getStoppedTime();
			case SchedulePackage.STATION__STATIONREFERENCE:
				return getStationreference();
			case SchedulePackage.STATION__VIA:
				return getVia();
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
			case SchedulePackage.STATION__PLATFORM:
				setPlatform((String)newValue);
				return;
			case SchedulePackage.STATION__STOPPED_TIME:
				setStoppedTime((Integer)newValue);
				return;
			case SchedulePackage.STATION__STATIONREFERENCE:
				setStationreference((StationReference)newValue);
				return;
			case SchedulePackage.STATION__VIA:
				setVia((LegReference)newValue);
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
			case SchedulePackage.STATION__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case SchedulePackage.STATION__STOPPED_TIME:
				setStoppedTime(STOPPED_TIME_EDEFAULT);
				return;
			case SchedulePackage.STATION__STATIONREFERENCE:
				setStationreference((StationReference)null);
				return;
			case SchedulePackage.STATION__VIA:
				setVia((LegReference)null);
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
			case SchedulePackage.STATION__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case SchedulePackage.STATION__STOPPED_TIME:
				return stoppedTime != STOPPED_TIME_EDEFAULT;
			case SchedulePackage.STATION__STATIONREFERENCE:
				return stationreference != null;
			case SchedulePackage.STATION__VIA:
				return via != null;
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
		result.append(" (platform: ");
		result.append(platform);
		result.append(", stoppedTime: ");
		result.append(stoppedTime);
		result.append(')');
		return result.toString();
	}

} //StationImpl
