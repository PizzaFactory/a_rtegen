/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sender Receiver To Signal Group Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SenderReceiverToSignalGroupMappingTest extends DataMappingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SenderReceiverToSignalGroupMappingTest.class);
	}

	/**
	 * Constructs a new Sender Receiver To Signal Group Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalGroupMappingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sender Receiver To Signal Group Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SenderReceiverToSignalGroupMapping getFixture() {
		return (SenderReceiverToSignalGroupMapping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createSenderReceiverToSignalGroupMapping());
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

} //SenderReceiverToSignalGroupMappingTest
