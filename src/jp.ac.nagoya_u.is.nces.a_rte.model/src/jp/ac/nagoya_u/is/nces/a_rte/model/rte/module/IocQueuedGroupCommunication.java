/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Queued Group Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getReceiveApi <em>Receive Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getSendApi <em>Send Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedGroupCommunication()
 * @model
 * @generated
 */
public interface IocQueuedGroupCommunication extends IocCommunication {
	/**
	 * Returns the value of the '<em><b>Receive Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Api</em>' containment reference.
	 * @see #setReceiveApi(IocReceiveGroupApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedGroupCommunication_ReceiveApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocReceiveGroupApi getReceiveApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getReceiveApi <em>Receive Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Api</em>' containment reference.
	 * @see #getReceiveApi()
	 * @generated
	 */
	void setReceiveApi(IocReceiveGroupApi value);

	/**
	 * Returns the value of the '<em><b>Send Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Api</em>' containment reference.
	 * @see #setSendApi(IocSendGroupApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedGroupCommunication_SendApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocSendGroupApi getSendApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getSendApi <em>Send Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Api</em>' containment reference.
	 * @see #getSendApi()
	 * @generated
	 */
	void setSendApi(IocSendGroupApi value);

} // IocQueuedGroupCommunication
