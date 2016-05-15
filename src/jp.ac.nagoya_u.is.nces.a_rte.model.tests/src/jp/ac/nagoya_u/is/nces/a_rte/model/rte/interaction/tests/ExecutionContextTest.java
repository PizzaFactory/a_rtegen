/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExecutionContext;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionContextTest extends InteractionEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutionContextTest.class);
	}

	/**
	 * Constructs a new Execution Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Execution Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExecutionContext getFixture() {
		return (ExecutionContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createExecutionContext());
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

} //ExecutionContextTest
