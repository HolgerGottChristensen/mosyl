/**
 */
package org.mdse.pts.schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.time.Weekday;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.StartTimeImpl#getWeekdays <em>Weekdays</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.StartTimeImpl#getTimestamps <em>Timestamps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartTimeImpl extends MinimalEObjectImpl.Container implements StartTime {
	/**
	 * The cached value of the '{@link #getWeekdays() <em>Weekdays</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekdays()
	 * @generated
	 * @ordered
	 */
	protected EList<Weekday> weekdays;

	/**
	 * The cached value of the '{@link #getTimestamps() <em>Timestamps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamps()
	 * @generated
	 * @ordered
	 */
	protected EList<org.mdse.pts.time.Time> timestamps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.START_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Weekday> getWeekdays() {
		if (weekdays == null) {
			weekdays = new EDataTypeUniqueEList<Weekday>(Weekday.class, this, SchedulePackage.START_TIME__WEEKDAYS);
		}
		return weekdays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.mdse.pts.time.Time> getTimestamps() {
		if (timestamps == null) {
			timestamps = new EObjectContainmentEList<org.mdse.pts.time.Time>(org.mdse.pts.time.Time.class, this, SchedulePackage.START_TIME__TIMESTAMPS);
		}
		return timestamps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.START_TIME__TIMESTAMPS:
				return ((InternalEList<?>)getTimestamps()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.START_TIME__WEEKDAYS:
				return getWeekdays();
			case SchedulePackage.START_TIME__TIMESTAMPS:
				return getTimestamps();
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
			case SchedulePackage.START_TIME__WEEKDAYS:
				getWeekdays().clear();
				getWeekdays().addAll((Collection<? extends Weekday>)newValue);
				return;
			case SchedulePackage.START_TIME__TIMESTAMPS:
				getTimestamps().clear();
				getTimestamps().addAll((Collection<? extends org.mdse.pts.time.Time>)newValue);
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
			case SchedulePackage.START_TIME__WEEKDAYS:
				getWeekdays().clear();
				return;
			case SchedulePackage.START_TIME__TIMESTAMPS:
				getTimestamps().clear();
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
			case SchedulePackage.START_TIME__WEEKDAYS:
				return weekdays != null && !weekdays.isEmpty();
			case SchedulePackage.START_TIME__TIMESTAMPS:
				return timestamps != null && !timestamps.isEmpty();
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
		result.append(" (weekdays: ");
		result.append(weekdays);
		result.append(')');
		return result.toString();
	}

} //StartTimeImpl
