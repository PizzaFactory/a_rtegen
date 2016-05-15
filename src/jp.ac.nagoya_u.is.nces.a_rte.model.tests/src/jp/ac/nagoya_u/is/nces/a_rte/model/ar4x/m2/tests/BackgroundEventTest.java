/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BackgroundEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Background Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BackgroundEventTest extends RteEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BackgroundEventTest.class);
	}

	/**
	 * Constructs a new Background Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Background Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BackgroundEvent getFixture() {
		return (BackgroundEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createBackgroundEvent());
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

} //BackgroundEventTest
