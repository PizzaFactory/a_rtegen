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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION__OS_APP_ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_OS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__OWNER_APPLICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_GENERAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODE_SWITCH_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INVALIDATE_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CALL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_RECEIVE_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_START_OPERATION__START_EXECUTABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INVALIDATE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IRV_READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IRV_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENT__OS_TASK_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENT__OS_TASK_PRIORITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTED_BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_MODE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_SWITCH_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SEND_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC__DEPENDENT_RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Variables;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalProxyEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTfCalledRunnable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NoneExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Ordering;

/**
 * RTE�δؿ��Υ�ǥ���ۤ��롣
 */
public class RteFunctionModelBuilder {

	final ModuleModelBuildContext context;

	private final MemoryMappingModelBuilder memmapBuilder;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;
	private final ExcludeOperationModelBuilder excludeOperationBuilder;
	private final EntityOperationModelBuilder entityOperationBuilder;
	private final SenderReceiverOperationModelBuilder srOperationBuilder;
	private final IrvOperationModelBuilder irvOperationBuilder;
	private final ComProxyOperationModelBuilder comProxyOperationModelBuilder;
	private final InitializeOperationModelBuilder initOperationBuilder;
	final ModuleRules moduleRules;

	public RteFunctionModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
		this.entityOperationBuilder = new EntityOperationModelBuilder(context);
		this.srOperationBuilder = new SenderReceiverOperationModelBuilder(context);
		this.irvOperationBuilder = new IrvOperationModelBuilder(context);
		this.comProxyOperationModelBuilder = new ComProxyOperationModelBuilder(context);
		this.initOperationBuilder = new InitializeOperationModelBuilder(context);
		this.moduleRules = new ModuleRules(context);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * �ؿ��Υ���ܥ��ǥ�(API)���ۤ��롣
	 * NOTE �����Ǥ���API�ϥ��ץꥱ�����������Τ�ΤΤߤǤ��ꡢ�饤�ե�������API�����������Ѥΰ����Ǥ��뤳�Ȥ���ա�
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildApiFunctions() throws ModelException {
		buildDependentExecutableEntities();

		if (this.context.options.doesGenerateRte) {
			buildRteApis();
		}

		if (this.context.options.doesGenerateSchm) {
			buildSchmApis();
		}
	}

	private void buildRteApis() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!swc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Swc targetSwc = swc.get();

			// ��¦API�ι���
			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					
					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC)) {
						WriteApi destWriteApi = createWriteApi(sourceDataInstanceInSwc);
						// ����饤��
						destWriteApi.setIsInline(this.moduleRules.usesInlineSrProvidedApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destWriteApi);
					}

					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC)) {
						InvalidateApi destInvalidateApi = createInvalidateApi(sourceDataInstanceInSwc);
						// ����饤��
						destInvalidateApi.setIsInline(this.moduleRules.usesInlineSrProvidedApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destInvalidateApi);
					}
					if (this.context.query.get(sourceDataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC)) {
						SendApi destSendApi = createSendApi(sourceDataInstanceInSwc);
						// Rte_Send�ϥ���饤�󲽤��ʤ�
						destSendApi.setIsInline(false);
						targetSwc.getRteApi().add(destSendApi);
					}
				}
			}
			
			// �׵�¦API�ι���
			CsTrustedFunction destCsTrustedFunction = null;

			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceDataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC)) {
						ReadApi destReadApi = createReadApi(sourceDataInstanceInSwc);
						// ����饤��
						destReadApi.setIsInline(this.moduleRules.usesInlineSrRequiredApi(sourceDataInstanceInSwc));
						targetSwc.getRteApi().add(destReadApi);
					}
					if (this.context.query.get(sourceDataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC)) {
						ReceiveApi destReceiveApi = createReceiveApi(sourceDataInstanceInSwc);
						// Rte_Receive�ϥ���饤�󲽤��ʤ�
						destReceiveApi.setIsInline(false);
						targetSwc.getRteApi().add(destReceiveApi);
					}
				}

				for (ROperationInstanceInSwc sourceOperationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceOperationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Optional<AtomicSwComponentType> sourceServerSwComponentType = tryGetPAtomicSwComponent(sourceOperationInstanceInSwc);

						CallApi destCallApi = null;
						if (sourceServerSwComponentType.isPresent()) {
							Swc clientSwc = targetSwc;
							Swc serverSwc = this.context.builtQuery.findDest(SWC, sourceServerSwComponentType.get());

							EcucPartition sourceClientEcucPartition = (EcucPartition)clientSwc.getParent().getSingleSource();
							EcucPartition sourceServerEcucPartition = (EcucPartition)serverSwc.getParent().getSingleSource();

							 // COVERAGE (ecucPartition��null�ΤȤ���pEcucPartition��null�Ǥ��뤿�ᥫ�Х�å����ѥ����ʤ��������ɥ�ӥ塼������ʤ����Ȥ��ǧ)
							if (sourceClientEcucPartition != null && sourceServerEcucPartition != null
									&& !sourceClientEcucPartition.isTrusted() && sourceServerEcucPartition.isTrusted()) {
								// ���������ꡢ����������ξ�硢����ؿ�����
								// ����ؿ�����
								Partition targetPartition = serverSwc.getParent();
								EcucPartition sourcePartition = (EcucPartition) targetPartition.getSingleSource();

								if (destCsTrustedFunction == null) {
									destCsTrustedFunction = createCsTrustedFunction(sourceSwComponentType, sourcePartition);
									targetPartition.getCsTrustedFunction().add(destCsTrustedFunction);

									buildInternalPartOfCsTrustedFunction(destCsTrustedFunction);
								}

								CsTfCalledRunnable destCsTfCalledRunnable = createCsTfCalledRunnable(sourceOperationInstanceInSwc);
								destCsTrustedFunction.getCsTfCalledRunnable().add(destCsTfCalledRunnable);

								// C/S����ؿ��Ѱ������������
								Constant destArgcConstant = createCsTfArgcConstant(sourceOperationInstanceInSwc, destCsTfCalledRunnable.getStartOperation().getStartServerRunnable().getRoleParam().size());
								targetPartition.getCsTfArgcConstant().add(destArgcConstant);
								
								destCallApi = createTfCallApi(sourceOperationInstanceInSwc);
							} else {
								destCallApi = createCallApi(sourceOperationInstanceInSwc);
							}

							// ����饤��
							destCallApi.setIsInline(this.moduleRules.usesInlineCsApi(sourceClientEcucPartition, sourceServerEcucPartition, sourceOperationInstanceInSwc));
						} else {
							// ̤��³�ξ��
							destCallApi = createCallApi(sourceOperationInstanceInSwc);
							destCallApi.setIsInline(this.moduleRules.usesInlineCsApi(sourceOperationInstanceInSwc));
						}
						targetSwc.getRteApi().add(destCallApi);
					}
				}
			}

			// ��¾���ꥢAPI�ι���
			for (ExclusiveArea sourceExclusiveArea : sourceSwComponentType.getInternalBehavior().getExclusiveArea()) {
				if (this.context.query.get(sourceExclusiveArea, EXCLUSIVE_AREA_EX___PROVIDES_RTE_ENTER_EXIT_API__EXCLUSIVEAREA)) {
					RteEnterApi destRteEnterApi = createRteEnterApi(sourceExclusiveArea);
					destRteEnterApi.setIsInline(this.moduleRules.usesInlineExcludeApi());
					targetSwc.getRteApi().add(destRteEnterApi);

					RteExitApi destRteExitApi = createRteExitApi(sourceExclusiveArea);
					destRteExitApi.setIsInline(this.moduleRules.usesInlineExcludeApi());
					targetSwc.getRteApi().add(destRteExitApi);
				}
			}

			// IRV API�ι���
			for (RunnableEntity sourceRunnableEntity : sourceSwComponentType.getInternalBehavior().getRunnable()) {
				for (VariableDataPrototype sourceDataPrototype : getUniqueVariableDataPrototype(sourceRunnableEntity.getWrittenLocalVariable())) {
					IrvWriteApi destIrvWriteApi = createIrvWriteApi(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype);
					// ����饤��
					destIrvWriteApi.setIsInline(this.moduleRules.usesInlineIrvApi());
					targetSwc.getRteApi().add(destIrvWriteApi);
				}
				for (VariableDataPrototype sourceDataPrototype : getUniqueVariableDataPrototype(sourceRunnableEntity.getReadLocalVariable())) {
					IrvReadApi destIrvReadApi = createIrvReadApi(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype);
					// ����饤��
					destIrvReadApi.setIsInline(this.moduleRules.usesInlineIrvApi());
					targetSwc.getRteApi().add(destIrvReadApi);
				}
			}

			// ����ޥåԥ󥰤���
			for (RteApi targetApi : targetSwc.getRteApi()) {
				EcucPartition sourcePartition = (EcucPartition) targetSwc.getParent().getSingleSource();
				targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
			}
		}
	}

	private Set<VariableDataPrototype> getUniqueVariableDataPrototype(List<VariableAccess> accesses) {
		Set<VariableDataPrototype> prototypes = new HashSet<VariableDataPrototype>();
		for (VariableAccess variableAccess : accesses) {
			prototypes.add(variableAccess.getAccessedVariable().getLocalVariable());
		}
		return prototypes;
	}
	
	private Optional<AtomicSwComponentType> tryGetPAtomicSwComponent(ROperationInstanceInSwc operationInstanceInSwc) {
		Optional<POperationInstanceInSwc> providedOperationInstanceInSwc = tryGetConnectedPOperationInstanceInSwc(operationInstanceInSwc);
		if (!providedOperationInstanceInSwc.isPresent()) {
			return Optional.absent();
		}
		
		return Optional.of(providedOperationInstanceInSwc.get().getOwnerAtomicSwc());
	}

	private Optional<POperationInstanceInSwc> tryGetConnectedPOperationInstanceInSwc(ROperationInstanceInSwc operationInstanceInSwc) {
		if (operationInstanceInSwc.getInstance().isEmpty()) {
			return Optional.absent();
		}
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return Optional.absent();
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		return Optional.of((POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype());
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(S/R)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private WriteApi createWriteApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		WriteApi destApi = ModuleFactory.eINSTANCE.createWriteApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createWriteApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createWriteApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// �ѥ�᥿������
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

		Parameter destDataParam = this.localSymbolModelBuilder.createSrInDataParam(paramType);
		destApi.getParam().add(destDataParam);

		destApi.setDataParam(destDataParam);
		return destApi;
	}

	private InvalidateApi createInvalidateApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) {
		InvalidateApi destApi = ModuleFactory.eINSTANCE.createInvalidateApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createInvalidateApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createInvalidateApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		return destApi;
	}

	private ReadApi createReadApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		ReadApi destApi = ModuleFactory.eINSTANCE.createReadApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createReadApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createReadApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// �ѥ�᥿�ι���
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
		
		Parameter destDataParam = this.localSymbolModelBuilder.createSrOutDataParam(paramType);
		destApi.getParam().add(destDataParam);

		destApi.setDataParam(destDataParam);
		return destApi;
	}

	private SendApi createSendApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		SendApi destApi = ModuleFactory.eINSTANCE.createSendApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createSendApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createSendApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);
	
		// �ѥ�᥿������
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
		Parameter destDataParam = this.localSymbolModelBuilder.createSrInDataParam(paramType);
		destApi.getParam().add(destDataParam);
		destApi.setDataParam(destDataParam);
		
		return destApi;
	}

	private ReceiveApi createReceiveApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		ReceiveApi destApi = ModuleFactory.eINSTANCE.createReceiveApi();
		destApi.setSingleSource(sourceDataInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createReceiveApiImplName(sourceDataInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createReceiveApiName(sourceDataInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// �ѥ�᥿�ι���
		Type paramType = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

		Parameter destDataParam = this.localSymbolModelBuilder.createSrOutDataParam(paramType);
		destApi.getParam().add(destDataParam);

		destApi.setDataParam(destDataParam);
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(C/S)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private CallApi createCallApi(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		CallApi destApi = ModuleFactory.eINSTANCE.createCallApi();
		destApi.setSingleSource(sourceOperationInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createCallApiImplName(sourceOperationInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createCallApiName(sourceOperationInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// �ѥ�᥿������
		destApi.getOperationParam().addAll(this.localSymbolModelBuilder.createCsOperationParams(sourceOperationInstanceInSwc));
		destApi.getParam().addAll(destApi.getOperationParam());
		
		return destApi;
	}

	private TfCallApi createTfCallApi(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		TfCallApi destApi = ModuleFactory.eINSTANCE.createTfCallApi();
		destApi.setSingleSource(sourceOperationInstanceInSwc);
		destApi.setSymbolName(SymbolNames.createCallApiImplName(sourceOperationInstanceInSwc));
		destApi.setApiMappingName(SymbolNames.createCallApiName(sourceOperationInstanceInSwc));
		destApi.setReturnType(this.context.cache.stdReturnType);
	
		destApi.getOperationParam().addAll(this.localSymbolModelBuilder.createCsOperationParams(sourceOperationInstanceInSwc));
		destApi.getParam().addAll(destApi.getOperationParam());
	
		// ������¤�ι���
		destApi.setCsTfParamTypeName(SymbolNames.createCsTrustedFunctionParamTypeName(sourceOperationInstanceInSwc.getOwnerAtomicSwc()));
		destApi.setCsTfArgcConstantName(SymbolNames.createCsTfArgcConstantName(sourceOperationInstanceInSwc));
		destApi.setCsTfOpidConstantName(SymbolNames.createCsTfOpidConstantName(sourceOperationInstanceInSwc));
		destApi.setCsTfName(Identifiers.createCsCallTfName(sourceOperationInstanceInSwc.getOwnerAtomicSwc()));
		
		boolean needsCheckArg = false;
		for (Parameter param : destApi.getParam()) {
			Type type = param.getType();
			
			 // COVERAGE (8�ѥ�������4�ѥ����󤷤��̤�褦���ʤ��������ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			if ((type instanceof ArrayType) || (type instanceof StructType) || (type instanceof UnionType) || (type instanceof PointerType)) {
				needsCheckArg = true;
				break;
			}
		}
		destApi.setNeedsCheckArg(needsCheckArg);
		
		return destApi;
	}

	private CsTrustedFunction createCsTrustedFunction(AtomicSwComponentType sourceSwComponentType, EcucPartition sourcePartition) {
		CsTrustedFunction destCsTrustedFunction = ModuleFactory.eINSTANCE.createCsTrustedFunction();
		buildTrustedFunctionSignature(destCsTrustedFunction);
		destCsTrustedFunction.setSymbolName(SymbolNames.createCsCallTfName(sourceSwComponentType));
		destCsTrustedFunction.setCsTfParamTypeName(SymbolNames.createCsTrustedFunctionParamTypeName(sourceSwComponentType));
		destCsTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
		return destCsTrustedFunction;
	}

	private void buildInternalPartOfCsTrustedFunction(CsTrustedFunction targetCsTrustedFunction) {
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetCsTrustedFunction.getLocalVariable().add(returnValueVariable);
		targetCsTrustedFunction.setDataVariable(returnValueVariable);
	}

	private CsTfCalledRunnable createCsTfCalledRunnable(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition sourceRequiredOperationInstanceInComposition = sourceOperationInstanceInSwc.getInstance().get(0);
		OperationInstanceInComposition sourceProvidedOperationInstanceInComposition = sourceRequiredOperationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc sourceProvidedOperationInstanceInSwc = (POperationInstanceInSwc) sourceProvidedOperationInstanceInComposition.getPrototype();
		OperationInvokedEvent sourceOperationInvokedEvent = sourceProvidedOperationInstanceInSwc.getOperationInvokedEvent().get(0);

		CsTfCalledRunnable destCsTfCalledRunnable = ModuleFactory.eINSTANCE.createCsTfCalledRunnable();
		destCsTfCalledRunnable.setCsTfOpidConstantName(SymbolNames.createCsTfOpidConstantName(sourceOperationInstanceInSwc));
		destCsTfCalledRunnable.setStartOperation(this.entityOperationBuilder.createServerRunnableStartOperation(sourceOperationInvokedEvent.getStartOnEvent()));
		return destCsTfCalledRunnable;
	}

	private Constant createCsTfArgcConstant(ROperationInstanceInSwc sourceOperationInstanceInSwc, int runnableParamCount) {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSymbolName(SymbolNames.createCsTfArgcConstantName(sourceOperationInstanceInSwc));
		if (runnableParamCount > 0) {
			destConstant.setValue(String.valueOf(runnableParamCount) + "U");
		} else {
			// NOTE: ����Ĺ��0�ˤʤ�Τ��򤱤�
			destConstant.setValue("1U");
		}
		return destConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(IRV)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private IrvWriteApi createIrvWriteApi(AtomicSwComponentType sourceSwComponentType, RunnableEntity sourceRunnableEntity, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvWriteApi destApi = ModuleFactory.eINSTANCE.createIrvWriteApi();
		destApi.setSingleSource(sourceDataPrototype);
		destApi.setSymbolName(SymbolNames.createRteIrvWriteApiImplName(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype));
		destApi.setApiMappingName(SymbolNames.createRteIrvWriteApiName(sourceRunnableEntity, sourceDataPrototype));

		Type paramType = this.context.builtQuery.findDestType(sourceDataPrototype.getImplementationDataType());
		Parameter dataParam = this.localSymbolModelBuilder.createIrvInDataParam(paramType);
		destApi.getParam().add(dataParam);
		destApi.setDataParam(dataParam);
		destApi.setReturnType(this.context.cache.voidType);
		return destApi;
	}

	private IrvReadApi createIrvReadApi(AtomicSwComponentType sourceSwComponentType, RunnableEntity sourceRunnableEntity, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvReadApi destApi = ModuleFactory.eINSTANCE.createIrvReadApi();
		destApi.setSingleSource(sourceDataPrototype);
		destApi.setSymbolName(SymbolNames.createRteIrvReadApiImplName(sourceSwComponentType, sourceRunnableEntity, sourceDataPrototype));
		destApi.setApiMappingName(SymbolNames.createRteIrvReadApiName(sourceRunnableEntity, sourceDataPrototype));

		Type paramType = this.context.builtQuery.findDestType(sourceDataPrototype.getImplementationDataType());
		if (paramType instanceof PrimitiveType) {
			destApi.setReturnType(paramType);
		} else {
			destApi.setReturnType(this.context.cache.voidType);

			Parameter dataParam = this.localSymbolModelBuilder.createIrvOutDataParam(paramType);
			destApi.getParam().add(dataParam);
			destApi.setDataParam(dataParam);
		}
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(��¾����)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private RteEnterApi createRteEnterApi(ExclusiveArea sourceExclusiveArea) {
		RteEnterApi destApi = ModuleFactory.eINSTANCE.createRteEnterApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createRteEnterApiImplName(sourceExclusiveArea));
		destApi.setApiMappingName(SymbolNames.createRteEnterApiName(sourceExclusiveArea));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsNoneExclude(false);
		return destApi;
	}

	private RteExitApi createRteExitApi(ExclusiveArea sourceExclusiveArea) {
		RteExitApi destApi = ModuleFactory.eINSTANCE.createRteExitApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createRteExitApiImplName(sourceExclusiveArea));
		destApi.setApiMappingName(SymbolNames.createRteExitApiName(sourceExclusiveArea));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsNoneExclude(false);
		return destApi;
	}

	private void buildSchmApis() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
	
			Bswm targetBswm = optionalTargetBswm.get();
	
			// ��¾���ꥢ��Ϣ��API����(SchM_Enter/Exit)
			buildSchmApisForExclusiveArea(targetBswm, sourceBswModuleDescription);
	
			// �⡼�ɴ�Ϣ��API����(Schm_Switch/Mode/Init)
			buildSchmApisForMode(targetBswm, sourceBswModuleDescription);
	
			// ����ޥåԥ󥰤���
			for (PartedBswm targetPartedBswm : targetBswm.getPartedBswm()) {
				for (SchmApi targetApi : targetPartedBswm.getSchmApi()) {
					EcucPartition sourcePartition = (EcucPartition) targetPartedBswm.getParent().getSingleSource();
					targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				}
			}
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(��¾����)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSchmApisForExclusiveArea(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceEnableInternalBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswm������Ȥ������Ȥ�ͭ����behavior��¸�ߤ��뤿�ᡢnull�����å�����

		for (ExclusiveArea sourceExclusiveArea : sourceEnableInternalBehavior.getExclusiveArea()) {
			// Enter/Exit API��������ѡ��ƥ����������
			PartedBswm targetPartedBswm = getPartedBswmToLocateExclusiveAreaSymbol(targetBswm, sourceExclusiveArea);

			// Enter/Exit API����
			if (this.context.query.get(sourceExclusiveArea, EXCLUSIVE_AREA_EX___PROVIDES_SCHM_ENTER_EXIT_API__EXCLUSIVEAREA)) {
				targetPartedBswm.getSchmApi().add(createSchmEnterApi(sourceBswModuleDescription, sourceExclusiveArea));
				targetPartedBswm.getSchmApi().add(createSchmExitApi(sourceBswModuleDescription, sourceExclusiveArea));
			}
		}
	}

	private PartedBswm getPartedBswmToLocateExclusiveAreaSymbol(Bswm bswm, ExclusiveArea exclusiveArea) throws ModelException {
		if (this.context.options.generationPhase) {
			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(exclusiveArea, EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA);
			EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345�ˤ�ꡢ�⡼��������롼�ץץ�ȥ����פ���Ѥ���ѡ��ƥ�������¿���٤�0..1
			Partition partition = this.context.builtQuery.findDestPartition(usingEcucPartition);
			return bswm.getSinglePartedBswm(partition);
		} else {
			return bswm.getSinglePartedBswm(this.context.cache.masterBswPartition);
		}
	}

	private SchmEnterApi createSchmEnterApi(BswModuleDescription sourceBswModuleDescription, ExclusiveArea sourceExclusiveArea) {
		SchmEnterApi destApi = ModuleFactory.eINSTANCE.createSchmEnterApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createSchmEnterApiName(sourceExclusiveArea, sourceBswModuleDescription));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsInline(false);
		return destApi;
	}

	private SchmExitApi createSchmExitApi(BswModuleDescription sourceBswModuleDescription, ExclusiveArea sourceExclusiveArea) {
		SchmExitApi destApi = ModuleFactory.eINSTANCE.createSchmExitApi();
		destApi.setSingleSource(sourceExclusiveArea);
		destApi.setSymbolName(SymbolNames.createSchmExitApiName(sourceExclusiveArea, sourceBswModuleDescription));
		destApi.setReturnType(this.context.cache.voidType);
		destApi.setIsInline(false);
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(�⡼��)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSchmApisForMode(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceEnableInternalBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswm������Ȥ������Ȥ�ͭ����behavior��¸�ߤ��뤿�ᡢnull�����å�����

		// ��¦
		for (ModeDeclarationGroupPrototype sourceProvidedModeGroup : sourceBswModuleDescription.getProvidedModeGroup()) {
			// Switch/Mode API��������ѡ��ƥ����������
			PartedBswm targetPartedBswm = getPartedBswmToLocateModeSymbol(targetBswm, sourceProvidedModeGroup);

			// Switch/Mode API����
			if (providesSchmSwitchApi(sourceProvidedModeGroup, sourceEnableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmSwitchApi(sourceBswModuleDescription, sourceProvidedModeGroup));
			}
			if (providesSchmModeApi(sourceProvidedModeGroup, sourceEnableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceProvidedModeGroup));
			}
		}

		// �׵�¦
		for (ModeDeclarationGroupPrototype sourceRequiredModeGroup : sourceBswModuleDescription.getRequiredModeGroup()) {
			// Mode API��������ѡ��ƥ����������
			PartedBswm targetPartedBswm = getPartedBswmToLocateModeSymbol(targetBswm, sourceRequiredModeGroup);

			if (providesSchmModeApi(sourceRequiredModeGroup, sourceEnableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceRequiredModeGroup));
			}
		}
	}

	private PartedBswm getPartedBswmToLocateModeSymbol(Bswm bswm, ModeDeclarationGroupPrototype modePrototype) throws ModelException {
		if (this.context.options.generationPhase) {
			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(modePrototype, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE);
			EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345�ˤ�ꡢ�⡼��������롼�ץץ�ȥ����פ���Ѥ���ѡ��ƥ�������¿���٤�0..1
			Partition partition = this.context.builtQuery.findDestPartition(usingEcucPartition);
			return bswm.getSinglePartedBswm(partition);
		} else {
			return bswm.getSinglePartedBswm(this.context.cache.masterBswPartition);
		}
	}

	private boolean providesSchmSwitchApi(ModeDeclarationGroupPrototype providedModeGroup, BswInternalBehavior enableInternalBehavior) {
		for (BswSchedulableEntity sourceEntity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (sourceEntity.getManagedModeGroup().contains(providedModeGroup)) {
				return true;
			}
		}
		return false;
	}

	private boolean providesSchmModeApi(ModeDeclarationGroupPrototype modePrototype, BswInternalBehavior enableInternalBehavior) {
		for (BswSchedulableEntity sourceEntity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (sourceEntity.getAccessedModeGroup().contains(modePrototype)) {
				return true;
			}
		}
		return false;
	}

	private SchmSwitchApi createSchmSwitchApi(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceProvidedModeGroup) throws ModelException {
		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.findDest(MODE_DECLARATION_GROUP, sourceProvidedModeGroup.getType());

		SchmSwitchApi destApi = ModuleFactory.eINSTANCE.createSchmSwitchApi();
		destApi.setSingleSource(sourceProvidedModeGroup);
		destApi.setSymbolName(SymbolNames.createSchmSwitchApiName(sourceProvidedModeGroup, sourceBswModuleDescription));
		destApi.setReturnType(this.context.cache.stdReturnType);
		destApi.getParam().add(this.localSymbolModelBuilder.createModeParam(sourceProvidedModeGroup, modeDeclarationGroup.getImplementationDataType()));
		destApi.setIsInline(false);
		return destApi;
	}

	private SchmModeApi createSchmModeApi(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeUserModePrototype) throws ModelException {
		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.findDest(MODE_DECLARATION_GROUP, sourceModeUserModePrototype.getType());

		SchmModeApi destApi = ModuleFactory.eINSTANCE.createSchmModeApi();
		destApi.setSingleSource(sourceModeUserModePrototype);
		destApi.setSymbolName(SymbolNames.createSchmModeApiName(sourceModeUserModePrototype, sourceBswModuleDescription));
		destApi.setIsInline(false);
		destApi.setReturnType(modeDeclarationGroup.getImplementationDataType());
		return destApi;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(����ƥ��ƥ�ư��)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildDependentExecutableEntities() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> foundSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!foundSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
	
			Swc targetSwc = foundSwc.get();
	
			for (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity : sourceSwComponentType.getInternalBehavior().getRunnable()) {
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity destRunnableEntity = createRunnableEntity(sourceRunnableEntity);
				destRunnableEntity.setMemoryMapping(this.memmapBuilder.buildRunnableEntityMemoryMapping(targetSwc, sourceRunnableEntity));
				targetSwc.getDependentRunnableEntity().add(destRunnableEntity);
			}
		}
	
		// NOTE BSW�������塼��֥��LogicalCompartmentModelBuilder�ǹ��ۺѤߤʤΤ�, ����ޥåפγ�����Ƥ�����ͷ�������Τ߹Ԥ�.
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			for (jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity targetBswSchedulableEntity : targetPartedBswm.getDependentBswSchedulableEntity()) {
				targetBswSchedulableEntity.setReturnType(this.context.cache.voidType);
				targetBswSchedulableEntity.setMemoryMapping(this.memmapBuilder.buildBswSchedulableEntityMemoryMapping(targetPartedBswm, (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)targetBswSchedulableEntity.getSingleSource()));
			}
		}
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity createRunnableEntity(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity) throws ModelException {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity destEntity = ModuleFactory.eINSTANCE.createRunnableEntity();
		destEntity.setSingleSource(sourceRunnableEntity);

		RteEvent sourceRteEvent = sourceRunnableEntity.getEvent().isEmpty() ? null : sourceRunnableEntity.getEvent().get(0);
		destEntity.setSymbolName(sourceRunnableEntity.getSymbol());
		if (sourceRteEvent instanceof OperationInvokedEvent) {
			// ���ڥ졼�����ƽХ��٥�Ȥξ��
			OperationInvokedEvent sourceOperationInvokedEvent = (OperationInvokedEvent) sourceRteEvent;
			POperationInstanceInSwc sourceOperationInstanceInSwc = sourceOperationInvokedEvent.getOperation();

			// ����ͷ��ι���
			boolean hasReturnValue = !sourceOperationInstanceInSwc.getPrototype().getPossibleError().isEmpty();
			destEntity.setReturnType(hasReturnValue ? this.context.cache.stdReturnType : this.context.cache.voidType);
			destEntity.setHasReturnValue(hasReturnValue);

			// ��������ι���
			destEntity.getRoleParam().addAll(this.localSymbolModelBuilder.createCsPortArgValueParams(sourceOperationInstanceInSwc));
			destEntity.getRoleParam().addAll(this.localSymbolModelBuilder.createCsOperationParams(sourceOperationInstanceInSwc));

			destEntity.getParam().addAll(destEntity.getRoleParam());

		} else {
			// ����ʳ���RTE���٥�Ȥξ��
			destEntity.setReturnType(this.context.cache.voidType);
		}

		return destEntity;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * �ؿ��Υ���ܥ��ǥ�(����������)�ȥ���ܥ�������¤��ǥ�(����������)���ۤ��롣
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildImplFunctionsAndInternals() throws ModelException {
		buildEntityStartImplFunctions();

		if (this.context.options.doesGenerateRte) {
			buildComAccessImplFunctionsAndInternals();
			buildSrImplFunctionsAndInternals();
			buildRteLifecycleImplFunctions();
		}

		if (this.context.options.doesGenerateSchm) {
			buildSchmLifecycleImplFunctionsAndInternals();
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(S/R)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSrImplFunctionsAndInternals() throws ModelException {
		buildSrRteSendTrustedFunctions();
	}

	// RTE�Хåե������Ѥο���ؿ�����
	private void buildSrRteSendTrustedFunctions() throws ModelException {
		for (TrustedFunctionRteSendImplementation sourceSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			EcucPartition sourcePartition = sourceSendImplementation.getWriteOsTrustedFunction().getParent().getOsAppEcucPartition();
			InternalEcuSender sender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
			PVariableDataInstanceInSwc sourceDataInstanceInSwc = (PVariableDataInstanceInSwc) sender.getSource().getPrototype();
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourcePartition);
	
			// Write/Send�ѿ���ؿ�����
			RteBufferWriteTrustedFunction destWriteTrustedFunction = createRteBufferWriteTrustedFunction(sourceSendImplementation);
			destWriteTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
			targetPartition.getRteBufferSendTrustedFunction().add(destWriteTrustedFunction);
	
			// Invalidate�ѿ��괬������
			if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
				RteBufferInvalidateTrustedFunction destInvalidateTrustedFunction = createRteBufferInvalidateTrustedFunction(sourceSendImplementation);
				destInvalidateTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
				targetPartition.getRteBufferSendTrustedFunction().add(destInvalidateTrustedFunction);
			}
		}
	}

	private RteBufferInvalidateTrustedFunction createRteBufferInvalidateTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
	
		// ����ؿ��ι���
		RteBufferInvalidateTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createRteBufferInvalidateTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setSymbolName(sourceSendImplementation.getInvalidateOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getInvalidateOsTrustedFunction().getShortName());

		// ������¤
		// �������ѿ��ι���
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		destTrustedFunction.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		RteBufferNonqueuedSendOperation destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateTrustedFunction(sourceSendInteraction, destFilterResultVariable);
		destTrustedFunction.setOperation(destOperation);
	
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destTrustedFunction);
		return destTrustedFunction;
	}

	private RteBufferWriteTrustedFunction createRteBufferWriteTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc sourcePDataInstanceInSwc = sourceSender.getSource().getPrototype();
	
		// ����ؿ��ι���
		RteBufferWriteTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createRteBufferWriteTrustedFunction();
		destTrustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(destTrustedFunction);
		destTrustedFunction.setSymbolName(sourceSendImplementation.getWriteOsTrustedFunction().getOsTrustedFunctionName());
		destTrustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getWriteOsTrustedFunction().getShortName());

		// ������¤
		// �������ѿ��ι���
		LocalVariable destDataVariable = this.localSymbolModelBuilder.createSrDataVariable(sourcePDataInstanceInSwc, SymbolNames.SR_DATA_VAR_NAME);
		destTrustedFunction.getLocalVariable().add(destDataVariable);
	
		destTrustedFunction.setDataVariable(destDataVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		destTrustedFunction.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		if (sourcePDataInstanceInSwc.isEventSemantics()) {
			RteBufferQueuedSendOperation destSendOperation = this.srOperationBuilder.createRteBufferQueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, destDataVariable, destFilterResultVariable);
			destTrustedFunction.setOperation(destSendOperation);
		} else {
			RteBufferNonqueuedSendOperation destSendOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, destDataVariable, destFilterResultVariable);
			destTrustedFunction.setOperation(destSendOperation);
		}
	
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destTrustedFunction);
		return destTrustedFunction;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(����ƥ��ƥ�ư��)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildEntityStartImplFunctions() throws ModelException {
		buildExecutableTaskBodies();
	}

	private void buildExecutableTaskBodies() throws ModelException {
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			List<EcucPartition> sourcePartitions = this.context.query.collect(sourceOsTask, OS_TASK__OWNER_APPLICATION, OS_APPLICATION__OS_APP_ECUC_PARTITION);
			EcucPartition sourcePartition = Iterables.getFirst(sourcePartitions, null);
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourcePartition);

			Optional<OsTaskActivateEntityStarter> sourceOsTaskActivateEntityStarter = this.context.query.tryFindSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
			List<OsEventSetEntityStarter> sourceOsEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

			// NOTE 1�ĤΥ���������OS��������ư��OS���٥�������ξ���ε�ư�����򥵥ݡ��Ȥ��뤳�ȤϤʤ����ᡢ�ɤ��餫��¸�ߤ���Ф��������Ǥ����ǧ�����롣
			if (sourceOsTaskActivateEntityStarter.isPresent()) {
				// ��������ư������ư��륿�����ۥǥ��ι���
				OsTaskActivationExecutableTaskBody destTaskBody = createOsTaskActivationExecutableTaskBody(sourceOsTask, sourceOsTaskActivateEntityStarter.get());
				destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(destTaskBody);

			} else if (!sourceOsEventSetEntityStarters.isEmpty()) {
				// OS���٥�����������ư��륿�����ܥǥ��ι���
				OsEventSetExecutableTaskBody destTaskBody = createOsEventSetExecutableTaskBody(sourceOsTask, sourceOsEventSetEntityStarters);
				destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(destTaskBody);
			}
		}
	}

	private OsTaskActivationExecutableTaskBody createOsTaskActivationExecutableTaskBody(OsTask sourceOsTask, OsTaskActivateEntityStarter sourceOsTaskActivateEntityStarter) throws ModelException {
		// ����ܥ�
		OsTaskActivationExecutableTaskBody destTaskBody = ModuleFactory.eINSTANCE.createOsTaskActivationExecutableTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		destTaskBody.setReturnType(this.context.cache.voidType);
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());

		// ������¤
		// ����ƥ��ƥ���ư��������
		destTaskBody.setOperation(this.entityOperationBuilder.createOsTaskActivationOperation(sourceOsTaskActivateEntityStarter, sourceOsTask));
		return destTaskBody;
	}

	private OsEventSetExecutableTaskBody createOsEventSetExecutableTaskBody(OsTask sourceOsTask, List<OsEventSetEntityStarter> entityStarters) throws ModelException {
		// ����ܥ�
		OsEventSetExecutableTaskBody destTaskBody = ModuleFactory.eINSTANCE.createOsEventSetExecutableTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		destTaskBody.setReturnType(this.context.cache.voidType);
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());
		destTaskBody.getOsEventId().addAll(this.context.query.<String> collect(entityStarters, OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT, ECUC_REFERRABLE__SHORT_NAME));

		// ������¤
		if (entityStarters.size() > 1) {
			// EntityStarter��ʣ��������ϡ����̤�ɬ�פʤ��ᡢ���Τ����������¤����
			destTaskBody.setChecksOsEventId(true);
	
			// OS���٥��ID�Υ����å����ѿ�����
			LocalVariable destEventVariable = this.localSymbolModelBuilder.createEntityEventVariable();
			destTaskBody.getLocalVariable().add(destEventVariable);
	
			destTaskBody.setEventVariable(destEventVariable);
		}
	
		destTaskBody.getOperation().addAll(this.entityOperationBuilder.createOsEventSetActivationOperations(entityStarters, sourceOsTask));
		return destTaskBody;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(COM��������)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildComAccessImplFunctionsAndInternals() throws ModelException {
		buildComAccessWrapperFunctions();
		buildComSendTrustedFunctions(this.context.cache.rte);
		buildComProxyFunctions();
		buildComSendProxyEntities(this.context.cache.rte);
		buildComCallbacks(this.context.cache.rte);
	}

	private void buildComAccessWrapperFunctions() throws ModelException {
		// COM����������åѴؿ�������̵ͭ��Ƚ��
		// S/R�ǻ��Ѥ���Ƥ���COM�����ʥ륰�롼�פ�¸�ߤ������������
		boolean requiresSendFunction = false;
		boolean requiresReceiveFunction = false;

		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			ImplementationDataType sourceType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
			if (sourceType.isComplexType()) { // COVERAGE ���true(������ComSingnalGroup��PrimitiveType�Ȥʤ�ѥ�����¸�ߤ��ʤ�����)
				VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceDataInstanceInCompositions.get(0).getPrototype();
				if (sourceDataInstanceInSwc instanceof PVariableDataInstanceInSwc) {
					requiresSendFunction = true;
				} else {
					requiresReceiveFunction = true;
				}
			}
		}

		// COM����������åѴؿ��ι���
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;

		// COM������åѴؿ��ι���
		if (requiresSendFunction) {
			ComSignalApiWrapper destSendFunction = createComSendSignalGroupWrapperFunction(sourcePartition);
			targetPartition.getComSignalApiWrapper().add(destSendFunction);
		}

		// COM������åѴؿ��ι���
		if (requiresReceiveFunction) {
			ComSignalApiWrapper destReceiveFunction = createComReceiveSignalGroupWrapperFunction(sourcePartition);
			targetPartition.getComSignalApiWrapper().add(destReceiveFunction);
		}
	
		// ����ޥåԥ󥰤���
		for (ComSignalApiWrapper targetFunction : targetPartition.getComSignalApiWrapper()) {
			targetFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(sourcePartition));
		}
	}

	private ComSignalApiWrapper createComSendSignalGroupWrapperFunction(Optional<EcucPartition> sourcePartition) {
		// �ؿ�����ܥ�ι���
		ComSendSignalApiWrapper destFunction = ModuleFactory.eINSTANCE.createComSendSignalApiWrapper();
	
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSymbolName(SymbolNames.createComSendSignalGroupWithUpdateShadowSignalName(sourcePartition));
		} else {
			destFunction.setSymbolName(SymbolNames.createComSendSignalGroupWithoutUpdateShadowSignalName(sourcePartition));
		}
		destFunction.setReturnType(this.context.cache.stdReturnType);
	
		// �ѥ�᥿�ι���
		Parameter destMetaParam = ModuleFactory.eINSTANCE.createParameter();
		destMetaParam.setSymbolName(SymbolNames.COM_META_COMPLEX_DATA_PARAM_NAME);
		destMetaParam.setType(this.context.cache.comMetaDataType);
		destMetaParam.setHasConst(true);
		destMetaParam.setPassType(ParameterPassTypeEnum.REFERENCE);
		destFunction.getParam().add(destMetaParam);
	
		Parameter destDataParam = ModuleFactory.eINSTANCE.createParameter();
		destDataParam.setSymbolName(SymbolNames.SR_DATA_PARAM_NAME);
		destDataParam.setType(this.context.cache.uint8Type);
		destDataParam.setHasConst(true);
		destFunction.getParam().add(destDataParam);

		// ������¤�ι���
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSignalSymbolName(SymbolNames.COM_UPDATE_SHADOW_SIGNAL_API_NAME);			
		} else {
			destFunction.setSignalSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
		}
		destFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_GROUP_API_NAME);

		return destFunction;
	}

	private ComSignalApiWrapper createComReceiveSignalGroupWrapperFunction(Optional<EcucPartition> sourcePartition) {
		// �ؿ�����ܥ�ι���
		ComReceiveSignalApiWrapper destFunction = ModuleFactory.eINSTANCE.createComReceiveSignalApiWrapper();
	
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withShadowSignal(sourcePartition));
		} else {
			destFunction.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withoutShadowSignal(sourcePartition));
		}
		destFunction.setReturnType(this.context.cache.stdReturnType);
	
		// �ѥ�᥿�ι���
		Parameter destMetaParam = ModuleFactory.eINSTANCE.createParameter();
		destMetaParam.setSymbolName(SymbolNames.COM_META_COMPLEX_DATA_PARAM_NAME);
		destMetaParam.setType(this.context.cache.comMetaDataType);
		destMetaParam.setHasConst(true);
		destMetaParam.setPassType(ParameterPassTypeEnum.REFERENCE);
		destFunction.getParam().add(destMetaParam);
	
		Parameter destDataParam = ModuleFactory.eINSTANCE.createParameter();
		destDataParam.setSymbolName(SymbolNames.SR_DATA_PARAM_NAME);
		destDataParam.setType(this.context.cache.uint8Type);
		destFunction.getParam().add(destDataParam);

		// ������¤�ι���
		if (requiresToUseShadowSignalApi()) {
			destFunction.setSignalSymbolName(SymbolNames.COM_RECEIVE_SHADOW_SIGNAL_API_NAME);			
		} else {
			destFunction.setSignalSymbolName(SymbolNames.CALL_BSW_COM_RECEIVE_SIGNAL_API_NAME);
		}
		destFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_RECEIVE_SIGNAL_GROUP_API_NAME);

		return destFunction;
	}

	private boolean requiresToUseShadowSignalApi() {
		for (RteBswGeneral rteBswGeneral : this.context.query.<RteBswGeneral> findByKind(RTE_BSW_GENERAL)) {
			if (rteBswGeneral.getRteUseComShadowSignalApi()) {
				return true;
			}
		}
		
		return false;
	}

	// COM�����Ѥο���ؿ�����
	private void buildComSendTrustedFunctions(Rte targetRte) {
		this.context.cache.comSendSignalTf = Optional.absent();
		this.context.cache.comSendSignalGroupTf = Optional.absent();
		Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignal = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (sourceComSendImplForComSignal.isPresent()) {
			buildComSendSignalTrustedFunction(targetRte);
		}
		Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignalGroup = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (sourceComSendImplForComSignalGroup.isPresent()) {
			buildComSendSignalGroupTrustedFunction(targetRte);
		}
	}

	private void buildComSendSignalTrustedFunction(Rte targetRte) {
		EcucPartition sourceMasterBswPartition = this.context.cache.sourceMasterBswPartition.get(); // NOTE ����ؿ�����Ѥ�����ˤ�ɬ���ޥ����ѡ��ƥ������¸�ߤ��뤿�ᡢ¸�ߥ����å��ϹԤ�ʤ�

		ComSendSignalTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction();
		buildTrustedFunctionSignature(destTrustedFunction);
	
		destTrustedFunction.setSymbolName(SymbolNames.createComSendSignalTrustedFunctionName(sourceMasterBswPartition));
		destTrustedFunction.setTrustedFunctionIndex(Identifiers.createComSendSignalTrustedFunctionName(sourceMasterBswPartition));
		destTrustedFunction.setIsGroup(false);
		targetRte.getComSendSignalTrustedFunction().add(destTrustedFunction);
		this.context.cache.comSendSignalTf = Optional.of(destTrustedFunction);

		destTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourceMasterBswPartition)));
		
		// ������¤�ι���
		LocalVariable destTfParamVariable = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
		destTrustedFunction.getLocalVariable().add(destTfParamVariable);
		
		destTrustedFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
	}

	private void buildComSendSignalGroupTrustedFunction(Rte targetRte) {
		Optional<EcucPartition> optionalSourceMasterBswPartition = this.context.cache.sourceMasterBswPartition;
		EcucPartition sourceMasterBswPartition = optionalSourceMasterBswPartition.get(); // NOTE ����ؿ�����Ѥ�����ˤ�ɬ���ޥ����ѡ��ƥ������¸�ߤ��뤿�ᡢ¸�ߥ����å��ϹԤ�ʤ�

		ComSendSignalTrustedFunction destTrustedFunction = ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction();
		buildTrustedFunctionSignature(destTrustedFunction);
	
		destTrustedFunction.setSymbolName(SymbolNames.createComSendSignalGroupTrustedFunctionName(sourceMasterBswPartition));
		destTrustedFunction.setTrustedFunctionIndex(Identifiers.createComSendSignalGroupTrustedFunctionName(sourceMasterBswPartition));
		destTrustedFunction.setIsGroup(true);
		targetRte.getComSendSignalTrustedFunction().add(destTrustedFunction);
		this.context.cache.comSendSignalGroupTf = Optional.of(destTrustedFunction);
		
		destTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourceMasterBswPartition)));

		// ������¤�ι���
		LocalVariable destTfParamVariable = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
		destTrustedFunction.getLocalVariable().add(destTfParamVariable);
		
		destTrustedFunction.setSignalGroupSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(optionalSourceMasterBswPartition));
	}

	private void buildComProxyFunctions() throws ModelException {
		// Rte_SrWriteProxy����
		if (isPeriodicProxyComSendImplementationExists() || isImmediateProxyComSendImplementationExists()) {
			for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
				Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
				if (!swc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
					continue;
				}

				// ����¦API�ι���
				for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
					for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
						if (sourceDataInstanceInSwc.getImplementationDataType().isComplexType()) {
							Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

							buildComProxyFunctionsForComSignalGroup(sourceDataInstanceInSwc, type);
							buildComProxyFunctionsForComSignal(sourceDataInstanceInSwc, type);
						}
					}
				}
			}
		}
	}

	private boolean isPeriodicProxyComSendImplementationExists() {
		Optional<PeriodicProxyComSendImplementation> impl = this.context.query.tryFindSingleByKind(PERIODIC_PROXY_COM_SEND_IMPLEMENTATION);
		return impl.isPresent();
	}

	private boolean isImmediateProxyComSendImplementationExists() {
		Optional<ImmediateProxyComSendImplementation> impl = this.context.query.tryFindSingleByKind(IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);
		return impl.isPresent();
	}

	private void buildComProxyFunctionsForComSignalGroup(PVariableDataInstanceInSwc sourceDataInstanceInSwc, Type type) throws ModelException {
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			for (VariableDataInstanceInComposition sourceDataInComposition : sourceDataInstanceInCompositions) {
				if (sourceDataInComposition.getPrototype() == sourceDataInstanceInSwc) {
					// Complex�Υǡ����Ϥ���
					buildComProxyFunctionEach(sourceDataInstanceInSwc, sourceComSignalGroup, type, sourceComSignalGroup.transfersImmediately());
				}
			}
		}
	}

	private void buildComProxyFunctionsForComSignal(PVariableDataInstanceInSwc sourceDataInstanceInSwc, Type type) throws ModelException {
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			for (VariableDataInstanceInComposition sourceDataInComposition : sourceDataInstanceInCompositions) {
				if (sourceDataInComposition.getPrototype() == sourceDataInstanceInSwc) {
					buildComProxyFunctionEach(sourceDataInstanceInSwc, sourceComSignal, type, sourceComSignal.transfersImmediately());
				}
			}
		}
	}

	private void buildComProxyFunctionEach(PVariableDataInstanceInSwc sourceDataInstanceInSwc, EcucContainer sourceComSignalOrComSignalGroup, Type type, boolean immediate) {
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;
	
		ComProxyFunction destProxyFunction = ModuleFactory.eINSTANCE.createComProxyFunction();
		destProxyFunction.setSymbolName(SymbolNames.createComProxyFunctionName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
		if (immediate) {
			destProxyFunction.setIocReceiveSymbolName(SymbolNames.createIocReceiveComProxyImmediateApiName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
			destProxyFunction.setBufferComProxySymbolName(SymbolNames.createImmediateComProxyBufferVariableName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
		} else {
			destProxyFunction.setIocReceiveSymbolName(SymbolNames.createIocReceiveComProxyPeriodicApiName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
			destProxyFunction.setBufferComProxySymbolName(SymbolNames.createPeriodicComProxyBufferVariableName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup));
		}
		if (type instanceof StructType || type instanceof UnionType) {
			destProxyFunction.setProxyDataTypeName(type.getSymbolName());
		} else {
			destProxyFunction.setProxyDataTypeName(type.getOriginalTypeSymbolName());
		}
		
		if (sourceComSignalOrComSignalGroup instanceof ComSignalGroup) {
			ComSignalGroup sourceComSignalGroup = (ComSignalGroup) sourceComSignalOrComSignalGroup;
			destProxyFunction.setSignalGroupSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(sourcePartition));
			destProxyFunction.setBufferComMetaComplexDataSymbolName(SymbolNames.createComMetaVariableName(sourceComSignalGroup));
			destProxyFunction.setIsGroup(true);
		} else {
			// 1signal
			destProxyFunction.setSignalGroupSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
			destProxyFunction.setBufferComMetaComplexDataSymbolName(SymbolNames.createComSignalSymbolicName(Optional.of(sourceComSignalOrComSignalGroup)));
			destProxyFunction.setIsGroup(false);
		}
	
		destProxyFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(sourcePartition));
		targetPartition.getComProxyFunction().add(destProxyFunction);
	}

	private void buildComSendProxyEntities(Rte targetRte) throws ModelException {
		Optional<PeriodicComSendProxy> sourcePeriodicComSendProxy = this.context.query.tryFindSingleByKind(PERIODIC_COM_SEND_PROXY);
		if (sourcePeriodicComSendProxy.isPresent()) {
			ComSendSignalPeriodicEntity destPeriodicEntity = createComSendSignalPeriodicEntity(sourcePeriodicComSendProxy.get());
			destPeriodicEntity.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePeriodicComSendProxy.get().getOwnerPartition())));
			targetRte.setComSendSignalPeriodicEntity(destPeriodicEntity);
		}
	
		Optional<ImmediateComSendProxy> sourceImmediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (sourceImmediateComSendProxy.isPresent()) {
			OsTask sourceOsTask = this.context.query.findSingle(isKindOf(OS_TASK).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME)));
	
			ComSendSignalImmediateEntity destImmediateEntity = createComSendSignalImmediateEntity(sourceImmediateComSendProxy.get());
			destImmediateEntity.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourceImmediateComSendProxy.get().getOwnerPartition())));
			targetRte.setComSendSignalImmediateEntity(destImmediateEntity);
	
			ComSendSignalImmediateTaskBody destTaskBody = createComSendSignalImmediateTaskBody(sourceOsTask, destImmediateEntity);
			destTaskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourceOsTask.getOwnerApplication().get(0).getOsAppEcucPartition())));
			targetRte.setComSendSignalImmediateTaskBody(destTaskBody);
		}
	}

	private ComSendSignalPeriodicEntity createComSendSignalPeriodicEntity(PeriodicComSendProxy sourceComSendProxy) throws ModelException {
		// �ؿ�����ܥ�ι���
		ComSendSignalPeriodicEntity destEntity = ModuleFactory.eINSTANCE.createComSendSignalPeriodicEntity();
		destEntity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_PERIODIC_ENTITY_NAME);
		destEntity.setReturnType(this.context.cache.voidType);

		// ������¤�ι���
		buildInternalPartOfComSendSignalProxyEntity(destEntity, sourceComSendProxy);
		return destEntity;
	}

	private ComSendSignalImmediateEntity createComSendSignalImmediateEntity(ImmediateComSendProxy sourceComSendProxy) throws ModelException {
		// �ؿ�����ܥ�ι���
		ComSendSignalImmediateEntity destEntity = ModuleFactory.eINSTANCE.createComSendSignalImmediateEntity();
		destEntity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_IMMEDIATE_ENTITY_NAME);
		destEntity.setReturnType(this.context.cache.voidType);

		// ������¤�ι���
		buildInternalPartOfComSendSignalProxyEntity(destEntity, sourceComSendProxy);
		return destEntity;
	}

	private void buildInternalPartOfComSendSignalProxyEntity(ComSendSignalProxyEntity targetEntity, ComSendProxy sourceComSendProxy) throws ModelException {
		// �ץ�ߥƥ��ַ���ʣ��ǡ������Ƕ��̤Ȥʤ�������¤����
		LocalVariable destReturnVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetEntity.getLocalVariable().add(destReturnVariable);

		// �ץ�ߥƥ��ַ�������������¤����
		List<ComSendProxyInteraction> sourcePrimitiveProxyInteractions = getPrimitiveProxyInteractions(sourceComSendProxy);
		if (!sourcePrimitiveProxyInteractions.isEmpty()) {
			UnionType destPrimitiveProxyUnionType = this.localSymbolModelBuilder.createPrimitiveComProxyUnionType();
			targetEntity.getLocalType().add(destPrimitiveProxyUnionType);

			LocalVariable destPrimitiveProxySignalIdVariable = this.localSymbolModelBuilder.createComProxySignalIdVariable();
			targetEntity.getLocalVariable().add(destPrimitiveProxySignalIdVariable);

			LocalVariable destPrimitiveProxyDataVariable = this.localSymbolModelBuilder.createComProxyUnionDataVariable(destPrimitiveProxyUnionType);
			targetEntity.getLocalVariable().add(destPrimitiveProxyDataVariable);

			for (ComSendProxyInteraction sourceProxyInteraction : sourcePrimitiveProxyInteractions) {
				PrimitiveType type = this.context.builtQuery.findDestPrimitiveType(sourceProxyInteraction.getSignalDataType());
				VariableMember dataVariable = this.context.query.selectSingle(destPrimitiveProxyDataVariable.getMember(),
						hasAttr(VARIABLE__SYMBOL_NAME, SymbolNames.createComProxyUnionVariableMemberName(type)));

				targetEntity.getPrimitiveOperation().add(
						this.comProxyOperationModelBuilder.createPrimitiveComSendProxyOperation(sourceProxyInteraction, destPrimitiveProxySignalIdVariable, dataVariable));
			}
		}

		// ʣ��ǡ����������Υץ�����������
		List<ComSendProxyInteraction> sourceComplexProxyInteractions = getComplexComSendProxyInteractions(sourceComSendProxy);
		if (!sourceComplexProxyInteractions.isEmpty()) {
			LocalVariable destIndexVariable = this.localSymbolModelBuilder.createComProxyFunctionTableIndexVariable();
			targetEntity.getLocalVariable().add(destIndexVariable);

			// ʣ��ǡ������ѤΥץ��������ϥѡ��ƥ��������Ƕ��̤Ȥʤ�Τǡ��ѡ��ƥ������ñ�̤���������
			ListMultimap<EcucPartition, ComSendProxyInteraction> sourceProxyInteractionsGroupByRequesterPartition = this.context.query.groupByKey(sourceComplexProxyInteractions,
					COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION);
			for (EcucPartition sourceRequesterPartition : sourceProxyInteractionsGroupByRequesterPartition.keySet()) {
				List<ComSendProxyInteraction> sourceProxyInteractionsOfRequesterPartition = sourceProxyInteractionsGroupByRequesterPartition.get(sourceRequesterPartition);
				targetEntity.getComplexOperation().add(this.comProxyOperationModelBuilder.createComplexComSendProxyOperation(sourceProxyInteractionsOfRequesterPartition, destIndexVariable));
			}
		}
	}

	private List<ComSendProxyInteraction> getPrimitiveProxyInteractions(ComSendProxy sourceComSendProxy) {
		List<ComSendProxyInteraction> sourcePrimitiveProxyInteractions = new ArrayList<ComSendProxyInteraction>();
		for (ComSendProxyInteraction sourceProxyInteraction : sourceComSendProxy.getInteraction()) {
			if (sourceProxyInteraction.getSignalDataType().isPrimitiveType()) {
				sourcePrimitiveProxyInteractions.add(sourceProxyInteraction);
			}
		}
		return sourcePrimitiveProxyInteractions;
	}

	private List<ComSendProxyInteraction> getComplexComSendProxyInteractions(ComSendProxy sourceComSendProxy) {
		List<ComSendProxyInteraction> sourceComplexProxyInteractions = new ArrayList<ComSendProxyInteraction>();
		for (ComSendProxyInteraction sourceProxyInteraction : sourceComSendProxy.getInteraction()) {
			if (sourceProxyInteraction.getSignalDataType().isComplexType()) {
				sourceComplexProxyInteractions.add(sourceProxyInteraction);
			}
		}
		return sourceComplexProxyInteractions;
	}

	private ComSendSignalImmediateTaskBody createComSendSignalImmediateTaskBody(OsTask sourceOsTask, ComSendSignalImmediateEntity immediateEntity) {
		ComSendSignalImmediateTaskBody destTaskBody = ModuleFactory.eINSTANCE.createComSendSignalImmediateTaskBody();
		destTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));

		// ������¤�ι���
		destTaskBody.setOsTaskId(sourceOsTask.getShortName());
		destTaskBody.setOsEventId(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		destTaskBody.setStartEntity(immediateEntity);
		return destTaskBody;
	}

	private void buildComCallbacks(Rte targetRte) throws ModelException {
		for (ExternalEcuSender sourceExternalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_CALLBACK__EXTERNALECUSENDER)) {
				targetRte.getComCallback().add(createComReceiveCallback(sourceExternalEcuSender));
			}
			if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INVALIDATE_CALLBACK__EXTERNALECUSENDER)) {
				targetRte.getComCallback().add(createComInvalidateCallback(sourceExternalEcuSender));
			}
			if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK__EXTERNALECUSENDER)) {
				targetRte.getComCallback().add(createComReceiveTimeoutCallback(sourceExternalEcuSender));
			}
		}
		for (ComCallback targetComCallback : targetRte.getComCallback()) {
			targetComCallback.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.<EcucPartition> absent()));
		}
	}

	private ComReceiveCallback createComReceiveCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		InternalEcuReceiver sourceFirstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceComSignalOrComSignalGroup);
	
		// �ؿ�����ܥ�ι���
		ComReceiveCallback destCallback = ModuleFactory.eINSTANCE.createComReceiveCallback();
		destCallback.setSymbolName(SymbolNames.createComReceiveCallbackName(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);

		// ������¤�ι���
		// ������ǻ��Ѥ���COM���������ؿ��δ�Ϣ��
		destCallback.setAccessApi(comReceiveSignalApi);

		// �������ѿ��ι���
		Variable destDataVariable = findOrCreateComCallbackDataVariable(sourceFirstReceiver, sourceComSignalOrComSignalGroup);
		if (destDataVariable instanceof LocalVariable) {
			destCallback.getLocalVariable().add((LocalVariable)destDataVariable);
		}
		destCallback.setDataVariable(destDataVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		destCallback.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
			SendOperation destOperation;
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				if (sourceFirstReceiver.getSource().getPrototype().isEventSemantics()) {
					destOperation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sourceSendInteraction, destDataVariable);
				} else {
					destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComReceiveCallback(sourceSendInteraction, sourceExternalEcuSender, destDataVariable, destFilterResultVariable);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof IocSendImplementation) {
				// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				// S/R�μ¸��������������ˤ��ѹ��Ȥʤ�ECU�֤Ǥ�IOC�Хåե�����Ѥ��ʤ��ʤä�
				IocSendImplementation sourceIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation();
				if (sourceFirstReceiver.getSource().getPrototype().isEventSemantics()) {
					destOperation = this.srOperationBuilder.createIocQueuedSendOperation(sourceIocSendImplementation, destDataVariable, Optional.<LocalVariable> absent());
				} else {
					destOperation = this.srOperationBuilder.createIocNonqueuedSendOperation(sourceIocSendImplementation, destDataVariable, Optional.<LocalVariable> absent());
				}
	
			} else {
				continue;
			}
	
			destCallback.getOperation().add(destOperation);
		}
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destCallback);
	
		return destCallback;
	}

	private ComInvalidateCallback createComInvalidateCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		// �ؿ�����ܥ�ι���
		ComInvalidateCallback destCallback = ModuleFactory.eINSTANCE.createComInvalidateCallback();
		destCallback.setSymbolName(SymbolNames.createComInvalidateCallbackName(sourceExternalEcuSender.getSourceSignal()));
		destCallback.setReturnType(this.context.cache.voidType);

		// ������¤�ι���
		// �������ѿ��ι���
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		destCallback.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
			SendOperation destOperation;
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
				destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComInvalidateCallback(sourceSendInteraction, sourceExternalEcuSender, destFilterResultVariable);
	
			} else { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				assert false; // �����ˤ���ʤ�
				continue;
			}
	
			destCallback.getOperation().add(destOperation);
		}
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(destCallback);
	
		return destCallback;
	}

	private ComReceiveTimeoutCallback createComReceiveTimeoutCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		InternalEcuReceiver sourceFirstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceComSignalOrComSignalGroup);

		// �ؿ�����ܥ�ι���
		ComReceiveTimeoutCallback destCallback = ModuleFactory.eINSTANCE.createComReceiveTimeoutCallback();
		destCallback.setSymbolName(SymbolNames.createComReceiveTimeoutCallbackName(sourceComSignalOrComSignalGroup));
		destCallback.setReturnType(this.context.cache.voidType);

		// ������¤�ι���
		// ������ǻ��Ѥ���COM���������ؿ��δ�Ϣ��
		destCallback.setAccessApi(comReceiveSignalApi);

		// �������ѿ��ι���
		Variable destDataVariable = findOrCreateComCallbackDataVariable(sourceFirstReceiver, sourceComSignalOrComSignalGroup);
		if (destDataVariable instanceof LocalVariable) {
			destCallback.getLocalVariable().add((LocalVariable)destDataVariable);
		}
		destCallback.setDataVariable(destDataVariable);
	
		// ���������ι���
		for (SendInteraction sourceSendInteraction : sourceExternalEcuSender.getSendInteraction()) {
			InternalEcuReceiver sourceSendInteractionReceiver = sourceSendInteraction.getReceiveInteraction().getInternalEcuReceivers().get(0);
			if (!sourceSendInteractionReceiver.isAliveTimeoutEnabled()) {
				continue;
			}
	
			SendOperation destOperation;
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
				destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComReceiveTimeoutCallback(sourceSendInteraction, destDataVariable, this.context.cache.rteErrorMaxAgeExceededConstant);
	
			} else { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				assert false; // �����ˤ���ʤ�
				continue;
			}

			destCallback.getOperation().add(destOperation);
		}
		return destCallback;
	}

	private Variable findOrCreateComCallbackDataVariable(InternalEcuReceiver sourceFirstReceiver, EcucContainer sourceComSignalOrComSignalGroup) throws ModelException {
		Optional<RteBufferVariableSet> foundComReceiveBufferVariableSet = this.context.builtQuery.trySelectDest(this.context.cache.masterBswPartition.getComReceiveBufferVariableSet(),
				sourceComSignalOrComSignalGroup);
		if (foundComReceiveBufferVariableSet.isPresent()) {
			return foundComReceiveBufferVariableSet.get().getComplexVariable();
		} else {
			return this.localSymbolModelBuilder.createSrDataVariable(sourceFirstReceiver.getSource().getPrototype(), SymbolNames.SR_DATA_VAR_NAME);
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(�饤�ե�������)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildRteLifecycleImplFunctions() throws ModelException {
		buildRteLifecycleApis();
	}

	private void buildRteLifecycleApis() throws ModelException {
		Rte targetRte = this.context.cache.rte;
	
		OsOS sourceOsOs = this.context.query.findSingleByKind(OS_OS);
	
		// RTE�Υ饤�ե�����������Ѥ�API����
		if (sourceOsOs.isMulticoreOs()) {
			// �ޥ����������
	
			// �������Start API�μ�������
			for (Core sourceCore : targetRte.getCore()) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceCore.getCoreId())));
	
				RteCoreStartApiImpl destStartApiImpl = createRteCoreStartApiImpl(sourceCore);
				destStartApiImpl.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(bswPartition)));
				sourceCore.setRteCoreStartApiImpl(destStartApiImpl);
			}
	
			// Start/Stop API����
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);

			MulticoreRteStartApi destStartApi = createMulticoreRteStartApi(targetRte);
			destStartApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStartApi(destStartApi);
	
			RteStopApi destStopApi = createRteStopApi();
			destStopApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStopApi(destStopApi);
	
		} else {
			// ���󥰥륳������
			Core sourceCore = targetRte.getCore().get(0);
	
			// Start/Stop API����
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);
	
			SinglecoreRteStartApi destStartApi = createSinglecoreRteStartApi(sourceCore);
			destStartApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStartApi(destStartApi);
	
			RteStopApi destStopApi = createRteStopApi();
			destStopApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStopApi(destStopApi);
		}
	
		// �ѡ��ƥ������Υ饤�ե�����������Ѥ�API����
		for (EcucPartition sourcePartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourcePartition);
			MemoryMapping partitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition));
	
			if (this.context.query.get(sourcePartition, ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION)) {
				RestartPartitionApi destRestartPartitionApi = createRestartPartitionApi(sourcePartition);
				destRestartPartitionApi.setMemoryMapping(partitionMemmap);
				targetPartition.setRestartPartitionApi(destRestartPartitionApi);
			}
			if (this.context.query.get(sourcePartition, ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION)) {
				PartitionRestartingApi destPartitionRestartingApi = createPartitionRestartingApi(sourcePartition);
				destPartitionRestartingApi.setMemoryMapping(partitionMemmap);
				targetPartition.setPartitionRestartingApi(destPartitionRestartingApi);
			}
	
			PartitionTerminatedApi destPartitionTerminatedApi = createPartitionTerminatedApi(sourcePartition);
			destPartitionTerminatedApi.setMemoryMapping(partitionMemmap);
			targetPartition.setPartitionTerminatedApi(destPartitionTerminatedApi);
		}
	}

	private SinglecoreRteStartApi createSinglecoreRteStartApi(Core sourceCore) throws ModelException {
		SinglecoreRteStartApi destStartApi = ModuleFactory.eINSTANCE.createSinglecoreRteStartApi();
		destStartApi.setSymbolName(SymbolNames.RTE_START_API_NAME);
		destStartApi.setReturnType(this.context.cache.stdReturnType);

		// ������¤
		destStartApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtStart(sourceCore));
		return destStartApi;
	}

	private MulticoreRteStartApi createMulticoreRteStartApi(Rte rte) {
		MulticoreRteStartApi destStartApi = ModuleFactory.eINSTANCE.createMulticoreRteStartApi();
		destStartApi.setSymbolName(SymbolNames.RTE_START_API_NAME);
		destStartApi.setReturnType(this.context.cache.stdReturnType);

		// ������¤
		destStartApi.getCoreStartApiImpl().addAll(this.context.query.<RteCoreStartApiImpl> findByKind(rte, RTE_CORE_START_API_IMPL));
		return destStartApi;
	}

	private RteCoreStartApiImpl createRteCoreStartApiImpl(Core sourceCore) throws ModelException {
		RteCoreStartApiImpl destStartApi = ModuleFactory.eINSTANCE.createRteCoreStartApiImpl();
		destStartApi.setSymbolName(SymbolNames.createRteCoreStartApiImplName(sourceCore));
		destStartApi.setReturnType(this.context.cache.stdReturnType);

		// ������¤
		destStartApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtStart(sourceCore));
		return destStartApi;
	}

	private RteStopApi createRteStopApi() {
		RteStopApi destStopApi = ModuleFactory.eINSTANCE.createRteStopApi();
		destStopApi.setSymbolName(SymbolNames.RTE_STOP_API_NAME);
		destStopApi.setReturnType(this.context.cache.stdReturnType);
		return destStopApi;
	}

	private PartitionTerminatedApi createPartitionTerminatedApi(EcucPartition sourcePartition) throws ModelException {
		PartitionTerminatedApi destApi = ModuleFactory.eINSTANCE.createPartitionTerminatedApi();
		destApi.setSymbolName(SymbolNames.createPartitionTerminatedApiName(sourcePartition));
		destApi.setReturnType(this.context.cache.voidType);

		// ������¤
		destApi.setSrInterPartitionTimeoutOperation(this.srOperationBuilder.createInterPartitionTimeoutOperation(sourcePartition));
		return destApi;
	}

	private PartitionRestartingApi createPartitionRestartingApi(EcucPartition sourcePartition) throws ModelException {
		PartitionRestartingApi destApi = ModuleFactory.eINSTANCE.createPartitionRestartingApi();
		destApi.setSymbolName(SymbolNames.createPartitionRestartingApiName(sourcePartition));
		destApi.setReturnType(this.context.cache.voidType);

		// ������¤
		destApi.setSrInterPartitionTimeoutOperation(this.srOperationBuilder.createInterPartitionTimeoutOperation(sourcePartition));
		return destApi;
	}

	private RestartPartitionApi createRestartPartitionApi(EcucPartition sourcePartition) throws ModelException {
		RestartPartitionApi destApi = ModuleFactory.eINSTANCE.createRestartPartitionApi();
		destApi.setSymbolName(SymbolNames.createRestartPartitionApiName(sourcePartition));
		destApi.setReturnType(this.context.cache.stdReturnType);

		// ������¤
		destApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtPartitionRestart(sourcePartition));
		destApi.getOperation().add(this.initOperationBuilder.createIocInitializeOperationAtPartitionRestart(sourcePartition));
		return destApi;
	}

	private void buildSchmLifecycleImplFunctionsAndInternals() throws ModelException {
		buildSchmLifecycleApis();
	}

	private void buildSchmLifecycleApis() throws ModelException {
		Rte targetRte = this.context.cache.rte;

		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		// RTE�Υ饤�ե�����������Ѥ�API����
		if (osOs.isMulticoreOs()) {
			// �ޥ����������

			// �������Start API�μ�������
			for (Core sourceCore : targetRte.getCore()) {
				EcucPartition sourceBswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceCore.getCoreId())));

				SchmCoreInitApiImpl destInitApiImpl = createSchmCoreInitApiImpl(sourceCore);
				destInitApiImpl.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourceBswPartition)));
				sourceCore.setSchmCoreInitApiImpl(destInitApiImpl);
			}

			// Init/Deinit API����
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);

			MulticoreSchmInitApi destInitApi = createMulticoreSchmInitApi(targetRte);
			destInitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmInitApi(destInitApi);

			SchmDeinitApi destDeinitApi = createSchmDeinitApi();
			destDeinitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmDeinitApi(destDeinitApi);

		} else {
			// ���󥰥륳������
			Core sourceCore = targetRte.getCore().get(0);

			// Init/Deinit API����
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(this.context.cache.sourceMasterBswPartition);

			SinglecoreSchmInitApi destInitApi = createSinglecoreSchmInitApi(sourceCore);
			destInitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmInitApi(destInitApi);

			SchmDeinitApi destDeinitApi = createSchmDeinitApi();
			destDeinitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmDeinitApi(destDeinitApi);
		}
	}

	private SinglecoreSchmInitApi createSinglecoreSchmInitApi(Core sourceCore) throws ModelException {
		SinglecoreSchmInitApi destInitApi = ModuleFactory.eINSTANCE.createSinglecoreSchmInitApi();
		destInitApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		destInitApi.setReturnType(this.context.cache.voidType);

		// ������¤
		destInitApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
		buildModeSwitchEventPartOfSchmInitFunction(destInitApi, sourceCore);
		return destInitApi;
	}

	private MulticoreSchmInitApi createMulticoreSchmInitApi(Rte rte) {
		MulticoreSchmInitApi destInitApi = ModuleFactory.eINSTANCE.createMulticoreSchmInitApi();
		destInitApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		destInitApi.setReturnType(this.context.cache.voidType);

		// ������¤
		destInitApi.getCoreInitApiImpl().addAll(this.context.query.<SchmCoreInitApiImpl> findByKind(rte, SCHM_CORE_INIT_API_IMPL));
		return destInitApi;
	}

	private boolean runsAtInit(BswModeSwitchEvent sourceBswModeSwitchEvent) {
	    ModeInBswModuleDescriptionInstanceRef sourceOnEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);
		return sourceOnEntryModeIref.getTargetMode() == sourceOnEntryModeIref.getContextModeDeclarationGroup().getType().getInitialMode();
	}

	private SchmCoreInitApiImpl createSchmCoreInitApiImpl(Core sourceCore) throws ModelException {
		SchmCoreInitApiImpl destInitApi = ModuleFactory.eINSTANCE.createSchmCoreInitApiImpl();
		destInitApi.setSymbolName(SymbolNames.createSchmCoreStartApiImplName(sourceCore));
		destInitApi.setReturnType(this.context.cache.voidType);

		// ������¤
		destInitApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
		buildModeSwitchEventPartOfSchmInitFunction(destInitApi, sourceCore);
		return destInitApi;
	}

	private SchmDeinitApi createSchmDeinitApi() {
		SchmDeinitApi destDeinitApi = ModuleFactory.eINSTANCE.createSchmDeinitApi();
		destDeinitApi.setSymbolName(SymbolNames.SCHM_DEINIT_API_NAME);
		destDeinitApi.setReturnType(this.context.cache.voidType);
		return destDeinitApi;
	}

	private void buildModeSwitchEventPartOfSchmInitFunction(SchmInitApi targetInitApi, Core sourceCore) throws ModelException {
		for (Partition partition : sourceCore.getPartition()) {
			for (PartedBswm partedBswm : partition.getPartedBswm()) {
				for (ModeMachineInstance modeMachineInstance : partedBswm.getModeMachineInstance()) {
					ModeDeclarationGroupPrototype sourceModePrototype = (ModeDeclarationGroupPrototype) modeMachineInstance.getSingleSource();

					targetInitApi.getInitTargetModeMachineInstance().add(modeMachineInstance);
					buildModeSwitchEventPartOfSchmInitFunction(targetInitApi, sourceModePrototype);
				}
			}
		}
	}

	private void buildModeSwitchEventPartOfSchmInitFunction(SchmInitApi targetApi, ModeDeclarationGroupPrototype sourceProvidedModePrototype) throws ModelException {

		for (RteBswRequiredModeGroupConnection sourceModeConnection : this.context.query.<RteBswRequiredModeGroupConnection> find(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP, sourceProvidedModePrototype)))) {
			ModeDeclarationGroupPrototype sourceRequiredModeGroup = sourceModeConnection.getRteBswRequiredModeGroup();

			BswInternalBehavior sourceBswInternalBehavior = sourceModeConnection.getParent().getRteBswImplementation().getBehavior();
			for (BswModeSwitchEvent sourceBswModeSwitchEvent : getBswModeSwitchEventsTriggeredByRequiredModeGroup(sourceBswInternalBehavior, sourceRequiredModeGroup)) {
				if (!this.moduleRules.isEnabledBswEvent(sourceBswModeSwitchEvent)) {
					continue;
				}

				if (!runsAtInit(sourceBswModeSwitchEvent)) {
					continue;
				}

				RteBswEventToTaskMapping sourceBswEventToTaskMapping = sourceBswModeSwitchEvent.getConfig().get(0); // NOTE ����ե�����¸�ߤ��뤳�Ȥ�nrte_sws_0196�ǳ�ǧ�Ѥ�
				OsTask sourceOsTask = sourceBswEventToTaskMapping.getRteBswMappedToTask();
				if (sourceOsTask == null) {
					// ľ�ܵ�ư
					ModeSwitchTriggeringExecutableStartOperation destExcutableStartOperation = this.entityOperationBuilder.createModeSwitchTriggeringExecutableStartOperation(sourceBswInternalBehavior.getParent(), sourceBswModeSwitchEvent);
					targetApi.getInitialExecutableStartOperation().add(destExcutableStartOperation);

				} else {
					// OS��������ư��OS���٥������
					buildOsTaskEvent(targetApi.getInitialExecutableOsTaskEvent(), sourceBswEventToTaskMapping, sourceOsTask);
				}
			}
		}

		// ��������������¤�򥽡���
		// ���������塼���֥볫�Ͻ���
		Ordering<EObject> executableStartOperationOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(EXECUTABLE_START_OPERATION__START_EXECUTABLE, FUNCTION__SYMBOL_NAME))
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE, CONSTANT__SYMBOL_NAME)));
		ECollections.sort(targetApi.getInitialExecutableStartOperation(), executableStartOperationOrdering);

		// OsTaskEvent
		Ordering<EObject> taskEventOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_PRIORITY)).reverse()
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_ID)));
		ECollections.sort(targetApi.getInitialExecutableOsTaskEvent(), taskEventOrdering);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ붦�̤Υ桼�ƥ���ƥ�
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildTrustedFunctionSignature(TrustedFunction targetTrustedFunction) {
		targetTrustedFunction.setReturnType(this.context.cache.osStatusType);
	
		targetTrustedFunction.getParam().add(this.localSymbolModelBuilder.createTrustedFunctionIndexParam());
		targetTrustedFunction.getParam().add(this.localSymbolModelBuilder.createTrustedFunctionParamsParam());
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�������¤
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * �ؿ��Υ���ܥ�������¤��ǥ�(API)���ۤ��롣
	 * NOTE �����Ǥ���API�ϥ��ץꥱ�����������Τ�ΤΤߤǤ��ꡢ�饤�ե�������API�����������Ѥΰ����Ǥ��뤳�Ȥ���ա�
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildApiFunctionInternals() throws ModelException {
		if (this.context.options.doesGenerateRte) {
			buildRteApiInternals();
		}

		if (this.context.options.doesGenerateSchm) {
			buildSchmApiInternals();
		}
	}

	private void buildRteApiInternals() throws ModelException {
		for (Swc targetSwc : this.context.query.<Swc> findByKind(SWC)) {
			for (WriteApi targetApi : this.context.query.<RteApi, WriteApi> selectByKind(targetSwc.getRteApi(), WRITE_API)) {
				buildWriteApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (InvalidateApi targetApi : this.context.query.<RteApi, InvalidateApi> selectByKind(targetSwc.getRteApi(), INVALIDATE_API)) {
				buildInvalidateApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (SendApi targetApi : this.context.query.<RteApi, SendApi> selectByKind(targetSwc.getRteApi(), SEND_API)) {
				buildSendApiInternal(targetApi, (PVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (ReadApi targetApi : this.context.query.<RteApi, ReadApi> selectByKind(targetSwc.getRteApi(), READ_API)) {
				buildReadApiInternal(targetApi, (RVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (ReceiveApi targetApi : this.context.query.<RteApi, ReceiveApi> selectByKind(targetSwc.getRteApi(), RECEIVE_API)) {
				buildReceiveApiInternal(targetApi, (RVariableDataInstanceInSwc) targetApi.getSingleSource());
			}
			for (CallApi targetApi : this.context.query.<RteApi, CallApi> selectByKind(targetSwc.getRteApi(), CALL_API)) {
				buildCallApiInternal(targetApi, (ROperationInstanceInSwc) targetApi.getSingleSource());
			}
			for (IrvWriteApi targetApi : this.context.query.<RteApi, IrvWriteApi> selectByKind(targetSwc.getRteApi(), IRV_WRITE_API)) {
				buildIrvWriteApiInternal(targetApi, (VariableDataPrototype) targetApi.getSingleSource());
			}
			for (IrvReadApi targetApi : this.context.query.<RteApi, IrvReadApi> selectByKind(targetSwc.getRteApi(), IRV_READ_API)) {
				buildIrvReadApiInternal(targetApi, (VariableDataPrototype) targetApi.getSingleSource());
			}
			for (RteEnterApi targetApi : this.context.query.<RteApi, RteEnterApi> selectByKind(targetSwc.getRteApi(), RTE_ENTER_API)) {
				buildRteEnterApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
			for (RteExitApi targetApi : this.context.query.<RteApi, RteExitApi> selectByKind(targetSwc.getRteApi(), RTE_EXIT_API)) {
				buildRteExitApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
		}
	}

	private void buildSchmApiInternals() throws ModelException {
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			BswModuleDescription sourceBswModuleDescription = (BswModuleDescription) targetPartedBswm.getBswm().getSingleSource();

			for (SchmModeApi targetApi : this.context.query.<SchmApi, SchmModeApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_MODE_API)) {
				buildSchmModeApiInternal(targetApi, (ModeDeclarationGroupPrototype) targetApi.getSingleSource(), sourceBswModuleDescription);
			}
			for (SchmSwitchApi targetApi : this.context.query.<SchmApi, SchmSwitchApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_SWITCH_API)) {
				buildSchmSwitchApiInternal(targetApi, (ModeDeclarationGroupPrototype) targetApi.getSingleSource());
			}
			for (SchmEnterApi targetApi : this.context.query.<SchmApi, SchmEnterApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_ENTER_API)) {
				buildSchmEnterApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
			for (SchmExitApi targetApi : this.context.query.<SchmApi, SchmExitApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_EXIT_API)) {
				buildSchmExitApiInternal(targetApi, (ExclusiveArea) targetApi.getSingleSource());
			}
		}
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�������¤(S/R)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildWriteApiInternal(WriteApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);

		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
	
		Parameter dataParam = targetApi.getDataParam();
	
		// ��³���֤�����
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());
	
		// �������ѿ����������
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
		
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
		
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		targetApi.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		LocalVariable destTfParamVariableForSignal = null;
		LocalVariable destTfParamVariableForSignalGroup = null;
		for (SendInteraction sourceSendInteraction : sourceSender.getSendInteraction()) {
			SendOperation destOperation;
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteApi(targetApi, sourceSendInteraction, dataParam, destFilterResultVariable);
	
			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation sourceTrustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createTrustedFunctionRteBufferWriteSendOperation(sourceTrustedFunctionRteSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable);
	
			} else if (sourceSendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation sourceIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createIocNonqueuedSendOperation(sourceIocSendImplementation, dataParam, Optional.of(destReturnValueVariable));
	
			} else if (sourceSendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation sourceDirectComSendImplementation = (DirectComSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createDirectComSendOperation(sourceDirectComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable);
	
			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation sourceTrustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sourceSendInteraction.getImplementation();
	
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				if (sourceDataInstanceInSwc.getImplementationDataType().isPrimitiveType()) {
					setInitReturnValueVariable(destReturnValueVariable);
				}
				if (sourceTrustedFunctionComSendImplementation.getComSignal() != null) {
					if (destTfParamVariableForSignal == null) {
						destTfParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignal);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable, destTfParamVariableForSignal, destTempReturnValueVariable, type);
				} else {
					if (destTfParamVariableForSignalGroup == null) {
						destTfParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignalGroup);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable, destTfParamVariableForSignalGroup, destTempReturnValueVariable, type);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation sourceImmediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createImmediateProxyComSendOperation(sourceImmediateProxyComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable, type);
	
			} else if (sourceSendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) {
				PeriodicProxyComSendImplementation sourcePeriodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sourceSendInteraction.getImplementation();
	
				setInitReturnValueVariable(destReturnValueVariable);
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createPeriodicProxyComSendOperation(sourcePeriodicProxyComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable, type);
	
			} else {
				continue;
			}

			destOperation.setIsWriteApi(true);
			targetApi.getOperation().add(destOperation);
		}
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}

		// �����Υ�������å���ɬ�פ�������
		targetApi.setNeedsCheckArg(needsCheckArg(targetApi.getOperation(), dataParam.getType()));
	}

	private boolean needsCheckArg(EList<SendOperation> sendOperations, Type type) {
		if (type instanceof PrimitiveType) {
			return false;
		}

		for (SendOperation sendOperation : sendOperations) {
			if (sendOperation instanceof TrustedFunctionRteOperation) {
				return true;
			} else if (sendOperation instanceof TrustedFunctionComSendOperation && !(type instanceof PointerType)) { // COVERAGE nrte_sws_0287�ˤ�ꡢTrustedFunctionComSendOperation����PointerType����뤳�ȤϤʤ�
				return true;
			} else if (sendOperation instanceof IocSendOperation && type instanceof PointerType) {
				return true;
			}
		}
		return false;
	}
	
	private void setInitReturnValueVariable(LocalVariable targetReturnValueVariable) {
		targetReturnValueVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
	}

	private void buildInvalidateApiInternal(InvalidateApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}
		
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
	
		// ��³���֤�����
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());
	
		// �������ѿ����������
		Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);
	
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		setInitReturnValueVariable(destReturnValueVariable);
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
		
		LocalVariable destInvalidValueVariable = this.localSymbolModelBuilder.createSrInvalidValueVariable(sourceDataInstanceInSwc);
		destInvalidValueVariable.setInitValueConstant(invalidValueConstant);
		targetApi.getLocalVariable().add(destInvalidValueVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		targetApi.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		LocalVariable destTfParamVariableForSignal = null;
		LocalVariable destTfParamVariableForSignalGroup = null;
		for (SendInteraction sourceSendInteraction : sourceSender.getSendInteraction()) {
			SendOperation destOperation;
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				destOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateApi(targetApi, sourceSendInteraction, invalidValueConstant, destFilterResultVariable);
	
			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation sourceTrustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sourceSendInteraction.getImplementation();
				destOperation = this.srOperationBuilder.createTrustedFunctionRteBufferInvalidateSendOperation(sourceSendInteraction, sourceTrustedFunctionRteSendImplementation, destReturnValueVariable, destTempReturnValueVariable);
	
			} else if (sourceSendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation sourceDirectComSendImplementation = (DirectComSendImplementation) sourceSendInteraction.getImplementation();
				destOperation = this.srOperationBuilder.createDirectComSendOperation(sourceDirectComSendImplementation, destInvalidValueVariable, destReturnValueVariable, destTempReturnValueVariable);
	
			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation sourceTrustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sourceSendInteraction.getImplementation();
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				if (sourceTrustedFunctionComSendImplementation.getComSignal() != null) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�) ̵������ʣ��ǡ�����̤���ݡ���(nrte_sws_0291)
					if (destTfParamVariableForSignal == null) {
						destTfParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignal);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, destInvalidValueVariable, destReturnValueVariable, destTfParamVariableForSignal, destTempReturnValueVariable, type);
				} else {
					// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�) ̵������ʣ��ǡ�����̤���ݡ���(nrte_sws_0291)
					if (destTfParamVariableForSignalGroup == null) {
						destTfParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignalGroup);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, destInvalidValueVariable, destReturnValueVariable, destTfParamVariableForSignalGroup, destTempReturnValueVariable, type);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation sourceImmediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sourceSendInteraction.getImplementation();
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createImmediateProxyComSendOperation(sourceImmediateProxyComSendImplementation, invalidValueConstant, destReturnValueVariable, destTempReturnValueVariable, type);
	
			} else if (sourceSendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
				PeriodicProxyComSendImplementation sourcePeriodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sourceSendInteraction.getImplementation();
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				destOperation = this.srOperationBuilder.createPeriodicProxyComSendOperation(sourcePeriodicProxyComSendImplementation, invalidValueConstant, destReturnValueVariable, destTempReturnValueVariable, type);
	
			} else { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				assert false; // �����ˤ���ʤ�
				continue;
			}
	
			targetApi.getOperation().add(destOperation);
		}
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void buildReadApiInternal(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Parameter dataParam = targetApi.getDataParam();
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			buildUnconnectedReadApiInternal(targetApi, sourceDataInstanceInSwc, dataParam);
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver sourceReceiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceDataInstanceInComposition));
	
		// ������¤�ι���
		if (sourceReceiver.getReceiveInteraction().isEmpty()) {
			buildUnconnectedReadApiInternal(targetApi, sourceDataInstanceInSwc, dataParam);
			return;
		}
	
		buildConnectedReadApi(targetApi, sourceDataInstanceInSwc, sourceReceiver);
	}

	private void buildConnectedReadApi(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, InternalEcuReceiver sourceReceiver) throws ModelException {
		Parameter dataParam = targetApi.getDataParam();
		ReceiveInteraction sourceReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);
	
		// ��³���֤�����
		targetApi.setIsConnected(true);
	
		// �֤������ѿ��ι���
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
	
		// �ɤ߹��߽����ι���
		ReadOperation destOperation;
		if (sourceReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			destOperation = this.srOperationBuilder.createRteBufferNonqueuedReadOperation(targetApi, sourceReceiveInteraction, dataParam, destReturnValueVariable);
	
		} else if (sourceReceiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) {
			IocValueBufferImplementation sourceIocValueBufferImplementation = (IocValueBufferImplementation) sourceReceiveInteraction.getValueBufferImplementation();
			destOperation = this.srOperationBuilder.createIocNonqueuedReadOperation(sourceIocValueBufferImplementation, dataParam, destReturnValueVariable);
	
		} else if (sourceReceiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			ComValueBufferImplementation sourceComValueBufferImplementation = (ComValueBufferImplementation) sourceReceiveInteraction.getValueBufferImplementation();
			destOperation = this.srOperationBuilder.createComReadOperation(sourceComValueBufferImplementation, sourceDataInstanceInSwc, dataParam, destReturnValueVariable, destTempReturnValueVariable);
	
		} else {
			destOperation = this.srOperationBuilder.createNeverReadOperation(targetApi, sourceDataInstanceInSwc, dataParam);
		}
	
		// ̵��������������
		HandleInvalidEnum sourceHandleInvalid = sourceDataInstanceInSwc.isInvalidationEnabled() ? sourceDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE;
		if (HandleInvalidEnum.KEEP.equals(sourceHandleInvalid)) {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.SR_INVALID_VALUE_ROLE_NAME);
			destOperation.setInvalidValueConstant(invalidValueConstant);
			if (targetApi.getIsInline()) {
				if (! targetApi.getInlineConstant().contains(invalidValueConstant)) {	// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�) ̵���ͥޥ���̾����ʣ���뤳�ȤϤʤ�
					targetApi.getInlineConstant().add(invalidValueConstant);
				}
			}
		}
	
		targetApi.setOperation(destOperation);
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void buildUnconnectedReadApiInternal(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, Parameter dataParam) throws ModelException {
		targetApi.setIsConnected(false);
		targetApi.setOperation(this.srOperationBuilder.createNeverReadOperation(targetApi, sourceDataInstanceInSwc, dataParam));
	}

	private void buildSendApiInternal(SendApi targetApi, PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sourceSender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
	
		Parameter dataParam = targetApi.getDataParam();
	
		// ��³���֤�����
		targetApi.setIsConnected(!sourceSender.getSendInteraction().isEmpty());
	
		// �������ѿ����������
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
	
		LocalVariable destFilterResultVariable = this.localSymbolModelBuilder.createSrFilterResultVariable();
		targetApi.getLocalVariable().add(destFilterResultVariable);
	
		// ���������ι���
		LocalVariable destTfParamVariableForRte = null;
		LocalVariable destTfParamVariableForSignal = null;
		LocalVariable destTfParamVariableForSignalGroup = null;
		for (SendInteraction sourceSendInteraction : sourceSender.getSendInteraction()) {
			SendOperation destOperation;
			if (sourceSendInteraction.getImplementation() instanceof RteSendImplementation) {
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sourceSendInteraction, dataParam, Optional.of(destReturnValueVariable));
	
			} else if (sourceSendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation sourceIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation();
				
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createIocQueuedSendOperation(sourceIocSendImplementation, dataParam, Optional.of(destReturnValueVariable), Optional.of(destTempReturnValueVariable));
	
			} else if (sourceSendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation sourceDirectComSendImplementation = (DirectComSendImplementation) sourceSendInteraction.getImplementation();
				
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createDirectComSendOperation(sourceDirectComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable);
				
			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation sourceTrustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				if (destTfParamVariableForRte == null) { // COVERAGE (�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
					destTfParamVariableForRte = this.localSymbolModelBuilder.createRteSendTrustedFunctionParamVariable();
					targetApi.getLocalVariable().add(destTfParamVariableForRte);
				}
				destOperation = this.srOperationBuilder.createTrustedFunctionRteSendOperation(sourceTrustedFunctionRteSendImplementation, dataParam, destReturnValueVariable, destTfParamVariableForRte, destTempReturnValueVariable, type);
	
			} else if (sourceSendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation sourceTrustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				if (sourceDataInstanceInSwc.getImplementationDataType().isPrimitiveType()) {
					setInitReturnValueVariable(destReturnValueVariable);
				}
				if (sourceTrustedFunctionComSendImplementation.getComSignal() != null) {
					if (destTfParamVariableForSignal == null) {
						destTfParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignal);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable, destTfParamVariableForSignal, destTempReturnValueVariable, type);
				} else {
					if (destTfParamVariableForSignalGroup == null) {
						destTfParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalGroupTrustedFunctionParamVariable();
						targetApi.getLocalVariable().add(destTfParamVariableForSignalGroup);
					}
					destOperation = this.srOperationBuilder.createTrustedFunctionComSendOperation(sourceTrustedFunctionComSendImplementation, dataParam, destReturnValueVariable, destTfParamVariableForSignalGroup, destTempReturnValueVariable, type);
				}
	
			} else if (sourceSendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation sourceImmediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createImmediateProxyComSendOperation(sourceImmediateProxyComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable, type);
	
			} else if (sourceSendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
				PeriodicProxyComSendImplementation sourcePeriodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sourceSendInteraction.getImplementation();
				
				Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(destReturnValueVariable);
				destOperation = this.srOperationBuilder.createPeriodicProxyComSendOperation(sourcePeriodicProxyComSendImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable, type);
	
			} else {
				continue;
			}
	
			targetApi.getOperation().add(destOperation);
		}
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	
		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}

		// �����Υ�������å���ɬ�פ�������
		targetApi.setNeedsCheckArg(needsCheckArg(targetApi.getOperation(), dataParam.getType()));
	}

	private void buildReceiveApiInternal(ReceiveApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);
	
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}
	
		VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceDataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver sourceReceiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceDataInstanceInComposition));
	
		Parameter dataParam = targetApi.getDataParam();
	
		// ������¤�ι���
		if (sourceReceiver.getReceiveInteraction().isEmpty()) {
			return;
		}
	
		ReceiveInteraction sourceReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);
	
		// ��³���֤�����
		targetApi.setIsConnected(true);
	
		// �֤������ѿ��ι���
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);
	
		targetApi.setReturnValue(destReturnValueVariable);
	
		LocalVariable destTempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(destTempReturnValueVariable);
	
		// �ɤ߹��߽����ι���
		ReadOperation destOperation;
		if (sourceReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			destOperation = this.srOperationBuilder.createRteBufferQueuedReadOperation(sourceReceiveInteraction, dataParam, destReturnValueVariable);
	
		} else if (sourceReceiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			IocValueBufferImplementation sourceIocValueBufferImplementation = (IocValueBufferImplementation) sourceReceiveInteraction.getValueBufferImplementation();
			destOperation = this.srOperationBuilder.createIocQueuedReceiveOperation(sourceIocValueBufferImplementation, dataParam, destReturnValueVariable, destTempReturnValueVariable);
	
		} else { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// �����ˤ���ʤ�
			assert false;
			return;
		}
	
		targetApi.setOperation(destOperation);
	
		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�������¤(C/S)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildCallApiInternal(CallApi targetApi, ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		targetApi.setIsConnected(false);

		// �ݡ����������������
		// ��³��Υ��ڥ졼�����¸�ߤ��뤫���ǧ
		if (sourceOperationInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}

		OperationInstanceInComposition sourceOperationInstanceInComposition = sourceOperationInstanceInSwc.getInstance().get(0);
		if (sourceOperationInstanceInComposition.getProviderConnection().isEmpty()) {
			return;
		}

		OperationInstanceInComposition sourceProvidedOperationInstanceInComposition = sourceOperationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc sourceProvidedOperationInstanceInSwc = (POperationInstanceInSwc) sourceProvidedOperationInstanceInComposition.getPrototype();
		OperationInvokedEvent sourceOperationInvokedEvent = sourceProvidedOperationInstanceInSwc.getOperationInvokedEvent().get(0);

		targetApi.setIsConnected(true);

		// ���Ѥ���ݡ�������������Ϣ��
		List<Value> portArgValues = findCsPortArgValues(sourceProvidedOperationInstanceInSwc);
		targetApi.getPortArgValue().addAll(portArgValues);

		// �������ѿ�����
		LocalVariable destReturnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(destReturnValueVariable);

		// ���ʥ֥볫�ϥ��ڥ졼��������
		targetApi.setOperation(this.entityOperationBuilder.createServerRunnableStartOperation(sourceOperationInvokedEvent.getStartOnEvent()));

		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity startRunnable = this.context.builtQuery.findDest(RUNNABLE_ENTITY, sourceOperationInvokedEvent.getStartOnEvent());
		if (targetApi.getIsInline()) {
			addInlineRunnableEntity(targetApi, startRunnable);

			for (Value value : portArgValues) {
				if (value instanceof Constant) {
					targetApi.getInlineConstant().add((Constant)value);
				} else if (value instanceof GlobalVariable) {	// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
					targetApi.getInlineGlobalVariable().add((GlobalVariable)value);
				}
			}
		} else {
			if (!(targetApi instanceof TfCallApi)) {
				if (! this.context.query.<RunnableEntity> collect(targetApi.getParent().getParent().getSwc(), SWC__DEPENDENT_RUNNABLE_ENTITY).contains(startRunnable)) {
					targetApi.getParent().getDependentExternalRunnableEntity().add(startRunnable);
				}
			}
		}
		if (!sourceProvidedOperationInstanceInSwc.getPrototype().getPossibleError().isEmpty()) {
			targetApi.setReturnVariable(destReturnValueVariable);
		}

		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(destReturnValueVariable)) {
			targetApi.setReturnValue(destReturnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void addInlineRunnableEntity(CallApi targetApi, jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity entity) {
		if (! targetApi.getInlineRunnableEntity().contains(entity)) { // COVERAGE (�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			targetApi.getInlineRunnableEntity().add(entity);
		}
	}

	private List<Value> findCsPortArgValues(POperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		if (operationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			return Collections.emptyList();
		}

		PortApiOption portApiOption = operationInstanceInSwc.getContextPort().getPortApiOption().get(0);
		return this.context.builtQuery.<Value> findDests(VALUE, portApiOption.getPortArgValue());
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�������¤(IRV)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildIrvWriteApiInternal(IrvWriteApi targetApi, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvWriteOperation destOperation = this.irvOperationBuilder.createIrvWriteOperation(targetApi, sourceDataPrototype, targetApi.getDataParam());
		targetApi.setOperation(destOperation);
		targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
	}

	private void buildIrvReadApiInternal(IrvReadApi targetApi, VariableDataPrototype sourceDataPrototype) throws ModelException {
		IrvReadOperation destOperation = this.irvOperationBuilder.createIrvReadOperation(targetApi, sourceDataPrototype, targetApi.getDataParam());
		targetApi.setOperation(destOperation);

		// ���Ѥ��Ƥ��ʤ��������ѿ������
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�������¤(��¾����)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildRteEnterApiInternal(RteEnterApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildRteExitApiInternal(RteExitApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildSchmEnterApiInternal(SchmEnterApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildSchmExitApiInternal(SchmExitApi targetApi, ExclusiveArea sourceExclusiveArea) {
		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private boolean isNoneExcludeOperation(ExcludeOperation operation) {
		return operation instanceof NoneExcludeOperation;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�������¤(�⡼��)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSchmModeApiInternal(SchmModeApi targetApi, ModeDeclarationGroupPrototype sourceModeUserModePrototype, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		Optional<ModeDeclarationGroupPrototype> sourceModeManagerModePrototype = tryGetModeManagerModePrototype(sourceBswModuleDescription, sourceModeUserModePrototype);

		if (sourceModeManagerModePrototype.isPresent()) {
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, sourceModeManagerModePrototype.get());
			if (modeInstance.isPresent()) {
				targetApi.setModeMachineInstance(modeInstance.get());
			}
		}

		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(targetApi.getParent().getBswm().getModeDeclarationGroup(), sourceModeUserModePrototype.getType());
		targetApi.setModeDeclarationGroup(modeDeclarationGroup);
	}

	private Optional<ModeDeclarationGroupPrototype> tryGetModeManagerModePrototype(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeUserModePrototype) {
		if (sourceBswModuleDescription.getProvidedModeGroup().contains(sourceModeUserModePrototype)) {
			// �⡼�ɥ桼������¦�ξ�硢�⡼�ɥ桼���ȥ⡼�ɥޥ͡����㤬Ʊ��Τ��ᡢ�⡼�ɥ桼���򤽤Τޤ��֤�
			return Optional.of(sourceModeUserModePrototype);
		} else {
			// �⡼�ɥ桼�����׵�¦�ξ�硢��³��Υ⡼�ɥޥ͡���������
			// NOTE ��³������¸�ߤ����ǽ�������뤬�����ξ��Ǥ���¦��ɬ��1�ĤȤʤ뤿�ᡢ��ɽ�Ȥʤ���³������¦���������
			Optional<RteBswRequiredModeGroupConnection> sourceConnection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(
					ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, sourceModeUserModePrototype)));
			if (sourceConnection.isPresent()) {
				// ��³����
				return Optional.of(sourceConnection.get().getRteBswProvidedModeGroup());
			} else {
				// ��³�ʤ�
				return Optional.absent();
			}
		}
	}

	private void buildSchmSwitchApiInternal(SchmSwitchApi targetApi, ModeDeclarationGroupPrototype sourceProvidedModePrototype) throws ModelException {
		Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, sourceProvidedModePrototype);
		if (modeInstance.isPresent()) { // COVERAGE ���true(API���������ȡ�ModeMachineInstance��������郎Ʊ���Ǥ��뤿��)
			targetApi.setModeMachineInstance(modeInstance.get());
		}

		buildModeSwitchEventPartOfSchmSwitchApi(targetApi, sourceProvidedModePrototype);
	}

	private void buildModeSwitchEventPartOfSchmSwitchApi(SchmSwitchApi targetApi, ModeDeclarationGroupPrototype sourceProvidedModePrototype) throws ModelException {

		for (RteBswRequiredModeGroupConnection sourceModeConnection : this.context.query.<RteBswRequiredModeGroupConnection> find(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_PROVIDED_MODE_GROUP, sourceProvidedModePrototype)))) {
			ModeDeclarationGroupPrototype sourceRequiredModeGroup = sourceModeConnection.getRteBswRequiredModeGroup();

			BswInternalBehavior sourceBswInternalBehavior = sourceModeConnection.getParent().getRteBswImplementation().getBehavior();
			for (BswModeSwitchEvent sourceBswModeSwitchEvent : getBswModeSwitchEventsTriggeredByRequiredModeGroup(sourceBswInternalBehavior, sourceRequiredModeGroup)) {
				if (!this.moduleRules.isEnabledBswEvent(sourceBswModeSwitchEvent)) {
					continue;
				}

				RteBswEventToTaskMapping sourceBswEventToTaskMapping = sourceBswModeSwitchEvent.getConfig().get(0); // NOTE ����ե�����¸�ߤ��뤳�Ȥ�nrte_sws_0196�ǳ�ǧ�Ѥ�
				OsTask sourceOsTask = sourceBswEventToTaskMapping.getRteBswMappedToTask();
				if (sourceOsTask == null) {
					// ľ�ܵ�ư
					ModeSwitchTriggeringExecutableStartOperation destExcutableStartOperation = this.entityOperationBuilder.createModeSwitchTriggeringExecutableStartOperation(sourceBswInternalBehavior.getParent(), sourceBswModeSwitchEvent);
					targetApi.getExecutableStartOperation().add(destExcutableStartOperation);

				} else {
					// OS��������ư��OS���٥������
					buildOsTaskEventByMode(targetApi.getOsTaskEventTriggeredByMode(), sourceBswModeSwitchEvent, sourceBswEventToTaskMapping, sourceOsTask);
				}
			}
		}

		// ��������������¤�򥽡���
		// ���������塼���֥볫�Ͻ���
		Ordering<EObject> executableStartOperationOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(EXECUTABLE_START_OPERATION__START_EXECUTABLE, FUNCTION__SYMBOL_NAME))
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE, CONSTANT__SYMBOL_NAME)));
		ECollections.sort(targetApi.getExecutableStartOperation(), executableStartOperationOrdering);

		// OsTaskEventTriggeredByMode
		Ordering<EObject> taskEventByModeOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, CONSTANT__SYMBOL_NAME));
		Ordering<EObject> taskEventOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_PRIORITY)).reverse()
				.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__OS_TASK_ID)));

		ECollections.sort(targetApi.getOsTaskEventTriggeredByMode(), taskEventByModeOrdering);
		for (OsTaskEventsTriggeredByMode byMode : targetApi.getOsTaskEventTriggeredByMode()) {
			ECollections.sort(byMode.getOsTaskEvent(), taskEventOrdering);
		}
	}

	private List<BswModeSwitchEvent> getBswModeSwitchEventsTriggeredByRequiredModeGroup(BswInternalBehavior sourceBswInternalBehavior, ModeDeclarationGroupPrototype sourceRequiredModeGroup) {
		List<BswModeSwitchEvent> foundBswModeSwitchEvents = new ArrayList<BswModeSwitchEvent>();
		for (BswModeSwitchEvent sourceBswModeSwitchEvent : this.context.query.<BswEvent, BswModeSwitchEvent> selectByKind(sourceBswInternalBehavior.getEvent(), BSW_MODE_SWITCH_EVENT)) {
			ModeInBswModuleDescriptionInstanceRef sourceOnEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);
			if (sourceOnEntryModeIref.getContextModeDeclarationGroup() == sourceRequiredModeGroup) {
				foundBswModeSwitchEvents.add(sourceBswModeSwitchEvent);
			}
		}
		return foundBswModeSwitchEvents;
	}

	private void buildOsTaskEventByMode(List<OsTaskEventsTriggeredByMode> targetTaskEventsByMode, BswModeSwitchEvent sourceSwitchEvent, RteBswEventToTaskMapping sourceTaskMapping, OsTask sourceOsTask)
			throws ModelException {
		Constant startModeConstant = getStartModeConstant(sourceSwitchEvent);

		OsTaskEventsTriggeredByMode destByMode = getOrBuildOsTaskEventsTriggeredByMode(targetTaskEventsByMode, startModeConstant);
		buildOsTaskEvent(destByMode.getOsTaskEvent(), sourceTaskMapping, sourceOsTask);
	}

	private OsTaskEventsTriggeredByMode getOrBuildOsTaskEventsTriggeredByMode(List<OsTaskEventsTriggeredByMode> targetTaskEventsByMode, Constant startModeConstant) {
		Optional<OsTaskEventsTriggeredByMode> foundTaskEventsByMode = this.context.query.trySelectSingle(targetTaskEventsByMode, ref(OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, startModeConstant));
		if (foundTaskEventsByMode.isPresent()) {
			return foundTaskEventsByMode.get();

		} else {
			OsTaskEventsTriggeredByMode destTaskEventsByMode = ModuleFactory.eINSTANCE.createOsTaskEventsTriggeredByMode();
			destTaskEventsByMode.setStartMode(startModeConstant);
			targetTaskEventsByMode.add(destTaskEventsByMode);
			return destTaskEventsByMode;
		}
	}

	private void buildOsTaskEvent(List<OsTaskEvent> targetTaskEvents, RteBswEventToTaskMapping sourceTaskMapping, OsTask sourceOsTask) {
		OsEvent sourceOsEvent = sourceTaskMapping.getRteBswUsedOsEvent();

		Optional<OsTaskEvent> foundOsTaskEvent = this.context.query.trySelectSingle(targetTaskEvents, hasAttr(OS_TASK_EVENT__OS_TASK_ID, sourceOsTask.getShortName()));
		if (foundOsTaskEvent.isPresent()) {
			// �����Ѥߤ�OsTaskEvent��¸�ߤ�����
			foundOsTaskEvent.get().getOsEventId().add(sourceOsEvent.getShortName());
			ECollections.sort(foundOsTaskEvent.get().getOsEventId());

		} else {
			// �����Ѥߤ�OsTaskEvent��¸�ߤ��ʤ����
			OsTaskEvent destTaskEvent = ModuleFactory.eINSTANCE.createOsTaskEvent();
			destTaskEvent.setOsTaskId(sourceOsTask.getShortName());
			if (sourceOsEvent != null) {
				destTaskEvent.getOsEventId().add(sourceOsEvent.getShortName());
			}
			destTaskEvent.setOsTaskPriority(sourceOsTask.getOsTaskPriority());
			targetTaskEvents.add(destTaskEvent);
		}
	}

	private Constant getStartModeConstant(BswModeSwitchEvent sourceBswModeSwitchEvent) throws ModelException {
		ModeInBswModuleDescriptionInstanceRef sourceOnEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);

		Bswm sourceBswm = this.context.builtQuery.findDest(BSWM, sourceBswModeSwitchEvent.getParent().getParent());
		ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(sourceBswm.getModeDeclarationGroup(), sourceOnEntryModeIref.getContextModeDeclarationGroup().getType());

		return this.context.builtQuery.selectDest(modeDeclarationGroup.getModeConstant(), sourceOnEntryModeIref.getTargetMode());
	}
}
