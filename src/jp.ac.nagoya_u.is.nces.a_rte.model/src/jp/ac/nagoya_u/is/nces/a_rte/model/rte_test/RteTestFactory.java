/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage
 * @generated
 */
public interface RteTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RteTestFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	RteTestModule createRteTestModule();

	/**
	 * Returns a new object of class '<em>Os Stub Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Stub Header</em>'.
	 * @generated
	 */
	OsStubHeader createOsStubHeader();

	/**
	 * Returns a new object of class '<em>Com Stub Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Stub Header</em>'.
	 * @generated
	 */
	ComStubHeader createComStubHeader();

	/**
	 * Returns a new object of class '<em>Ioc Mock Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Mock Header</em>'.
	 * @generated
	 */
	IocMockHeader createIocMockHeader();

	/**
	 * Returns a new object of class '<em>Swc Mock Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Mock Header</em>'.
	 * @generated
	 */
	SwcMockHeader createSwcMockHeader();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	RteTestRoot createRteTestRoot();

	/**
	 * Returns a new object of class '<em>Ioc Mock Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Mock Source</em>'.
	 * @generated
	 */
	IocMockSource createIocMockSource();

	/**
	 * Returns a new object of class '<em>Swc Mock Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Mock Source</em>'.
	 * @generated
	 */
	SwcMockSource createSwcMockSource();

	/**
	 * Returns a new object of class '<em>Rte Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Test</em>'.
	 * @generated
	 */
	RteTest createRteTest();

	/**
	 * Returns a new object of class '<em>Bswm Mock Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bswm Mock Header</em>'.
	 * @generated
	 */
	BswmMockHeader createBswmMockHeader();

	/**
	 * Returns a new object of class '<em>Bswm Mock Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bswm Mock Source</em>'.
	 * @generated
	 */
	BswmMockSource createBswmMockSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RteTestPackage getRteTestPackage();

} //RteTestFactory
