/**
 */
package org.mdse.pts.depot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.Train;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.impl.CoachImpl#getWagonNumber <em>Wagon Number</em>}</li>
 *   <li>{@link org.mdse.pts.depot.impl.CoachImpl#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoachImpl extends MinimalEObjectImpl.Container implements Coach {
	/**
	 * The default value of the '{@link #getWagonNumber() <em>Wagon Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWagonNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int WAGON_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWagonNumber() <em>Wagon Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWagonNumber()
	 * @generated
	 * @ordered
	 */
	protected int wagonNumber = WAGON_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DepotPackage.Literals.COACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWagonNumber() {
		return wagonNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWagonNumber(int newWagonNumber) {
		int oldWagonNumber = wagonNumber;
		wagonNumber = newWagonNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DepotPackage.COACH__WAGON_NUMBER, oldWagonNumber, wagonNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train getTrain() {
		if (eContainerFeatureID() != DepotPackage.COACH__TRAIN) return null;
		return (Train)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrain(Train newTrain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTrain, DepotPackage.COACH__TRAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrain(Train newTrain) {
		if (newTrain != eInternalContainer() || (eContainerFeatureID() != DepotPackage.COACH__TRAIN && newTrain != null)) {
			if (EcoreUtil.isAncestor(this, newTrain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTrain != null)
				msgs = ((InternalEObject)newTrain).eInverseAdd(this, DepotPackage.TRAIN__COACH, Train.class, msgs);
			msgs = basicSetTrain(newTrain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DepotPackage.COACH__TRAIN, newTrain, newTrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DepotPackage.COACH__TRAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTrain((Train)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DepotPackage.COACH__TRAIN:
				return basicSetTrain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DepotPackage.COACH__TRAIN:
				return eInternalContainer().eInverseRemove(this, DepotPackage.TRAIN__COACH, Train.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DepotPackage.COACH__WAGON_NUMBER:
				return getWagonNumber();
			case DepotPackage.COACH__TRAIN:
				return getTrain();
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
			case DepotPackage.COACH__WAGON_NUMBER:
				setWagonNumber((Integer)newValue);
				return;
			case DepotPackage.COACH__TRAIN:
				setTrain((Train)newValue);
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
			case DepotPackage.COACH__WAGON_NUMBER:
				setWagonNumber(WAGON_NUMBER_EDEFAULT);
				return;
			case DepotPackage.COACH__TRAIN:
				setTrain((Train)null);
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
			case DepotPackage.COACH__WAGON_NUMBER:
				return wagonNumber != WAGON_NUMBER_EDEFAULT;
			case DepotPackage.COACH__TRAIN:
				return getTrain() != null;
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
		result.append(" (wagonNumber: ");
		result.append(wagonNumber);
		result.append(')');
		return result.toString();
	}

} //CoachImpl
