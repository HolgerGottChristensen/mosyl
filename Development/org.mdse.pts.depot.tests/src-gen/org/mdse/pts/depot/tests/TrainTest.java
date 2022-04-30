/**
 */
package org.mdse.pts.depot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.depot.DepotFactory;
import org.mdse.pts.depot.Train;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrainTest extends TestCase {

	/**
	 * The fixture for this Train test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Train fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrainTest.class);
	}

	/**
	 * Constructs a new Train test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Train test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Train fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Train test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Train getFixture() {
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
		setFixture(DepotFactory.eINSTANCE.createTrain());
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

} //TrainTest
