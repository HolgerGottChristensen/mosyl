/**
 */
package org.mdse.pts.depot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.depot.Depot;
import org.mdse.pts.depot.DepotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Depot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotTest extends TestCase {

	/**
	 * The fixture for this Depot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Depot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DepotTest.class);
	}

	/**
	 * Constructs a new Depot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Depot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Depot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Depot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Depot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DepotFactory.eINSTANCE.createDepot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DepotTest
