/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Direct Com Send Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DirectComSendImplementationTest extends ComSendImplementationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DirectComSendImplementationTest.class);
	}

	/**
	 * Constructs a new Direct Com Send Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectComSendImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Direct Com Send Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DirectComSendImplementation getFixture() {
		return (DirectComSendImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createDirectComSendImplementation());
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

} //DirectComSendImplementationTest
