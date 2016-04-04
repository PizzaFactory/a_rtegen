/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Queued Read Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation#getAccessApi <em>Access Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedReadOperation()
 * @model
 * @generated
 */
public interface IocQueuedReadOperation extends ReadOperation {
	/**
	 * Returns the value of the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Api</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Api</em>' reference.
	 * @see #setAccessApi(IocReceiveApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedReadOperation_AccessApi()
	 * @model required="true"
	 * @generated
	 */
	IocReceiveApi getAccessApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation#getAccessApi <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Api</em>' reference.
	 * @see #getAccessApi()
	 * @generated
	 */
	void setAccessApi(IocReceiveApi value);

	/**
	 * Returns the value of the '<em><b>Temp Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Return Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Return Variable</em>' reference.
	 * @see #setTempReturnVariable(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedReadOperation_TempReturnVariable()
	 * @model
	 * @generated
	 */
	Variable getTempReturnVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation#getTempReturnVariable <em>Temp Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Return Variable</em>' reference.
	 * @see #getTempReturnVariable()
	 * @generated
	 */
	void setTempReturnVariable(Variable value);

} // IocQueuedReadOperation
