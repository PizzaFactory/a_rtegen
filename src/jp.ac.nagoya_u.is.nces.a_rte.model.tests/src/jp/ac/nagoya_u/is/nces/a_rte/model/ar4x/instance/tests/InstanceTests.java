/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>instance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new InstanceTests("instance Tests"); //$NON-NLS-1$
		suite.addTestSuite(PortInstanceInCompositionTest.class);
		suite.addTestSuite(VariableDataInstanceInCompositionTest.class);
		suite.addTestSuite(PVariableDataInstanceInSwcTest.class);
		suite.addTestSuite(RVariableDataInstanceInSwcTest.class);
		suite.addTestSuite(ROperationInstanceInSwcTest.class);
		suite.addTestSuite(POperationInstanceInSwcTest.class);
		suite.addTestSuite(OperationInstanceInCompositionTest.class);
		suite.addTestSuite(SwComponentInstanceInSystemTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceTests(String name) {
		super(name);
	}

} //InstanceTests
