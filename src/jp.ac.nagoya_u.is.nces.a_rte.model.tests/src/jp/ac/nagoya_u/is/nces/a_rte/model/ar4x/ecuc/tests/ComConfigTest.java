/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComConfig;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Com Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComConfigTest extends EcucContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComConfigTest.class);
	}

	/**
	 * Constructs a new Com Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComConfigTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Com Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComConfig getFixture() {
		return (ComConfig)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcucFactory.eINSTANCE.createComConfig());
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

} //ComConfigTest
