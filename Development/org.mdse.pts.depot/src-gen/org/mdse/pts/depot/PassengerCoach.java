/**
 */
package org.mdse.pts.depot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.PassengerCoach#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.depot.DepotPackage#getPassengerCoach()
 * @model
 * @generated
 */
public interface PassengerCoach extends Coach {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The default value is <code>"Economy"</code>.
	 * The literals are from the enumeration {@link org.mdse.pts.depot.CoachClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see org.mdse.pts.depot.CoachClass
	 * @see #setClass(CoachClass)
	 * @see org.mdse.pts.depot.DepotPackage#getPassengerCoach_Class()
	 * @model default="Economy"
	 * @generated
	 */
	CoachClass getClass_();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.PassengerCoach#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see org.mdse.pts.depot.CoachClass
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CoachClass value);

} // PassengerCoach
