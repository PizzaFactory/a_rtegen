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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Initialization Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl#getRteInitializationStrategy <em>Rte Initialization Strategy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteInitializationBehaviorImpl#getRteSectionInitializationPolicy <em>Rte Section Initialization Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteInitializationBehaviorImpl extends EcucContainerImpl implements RteInitializationBehavior {
	/**
	 * The default value of the '{@link #getRteInitializationStrategy() <em>Rte Initialization Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInitializationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final RteInitializationStrategyEnum RTE_INITIALIZATION_STRATEGY_EDEFAULT = RteInitializationStrategyEnum.RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION;

	/**
	 * The cached value of the '{@link #getRteInitializationStrategy() <em>Rte Initialization Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInitializationStrategy()
	 * @generated
	 * @ordered
	 */
	protected RteInitializationStrategyEnum rteInitializationStrategy = RTE_INITIALIZATION_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteSectionInitializationPolicy() <em>Rte Section Initialization Policy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteSectionInitializationPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rteSectionInitializationPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteInitializationBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_INITIALIZATION_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum getRteInitializationStrategy() {
		return rteInitializationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteInitializationStrategy(RteInitializationStrategyEnum newRteInitializationStrategy) {
		RteInitializationStrategyEnum oldRteInitializationStrategy = rteInitializationStrategy;
		rteInitializationStrategy = newRteInitializationStrategy == null ? RTE_INITIALIZATION_STRATEGY_EDEFAULT : newRteInitializationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY, oldRteInitializationStrategy, rteInitializationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRteSectionInitializationPolicy() {
		if (rteSectionInitializationPolicy == null) {
			rteSectionInitializationPolicy = new EDataTypeUniqueEList<String>(String.class, this, EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY);
		}
		return rteSectionInitializationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				return getRteInitializationStrategy();
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				return getRteSectionInitializationPolicy();
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
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				setRteInitializationStrategy((RteInitializationStrategyEnum)newValue);
				return;
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				getRteSectionInitializationPolicy().clear();
				getRteSectionInitializationPolicy().addAll((Collection<? extends String>)newValue);
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
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				setRteInitializationStrategy(RTE_INITIALIZATION_STRATEGY_EDEFAULT);
				return;
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				getRteSectionInitializationPolicy().clear();
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
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_INITIALIZATION_STRATEGY:
				return rteInitializationStrategy != RTE_INITIALIZATION_STRATEGY_EDEFAULT;
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR__RTE_SECTION_INITIALIZATION_POLICY:
				return rteSectionInitializationPolicy != null && !rteSectionInitializationPolicy.isEmpty();
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
		result.append(" (rteInitializationStrategy: ");
		result.append(rteInitializationStrategy);
		result.append(", rteSectionInitializationPolicy: ");
		result.append(rteSectionInitializationPolicy);
		result.append(')');
		return result.toString();
	}

} //RteInitializationBehaviorImpl
