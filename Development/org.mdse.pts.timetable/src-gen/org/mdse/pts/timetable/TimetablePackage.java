/**
 */
package org.mdse.pts.timetable;

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
 * @see org.mdse.pts.timetable.TimetableFactory
 * @model kind="package"
 * @generated
 */
public interface TimetablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timetable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/timetable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timetable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimetablePackage eINSTANCE = org.mdse.pts.timetable.impl.TimetablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.TimetableImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__STATION = 1;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.TableImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Junctures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__JUNCTURES = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STATION = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.JunctureImpl <em>Juncture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.JunctureImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getJuncture()
	 * @generated
	 */
	int JUNCTURE = 4;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__WEEKDAY = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE__TIME = 3;

	/**
	 * The number of structural features of the '<em>Juncture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Juncture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.ArrivalImpl <em>Arrival</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.ArrivalImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getArrival()
	 * @generated
	 */
	int ARRIVAL = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__PLATFORM = JUNCTURE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__TRAIN = JUNCTURE__TRAIN;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__WEEKDAY = JUNCTURE__WEEKDAY;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__TIME = JUNCTURE__TIME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL__ORIGIN = JUNCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_FEATURE_COUNT = JUNCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arrival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_OPERATION_COUNT = JUNCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.timetable.impl.DepartureImpl <em>Departure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.timetable.impl.DepartureImpl
	 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getDeparture()
	 * @generated
	 */
	int DEPARTURE = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__PLATFORM = JUNCTURE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__TRAIN = JUNCTURE__TRAIN;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__WEEKDAY = JUNCTURE__WEEKDAY;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__TIME = JUNCTURE__TIME;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE__DESTINATION = JUNCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_FEATURE_COUNT = JUNCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTURE_OPERATION_COUNT = JUNCTURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see org.mdse.pts.timetable.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.timetable.Timetable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.mdse.pts.timetable.Timetable#getTable()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_Table();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.timetable.Timetable#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Station</em>'.
	 * @see org.mdse.pts.timetable.Timetable#getStation()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_Station();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.mdse.pts.timetable.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.timetable.Table#getJunctures <em>Junctures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Junctures</em>'.
	 * @see org.mdse.pts.timetable.Table#getJunctures()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Junctures();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.timetable.Table#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see org.mdse.pts.timetable.Table#getStation()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Station();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.Arrival <em>Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival</em>'.
	 * @see org.mdse.pts.timetable.Arrival
	 * @generated
	 */
	EClass getArrival();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.timetable.Arrival#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.mdse.pts.timetable.Arrival#getOrigin()
	 * @see #getArrival()
	 * @generated
	 */
	EReference getArrival_Origin();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.Departure <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departure</em>'.
	 * @see org.mdse.pts.timetable.Departure
	 * @generated
	 */
	EClass getDeparture();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.timetable.Departure#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.mdse.pts.timetable.Departure#getDestination()
	 * @see #getDeparture()
	 * @generated
	 */
	EReference getDeparture_Destination();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.timetable.Juncture <em>Juncture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Juncture</em>'.
	 * @see org.mdse.pts.timetable.Juncture
	 * @generated
	 */
	EClass getJuncture();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.timetable.Juncture#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.mdse.pts.timetable.Juncture#getPlatform()
	 * @see #getJuncture()
	 * @generated
	 */
	EAttribute getJuncture_Platform();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.timetable.Juncture#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see org.mdse.pts.timetable.Juncture#getTrain()
	 * @see #getJuncture()
	 * @generated
	 */
	EReference getJuncture_Train();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.timetable.Juncture#getWeekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weekday</em>'.
	 * @see org.mdse.pts.timetable.Juncture#getWeekday()
	 * @see #getJuncture()
	 * @generated
	 */
	EAttribute getJuncture_Weekday();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.timetable.Juncture#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see org.mdse.pts.timetable.Juncture#getTime()
	 * @see #getJuncture()
	 * @generated
	 */
	EReference getJuncture_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimetableFactory getTimetableFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.TimetableImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__TABLE = eINSTANCE.getTimetable_Table();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__STATION = eINSTANCE.getTimetable_Station();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.TableImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Junctures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__JUNCTURES = eINSTANCE.getTable_Junctures();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__STATION = eINSTANCE.getTable_Station();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.ArrivalImpl <em>Arrival</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.ArrivalImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getArrival()
		 * @generated
		 */
		EClass ARRIVAL = eINSTANCE.getArrival();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL__ORIGIN = eINSTANCE.getArrival_Origin();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.DepartureImpl <em>Departure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.DepartureImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getDeparture()
		 * @generated
		 */
		EClass DEPARTURE = eINSTANCE.getDeparture();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTURE__DESTINATION = eINSTANCE.getDeparture_Destination();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.timetable.impl.JunctureImpl <em>Juncture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.timetable.impl.JunctureImpl
		 * @see org.mdse.pts.timetable.impl.TimetablePackageImpl#getJuncture()
		 * @generated
		 */
		EClass JUNCTURE = eINSTANCE.getJuncture();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTURE__PLATFORM = eINSTANCE.getJuncture_Platform();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTURE__TRAIN = eINSTANCE.getJuncture_Train();

		/**
		 * The meta object literal for the '<em><b>Weekday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTURE__WEEKDAY = eINSTANCE.getJuncture_Weekday();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTURE__TIME = eINSTANCE.getJuncture_Time();

	}

} //TimetablePackage
