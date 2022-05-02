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
	 * The feature id for the '<em><b>Networkreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NETWORKREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Depotreference</b></em>' containment reference list.
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
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.NetworkReferenceImpl <em>Network Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.NetworkReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getNetworkReference()
	 * @generated
	 */
	int NETWORK_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Network Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Network Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.DepotReferenceImpl <em>Depot Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.DepotReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getDepotReference()
	 * @generated
	 */
	int DEPOT_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Depot Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Depot Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TrainImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 3;

	/**
	 * The feature id for the '<em><b>Trainreference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAINREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Starttimes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__STARTTIMES = 1;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__STOPS = 2;

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
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.StartTimeImpl <em>Start Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.StartTimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStartTime()
	 * @generated
	 */
	int START_TIME = 4;

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
	int TIME = 5;

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
	int STATION = 6;

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
	 * The feature id for the '<em><b>Stationreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__STATIONREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Via</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__VIA = 3;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.StationReferenceImpl <em>Station Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.StationReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStationReference()
	 * @generated
	 */
	int STATION_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Station Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Station Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.LegReferenceImpl <em>Leg Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.LegReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getLegReference()
	 * @generated
	 */
	int LEG_REFERENCE = 8;

	/**
	 * The number of structural features of the '<em>Leg Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Leg Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TrainReferenceImpl <em>Train Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TrainReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainReference()
	 * @generated
	 */
	int TRAIN_REFERENCE = 9;

	/**
	 * The number of structural features of the '<em>Train Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Train Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.Weekday <em>Weekday</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.Weekday
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getWeekday()
	 * @generated
	 */
	int WEEKDAY = 10;


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
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.Schedule#getNetworkreference <em>Networkreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Networkreference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getNetworkreference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Networkreference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getDepotreference <em>Depotreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Depotreference</em>'.
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
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.NetworkReference <em>Network Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Reference</em>'.
	 * @see org.mdse.pts.schedule.NetworkReference
	 * @generated
	 */
	EClass getNetworkReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.DepotReference <em>Depot Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depot Reference</em>'.
	 * @see org.mdse.pts.schedule.DepotReference
	 * @generated
	 */
	EClass getDepotReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see org.mdse.pts.schedule.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Train#getTrainreference <em>Trainreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trainreference</em>'.
	 * @see org.mdse.pts.schedule.Train#getTrainreference()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Trainreference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Train#getStarttimes <em>Starttimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Starttimes</em>'.
	 * @see org.mdse.pts.schedule.Train#getStarttimes()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Starttimes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Train#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see org.mdse.pts.schedule.Train#getStops()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Stops();

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
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.Station#getStationreference <em>Stationreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stationreference</em>'.
	 * @see org.mdse.pts.schedule.Station#getStationreference()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Stationreference();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.Station#getVia <em>Via</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via</em>'.
	 * @see org.mdse.pts.schedule.Station#getVia()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Via();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.StationReference <em>Station Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Reference</em>'.
	 * @see org.mdse.pts.schedule.StationReference
	 * @generated
	 */
	EClass getStationReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.LegReference <em>Leg Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leg Reference</em>'.
	 * @see org.mdse.pts.schedule.LegReference
	 * @generated
	 */
	EClass getLegReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.TrainReference <em>Train Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Reference</em>'.
	 * @see org.mdse.pts.schedule.TrainReference
	 * @generated
	 */
	EClass getTrainReference();

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
		 * The meta object literal for the '<em><b>Networkreference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__NETWORKREFERENCE = eINSTANCE.getSchedule_Networkreference();
		/**
		 * The meta object literal for the '<em><b>Depotreference</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.NetworkReferenceImpl <em>Network Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.NetworkReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getNetworkReference()
		 * @generated
		 */
		EClass NETWORK_REFERENCE = eINSTANCE.getNetworkReference();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.DepotReferenceImpl <em>Depot Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.DepotReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getDepotReference()
		 * @generated
		 */
		EClass DEPOT_REFERENCE = eINSTANCE.getDepotReference();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TrainImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();
		/**
		 * The meta object literal for the '<em><b>Trainreference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__TRAINREFERENCE = eINSTANCE.getTrain_Trainreference();
		/**
		 * The meta object literal for the '<em><b>Starttimes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__STARTTIMES = eINSTANCE.getTrain_Starttimes();
		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__STOPS = eINSTANCE.getTrain_Stops();
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
		 * The meta object literal for the '<em><b>Stationreference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__STATIONREFERENCE = eINSTANCE.getStation_Stationreference();
		/**
		 * The meta object literal for the '<em><b>Via</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__VIA = eINSTANCE.getStation_Via();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.StationReferenceImpl <em>Station Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.StationReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStationReference()
		 * @generated
		 */
		EClass STATION_REFERENCE = eINSTANCE.getStationReference();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.LegReferenceImpl <em>Leg Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.LegReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getLegReference()
		 * @generated
		 */
		EClass LEG_REFERENCE = eINSTANCE.getLegReference();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TrainReferenceImpl <em>Train Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TrainReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainReference()
		 * @generated
		 */
		EClass TRAIN_REFERENCE = eINSTANCE.getTrainReference();
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
