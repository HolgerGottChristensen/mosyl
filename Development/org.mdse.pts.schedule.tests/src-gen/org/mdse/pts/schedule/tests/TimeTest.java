/**
 */
package org.mdse.pts.schedule.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.Time;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTest extends TestCase {

	/**
	 * The fixture for this Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Time fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeTest.class);
	}

	/**
	 * Constructs a new Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Time fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Time getFixture() {
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
		setFixture(ScheduleFactory.eINSTANCE.createTime());
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

} //TimeTest
