/**
 */
package depot.tests;

import depot.DepotFactory;
import depot.PassengerCoach;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Passenger Coach</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PassengerCoachTest extends CoachTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PassengerCoachTest.class);
	}

	/**
	 * Constructs a new Passenger Coach test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerCoachTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Passenger Coach test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PassengerCoach getFixture() {
		return (PassengerCoach)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DepotFactory.eINSTANCE.createPassengerCoach());
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

} //PassengerCoachTest
