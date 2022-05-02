/**
 */
package org.mdse.pts.schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.Station;
import org.mdse.pts.schedule.Train;
import org.mdse.pts.schedule.TrainReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainImpl#getTrainreference <em>Trainreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainImpl#getStarttimes <em>Starttimes</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainImpl#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainImpl extends MinimalEObjectImpl.Container implements Train {
	/**
	 * The cached value of the '{@link #getTrainreference() <em>Trainreference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainreference()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainReference> trainreference;

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
	protected EList<Station> stops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrainReference> getTrainreference() {
		if (trainreference == null) {
			trainreference = new EObjectContainmentEList<TrainReference>(TrainReference.class, this, SchedulePackage.TRAIN__TRAINREFERENCE);
		}
		return trainreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StartTime> getStarttimes() {
		if (starttimes == null) {
			starttimes = new EObjectContainmentEList<StartTime>(StartTime.class, this, SchedulePackage.TRAIN__STARTTIMES);
		}
		return starttimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Station> getStops() {
		if (stops == null) {
			stops = new EObjectContainmentEList<Station>(Station.class, this, SchedulePackage.TRAIN__STOPS);
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
			case SchedulePackage.TRAIN__TRAINREFERENCE:
				return ((InternalEList<?>)getTrainreference()).basicRemove(otherEnd, msgs);
			case SchedulePackage.TRAIN__STARTTIMES:
				return ((InternalEList<?>)getStarttimes()).basicRemove(otherEnd, msgs);
			case SchedulePackage.TRAIN__STOPS:
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
			case SchedulePackage.TRAIN__TRAINREFERENCE:
				return getTrainreference();
			case SchedulePackage.TRAIN__STARTTIMES:
				return getStarttimes();
			case SchedulePackage.TRAIN__STOPS:
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
			case SchedulePackage.TRAIN__TRAINREFERENCE:
				getTrainreference().clear();
				getTrainreference().addAll((Collection<? extends TrainReference>)newValue);
				return;
			case SchedulePackage.TRAIN__STARTTIMES:
				getStarttimes().clear();
				getStarttimes().addAll((Collection<? extends StartTime>)newValue);
				return;
			case SchedulePackage.TRAIN__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends Station>)newValue);
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
			case SchedulePackage.TRAIN__TRAINREFERENCE:
				getTrainreference().clear();
				return;
			case SchedulePackage.TRAIN__STARTTIMES:
				getStarttimes().clear();
				return;
			case SchedulePackage.TRAIN__STOPS:
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
			case SchedulePackage.TRAIN__TRAINREFERENCE:
				return trainreference != null && !trainreference.isEmpty();
			case SchedulePackage.TRAIN__STARTTIMES:
				return starttimes != null && !starttimes.isEmpty();
			case SchedulePackage.TRAIN__STOPS:
				return stops != null && !stops.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrainImpl
