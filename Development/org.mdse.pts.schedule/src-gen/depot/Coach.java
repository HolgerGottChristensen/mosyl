/**
 */
package depot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link depot.Coach#getWagonNumber <em>Wagon Number</em>}</li>
 *   <li>{@link depot.Coach#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @see depot.DepotPackage#getCoach()
 * @model
 * @generated
 */
public interface Coach extends EObject {
	/**
	 * Returns the value of the '<em><b>Wagon Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wagon Number</em>' attribute.
	 * @see #setWagonNumber(int)
	 * @see depot.DepotPackage#getCoach_WagonNumber()
	 * @model
	 * @generated
	 */
	int getWagonNumber();

	/**
	 * Sets the value of the '{@link depot.Coach#getWagonNumber <em>Wagon Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wagon Number</em>' attribute.
	 * @see #getWagonNumber()
	 * @generated
	 */
	void setWagonNumber(int value);

	/**
	 * Returns the value of the '<em><b>Train</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link depot.Train#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' container reference.
	 * @see #setTrain(Train)
	 * @see depot.DepotPackage#getCoach_Train()
	 * @see depot.Train#getCoach
	 * @model opposite="coach" transient="false"
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link depot.Coach#getTrain <em>Train</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' container reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

} // Coach
