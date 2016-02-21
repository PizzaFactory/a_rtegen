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

import java.math.BigDecimal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Event To Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteEvent <em>Rte Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteActivationOffset <em>Rte Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteMappedToTask <em>Rte Mapped To Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRtePositionInTask <em>Rte Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteUsedOsAlarm <em>Rte Used Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteEventToTaskMappingImpl#getRteUsedOsEvent <em>Rte Used Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteEventToTaskMappingImpl extends EcucContainerImpl implements RteEventToTaskMapping {
	/**
	 * The cached value of the '{@link #getRteEvent() <em>Rte Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteEvent()
	 * @generated
	 * @ordered
	 */
	protected RteEvent rteEvent;
	/**
	 * The default value of the '{@link #getRteActivationOffset() <em>Rte Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RTE_ACTIVATION_OFFSET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRteActivationOffset() <em>Rte Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteActivationOffset()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rteActivationOffset = RTE_ACTIVATION_OFFSET_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRteMappedToTask() <em>Rte Mapped To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteMappedToTask()
	 * @generated
	 * @ordered
	 */
	protected OsTask rteMappedToTask;
	/**
	 * The default value of the '{@link #getRtePositionInTask() <em>Rte Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtePositionInTask()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RTE_POSITION_IN_TASK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRtePositionInTask() <em>Rte Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtePositionInTask()
	 * @generated
	 * @ordered
	 */
	protected Integer rtePositionInTask = RTE_POSITION_IN_TASK_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRteUsedOsAlarm() <em>Rte Used Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteUsedOsAlarm()
	 * @generated
	 * @ordered
	 */
	protected OsAlarm rteUsedOsAlarm;
	/**
	 * The cached value of the '{@link #getRteUsedOsEvent() <em>Rte Used Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteUsedOsEvent()
	 * @generated
	 * @ordered
	 */
	protected OsEvent rteUsedOsEvent;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteEventToTaskMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEvent getRteEvent() {
		if (rteEvent != null && ((EObject)rteEvent).eIsProxy()) {
			InternalEObject oldRteEvent = (InternalEObject)rteEvent;
			rteEvent = (RteEvent)eResolveProxy(oldRteEvent);
			if (rteEvent != oldRteEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT, oldRteEvent, rteEvent));
			}
		}
		return rteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEvent basicGetRteEvent() {
		return rteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteEvent(RteEvent newRteEvent, NotificationChain msgs) {
		RteEvent oldRteEvent = rteEvent;
		rteEvent = newRteEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT, oldRteEvent, newRteEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteEvent(RteEvent newRteEvent) {
		if (newRteEvent != rteEvent) {
			NotificationChain msgs = null;
			if (rteEvent != null)
				msgs = ((InternalEObject)rteEvent).eInverseRemove(this, M2Package.RTE_EVENT__CONFIG, RteEvent.class, msgs);
			if (newRteEvent != null)
				msgs = ((InternalEObject)newRteEvent).eInverseAdd(this, M2Package.RTE_EVENT__CONFIG, RteEvent.class, msgs);
			msgs = basicSetRteEvent(newRteEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT, newRteEvent, newRteEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRteActivationOffset() {
		return rteActivationOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteActivationOffset(BigDecimal newRteActivationOffset) {
		BigDecimal oldRteActivationOffset = rteActivationOffset;
		rteActivationOffset = newRteActivationOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET, oldRteActivationOffset, rteActivationOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask getRteMappedToTask() {
		if (rteMappedToTask != null && ((EObject)rteMappedToTask).eIsProxy()) {
			InternalEObject oldRteMappedToTask = (InternalEObject)rteMappedToTask;
			rteMappedToTask = (OsTask)eResolveProxy(oldRteMappedToTask);
			if (rteMappedToTask != oldRteMappedToTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK, oldRteMappedToTask, rteMappedToTask));
			}
		}
		return rteMappedToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask basicGetRteMappedToTask() {
		return rteMappedToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteMappedToTask(OsTask newRteMappedToTask, NotificationChain msgs) {
		OsTask oldRteMappedToTask = rteMappedToTask;
		rteMappedToTask = newRteMappedToTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK, oldRteMappedToTask, newRteMappedToTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteMappedToTask(OsTask newRteMappedToTask) {
		if (newRteMappedToTask != rteMappedToTask) {
			NotificationChain msgs = null;
			if (rteMappedToTask != null)
				msgs = ((InternalEObject)rteMappedToTask).eInverseRemove(this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, OsTask.class, msgs);
			if (newRteMappedToTask != null)
				msgs = ((InternalEObject)newRteMappedToTask).eInverseAdd(this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, OsTask.class, msgs);
			msgs = basicSetRteMappedToTask(newRteMappedToTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK, newRteMappedToTask, newRteMappedToTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRtePositionInTask() {
		return rtePositionInTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtePositionInTask(Integer newRtePositionInTask) {
		Integer oldRtePositionInTask = rtePositionInTask;
		rtePositionInTask = newRtePositionInTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK, oldRtePositionInTask, rtePositionInTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm getRteUsedOsAlarm() {
		if (rteUsedOsAlarm != null && ((EObject)rteUsedOsAlarm).eIsProxy()) {
			InternalEObject oldRteUsedOsAlarm = (InternalEObject)rteUsedOsAlarm;
			rteUsedOsAlarm = (OsAlarm)eResolveProxy(oldRteUsedOsAlarm);
			if (rteUsedOsAlarm != oldRteUsedOsAlarm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM, oldRteUsedOsAlarm, rteUsedOsAlarm));
			}
		}
		return rteUsedOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm basicGetRteUsedOsAlarm() {
		return rteUsedOsAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteUsedOsAlarm(OsAlarm newRteUsedOsAlarm) {
		OsAlarm oldRteUsedOsAlarm = rteUsedOsAlarm;
		rteUsedOsAlarm = newRteUsedOsAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM, oldRteUsedOsAlarm, rteUsedOsAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent getRteUsedOsEvent() {
		if (rteUsedOsEvent != null && ((EObject)rteUsedOsEvent).eIsProxy()) {
			InternalEObject oldRteUsedOsEvent = (InternalEObject)rteUsedOsEvent;
			rteUsedOsEvent = (OsEvent)eResolveProxy(oldRteUsedOsEvent);
			if (rteUsedOsEvent != oldRteUsedOsEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, oldRteUsedOsEvent, rteUsedOsEvent));
			}
		}
		return rteUsedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent basicGetRteUsedOsEvent() {
		return rteUsedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteUsedOsEvent(OsEvent newRteUsedOsEvent) {
		OsEvent oldRteUsedOsEvent = rteUsedOsEvent;
		rteUsedOsEvent = newRteUsedOsEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, oldRteUsedOsEvent, rteUsedOsEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				if (rteEvent != null)
					msgs = ((InternalEObject)rteEvent).eInverseRemove(this, M2Package.RTE_EVENT__CONFIG, RteEvent.class, msgs);
				return basicSetRteEvent((RteEvent)otherEnd, msgs);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				if (rteMappedToTask != null)
					msgs = ((InternalEObject)rteMappedToTask).eInverseRemove(this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, OsTask.class, msgs);
				return basicSetRteMappedToTask((OsTask)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				return basicSetRteEvent(null, msgs);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				return basicSetRteMappedToTask(null, msgs);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				if (resolve) return getRteEvent();
				return basicGetRteEvent();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				return getRteActivationOffset();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				if (resolve) return getRteMappedToTask();
				return basicGetRteMappedToTask();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				return getRtePositionInTask();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				if (resolve) return getRteUsedOsAlarm();
				return basicGetRteUsedOsAlarm();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				if (resolve) return getRteUsedOsEvent();
				return basicGetRteUsedOsEvent();
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				setRteEvent((RteEvent)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				setRteActivationOffset((BigDecimal)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				setRteMappedToTask((OsTask)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				setRtePositionInTask((Integer)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				setRteUsedOsAlarm((OsAlarm)newValue);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				setRteUsedOsEvent((OsEvent)newValue);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				setRteEvent((RteEvent)null);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				setRteActivationOffset(RTE_ACTIVATION_OFFSET_EDEFAULT);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				setRteMappedToTask((OsTask)null);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				setRtePositionInTask(RTE_POSITION_IN_TASK_EDEFAULT);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				setRteUsedOsAlarm((OsAlarm)null);
				return;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				setRteUsedOsEvent((OsEvent)null);
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
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT:
				return rteEvent != null;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
				return RTE_ACTIVATION_OFFSET_EDEFAULT == null ? rteActivationOffset != null : !RTE_ACTIVATION_OFFSET_EDEFAULT.equals(rteActivationOffset);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK:
				return rteMappedToTask != null;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
				return RTE_POSITION_IN_TASK_EDEFAULT == null ? rtePositionInTask != null : !RTE_POSITION_IN_TASK_EDEFAULT.equals(rtePositionInTask);
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM:
				return rteUsedOsAlarm != null;
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT:
				return rteUsedOsEvent != null;
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
		result.append(" (rteActivationOffset: "); //$NON-NLS-1$
		result.append(rteActivationOffset);
		result.append(", rtePositionInTask: "); //$NON-NLS-1$
		result.append(rtePositionInTask);
		result.append(')');
		return result.toString();
	}

} //RteEventToTaskMappingImpl
