/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Os Interrupt Block Exclude Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsInterruptBlockExcludeOperationTest extends ExcludeOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OsInterruptBlockExcludeOperationTest.class);
	}

	/**
	 * Constructs a new Os Interrupt Block Exclude Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsInterruptBlockExcludeOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Os Interrupt Block Exclude Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OsInterruptBlockExcludeOperation getFixture() {
		return (OsInterruptBlockExcludeOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createOsInterruptBlockExcludeOperation());
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

} //OsInterruptBlockExcludeOperationTest
