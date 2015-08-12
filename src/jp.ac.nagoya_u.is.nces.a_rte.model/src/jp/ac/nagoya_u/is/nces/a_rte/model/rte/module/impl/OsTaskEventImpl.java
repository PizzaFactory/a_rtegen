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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Task Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getTaskIdEvents <em>Task Id Events</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getTaskPriority <em>Task Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsTaskEventImpl extends ModuleReferrableImpl implements OsTaskEvent {
	/**
	 * The default value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected String taskId = TASK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskIdEvents() <em>Task Id Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskIdEvents()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_ID_EVENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskIdEvents() <em>Task Id Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskIdEvents()
	 * @generated
	 * @ordered
	 */
	protected String taskIdEvents = TASK_ID_EVENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskPriority() <em>Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TASK_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskPriority() <em>Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer taskPriority = TASK_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsTaskEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_TASK_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskId() {
		return taskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskId(String newTaskId) {
		String oldTaskId = taskId;
		taskId = newTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__TASK_ID, oldTaskId, taskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskIdEvents() {
		return taskIdEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskIdEvents(String newTaskIdEvents) {
		String oldTaskIdEvents = taskIdEvents;
		taskIdEvents = newTaskIdEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__TASK_ID_EVENTS, oldTaskIdEvents, taskIdEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTaskPriority() {
		return taskPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskPriority(Integer newTaskPriority) {
		Integer oldTaskPriority = taskPriority;
		taskPriority = newTaskPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__TASK_PRIORITY, oldTaskPriority, taskPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_TASK_EVENT__TASK_ID:
				return getTaskId();
			case ModulePackage.OS_TASK_EVENT__TASK_ID_EVENTS:
				return getTaskIdEvents();
			case ModulePackage.OS_TASK_EVENT__TASK_PRIORITY:
				return getTaskPriority();
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
			case ModulePackage.OS_TASK_EVENT__TASK_ID:
				setTaskId((String)newValue);
				return;
			case ModulePackage.OS_TASK_EVENT__TASK_ID_EVENTS:
				setTaskIdEvents((String)newValue);
				return;
			case ModulePackage.OS_TASK_EVENT__TASK_PRIORITY:
				setTaskPriority((Integer)newValue);
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
			case ModulePackage.OS_TASK_EVENT__TASK_ID:
				setTaskId(TASK_ID_EDEFAULT);
				return;
			case ModulePackage.OS_TASK_EVENT__TASK_ID_EVENTS:
				setTaskIdEvents(TASK_ID_EVENTS_EDEFAULT);
				return;
			case ModulePackage.OS_TASK_EVENT__TASK_PRIORITY:
				setTaskPriority(TASK_PRIORITY_EDEFAULT);
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
			case ModulePackage.OS_TASK_EVENT__TASK_ID:
				return TASK_ID_EDEFAULT == null ? taskId != null : !TASK_ID_EDEFAULT.equals(taskId);
			case ModulePackage.OS_TASK_EVENT__TASK_ID_EVENTS:
				return TASK_ID_EVENTS_EDEFAULT == null ? taskIdEvents != null : !TASK_ID_EVENTS_EDEFAULT.equals(taskIdEvents);
			case ModulePackage.OS_TASK_EVENT__TASK_PRIORITY:
				return TASK_PRIORITY_EDEFAULT == null ? taskPriority != null : !TASK_PRIORITY_EDEFAULT.equals(taskPriority);
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
		result.append(" (taskId: ");
		result.append(taskId);
		result.append(", taskIdEvents: ");
		result.append(taskIdEvents);
		result.append(", taskPriority: ");
		result.append(taskPriority);
		result.append(')');
		return result.toString();
	}

} //OsTaskEventImpl
