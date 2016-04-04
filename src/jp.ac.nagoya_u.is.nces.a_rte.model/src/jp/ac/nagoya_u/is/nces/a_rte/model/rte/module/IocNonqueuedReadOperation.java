/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Nonqueued Read Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation#getAccessApi <em>Access Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedReadOperation()
 * @model
 * @generated
 */
public interface IocNonqueuedReadOperation extends ReadOperation {
	/**
	 * Returns the value of the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Api</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Api</em>' reference.
	 * @see #setAccessApi(IocReadApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedReadOperation_AccessApi()
	 * @model required="true"
	 * @generated
	 */
	IocReadApi getAccessApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation#getAccessApi <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Api</em>' reference.
	 * @see #getAccessApi()
	 * @generated
	 */
	void setAccessApi(IocReadApi value);

} // IocNonqueuedReadOperation
