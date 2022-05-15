/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;

import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Stop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.StopImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StopImpl#getStoppedTime <em>Stopped Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StopImpl#getVia <em>Via</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StopImpl#getStation <em>Station</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StopImpl#isRotate <em>Rotate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopImpl extends MinimalEObjectImpl.Container implements Stop {
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
	 * The cached value of the '{@link #getVia() <em>Via</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVia()
	 * @generated
	 * @ordered
	 */
	protected Leg via;

	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected Station station;

	/**
	 * The default value of the '{@link #isRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRotate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROTATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRotate()
	 * @generated
	 * @ordered
	 */
	protected boolean rotate = ROTATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.STOP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STOP__PLATFORM, oldPlatform, platform));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STOP__STOPPED_TIME, oldStoppedTime, stoppedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leg getVia() {
		if (via != null && via.eIsProxy()) {
			InternalEObject oldVia = (InternalEObject)via;
			via = (Leg)eResolveProxy(oldVia);
			if (via != oldVia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.STOP__VIA, oldVia, via));
			}
		}
		return via;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leg basicGetVia() {
		return via;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVia(Leg newVia) {
		Leg oldVia = via;
		via = newVia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STOP__VIA, oldVia, via));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (Station)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.STOP__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStation(Station newStation) {
		Station oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STOP__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRotate() {
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotate(boolean newRotate) {
		boolean oldRotate = rotate;
		rotate = newRotate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STOP__ROTATE, oldRotate, rotate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.STOP__PLATFORM:
				return getPlatform();
			case SchedulePackage.STOP__STOPPED_TIME:
				return getStoppedTime();
			case SchedulePackage.STOP__VIA:
				if (resolve) return getVia();
				return basicGetVia();
			case SchedulePackage.STOP__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case SchedulePackage.STOP__ROTATE:
				return isRotate();
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
			case SchedulePackage.STOP__PLATFORM:
				setPlatform((String)newValue);
				return;
			case SchedulePackage.STOP__STOPPED_TIME:
				setStoppedTime((Integer)newValue);
				return;
			case SchedulePackage.STOP__VIA:
				setVia((Leg)newValue);
				return;
			case SchedulePackage.STOP__STATION:
				setStation((Station)newValue);
				return;
			case SchedulePackage.STOP__ROTATE:
				setRotate((Boolean)newValue);
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
			case SchedulePackage.STOP__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case SchedulePackage.STOP__STOPPED_TIME:
				setStoppedTime(STOPPED_TIME_EDEFAULT);
				return;
			case SchedulePackage.STOP__VIA:
				setVia((Leg)null);
				return;
			case SchedulePackage.STOP__STATION:
				setStation((Station)null);
				return;
			case SchedulePackage.STOP__ROTATE:
				setRotate(ROTATE_EDEFAULT);
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
			case SchedulePackage.STOP__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case SchedulePackage.STOP__STOPPED_TIME:
				return stoppedTime != STOPPED_TIME_EDEFAULT;
			case SchedulePackage.STOP__VIA:
				return via != null;
			case SchedulePackage.STOP__STATION:
				return station != null;
			case SchedulePackage.STOP__ROTATE:
				return rotate != ROTATE_EDEFAULT;
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
		result.append(", rotate: ");
		result.append(rotate);
		result.append(')');
		return result.toString();
	}

} //StopImpl
