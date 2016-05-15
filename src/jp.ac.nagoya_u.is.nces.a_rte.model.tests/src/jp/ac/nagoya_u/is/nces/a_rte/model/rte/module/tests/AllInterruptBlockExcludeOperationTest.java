/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>All Interrupt Block Exclude Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllInterruptBlockExcludeOperationTest extends ExcludeOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllInterruptBlockExcludeOperationTest.class);
	}

	/**
	 * Constructs a new All Interrupt Block Exclude Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllInterruptBlockExcludeOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this All Interrupt Block Exclude Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllInterruptBlockExcludeOperation getFixture() {
		return (AllInterruptBlockExcludeOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createAllInterruptBlockExcludeOperation());
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

} //AllInterruptBlockExcludeOperationTest
