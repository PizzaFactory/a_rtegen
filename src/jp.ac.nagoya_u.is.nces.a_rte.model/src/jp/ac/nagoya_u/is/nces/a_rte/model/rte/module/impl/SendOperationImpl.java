/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl#getSendValue <em>Send Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl#getSendStatus <em>Send Status</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl#getExcludeOperation <em>Exclude Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl#getReturnVariable <em>Return Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl#getIsWriteApi <em>Is Write Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SendOperationImpl extends OperationImpl implements SendOperation {
	/**
	 * The cached value of the '{@link #getSendValue() <em>Send Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendValue()
	 * @generated
	 * @ordered
	 */
	protected Value sendValue;
	/**
	 * The cached value of the '{@link #getSendStatus() <em>Send Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendStatus()
	 * @generated
	 * @ordered
	 */
	protected Value sendStatus;

	/**
	 * The cached value of the '{@link #getExcludeOperation() <em>Exclude Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeOperation()
	 * @generated
	 * @ordered
	 */
	protected ExcludeOperation excludeOperation;

	/**
	 * The cached value of the '{@link #getReturnVariable() <em>Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable returnVariable;

	/**
	 * The default value of the '{@link #getIsWriteApi() <em>Is Write Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsWriteApi()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_WRITE_API_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIsWriteApi() <em>Is Write Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsWriteApi()
	 * @generated
	 * @ordered
	 */
	protected Boolean isWriteApi = IS_WRITE_API_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getSendValue() {
		if (sendValue != null && ((EObject)sendValue).eIsProxy()) {
			InternalEObject oldSendValue = (InternalEObject)sendValue;
			sendValue = (Value)eResolveProxy(oldSendValue);
			if (sendValue != oldSendValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_OPERATION__SEND_VALUE, oldSendValue, sendValue));
			}
		}
		return sendValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetSendValue() {
		return sendValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendValue(Value newSendValue) {
		Value oldSendValue = sendValue;
		sendValue = newSendValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_OPERATION__SEND_VALUE, oldSendValue, sendValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getSendStatus() {
		if (sendStatus != null && ((EObject)sendStatus).eIsProxy()) {
			InternalEObject oldSendStatus = (InternalEObject)sendStatus;
			sendStatus = (Value)eResolveProxy(oldSendStatus);
			if (sendStatus != oldSendStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_OPERATION__SEND_STATUS, oldSendStatus, sendStatus));
			}
		}
		return sendStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetSendStatus() {
		return sendStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendStatus(Value newSendStatus) {
		Value oldSendStatus = sendStatus;
		sendStatus = newSendStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_OPERATION__SEND_STATUS, oldSendStatus, sendStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeOperation getExcludeOperation() {
		return excludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeOperation(ExcludeOperation newExcludeOperation, NotificationChain msgs) {
		ExcludeOperation oldExcludeOperation = excludeOperation;
		excludeOperation = newExcludeOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION, oldExcludeOperation, newExcludeOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeOperation(ExcludeOperation newExcludeOperation) {
		if (newExcludeOperation != excludeOperation) {
			NotificationChain msgs = null;
			if (excludeOperation != null)
				msgs = ((InternalEObject)excludeOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION, null, msgs);
			if (newExcludeOperation != null)
				msgs = ((InternalEObject)newExcludeOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION, null, msgs);
			msgs = basicSetExcludeOperation(newExcludeOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION, newExcludeOperation, newExcludeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReturnVariable() {
		if (returnVariable != null && ((EObject)returnVariable).eIsProxy()) {
			InternalEObject oldReturnVariable = (InternalEObject)returnVariable;
			returnVariable = (Variable)eResolveProxy(oldReturnVariable);
			if (returnVariable != oldReturnVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_OPERATION__RETURN_VARIABLE, oldReturnVariable, returnVariable));
			}
		}
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReturnVariable() {
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnVariable(Variable newReturnVariable) {
		Variable oldReturnVariable = returnVariable;
		returnVariable = newReturnVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_OPERATION__RETURN_VARIABLE, oldReturnVariable, returnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsWriteApi() {
		return isWriteApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWriteApi(Boolean newIsWriteApi) {
		Boolean oldIsWriteApi = isWriteApi;
		isWriteApi = newIsWriteApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_OPERATION__IS_WRITE_API, oldIsWriteApi, isWriteApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION:
				return basicSetExcludeOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SEND_OPERATION__SEND_VALUE:
				if (resolve) return getSendValue();
				return basicGetSendValue();
			case ModulePackage.SEND_OPERATION__SEND_STATUS:
				if (resolve) return getSendStatus();
				return basicGetSendStatus();
			case ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION:
				return getExcludeOperation();
			case ModulePackage.SEND_OPERATION__RETURN_VARIABLE:
				if (resolve) return getReturnVariable();
				return basicGetReturnVariable();
			case ModulePackage.SEND_OPERATION__IS_WRITE_API:
				return getIsWriteApi();
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
			case ModulePackage.SEND_OPERATION__SEND_VALUE:
				setSendValue((Value)newValue);
				return;
			case ModulePackage.SEND_OPERATION__SEND_STATUS:
				setSendStatus((Value)newValue);
				return;
			case ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION:
				setExcludeOperation((ExcludeOperation)newValue);
				return;
			case ModulePackage.SEND_OPERATION__RETURN_VARIABLE:
				setReturnVariable((Variable)newValue);
				return;
			case ModulePackage.SEND_OPERATION__IS_WRITE_API:
				setIsWriteApi((Boolean)newValue);
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
			case ModulePackage.SEND_OPERATION__SEND_VALUE:
				setSendValue((Value)null);
				return;
			case ModulePackage.SEND_OPERATION__SEND_STATUS:
				setSendStatus((Value)null);
				return;
			case ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION:
				setExcludeOperation((ExcludeOperation)null);
				return;
			case ModulePackage.SEND_OPERATION__RETURN_VARIABLE:
				setReturnVariable((Variable)null);
				return;
			case ModulePackage.SEND_OPERATION__IS_WRITE_API:
				setIsWriteApi(IS_WRITE_API_EDEFAULT);
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
			case ModulePackage.SEND_OPERATION__SEND_VALUE:
				return sendValue != null;
			case ModulePackage.SEND_OPERATION__SEND_STATUS:
				return sendStatus != null;
			case ModulePackage.SEND_OPERATION__EXCLUDE_OPERATION:
				return excludeOperation != null;
			case ModulePackage.SEND_OPERATION__RETURN_VARIABLE:
				return returnVariable != null;
			case ModulePackage.SEND_OPERATION__IS_WRITE_API:
				return IS_WRITE_API_EDEFAULT == null ? isWriteApi != null : !IS_WRITE_API_EDEFAULT.equals(isWriteApi);
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
		result.append(" (isWriteApi: "); //$NON-NLS-1$
		result.append(isWriteApi);
		result.append(')');
		return result.toString();
	}

} //SendOperationImpl
