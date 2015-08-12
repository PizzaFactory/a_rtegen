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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Mode Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getCurrentModeName <em>Current Mode Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getNextModeName <em>Next Mode Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getTransitionName <em>Transition Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getInitModeName <em>Init Mode Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getIsNoneExclude <em>Is None Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmModeApiImpl extends SchmApiImpl implements SchmModeApi {
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
	 * The default value of the '{@link #getCurrentModeName() <em>Current Mode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentModeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_MODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentModeName() <em>Current Mode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentModeName()
	 * @generated
	 * @ordered
	 */
	protected String currentModeName = CURRENT_MODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextModeName() <em>Next Mode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_MODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextModeName() <em>Next Mode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModeName()
	 * @generated
	 * @ordered
	 */
	protected String nextModeName = NEXT_MODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected String transitionName = TRANSITION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitModeName() <em>Init Mode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModeName()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_MODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitModeName() <em>Init Mode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModeName()
	 * @generated
	 * @ordered
	 */
	protected String initModeName = INIT_MODE_NAME_EDEFAULT;

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
	protected SchmModeApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_MODE_API;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__OPERATION, oldOperation, newOperation);
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
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.SCHM_MODE_API__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.SCHM_MODE_API__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentModeName() {
		return currentModeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentModeName(String newCurrentModeName) {
		String oldCurrentModeName = currentModeName;
		currentModeName = newCurrentModeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__CURRENT_MODE_NAME, oldCurrentModeName, currentModeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextModeName() {
		return nextModeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextModeName(String newNextModeName) {
		String oldNextModeName = nextModeName;
		nextModeName = newNextModeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__NEXT_MODE_NAME, oldNextModeName, nextModeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionName() {
		return transitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionName(String newTransitionName) {
		String oldTransitionName = transitionName;
		transitionName = newTransitionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__TRANSITION_NAME, oldTransitionName, transitionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitModeName() {
		return initModeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitModeName(String newInitModeName) {
		String oldInitModeName = initModeName;
		initModeName = newInitModeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__INIT_MODE_NAME, oldInitModeName, initModeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__IS_NONE_EXCLUDE, oldIsNoneExclude, isNoneExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SCHM_MODE_API__OPERATION:
				return basicSetOperation(null, msgs);
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
			case ModulePackage.SCHM_MODE_API__OPERATION:
				return getOperation();
			case ModulePackage.SCHM_MODE_API__CURRENT_MODE_NAME:
				return getCurrentModeName();
			case ModulePackage.SCHM_MODE_API__NEXT_MODE_NAME:
				return getNextModeName();
			case ModulePackage.SCHM_MODE_API__TRANSITION_NAME:
				return getTransitionName();
			case ModulePackage.SCHM_MODE_API__INIT_MODE_NAME:
				return getInitModeName();
			case ModulePackage.SCHM_MODE_API__IS_NONE_EXCLUDE:
				return getIsNoneExclude();
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
			case ModulePackage.SCHM_MODE_API__OPERATION:
				setOperation((ExcludeOperation)newValue);
				return;
			case ModulePackage.SCHM_MODE_API__CURRENT_MODE_NAME:
				setCurrentModeName((String)newValue);
				return;
			case ModulePackage.SCHM_MODE_API__NEXT_MODE_NAME:
				setNextModeName((String)newValue);
				return;
			case ModulePackage.SCHM_MODE_API__TRANSITION_NAME:
				setTransitionName((String)newValue);
				return;
			case ModulePackage.SCHM_MODE_API__INIT_MODE_NAME:
				setInitModeName((String)newValue);
				return;
			case ModulePackage.SCHM_MODE_API__IS_NONE_EXCLUDE:
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
			case ModulePackage.SCHM_MODE_API__OPERATION:
				setOperation((ExcludeOperation)null);
				return;
			case ModulePackage.SCHM_MODE_API__CURRENT_MODE_NAME:
				setCurrentModeName(CURRENT_MODE_NAME_EDEFAULT);
				return;
			case ModulePackage.SCHM_MODE_API__NEXT_MODE_NAME:
				setNextModeName(NEXT_MODE_NAME_EDEFAULT);
				return;
			case ModulePackage.SCHM_MODE_API__TRANSITION_NAME:
				setTransitionName(TRANSITION_NAME_EDEFAULT);
				return;
			case ModulePackage.SCHM_MODE_API__INIT_MODE_NAME:
				setInitModeName(INIT_MODE_NAME_EDEFAULT);
				return;
			case ModulePackage.SCHM_MODE_API__IS_NONE_EXCLUDE:
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
			case ModulePackage.SCHM_MODE_API__OPERATION:
				return operation != null;
			case ModulePackage.SCHM_MODE_API__CURRENT_MODE_NAME:
				return CURRENT_MODE_NAME_EDEFAULT == null ? currentModeName != null : !CURRENT_MODE_NAME_EDEFAULT.equals(currentModeName);
			case ModulePackage.SCHM_MODE_API__NEXT_MODE_NAME:
				return NEXT_MODE_NAME_EDEFAULT == null ? nextModeName != null : !NEXT_MODE_NAME_EDEFAULT.equals(nextModeName);
			case ModulePackage.SCHM_MODE_API__TRANSITION_NAME:
				return TRANSITION_NAME_EDEFAULT == null ? transitionName != null : !TRANSITION_NAME_EDEFAULT.equals(transitionName);
			case ModulePackage.SCHM_MODE_API__INIT_MODE_NAME:
				return INIT_MODE_NAME_EDEFAULT == null ? initModeName != null : !INIT_MODE_NAME_EDEFAULT.equals(initModeName);
			case ModulePackage.SCHM_MODE_API__IS_NONE_EXCLUDE:
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
		result.append(" (currentModeName: ");
		result.append(currentModeName);
		result.append(", nextModeName: ");
		result.append(nextModeName);
		result.append(", transitionName: ");
		result.append(transitionName);
		result.append(", initModeName: ");
		result.append(initModeName);
		result.append(", isNoneExclude: ");
		result.append(isNoneExclude);
		result.append(')');
		return result.toString();
	}

} //SchmModeApiImpl
