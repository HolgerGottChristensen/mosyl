/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdse.pts.depot.DepotFactory
 * @model kind="package"
 * @generated
 */
public interface DepotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "depot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/depot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "depot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DepotPackage eINSTANCE = org.mdse.pts.depot.impl.DepotPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.DepotImpl <em>Depot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.DepotImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDepot()
	 * @generated
	 */
	int DEPOT = 0;

	/**
	 * The feature id for the '<em><b>Train</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT__TRAIN = 0;

	/**
	 * The number of structural features of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.TrainImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__COACH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.CoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 5;

	/**
	 * The feature id for the '<em><b>Wagon Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__WAGON_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Train</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__TRAIN = 1;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.LocomotiveImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getLocomotive()
	 * @generated
	 */
	int LOCOMOTIVE = 2;

	/**
	 * The feature id for the '<em><b>Wagon Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE__WAGON_NUMBER = COACH__WAGON_NUMBER;

	/**
	 * The feature id for the '<em><b>Train</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE__TRAIN = COACH__TRAIN;

	/**
	 * The number of structural features of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_FEATURE_COUNT = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.DiningCoachImpl <em>Dining Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.DiningCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDiningCoach()
	 * @generated
	 */
	int DINING_COACH = 3;

	/**
	 * The feature id for the '<em><b>Wagon Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH__WAGON_NUMBER = COACH__WAGON_NUMBER;

	/**
	 * The feature id for the '<em><b>Train</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH__TRAIN = COACH__TRAIN;

	/**
	 * The number of structural features of the '<em>Dining Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH_FEATURE_COUNT = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dining Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.PassengerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerCoach()
	 * @generated
	 */
	int PASSENGER_COACH = 4;

	/**
	 * The feature id for the '<em><b>Wagon Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__WAGON_NUMBER = COACH__WAGON_NUMBER;

	/**
	 * The feature id for the '<em><b>Train</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__TRAIN = COACH__TRAIN;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__CLASS = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_FEATURE_COUNT = COACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.RootImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 6;

	/**
	 * The feature id for the '<em><b>Depot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DEPOT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.CoachClass <em>Coach Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.CoachClass
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoachClass()
	 * @generated
	 */
	int COACH_CLASS = 7;


	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.TrainType <em>Train Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.TrainType
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrainType()
	 * @generated
	 */
	int TRAIN_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Depot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depot</em>'.
	 * @see org.mdse.pts.depot.Depot
	 * @generated
	 */
	EClass getDepot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.depot.Depot#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train</em>'.
	 * @see org.mdse.pts.depot.Depot#getTrain()
	 * @see #getDepot()
	 * @generated
	 */
	EReference getDepot_Train();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see org.mdse.pts.depot.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.depot.Train#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coach</em>'.
	 * @see org.mdse.pts.depot.Train#getCoach()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Coach();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.Train#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.depot.Train#getName()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.Train#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mdse.pts.depot.Train#getType()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Type();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Locomotive <em>Locomotive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locomotive</em>'.
	 * @see org.mdse.pts.depot.Locomotive
	 * @generated
	 */
	EClass getLocomotive();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.DiningCoach <em>Dining Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dining Coach</em>'.
	 * @see org.mdse.pts.depot.DiningCoach
	 * @generated
	 */
	EClass getDiningCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.PassengerCoach <em>Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Coach</em>'.
	 * @see org.mdse.pts.depot.PassengerCoach
	 * @generated
	 */
	EClass getPassengerCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.PassengerCoach#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mdse.pts.depot.PassengerCoach#getClass_()
	 * @see #getPassengerCoach()
	 * @generated
	 */
	EAttribute getPassengerCoach_Class();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see org.mdse.pts.depot.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.Coach#getWagonNumber <em>Wagon Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wagon Number</em>'.
	 * @see org.mdse.pts.depot.Coach#getWagonNumber()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_WagonNumber();

	/**
	 * Returns the meta object for the container reference '{@link org.mdse.pts.depot.Coach#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Train</em>'.
	 * @see org.mdse.pts.depot.Coach#getTrain()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Train();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.mdse.pts.depot.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.depot.Root#getDepot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depot</em>'.
	 * @see org.mdse.pts.depot.Root#getDepot()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Depot();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.depot.CoachClass <em>Coach Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coach Class</em>'.
	 * @see org.mdse.pts.depot.CoachClass
	 * @generated
	 */
	EEnum getCoachClass();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.depot.TrainType <em>Train Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Train Type</em>'.
	 * @see org.mdse.pts.depot.TrainType
	 * @generated
	 */
	EEnum getTrainType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DepotFactory getDepotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.DepotImpl <em>Depot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.DepotImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDepot()
		 * @generated
		 */
		EClass DEPOT = eINSTANCE.getDepot();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOT__TRAIN = eINSTANCE.getDepot_Train();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.TrainImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__COACH = eINSTANCE.getTrain_Coach();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__NAME = eINSTANCE.getTrain_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TYPE = eINSTANCE.getTrain_Type();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.LocomotiveImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getLocomotive()
		 * @generated
		 */
		EClass LOCOMOTIVE = eINSTANCE.getLocomotive();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.DiningCoachImpl <em>Dining Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.DiningCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDiningCoach()
		 * @generated
		 */
		EClass DINING_COACH = eINSTANCE.getDiningCoach();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.PassengerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerCoach()
		 * @generated
		 */
		EClass PASSENGER_COACH = eINSTANCE.getPassengerCoach();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COACH__CLASS = eINSTANCE.getPassengerCoach_Class();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.CoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();

		/**
		 * The meta object literal for the '<em><b>Wagon Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__WAGON_NUMBER = eINSTANCE.getCoach_WagonNumber();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__TRAIN = eINSTANCE.getCoach_Train();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.RootImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Depot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DEPOT = eINSTANCE.getRoot_Depot();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.CoachClass <em>Coach Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.CoachClass
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoachClass()
		 * @generated
		 */
		EEnum COACH_CLASS = eINSTANCE.getCoachClass();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.TrainType <em>Train Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.TrainType
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrainType()
		 * @generated
		 */
		EEnum TRAIN_TYPE = eINSTANCE.getTrainType();

	}

} //DepotPackage
