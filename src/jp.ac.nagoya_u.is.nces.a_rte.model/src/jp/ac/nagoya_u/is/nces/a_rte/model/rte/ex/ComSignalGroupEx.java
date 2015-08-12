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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Signal Group Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#getSenderReceiverToSignalGroupMappingEx <em>Sender Receiver To Signal Group Mapping Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getComSignalGroupEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ComSignalGroupEx extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Sender Receiver To Signal Group Mapping Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Receiver To Signal Group Mapping Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Receiver To Signal Group Mapping Ex</em>' reference.
	 * @see #setSenderReceiverToSignalGroupMappingEx(SenderReceiverToSignalGroupMappingEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getComSignalGroupEx_SenderReceiverToSignalGroupMappingEx()
	 * @model required="true"
	 * @generated
	 */
	SenderReceiverToSignalGroupMappingEx getSenderReceiverToSignalGroupMappingEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx#getSenderReceiverToSignalGroupMappingEx <em>Sender Receiver To Signal Group Mapping Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Receiver To Signal Group Mapping Ex</em>' reference.
	 * @see #getSenderReceiverToSignalGroupMappingEx()
	 * @generated
	 */
	void setSenderReceiverToSignalGroupMappingEx(SenderReceiverToSignalGroupMappingEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getVariableDataInstanceInCompositions(this_)\n\t\t\t\t\t->exists(isProvided())'"
	 * @generated
	 */
	Boolean isSender(ComSignalGroup this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getVariableDataInstanceInCompositions(this_)\n\t\t\t\t\t->exists(isRequired())'"
	 * @generated
	 */
	Boolean isReceiver(ComSignalGroup this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VariableDataInstanceInComposition �����
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let systemSignalGroup : ar4x::m2::SystemSignalGroup = this_.comSystemTemplateSignalGroup.iSignalGroup.systemSignalGroup\n\t\t\t\tin if systemSignalGroup.oclIsUndefined()\n\t\t\t\t\tthen OrderedSet{}\n\t\t\t\t\telse ar4x::m2::SenderReceiverToSignalGroupMapping.allInstances()\n\t\t\t\t\t\t->select(m | m.signalGroup = systemSignalGroup)\n\t\t\t\t\t\t->collect(m | senderReceiverToSignalGroupMappingEx.getMappedDataInstanceInComposition(m))\n\t\t\t\t\t\t->select(not oclIsUndefined())\n\t\t\t\t\t\t->asOrderedSet()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EList<VariableDataInstanceInComposition> getVariableDataInstanceInCompositions(ComSignalGroup this_);

} // ComSignalGroupEx
