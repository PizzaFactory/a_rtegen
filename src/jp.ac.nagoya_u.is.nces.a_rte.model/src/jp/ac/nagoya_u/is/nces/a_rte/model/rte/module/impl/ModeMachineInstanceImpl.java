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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Machine Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getModeQueue <em>Mode Queue</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getCurrentModeVariable <em>Current Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getNextModeVariable <em>Next Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getInitModeConstant <em>Init Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeMachineInstanceImpl extends ModuleObjectImpl implements ModeMachineInstance {
	/**
	 * The cached value of the '{@link #getModeQueue() <em>Mode Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeQueue()
	 * @generated
	 * @ordered
	 */
	protected ModeQueuedVariable modeQueue;

	/**
	 * The cached value of the '{@link #getCurrentModeVariable() <em>Current Mode Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable currentModeVariable;

	/**
	 * The cached value of the '{@link #getNextModeVariable() <em>Next Mode Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable nextModeVariable;

	/**
	 * The cached value of the '{@link #getInitModeConstant() <em>Init Mode Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModeConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initModeConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeMachineInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_MACHINE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueuedVariable getModeQueue() {
		return modeQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeQueue(ModeQueuedVariable newModeQueue, NotificationChain msgs) {
		ModeQueuedVariable oldModeQueue = modeQueue;
		modeQueue = newModeQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE, oldModeQueue, newModeQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeQueue(ModeQueuedVariable newModeQueue) {
		if (newModeQueue != modeQueue) {
			NotificationChain msgs = null;
			if (modeQueue != null)
				msgs = ((InternalEObject)modeQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE, null, msgs);
			if (newModeQueue != null)
				msgs = ((InternalEObject)newModeQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE, null, msgs);
			msgs = basicSetModeQueue(newModeQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE, newModeQueue, newModeQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCurrentModeVariable() {
		return currentModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentModeVariable(GlobalVariable newCurrentModeVariable, NotificationChain msgs) {
		GlobalVariable oldCurrentModeVariable = currentModeVariable;
		currentModeVariable = newCurrentModeVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, newCurrentModeVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentModeVariable(GlobalVariable newCurrentModeVariable) {
		if (newCurrentModeVariable != currentModeVariable) {
			NotificationChain msgs = null;
			if (currentModeVariable != null)
				msgs = ((InternalEObject)currentModeVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, null, msgs);
			if (newCurrentModeVariable != null)
				msgs = ((InternalEObject)newCurrentModeVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, null, msgs);
			msgs = basicSetCurrentModeVariable(newCurrentModeVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, newCurrentModeVariable, newCurrentModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getNextModeVariable() {
		return nextModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextModeVariable(GlobalVariable newNextModeVariable, NotificationChain msgs) {
		GlobalVariable oldNextModeVariable = nextModeVariable;
		nextModeVariable = newNextModeVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, oldNextModeVariable, newNextModeVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextModeVariable(GlobalVariable newNextModeVariable) {
		if (newNextModeVariable != nextModeVariable) {
			NotificationChain msgs = null;
			if (nextModeVariable != null)
				msgs = ((InternalEObject)nextModeVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, null, msgs);
			if (newNextModeVariable != null)
				msgs = ((InternalEObject)newNextModeVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, null, msgs);
			msgs = basicSetNextModeVariable(newNextModeVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, newNextModeVariable, newNextModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitModeConstant() {
		if (initModeConstant != null && ((EObject)initModeConstant).eIsProxy()) {
			InternalEObject oldInitModeConstant = (InternalEObject)initModeConstant;
			initModeConstant = (Constant)eResolveProxy(oldInitModeConstant);
			if (initModeConstant != oldInitModeConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT, oldInitModeConstant, initModeConstant));
			}
		}
		return initModeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetInitModeConstant() {
		return initModeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitModeConstant(Constant newInitModeConstant) {
		Constant oldInitModeConstant = initModeConstant;
		initModeConstant = newInitModeConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT, oldInitModeConstant, initModeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE:
				return basicSetModeQueue(null, msgs);
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				return basicSetCurrentModeVariable(null, msgs);
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				return basicSetNextModeVariable(null, msgs);
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
			case ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE:
				return getModeQueue();
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				return getCurrentModeVariable();
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				return getNextModeVariable();
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				if (resolve) return getInitModeConstant();
				return basicGetInitModeConstant();
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
			case ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE:
				setModeQueue((ModeQueuedVariable)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)newValue);
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
			case ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE:
				setModeQueue((ModeQueuedVariable)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)null);
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
			case ModulePackage.MODE_MACHINE_INSTANCE__MODE_QUEUE:
				return modeQueue != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				return currentModeVariable != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				return nextModeVariable != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				return initModeConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeMachineInstanceImpl
