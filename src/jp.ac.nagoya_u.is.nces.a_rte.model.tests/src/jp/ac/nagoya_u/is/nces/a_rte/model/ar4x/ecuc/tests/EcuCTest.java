/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ecu C</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcuCTest extends EcucModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EcuCTest.class);
	}

	/**
	 * Constructs a new Ecu C test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcuCTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ecu C test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EcuC getFixture() {
		return (EcuC)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcucFactory.eINSTANCE.createEcuC());
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

} //EcuCTest
