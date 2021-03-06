/**
 */
package org.mdse.pts.time;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.mdse.pts.time.TimeFactory
 * @model kind="package"
 * @generated
 */
public interface TimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "time";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/time";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "time";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimePackage eINSTANCE = org.mdse.pts.time.impl.TimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.time.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.time.impl.TimeImpl
	 * @see org.mdse.pts.time.impl.TimePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 0;

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
	 * The meta object id for the '{@link org.mdse.pts.time.Weekday <em>Weekday</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.time.Weekday
	 * @see org.mdse.pts.time.impl.TimePackageImpl#getWeekday()
	 * @generated
	 */
	int WEEKDAY = 1;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.time.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.mdse.pts.time.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.time.Time#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.mdse.pts.time.Time#getHour()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.time.Time#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.mdse.pts.time.Time#getMinute()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Minute();

	/**
	 * Returns the meta object for enum '{@link org.mdse.pts.time.Weekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weekday</em>'.
	 * @see org.mdse.pts.time.Weekday
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
	TimeFactory getTimeFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.time.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.time.impl.TimeImpl
		 * @see org.mdse.pts.time.impl.TimePackageImpl#getTime()
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
		 * The meta object literal for the '{@link org.mdse.pts.time.Weekday <em>Weekday</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.time.Weekday
		 * @see org.mdse.pts.time.impl.TimePackageImpl#getWeekday()
		 * @generated
		 */
		EEnum WEEKDAY = eINSTANCE.getWeekday();

	}

} //TimePackage
