/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Nonqueued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation#getAccessApi <em>Access Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedSendOperation()
 * @model
 * @generated
 */
public interface IocNonqueuedSendOperation extends IocSendOperation {
	/**
	 * Returns the value of the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Api</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Api</em>' reference.
	 * @see #setAccessApi(IocWriteApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedSendOperation_AccessApi()
	 * @model required="true"
	 * @generated
	 */
	IocWriteApi getAccessApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation#getAccessApi <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Api</em>' reference.
	 * @see #getAccessApi()
	 * @generated
	 */
	void setAccessApi(IocWriteApi value);

} // IocNonqueuedSendOperation
