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
import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeRequestVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Request Variable Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeRequestVariableSetImpl#getInitValueConstant <em>Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeRequestVariableSetImpl#getModeTransitionStatusConstant <em>Mode Transition Status Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeRequestVariableSetImpl#getModeConstant <em>Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeRequestVariableSetImpl extends ExtendedEObjectImpl implements ModeRequestVariableSet {
	/**
	 * The cached value of the '{@link #getInitValueConstant() <em>Init Value Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initValueConstant;

	/**
	 * The cached value of the '{@link #getModeTransitionStatusConstant() <em>Mode Transition Status Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransitionStatusConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant modeTransitionStatusConstant;

	/**
	 * The cached value of the '{@link #getModeConstant() <em>Mode Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> modeConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeRequestVariableSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_REQUEST_VARIABLE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitValueConstant() {
		return initValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitValueConstant(Constant newInitValueConstant, NotificationChain msgs) {
		Constant oldInitValueConstant = initValueConstant;
		initValueConstant = newInitValueConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT, oldInitValueConstant, newInitValueConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValueConstant(Constant newInitValueConstant) {
		if (newInitValueConstant != initValueConstant) {
			NotificationChain msgs = null;
			if (initValueConstant != null)
				msgs = ((InternalEObject)initValueConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT, null, msgs);
			if (newInitValueConstant != null)
				msgs = ((InternalEObject)newInitValueConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT, null, msgs);
			msgs = basicSetInitValueConstant(newInitValueConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT, newInitValueConstant, newInitValueConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getModeTransitionStatusConstant() {
		return modeTransitionStatusConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeTransitionStatusConstant(Constant newModeTransitionStatusConstant, NotificationChain msgs) {
		Constant oldModeTransitionStatusConstant = modeTransitionStatusConstant;
		modeTransitionStatusConstant = newModeTransitionStatusConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT, oldModeTransitionStatusConstant, newModeTransitionStatusConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeTransitionStatusConstant(Constant newModeTransitionStatusConstant) {
		if (newModeTransitionStatusConstant != modeTransitionStatusConstant) {
			NotificationChain msgs = null;
			if (modeTransitionStatusConstant != null)
				msgs = ((InternalEObject)modeTransitionStatusConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT, null, msgs);
			if (newModeTransitionStatusConstant != null)
				msgs = ((InternalEObject)newModeTransitionStatusConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT, null, msgs);
			msgs = basicSetModeTransitionStatusConstant(newModeTransitionStatusConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT, newModeTransitionStatusConstant, newModeTransitionStatusConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getModeConstant() {
		if (modeConstant == null) {
			modeConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_CONSTANT);
		}
		return modeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT:
				return basicSetInitValueConstant(null, msgs);
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT:
				return basicSetModeTransitionStatusConstant(null, msgs);
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_CONSTANT:
				return ((InternalEList<?>)getModeConstant()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT:
				return getInitValueConstant();
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT:
				return getModeTransitionStatusConstant();
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_CONSTANT:
				return getModeConstant();
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
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)newValue);
				return;
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT:
				setModeTransitionStatusConstant((Constant)newValue);
				return;
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_CONSTANT:
				getModeConstant().clear();
				getModeConstant().addAll((Collection<? extends Constant>)newValue);
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
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)null);
				return;
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT:
				setModeTransitionStatusConstant((Constant)null);
				return;
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_CONSTANT:
				getModeConstant().clear();
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
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__INIT_VALUE_CONSTANT:
				return initValueConstant != null;
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_TRANSITION_STATUS_CONSTANT:
				return modeTransitionStatusConstant != null;
			case ModulePackage.MODE_REQUEST_VARIABLE_SET__MODE_CONSTANT:
				return modeConstant != null && !modeConstant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModeRequestVariableSetImpl
