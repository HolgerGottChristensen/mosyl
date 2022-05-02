/**
 */
package org.mdse.pts.schedule.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.mdse.pts.schedule.DepotReference;
import org.mdse.pts.schedule.ScheduleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Depot Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotReferenceTest extends TestCase {

	/**
	 * The fixture for this Depot Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepotReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DepotReferenceTest.class);
	}

	/**
	 * Constructs a new Depot Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Depot Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DepotReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Depot Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepotReference getFixture() {
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
		setFixture(ScheduleFactory.eINSTANCE.createDepotReference());
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

} //DepotReferenceTest
