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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function Rte Buffer Invalidate Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferInvalidateSendOperationImpl#getAccessTrustedFunction <em>Access Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferInvalidateSendOperationImpl#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionRteBufferInvalidateSendOperationImpl extends SendOperationImpl implements TrustedFunctionRteBufferInvalidateSendOperation {
	/**
	 * The cached value of the '{@link #getAccessTrustedFunction() <em>Access Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected RteBufferInvalidateTrustedFunction accessTrustedFunction;

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
	protected TrustedFunctionRteBufferInvalidateSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferInvalidateTrustedFunction getAccessTrustedFunction() {
		if (accessTrustedFunction != null && ((EObject)accessTrustedFunction).eIsProxy()) {
			InternalEObject oldAccessTrustedFunction = (InternalEObject)accessTrustedFunction;
			accessTrustedFunction = (RteBufferInvalidateTrustedFunction)eResolveProxy(oldAccessTrustedFunction);
			if (accessTrustedFunction != oldAccessTrustedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION, oldAccessTrustedFunction, accessTrustedFunction));
			}
		}
		return accessTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferInvalidateTrustedFunction basicGetAccessTrustedFunction() {
		return accessTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTrustedFunction(RteBufferInvalidateTrustedFunction newAccessTrustedFunction) {
		RteBufferInvalidateTrustedFunction oldAccessTrustedFunction = accessTrustedFunction;
		accessTrustedFunction = newAccessTrustedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION, oldAccessTrustedFunction, accessTrustedFunction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				if (resolve) return getAccessTrustedFunction();
				return basicGetAccessTrustedFunction();
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE:
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				setAccessTrustedFunction((RteBufferInvalidateTrustedFunction)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE:
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				setAccessTrustedFunction((RteBufferInvalidateTrustedFunction)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE:
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				return accessTrustedFunction != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE:
				return tempReturnVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //TrustedFunctionRteBufferInvalidateSendOperationImpl
