/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.pts.schedule.SchedulePackage
 * @generated
 */
public interface ScheduleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScheduleFactory eINSTANCE = org.mdse.pts.schedule.impl.ScheduleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>Network Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Reference</em>'.
	 * @generated
	 */
	NetworkReference createNetworkReference();

	/**
	 * Returns a new object of class '<em>Depot Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depot Reference</em>'.
	 * @generated
	 */
	DepotReference createDepotReference();

	/**
	 * Returns a new object of class '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train</em>'.
	 * @generated
	 */
	Train createTrain();

	/**
	 * Returns a new object of class '<em>Start Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Time</em>'.
	 * @generated
	 */
	StartTime createStartTime();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns a new object of class '<em>Station Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Reference</em>'.
	 * @generated
	 */
	StationReference createStationReference();

	/**
	 * Returns a new object of class '<em>Leg Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leg Reference</em>'.
	 * @generated
	 */
	LegReference createLegReference();

	/**
	 * Returns a new object of class '<em>Train Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Reference</em>'.
	 * @generated
	 */
	TrainReference createTrainReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulePackage getSchedulePackage();

} //ScheduleFactory
