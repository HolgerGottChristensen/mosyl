/**
 */
package org.mdse.pts.timetable.impl;

import java.util.Collection;
import network.Station;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mdse.pts.timetable.Table;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.impl.TimetableImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.TimetableImpl#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends MinimalEObjectImpl.Container implements Timetable {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> table;
	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> station;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<Table>(Table.class, this, TimetablePackage.TIMETABLE__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Station> getStation() {
		if (station == null) {
			station = new EObjectContainmentEList<Station>(Station.class, this, TimetablePackage.TIMETABLE__STATION);
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimetablePackage.TIMETABLE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case TimetablePackage.TIMETABLE__STATION:
				return ((InternalEList<?>)getStation()).basicRemove(otherEnd, msgs);
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
			case TimetablePackage.TIMETABLE__TABLE:
				return getTable();
			case TimetablePackage.TIMETABLE__STATION:
				return getStation();
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
			case TimetablePackage.TIMETABLE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table>)newValue);
				return;
			case TimetablePackage.TIMETABLE__STATION:
				getStation().clear();
				getStation().addAll((Collection<? extends Station>)newValue);
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
			case TimetablePackage.TIMETABLE__TABLE:
				getTable().clear();
				return;
			case TimetablePackage.TIMETABLE__STATION:
				getStation().clear();
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
			case TimetablePackage.TIMETABLE__TABLE:
				return table != null && !table.isEmpty();
			case TimetablePackage.TIMETABLE__STATION:
				return station != null && !station.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimetableImpl
