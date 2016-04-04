/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getOsStubHeader <em>Os Stub Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getComStubHeader <em>Com Stub Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockHeader <em>Ioc Mock Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getSwcMockHeader <em>Swc Mock Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getSwcMockSource <em>Swc Mock Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockSource <em>Ioc Mock Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getBswmMockHeader <em>Bswm Mock Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getBswmMockSource <em>Bswm Mock Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule()
 * @model
 * @generated
 */
public interface RteTestModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Os Stub Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Stub Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Stub Header</em>' containment reference.
	 * @see #setOsStubHeader(OsStubHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_OsStubHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OsStubHeader getOsStubHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getOsStubHeader <em>Os Stub Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Stub Header</em>' containment reference.
	 * @see #getOsStubHeader()
	 * @generated
	 */
	void setOsStubHeader(OsStubHeader value);

	/**
	 * Returns the value of the '<em><b>Com Stub Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Stub Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Stub Header</em>' containment reference.
	 * @see #setComStubHeader(ComStubHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_ComStubHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComStubHeader getComStubHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getComStubHeader <em>Com Stub Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Stub Header</em>' containment reference.
	 * @see #getComStubHeader()
	 * @generated
	 */
	void setComStubHeader(ComStubHeader value);

	/**
	 * Returns the value of the '<em><b>Ioc Mock Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Mock Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Mock Header</em>' containment reference.
	 * @see #setIocMockHeader(IocMockHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_IocMockHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocMockHeader getIocMockHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockHeader <em>Ioc Mock Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ioc Mock Header</em>' containment reference.
	 * @see #getIocMockHeader()
	 * @generated
	 */
	void setIocMockHeader(IocMockHeader value);

	/**
	 * Returns the value of the '<em><b>Swc Mock Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc Mock Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc Mock Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_SwcMockHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwcMockHeader> getSwcMockHeader();

	/**
	 * Returns the value of the '<em><b>Swc Mock Source</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc Mock Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc Mock Source</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_SwcMockSource()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwcMockSource> getSwcMockSource();

	/**
	 * Returns the value of the '<em><b>Ioc Mock Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Mock Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Mock Source</em>' containment reference.
	 * @see #setIocMockSource(IocMockSource)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_IocMockSource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocMockSource getIocMockSource();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule#getIocMockSource <em>Ioc Mock Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ioc Mock Source</em>' containment reference.
	 * @see #getIocMockSource()
	 * @generated
	 */
	void setIocMockSource(IocMockSource value);

	/**
	 * Returns the value of the '<em><b>Bswm Mock Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bswm Mock Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bswm Mock Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_BswmMockHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswmMockHeader> getBswmMockHeader();

	/**
	 * Returns the value of the '<em><b>Bswm Mock Source</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bswm Mock Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bswm Mock Source</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestModule_BswmMockSource()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswmMockSource> getBswmMockSource();

} // RteTestModule
