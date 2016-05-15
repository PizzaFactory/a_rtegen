/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trusted Function Rte Buffer Write Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustedFunctionRteBufferWriteSendOperationTest extends TrustedFunctionRteOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrustedFunctionRteBufferWriteSendOperationTest.class);
	}

	/**
	 * Constructs a new Trusted Function Rte Buffer Write Send Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteBufferWriteSendOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trusted Function Rte Buffer Write Send Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrustedFunctionRteBufferWriteSendOperation getFixture() {
		return (TrustedFunctionRteBufferWriteSendOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferWriteSendOperation());
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

} //TrustedFunctionRteBufferWriteSendOperationTest
