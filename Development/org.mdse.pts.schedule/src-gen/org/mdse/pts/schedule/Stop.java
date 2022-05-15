/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Stop#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Stop#getStoppedTime <em>Stopped Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Stop#getVia <em>Via</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Stop#getStation <em>Station</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Stop#isRotate <em>Rotate</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getStop()
 * @model
 * @generated
 */
public interface Stop extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStop_Platform()
	 * @model required="true"
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Stop#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Stopped Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopped Time</em>' attribute.
	 * @see #setStoppedTime(int)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStop_StoppedTime()
	 * @model
	 * @generated
	 */
	int getStoppedTime();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Stop#getStoppedTime <em>Stopped Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopped Time</em>' attribute.
	 * @see #getStoppedTime()
	 * @generated
	 */
	void setStoppedTime(int value);

	/**
	 * Returns the value of the '<em><b>Via</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via</em>' reference.
	 * @see #setVia(Leg)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStop_Via()
	 * @model
	 * @generated
	 */
	Leg getVia();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Stop#getVia <em>Via</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via</em>' reference.
	 * @see #getVia()
	 * @generated
	 */
	void setVia(Leg value);

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStop_Station()
	 * @model required="true"
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Stop#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotate</em>' attribute.
	 * @see #setRotate(boolean)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStop_Rotate()
	 * @model required="true"
	 * @generated
	 */
	boolean isRotate();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Stop#isRotate <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotate</em>' attribute.
	 * @see #isRotate()
	 * @generated
	 */
	void setRotate(boolean value);

} // Stop
