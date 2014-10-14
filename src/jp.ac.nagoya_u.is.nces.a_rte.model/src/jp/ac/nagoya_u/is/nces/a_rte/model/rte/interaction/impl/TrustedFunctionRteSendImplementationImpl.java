/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function Rte Send Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionRteSendImplementationImpl#getWriteOsTrustedFunction <em>Write Os Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TrustedFunctionRteSendImplementationImpl#getInvalidateOsTrustedFunction <em>Invalidate Os Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionRteSendImplementationImpl extends SendImplementationImpl implements TrustedFunctionRteSendImplementation {
	/**
	 * The cached value of the '{@link #getWriteOsTrustedFunction() <em>Write Os Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteOsTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected OsApplicationTrustedFunction writeOsTrustedFunction;
	/**
	 * The cached value of the '{@link #getInvalidateOsTrustedFunction() <em>Invalidate Os Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidateOsTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected OsApplicationTrustedFunction invalidateOsTrustedFunction;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionRteSendImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplicationTrustedFunction getWriteOsTrustedFunction() {
		if (writeOsTrustedFunction != null && ((EObject)writeOsTrustedFunction).eIsProxy()) {
			InternalEObject oldWriteOsTrustedFunction = (InternalEObject)writeOsTrustedFunction;
			writeOsTrustedFunction = (OsApplicationTrustedFunction)eResolveProxy(oldWriteOsTrustedFunction);
			if (writeOsTrustedFunction != oldWriteOsTrustedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION, oldWriteOsTrustedFunction, writeOsTrustedFunction));
			}
		}
		return writeOsTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplicationTrustedFunction basicGetWriteOsTrustedFunction() {
		return writeOsTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteOsTrustedFunction(OsApplicationTrustedFunction newWriteOsTrustedFunction) {
		OsApplicationTrustedFunction oldWriteOsTrustedFunction = writeOsTrustedFunction;
		writeOsTrustedFunction = newWriteOsTrustedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION, oldWriteOsTrustedFunction, writeOsTrustedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplicationTrustedFunction getInvalidateOsTrustedFunction() {
		if (invalidateOsTrustedFunction != null && ((EObject)invalidateOsTrustedFunction).eIsProxy()) {
			InternalEObject oldInvalidateOsTrustedFunction = (InternalEObject)invalidateOsTrustedFunction;
			invalidateOsTrustedFunction = (OsApplicationTrustedFunction)eResolveProxy(oldInvalidateOsTrustedFunction);
			if (invalidateOsTrustedFunction != oldInvalidateOsTrustedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION, oldInvalidateOsTrustedFunction, invalidateOsTrustedFunction));
			}
		}
		return invalidateOsTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplicationTrustedFunction basicGetInvalidateOsTrustedFunction() {
		return invalidateOsTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidateOsTrustedFunction(OsApplicationTrustedFunction newInvalidateOsTrustedFunction) {
		OsApplicationTrustedFunction oldInvalidateOsTrustedFunction = invalidateOsTrustedFunction;
		invalidateOsTrustedFunction = newInvalidateOsTrustedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION, oldInvalidateOsTrustedFunction, invalidateOsTrustedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION:
				if (resolve) return getWriteOsTrustedFunction();
				return basicGetWriteOsTrustedFunction();
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION:
				if (resolve) return getInvalidateOsTrustedFunction();
				return basicGetInvalidateOsTrustedFunction();
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
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION:
				setWriteOsTrustedFunction((OsApplicationTrustedFunction)newValue);
				return;
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION:
				setInvalidateOsTrustedFunction((OsApplicationTrustedFunction)newValue);
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
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION:
				setWriteOsTrustedFunction((OsApplicationTrustedFunction)null);
				return;
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION:
				setInvalidateOsTrustedFunction((OsApplicationTrustedFunction)null);
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
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__WRITE_OS_TRUSTED_FUNCTION:
				return writeOsTrustedFunction != null;
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION__INVALIDATE_OS_TRUSTED_FUNCTION:
				return invalidateOsTrustedFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //TrustedFunctionRteSendImplementationImpl
