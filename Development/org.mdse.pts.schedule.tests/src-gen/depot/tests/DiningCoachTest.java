/**
 */
package depot.tests;

import depot.DepotFactory;
import depot.DiningCoach;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dining Coach</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiningCoachTest extends CoachTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiningCoachTest.class);
	}

	/**
	 * Constructs a new Dining Coach test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiningCoachTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dining Coach test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiningCoach getFixture() {
		return (DiningCoach)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DepotFactory.eINSTANCE.createDiningCoach());
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

} //DiningCoachTest
