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
import org.eclipse.emf.ecore.util.InternalEList;
import org.mdse.pts.schedule.DepotReference;
import org.mdse.pts.schedule.NetworkReference;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Train;

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
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The cached value of the '{@link #getNetworkreference() <em>Networkreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkreference()
	 * @generated
	 * @ordered
	 */
	protected NetworkReference networkreference;
	/**
	 * The cached value of the '{@link #getDepotreference() <em>Depotreference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepotreference()
	 * @generated
	 * @ordered
	 */
	protected EList<DepotReference> depotreference;
	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Train> trains;

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
	public NetworkReference getNetworkreference() {
		return networkreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkreference(NetworkReference newNetworkreference, NotificationChain msgs) {
		NetworkReference oldNetworkreference = networkreference;
		networkreference = newNetworkreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORKREFERENCE, oldNetworkreference, newNetworkreference);
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
	public void setNetworkreference(NetworkReference newNetworkreference) {
		if (newNetworkreference != networkreference) {
			NotificationChain msgs = null;
			if (networkreference != null)
				msgs = ((InternalEObject)networkreference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.SCHEDULE__NETWORKREFERENCE, null, msgs);
			if (newNetworkreference != null)
				msgs = ((InternalEObject)newNetworkreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.SCHEDULE__NETWORKREFERENCE, null, msgs);
			msgs = basicSetNetworkreference(newNetworkreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORKREFERENCE, newNetworkreference, newNetworkreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DepotReference> getDepotreference() {
		if (depotreference == null) {
			depotreference = new EObjectContainmentEList<DepotReference>(DepotReference.class, this, SchedulePackage.SCHEDULE__DEPOTREFERENCE);
		}
		return depotreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Train> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<Train>(Train.class, this, SchedulePackage.SCHEDULE__TRAINS);
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				return basicSetNetworkreference(null, msgs);
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				return ((InternalEList<?>)getDepotreference()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				return getNetworkreference();
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				return getDepotreference();
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				setNetworkreference((NetworkReference)newValue);
				return;
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				getDepotreference().clear();
				getDepotreference().addAll((Collection<? extends DepotReference>)newValue);
				return;
			case SchedulePackage.SCHEDULE__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends Train>)newValue);
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
				setNetworkreference((NetworkReference)null);
				return;
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				getDepotreference().clear();
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
			case SchedulePackage.SCHEDULE__NETWORKREFERENCE:
				return networkreference != null;
			case SchedulePackage.SCHEDULE__DEPOTREFERENCE:
				return depotreference != null && !depotreference.isEmpty();
			case SchedulePackage.SCHEDULE__TRAINS:
				return trains != null && !trains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
