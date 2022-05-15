/**
 */
package org.mdse.pts.schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.depot.Root;

import org.mdse.pts.network.Network;

import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.TrainSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getDepot <em>Depot</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getTrains <em>Trains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The cached value of the '{@link #getDepot() <em>Depot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepot()
	 * @generated
	 * @ordered
	 */
	protected EList<Root> depot;

	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSchedule> trains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.SCHEDULE__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Root> getDepot() {
		if (depot == null) {
			depot = new EObjectResolvingEList<Root>(Root.class, this, SchedulePackage.SCHEDULE__DEPOT);
		}
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrainSchedule> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<TrainSchedule>(TrainSchedule.class, this, SchedulePackage.SCHEDULE__TRAINS);
		}
		return trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.SCHEDULE__TRAINS:
				return ((InternalEList<?>)getTrains()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.SCHEDULE__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case SchedulePackage.SCHEDULE__DEPOT:
				return getDepot();
			case SchedulePackage.SCHEDULE__TRAINS:
				return getTrains();
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
			case SchedulePackage.SCHEDULE__NETWORK:
				setNetwork((Network)newValue);
				return;
			case SchedulePackage.SCHEDULE__DEPOT:
				getDepot().clear();
				getDepot().addAll((Collection<? extends Root>)newValue);
				return;
			case SchedulePackage.SCHEDULE__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends TrainSchedule>)newValue);
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
			case SchedulePackage.SCHEDULE__NETWORK:
				setNetwork((Network)null);
				return;
			case SchedulePackage.SCHEDULE__DEPOT:
				getDepot().clear();
				return;
			case SchedulePackage.SCHEDULE__TRAINS:
				getTrains().clear();
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
			case SchedulePackage.SCHEDULE__NETWORK:
				return network != null;
			case SchedulePackage.SCHEDULE__DEPOT:
				return depot != null && !depot.isEmpty();
			case SchedulePackage.SCHEDULE__TRAINS:
				return trains != null && !trains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
