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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;

import com.google.common.base.Optional;
import com.google.common.base.Strings;

/**
 * ��������RTE��������������ǻ��Ѥ��뼱�̻Ҥ��󶡤��ޤ���
 */
public class SymbolNames {

	// ����ܥ����Ƭ��
	private static final String IOC_SYMBOL_NAME_PREFIX = "Ioc";
	private static final String RTE_SYMBOL_NAME_PREFIX = "Rte_";
	private static final String TRUSTED_FUNCTION_NAME_PREFIX = "TRUSTED_";
	private static final String SCHM_SYMBOL_NAME_PREFIX = "SchM_";

	// ����ޥåԥ󥰤Υ���ܥ�̾
	public static final String RTE_MEMORY_MAPPING_PREFIX = "RTE";

	// �ޥ���Υ���ܥ�̾
	public static final String OS_TRUSTED_MACRO = "TOPPERS_TRUSTED";
	public static final String OS_NON_TRUSTED_MACRO = "TOPPERS_NON_TRUSTED";

	// ���Υ���ܥ�̾
	public static final String VOID_TYPE_NAME = "void";
	public static final String BOOLEAN_TYPE_NAME = "boolean";
	public static final String UINT8_TYPE_NAME = "uint8";
	public static final String UINT16_TYPE_NAME = "uint16";
	public static final String UINT32_TYPE_NAME = "uint32";
	public static final String STD_RETURN_TYPE_NAME = "Std_ReturnType";
	public static final String OS_STATUS_TYPE_NAME = "StatusType";
	public static final String OS_APPLICATION_TYPE_NAME = "ApplicationType";
	public static final String OS_TASK_TYPE_NAME = "TaskType";
	public static final String OS_RESOURCE_TYPE_NAME = "ResourceType";
	public static final String OS_SPINLOCK_ID_TYPE_NAME = "SpinlockIdType";
	public static final String OS_EVENT_MASK_TYPE_NAME = "EventMaskType";
	public static final String OS_TRUSTED_FUNCTION_INDEX_TYPE_NAME = "TrustedFunctionIndexType";
	public static final String OS_TRUSTED_FUNCTION_PARAMETER_REF_TYPE_NAME = "TrustedFunctionParameterRefType";
	public static final String COM_SIGNAL_ID_TYPE_NAME = "Com_SignalIdType";
	public static final String COM_SEND_SIGNAL_TRUSTED_FUNCTION_PARAM_TYPE_NAME = "Rte_ComSendTrustedFunctionParamType";

	// ����Υ���ܥ�̾
	private static final String RTE_CONSTANT_NAME_PREFIX = "RTE_";
	public static final String RTE_E_OK_CONSTANT_NAME = "RTE_E_OK";
	public static final String RTE_E_INVALID_CONSTANT_NAME = "RTE_E_INVALID";
	public static final String RTE_E_MAX_AGE_EXCEEDED_CONSTANT_NAME = "RTE_E_MAX_AGE_EXCEEDED";

	// �ؿ��Υ���ܥ�̾
	private static final String OS_TASK_MACRO_NAME = "TASK";
	public static final String OS_SET_EVENT_API_NAME = "SetEvent";
	public static final String COM_SEND_SIGNAL_API_NAME = "Com_SendSignal";
	public static final String COM_RECEIVE_SIGNAL_API_NAME = "Com_ReceiveSignal";
	public static final String COM_SEND_SIGNAL_PERIODIC_ENTITY_NAME = "Rte_ComSendSignalProxyPeriodic";
	public static final String COM_SEND_SIGNAL_IMMEDIATE_ENTITY_NAME = "Rte_ComSendSignalProxyImmediate";
	public static final String COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME = TRUSTED_FUNCTION_NAME_PREFIX + "Rte_ComSendSignal";
	public static final String RTE_START_API_NAME = RTE_SYMBOL_NAME_PREFIX + "Start";
	public static final String RTE_STOP_API_NAME = RTE_SYMBOL_NAME_PREFIX + "Stop";
	public static final String SCHM_INIT_API_NAME = SCHM_SYMBOL_NAME_PREFIX + "Init";
	public static final String SCHM_DEINIT_API_NAME = SCHM_SYMBOL_NAME_PREFIX + "Deinit";

	// �����Υ���ܥ�̾
	public static final String DATA_PARAM_NAME = "data";
	public static final String DATA_REFERENCE_PARAM_NAME = "p_data";
	public static final String PORT_ARG_VALUE_PARAM_NAME_PREFIX = "port_arg_val_";
	public static final String OS_TRUSTED_FUNCTION_INDEX_PARAM_NAME = "tfn_idx";
	public static final String OS_TRUSTED_FUNCTION_PARAMS_PARAM_NAME = "tfn_prm";

	// �������ѿ��Υ���ܥ�̾
	public static final String RETURN_VALUE_LOCAL_VAR_NAME = "ercd";
	public static final String TEMP_RETURN_VALUE_LOCAL_VAR_NAME = "tmp_ercd";
	public static final String DATA_VAR_NAME = "data";
	public static final String INVALID_VALUE_VAR_NAME = "inv_val";
	public static final String TRUSTED_FUNCTION_PARAM_VAR_NAME = "tfn_prm";
	public static final String FILTER_RESULT_VAR_NAME = "flt_res";
	public static final String SIGNAL_ID_VAR_NAME = "sig_id";
	public static final String EVENT_VAR_NAME = "evt";
	public static final String PROXY_UNION_DATA_VARIABLE = "proxy_data";

	public static String createTaskBodyName(OsTask osTask) {
		return OS_TASK_MACRO_NAME + "(" + osTask.getShortName() + ")";
	}

	public static String createUpperLimitConstantName(String literalPrefix, ApplicationDataType applicationDataType) {
		return Strings.nullToEmpty(literalPrefix) + applicationDataType.getShortName() + "_UpperLimit";
	}

	public static String createLowerLimitConstantName(String literalPrefix, ApplicationDataType applicationDataType) {
		return Strings.nullToEmpty(literalPrefix) + applicationDataType.getShortName() + "_LowerLimit";
	}

	public static String createEnumConstantName(String literalPrefix, String enumLiteral) {
		return Strings.nullToEmpty(literalPrefix) + enumLiteral;
	}

	public static String createInitValueConstantName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "InitValue" + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String createImplInitValueConstantName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "INIT_VALUE" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createApplicationErrorConstantName(ApplicationError applicationError) {
		return RTE_CONSTANT_NAME_PREFIX + "E_" + applicationError.getParent().getShortName() + "_" + applicationError.getShortName();
	}

	public static String createRteBufferVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "Buffer" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferValueVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferValue" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferStatusVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferStatus" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferInitValueConstantName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_CONSTANT_NAME_PREFIX + "BUFFER_INIT_VALUE" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferQueuedVariableMaxLengthConstantName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_CONSTANT_NAME_PREFIX + "BUFFER_QUEUE_MAX_LENGTH" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferQueuedVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferQueue" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createRteBufferQueueTypeName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "BufferQueueType" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createInvalidValueConstantName(VariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "INVALID_VALUE" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createFilterOldValueVariableName(VariableDataInstanceInComposition dataInstanceComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "FilterOldValue" + Identifiers.getImplExtension(dataInstanceComposition.getPrototype());
	}

	public static String createFilterOccurrenceVariableName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_SYMBOL_NAME_PREFIX + "FilterOccurrence" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createFilterOccurrenceInitValueConstantName(VariableDataInstanceInComposition dataInstanceInComposition) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_OCCURRENCE_INIT_VALUE" + Identifiers.getImplExtension(dataInstanceInComposition.getPrototype());
	}

	public static String createFilterMaskConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_MASK" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createFilterXConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_X" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createFilterMinConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_MIN" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createFilterMaxConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_MAX" + Identifiers.getImplExtension(dataInstanceInSwc);

	}

	public static String createFilterPeriodConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_PERIOD" + Identifiers.getImplExtension(dataInstanceInSwc);

	}

	public static String createFilterOffsetConstantName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_CONSTANT_NAME_PREFIX + "FILTER_OFFSET" + Identifiers.getImplExtension(dataInstanceInSwc);

	}

	public static String createPortArgValueConstantName(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) {
		PortPrototype port = sourcePortDefinedArgumentValue.getParent().getPort();
		return RTE_CONSTANT_NAME_PREFIX + "PORT_ARG_VALUE" + Identifiers.getImplExtension(port) + "_" + index;
	}

	public static String createComSignalSymbolicName(ComSignal comSignal) {
		return "ComConf_ComSignal_" + comSignal.getShortName();
	}

	public static String createWriteApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Write" + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String createWriteApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Write" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createInvalidateApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Invalidate" + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String createInvalidateApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Invalidate" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createSendApiName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Send" + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String createSendApiImplName(PVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Send" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createReadApiName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Read" + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String createReadApiImplName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Read" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createReceiveApiName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Receive" + Identifiers.getExtension(dataInstanceInSwc);
	}

	public static String createReceiveApiImplName(RVariableDataInstanceInSwc dataInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Receive" + Identifiers.getImplExtension(dataInstanceInSwc);
	}

	public static String createCallApiName(ROperationInstanceInSwc operationInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Call" + Identifiers.getExtension(operationInstanceInSwc);
	}

	public static String createCallApiImplName(ROperationInstanceInSwc operationInstanceInSwc) {
		return RTE_SYMBOL_NAME_PREFIX + "Call" + Identifiers.getImplExtension(operationInstanceInSwc);
	}

	public static String createRteEnterApiName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Enter" + Identifiers.getExtension(sourceExclusiveArea);
	}

	public static String createRteEnterApiImplName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Enter" + Identifiers.getImplExtension(sourceExclusiveArea);
	}

	public static String createRteExitApiName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Exit" + Identifiers.getExtension(sourceExclusiveArea);
	}

	public static String createRteExitApiImplName(ExclusiveArea sourceExclusiveArea) {
		return RTE_SYMBOL_NAME_PREFIX + "Exit" + Identifiers.getImplExtension(sourceExclusiveArea);
	}

	public static String createRteCoreStartApiImplName(Core core) {
		return RTE_SYMBOL_NAME_PREFIX + "Start_" + core.getCoreId();
	}

	public static String createRestartPartitionApiName(EcucPartition sourcePartition) {
		return RTE_SYMBOL_NAME_PREFIX + "RestartPartition" + Identifiers.getExtension(sourcePartition);
	}

	public static String createPartitionRestartingApiName(EcucPartition sourcePartition) {
		return RTE_SYMBOL_NAME_PREFIX + "PartitionRestarting" + Identifiers.getExtension(sourcePartition);
	}

	public static String createPartitionTerminatedApiName(EcucPartition sourcePartition) {
		return RTE_SYMBOL_NAME_PREFIX + "PartitionTerminated" + Identifiers.getExtension(sourcePartition);
	}

	public static String createComReceiveCallbackName(ComSignal comSignal) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbk_" + comSignal.getShortName();
	}

	public static String createComReceiveTimeoutCallbackName(ComSignal comSignal) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkRxTOut_" + comSignal.getShortName();
	}

	public static String createComInvalidateCallbackName(ComSignal comSignal) {
		return RTE_SYMBOL_NAME_PREFIX + "COMCbkInv_" + comSignal.getShortName();
	}

	public static String createIocInitValueConstantName(OsIocCommunication osIocCommunication) {
		return RTE_CONSTANT_NAME_PREFIX + "IOC_INIT_VALUE_" + osIocCommunication.getShortName();
	}

	public static String createIocWriteApiName(OsIocSenderProperties osIocSenderProperties) {
		return IOC_SYMBOL_NAME_PREFIX + "Write_" + osIocSenderProperties.getParent().getShortName() + getSenderIdSuffix(osIocSenderProperties);
	}

	public static String createIocSendApiName(OsIocSenderProperties osIocSenderProperties) {
		return IOC_SYMBOL_NAME_PREFIX + "Send_" + osIocSenderProperties.getParent().getShortName() + getSenderIdSuffix(osIocSenderProperties);
	}

	public static String createIocSendGroupApiName(OsIocSenderProperties osIocSenderProperties) {
		return IOC_SYMBOL_NAME_PREFIX + "SendGroup_" + osIocSenderProperties.getParent().getShortName();
	}

	public static String createIocReadApiName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "Read_" + osIocCommunication.getShortName();
	}

	public static String createIocReceiveApiName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "Receive_" + osIocCommunication.getShortName();
	}

	public static String createIocEmptyQueueApiName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "EmptyQueue_" + osIocCommunication.getShortName();
	}

	public static String createIocReceiveGroupApiName(OsIocCommunication osIocCommunication) {
		return IOC_SYMBOL_NAME_PREFIX + "ReceiveGroup_" + osIocCommunication.getShortName();
	}

	private static String getSenderIdSuffix(OsIocSenderProperties osIocSenderProperties) {
		return osIocSenderProperties.getOsIocSenderId() == null ? "" : "_" + String.valueOf(osIocSenderProperties.getOsIocSenderId());
	}

	public static String createPortArgValueParamName(PortDefinedArgumentValue portDefinedArgumentValue, int index) {
		return PORT_ARG_VALUE_PARAM_NAME_PREFIX + index;
	}

	public static String createEntityCycleCounterName(OsTask osTask, OsEvent osEvent) {
		return RTE_SYMBOL_NAME_PREFIX + "EntityCycleCounter" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityStartOffsetCounterName(OsTask osTask, OsEvent osEvent) {
		return RTE_SYMBOL_NAME_PREFIX + "EntityStartOffsetCounter" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityMaxCycleConstantName(OsTask osTask, OsEvent osEvent) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_MAX_CYCLE" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityMaxStartOffsetConstantName(OsTask osTask, OsEvent osEvent) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_MAX_START_OFFSET" + Identifiers.getImplExtension(osTask, osEvent);
	}

	public static String createEntityCyclePeriodConstantName(OsTask osTask, OsEvent osEvent, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity executableEntity) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_CYCLE_PERIOD" + Identifiers.getImplExtension(osTask, osEvent, executableEntity);
	}

	public static String createEntityCycleOffsetConstantName(OsTask osTask, OsEvent osEvent, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity executableEntity) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_CYCLE_OFFSET" + Identifiers.getImplExtension(osTask, osEvent, executableEntity);
	}

	public static String createEntityStartOffsetConstantName(OsTask osTask, OsEvent osEvent, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity executableEntity) {
		return RTE_CONSTANT_NAME_PREFIX + "ENTITY_START_OFFSET" + Identifiers.getImplExtension(osTask, osEvent, executableEntity);
	}

	public static String createProxyUnionVariableMemberName(PrimitiveType type) {
		return "data_" + type.getSymbolName();
	}

	public static String createRteBufferWriteTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.createRteBufferWriteTrustedFunctionName(pDataInstanceInComposition, rDataInstanceInComposition);
	}

	public static String createRteBufferInvalidateTrustedFunctionName(VariableDataInstanceInComposition pDataInstanceInComposition, VariableDataInstanceInComposition rDataInstanceInComposition) {
		return TRUSTED_FUNCTION_NAME_PREFIX + Identifiers.createRteBufferInvalidateTrustedFunctionName(pDataInstanceInComposition, rDataInstanceInComposition);
	}

	public static String createVariableMemorySectionName(SwAddrMethod swAddrMethod, Optional<String> alignment) {
		switch (swAddrMethod.getMemoryAllocationKeywordPolicy()) {
		case ADDR_METHOD_SHORT_NAME_AND_ALIGNMENT:
			return swAddrMethod.getShortName() + "_" + alignment.or(Identifiers.ALIGNMENT_TYPE_UNSPECIFIED);
		case ADDR_METHOD_SHORT_NAME:
		default:
			return swAddrMethod.getShortName();
		}
	}

	public static String createVariableMemorySectionName(Optional<EcucPartition> sourcePartition) {
		return sourcePartition.isPresent() ? Identifiers.SECTION_TYPE_VAR + "_" + sourcePartition.get().getShortName() + "_" + ConfigValues.DEFAULT_SECTION_INITIALIZATION_POLICY
				: Identifiers.SECTION_TYPE_VAR + "_" + ConfigValues.DEFAULT_SECTION_INITIALIZATION_POLICY;
	}

	public static String createFunctionMemorySectionName(Optional<EcucPartition> sourcePartition) {
		return sourcePartition.isPresent() ? Identifiers.SECTION_TYPE_CODE + "_" + sourcePartition.get().getShortName() : Identifiers.SECTION_TYPE_CODE;
	}

	public static String createFunctionMemorySectionName(SwAddrMethod swAddrMethod) {
		return swAddrMethod.getShortName();
	}

	public static String createSwcFunctionMemorySectionName() {
		return Identifiers.SECTION_TYPE_CODE;
	}
	
	public static String createSchmEnterApiName(ExclusiveArea sourceExclusiveArea, String bsnp) {
		return SCHM_SYMBOL_NAME_PREFIX + "Enter_" + bsnp + Identifiers.getExtension(sourceExclusiveArea);
	}

	public static String createSchmExitApiName(ExclusiveArea sourceExclusiveArea, String bsnp) {
		return SCHM_SYMBOL_NAME_PREFIX + "Exit_" + bsnp + Identifiers.getExtension(sourceExclusiveArea);
	}
	
	public static String createSchmCoreStartApiImplName(Core core) {
		return SCHM_SYMBOL_NAME_PREFIX + "Init_" + core.getCoreId();
	}
}
