/**
 */
package org.mdse.pts.timetable.impl;

import depot.Train;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.timetable.Juncture;
import org.mdse.pts.timetable.Time;
import org.mdse.pts.timetable.TimetablePackage;
import org.mdse.pts.timetable.Weekday;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Juncture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.impl.JunctureImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.JunctureImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.JunctureImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.JunctureImpl#getWeekday <em>Weekday</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JunctureImpl extends MinimalEObjectImpl.Container implements Juncture {
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
	 * The cached value of the '{@link #getTrain() <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected Train train;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time time;

	/**
	 * The default value of the '{@link #getWeekday() <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected static final Weekday WEEKDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekday() <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected Weekday weekday = WEEKDAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunctureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.JUNCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.JUNCTURE__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getTime() {
		if (time != null && time.eIsProxy()) {
			InternalEObject oldTime = (InternalEObject)time;
			time = (Time)eResolveProxy(oldTime);
			if (time != oldTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.JUNCTURE__TIME, oldTime, time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Time newTime) {
		Time oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.JUNCTURE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weekday getWeekday() {
		return weekday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeekday(Weekday newWeekday) {
		Weekday oldWeekday = weekday;
		weekday = newWeekday == null ? WEEKDAY_EDEFAULT : newWeekday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.JUNCTURE__WEEKDAY, oldWeekday, weekday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Train getTrain() {
		if (train != null && train.eIsProxy()) {
			InternalEObject oldTrain = (InternalEObject)train;
			train = (Train)eResolveProxy(oldTrain);
			if (train != oldTrain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.JUNCTURE__TRAIN, oldTrain, train));
			}
		}
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetTrain() {
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrain(Train newTrain) {
		Train oldTrain = train;
		train = newTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.JUNCTURE__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetablePackage.JUNCTURE__PLATFORM:
				return getPlatform();
			case TimetablePackage.JUNCTURE__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
			case TimetablePackage.JUNCTURE__TIME:
				if (resolve) return getTime();
				return basicGetTime();
			case TimetablePackage.JUNCTURE__WEEKDAY:
				return getWeekday();
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
			case TimetablePackage.JUNCTURE__PLATFORM:
				setPlatform((String)newValue);
				return;
			case TimetablePackage.JUNCTURE__TRAIN:
				setTrain((Train)newValue);
				return;
			case TimetablePackage.JUNCTURE__TIME:
				setTime((Time)newValue);
				return;
			case TimetablePackage.JUNCTURE__WEEKDAY:
				setWeekday((Weekday)newValue);
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
			case TimetablePackage.JUNCTURE__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case TimetablePackage.JUNCTURE__TRAIN:
				setTrain((Train)null);
				return;
			case TimetablePackage.JUNCTURE__TIME:
				setTime((Time)null);
				return;
			case TimetablePackage.JUNCTURE__WEEKDAY:
				setWeekday(WEEKDAY_EDEFAULT);
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
			case TimetablePackage.JUNCTURE__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case TimetablePackage.JUNCTURE__TRAIN:
				return train != null;
			case TimetablePackage.JUNCTURE__TIME:
				return time != null;
			case TimetablePackage.JUNCTURE__WEEKDAY:
				return weekday != WEEKDAY_EDEFAULT;
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
		result.append(", weekday: ");
		result.append(weekday);
		result.append(')');
		return result.toString();
	}

} //JunctureImpl
