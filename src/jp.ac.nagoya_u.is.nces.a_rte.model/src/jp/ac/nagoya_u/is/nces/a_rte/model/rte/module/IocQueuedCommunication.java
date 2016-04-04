/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Queued Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getSendApi <em>Send Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getReceiveApi <em>Receive Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getIocEmptyQueueApi <em>Ioc Empty Queue Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedCommunication()
 * @model
 * @generated
 */
public interface IocQueuedCommunication extends IocCommunication {
	/**
	 * Returns the value of the '<em><b>Send Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedCommunication_SendApi()
	 * @model containment="true"
	 * @generated
	 */
	EList<IocSendApi> getSendApi();

	/**
	 * Returns the value of the '<em><b>Receive Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Api</em>' containment reference.
	 * @see #setReceiveApi(IocReceiveApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedCommunication_ReceiveApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocReceiveApi getReceiveApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getReceiveApi <em>Receive Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Api</em>' containment reference.
	 * @see #getReceiveApi()
	 * @generated
	 */
	void setReceiveApi(IocReceiveApi value);

	/**
	 * Returns the value of the '<em><b>Ioc Empty Queue Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Empty Queue Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Empty Queue Api</em>' containment reference.
	 * @see #setIocEmptyQueueApi(IocEmptyQueueApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocQueuedCommunication_IocEmptyQueueApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocEmptyQueueApi getIocEmptyQueueApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getIocEmptyQueueApi <em>Ioc Empty Queue Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ioc Empty Queue Api</em>' containment reference.
	 * @see #getIocEmptyQueueApi()
	 * @generated
	 */
	void setIocEmptyQueueApi(IocEmptyQueueApi value);

} // IocQueuedCommunication
