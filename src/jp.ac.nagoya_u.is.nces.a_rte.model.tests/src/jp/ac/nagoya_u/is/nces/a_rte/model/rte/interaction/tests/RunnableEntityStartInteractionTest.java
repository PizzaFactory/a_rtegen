/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Runnable Entity Start Interaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunnableEntityStartInteractionTest extends EntityStartInteractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RunnableEntityStartInteractionTest.class);
	}

	/**
	 * Constructs a new Runnable Entity Start Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntityStartInteractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Runnable Entity Start Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RunnableEntityStartInteraction getFixture() {
		return (RunnableEntityStartInteraction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createRunnableEntityStartInteraction());
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

} //RunnableEntityStartInteractionTest
