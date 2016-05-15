/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bsw Module Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BswModuleEntryTest extends ArElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BswModuleEntryTest.class);
	}

	/**
	 * Constructs a new Bsw Module Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bsw Module Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BswModuleEntry getFixture() {
		return (BswModuleEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createBswModuleEntry());
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

} //BswModuleEntryTest
