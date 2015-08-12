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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disabled In Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getDisabledMode <em>Disabled Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getCurrentModeVariable <em>Current Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getNextModeVariable <em>Next Mode Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisabledInModeImpl extends ModuleReferrableImpl implements DisabledInMode {
	/**
	 * The cached value of the '{@link #getDisabledMode() <em>Disabled Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMode()
	 * @generated
	 * @ordered
	 */
	protected Constant disabledMode;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisabledInModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.DISABLED_IN_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getDisabledMode() {
		if (disabledMode != null && ((EObject)disabledMode).eIsProxy()) {
			InternalEObject oldDisabledMode = (InternalEObject)disabledMode;
			disabledMode = (Constant)eResolveProxy(oldDisabledMode);
			if (disabledMode != oldDisabledMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__DISABLED_MODE, oldDisabledMode, disabledMode));
			}
		}
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetDisabledMode() {
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledMode(Constant newDisabledMode) {
		Constant oldDisabledMode = disabledMode;
		disabledMode = newDisabledMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__DISABLED_MODE, oldDisabledMode, disabledMode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, currentModeVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, currentModeVariable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE, oldNextModeVariable, nextModeVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE, oldNextModeVariable, nextModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				if (resolve) return getDisabledMode();
				return basicGetDisabledMode();
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				if (resolve) return getCurrentModeVariable();
				return basicGetCurrentModeVariable();
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				if (resolve) return getNextModeVariable();
				return basicGetNextModeVariable();
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				setDisabledMode((Constant)newValue);
				return;
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)newValue);
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				setDisabledMode((Constant)null);
				return;
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)null);
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				return disabledMode != null;
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				return currentModeVariable != null;
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				return nextModeVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //DisabledInModeImpl
