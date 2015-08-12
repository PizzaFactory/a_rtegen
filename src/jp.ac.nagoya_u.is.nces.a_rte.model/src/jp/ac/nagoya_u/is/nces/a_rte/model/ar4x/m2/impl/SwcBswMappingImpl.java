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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior;

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
 * An implementation of the model object '<em><b>Swc Bsw Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl#getRunnableMapping <em>Runnable Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl#getSwcBehavior <em>Swc Behavior</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl#getBswBehavior <em>Bsw Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcBswMappingImpl extends ArElementImpl implements SwcBswMapping {
	/**
	 * The cached value of the '{@link #getRunnableMapping() <em>Runnable Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcBswRunnableMapping> runnableMapping;

	/**
	 * The cached value of the '{@link #getSwcBehavior() <em>Swc Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcBehavior()
	 * @generated
	 * @ordered
	 */
	protected SwcInternalBehavior swcBehavior;

	/**
	 * The cached value of the '{@link #getBswBehavior() <em>Bsw Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswBehavior()
	 * @generated
	 * @ordered
	 */
	protected BswInternalBehavior bswBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcBswMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SWC_BSW_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcBswRunnableMapping> getRunnableMapping() {
		if (runnableMapping == null) {
			runnableMapping = new EObjectContainmentEList<SwcBswRunnableMapping>(SwcBswRunnableMapping.class, this, M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING);
		}
		return runnableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior getSwcBehavior() {
		if (swcBehavior != null && ((EObject)swcBehavior).eIsProxy()) {
			InternalEObject oldSwcBehavior = (InternalEObject)swcBehavior;
			swcBehavior = (SwcInternalBehavior)eResolveProxy(oldSwcBehavior);
			if (swcBehavior != oldSwcBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR, oldSwcBehavior, swcBehavior));
			}
		}
		return swcBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior basicGetSwcBehavior() {
		return swcBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwcBehavior(SwcInternalBehavior newSwcBehavior) {
		SwcInternalBehavior oldSwcBehavior = swcBehavior;
		swcBehavior = newSwcBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR, oldSwcBehavior, swcBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getBswBehavior() {
		if (bswBehavior != null && ((EObject)bswBehavior).eIsProxy()) {
			InternalEObject oldBswBehavior = (InternalEObject)bswBehavior;
			bswBehavior = (BswInternalBehavior)eResolveProxy(oldBswBehavior);
			if (bswBehavior != oldBswBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR, oldBswBehavior, bswBehavior));
			}
		}
		return bswBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior basicGetBswBehavior() {
		return bswBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBswBehavior(BswInternalBehavior newBswBehavior) {
		BswInternalBehavior oldBswBehavior = bswBehavior;
		bswBehavior = newBswBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR, oldBswBehavior, bswBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				return ((InternalEList<?>)getRunnableMapping()).basicRemove(otherEnd, msgs);
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
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				return getRunnableMapping();
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				if (resolve) return getSwcBehavior();
				return basicGetSwcBehavior();
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				if (resolve) return getBswBehavior();
				return basicGetBswBehavior();
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
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				getRunnableMapping().clear();
				getRunnableMapping().addAll((Collection<? extends SwcBswRunnableMapping>)newValue);
				return;
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				setSwcBehavior((SwcInternalBehavior)newValue);
				return;
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				setBswBehavior((BswInternalBehavior)newValue);
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
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				getRunnableMapping().clear();
				return;
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				setSwcBehavior((SwcInternalBehavior)null);
				return;
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				setBswBehavior((BswInternalBehavior)null);
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
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				return runnableMapping != null && !runnableMapping.isEmpty();
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				return swcBehavior != null;
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				return bswBehavior != null;
		}
		return super.eIsSet(featureID);
	}

} //SwcBswMappingImpl
