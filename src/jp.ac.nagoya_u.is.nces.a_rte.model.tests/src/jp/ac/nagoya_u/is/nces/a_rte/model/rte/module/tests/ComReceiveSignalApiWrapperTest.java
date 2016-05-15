/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Com Receive Signal Api Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComReceiveSignalApiWrapperTest extends ComSignalApiWrapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComReceiveSignalApiWrapperTest.class);
	}

	/**
	 * Constructs a new Com Receive Signal Api Wrapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComReceiveSignalApiWrapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Com Receive Signal Api Wrapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComReceiveSignalApiWrapper getFixture() {
		return (ComReceiveSignalApiWrapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createComReceiveSignalApiWrapper());
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

} //ComReceiveSignalApiWrapperTest
