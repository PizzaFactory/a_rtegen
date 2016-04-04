/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Initialize Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getInitVariable <em>Init Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getExcludeOperation <em>Exclude Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariableInitializeOperation()
 * @model
 * @generated
 */
public interface VariableInitializeOperation extends InitializeOperation {
	/**
	 * Returns the value of the '<em><b>Init Variable</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Variable</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariableInitializeOperation_InitVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getInitVariable();

	/**
	 * Returns the value of the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Operation</em>' containment reference.
	 * @see #setExcludeOperation(ExcludeOperation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariableInitializeOperation_ExcludeOperation()
	 * @model containment="true"
	 * @generated
	 */
	ExcludeOperation getExcludeOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getExcludeOperation <em>Exclude Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Operation</em>' containment reference.
	 * @see #getExcludeOperation()
	 * @generated
	 */
	void setExcludeOperation(ExcludeOperation value);

} // VariableInitializeOperation
