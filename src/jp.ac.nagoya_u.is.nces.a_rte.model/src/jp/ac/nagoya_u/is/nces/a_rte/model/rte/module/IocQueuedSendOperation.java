/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Queued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation#getAccessApi <em>Access Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedSendOperation()
 * @model
 * @generated
 */
public interface IocQueuedSendOperation extends IocSendOperation {
	/**
	 * Returns the value of the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Api</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Api</em>' reference.
	 * @see #setAccessApi(IocSendApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedSendOperation_AccessApi()
	 * @model required="true"
	 * @generated
	 */
	IocSendApi getAccessApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation#getAccessApi <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Api</em>' reference.
	 * @see #getAccessApi()
	 * @generated
	 */
	void setAccessApi(IocSendApi value);

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedSendOperation_TempReturnVariable()
	 * @model
	 * @generated
	 */
	Variable getTempReturnVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation#getTempReturnVariable <em>Temp Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Return Variable</em>' reference.
	 * @see #getTempReturnVariable()
	 * @generated
	 */
	void setTempReturnVariable(Variable value);

} // IocQueuedSendOperation
