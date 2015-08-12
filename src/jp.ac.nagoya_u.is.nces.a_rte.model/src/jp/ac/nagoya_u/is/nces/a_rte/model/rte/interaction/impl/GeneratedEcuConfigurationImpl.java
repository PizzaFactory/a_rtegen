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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generated Ecu Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsTask <em>Generated Os Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsEvent <em>Generated Os Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsSpinlock <em>Generated Os Spinlock</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsIocCommunication <em>Generated Os Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.GeneratedEcuConfigurationImpl#getGeneratedOsTrustedFunction <em>Generated Os Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratedEcuConfigurationImpl extends InteractionObjectImpl implements GeneratedEcuConfiguration {
	/**
	 * The cached value of the '{@link #getGeneratedOsTask() <em>Generated Os Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTask> generatedOsTask;

	/**
	 * The cached value of the '{@link #getGeneratedOsEvent() <em>Generated Os Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> generatedOsEvent;

	/**
	 * The cached value of the '{@link #getGeneratedOsSpinlock() <em>Generated Os Spinlock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsSpinlock()
	 * @generated
	 * @ordered
	 */
	protected EList<OsSpinlock> generatedOsSpinlock;

	/**
	 * The cached value of the '{@link #getGeneratedOsIocCommunication() <em>Generated Os Ioc Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsIocCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsIocCommunication> generatedOsIocCommunication;

	/**
	 * The cached value of the '{@link #getGeneratedOsTrustedFunction() <em>Generated Os Trusted Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedOsTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplicationTrustedFunction> generatedOsTrustedFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedEcuConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.GENERATED_ECU_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTask> getGeneratedOsTask() {
		if (generatedOsTask == null) {
			generatedOsTask = new EObjectResolvingEList<OsTask>(OsTask.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK);
		}
		return generatedOsTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getGeneratedOsEvent() {
		if (generatedOsEvent == null) {
			generatedOsEvent = new EObjectResolvingEList<OsEvent>(OsEvent.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT);
		}
		return generatedOsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsSpinlock> getGeneratedOsSpinlock() {
		if (generatedOsSpinlock == null) {
			generatedOsSpinlock = new EObjectResolvingEList<OsSpinlock>(OsSpinlock.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK);
		}
		return generatedOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsIocCommunication> getGeneratedOsIocCommunication() {
		if (generatedOsIocCommunication == null) {
			generatedOsIocCommunication = new EObjectResolvingEList<OsIocCommunication>(OsIocCommunication.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION);
		}
		return generatedOsIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplicationTrustedFunction> getGeneratedOsTrustedFunction() {
		if (generatedOsTrustedFunction == null) {
			generatedOsTrustedFunction = new EObjectResolvingEList<OsApplicationTrustedFunction>(OsApplicationTrustedFunction.class, this, InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION);
		}
		return generatedOsTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				return getGeneratedOsTask();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				return getGeneratedOsEvent();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				return getGeneratedOsSpinlock();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				return getGeneratedOsIocCommunication();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				return getGeneratedOsTrustedFunction();
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
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				getGeneratedOsTask().clear();
				getGeneratedOsTask().addAll((Collection<? extends OsTask>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				getGeneratedOsEvent().clear();
				getGeneratedOsEvent().addAll((Collection<? extends OsEvent>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				getGeneratedOsSpinlock().clear();
				getGeneratedOsSpinlock().addAll((Collection<? extends OsSpinlock>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				getGeneratedOsIocCommunication().clear();
				getGeneratedOsIocCommunication().addAll((Collection<? extends OsIocCommunication>)newValue);
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				getGeneratedOsTrustedFunction().clear();
				getGeneratedOsTrustedFunction().addAll((Collection<? extends OsApplicationTrustedFunction>)newValue);
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
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				getGeneratedOsTask().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				getGeneratedOsEvent().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				getGeneratedOsSpinlock().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				getGeneratedOsIocCommunication().clear();
				return;
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				getGeneratedOsTrustedFunction().clear();
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
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TASK:
				return generatedOsTask != null && !generatedOsTask.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_EVENT:
				return generatedOsEvent != null && !generatedOsEvent.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_SPINLOCK:
				return generatedOsSpinlock != null && !generatedOsSpinlock.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_IOC_COMMUNICATION:
				return generatedOsIocCommunication != null && !generatedOsIocCommunication.isEmpty();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION__GENERATED_OS_TRUSTED_FUNCTION:
				return generatedOsTrustedFunction != null && !generatedOsTrustedFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneratedEcuConfigurationImpl
