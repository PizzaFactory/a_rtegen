/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstrRule;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Constr Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataConstrRuleTest extends M2ObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataConstrRuleTest.class);
	}

	/**
	 * Constructs a new Data Constr Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstrRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Constr Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataConstrRule getFixture() {
		return (DataConstrRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2Factory.eINSTANCE.createDataConstrRule());
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

} //DataConstrRuleTest
