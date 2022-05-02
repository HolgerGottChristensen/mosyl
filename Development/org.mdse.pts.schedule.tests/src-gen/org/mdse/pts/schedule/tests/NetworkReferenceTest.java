/**
 */
package org.mdse.pts.schedule.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.schedule.NetworkReference;
import org.mdse.pts.schedule.ScheduleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkReferenceTest extends TestCase {

	/**
	 * The fixture for this Network Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkReferenceTest.class);
	}

	/**
	 * Constructs a new Network Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Network Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NetworkReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Network Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkReference getFixture() {
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
		setFixture(ScheduleFactory.eINSTANCE.createNetworkReference());
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

} //NetworkReferenceTest
