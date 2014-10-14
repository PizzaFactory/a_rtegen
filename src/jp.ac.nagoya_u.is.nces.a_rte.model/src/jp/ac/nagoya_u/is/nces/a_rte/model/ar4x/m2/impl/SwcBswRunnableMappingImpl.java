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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc Bsw Runnable Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswRunnableMappingImpl#getSwcRunnable <em>Swc Runnable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswRunnableMappingImpl#getBswEntity <em>Bsw Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcBswRunnableMappingImpl extends M2ObjectImpl implements SwcBswRunnableMapping {
	/**
	 * The cached value of the '{@link #getSwcRunnable() <em>Swc Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcRunnable()
	 * @generated
	 * @ordered
	 */
	protected RunnableEntity swcRunnable;

	/**
	 * The cached value of the '{@link #getBswEntity() <em>Bsw Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswEntity()
	 * @generated
	 * @ordered
	 */
	protected BswModuleEntity bswEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcBswRunnableMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SWC_BSW_RUNNABLE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntity getSwcRunnable() {
		if (swcRunnable != null && ((EObject)swcRunnable).eIsProxy()) {
			InternalEObject oldSwcRunnable = (InternalEObject)swcRunnable;
			swcRunnable = (RunnableEntity)eResolveProxy(oldSwcRunnable);
			if (swcRunnable != oldSwcRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE, oldSwcRunnable, swcRunnable));
			}
		}
		return swcRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntity basicGetSwcRunnable() {
		return swcRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwcRunnable(RunnableEntity newSwcRunnable) {
		RunnableEntity oldSwcRunnable = swcRunnable;
		swcRunnable = newSwcRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE, oldSwcRunnable, swcRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleEntity getBswEntity() {
		if (bswEntity != null && ((EObject)bswEntity).eIsProxy()) {
			InternalEObject oldBswEntity = (InternalEObject)bswEntity;
			bswEntity = (BswModuleEntity)eResolveProxy(oldBswEntity);
			if (bswEntity != oldBswEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY, oldBswEntity, bswEntity));
			}
		}
		return bswEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleEntity basicGetBswEntity() {
		return bswEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBswEntity(BswModuleEntity newBswEntity) {
		BswModuleEntity oldBswEntity = bswEntity;
		bswEntity = newBswEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY, oldBswEntity, bswEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE:
				if (resolve) return getSwcRunnable();
				return basicGetSwcRunnable();
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY:
				if (resolve) return getBswEntity();
				return basicGetBswEntity();
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
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE:
				setSwcRunnable((RunnableEntity)newValue);
				return;
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY:
				setBswEntity((BswModuleEntity)newValue);
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
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE:
				setSwcRunnable((RunnableEntity)null);
				return;
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY:
				setBswEntity((BswModuleEntity)null);
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
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__SWC_RUNNABLE:
				return swcRunnable != null;
			case M2Package.SWC_BSW_RUNNABLE_MAPPING__BSW_ENTITY:
				return bswEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //SwcBswRunnableMappingImpl
