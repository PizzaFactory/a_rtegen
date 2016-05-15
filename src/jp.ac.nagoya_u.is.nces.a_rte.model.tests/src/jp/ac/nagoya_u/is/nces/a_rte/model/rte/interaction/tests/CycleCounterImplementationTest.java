/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cycle Counter Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CycleCounterImplementationTest extends VariableImplementationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CycleCounterImplementationTest.class);
	}

	/**
	 * Constructs a new Cycle Counter Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCounterImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cycle Counter Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CycleCounterImplementation getFixture() {
		return (CycleCounterImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createCycleCounterImplementation());
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

} //CycleCounterImplementationTest
