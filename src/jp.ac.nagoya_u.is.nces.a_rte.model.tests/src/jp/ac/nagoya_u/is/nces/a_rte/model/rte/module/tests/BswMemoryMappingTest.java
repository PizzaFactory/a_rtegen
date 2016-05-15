/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bsw Memory Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BswMemoryMappingTest extends MemoryMappingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BswMemoryMappingTest.class);
	}

	/**
	 * Constructs a new Bsw Memory Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswMemoryMappingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bsw Memory Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BswMemoryMapping getFixture() {
		return (BswMemoryMapping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModuleFactory.eINSTANCE.createBswMemoryMapping());
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

} //BswMemoryMappingTest
