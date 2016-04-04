/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTestModule <em>Rte Test Module</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTest <em>Rte Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestRoot()
 * @model
 * @generated
 */
public interface RteTestRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Rte Test Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Test Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Test Module</em>' containment reference.
	 * @see #setRteTestModule(RteTestModule)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestRoot_RteTestModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteTestModule getRteTestModule();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTestModule <em>Rte Test Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Test Module</em>' containment reference.
	 * @see #getRteTestModule()
	 * @generated
	 */
	void setRteTestModule(RteTestModule value);

	/**
	 * Returns the value of the '<em><b>Rte Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Test</em>' containment reference.
	 * @see #setRteTest(RteTest)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestRoot_RteTest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteTest getRteTest();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTest <em>Rte Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Test</em>' containment reference.
	 * @see #getRteTest()
	 * @generated
	 */
	void setRteTest(RteTest value);

} // RteTestRoot
