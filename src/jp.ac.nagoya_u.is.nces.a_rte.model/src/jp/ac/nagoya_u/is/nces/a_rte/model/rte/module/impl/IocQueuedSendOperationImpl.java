/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Queued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedSendOperationImpl#getAccessApi <em>Access Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedSendOperationImpl#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocQueuedSendOperationImpl extends IocSendOperationImpl implements IocQueuedSendOperation {
	/**
	 * The cached value of the '{@link #getAccessApi() <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessApi()
	 * @generated
	 * @ordered
	 */
	protected IocSendApi accessApi;

	/**
	 * The cached value of the '{@link #getTempReturnVariable() <em>Temp Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempReturnVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable tempReturnVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocQueuedSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_QUEUED_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi getAccessApi() {
		if (accessApi != null && ((EObject)accessApi).eIsProxy()) {
			InternalEObject oldAccessApi = (InternalEObject)accessApi;
			accessApi = (IocSendApi)eResolveProxy(oldAccessApi);
			if (accessApi != oldAccessApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.IOC_QUEUED_SEND_OPERATION__ACCESS_API, oldAccessApi, accessApi));
			}
		}
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendApi basicGetAccessApi() {
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessApi(IocSendApi newAccessApi) {
		IocSendApi oldAccessApi = accessApi;
		accessApi = newAccessApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_SEND_OPERATION__ACCESS_API, oldAccessApi, accessApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTempReturnVariable() {
		if (tempReturnVariable != null && ((EObject)tempReturnVariable).eIsProxy()) {
			InternalEObject oldTempReturnVariable = (InternalEObject)tempReturnVariable;
			tempReturnVariable = (Variable)eResolveProxy(oldTempReturnVariable);
			if (tempReturnVariable != oldTempReturnVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
			}
		}
		return tempReturnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTempReturnVariable() {
		return tempReturnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempReturnVariable(Variable newTempReturnVariable) {
		Variable oldTempReturnVariable = tempReturnVariable;
		tempReturnVariable = newTempReturnVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__ACCESS_API:
				if (resolve) return getAccessApi();
				return basicGetAccessApi();
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				if (resolve) return getTempReturnVariable();
				return basicGetTempReturnVariable();
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
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__ACCESS_API:
				setAccessApi((IocSendApi)newValue);
				return;
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)newValue);
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
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__ACCESS_API:
				setAccessApi((IocSendApi)null);
				return;
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)null);
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
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__ACCESS_API:
				return accessApi != null;
			case ModulePackage.IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				return tempReturnVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //IocQueuedSendOperationImpl
