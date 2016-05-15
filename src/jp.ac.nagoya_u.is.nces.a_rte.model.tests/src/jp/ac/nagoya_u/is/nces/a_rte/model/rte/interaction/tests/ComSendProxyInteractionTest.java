/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Com Send Proxy Interaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComSendProxyInteractionTest extends InteractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComSendProxyInteractionTest.class);
	}

	/**
	 * Constructs a new Com Send Proxy Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxyInteractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Com Send Proxy Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComSendProxyInteraction getFixture() {
		return (ComSendProxyInteraction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createComSendProxyInteraction());
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

} //ComSendProxyInteractionTest
