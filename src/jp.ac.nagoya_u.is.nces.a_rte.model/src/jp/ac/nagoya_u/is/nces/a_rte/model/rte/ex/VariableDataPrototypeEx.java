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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Prototype Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataPrototypeEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface VariableDataPrototypeEx extends ExtendedEObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ������˽�������뤫
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION or\n\t\t\t\t\tinitStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART'"
	 * @generated
	 */
	Boolean initAtDeclaration(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTE�γ��ϻ��˽�������뤫
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START or initStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	Boolean initAtStart(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �ѡ��ƥ������κƵ�ư���˽�������뤫
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART or\n\t\t\t\t\tinitStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	Boolean initAtPartitionRestart(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �������ά�μ���
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let behavior : ar4x::ecuc::RteInitializationBehavior = ecuc::RteInitializationBehavior.allInstances()\n\t\t\t\t\t->select(rteSectionInitializationPolicy\n\t\t\t\t\t\t->includes(getSectionInitializationPolicy(this_)))\n\t\t\t\t\t->any(true)\n\t\t\t\tin if behavior.oclIsUndefined()\n\t\t\t\t\tthen ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START\n\t\t\t\t\telse behavior.rteInitializationStrategy\n\t\t\t\t\tendif'"
	 * @generated
	 */
	RteInitializationStrategyEnum getInitializationStrategy(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �������ά�μ���
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.String" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swAddrMethod.sectionInitializationPolicy\n\t\t\t\t\tendif'"
	 * @generated
	 */
	String getSectionInitializationPolicy(VariableDataPrototype this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SwAddrMethod�μ����ʺ���������θ��
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swAddrMethod : m2::SwAddrMethod = this_.getSwAddrMethod()\n\t\t\t\tin if not swAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen swAddrMethod\n\t\t\t\t\telse if not this_.getImplementationDataType().oclIsUndefined()\n\t\t\t\t\tthen this_.getImplementationDataType().getLeafImplementationDataType()\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod(VariableDataPrototype this_);

} // VariableDataPrototypeEx
