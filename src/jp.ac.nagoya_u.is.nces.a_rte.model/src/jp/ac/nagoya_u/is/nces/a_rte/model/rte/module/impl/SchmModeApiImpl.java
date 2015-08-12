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
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ��������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ��������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Mode Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getModeDeclarationGroup <em>Mode Declaration Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmModeApiImpl#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmModeApiImpl extends SchmApiImpl implements SchmModeApi {
	/**
	 * The cached value of the '{@link #getModeDeclarationGroup() <em>Mode Declaration Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclarationGroup()
	 * @generated
	 * @ordered
	 */
	protected ModeDeclarationGroup modeDeclarationGroup;

	/**
	 * The cached value of the '{@link #getModeMachineInstance() <em>Mode Machine Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeMachineInstance()
	 * @generated
	 * @ordered
	 */
	protected ModeMachineInstance modeMachineInstance;

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
	public ModeDeclarationGroup getModeDeclarationGroup() {
		if (modeDeclarationGroup != null && ((EObject)modeDeclarationGroup).eIsProxy()) {
			InternalEObject oldModeDeclarationGroup = (InternalEObject)modeDeclarationGroup;
			modeDeclarationGroup = (ModeDeclarationGroup)eResolveProxy(oldModeDeclarationGroup);
			if (modeDeclarationGroup != oldModeDeclarationGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_MODE_API__MODE_DECLARATION_GROUP, oldModeDeclarationGroup, modeDeclarationGroup));
			}
		}
		return modeDeclarationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroup basicGetModeDeclarationGroup() {
		return modeDeclarationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeDeclarationGroup(ModeDeclarationGroup newModeDeclarationGroup) {
		ModeDeclarationGroup oldModeDeclarationGroup = modeDeclarationGroup;
		modeDeclarationGroup = newModeDeclarationGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__MODE_DECLARATION_GROUP, oldModeDeclarationGroup, modeDeclarationGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance getModeMachineInstance() {
		if (modeMachineInstance != null && ((EObject)modeMachineInstance).eIsProxy()) {
			InternalEObject oldModeMachineInstance = (InternalEObject)modeMachineInstance;
			modeMachineInstance = (ModeMachineInstance)eResolveProxy(oldModeMachineInstance);
			if (modeMachineInstance != oldModeMachineInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_MODE_API__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
			}
		}
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance basicGetModeMachineInstance() {
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeMachineInstance(ModeMachineInstance newModeMachineInstance) {
		ModeMachineInstance oldModeMachineInstance = modeMachineInstance;
		modeMachineInstance = newModeMachineInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_MODE_API__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SCHM_MODE_API__MODE_DECLARATION_GROUP:
				if (resolve) return getModeDeclarationGroup();
				return basicGetModeDeclarationGroup();
			case ModulePackage.SCHM_MODE_API__MODE_MACHINE_INSTANCE:
				if (resolve) return getModeMachineInstance();
				return basicGetModeMachineInstance();
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
			case ModulePackage.SCHM_MODE_API__MODE_DECLARATION_GROUP:
				setModeDeclarationGroup((ModeDeclarationGroup)newValue);
				return;
			case ModulePackage.SCHM_MODE_API__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)newValue);
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
			case ModulePackage.SCHM_MODE_API__MODE_DECLARATION_GROUP:
				setModeDeclarationGroup((ModeDeclarationGroup)null);
				return;
			case ModulePackage.SCHM_MODE_API__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)null);
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
			case ModulePackage.SCHM_MODE_API__MODE_DECLARATION_GROUP:
				return modeDeclarationGroup != null;
			case ModulePackage.SCHM_MODE_API__MODE_MACHINE_INSTANCE:
				return modeMachineInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //SchmModeApiImpl