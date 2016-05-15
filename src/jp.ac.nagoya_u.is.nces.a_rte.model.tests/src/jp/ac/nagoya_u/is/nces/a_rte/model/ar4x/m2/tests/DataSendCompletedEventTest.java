/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Send Completed Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSourceData() <em>Event Source Data</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DataSendCompletedEventTest extends RteEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSendCompletedEventTest.class);
	}

	/**
	 * Constructs a new Data Send Completed Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSendCompletedEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Send Completed Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSendCompletedEvent getFixture() {
		return (DataSendCompletedEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createDataSendCompletedEvent());
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

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSourceData() <em>Event Source Data</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataSendCompletedEvent#getEventSourceData()
	 * @generated
	 */
	public void testGetEventSourceData() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DataSendCompletedEventTest
