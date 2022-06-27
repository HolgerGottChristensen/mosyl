/**
 */
package org.mdse.pts.schedule;

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
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Depot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DEPOT = 1;

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
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TrainScheduleImpl <em>Train Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TrainScheduleImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainSchedule()
	 * @generated
	 */
	int TRAIN_SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__TRAIN = 0;

	/**
	 * The feature id for the '<em><b>Starttimes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__STARTTIMES = 1;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SCHEDULE__STOPS = 2;

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
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.StopImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStop()
	 * @generated
	 */
	int STOP = 3;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Stopped Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOPPED_TIME = 1;

	/**
	 * The feature id for the '<em><b>Via</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__VIA = 2;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STATION = 3;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ROTATE = 4;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Schedule#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getNetwork()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Network();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.schedule.Schedule#getDepot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depot</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getDepot()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Depot();

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
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.TrainSchedule <em>Train Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Schedule</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule
	 * @generated
	 */
	EClass getTrainSchedule();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.TrainSchedule#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getTrain()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Train();

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
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.TrainSchedule#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see org.mdse.pts.schedule.TrainSchedule#getStops()
	 * @see #getTrainSchedule()
	 * @generated
	 */
	EReference getTrainSchedule_Stops();

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
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see org.mdse.pts.schedule.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Stop#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.mdse.pts.schedule.Stop#getPlatform()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Platform();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Stop#getStoppedTime <em>Stopped Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stopped Time</em>'.
	 * @see org.mdse.pts.schedule.Stop#getStoppedTime()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_StoppedTime();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Stop#getVia <em>Via</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Via</em>'.
	 * @see org.mdse.pts.schedule.Stop#getVia()
	 * @see #getStop()
	 * @generated
	 */
	EReference getStop_Via();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Stop#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see org.mdse.pts.schedule.Stop#getStation()
	 * @see #getStop()
	 * @generated
	 */
	EReference getStop_Station();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Stop#isRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see org.mdse.pts.schedule.Stop#isRotate()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Rotate();

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
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__NETWORK = eINSTANCE.getSchedule_Network();

		/**
		 * The meta object literal for the '<em><b>Depot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__DEPOT = eINSTANCE.getSchedule_Depot();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__TRAINS = eINSTANCE.getSchedule_Trains();

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
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__TRAIN = eINSTANCE.getTrainSchedule_Train();

		/**
		 * The meta object literal for the '<em><b>Starttimes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__STARTTIMES = eINSTANCE.getTrainSchedule_Starttimes();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SCHEDULE__STOPS = eINSTANCE.getTrainSchedule_Stops();

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
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.StopImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__PLATFORM = eINSTANCE.getStop_Platform();

		/**
		 * The meta object literal for the '<em><b>Stopped Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__STOPPED_TIME = eINSTANCE.getStop_StoppedTime();

		/**
		 * The meta object literal for the '<em><b>Via</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP__VIA = eINSTANCE.getStop_Via();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP__STATION = eINSTANCE.getStop_Station();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__ROTATE = eINSTANCE.getStop_Rotate();

	}

} //SchedulePackage
