/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bsw Schedulable Entity Start Interaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BswSchedulableEntityStartInteractionTest extends EntityStartInteractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BswSchedulableEntityStartInteractionTest.class);
	}

	/**
	 * Constructs a new Bsw Schedulable Entity Start Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntityStartInteractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bsw Schedulable Entity Start Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BswSchedulableEntityStartInteraction getFixture() {
		return (BswSchedulableEntityStartInteraction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionFactory.eINSTANCE.createBswSchedulableEntityStartInteraction());
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

} //BswSchedulableEntityStartInteractionTest
