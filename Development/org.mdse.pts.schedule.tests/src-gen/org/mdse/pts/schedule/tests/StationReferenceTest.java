/**
 */
package org.mdse.pts.schedule.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.StationReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Station Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StationReferenceTest extends TestCase {

	/**
	 * The fixture for this Station Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StationReferenceTest.class);
	}

	/**
	 * Constructs a new Station Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Station Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StationReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Station Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationReference getFixture() {
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
		setFixture(ScheduleFactory.eINSTANCE.createStationReference());
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

} //StationReferenceTest
