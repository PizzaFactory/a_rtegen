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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage
 * @generated
 */
public class ExSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExSwitch() {
		if (modelPackage == null) {
			modelPackage = ExPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExPackage.TIME_VALUE_EX: {
				TimeValueEx timeValueEx = (TimeValueEx)theEObject;
				T result = caseTimeValueEx(timeValueEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ALIGNMENT_TYPE_EX: {
				AlignmentTypeEx alignmentTypeEx = (AlignmentTypeEx)theEObject;
				T result = caseAlignmentTypeEx(alignmentTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ATOMIC_SW_COMPONENT_TYPE_EX: {
				AtomicSwComponentTypeEx atomicSwComponentTypeEx = (AtomicSwComponentTypeEx)theEObject;
				T result = caseAtomicSwComponentTypeEx(atomicSwComponentTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VALUE_SPECIFICATION_EX: {
				ValueSpecificationEx valueSpecificationEx = (ValueSpecificationEx)theEObject;
				T result = caseValueSpecificationEx(valueSpecificationEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.NONQUEUED_SENDER_COM_SPEC_EX: {
				NonqueuedSenderComSpecEx nonqueuedSenderComSpecEx = (NonqueuedSenderComSpecEx)theEObject;
				T result = caseNonqueuedSenderComSpecEx(nonqueuedSenderComSpecEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COMPU_METHOD_EX: {
				CompuMethodEx compuMethodEx = (CompuMethodEx)theEObject;
				T result = caseCompuMethodEx(compuMethodEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COMPU_SCALE_EX: {
				CompuScaleEx compuScaleEx = (CompuScaleEx)theEObject;
				T result = caseCompuScaleEx(compuScaleEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.APPLICATION_DATA_TYPE_EX: {
				ApplicationDataTypeEx applicationDataTypeEx = (ApplicationDataTypeEx)theEObject;
				T result = caseApplicationDataTypeEx(applicationDataTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX: {
				ImplementationDataTypeEx implementationDataTypeEx = (ImplementationDataTypeEx)theEObject;
				T result = caseImplementationDataTypeEx(implementationDataTypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.EXCLUSIVE_AREA_EX: {
				ExclusiveAreaEx exclusiveAreaEx = (ExclusiveAreaEx)theEObject;
				T result = caseExclusiveAreaEx(exclusiveAreaEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX: {
				SenderReceiverToSignalMappingEx senderReceiverToSignalMappingEx = (SenderReceiverToSignalMappingEx)theEObject;
				T result = caseSenderReceiverToSignalMappingEx(senderReceiverToSignalMappingEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX: {
				SenderReceiverToSignalGroupMappingEx senderReceiverToSignalGroupMappingEx = (SenderReceiverToSignalGroupMappingEx)theEObject;
				T result = caseSenderReceiverToSignalGroupMappingEx(senderReceiverToSignalGroupMappingEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.OS_TASK_EX: {
				OsTaskEx osTaskEx = (OsTaskEx)theEObject;
				T result = caseOsTaskEx(osTaskEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COM_SIGNAL_EX: {
				ComSignalEx comSignalEx = (ComSignalEx)theEObject;
				T result = caseComSignalEx(comSignalEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.COM_SIGNAL_GROUP_EX: {
				ComSignalGroupEx comSignalGroupEx = (ComSignalGroupEx)theEObject;
				T result = caseComSignalGroupEx(comSignalGroupEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ECUC_PARTITION_EX: {
				EcucPartitionEx ecucPartitionEx = (EcucPartitionEx)theEObject;
				T result = caseEcucPartitionEx(ecucPartitionEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX: {
				VariableDataPrototypeEx variableDataPrototypeEx = (VariableDataPrototypeEx)theEObject;
				T result = caseVariableDataPrototypeEx(variableDataPrototypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX: {
				VariableDataInstanceInCompositionEx variableDataInstanceInCompositionEx = (VariableDataInstanceInCompositionEx)theEObject;
				T result = caseVariableDataInstanceInCompositionEx(variableDataInstanceInCompositionEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX: {
				VariableDataInstanceInSwcEx variableDataInstanceInSwcEx = (VariableDataInstanceInSwcEx)theEObject;
				T result = caseVariableDataInstanceInSwcEx(variableDataInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.PVARIABLE_DATA_INSTANCE_IN_SWC_EX: {
				PVariableDataInstanceInSwcEx pVariableDataInstanceInSwcEx = (PVariableDataInstanceInSwcEx)theEObject;
				T result = casePVariableDataInstanceInSwcEx(pVariableDataInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.RVARIABLE_DATA_INSTANCE_IN_SWC_EX: {
				RVariableDataInstanceInSwcEx rVariableDataInstanceInSwcEx = (RVariableDataInstanceInSwcEx)theEObject;
				T result = caseRVariableDataInstanceInSwcEx(rVariableDataInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ROPERATION_INSTANCE_IN_SWC_EX: {
				ROperationInstanceInSwcEx rOperationInstanceInSwcEx = (ROperationInstanceInSwcEx)theEObject;
				T result = caseROperationInstanceInSwcEx(rOperationInstanceInSwcEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX: {
				AssemblyDataInstanceConnectorEx assemblyDataInstanceConnectorEx = (AssemblyDataInstanceConnectorEx)theEObject;
				T result = caseAssemblyDataInstanceConnectorEx(assemblyDataInstanceConnectorEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.RECEIVER_EX: {
				ReceiverEx receiverEx = (ReceiverEx)theEObject;
				T result = caseReceiverEx(receiverEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.EXTERNAL_ECU_SENDER_EX: {
				ExternalEcuSenderEx externalEcuSenderEx = (ExternalEcuSenderEx)theEObject;
				T result = caseExternalEcuSenderEx(externalEcuSenderEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.ENTITY_STARTER_EX: {
				EntityStarterEx entityStarterEx = (EntityStarterEx)theEObject;
				T result = caseEntityStarterEx(entityStarterEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX: {
				BswSchedulableEntityEx bswSchedulableEntityEx = (BswSchedulableEntityEx)theEObject;
				T result = caseBswSchedulableEntityEx(bswSchedulableEntityEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExPackage.MODE_DECLARATION_GROUP_PROTOTYPE_EX: {
				ModeDeclarationGroupPrototypeEx modeDeclarationGroupPrototypeEx = (ModeDeclarationGroupPrototypeEx)theEObject;
				T result = caseModeDeclarationGroupPrototypeEx(modeDeclarationGroupPrototypeEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValueEx(TimeValueEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentTypeEx(AlignmentTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiverEx(ReceiverEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Ecu Sender Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Ecu Sender Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEcuSenderEx(ExternalEcuSenderEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Starter Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Starter Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStarterEx(EntityStarterEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswSchedulableEntityEx(BswSchedulableEntityEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Declaration Group Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Declaration Group Prototype Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyDataInstanceConnectorEx(AssemblyDataInstanceConnectorEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInCompositionEx(VariableDataInstanceInCompositionEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalEx(ComSignalEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Signal Group Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Signal Group Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSignalGroupEx(ComSignalGroupEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInSwcEx(VariableDataInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRVariableDataInstanceInSwcEx(RVariableDataInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVariableDataInstanceInSwcEx(PVariableDataInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROperation Instance In Swc Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROperation Instance In Swc Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROperationInstanceInSwcEx(ROperationInstanceInSwcEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Mapping Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverToSignalMappingEx(SenderReceiverToSignalMappingEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver To Signal Group Mapping Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderReceiverToSignalGroupMappingEx(SenderReceiverToSignalGroupMappingEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskEx(OsTaskEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecuc Partition Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecuc Partition Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcucPartitionEx(EcucPartitionEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Prototype Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Prototype Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataPrototypeEx(VariableDataPrototypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Sw Component Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Sw Component Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicSwComponentTypeEx(AtomicSwComponentTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationEx(ValueSpecificationEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonqueued Sender Com Spec Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonqueuedSenderComSpecEx(NonqueuedSenderComSpecEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Method Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Method Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuMethodEx(CompuMethodEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compu Scale Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compu Scale Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuScaleEx(CompuScaleEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Data Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDataTypeEx(ApplicationDataTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Data Type Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Data Type Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationDataTypeEx(ImplementationDataTypeEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Area Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Area Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveAreaEx(ExclusiveAreaEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExSwitch
