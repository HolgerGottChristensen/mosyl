/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.Train#getCoach <em>Coach</em>}</li>
 *   <li>{@link org.mdse.pts.depot.Train#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.depot.Train#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.depot.DepotPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Coach</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.depot.Coach}.
	 * It is bidirectional and its opposite is '{@link org.mdse.pts.depot.Coach#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' containment reference list.
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Coach()
	 * @see org.mdse.pts.depot.Coach#getTrain
	 * @model opposite="train" containment="true"
	 * @generated
	 */
	EList<Coach> getCoach();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.Train#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mdse.pts.depot.TrainType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mdse.pts.depot.TrainType
	 * @see #setType(TrainType)
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Type()
	 * @model required="true"
	 * @generated
	 */
	TrainType getType();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.Train#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mdse.pts.depot.TrainType
	 * @see #getType()
	 * @generated
	 */
	void setType(TrainType value);

} // Train
