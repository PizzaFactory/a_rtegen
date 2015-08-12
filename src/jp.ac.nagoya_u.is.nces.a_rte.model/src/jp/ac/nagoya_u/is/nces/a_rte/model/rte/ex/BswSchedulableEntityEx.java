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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bsw Schedulable Entity Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getBswSchedulableEntityEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface BswSchedulableEntityEx extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Mode Declaration Group Prototype Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Declaration Group Prototype Ex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Declaration Group Prototype Ex</em>' reference.
	 * @see #setModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getBswSchedulableEntityEx_ModeDeclarationGroupPrototypeEx()
	 * @model required="true"
	 * @generated
	 */
	ModeDeclarationGroupPrototypeEx getModeDeclarationGroupPrototypeEx();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx#getModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Declaration Group Prototype Ex</em>' reference.
	 * @see #getModeDeclarationGroupPrototypeEx()
	 * @generated
	 */
	void setModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSW�������塼��֥�˥����������Ƥ���ѡ��ƥ�������������롣
	 * NOTE validation������BswImplementation�Υ����å�������Ƥ��뤬�����褳�Υ��ڥ졼�����˴ޤ��٤������׸�Ƥ��
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if ar4x::m2::BswImplementation.allInstances()->exists(behavior = this_.parent) then\n\t\t\t\t\t\t\tgetCallRootBswSchedulableEntities(this_)->collect(m | getMappedTasks(m)).ownerApplication.osAppEcucPartition->asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tSet{}\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	EList<EcucPartition> getUsingPartition(BswSchedulableEntity this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ������ĥ꡼�Υ롼�Ȥ˰��֤���BSW�������塼��֥��������롣
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 * @generated
	 */
	EList<BswSchedulableEntity> getCallRootBswSchedulableEntities(BswSchedulableEntity this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSW�������塼��֥��ľ�ܥޥåԥ󥰤���륿������������롣
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='this_.event.config->select(not rteBswMappedToTask.oclIsUndefined()).rteBswMappedToTask->asSet()'"
	 * @generated
	 */
	EList<OsTask> getMappedTasks(BswSchedulableEntity this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSW�������塼��֥�θƤӽФ�����BSW�������塼��֥��������롣
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getCallerBswSchedulableEntitiesByMode(this_)'"
	 * @generated
	 */
	EList<BswSchedulableEntity> getCallerBswSchedulableEntities(BswSchedulableEntity this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSW�������塼��֥�θƤӽФ�����BSW�������塼��֥���������(�⡼��Ϣ��)��
	 * <!-- end-model-doc -->
	 * @model ordered="false" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let sourceEvent : Set(ar4x::m2::BswModeSwitchEvent) = this_.event->select(oclIsKindOf(ar4x::m2::BswModeSwitchEvent)).oclAsType(ar4x::m2::BswModeSwitchEvent)->select(config->exists(rteBswMappedToTask.oclIsUndefined()))->asSet(),\n\t\t\t\t\t\teventSourceRequiredModePrototypes : Set(ar4x::m2::ModeDeclarationGroupPrototype) = sourceEvent.modeIref.contextModeDeclarationGroup->select(m | this_.accessedModeGroup->includes(m))->asSet(),\n\t\t\t\t\t\teventSourceProvidedModePrototypes : Set(ar4x::m2::ModeDeclarationGroupPrototype) = eventSourceRequiredModePrototypes->collect(m | modeDeclarationGroupPrototypeEx.getConnectedProvidedModePrototypes(m))->asSet()\n\t\t\t\t\t\tin eventSourceProvidedModePrototypes->collect(m | modeDeclarationGroupPrototypeEx.getModeManagerBswSchedulableEntities(m))->asSet()'"
	 * @generated
	 */
	EList<BswSchedulableEntity> getCallerBswSchedulableEntitiesByMode(BswSchedulableEntity this_);

} // BswSchedulableEntityEx
