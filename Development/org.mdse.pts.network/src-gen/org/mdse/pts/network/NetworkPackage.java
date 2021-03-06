/**
 */
package org.mdse.pts.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.mdse.pts.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/network";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "network";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkPackage eINSTANCE = org.mdse.pts.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.network.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.network.impl.NetworkImpl
	 * @see org.mdse.pts.network.impl.NetworkPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Legs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LEGS = 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.network.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.network.impl.StationImpl
	 * @see org.mdse.pts.network.impl.NetworkPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Legs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LEGS = 1;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.network.impl.LegImpl <em>Leg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.network.impl.LegImpl
	 * @see org.mdse.pts.network.impl.NetworkPackageImpl#getLeg()
	 * @generated
	 */
	int LEG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG__STATIONS = 2;

	/**
	 * The number of structural features of the '<em>Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.network.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.mdse.pts.network.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.network.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.network.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.network.Network#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see org.mdse.pts.network.Network#getStations()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.network.Network#getLegs <em>Legs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legs</em>'.
	 * @see org.mdse.pts.network.Network#getLegs()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Legs();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.network.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see org.mdse.pts.network.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.network.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.network.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.network.Station#getLegs <em>Legs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Legs</em>'.
	 * @see org.mdse.pts.network.Station#getLegs()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Legs();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.network.Leg <em>Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leg</em>'.
	 * @see org.mdse.pts.network.Leg
	 * @generated
	 */
	EClass getLeg();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.network.Leg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.network.Leg#getName()
	 * @see #getLeg()
	 * @generated
	 */
	EAttribute getLeg_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.network.Leg#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.mdse.pts.network.Leg#getDistance()
	 * @see #getLeg()
	 * @generated
	 */
	EAttribute getLeg_Distance();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.network.Leg#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see org.mdse.pts.network.Leg#getStations()
	 * @see #getLeg()
	 * @generated
	 */
	EReference getLeg_Stations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkFactory getNetworkFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.network.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.network.impl.NetworkImpl
		 * @see org.mdse.pts.network.impl.NetworkPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__STATIONS = eINSTANCE.getNetwork_Stations();

		/**
		 * The meta object literal for the '<em><b>Legs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__LEGS = eINSTANCE.getNetwork_Legs();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.network.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.network.impl.StationImpl
		 * @see org.mdse.pts.network.impl.NetworkPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Legs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__LEGS = eINSTANCE.getStation_Legs();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.network.impl.LegImpl <em>Leg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.network.impl.LegImpl
		 * @see org.mdse.pts.network.impl.NetworkPackageImpl#getLeg()
		 * @generated
		 */
		EClass LEG = eINSTANCE.getLeg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEG__NAME = eINSTANCE.getLeg_Name();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEG__DISTANCE = eINSTANCE.getLeg_Distance();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEG__STATIONS = eINSTANCE.getLeg_Stations();

	}

} //NetworkPackage
