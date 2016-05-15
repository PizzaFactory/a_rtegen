/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Os Task Events Triggered By Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsTaskEventsTriggeredByModeTest extends ModuleObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OsTaskEventsTriggeredByModeTest.class);
	}

	/**
	 * Constructs a new Os Task Events Triggered By Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskEventsTriggeredByModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Os Task Events Triggered By Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OsTaskEventsTriggeredByMode getFixture() {
		return (OsTaskEventsTriggeredByMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createOsTaskEventsTriggeredByMode());
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

} //OsTaskEventsTriggeredByModeTest
