/**
 */
package org.mdse.pts.timetable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mdse.pts.timetable.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimetableFactoryImpl extends EFactoryImpl implements TimetableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimetableFactory init() {
		try {
			TimetableFactory theTimetableFactory = (TimetableFactory)EPackage.Registry.INSTANCE.getEFactory(TimetablePackage.eNS_URI);
			if (theTimetableFactory != null) {
				return theTimetableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimetableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimetablePackage.TIME_TABLE_SYSTEM: return createTimeTableSystem();
			case TimetablePackage.TABLE: return createTable();
			case TimetablePackage.ARRIVAL: return createArrival();
			case TimetablePackage.DEPARTURE: return createDeparture();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTableSystem createTimeTableSystem() {
		TimeTableSystemImpl timeTableSystem = new TimeTableSystemImpl();
		return timeTableSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arrival createArrival() {
		ArrivalImpl arrival = new ArrivalImpl();
		return arrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Departure createDeparture() {
		DepartureImpl departure = new DepartureImpl();
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimetablePackage getTimetablePackage() {
		return (TimetablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimetablePackage getPackage() {
		return TimetablePackage.eINSTANCE;
	}

} //TimetableFactoryImpl
