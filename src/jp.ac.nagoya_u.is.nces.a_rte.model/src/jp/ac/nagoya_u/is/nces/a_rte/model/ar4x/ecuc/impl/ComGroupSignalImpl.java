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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Group Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComGroupSignalImpl#getComSystemTemplateSystemSignal <em>Com System Template System Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComGroupSignalImpl#getComHandleId <em>Com Handle Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComGroupSignalImpl extends EcucContainerImpl implements ComGroupSignal {
	/**
	 * The cached value of the '{@link #getComSystemTemplateSystemSignal() <em>Com System Template System Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSystemTemplateSystemSignal()
	 * @generated
	 * @ordered
	 */
	protected ISignalToIPduMapping comSystemTemplateSystemSignal;

	/**
	 * The default value of the '{@link #getComHandleId() <em>Com Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComHandleId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COM_HANDLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComHandleId() <em>Com Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComHandleId()
	 * @generated
	 * @ordered
	 */
	protected Integer comHandleId = COM_HANDLE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComGroupSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.COM_GROUP_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping getComSystemTemplateSystemSignal() {
		if (comSystemTemplateSystemSignal != null && ((EObject)comSystemTemplateSystemSignal).eIsProxy()) {
			InternalEObject oldComSystemTemplateSystemSignal = (InternalEObject)comSystemTemplateSystemSignal;
			comSystemTemplateSystemSignal = (ISignalToIPduMapping)eResolveProxy(oldComSystemTemplateSystemSignal);
			if (comSystemTemplateSystemSignal != oldComSystemTemplateSystemSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL, oldComSystemTemplateSystemSignal, comSystemTemplateSystemSignal));
			}
		}
		return comSystemTemplateSystemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping basicGetComSystemTemplateSystemSignal() {
		return comSystemTemplateSystemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSystemTemplateSystemSignal(ISignalToIPduMapping newComSystemTemplateSystemSignal) {
		ISignalToIPduMapping oldComSystemTemplateSystemSignal = comSystemTemplateSystemSignal;
		comSystemTemplateSystemSignal = newComSystemTemplateSystemSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL, oldComSystemTemplateSystemSignal, comSystemTemplateSystemSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getComHandleId() {
		return comHandleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComHandleId(Integer newComHandleId) {
		Integer oldComHandleId = comHandleId;
		comHandleId = newComHandleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_GROUP_SIGNAL__COM_HANDLE_ID, oldComHandleId, comHandleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				if (resolve) return getComSystemTemplateSystemSignal();
				return basicGetComSystemTemplateSystemSignal();
			case EcucPackage.COM_GROUP_SIGNAL__COM_HANDLE_ID:
				return getComHandleId();
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
			case EcucPackage.COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				setComSystemTemplateSystemSignal((ISignalToIPduMapping)newValue);
				return;
			case EcucPackage.COM_GROUP_SIGNAL__COM_HANDLE_ID:
				setComHandleId((Integer)newValue);
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
			case EcucPackage.COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				setComSystemTemplateSystemSignal((ISignalToIPduMapping)null);
				return;
			case EcucPackage.COM_GROUP_SIGNAL__COM_HANDLE_ID:
				setComHandleId(COM_HANDLE_ID_EDEFAULT);
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
			case EcucPackage.COM_GROUP_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				return comSystemTemplateSystemSignal != null;
			case EcucPackage.COM_GROUP_SIGNAL__COM_HANDLE_ID:
				return COM_HANDLE_ID_EDEFAULT == null ? comHandleId != null : !COM_HANDLE_ID_EDEFAULT.equals(comHandleId);
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
		result.append(" (comHandleId: "); //$NON-NLS-1$
		result.append(comHandleId);
		result.append(')');
		return result.toString();
	}

} //ComGroupSignalImpl
