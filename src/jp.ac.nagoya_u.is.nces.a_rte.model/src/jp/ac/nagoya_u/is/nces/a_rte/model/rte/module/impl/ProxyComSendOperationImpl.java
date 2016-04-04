/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Com Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl#getRequestProxyIocApi <em>Request Proxy Ioc Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl#getValueProxyIocApi <em>Value Proxy Ioc Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl#getProxyFunctionIndexConstantName <em>Proxy Function Index Constant Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProxyComSendOperationImpl extends ComSendOperationImpl implements ProxyComSendOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getRequestProxyIocApi() <em>Request Proxy Ioc Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProxyIocApi()
	 * @generated
	 * @ordered
	 */
	protected IocSendApi requestProxyIocApi;

	/**
	 * The cached value of the '{@link #getValueProxyIocApi() <em>Value Proxy Ioc Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueProxyIocApi()
	 * @generated
	 * @ordered
	 */
	protected IocSendApi valueProxyIocApi;

	/**
	 * The default value of the '{@link #getProxyFunctionIndexConstantName() <em>Proxy Function Index Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyFunctionIndexConstantName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_FUNCTION_INDEX_CONSTANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyFunctionIndexConstantName() <em>Proxy Function Index Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyFunctionIndexConstantName()
	 * @generated
	 * @ordered
	 */
	protected String proxyFunctionIndexConstantName = PROXY_FUNCTION_INDEX_CONSTANT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyComSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PROXY_COM_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && ((EObject)type).eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PROXY_COM_SEND_OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PROXY_COM_SEND_OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi getRequestProxyIocApi() {
		if (requestProxyIocApi != null && ((EObject)requestProxyIocApi).eIsProxy()) {
			InternalEObject oldRequestProxyIocApi = (InternalEObject)requestProxyIocApi;
			requestProxyIocApi = (IocSendApi)eResolveProxy(oldRequestProxyIocApi);
			if (requestProxyIocApi != oldRequestProxyIocApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API, oldRequestProxyIocApi, requestProxyIocApi));
			}
		}
		return requestProxyIocApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi basicGetRequestProxyIocApi() {
		return requestProxyIocApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProxyIocApi(IocSendApi newRequestProxyIocApi) {
		IocSendApi oldRequestProxyIocApi = requestProxyIocApi;
		requestProxyIocApi = newRequestProxyIocApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API, oldRequestProxyIocApi, requestProxyIocApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi getValueProxyIocApi() {
		if (valueProxyIocApi != null && ((EObject)valueProxyIocApi).eIsProxy()) {
			InternalEObject oldValueProxyIocApi = (InternalEObject)valueProxyIocApi;
			valueProxyIocApi = (IocSendApi)eResolveProxy(oldValueProxyIocApi);
			if (valueProxyIocApi != oldValueProxyIocApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API, oldValueProxyIocApi, valueProxyIocApi));
			}
		}
		return valueProxyIocApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi basicGetValueProxyIocApi() {
		return valueProxyIocApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueProxyIocApi(IocSendApi newValueProxyIocApi) {
		IocSendApi oldValueProxyIocApi = valueProxyIocApi;
		valueProxyIocApi = newValueProxyIocApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API, oldValueProxyIocApi, valueProxyIocApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxyFunctionIndexConstantName() {
		return proxyFunctionIndexConstantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyFunctionIndexConstantName(String newProxyFunctionIndexConstantName) {
		String oldProxyFunctionIndexConstantName = proxyFunctionIndexConstantName;
		proxyFunctionIndexConstantName = newProxyFunctionIndexConstantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PROXY_COM_SEND_OPERATION__PROXY_FUNCTION_INDEX_CONSTANT_NAME, oldProxyFunctionIndexConstantName, proxyFunctionIndexConstantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.PROXY_COM_SEND_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModulePackage.PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API:
				if (resolve) return getRequestProxyIocApi();
				return basicGetRequestProxyIocApi();
			case ModulePackage.PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API:
				if (resolve) return getValueProxyIocApi();
				return basicGetValueProxyIocApi();
			case ModulePackage.PROXY_COM_SEND_OPERATION__PROXY_FUNCTION_INDEX_CONSTANT_NAME:
				return getProxyFunctionIndexConstantName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.PROXY_COM_SEND_OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case ModulePackage.PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API:
				setRequestProxyIocApi((IocSendApi)newValue);
				return;
			case ModulePackage.PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API:
				setValueProxyIocApi((IocSendApi)newValue);
				return;
			case ModulePackage.PROXY_COM_SEND_OPERATION__PROXY_FUNCTION_INDEX_CONSTANT_NAME:
				setProxyFunctionIndexConstantName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModulePackage.PROXY_COM_SEND_OPERATION__TYPE:
				setType((Type)null);
				return;
			case ModulePackage.PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API:
				setRequestProxyIocApi((IocSendApi)null);
				return;
			case ModulePackage.PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API:
				setValueProxyIocApi((IocSendApi)null);
				return;
			case ModulePackage.PROXY_COM_SEND_OPERATION__PROXY_FUNCTION_INDEX_CONSTANT_NAME:
				setProxyFunctionIndexConstantName(PROXY_FUNCTION_INDEX_CONSTANT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModulePackage.PROXY_COM_SEND_OPERATION__TYPE:
				return type != null;
			case ModulePackage.PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API:
				return requestProxyIocApi != null;
			case ModulePackage.PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API:
				return valueProxyIocApi != null;
			case ModulePackage.PROXY_COM_SEND_OPERATION__PROXY_FUNCTION_INDEX_CONSTANT_NAME:
				return PROXY_FUNCTION_INDEX_CONSTANT_NAME_EDEFAULT == null ? proxyFunctionIndexConstantName != null : !PROXY_FUNCTION_INDEX_CONSTANT_NAME_EDEFAULT.equals(proxyFunctionIndexConstantName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (proxyFunctionIndexConstantName: "); //$NON-NLS-1$
		result.append(proxyFunctionIndexConstantName);
		result.append(')');
		return result.toString();
	}

} //ProxyComSendOperationImpl
