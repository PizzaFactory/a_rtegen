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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTaskScheduleEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskActivation <em>Os Task Activation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskPriority <em>Os Task Priority</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskSchedule <em>Os Task Schedule</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskAccessingApplication <em>Os Task Accessing Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOsTaskEvent <em>Os Task Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getMappedRteEvent <em>Mapped Rte Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getOwnerApplication <em>Owner Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsTaskImpl#getMappedRteBswEvent <em>Mapped Rte Bsw Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsTaskImpl extends EcucContainerImpl implements OsTask {
	/**
	 * The default value of the '{@link #getOsTaskActivation() <em>Os Task Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskActivation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TASK_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskActivation() <em>Os Task Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskActivation()
	 * @generated
	 * @ordered
	 */
	protected Integer osTaskActivation = OS_TASK_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TASK_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer osTaskPriority = OS_TASK_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsTaskSchedule() <em>Os Task Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final OsTaskScheduleEnum OS_TASK_SCHEDULE_EDEFAULT = OsTaskScheduleEnum.FULL;

	/**
	 * The cached value of the '{@link #getOsTaskSchedule() <em>Os Task Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskSchedule()
	 * @generated
	 * @ordered
	 */
	protected OsTaskScheduleEnum osTaskSchedule = OS_TASK_SCHEDULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsTaskAccessingApplication() <em>Os Task Accessing Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskAccessingApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> osTaskAccessingApplication;

	/**
	 * The cached value of the '{@link #getOsTaskEvent() <em>Os Task Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> osTaskEvent;

	/**
	 * The cached value of the '{@link #getMappedRteEvent() <em>Mapped Rte Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRteEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RteEventToTaskMapping> mappedRteEvent;

	/**
	 * The cached value of the '{@link #getOwnerApplication() <em>Owner Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> ownerApplication;

	/**
	 * The cached value of the '{@link #getMappedRteBswEvent() <em>Mapped Rte Bsw Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRteBswEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswEventToTaskMapping> mappedRteBswEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsTaskActivation() {
		return osTaskActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskActivation(Integer newOsTaskActivation) {
		Integer oldOsTaskActivation = osTaskActivation;
		osTaskActivation = newOsTaskActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_TASK__OS_TASK_ACTIVATION, oldOsTaskActivation, osTaskActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsTaskPriority() {
		return osTaskPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskPriority(Integer newOsTaskPriority) {
		Integer oldOsTaskPriority = osTaskPriority;
		osTaskPriority = newOsTaskPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_TASK__OS_TASK_PRIORITY, oldOsTaskPriority, osTaskPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskScheduleEnum getOsTaskSchedule() {
		return osTaskSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskSchedule(OsTaskScheduleEnum newOsTaskSchedule) {
		OsTaskScheduleEnum oldOsTaskSchedule = osTaskSchedule;
		osTaskSchedule = newOsTaskSchedule == null ? OS_TASK_SCHEDULE_EDEFAULT : newOsTaskSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_TASK__OS_TASK_SCHEDULE, oldOsTaskSchedule, osTaskSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOsTaskAccessingApplication() {
		if (osTaskAccessingApplication == null) {
			osTaskAccessingApplication = new EObjectResolvingEList<OsApplication>(OsApplication.class, this, EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION);
		}
		return osTaskAccessingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getOsTaskEvent() {
		if (osTaskEvent == null) {
			osTaskEvent = new EObjectResolvingEList<OsEvent>(OsEvent.class, this, EcucPackage.OS_TASK__OS_TASK_EVENT);
		}
		return osTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteEventToTaskMapping> getMappedRteEvent() {
		if (mappedRteEvent == null) {
			mappedRteEvent = new EObjectWithInverseResolvingEList<RteEventToTaskMapping>(RteEventToTaskMapping.class, this, EcucPackage.OS_TASK__MAPPED_RTE_EVENT, EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK);
		}
		return mappedRteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOwnerApplication() {
		if (ownerApplication == null) {
			ownerApplication = new EObjectWithInverseResolvingEList.ManyInverse<OsApplication>(OsApplication.class, this, EcucPackage.OS_TASK__OWNER_APPLICATION, EcucPackage.OS_APPLICATION__OS_APP_TASK);
		}
		return ownerApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswEventToTaskMapping> getMappedRteBswEvent() {
		if (mappedRteBswEvent == null) {
			mappedRteBswEvent = new EObjectWithInverseResolvingEList<RteBswEventToTaskMapping>(RteBswEventToTaskMapping.class, this, EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_MAPPED_TO_TASK);
		}
		return mappedRteBswEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappedRteEvent()).basicAdd(otherEnd, msgs);
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnerApplication()).basicAdd(otherEnd, msgs);
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappedRteBswEvent()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return ((InternalEList<?>)getMappedRteEvent()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return ((InternalEList<?>)getOwnerApplication()).basicRemove(otherEnd, msgs);
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return ((InternalEList<?>)getMappedRteBswEvent()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				return getOsTaskActivation();
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				return getOsTaskPriority();
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				return getOsTaskSchedule();
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				return getOsTaskAccessingApplication();
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				return getOsTaskEvent();
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return getMappedRteEvent();
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return getOwnerApplication();
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return getMappedRteBswEvent();
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				setOsTaskActivation((Integer)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				setOsTaskPriority((Integer)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				setOsTaskSchedule((OsTaskScheduleEnum)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				getOsTaskAccessingApplication().clear();
				getOsTaskAccessingApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				getOsTaskEvent().addAll((Collection<? extends OsEvent>)newValue);
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				getMappedRteEvent().clear();
				getMappedRteEvent().addAll((Collection<? extends RteEventToTaskMapping>)newValue);
				return;
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				getOwnerApplication().clear();
				getOwnerApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				getMappedRteBswEvent().clear();
				getMappedRteBswEvent().addAll((Collection<? extends RteBswEventToTaskMapping>)newValue);
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				setOsTaskActivation(OS_TASK_ACTIVATION_EDEFAULT);
				return;
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				setOsTaskPriority(OS_TASK_PRIORITY_EDEFAULT);
				return;
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				setOsTaskSchedule(OS_TASK_SCHEDULE_EDEFAULT);
				return;
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				getOsTaskAccessingApplication().clear();
				return;
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				getMappedRteEvent().clear();
				return;
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				getOwnerApplication().clear();
				return;
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				getMappedRteBswEvent().clear();
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
			case EcucPackage.OS_TASK__OS_TASK_ACTIVATION:
				return OS_TASK_ACTIVATION_EDEFAULT == null ? osTaskActivation != null : !OS_TASK_ACTIVATION_EDEFAULT.equals(osTaskActivation);
			case EcucPackage.OS_TASK__OS_TASK_PRIORITY:
				return OS_TASK_PRIORITY_EDEFAULT == null ? osTaskPriority != null : !OS_TASK_PRIORITY_EDEFAULT.equals(osTaskPriority);
			case EcucPackage.OS_TASK__OS_TASK_SCHEDULE:
				return osTaskSchedule != OS_TASK_SCHEDULE_EDEFAULT;
			case EcucPackage.OS_TASK__OS_TASK_ACCESSING_APPLICATION:
				return osTaskAccessingApplication != null && !osTaskAccessingApplication.isEmpty();
			case EcucPackage.OS_TASK__OS_TASK_EVENT:
				return osTaskEvent != null && !osTaskEvent.isEmpty();
			case EcucPackage.OS_TASK__MAPPED_RTE_EVENT:
				return mappedRteEvent != null && !mappedRteEvent.isEmpty();
			case EcucPackage.OS_TASK__OWNER_APPLICATION:
				return ownerApplication != null && !ownerApplication.isEmpty();
			case EcucPackage.OS_TASK__MAPPED_RTE_BSW_EVENT:
				return mappedRteBswEvent != null && !mappedRteBswEvent.isEmpty();
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
		result.append(" (osTaskActivation: ");
		result.append(osTaskActivation);
		result.append(", osTaskPriority: ");
		result.append(osTaskPriority);
		result.append(", osTaskSchedule: ");
		result.append(osTaskSchedule);
		result.append(')');
		return result.toString();
	}

} //OsTaskImpl
