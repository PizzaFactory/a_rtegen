/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rte Buffer Invalidate Trusted Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RteBufferInvalidateTrustedFunctionTest extends TrustedFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RteBufferInvalidateTrustedFunctionTest.class);
	}

	/**
	 * Constructs a new Rte Buffer Invalidate Trusted Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferInvalidateTrustedFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rte Buffer Invalidate Trusted Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RteBufferInvalidateTrustedFunction getFixture() {
		return (RteBufferInvalidateTrustedFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createRteBufferInvalidateTrustedFunction());
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

} //RteBufferInvalidateTrustedFunctionTest
