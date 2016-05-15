/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Ecu Sender</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalEcuSenderTest extends SenderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalEcuSenderTest.class);
	}

	/**
	 * Constructs a new External Ecu Sender test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuSenderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Ecu Sender test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalEcuSender getFixture() {
		return (ExternalEcuSender)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createExternalEcuSender());
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

} //ExternalEcuSenderTest
