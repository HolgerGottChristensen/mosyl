/**
 */
package depot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link depot.Root#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @see depot.DepotPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Depot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depot</em>' containment reference.
	 * @see #setDepot(Depot)
	 * @see depot.DepotPackage#getRoot_Depot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Depot getDepot();

	/**
	 * Sets the value of the '{@link depot.Root#getDepot <em>Depot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depot</em>' containment reference.
	 * @see #getDepot()
	 * @generated
	 */
	void setDepot(Depot value);

} // Root
