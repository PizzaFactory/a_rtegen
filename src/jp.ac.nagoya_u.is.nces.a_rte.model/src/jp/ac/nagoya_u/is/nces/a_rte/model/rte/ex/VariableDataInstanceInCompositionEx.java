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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Instance In Composition Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getValueSpecificationEx <em>Value Specification Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataInstanceInCompositionEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface VariableDataInstanceInCompositionEx extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Value Specification Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Specification Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Specification Ex</em>' reference.
	 * @see #setValueSpecificationEx(ValueSpecificationEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getVariableDataInstanceInCompositionEx_ValueSpecificationEx()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecificationEx getValueSpecificationEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getValueSpecificationEx <em>Value Specification Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Specification Ex</em>' reference.
	 * @see #getValueSpecificationEx()
	 * @generated
	 */
	void setValueSpecificationEx(ValueSpecificationEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let swComponentInstance : instance::SwComponentInstanceInSystem = this_.parent.contextComponent.instance\n\t\t\t\t\t->first()\n\t\t\t\tin if swComponentInstance.oclIsUndefined() or swComponentInstance.ownerPartition->isEmpty()\n\t\t\t\t\tthen null\n\t\t\t\t\telse swComponentInstance.ownerPartition->any(true)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EcucPartition getPartition(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ������˽�������뤫
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION or\n\t\t\t\t\tinitStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART'"
	 * @generated
	 */
	Boolean initAtDeclaration(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTE�γ��ϻ��˽�������뤫
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START or initStrategy =\n\t\t\t\t\tecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	Boolean initAtStart(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �ѡ��ƥ������κƵ�ư���˽�������뤫
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initStrategy : ecuc::RteInitializationStrategyEnum =\n\t\t\t\t\tgetInitializationStrategy(this_.prototype)\n\t\t\t\tin initStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART or\n\t\t\t\t\tinitStrategy = ecuc::RteInitializationStrategyEnum::RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART'"
	 * @generated
	 */
	Boolean initAtPartitionRestart(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.String" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initValue : m2::ValueSpecification = getInitValue(this_)\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse valueSpecificationEx.getValueSpecAsText(initValue)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	String getInitValueAsText(VariableDataInstanceInComposition this_);

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
	RteInitializationStrategyEnum getInitializationStrategy(VariableDataInstanceInSwc this_);

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
	String getSectionInitializationPolicy(VariableDataInstanceInSwc this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ����ͤ�������롥
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let receiverInitValue : m2::ValueSpecification = getReceiverInitValue(this_) , senderInitValue :\n\t\t\t\t\tm2::ValueSpecification = getSenderInitValue(this_)\n\t\t\t\tin if not receiverInitValue.oclIsUndefined()\n\t\t\t\t\tthen receiverInitValue\n\t\t\t\t\telse senderInitValue\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getInitValue(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::RVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\telse\n\t\t\t\t\tlet initValue : m2::ValueSpecification =\n\t\t\t\t\t\tthis_.requesterConnection.requester.prototype.oclAsType(instance::RVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse initValue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getReceiverInitValue(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::PVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.oclAsType(instance::PVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\telse\n\t\t\t\t\tlet initValue : m2::ValueSpecification =\n\t\t\t\t\t\tthis_.providerConnection.provider.prototype.oclAsType(instance::PVariableDataInstanceInSwc).getInitValue()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse initValue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getSenderInitValue(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���եȥ��������ɥ�å��������μ���
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let receiverSwAddrMethod : m2::SwAddrMethod = getReceiverSwAddrMethod(this_) , senderSwAddrMethod :\n\t\t\t\t\tm2::SwAddrMethod = getSenderSwAddrMethod(this_)\n\t\t\t\tin if not senderSwAddrMethod.oclIsUndefined()\n\t\t\t\t\tthen senderSwAddrMethod\n\t\t\t\t\telse receiverSwAddrMethod\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::RVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.getSwAddrMethod()\n\t\t\t\t\telse\n\t\t\t\t\tlet swAddrMethod : m2::SwAddrMethod =\n\t\t\t\t\t\tthis_.requesterConnection.requester.prototype.getSwAddrMethod()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse swAddrMethod\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwAddrMethod getReceiverSwAddrMethod(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.prototype.oclIsKindOf(instance::PVariableDataInstanceInSwc)\n\t\t\t\t\tthen this_.prototype.getSwAddrMethod()\n\t\t\t\t\telse\n\t\t\t\t\tlet swAddrMethod : m2::SwAddrMethod =\n\t\t\t\t\t\tthis_.providerConnection.provider.prototype.getSwAddrMethod()\n\t\t\t\t\t\t->any(not oclIsUndefined())\n\t\t\t\t\tin if swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen null\n\t\t\t\t\t\telse swAddrMethod\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwAddrMethod getSenderSwAddrMethod(VariableDataInstanceInComposition this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" v1Required="true" v2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet initValue1 : m2::ValueSpecification = getInitValue(v1),\n\t\t\t\t\tinitValue2 : m2::ValueSpecification = getInitValue(v2)\n\t\t\t\tin\n\t\t\t\tif initValue1.oclIsUndefined() and initValue2.oclIsUndefined() then\n\t\t\t\t\ttrue\n\t\t\t\telse if initValue1.oclIsUndefined() or initValue2.oclIsUndefined() then\n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\tvalueSpecificationEx.equalsInitValue(initValue1, initValue2)\n\t\t\t\tendif endif'"
	 * @generated
	 */
	Boolean equalsInitValue(VariableDataInstanceInComposition v1, VariableDataInstanceInComposition v2);

} // VariableDataInstanceInCompositionEx
