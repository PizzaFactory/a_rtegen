/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mode Switch Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeSwitchTriggeringExecutableStartOperationTest extends ExecutableStartOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModeSwitchTriggeringExecutableStartOperationTest.class);
	}

	/**
	 * Constructs a new Mode Switch Triggering Executable Start Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitchTriggeringExecutableStartOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mode Switch Triggering Executable Start Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModeSwitchTriggeringExecutableStartOperation getFixture() {
		return (ModeSwitchTriggeringExecutableStartOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createModeSwitchTriggeringExecutableStartOperation());
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

} //ModeSwitchTriggeringExecutableStartOperationTest
