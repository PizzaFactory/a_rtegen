/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bsw Timing Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BswTimingEventTest extends BswEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BswTimingEventTest.class);
	}

	/**
	 * Constructs a new Bsw Timing Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswTimingEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bsw Timing Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BswTimingEvent getFixture() {
		return (BswTimingEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createBswTimingEvent());
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

} //BswTimingEventTest
