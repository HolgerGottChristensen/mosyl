/**
 */
package org.mdse.pts.schedule.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.TrainSchedule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Train Schedule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrainScheduleTest extends TestCase {

	/**
	 * The fixture for this Train Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainSchedule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrainScheduleTest.class);
	}

	/**
	 * Constructs a new Train Schedule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainScheduleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Train Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TrainSchedule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Train Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainSchedule getFixture() {
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
		setFixture(ScheduleFactory.eINSTANCE.createTrainSchedule());
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

} //TrainScheduleTest
