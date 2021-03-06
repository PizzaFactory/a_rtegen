/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cycle Countup Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CycleCountupOperationTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CycleCountupOperationTest.class);
	}

	/**
	 * Constructs a new Cycle Countup Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCountupOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cycle Countup Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CycleCountupOperation getFixture() {
		return (CycleCountupOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createCycleCountupOperation());
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

} //CycleCountupOperationTest
