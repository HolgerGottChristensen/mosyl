/**
 */
package org.mdse.gt.stationplan.tests;

import junit.textui.TestRunner;

import org.mdse.gt.stationplan.StationPlan;
import org.mdse.gt.stationplan.StationplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Station Plan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StationPlanTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StationPlanTest.class);
	}

	/**
	 * Constructs a new Station Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationPlanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Station Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StationPlan getFixture() {
		return (StationPlan)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StationplanFactory.eINSTANCE.createStationPlan());
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

} //StationPlanTest
