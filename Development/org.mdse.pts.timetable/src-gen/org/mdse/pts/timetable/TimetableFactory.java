/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.pts.timetable.TimetablePackage
 * @generated
 */
public interface TimetableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimetableFactory eINSTANCE = org.mdse.pts.timetable.impl.TimetableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Table System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Table System</em>'.
	 * @generated
	 */
	TimeTableSystem createTimeTableSystem();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Arrival</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrival</em>'.
	 * @generated
	 */
	Arrival createArrival();

	/**
	 * Returns a new object of class '<em>Departure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departure</em>'.
	 * @generated
	 */
	Departure createDeparture();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimetablePackage getTimetablePackage();

} //TimetableFactory
