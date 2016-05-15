/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Com Send Signal Immediate Task Body</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComSendSignalImmediateTaskBodyTest extends TaskBodyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComSendSignalImmediateTaskBodyTest.class);
	}

	/**
	 * Constructs a new Com Send Signal Immediate Task Body test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateTaskBodyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Com Send Signal Immediate Task Body test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComSendSignalImmediateTaskBody getFixture() {
		return (ComSendSignalImmediateTaskBody)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createComSendSignalImmediateTaskBody());
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

} //ComSendSignalImmediateTaskBodyTest
