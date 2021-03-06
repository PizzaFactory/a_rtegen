/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rte Os Interaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RteOsInteractionTest extends EcucContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RteOsInteractionTest.class);
	}

	/**
	 * Constructs a new Rte Os Interaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteOsInteractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rte Os Interaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RteOsInteraction getFixture() {
		return (RteOsInteraction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcucFactory.eINSTANCE.createRteOsInteraction());
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

} //RteOsInteractionTest
