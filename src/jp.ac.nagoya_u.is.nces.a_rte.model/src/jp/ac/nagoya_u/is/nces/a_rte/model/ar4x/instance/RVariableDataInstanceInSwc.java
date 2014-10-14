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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RVariable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getContextRPort <em>Context RPort</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getRVariableDataInstanceInSwc()
 * @model
 * @generated
 */
public interface RVariableDataInstanceInSwc extends VariableDataInstanceInSwc {

	/**
	 * Returns the value of the '<em><b>Context RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context RPort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context RPort</em>' reference.
	 * @see #setContextRPort(RPortPrototype)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getRVariableDataInstanceInSwc_ContextRPort()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='contextPort.oclAsType(m2::RPortPrototype)'"
	 * @generated
	 */
	RPortPrototype getContextRPort();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getContextRPort <em>Context RPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context RPort</em>' reference.
	 * @see #getContextRPort()
	 * @generated
	 */
	void setContextRPort(RPortPrototype value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if getFilter().oclIsUndefined()\n\t\t\t\t\tthen false\n\t\t\t\t\telse getFilter().isFilterEnabled()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	Boolean isFilterEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let filter : m2::DataFilter = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec).filter\n\t\t\t\tin if filter.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse filter\n\t\t\t\t\tendif'"
	 * @generated
	 */
	DataFilter getFilter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let comSpec : m2::NonqueuedReceiverComSpec = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec)\n\t\t\t\tin not comSpec.oclIsUndefined() and comSpec.aliveTimeout <> 0'"
	 * @generated
	 */
	Boolean isAliveTimeoutEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ̵������ͭ�����ɤ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not getInvalidationPolicy().oclIsUndefined() and getInvalidationPolicy().isInvalidationEnabled().oclAsType(Boolean)'"
	 * @generated
	 */
	Boolean isInvalidationEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ̵���ͽ�����ˡ�μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='contextRPort.requiredInterface.oclAsType(m2::SenderReceiverInterface).invalidationPolicy\n\t\t\t\t\t->any(dataElement = self.prototype)'"
	 * @generated
	 */
	InvalidationPolicy getInvalidationPolicy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let initValue : m2::ValueSpecification = getComSpec().oclAsType(m2::NonqueuedReceiverComSpec).initValue\n\t\t\t\tin if initValue.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse initValue\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getInitValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PositiveInteger" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let comSpec : m2::QueuedReceiverComSpec = getComSpec().oclAsType(m2::QueuedReceiverComSpec)\n\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse comSpec.queueLength\n\t\t\t\t\tendif'"
	 * @generated
	 */
	Integer getQueueLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let comSpec : m2::ReceiverComSpec = contextRPort.requiredComSpec.oclAsType(m2::ReceiverComSpec)->any(dataElement = self.prototype)\n\t\t\t\t\t\t\t\tin if comSpec.oclIsUndefined()\n\t\t\t\t\t\t\t\t\tthen null\n\t\t\t\t\t\t\t\t\telse comSpec\n\t\t\t\t\t\t\t\tendif'"
	 * @generated
	 */
	ReceiverComSpec getComSpec();

} // RVariableDataInstanceInSwc
