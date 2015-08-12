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
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_GENERAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.IMPLEMENTATION_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.OS_TASK_EX___GET_OWNER_PARTITION__OSTASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RTE_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCsTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacroGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeRequestVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

public class RteStaticSymbolModelBuilder {

	private final ModuleModelBuildContext context;
	private MemoryMappingModelBuilder memmapBuilder;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;

	public RteStaticSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
	}

	public void buildApiSymbols() throws ModelException {
		buildApiTypes();
		buildApiConstants();
	}

	private void sortTypes(EList<? extends ImplementationDataType> targetTypes) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(REFERRABLE__SHORT_NAME));
		ECollections.sort(targetTypes, ordering);
	}

	private void buildApiTypes() throws ModelException {
		EList<ImplementationDataType> dataTypes = new BasicEList<ImplementationDataType>(this.context.query.<ImplementationDataType> findByKind(IMPLEMENTATION_DATA_TYPE));
		sortTypes(dataTypes);
		for (ImplementationDataType dataType : dataTypes) {
			// 実装型の生成。実体よりも参照が先に来る可能性がある(再定義やComposite)ため、取得時に存在しないなら作成する実装にしている。
			getModuleDataType(dataType);
		}
	}

	private Type getModuleDataType(ImplementationDataType dataType) throws ModelException {
		// 作成済みなら利用する
		try {
			return this.context.builtQuery.findType(dataType);
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}

		// 同一シンボルなら利用する
		try {
			Type type = this.context.query.selectSingle(this.context.cache.rte.getRteType(), EObjectConditions.hasAttr(TYPE__SYMBOL_NAME, dataType.getShortName()));
			type.getSource().add(dataType);
			return type;
		} catch (ModelException e) {
			// 未作成
			// do nothing
		}
		
		// 未生成なので生成する
		Type type;
		if ("ARRAY".equals(dataType.getCategory())) {
			type = createArrayType(dataType);
		} else if ("STRUCTURE".equals(dataType.getCategory())) {
			type = createStructType(dataType);
		} else if ("UNION".equals(dataType.getCategory())) {
			type = createUnionType(dataType);
		} else if ("DATA_REFERENCE".equals(dataType.getCategory())) {
			type = createPointerType(dataType);
		} else if ("TYPE_REFERENCE".equals(dataType.getCategory())) {
			type = createRedefinitionType(dataType);
		} else {
			type = createPrimitiveType(dataType);
		}
		// 実装型を生成するかの判別．生成しない場合，依存型として定義
		if (this.context.query.get(dataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE)) {
			this.context.cache.rte.getRteType().add(type);
		} else {
			this.context.cache.rte.getDependentType().add(type);
		}
		return type;
	}

	private PrimitiveType createPrimitiveType(ImplementationDataType sourceDataType) {
		PrimitiveType type = ModuleFactory.eINSTANCE.createPrimitiveType();
		type.setSymbolName(sourceDataType.getShortName());
		type.setSingleSource(sourceDataType);
		type.setOriginalTypeSymbolName(sourceDataType.getBaseType().getNativeDeclaration());
		type.setSize(sourceDataType.getBaseType().getBaseTypeSize());
		type.setSignedness(Types.getSignedness(sourceDataType));
		return type;
	}

	private Type createRedefinitionType(ImplementationDataType sourceDataType) throws ModelException {
		ImplementationDataType sourceImplType = sourceDataType.getSwDataDefProps().getImplementationDataType();
		Type sourceType = getModuleDataType(sourceImplType);
		RedefinitionType type = null;
		if (sourceType instanceof PrimitiveType) {
			type = ModuleFactory.eINSTANCE.createRedefinitionPrimitiveType();
		} else if (sourceType instanceof ArrayType) {
			type = ModuleFactory.eINSTANCE.createRedefinitionArrayType();
		} else if (sourceType instanceof StructType) {
			type = ModuleFactory.eINSTANCE.createRedefinitionStructType();
		} else if (sourceType instanceof UnionType) {
			type = ModuleFactory.eINSTANCE.createRedefinitionUnionType();
		} else if (sourceType instanceof PointerType) { // COVERAGE (現状，いずれにも該当しないパターンは存在しないため，コードレビューで問題ないことを確認)
			type = ModuleFactory.eINSTANCE.createRedefinitionPointerType();
		}
		
		type.setSymbolName(sourceDataType.getShortName());
		type.setOriginalTypeSymbolName(sourceType.getOriginalTypeSymbolName()); // 大元のsymbolNameと同じにする
		type.setSingleSource(sourceDataType);
		type.setSourceType(sourceType);
		type.setSize(sourceType.getSize());
		type.setSignedness(sourceType.getSignedness());
		return type;
	}

	private PointerType createPointerType(ImplementationDataType sourceDataType) throws ModelException {
		PointerType type = ModuleFactory.eINSTANCE.createPointerType();
		type.setSymbolName(sourceDataType.getShortName());
		type.setSingleSource(sourceDataType);
		
		// 未サポート
//		type.setIsConstPointer(sourceDataType.getSwDataDefProps().getSwImplPolicy() == SwImplPolicyEnum.CONST);
//		type.setIsConstTarget(sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getSwImplPolicy() == SwImplPolicyEnum.CONST);
		
		SwBaseType refBaseType = sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getBaseType();
		if (refBaseType != null) {
			Type refType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), EObjectConditions.hasAttr(TYPE__SYMBOL_NAME, refBaseType.getNativeDeclaration()));
			type.setType(refType);
		} else {
			ImplementationDataType refImplType = sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getImplementationDataType();
			type.setType(getModuleDataType(refImplType));
		}
		return type;
	}

	private ArrayType createArrayType(ImplementationDataType sourceDataType) throws ModelException {
		ArrayType type = ModuleFactory.eINSTANCE.createArrayType();
		ImplementationDataTypeElement implementationDataTypeElement = sourceDataType.getSubElement().get(0);
		type.setSymbolName(sourceDataType.getShortName());
		type.setSingleSource(sourceDataType);
		if ("TYPE_REFERENCE".equals(implementationDataTypeElement.getCategory())) {
			// CategoryがTYPE_REFERENCEの場合、signとoriginal type symbolnameの定義方法を変更
			ImplementationDataType dataType = implementationDataTypeElement.getSwDataDefProps().getImplementationDataType();
			getModuleDataType(dataType); // 依存先の型を先に作成・登録する(コンパイル時に問題が出るため)
			type.setSignedness(Types.getSignedness(dataType));
			type.setOriginalTypeSymbolName(dataType.getShortName());
		} else {
			type.setSignedness(Types.getSignedness(implementationDataTypeElement));
			type.setOriginalTypeSymbolName(implementationDataTypeElement.getSwDataDefProps().getBaseType().getNativeDeclaration());
		}
		type.setArraySize(implementationDataTypeElement.getArraySize());
		return type;
	}

	private StructType createStructType(ImplementationDataType sourceDataType) throws ModelException {
		StructType type = ModuleFactory.eINSTANCE.createStructType();
		type.setSymbolName(sourceDataType.getShortName());
		type.setSingleSource(sourceDataType);

		for (ImplementationDataTypeElement iterable_element : sourceDataType.getSubElement()) {
			StructMember member = ModuleFactory.eINSTANCE.createStructMember();
			member.setMemberName(iterable_element.getShortName());
			
			Type mType;
			if ("TYPE_REFERENCE".equals(iterable_element.getCategory())) {
				// CategoryがTYPE_REFERENCEの場合、再帰的に処理を行う
				mType = getModuleDataType(iterable_element.getSwDataDefProps().getImplementationDataType());
			} else {
				String nativeName = iterable_element.getSwDataDefProps().getBaseType().getNativeDeclaration();
				mType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), EObjectConditions.hasAttr(TYPE__SYMBOL_NAME, nativeName));
			}
			member.setType(mType);
			type.getMember().add(member);
		}
		return type;
	}
	
	private UnionType createUnionType(ImplementationDataType sourceDataType) throws ModelException {
		UnionType type = ModuleFactory.eINSTANCE.createUnionType();
		type.setSymbolName(sourceDataType.getShortName());
		type.setSingleSource(sourceDataType);

		for (ImplementationDataTypeElement iterable_element : sourceDataType.getSubElement()) {
			UnionMember member = ModuleFactory.eINSTANCE.createUnionMember();
			member.setMemberName(iterable_element.getShortName());

			Type mType;
			if ("TYPE_REFERENCE".equals(iterable_element.getCategory())) {
				// CategoryがTYPE_REFERENCEの場合、再帰的に処理を行う
				mType = getModuleDataType(iterable_element.getSwDataDefProps().getImplementationDataType());
			} else {
				String nativeName = iterable_element.getSwDataDefProps().getBaseType().getNativeDeclaration();
				mType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), EObjectConditions.hasAttr(TYPE__SYMBOL_NAME, nativeName));
			}
			member.setType(mType);
			type.getMember().add(member);
		}
		return type;
	}
	
	private void buildApiConstants() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();

			// 初期値定数の構築
			for (PPortPrototype portPrototype : swComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						Type type = this.context.builtQuery.findType(dataInstanceInSwc);
						if (type instanceof PrimitiveType || type instanceof PointerType) {
							targetSwc.getApiInitValueConstant().add(createApiInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
						}
					}
				}
			}
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						Type type = this.context.builtQuery.findType(dataInstanceInSwc);
						if (type instanceof PrimitiveType || type instanceof PointerType) {
							targetSwc.getApiInitValueConstant().add(createApiInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
						}
					}
				}
			}

			// 上限値，および下限値定数の構築
			for (ApplicationDataType sourceApplicationDataType : this.context.query.select(swComponentType.getUsingApplicationDataTypes(),
					hasOp(APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE, true))) {
				buildUpperLowerLimitConstant(targetSwc, sourceApplicationDataType, swComponentType);
			}

			// 列挙値定数の構築
			for (AutosarDataType sourceDataType : swComponentType.getUsingDataTypes()) {
				ApplicationDataType sourceApplicationDataType;
				ImplementationDataType sourceImplementationDataType;
				if (sourceDataType instanceof ApplicationDataType) {
					sourceApplicationDataType = (ApplicationDataType) sourceDataType;
					sourceImplementationDataType = swComponentType.getImplementationDataType(sourceApplicationDataType);
				} else {
					sourceApplicationDataType = null;
					sourceImplementationDataType = (ImplementationDataType) sourceDataType;
				}

				if (this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE, sourceApplicationDataType)) {
					CompuMethod sourceCompuMethod = this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE,
							sourceApplicationDataType);
					buildEnumConstant(targetSwc, sourceImplementationDataType, sourceCompuMethod, swComponentType);
				}
			}

			// アプリケーションエラー定数の構築
			targetSwc.getApiApplicationErrorConstant().addAll(createApplicationErrorConstants(swComponentType));
		}
	}

	private Constant createIrvInitValueConstant(VariableDataPrototype dataPrototype, AtomicSwComponentType swComponentType) throws ModelException {
		Type type = this.context.builtQuery.findType((ImplementationDataType)dataPrototype.getType());
		ValueSpecification initValue = dataPrototype.getInitValue();

		// 初期値定数の生成
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSingleSource(dataPrototype);
		initValueConstant.setRoleName(RoleNames.INIT_VALUE);
		initValueConstant.setSymbolName(SymbolNames.createRteIrvBufferInitValueConstantName(swComponentType, dataPrototype));
		initValueConstant.setType(type);

		this.localSymbolModelBuilder.setupConstant(initValueConstant, type, initValue);
		return initValueConstant;
	}

	private Constant createCsOpidValueConstant(ROperationInstanceInSwc operationInstanceInSwc, int idx) throws ModelException {
		// 初期値定数の生成
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setRoleName(RoleNames.INIT_VALUE);
		initValueConstant.setSymbolName(SymbolNames.createCallOpidName(operationInstanceInSwc));
		initValueConstant.setValue(String.valueOf(idx));
		return initValueConstant;
	}
	
	private Constant createApiInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createInitValueConstantName(sourceDataInstanceInSwc), RoleNames.INIT_VALUE);
	}

	private List<Constant> createApplicationErrorConstants(AtomicSwComponentType sourceSwComponentType) {
		// アプリケーションエラー定数の構築
		List<Constant> applicationErrorConstants = Lists.newArrayList();
		for (ClientServerInterface clientServerInterface : sourceSwComponentType.getUsingClientServerInterfaces()) {
			for (ApplicationError applicationError : clientServerInterface.getPossibleError()) {
				// アプリケーションエラー定数の生成
				applicationErrorConstants.add(createApplicationErrorConstant(applicationError));
			}
		}

		// アプリケーションエラーの正規化（シンボル名の重複する定数を除外する）
		List<Constant> normalizedApplicationErrorConstants = Lists.newArrayList();

		ListMultimap<String, Constant> symbolName2ConstantMap = this.context.query.groupByKey(applicationErrorConstants, CONSTANT__SYMBOL_NAME);
		for (String keySymbolName : symbolName2ConstantMap.keys()) {
			List<Constant> constants = symbolName2ConstantMap.get(keySymbolName);

			Constant firstConstant = constants.get(0);
			for (Constant anotherConstant : constants.subList(1, constants.size())) {
				firstConstant.getSource().addAll(anotherConstant.getSource());
			}
			normalizedApplicationErrorConstants.add(firstConstant);
		}
		return normalizedApplicationErrorConstants;
	}

	private Constant createApplicationErrorConstant(ApplicationError sourceApplicationError) {
		Constant applicationErrorConstant = ModuleFactory.eINSTANCE.createConstant();
		applicationErrorConstant.setSymbolName(SymbolNames.createApplicationErrorConstantName(sourceApplicationError));
		applicationErrorConstant.setType(this.context.cache.stdReturnType);
		applicationErrorConstant.setValue(String.valueOf(sourceApplicationError.getErrorCode()));
		return applicationErrorConstant;
	}

	private Constant createInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification initValueInSwc, String symbolName, String roleName) throws ModelException {
		Type type = this.context.builtQuery.findType(sourceDataInstanceInSwc);

		ValueSpecification initValue;
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) {
			initValue = initValueInSwc;
		} else {
			initValue = this.context.query.get(sourceDataInstanceInSwc.getInstance().get(0), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		}

		// 初期値定数の生成
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSingleSource(sourceDataInstanceInSwc);
		initValueConstant.setRoleName(roleName);
		initValueConstant.setSymbolName(symbolName);
		initValueConstant.setType(type);

		this.localSymbolModelBuilder.setupConstant(initValueConstant, type, initValue);
		return initValueConstant;
	}

	private Constant createProxyFunctionIndexConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, String symbolName) throws ModelException {
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSingleSource(sourceDataInstanceInSwc);
		initValueConstant.setSymbolName(symbolName);
		return initValueConstant;
	}
	
	private void buildUpperLowerLimitConstant(Swc targetSwc, ApplicationDataType sourceApplicationDataType, AtomicSwComponentType swComponentType) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, swComponentType.getImplementationDataType(sourceApplicationDataType));
		List<IncludedDataTypeSet> includedDataTypeSets = swComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(sourceApplicationDataType);
		Set<String> literalPrefixes = Sets.newHashSet(this.context.query.<String> collect(includedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));

		// 上限値，下限値の生成
		if (literalPrefixes.isEmpty()) {
			buildUpperLowerLimitConstant(targetSwc, null, sourceApplicationDataType, type);
		} else {
			for (String literalPrefix : literalPrefixes) {
				buildUpperLowerLimitConstant(targetSwc, literalPrefix, sourceApplicationDataType, type);
			}
		}
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, String sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		targetSwc.getApiUpperLowerLimitConstant().add(createUpperLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
		targetSwc.getApiUpperLowerLimitConstant().add(createLowerLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
	}

	private Constant createLowerLimitConstant(String sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant lowerLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		lowerLimitConstant.setSymbolName(SymbolNames.createLowerLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		lowerLimitConstant.setType(type);
		lowerLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getLowerLimitValue());
		return lowerLimitConstant;
	}

	private Constant createUpperLimitConstant(String sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant upperLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		upperLimitConstant.setSymbolName(SymbolNames.createUpperLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		upperLimitConstant.setType(type);
		upperLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getUpperLimitValue());
		return upperLimitConstant;
	}

	private void buildEnumConstant(Swc targetSwc, ImplementationDataType implementationDataType, CompuMethod sourceCompuMethod, AtomicSwComponentType swComponentType) throws ModelException {
		// 上限値，下限値の生成
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, implementationDataType);
		List<IncludedDataTypeSet> includedDataTypeSets = swComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(implementationDataType);
		Set<String> literalPrefixes = Sets.newHashSet(this.context.query.<String> collect(includedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));

		if (literalPrefixes.isEmpty()) {
			for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
				if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
					targetSwc.getApiEnumConstant().add(createEnumConstant(null, sourceCompuScale, type));
				}
			}
		} else {
			for (String literalPrefix : literalPrefixes) {
				for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
					if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
						targetSwc.getApiEnumConstant().add(createEnumConstant(literalPrefix, sourceCompuScale, type));
					}
				}
			}
		}
	}

	private Constant createEnumConstant(String sourceLiteralPrefix, CompuScale sourceCompuScale, PrimitiveType type) throws ModelException {
		String enumLiteral = this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE);

		Constant lowerLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		lowerLimitConstant.setSymbolName(SymbolNames.createEnumConstantName(sourceLiteralPrefix, enumLiteral));
		lowerLimitConstant.setType(type);
		lowerLimitConstant.setValue(sourceCompuScale.getLowerLimit().getValue());
		return lowerLimitConstant;
	}

	public void buildImplSymbols() throws ModelException {
		buildOsTrustedMacros();
		buildRteTrustedFunctionParamTypes(this.context.cache.rte);
		buildComTrustedFunctionParamTypes(this.context.cache.rte);
		buildSwcImplConstants();
		buildRteBufferSymbols();
		buildRteIrvBufferSymbols();
		buildFilterSymbols();
		buildEntityStartSymbols();
		buildFunctionMacroSymbols();
		buildComVariableSymbols();
		buildCsSymbols();
		buildModeSymbols();
	}

	private void buildOsTrustedMacros() throws ModelException {
		for (EcucPartition sourceEcucPartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(sourceEcucPartition);

			targetPartition.setOsTrustedMacro(createOsTrustedMacro(sourceEcucPartition));
		}
	}

	private Macro createOsTrustedMacro(EcucPartition sourceEcucPartition) {
		Macro macro = ModuleFactory.eINSTANCE.createMacro();
		macro.setSingleSource(sourceEcucPartition);
		macro.setSymbolName(sourceEcucPartition.isTrusted() ? SymbolNames.OS_TRUSTED_MACRO : SymbolNames.OS_NON_TRUSTED_MACRO);
		return macro;
	}

	private void buildComTrustedFunctionParamTypes(Rte targetRte) {
		this.context.cache.comSendSignalTrustedFunctionParamType = Optional.absent();
		this.context.cache.comSendSignalGroupTrustedFunctionParamType = Optional.absent();
		Optional<TrustedFunctionComSendImplementation> imp = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (imp.isPresent()) {
			createComSendTrustedFunctionParamType(targetRte, false);
		}
		imp = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (imp.isPresent()) {
			createComSendTrustedFunctionParamType(targetRte, true);
		}
	}

	private void buildRteTrustedFunctionParamTypes(Rte targetRte) {
		if (!this.context.query.findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION).isEmpty()) {
			RteSendTrustedFunctionParamType type = ModuleFactory.eINSTANCE.createRteSendTrustedFunctionParamType();
			targetRte.getRteType().add(type);
			type.setSymbolName(SymbolNames.RTE_SEND_SIGNAL_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
			type.setIsGroup(true);
		}
	}

	
	private void createComSendTrustedFunctionParamType(Rte targetRte, boolean isForSignalGroup) {
		ComSendTrustedFunctionParamType type = ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType();
		if (isForSignalGroup) {
			type.setSymbolName(SymbolNames.COM_SEND_GROUP_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
			type.setIsGroup(true);
			this.context.cache.comSendSignalGroupTrustedFunctionParamType = Optional.of(type);
		} else {
			type.setSymbolName(SymbolNames.COM_SEND_SIGNAL_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
			type.setIsGroup(false);
			this.context.cache.comSendSignalTrustedFunctionParamType = Optional.of(type);
		}
		targetRte.getRteType().add(type);
	}

	private void buildSwcImplConstants() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					// 無効値定数の構築
					if (dataInstanceInSwc.isInvalidationEnabled()) {
						buildInvalidValueConstant(targetSwc, dataInstanceInSwc);
					}

					// RTE実装向け初期値定数の構築
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getImplInitValueConstant().add(createImplInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
					}

					// フィルタ定数の構築
					if (dataInstanceInSwc.isFilterEnabled()) {
						buildFilterConstant(targetSwc, dataInstanceInSwc);
					}
				}
			}

			for (PPortPrototype portPrototype : swComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					// 無効値定数の構築
					if (dataInstanceInSwc.isInvalidationEnabled()) {
						buildInvalidValueConstant(targetSwc, dataInstanceInSwc);
					}

					// RTE実装向け初期値定数の構築
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getImplInitValueConstant().add(createImplInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
					}
				}

				// ポート定義引数の構築
				if (!portPrototype.getPortApiOption().isEmpty()) {
					PortApiOption portApiOption = portPrototype.getPortApiOption().get(0);
					buildPortArgValueConstants(targetSwc, portApiOption);
				}
			}
		}
	}

	private Constant createImplInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createImplInitValueConstantName(sourceDataInstanceInSwc), RoleNames.IMPL_INIT_VALUE);
	}

	private void buildInvalidValueConstant(Swc targetSwc, VariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Type type = this.context.builtQuery.findType(sourceDataInstanceInSwc);
		ValueSpecification invalidValue = sourceDataInstanceInSwc.getInvalidValue();

		// 無効値定数の生成
		Constant invalidValueConstant = ModuleFactory.eINSTANCE.createConstant();
		invalidValueConstant.setSingleSource(sourceDataInstanceInSwc);
		invalidValueConstant.setRoleName(RoleNames.INVALID_VALUE);
		invalidValueConstant.setSymbolName(SymbolNames.createInvalidValueConstantName(sourceDataInstanceInSwc));
		invalidValueConstant.setType(type);
		invalidValueConstant.setValue(EmfUtils.<String> exInvoke(invalidValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));

		this.localSymbolModelBuilder.setConstantType(invalidValue, invalidValueConstant);
		targetSwc.getInvalidValueConstant().add(invalidValueConstant);
	}

	private void buildPortArgValueConstants(Swc targetSwc, PortApiOption sourcePortApiOption) throws ModelException {
		Partition partition = targetSwc.getParent();
		int i = 0;
		for (PortDefinedArgumentValue argumentValue : sourcePortApiOption.getPortArgValue()) {
			Constant portArgValueConstant = createPortArgValueConstant(argumentValue, i);
			targetSwc.getPortArgValueConstant().add(portArgValueConstant);
			GlobalVariable argumentVariable = createPortArgValueVariable(partition, argumentValue, i, portArgValueConstant);
			if (argumentVariable != null) {
				partition.getRteInternalVariable().add(argumentVariable);
				portArgValueConstant.setSingleSource(null);	// queryで取得するとき、変数のほうを取得させる
			}
			i++;
		}
	}

	private GlobalVariable createPortArgValueVariable(Partition partition, PortDefinedArgumentValue argumentValue, int index, Constant portArgValueConstant)
			throws ModelException {
		GlobalVariable argumentVariable = null;
		if (!portArgValueConstant.getMember().isEmpty()) {
			String symbol = SymbolNames.createPortArgValueVariableName(argumentValue, index);
			Type type = this.context.builtQuery.findType(argumentValue.getValueType());
			argumentVariable = createGlobalVariable(symbol, type, portArgValueConstant, true);
			argumentVariable.setSingleSource(argumentValue);
			argumentVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) partition.getSingleSource())));
			argumentVariable.setHasConst(true);
			argumentVariable.setHasStatic(false);
			argumentVariable.setInitValueConstant(portArgValueConstant);
		}

		return argumentVariable;
	}

	private Constant createPortArgValueConstant(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSingleSource(sourcePortDefinedArgumentValue);
		constant.setSymbolName(SymbolNames.createPortArgValueConstantName(sourcePortDefinedArgumentValue, index));
		Type type = this.context.builtQuery.findType(sourcePortDefinedArgumentValue.getValueType());
		constant.setType(type);
		this.localSymbolModelBuilder.setupConstant(constant, type, sourcePortDefinedArgumentValue.getValue());
		return constant;
	}

	private void buildFilterConstant(Swc targetSwc, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		switch (sourceDataInstanceInSwc.getFilter().getDataFilterType()) {
		case MASKED_NEW_DIFFERS_MASKED_OLD: {
			targetSwc.getFilterConstant().add(createFilterMaskConstant(sourceDataInstanceInSwc));
			break;
		}
		case MASKED_NEW_DIFFERS_X:
		case MASKED_NEW_EQUALS_X: {
			targetSwc.getFilterConstant().add(createFilterMaskConstant(sourceDataInstanceInSwc));
			targetSwc.getFilterConstant().add(createFilterXConstant(sourceDataInstanceInSwc));
			break;
		}
		case NEW_IS_OUTSIDE:
		case NEW_IS_WITHIN: {
			targetSwc.getFilterConstant().add(createFilterMinConstant(sourceDataInstanceInSwc));
			targetSwc.getFilterConstant().add(createFilterMaxConstant(sourceDataInstanceInSwc));
			break;
		}
		case ONE_EVERY_N: {
			targetSwc.getFilterConstant().add(createFilterPeriodConstant(sourceDataInstanceInSwc));
			targetSwc.getFilterConstant().add(createFilterOffsetConstant(sourceDataInstanceInSwc));
			break;
		}
		case ALWAYS:
		case NEVER:
		default:
			break;
		}
	}

	private Constant createFilterMaskConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterMaskConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMask()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_MASK_ROLE_NAME);
		return constant;
	}

	private Constant createFilterXConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterXConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getX()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_X_ROLE_NAME);
		return constant;
	}

	private Constant createFilterMinConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterMinConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMin()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_MIN_ROLE_NAME);
		return constant;
	}

	private Constant createFilterMaxConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterMaxConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMax()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_MAX_ROLE_NAME);
		return constant;
	}

	private Constant createFilterPeriodConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceDataInstanceInSwc.getFilter().getPeriod());
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterPeriodConstantName(sourceDataInstanceInSwc));
		constant.setType(type);
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getPeriod()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_PERIOD_ROLE_NAME);
		return constant;
	}

	private Constant createFilterOffsetConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceDataInstanceInSwc.getFilter().getPeriod());
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterOffsetConstantName(sourceDataInstanceInSwc));
		constant.setType(type);
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getOffset()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_OFFSET_ROLE_NAME);
		return constant;
	}

	private void buildRteBufferSymbols() throws ModelException {

		EList<RteBufferQueueType> rteBufferQueueTypeList = new BasicEList<RteBufferQueueType>();
		for (RteValueBufferImplementation sourceValueBufferImplementation : this.context.query.<RteValueBufferImplementation> findByKind(RTE_VALUE_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(sourceValueBufferImplementation.getOwnerPartition());

			InternalEcuReceiver receiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			if (receiver.getSource().getPrototype().isEventSemantics()) {
				Constant maxLengthConstant = createRteBufferQueueMaxLengthConstant(sourceValueBufferImplementation, receiver);
				this.context.cache.rte.getRteTypeConstant().add(maxLengthConstant);

				RteBufferQueueType queueType = createRteBufferQueueType(sourceValueBufferImplementation, receiver, maxLengthConstant);
				rteBufferQueueTypeList.add(queueType);

				RteBufferQueuedVariable queuedVariable = createRteBufferQueuedVariable(sourceValueBufferImplementation, receiver, queueType);
				queuedVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
				targetPartition.getRteBufferQueuedVariable().add(queuedVariable);
			} else {
				buildRteBufferVariableSet(targetPartition, sourceValueBufferImplementation, receiver);
			}
		}

		// RteBufferQueueTypeはソート
		if (rteBufferQueueTypeList.size() > 0) {
			Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(TYPE__SYMBOL_NAME));
			ECollections.sort(rteBufferQueueTypeList, ordering);
			this.context.cache.rte.getRteType().addAll(rteBufferQueueTypeList);			
		}
		
		if (isCallBack()) {
			Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			for (ComSignalGroup signalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
				List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
				if (dataInstanceInCompositionList.isEmpty()) {
					continue;
				}
				Type type = this.context.builtQuery.findType(dataInstanceInCompositionList.get(0).getPrototype());
				if (!(type instanceof PrimitiveType)) { // COVERAGE 常にtrue(現状，ComSingnalGroupでPrimitiveTypeとなるパターンが存在しないため)
					RteBufferVariableSet rteBuffer = createRteBufferComplexVariableSet(signalGroup, dataInstanceInCompositionList.get(0), type, masterBswPartition);
					Partition targetPartition = this.context.builtQuery.findPartition(masterBswPartition.get());
					targetPartition.getRteBufferVariableSet().add(rteBuffer);
				}
			}
			for (ComSignal signal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
				List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
				if (dataInstanceInCompositionList.isEmpty()) {
					continue;
				}
				Type type = this.context.builtQuery.findType(dataInstanceInCompositionList.get(0).getPrototype());
				if (!(type instanceof PrimitiveType)) {
					RteBufferVariableSet rteBuffer = createRteBufferComplexVariableSet(signal, dataInstanceInCompositionList.get(0), type, masterBswPartition);
					Partition targetPartition = this.context.builtQuery.findPartition(masterBswPartition.get());
					targetPartition.getRteBufferVariableSet().add(rteBuffer);
				}
			}
		}
	}
	
	private RteBufferVariableSet createRteBufferComplexVariableSet(EcucReferrable signal, VariableDataInstanceInComposition dataInstanceInComposition, Type type, Optional<EcucPartition> masterBswPartition) throws ModelException {
		RteBufferVariableSet rteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		GlobalVariable complexVariable = createRteBufferComplexVariable(signal, type);
		complexVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(masterBswPartition.get()), dataInstanceInComposition));
		rteBuffer.setComplexVariable(complexVariable);
		rteBuffer.setHasConst(false);
		rteBuffer.setHasStatic(false);
		return rteBuffer;
	}

	private void buildRteIrvBufferSymbols() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();
			Partition partition = targetSwc.getParent();

			if (swComponentType.getInternalBehavior() == null) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				continue;
			}
			// IRVの初期値
			for (VariableDataPrototype dataPrototype : swComponentType.getInternalBehavior().getExplicitInterRunnableVariable()) {
				Constant initValueConstant = createIrvInitValueConstant(dataPrototype, swComponentType);
				partition.getRteBufferInitValueConstant().add(initValueConstant);
				partition.getRteBufferVariableSet().add(createRteIrvBufferVariableSet(partition, swComponentType, dataPrototype, initValueConstant));
			}
		}
	}

	private void buildCsSymbols() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Swc targetSwc = optionalSwc.get();
			Partition partition = targetSwc.getParent();
			
			if (swComponentType.getInternalBehavior() == null) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				continue;
			}

			// 受信側APIの構築
			boolean clientTrustedFlag = false;
			int idx = 0;
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (ROperationInstanceInSwc operationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(operationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Swc pTargetSwc = getPSwc(operationInstanceInSwc);
						if (pTargetSwc == null) continue;
						EcucPartition ecucPartition = (EcucPartition)targetSwc.getParent().getSingleSource();
						EcucPartition pEcucPartition = (EcucPartition)pTargetSwc.getParent().getSingleSource();
						 // COVERAGE (ecucPartitionがnullのときはpEcucPartitionもnullであるためカバレッジがパスしない．コードレビューで問題ないことを確認)
						if (ecucPartition == null || pEcucPartition == null) continue;
						if (!ecucPartition.isTrusted() && pEcucPartition.isTrusted()) {
							// 送信：非信頼、受信：信頼の場合、信頼関数使用
							if (!clientTrustedFlag) {
								ComCsTrustedFunctionParamType comCsTrustedFunctionParamType = createComCsTrustedFunctionParamType(operationInstanceInSwc);
								this.context.cache.rte.getRteType().add(comCsTrustedFunctionParamType);
								clientTrustedFlag = true;
							}
							
							Constant opidValueConstant = createCsOpidValueConstant(operationInstanceInSwc, idx);
							partition.getRteBufferInitValueConstant().add(opidValueConstant);
						}
					}
					idx++;
				}
			}
		}
	}
	
	private Swc getPSwc(ROperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return null;
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc providedOperationInstanceInSwc = (POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype();
		SwComponentType swType = providedOperationInstanceInSwc.getOwnerAtomicSwc();
		return this.context.builtQuery.findDest(SWC, swType);
	}

	private RteBufferVariableSet createRteIrvBufferVariableSet(Partition partition, AtomicSwComponentType swComponentType, VariableDataPrototype dataPrototype, Constant initValueConstant)
			throws ModelException {
		boolean initAtDefinition = EmfUtils.<Boolean> exInvoke(dataPrototype, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE);

		RteBufferVariableSet rteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		rteBuffer.setSingleSource(dataPrototype);
		rteBuffer.setHasConst(false);
		rteBuffer.setHasStatic(false);
		 // NOTE C言語上には現れない仮想シンボルだが，ソートの都合上シンボル名を設定しておく
		rteBuffer.setSymbolName(SymbolNames.createRteIrvBufferVariableName(swComponentType, dataPrototype));

		Type type = this.context.builtQuery.findType(dataPrototype.getImplementationDataType());
		String bufferSymbol = SymbolNames.createRteIrvBufferValueVariableName(swComponentType, dataPrototype);
		GlobalVariable valueVariable = createGlobalVariable(bufferSymbol, type, initValueConstant, initAtDefinition);
		valueVariable.setSingleSource(dataPrototype);
		valueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable((EcucPartition) partition.getSingleSource()), dataPrototype));
		rteBuffer.setValueVariable(valueVariable);
		
		if (!initValueConstant.getMember().isEmpty()) {
			String bufferInitSymbol = SymbolNames.createRteIrvBufferInitValueVariableName(swComponentType, dataPrototype);
			GlobalVariable initValueVariable = createGlobalVariable(bufferInitSymbol, type, initValueConstant, true);
			initValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable((EcucPartition) partition.getSingleSource()), dataPrototype));
			initValueVariable.setHasConst(true);
			initValueVariable.setHasStatic(false);
			initValueConstant.setRepresentedVariableName(initValueVariable.getSymbolName());
			rteBuffer.setInitValueVariable(initValueVariable);
		}

		return rteBuffer;
	}

	private void buildFilterSymbols() throws ModelException {
		for (FilterBufferImplementation filterBufferImplementation : this.context.query.<FilterBufferImplementation> findByKind(FILTER_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(filterBufferImplementation.getOwnerPartition());
			buildFilterVariable(targetPartition, filterBufferImplementation);
		}
	}

	private void buildRteBufferVariableSet(Partition targetPartition, RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver) throws ModelException {
		Type type = this.context.builtQuery.findType(receiver.getSource().getPrototype());

		// RTEバッファの初期値定数の構築
		Constant initValueConstant = createRteBufferInitValueConstant(sourceValueBufferImplementation, receiver, type);
		targetPartition.getRteBufferInitValueConstant().add(initValueConstant);

		// RTEバッファの構築
		targetPartition.getRteBufferVariableSet().add(createRteBufferVariableSet(sourceValueBufferImplementation, receiver, type, initValueConstant));
	}

	private RteBufferVariableSet createRteBufferVariableSet(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Type type, Constant initValueConstant)
			throws ModelException {
		boolean initAtDefinition = EmfUtils.<Boolean> exInvoke(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION);

		RteBufferVariableSet rteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		rteBuffer.setSingleSource(sourceValueBufferImplementation);
		rteBuffer.setHasConst(false);
		rteBuffer.setHasStatic(false);
		 // NOTE C言語上には現れない仮想シンボルだが，ソートの都合上シンボル名を設定しておく
		rteBuffer.setSymbolName(SymbolNames.createRteBufferVariableName(receiver.getSource()));

		GlobalVariable valueVariable = createRteBufferValueVariable(sourceValueBufferImplementation, receiver, type, initValueConstant, initAtDefinition);
	
		valueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
		rteBuffer.setValueVariable(valueVariable);
		
		if (sourceValueBufferImplementation.getHasStatus()) {
			GlobalVariable statusVariable = createRteBufferStatusVariable(sourceValueBufferImplementation, receiver, initAtDefinition);
			statusVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition())));
			rteBuffer.setStatusVariable(statusVariable);
		}
		
		if (!initValueConstant.getMember().isEmpty()) {
			GlobalVariable initValueVariable = createRteBufferInitValueVariable(sourceValueBufferImplementation, receiver, type, initValueConstant);
			initValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
			initValueVariable.setHasConst(true);
			initValueVariable.setHasStatic(false);
			initValueConstant.setRepresentedVariableName(initValueVariable.getSymbolName());
			rteBuffer.setInitValueVariable(initValueVariable);
		}

		return rteBuffer;
	}

	private boolean isCallBack() throws ModelException {
		for (ExternalEcuSender sourceExternalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			return this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER);
		}		
		return false;
	}
	
	private Constant createRteBufferInitValueConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Type type) throws ModelException {
		ValueSpecification initValue = this.context.query.get(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);

		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSingleSource(sourceValueBufferImplementation);
		String symbolName = SymbolNames.createRteBufferInitValueConstantName(receiver.getSource());
		initValueConstant.setSymbolName(symbolName);
		initValueConstant.setType(type);

		this.localSymbolModelBuilder.setupConstant(initValueConstant, type, initValue);
		return initValueConstant;
	}

	private GlobalVariable createRteBufferValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Type type, Constant initValueConstant,
			boolean initAtDefinition) throws ModelException {
		GlobalVariable valueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		valueVariable.setSymbolName(SymbolNames.createRteBufferValueVariableName(receiver.getSource()));
		valueVariable.setHasConst(false);
		valueVariable.setHasStatic(false);
		valueVariable.setType(type);
		valueVariable.setInitValueConstant(initValueConstant);
		valueVariable.setInitAtDefinition(initAtDefinition);
		return valueVariable;
	}

	private GlobalVariable createRteBufferInitValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Type type, Constant initValueConstant) throws ModelException {
		GlobalVariable valueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		valueVariable.setSymbolName(SymbolNames.createRteBufferInitValueVariableName(receiver.getSource()));
		valueVariable.setHasConst(false);
		valueVariable.setHasStatic(false);
		valueVariable.setType(type);
		valueVariable.setInitValueConstant(initValueConstant);
		valueVariable.setInitAtDefinition(true);
		return valueVariable;
	}
	
	private GlobalVariable createRteBufferComplexVariable(EcucReferrable signalGroup, Type type) throws ModelException {
		GlobalVariable valueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		valueVariable.setSymbolName(SymbolNames.createBufferComValueComplexDataName(signalGroup));
		valueVariable.setType(type);
		valueVariable.setHasStatic(false);
		valueVariable.setHasConst(false);
		return valueVariable;
	}
	
	private GlobalVariable createRteBufferStatusVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, boolean initAtDefinition) throws ModelException {
		GlobalVariable statusVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		statusVariable.setSymbolName(SymbolNames.createRteBufferStatusVariableName(receiver.getSource()));
		statusVariable.setHasConst(false);
		statusVariable.setHasStatic(false);
		statusVariable.setType(this.context.cache.stdReturnType);
		statusVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		statusVariable.setInitAtDefinition(initAtDefinition);
		return statusVariable;
	}

	private RteBufferQueueType createRteBufferQueueType(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Constant maxLengthConstant) throws ModelException {
		RteBufferQueueType queuedVariable = ModuleFactory.eINSTANCE.createRteBufferQueueType();
		queuedVariable.setSingleSource(sourceValueBufferImplementation);
		queuedVariable.setSymbolName(SymbolNames.createRteBufferQueueTypeName(receiver.getSource()));
		queuedVariable.setElementType(this.context.builtQuery.findType(receiver.getSource().getPrototype()));			
		queuedVariable.setMaxLengthConstant(maxLengthConstant);
		return queuedVariable;
	}

	private ComCsTrustedFunctionParamType createComCsTrustedFunctionParamType(ROperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		ComCsTrustedFunctionParamType queuedVariable = ModuleFactory.eINSTANCE.createComCsTrustedFunctionParamType();
		queuedVariable.setSymbolName(SymbolNames.createRteCsArgsTrustedFunctionParamName(operationInstanceInSwc));
		return queuedVariable;
	}
	
	private RteBufferQueuedVariable createRteBufferQueuedVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, RteBufferQueueType queueType)
			throws ModelException {
		RteBufferQueuedVariable queuedVariable = ModuleFactory.eINSTANCE.createRteBufferQueuedVariable();
		queuedVariable.setSingleSource(sourceValueBufferImplementation);
		queuedVariable.setSymbolName(SymbolNames.createRteBufferQueuedVariableName(receiver.getSource()));
		queuedVariable.setType(queueType);
		queuedVariable.setHasConst(false);
		queuedVariable.setHasStatic(false);

		queuedVariable.setInitAtDefinition(EmfUtils.<Boolean> exInvoke(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION));
		return queuedVariable;
	}

	private Constant createRteBufferQueueMaxLengthConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver) {
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		Constant maxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		maxLengthConstant.setSymbolName(SymbolNames.createRteBufferQueuedVariableMaxLengthConstantName(receiver.getSource()));
		maxLengthConstant.setType(this.context.cache.uint32Type);
		maxLengthConstant.setValue(String.valueOf(dataInstanceInSwc.getQueueLength()));
		maxLengthConstant.setSingleSource(sourceValueBufferImplementation);
		return maxLengthConstant;
	}

	private GlobalVariable createGlobalVariable(String symbol, Type type, Constant initValueConstant, boolean initAtDefinition) {
		GlobalVariable valueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		valueVariable.setSymbolName(symbol);
		valueVariable.setType(type);
		valueVariable.setInitValueConstant(initValueConstant);
		valueVariable.setInitAtDefinition(initAtDefinition);
		valueVariable.setHasStatic(false);
		valueVariable.setHasConst(false);
		return valueVariable;
	}

	private void buildFilterVariable(Partition ownerPartition, FilterBufferImplementation filterBufferImplementation) throws ModelException {
		InternalEcuReceiver receiver = filterBufferImplementation.getParent().getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstance = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		// フィルタバッファの生成
		if (this.context.query.get(dataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC)) {
			// フィルタ過去値バッファの生成
			PrimitiveType type = this.context.builtQuery.findPrimitiveType(dataInstance);

			GlobalVariable filterVariable = createFilterOldValueVariable(filterBufferImplementation, receiver, type);
			ownerPartition.getFilterOldValueVariable().add(filterVariable);
		} else {
			// フィルタ回数バッファの生成
			PrimitiveType type = this.context.builtQuery.getAppropriateType(dataInstance.getFilter().getPeriod());

			Constant filterOccurrenceInitValue = createFilterOccurrenceInitValueConstant(filterBufferImplementation, receiver, dataInstance, type);
			ownerPartition.getFilterConstant().add(filterOccurrenceInitValue);

			GlobalVariable filterVariable = createFilterOccurrenceVariable(filterBufferImplementation, receiver, type, filterOccurrenceInitValue);
			ownerPartition.getFilterOccurrenceVariable().add(filterVariable);
		}
	}

	private Constant createFilterOccurrenceInitValueConstant(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver receiver, RVariableDataInstanceInSwc dataInstanceInSwc,
			PrimitiveType type) {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSingleSource(sourceFilterBufferImplementation);
		constant.setSymbolName(SymbolNames.createFilterOccurrenceInitValueConstantName(receiver.getSource()));
		constant.setType(type);
		constant.setValue("0");
		return constant;
	}

	private GlobalVariable createFilterOccurrenceVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type,
			Constant filterOccurrenceInitValue) throws ModelException {
		GlobalVariable filterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		filterVariable.setSingleSource(sourceFilterBufferImplementation);
		filterVariable.setSymbolName(SymbolNames.createFilterOccurrenceVariableName(receiver.getSource()));
		filterVariable.setType(type);
		filterVariable.setInitValueConstant(filterOccurrenceInitValue);
		filterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		filterVariable.setHasStatic(false);
		filterVariable.setHasConst(false);
		return filterVariable;
	}

	private GlobalVariable createFilterOldValueVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceFilterBufferImplementation.getParent().getValueBufferImplementation());

		GlobalVariable filterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		filterVariable.setSymbolName(SymbolNames.createFilterOldValueVariableName(receiver.getSource()));
		filterVariable.setType(type);
		filterVariable.setSingleSource(sourceFilterBufferImplementation);
		filterVariable.setInitValueConstant(initValueConstant);
		filterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		filterVariable.setHasStatic(false);
		filterVariable.setHasConst(false);
		return filterVariable;
	}

	private void buildEntityStartSymbols() throws ModelException {
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			EcucPartition ecucPartition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);
			Partition targetPartition = this.context.builtQuery.findPartition(ecucPartition);

			Optional<OsTaskActivateEntityStarter> osTaskActivateEntityStarter = this.context.query.tryFindSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
			List<OsEventSetEntityStarter> osEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

			if (osTaskActivateEntityStarter.isPresent()) {
				// ランナブル起動についてのグローバル変数，および定数を生成
				buildEntityStartStaticSymbols(targetPartition, osTaskActivateEntityStarter.get(), sourceOsTask, null);

			} else if (!osEventSetEntityStarters.isEmpty()) {
				// ランナブル起動についてのグローバル変数，および定数を生成
				for (OsEventSetEntityStarter sourceEntityStarter : osEventSetEntityStarters) {
					buildEntityStartStaticSymbols(targetPartition, sourceEntityStarter, sourceOsTask, sourceEntityStarter.getSourceOsEvent());
				}
			}
		}
	}

	private void buildEntityStartStaticSymbols(Partition targetPartition, EntityStarter sourceEntityStarter, OsTask osTask, OsEvent osEvent) throws ModelException {
		// 周期調整カウンタ変数の構築
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceEntityStarter.getCycleCounterImplementation().getMaxCount());

			targetPartition.getEntityStartConstant().add(createEntityCycleMaxConstant(sourceEntityStarter.getCycleCounterImplementation(), osTask, osEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityCycleCounterVariable(sourceEntityStarter.getCycleCounterImplementation(), osTask, osEvent, type));
		}

		// 開始オフセット調整カウンタ変数の構築
		if (sourceEntityStarter.getStartOffsetCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceEntityStarter.getStartOffsetCounterImplementation().getMaxCount());

			targetPartition.getEntityStartConstant().add(createEntityStartOffsetMaxConstant(sourceEntityStarter.getStartOffsetCounterImplementation(), osTask, osEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityStartOffsetCounterVariable(sourceEntityStarter.getStartOffsetCounterImplementation(), osTask, osEvent, type));
		}

		// エクスキュータブル起動処理の構築
		for (EntityStartInteraction sourceStartInteraction : sourceEntityStarter.getStartInteraction()) {
			if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE 常にtrue(現状，EntityStartImplementationはTimingTriggeringEntityStartImplementationのみのため)
				TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();

				if (timingTriggeringEntityStartImplementation.requiresCycleAdjust()) {
					GlobalVariable cycleCounterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceEntityStarter.getCycleCounterImplementation());

					targetPartition.getEntityStartConstant().add(
							createEntityCyclePeriodConstant(timingTriggeringEntityStartImplementation, osTask, osEvent, sourceStartInteraction, cycleCounterVariable));
					targetPartition.getEntityStartConstant().add(
							createEntityCycleOffsetConstant(timingTriggeringEntityStartImplementation, osTask, osEvent, sourceStartInteraction, cycleCounterVariable));
				}

				if (timingTriggeringEntityStartImplementation.requiresStartOffsetAdjust()) {
					GlobalVariable startOffsetCounterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceEntityStarter.getStartOffsetCounterImplementation());

					targetPartition.getEntityStartConstant().add(
							createEntityStartOffsetConstant(timingTriggeringEntityStartImplementation, osTask, osEvent, sourceStartInteraction, startOffsetCounterVariable));
				}
			}
		}
	}

	private Constant createEntityStartOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask osTask, OsEvent osEvent,
			EntityStartInteraction entityStartInteraction, GlobalVariable startOffsetCounterVariable) {
		Constant startOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		startOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		startOffsetConstant.setRoleName(RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME);
		startOffsetConstant.setSymbolName(SymbolNames.createEntityStartOffsetConstantName(osTask, osEvent, entityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		startOffsetConstant.setType((PrimitiveType) startOffsetCounterVariable.getType());
		startOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getStartOffset()));
		return startOffsetConstant;
	}

	private Constant createEntityCycleOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask osTask, OsEvent osEvent,
			EntityStartInteraction entityStartInteraction, GlobalVariable cycleCounterVariable) {
		Constant cycleOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		cycleOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		cycleOffsetConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME);
		cycleOffsetConstant.setSymbolName(SymbolNames.createEntityCycleOffsetConstantName(osTask, osEvent, entityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		cycleOffsetConstant.setType((PrimitiveType) cycleCounterVariable.getType());
		cycleOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCycleOffset()));
		return cycleOffsetConstant;
	}

	private Constant createEntityCyclePeriodConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask osTask, OsEvent osEvent,
			EntityStartInteraction entityStartInteraction, GlobalVariable cycleCounterVariable) {
		Constant cyclePeriodConstant = ModuleFactory.eINSTANCE.createConstant();
		cyclePeriodConstant.setSingleSource(sourceEntityStartImplementation);
		cyclePeriodConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME);
		cyclePeriodConstant.setSymbolName(SymbolNames.createEntityCyclePeriodConstantName(osTask, osEvent, entityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		cyclePeriodConstant.setType((PrimitiveType) cycleCounterVariable.getType());
		cyclePeriodConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCyclePeriod()));
		return cyclePeriodConstant;
	}

	private GlobalVariable createEntityStartOffsetCounterVariable(StartOffsetCounterImplementation sourceCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) throws ModelException {
		GlobalVariable startOffsetCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		startOffsetCounterVariable.setSingleSource(sourceCounterImplementation);
		startOffsetCounterVariable.setSymbolName(SymbolNames.createEntityStartOffsetCounterName(osTask, osEvent));
		startOffsetCounterVariable.setType(type);
		startOffsetCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		startOffsetCounterVariable.setHasStatic(false);
		startOffsetCounterVariable.setHasConst(false);
		return startOffsetCounterVariable;
	}

	private Constant createEntityStartOffsetMaxConstant(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) {
		Constant startOffsetMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		startOffsetMaxConstant.setSingleSource(sourceStartOffsetCounterImplementation);
		startOffsetMaxConstant.setSymbolName(SymbolNames.createEntityMaxStartOffsetConstantName(osTask, osEvent));
		startOffsetMaxConstant.setType(type);
		startOffsetMaxConstant.setValue(String.valueOf(sourceStartOffsetCounterImplementation.getMaxCount()));
		return startOffsetMaxConstant;
	}

	private GlobalVariable createEntityCycleCounterVariable(CycleCounterImplementation sourceCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) throws ModelException {
		GlobalVariable cycleCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		cycleCounterVariable.setSingleSource(sourceCounterImplementation);
		cycleCounterVariable.setSymbolName(SymbolNames.createEntityCycleCounterName(osTask, osEvent));
		cycleCounterVariable.setType(type);
		cycleCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		cycleCounterVariable.setHasStatic(false);
		cycleCounterVariable.setHasConst(false);
		return cycleCounterVariable;
	}

	private Constant createEntityCycleMaxConstant(CycleCounterImplementation sourceCycleCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) {
		Constant cycleMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		cycleMaxConstant.setSingleSource(sourceCycleCounterImplementation);
		cycleMaxConstant.setSymbolName(SymbolNames.createEntityMaxCycleConstantName(osTask, osEvent));
		cycleMaxConstant.setType(type);
		cycleMaxConstant.setValue(String.valueOf(sourceCycleCounterImplementation.getMaxCount()));
		return cycleMaxConstant;
	}

	private void buildFunctionMacroSymbols() throws ModelException {
		FunctionMacroGroup pMacroGroup = null;
		FunctionMacroGroup rMacroGroup = null;

		Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		EcucPartition sourcePartition = null;
		Partition partition;
		if (masterBswPartition.isPresent()) {
			sourcePartition = masterBswPartition.get();
			partition = this.context.builtQuery.findPartition(masterBswPartition.get());
		} else {
			List<Partition> partitionList = this.context.query.<Partition> findByKind(PARTITION);
			partition = partitionList.get(0);
		}
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
					if (pMacroGroup == null) {
						pMacroGroup = getSendFunctionMacroGroup(sourcePartition);
					}
				} else {
					// 受信側マクロの構築
					if (rMacroGroup == null) {
						rMacroGroup = getReceiveFunctionMacroGroup(sourcePartition);
					}
				}
			}
		}
		if (pMacroGroup != null) {
			partition.getFunctionMacroGroup().add(pMacroGroup);
		}
		if (rMacroGroup != null) {
			partition.getFunctionMacroGroup().add(rMacroGroup);
		}
	}
	
	private void buildComVariableSymbols() throws ModelException {
		Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		Partition partition;
		if (masterBswPartition.isPresent()) {
			partition = this.context.builtQuery.findPartition(masterBswPartition.get());
		} else {
			List<Partition> partitionList = this.context.query.<Partition> findByKind(PARTITION);
			partition = partitionList.get(0);
		}

		for (ComSignalGroup signalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (dataInstanceInCompositionList.isEmpty()) {
				continue;
			}
			buildComVariables(partition, signalGroup, dataInstanceInCompositionList.get(0).getPrototype());
		}
		if (needToCreateProxyFunctionTable()) {
			buildProxyComFunctionTable(partition);
		}
	}

	private boolean needToCreateProxyFunctionTable() throws ModelException {
		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			Type type = this.context.builtQuery.findType(proxyInteraction.getSignalDataType());
			if (!(type instanceof PrimitiveType)) {
				return true;
			}
		}
		return false;
	}
		
	private FunctionMacroGroup getSendFunctionMacroGroup(EcucPartition sourcePartition) {
		FunctionMacroGroup functionMacroGroup = ModuleFactory.eINSTANCE.createFunctionMacroGroup();
		FunctionMacro functionMacro = ModuleFactory.eINSTANCE.createFunctionMacro();
		functionMacro.setSymbolName(SymbolNames.createComSendSignalGroupFunctionName(sourcePartition));
		functionMacro.setFunctionName(isShadowSignalApi()
				? SymbolNames.createComSendSignalGroupWithUpdateShadowSignalName(sourcePartition)
				: SymbolNames.createComSendSignalGroupWithoutUpdateShadowSignalName(sourcePartition));
		functionMacroGroup.getFunctionMacro().add(functionMacro);
		return functionMacroGroup;
	}
	
	private FunctionMacroGroup getReceiveFunctionMacroGroup(EcucPartition sourcePartition) {
		FunctionMacroGroup functionMacroGroup = ModuleFactory.eINSTANCE.createFunctionMacroGroup();
		FunctionMacro functionMacro = ModuleFactory.eINSTANCE.createFunctionMacro();
		functionMacro.setSymbolName(SymbolNames.createComReceiveSignalGroupFunctionName(sourcePartition));
		functionMacro.setFunctionName(isShadowSignalApi()
				? SymbolNames.createComReceiveSignalGroupWithReceiveShadowSignalName(sourcePartition)
				: SymbolNames.createComReceiveSignalGroupWithoutReceiveShadowSignalName(sourcePartition));
		functionMacroGroup.getFunctionMacro().add(functionMacro);
		return functionMacroGroup;
	}
	
	private boolean isShadowSignalApi() {
		for (RteBswGeneral rteBswGeneral : this.context.query.<RteBswGeneral> findByKind(RTE_BSW_GENERAL)) {
			if (rteBswGeneral.getRteUseComShadowSignalApi()) {
				return true;
			}
		}
		
		return false;
	}
	
	private Type getLeafType(VariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		Type implType = this.context.builtQuery.findType(dataInstanceInSwc);
		if (implType instanceof RedefinitionType) {
			return ((RedefinitionType)implType).getLeafType();
		} else {
			return implType;
		}
	}
	
	private void buildComVariables(Partition partition, ComSignalGroup signalGroup, VariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		SenderReceiverToSignalGroupMapping mapping = getSenderReceiverToSignalGroupMapping(signalGroup);
		SenderRecCompositeTypeMapping compTypeMapping = mapping.getTypeMapping();

		// Rte_BufferTypeComSignal
		Constant comSigConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getDependentConstant().add(comSigConstant);

		// Rte_BufferTypeOffset
		Constant offsetConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getDependentConstant().add(offsetConstant);

		ImplementationDataType dataType = ((ImplementationDataType) dataInstanceInSwc.getPrototype().getType()).getLeafImplementationDataType();
		Type leafType = getLeafType(dataInstanceInSwc);
		
		for (ImplementationDataTypeElement element : dataType.getSubElement()) {
			if (leafType instanceof ArrayType) {
				EList<SenderRecArrayElementMapping> list = ((SenderRecArrayTypeMapping) compTypeMapping).getArrayElementMapping();
				for (int idx = 0; idx < list.size(); idx++) {
					for (SenderRecArrayElementMapping senderRecArrayElementMapping : list) {
						if(senderRecArrayElementMapping.getIndexedArrayElement().getIndex() == idx) {
							ComGroupSignal groupSignal = getComGroupSignal(signalGroup, senderRecArrayElementMapping.getSystemSignal());
							addConstantMember(comSigConstant, SymbolNames.createComSignalSymbolicName(groupSignal));
							addConstantMember(offsetConstant, "(" + String.valueOf(idx) + " * sizeof(" + leafType.getOriginalTypeSymbolName() + "))");
						}
					}
				}
			} else if (leafType instanceof StructType || leafType instanceof UnionType) { // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
				for (SenderRecRecordElementMapping eMapping : ((SenderRecRecordTypeMapping) compTypeMapping).getRecordElementMapping()) {
					if (element == eMapping.getImplementationRecordElement()) {
						ComGroupSignal groupSignal = getComGroupSignal(signalGroup, eMapping.getSystemSignal());
						addConstantMember(comSigConstant, SymbolNames.createComSignalSymbolicName(groupSignal));
						addConstantMember(offsetConstant, "Rte_offsetof(" + leafType.getSymbolName() + ", " + element.getShortName() + ")");
						break;
					}
				}
			}
		}

		GlobalVariableSet globalVariableSet = ModuleFactory.eINSTANCE.createGlobalVariableSet();
		globalVariableSet.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) partition.getSingleSource())));
		globalVariableSet.setSymbolName(SymbolNames.createGlobalSetName(signalGroup));
		globalVariableSet.setHasStatic(false);
		globalVariableSet.setHasConst(false);
		globalVariableSet.setInitWithConstantValue(false);

		// Rte_BufferTypeComSignal
		String symbol = SymbolNames.createBufferTypeComSignalName(signalGroup) + "[" + String.valueOf(signalGroup.getComGroupSignal().size()) + "]";
		GlobalVariable comSigVariable = createGlobalVariable(symbol, this.context.cache.comSignalIdType, comSigConstant, true);
		comSigVariable.setHasStatic(true);
		comSigVariable.setHasConst(true);
		comSigVariable.setInitWithConstantValue(true);
		globalVariableSet.getGlobalVariable().add(0, comSigVariable);

		// Rte_BufferTypeOffset
		String offsetSymbol = SymbolNames.createBufferTypeOffsetName(signalGroup) + "[" + String.valueOf(signalGroup.getComGroupSignal().size()) + "]";
		GlobalVariable variable = createGlobalVariable(offsetSymbol, this.context.cache.rteBufferTypeOffset, offsetConstant, true);
		variable.setHasStatic(true);
		variable.setHasConst(true);
		variable.setInitWithConstantValue(true);
		globalVariableSet.getGlobalVariable().add(1, variable);

		// Rte_BufferComMetaComplexData
		Constant metaConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getDependentConstant().add(metaConstant);
		addConstantMember(metaConstant, SymbolNames.createComSignalSymbolicName(signalGroup));
		addConstantMember(metaConstant, String.valueOf(signalGroup.getComGroupSignal().size()));
		addConstantMember(metaConstant, "&" + SymbolNames.createBufferTypeComSignalName(signalGroup) + "[0]");
		addConstantMember(metaConstant, "&" + SymbolNames.createBufferTypeOffsetName(signalGroup) + "[0]");

		Type type = this.context.cache.comMetaComplexDataType;
		GlobalVariable metaVariable = createGlobalVariable(SymbolNames.createBufferComMetaComplexDataName(signalGroup), type, metaConstant, true);
		metaVariable.setHasStatic(false);
		metaVariable.setHasConst(false);
		metaVariable.setInitWithConstantValue(true);
		globalVariableSet.getGlobalVariable().add(2, metaVariable);
		partition.getRteInternalVariable().add(globalVariableSet);
	}

	private void buildProxyComFunctionTable(Partition partition) throws ModelException {
		EList<Constant> constants = new BasicEList<Constant>();
		Swc swc = null;
		
		Constant functionConstant = null;
		for (ComSendProxy sendProxy : this.context.query.<ComSendProxy> findByKind(COM_SEND_PROXY)) {
			if (functionConstant == null) {
				functionConstant = ModuleFactory.eINSTANCE.createConstant();
				this.context.cache.rte.getDependentConstant().add(functionConstant);
				Type retType = this.context.cache.voidType;
				GlobalVariable functionVariable = createGlobalVariable(SymbolNames.createFunctionTableName(), retType, functionConstant, true);
				functionVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) partition.getSingleSource())));
				functionVariable.setHasStatic(true);
				functionVariable.setHasConst(false);
				functionVariable.setInitWithConstantValue(true);
				partition.getRteInternalVariable().add(functionVariable);
			}
			
			for (ComSendProxyInteraction interaction : sendProxy.getInteraction()) {
				if (this.context.builtQuery.findType(interaction.getSignalDataType()) instanceof PrimitiveType) continue;

				ProxyComSendImplementation sendImplementation = this.context.query.<ProxyComSendImplementation> findSingle(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, interaction));
				InternalEcuSender sender = sendImplementation.getParent().getInternalEcuSenders().get(0);
				PVariableDataInstanceInSwc dataInstanceInSwc = (PVariableDataInstanceInSwc) sender.getSource().getPrototype();
				Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, dataInstanceInSwc.getOwnerAtomicSwc());
				if (!optionalSwc.isPresent()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
					continue;
				}
				swc = optionalSwc.get();

				if (sendImplementation.getComSignal() != null) {
					constants.add(createProxyFunctionIndexConstant(dataInstanceInSwc,
							Identifiers.createProxyFunctionTableName(dataInstanceInSwc, sendImplementation.getComSignal())));
					addConstantMember(functionConstant, "&" + SymbolNames.createSrWriteProxyName(dataInstanceInSwc, sendImplementation.getComSignal()));
					if (sendProxy instanceof PeriodicComSendProxy) {
						createComProxyBuffer(partition, dataInstanceInSwc, SymbolNames.createBufferComProxyPeriodicName(dataInstanceInSwc, sendImplementation.getComSignal()));
					} else {
						createComProxyBuffer(partition, dataInstanceInSwc, SymbolNames.createBufferComProxyImmediateName(dataInstanceInSwc, sendImplementation.getComSignal()));
					}
				}
				if (sendImplementation.getComSignalGroup() != null) {
					constants.add(createProxyFunctionIndexConstant(dataInstanceInSwc,
							Identifiers.createProxyFunctionTableName(dataInstanceInSwc, sendImplementation.getComSignalGroup())));
					addConstantMember(functionConstant, "&" + SymbolNames.createSrWriteProxyName(dataInstanceInSwc, sendImplementation.getComSignalGroup()));
					if (sendProxy instanceof PeriodicComSendProxy) {
						createComProxyBuffer(partition, dataInstanceInSwc, SymbolNames.createBufferComProxyPeriodicName(dataInstanceInSwc, sendImplementation.getComSignalGroup()));
					} else {
						createComProxyBuffer(partition, dataInstanceInSwc, SymbolNames.createBufferComProxyImmediateName(dataInstanceInSwc, sendImplementation.getComSignalGroup()));
					}
				}
			}
		}

		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(CONSTANT__SYMBOL_NAME));
		ECollections.sort(constants, ordering);
		ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(CONSTANT__VALUE));
		ECollections.sort(functionConstant.getMember(), ordering);
		swc.getImplInitValueConstant().addAll(constants);
		int index = 0;
		for (Constant constant : constants) {
			constant.setValue(String.valueOf(index++));
		}
		
		// common.hに入れたいものだから、最後のtargetSwcに仮置きする
		if (swc != null && index > 0) { // COVERAGE (常用ケースでは4パターン中2パターンしか通らないが，コードレビューで問題ないことを確認)
			Constant tableSize = ModuleFactory.eINSTANCE.createConstant();
			tableSize.setSymbolName(SymbolNames.RTE_SR_WRITE_PROXY_FUNCTION_TABLE_SIZE_NAME);
			tableSize.setValue(String.valueOf(index));
			swc.getImplInitValueConstant().add(tableSize);
		}
	}

	private void createComProxyBuffer(Partition partition, PVariableDataInstanceInSwc pVariableDataInstanceInSwc, String symbol) throws ModelException {
		RteBufferVariableSet rteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		GlobalVariable bufferProxyVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		bufferProxyVariable.setSymbolName(symbol);
		bufferProxyVariable.setType(this.context.builtQuery.findType(pVariableDataInstanceInSwc));
		bufferProxyVariable.setHasStatic(false);
		bufferProxyVariable.setHasConst(false);
		bufferProxyVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) partition.getSingleSource())));
		rteBuffer.setComplexVariable(bufferProxyVariable);
		rteBuffer.setHasConst(false);
		rteBuffer.setHasStatic(false);
		partition.getRteBufferVariableSet().add(rteBuffer);
	}

	private SenderReceiverToSignalGroupMapping getSenderReceiverToSignalGroupMapping(ComSignalGroup comSigGroup) throws ModelException {
		SystemSignalGroup sysSigGroup = comSigGroup.getComSystemTemplateSignalGroup().getISignalGroup().getSystemSignalGroup();
		SenderReceiverToSignalGroupMapping mapping = this.context.query.findSingle(ref(SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, sysSigGroup));
		return mapping;
	}

	private ComGroupSignal getComGroupSignal(ComSignalGroup comSignalGroup, SystemSignal sysSig) throws ModelException {
		for (ComGroupSignal cgSignal : comSignalGroup.getComGroupSignal()) {
			if (cgSignal.getComSystemTemplateSystemSignal().getISignal().getSystemSignal() == sysSig) {
				return cgSignal;
			}
		}
		// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		return null;
	}

	private void addConstantMember(Constant constant, String symbol) throws ModelException {
		ConstantMember member = ModuleFactory.eINSTANCE.createConstantMember();
		member.setValue(symbol);
		constant.getMember().add(member);
	}
	
	private void buildModeSymbols() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				continue;
			}

			Bswm targetBswm = optionalTargetBswm.get();
			buildModeDeclarationGroupSymbols(targetBswm, sourceBswModuleDescription);
			buildModeMachineInstances(targetBswm, sourceBswModuleDescription);
		}
	}

	private void buildModeDeclarationGroupSymbols(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior behavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		for (DataTypeMappingSet sourceMappingSet : behavior.getDataTypeMapping()) {
			for (ModeRequestTypeMap sourceModeRequestTypeMap : sourceMappingSet.getModeRequestTypeMap()) {
				targetBswm.getModeType().add(createModeType(sourceModeRequestTypeMap));
				targetBswm.getModeRequestVariable().add(createModeRequestVariableSet(sourceModeRequestTypeMap));
			}
		}
	}

	private void buildModeMachineInstances(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior behavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswmがあるということは有効なbehaviorが存在するため、nullチェック不要

		for (ModeDeclarationGroupPrototype sourceProvidedModeGroup : sourceBswModuleDescription.getProvidedModeGroup()) {
			BswModeSenderPolicy sourceBswModeSenderPolicy = findBswModeSenderPolicyByModePrototype(behavior, sourceProvidedModeGroup);

			// モードマシンインスタンスの配置先を決定
			// NOTE パーティション内連携のみをサポートするため、配置先パーティションは1つに決まる
			EcucPartition usingEcucPartition;
			PartedBswm targetPartedBswm;

			Collection<EcucPartition> usingEcucPartitions = this.context.query.get(sourceProvidedModeGroup, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE);
			usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345により、モード宣言グループプロトタイプを使用するパーティションの多重度は0..1
			Partition partition = this.context.builtQuery.findPartition(usingEcucPartition);
			targetPartedBswm = targetBswm.getSinglePartedBswm(partition);

			// モードマシンインスタンスの必要性を判定
			if (!isUsedPrototype(sourceProvidedModeGroup, targetPartedBswm)) {
				continue;
			}
			if (sourceBswModeSenderPolicy == null) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// BswModeSenderPolicyがあることはvalidationで保証
				continue;
			}
			
			// モードマシンインスタンスを構築
			buildModuleInstance(targetPartedBswm, sourceBswModuleDescription, sourceProvidedModeGroup, sourceBswModeSenderPolicy, usingEcucPartition);
		}
	}

	private BswModeSenderPolicy findBswModeSenderPolicyByModePrototype(BswInternalBehavior behavior, ModeDeclarationGroupPrototype modePrototype) {
		for (BswModeSenderPolicy bswModeSenderPolicy : behavior.getModeSenderPolicy()) {
			if (bswModeSenderPolicy.getProvidedModeGroup() == modePrototype) {
				return bswModeSenderPolicy;
			}
		}

		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// BswModeSenderPolicyがあることはvalidationで保証
		return null;
	}

	private boolean isUsedPrototype(ModeDeclarationGroupPrototype prototype, PartedBswm partedBswm) {
		for (ExecutableEntity executableEntity : partedBswm.getDependentExecutableEntity()) {
			BswModuleEntity entity = (BswModuleEntity)executableEntity.getSingleSource();
			if (entity.getManagedModeGroup().contains(prototype)) {
				return true;
			}
		}
		return false;
	}
	
	private void buildModuleInstance(PartedBswm targetPartedBswm, BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModePrototype,
			BswModeSenderPolicy sourceSenderPolicy, EcucPartition ecucPartition) throws ModelException {
		Constant maxLengthConstant = createMaxLengthConstant(sourceBswModuleDescription, sourceModePrototype, sourceSenderPolicy);

		ModeQueueType modeQueueType = createModeQueueType(sourceBswModuleDescription, sourceModePrototype, maxLengthConstant);
		ModeQueuedVariable modeQueuedVariable = createModeQueueVariable(modeQueueType, sourceBswModuleDescription, sourceModePrototype);
		modeQueuedVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(Optional.fromNullable(ecucPartition), sourceModePrototype));

		ModeMachineInstance modeInstance = ModuleFactory.eINSTANCE.createModeMachineInstance();
		modeInstance.setSingleSource(sourceModePrototype);
		modeInstance.setModeQueue(modeQueuedVariable);
		
		GlobalVariable currentModeVariable = createCurrentModeVariable(sourceBswModuleDescription, sourceModePrototype);
		currentModeVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(Optional.fromNullable(ecucPartition), sourceModePrototype));
		modeInstance.setCurrentModeVariable(currentModeVariable);
		
		GlobalVariable nextModeVariable = createNextModeVariable(sourceBswModuleDescription, sourceModePrototype);
		nextModeVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(Optional.fromNullable(ecucPartition), sourceModePrototype));
		modeInstance.setNextModeVariable(nextModeVariable);

		String initModeName = SymbolNames.createRteInitModeTypeName(sourceModePrototype.getType());
		Constant initMode = this.context.query.findSingle(isKindOf(CONSTANT).AND(hasAttr(CONSTANT__SYMBOL_NAME, initModeName)));
		modeInstance.setInitModeConstant(initMode);

		targetPartedBswm.getModeMachineInstance().add(modeInstance);
	}
	
	private ModeRequestVariableSet createModeRequestVariableSet(ModeRequestTypeMap modeRequestTypeMap) throws ModelException {
		ModeRequestVariableSet modeRequestVariableSet = ModuleFactory.eINSTANCE.createModeRequestVariableSet();

		ModeType modeType = createModeType(modeRequestTypeMap);

		// modeTransitionStatusConstant
		Constant modeTransitionStatusConstant = ModuleFactory.eINSTANCE.createConstant();
		modeTransitionStatusConstant.setSymbolName(SymbolNames.createRteTransitionName(modeRequestTypeMap.getModeGroup()));
		modeTransitionStatusConstant.setType(modeType);
		modeTransitionStatusConstant.setValue(String.valueOf(modeRequestTypeMap.getModeGroup().getModeDeclaration().size()));
		modeRequestVariableSet.setModeTransitionStatusConstant(modeTransitionStatusConstant);
		
		int idx = 0;
		for (ModeDeclaration modeDeclaration : modeRequestTypeMap.getModeGroup().getModeDeclaration()) {
			Constant modeConstant = ModuleFactory.eINSTANCE.createConstant();
			modeConstant.setSymbolName(SymbolNames.createModeConstantName(modeRequestTypeMap.getModeGroup(), modeDeclaration));
			modeConstant.setType(modeType);
			modeConstant.setValue(String.valueOf(idx));
			modeRequestVariableSet.getModeConstant().add(modeConstant);
			
			if (modeDeclaration == modeRequestTypeMap.getModeGroup().getInitialMode()) {
				// initValueConstant
				Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
				initValueConstant.setSymbolName(SymbolNames.createRteInitModeTypeName(modeRequestTypeMap.getModeGroup()));
				initValueConstant.setType(modeType);
				initValueConstant.setValue(String.valueOf(idx));
				modeRequestVariableSet.setInitValueConstant(initValueConstant);
			}
			idx++;
		}
		
		return modeRequestVariableSet;
	}
	
	private ModeQueuedVariable createModeQueueVariable(ModeQueueType modeQueueType, BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) {
		ModeQueuedVariable modeQueuedVariable = ModuleFactory.eINSTANCE.createModeQueuedVariable();
		modeQueuedVariable.setType(modeQueueType);
		modeQueuedVariable.setHasStatic(false);
		modeQueuedVariable.setSymbolName(SymbolNames.createSchmModeRequestQueueTypeName(bswModuleDescription, modeDeclarationGroupPrototype));
		return modeQueuedVariable;
	}

	private GlobalVariable createCurrentModeVariable(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modePrototype) throws ModelException {
		GlobalVariable currentVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		currentVariable.setType(createModeType(modePrototype));
		currentVariable.setHasStatic(false);
		currentVariable.setSymbolName(SymbolNames.createSchmCurrentModeName(bswModuleDescription, modePrototype));
		return currentVariable;
	}

	private GlobalVariable createNextModeVariable(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modePrototype) throws ModelException {
		GlobalVariable nextVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		nextVariable.setType(createModeType(modePrototype));
		nextVariable.setHasStatic(false);
		nextVariable.setSymbolName(SymbolNames.createSchmNextModeName(bswModuleDescription, modePrototype));
		return nextVariable;
	}
	
	private ModeQueueType createModeQueueType(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, Constant maxLengthConstant) throws ModelException {
		ModeQueueType modeQueueType = ModuleFactory.eINSTANCE.createModeQueueType();
		modeQueueType.setMaxLengthConstant(maxLengthConstant);
		modeQueueType.setSymbolName(SymbolNames.createRteModeQueueTypeName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		modeQueueType.setElementType(createModeType(sourceModeDeclarationGroupPrototype));
		this.context.cache.rte.getRteType().add(modeQueueType);
		return modeQueueType;
	}

	private Constant createMaxLengthConstant(BswModuleDescription bswModuleDescription, ModeDeclarationGroupPrototype modeDeclarationGroupPrototype, BswModeSenderPolicy bswModeSenderPolicy) throws ModelException {
		Constant maxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		maxLengthConstant.setSymbolName(SymbolNames.createRteQueuedVariableMaxLengthConstantName(bswModuleDescription, modeDeclarationGroupPrototype));
		maxLengthConstant.setType(this.context.cache.uint32Type);
		maxLengthConstant.setValue(bswModeSenderPolicy.getQueueLength().toString());
		this.context.cache.rte.getDependentConstant().add(maxLengthConstant);
		return maxLengthConstant;
	}
	
	private ModeType createModeType(ModeDeclarationGroupPrototype modeDeclarationGroupPrototype) throws ModelException {
		ModeType type = ModuleFactory.eINSTANCE.createModeType();
		type.setSymbolName(SymbolNames.createRteModeTypeName(modeDeclarationGroupPrototype.getType()));
		this.context.cache.rte.getRteType().add(type);
		return type;
	}
	
	private ModeType createModeType(ModeRequestTypeMap modeRequestTypeMap) throws ModelException {
		ModeType type = ModuleFactory.eINSTANCE.createModeType();
		type.setSymbolName(modeRequestTypeMap.getModeGroup().getShortName());
		type.setOriginalTypeSymbolName(modeRequestTypeMap.getImplementationDataType().getShortName());
		this.context.cache.rte.getRteType().add(type);
		return type;
	}
}
