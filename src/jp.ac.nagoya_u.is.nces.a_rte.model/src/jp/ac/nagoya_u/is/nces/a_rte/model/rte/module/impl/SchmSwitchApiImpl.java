/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
