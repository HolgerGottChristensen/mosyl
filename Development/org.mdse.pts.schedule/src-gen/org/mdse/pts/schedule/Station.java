/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Station#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Station#getStoppedTime <em>Stopped Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Station#getStationreference <em>Stationreference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Station#getVia <em>Via</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStation_Platform()
	 * @model required="true"
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Station#getPlatform <em>Platform</em>}' attribute.
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
	 * @see org.mdse.pts.schedule.SchedulePackage#getStation_StoppedTime()
	 * @model
	 * @generated
	 */
	int getStoppedTime();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Station#getStoppedTime <em>Stopped Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopped Time</em>' attribute.
	 * @see #getStoppedTime()
	 * @generated
	 */
	void setStoppedTime(int value);

	/**
	 * Returns the value of the '<em><b>Stationreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stationreference</em>' containment reference.
	 * @see #setStationreference(StationReference)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStation_Stationreference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StationReference getStationreference();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Station#getStationreference <em>Stationreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stationreference</em>' containment reference.
	 * @see #getStationreference()
	 * @generated
	 */
	void setStationreference(StationReference value);

	/**
	 * Returns the value of the '<em><b>Via</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via</em>' containment reference.
	 * @see #setVia(LegReference)
	 * @see org.mdse.pts.schedule.SchedulePackage#getStation_Via()
	 * @model containment="true"
	 * @generated
	 */
	LegReference getVia();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Station#getVia <em>Via</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via</em>' containment reference.
	 * @see #getVia()
	 * @generated
	 */
	void setVia(LegReference value);

} // Station
