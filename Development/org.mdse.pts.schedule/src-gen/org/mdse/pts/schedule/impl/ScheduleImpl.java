/**
 */
package org.mdse.pts.schedule.impl;

import depot.Root;

import java.util.Collection;

import network.Network;

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

import org.mdse.pts.schedule.Route;
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
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getNetworkreference <em>Networkreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getDepotreference <em>Depotreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getTrains <em>Trains</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The cached value of the '{@link #getNetworkreference() <em>Networkreference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkreference()
	 * @generated
	 * @ordered
	 */
	protected Network networkreference;

	/**
	 * The cached value of the '{@link #getDepotreference() <em>Depotreference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepotreference()
	 * @generated
	 * @ordered
	 */
	protected EList<Root> depotreference;

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
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

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
	public Network getNetworkreference() {
		if (networkreference != null && networkreference.eIsProxy()) {
			InternalEObject oldNetworkreference = (InternalEObject)networkreference;
			networkreference = (Network)eResolveProxy(oldNetworkreference);
			if (networkreference != oldNetworkreference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.SCHEDULE__NETWORKREFERENCE, oldNetworkreference, networkreference));
			}
		}
		return networkreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetworkreference() {
		return networkreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkreference(Network newNetworkreference) {
		Network oldNetworkreference = networkreference;
		networkreference = newNetworkreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORKREFERENCE, oldNetworkreference, networkreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Root> getDepotreference() {
		if (depotreference == null) {
			depotreference = new EObjectResolvingEList<Root>(Root.class, this, SchedulePackage.SCHEDULE__DEPOTREFERENCE);
		}
		return depotreference;
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
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, SchedulePackage.SCHEDULE__ROUTES);
		}
		return routes;
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
			case SchedulePackage.SCHEDULE__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				if (resolve) return getNetworkreference();
				return basicGetNetworkreference();
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				return getDepotreference();
			case SchedulePackage.SCHEDULE__TRAINS:
				return getTrains();
			case SchedulePackage.SCHEDULE__ROUTES:
				return getRoutes();
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				setNetworkreference((Network)newValue);
				return;
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				getDepotreference().clear();
				getDepotreference().addAll((Collection<? extends Root>)newValue);
				return;
			case SchedulePackage.SCHEDULE__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends TrainSchedule>)newValue);
				return;
			case SchedulePackage.SCHEDULE__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				setNetworkreference((Network)null);
				return;
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				getDepotreference().clear();
				return;
			case SchedulePackage.SCHEDULE__TRAINS:
				getTrains().clear();
				return;
			case SchedulePackage.SCHEDULE__ROUTES:
				getRoutes().clear();
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				return networkreference != null;
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				return depotreference != null && !depotreference.isEmpty();
			case SchedulePackage.SCHEDULE__TRAINS:
				return trains != null && !trains.isEmpty();
			case SchedulePackage.SCHEDULE__ROUTES:
				return routes != null && !routes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
