/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.schedule.DepotReference;
import org.mdse.pts.schedule.LegReference;
import org.mdse.pts.schedule.NetworkReference;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.Station;
import org.mdse.pts.schedule.StationReference;
import org.mdse.pts.schedule.Time;
import org.mdse.pts.schedule.Train;
import org.mdse.pts.schedule.TrainReference;
import org.mdse.pts.schedule.Weekday;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulePackageImpl extends EPackageImpl implements SchedulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depotReferenceEClass = null;
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
	private EClass startTimeEClass = null;
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
	private EClass stationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainReferenceEClass = null;
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
	 * @see org.mdse.pts.schedule.SchedulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulePackageImpl() {
		super(eNS_URI, ScheduleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchedulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulePackage init() {
		if (isInited) return (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchedulePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchedulePackageImpl theSchedulePackage = registeredSchedulePackage instanceof SchedulePackageImpl ? (SchedulePackageImpl)registeredSchedulePackage : new SchedulePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSchedulePackage.createPackageContents();

		// Initialize created meta-data
		theSchedulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchedulePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulePackage.eNS_URI, theSchedulePackage);
		return theSchedulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_Networkreference() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_Depotreference() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_Trains() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkReference() {
		return networkReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepotReference() {
		return depotReferenceEClass;
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
	public EReference getTrain_Trainreference() {
		return (EReference)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrain_Starttimes() {
		return (EReference)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrain_Stops() {
		return (EReference)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartTime() {
		return startTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTime_Weekdays() {
		return (EAttribute)startTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartTime_Timestamps() {
		return (EReference)startTimeEClass.getEStructuralFeatures().get(1);
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
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStation_Platform() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStation_StoppedTime() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStation_Stationreference() {
		return (EReference)stationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStation_Via() {
		return (EReference)stationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStationReference() {
		return stationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegReference() {
		return legReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainReference() {
		return trainReferenceEClass;
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
	public ScheduleFactory getScheduleFactory() {
		return (ScheduleFactory)getEFactoryInstance();
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
		scheduleEClass = createEClass(SCHEDULE);
		createEReference(scheduleEClass, SCHEDULE__NETWORKREFERENCE);
		createEReference(scheduleEClass, SCHEDULE__DEPOTREFERENCE);
		createEReference(scheduleEClass, SCHEDULE__TRAINS);

		networkReferenceEClass = createEClass(NETWORK_REFERENCE);

		depotReferenceEClass = createEClass(DEPOT_REFERENCE);

		trainEClass = createEClass(TRAIN);
		createEReference(trainEClass, TRAIN__TRAINREFERENCE);
		createEReference(trainEClass, TRAIN__STARTTIMES);
		createEReference(trainEClass, TRAIN__STOPS);

		startTimeEClass = createEClass(START_TIME);
		createEAttribute(startTimeEClass, START_TIME__WEEKDAYS);
		createEReference(startTimeEClass, START_TIME__TIMESTAMPS);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__HOUR);
		createEAttribute(timeEClass, TIME__MINUTE);

		stationEClass = createEClass(STATION);
		createEAttribute(stationEClass, STATION__PLATFORM);
		createEAttribute(stationEClass, STATION__STOPPED_TIME);
		createEReference(stationEClass, STATION__STATIONREFERENCE);
		createEReference(stationEClass, STATION__VIA);

		stationReferenceEClass = createEClass(STATION_REFERENCE);

		legReferenceEClass = createEClass(LEG_REFERENCE);

		trainReferenceEClass = createEClass(TRAIN_REFERENCE);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedule_Networkreference(), this.getNetworkReference(), null, "networkreference", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_Depotreference(), this.getDepotReference(), null, "depotreference", null, 1, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_Trains(), this.getTrain(), null, "trains", null, 1, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkReferenceEClass, NetworkReference.class, "NetworkReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(depotReferenceEClass, DepotReference.class, "DepotReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrain_Trainreference(), this.getTrainReference(), null, "trainreference", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_Starttimes(), this.getStartTime(), null, "starttimes", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_Stops(), this.getStation(), null, "stops", null, 2, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startTimeEClass, StartTime.class, "StartTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartTime_Weekdays(), this.getWeekday(), "weekdays", null, 1, -1, StartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartTime_Timestamps(), this.getTime(), null, "timestamps", null, 1, -1, StartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Hour(), ecorePackage.getEByte(), "hour", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Minute(), ecorePackage.getEByte(), "minute", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStation_Platform(), ecorePackage.getEString(), "platform", null, 1, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_StoppedTime(), ecorePackage.getEInt(), "stoppedTime", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStation_Stationreference(), this.getStationReference(), null, "stationreference", null, 1, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStation_Via(), this.getLegReference(), null, "via", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationReferenceEClass, StationReference.class, "StationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(legReferenceEClass, LegReference.class, "LegReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trainReferenceEClass, TrainReference.class, "TrainReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(weekdayEEnum, Weekday.class, "Weekday");
		addEEnumLiteral(weekdayEEnum, Weekday.MONDAY);
		addEEnumLiteral(weekdayEEnum, Weekday.TUESDAY);
		addEEnumLiteral(weekdayEEnum, Weekday.WEDNESDAY);
		addEEnumLiteral(weekdayEEnum, Weekday.THURSDAY);
		addEEnumLiteral(weekdayEEnum, Weekday.FRIDAY);
		addEEnumLiteral(weekdayEEnum, Weekday.SATURDAY);
		addEEnumLiteral(weekdayEEnum, Weekday.SUNDAY);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulePackageImpl
