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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Event Entity Starter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsEventSetEntityStarterImpl#getSourceOsTask <em>Source Os Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.OsEventSetEntityStarterImpl#getSourceOsEvent <em>Source Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsEventSetEntityStarterImpl extends EntityStarterImpl implements OsEventSetEntityStarter {
	/**
	 * The cached value of the '{@link #getSourceOsTask() <em>Source Os Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOsTask()
	 * @generated
	 * @ordered
	 */
	protected OsTask sourceOsTask;

	/**
	 * The cached value of the '{@link #getSourceOsEvent() <em>Source Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOsEvent()
	 * @generated
	 * @ordered
	 */
	protected OsEvent sourceOsEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsEventSetEntityStarterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask getSourceOsTask() {
		if (sourceOsTask != null && ((EObject)sourceOsTask).eIsProxy()) {
			InternalEObject oldSourceOsTask = (InternalEObject)sourceOsTask;
			sourceOsTask = (OsTask)eResolveProxy(oldSourceOsTask);
			if (sourceOsTask != oldSourceOsTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, oldSourceOsTask, sourceOsTask));
			}
		}
		return sourceOsTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask basicGetSourceOsTask() {
		return sourceOsTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOsTask(OsTask newSourceOsTask) {
		OsTask oldSourceOsTask = sourceOsTask;
		sourceOsTask = newSourceOsTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, oldSourceOsTask, sourceOsTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent getSourceOsEvent() {
		if (sourceOsEvent != null && ((EObject)sourceOsEvent).eIsProxy()) {
			InternalEObject oldSourceOsEvent = (InternalEObject)sourceOsEvent;
			sourceOsEvent = (OsEvent)eResolveProxy(oldSourceOsEvent);
			if (sourceOsEvent != oldSourceOsEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT, oldSourceOsEvent, sourceOsEvent));
			}
		}
		return sourceOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent basicGetSourceOsEvent() {
		return sourceOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOsEvent(OsEvent newSourceOsEvent) {
		OsEvent oldSourceOsEvent = sourceOsEvent;
		sourceOsEvent = newSourceOsEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT, oldSourceOsEvent, sourceOsEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK:
				if (resolve) return getSourceOsTask();
				return basicGetSourceOsTask();
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT:
				if (resolve) return getSourceOsEvent();
				return basicGetSourceOsEvent();
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
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK:
				setSourceOsTask((OsTask)newValue);
				return;
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT:
				setSourceOsEvent((OsEvent)newValue);
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
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK:
				setSourceOsTask((OsTask)null);
				return;
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT:
				setSourceOsEvent((OsEvent)null);
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
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK:
				return sourceOsTask != null;
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT:
				return sourceOsEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //OsEventEntityStarterImpl
