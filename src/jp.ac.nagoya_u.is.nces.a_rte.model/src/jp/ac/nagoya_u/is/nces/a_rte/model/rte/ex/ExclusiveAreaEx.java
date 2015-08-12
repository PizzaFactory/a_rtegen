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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Area Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#getBswSchedulableEntityEx <em>Bsw Schedulable Entity Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getExclusiveAreaEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ExclusiveAreaEx extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Bsw Schedulable Entity Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsw Schedulable Entity Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsw Schedulable Entity Ex</em>' reference.
	 * @see #setBswSchedulableEntityEx(BswSchedulableEntityEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getExclusiveAreaEx_BswSchedulableEntityEx()
	 * @model required="true"
	 * @generated
	 */
	BswSchedulableEntityEx getBswSchedulableEntityEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx#getBswSchedulableEntityEx <em>Bsw Schedulable Entity Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsw Schedulable Entity Ex</em>' reference.
	 * @see #getBswSchedulableEntityEx()
	 * @generated
	 */
	void setBswSchedulableEntityEx(BswSchedulableEntityEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExclusiveArea�˥����������Ƥ���EcucPartition��������롣
	 * NOTE ������BSWM�Τߤ˥������åȤ�ʤä�EcucPartition�򸡺����Ƥ��뤿�ᡢSW-C��ExclusiveArea�˥�����������ѡ��ƥ������ϼ����Ǥ��ʤ����Ȥ���ա�
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let bswInternalBehavior : ar4x::m2::BswInternalBehavior = this_.parent.oclAsType(ar4x::m2::BswInternalBehavior)\n\t\t\t\t\t\tin\n\t\t\t\t\t\tbswInternalBehavior.bswSchedulableEntity->select(canEnterExclusiveArea->includes(this_))\n\t\t\t\t\t\t->union(bswInternalBehavior.bswSchedulableEntity->select(runsInsideExclusiveArea->includes(this_)))\n\t\t\t\t\t\t->collect(m | bswSchedulableEntityEx.getUsingPartition(m))->asSet()' pre_='this_.parent.oclIsKindOf(ar4x::m2::BswInternalBehavior)'"
	 * @generated
	 */
	EList<EcucPartition> getUsingPartitionsOfBswExclusiveArea(ExclusiveArea this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rte_Enter/Exit API���������뤫
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.parent.oclAsType(ar4x::m2::SwcInternalBehavior).runnable.canEnterExclusiveArea->includes(this_)' pre_='this_.parent.oclIsKindOf(ar4x::m2::SwcInternalBehavior)'"
	 * @generated
	 */
	boolean providesRteEnterExitApi(ExclusiveArea this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SchM_Enter/Exit API���������뤫
	 * <!-- end-model-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.parent.oclAsType(ar4x::m2::BswInternalBehavior).bswSchedulableEntity.canEnterExclusiveArea->includes(this_)' pre_='this_.parent.oclIsKindOf(ar4x::m2::BswInternalBehavior)'"
	 * @generated
	 */
	boolean providesSchmEnterExitApi(ExclusiveArea this_);

} // ExclusiveAreaEx
