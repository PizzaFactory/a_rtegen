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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Signal Immediate Task Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl#getStartEntity <em>Start Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl#getOsEventId <em>Os Event Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendSignalImmediateTaskBodyImpl extends TaskBodyImpl implements ComSendSignalImmediateTaskBody {
	/**
	 * The cached value of the '{@link #getStartEntity() <em>Start Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEntity()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalImmediateEntity startEntity;

	/**
	 * The default value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EVENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected String osEventId = OS_EVENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendSignalImmediateTaskBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity getStartEntity() {
		if (startEntity != null && ((EObject)startEntity).eIsProxy()) {
			InternalEObject oldStartEntity = (InternalEObject)startEntity;
			startEntity = (ComSendSignalImmediateEntity)eResolveProxy(oldStartEntity);
			if (startEntity != oldStartEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY, oldStartEntity, startEntity));
			}
		}
		return startEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity basicGetStartEntity() {
		return startEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEntity(ComSendSignalImmediateEntity newStartEntity) {
		ComSendSignalImmediateEntity oldStartEntity = startEntity;
		startEntity = newStartEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY, oldStartEntity, startEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsEventId() {
		return osEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsEventId(String newOsEventId) {
		String oldOsEventId = osEventId;
		osEventId = newOsEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID, oldOsEventId, osEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				if (resolve) return getStartEntity();
				return basicGetStartEntity();
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
				return getOsEventId();
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
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				setStartEntity((ComSendSignalImmediateEntity)newValue);
				return;
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
				setOsEventId((String)newValue);
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
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				setStartEntity((ComSendSignalImmediateEntity)null);
				return;
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
				setOsEventId(OS_EVENT_ID_EDEFAULT);
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
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				return startEntity != null;
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
				return OS_EVENT_ID_EDEFAULT == null ? osEventId != null : !OS_EVENT_ID_EDEFAULT.equals(osEventId);
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
		result.append(" (osEventId: ");
		result.append(osEventId);
		result.append(')');
		return result.toString();
	}

} //ComSendSignalImmediateTaskBodyImpl
