/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION__OS_APP_ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_OS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__OWNER_APPLICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ROOT_SW_COMPOSITION_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_PARTITION_RESTARTING_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___PROVIDES_RESTART_PARTITION_API__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXCLUSIVE_AREA_EX___PROVIDES_ENTER_EXIT_API__EXCLUSIVEAREA;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INVALIDATE_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CALL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_RECEIVE_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INVALIDATE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTED_BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_ENTER_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_EXIT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SEND_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Variables;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.OperationInvokedEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

public class RteFunctionModelBuilder {

	final ModuleModelBuildContext context;

	private final MemoryMappingModelBuilder memmapBuilder;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;
	private final ExcludeOperationModelBuilder excludeOperationBuilder;
	private final EntityOperationModelBuilder entityOperationBuilder;
	private final SenderReceiverOperationModelBuilder srOperationBuilder;
	private final ComProxyOperationModelBuilder comProxyOperationModelBuilder;
	private final InitializeOperationModelBuilder initOperationBuilder;

	public RteFunctionModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
		this.entityOperationBuilder = new EntityOperationModelBuilder(context);
		this.srOperationBuilder = new SenderReceiverOperationModelBuilder(context);
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
					if (this.context.query.get(dataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_WRITE_API__PVARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getRteApi().add(createWriteApi(dataInstanceInSwc));
					}
					if (this.context.query.get(dataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INVALIDATE_API__PVARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getRteApi().add(createInvalidateApi(dataInstanceInSwc));
					}
					if (this.context.query.get(dataInstanceInSwc, PVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_SEND_API__PVARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getRteApi().add(createSendApi(dataInstanceInSwc));
					}
				}
			}

			// 受信側APIの構築
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(dataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_READ_API__RVARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getRteApi().add(createReadApi(dataInstanceInSwc));
					}
					if (this.context.query.get(dataInstanceInSwc, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_RECEIVE_API__RVARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getRteApi().add(createReceiveApi(dataInstanceInSwc));
					}
				}

				for (ROperationInstanceInSwc operationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(operationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						targetSwc.getRteApi().add(createCallApi(operationInstanceInSwc));
					}
				}
			}

			// 排他エリアAPIの構築
			for (ExclusiveArea sourceExclusiveArea : swComponentType.getInternalBehavior().getExclusiveArea()) {
				if (this.context.query.get(sourceExclusiveArea, EXCLUSIVE_AREA_EX___PROVIDES_ENTER_EXIT_API__EXCLUSIVEAREA)) {
					targetSwc.getRteApi().add(createRteEnterApi(sourceExclusiveArea));
					targetSwc.getRteApi().add(createRteExitApi(sourceExclusiveArea));
				}
			}

			// メモリマッピングを構築
			for (RteApi targetApi : targetSwc.getRteApi()) {
				EcucPartition sourcePartition = (EcucPartition) targetSwc.getParent().getSingleSource();
				targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
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
		Type paramType = this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc);
		Parameter dataParam = this.localSymbolModelBuilder.createDataParam(paramType, ParameterPassTypeEnum.VALUE);
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
		Type paramType = this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc);
		Parameter dataParam = this.localSymbolModelBuilder.createDataParam(paramType, ParameterPassTypeEnum.VALUE);
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
		Type paramType = this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc);
		Parameter dataParam = this.localSymbolModelBuilder.createDataParam(paramType, ParameterPassTypeEnum.REFERENCE);
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
		Type paramType = this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc);
		Parameter dataParam = this.localSymbolModelBuilder.createDataParam(paramType, ParameterPassTypeEnum.REFERENCE);
		api.getParam().add(dataParam);

		api.setDataParam(dataParam);
		return api;
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

	private RteEnterApi createRteEnterApi(ExclusiveArea sourceExclusiveArea) {
		RteEnterApi api = ModuleFactory.eINSTANCE.createRteEnterApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createRteEnterApiImplName(sourceExclusiveArea));
		api.setApiMappingName(SymbolNames.createRteEnterApiName(sourceExclusiveArea));
		api.setReturnType(this.context.cache.voidType);
		return api;
	}

	private RteExitApi createRteExitApi(ExclusiveArea sourceExclusiveArea) {
		RteExitApi api = ModuleFactory.eINSTANCE.createRteExitApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createRteExitApiImplName(sourceExclusiveArea));
		api.setApiMappingName(SymbolNames.createRteExitApiName(sourceExclusiveArea));
		api.setReturnType(this.context.cache.voidType);
		return api;
	}

	private void buildSchmApis() throws ModelException {
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			// 排他エリアAPIの構築
			Set<ExclusiveArea> exclusiveAreas = new HashSet<ExclusiveArea>();
			for (ExecutableEntity executableEntity : targetPartedBswm.getDependentExecutableEntity()) {
				jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceEntity = (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity)executableEntity.getSingleSource();
				for (ExclusiveArea exclusiveArea : sourceEntity.getCanEnterExclusiveArea()) {
					exclusiveAreas.add(exclusiveArea);
				}
			}
			for (ExclusiveArea sourceExclusiveArea : exclusiveAreas) {
				targetPartedBswm.getSchmApi().add(createSchmEnterApi(sourceExclusiveArea, targetPartedBswm.getBswm().getCompartmentName()));
				targetPartedBswm.getSchmApi().add(createSchmExitApi(sourceExclusiveArea, targetPartedBswm.getBswm().getCompartmentName()));
			}			

			// メモリマッピングを構築
			for (SchmApi targetApi : targetPartedBswm.getSchmApi()) {
				EcucPartition sourcePartition = (EcucPartition) targetPartedBswm.getParent().getSingleSource();
				targetApi.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
			}
		}
	}

	private SchmEnterApi createSchmEnterApi(ExclusiveArea sourceExclusiveArea, String bsnp) {
		SchmEnterApi api = ModuleFactory.eINSTANCE.createSchmEnterApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createSchmEnterApiName(sourceExclusiveArea, bsnp));
		api.setReturnType(this.context.cache.voidType);
		return api;
	}

	private SchmExitApi createSchmExitApi(ExclusiveArea sourceExclusiveArea, String bsnp) {
		SchmExitApi api = ModuleFactory.eINSTANCE.createSchmExitApi();
		api.setSingleSource(sourceExclusiveArea);
		api.setSymbolName(SymbolNames.createSchmExitApiName(sourceExclusiveArea, bsnp));
		api.setReturnType(this.context.cache.voidType);
		return api;
	}

	public void buildImplFunctions() throws ModelException {
		buildTrustedFunctions(this.context.cache.rte);
		buildBswSchedulableEntities(this.context.cache.rte);

		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = this.context.query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		if (rootSwCompositionPrototype.isPresent()) {
			buildRteApiInternals();
			buildRteLifecyleApis();
		}

		Optional<BswImplementation> bswImplementation = this.context.query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		if (bswImplementation.isPresent()) {
			buildSchmApiInternals();
			buildSchmLifecyleApis();
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
		entity.setReturnType(this.context.cache.voidType);

		UnionType proxyUnionType = this.localSymbolModelBuilder.createProxyUnionType();
		entity.getLocalType().add(proxyUnionType);

		LocalVariable signalIdVariable = this.localSymbolModelBuilder.createSignalIdVariable();
		entity.getLocalVariable().add(signalIdVariable);

		LocalVariable proxyDataVariable = this.localSymbolModelBuilder.createProxyUnionDataVariable(proxyUnionType);
		entity.getLocalVariable().add(proxyDataVariable);

		for (ComSendProxyInteraction sourceProxyInteraction : sourceComSendProxy.getInteraction()) {
			VariableMember dataVariable = this.context.query.selectSingle(proxyDataVariable.getMember(),
					hasAttr(VARIABLE__SYMBOL_NAME, "data_" + sourceProxyInteraction.getSignalDataType().getShortName()));
			entity.getOperation().add(this.comProxyOperationModelBuilder.createComSendProxyOperation(sourceProxyInteraction, signalIdVariable, dataVariable));
		}
		return entity;
	}

	private ComSendSignalImmediateEntity createComSendSignalImmediateEntity(ImmediateComSendProxy sourceComSendProxy) throws ModelException {
		ComSendSignalImmediateEntity entity = ModuleFactory.eINSTANCE.createComSendSignalImmediateEntity();
		entity.setSymbolName(SymbolNames.COM_SEND_SIGNAL_IMMEDIATE_ENTITY_NAME);
		entity.setReturnType(this.context.cache.voidType);

		UnionType proxyUnionType = this.localSymbolModelBuilder.createProxyUnionType();
		entity.getLocalType().add(proxyUnionType);

		LocalVariable signalIdVariable = this.localSymbolModelBuilder.createSignalIdVariable();
		entity.getLocalVariable().add(signalIdVariable);

		LocalVariable proxyDataVariable = this.localSymbolModelBuilder.createProxyUnionDataVariable(proxyUnionType);
		entity.getLocalVariable().add(proxyDataVariable);

		for (ComSendProxyInteraction sourceProxyInteraction : sourceComSendProxy.getInteraction()) {
			VariableMember dataVariable = this.context.query.selectSingle(proxyDataVariable.getMember(),
					hasAttr(VARIABLE__SYMBOL_NAME, "data_" + sourceProxyInteraction.getSignalDataType().getShortName()));

			entity.getOperation().add(this.comProxyOperationModelBuilder.createComSendProxyOperation(sourceProxyInteraction, signalIdVariable, dataVariable));
		}
		return entity;
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
		Optional<OsApplicationTrustedFunction> sourceTrustedFunction = this.context.query.tryFindSingle(isKindOf(OS_APPLICATION_TRUSTED_FUNCTION).AND(
				hasAttr(ECUC_REFERRABLE__SHORT_NAME, Identifiers.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME)));
		if (sourceTrustedFunction.isPresent()) {
			EcucPartition sourcePartition = sourceTrustedFunction.get().getParent().getOsAppEcucPartition();

			ComSendSignalTrustedFunction comSendSignalTrustedFunction = createComSendSignalTrustedFunction(sourceTrustedFunction.get());
			comSendSignalTrustedFunction.setMemoryMapping(this.memmapBuilder.buildRteFunctionMemoryMapping(Optional.fromNullable(sourcePartition)));
			targetRte.setComSendSignalTrustedFunction(comSendSignalTrustedFunction);
			this.context.cache.comSendSignalTrustedFunction = Optional.of(comSendSignalTrustedFunction);
		} else {
			this.context.cache.comSendSignalTrustedFunction = Optional.absent();
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
		LocalVariable dataVariable = this.localSymbolModelBuilder.createDataVariable(pDataInstanceInSwc);
		trustedFunction.getLocalVariable().add(dataVariable);

		trustedFunction.setDataVariable(dataVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		trustedFunction.getLocalVariable().add(filterResultVariable);

		// 送信処理の構築
		RteBufferNonqueuedSendOperation sendOperation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteTrustedFunction(sourceSendInteraction, dataVariable, filterResultVariable);
		trustedFunction.setOperation(sendOperation);

		this.localSymbolModelBuilder.removeUnusedLocalVariables(trustedFunction);
		return trustedFunction;
	}

	private ComSendSignalTrustedFunction createComSendSignalTrustedFunction(OsApplicationTrustedFunction sourceTrustedFunction) throws ModelException {
		ComSendSignalTrustedFunction trustedFunction = ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction();
		buildTrustedFunctionSignature(trustedFunction);
		trustedFunction.setSymbolName(sourceTrustedFunction.getOsTrustedFunctionName());
		trustedFunction.setTrustedFunctionIndex(sourceTrustedFunction.getShortName());
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
				buildWriteApiInternal(targetApi);
			}
			for (InvalidateApi targetApi : this.context.query.<RteApi, InvalidateApi> selectByKind(targetSwc.getRteApi(), INVALIDATE_API)) {
				buildInvalidateApiInternal(targetApi);
			}
			for (SendApi targetApi : this.context.query.<RteApi, SendApi> selectByKind(targetSwc.getRteApi(), SEND_API)) {
				buildSendApiInternal(targetApi);
			}
			for (ReadApi targetApi : this.context.query.<RteApi, ReadApi> selectByKind(targetSwc.getRteApi(), READ_API)) {
				buildReadApiInternal(targetApi);
			}
			for (ReceiveApi targetApi : this.context.query.<RteApi, ReceiveApi> selectByKind(targetSwc.getRteApi(), RECEIVE_API)) {
				buildReceiveApiInternal(targetApi);
			}
			for (CallApi targetApi : this.context.query.<RteApi, CallApi> selectByKind(targetSwc.getRteApi(), CALL_API)) {
				buildCallApiInternal(targetApi);
			}
			for (RteEnterApi targetApi : this.context.query.<RteApi, RteEnterApi> selectByKind(targetSwc.getRteApi(), RTE_ENTER_API)) {
				buildRteEnterApiInternal(targetApi);
			}
			for (RteExitApi targetApi : this.context.query.<RteApi, RteExitApi> selectByKind(targetSwc.getRteApi(), RTE_EXIT_API)) {
				buildRteExitApiInternal(targetApi);
			}
		}
	}

	private void buildWriteApiInternal(WriteApi targetApi) throws ModelException {
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
		returnValueVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		targetApi.getLocalVariable().add(returnValueVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		targetApi.getLocalVariable().add(filterResultVariable);

		LocalVariable comSendSignalTrustedFunctionParamVariable = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
		targetApi.getLocalVariable().add(comSendSignalTrustedFunctionParamVariable);

		// 送信処理の構築
		for (SendInteraction sendInteraction : sender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForWriteApi(sendInteraction, dataParam, filterResultVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionRteBufferWriteSendOperation(trustedFunctionRteSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation iocSendImplementation = (IocSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createIocNonqueuedSendOperation(iocSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createDirectComSendOperation(directComSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, dataParam, returnValueVariable,
						comSendSignalTrustedFunctionParamVariable);

			} else if (sendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createImmediateProxyComSendOperation(immediateProxyComSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) {
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createPeriodicProxyComSendOperation(periodicProxyComSendImplementation, dataParam, returnValueVariable);

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

	private void buildInvalidateApiInternal(InvalidateApi targetApi) throws ModelException {
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
		returnValueVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		targetApi.getLocalVariable().add(returnValueVariable);

		LocalVariable invalidValueVariable = this.localSymbolModelBuilder.createInvalidValueVariable(dataInstanceInSwc);
		invalidValueVariable.setInitValueConstant(invalidValueConstant);
		targetApi.getLocalVariable().add(invalidValueVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		targetApi.getLocalVariable().add(filterResultVariable);

		LocalVariable comSendSignalTrustedFunctionParamVariable = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
		targetApi.getLocalVariable().add(comSendSignalTrustedFunctionParamVariable);

		// 送信処理の構築
		for (SendInteraction sendInteraction : sender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				operation = this.srOperationBuilder.createRteBufferNonqueuedSendOperationForInvalidateApi(sendInteraction, invalidValueConstant, filterResultVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionRteSendImplementation) {
				TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionRteBufferInvalidateSendOperation(sendInteraction, trustedFunctionRteSendImplementation, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createDirectComSendOperation(directComSendImplementation, invalidValueVariable, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, invalidValueVariable, returnValueVariable,
						comSendSignalTrustedFunctionParamVariable);

			} else if (sendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createImmediateProxyComSendOperation(immediateProxyComSendImplementation, invalidValueConstant, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createPeriodicProxyComSendOperation(periodicProxyComSendImplementation, invalidValueConstant, returnValueVariable);

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
		returnValueVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		targetApi.getLocalVariable().add(returnValueVariable);

		LocalVariable tempReturnValueVariable = this.localSymbolModelBuilder.createTempReturnValueVariable();
		targetApi.getLocalVariable().add(tempReturnValueVariable);

		LocalVariable filterResultVariable = this.localSymbolModelBuilder.createFilterResultVariable();
		targetApi.getLocalVariable().add(filterResultVariable);

		LocalVariable trustedFunctionParamVariable = this.localSymbolModelBuilder.createComSendSignalTrustedFunctionParamVariable();
		targetApi.getLocalVariable().add(trustedFunctionParamVariable);

		// 送信処理の構築
		for (SendInteraction sendInteraction : sender.getSendInteraction()) {
			SendOperation operation;
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				operation = this.srOperationBuilder.createRteBufferQueuedSendOperation(sendInteraction, dataParam, returnValueVariable, tempReturnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof IocSendImplementation) {
				IocSendImplementation iocSendImplementation = (IocSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createIocQueuedSendOperation(iocSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof DirectComSendImplementation) {
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createDirectComSendOperation(directComSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof TrustedFunctionComSendImplementation) {
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createTrustedFunctionComSendOperation(trustedFunctionComSendImplementation, dataParam, returnValueVariable, trustedFunctionParamVariable);

			} else if (sendInteraction.getImplementation() instanceof ImmediateProxyComSendImplementation) {
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createImmediateProxyComSendOperation(immediateProxyComSendImplementation, dataParam, returnValueVariable);

			} else if (sendInteraction.getImplementation() instanceof PeriodicProxyComSendImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation) sendInteraction.getImplementation();
				operation = this.srOperationBuilder.createPeriodicProxyComSendOperation(periodicProxyComSendImplementation, dataParam, returnValueVariable);

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

	private void buildReadApiInternal(ReadApi targetApi) throws ModelException {
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) targetApi.getSingleSource();
		Parameter dataParam = targetApi.getDataParam();

		if (dataInstanceInSwc.getInstance().isEmpty()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			buildUnconnectedReadApiInternal(targetApi, dataInstanceInSwc, dataParam);
			return;
		}

		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));

		// 内部構造の構築
		if (receiver.getReceiveInteraction().isEmpty()) {
			buildUnconnectedReadApiInternal(targetApi, dataInstanceInSwc, dataParam);
			return;
		}

		buildConnectedReadApi(targetApi, dataInstanceInSwc, receiver);
	}

	private void buildConnectedReadApi(ReadApi targetApi, RVariableDataInstanceInSwc sourceDataInstanceInSwc, InternalEcuReceiver receiver) throws ModelException {
		Parameter dataParam = targetApi.getDataParam();
		ReceiveInteraction receiveInteraction = receiver.getReceiveInteraction().get(0);

		// 接続状態の設定
		targetApi.setIsConnected(true);

		// 返り値用変数の構築
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);

		// 読み込み処理の構築
		ReadOperation operation;
		if (receiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			operation = this.srOperationBuilder.createRteBufferNonqueuedReadOperation(receiveInteraction, dataParam, returnValueVariable);

		} else if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) {
			IocValueBufferImplementation iocValueBufferImplementation = (IocValueBufferImplementation) receiveInteraction.getValueBufferImplementation();
			operation = this.srOperationBuilder.createIocNonqueuedReadOperation(iocValueBufferImplementation, dataParam, returnValueVariable);

		} else if (receiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			ComValueBufferImplementation comValueBufferImplementation = (ComValueBufferImplementation) receiveInteraction.getValueBufferImplementation();
			operation = this.srOperationBuilder.createComReadOperation(comValueBufferImplementation, dataParam, returnValueVariable);

		} else {
			operation = this.srOperationBuilder.createNeverReadOperation(sourceDataInstanceInSwc, dataParam);
		}

		// 無効化処理の設定
		HandleInvalidEnum handleInvalid = sourceDataInstanceInSwc.isInvalidationEnabled() ? sourceDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE;
		if (HandleInvalidEnum.KEEP.equals(handleInvalid)) {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.INVALID_VALUE);
			operation.setInvalidValueConstant(invalidValueConstant);
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

	private void buildUnconnectedReadApiInternal(ReadApi targetApi, RVariableDataInstanceInSwc dataInstanceInSwc, Parameter dataParam) throws ModelException {
		targetApi.setIsConnected(false);
		targetApi.setOperation(this.srOperationBuilder.createNeverReadOperation(dataInstanceInSwc, dataParam));
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

		// 読み込み処理の構築
		ReadOperation operation;
		if (receiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation) {
			operation = this.srOperationBuilder.createRteBufferQueuedReadOperation(receiveInteraction, dataParam, returnValueVariable);

		} else if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation) { // COVERAGE 常にtrue(falseとなるのは不具合混入時のみなので，未カバレッジで問題ない)
			IocValueBufferImplementation iocValueBufferImplementation = (IocValueBufferImplementation) receiveInteraction.getValueBufferImplementation();
			operation = this.srOperationBuilder.createIocQueuedReceiveOperation(iocValueBufferImplementation, dataParam, returnValueVariable);

		} else { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// ここには来ない
			assert false;
			return;
		}

		targetApi.setOperation(operation);

		// 使用していないローカル変数を除外
		this.localSymbolModelBuilder.removeUnusedLocalVariables(targetApi);
	}

	private void buildCallApiInternal(CallApi targetApi) throws ModelException {
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
		targetApi.getPortArgValue().addAll(findPortArgValueConstants(providedOperationInstanceInSwc));

		// ローカル変数を構築
		LocalVariable returnValueVariable = this.localSymbolModelBuilder.createReturnValueVariable();
		targetApi.getLocalVariable().add(returnValueVariable);

		// ランナブル開始オペレーションを構築
		targetApi.setOperation(this.entityOperationBuilder.createDirectExecutableStartOperation(operationInvokedEvent.getStartOnEvent()));
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

	private List<Constant> findPortArgValueConstants(POperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		if (operationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			return Collections.emptyList();
		} else {
			PortApiOption portApiOption = operationInstanceInSwc.getContextPort().getPortApiOption().get(0);
			return this.context.builtQuery.<Constant> findDests(CONSTANT, portApiOption.getPortArgValue());
		}
	}

	private void buildRteEnterApiInternal(RteEnterApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
	}

	private void buildRteExitApiInternal(RteExitApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
	}

	private void buildSchmApiInternals() throws ModelException {
		for (PartedBswm targetPartedBswm : this.context.query.<PartedBswm> findByKind(PARTED_BSWM)) {
			for (SchmEnterApi targetApi : this.context.query.<SchmApi, SchmEnterApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_ENTER_API)) {
				buildSchmEnterApiInternal(targetApi);
			}
			for (SchmExitApi targetApi : this.context.query.<SchmApi, SchmExitApi> selectByKind(targetPartedBswm.getSchmApi(), SCHM_EXIT_API)) {
				buildSchmExitApiInternal(targetApi);
			}
		}
	}

	private void buildSchmEnterApiInternal(SchmEnterApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
	}

	private void buildSchmExitApiInternal(SchmExitApi targetApi) {
		ExclusiveArea sourceExclusiveArea = (ExclusiveArea) targetApi.getSingleSource();

		targetApi.setOperation(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
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
		return startApi;
	}

	private MulticoreSchmInitApi createMulticoreSchmInitApi(Rte targetRte) {
		MulticoreSchmInitApi initApi = ModuleFactory.eINSTANCE.createMulticoreSchmInitApi();
		initApi.setSymbolName(SymbolNames.SCHM_INIT_API_NAME);
		initApi.setReturnType(this.context.cache.voidType);
		initApi.getCoreInitApiImpl().addAll(this.context.query.<SchmCoreInitApiImpl> findByKind(targetRte, SCHM_CORE_INIT_API_IMPL));
		return initApi;
	}

	private SchmCoreInitApiImpl createSchmCoreInitApiImpl(Core sourceCore) throws ModelException {
		SchmCoreInitApiImpl initApi = ModuleFactory.eINSTANCE.createSchmCoreInitApiImpl();
		initApi.setSymbolName(SymbolNames.createSchmCoreStartApiImplName(sourceCore));
		initApi.setReturnType(this.context.cache.voidType);

		initApi.getOperation().add(this.initOperationBuilder.createSchmVariableInitializeOperationAtStart(sourceCore));
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
		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceExternalEcuSender.getSource());
		InternalEcuReceiver firstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		ComReceiveCallback callback = ModuleFactory.eINSTANCE.createComReceiveCallback();
		callback.setSymbolName(SymbolNames.createComReceiveCallbackName(sourceExternalEcuSender.getSource()));
		callback.setReturnType(this.context.cache.voidType);
		callback.setAccessApi(comReceiveSignalApi);

		LocalVariable dataVariable = this.localSymbolModelBuilder.createDataVariable(firstReceiver.getSource().getPrototype());
		callback.getLocalVariable().add(dataVariable);

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

	private ComInvalidateCallback createComInvalidateCallback(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		ComInvalidateCallback callback = ModuleFactory.eINSTANCE.createComInvalidateCallback();
		callback.setSymbolName(SymbolNames.createComInvalidateCallbackName(sourceExternalEcuSender.getSource()));
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
		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceExternalEcuSender.getSource());
		InternalEcuReceiver firstReceiver = sourceExternalEcuSender.getInternalEcuReceivers().get(0);

		ComReceiveTimeoutCallback callback = ModuleFactory.eINSTANCE.createComReceiveTimeoutCallback();
		callback.setSymbolName(SymbolNames.createComReceiveTimeoutCallbackName(sourceExternalEcuSender.getSource()));
		callback.setReturnType(this.context.cache.voidType);
		callback.setAccessApi(comReceiveSignalApi);

		LocalVariable dataVariable = this.localSymbolModelBuilder.createDataVariable(firstReceiver.getSource().getPrototype());
		callback.getLocalVariable().add(dataVariable);

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
