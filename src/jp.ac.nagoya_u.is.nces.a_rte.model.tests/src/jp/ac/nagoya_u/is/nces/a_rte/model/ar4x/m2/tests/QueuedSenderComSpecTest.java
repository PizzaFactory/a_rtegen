/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.QueuedSenderComSpec;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Queued Sender Com Spec</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueuedSenderComSpecTest extends SenderComSpecTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QueuedSenderComSpecTest.class);
	}

	/**
	 * Constructs a new Queued Sender Com Spec test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuedSenderComSpecTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Queued Sender Com Spec test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QueuedSenderComSpec getFixture() {
		return (QueuedSenderComSpec)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createQueuedSenderComSpec());
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

} //QueuedSenderComSpecTest
