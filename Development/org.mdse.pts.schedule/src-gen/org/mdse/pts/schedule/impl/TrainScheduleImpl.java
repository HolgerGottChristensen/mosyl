/**
 */
package org.mdse.pts.schedule.impl;

import depot.Train;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainScheduleImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainScheduleImpl#getStarttimes <em>Starttimes</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainScheduleImpl#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainScheduleImpl extends MinimalEObjectImpl.Container implements TrainSchedule {
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
	 * The cached value of the '{@link #getStarttimes() <em>Starttimes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttimes()
	 * @generated
	 * @ordered
	 */
	protected EList<StartTime> starttimes;

	/**
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<Stop> stops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TRAIN_SCHEDULE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.TRAIN_SCHEDULE__TRAIN, oldTrain, train));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRAIN_SCHEDULE__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StartTime> getStarttimes() {
		if (starttimes == null) {
			starttimes = new EObjectContainmentEList<StartTime>(StartTime.class, this, SchedulePackage.TRAIN_SCHEDULE__STARTTIMES);
		}
		return starttimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stop> getStops() {
		if (stops == null) {
			stops = new EObjectContainmentEList<Stop>(Stop.class, this, SchedulePackage.TRAIN_SCHEDULE__STOPS);
		}
		return stops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				return ((InternalEList<?>)getStarttimes()).basicRemove(otherEnd, msgs);
			case SchedulePackage.TRAIN_SCHEDULE__STOPS:
				return ((InternalEList<?>)getStops()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.TRAIN_SCHEDULE__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				return getStarttimes();
			case SchedulePackage.TRAIN_SCHEDULE__STOPS:
				return getStops();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.TRAIN_SCHEDULE__TRAIN:
				setTrain((Train)newValue);
				return;
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				getStarttimes().clear();
				getStarttimes().addAll((Collection<? extends StartTime>)newValue);
				return;
			case SchedulePackage.TRAIN_SCHEDULE__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends Stop>)newValue);
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
			case SchedulePackage.TRAIN_SCHEDULE__TRAIN:
				setTrain((Train)null);
				return;
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				getStarttimes().clear();
				return;
			case SchedulePackage.TRAIN_SCHEDULE__STOPS:
				getStops().clear();
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
			case SchedulePackage.TRAIN_SCHEDULE__TRAIN:
				return train != null;
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				return starttimes != null && !starttimes.isEmpty();
			case SchedulePackage.TRAIN_SCHEDULE__STOPS:
				return stops != null && !stops.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrainScheduleImpl
