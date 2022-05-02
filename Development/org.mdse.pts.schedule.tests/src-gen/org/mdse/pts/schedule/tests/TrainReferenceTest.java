/**
 */
package org.mdse.pts.schedule.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.schedule.ScheduleFactory;
import org.mdse.pts.schedule.TrainReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Train Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrainReferenceTest extends TestCase {

	/**
	 * The fixture for this Train Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrainReferenceTest.class);
	}

	/**
	 * Constructs a new Train Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Train Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TrainReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Train Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainReference getFixture() {
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
		setFixture(ScheduleFactory.eINSTANCE.createTrainReference());
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

} //TrainReferenceTest
