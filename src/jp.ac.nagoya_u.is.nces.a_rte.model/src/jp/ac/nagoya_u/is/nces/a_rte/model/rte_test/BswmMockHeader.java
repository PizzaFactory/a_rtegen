/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bswm Mock Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getExecutableEntity <em>Executable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getBswmName <em>Bswm Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getBswmMockHeader()
 * @model
 * @generated
 */
public interface BswmMockHeader extends EObject, HeaderFile {
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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getBswmMockHeader_ExecutableEntity()
	 * @model
	 * @generated
	 */
	EList<ExecutableEntity> getExecutableEntity();

	/**
	 * Returns the value of the '<em><b>Bswm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bswm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bswm Name</em>' attribute.
	 * @see #setBswmName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getBswmMockHeader_BswmName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getBswmName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader#getBswmName <em>Bswm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bswm Name</em>' attribute.
	 * @see #getBswmName()
	 * @generated
	 */
	void setBswmName(String value);

} // BswmMockHeader
