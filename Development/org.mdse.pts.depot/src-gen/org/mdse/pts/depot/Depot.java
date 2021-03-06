/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.Depot#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.depot.DepotPackage#getDepot()
 * @model
 * @generated
 */
public interface Depot extends EObject {
	/**
	 * Returns the value of the '<em><b>Train</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.depot.Train}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' containment reference list.
	 * @see org.mdse.pts.depot.DepotPackage#getDepot_Train()
	 * @model containment="true"
	 * @generated
	 */
	EList<Train> getTrain();

} // Depot
