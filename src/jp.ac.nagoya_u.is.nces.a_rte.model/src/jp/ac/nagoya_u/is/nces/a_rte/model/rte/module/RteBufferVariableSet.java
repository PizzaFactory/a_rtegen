/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Buffer Variable Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getValueVariable <em>Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getStatusVariable <em>Status Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getInitValueVariable <em>Init Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getComplexVariable <em>Complex Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferVariableSet()
 * @model
 * @generated
 */
public interface RteBufferVariableSet extends GlobalVariable {
	/**
	 * Returns the value of the '<em><b>Value Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Variable</em>' containment reference.
	 * @see #setValueVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferVariableSet_ValueVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalVariable getValueVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getValueVariable <em>Value Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Variable</em>' containment reference.
	 * @see #getValueVariable()
	 * @generated
	 */
	void setValueVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Status Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Variable</em>' containment reference.
	 * @see #setStatusVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferVariableSet_StatusVariable()
	 * @model containment="true"
	 * @generated
	 */
	GlobalVariable getStatusVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getStatusVariable <em>Status Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Variable</em>' containment reference.
	 * @see #getStatusVariable()
	 * @generated
	 */
	void setStatusVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Init Value Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Value Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value Variable</em>' containment reference.
	 * @see #setInitValueVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferVariableSet_InitValueVariable()
	 * @model containment="true"
	 * @generated
	 */
	GlobalVariable getInitValueVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getInitValueVariable <em>Init Value Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value Variable</em>' containment reference.
	 * @see #getInitValueVariable()
	 * @generated
	 */
	void setInitValueVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Complex Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Variable</em>' containment reference.
	 * @see #setComplexVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferVariableSet_ComplexVariable()
	 * @model containment="true"
	 * @generated
	 */
	GlobalVariable getComplexVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getComplexVariable <em>Complex Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Variable</em>' containment reference.
	 * @see #getComplexVariable()
	 * @generated
	 */
	void setComplexVariable(GlobalVariable value);

} // RteBufferVariableSet
