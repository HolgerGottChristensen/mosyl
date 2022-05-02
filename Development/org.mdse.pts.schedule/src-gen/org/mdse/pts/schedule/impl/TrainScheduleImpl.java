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

import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.TrainSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainScheduleImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainScheduleImpl#getStarttimes <em>Starttimes</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TrainScheduleImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainScheduleImpl extends MinimalEObjectImpl.Container implements TrainSchedule {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Train reference;

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
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

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
	public Train getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Train)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.TRAIN_SCHEDULE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(Train newReference) {
		Train oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRAIN_SCHEDULE__REFERENCE, oldReference, reference));
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
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.TRAIN_SCHEDULE__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRAIN_SCHEDULE__ROUTE, oldRoute, route));
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
			case SchedulePackage.TRAIN_SCHEDULE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				return getStarttimes();
			case SchedulePackage.TRAIN_SCHEDULE__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
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
			case SchedulePackage.TRAIN_SCHEDULE__REFERENCE:
				setReference((Train)newValue);
				return;
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				getStarttimes().clear();
				getStarttimes().addAll((Collection<? extends StartTime>)newValue);
				return;
			case SchedulePackage.TRAIN_SCHEDULE__ROUTE:
				setRoute((Route)newValue);
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
			case SchedulePackage.TRAIN_SCHEDULE__REFERENCE:
				setReference((Train)null);
				return;
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				getStarttimes().clear();
				return;
			case SchedulePackage.TRAIN_SCHEDULE__ROUTE:
				setRoute((Route)null);
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
			case SchedulePackage.TRAIN_SCHEDULE__REFERENCE:
				return reference != null;
			case SchedulePackage.TRAIN_SCHEDULE__STARTTIMES:
				return starttimes != null && !starttimes.isEmpty();
			case SchedulePackage.TRAIN_SCHEDULE__ROUTE:
				return route != null;
		}
		return super.eIsSet(featureID);
	}

} //TrainScheduleImpl
