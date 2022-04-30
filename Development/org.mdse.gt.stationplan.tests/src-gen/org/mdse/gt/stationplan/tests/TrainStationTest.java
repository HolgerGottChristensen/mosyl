/**
 */
package org.mdse.gt.stationplan.tests;

import junit.textui.TestRunner;

import org.mdse.gt.stationplan.StationplanFactory;
import org.mdse.gt.stationplan.TrainStation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Train Station</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrainStationTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrainStationTest.class);
	}

	/**
	 * Constructs a new Train Station test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainStationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Train Station test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrainStation getFixture() {
		return (TrainStation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StationplanFactory.eINSTANCE.createTrainStation());
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

} //TrainStationTest
