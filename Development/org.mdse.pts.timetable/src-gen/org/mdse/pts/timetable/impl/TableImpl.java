/**
 */
package org.mdse.pts.timetable.impl;

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

import org.mdse.pts.network.Station;

import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Table;
import org.mdse.pts.timetable.TimetablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.impl.TableImpl#getArrivals <em>Arrivals</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.TableImpl#getStation <em>Station</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.impl.TableImpl#getDepartures <em>Departures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getArrivals() <em>Arrivals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivals()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrival> arrivals;

	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected Station station;

	/**
	 * The cached value of the '{@link #getDepartures() <em>Departures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartures()
	 * @generated
	 * @ordered
	 */
	protected EList<Departure> departures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arrival> getArrivals() {
		if (arrivals == null) {
			arrivals = new EObjectContainmentEList<Arrival>(Arrival.class, this, TimetablePackage.TABLE__ARRIVALS);
		}
		return arrivals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (Station)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.TABLE__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStation(Station newStation) {
		Station oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.TABLE__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Departure> getDepartures() {
		if (departures == null) {
			departures = new EObjectContainmentEList<Departure>(Departure.class, this, TimetablePackage.TABLE__DEPARTURES);
		}
		return departures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimetablePackage.TABLE__ARRIVALS:
				return ((InternalEList<?>)getArrivals()).basicRemove(otherEnd, msgs);
			case TimetablePackage.TABLE__DEPARTURES:
				return ((InternalEList<?>)getDepartures()).basicRemove(otherEnd, msgs);
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
			case TimetablePackage.TABLE__ARRIVALS:
				return getArrivals();
			case TimetablePackage.TABLE__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case TimetablePackage.TABLE__DEPARTURES:
				return getDepartures();
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
			case TimetablePackage.TABLE__ARRIVALS:
				getArrivals().clear();
				getArrivals().addAll((Collection<? extends Arrival>)newValue);
				return;
			case TimetablePackage.TABLE__STATION:
				setStation((Station)newValue);
				return;
			case TimetablePackage.TABLE__DEPARTURES:
				getDepartures().clear();
				getDepartures().addAll((Collection<? extends Departure>)newValue);
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
			case TimetablePackage.TABLE__ARRIVALS:
				getArrivals().clear();
				return;
			case TimetablePackage.TABLE__STATION:
				setStation((Station)null);
				return;
			case TimetablePackage.TABLE__DEPARTURES:
				getDepartures().clear();
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
			case TimetablePackage.TABLE__ARRIVALS:
				return arrivals != null && !arrivals.isEmpty();
			case TimetablePackage.TABLE__STATION:
				return station != null;
			case TimetablePackage.TABLE__DEPARTURES:
				return departures != null && !departures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
