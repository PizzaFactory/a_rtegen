/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Com Send Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getRequestProxyIocApi <em>Request Proxy Ioc Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getValueProxyIocApi <em>Value Proxy Ioc Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getProxyFunctionIndexConstantName <em>Proxy Function Index Constant Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getProxyComSendOperation()
 * @model abstract="true"
 * @generated
 */
public interface ProxyComSendOperation extends ComSendOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getProxyComSendOperation_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Request Proxy Ioc Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * プロキシへの要求伝搬用IOC API。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Proxy Ioc Api</em>' reference.
	 * @see #setRequestProxyIocApi(IocSendApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getProxyComSendOperation_RequestProxyIocApi()
	 * @model required="true"
	 * @generated
	 */
	IocSendApi getRequestProxyIocApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getRequestProxyIocApi <em>Request Proxy Ioc Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Proxy Ioc Api</em>' reference.
	 * @see #getRequestProxyIocApi()
	 * @generated
	 */
	void setRequestProxyIocApi(IocSendApi value);

	/**
	 * Returns the value of the '<em><b>Value Proxy Ioc Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * プロキシへの値伝搬用IOC API。
	 * NOTE プリミティブ型の送信処理では使用されないため、nullが設定される。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Proxy Ioc Api</em>' reference.
	 * @see #setValueProxyIocApi(IocSendApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getProxyComSendOperation_ValueProxyIocApi()
	 * @model
	 * @generated
	 */
	IocSendApi getValueProxyIocApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getValueProxyIocApi <em>Value Proxy Ioc Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Proxy Ioc Api</em>' reference.
	 * @see #getValueProxyIocApi()
	 * @generated
	 */
	void setValueProxyIocApi(IocSendApi value);

	/**
	 * Returns the value of the '<em><b>Proxy Function Index Constant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * プロキシ関数の識別インデックス定数名。
	 * NOTE プリミティブ型の送信処理では使用されないため、nullが設定される。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proxy Function Index Constant Name</em>' attribute.
	 * @see #setProxyFunctionIndexConstantName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getProxyComSendOperation_ProxyFunctionIndexConstantName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier"
	 * @generated
	 */
	String getProxyFunctionIndexConstantName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getProxyFunctionIndexConstantName <em>Proxy Function Index Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Function Index Constant Name</em>' attribute.
	 * @see #getProxyFunctionIndexConstantName()
	 * @generated
	 */
	void setProxyFunctionIndexConstantName(String value);

} // ProxyComSendOperation
