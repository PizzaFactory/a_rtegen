/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ioc Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IocSendOperationTest extends SendOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IocSendOperationTest.class);
	}

	/**
	 * Constructs a new Ioc Send Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ioc Send Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IocSendOperation getFixture() {
		return (IocSendOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createIocSendOperation());
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

} //IocSendOperationTest
