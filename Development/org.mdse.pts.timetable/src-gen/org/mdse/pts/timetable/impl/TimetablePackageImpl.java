/**
 */
package org.mdse.pts.timetable.impl;

import depot.DepotPackage;
import depot.impl.DepotPackageImpl;
import network.NetworkPackage;
import network.impl.NetworkPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Juncture;
import org.mdse.pts.timetable.Station;
import org.mdse.pts.timetable.Table;
import org.mdse.pts.timetable.Time;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetableFactory;
import org.mdse.pts.timetable.TimetablePackage;
import org.mdse.pts.timetable.Train;
import org.mdse.pts.timetable.Weekday;
import time.TimePackage;
import time.impl.TimePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimetablePackageImpl extends EPackageImpl implements TimetablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekdayEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mdse.pts.timetable.TimetablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimetablePackageImpl() {
		super(eNS_URI, TimetableFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TimetablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimetablePackage init() {
		if (isInited) return (TimetablePackage)EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTimetablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TimetablePackageImpl theTimetablePackage = registeredTimetablePackage instanceof TimetablePackageImpl ? (TimetablePackageImpl)registeredTimetablePackage : new TimetablePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);
		DepotPackageImpl theDepotPackage = (DepotPackageImpl)(registeredPackage instanceof DepotPackageImpl ? registeredPackage : DepotPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
		TimePackageImpl theTimePackage = (TimePackageImpl)(registeredPackage instanceof TimePackageImpl ? registeredPackage : TimePackage.eINSTANCE);

		// Create package meta-data objects
		theTimetablePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theDepotPackage.createPackageContents();
		theTimePackage.createPackageContents();

		// Initialize created meta-data
		theTimetablePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theDepotPackage.initializePackageContents();
		theTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimetablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimetablePackage.eNS_URI, theTimetablePackage);
		return theTimetablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimetable() {
		return timetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimetable_Table() {
		return (EReference)timetableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimetable_Station() {
		return (EReference)timetableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Junctures() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Station() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrival() {
		return arrivalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrival_Origin() {
		return (EReference)arrivalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeparture() {
		return departureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeparture_Destination() {
		return (EReference)departureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJuncture() {
		return junctureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJuncture_Platform() {
		return (EAttribute)junctureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJuncture_Time() {
		return (EReference)junctureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJuncture_Weekday() {
		return (EAttribute)junctureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJuncture_Train() {
		return (EReference)junctureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Hour() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Minute() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWeekday() {
		return weekdayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimetableFactory getTimetableFactory() {
		return (TimetableFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		timetableEClass = createEClass(TIMETABLE);
		createEReference(timetableEClass, TIMETABLE__TABLE);
		createEReference(timetableEClass, TIMETABLE__STATION);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__JUNCTURES);
		createEReference(tableEClass, TABLE__STATION);

		arrivalEClass = createEClass(ARRIVAL);
		createEReference(arrivalEClass, ARRIVAL__ORIGIN);

		departureEClass = createEClass(DEPARTURE);
		createEReference(departureEClass, DEPARTURE__DESTINATION);

		junctureEClass = createEClass(JUNCTURE);
		createEAttribute(junctureEClass, JUNCTURE__PLATFORM);
		createEReference(junctureEClass, JUNCTURE__TRAIN);
		createEAttribute(junctureEClass, JUNCTURE__WEEKDAY);
		createEReference(junctureEClass, JUNCTURE__TIME);

		stationEClass = createEClass(STATION);

		trainEClass = createEClass(TRAIN);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__HOUR);
		createEAttribute(timeEClass, TIME__MINUTE);

		// Create enums
		weekdayEEnum = createEEnum(WEEKDAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		DepotPackage theDepotPackage = (DepotPackage)EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);
		TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrivalEClass.getESuperTypes().add(this.getJuncture());
		departureEClass.getESuperTypes().add(this.getJuncture());

		// Initialize classes, features, and operations; add parameters
		initEClass(timetableEClass, Timetable.class, "Timetable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimetable_Table(), this.getTable(), null, "table", null, 0, -1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimetable_Station(), theNetworkPackage.getStation(), null, "station", null, 0, -1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Junctures(), this.getJuncture(), null, "junctures", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Station(), theNetworkPackage.getStation(), null, "station", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalEClass, Arrival.class, "Arrival", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrival_Origin(), theNetworkPackage.getStation(), null, "origin", null, 1, 1, Arrival.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departureEClass, Departure.class, "Departure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeparture_Destination(), theNetworkPackage.getStation(), null, "destination", null, 1, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(junctureEClass, Juncture.class, "Juncture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJuncture_Platform(), ecorePackage.getEString(), "platform", null, 0, 1, Juncture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuncture_Train(), theDepotPackage.getTrain(), null, "train", null, 1, 1, Juncture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuncture_Weekday(), this.getWeekday(), "weekday", null, 1, 1, Juncture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuncture_Time(), theTimePackage.getTime(), null, "time", null, 1, 1, Juncture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Hour(), ecorePackage.getEInt(), "Hour", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Minute(), ecorePackage.getEInt(), "Minute", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(weekdayEEnum, Weekday.class, "Weekday");

		// Create resource
		createResource(eNS_URI);
	}

} //TimetablePackageImpl
