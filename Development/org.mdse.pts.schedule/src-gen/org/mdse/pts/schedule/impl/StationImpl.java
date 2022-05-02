/**
 */
package org.mdse.pts.schedule.impl;

import network.Leg;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Station;

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
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#getVia <em>Via</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StationImpl#isRotate <em>Rotate</em>}</li>
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
	 * The cached value of the '{@link #getVia() <em>Via</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVia()
	 * @generated
	 * @ordered
	 */
	protected Leg via;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected network.Station reference;

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
	public Leg getVia() {
		if (via != null && via.eIsProxy()) {
			InternalEObject oldVia = (InternalEObject)via;
			via = (Leg)eResolveProxy(oldVia);
			if (via != oldVia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.STATION__VIA, oldVia, via));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__VIA, oldVia, via));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public network.Station getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (network.Station)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.STATION__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public network.Station basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(network.Station newReference) {
		network.Station oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__REFERENCE, oldReference, reference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.STATION__ROTATE, oldRotate, rotate));
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
			case SchedulePackage.STATION__VIA:
				if (resolve) return getVia();
				return basicGetVia();
			case SchedulePackage.STATION__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case SchedulePackage.STATION__ROTATE:
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
			case SchedulePackage.STATION__PLATFORM:
				setPlatform((String)newValue);
				return;
			case SchedulePackage.STATION__STOPPED_TIME:
				setStoppedTime((Integer)newValue);
				return;
			case SchedulePackage.STATION__VIA:
				setVia((Leg)newValue);
				return;
			case SchedulePackage.STATION__REFERENCE:
				setReference((network.Station)newValue);
				return;
			case SchedulePackage.STATION__ROTATE:
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
			case SchedulePackage.STATION__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case SchedulePackage.STATION__STOPPED_TIME:
				setStoppedTime(STOPPED_TIME_EDEFAULT);
				return;
			case SchedulePackage.STATION__VIA:
				setVia((Leg)null);
				return;
			case SchedulePackage.STATION__REFERENCE:
				setReference((network.Station)null);
				return;
			case SchedulePackage.STATION__ROTATE:
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
			case SchedulePackage.STATION__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case SchedulePackage.STATION__STOPPED_TIME:
				return stoppedTime != STOPPED_TIME_EDEFAULT;
			case SchedulePackage.STATION__VIA:
				return via != null;
			case SchedulePackage.STATION__REFERENCE:
				return reference != null;
			case SchedulePackage.STATION__ROTATE:
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

} //StationImpl
