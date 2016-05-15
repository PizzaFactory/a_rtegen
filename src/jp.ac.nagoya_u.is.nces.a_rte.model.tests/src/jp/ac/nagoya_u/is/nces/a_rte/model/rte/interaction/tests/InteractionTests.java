/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>interaction</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new InteractionTests("interaction Tests"); //$NON-NLS-1$
		suite.addTestSuite(InternalEcuSenderTest.class);
		suite.addTestSuite(ExternalEcuSenderTest.class);
		suite.addTestSuite(SendInteractionTest.class);
		suite.addTestSuite(ReceiveInteractionTest.class);
		suite.addTestSuite(ReceiverTest.class);
		suite.addTestSuite(InternalEcuReceiverTest.class);
		suite.addTestSuite(ExternalEcuReceiverTest.class);
		suite.addTestSuite(RteSendImplementationTest.class);
		suite.addTestSuite(IocSendImplementationTest.class);
		suite.addTestSuite(DirectComSendImplementationTest.class);
		suite.addTestSuite(TrustedFunctionComSendImplementationTest.class);
		suite.addTestSuite(PeriodicProxyComSendImplementationTest.class);
		suite.addTestSuite(ImmediateProxyComSendImplementationTest.class);
		suite.addTestSuite(TrustedFunctionRteSendImplementationTest.class);
		suite.addTestSuite(PeriodicComSendProxyTest.class);
		suite.addTestSuite(ImmediateComSendProxyTest.class);
		suite.addTestSuite(ExecutionContextTest.class);
		suite.addTestSuite(OsTaskActivateEntityStarterTest.class);
		suite.addTestSuite(OsEventSetEntityStarterTest.class);
		suite.addTestSuite(TimingTriggeringEntityStartImplementationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTests(String name) {
		super(name);
	}

} //InteractionTests
