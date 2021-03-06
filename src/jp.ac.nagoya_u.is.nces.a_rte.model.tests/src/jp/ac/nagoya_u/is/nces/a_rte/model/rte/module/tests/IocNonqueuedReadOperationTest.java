/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ioc Nonqueued Read Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IocNonqueuedReadOperationTest extends ReadOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IocNonqueuedReadOperationTest.class);
	}

	/**
	 * Constructs a new Ioc Nonqueued Read Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocNonqueuedReadOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ioc Nonqueued Read Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IocNonqueuedReadOperation getFixture() {
		return (IocNonqueuedReadOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createIocNonqueuedReadOperation());
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

} //IocNonqueuedReadOperationTest
