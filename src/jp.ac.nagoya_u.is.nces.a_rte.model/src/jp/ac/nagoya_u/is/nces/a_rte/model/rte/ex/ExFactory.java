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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage
 * @generated
 */
public interface ExFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Value Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Value Ex</em>'.
	 * @generated
	 */
	TimeValueEx createTimeValueEx();

	/**
	 * Returns a new object of class '<em>Alignment Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alignment Type Ex</em>'.
	 * @generated
	 */
	AlignmentTypeEx createAlignmentTypeEx();

	/**
	 * Returns a new object of class '<em>Receiver Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver Ex</em>'.
	 * @generated
	 */
	ReceiverEx createReceiverEx();

	/**
	 * Returns a new object of class '<em>External Ecu Sender Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Sender Ex</em>'.
	 * @generated
	 */
	ExternalEcuSenderEx createExternalEcuSenderEx();

	/**
	 * Returns a new object of class '<em>Entity Starter Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Starter Ex</em>'.
	 * @generated
	 */
	EntityStarterEx createEntityStarterEx();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity Ex</em>'.
	 * @generated
	 */
	BswSchedulableEntityEx createBswSchedulableEntityEx();

	/**
	 * Returns a new object of class '<em>Mode Declaration Group Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Declaration Group Prototype Ex</em>'.
	 * @generated
	 */
	ModeDeclarationGroupPrototypeEx createModeDeclarationGroupPrototypeEx();

	/**
	 * Returns a new object of class '<em>Assembly Data Instance Connector Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Data Instance Connector Ex</em>'.
	 * @generated
	 */
	AssemblyDataInstanceConnectorEx createAssemblyDataInstanceConnectorEx();

	/**
	 * Returns a new object of class '<em>Variable Data Instance In Composition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Instance In Composition Ex</em>'.
	 * @generated
	 */
	VariableDataInstanceInCompositionEx createVariableDataInstanceInCompositionEx();

	/**
	 * Returns a new object of class '<em>Com Signal Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal Ex</em>'.
	 * @generated
	 */
	ComSignalEx createComSignalEx();

	/**
	 * Returns a new object of class '<em>Com Signal Group Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal Group Ex</em>'.
	 * @generated
	 */
	ComSignalGroupEx createComSignalGroupEx();

	/**
	 * Returns a new object of class '<em>Variable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Instance In Swc Ex</em>'.
	 * @generated
	 */
	VariableDataInstanceInSwcEx createVariableDataInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>RVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RVariable Data Instance In Swc Ex</em>'.
	 * @generated
	 */
	RVariableDataInstanceInSwcEx createRVariableDataInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>PVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PVariable Data Instance In Swc Ex</em>'.
	 * @generated
	 */
	PVariableDataInstanceInSwcEx createPVariableDataInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>ROperation Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROperation Instance In Swc Ex</em>'.
	 * @generated
	 */
	ROperationInstanceInSwcEx createROperationInstanceInSwcEx();

	/**
	 * Returns a new object of class '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * @generated
	 */
	SenderReceiverToSignalMappingEx createSenderReceiverToSignalMappingEx();

	/**
	 * Returns a new object of class '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * @generated
	 */
	SenderReceiverToSignalGroupMappingEx createSenderReceiverToSignalGroupMappingEx();

	/**
	 * Returns a new object of class '<em>Os Task Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Ex</em>'.
	 * @generated
	 */
	OsTaskEx createOsTaskEx();

	/**
	 * Returns a new object of class '<em>Ecuc Partition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecuc Partition Ex</em>'.
	 * @generated
	 */
	EcucPartitionEx createEcucPartitionEx();

	/**
	 * Returns a new object of class '<em>Variable Data Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Prototype Ex</em>'.
	 * @generated
	 */
	VariableDataPrototypeEx createVariableDataPrototypeEx();

	/**
	 * Returns a new object of class '<em>Atomic Sw Component Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Sw Component Type Ex</em>'.
	 * @generated
	 */
	AtomicSwComponentTypeEx createAtomicSwComponentTypeEx();

	/**
	 * Returns a new object of class '<em>Value Specification Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification Ex</em>'.
	 * @generated
	 */
	ValueSpecificationEx createValueSpecificationEx();

	/**
	 * Returns a new object of class '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * @generated
	 */
	NonqueuedSenderComSpecEx createNonqueuedSenderComSpecEx();

	/**
	 * Returns a new object of class '<em>Compu Method Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Method Ex</em>'.
	 * @generated
	 */
	CompuMethodEx createCompuMethodEx();

	/**
	 * Returns a new object of class '<em>Compu Scale Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compu Scale Ex</em>'.
	 * @generated
	 */
	CompuScaleEx createCompuScaleEx();

	/**
	 * Returns a new object of class '<em>Application Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Data Type Ex</em>'.
	 * @generated
	 */
	ApplicationDataTypeEx createApplicationDataTypeEx();

	/**
	 * Returns a new object of class '<em>Implementation Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Data Type Ex</em>'.
	 * @generated
	 */
	ImplementationDataTypeEx createImplementationDataTypeEx();

	/**
	 * Returns a new object of class '<em>Exclusive Area Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Area Ex</em>'.
	 * @generated
	 */
	ExclusiveAreaEx createExclusiveAreaEx();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExPackage getExPackage();

} //ExFactory
