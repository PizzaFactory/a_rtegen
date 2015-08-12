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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util;

import com.google.common.base.Optional;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;

/**
 * AUTOSAR����ե����졼�����μ��̻Ҥ��󶡡�
 * NOTE C����Υ���ܥ�̾�Ȥϰۤʤ뤳�Ȥ���ա�
 */
public class Identifiers { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)

	// RTE��ͽ�󤵤�Ƥ��뼱�̻ҤΤ������Ƭ��
	public static final String RTE_ID_PREFIX = "Rte_";

	// ���եȥ��������ɥ�å��������μ��̡�������ݥꥷ�������饤����Ȥ����̾
	public static final String SECTION_TYPE_VAR = "VAR";
	public static final String SECTION_TYPE_CODE = "CODE";
	public static final String SECTION_INITIALIZATION_POLICY_INIT = "INIT";
	public static final String ALIGNMENT_TYPE_UNSPECIFIED = "UNSPECIFIED";

	// RTE�����Ѥ��ȹ�AUTOSAR��ե����
	private static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE = M2ModelUtils.ID_PREFIX + "/Rte_InternalDataTypes/";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_UINT8 = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "uint8";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_UINT16 = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "uint16";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_UINT32 = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "uint32";
	public static final String RTE_INTERNAL_DATA_TYPE_REFERENCE_COM_SIGNAL_ID_TYPE = RTE_INTERNAL_DATA_TYPE_REFERENCE_BASE + "Com_SignalIdType";

	// �ǥե���ȤΥ��硼�ȥ͡���
	public static final String DEFAULT_OS_IOC_NAME = "osIoc";
	public static final String DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX = "osIocSenderProperties";
	public static final String DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME = "osIocReceiverProperties";
	public static final String DEFAULT_OS_IOC_DATA_PROPERTIES_NAME = "osIocDataProperties";
	public static final String DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME = DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX;

	public static final String COM_PROXY_SIGNAL_ID_DATA_NAME = "comSignalId";
	public static final String COM_PROXY_DATA_DATA_NAME = "comData";
	public static final String COM_PROXY_FUNCTION_INDEX_NAME = "funcIndex";

	public static final String COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME = RTE_ID_PREFIX + "ComSendSignalProxyImmediateTask";
	public static final String COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME = RTE_ID_PREFIX + "ComSendSignalProxyImmediateEvent";

	public static final String RTE_INTERNAL_SPINLOCK_NAME = RTE_ID_PREFIX + "InternalSpinlock";

	public static String createSrInterPartitionOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_ID_PREFIX + "Sr" + getImplExtension(dataInstanceInSwc);
	}

	public static String createPeriodicComProxyRequestOsIocCommunicationNameForPrimitiveType(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyPeriodic_" + proxyInteraction.getRequesterPartition().getShortName() + "_" + proxyInteraction.getSignalDataType().getShortName();
	}

	public static String createImmediateComProxyRequestOsIocCommunicationNameForPrimitiveType(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyImmediate_" + proxyInteraction.getRequesterPartition().getShortName() + "_" + proxyInteraction.getSignalDataType().getShortName();
	}
	
	public static String createPeriodicComProxyRequestOsIocCommunicationNameForComplexType(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyPeriodic_" + proxyInteraction.getRequesterPartition().getShortName() + "_ComplexDataType";
	}

	public static String createImmediateComProxyRequestOsIocCommunicationNameForComplexType(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyImmediate_" + proxyInteraction.getRequesterPartition().getShortName() + "_ComplexDataType";
	}

	public static String createPeriodicComProxyValueOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable comSignalOrComSignalGroup) {
		return RTE_ID_PREFIX + "ComProxyPeriodic" + getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createImmediateComProxyValueOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable comSignalOrComSignalGroup) {
		return RTE_ID_PREFIX + "ComProxyImmediate" + getImplExtension(dataInstanceInSwc) + "_" + comSignalOrComSignalGroup.getShortName();
	}

	public static String createOsIocSenderPropertiesName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX + getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createOsIocSenderPropertiesName(ComSignal comSignal) {
		// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
		// S/R�μ¸��������������ˤ��ѹ��Ȥʤ�ECU�֤Ǥ�IOC�Хåե�����Ѥ��ʤ��ʤä��ط���,���᥽�åɤϻ��Ѥ���ʤ�.
		return DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX + "_" + comSignal.getShortName();
	}

	public static String createOsIocSenderPropertiesName(ComSignalGroup comSignalGroup) {
		// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
		// S/R�μ¸��������������ˤ��ѹ��Ȥʤ�ECU�֤Ǥ�IOC�Хåե�����Ѥ��ʤ��ʤä��ط���,���᥽�åɤϻ��Ѥ���ʤ�.
		return DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME_PREFIX + "_" + comSignalGroup.getShortName();
	}

	public static String createSrRteBufferWriteTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrWriteTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}

	public static String createSrRteBufferSendTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrSendTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}
	
	public static String createSrRteBufferInvalidateTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrInvalidateTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}

	public static String createComSendSignalTrustedFunctionName(EcucPartition sourceMasterBswPartition) {
		return RTE_ID_PREFIX + "ComSendSignalTf" + "_" + sourceMasterBswPartition.getShortName();
	}

	public static String createComSendSignalGroupTrustedFunctionName(EcucPartition sourceMasterBswPartition) {
		return RTE_ID_PREFIX + "ComSendSignalGroupTf" + "_" + sourceMasterBswPartition.getShortName();
	}

	public static String createCsCallTfName(AtomicSwComponentType sourceSwComponentType) {
		return RTE_ID_PREFIX + "CsCallTf_" + sourceSwComponentType.getShortName();
	}

	public static String getApiExtension(VariableDataInstanceInSwc dataInstanceInSwc) {
		return "_" + dataInstanceInSwc.getContextPort().getShortName() + "_" + dataInstanceInSwc.getPrototype().getShortName();
	}

	public static String getImplExtension(VariableDataInstanceInSwc dataInstanceInSwc) {
		return "_" + dataInstanceInSwc.getContextPort().getParent().getShortName() + Identifiers.getApiExtension(dataInstanceInSwc);
	}

	public static String getApiExtension(OperationInstanceInSwc operationInstanceInSwc) {
		return "_" + operationInstanceInSwc.getContextPort().getShortName() + "_" + operationInstanceInSwc.getPrototype().getShortName();
	}

	public static String getImplExtension(OperationInstanceInSwc operationInstanceInSwc) {
		return "_" + operationInstanceInSwc.getContextPort().getParent().getShortName() + Identifiers.getApiExtension(operationInstanceInSwc);
	}

	public static String getApiExtension(ExclusiveArea exclusiveArea) {
		return "_" + exclusiveArea.getShortName();
	}

	public static String getImplExtension(ExclusiveArea exclusiveArea) {
		return "_" + exclusiveArea.getParent().getParent().getShortName() + getApiExtension(exclusiveArea);
	}

	public static String getImplExtension(OsTask osTask, Optional<OsEvent> osEvent) {
		return "_" + osTask.getShortName() + getOsEventPostfix(osEvent);
	}

	public static String getImplExtension(OsTask osTask, Optional<OsEvent> osEvent, ExecutableEntity executableEntity) {
		String implExtension = "";
		if (executableEntity instanceof RunnableEntity) {
			// NOTE ����ܥ�̾�ν�ʣ���򤱤뤿�ᡤ���ʥ֥�Υ��硼�ȥ͡���ǤϤʤ�������ܥ�̾����Ѥ��롥
			implExtension = getImplExtension(osTask, osEvent) + "_" + ((RunnableEntity) executableEntity).getSymbol();
		} else if (executableEntity instanceof BswSchedulableEntity) { // COVERAGE ���true(RunnableEntity, BswSchedulableEntity�Τ��о�)
			// NOTE ModuleEntry�Υ��硼�ȥ͡������Ѥ��롥
			BswSchedulableEntity bswSchedulableEntity = (BswSchedulableEntity) executableEntity;
			implExtension = getImplExtension(osTask, osEvent)
							+ "_" + bswSchedulableEntity.getParent().getParent().getShortName()
							+ "_" + bswSchedulableEntity.getImplementedEntry().getShortName();
		}
		return implExtension;
	}

	private static String getOsEventPostfix(Optional<OsEvent> osEvent) {
		return !osEvent.isPresent() ? "" : "_" + osEvent.get().getShortName();
	}

	public static String getExtension(EcucPartition sourcePartition) {
		return "_" + sourcePartition.getShortName();
	}

	public static String getImplExtension(PortPrototype port) {
		return "_" + port.getParent().getShortName() + "_" + port.getShortName();
	}

	public static String getBswSchedulerNamePrefix(BswModuleDescription sourceBswModuleDescription) {
		// ��������ñ���BswModuleDescription�Υ��硼�ȥ͡����<bsnp>�Ȥ���.
		// BswSchedulerNamePrefix���饹����Ѥ���<bsnp>�������б�������ϡ��ܴؿ��������뤳��.
		return sourceBswModuleDescription.getShortName();
	}
}
