/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getInvalidValueConstant <em>Invalid Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadValueVariable <em>Read Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadStatusVariable <em>Read Status Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getExcludeOperation <em>Exclude Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getReadOperation()
 * @model abstract="true"
 * @generated
 */
public interface ReadOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Value Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Value Constant</em>' reference.
	 * @see #setInvalidValueConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getReadOperation_InvalidValueConstant()
	 * @model
	 * @generated
	 */
	Constant getInvalidValueConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getInvalidValueConstant <em>Invalid Value Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Value Constant</em>' reference.
	 * @see #getInvalidValueConstant()
	 * @generated
	 */
	void setInvalidValueConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Value Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Value Variable</em>' reference.
	 * @see #setReadValueVariable(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getReadOperation_ReadValueVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getReadValueVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadValueVariable <em>Read Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Value Variable</em>' reference.
	 * @see #getReadValueVariable()
	 * @generated
	 */
	void setReadValueVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Status Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Status Variable</em>' reference.
	 * @see #setReadStatusVariable(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getReadOperation_ReadStatusVariable()
	 * @model
	 * @generated
	 */
	Variable getReadStatusVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadStatusVariable <em>Read Status Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Status Variable</em>' reference.
	 * @see #getReadStatusVariable()
	 * @generated
	 */
	void setReadStatusVariable(Variable value);

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getReadOperation_ExcludeOperation()
	 * @model containment="true"
	 * @generated
	 */
	ExcludeOperation getExcludeOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getExcludeOperation <em>Exclude Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Operation</em>' containment reference.
	 * @see #getExcludeOperation()
	 * @generated
	 */
	void setExcludeOperation(ExcludeOperation value);

} // ReadOperation
