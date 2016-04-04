/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irv Write Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation#getAccessVariable <em>Access Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation#getWriteValueVariable <em>Write Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation#getExcludeOperation <em>Exclude Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvWriteOperation()
 * @model
 * @generated
 */
public interface IrvWriteOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Access Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Variable</em>' reference.
	 * @see #setAccessVariable(RteBufferVariableSet)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvWriteOperation_AccessVariable()
	 * @model required="true"
	 * @generated
	 */
	RteBufferVariableSet getAccessVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation#getAccessVariable <em>Access Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Variable</em>' reference.
	 * @see #getAccessVariable()
	 * @generated
	 */
	void setAccessVariable(RteBufferVariableSet value);

	/**
	 * Returns the value of the '<em><b>Write Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Value Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Value Variable</em>' reference.
	 * @see #setWriteValueVariable(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvWriteOperation_WriteValueVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getWriteValueVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation#getWriteValueVariable <em>Write Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Value Variable</em>' reference.
	 * @see #getWriteValueVariable()
	 * @generated
	 */
	void setWriteValueVariable(Variable value);

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvWriteOperation_ExcludeOperation()
	 * @model containment="true"
	 * @generated
	 */
	ExcludeOperation getExcludeOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation#getExcludeOperation <em>Exclude Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Operation</em>' containment reference.
	 * @see #getExcludeOperation()
	 * @generated
	 */
	void setExcludeOperation(ExcludeOperation value);

} // IrvWriteOperation
