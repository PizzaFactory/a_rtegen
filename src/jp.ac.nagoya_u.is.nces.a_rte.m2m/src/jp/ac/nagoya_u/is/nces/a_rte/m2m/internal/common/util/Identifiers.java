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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;

/**
 * ���̻Ҥ��󶡤��ޤ���
 */
public class Identifiers { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)

	// RTE��ͽ�󤵤�Ƥ��뼱�̻ҤΤ������Ƭ��
	public static final String RTE_ID_PREFIX = "Rte_";

	// �١������Υ��󥳡��ǥ���̾
	public static final String BASE_TYPE_ENCODING_NONE = "NONE";
	public static final String BASE_TYPE_ENCODING_BOOLEAN = "BOOLEAN";
	public static final String BASE_TYPE_ENCODING_IEEE754 = "IEEE754";

	// ���եȥ��������ɥ�å��������μ��̡�������ݥꥷ�������饤����Ȥ����̾
	public static final String SECTION_TYPE_VAR = "VAR";
	public static final String SECTION_TYPE_CODE = "CODE";
	public static final String SECTION_INITIALIZATION_POLICY_INIT = "INIT";
	public static final String ALIGNMENT_TYPE_UNSPECIFIED = "UNSPECIFIED";

	// �����AUTOSAR��ե����
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

	public static final String COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME = "Rte_ComSendSignalTf";
	public static final String COM_SEND_SIGNAL_GROUP_TRUSTED_FUNCTION_NAME = "Rte_ComSendSignalGroupTf";
	
	public static final String COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME = "Rte_ComSendSignalProxyImmediateTask";
	public static final String COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME = "Rte_ComSendSignalProxyImmediateEvent";

	public static final String RTE_INTERNAL_SPINLOCK_NAME = "Rte_InternalSpinlock";


	public static String createOsIocCommunicationName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_ID_PREFIX + "Sr" + getImplExtension(dataInstanceInSwc);
	}

	public static String createOsIocCommunicationPeriodicDataName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable ecuc) {
		return RTE_ID_PREFIX + "ComProxyPeriodic" + getImplExtension(dataInstanceInSwc) + "_" + ecuc.getShortName();
	}

	public static String createOsIocCommunicationImmediateDataName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable ecuc) {
		return RTE_ID_PREFIX + "ComProxyImmediate" + getImplExtension(dataInstanceInSwc) + "_" + ecuc.getShortName();
	}

	public static String createOsIocCommunicationPeriodicName(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyPeriodic_" + proxyInteraction.getRequesterPartition().getShortName() + "_" + proxyInteraction.getSignalDataType().getShortName();
	}

	public static String createOsIocCommunicationImmediateName(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyImmediate_" + proxyInteraction.getRequesterPartition().getShortName() + "_" + proxyInteraction.getSignalDataType().getShortName();
	}
	
	public static String createOsIocCommunicationPeriodicComplexName(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyPeriodic_" + proxyInteraction.getRequesterPartition().getShortName() + "_ComplexDataType";
	}

	public static String createOsIocCommunicationImmediateComplexName(ComSendProxyInteraction proxyInteraction) {
		return RTE_ID_PREFIX + "ComProxyImmediate_" + proxyInteraction.getRequesterPartition().getShortName() + "_ComplexDataType";
	}

	public static String createProxyFunctionTableName(VariableDataInstanceInSwc dataInstanceInSwc, EcucReferrable signal) {
		return "RTE_SR_WRITE_PROXY_FUNCTION_TABLE_INDEX" + getImplExtension(dataInstanceInSwc) + "_" + signal.getShortName();
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

	public static String createRteBufferWriteTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrWriteTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferSendTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrSendTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}
	
	public static String createRteBufferInvalidateTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return RTE_ID_PREFIX + "SrInvalidateTf" + getImplExtension(pDataInstanceInComposition.getPrototype()) + getImplExtension(rDataInstanceInComposition.getPrototype());
	}

	public static String getImplExtension(VariableDataInstanceInSwc dataInstanceInSwc) {
		return "_" + dataInstanceInSwc.getContextPort().getParent().getShortName() + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String getExtension(VariableDataInstanceInSwc dataInstanceInSwc) {
		return "_" + dataInstanceInSwc.getContextPort().getShortName() + "_" + dataInstanceInSwc.getPrototype().getShortName();
	}

	public static String getImplExtension(OperationInstanceInSwc operationInstanceInSwc) {
		return "_" + operationInstanceInSwc.getContextPort().getParent().getShortName() + Identifiers.getExtension(operationInstanceInSwc);
	}

	public static String getExtension(OperationInstanceInSwc operationInstanceInSwc) {
		return "_" + operationInstanceInSwc.getContextPort().getShortName() + "_" + operationInstanceInSwc.getPrototype().getShortName();
	}

	public static String getImplExtension(ExclusiveArea exclusiveArea) {
		return "_" + exclusiveArea.getParent().getParent().getShortName() + getExtension(exclusiveArea);
	}

	public static String getExtension(ExclusiveArea exclusiveArea) {
		return "_" + exclusiveArea.getShortName();
	}

	public static String getImplExtension(OsTask osTask, OsEvent osEvent) {
		return "_" + osTask.getShortName() + getOsEventPostfix(osEvent);
	}

	public static String getImplExtension(OsTask osTask, OsEvent osEvent, ExecutableEntity executableEntity) {
		String implExtension = "";
		if (executableEntity instanceof RunnableEntity) {
			// NOTE ����ܥ�̾�ν�ʣ���򤱤뤿�ᡤ���ʥ֥�Υ��硼�ȥ͡���ǤϤʤ�������ܥ�̾����Ѥ��롥
			implExtension = getImplExtension(osTask, osEvent) + "_" + ((RunnableEntity) executableEntity).getSymbol();
		} else if (executableEntity instanceof BswSchedulableEntity) { // COVERAGE ���true(RunnableEntity, BswSchedulableEntity�Τ��о�)
			// NOTE ModuleEntry�Υ��硼�ȥ͡������Ѥ��롥
			implExtension = getImplExtension(osTask, osEvent) + "_" + ((BswSchedulableEntity) executableEntity).getImplementedEntry().getShortName();
		}
		return implExtension;
	}

	private static String getOsEventPostfix(OsEvent osEvent) {
		return osEvent == null ? "" : "_" + osEvent.getShortName();
	}

	public static String getExtension(EcucPartition sourcePartition) {
		return "_" + sourcePartition.getShortName();
	}

	public static String getImplExtension(PortPrototype port) {
		return "_" + port.getParent().getShortName() + "_" + port.getShortName();
	}
}
