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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Switch Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getExecutableStartOperation <em>Executable Start Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getRequestModeQueue <em>Request Mode Queue</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getCurrentModeVariable <em>Current Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getNextModeVariable <em>Next Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getOsTaskEvent <em>Os Task Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getIsNoneExclude <em>Is None Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmSwitchApiImpl extends SchmApiImpl implements SchmSwitchApi {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ExcludeOperation operation;

	/**
	 * The cached value of the '{@link #getExecutableStartOperation() <em>Executable Start Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableStartOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeSwitchTriggeringExecutableStartOperation> executableStartOperation;

	/**
	 * The cached value of the '{@link #getRequestModeQueue() <em>Request Mode Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestModeQueue()
	 * @generated
	 * @ordered
	 */
	protected ModeQueuedVariable requestModeQueue;

	/**
	 * The cached value of the '{@link #getCurrentModeVariable() <em>Current Mode Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable currentModeVariable;

	/**
	 * The cached value of the '{@link #getNextModeVariable() <em>Next Mode Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable nextModeVariable;

	/**
	 * The cached value of the '{@link #getOsTaskEvent() <em>Os Task Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTaskEventsTriggeredByMode> osTaskEvent;

	/**
	 * The default value of the '{@link #getIsNoneExclude() <em>Is None Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNoneExclude()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NONE_EXCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNoneExclude() <em>Is None Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNoneExclude()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNoneExclude = IS_NONE_EXCLUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchmSwitchApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_SWITCH_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ExcludeOperation newOperation, NotificationChain msgs) {
		ExcludeOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ExcludeOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.SCHM_SWITCH_API__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.SCHM_SWITCH_API__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeSwitchTriggeringExecutableStartOperation> getExecutableStartOperation() {
		if (executableStartOperation == null) {
			executableStartOperation = new EObjectContainmentEList<ModeSwitchTriggeringExecutableStartOperation>(ModeSwitchTriggeringExecutableStartOperation.class, this, ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION);
		}
		return executableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueuedVariable getRequestModeQueue() {
		if (requestModeQueue != null && ((EObject)requestModeQueue).eIsProxy()) {
			InternalEObject oldRequestModeQueue = (InternalEObject)requestModeQueue;
			requestModeQueue = (ModeQueuedVariable)eResolveProxy(oldRequestModeQueue);
			if (requestModeQueue != oldRequestModeQueue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_SWITCH_API__REQUEST_MODE_QUEUE, oldRequestModeQueue, requestModeQueue));
			}
		}
		return requestModeQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueuedVariable basicGetRequestModeQueue() {
		return requestModeQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestModeQueue(ModeQueuedVariable newRequestModeQueue) {
		ModeQueuedVariable oldRequestModeQueue = requestModeQueue;
		requestModeQueue = newRequestModeQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__REQUEST_MODE_QUEUE, oldRequestModeQueue, requestModeQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCurrentModeVariable() {
		if (currentModeVariable != null && ((EObject)currentModeVariable).eIsProxy()) {
			InternalEObject oldCurrentModeVariable = (InternalEObject)currentModeVariable;
			currentModeVariable = (GlobalVariable)eResolveProxy(oldCurrentModeVariable);
			if (currentModeVariable != oldCurrentModeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_SWITCH_API__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, currentModeVariable));
			}
		}
		return currentModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetCurrentModeVariable() {
		return currentModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentModeVariable(GlobalVariable newCurrentModeVariable) {
		GlobalVariable oldCurrentModeVariable = currentModeVariable;
		currentModeVariable = newCurrentModeVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, currentModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getNextModeVariable() {
		if (nextModeVariable != null && ((EObject)nextModeVariable).eIsProxy()) {
			InternalEObject oldNextModeVariable = (InternalEObject)nextModeVariable;
			nextModeVariable = (GlobalVariable)eResolveProxy(oldNextModeVariable);
			if (nextModeVariable != oldNextModeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_SWITCH_API__NEXT_MODE_VARIABLE, oldNextModeVariable, nextModeVariable));
			}
		}
		return nextModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetNextModeVariable() {
		return nextModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextModeVariable(GlobalVariable newNextModeVariable) {
		GlobalVariable oldNextModeVariable = nextModeVariable;
		nextModeVariable = newNextModeVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__NEXT_MODE_VARIABLE, oldNextModeVariable, nextModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTaskEventsTriggeredByMode> getOsTaskEvent() {
		if (osTaskEvent == null) {
			osTaskEvent = new EObjectContainmentEList<OsTaskEventsTriggeredByMode>(OsTaskEventsTriggeredByMode.class, this, ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT);
		}
		return osTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNoneExclude() {
		return isNoneExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNoneExclude(Boolean newIsNoneExclude) {
		Boolean oldIsNoneExclude = isNoneExclude;
		isNoneExclude = newIsNoneExclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__IS_NONE_EXCLUDE, oldIsNoneExclude, isNoneExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SCHM_SWITCH_API__OPERATION:
				return basicSetOperation(null, msgs);
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return ((InternalEList<?>)getExecutableStartOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT:
				return ((InternalEList<?>)getOsTaskEvent()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.SCHM_SWITCH_API__OPERATION:
				return getOperation();
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return getExecutableStartOperation();
			case ModulePackage.SCHM_SWITCH_API__REQUEST_MODE_QUEUE:
				if (resolve) return getRequestModeQueue();
				return basicGetRequestModeQueue();
			case ModulePackage.SCHM_SWITCH_API__CURRENT_MODE_VARIABLE:
				if (resolve) return getCurrentModeVariable();
				return basicGetCurrentModeVariable();
			case ModulePackage.SCHM_SWITCH_API__NEXT_MODE_VARIABLE:
				if (resolve) return getNextModeVariable();
				return basicGetNextModeVariable();
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT:
				return getOsTaskEvent();
			case ModulePackage.SCHM_SWITCH_API__IS_NONE_EXCLUDE:
				return getIsNoneExclude();
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
			case ModulePackage.SCHM_SWITCH_API__OPERATION:
				setOperation((ExcludeOperation)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
				getExecutableStartOperation().addAll((Collection<? extends ModeSwitchTriggeringExecutableStartOperation>)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__REQUEST_MODE_QUEUE:
				setRequestModeQueue((ModeQueuedVariable)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				getOsTaskEvent().addAll((Collection<? extends OsTaskEventsTriggeredByMode>)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__IS_NONE_EXCLUDE:
				setIsNoneExclude((Boolean)newValue);
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
			case ModulePackage.SCHM_SWITCH_API__OPERATION:
				setOperation((ExcludeOperation)null);
				return;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
				return;
			case ModulePackage.SCHM_SWITCH_API__REQUEST_MODE_QUEUE:
				setRequestModeQueue((ModeQueuedVariable)null);
				return;
			case ModulePackage.SCHM_SWITCH_API__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.SCHM_SWITCH_API__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				return;
			case ModulePackage.SCHM_SWITCH_API__IS_NONE_EXCLUDE:
				setIsNoneExclude(IS_NONE_EXCLUDE_EDEFAULT);
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
			case ModulePackage.SCHM_SWITCH_API__OPERATION:
				return operation != null;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return executableStartOperation != null && !executableStartOperation.isEmpty();
			case ModulePackage.SCHM_SWITCH_API__REQUEST_MODE_QUEUE:
				return requestModeQueue != null;
			case ModulePackage.SCHM_SWITCH_API__CURRENT_MODE_VARIABLE:
				return currentModeVariable != null;
			case ModulePackage.SCHM_SWITCH_API__NEXT_MODE_VARIABLE:
				return nextModeVariable != null;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT:
				return osTaskEvent != null && !osTaskEvent.isEmpty();
			case ModulePackage.SCHM_SWITCH_API__IS_NONE_EXCLUDE:
				return IS_NONE_EXCLUDE_EDEFAULT == null ? isNoneExclude != null : !IS_NONE_EXCLUDE_EDEFAULT.equals(isNoneExclude);
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
		result.append(" (isNoneExclude: ");
		result.append(isNoneExclude);
		result.append(')');
		return result.toString();
	}

} //SchmSwitchApiImpl
