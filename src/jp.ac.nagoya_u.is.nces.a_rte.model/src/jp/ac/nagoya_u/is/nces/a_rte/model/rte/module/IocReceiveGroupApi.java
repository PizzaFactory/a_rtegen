/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Receive Group Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi#getComSendSignalSymbolName <em>Com Send Signal Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocReceiveGroupApi()
 * @model
 * @generated
 */
public interface IocReceiveGroupApi extends IocReceiveApi {
	/**
	 * Returns the value of the '<em><b>Com Send Signal Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Symbol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Symbol Name</em>' attribute.
	 * @see #setComSendSignalSymbolName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocReceiveGroupApi_ComSendSignalSymbolName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getComSendSignalSymbolName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi#getComSendSignalSymbolName <em>Com Send Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Symbol Name</em>' attribute.
	 * @see #getComSendSignalSymbolName()
	 * @generated
	 */
	void setComSendSignalSymbolName(String value);

} // IocReceiveGroupApi
