/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl#getAccessApi <em>Access Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl#getTAckStatus <em>TAck Status</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl#getActivationFlagOnTxErr <em>Activation Flag On Tx Err</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComSendOperationImpl extends SendOperationImpl implements ComSendOperation {
	/**
	 * The cached value of the '{@link #getAccessApi() <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessApi()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalApi accessApi;

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
	 * The cached value of the '{@link #getTAckStatus() <em>TAck Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAckStatus()
	 * @generated
	 * @ordered
	 */
	protected TAckStatus tAckStatus;

	/**
	 * The cached value of the '{@link #getActivationFlagOnTxErr() <em>Activation Flag On Tx Err</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFlagOnTxErr()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> activationFlagOnTxErr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalApi getAccessApi() {
		if (accessApi != null && ((EObject)accessApi).eIsProxy()) {
			InternalEObject oldAccessApi = (InternalEObject)accessApi;
			accessApi = (ComSendSignalApi)eResolveProxy(oldAccessApi);
			if (accessApi != oldAccessApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_SEND_OPERATION__ACCESS_API, oldAccessApi, accessApi));
			}
		}
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalApi basicGetAccessApi() {
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessApi(ComSendSignalApi newAccessApi) {
		ComSendSignalApi oldAccessApi = accessApi;
		accessApi = newAccessApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_OPERATION__ACCESS_API, oldAccessApi, accessApi));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_SEND_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus getTAckStatus() {
		if (tAckStatus != null && ((EObject)tAckStatus).eIsProxy()) {
			InternalEObject oldTAckStatus = (InternalEObject)tAckStatus;
			tAckStatus = (TAckStatus)eResolveProxy(oldTAckStatus);
			if (tAckStatus != oldTAckStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_SEND_OPERATION__TACK_STATUS, oldTAckStatus, tAckStatus));
			}
		}
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus basicGetTAckStatus() {
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTAckStatus(TAckStatus newTAckStatus) {
		TAckStatus oldTAckStatus = tAckStatus;
		tAckStatus = newTAckStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_OPERATION__TACK_STATUS, oldTAckStatus, tAckStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getActivationFlagOnTxErr() {
		if (activationFlagOnTxErr == null) {
			activationFlagOnTxErr = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.COM_SEND_OPERATION__ACTIVATION_FLAG_ON_TX_ERR);
		}
		return activationFlagOnTxErr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SEND_OPERATION__ACCESS_API:
				if (resolve) return getAccessApi();
				return basicGetAccessApi();
			case ModulePackage.COM_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				if (resolve) return getTempReturnVariable();
				return basicGetTempReturnVariable();
			case ModulePackage.COM_SEND_OPERATION__TACK_STATUS:
				if (resolve) return getTAckStatus();
				return basicGetTAckStatus();
			case ModulePackage.COM_SEND_OPERATION__ACTIVATION_FLAG_ON_TX_ERR:
				return getActivationFlagOnTxErr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.COM_SEND_OPERATION__ACCESS_API:
				setAccessApi((ComSendSignalApi)newValue);
				return;
			case ModulePackage.COM_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)newValue);
				return;
			case ModulePackage.COM_SEND_OPERATION__TACK_STATUS:
				setTAckStatus((TAckStatus)newValue);
				return;
			case ModulePackage.COM_SEND_OPERATION__ACTIVATION_FLAG_ON_TX_ERR:
				getActivationFlagOnTxErr().clear();
				getActivationFlagOnTxErr().addAll((Collection<? extends LocalVariable>)newValue);
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
			case ModulePackage.COM_SEND_OPERATION__ACCESS_API:
				setAccessApi((ComSendSignalApi)null);
				return;
			case ModulePackage.COM_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)null);
				return;
			case ModulePackage.COM_SEND_OPERATION__TACK_STATUS:
				setTAckStatus((TAckStatus)null);
				return;
			case ModulePackage.COM_SEND_OPERATION__ACTIVATION_FLAG_ON_TX_ERR:
				getActivationFlagOnTxErr().clear();
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
			case ModulePackage.COM_SEND_OPERATION__ACCESS_API:
				return accessApi != null;
			case ModulePackage.COM_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				return tempReturnVariable != null;
			case ModulePackage.COM_SEND_OPERATION__TACK_STATUS:
				return tAckStatus != null;
			case ModulePackage.COM_SEND_OPERATION__ACTIVATION_FLAG_ON_TX_ERR:
				return activationFlagOnTxErr != null && !activationFlagOnTxErr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComSendOperationImpl
