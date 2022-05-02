/**
 */
package network.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import network.Leg;
import network.NetworkFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegTest extends TestCase {

	/**
	 * The fixture for this Leg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Leg fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegTest.class);
	}

	/**
	 * Constructs a new Leg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Leg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Leg fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Leg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Leg getFixture() {
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
		setFixture(NetworkFactory.eINSTANCE.createLeg());
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

} //LegTest
