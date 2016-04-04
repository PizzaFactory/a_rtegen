/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swc Mock Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getSwcName <em>Swc Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getExecutableEntity <em>Executable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getSwcMockSource()
 * @model
 * @generated
 */
public interface SwcMockSource extends EObject, SourceFile {
	/**
	 * Returns the value of the '<em><b>Swc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc Name</em>' attribute.
	 * @see #setSwcName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getSwcMockSource_SwcName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getSwcName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource#getSwcName <em>Swc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swc Name</em>' attribute.
	 * @see #getSwcName()
	 * @generated
	 */
	void setSwcName(String value);

	/**
	 * Returns the value of the '<em><b>Executable Entity</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Entity</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getSwcMockSource_ExecutableEntity()
	 * @model
	 * @generated
	 */
	EList<ExecutableEntity> getExecutableEntity();

} // SwcMockSource
