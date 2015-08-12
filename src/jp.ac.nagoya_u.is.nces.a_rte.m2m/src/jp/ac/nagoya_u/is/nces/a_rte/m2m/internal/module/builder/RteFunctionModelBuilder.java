/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_MODULE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ROOT_SW_COMPOSITION_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___PROVIDES_ENTER_EXIT_API__EXCLUSIVEAREA;
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
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CALL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_RECEIVE_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_START_OPERATION__START_EXECUTABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IMMEDIATE_PROXY_COM_SEND_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INVALIDATE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IRV_READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IRV_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENT__TASK_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_TASK_EVENT__TASK_PRIORITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTED_BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PERIODIC_PROXY_COM_SEND_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_MODE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_SWITCH_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SEND_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.Arrays;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallTrustedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyComplexOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalProxyEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedRunnables;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;

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
	}

	public void buildApiFunctions() throws ModelException {
		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = this.context.query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		if (rootSwCompositionPrototype.isPresent()) {
			buildRteApis();
		}

		Optional<BswImplementation> bswImplementation = this.context.query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		if (bswImplementation.isPresent()) {
			buildSchmApis();
		}
		
		buildDependentExecutableEntities();
	}

	private void buildRteApis() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!swc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = swc.get();

			// 送信側APIの構築
			for (PPortPrototype portPrototype : swComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					
					WriteApi writeApi;
					if (this.context.query.get(dataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC)) {
						writeApi = createWriteApi(dataInstanceInSwc);
						// インライン化
						writeApi.setIsInline(isInlineSrProvidedApi(dataInstanceInSwc));
						targetSwc.getRteApi().add(writeApi);
					}

					InvalidateApi invalidateApi;
					if (this.context.query.get(dataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC)) {
						invalidateApi = createInvalidateApi(dataInstanceInSwc);
						// インライン化
						invalidateApi.setIsInline(isInlineSrProvidedApi(dataInstanceInSwc));
						targetSwc.getRteApi().add(invalidateApi);
					}
					if (this.context.query.get(dataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC)) {
						SendApi sendApi = createSendApi(dataInstanceInSwc);
						// Rte_Sendはインライン化しない
						sendApi.setIsInline(false);
						targetSwc.getRteApi().add(sendApi);
					}
				}
			}
			
			// 受信側APIの構築
			boolean trustedFunctionPrepared = false;
			RteCsTrustedFunction trustedFunction = ModuleFactory.eINSTANCE.createRteCsTrustedFunction();
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					ReadApi readApi;
					if (this.context.query.get(dataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC)) {
						readApi = createReadApi(dataInstanceInSwc);
						// インライン化
						readApi.setIsInline(isInlineSrRequiredApi(dataInstanceInSwc));
						targetSwc.getRteApi().add(readApi);
					}
					if (this.context.query.get(dataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC)) {
						ReceiveApi receiveApi = createReceiveApi(dataInstanceInSwc);
						// Rte_Receiveはインライン化しない
						receiveApi.setIsInline(false);
						targetSwc.getRteApi().add(receiveApi);
					}
				}

				for (ROperationInstanceInSwc operationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(operationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Swc pTargetSwc = getPSwc(operationInstanceInSwc);
						CallApi callApi = null;
						if (pTargetSwc != null) {
							EcucPartition ecucPartition = (EcucPartition)targetSwc.getParent().getSingleSource();
							EcucPartition pEcucPartition = (EcucPartition)pTargetSwc.getParent().getSingleSource();

							 // COVERAGE (ecucPartitionがnullのときはpEcucPartitionもnullであるためカバレッジがパスしない．コードレビューで問題ないことを確認)
							if (ecucPartition != null && pEcucPartition != null
									&& !ecucPartition.isTrusted() && pEcucPartition.isTrusted()) {
								// 送信：非信頼、受信：信頼の場合、信頼関数使用
								callApi = createCallTrustedApi(operationInstanceInSwc, pTargetSwc, trustedFunction, trustedFunctionPrepared);
								trustedFunctionPrepared = true;
							} else {
								callApi = createCallApi(operationInstanceInSwc);
							}

							// インライン化
							callApi.setIsInline(isCsInline(ecucPartition, pEcucPartition, operationInstanceInSwc));
						} else {
							// 未接続の場合
							callApi = createCallApi(operationInstanceInSwc);
							callApi.setIsInline(isCsInline(operationInstanceInSwc));
						}
						targetSwc.getRteApi().add(callApi);
					}
				}
			}

			// 排他エリアAPIの構築
			for (ExclusiveArea sourceExclusiveArea : swComponentType.getInternalBehavior().getExclusiveArea()) {
				if (this.context.query.get(sourceExclusiveArea, EXCLUSIVE_AREA_EX___PROVIDES_ENTER_EXIT_API__EXCLUSIVEAREA)) {
					RteEnterApi rteEnterApi = createRteEnterApi(sourceExclusiveArea);
					rteEnterApi.setIsInline(isInline());
					targetSwc.getRteApi().add(rteEnterApi);

					RteExitApi rteExitApi = createRteExitApi(sourceExclusiveArea);
					rteExitApi.setIsInline(isInline());
					targetSwc.getRteApi().add(rteExitApi);
				}
			}

			// IRV APIの構築
			for (RunnableEntity runnable : swComponentType.getInternalBehavior().getRunnable()) {
				RteApi rteApi;
				for (VariableDataPrototype prototype : getUniqueVariableDataPrototype(runnable.getWrittenLocalVariable())) {
					rteApi = createIrvWriteApi(swComponentType, runnable, prototype);
					// インライン化
					rteApi.setIsInline(isInline());
					targetSwc.getRteApi().add(rteApi);
				}
				for (VariableDataPrototype prototype : getUniqueVariableDataPrototype(runnable.getReadLocalVariable())) {
					rteApi = createIrvReadApi(swComponentType, runnable, prototype);
					// インライン化
					rteApi.setIsInline(isInline());
					targetSwc.getRteApi().add(rteApi);
				}
			}

			// メモリマッピングを構築
			for (RteApi targetApi : targetSwc.getRteApi()) {
				EcucPartition sourcePartition = (EcucPartition) targetSwc.getParent().getSingleSource();
				targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
			}
		}
	}

	private Set<VariableDataPrototype> getUniqueVariableDataPrototype(EList<VariableAccess> accesses) {
		Set<VariableDataPrototype> prototypes = new HashSet<VariableDataPrototype>();
		for (VariableAccess variableAccess : accesses) {
			prototypes.add(variableAccess.getAccessedVariable().getLocalVariable());
		}
		return prototypes;
	}
	
	private Swc getPSwc(ROperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		if (operationInstanceInSwc.getInstance().isEmpty()) {
			return null;
		}
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return null;
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc providedOperationInstanceInSwc = (POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype();
		SwComponentType swType = providedOperationInstanceInSwc.getOwnerAtomicSwc();
		return this.context.builtQuery.findDest(SWC, swType);
	}
	
	private RteApi createIrvWriteApi(AtomicSwComponentType swComponentType, RunnableEntity runnable, VariableDataPrototype dataPrototype) throws ModelException {
		IrvWriteApi api = ModuleFactory.eINSTANCE.createIrvWriteApi();
		api.setSingleSource(dataPrototype);
		api.setSymbolName(SymbolNames.createRteIrvWriteApiImplName(swComponentType, runnable, dataPrototype));
		api.setApiMappingName(SymbolNames.createRteIrvWriteApiName(runnable, dataPrototype));

		Type paramType = this.context.builtQuery.findType(dataPrototype.getImplementationDataType());
		Parameter dataParam = this.localSymbolModelBuilder.createInDataParam(paramType);
		api.getParam().add(dataParam);
		api.setDataParam(dataParam);
		api.setReturnType(this.context.cache.stdReturnType);
		return api;
	}

	private RteApi createIrvReadApi(AtomicSwComponentType swComponentType, RunnableEntity runnable, VariableDataPrototype dataPrototype) throws ModelException {
		IrvReadApi api = ModuleFactory.eINSTANCE.createIrvReadApi();
		api.setSingleSource(dataPrototype);
		api.setSymbolName(SymbolNames.createRteIrvReadApiImplName(swComponentType, runnable, dataPrototype));
		api.setApiMappingName(SymbolNames.createRteIrvReadApiName(runnable, dataPrototype));

		Type paramType = this.context.builtQuery.findType(dataPrototype.getImplementationDataType());
		if (paramType instanceof PrimitiveType) {
			api.setReturnType(paramType);
		} else {
			api.setReturnType(this.context.cache.voidType);
			Parameter dataParam = this.localSymbolModelBuilder.createOutDataParam(paramType);
			api.getParam().add(dataParam);
			api.setDataParam(dataParam);
		}
		return api;
	}

	private void buildSignalApis() throws ModelException {
		AtomicSwComponentType swComponentType = this.context.query.<AtomicSwComponentType> findSingleByKind(ATOMIC_SW_COMPONENT_TYPE);
		Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
		if (!swc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		EcucPartition sourcePartition = null;
		Partition targetPartition;
		if (masterBswPartition.isPresent()) {
			sourcePartition = masterBswPartition.get();
			targetPartition = this.context.builtQuery.findPartition(masterBswPartition.get());
		} else {
			List<Partition> partitionList = this.context.query.<Partition> findByKind(PARTITION);
			targetPartition = partitionList.get(0);
		}

		SignalApi sendSignalApi = null;
		SignalApi receiveSignalApi = null;

		for (ComSignalGroup signalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (dataInstanceInCompositionList.isEmpty()) {
				continue;
			}
			Type type = this.context.builtQuery.findType(dataInstanceInCompositionList.get(0).getPrototype());

			if (!(type instanceof PrimitiveType)) { // COVERAGE 常にtrue(現状，ComSingnalGroupでPrimitiveTypeとなるパターンが存在しないため)
				VariableDataInstanceInSwc variableDataInstanceInSwc = dataInstanceInCompositionList.get(0).getPrototype();
				if (variableDataInstanceInSwc instanceof PVariableDataInstanceInSwc) {
					// 送信側マクロの構築
					if (sendSignalApi == null) {
						sendSignalApi = createSendSignalApi((PVariableDataInstanceInSwc) variableDataInstanceInSwc, sourcePartition);
					}
				} else {
					// 受信側マクロの構築
					if (receiveSignalApi == null) {
						receiveSignalApi = createReceiveSignalApi((RVariableDataInstanceInSwc) variableDataInstanceInSwc, sourcePartition);
					}
				}
			}
		}
		if (sendSignalApi != null) {
			targetPartition.getSignalApi().add(sendSignalApi);
		}
		if (receiveSignalApi != null) {
			targetPartition.getSignalApi().add(receiveSignalApi);
		}

		// メモリマッピングを構築
		for (SignalApi targetApi : targetPartition.getSignalApi()) {
			targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
		}
	}

	private void buildProxyApis() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!swc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
			Swc targetSwc = swc.get();

			EcucPartition sourcePartition;
			Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			if (masterBswPartition.isPresent()) {
				sourcePartition = masterBswPartition.get();
			} else { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				sourcePartition = (EcucPartition) targetSwc.getParent().getSingleSource();
			}

			// 送信側APIの構築
			for (PPortPrototype portPrototype : swComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					Type type = this.context.builtQuery.findType(dataInstanceInSwc);
					if (!(type instanceof PrimitiveType)) {
						createProxyApi(targetSwc, dataInstanceInSwc, sourcePartition, type);
					}
				}
			}
		}
	}
	
	private WriteApi createWriteApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		WriteApi api = ModuleFactory.eINSTANCE.createWriteApi();
		api.setSingleSource(sourceDataInstanceInSwc);
		api.setSymbolName(SymbolNames.createWriteApiImplName(sourceDataInstanceInSwc));
		api.setApiMappingName(SymbolNames.createWriteApiName(sourceDataInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの設定
		Type paramType = this.context.builtQuery.findType(sourceDataInstanceInSwc);

		Parameter dataParam = this.localSymbolModelBuilder.createInDataParam(paramType);
		api.getParam().add(dataParam);

		api.setDataParam(dataParam);
		return api;
	}

	private InvalidateApi createInvalidateApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		InvalidateApi api = ModuleFactory.eINSTANCE.createInvalidateApi();
		api.setSingleSource(sourceDataInstanceInSwc);
		api.setSymbolName(SymbolNames.createInvalidateApiImplName(sourceDataInstanceInSwc));
		api.setApiMappingName(SymbolNames.createInvalidateApiName(sourceDataInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);

		return api;
	}

	private SendApi createSendApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		SendApi api = ModuleFactory.eINSTANCE.createSendApi();
		api.setSingleSource(sourceDataInstanceInSwc);
		api.setSymbolName(SymbolNames.createSendApiImplName(sourceDataInstanceInSwc));
		api.setApiMappingName(SymbolNames.createSendApiName(sourceDataInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの設定
		Type paramType = this.context.builtQuery.findType(sourceDataInstanceInSwc);
		Parameter dataParam = this.localSymbolModelBuilder.createInDataParam(paramType);
		api.getParam().add(dataParam);
		api.setDataParam(dataParam);
		
		return api;
	}

	private ReadApi createReadApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		ReadApi api = ModuleFactory.eINSTANCE.createReadApi();
		api.setSingleSource(sourceDataInstanceInSwc);
		api.setSymbolName(SymbolNames.createReadApiImplName(sourceDataInstanceInSwc));
		api.setApiMappingName(SymbolNames.createReadApiName(sourceDataInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの構築
		Type paramType = this.context.builtQuery.findType(sourceDataInstanceInSwc);
		
		Parameter dataParam = this.localSymbolModelBuilder.createOutDataParam(paramType);
		api.getParam().add(dataParam);

		api.setDataParam(dataParam);
		return api;
	}

	private ReceiveApi createReceiveApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		ReceiveApi api = ModuleFactory.eINSTANCE.createReceiveApi();
		api.setSingleSource(sourceDataInstanceInSwc);
		api.setSymbolName(SymbolNames.createReceiveApiImplName(sourceDataInstanceInSwc));
		api.setApiMappingName(SymbolNames.createReceiveApiName(sourceDataInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの構築
		Type paramType = this.context.builtQuery.findType(sourceDataInstanceInSwc);

		Parameter dataParam = this.localSymbolModelBuilder.createOutDataParam(paramType);
		api.getParam().add(dataParam);

		api.setDataParam(dataParam);
		return api;
	}

	private SignalApi createSendSignalApi(PVariableDataInstanceInSwc sourceDataInstanceInSwc, EcucPartition sourcePartition) throws ModelException {
		SendSignalApi api = ModuleFactory.eINSTANCE.createSendSignalApi();
		api.setSingleSource(sourceDataInstanceInSwc);

		setSendSignalApiName(api, sourcePartition);
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの構築
		Parameter metaParam = ModuleFactory.eINSTANCE.createParameter();
		metaParam.setSymbolName(SymbolNames.DATA_REFERENCE_PARAM_META_NAME);
		metaParam.setType(this.context.cache.comMetaComplexDataType);
		metaParam.setHasConst(true);
		metaParam.setPassType(ParameterPassTypeEnum.REFERENCE);
		api.getParam().add(metaParam);

		Parameter dataParam = ModuleFactory.eINSTANCE.createParameter();
		dataParam.setSymbolName(SymbolNames.DATA_PARAM_NAME);
		dataParam.setType(this.context.cache.uint8Type);
		dataParam.setHasConst(true);
		api.getParam().add(dataParam);

		return api;
	}
	
	private SignalApi createReceiveSignalApi(RVariableDataInstanceInSwc sourceDataInstanceInSwc, EcucPartition sourcePartition) throws ModelException {
		ReceiveSignalApi api = ModuleFactory.eINSTANCE.createReceiveSignalApi();
		api.setSingleSource(sourceDataInstanceInSwc);

		setReceiveSignalApiName(api, sourcePartition);
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの構築
		Parameter metaParam = ModuleFactory.eINSTANCE.createParameter();
		metaParam.setSymbolName(SymbolNames.DATA_REFERENCE_PARAM_META_NAME);
		metaParam.setType(this.context.cache.comMetaComplexDataType);
		metaParam.setHasConst(true);
		metaParam.setPassType(ParameterPassTypeEnum.REFERENCE);
		api.getParam().add(metaParam);

		Parameter dataParam = ModuleFactory.eINSTANCE.createParameter();
		dataParam.setSymbolName(SymbolNames.DATA_PARAM_NAME);
		dataParam.setType(this.context.cache.uint8Type);
		api.getParam().add(dataParam);

		return api;
	}

	private void createProxyApi(Swc targetSwc, PVariableDataInstanceInSwc sourceDataInstanceInSwc, EcucPartition sourcePartition, Type type) throws ModelException {
		Optional<ComSignalGroup> comSignalGroup = this.context.query.tryFindSingleByKind(COM_SIGNAL_GROUP);
		if (comSignalGroup.isPresent()) {
			createProxyApiForComSignalGroup(targetSwc, sourceDataInstanceInSwc, sourcePartition, type);
		}
		Optional<ComSignal> comSignal = this.context.query.tryFindSingleByKind(COM_SIGNAL);
		if (comSignal.isPresent()) {
			createProxyApiForComSignal(targetSwc, sourceDataInstanceInSwc, sourcePartition, type);
		}
	}
	
	private void createProxyApiForComSignalGroup(Swc targetSwc, PVariableDataInstanceInSwc dataInstanceInSwc, EcucPartition sourcePartition, Type type) throws ModelException {
		for (ComSignalGroup signalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			for (VariableDataInstanceInComposition varInComposition : dataInstanceInCompositionList) {
				if (varInComposition.getPrototype() == dataInstanceInSwc) {
					// Complexのデータ渡し用
					createProxyApiEach(dataInstanceInSwc, sourcePartition, type, signalGroup, signalGroup.transfersImmediately());
				}
			}
		}
	}

	private void createProxyApiForComSignal(Swc targetSwc, PVariableDataInstanceInSwc dataInstanceInSwc, EcucPartition sourcePartition, Type type) throws ModelException {
		for (ComSignal signal: this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			for (VariableDataInstanceInComposition varInComposition : dataInstanceInCompositionList) {
				if (varInComposition.getPrototype() == dataInstanceInSwc) {
					createProxyApiEach(dataInstanceInSwc, sourcePartition, type, signal, signal.transfersImmediately());
				}
			}
		}
	}

	private void createProxyApiEach(PVariableDataInstanceInSwc sourceDataInstanceInSwc, EcucPartition sourcePartition, Type type, EcucReferrable signal, boolean immediate) throws ModelException {
		ProxyApi proxyApi = ModuleFactory.eINSTANCE.createProxyApi();
		proxyApi.setSymbolName(SymbolNames.createSrWriteProxyName(sourceDataInstanceInSwc, signal));
		if (immediate) {
			proxyApi.setIocReceiveSymbolName(SymbolNames.createIocReceiveComProxyImmediateApiName(sourceDataInstanceInSwc, signal));
			proxyApi.setBufferComProxySymbolName(SymbolNames.createBufferComProxyImmediateName(sourceDataInstanceInSwc, signal));
		} else {
			proxyApi.setIocReceiveSymbolName(SymbolNames.createIocReceiveComProxyPeriodicApiName(sourceDataInstanceInSwc, signal));
			proxyApi.setBufferComProxySymbolName(SymbolNames.createBufferComProxyPeriodicName(sourceDataInstanceInSwc, signal));
		}
		if (type instanceof StructType || type instanceof UnionType) {
			proxyApi.setProxyDataTypeName(type.getSymbolName());
		} else {
			proxyApi.setProxyDataTypeName(type.getOriginalTypeSymbolName());
		}
		
		if (signal instanceof ComSignalGroup) {
			proxyApi.setSignalGroupSymbolName(SymbolNames.createRteComSendSignalGroupFunctionName(sourcePartition));
			proxyApi.setBufferComMetaComplexDataSymbolName(SymbolNames.createBufferComMetaComplexDataName(signal));
			proxyApi.setIsGroup(true);
		} else {
			// 1signal
			proxyApi.setSignalGroupSymbolName(SymbolNames.RTE_CALL_BSW_COM_SEND_SIGNAL_API_NAME);
			proxyApi.setBufferComMetaComplexDataSymbolName(SymbolNames.createComSignalSymbolicName(signal));
			proxyApi.setIsGroup(false);
		}

		proxyApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
		Partition partition = this.context.builtQuery.findPartition(sourcePartition);
		partition.getProxyApi().add(proxyApi);
	}

	private void setSendSignalApiName(SendSignalApi api, EcucPartition sourcePartition) {
		if (isShadowSignalApi()) {
			api.setSymbolName(SymbolNames.createComSendSignalGroupWithUpdateShadowSignalName(sourcePartition));
			api.setSignalSymbolName(SymbolNames.COM_UPDATE_SHADOW_SIGNAL_API_NAME);			
		} else {
			api.setSymbolName(SymbolNames.createComSendSignalGroupWithoutUpdateShadowSignalName(sourcePartition));
			api.setSignalSymbolName(SymbolNames.RTE_CALL_BSW_COM_SEND_SIGNAL_API_NAME);
		}
		api.setSignalGroupSymbolName(SymbolNames.RTE_CALL_BSW_COM_SEND_SIGNAL_GROUP_API_NAME);
	}
	
	private void setReceiveSignalApiName(ReceiveSignalApi api, EcucPartition sourcePartition) {
		if (isShadowSignalApi()) {
			api.setSymbolName(SymbolNames.createComReceiveSignalGroupWithReceiveShadowSignalName(sourcePartition));
			api.setSignalSymbolName(SymbolNames.COM_RECEIVE_SHADOW_SIGNAL_API_NAME);			
		} else {
			api.setSymbolName(SymbolNames.createComReceiveSignalGroupWithoutReceiveShadowSignalName(sourcePartition));
			api.setSignalSymbolName(SymbolNames.RTE_CALL_BSW_COM_RECEIVE_SIGNAL_API_NAME);
		}
		api.setSignalGroupSymbolName(SymbolNames.RTE_CALL_BSW_COM_RECEIVE_SIGNAL_GROUP_API_NAME);
	}
	
	private boolean isShadowSignalApi() {
		for (RteBswGeneral rteBswGeneral : this.context.query.<RteBswGeneral> findByKind(RTE_BSW_GENERAL)) {
			if (rteBswGeneral.getRteUseComShadowSignalApi()) {
				return true;
			}
		}
		
		return false;
	}
	
	private CallApi createCallApi(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		CallApi api = ModuleFactory.eINSTANCE.createCallApi();
		api.setSingleSource(sourceOperationInstanceInSwc);
		api.setSymbolName(SymbolNames.createCallApiImplName(sourceOperationInstanceInSwc));
		api.setApiMappingName(SymbolNames.createCallApiName(sourceOperationInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);

		// パラメタの設定
		api.getOperationParam().addAll(this.localSymbolModelBuilder.createOperationParams(sourceOperationInstanceInSwc));
		api.getParam().addAll(api.getOperationParam());
		
		return api;
	}

	private boolean isInline() {
		// generationPhaseでない場合はインライン化を行わない
		if (!this.context.options.generationPhase) {
			return false;
		}
		
		// コマンドラインオプションが指定されていた場合はインライン化を行わない
		if (this.context.options.withoutStaticInline) {
			return false;
		}
		
		return true;
	}
	
	private boolean isCsInline(EcucPartition ecucPartition, EcucPartition pEcucPartition, ROperationInstanceInSwc rOpInstanceInSwc) throws ModelException {
        if (ecucPartition == null && pEcucPartition == null) {
            return true;
        } else if (ecucPartition == null || pEcucPartition == null) {
        	// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
        	// ecucPartition, pEcucPartition のいずれかがnullのときはありえない
        	return false; 
        }

		if (ecucPartition != pEcucPartition) {
			if (!ecucPartition.isTrusted()) {
				// 別パーティションの場合はインライン化を行わない
				return false;
			}
			// 別パーティションで送信、受信ともに信頼である場合、コマンドラインオプションでインライン化判定を行う
		}
		
		return isCsInline(rOpInstanceInSwc);
	}
	
	private boolean isCsInline(ROperationInstanceInSwc rOpInstanceInSwc) throws ModelException {
		if (!isInline()) {
			return false;
		}
		return isEnableTakeAddressFalse(rOpInstanceInSwc.getContextPort());
	}

	private boolean isEnableTakeAddressFalse(PortPrototype portPrototype) {
		// EnableTakeAddressがfalseの場合インライン化対象
		if (portPrototype.getPortApiOption().isEmpty()) {
			return false;
		}
		return !portPrototype.getPortApiOption().get(0).getEnableTakeAddress();
	}

	private CallTrustedApi createCallTrustedApi(ROperationInstanceInSwc sourceOperationInstanceInSwc, Swc targetSwc, RteCsTrustedFunction trustedFunction, boolean trustedFunctionPrepared) throws ModelException {

		CallTrustedApi api = ModuleFactory.eINSTANCE.createCallTrustedApi();
		api.setSingleSource(sourceOperationInstanceInSwc);
		api.setSymbolName(SymbolNames.createCallApiImplName(sourceOperationInstanceInSwc));
		api.setApiMappingName(SymbolNames.createCallApiName(sourceOperationInstanceInSwc));
		api.setReturnType(this.context.cache.stdReturnType);
		
		api.setCsArgsTrustedFunctionParamTypeName(SymbolNames.createRteCsArgsTrustedFunctionParamName(sourceOperationInstanceInSwc));
		api.setRteCallArgcName(SymbolNames.createCallArgcName(sourceOperationInstanceInSwc));
		api.setRteCallOpidName(SymbolNames.createCallOpidName(sourceOperationInstanceInSwc));
		api.setRteCsTfName(SymbolNames.createCallCstfName(sourceOperationInstanceInSwc));
		
		// パラメタの設定
		api.getOperationParam().addAll(this.localSymbolModelBuilder.createOperationParams(sourceOperationInstanceInSwc));

		api.getParam().addAll(api.getOperationParam());

		// 信頼関数構築
		EcucPartition sourcePartition = (EcucPartition)targetSwc.getParent().getSingleSource();
		Partition targetPartition = this.context.builtQuery.findPartition(sourcePartition);
		RteCsTrustedFunction csTrustedFunction = createRteCsTrustedFunction(sourceOperationInstanceInSwc, targetPartition, trustedFunction, trustedFunctionPrepared);
		csTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));

		if (!trustedFunctionPrepared) {
			targetPartition.getRteBufferSendTrustedFunction().add(csTrustedFunction);
		
			OsApplication targetOsApplication = sourcePartition.getImplOsApplication().get(0);
			OsApplicationTrustedFunction osApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
			osApplicationTrustedFunction.setShortName(api.getRteCsTfName());
			osApplicationTrustedFunction.setOsTrustedFunctionName(api.getRteCsTfName());
			targetOsApplication.getOsApplicationTrustedFunction().add(osApplicationTrustedFunction);
		}

		boolean declareTaskId = false;
		for (Parameter param : api.getParam()) {
			Type type = param.getType();
			
			 // COVERAGE (8パターン中4パターンしか通りようがない．コードレビューで問題ないことを確認)
			if ((type instanceof ArrayType) || (type instanceof StructType) || (type instanceof UnionType) || (type instanceof PointerType)) {
				declareTaskId = true;
				break;
			}
		}
		api.setDeclareTaskId(declareTaskId);
		
		return api;
	}
	
	private Constant createCsArgcValueConstant(ROperationInstanceInSwc operationInstanceInSwc, int size) throws ModelException {
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setRoleName(RoleNames.INIT_VALUE);
		initValueConstant.setSymbolName(SymbolNames.createCallArgcName(operationInstanceInSwc));
		initValueConstant.setValue(String.valueOf(size));
		return initValueConstant;
	}

	private RteEnterApi createRteEnterApi(ExclusiveArea sourceExclusiveArea) {
		RteEnterApi api = ModuleFactory.eINSTANCE.createRteEnterApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createRteEnterApiImplName(sourceExclusiveArea));
		api.setApiMappingName(SymbolNames.createRteEnterApiName(sourceExclusiveArea));
		api.setReturnType(this.context.cache.voidType);
		api.setIsNoneExclude(false);
		return api;
	}

	private RteExitApi createRteExitApi(ExclusiveArea sourceExclusiveArea) {
		RteExitApi api = ModuleFactory.eINSTANCE.createRteExitApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createRteExitApiImplName(sourceExclusiveArea));
		api.setApiMappingName(SymbolNames.createRteExitApiName(sourceExclusiveArea));
		api.setReturnType(this.context.cache.voidType);
		api.setIsNoneExclude(false);
		return api;
	}

	private void buildSchmApis() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Bswm targetBswm = optionalTargetBswm.get();

			// 排他エリア関連のAPI構築(SchM_Enter/Exit)
			buildSchmApisForExclusiveArea(targetBswm, sourceBswModuleDescription);

			// モード関連のAPI構築(Schm_Switch/Mode/Init)
			buildSchmApisForMode(targetBswm, sourceBswModuleDescription);

			// メモリマッピングを構築
			for (PartedBswm targetPartedBswm : targetBswm.getPartedBswm()) {
				for (SchmApi targetApi : targetPartedBswm.getSchmApi()) {
					EcucPartition sourcePartition = (EcucPartition) targetPartedBswm.getParent().getSingleSource();
					targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				}
			}
		}
	}

	private void buildSchmApisForExclusiveArea(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior enableInternalBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		for (ExclusiveArea sourceExclusiveArea : enableInternalBehavior.getExclusiveArea()) {
			// Enter/Exit APIの配置先パーティションを決定
			PartedBswm targetPartedBswm = getPartedBswmToLocateExclusiveAreaSymbol(targetBswm, sourceExclusiveArea);

			// Enter/Exit APIを構築
			if (providesEnterExitApi(sourceExclusiveArea, enableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmEnterApi(sourceBswModuleDescription, sourceExclusiveArea));
				targetPartedBswm.getSchmApi().add(createSchmExitApi(sourceBswModuleDescription, sourceExclusiveArea));
			}
		}
	}

	private PartedBswm getPartedBswmToLocateExclusiveAreaSymbol(Bswm bswm, ExclusiveArea exclusiveArea) throws ModelException {
		if (this.context.options.generationPhase) {
			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(exclusiveArea, EXCLUSIVE_AREA_EX___GET_USING_PARTITIONS_OF_BSW_EXCLUSIVE_AREA__EXCLUSIVEAREA);
			EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
			Partition partition = this.context.builtQuery.findPartition(usingEcucPartition);
			return bswm.getSinglePartedBswm(partition);
		} else {
			return bswm.getSinglePartedBswm(this.context.cache.masterBswPartition);
		}
	}

	private boolean providesEnterExitApi(ExclusiveArea exclusiveArea, BswInternalBehavior enableInternalBehavior) {
		boolean providesEnterExitApi = false;
		for (BswSchedulableEntity entity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (entity.getCanEnterExclusiveArea().contains(exclusiveArea)) {
				providesEnterExitApi = true;
			}
		}
		return providesEnterExitApi;
	}

	private SchmEnterApi createSchmEnterApi(BswModuleDescription sourceBswModuleDescription, ExclusiveArea sourceExclusiveArea) {
		SchmEnterApi api = ModuleFactory.eINSTANCE.createSchmEnterApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createSchmEnterApiName(sourceExclusiveArea, sourceBswModuleDescription.getShortName()));
		api.setReturnType(this.context.cache.voidType);
		api.setIsInline(false);
		return api;
	}

	private SchmExitApi createSchmExitApi(BswModuleDescription sourceBswModuleDescription, ExclusiveArea sourceExclusiveArea) {
		SchmExitApi api = ModuleFactory.eINSTANCE.createSchmExitApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createSchmExitApiName(sourceExclusiveArea, sourceBswModuleDescription.getShortName()));
		api.setReturnType(this.context.cache.voidType);
		api.setIsInline(false);
		return api;
	}

	private void buildSchmApisForMode(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior enableInternalBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		// Provided
		for (ModeDeclarationGroupPrototype sourceProvidedModeGroup : sourceBswModuleDescription.getProvidedModeGroup()) {
			// Switch/Mode APIの配置先パーティションを決定
			PartedBswm targetPartedBswm = getPartedBswmToLocateModeSymbol(targetBswm, sourceProvidedModeGroup);

			// Switch/Mode APIを構築
			if (providesSwitchApi(sourceProvidedModeGroup, enableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmSwitchApi(sourceBswModuleDescription, sourceProvidedModeGroup));
			}
			if (providesModeApi(sourceProvidedModeGroup, enableInternalBehavior)) {
				targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceProvidedModeGroup, sourceProvidedModeGroup));
			}
		}

		// Required
		for (ModeDeclarationGroupPrototype sourceRequiredModeGroup : sourceBswModuleDescription.getRequiredModeGroup()) {
			// Mode APIの配置先パーティションを決定
			PartedBswm targetPartedBswm = getPartedBswmToLocateModeSymbol(targetBswm, sourceRequiredModeGroup);

			if (providesModeApi(sourceRequiredModeGroup, enableInternalBehavior)) {
				Optional<RteBswRequiredModeGroupConnection> connection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION).AND(
						ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, sourceRequiredModeGroup)));
				if (connection.isPresent()) {
					targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceRequiredModeGroup, connection.get().getRteBswProvidedModeGroup()));
				} else {
					// 未接続
					targetPartedBswm.getSchmApi().add(createSchmModeApi(sourceBswModuleDescription, sourceRequiredModeGroup, null));
				}
			}
		}
	}

	private PartedBswm getPartedBswmToLocateModeSymbol(Bswm bswm, ModeDeclarationGroupPrototype modePrototype) throws ModelException {
		if (this.context.options.generationPhase) {
			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(modePrototype, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION__MODEDECLARATIONGROUPPROTOTYPE);
			EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
			Partition partition = this.context.builtQuery.findPartition(usingEcucPartition);
			return bswm.getSinglePartedBswm(partition);
		} else {
			return bswm.getSinglePartedBswm(this.context.cache.masterBswPartition);
		}
	}

	private boolean providesSwitchApi(ModeDeclarationGroupPrototype providedModeGroup, BswInternalBehavior enableInternalBehavior) {
		for (BswSchedulableEntity entity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (entity.getManagedModeGroup().contains(providedModeGroup)) {
				return true;
			}
		}
		return false;
	}

	private boolean providesModeApi(ModeDeclarationGroupPrototype modePrototype, BswInternalBehavior enableInternalBehavior) {
		for (BswSchedulableEntity entity : enableInternalBehavior.getBswSchedulableEntity()) {
			if (entity.getAccessedModeGroup().contains(modePrototype)) {
				return true;
			}
		}
		return false;
	}

	private SchmSwitchApi createSchmSwitchApi(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceProvidedModeGroup) throws ModelException {
		SchmSwitchApi api = ModuleFactory.eINSTANCE.createSchmSwitchApi();
		api.setSingleSource(sourceProvidedModeGroup);
		api.setSymbolName(SymbolNames.createSchmSwitchApiName(sourceProvidedModeGroup, sourceBswModuleDescription.getShortName()));
		api.setReturnType(this.context.cache.stdReturnType);
		api.getParam().add(createModeParam(sourceProvidedModeGroup));
		api.setIsInline(false);

		Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, sourceProvidedModeGroup);
		if (modeInstance.isPresent()) {
			api.setCurrentModeVariable(modeInstance.get().getCurrentModeVariable());
			api.setNextModeVariable(modeInstance.get().getNextModeVariable());
			api.setRequestModeQueue(modeInstance.get().getModeQueue());
		}

		return api;
	}

	private void createSchmTaskEvents(Function api, ModeDeclarationGroupPrototype providedModePrototype, PartedBswm partedBswm, BswModuleDescription providedDescription,
			EList<ModeSwitchTriggeringExecutableStartOperation> operationList, ModeDeclaration initMode) throws ModelException {

		for (RteBswRequiredModeGroupConnection modeConnection : this.context.query.<RteBswRequiredModeGroupConnection> findByKind(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION)) {
			if (providedModePrototype != modeConnection.getRteBswProvidedModeGroup()) continue;
			ModeDeclarationGroupPrototype rteBswRequiredModeGroup = modeConnection.getRteBswRequiredModeGroup();
			
			BswInternalBehavior bswInternalBehavior = getBswInternalBehavior(modeConnection);
			if (bswInternalBehavior == null) {	// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}
			BswModuleDescription requiredDescription = bswInternalBehavior.getParent();
			for (BswEvent bswEvent : bswInternalBehavior.getEvent()) {
				if (!(bswEvent instanceof BswModeSwitchEvent)) {
					continue;
				}
				BswModeSwitchEvent bswModeSwitchEvent = (BswModeSwitchEvent)bswEvent;
				if (bswModeSwitchEvent.getModeIref().get(0).getContextModeDeclarationGroup() != rteBswRequiredModeGroup) {
					continue;
				}

				if (!this.entityOperationBuilder.isEnabledBswEvent(bswEvent)) {
					continue;
				}
				
				if (initMode != null && !runsAtInit(bswModeSwitchEvent, initMode)) {
					continue;
				}
				
				for (RteBswEventToTaskMapping rteBswEventToTaskMapping : bswModeSwitchEvent.getConfig()) { // TODO forではなくす。nrte_sws_0196より
					OsTask osTask = rteBswEventToTaskMapping.getRteBswMappedToTask();
					if (osTask == null) {
						
						// 直接起動
						ModeSwitchTriggeringExecutableStartOperation createExcutableStartOperation = this.entityOperationBuilder.createExcutableStartOperation(requiredDescription, bswModeSwitchEvent, rteBswRequiredModeGroup);
						if (createExcutableStartOperation == null) continue;	// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
						operationList.add(createExcutableStartOperation);
						Ordering<EObject> eventListOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE, CONSTANT__SYMBOL_NAME));
						ECollections.sort(operationList, eventListOrdering);
						Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(EXECUTABLE_START_OPERATION__START_EXECUTABLE, FUNCTION__SYMBOL_NAME));
						ECollections.sort(operationList, ordering);
					} else {
						// ActivateTask,SetEvent
						Ordering<EObject> eventListOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, CONSTANT__SYMBOL_NAME));
						Ordering<EObject> eventOrdering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__TASK_PRIORITY)).reverse()
								.compound(Ordering.natural().onResultOf(this.context.query.<String> features2Function(OS_TASK_EVENT__TASK_ID)));
						if (api instanceof SchmSwitchApi) {
							EList<OsTaskEventsTriggeredByMode> osTaskEventList = ((SchmSwitchApi)api).getOsTaskEvent();
							createSchmOsEvent(osTaskEventList, bswModeSwitchEvent, rteBswEventToTaskMapping, osTask);
							ECollections.sort(osTaskEventList, eventListOrdering);
							for (OsTaskEventsTriggeredByMode byMode : osTaskEventList) {
								ECollections.sort(byMode.getOsTaskEvent(), eventOrdering);
							}
						} else {
							EList<OsTaskEvent> osTaskEventList = ((SchmInitApi)api).getOsTaskEvent();
							createOsTaskEvent(osTaskEventList, rteBswEventToTaskMapping, osTask);
							ECollections.sort(osTaskEventList, eventOrdering);
						}
					}
				}
			}
		}
	}
	
	private BswInternalBehavior getBswInternalBehavior(RteBswRequiredModeGroupConnection modeConnection) {
		for (RteBswModuleInstance moduleInstance : this.context.query.<RteBswModuleInstance> findByKind(RTE_BSW_MODULE_INSTANCE)) {
			if (moduleInstance.getRteBswRequiredModeGroupConnection().contains(modeConnection)) {
				return moduleInstance.getRteBswImplementation().getBehavior();
			}
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// 当判定のelseを通過しないのはRteBswModuleInstanceが存在しない場合だが,このメソッドにくる時点で必ずRteBswModuleInstanceは存在する.
		}

		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// 当ケースはRteBswModuleInstanceが存在しない場合だが,当メソッドにくる時点で必ずRteBswModuleInstanceは存在する.
		return null;
	}
	
    private boolean runsAtInit(BswModeSwitchEvent bswModeSwitchEvent, ModeDeclaration initMode) {
        return bswModeSwitchEvent.getModeIref().get(0).getTargetMode() == initMode;
    }

	private void createSchmOsEvent(EList<OsTaskEventsTriggeredByMode> taskEventsByMode, BswModeSwitchEvent switchEvent, RteBswEventToTaskMapping taskMapping, OsTask osTask) throws ModelException {
		Constant startModeConstant = getStartModeConstant(switchEvent);
		OsTaskEventsTriggeredByMode byMode = getOsTaskEventsTriggeredByMode(taskEventsByMode, startModeConstant);
		EList<OsTaskEvent> taskEvents = byMode.getOsTaskEvent();
		createOsTaskEvent(taskEvents, taskMapping, osTask);
	}

	private void createOsTaskEvent(EList<OsTaskEvent> taskEvents, RteBswEventToTaskMapping taskMapping, OsTask osTask) {
		OsEvent osEvent = taskMapping.getRteBswUsedOsEvent();
		OsTaskEvent taskEvent = null;
		boolean taskEventFlag = false;
		
		if (taskEvents.size() <= 0) {
			taskEventFlag = true;
		} else {
			for (OsTaskEvent event : taskEvents) {
				if (event.getTaskId().equals(osTask.getShortName())) {
					// タスクID同じ
					String taskIdEvents = event.getTaskIdEvents() + "|" + osEvent.getShortName();
					// ソート
					String[] taskIdEventsArr = taskIdEvents.split("\\|");
					Arrays.sort(taskIdEventsArr);
					taskIdEvents = "";
					for (int i = 0; i < taskIdEventsArr.length; i++) {
						if (i != 0) {
							taskIdEvents += "|"; 
						}
						taskIdEvents += taskIdEventsArr[i];
					}
					event.setTaskIdEvents(taskIdEvents);
				} else {
					// タスクID違う
					taskEventFlag = true;
				}
			}			
		}

		if (taskEventFlag) {
			taskEvent = ModuleFactory.eINSTANCE.createOsTaskEvent();
			taskEvent.setTaskId(osTask.getShortName());
			if (osEvent != null) {
				taskEvent.setTaskIdEvents(osEvent.getShortName());
			} else {
				taskEvent.setTaskIdEvents("");
			}
			taskEvent.setTaskPriority(osTask.getOsTaskPriority());
			taskEvents.add(taskEvent);
		}
	}

	private OsTaskEventsTriggeredByMode getOsTaskEventsTriggeredByMode(List<OsTaskEventsTriggeredByMode> taskEventsByMode, Constant startModeConstant) {
		for (OsTaskEventsTriggeredByMode osTaskEventsTriggeredByMode : taskEventsByMode) {
			if (osTaskEventsTriggeredByMode.getStartMode() == startModeConstant) {
				return osTaskEventsTriggeredByMode;
			}
		}
		OsTaskEventsTriggeredByMode byMode = ModuleFactory.eINSTANCE.createOsTaskEventsTriggeredByMode();
		taskEventsByMode.add(byMode);
		byMode.setStartMode(startModeConstant);
		return byMode;
	}

	private Constant getStartModeConstant(BswModeSwitchEvent bswModeSwitchEvent) throws ModelException {
		String startModeName = SymbolNames.createModeConstantName(bswModeSwitchEvent.getModeIref().get(0));
		return this.context.query.findSingle(isKindOf(CONSTANT).AND(hasAttr(CONSTANT__SYMBOL_NAME, startModeName)));
	}
	
	private SchmModeApi createSchmModeApi(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeUserPrototype, ModeDeclarationGroupPrototype sourceModeManagerPrototype) throws ModelException {
		SchmModeApi api = ModuleFactory.eINSTANCE.createSchmModeApi();
		api.setSingleSource(sourceModeUserPrototype);
		api.setSymbolName(SymbolNames.createSchmModeApiName(sourceModeUserPrototype, sourceBswModuleDescription.getShortName()));
		api.setIsInline(false);
		api.setReturnType(createModeType(sourceModeUserPrototype));

		Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, sourceModeManagerPrototype);
		if (modeInstance.isPresent()) {
			api.setCurrentModeName(modeInstance.get().getCurrentModeVariable().getSymbolName());
			api.setNextModeName(modeInstance.get().getNextModeVariable().getSymbolName());
		}
		api.setTransitionName(SymbolNames.createRteTransitionName(sourceModeUserPrototype.getType()));
		api.setInitModeName(SymbolNames.createRteInitModeTypeName(sourceModeUserPrototype.getType()));

		return api;
	}

	private Parameter createModeParam(ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) throws ModelException {
		Parameter param = ModuleFactory.eINSTANCE.createParameter();
		param.setSymbolName(SymbolNames.MODE_VAR_NAME);
		param.setType(createModeType(modeDeclarationGroupPrototype));
		return param;
	}
	
	private ModeType createModeType(ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) throws ModelException {
		ModeType type = ModuleFactory.eINSTANCE.createModeType();
		type.setSymbolName(SymbolNames.createRteModeTypeName(modeDeclarationGroupPrototype.getType()));
		this.context.cache.rte.getRteType().add(type);
		return type;
	}
	
	public void buildImplFunctions() throws ModelException {
		buildTrustedFunctions(this.context.cache.rte);
		buildBswSchedulableEntities(this.context.cache.rte);

		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = this.context.query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		if (rootSwCompositionPrototype.isPresent()) {
			buildRteApiInternals();
			buildRteLifecyleApis();
			buildSrWriteProxy();
		}

		Optional<BswImplementation> bswImplementation = this.context.query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		if (bswImplementation.isPresent()) {
			buildSchmApiInternals();
			buildSchmLifecyleApis();
		}

		Optional<ComSignalGroup> comSignalGroup = this.context.query.tryFindSingleByKind(COM_SIGNAL_GROUP);
		if (comSignalGroup.isPresent()) {
			buildSignalApis();
		}

		buildExecutableTaskBodies();
		buildComCallbacks(this.context.cache.rte);
	}

	private void buildBswSchedulableEntities(Rte targetRte) throws ModelException {
		Optional<PeriodicComSendProxy> periodicComSendProxy = this.context.query.tryFindSingleByKind(PERIODIC_COM_SEND_PROXY);
		if (periodicComSendProxy.isPresent()) {
			ComSendSignalPeriodicEntity periodicEntity = createComSendSignalPeriodicEntity(periodicComSendProxy.get());
			periodicEntity.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(periodicComSendProxy.get().getOwnerPartition())));
			targetRte.setComSendSignalPeriodicEntity(periodicEntity);
		}

		Optional<ImmediateComSendProxy> immediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (immediateComSendProxy.isPresent()) {
			OsTask sourceOsTask = this.context.query.findSingle(isKindOf(OS_TASK).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME)));

			ComSendSignalImmediateEntity immediateEntity = createComSendSignalImmediateEntity(immediateComSendProxy.get());
			immediateEntity.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(immediateComSendProxy.get().getOwnerPartition())));
			targetRte.setComSendSignalImmediateEntity(immediateEntity);

			ComSendSignalImmediateTaskBody taskBody = createComSendSignalImmediateTaskBody(sourceOsTask, immediateEntity);
			taskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourceOsTask.getOwnerApplication().get(0).getOsAppEcucPartition())));
			targetRte.setComSendSignalImmediateTaskBody(taskBody);
		}
	}

	private ComSendSignalPeriodicEntity createComSendSignalPeriodicEntity(PeriodicComSendProxy sourceComSendProxy) throws ModelException {
		ComSendSignalPeriodicEntity entity = ModuleFactory.eINSTANCE.createComSendSignalPeriodicEntity();
		entity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_PERIODIC_ENTITY_NAME);
		setupComSendSignalProxyEntity(entity, sourceComSendProxy);
		return entity;
	}

	private ComSendSignalImmediateEntity createComSendSignalImmediateEntity(ImmediateComSendProxy sourceComSendProxy) throws ModelException {
		ComSendSignalImmediateEntity entity = ModuleFactory.eINSTANCE.createComSendSignalImmediateEntity();
		entity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_IMMEDIATE_ENTITY_NAME);
		setupComSendSignalProxyEntity(entity, sourceComSendProxy);
		return entity;
	}

	private void setupComSendSignalProxyEntity(ComSendSignalProxyEntity entity, ComSendProxy sourceComSendProxy) throws ModelException {
		entity.setReturnType(this.context.cache.voidType);

		UnionType proxyUnionType = this.localSymbolModelBuilder.createProxyUnionType();
		entity.getLocalType().add(proxyUnionType);
		
		LocalVariable returnVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		entity.getLocalVariable().add(returnVariable);
		
		LocalVariable signalIdVariable = null;
		LocalVariable proxyDataVariable = null;
		for (ComSendProxyInteraction sourceProxyInteraction : sourceComSendProxy.getInteraction()) {
			if (this.context.builtQuery.findType(sourceProxyInteraction.getSignalDataType()) instanceof PrimitiveType) {
				if (signalIdVariable == null) {
					signalIdVariable = this.localSymbolModelBuilder.createSignalIdVariable();
					entity.getLocalVariable().add(signalIdVariable);
					proxyDataVariable = this.localSymbolModelBuilder.createProxyUnionDataVariable(proxyUnionType);
					entity.getLocalVariable().add(proxyDataVariable);
				}
				VariableMember dataVariable = this.context.query.selectSingle(proxyDataVariable.getMember(),
						hasAttr(VARIABLE__SYMBOL_NAME, "data_" + sourceProxyInteraction.getSignalDataType().getShortName()));
				
				entity.getOperation().add(this.comProxyOperationModelBuilder.createComSendProxyOperation(sourceProxyInteraction, signalIdVariable, dataVariable));
			}
		}
		
		LocalVariable indexVariable = null;
		for (ComSendProxyInteraction sourceProxyInteraction : sourceComSendProxy.getInteraction()) {
			if (!(this.context.builtQuery.findType(sourceProxyInteraction.getSignalDataType()) instanceof PrimitiveType)) {
				if (indexVariable == null) {
					indexVariable = this.localSymbolModelBuilder.createSrWriteProxyFunctionTableIndexVariable();
					entity.getLocalVariable().add(indexVariable);
				}
				// パーティションで共通となるため、間引く
				if (!wasCreated(sourceProxyInteraction, entity.getComplexOperation())) {
					entity.getComplexOperation().add(this.comProxyOperationModelBuilder.createComSendProxyComplexOperation(sourceProxyInteraction, indexVariable));
				}
			}
		}
	}
	
	private boolean wasCreated(ComSendProxyInteraction sourceProxyInteraction, EList<ComSendProxyComplexOperation> complexOperation) {
		for (ComSendProxyComplexOperation comSendProxyComplexOperation : complexOperation) {
			if (((ComSendProxyInteraction)comSendProxyComplexOperation.getSingleSource()).getRequesterPartition() == sourceProxyInteraction.getRequesterPartition()) {
				return true;
			}
		}
		return false;
	}

	private ComSendSignalImmediateTaskBody createComSendSignalImmediateTaskBody(OsTask sourceOsTask, ComSendSignalImmediateEntity immediateEntity) throws ModelException {
		ComSendSignalImmediateTaskBody taskBody = ModuleFactory.eINSTANCE.createComSendSignalImmediateTaskBody();
		taskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		taskBody.setOsTaskId(sourceOsTask.getShortName());
		taskBody.setOsEventId(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		taskBody.setStartEntity(immediateEntity);
		return taskBody;
	}

	private void buildDependentExecutableEntities() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> swc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!swc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = swc.get();

			for (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity : swComponentType.getInternalBehavior().getRunnable()) {
				ExecutableEntity executableEntity = createExecutableEntity(sourceRunnableEntity);
				executableEntity.setMemoryMapping(this.memmapBuilder.buildExecutableEntityMemoryMapping(targetSwc, sourceRunnableEntity));
				targetSwc.getDependentExecutableEntity().add(executableEntity);
			}
		}

		// BSWスケジューラブルはLogicalCompartmentModelBuilderで構築済みなので, メモリマップの割り当てと戻り値型の設定のみ行う.
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			for (ExecutableEntity executableEntity : targetPartedBswm.getDependentExecutableEntity()) {
				executableEntity.setMemoryMapping(this.memmapBuilder.buildExecutableEntityMemoryMapping(targetPartedBswm, (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity)executableEntity.getSingleSource()));
				executableEntity.setReturnType(this.context.cache.voidType);
			}
		}
	}

	private ExecutableEntity createExecutableEntity(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity) throws ModelException {
		ExecutableEntity executableEntity = ModuleFactory.eINSTANCE.createExecutableEntity();
		executableEntity.setSingleSource(sourceRunnableEntity);

		RteEvent rteEvent = sourceRunnableEntity.getEvent().isEmpty() ? null : sourceRunnableEntity.getEvent().get(0);
		executableEntity.setSymbolName(sourceRunnableEntity.getSymbol());
		if (rteEvent instanceof OperationInvokedEvent) {
			// オペレーション呼出イベントの場合
			OperationInvokedEvent operationInvokedEvent = (OperationInvokedEvent) rteEvent;
			POperationInstanceInSwc operationInstanceInSwc = operationInvokedEvent.getOperation();
		
			// 戻り値型の構築
			executableEntity.setReturnType(operationInstanceInSwc.getPrototype().getPossibleError().isEmpty() ? this.context.cache.voidType : this.context.cache.stdReturnType);
		
			// ロール引数の構築
			executableEntity.getRoleParam().addAll(this.localSymbolModelBuilder.createPortArgValueParams(operationInstanceInSwc));
			executableEntity.getRoleParam().addAll(this.localSymbolModelBuilder.createOperationParams(operationInstanceInSwc));
		
			executableEntity.getParam().addAll(executableEntity.getRoleParam());
		
		} else {
			// それ以外のRTEイベントの場合
			executableEntity.setReturnType(this.context.cache.voidType);
		}

		return executableEntity;
	}

	private void buildTrustedFunctions(Rte targetRte) throws ModelException {
		// COM送信用の信頼関数を構築
		this.context.cache.comSendSignalTrustedFunction = Optional.absent();
		this.context.cache.comSendSignalGroupTrustedFunction = Optional.absent();
		Optional<TrustedFunctionComSendImplementation> imp = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (imp.isPresent()) {
			createComSendSignalTrustedFunction(targetRte, false);
		}
		imp = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (imp.isPresent()) {
			createComSendSignalTrustedFunction(targetRte, true);
		}

		// RTEバッファ送信用の信頼関数を構築
		for (TrustedFunctionRteSendImplementation sourceSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			EcucPartition sourcePartition = sourceSendImplementation.getWriteOsTrustedFunction().getParent().getOsAppEcucPartition();
			InternalEcuSender sender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
			PVariableDataInstanceInSwc dataInstanceInSwc = (PVariableDataInstanceInSwc) sender.getSource().getPrototype();
			Partition targetPartition = this.context.builtQuery.findPartition(sourcePartition);
			RteBufferWriteTrustedFunction writeTrustedFunction = createRteBufferWriteTrustedFunction(sourceSendImplementation);
			writeTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
			targetPartition.getRteBufferSendTrustedFunction().add(writeTrustedFunction);

			if (dataInstanceInSwc.isInvalidationEnabled()) {
				RteBufferInvalidateTrustedFunction invalidateTrustedFunction = createRteBufferInvalidateTrustedFunction(sourceSendImplementation);
				invalidateTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition)));
				targetPartition.getRteBufferSendTrustedFunction().add(invalidateTrustedFunction);
			}
		}
	}
	
	private RteBufferInvalidateTrustedFunction createRteBufferInvalidateTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();

		// 信頼関数の構築
		RteBufferInvalidateTrustedFunction trustedFunction = ModuleFactory.eINSTANCE.createRteBufferInvalidateTrustedFunction();
		trustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(trustedFunction);
		trustedFunction.setSymbolName(sourceSendImplementation.getInvalidateOsTrustedFunction().getOsTrustedFunctionName());
		trustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getInvalidateOsTrustedFunction().getShortName());
		
		// ローカル変数の構築
		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		trustedFunction.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		RteBufferNonqueuedSendOperation operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateTrustedFunction(sourceSendInteraction, filterResultVariable);
		trustedFunction.setOperation(operation);

		this.localSymbolModelBuilder.removeUnusedLocalVariables(trustedFunction);
		return trustedFunction;
	}

	private RteBufferWriteTrustedFunction createRteBufferWriteTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sender = sourceSendInteraction.getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc pDataInstanceInSwc = sender.getSource().getPrototype();

		// 信頼関数の構築
		RteBufferWriteTrustedFunction trustedFunction = ModuleFactory.eINSTANCE.createRteBufferWriteTrustedFunction();
		trustedFunction.setSingleSource(sourceSendImplementation);
		buildTrustedFunctionSignature(trustedFunction);
		trustedFunction.setSymbolName(sourceSendImplementation.getWriteOsTrustedFunction().getOsTrustedFunctionName());
		trustedFunction.setTrustedFunctionIndex(sourceSendImplementation.getWriteOsTrustedFunction().getShortName());

		// ローカル変数の構築
		LocalVariable dataVariable = this.localSymbolModelBuilder.createDataVariable(pDataInstanceInSwc, SymbolNames.DATA_VAR_NAME);
		trustedFunction.getLocalVariable().add(dataVariable);

		trustedFunction.setDataVariable(dataVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		trustedFunction.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		if (pDataInstanceInSwc.isEventSemantics()) {
			RteBufferQueuedSendOperation sendOperation = this.srOperationBuilder.createRteBufferQueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, dataVariable, filterResultVariable);
			trustedFunction.setOperation(sendOperation);
		} else {
			RteBufferNonqueuedSendOperation sendOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, dataVariable, filterResultVariable);
			trustedFunction.setOperation(sendOperation);
		}

		this.localSymbolModelBuilder.removeUnusedLocalVariables(trustedFunction);
		return trustedFunction;
	}
	
	private ComSendSignalTrustedFunction createComSendSignalTrustedFunction(Rte targetRte, boolean isForSignalGroup) throws ModelException {
		ComSendSignalTrustedFunction trustedFunction = ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction();
		buildTrustedFunctionSignature(trustedFunction);

		EcucPartition masterBswPartition = this.context.query.findSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		if (isForSignalGroup) {
			trustedFunction.setSymbolName(SymbolNames.COM_SEND_SIGNAL_GROUP_TRUSTED_FUNCTION_NAME + "_" + masterBswPartition.getShortName());
			trustedFunction.setTrustedFunctionIndex(Identifiers.COM_SEND_SIGNAL_GROUP_TRUSTED_FUNCTION_NAME + "_" + masterBswPartition.getShortName());
			trustedFunction.setSignalGroupSymbolName(SymbolNames.COM_SEND_SIGNAL_GROUP_FUNCTION_NAME + "_" + masterBswPartition.getShortName());
			trustedFunction.setIsGroup(true);
			targetRte.getComSendSignalTrustedFunction().add(trustedFunction);
			this.context.cache.comSendSignalGroupTrustedFunction = Optional.of(trustedFunction);
		} else {
			trustedFunction.setSymbolName(SymbolNames.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME + "_" + masterBswPartition.getShortName());
			trustedFunction.setTrustedFunctionIndex(Identifiers.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME + "_" + masterBswPartition.getShortName());
			trustedFunction.setSignalGroupSymbolName(SymbolNames.RTE_CALL_BSW_COM_SEND_SIGNAL_API_NAME);
			trustedFunction.setIsGroup(false);
			targetRte.getComSendSignalTrustedFunction().add(trustedFunction);
			this.context.cache.comSendSignalTrustedFunction = Optional.of(trustedFunction);
		}
		
		// ローカル変数の構築
		LocalVariable variable = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(isForSignalGroup);
		trustedFunction.getLocalVariable().add(variable);
		
		trustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(masterBswPartition)));
		return trustedFunction;
	}

	private RteCsTrustedFunction createRteCsTrustedFunction(ROperationInstanceInSwc operationInstanceInSwc, Partition targetPartition, RteCsTrustedFunction trustedFunction, boolean trustedFunctionPrepared) throws ModelException {

		RteCsTrustedRunnables rteCsTrustedRunnables = ModuleFactory.eINSTANCE.createRteCsTrustedRunnables();
		if (!trustedFunctionPrepared) {
			buildTrustedFunctionSignature(trustedFunction);
		}
		trustedFunction.setSymbolName(SymbolNames.createCsTrustedFunctionName(operationInstanceInSwc));
		trustedFunction.setCsArgsTrustedFunctionParamTypeName(SymbolNames.createRteCsArgsTrustedFunctionParamName(operationInstanceInSwc));
		rteCsTrustedRunnables.setRteCallOpidName(SymbolNames.createCallOpidName(operationInstanceInSwc));
		
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		trustedFunction.getLocalVariable().add(returnValueVariable);
		trustedFunction.setDataVariable(returnValueVariable);
		
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc providedOperationInstanceInSwc = (POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype();
		OperationInvokedEvent operationInvokedEvent = providedOperationInstanceInSwc.getOperationInvokedEvent().get(0);
		rteCsTrustedRunnables.setServerRunnableName(operationInvokedEvent.getStartOnEvent().getSymbol());
		rteCsTrustedRunnables.setIsReturn(!providedOperationInstanceInSwc.getPrototype().getPossibleError().isEmpty());
		rteCsTrustedRunnables.getRunnableParam().addAll(this.localSymbolModelBuilder.createPortArgValueParams(providedOperationInstanceInSwc));
		rteCsTrustedRunnables.getRunnableParam().addAll(this.localSymbolModelBuilder.createOperationParams(operationInstanceInSwc));

		trustedFunction.getRteCsTrustedRunnables().add(rteCsTrustedRunnables);

		Constant argcValueConstant = createCsArgcValueConstant(operationInstanceInSwc, rteCsTrustedRunnables.getRunnableParam().size());
		targetPartition.getRteBufferInitValueConstant().add(argcValueConstant);
		
		return trustedFunction;
	}
	
	private void buildTrustedFunctionSignature(TrustedFunction targetTrustedFunction) {
		targetTrustedFunction.setReturnType(this.context.cache.osStatusType);

		targetTrustedFunction.getParam().add(this.localSymbolModelBuilder.createTrustedFunctionIndexParam());
		targetTrustedFunction.getParam().add(this.localSymbolModelBuilder.createTrustedFunctionParamsParam());
	}

	private void buildRteApiInternals() throws ModelException {
		for (Swc targetSwc : this.context.query.<Swc> findByKind(SWC)) {
			for (WriteApi targetApi : this.context.query.<RteApi, WriteApi> selectByKind(targetSwc.getRteApi(), WRITE_API)) {
				buildWriteApiInternal(targetSwc, targetApi);
			}
			for (InvalidateApi targetApi : this.context.query.<RteApi, InvalidateApi> selectByKind(targetSwc.getRteApi(), INVALIDATE_API)) {
				buildInvalidateApiInternal(targetSwc, targetApi);
			}
			for (SendApi targetApi : this.context.query.<RteApi, SendApi> selectByKind(targetSwc.getRteApi(), SEND_API)) {
				buildSendApiInternal(targetApi);
			}
			for (ReadApi targetApi : this.context.query.<RteApi, ReadApi> selectByKind(targetSwc.getRteApi(), READ_API)) {
				buildReadApiInternal(targetSwc, targetApi);
			}
			for (ReceiveApi targetApi : this.context.query.<RteApi, ReceiveApi> selectByKind(targetSwc.getRteApi(), RECEIVE_API)) {
				buildReceiveApiInternal(targetApi);
			}
			for (CallApi targetApi : this.context.query.<RteApi, CallApi> selectByKind(targetSwc.getRteApi(), CALL_API)) {
				buildCallApiInternal(targetSwc, targetApi);
			}
			for (RteEnterApi targetApi : this.context.query.<RteApi, RteEnterApi> selectByKind(targetSwc.getRteApi(), RTE_ENTER_API)) {
				buildRteEnterApiInternal(targetApi);
			}
			for (RteExitApi targetApi : this.context.query.<RteApi, RteExitApi> selectByKind(targetSwc.getRteApi(), RTE_EXIT_API)) {
				buildRteExitApiInternal(targetApi);
			}
			for (IrvWriteApi targetApi : this.context.query.<RteApi, IrvWriteApi> selectByKind(targetSwc.getRteApi(), IRV_WRITE_API)) {
				buildIrvWriteApiInternal(targetSwc, targetApi);
			}
			for (IrvReadApi targetApi : this.context.query.<RteApi, IrvReadApi> selectByKind(targetSwc.getRteApi(), IRV_READ_API)) {
				buildIrvReadApiInternal(targetSwc, targetApi);
			}
		}
	}

	private void buildSrWriteProxy() throws ModelException {
		// Rte_SrWriteProxy作成
		if (isPeriodicProxyComSendOperationExists() || isImmediateProxyComSendOperationExists()) {
			buildProxyApis();
		}
	}
	
	private boolean isPeriodicProxyComSendOperationExists() {
		Optional<PeriodicProxyComSendOperation> periodicProxyComSendOperation = this.context.query.tryFindSingleByKind(PERIODIC_PROXY_COM_SEND_OPERATION);
		return periodicProxyComSendOperation.isPresent();
	}
	
	private boolean isImmediateProxyComSendOperationExists() {
		Optional<ImmediateProxyComSendOperation> immediateProxyComSendOperation = this.context.query.tryFindSingleByKind(IMMEDIATE_PROXY_COM_SEND_OPERATION);
		return immediateProxyComSendOperation.isPresent();
	}
	
	private boolean isInlineSrProvidedApi(VariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		if (! isInline()) {
			return false;
		}
		if (! isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort())) {
			return false;
		}
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, dataInstanceInComposition));
		if (sender.getSendInteraction().isEmpty()) {
			return true;
		} else if (sender.getSendInteraction().size() == 1) {
			SendInteraction sendInteraction = sender.getSendInteraction().get(0);
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				ReceiveInteraction receiveInteraction = sendInteraction.getReceiveInteraction();
				// 1:Nはインライン対象外なので、0番目固定で確認する
				InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
				RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
				if (! rDataInstanceInSwc.isFilterEnabled()) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean isInlineSrRequiredApi(RVariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		if (! isInline()) {
			return false;
		}
		if (! isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort())) {
			return false;
		}
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));
		if (receiver.getReceiveInteraction().isEmpty()) {
			return true;
		}
		ReceiveInteraction receiveInteraction = receiver.getReceiveInteraction().get(0);
		if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// IOCはインライン化しない
				|| receiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			return false;
		}
		if (! receiver.getExternalEcuSenders().isEmpty()) {
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// ECU間はインライン化しない
			return false;
		}
		return true;
	}

	private void buildWriteApiInternal(Swc swc, WriteApi targetApi) throws ModelException {
		targetApi.setIsConnected(false);

		VariableDataInstanceInSwc dataInstanceInSwc = (VariableDataInstanceInSwc) targetApi.getSingleSource();
		if (dataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		Parameter dataParam = targetApi.getDataParam();
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, dataInstanceInComposition));

		// 接続状態の設定
		targetApi.setIsConnected(!sender.getSendInteraction().isEmpty());

		// ローカル変数宣言の設定
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);
		
		LocalVariable tempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(tempReturnValueVariable);
		
		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		targetApi.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		LocalVariable trustedFunctionParamVariableForSignal = null;
		LocalVariable trustedFunctionParamVariableForSignalGroup = null;
		for (SendInteraction sendInteraction : sender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteApi(swc, sendInteraction, dataParam, filterResultVariable, targetApi);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				setInitReturnValueVariable(returnValueVariable);
				TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionRteBufferWriteSendOperation(trustedFunctionRteSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof IocSendImplementation) {
				setInitReturnValueVariable(returnValueVariable);
				IocSendImplementation iocSendImplementation = (IocSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createIocNonqueuedSendOperation(iocSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				setInitReturnValueVariable(returnValueVariable);
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createDirectComSendOperation(directComSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				if (type instanceof PrimitiveType) {
					setInitReturnValueVariable(returnValueVariable);
				}
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sendInteraction.getImplementation();
				if (trustedFunctionComSendImplementation.getComSignal() != null) {
					if (trustedFunctionParamVariableForSignal == null) {
						trustedFunctionParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(false);
						targetApi.getLocalVariable().add(trustedFunctionParamVariableForSignal);
					}
					operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, dataParam, returnValueVariable, trustedFunctionParamVariableForSignal, tempReturnValueVariable, type);
				} else {
					if (trustedFunctionParamVariableForSignalGroup == null) {
						trustedFunctionParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(true);
						targetApi.getLocalVariable().add(trustedFunctionParamVariableForSignalGroup);
					}
					operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, dataParam, returnValueVariable, trustedFunctionParamVariableForSignalGroup, tempReturnValueVariable, type);
				}

			} else if (sendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				setInitReturnValueVariable(returnValueVariable);
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createImmediateProxyComSendOperation(immediateProxyComSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable, type);

			} else if (sendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) {
				setInitReturnValueVariable(returnValueVariable);
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				operation = this.srOperationBuilder.createPeriodicProxyComSendOperation(periodicProxyComSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable, type);

			} else {
				continue;
			}

			operation.setIsWriteApi(true);
			targetApi.getOperation().add(operation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(returnValueVariable)) {
			targetApi.setReturnValue(returnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void setInitReturnValueVariable(LocalVariable returnValueVariable) {
		returnValueVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
	}

	private void buildIrvWriteApiInternal(Swc swc, IrvWriteApi targetApi) throws ModelException {
		VariableDataPrototype dataPrototype = (VariableDataPrototype) targetApi.getSingleSource();
		if (dataPrototype == null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		Parameter dataParam = targetApi.getDataParam();
		IrvWriteOperation operation = this.irvOperationBuilder.createIrvWriteOperation(swc, dataPrototype, dataParam, targetApi.getIsInline());
		targetApi.setOperation(operation);
		targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
	}

	private void buildIrvReadApiInternal(Swc swc, IrvReadApi targetApi) throws ModelException {
		VariableDataPrototype dataPrototype = (VariableDataPrototype) targetApi.getSingleSource();
		if (dataPrototype == null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		Parameter dataParam = targetApi.getDataParam();
		IrvReadOperation operation = this.irvOperationBuilder.createIrvReadOperation(swc, dataPrototype, dataParam, targetApi.getIsInline());
		targetApi.setOperation(operation);

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	private void buildInvalidateApiInternal(Swc swc, InvalidateApi targetApi) throws ModelException {
		targetApi.setIsConnected(false);

		VariableDataInstanceInSwc dataInstanceInSwc = (VariableDataInstanceInSwc) targetApi.getSingleSource();
		if (dataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}
		
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, dataInstanceInComposition));

		// 接続状態の設定
		targetApi.setIsConnected(!sender.getSendInteraction().isEmpty());

		// ローカル変数宣言の設定
		Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, dataInstanceInSwc, RoleNames.INVALID_VALUE);

		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		setInitReturnValueVariable(returnValueVariable);
		targetApi.getLocalVariable().add(returnValueVariable);

		LocalVariable tempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(tempReturnValueVariable);
		
		LocalVariable invalidValueVariable = this.localSymbolModelBuilder.createInvalidValueVariable(dataInstanceInSwc);
		invalidValueVariable.setInitValueConstant(invalidValueConstant);
		targetApi.getLocalVariable().add(invalidValueVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		targetApi.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		LocalVariable trustedFunctionParamVariableForSignal = null;
		LocalVariable trustedFunctionParamVariableForSignalGroup = null;
		for (SendInteraction sendInteraction : sender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateApi(swc, sendInteraction, invalidValueConstant, filterResultVariable, targetApi);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionRteBufferInvalidateSendOperation(sendInteraction, trustedFunctionRteSendImplementation, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createDirectComSendOperation(directComSendImplementation, invalidValueVariable, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				if (trustedFunctionComSendImplementation.getComSignal() != null) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない) 無効化は複合データ型未サポート(nrte_sws_0291)
					if (trustedFunctionParamVariableForSignal == null) {
						trustedFunctionParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(false);
						targetApi.getLocalVariable().add(trustedFunctionParamVariableForSignal);
					}
					operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, invalidValueVariable, returnValueVariable, trustedFunctionParamVariableForSignal, tempReturnValueVariable, type);
				} else {
					// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない) 無効化は複合データ型未サポート(nrte_sws_0291)
					if (trustedFunctionParamVariableForSignalGroup == null) {
						trustedFunctionParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(true);
						targetApi.getLocalVariable().add(trustedFunctionParamVariableForSignalGroup);
					}
					operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, invalidValueVariable, returnValueVariable, trustedFunctionParamVariableForSignalGroup, tempReturnValueVariable, type);
				}

			} else if (sendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				operation = this.srOperationBuilder.createImmediateProxyComSendOperation(immediateProxyComSendImplementation, invalidValueConstant, returnValueVariable, tempReturnValueVariable, type);

			} else if (sendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				operation = this.srOperationBuilder.createPeriodicProxyComSendOperation(periodicProxyComSendImplementation, invalidValueConstant, returnValueVariable, tempReturnValueVariable, type);

			} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				assert false; // ここには来ない
				continue;
			}

			targetApi.getOperation().add(operation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(returnValueVariable)) {
			targetApi.setReturnValue(returnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void buildSendApiInternal(SendApi targetApi) throws ModelException {
		targetApi.setIsConnected(false);

		VariableDataInstanceInSwc dataInstanceInSwc = (VariableDataInstanceInSwc) targetApi.getSingleSource();
		if (dataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		Parameter dataParam = targetApi.getDataParam();
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, dataInstanceInComposition));

		// 接続状態の設定
		targetApi.setIsConnected(!sender.getSendInteraction().isEmpty());

		// ローカル変数宣言の設定
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);

		LocalVariable tempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(tempReturnValueVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		targetApi.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		LocalVariable trustedFunctionParamVariableForSignal = null;
		LocalVariable trustedFunctionParamVariableForSignalGroup = null;
		for (SendInteraction sendInteraction : sender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				setInitReturnValueVariable(returnValueVariable);
				operation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sendInteraction, dataParam, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation iocSendImplementation = (IocSendImplementation) sendInteraction.getImplementation();
				setInitReturnValueVariable(returnValueVariable);
				operation = this.srOperationBuilder.createIocQueuedSendOperation(iocSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation) sendInteraction.getImplementation();
				setInitReturnValueVariable(returnValueVariable);
				operation = this.srOperationBuilder.createDirectComSendOperation(directComSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable);
			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(returnValueVariable);
				operation = this.srOperationBuilder.createTrustedFunctionRteSendOperation(trustedFunctionRteSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable, type);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				if (type instanceof PrimitiveType) {
					setInitReturnValueVariable(returnValueVariable);
				}
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sendInteraction.getImplementation();
				if (trustedFunctionComSendImplementation.getComSignal() != null) {
					if (trustedFunctionParamVariableForSignal == null) {
						trustedFunctionParamVariableForSignal = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(false);
						targetApi.getLocalVariable().add(trustedFunctionParamVariableForSignal);
					}
					operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, dataParam, returnValueVariable, trustedFunctionParamVariableForSignal, tempReturnValueVariable, type);
				} else {
					if (trustedFunctionParamVariableForSignalGroup == null) {
						trustedFunctionParamVariableForSignalGroup = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable(true);
						targetApi.getLocalVariable().add(trustedFunctionParamVariableForSignalGroup);
					}
					operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, dataParam, returnValueVariable, trustedFunctionParamVariableForSignalGroup, tempReturnValueVariable, type);
				}

			} else if (sendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(returnValueVariable);
				operation = this.srOperationBuilder.createImmediateProxyComSendOperation(immediateProxyComSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable, type);

			} else if (sendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sendInteraction.getImplementation();
				Type type = this.context.builtQuery.findType(dataInstanceInSwc.getImplementationDataType());
				setInitReturnValueVariable(returnValueVariable);
				operation = this.srOperationBuilder.createPeriodicProxyComSendOperation(periodicProxyComSendImplementation, dataParam, returnValueVariable, tempReturnValueVariable, type);

			} else {
				continue;
			}

			targetApi.getOperation().add(operation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(returnValueVariable)) {
			targetApi.setReturnValue(returnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void buildReadApiInternal(Swc swc, ReadApi targetApi) throws ModelException {
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) targetApi.getSingleSource();
		Parameter dataParam = targetApi.getDataParam();

		if (dataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			buildUnconnectedReadApiInternal(swc, targetApi, dataInstanceInSwc, dataParam);
			return;
		}

		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));

		// 内部構造の構築
		if (receiver.getReceiveInteraction().isEmpty()) {
			buildUnconnectedReadApiInternal(swc, targetApi, dataInstanceInSwc, dataParam);
			return;
		}

		buildConnectedReadApi(swc, targetApi, dataInstanceInSwc, receiver);
	}

	private void buildConnectedReadApi(Swc swc, ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, InternalEcuReceiver receiver) throws ModelException {
		Parameter dataParam = targetApi.getDataParam();
		ReceiveInteraction receiveInteraction = receiver.getReceiveInteraction().get(0);

		// 接続状態の設定
		targetApi.setIsConnected(true);

		// 返り値用変数の構築
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);

		LocalVariable tempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(tempReturnValueVariable);

		// 読み込み処理の構築
		ReadOperation operation;
		if (receiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			operation = this.srOperationBuilder.createRteBufferNonqueuedReadOperation(swc, receiveInteraction, dataParam, returnValueVariable, targetApi.getIsInline());

		} else if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) {
			IocValueBufferImplementation iocValueBufferImplementation = (IocValueBufferImplementation) receiveInteraction.getValueBufferImplementation();
			operation = this.srOperationBuilder.createIocNonqueuedReadOperation(iocValueBufferImplementation, dataParam, returnValueVariable);

		} else if (receiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			ComValueBufferImplementation comValueBufferImplementation = (ComValueBufferImplementation) receiveInteraction.getValueBufferImplementation();
			operation = this.srOperationBuilder.createComReadOperation(comValueBufferImplementation, dataParam, returnValueVariable, sourceDataInstanceInSwc, tempReturnValueVariable);

		} else {
			operation = this.srOperationBuilder.createNeverReadOperation(swc, sourceDataInstanceInSwc, dataParam, targetApi.getIsInline());
		}

		// 無効化処理の設定
		HandleInvalidEnum handleInvalid = sourceDataInstanceInSwc.isInvalidationEnabled() ? sourceDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE;
		if (HandleInvalidEnum.KEEP.equals(handleInvalid)) {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.INVALID_VALUE);
			operation.setInvalidValueConstant(invalidValueConstant);
			if (targetApi.getIsInline().booleanValue()) {
				if (! swc.getInlineConstant().contains(invalidValueConstant)) {	// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない) 無効値マクロ名が重複することはない
					swc.getInlineConstant().add(invalidValueConstant);
				}
			}
		}

		targetApi.setOperation(operation);

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(returnValueVariable)) {
			targetApi.setReturnValue(returnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void buildUnconnectedReadApiInternal(Swc swc, ReadApi targetApi, RVariableDataInstanceInSwc dataInstanceInSwc, Parameter dataParam) throws ModelException {
		targetApi.setIsConnected(false);
		targetApi.setOperation(this.srOperationBuilder.createNeverReadOperation(swc, dataInstanceInSwc, dataParam, targetApi.getIsInline()));
	}

	private void buildReceiveApiInternal(ReceiveApi targetApi) throws ModelException {
		targetApi.setIsConnected(false);

		VariableDataInstanceInSwc dataInstanceInSwc = (VariableDataInstanceInSwc) targetApi.getSingleSource();
		if (dataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		Parameter dataParam = targetApi.getDataParam();
		InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));

		// 内部構造の構築
		if (receiver.getReceiveInteraction().isEmpty()) {
			return;
		}

		ReceiveInteraction receiveInteraction = receiver.getReceiveInteraction().get(0);

		// 接続状態の設定
		targetApi.setIsConnected(true);

		// 返り値用変数の構築
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);

		targetApi.setReturnValue(returnValueVariable);

		LocalVariable tempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(tempReturnValueVariable);

		// 読み込み処理の構築
		ReadOperation operation;
		if (receiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			operation = this.srOperationBuilder.createRteBufferQueuedReadOperation(receiveInteraction, dataParam, returnValueVariable);

		} else if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			IocValueBufferImplementation iocValueBufferImplementation = (IocValueBufferImplementation) receiveInteraction.getValueBufferImplementation();
			operation = this.srOperationBuilder.createIocQueuedReceiveOperation(iocValueBufferImplementation, dataParam, returnValueVariable, tempReturnValueVariable);

		} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// ここには来ない
			assert false;
			return;
		}

		targetApi.setOperation(operation);

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	private void buildCallApiInternal(Swc swc, CallApi targetApi) throws ModelException {
		OperationInstanceInSwc sourceOperationInstanceInSwc = (OperationInstanceInSwc) targetApi.getSingleSource();

		targetApi.setIsConnected(false);

		// ポート定義引数の設定
		// 接続先のオペレーションが存在するかを確認
		if (sourceOperationInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			return;
		}

		OperationInstanceInComposition operationInstanceInComposition = sourceOperationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return;
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc providedOperationInstanceInSwc = (POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype();
		OperationInvokedEvent operationInvokedEvent = providedOperationInstanceInSwc.getOperationInvokedEvent().get(0);

		targetApi.setIsConnected(true);
		List<Value> portArgValues = findPortArgValues(providedOperationInstanceInSwc);
		targetApi.getPortArgValue().addAll(portArgValues);

		// ローカル変数を構築
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);
		
		// ランナブル開始オペレーションを構築
		targetApi.setOperation(this.entityOperationBuilder.createDirectExecutableStartOperation(operationInvokedEvent.getStartOnEvent()));
		if (targetApi.getIsInline()) {
			addExecutableEntity(swc, targetApi.getOperation().getStartExecutable());
			for (Value value : portArgValues) {
				if (value instanceof Constant) {
					swc.getInlineConstant().add((Constant)value);
				} else if (value instanceof GlobalVariable) {	// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
					swc.getInlineGlobalVariables().add((GlobalVariable)value);
				}
			}
		}
		if (!providedOperationInstanceInSwc.getPrototype().getPossibleError().isEmpty()) {
			targetApi.setReturnVariable(returnValueVariable);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);

		if (Variables.isContainedInFunction(returnValueVariable)) {
			targetApi.setReturnValue(returnValueVariable);
		} else {
			targetApi.setReturnValue(this.context.cache.rteErrorOkConstant);
		}
	}

	private void addExecutableEntity(Swc swc, ExecutableEntity entity) {
		if (! swc.getDependentExecutableEntity().contains(entity)
			&& ! swc.getInlineExecutableEntity().contains(entity)) {
			swc.getInlineExecutableEntity().add(entity);
		}
	}

	private List<Value> findPortArgValues(POperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		if (operationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			return Collections.emptyList();
		} else {
			PortApiOption portApiOption = operationInstanceInSwc.getContextPort().getPortApiOption().get(0);
			return this.context.builtQuery.<Value> findDests(VALUE, portApiOption.getPortArgValue());
		}
	}

	private void buildRteEnterApiInternal(RteEnterApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildRteExitApiInternal(RteExitApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private boolean isNoneExcludeOperation(ExcludeOperation operation) {
		return operation instanceof NoneExcludeOperation;
	}

	private void buildSchmApiInternals() throws ModelException {
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			for (SchmEnterApi targetApi : this.context.query.<SchmApi, SchmEnterApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_ENTER_API)) {
				buildSchmEnterApiInternal(targetApi);
			}
			for (SchmExitApi targetApi : this.context.query.<SchmApi, SchmExitApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_EXIT_API)) {
				buildSchmExitApiInternal(targetApi);
			}
			for (SchmModeApi targetApi : this.context.query.<SchmApi, SchmModeApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_MODE_API)) {
				buildSchmModeApiInternal(targetApi);
			}
			for (SchmSwitchApi targetApi : this.context.query.<SchmApi, SchmSwitchApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_SWITCH_API)) {
				buildSchmSwitchApiInternal(targetApi, targetPartedBswm);
			}
		}
	}

	private void buildSchmEnterApiInternal(SchmEnterApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildSchmExitApiInternal(SchmExitApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}

	private void buildSchmModeApiInternal(SchmModeApi targetApi) {
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}
	
	private void buildSchmSwitchApiInternal(SchmSwitchApi targetApi, PartedBswm partedBswm) throws ModelException {
		BswModuleDescription bswDescription = (BswModuleDescription)partedBswm.getBswm().getSingleSource();
		createSchmTaskEvents(targetApi, (ModeDeclarationGroupPrototype) targetApi.getSingleSource(), partedBswm,
				bswDescription, targetApi.getExecutableStartOperation(), null);
		targetApi.setIsNoneExclude(isNoneExcludeOperation(targetApi.getOperation()));
	}
	
	private void buildRteLifecyleApis() throws ModelException {
		Rte targetRte = this.context.cache.rte;

		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		// RTEのライフサイクル管理用のAPIを構築
		if (osOs.isMulticoreOs()) {
			// マルチコア構成

			// コア毎のStart APIの実装を構築
			for (Core sourceCore : targetRte.getCore()) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceCore.getCoreId())));

				RteCoreStartApiImpl startApiImpl = createRteCoreStartApiImpl(sourceCore);
				startApiImpl.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(bswPartition)));
				sourceCore.setRteStartApi(startApiImpl);
			}

			// Start/Stop APIを構築
			EcucPartition masterBswPartition = this.context.query.findSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(masterBswPartition));

			MulticoreRteStartApi startApi = createMulticoreRteStartApi(targetRte);
			startApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStartApi(startApi);

			RteStopApi stopApi = createRteStopApi();
			stopApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStopApi(stopApi);

		} else {
			// シングルコア構成
			Core sourceCore = targetRte.getCore().get(0);

			// Start/Stop APIを構築
			Optional<EcucPartition> masterBswPartition = this.context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(masterBswPartition);

			SinglecoreRteStartApi startApi = createSinglecoreRteStartApi(sourceCore);
			startApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStartApi(startApi);

			RteStopApi stopApi = createRteStopApi();
			stopApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setRteStopApi(stopApi);
		}

		// パーティションのライフサイクル管理用のAPIを構築
		for (EcucPartition sourcePartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(sourcePartition);
			MemoryMapping partitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(sourcePartition));

			if (this.context.query.get(sourcePartition, ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION)) {
				RestartPartitionApi restartPartitionApi = createRestartPartitionApi(sourcePartition);
				restartPartitionApi.setMemoryMapping(partitionMemmap);
				targetPartition.setRestartPartitionApi(restartPartitionApi);
			}
			if (this.context.query.get(sourcePartition, ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION)) {
				PartitionRestartingApi partitionRestartingApi = createPartitionRestartingApi(sourcePartition);
				partitionRestartingApi.setMemoryMapping(partitionMemmap);
				targetPartition.setPartitionRestartingApi(partitionRestartingApi);
			}

			PartitionTerminatedApi partitionTerminatedApi = createPartitionTerminatedApi(sourcePartition);
			partitionTerminatedApi.setMemoryMapping(partitionMemmap);
			targetPartition.setPartitionTerminatedApi(partitionTerminatedApi);
		}
	}

	private SinglecoreRteStartApi createSinglecoreRteStartApi(Core sourceCore) throws ModelException {
		SinglecoreRteStartApi startApi = ModuleFactory.eINSTANCE.createSinglecoreRteStartApi();
		startApi.setSymbolName(SymbolNames.RTE_START_API_NAME);
		startApi.setReturnType(this.context.cache.stdReturnType);

		startApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtStart(sourceCore));
		return startApi;
	}

	private MulticoreRteStartApi createMulticoreRteStartApi(Rte targetRte) {
		MulticoreRteStartApi startApi = ModuleFactory.eINSTANCE.createMulticoreRteStartApi();
		startApi.setSymbolName(SymbolNames.RTE_START_API_NAME);
		startApi.setReturnType(this.context.cache.stdReturnType);

		startApi.getCoreStartApiImpl().addAll(this.context.query.<RteCoreStartApiImpl> findByKind(targetRte, RTE_CORE_START_API_IMPL));
		return startApi;
	}

	private RteCoreStartApiImpl createRteCoreStartApiImpl(Core sourceCore) throws ModelException {
		RteCoreStartApiImpl startApi = ModuleFactory.eINSTANCE.createRteCoreStartApiImpl();
		startApi.setSymbolName(SymbolNames.createRteCoreStartApiImplName(sourceCore));
		startApi.setReturnType(this.context.cache.stdReturnType);

		startApi.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtStart(sourceCore));
		return startApi;
	}

	private RteStopApi createRteStopApi() throws ModelException {
		RteStopApi api = ModuleFactory.eINSTANCE.createRteStopApi();
		api.setSymbolName(SymbolNames.RTE_STOP_API_NAME);
		api.setReturnType(this.context.cache.stdReturnType);
		return api;
	}

	private void buildSchmLifecyleApis() throws ModelException {
		Rte targetRte = this.context.cache.rte;

		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		// RTEのライフサイクル管理用のAPIを構築
		if (osOs.isMulticoreOs()) {
			// マルチコア構成

			// コア毎のStart APIの実装を構築
			for (Core sourceCore : targetRte.getCore()) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceCore.getCoreId())));

				SchmCoreInitApiImpl initApiImpl = createSchmCoreInitApiImpl(sourceCore);
				initApiImpl.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(bswPartition)));
				sourceCore.setSchmInitApi(initApiImpl);
			}

			// Init/Deinit APIを構築
			EcucPartition masterBswPartition = this.context.query.findSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.of(masterBswPartition));

			MulticoreSchmInitApi initApi = createMulticoreSchmInitApi(targetRte);
			initApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmInitApi(initApi);

			SchmDeinitApi deinitApi = createSchmDeinitApi();
			deinitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmDeinitApi(deinitApi);

		} else {
			// シングルコア構成
			Core sourceCore = targetRte.getCore().get(0);

			// Init/Deinit APIを構築
			Optional<EcucPartition> masterBswPartition = this.context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			MemoryMapping masterBswPartitionMemmap = this.memmapBuilder.buildRteFunctionMemoryMapping(masterBswPartition);

			SinglecoreSchmInitApi initApi = createSinglecoreSchmInitApi(sourceCore);
			initApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmInitApi(initApi);

			SchmDeinitApi deinitApi = createSchmDeinitApi();
			deinitApi.setMemoryMapping(masterBswPartitionMemmap);
			targetRte.setSchmDeinitApi(deinitApi);
		}
	}

	private SinglecoreSchmInitApi createSinglecoreSchmInitApi(Core sourceCore) throws ModelException {
		SinglecoreSchmInitApi startApi = ModuleFactory.eINSTANCE.createSinglecoreSchmInitApi();
		startApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		startApi.setReturnType(this.context.cache.voidType);
		startApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
		createSchmCoreInit(sourceCore, startApi);
		return startApi;
	}

	private MulticoreSchmInitApi createMulticoreSchmInitApi(Rte targetRte) throws ModelException {
		MulticoreSchmInitApi initApi = ModuleFactory.eINSTANCE.createMulticoreSchmInitApi();
		initApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		initApi.setReturnType(this.context.cache.voidType);
		initApi.getCoreInitApiImpl().addAll(this.context.query.<SchmCoreInitApiImpl> findByKind(targetRte, SCHM_CORE_INIT_API_IMPL));
		return initApi;
	}
	
	private void createSchmCoreInit(Core sourceCore, SchmInitApi startApi) throws ModelException {
		for (Partition partition : sourceCore.getPartition()) {
			for (PartedBswm partedBswm : partition.getPartedBswm()) {
				Bswm bswm = partedBswm.getBswm();
				BswModuleDescription bswDescription = (BswModuleDescription)bswm.getSingleSource();

				for (ModeMachineInstance modeInstance : partedBswm.getModeMachineInstance()) {
					ModeDeclarationGroupPrototype modePrototype = (ModeDeclarationGroupPrototype) modeInstance.getSingleSource();
					startApi.getModeMachineInstance().add(modeInstance);
					ModeDeclaration initMode = modePrototype.getType().getInitialMode();
					createSchmTaskEvents(startApi, modePrototype, partedBswm, bswDescription, startApi.getExecutableStartOperation(), initMode);
				}
			}
		}
	}

	private SchmCoreInitApiImpl createSchmCoreInitApiImpl(Core sourceCore) throws ModelException {
		SchmCoreInitApiImpl initApi = ModuleFactory.eINSTANCE.createSchmCoreInitApiImpl();
		initApi.setSymbolName(SymbolNames.createSchmCoreStartApiImplName(sourceCore));
		initApi.setReturnType(this.context.cache.voidType);

		initApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
		createSchmCoreInit(sourceCore, initApi);
		return initApi;
	}

	private SchmDeinitApi createSchmDeinitApi() throws ModelException {
		SchmDeinitApi api = ModuleFactory.eINSTANCE.createSchmDeinitApi();
		api.setSymbolName(SymbolNames.SCHM_DEINIT_API_NAME);
		api.setReturnType(this.context.cache.voidType);
		return api;
	}

	private PartitionTerminatedApi createPartitionTerminatedApi(EcucPartition sourcePartition) throws ModelException {
		PartitionTerminatedApi api = ModuleFactory.eINSTANCE.createPartitionTerminatedApi();
		api.setSymbolName(SymbolNames.createPartitionTerminatedApiName(sourcePartition));
		api.setReturnType(this.context.cache.voidType);

		api.setOperation(this.srOperationBuilder.createInterPartitionTimeoutOperation(sourcePartition));
		return api;
	}

	private PartitionRestartingApi createPartitionRestartingApi(EcucPartition sourcePartition) throws ModelException {
		PartitionRestartingApi api = ModuleFactory.eINSTANCE.createPartitionRestartingApi();
		api.setSymbolName(SymbolNames.createPartitionRestartingApiName(sourcePartition));
		api.setReturnType(this.context.cache.voidType);

		api.setOperation(this.srOperationBuilder.createInterPartitionTimeoutOperation(sourcePartition));
		return api;
	}

	private RestartPartitionApi createRestartPartitionApi(EcucPartition sourcePartition) throws ModelException {
		RestartPartitionApi api = ModuleFactory.eINSTANCE.createRestartPartitionApi();
		api.setSymbolName(SymbolNames.createRestartPartitionApiName(sourcePartition));
		api.setReturnType(this.context.cache.stdReturnType);

		api.getOperation().add(this.initOperationBuilder.createRteVariableInitializeOperationAtPartitionRestart(sourcePartition));
		api.getOperation().add(this.initOperationBuilder.createIocInitializeOperationAtPartitionRestart(sourcePartition));
		return api;
	}

	private void buildExecutableTaskBodies() throws ModelException {
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			List<EcucPartition> partitions = this.context.query.collect(Collections.singletonList(sourceOsTask), OS_TASK__OWNER_APPLICATION, OS_APPLICATION__OS_APP_ECUC_PARTITION);
			EcucPartition sourcePartition = Iterables.getFirst(partitions, null);
			Partition targetPartition = this.context.builtQuery.findPartition(sourcePartition);

			Optional<OsTaskActivateEntityStarter> osTaskActivateEntityStarter = this.context.query.tryFindSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
			List<OsEventSetEntityStarter> osEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

			if (osTaskActivateEntityStarter.isPresent()) {
				// タスク起動契機で動作するタスクホディの構築
				OsTaskActivationExecutableTaskBody taskBody = createOsTaskActivationExecutableTaskBody(sourceOsTask, osTaskActivateEntityStarter.get());
				taskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(taskBody);

			} else if (!osEventSetEntityStarters.isEmpty()) {
				// OSイベント設定契機で動作するタスクボディの構築
				OsEventSetExecutableTaskBody taskBody = createOsEventSetExecutableTaskBody(sourceOsTask, osEventSetEntityStarters);
				taskBody.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
				targetPartition.getTaskBody().add(taskBody);
			}
		}
	}

	private OsTaskActivationExecutableTaskBody createOsTaskActivationExecutableTaskBody(OsTask sourceOsTask, OsTaskActivateEntityStarter sourceOsTaskActivateEntityStarter) throws ModelException {
		OsTaskActivationExecutableTaskBody taskBody = ModuleFactory.eINSTANCE.createOsTaskActivationExecutableTaskBody();
		buildExecutableTaskBody(taskBody, sourceOsTask);

		// エンティティ起動処理を構築
		taskBody.setOperation(this.entityOperationBuilder.createOsTaskActivationOperation(sourceOsTaskActivateEntityStarter, sourceOsTask));
		return taskBody;
	}

	private OsEventSetExecutableTaskBody createOsEventSetExecutableTaskBody(OsTask sourceOsTask, List<OsEventSetEntityStarter> entityStarters) throws ModelException {
		OsEventSetExecutableTaskBody taskBody = ModuleFactory.eINSTANCE.createOsEventSetExecutableTaskBody();
		buildExecutableTaskBody(taskBody, sourceOsTask);
		taskBody.getOsEventId().addAll(this.context.query.<String> collect(entityStarters, OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT, ECUC_REFERRABLE__SHORT_NAME));

		if (entityStarters.size() > 1) {
			taskBody.setChecksOsEventId(true);

			// OSイベントIDのチェック用変数を構築
			LocalVariable eventVariable = this.localSymbolModelBuilder.createEventVariable();
			taskBody.getLocalVariable().add(eventVariable);

			taskBody.setEventVariable(eventVariable);
		}

		taskBody.getOperation().addAll(this.entityOperationBuilder.createOsEventSetActivationOperations(entityStarters, sourceOsTask));
		return taskBody;
	}
	
	private void buildExecutableTaskBody(TaskBody targetTaskBody, OsTask sourceOsTask) {
		targetTaskBody.setSymbolName(SymbolNames.createTaskBodyName(sourceOsTask));
		targetTaskBody.setReturnType(this.context.cache.voidType);
		targetTaskBody.setOsTaskId(sourceOsTask.getShortName());
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
		EcucContainer ecucContainer = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, ecucContainer);
		InternalEcuReceiver firstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		ComReceiveCallback callback = ModuleFactory.eINSTANCE.createComReceiveCallback();
		callback.setSymbolName(SymbolNames.createComReceiveCallbackName(ecucContainer));
		callback.setReturnType(this.context.cache.voidType);
		callback.setAccessApi(comReceiveSignalApi);

		Variable dataVariable = getCallbackDataVariable(firstReceiver, comReceiveSignalApi);
		if (dataVariable instanceof LocalVariable) {
			callback.getLocalVariable().add((LocalVariable)dataVariable);
		}
		callback.setDataVariable(dataVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		callback.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		for (SendInteraction sendInteraction : sourceExternalEcuSender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				if (firstReceiver.getSource().getPrototype().isEventSemantics()) {
					operation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sendInteraction, dataVariable);
				} else {
					operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComReceiveCallback(sendInteraction, sourceExternalEcuSender, dataVariable, filterResultVariable);
				}

			} else if (sendInteraction.getImplementation() instanceof IocSendImplementation) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// S/Rの実現方式の選択方針が変更となりECU間ではIOCバッファを使用しなくなった
				IocSendImplementation iocSendImplementation = (IocSendImplementation) sendInteraction.getImplementation();
				if (firstReceiver.getSource().getPrototype().isEventSemantics()) {
					operation = this.srOperationBuilder.createIocQueuedSendOperation(iocSendImplementation, dataVariable, null);
				} else {
					operation = this.srOperationBuilder.createIocNonqueuedSendOperation(iocSendImplementation, dataVariable, null);
				}

			} else {
				continue;
			}

			callback.getOperation().add(operation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(callback);

		return callback;
	}

	private Variable getCallbackDataVariable(InternalEcuReceiver firstReceiver, ComReceiveSignalApi comReceiveSignalApi) throws ModelException {
		Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		if (masterBswPartition.isPresent()) {
			Partition partition = this.context.builtQuery.findPartition(masterBswPartition.get());
			EcucReferrable signal = (EcucReferrable) comReceiveSignalApi.getSource().get(0);
			for (RteBufferVariableSet rteBufferVariableSet : this.context.query.select(partition.getRteBufferVariableSet(), EObjectConditions.refExists(RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE))) {
				if (rteBufferVariableSet.getComplexVariable().getSymbolName().equals(SymbolNames.createBufferComValueComplexDataName(signal))) {
					return rteBufferVariableSet.getComplexVariable();
				}
			}
		}
		
		return this.localSymbolModelBuilder.createDataVariable(firstReceiver.getSource().getPrototype(), SymbolNames.DATA_VAR_NAME);
	}
	
	private ComInvalidateCallback createComInvalidateCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		ComInvalidateCallback callback = ModuleFactory.eINSTANCE.createComInvalidateCallback();
		callback.setSymbolName(SymbolNames.createComInvalidateCallbackName(sourceExternalEcuSender.getSourceSignal()));
		callback.setReturnType(this.context.cache.voidType);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		callback.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		for (SendInteraction sendInteraction : sourceExternalEcuSender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComInvalidateCallback(sendInteraction, sourceExternalEcuSender, filterResultVariable);

			} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				assert false; // ここには来ない
				continue;
			}

			callback.getOperation().add(operation);
		}

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(callback);

		return callback;
	}

	private ComReceiveTimeoutCallback createComReceiveTimeoutCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		EcucContainer ecucContainer = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, ecucContainer);
		InternalEcuReceiver firstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		ComReceiveTimeoutCallback callback = ModuleFactory.eINSTANCE.createComReceiveTimeoutCallback();
		callback.setSymbolName(SymbolNames.createComReceiveTimeoutCallbackName(ecucContainer));
		callback.setReturnType(this.context.cache.voidType);
		callback.setAccessApi(comReceiveSignalApi);

		Variable dataVariable = getCallbackDataVariable(firstReceiver, comReceiveSignalApi);
		if (dataVariable instanceof LocalVariable) {
			callback.getLocalVariable().add((LocalVariable)dataVariable);
		}
		callback.setDataVariable(dataVariable);

		// 送信処理の構築
		for (SendInteraction sendInteraction : sourceExternalEcuSender.getSendInteraction()) {
			InternalEcuReceiver sendInteractionReceiver = sendInteraction.getReceiveInteraction().getInternalEcuReceivers().get(0);
			if (!sendInteractionReceiver.isAliveTimeoutEnabled()) {
				continue;
			}

			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForComReceiveTimeoutCallback(sendInteraction, dataVariable, this.context.cache.rteErrorMaxAgeExceededConstant);

			} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				assert false; // ここには来ない
				continue;
			}

			callback.getOperation().add(operation);
		}
		return callback;
	}
}
