/**
 */
package org.mdse.pts.schedule;

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
 * @see org.mdse.pts.schedule.ScheduleFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/schedule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schedule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulePackage eINSTANCE = org.mdse.pts.schedule.impl.SchedulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.ScheduleImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Networkreference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NETWORKREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Depotreference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DEPOTREFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TRAINS = 2;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ROUTES = 3;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TrainScheduleImpl <em>Train Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TrainScheduleImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainSchedule()
	 * @generated
	 */
	int TRAIN_SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Starttimes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__STARTTIMES = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__ROUTE = 2;

	/**
	 * The number of structural features of the '<em>Train Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.StartTimeImpl <em>Start Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.StartTimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStartTime()
	 * @generated
	 */
	int START_TIME = 2;

	/**
	 * The feature id for the '<em><b>Weekdays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__WEEKDAYS = 0;

	/**
	 * The feature id for the '<em><b>Timestamps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__TIMESTAMPS = 1;

	/**
	 * The number of structural features of the '<em>Start Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Start Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 3;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MINUTE = 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.StationImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStation()
	 * @generated
	 */
	int STATION = 4;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Stopped Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__STOPPED_TIME = 1;

	/**
	 * The feature id for the '<em><b>Via</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__VIA = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ROTATE = 4;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.RouteImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STOPS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.Weekday <em>Weekday</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.Weekday
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getWeekday()
	 * @generated
	 */
	int WEEKDAY = 6;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see org.mdse.pts.schedule.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Schedule#getNetworkreference <em>Networkreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkreference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getNetworkreference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Networkreference();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.schedule.Schedule#getDepotreference <em>Depotreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depotreference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getDepotreference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Depotreference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getTrains()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Trains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getRoutes()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Routes();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.TrainSchedule <em>Train Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Schedule</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule
	 * @generated
	 */
	EClass getTrainSchedule();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.TrainSchedule#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getReference()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.TrainSchedule#getStarttimes <em>Starttimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Starttimes</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getStarttimes()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Starttimes();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.TrainSchedule#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getRoute()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Route();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.StartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Time</em>'.
	 * @see org.mdse.pts.schedule.StartTime
	 * @generated
	 */
	EClass getStartTime();

	/**
	 * Returns the meta object for the attribute list '{@link org.mdse.pts.schedule.StartTime#getWeekdays <em>Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weekdays</em>'.
	 * @see org.mdse.pts.schedule.StartTime#getWeekdays()
	 * @see #getStartTime()
	 * @generated
	 */
	EAttribute getStartTime_Weekdays();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.StartTime#getTimestamps <em>Timestamps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timestamps</em>'.
	 * @see org.mdse.pts.schedule.StartTime#getTimestamps()
	 * @see #getStartTime()
	 * @generated
	 */
	EReference getStartTime_Timestamps();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.mdse.pts.schedule.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Time#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.mdse.pts.schedule.Time#getHour()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Time#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.mdse.pts.schedule.Time#getMinute()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minute();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see org.mdse.pts.schedule.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Station#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.mdse.pts.schedule.Station#getPlatform()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Platform();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Station#getStoppedTime <em>Stopped Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stopped Time</em>'.
	 * @see org.mdse.pts.schedule.Station#getStoppedTime()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_StoppedTime();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Station#getVia <em>Via</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Via</em>'.
	 * @see org.mdse.pts.schedule.Station#getVia()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Via();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Station#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.mdse.pts.schedule.Station#getReference()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Station#isRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see org.mdse.pts.schedule.Station#isRotate()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Rotate();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see org.mdse.pts.schedule.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Route#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see org.mdse.pts.schedule.Route#getStops()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Stops();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.schedule.Weekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weekday</em>'.
	 * @see org.mdse.pts.schedule.Weekday
	 * @generated
	 */
	EEnum getWeekday();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScheduleFactory getScheduleFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.ScheduleImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Networkreference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__NETWORKREFERENCE = eINSTANCE.getSchedule_Networkreference();

		/**
		 * The meta object literal for the '<em><b>Depotreference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__DEPOTREFERENCE = eINSTANCE.getSchedule_Depotreference();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__TRAINS = eINSTANCE.getSchedule_Trains();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__ROUTES = eINSTANCE.getSchedule_Routes();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TrainScheduleImpl <em>Train Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TrainScheduleImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainSchedule()
		 * @generated
		 */
		EClass TRAIN_SCHEDULE = eINSTANCE.getTrainSchedule();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__REFERENCE = eINSTANCE.getTrainSchedule_Reference();

		/**
		 * The meta object literal for the '<em><b>Starttimes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__STARTTIMES = eINSTANCE.getTrainSchedule_Starttimes();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__ROUTE = eINSTANCE.getTrainSchedule_Route();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.StartTimeImpl <em>Start Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.StartTimeImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStartTime()
		 * @generated
		 */
		EClass START_TIME = eINSTANCE.getStartTime();

		/**
		 * The meta object literal for the '<em><b>Weekdays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIME__WEEKDAYS = eINSTANCE.getStartTime_Weekdays();

		/**
		 * The meta object literal for the '<em><b>Timestamps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TIME__TIMESTAMPS = eINSTANCE.getStartTime_Timestamps();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TimeImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__HOUR = eINSTANCE.getTime_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MINUTE = eINSTANCE.getTime_Minute();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.StationImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__PLATFORM = eINSTANCE.getStation_Platform();

		/**
		 * The meta object literal for the '<em><b>Stopped Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__STOPPED_TIME = eINSTANCE.getStation_StoppedTime();

		/**
		 * The meta object literal for the '<em><b>Via</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__VIA = eINSTANCE.getStation_Via();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__REFERENCE = eINSTANCE.getStation_Reference();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__ROTATE = eINSTANCE.getStation_Rotate();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.RouteImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STOPS = eINSTANCE.getRoute_Stops();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.Weekday <em>Weekday</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.Weekday
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getWeekday()
		 * @generated
		 */
		EEnum WEEKDAY = eINSTANCE.getWeekday();

	}

} //SchedulePackage
