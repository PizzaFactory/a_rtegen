/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest#getOsStubConstant <em>Os Stub Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest#getComStubConstant <em>Com Stub Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTest()
 * @model
 * @generated
 */
public interface RteTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Os Stub Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Stub Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Stub Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTest_OsStubConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getOsStubConstant();

	/**
	 * Returns the value of the '<em><b>Com Stub Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Stub Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Stub Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTest_ComStubConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getComStubConstant();

} // RteTest
