/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Nonqueued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedSendOperationImpl#getAccessApi <em>Access Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocNonqueuedSendOperationImpl extends IocSendOperationImpl implements IocNonqueuedSendOperation {
	/**
	 * The cached value of the '{@link #getAccessApi() <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessApi()
	 * @generated
	 * @ordered
	 */
	protected IocWriteApi accessApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocNonqueuedSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_NONQUEUED_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocWriteApi getAccessApi() {
		if (accessApi != null && ((EObject)accessApi).eIsProxy()) {
			InternalEObject oldAccessApi = (InternalEObject)accessApi;
			accessApi = (IocWriteApi)eResolveProxy(oldAccessApi);
			if (accessApi != oldAccessApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.IOC_NONQUEUED_SEND_OPERATION__ACCESS_API, oldAccessApi, accessApi));
			}
		}
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocWriteApi basicGetAccessApi() {
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessApi(IocWriteApi newAccessApi) {
		IocWriteApi oldAccessApi = accessApi;
		accessApi = newAccessApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_NONQUEUED_SEND_OPERATION__ACCESS_API, oldAccessApi, accessApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.IOC_NONQUEUED_SEND_OPERATION__ACCESS_API:
				if (resolve) return getAccessApi();
				return basicGetAccessApi();
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
			case ModulePackage.IOC_NONQUEUED_SEND_OPERATION__ACCESS_API:
				setAccessApi((IocWriteApi)newValue);
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
			case ModulePackage.IOC_NONQUEUED_SEND_OPERATION__ACCESS_API:
				setAccessApi((IocWriteApi)null);
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
			case ModulePackage.IOC_NONQUEUED_SEND_OPERATION__ACCESS_API:
				return accessApi != null;
		}
		return super.eIsSet(featureID);
	}

} //IocNonqueuedSendOperationImpl
