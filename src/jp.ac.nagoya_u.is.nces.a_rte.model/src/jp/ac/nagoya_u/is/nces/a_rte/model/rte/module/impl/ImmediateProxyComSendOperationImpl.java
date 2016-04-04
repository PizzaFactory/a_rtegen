/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Proxy Com Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ImmediateProxyComSendOperationImpl#getActivationApi <em>Activation Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmediateProxyComSendOperationImpl extends ProxyComSendOperationImpl implements ImmediateProxyComSendOperation {
	/**
	 * The cached value of the '{@link #getActivationApi() <em>Activation Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationApi()
	 * @generated
	 * @ordered
	 */
	protected OsSetEventApi activationApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateProxyComSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IMMEDIATE_PROXY_COM_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSetEventApi getActivationApi() {
		if (activationApi != null && ((EObject)activationApi).eIsProxy()) {
			InternalEObject oldActivationApi = (InternalEObject)activationApi;
			activationApi = (OsSetEventApi)eResolveProxy(oldActivationApi);
			if (activationApi != oldActivationApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API, oldActivationApi, activationApi));
			}
		}
		return activationApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSetEventApi basicGetActivationApi() {
		return activationApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationApi(OsSetEventApi newActivationApi) {
		OsSetEventApi oldActivationApi = activationApi;
		activationApi = newActivationApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API, oldActivationApi, activationApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API:
				if (resolve) return getActivationApi();
				return basicGetActivationApi();
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
			case ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API:
				setActivationApi((OsSetEventApi)newValue);
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
			case ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API:
				setActivationApi((OsSetEventApi)null);
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
			case ModulePackage.IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API:
				return activationApi != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmediateProxyComSendOperationImpl
