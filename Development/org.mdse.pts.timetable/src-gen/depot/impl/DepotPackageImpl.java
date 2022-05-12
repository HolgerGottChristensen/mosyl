/**
 */
package depot.impl;

import depot.Coach;
import depot.CoachClass;
import depot.Depot;
import depot.DepotFactory;
import depot.DepotPackage;
import depot.DiningCoach;
import depot.Locomotive;
import depot.PassengerCoach;
import depot.Root;
import depot.Train;
import depot.TrainType;

import network.NetworkPackage;

import network.impl.NetworkPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.timetable.TimetablePackage;

import org.mdse.pts.timetable.impl.TimetablePackageImpl;
import time.TimePackage;
import time.impl.TimePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotPackageImpl extends EPackageImpl implements DepotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depotEClass = null;

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
	private EClass locomotiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diningCoachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCoachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coachClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trainTypeEEnum = null;

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
	 * @see depot.DepotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DepotPackageImpl() {
		super(eNS_URI, DepotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DepotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DepotPackage init() {
		if (isInited) return (DepotPackage)EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDepotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DepotPackageImpl theDepotPackage = registeredDepotPackage instanceof DepotPackageImpl ? (DepotPackageImpl)registeredDepotPackage : new DepotPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);
		TimetablePackageImpl theTimetablePackage = (TimetablePackageImpl)(registeredPackage instanceof TimetablePackageImpl ? registeredPackage : TimetablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
		TimePackageImpl theTimePackage = (TimePackageImpl)(registeredPackage instanceof TimePackageImpl ? registeredPackage : TimePackage.eINSTANCE);

		// Create package meta-data objects
		theDepotPackage.createPackageContents();
		theTimetablePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theTimePackage.createPackageContents();

		// Initialize created meta-data
		theDepotPackage.initializePackageContents();
		theTimetablePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDepotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DepotPackage.eNS_URI, theDepotPackage);
		return theDepotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepot() {
		return depotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepot_Train() {
		return (EReference)depotEClass.getEStructuralFeatures().get(0);
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
	public EReference getTrain_Coach() {
		return (EReference)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_Name() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_Type() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocomotive() {
		return locomotiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiningCoach() {
		return diningCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassengerCoach() {
		return passengerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCoach_Class() {
		return (EAttribute)passengerCoachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoach() {
		return coachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoach_WagonNumber() {
		return (EAttribute)coachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoach_Train() {
		return (EReference)coachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Depot() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoachClass() {
		return coachClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTrainType() {
		return trainTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepotFactory getDepotFactory() {
		return (DepotFactory)getEFactoryInstance();
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
		depotEClass = createEClass(DEPOT);
		createEReference(depotEClass, DEPOT__TRAIN);

		trainEClass = createEClass(TRAIN);
		createEReference(trainEClass, TRAIN__COACH);
		createEAttribute(trainEClass, TRAIN__NAME);
		createEAttribute(trainEClass, TRAIN__TYPE);

		locomotiveEClass = createEClass(LOCOMOTIVE);

		diningCoachEClass = createEClass(DINING_COACH);

		passengerCoachEClass = createEClass(PASSENGER_COACH);
		createEAttribute(passengerCoachEClass, PASSENGER_COACH__CLASS);

		coachEClass = createEClass(COACH);
		createEAttribute(coachEClass, COACH__WAGON_NUMBER);
		createEReference(coachEClass, COACH__TRAIN);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__DEPOT);

		// Create enums
		coachClassEEnum = createEEnum(COACH_CLASS);
		trainTypeEEnum = createEEnum(TRAIN_TYPE);
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
		locomotiveEClass.getESuperTypes().add(this.getCoach());
		diningCoachEClass.getESuperTypes().add(this.getCoach());
		passengerCoachEClass.getESuperTypes().add(this.getCoach());

		// Initialize classes, features, and operations; add parameters
		initEClass(depotEClass, Depot.class, "Depot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepot_Train(), this.getTrain(), null, "train", null, 0, -1, Depot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrain_Coach(), this.getCoach(), this.getCoach_Train(), "coach", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Type(), this.getTrainType(), "type", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locomotiveEClass, Locomotive.class, "Locomotive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diningCoachEClass, DiningCoach.class, "DiningCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passengerCoachEClass, PassengerCoach.class, "PassengerCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerCoach_Class(), this.getCoachClass(), "class", "Economy", 0, 1, PassengerCoach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coachEClass, Coach.class, "Coach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoach_WagonNumber(), ecorePackage.getEInt(), "wagonNumber", null, 0, 1, Coach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoach_Train(), this.getTrain(), this.getTrain_Coach(), "train", null, 1, 1, Coach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Depot(), this.getDepot(), null, "depot", null, 1, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coachClassEEnum, CoachClass.class, "CoachClass");
		addEEnumLiteral(coachClassEEnum, CoachClass.FIRST_CLASS);
		addEEnumLiteral(coachClassEEnum, CoachClass.ECONOMY);

		initEEnum(trainTypeEEnum, TrainType.class, "TrainType");
		addEEnumLiteral(trainTypeEEnum, TrainType.REGIONAL);
		addEEnumLiteral(trainTypeEEnum, TrainType.INTERCITY);

		// Create resource
		createResource(eNS_URI);
	}

} //DepotPackageImpl
