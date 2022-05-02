/**
 */
package depot.tests;

import depot.DepotFactory;
import depot.Locomotive;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Locomotive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocomotiveTest extends CoachTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocomotiveTest.class);
	}

	/**
	 * Constructs a new Locomotive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocomotiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Locomotive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Locomotive getFixture() {
		return (Locomotive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DepotFactory.eINSTANCE.createLocomotive());
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

} //LocomotiveTest
