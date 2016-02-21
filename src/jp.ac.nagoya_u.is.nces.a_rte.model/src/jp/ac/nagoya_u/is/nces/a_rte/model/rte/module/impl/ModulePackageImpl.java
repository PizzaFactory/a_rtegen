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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.impl.RtePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComplexComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalProxyEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantValueTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NoneExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Operation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsGetSpinlockApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSuspendAllInterruptsApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionTableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionTableVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionPointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionPrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionStructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionUnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBswApiHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTfCalledRunnable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ServerRunnableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapperFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulePackageImpl extends EPackageImpl implements ModulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleReferrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferNonqueuedSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferNonqueuedReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irvReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irvReadApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irvWriteOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irvWriteApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferVariableSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comProxyFunctionTableVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteApplicationHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBswApiHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteLifecycleHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteApplicationTypeHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteVfbTraceHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteConfigurationHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteCallbackHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteTypeHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidateApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocNonqueuedSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directComSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionRteOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionRteSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionRteBufferWriteSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionComSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateProxyComSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicProxyComSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocNonqueuedReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocNonqueuedCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocWriteApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocReadApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comReceiveSignalApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comReceiveCallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comCallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comReceiveTimeoutCallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comInvalidateCallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalProxyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalImmediateEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalPeriodicEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskedNewDiffersMaskedOldFilterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskedNewDiffersXFilterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newIsWithinFilterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newIsOutsideFilterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskedNewEqualsXFilterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneEveryNFilterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteCoreStartApiImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteStopApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restartPartitionApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionRestartingApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionTerminatedApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteLifecycleApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferQueuedSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferQueuedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferQueuedReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocQueuedCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocReceiveApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocSendApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocQueuedSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocQueuedReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfCallApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableStartOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disabledInModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allInterruptBlockExcludeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osInterruptBlockExcludeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osSpinlockExcludeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osResourceExcludeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneExcludeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswSchedulableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEnterApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteExitApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskActivationExecutableTaskBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEventSetExecutableTaskBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskActivationOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEventSetActivationOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextActivationOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingTriggeringExecutableStartOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeSwitchTriggeringExecutableStartOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cycleCountupOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOffsetCountupOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocEmptyQueueApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalTrustedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osSetEventApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalImmediateTaskBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveComSendProxyOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexComSendProxyOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocReceiveGroupApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interPartitionTimeoutOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableInitializeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocInitializeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osSuspendAllInterruptsApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osGetSpinlockApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multicoreRteStartApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferWriteTrustedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csTrustedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csTfCalledRunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverRunnableStartOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyComSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocSendGroupApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocQueuedGroupCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlecoreRteStartApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteStartApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteInternalHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeDeclarationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeMachineInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMacroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comProxyFunctionTableFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionUnionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionStructTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteUtilityHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboxHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferQueueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeQueueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteSendTrustedFunctionParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendTrustedFunctionParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csTrustedFunctionParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neverReadOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteBufferInvalidateTrustedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionRteBufferInvalidateSendOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcMemoryMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswMemoryMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteApiFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteLifecycleApiFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskBodyFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswSchedulableEntityFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comCallbackFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedFunctionFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEntityFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswMemoryMappingHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swcMemoryMappingHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSignalApiWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comProxyFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSendSignalApiWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comReceiveSignalApiWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmLifecycleApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmEnterApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmExitApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmSwitchApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskEventsTriggeredByModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osTaskEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeQueuedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmModeApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInterlinkHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmApiFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSignalApiWrapperFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comProxyFunctionFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInterlinkTypeHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmLifecycleApiFileContentsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partedBswmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bswmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmDeinitApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmInitApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlecoreSchmInitApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multicoreSchmInitApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schmCoreInitApiImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionPointerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterPassTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signednessEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constantValueTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verbatimStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModulePackageImpl() {
		super(eNS_URI, ModuleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModulePackage init() {
		if (isInited) return (ModulePackage)EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI);

		// Obtain or create and register package
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModulePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI) : RtePackage.eINSTANCE);
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) : ExPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) : M2Package.eINSTANCE);
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) : EcucPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theModulePackage.createPackageContents();
		theRtePackage.createPackageContents();
		theExPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theM2Package.createPackageContents();
		theEcucPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theModulePackage.initializePackageContents();
		theRtePackage.initializePackageContents();
		theExPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theM2Package.initializePackageContents();
		theEcucPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModulePackage.eNS_URI, theModulePackage);
		return theModulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleObject() {
		return moduleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleObject_Source() {
		return (EReference)moduleObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleObject_SingleSource() {
		return (EReference)moduleObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleObject_RoleName() {
		return (EAttribute)moduleObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleReferrable() {
		return moduleReferrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleReferrable_Id() {
		return (EAttribute)moduleReferrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteApi() {
		return writeApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteApi_Operation() {
		return (EReference)writeApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteApi_DataParam() {
		return (EReference)writeApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteApi_NeedsCheckArg() {
		return (EAttribute)writeApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendOperation() {
		return sendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendOperation_SendValue() {
		return (EReference)sendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendOperation_SendStatus() {
		return (EReference)sendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendOperation_ExcludeOperation() {
		return (EReference)sendOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendOperation_ReturnVariable() {
		return (EReference)sendOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendOperation_IsWriteApi() {
		return (EAttribute)sendOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferNonqueuedSendOperation() {
		return rteBufferNonqueuedSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferNonqueuedSendOperation_AccessVariable() {
		return (EReference)rteBufferNonqueuedSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferNonqueuedSendOperation_FilterOperation() {
		return (EReference)rteBufferNonqueuedSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferNonqueuedReadOperation() {
		return rteBufferNonqueuedReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferNonqueuedReadOperation_AccessVariable() {
		return (EReference)rteBufferNonqueuedReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadOperation() {
		return readOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadOperation_InvalidValueConstant() {
		return (EReference)readOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadOperation_ReadValueVariable() {
		return (EReference)readOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadOperation_ReadStatusVariable() {
		return (EReference)readOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadOperation_ExcludeOperation() {
		return (EReference)readOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadApi() {
		return readApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadApi_Operation() {
		return (EReference)readApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadApi_DataParam() {
		return (EReference)readApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrvReadOperation() {
		return irvReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvReadOperation_AccessVariable() {
		return (EReference)irvReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvReadOperation_ReadValueVariable() {
		return (EReference)irvReadOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvReadOperation_ExcludeOperation() {
		return (EReference)irvReadOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrvReadApi() {
		return irvReadApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvReadApi_Operation() {
		return (EReference)irvReadApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvReadApi_DataParam() {
		return (EReference)irvReadApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrvWriteOperation() {
		return irvWriteOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvWriteOperation_AccessVariable() {
		return (EReference)irvWriteOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvWriteOperation_WriteValueVariable() {
		return (EReference)irvWriteOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvWriteOperation_ExcludeOperation() {
		return (EReference)irvWriteOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrvWriteApi() {
		return irvWriteApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvWriteApi_Operation() {
		return (EReference)irvWriteApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrvWriteApi_DataParam() {
		return (EReference)irvWriteApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferVariableSet() {
		return rteBufferVariableSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferVariableSet_ValueVariable() {
		return (EReference)rteBufferVariableSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferVariableSet_StatusVariable() {
		return (EReference)rteBufferVariableSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferVariableSet_InitValueVariable() {
		return (EReference)rteBufferVariableSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferVariableSet_ComplexVariable() {
		return (EReference)rteBufferVariableSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariableSet() {
		return globalVariableSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariableSet_GlobalVariable() {
		return (EReference)globalVariableSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComProxyFunctionTableVariable() {
		return comProxyFunctionTableVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteSource() {
		return rteSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_GlobalVariableGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_DependentExternalExecutableEntityGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_BswSchedulableEntityGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_RteApiGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_RteLifecycleApiGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_TaskBodyGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_ComCallbackGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_TrustedFunctionGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_SourceMacro() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_SchmLifecycleApiGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_SchmApiGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_ComSignalApiWrapperGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteSource_ComProxyFunctionGroup() {
		return (EReference)rteSourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteApi() {
		return rteApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteApi_ApiMappingName() {
		return (EAttribute)rteApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApi_ReturnValue() {
		return (EReference)rteApiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApi_InlineConstant() {
		return (EReference)rteApiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApi_InlineGlobalVariable() {
		return (EReference)rteApiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApi_InlineRunnableEntity() {
		return (EReference)rteApiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteApi_IsConnected() {
		return (EAttribute)rteApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApi_Parent() {
		return (EReference)rteApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteApi_IsInline() {
		return (EAttribute)rteApiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteModule() {
		return rteModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteCommonSource() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RtePartitionSource() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteApplicationHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteApplicationTypeHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteLifecycleHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteCallbackHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteConfigurationHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteVfbTraceHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteTypeHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteCommonHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RtePartitionHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteUtilityHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_DependentHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_BswMemoryMappingHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_SwcMemoryMappingHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_ModuleInterlinkHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_ModuleInterlinkTypeHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteModule_RteBswApiHeader() {
		return (EReference)rteModuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_InitValueConstant() {
		return (EReference)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_MemoryMapping() {
		return (EReference)globalVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_InitAtDefinition() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_InitWithConstantValue() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_HasConst() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_HasStatic() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_FileName() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_GenerationInfo() {
		return (EReference)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_PassType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_HasConst() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_SymbolName() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_IsAnonymous() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Signedness() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_OriginalTypeSymbolName() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Size() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_InitValueConstant() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_Parent() {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteApplicationHeader() {
		return rteApplicationHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteApplicationHeader_HasInlineApi() {
		return (EAttribute)rteApplicationHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationHeader_SourceMacro() {
		return (EReference)rteApplicationHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationHeader_GlobalVariableGroup() {
		return (EReference)rteApplicationHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationHeader_RteApiGroup() {
		return (EReference)rteApplicationHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationHeader_DeclarationsRteApiGroup() {
		return (EReference)rteApplicationHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationHeader_Constant() {
		return (EReference)rteApplicationHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationHeader_DependentExecutableEntityGroup() {
		return (EReference)rteApplicationHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_ReturnType() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Param() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_LocalVariable() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_LocalType() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_MemoryMapping() {
		return (EReference)functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_SymbolName() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalCompartment() {
		return logicalCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCompartment_CompartmentName() {
		return (EAttribute)logicalCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCore() {
		return coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_Partition() {
		return (EReference)coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCore_CoreId() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCore_IsMasterCore() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_RteCoreStartApiImpl() {
		return (EReference)coreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_SchmCoreInitApiImpl() {
		return (EReference)coreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartition_IsBswPartition() {
		return (EAttribute)partitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Parent() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Swc() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_RestartPartitionApi() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_PartitionTerminatedApi() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_PartitionRestartingApi() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_TaskBody() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_CsTfArgcConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_CsTfOpidConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_CsTrustedFunction() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_EntityStartVariable() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_EntityStartConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_RteBufferSendTrustedFunction() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_SrFilterConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_SrFilterOldValueVariable() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_SrFilterOccurrenceVariable() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_OsTrustedMacro() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComReceiveBufferVariableSet() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComSignalApiWrapper() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComSignalApiAlias() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComMetaDataVariableSet() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_PartedBswm() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComProxyFunctionTableVariable() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComProxyBufferVariableSet() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_SrRteBufferInitValueConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_SrRteBufferVariableSet() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_SrRteBufferQueuedVariable() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComProxyFunction() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComProxyFunctionTableIndexConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_ComProxyFunctionTableSizeConstant() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwc() {
		return swcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_Parent() {
		return (EReference)swcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_RteApi() {
		return (EReference)swcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_ApiEnumConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_ApiUpperLowerLimitConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_SrApiInitValueConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_SrImplInitValueConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_SrImplInvalidValueConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_SrFilterConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_CsApiApplicationErrorConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_CsPortArgValueConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_CsPortArgValueVariable() {
		return (EReference)swcEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_IrvBufferInitValueConstant() {
		return (EReference)swcEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_IrvBufferVariableSet() {
		return (EReference)swcEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_SwcMemoryMapping() {
		return (EReference)swcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_DependentRunnableEntity() {
		return (EReference)swcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwc_DependentExternalRunnableEntity() {
		return (EReference)swcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteHeader() {
		return rteHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBswApiHeader() {
		return rteBswApiHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBswApiHeader_IocApi() {
		return (EReference)rteBswApiHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteLifecycleHeader() {
		return rteLifecycleHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteLifecycleHeader_RteLifecycleApiGroup() {
		return (EReference)rteLifecycleHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteLifecycleHeader_SchmLifecycleApiGroup() {
		return (EReference)rteLifecycleHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteApplicationTypeHeader() {
		return rteApplicationTypeHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApplicationTypeHeader_Constant() {
		return (EReference)rteApplicationTypeHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteVfbTraceHeader() {
		return rteVfbTraceHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteConfigurationHeader() {
		return rteConfigurationHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteCallbackHeader() {
		return rteCallbackHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteCallbackHeader_ComCallbackGroup() {
		return (EReference)rteCallbackHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteTypeHeader() {
		return rteTypeHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTypeHeader_RteType() {
		return (EReference)rteTypeHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteTypeHeader_RteTypeConstant() {
		return (EReference)rteTypeHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteTypeHeader_ProvidesSignalGroupTransmission() {
		return (EAttribute)rteTypeHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidateApi() {
		return invalidateApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvalidateApi_Operation() {
		return (EReference)invalidateApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocNonqueuedSendOperation() {
		return iocNonqueuedSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocNonqueuedSendOperation_AccessApi() {
		return (EReference)iocNonqueuedSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectComSendOperation() {
		return directComSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionRteOperation() {
		return trustedFunctionRteOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteOperation_TempReturnVariable() {
		return (EReference)trustedFunctionRteOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionRteSendOperation() {
		return trustedFunctionRteSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteSendOperation_Type() {
		return (EReference)trustedFunctionRteSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustedFunctionRteSendOperation_SrSendTfSymbolName() {
		return (EAttribute)trustedFunctionRteSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteSendOperation_TrustedFunctionParamVariable() {
		return (EReference)trustedFunctionRteSendOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustedFunctionRteSendOperation_IsGroup() {
		return (EAttribute)trustedFunctionRteSendOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionRteBufferWriteSendOperation() {
		return trustedFunctionRteBufferWriteSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteBufferWriteSendOperation_AccessTrustedFunction() {
		return (EReference)trustedFunctionRteBufferWriteSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionComSendOperation() {
		return trustedFunctionComSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionComSendOperation_Type() {
		return (EReference)trustedFunctionComSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionComSendOperation_AccessTrustedFunction() {
		return (EReference)trustedFunctionComSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionComSendOperation_TrustedFunctionParamVariable() {
		return (EReference)trustedFunctionComSendOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustedFunctionComSendOperation_IsGroup() {
		return (EAttribute)trustedFunctionComSendOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateProxyComSendOperation() {
		return immediateProxyComSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmediateProxyComSendOperation_ActivationApi() {
		return (EReference)immediateProxyComSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicProxyComSendOperation() {
		return periodicProxyComSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocNonqueuedReadOperation() {
		return iocNonqueuedReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocNonqueuedReadOperation_AccessApi() {
		return (EReference)iocNonqueuedReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComReadOperation() {
		return comReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReadOperation_AccessApi() {
		return (EReference)comReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReadOperation_TempReturnVariable() {
		return (EReference)comReadOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocNonqueuedCommunication() {
		return iocNonqueuedCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocNonqueuedCommunication_WriteApi() {
		return (EReference)iocNonqueuedCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocNonqueuedCommunication_ReadApi() {
		return (EReference)iocNonqueuedCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocNonqueuedCommunication_InitValue() {
		return (EReference)iocNonqueuedCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocNonqueuedCommunication_InitValueVariable() {
		return (EReference)iocNonqueuedCommunicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocWriteApi() {
		return iocWriteApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocWriteApi_Parent() {
		return (EReference)iocWriteApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocReadApi() {
		return iocReadApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalApi() {
		return comSendSignalApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComReceiveSignalApi() {
		return comReceiveSignalApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComReceiveCallback() {
		return comReceiveCallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReceiveCallback_Operation() {
		return (EReference)comReceiveCallbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReceiveCallback_DataVariable() {
		return (EReference)comReceiveCallbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReceiveCallback_AccessApi() {
		return (EReference)comReceiveCallbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendOperation() {
		return comSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendOperation_AccessApi() {
		return (EReference)comSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendOperation_TempReturnVariable() {
		return (EReference)comSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComCallback() {
		return comCallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComReceiveTimeoutCallback() {
		return comReceiveTimeoutCallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReceiveTimeoutCallback_Operation() {
		return (EReference)comReceiveTimeoutCallbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReceiveTimeoutCallback_DataVariable() {
		return (EReference)comReceiveTimeoutCallbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComReceiveTimeoutCallback_AccessApi() {
		return (EReference)comReceiveTimeoutCallbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComInvalidateCallback() {
		return comInvalidateCallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComInvalidateCallback_Operation() {
		return (EReference)comInvalidateCallbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComInvalidateCallback_FilterResultVariable() {
		return (EReference)comInvalidateCallbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalProxyEntity() {
		return comSendSignalProxyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendSignalProxyEntity_PrimitiveOperation() {
		return (EReference)comSendSignalProxyEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendSignalProxyEntity_ComplexOperation() {
		return (EReference)comSendSignalProxyEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalImmediateEntity() {
		return comSendSignalImmediateEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalPeriodicEntity() {
		return comSendSignalPeriodicEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterOperation() {
		return filterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterOperation_FilterResultVariable() {
		return (EReference)filterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskedNewDiffersMaskedOldFilterOperation() {
		return maskedNewDiffersMaskedOldFilterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskedNewDiffersMaskedOldFilterOperation_OldValueVariable() {
		return (EReference)maskedNewDiffersMaskedOldFilterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskedNewDiffersMaskedOldFilterOperation_Mask() {
		return (EReference)maskedNewDiffersMaskedOldFilterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskedNewDiffersXFilterOperation() {
		return maskedNewDiffersXFilterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskedNewDiffersXFilterOperation_Mask() {
		return (EReference)maskedNewDiffersXFilterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskedNewDiffersXFilterOperation_X() {
		return (EReference)maskedNewDiffersXFilterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewIsWithinFilterOperation() {
		return newIsWithinFilterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewIsWithinFilterOperation_Min() {
		return (EReference)newIsWithinFilterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewIsWithinFilterOperation_Max() {
		return (EReference)newIsWithinFilterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewIsOutsideFilterOperation() {
		return newIsOutsideFilterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewIsOutsideFilterOperation_Min() {
		return (EReference)newIsOutsideFilterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewIsOutsideFilterOperation_Max() {
		return (EReference)newIsOutsideFilterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskedNewEqualsXFilterOperation() {
		return maskedNewEqualsXFilterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskedNewEqualsXFilterOperation_Mask() {
		return (EReference)maskedNewEqualsXFilterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaskedNewEqualsXFilterOperation_X() {
		return (EReference)maskedNewEqualsXFilterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneEveryNFilterOperation() {
		return oneEveryNFilterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneEveryNFilterOperation_OccurrenceVariable() {
		return (EReference)oneEveryNFilterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneEveryNFilterOperation_Period() {
		return (EReference)oneEveryNFilterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneEveryNFilterOperation_Offset() {
		return (EReference)oneEveryNFilterOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteCoreStartApiImpl() {
		return rteCoreStartApiImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteCoreStartApiImpl_Operation() {
		return (EReference)rteCoreStartApiImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteCoreStartApiImpl_Parent() {
		return (EReference)rteCoreStartApiImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteStopApi() {
		return rteStopApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestartPartitionApi() {
		return restartPartitionApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestartPartitionApi_Operation() {
		return (EReference)restartPartitionApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionRestartingApi() {
		return partitionRestartingApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionRestartingApi_SrInterPartitionTimeoutOperation() {
		return (EReference)partitionRestartingApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionTerminatedApi() {
		return partitionTerminatedApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionTerminatedApi_SrInterPartitionTimeoutOperation() {
		return (EReference)partitionTerminatedApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteLifecycleApi() {
		return rteLifecycleApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendApi() {
		return sendApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendApi_Operation() {
		return (EReference)sendApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendApi_DataParam() {
		return (EReference)sendApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendApi_StatusVariable() {
		return (EReference)sendApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendApi_TrustedFunctionParamVariable() {
		return (EReference)sendApiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendApi_FilterResultVariable() {
		return (EReference)sendApiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendApi_NeedsCheckArg() {
		return (EAttribute)sendApiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveApi() {
		return receiveApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveApi_Operation() {
		return (EReference)receiveApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveApi_DataParam() {
		return (EReference)receiveApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveApi_StatusVariable() {
		return (EReference)receiveApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferQueuedSendOperation() {
		return rteBufferQueuedSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueuedSendOperation_AccessVariable() {
		return (EReference)rteBufferQueuedSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueuedSendOperation_TempReturnVariable() {
		return (EReference)rteBufferQueuedSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueuedSendOperation_Type() {
		return (EReference)rteBufferQueuedSendOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferQueuedVariable() {
		return rteBufferQueuedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueuedVariable_QueueType() {
		return (EReference)rteBufferQueuedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferQueuedReadOperation() {
		return rteBufferQueuedReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueuedReadOperation_AccessVariable() {
		return (EReference)rteBufferQueuedReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocQueuedCommunication() {
		return iocQueuedCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedCommunication_SendApi() {
		return (EReference)iocQueuedCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedCommunication_ReceiveApi() {
		return (EReference)iocQueuedCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedCommunication_IocEmptyQueueApi() {
		return (EReference)iocQueuedCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocReceiveApi() {
		return iocReceiveApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocSendApi() {
		return iocSendApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocSendOperation() {
		return iocSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocSendOperation_Type() {
		return (EReference)iocSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocQueuedSendOperation() {
		return iocQueuedSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedSendOperation_AccessApi() {
		return (EReference)iocQueuedSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedSendOperation_TempReturnVariable() {
		return (EReference)iocQueuedSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocQueuedReadOperation() {
		return iocQueuedReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedReadOperation_AccessApi() {
		return (EReference)iocQueuedReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedReadOperation_TempReturnVariable() {
		return (EReference)iocQueuedReadOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallApi() {
		return callApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallApi_Operation() {
		return (EReference)callApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallApi_OperationParam() {
		return (EReference)callApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallApi_PortArgValue() {
		return (EReference)callApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallApi_ReturnVariable() {
		return (EReference)callApiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTfCallApi() {
		return tfCallApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfCallApi_CsTfParamTypeName() {
		return (EAttribute)tfCallApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfCallApi_CsTfArgcConstantName() {
		return (EAttribute)tfCallApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfCallApi_CsTfOpidConstantName() {
		return (EAttribute)tfCallApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfCallApi_CsTfName() {
		return (EAttribute)tfCallApiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfCallApi_NeedsCheckArg() {
		return (EAttribute)tfCallApiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableStartOperation() {
		return executableStartOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableStartOperation_DisabledInMode() {
		return (EReference)executableStartOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableStartOperation_StartExecutable() {
		return (EReference)executableStartOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableStartOperation_RieaExcludeOperation() {
		return (EReference)executableStartOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisabledInMode() {
		return disabledInModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisabledInMode_DisabledMode() {
		return (EReference)disabledInModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisabledInMode_ModeMachineInstance() {
		return (EReference)disabledInModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableEntity() {
		return executableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableEntity_RoleParam() {
		return (EReference)executableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutableEntity_IsNoMock() {
		return (EAttribute)executableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeOperation() {
		return excludeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllInterruptBlockExcludeOperation() {
		return allInterruptBlockExcludeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsInterruptBlockExcludeOperation() {
		return osInterruptBlockExcludeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsSpinlockExcludeOperation() {
		return osSpinlockExcludeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsSpinlockExcludeOperation_OsSpinlockId() {
		return (EAttribute)osSpinlockExcludeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsResourceExcludeOperation() {
		return osResourceExcludeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsResourceExcludeOperation_OsResourceId() {
		return (EAttribute)osResourceExcludeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoneExcludeOperation() {
		return noneExcludeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_SymbolName() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_ExternalSymbolName() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Type() {
		return (EReference)constantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_ConstantValueType() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Member() {
		return (EReference)constantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_RepresentedVariableName() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantMember() {
		return constantMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantMember_Parent() {
		return (EReference)constantMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswSchedulableEntity() {
		return bswSchedulableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswSchedulableEntity_ParentPartedBswm() {
		return (EReference)bswSchedulableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableEntity() {
		return runnableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnableEntity_HasReturnValue() {
		return (EAttribute)runnableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteEnterApi() {
		return rteEnterApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteEnterApi_Operation() {
		return (EReference)rteEnterApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteEnterApi_IsNoneExclude() {
		return (EAttribute)rteEnterApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteExitApi() {
		return rteExitApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteExitApi_Operation() {
		return (EReference)rteExitApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteExitApi_IsNoneExclude() {
		return (EAttribute)rteExitApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTaskActivationExecutableTaskBody() {
		return osTaskActivationExecutableTaskBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTaskActivationExecutableTaskBody_Operation() {
		return (EReference)osTaskActivationExecutableTaskBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsEventSetExecutableTaskBody() {
		return osEventSetExecutableTaskBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsEventSetExecutableTaskBody_Operation() {
		return (EReference)osEventSetExecutableTaskBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsEventSetExecutableTaskBody_OsEventId() {
		return (EAttribute)osEventSetExecutableTaskBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsEventSetExecutableTaskBody_ChecksOsEventId() {
		return (EAttribute)osEventSetExecutableTaskBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsEventSetExecutableTaskBody_EventVariable() {
		return (EReference)osEventSetExecutableTaskBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTaskActivationOperation() {
		return osTaskActivationOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsEventSetActivationOperation() {
		return osEventSetActivationOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsEventSetActivationOperation_ActivationOsEventId() {
		return (EAttribute)osEventSetActivationOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextActivationOperation() {
		return contextActivationOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextActivationOperation_ExecutableStartOperation() {
		return (EReference)contextActivationOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextActivationOperation_CycleCountupOperation() {
		return (EReference)contextActivationOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextActivationOperation_StartOffsetCountupOperation() {
		return (EReference)contextActivationOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingTriggeringExecutableStartOperation() {
		return timingTriggeringExecutableStartOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingTriggeringExecutableStartOperation_CyclePeriodConstant() {
		return (EReference)timingTriggeringExecutableStartOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingTriggeringExecutableStartOperation_CycleOffsetConstant() {
		return (EReference)timingTriggeringExecutableStartOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingTriggeringExecutableStartOperation_StartOffsetConstant() {
		return (EReference)timingTriggeringExecutableStartOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingTriggeringExecutableStartOperation_StartOffsetCounterVariable() {
		return (EReference)timingTriggeringExecutableStartOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingTriggeringExecutableStartOperation_CycleCounterVariable() {
		return (EReference)timingTriggeringExecutableStartOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeSwitchTriggeringExecutableStartOperation() {
		return modeSwitchTriggeringExecutableStartOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitchTriggeringExecutableStartOperation_StartMode() {
		return (EReference)modeSwitchTriggeringExecutableStartOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCycleCountupOperation() {
		return cycleCountupOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCycleCountupOperation_CounterVariable() {
		return (EReference)cycleCountupOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCycleCountupOperation_MaxConstant() {
		return (EReference)cycleCountupOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOffsetCountupOperation() {
		return startOffsetCountupOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartOffsetCountupOperation_CounterVariable() {
		return (EReference)startOffsetCountupOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartOffsetCountupOperation_MaxConstant() {
		return (EReference)startOffsetCountupOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskBody() {
		return taskBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskBody_OsTaskId() {
		return (EAttribute)taskBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocEmptyQueueApi() {
		return iocEmptyQueueApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComApi() {
		return comApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComApi_IsSignalGroup() {
		return (EAttribute)comApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComApi_ComSignalSymbolName() {
		return (EAttribute)comApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocApi() {
		return iocApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIocApi_MappingName() {
		return (EAttribute)iocApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRte() {
		return rteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_Core() {
		return (EReference)rteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComCallback() {
		return (EReference)rteEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComSendSignalPeriodicEntity() {
		return (EReference)rteEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComSendSignalImmediateEntity() {
		return (EReference)rteEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComSendSignalTrustedFunction() {
		return (EReference)rteEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_DependentType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ImmediateConstant() {
		return (EReference)rteEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_SrRteBufferQueueMaxLengthConstant() {
		return (EReference)rteEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_DependentOsApi() {
		return (EReference)rteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_DependentIocCommunication() {
		return (EReference)rteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_DependentComApi() {
		return (EReference)rteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_IocInitValueConstant() {
		return (EReference)rteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_IocInitValueVariableSet() {
		return (EReference)rteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteStartApi() {
		return (EReference)rteEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_DependentConstant() {
		return (EReference)rteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComSendSignalImmediateTaskBody() {
		return (EReference)rteEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteStopApi() {
		return (EReference)rteEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ImplementationDataType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComSendSignalTfParamType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_ComSendSignalGroupTfParamType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_CsTfParamType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_SrRteSendTfParamType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_SrRteBufferQueueType() {
		return (EReference)rteEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_RteMemoryMapping() {
		return (EReference)rteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_GenerationInfo() {
		return (EReference)rteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_Bswm() {
		return (EReference)rteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_SchmInitApi() {
		return (EReference)rteEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRte_SchmDeinitApi() {
		return (EReference)rteEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunction() {
		return trustedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustedFunction_TrustedFunctionIndex() {
		return (EAttribute)trustedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalTrustedFunction() {
		return comSendSignalTrustedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSendSignalTrustedFunction_IsGroup() {
		return (EAttribute)comSendSignalTrustedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSendSignalTrustedFunction_SignalGroupSymbolName() {
		return (EAttribute)comSendSignalTrustedFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsSetEventApi() {
		return osSetEventApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsSetEventApi_OsTaskId() {
		return (EAttribute)osSetEventApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsSetEventApi_OsEventId() {
		return (EAttribute)osSetEventApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsApi() {
		return osApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalImmediateTaskBody() {
		return comSendSignalImmediateTaskBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSendSignalImmediateTaskBody_StartEntity() {
		return (EReference)comSendSignalImmediateTaskBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSendSignalImmediateTaskBody_OsEventId() {
		return (EAttribute)comSendSignalImmediateTaskBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Member() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_SymbolName() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveComSendProxyOperation() {
		return primitiveComSendProxyOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveComSendProxyOperation_ReadValueVariable() {
		return (EReference)primitiveComSendProxyOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveComSendProxyOperation_AccessApi() {
		return (EReference)primitiveComSendProxyOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveComSendProxyOperation_SignalIdVariable() {
		return (EReference)primitiveComSendProxyOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexComSendProxyOperation() {
		return complexComSendProxyOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexComSendProxyOperation_AccessApi() {
		return (EReference)complexComSendProxyOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexComSendProxyOperation_FunctionTableSymbolName() {
		return (EAttribute)complexComSendProxyOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexComSendProxyOperation_TableIndexVariable() {
		return (EReference)complexComSendProxyOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocReceiveGroupApi() {
		return iocReceiveGroupApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIocReceiveGroupApi_ComSendSignalSymbolName() {
		return (EAttribute)iocReceiveGroupApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRoot() {
		return moduleRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRoot_RteModule() {
		return (EReference)moduleRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRoot_Rte() {
		return (EReference)moduleRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterPartitionTimeoutOperation() {
		return interPartitionTimeoutOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterPartitionTimeoutOperation_TimeoutVariable() {
		return (EReference)interPartitionTimeoutOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterPartitionTimeoutOperation_ExcludeOperation() {
		return (EReference)interPartitionTimeoutOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializeOperation() {
		return initializeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableInitializeOperation() {
		return variableInitializeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableInitializeOperation_InitVariable() {
		return (EReference)variableInitializeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableInitializeOperation_ExcludeOperation() {
		return (EReference)variableInitializeOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocInitializeOperation() {
		return iocInitializeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocInitializeOperation_InitIocApi() {
		return (EReference)iocInitializeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsSuspendAllInterruptsApi() {
		return osSuspendAllInterruptsApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsGetSpinlockApi() {
		return osGetSpinlockApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulticoreRteStartApi() {
		return multicoreRteStartApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticoreRteStartApi_CoreStartApiImpl() {
		return (EReference)multicoreRteStartApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferWriteTrustedFunction() {
		return rteBufferWriteTrustedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferWriteTrustedFunction_Operation() {
		return (EReference)rteBufferWriteTrustedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferWriteTrustedFunction_DataVariable() {
		return (EReference)rteBufferWriteTrustedFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsTrustedFunction() {
		return csTrustedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsTrustedFunction_DataVariable() {
		return (EReference)csTrustedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsTrustedFunction_CsTfParamTypeName() {
		return (EAttribute)csTrustedFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsTrustedFunction_CsTfCalledRunnable() {
		return (EReference)csTrustedFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsTfCalledRunnable() {
		return csTfCalledRunnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsTfCalledRunnable_CsTfOpidConstantName() {
		return (EAttribute)csTfCalledRunnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsTfCalledRunnable_StartOperation() {
		return (EReference)csTfCalledRunnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerRunnableStartOperation() {
		return serverRunnableStartOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerRunnableStartOperation_StartServerRunnable() {
		return (EReference)serverRunnableStartOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocCommunication() {
		return iocCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxyComSendOperation() {
		return proxyComSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyComSendOperation_Type() {
		return (EReference)proxyComSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyComSendOperation_RequestProxyIocApi() {
		return (EReference)proxyComSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyComSendOperation_ValueProxyIocApi() {
		return (EReference)proxyComSendOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyComSendOperation_ProxyFunctionIndexConstantName() {
		return (EAttribute)proxyComSendOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocSendGroupApi() {
		return iocSendGroupApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocQueuedGroupCommunication() {
		return iocQueuedGroupCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedGroupCommunication_ReceiveApi() {
		return (EReference)iocQueuedGroupCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIocQueuedGroupCommunication_SendApi() {
		return (EReference)iocQueuedGroupCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglecoreRteStartApi() {
		return singlecoreRteStartApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSinglecoreRteStartApi_Operation() {
		return (EReference)singlecoreRteStartApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteStartApi() {
		return rteStartApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderFile() {
		return headerFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderFile_GuardName() {
		return (EAttribute)headerFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFile_IncludeHeader() {
		return (EReference)headerFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFile() {
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFile_IncludeHeader() {
		return (EReference)sourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteInternalHeader() {
		return rteInternalHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_Constant() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_GlobalVariableGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_TrustedFunctionGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_BswSchedulableEntityGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_RteCoreStartApiImpl() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_DependentExecutableEntityGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_SchmCoreInitApiImpl() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_FunctionMacro() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_ComProxyFunctionTableGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_ComSignalApiWrapperGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_ModeType() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_ModeDeclarationGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_ModeMachineInstance() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_RteApiGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteInternalHeader_SchmApiGroup() {
		return (EReference)rteInternalHeaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeDeclarationGroup() {
		return modeDeclarationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_ModeType() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_ImplementationDataType() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_ModeConstant() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_ModeTransitionStatusConstant() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeDeclarationGroup_InitModeConstant() {
		return (EReference)modeDeclarationGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeMachineInstance() {
		return modeMachineInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachineInstance_RequestModeQueueType() {
		return (EReference)modeMachineInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachineInstance_RequestModeQueue() {
		return (EReference)modeMachineInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachineInstance_CurrentModeVariable() {
		return (EReference)modeMachineInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachineInstance_NextModeVariable() {
		return (EReference)modeMachineInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachineInstance_InitModeConstant() {
		return (EReference)modeMachineInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMacro() {
		return functionMacroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMacro_SymbolName() {
		return (EAttribute)functionMacroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMacro_FunctionName() {
		return (EAttribute)functionMacroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComProxyFunctionTableFileContentsGroup() {
		return comProxyFunctionTableFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunctionTableFileContentsGroup_SrWriteProxyName() {
		return (EAttribute)comProxyFunctionTableFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinitionPrimitiveType() {
		return redefinitionPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayType_ArraySize() {
		return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinitionArrayType() {
		return redefinitionArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionType() {
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionType_Member() {
		return (EReference)unionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinitionUnionType() {
		return redefinitionUnionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructType() {
		return structTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType_Member() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinitionStructType() {
		return redefinitionStructTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboxType() {
		return blackboxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionMember() {
		return unionMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionMember_MemberName() {
		return (EAttribute)unionMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionMember_Type() {
		return (EReference)unionMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructMember() {
		return structMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructMember_MemberName() {
		return (EAttribute)structMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructMember_Type() {
		return (EReference)structMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeType() {
		return modeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeType_GuardName() {
		return (EAttribute)modeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeType_ImplementationDataType() {
		return (EReference)modeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableMember() {
		return variableMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableMember_Parent() {
		return (EReference)variableMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteUtilityHeader() {
		return rteUtilityHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboxHeader() {
		return blackboxHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferQueueType() {
		return rteBufferQueueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueueType_MaxLengthConstant() {
		return (EReference)rteBufferQueueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferQueueType_ElementType() {
		return (EReference)rteBufferQueueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeQueueType() {
		return modeQueueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeQueueType_MaxLengthConstant() {
		return (EReference)modeQueueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeQueueType_ElementType() {
		return (EReference)modeQueueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteSendTrustedFunctionParamType() {
		return rteSendTrustedFunctionParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendTrustedFunctionParamType() {
		return comSendTrustedFunctionParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSendTrustedFunctionParamType_IsGroup() {
		return (EAttribute)comSendTrustedFunctionParamTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsTrustedFunctionParamType() {
		return csTrustedFunctionParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeverReadOperation() {
		return neverReadOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeverReadOperation_InitValueConstant() {
		return (EReference)neverReadOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteBufferInvalidateTrustedFunction() {
		return rteBufferInvalidateTrustedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteBufferInvalidateTrustedFunction_Operation() {
		return (EReference)rteBufferInvalidateTrustedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionRteBufferInvalidateSendOperation() {
		return trustedFunctionRteBufferInvalidateSendOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteBufferInvalidateSendOperation_AccessTrustedFunction() {
		return (EReference)trustedFunctionRteBufferInvalidateSendOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionRteBufferInvalidateSendOperation_TempReturnVariable() {
		return (EReference)trustedFunctionRteBufferInvalidateSendOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryMapping() {
		return memoryMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryMapping_Prefix() {
		return (EAttribute)memoryMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryMapping_MemorySectionSymbolName() {
		return (EAttribute)memoryMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcMemoryMapping() {
		return swcMemoryMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswMemoryMapping() {
		return bswMemoryMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariableFileContentsGroup() {
		return globalVariableFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariableFileContentsGroup_GlobalVariable() {
		return (EReference)globalVariableFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariableFileContentsGroup_MemoryMapping() {
		return (EReference)globalVariableFileContentsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionFileContentsGroup() {
		return functionFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionFileContentsGroup_MemoryMapping() {
		return (EReference)functionFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionFileContentsGroup_Function() {
		return (EReference)functionFileContentsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteApiFileContentsGroup() {
		return rteApiFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteApiFileContentsGroup_RteApi() {
		return (EReference)rteApiFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteLifecycleApiFileContentsGroup() {
		return rteLifecycleApiFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteLifecycleApiFileContentsGroup_RteLifecycleApi() {
		return (EReference)rteLifecycleApiFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskBodyFileContentsGroup() {
		return taskBodyFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskBodyFileContentsGroup_TaskBody() {
		return (EReference)taskBodyFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswSchedulableEntityFileContentsGroup() {
		return bswSchedulableEntityFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswSchedulableEntityFileContentsGroup_BswSchedulableEntity() {
		return (EReference)bswSchedulableEntityFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComCallbackFileContentsGroup() {
		return comCallbackFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComCallbackFileContentsGroup_ComCallback() {
		return (EReference)comCallbackFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedFunctionFileContentsGroup() {
		return trustedFunctionFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustedFunctionFileContentsGroup_TrustedFunction() {
		return (EReference)trustedFunctionFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableEntityFileContentsGroup() {
		return executableEntityFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableEntityFileContentsGroup_ExecutableEntity() {
		return (EReference)executableEntityFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswMemoryMappingHeader() {
		return bswMemoryMappingHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswMemoryMappingHeader_MemoryMapping() {
		return (EReference)bswMemoryMappingHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwcMemoryMappingHeader() {
		return swcMemoryMappingHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwcMemoryMappingHeader_MemoryMapping() {
		return (EReference)swcMemoryMappingHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationInfo() {
		return generationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInfo_GeneratorName() {
		return (EAttribute)generationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInfo_GeneratorVersion() {
		return (EAttribute)generationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInfo_GenerationDate() {
		return (EAttribute)generationInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacro() {
		return macroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacro_SymbolName() {
		return (EAttribute)macroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmApi() {
		return schmApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmApi_ReturnValue() {
		return (EReference)schmApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmApi_Parent() {
		return (EReference)schmApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchmApi_IsInline() {
		return (EAttribute)schmApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSignalApiWrapper() {
		return comSignalApiWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalApiWrapper_DataParam() {
		return (EReference)comSignalApiWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalApiWrapper_Parent() {
		return (EReference)comSignalApiWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignalApiWrapper_SignalSymbolName() {
		return (EAttribute)comSignalApiWrapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComSignalApiWrapper_SignalGroupSymbolName() {
		return (EAttribute)comSignalApiWrapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComProxyFunction() {
		return comProxyFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComProxyFunction_Parent() {
		return (EReference)comProxyFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunction_IocReceiveSymbolName() {
		return (EAttribute)comProxyFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunction_SignalGroupSymbolName() {
		return (EAttribute)comProxyFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunction_BufferComProxySymbolName() {
		return (EAttribute)comProxyFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunction_BufferComMetaComplexDataSymbolName() {
		return (EAttribute)comProxyFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunction_ProxyDataTypeName() {
		return (EAttribute)comProxyFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComProxyFunction_IsGroup() {
		return (EAttribute)comProxyFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSendSignalApiWrapper() {
		return comSendSignalApiWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComReceiveSignalApiWrapper() {
		return comReceiveSignalApiWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmLifecycleApi() {
		return schmLifecycleApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmEnterApi() {
		return schmEnterApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmEnterApi_Operation() {
		return (EReference)schmEnterApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchmEnterApi_IsNoneExclude() {
		return (EAttribute)schmEnterApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmExitApi() {
		return schmExitApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmExitApi_Operation() {
		return (EReference)schmExitApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchmExitApi_IsNoneExclude() {
		return (EAttribute)schmExitApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmSwitchApi() {
		return schmSwitchApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmSwitchApi_ModeMachineInstance() {
		return (EReference)schmSwitchApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmSwitchApi_OsTaskEventTriggeredByMode() {
		return (EReference)schmSwitchApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmSwitchApi_ExecutableStartOperation() {
		return (EReference)schmSwitchApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTaskEventsTriggeredByMode() {
		return osTaskEventsTriggeredByModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTaskEventsTriggeredByMode_StartMode() {
		return (EReference)osTaskEventsTriggeredByModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsTaskEventsTriggeredByMode_OsTaskEvent() {
		return (EReference)osTaskEventsTriggeredByModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsTaskEvent() {
		return osTaskEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsTaskEvent_OsTaskId() {
		return (EAttribute)osTaskEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsTaskEvent_OsEventId() {
		return (EAttribute)osTaskEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsTaskEvent_OsTaskPriority() {
		return (EAttribute)osTaskEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeQueuedVariable() {
		return modeQueuedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeQueuedVariable_QueueType() {
		return (EReference)modeQueuedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmModeApi() {
		return schmModeApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmModeApi_ModeDeclarationGroup() {
		return (EReference)schmModeApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmModeApi_ModeMachineInstance() {
		return (EReference)schmModeApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleInterlinkHeader() {
		return moduleInterlinkHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkHeader_GlobalVariableGroup() {
		return (EReference)moduleInterlinkHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkHeader_SchmApiGroup() {
		return (EReference)moduleInterlinkHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkHeader_DependentExecutableEntityGroup() {
		return (EReference)moduleInterlinkHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkHeader_Constant() {
		return (EReference)moduleInterlinkHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmApiFileContentsGroup() {
		return schmApiFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmApiFileContentsGroup_SchmApi() {
		return (EReference)schmApiFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComSignalApiWrapperFileContentsGroup() {
		return comSignalApiWrapperFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComSignalApiWrapperFileContentsGroup_ComSignalApiWrapper() {
		return (EReference)comSignalApiWrapperFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComProxyFunctionFileContentsGroup() {
		return comProxyFunctionFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComProxyFunctionFileContentsGroup_ComProxyFunction() {
		return (EReference)comProxyFunctionFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleInterlinkTypeHeader() {
		return moduleInterlinkTypeHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkTypeHeader_Constant() {
		return (EReference)moduleInterlinkTypeHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkTypeHeader_ModeType() {
		return (EReference)moduleInterlinkTypeHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInterlinkTypeHeader_ModeDeclarationGroup() {
		return (EReference)moduleInterlinkTypeHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmLifecycleApiFileContentsGroup() {
		return schmLifecycleApiFileContentsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmLifecycleApiFileContentsGroup_SchmLifecycleApi() {
		return (EReference)schmLifecycleApiFileContentsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartedBswm() {
		return partedBswmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartedBswm_Parent() {
		return (EReference)partedBswmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartedBswm_DependentBswSchedulableEntity() {
		return (EReference)partedBswmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartedBswm_SchmApi() {
		return (EReference)partedBswmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartedBswm_Bswm() {
		return (EReference)partedBswmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartedBswm_BswMemoryMapping() {
		return (EReference)partedBswmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartedBswm_ModeMachineInstance() {
		return (EReference)partedBswmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBswm() {
		return bswmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswm_PartedBswm() {
		return (EReference)bswmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBswm_ModeDeclarationGroup() {
		return (EReference)bswmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBswm__GetSinglePartedBswm__Partition() {
		return bswmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmDeinitApi() {
		return schmDeinitApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmInitApi() {
		return schmInitApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmInitApi_Operation() {
		return (EReference)schmInitApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmInitApi_InitialExecutableStartOperation() {
		return (EReference)schmInitApiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmInitApi_InitialExecutableOsTaskEvent() {
		return (EReference)schmInitApiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmInitApi_InitTargetModeMachineInstance() {
		return (EReference)schmInitApiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglecoreSchmInitApi() {
		return singlecoreSchmInitApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulticoreSchmInitApi() {
		return multicoreSchmInitApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticoreSchmInitApi_CoreInitApiImpl() {
		return (EReference)multicoreSchmInitApiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchmCoreInitApiImpl() {
		return schmCoreInitApiImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchmCoreInitApiImpl_Parent() {
		return (EReference)schmCoreInitApiImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerType() {
		return pointerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointerType_Type() {
		return (EReference)pointerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerType_IsConstPointer() {
		return (EAttribute)pointerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerType_IsConstTarget() {
		return (EAttribute)pointerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinitionPointerType() {
		return redefinitionPointerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinitionType() {
		return redefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinitionType_SourceType() {
		return (EReference)redefinitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinitionType__GetLeafType() {
		return redefinitionTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterPassTypeEnum() {
		return parameterPassTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionEnum() {
		return parameterDirectionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignednessEnum() {
		return signednessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstantValueTypeEnum() {
		return constantValueTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerbatimString() {
		return verbatimStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCIdentifier() {
		return cIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleFactory getModuleFactory() {
		return (ModuleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		moduleObjectEClass = createEClass(MODULE_OBJECT);
		createEReference(moduleObjectEClass, MODULE_OBJECT__SOURCE);
		createEReference(moduleObjectEClass, MODULE_OBJECT__SINGLE_SOURCE);
		createEAttribute(moduleObjectEClass, MODULE_OBJECT__ROLE_NAME);

		moduleReferrableEClass = createEClass(MODULE_REFERRABLE);
		createEAttribute(moduleReferrableEClass, MODULE_REFERRABLE__ID);

		operationEClass = createEClass(OPERATION);

		executableEntityEClass = createEClass(EXECUTABLE_ENTITY);
		createEReference(executableEntityEClass, EXECUTABLE_ENTITY__ROLE_PARAM);
		createEAttribute(executableEntityEClass, EXECUTABLE_ENTITY__IS_NO_MOCK);

		bswSchedulableEntityEClass = createEClass(BSW_SCHEDULABLE_ENTITY);
		createEReference(bswSchedulableEntityEClass, BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM);

		runnableEntityEClass = createEClass(RUNNABLE_ENTITY);
		createEAttribute(runnableEntityEClass, RUNNABLE_ENTITY__HAS_RETURN_VALUE);

		rteApiEClass = createEClass(RTE_API);
		createEReference(rteApiEClass, RTE_API__PARENT);
		createEAttribute(rteApiEClass, RTE_API__API_MAPPING_NAME);
		createEAttribute(rteApiEClass, RTE_API__IS_CONNECTED);
		createEAttribute(rteApiEClass, RTE_API__IS_INLINE);
		createEReference(rteApiEClass, RTE_API__RETURN_VALUE);
		createEReference(rteApiEClass, RTE_API__INLINE_CONSTANT);
		createEReference(rteApiEClass, RTE_API__INLINE_GLOBAL_VARIABLE);
		createEReference(rteApiEClass, RTE_API__INLINE_RUNNABLE_ENTITY);

		writeApiEClass = createEClass(WRITE_API);
		createEReference(writeApiEClass, WRITE_API__OPERATION);
		createEReference(writeApiEClass, WRITE_API__DATA_PARAM);
		createEAttribute(writeApiEClass, WRITE_API__NEEDS_CHECK_ARG);

		sendOperationEClass = createEClass(SEND_OPERATION);
		createEReference(sendOperationEClass, SEND_OPERATION__SEND_VALUE);
		createEReference(sendOperationEClass, SEND_OPERATION__SEND_STATUS);
		createEReference(sendOperationEClass, SEND_OPERATION__EXCLUDE_OPERATION);
		createEReference(sendOperationEClass, SEND_OPERATION__RETURN_VARIABLE);
		createEAttribute(sendOperationEClass, SEND_OPERATION__IS_WRITE_API);

		rteBufferNonqueuedSendOperationEClass = createEClass(RTE_BUFFER_NONQUEUED_SEND_OPERATION);
		createEReference(rteBufferNonqueuedSendOperationEClass, RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE);
		createEReference(rteBufferNonqueuedSendOperationEClass, RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION);

		rteBufferNonqueuedReadOperationEClass = createEClass(RTE_BUFFER_NONQUEUED_READ_OPERATION);
		createEReference(rteBufferNonqueuedReadOperationEClass, RTE_BUFFER_NONQUEUED_READ_OPERATION__ACCESS_VARIABLE);

		readOperationEClass = createEClass(READ_OPERATION);
		createEReference(readOperationEClass, READ_OPERATION__INVALID_VALUE_CONSTANT);
		createEReference(readOperationEClass, READ_OPERATION__READ_VALUE_VARIABLE);
		createEReference(readOperationEClass, READ_OPERATION__READ_STATUS_VARIABLE);
		createEReference(readOperationEClass, READ_OPERATION__EXCLUDE_OPERATION);

		readApiEClass = createEClass(READ_API);
		createEReference(readApiEClass, READ_API__OPERATION);
		createEReference(readApiEClass, READ_API__DATA_PARAM);

		irvReadOperationEClass = createEClass(IRV_READ_OPERATION);
		createEReference(irvReadOperationEClass, IRV_READ_OPERATION__ACCESS_VARIABLE);
		createEReference(irvReadOperationEClass, IRV_READ_OPERATION__READ_VALUE_VARIABLE);
		createEReference(irvReadOperationEClass, IRV_READ_OPERATION__EXCLUDE_OPERATION);

		irvReadApiEClass = createEClass(IRV_READ_API);
		createEReference(irvReadApiEClass, IRV_READ_API__OPERATION);
		createEReference(irvReadApiEClass, IRV_READ_API__DATA_PARAM);

		irvWriteOperationEClass = createEClass(IRV_WRITE_OPERATION);
		createEReference(irvWriteOperationEClass, IRV_WRITE_OPERATION__ACCESS_VARIABLE);
		createEReference(irvWriteOperationEClass, IRV_WRITE_OPERATION__WRITE_VALUE_VARIABLE);
		createEReference(irvWriteOperationEClass, IRV_WRITE_OPERATION__EXCLUDE_OPERATION);

		irvWriteApiEClass = createEClass(IRV_WRITE_API);
		createEReference(irvWriteApiEClass, IRV_WRITE_API__OPERATION);
		createEReference(irvWriteApiEClass, IRV_WRITE_API__DATA_PARAM);

		rteBufferVariableSetEClass = createEClass(RTE_BUFFER_VARIABLE_SET);
		createEReference(rteBufferVariableSetEClass, RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE);
		createEReference(rteBufferVariableSetEClass, RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE);
		createEReference(rteBufferVariableSetEClass, RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE);
		createEReference(rteBufferVariableSetEClass, RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE);

		globalVariableSetEClass = createEClass(GLOBAL_VARIABLE_SET);
		createEReference(globalVariableSetEClass, GLOBAL_VARIABLE_SET__GLOBAL_VARIABLE);

		comProxyFunctionTableVariableEClass = createEClass(COM_PROXY_FUNCTION_TABLE_VARIABLE);

		rteSourceEClass = createEClass(RTE_SOURCE);
		createEReference(rteSourceEClass, RTE_SOURCE__GLOBAL_VARIABLE_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__RTE_API_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__RTE_LIFECYCLE_API_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__TASK_BODY_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__COM_CALLBACK_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__TRUSTED_FUNCTION_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__SOURCE_MACRO);
		createEReference(rteSourceEClass, RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__SCHM_API_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP);
		createEReference(rteSourceEClass, RTE_SOURCE__COM_PROXY_FUNCTION_GROUP);

		rteModuleEClass = createEClass(RTE_MODULE);
		createEReference(rteModuleEClass, RTE_MODULE__DEPENDENT_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__BSW_MEMORY_MAPPING_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__SWC_MEMORY_MAPPING_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_TYPE_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_APPLICATION_TYPE_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_APPLICATION_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__MODULE_INTERLINK_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_LIFECYCLE_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_CONFIGURATION_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_VFB_TRACE_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_CALLBACK_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_UTILITY_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_BSW_API_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_COMMON_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_PARTITION_HEADER);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_COMMON_SOURCE);
		createEReference(rteModuleEClass, RTE_MODULE__RTE_PARTITION_SOURCE);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEReference(globalVariableEClass, GLOBAL_VARIABLE__INIT_VALUE_CONSTANT);
		createEReference(globalVariableEClass, GLOBAL_VARIABLE__MEMORY_MAPPING);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__INIT_AT_DEFINITION);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__INIT_WITH_CONSTANT_VALUE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__HAS_CONST);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__HAS_STATIC);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FILE_NAME);
		createEReference(fileEClass, FILE__GENERATION_INFO);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PASS_TYPE);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEAttribute(parameterEClass, PARAMETER__HAS_CONST);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__SYMBOL_NAME);
		createEAttribute(typeEClass, TYPE__IS_ANONYMOUS);
		createEAttribute(typeEClass, TYPE__SIGNEDNESS);
		createEAttribute(typeEClass, TYPE__ORIGINAL_TYPE_SYMBOL_NAME);
		createEAttribute(typeEClass, TYPE__SIZE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);
		createEReference(localVariableEClass, LOCAL_VARIABLE__INIT_VALUE_CONSTANT);
		createEReference(localVariableEClass, LOCAL_VARIABLE__PARENT);

		rteApplicationHeaderEClass = createEClass(RTE_APPLICATION_HEADER);
		createEAttribute(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__HAS_INLINE_API);
		createEReference(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__SOURCE_MACRO);
		createEReference(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP);
		createEReference(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__RTE_API_GROUP);
		createEReference(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP);
		createEReference(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__CONSTANT);
		createEReference(rteApplicationHeaderEClass, RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RETURN_TYPE);
		createEReference(functionEClass, FUNCTION__PARAM);
		createEReference(functionEClass, FUNCTION__LOCAL_VARIABLE);
		createEReference(functionEClass, FUNCTION__LOCAL_TYPE);
		createEReference(functionEClass, FUNCTION__MEMORY_MAPPING);
		createEAttribute(functionEClass, FUNCTION__SYMBOL_NAME);

		logicalCompartmentEClass = createEClass(LOGICAL_COMPARTMENT);
		createEAttribute(logicalCompartmentEClass, LOGICAL_COMPARTMENT__COMPARTMENT_NAME);

		rteEClass = createEClass(RTE);
		createEReference(rteEClass, RTE__CORE);
		createEReference(rteEClass, RTE__BSWM);
		createEReference(rteEClass, RTE__GENERATION_INFO);
		createEReference(rteEClass, RTE__DEPENDENT_TYPE);
		createEReference(rteEClass, RTE__DEPENDENT_CONSTANT);
		createEReference(rteEClass, RTE__DEPENDENT_OS_API);
		createEReference(rteEClass, RTE__DEPENDENT_IOC_COMMUNICATION);
		createEReference(rteEClass, RTE__DEPENDENT_COM_API);
		createEReference(rteEClass, RTE__IOC_INIT_VALUE_CONSTANT);
		createEReference(rteEClass, RTE__IOC_INIT_VALUE_VARIABLE_SET);
		createEReference(rteEClass, RTE__RTE_MEMORY_MAPPING);
		createEReference(rteEClass, RTE__IMPLEMENTATION_DATA_TYPE);
		createEReference(rteEClass, RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE);
		createEReference(rteEClass, RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE);
		createEReference(rteEClass, RTE__CS_TF_PARAM_TYPE);
		createEReference(rteEClass, RTE__SR_RTE_SEND_TF_PARAM_TYPE);
		createEReference(rteEClass, RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT);
		createEReference(rteEClass, RTE__SR_RTE_BUFFER_QUEUE_TYPE);
		createEReference(rteEClass, RTE__IMMEDIATE_CONSTANT);
		createEReference(rteEClass, RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION);
		createEReference(rteEClass, RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY);
		createEReference(rteEClass, RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY);
		createEReference(rteEClass, RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY);
		createEReference(rteEClass, RTE__COM_CALLBACK);
		createEReference(rteEClass, RTE__RTE_START_API);
		createEReference(rteEClass, RTE__RTE_STOP_API);
		createEReference(rteEClass, RTE__SCHM_INIT_API);
		createEReference(rteEClass, RTE__SCHM_DEINIT_API);

		coreEClass = createEClass(CORE);
		createEReference(coreEClass, CORE__PARTITION);
		createEAttribute(coreEClass, CORE__CORE_ID);
		createEAttribute(coreEClass, CORE__IS_MASTER_CORE);
		createEReference(coreEClass, CORE__RTE_CORE_START_API_IMPL);
		createEReference(coreEClass, CORE__SCHM_CORE_INIT_API_IMPL);

		partitionEClass = createEClass(PARTITION);
		createEReference(partitionEClass, PARTITION__PARENT);
		createEReference(partitionEClass, PARTITION__SWC);
		createEReference(partitionEClass, PARTITION__PARTED_BSWM);
		createEAttribute(partitionEClass, PARTITION__IS_BSW_PARTITION);
		createEReference(partitionEClass, PARTITION__OS_TRUSTED_MACRO);
		createEReference(partitionEClass, PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET);
		createEReference(partitionEClass, PARTITION__COM_SIGNAL_API_WRAPPER);
		createEReference(partitionEClass, PARTITION__COM_SIGNAL_API_ALIAS);
		createEReference(partitionEClass, PARTITION__COM_META_DATA_VARIABLE_SET);
		createEReference(partitionEClass, PARTITION__COM_PROXY_FUNCTION);
		createEReference(partitionEClass, PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT);
		createEReference(partitionEClass, PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT);
		createEReference(partitionEClass, PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE);
		createEReference(partitionEClass, PARTITION__COM_PROXY_BUFFER_VARIABLE_SET);
		createEReference(partitionEClass, PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT);
		createEReference(partitionEClass, PARTITION__SR_RTE_BUFFER_VARIABLE_SET);
		createEReference(partitionEClass, PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE);
		createEReference(partitionEClass, PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION);
		createEReference(partitionEClass, PARTITION__SR_FILTER_CONSTANT);
		createEReference(partitionEClass, PARTITION__SR_FILTER_OLD_VALUE_VARIABLE);
		createEReference(partitionEClass, PARTITION__SR_FILTER_OCCURRENCE_VARIABLE);
		createEReference(partitionEClass, PARTITION__CS_TF_ARGC_CONSTANT);
		createEReference(partitionEClass, PARTITION__CS_TF_OPID_CONSTANT);
		createEReference(partitionEClass, PARTITION__CS_TRUSTED_FUNCTION);
		createEReference(partitionEClass, PARTITION__ENTITY_START_VARIABLE);
		createEReference(partitionEClass, PARTITION__ENTITY_START_CONSTANT);
		createEReference(partitionEClass, PARTITION__TASK_BODY);
		createEReference(partitionEClass, PARTITION__RESTART_PARTITION_API);
		createEReference(partitionEClass, PARTITION__PARTITION_TERMINATED_API);
		createEReference(partitionEClass, PARTITION__PARTITION_RESTARTING_API);

		swcEClass = createEClass(SWC);
		createEReference(swcEClass, SWC__PARENT);
		createEReference(swcEClass, SWC__SWC_MEMORY_MAPPING);
		createEReference(swcEClass, SWC__DEPENDENT_RUNNABLE_ENTITY);
		createEReference(swcEClass, SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY);
		createEReference(swcEClass, SWC__RTE_API);
		createEReference(swcEClass, SWC__API_ENUM_CONSTANT);
		createEReference(swcEClass, SWC__API_UPPER_LOWER_LIMIT_CONSTANT);
		createEReference(swcEClass, SWC__SR_API_INIT_VALUE_CONSTANT);
		createEReference(swcEClass, SWC__SR_IMPL_INIT_VALUE_CONSTANT);
		createEReference(swcEClass, SWC__SR_IMPL_INVALID_VALUE_CONSTANT);
		createEReference(swcEClass, SWC__SR_FILTER_CONSTANT);
		createEReference(swcEClass, SWC__CS_API_APPLICATION_ERROR_CONSTANT);
		createEReference(swcEClass, SWC__CS_PORT_ARG_VALUE_CONSTANT);
		createEReference(swcEClass, SWC__CS_PORT_ARG_VALUE_VARIABLE);
		createEReference(swcEClass, SWC__IRV_BUFFER_INIT_VALUE_CONSTANT);
		createEReference(swcEClass, SWC__IRV_BUFFER_VARIABLE_SET);

		rteHeaderEClass = createEClass(RTE_HEADER);

		rteBswApiHeaderEClass = createEClass(RTE_BSW_API_HEADER);
		createEReference(rteBswApiHeaderEClass, RTE_BSW_API_HEADER__IOC_API);

		rteLifecycleHeaderEClass = createEClass(RTE_LIFECYCLE_HEADER);
		createEReference(rteLifecycleHeaderEClass, RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP);
		createEReference(rteLifecycleHeaderEClass, RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP);

		rteApplicationTypeHeaderEClass = createEClass(RTE_APPLICATION_TYPE_HEADER);
		createEReference(rteApplicationTypeHeaderEClass, RTE_APPLICATION_TYPE_HEADER__CONSTANT);

		rteVfbTraceHeaderEClass = createEClass(RTE_VFB_TRACE_HEADER);

		rteConfigurationHeaderEClass = createEClass(RTE_CONFIGURATION_HEADER);

		rteCallbackHeaderEClass = createEClass(RTE_CALLBACK_HEADER);
		createEReference(rteCallbackHeaderEClass, RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP);

		rteTypeHeaderEClass = createEClass(RTE_TYPE_HEADER);
		createEReference(rteTypeHeaderEClass, RTE_TYPE_HEADER__RTE_TYPE);
		createEReference(rteTypeHeaderEClass, RTE_TYPE_HEADER__RTE_TYPE_CONSTANT);
		createEAttribute(rteTypeHeaderEClass, RTE_TYPE_HEADER__PROVIDES_SIGNAL_GROUP_TRANSMISSION);

		invalidateApiEClass = createEClass(INVALIDATE_API);
		createEReference(invalidateApiEClass, INVALIDATE_API__OPERATION);

		iocNonqueuedSendOperationEClass = createEClass(IOC_NONQUEUED_SEND_OPERATION);
		createEReference(iocNonqueuedSendOperationEClass, IOC_NONQUEUED_SEND_OPERATION__ACCESS_API);

		directComSendOperationEClass = createEClass(DIRECT_COM_SEND_OPERATION);

		trustedFunctionRteOperationEClass = createEClass(TRUSTED_FUNCTION_RTE_OPERATION);
		createEReference(trustedFunctionRteOperationEClass, TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE);

		trustedFunctionRteSendOperationEClass = createEClass(TRUSTED_FUNCTION_RTE_SEND_OPERATION);
		createEReference(trustedFunctionRteSendOperationEClass, TRUSTED_FUNCTION_RTE_SEND_OPERATION__TYPE);
		createEAttribute(trustedFunctionRteSendOperationEClass, TRUSTED_FUNCTION_RTE_SEND_OPERATION__SR_SEND_TF_SYMBOL_NAME);
		createEReference(trustedFunctionRteSendOperationEClass, TRUSTED_FUNCTION_RTE_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE);
		createEAttribute(trustedFunctionRteSendOperationEClass, TRUSTED_FUNCTION_RTE_SEND_OPERATION__IS_GROUP);

		trustedFunctionRteBufferWriteSendOperationEClass = createEClass(TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION);
		createEReference(trustedFunctionRteBufferWriteSendOperationEClass, TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION);

		trustedFunctionComSendOperationEClass = createEClass(TRUSTED_FUNCTION_COM_SEND_OPERATION);
		createEReference(trustedFunctionComSendOperationEClass, TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE);
		createEReference(trustedFunctionComSendOperationEClass, TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION);
		createEReference(trustedFunctionComSendOperationEClass, TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE);
		createEAttribute(trustedFunctionComSendOperationEClass, TRUSTED_FUNCTION_COM_SEND_OPERATION__IS_GROUP);

		immediateProxyComSendOperationEClass = createEClass(IMMEDIATE_PROXY_COM_SEND_OPERATION);
		createEReference(immediateProxyComSendOperationEClass, IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API);

		periodicProxyComSendOperationEClass = createEClass(PERIODIC_PROXY_COM_SEND_OPERATION);

		iocNonqueuedReadOperationEClass = createEClass(IOC_NONQUEUED_READ_OPERATION);
		createEReference(iocNonqueuedReadOperationEClass, IOC_NONQUEUED_READ_OPERATION__ACCESS_API);

		comReadOperationEClass = createEClass(COM_READ_OPERATION);
		createEReference(comReadOperationEClass, COM_READ_OPERATION__ACCESS_API);
		createEReference(comReadOperationEClass, COM_READ_OPERATION__TEMP_RETURN_VARIABLE);

		iocNonqueuedCommunicationEClass = createEClass(IOC_NONQUEUED_COMMUNICATION);
		createEReference(iocNonqueuedCommunicationEClass, IOC_NONQUEUED_COMMUNICATION__WRITE_API);
		createEReference(iocNonqueuedCommunicationEClass, IOC_NONQUEUED_COMMUNICATION__READ_API);
		createEReference(iocNonqueuedCommunicationEClass, IOC_NONQUEUED_COMMUNICATION__INIT_VALUE);
		createEReference(iocNonqueuedCommunicationEClass, IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE);

		iocWriteApiEClass = createEClass(IOC_WRITE_API);
		createEReference(iocWriteApiEClass, IOC_WRITE_API__PARENT);

		iocReadApiEClass = createEClass(IOC_READ_API);

		comSendSignalApiEClass = createEClass(COM_SEND_SIGNAL_API);

		comReceiveSignalApiEClass = createEClass(COM_RECEIVE_SIGNAL_API);

		comReceiveCallbackEClass = createEClass(COM_RECEIVE_CALLBACK);
		createEReference(comReceiveCallbackEClass, COM_RECEIVE_CALLBACK__OPERATION);
		createEReference(comReceiveCallbackEClass, COM_RECEIVE_CALLBACK__DATA_VARIABLE);
		createEReference(comReceiveCallbackEClass, COM_RECEIVE_CALLBACK__ACCESS_API);

		comSendOperationEClass = createEClass(COM_SEND_OPERATION);
		createEReference(comSendOperationEClass, COM_SEND_OPERATION__ACCESS_API);
		createEReference(comSendOperationEClass, COM_SEND_OPERATION__TEMP_RETURN_VARIABLE);

		comCallbackEClass = createEClass(COM_CALLBACK);

		comReceiveTimeoutCallbackEClass = createEClass(COM_RECEIVE_TIMEOUT_CALLBACK);
		createEReference(comReceiveTimeoutCallbackEClass, COM_RECEIVE_TIMEOUT_CALLBACK__OPERATION);
		createEReference(comReceiveTimeoutCallbackEClass, COM_RECEIVE_TIMEOUT_CALLBACK__DATA_VARIABLE);
		createEReference(comReceiveTimeoutCallbackEClass, COM_RECEIVE_TIMEOUT_CALLBACK__ACCESS_API);

		comInvalidateCallbackEClass = createEClass(COM_INVALIDATE_CALLBACK);
		createEReference(comInvalidateCallbackEClass, COM_INVALIDATE_CALLBACK__OPERATION);
		createEReference(comInvalidateCallbackEClass, COM_INVALIDATE_CALLBACK__FILTER_RESULT_VARIABLE);

		comSendSignalProxyEntityEClass = createEClass(COM_SEND_SIGNAL_PROXY_ENTITY);
		createEReference(comSendSignalProxyEntityEClass, COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION);
		createEReference(comSendSignalProxyEntityEClass, COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION);

		comSendSignalImmediateEntityEClass = createEClass(COM_SEND_SIGNAL_IMMEDIATE_ENTITY);

		comSendSignalPeriodicEntityEClass = createEClass(COM_SEND_SIGNAL_PERIODIC_ENTITY);

		filterOperationEClass = createEClass(FILTER_OPERATION);
		createEReference(filterOperationEClass, FILTER_OPERATION__FILTER_RESULT_VARIABLE);

		maskedNewDiffersMaskedOldFilterOperationEClass = createEClass(MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION);
		createEReference(maskedNewDiffersMaskedOldFilterOperationEClass, MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE);
		createEReference(maskedNewDiffersMaskedOldFilterOperationEClass, MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK);

		maskedNewDiffersXFilterOperationEClass = createEClass(MASKED_NEW_DIFFERS_XFILTER_OPERATION);
		createEReference(maskedNewDiffersXFilterOperationEClass, MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK);
		createEReference(maskedNewDiffersXFilterOperationEClass, MASKED_NEW_DIFFERS_XFILTER_OPERATION__X);

		newIsWithinFilterOperationEClass = createEClass(NEW_IS_WITHIN_FILTER_OPERATION);
		createEReference(newIsWithinFilterOperationEClass, NEW_IS_WITHIN_FILTER_OPERATION__MIN);
		createEReference(newIsWithinFilterOperationEClass, NEW_IS_WITHIN_FILTER_OPERATION__MAX);

		newIsOutsideFilterOperationEClass = createEClass(NEW_IS_OUTSIDE_FILTER_OPERATION);
		createEReference(newIsOutsideFilterOperationEClass, NEW_IS_OUTSIDE_FILTER_OPERATION__MIN);
		createEReference(newIsOutsideFilterOperationEClass, NEW_IS_OUTSIDE_FILTER_OPERATION__MAX);

		maskedNewEqualsXFilterOperationEClass = createEClass(MASKED_NEW_EQUALS_XFILTER_OPERATION);
		createEReference(maskedNewEqualsXFilterOperationEClass, MASKED_NEW_EQUALS_XFILTER_OPERATION__MASK);
		createEReference(maskedNewEqualsXFilterOperationEClass, MASKED_NEW_EQUALS_XFILTER_OPERATION__X);

		oneEveryNFilterOperationEClass = createEClass(ONE_EVERY_NFILTER_OPERATION);
		createEReference(oneEveryNFilterOperationEClass, ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE);
		createEReference(oneEveryNFilterOperationEClass, ONE_EVERY_NFILTER_OPERATION__PERIOD);
		createEReference(oneEveryNFilterOperationEClass, ONE_EVERY_NFILTER_OPERATION__OFFSET);

		rteCoreStartApiImplEClass = createEClass(RTE_CORE_START_API_IMPL);
		createEReference(rteCoreStartApiImplEClass, RTE_CORE_START_API_IMPL__OPERATION);
		createEReference(rteCoreStartApiImplEClass, RTE_CORE_START_API_IMPL__PARENT);

		rteStopApiEClass = createEClass(RTE_STOP_API);

		restartPartitionApiEClass = createEClass(RESTART_PARTITION_API);
		createEReference(restartPartitionApiEClass, RESTART_PARTITION_API__OPERATION);

		partitionRestartingApiEClass = createEClass(PARTITION_RESTARTING_API);
		createEReference(partitionRestartingApiEClass, PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION);

		partitionTerminatedApiEClass = createEClass(PARTITION_TERMINATED_API);
		createEReference(partitionTerminatedApiEClass, PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION);

		rteLifecycleApiEClass = createEClass(RTE_LIFECYCLE_API);

		sendApiEClass = createEClass(SEND_API);
		createEReference(sendApiEClass, SEND_API__OPERATION);
		createEReference(sendApiEClass, SEND_API__DATA_PARAM);
		createEReference(sendApiEClass, SEND_API__STATUS_VARIABLE);
		createEReference(sendApiEClass, SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE);
		createEReference(sendApiEClass, SEND_API__FILTER_RESULT_VARIABLE);
		createEAttribute(sendApiEClass, SEND_API__NEEDS_CHECK_ARG);

		receiveApiEClass = createEClass(RECEIVE_API);
		createEReference(receiveApiEClass, RECEIVE_API__OPERATION);
		createEReference(receiveApiEClass, RECEIVE_API__DATA_PARAM);
		createEReference(receiveApiEClass, RECEIVE_API__STATUS_VARIABLE);

		rteBufferQueuedSendOperationEClass = createEClass(RTE_BUFFER_QUEUED_SEND_OPERATION);
		createEReference(rteBufferQueuedSendOperationEClass, RTE_BUFFER_QUEUED_SEND_OPERATION__ACCESS_VARIABLE);
		createEReference(rteBufferQueuedSendOperationEClass, RTE_BUFFER_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE);
		createEReference(rteBufferQueuedSendOperationEClass, RTE_BUFFER_QUEUED_SEND_OPERATION__TYPE);

		rteBufferQueuedVariableEClass = createEClass(RTE_BUFFER_QUEUED_VARIABLE);
		createEReference(rteBufferQueuedVariableEClass, RTE_BUFFER_QUEUED_VARIABLE__QUEUE_TYPE);

		rteBufferQueuedReadOperationEClass = createEClass(RTE_BUFFER_QUEUED_READ_OPERATION);
		createEReference(rteBufferQueuedReadOperationEClass, RTE_BUFFER_QUEUED_READ_OPERATION__ACCESS_VARIABLE);

		iocQueuedCommunicationEClass = createEClass(IOC_QUEUED_COMMUNICATION);
		createEReference(iocQueuedCommunicationEClass, IOC_QUEUED_COMMUNICATION__SEND_API);
		createEReference(iocQueuedCommunicationEClass, IOC_QUEUED_COMMUNICATION__RECEIVE_API);
		createEReference(iocQueuedCommunicationEClass, IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API);

		iocReceiveApiEClass = createEClass(IOC_RECEIVE_API);

		iocSendApiEClass = createEClass(IOC_SEND_API);

		iocSendOperationEClass = createEClass(IOC_SEND_OPERATION);
		createEReference(iocSendOperationEClass, IOC_SEND_OPERATION__TYPE);

		iocQueuedSendOperationEClass = createEClass(IOC_QUEUED_SEND_OPERATION);
		createEReference(iocQueuedSendOperationEClass, IOC_QUEUED_SEND_OPERATION__ACCESS_API);
		createEReference(iocQueuedSendOperationEClass, IOC_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE);

		iocQueuedReadOperationEClass = createEClass(IOC_QUEUED_READ_OPERATION);
		createEReference(iocQueuedReadOperationEClass, IOC_QUEUED_READ_OPERATION__ACCESS_API);
		createEReference(iocQueuedReadOperationEClass, IOC_QUEUED_READ_OPERATION__TEMP_RETURN_VARIABLE);

		callApiEClass = createEClass(CALL_API);
		createEReference(callApiEClass, CALL_API__OPERATION);
		createEReference(callApiEClass, CALL_API__OPERATION_PARAM);
		createEReference(callApiEClass, CALL_API__PORT_ARG_VALUE);
		createEReference(callApiEClass, CALL_API__RETURN_VARIABLE);

		tfCallApiEClass = createEClass(TF_CALL_API);
		createEAttribute(tfCallApiEClass, TF_CALL_API__CS_TF_PARAM_TYPE_NAME);
		createEAttribute(tfCallApiEClass, TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME);
		createEAttribute(tfCallApiEClass, TF_CALL_API__CS_TF_OPID_CONSTANT_NAME);
		createEAttribute(tfCallApiEClass, TF_CALL_API__CS_TF_NAME);
		createEAttribute(tfCallApiEClass, TF_CALL_API__NEEDS_CHECK_ARG);

		executableStartOperationEClass = createEClass(EXECUTABLE_START_OPERATION);
		createEReference(executableStartOperationEClass, EXECUTABLE_START_OPERATION__START_EXECUTABLE);
		createEReference(executableStartOperationEClass, EXECUTABLE_START_OPERATION__RIEA_EXCLUDE_OPERATION);
		createEReference(executableStartOperationEClass, EXECUTABLE_START_OPERATION__DISABLED_IN_MODE);

		disabledInModeEClass = createEClass(DISABLED_IN_MODE);
		createEReference(disabledInModeEClass, DISABLED_IN_MODE__DISABLED_MODE);
		createEReference(disabledInModeEClass, DISABLED_IN_MODE__MODE_MACHINE_INSTANCE);

		excludeOperationEClass = createEClass(EXCLUDE_OPERATION);

		allInterruptBlockExcludeOperationEClass = createEClass(ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION);

		osInterruptBlockExcludeOperationEClass = createEClass(OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION);

		osSpinlockExcludeOperationEClass = createEClass(OS_SPINLOCK_EXCLUDE_OPERATION);
		createEAttribute(osSpinlockExcludeOperationEClass, OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID);

		osResourceExcludeOperationEClass = createEClass(OS_RESOURCE_EXCLUDE_OPERATION);
		createEAttribute(osResourceExcludeOperationEClass, OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID);

		noneExcludeOperationEClass = createEClass(NONE_EXCLUDE_OPERATION);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__SYMBOL_NAME);
		createEAttribute(constantEClass, CONSTANT__EXTERNAL_SYMBOL_NAME);
		createEReference(constantEClass, CONSTANT__TYPE);
		createEAttribute(constantEClass, CONSTANT__VALUE);
		createEAttribute(constantEClass, CONSTANT__CONSTANT_VALUE_TYPE);
		createEReference(constantEClass, CONSTANT__MEMBER);
		createEAttribute(constantEClass, CONSTANT__REPRESENTED_VARIABLE_NAME);

		constantMemberEClass = createEClass(CONSTANT_MEMBER);
		createEReference(constantMemberEClass, CONSTANT_MEMBER__PARENT);

		rteEnterApiEClass = createEClass(RTE_ENTER_API);
		createEReference(rteEnterApiEClass, RTE_ENTER_API__OPERATION);
		createEAttribute(rteEnterApiEClass, RTE_ENTER_API__IS_NONE_EXCLUDE);

		rteExitApiEClass = createEClass(RTE_EXIT_API);
		createEReference(rteExitApiEClass, RTE_EXIT_API__OPERATION);
		createEAttribute(rteExitApiEClass, RTE_EXIT_API__IS_NONE_EXCLUDE);

		osTaskActivationExecutableTaskBodyEClass = createEClass(OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY);
		createEReference(osTaskActivationExecutableTaskBodyEClass, OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__OPERATION);

		osEventSetExecutableTaskBodyEClass = createEClass(OS_EVENT_SET_EXECUTABLE_TASK_BODY);
		createEReference(osEventSetExecutableTaskBodyEClass, OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION);
		createEAttribute(osEventSetExecutableTaskBodyEClass, OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID);
		createEAttribute(osEventSetExecutableTaskBodyEClass, OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID);
		createEReference(osEventSetExecutableTaskBodyEClass, OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE);

		osTaskActivationOperationEClass = createEClass(OS_TASK_ACTIVATION_OPERATION);

		osEventSetActivationOperationEClass = createEClass(OS_EVENT_SET_ACTIVATION_OPERATION);
		createEAttribute(osEventSetActivationOperationEClass, OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID);

		contextActivationOperationEClass = createEClass(CONTEXT_ACTIVATION_OPERATION);
		createEReference(contextActivationOperationEClass, CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION);
		createEReference(contextActivationOperationEClass, CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION);
		createEReference(contextActivationOperationEClass, CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION);

		timingTriggeringExecutableStartOperationEClass = createEClass(TIMING_TRIGGERING_EXECUTABLE_START_OPERATION);
		createEReference(timingTriggeringExecutableStartOperationEClass, TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT);
		createEReference(timingTriggeringExecutableStartOperationEClass, TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT);
		createEReference(timingTriggeringExecutableStartOperationEClass, TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT);
		createEReference(timingTriggeringExecutableStartOperationEClass, TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE);
		createEReference(timingTriggeringExecutableStartOperationEClass, TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE);

		modeSwitchTriggeringExecutableStartOperationEClass = createEClass(MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION);
		createEReference(modeSwitchTriggeringExecutableStartOperationEClass, MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE);

		cycleCountupOperationEClass = createEClass(CYCLE_COUNTUP_OPERATION);
		createEReference(cycleCountupOperationEClass, CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE);
		createEReference(cycleCountupOperationEClass, CYCLE_COUNTUP_OPERATION__MAX_CONSTANT);

		startOffsetCountupOperationEClass = createEClass(START_OFFSET_COUNTUP_OPERATION);
		createEReference(startOffsetCountupOperationEClass, START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE);
		createEReference(startOffsetCountupOperationEClass, START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT);

		taskBodyEClass = createEClass(TASK_BODY);
		createEAttribute(taskBodyEClass, TASK_BODY__OS_TASK_ID);

		iocEmptyQueueApiEClass = createEClass(IOC_EMPTY_QUEUE_API);

		comApiEClass = createEClass(COM_API);
		createEAttribute(comApiEClass, COM_API__IS_SIGNAL_GROUP);
		createEAttribute(comApiEClass, COM_API__COM_SIGNAL_SYMBOL_NAME);

		iocApiEClass = createEClass(IOC_API);
		createEAttribute(iocApiEClass, IOC_API__MAPPING_NAME);

		valueEClass = createEClass(VALUE);

		trustedFunctionEClass = createEClass(TRUSTED_FUNCTION);
		createEAttribute(trustedFunctionEClass, TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX);

		comSendSignalTrustedFunctionEClass = createEClass(COM_SEND_SIGNAL_TRUSTED_FUNCTION);
		createEAttribute(comSendSignalTrustedFunctionEClass, COM_SEND_SIGNAL_TRUSTED_FUNCTION__IS_GROUP);
		createEAttribute(comSendSignalTrustedFunctionEClass, COM_SEND_SIGNAL_TRUSTED_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME);

		osSetEventApiEClass = createEClass(OS_SET_EVENT_API);
		createEAttribute(osSetEventApiEClass, OS_SET_EVENT_API__OS_TASK_ID);
		createEAttribute(osSetEventApiEClass, OS_SET_EVENT_API__OS_EVENT_ID);

		osApiEClass = createEClass(OS_API);

		comSendSignalImmediateTaskBodyEClass = createEClass(COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY);
		createEReference(comSendSignalImmediateTaskBodyEClass, COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY);
		createEAttribute(comSendSignalImmediateTaskBodyEClass, COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);
		createEReference(variableEClass, VARIABLE__MEMBER);
		createEAttribute(variableEClass, VARIABLE__SYMBOL_NAME);

		primitiveComSendProxyOperationEClass = createEClass(PRIMITIVE_COM_SEND_PROXY_OPERATION);
		createEReference(primitiveComSendProxyOperationEClass, PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE);
		createEReference(primitiveComSendProxyOperationEClass, PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API);
		createEReference(primitiveComSendProxyOperationEClass, PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE);

		complexComSendProxyOperationEClass = createEClass(COMPLEX_COM_SEND_PROXY_OPERATION);
		createEReference(complexComSendProxyOperationEClass, COMPLEX_COM_SEND_PROXY_OPERATION__ACCESS_API);
		createEAttribute(complexComSendProxyOperationEClass, COMPLEX_COM_SEND_PROXY_OPERATION__FUNCTION_TABLE_SYMBOL_NAME);
		createEReference(complexComSendProxyOperationEClass, COMPLEX_COM_SEND_PROXY_OPERATION__TABLE_INDEX_VARIABLE);

		iocReceiveGroupApiEClass = createEClass(IOC_RECEIVE_GROUP_API);
		createEAttribute(iocReceiveGroupApiEClass, IOC_RECEIVE_GROUP_API__COM_SEND_SIGNAL_SYMBOL_NAME);

		moduleRootEClass = createEClass(MODULE_ROOT);
		createEReference(moduleRootEClass, MODULE_ROOT__RTE_MODULE);
		createEReference(moduleRootEClass, MODULE_ROOT__RTE);

		interPartitionTimeoutOperationEClass = createEClass(INTER_PARTITION_TIMEOUT_OPERATION);
		createEReference(interPartitionTimeoutOperationEClass, INTER_PARTITION_TIMEOUT_OPERATION__TIMEOUT_VARIABLE);
		createEReference(interPartitionTimeoutOperationEClass, INTER_PARTITION_TIMEOUT_OPERATION__EXCLUDE_OPERATION);

		initializeOperationEClass = createEClass(INITIALIZE_OPERATION);

		variableInitializeOperationEClass = createEClass(VARIABLE_INITIALIZE_OPERATION);
		createEReference(variableInitializeOperationEClass, VARIABLE_INITIALIZE_OPERATION__INIT_VARIABLE);
		createEReference(variableInitializeOperationEClass, VARIABLE_INITIALIZE_OPERATION__EXCLUDE_OPERATION);

		iocInitializeOperationEClass = createEClass(IOC_INITIALIZE_OPERATION);
		createEReference(iocInitializeOperationEClass, IOC_INITIALIZE_OPERATION__INIT_IOC_API);

		osSuspendAllInterruptsApiEClass = createEClass(OS_SUSPEND_ALL_INTERRUPTS_API);

		osGetSpinlockApiEClass = createEClass(OS_GET_SPINLOCK_API);

		multicoreRteStartApiEClass = createEClass(MULTICORE_RTE_START_API);
		createEReference(multicoreRteStartApiEClass, MULTICORE_RTE_START_API__CORE_START_API_IMPL);

		rteBufferWriteTrustedFunctionEClass = createEClass(RTE_BUFFER_WRITE_TRUSTED_FUNCTION);
		createEReference(rteBufferWriteTrustedFunctionEClass, RTE_BUFFER_WRITE_TRUSTED_FUNCTION__OPERATION);
		createEReference(rteBufferWriteTrustedFunctionEClass, RTE_BUFFER_WRITE_TRUSTED_FUNCTION__DATA_VARIABLE);

		csTrustedFunctionEClass = createEClass(CS_TRUSTED_FUNCTION);
		createEReference(csTrustedFunctionEClass, CS_TRUSTED_FUNCTION__DATA_VARIABLE);
		createEAttribute(csTrustedFunctionEClass, CS_TRUSTED_FUNCTION__CS_TF_PARAM_TYPE_NAME);
		createEReference(csTrustedFunctionEClass, CS_TRUSTED_FUNCTION__CS_TF_CALLED_RUNNABLE);

		csTfCalledRunnableEClass = createEClass(CS_TF_CALLED_RUNNABLE);
		createEAttribute(csTfCalledRunnableEClass, CS_TF_CALLED_RUNNABLE__CS_TF_OPID_CONSTANT_NAME);
		createEReference(csTfCalledRunnableEClass, CS_TF_CALLED_RUNNABLE__START_OPERATION);

		serverRunnableStartOperationEClass = createEClass(SERVER_RUNNABLE_START_OPERATION);
		createEReference(serverRunnableStartOperationEClass, SERVER_RUNNABLE_START_OPERATION__START_SERVER_RUNNABLE);

		iocCommunicationEClass = createEClass(IOC_COMMUNICATION);

		proxyComSendOperationEClass = createEClass(PROXY_COM_SEND_OPERATION);
		createEReference(proxyComSendOperationEClass, PROXY_COM_SEND_OPERATION__TYPE);
		createEReference(proxyComSendOperationEClass, PROXY_COM_SEND_OPERATION__REQUEST_PROXY_IOC_API);
		createEReference(proxyComSendOperationEClass, PROXY_COM_SEND_OPERATION__VALUE_PROXY_IOC_API);
		createEAttribute(proxyComSendOperationEClass, PROXY_COM_SEND_OPERATION__PROXY_FUNCTION_INDEX_CONSTANT_NAME);

		iocSendGroupApiEClass = createEClass(IOC_SEND_GROUP_API);

		iocQueuedGroupCommunicationEClass = createEClass(IOC_QUEUED_GROUP_COMMUNICATION);
		createEReference(iocQueuedGroupCommunicationEClass, IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API);
		createEReference(iocQueuedGroupCommunicationEClass, IOC_QUEUED_GROUP_COMMUNICATION__SEND_API);

		singlecoreRteStartApiEClass = createEClass(SINGLECORE_RTE_START_API);
		createEReference(singlecoreRteStartApiEClass, SINGLECORE_RTE_START_API__OPERATION);

		rteStartApiEClass = createEClass(RTE_START_API);

		headerFileEClass = createEClass(HEADER_FILE);
		createEAttribute(headerFileEClass, HEADER_FILE__GUARD_NAME);
		createEReference(headerFileEClass, HEADER_FILE__INCLUDE_HEADER);

		sourceFileEClass = createEClass(SOURCE_FILE);
		createEReference(sourceFileEClass, SOURCE_FILE__INCLUDE_HEADER);

		rteInternalHeaderEClass = createEClass(RTE_INTERNAL_HEADER);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__CONSTANT);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__FUNCTION_MACRO);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__MODE_TYPE);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__RTE_API_GROUP);
		createEReference(rteInternalHeaderEClass, RTE_INTERNAL_HEADER__SCHM_API_GROUP);

		modeTypeEClass = createEClass(MODE_TYPE);
		createEAttribute(modeTypeEClass, MODE_TYPE__GUARD_NAME);
		createEReference(modeTypeEClass, MODE_TYPE__IMPLEMENTATION_DATA_TYPE);

		modeDeclarationGroupEClass = createEClass(MODE_DECLARATION_GROUP);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__MODE_TYPE);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__MODE_CONSTANT);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT);
		createEReference(modeDeclarationGroupEClass, MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT);

		modeQueueTypeEClass = createEClass(MODE_QUEUE_TYPE);
		createEReference(modeQueueTypeEClass, MODE_QUEUE_TYPE__MAX_LENGTH_CONSTANT);
		createEReference(modeQueueTypeEClass, MODE_QUEUE_TYPE__ELEMENT_TYPE);

		modeQueuedVariableEClass = createEClass(MODE_QUEUED_VARIABLE);
		createEReference(modeQueuedVariableEClass, MODE_QUEUED_VARIABLE__QUEUE_TYPE);

		modeMachineInstanceEClass = createEClass(MODE_MACHINE_INSTANCE);
		createEReference(modeMachineInstanceEClass, MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE);
		createEReference(modeMachineInstanceEClass, MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE);
		createEReference(modeMachineInstanceEClass, MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE);
		createEReference(modeMachineInstanceEClass, MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE);
		createEReference(modeMachineInstanceEClass, MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT);

		functionMacroEClass = createEClass(FUNCTION_MACRO);
		createEAttribute(functionMacroEClass, FUNCTION_MACRO__SYMBOL_NAME);
		createEAttribute(functionMacroEClass, FUNCTION_MACRO__FUNCTION_NAME);

		comProxyFunctionTableFileContentsGroupEClass = createEClass(COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP);
		createEAttribute(comProxyFunctionTableFileContentsGroupEClass, COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP__SR_WRITE_PROXY_NAME);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		redefinitionPrimitiveTypeEClass = createEClass(REDEFINITION_PRIMITIVE_TYPE);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEAttribute(arrayTypeEClass, ARRAY_TYPE__ARRAY_SIZE);

		redefinitionArrayTypeEClass = createEClass(REDEFINITION_ARRAY_TYPE);

		unionTypeEClass = createEClass(UNION_TYPE);
		createEReference(unionTypeEClass, UNION_TYPE__MEMBER);

		redefinitionUnionTypeEClass = createEClass(REDEFINITION_UNION_TYPE);

		structTypeEClass = createEClass(STRUCT_TYPE);
		createEReference(structTypeEClass, STRUCT_TYPE__MEMBER);

		redefinitionStructTypeEClass = createEClass(REDEFINITION_STRUCT_TYPE);

		blackboxTypeEClass = createEClass(BLACKBOX_TYPE);

		unionMemberEClass = createEClass(UNION_MEMBER);
		createEAttribute(unionMemberEClass, UNION_MEMBER__MEMBER_NAME);
		createEReference(unionMemberEClass, UNION_MEMBER__TYPE);

		structMemberEClass = createEClass(STRUCT_MEMBER);
		createEAttribute(structMemberEClass, STRUCT_MEMBER__MEMBER_NAME);
		createEReference(structMemberEClass, STRUCT_MEMBER__TYPE);

		variableMemberEClass = createEClass(VARIABLE_MEMBER);
		createEReference(variableMemberEClass, VARIABLE_MEMBER__PARENT);

		rteUtilityHeaderEClass = createEClass(RTE_UTILITY_HEADER);

		blackboxHeaderEClass = createEClass(BLACKBOX_HEADER);

		rteBufferQueueTypeEClass = createEClass(RTE_BUFFER_QUEUE_TYPE);
		createEReference(rteBufferQueueTypeEClass, RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT);
		createEReference(rteBufferQueueTypeEClass, RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE);

		rteSendTrustedFunctionParamTypeEClass = createEClass(RTE_SEND_TRUSTED_FUNCTION_PARAM_TYPE);

		comSendTrustedFunctionParamTypeEClass = createEClass(COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE);
		createEAttribute(comSendTrustedFunctionParamTypeEClass, COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_GROUP);

		csTrustedFunctionParamTypeEClass = createEClass(CS_TRUSTED_FUNCTION_PARAM_TYPE);

		neverReadOperationEClass = createEClass(NEVER_READ_OPERATION);
		createEReference(neverReadOperationEClass, NEVER_READ_OPERATION__INIT_VALUE_CONSTANT);

		rteBufferInvalidateTrustedFunctionEClass = createEClass(RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION);
		createEReference(rteBufferInvalidateTrustedFunctionEClass, RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__OPERATION);

		trustedFunctionRteBufferInvalidateSendOperationEClass = createEClass(TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION);
		createEReference(trustedFunctionRteBufferInvalidateSendOperationEClass, TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION);
		createEReference(trustedFunctionRteBufferInvalidateSendOperationEClass, TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__TEMP_RETURN_VARIABLE);

		memoryMappingEClass = createEClass(MEMORY_MAPPING);
		createEAttribute(memoryMappingEClass, MEMORY_MAPPING__PREFIX);
		createEAttribute(memoryMappingEClass, MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME);

		swcMemoryMappingEClass = createEClass(SWC_MEMORY_MAPPING);

		bswMemoryMappingEClass = createEClass(BSW_MEMORY_MAPPING);

		globalVariableFileContentsGroupEClass = createEClass(GLOBAL_VARIABLE_FILE_CONTENTS_GROUP);
		createEReference(globalVariableFileContentsGroupEClass, GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE);
		createEReference(globalVariableFileContentsGroupEClass, GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING);

		functionFileContentsGroupEClass = createEClass(FUNCTION_FILE_CONTENTS_GROUP);
		createEReference(functionFileContentsGroupEClass, FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING);
		createEReference(functionFileContentsGroupEClass, FUNCTION_FILE_CONTENTS_GROUP__FUNCTION);

		rteApiFileContentsGroupEClass = createEClass(RTE_API_FILE_CONTENTS_GROUP);
		createEReference(rteApiFileContentsGroupEClass, RTE_API_FILE_CONTENTS_GROUP__RTE_API);

		rteLifecycleApiFileContentsGroupEClass = createEClass(RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP);
		createEReference(rteLifecycleApiFileContentsGroupEClass, RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP__RTE_LIFECYCLE_API);

		taskBodyFileContentsGroupEClass = createEClass(TASK_BODY_FILE_CONTENTS_GROUP);
		createEReference(taskBodyFileContentsGroupEClass, TASK_BODY_FILE_CONTENTS_GROUP__TASK_BODY);

		bswSchedulableEntityFileContentsGroupEClass = createEClass(BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP);
		createEReference(bswSchedulableEntityFileContentsGroupEClass, BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP__BSW_SCHEDULABLE_ENTITY);

		comCallbackFileContentsGroupEClass = createEClass(COM_CALLBACK_FILE_CONTENTS_GROUP);
		createEReference(comCallbackFileContentsGroupEClass, COM_CALLBACK_FILE_CONTENTS_GROUP__COM_CALLBACK);

		trustedFunctionFileContentsGroupEClass = createEClass(TRUSTED_FUNCTION_FILE_CONTENTS_GROUP);
		createEReference(trustedFunctionFileContentsGroupEClass, TRUSTED_FUNCTION_FILE_CONTENTS_GROUP__TRUSTED_FUNCTION);

		executableEntityFileContentsGroupEClass = createEClass(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP);
		createEReference(executableEntityFileContentsGroupEClass, EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP__EXECUTABLE_ENTITY);

		bswMemoryMappingHeaderEClass = createEClass(BSW_MEMORY_MAPPING_HEADER);
		createEReference(bswMemoryMappingHeaderEClass, BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING);

		swcMemoryMappingHeaderEClass = createEClass(SWC_MEMORY_MAPPING_HEADER);
		createEReference(swcMemoryMappingHeaderEClass, SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING);

		generationInfoEClass = createEClass(GENERATION_INFO);
		createEAttribute(generationInfoEClass, GENERATION_INFO__GENERATOR_NAME);
		createEAttribute(generationInfoEClass, GENERATION_INFO__GENERATOR_VERSION);
		createEAttribute(generationInfoEClass, GENERATION_INFO__GENERATION_DATE);

		macroEClass = createEClass(MACRO);
		createEAttribute(macroEClass, MACRO__SYMBOL_NAME);

		schmApiEClass = createEClass(SCHM_API);
		createEReference(schmApiEClass, SCHM_API__RETURN_VALUE);
		createEReference(schmApiEClass, SCHM_API__PARENT);
		createEAttribute(schmApiEClass, SCHM_API__IS_INLINE);

		comSignalApiWrapperEClass = createEClass(COM_SIGNAL_API_WRAPPER);
		createEReference(comSignalApiWrapperEClass, COM_SIGNAL_API_WRAPPER__DATA_PARAM);
		createEReference(comSignalApiWrapperEClass, COM_SIGNAL_API_WRAPPER__PARENT);
		createEAttribute(comSignalApiWrapperEClass, COM_SIGNAL_API_WRAPPER__SIGNAL_SYMBOL_NAME);
		createEAttribute(comSignalApiWrapperEClass, COM_SIGNAL_API_WRAPPER__SIGNAL_GROUP_SYMBOL_NAME);

		comProxyFunctionEClass = createEClass(COM_PROXY_FUNCTION);
		createEReference(comProxyFunctionEClass, COM_PROXY_FUNCTION__PARENT);
		createEAttribute(comProxyFunctionEClass, COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME);
		createEAttribute(comProxyFunctionEClass, COM_PROXY_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME);
		createEAttribute(comProxyFunctionEClass, COM_PROXY_FUNCTION__BUFFER_COM_PROXY_SYMBOL_NAME);
		createEAttribute(comProxyFunctionEClass, COM_PROXY_FUNCTION__BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME);
		createEAttribute(comProxyFunctionEClass, COM_PROXY_FUNCTION__PROXY_DATA_TYPE_NAME);
		createEAttribute(comProxyFunctionEClass, COM_PROXY_FUNCTION__IS_GROUP);

		comSendSignalApiWrapperEClass = createEClass(COM_SEND_SIGNAL_API_WRAPPER);

		comReceiveSignalApiWrapperEClass = createEClass(COM_RECEIVE_SIGNAL_API_WRAPPER);

		schmLifecycleApiEClass = createEClass(SCHM_LIFECYCLE_API);

		schmEnterApiEClass = createEClass(SCHM_ENTER_API);
		createEReference(schmEnterApiEClass, SCHM_ENTER_API__OPERATION);
		createEAttribute(schmEnterApiEClass, SCHM_ENTER_API__IS_NONE_EXCLUDE);

		schmExitApiEClass = createEClass(SCHM_EXIT_API);
		createEReference(schmExitApiEClass, SCHM_EXIT_API__OPERATION);
		createEAttribute(schmExitApiEClass, SCHM_EXIT_API__IS_NONE_EXCLUDE);

		schmModeApiEClass = createEClass(SCHM_MODE_API);
		createEReference(schmModeApiEClass, SCHM_MODE_API__MODE_DECLARATION_GROUP);
		createEReference(schmModeApiEClass, SCHM_MODE_API__MODE_MACHINE_INSTANCE);

		schmSwitchApiEClass = createEClass(SCHM_SWITCH_API);
		createEReference(schmSwitchApiEClass, SCHM_SWITCH_API__MODE_MACHINE_INSTANCE);
		createEReference(schmSwitchApiEClass, SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE);
		createEReference(schmSwitchApiEClass, SCHM_SWITCH_API__EXECUTABLE_START_OPERATION);

		osTaskEventsTriggeredByModeEClass = createEClass(OS_TASK_EVENTS_TRIGGERED_BY_MODE);
		createEReference(osTaskEventsTriggeredByModeEClass, OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE);
		createEReference(osTaskEventsTriggeredByModeEClass, OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT);

		osTaskEventEClass = createEClass(OS_TASK_EVENT);
		createEAttribute(osTaskEventEClass, OS_TASK_EVENT__OS_TASK_ID);
		createEAttribute(osTaskEventEClass, OS_TASK_EVENT__OS_EVENT_ID);
		createEAttribute(osTaskEventEClass, OS_TASK_EVENT__OS_TASK_PRIORITY);

		moduleInterlinkHeaderEClass = createEClass(MODULE_INTERLINK_HEADER);
		createEReference(moduleInterlinkHeaderEClass, MODULE_INTERLINK_HEADER__GLOBAL_VARIABLE_GROUP);
		createEReference(moduleInterlinkHeaderEClass, MODULE_INTERLINK_HEADER__SCHM_API_GROUP);
		createEReference(moduleInterlinkHeaderEClass, MODULE_INTERLINK_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
		createEReference(moduleInterlinkHeaderEClass, MODULE_INTERLINK_HEADER__CONSTANT);

		schmApiFileContentsGroupEClass = createEClass(SCHM_API_FILE_CONTENTS_GROUP);
		createEReference(schmApiFileContentsGroupEClass, SCHM_API_FILE_CONTENTS_GROUP__SCHM_API);

		comSignalApiWrapperFileContentsGroupEClass = createEClass(COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP);
		createEReference(comSignalApiWrapperFileContentsGroupEClass, COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP__COM_SIGNAL_API_WRAPPER);

		comProxyFunctionFileContentsGroupEClass = createEClass(COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP);
		createEReference(comProxyFunctionFileContentsGroupEClass, COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP__COM_PROXY_FUNCTION);

		moduleInterlinkTypeHeaderEClass = createEClass(MODULE_INTERLINK_TYPE_HEADER);
		createEReference(moduleInterlinkTypeHeaderEClass, MODULE_INTERLINK_TYPE_HEADER__CONSTANT);
		createEReference(moduleInterlinkTypeHeaderEClass, MODULE_INTERLINK_TYPE_HEADER__MODE_TYPE);
		createEReference(moduleInterlinkTypeHeaderEClass, MODULE_INTERLINK_TYPE_HEADER__MODE_DECLARATION_GROUP);

		schmLifecycleApiFileContentsGroupEClass = createEClass(SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP);
		createEReference(schmLifecycleApiFileContentsGroupEClass, SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP__SCHM_LIFECYCLE_API);

		partedBswmEClass = createEClass(PARTED_BSWM);
		createEReference(partedBswmEClass, PARTED_BSWM__PARENT);
		createEReference(partedBswmEClass, PARTED_BSWM__BSWM);
		createEReference(partedBswmEClass, PARTED_BSWM__BSW_MEMORY_MAPPING);
		createEReference(partedBswmEClass, PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY);
		createEReference(partedBswmEClass, PARTED_BSWM__MODE_MACHINE_INSTANCE);
		createEReference(partedBswmEClass, PARTED_BSWM__SCHM_API);

		bswmEClass = createEClass(BSWM);
		createEReference(bswmEClass, BSWM__PARTED_BSWM);
		createEReference(bswmEClass, BSWM__MODE_DECLARATION_GROUP);
		createEOperation(bswmEClass, BSWM___GET_SINGLE_PARTED_BSWM__PARTITION);

		schmDeinitApiEClass = createEClass(SCHM_DEINIT_API);

		schmInitApiEClass = createEClass(SCHM_INIT_API);
		createEReference(schmInitApiEClass, SCHM_INIT_API__OPERATION);
		createEReference(schmInitApiEClass, SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION);
		createEReference(schmInitApiEClass, SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT);
		createEReference(schmInitApiEClass, SCHM_INIT_API__INIT_TARGET_MODE_MACHINE_INSTANCE);

		singlecoreSchmInitApiEClass = createEClass(SINGLECORE_SCHM_INIT_API);

		multicoreSchmInitApiEClass = createEClass(MULTICORE_SCHM_INIT_API);
		createEReference(multicoreSchmInitApiEClass, MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL);

		schmCoreInitApiImplEClass = createEClass(SCHM_CORE_INIT_API_IMPL);
		createEReference(schmCoreInitApiImplEClass, SCHM_CORE_INIT_API_IMPL__PARENT);

		pointerTypeEClass = createEClass(POINTER_TYPE);
		createEReference(pointerTypeEClass, POINTER_TYPE__TYPE);
		createEAttribute(pointerTypeEClass, POINTER_TYPE__IS_CONST_POINTER);
		createEAttribute(pointerTypeEClass, POINTER_TYPE__IS_CONST_TARGET);

		redefinitionPointerTypeEClass = createEClass(REDEFINITION_POINTER_TYPE);

		redefinitionTypeEClass = createEClass(REDEFINITION_TYPE);
		createEReference(redefinitionTypeEClass, REDEFINITION_TYPE__SOURCE_TYPE);
		createEOperation(redefinitionTypeEClass, REDEFINITION_TYPE___GET_LEAF_TYPE);

		// Create enums
		parameterPassTypeEnumEEnum = createEEnum(PARAMETER_PASS_TYPE_ENUM);
		parameterDirectionEnumEEnum = createEEnum(PARAMETER_DIRECTION_ENUM);
		signednessEnumEEnum = createEEnum(SIGNEDNESS_ENUM);
		constantValueTypeEnumEEnum = createEEnum(CONSTANT_VALUE_TYPE_ENUM);

		// Create data types
		stringEDataType = createEDataType(STRING);
		verbatimStringEDataType = createEDataType(VERBATIM_STRING);
		cIdentifierEDataType = createEDataType(CIDENTIFIER);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		M2Package theM2Package = (M2Package)EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduleReferrableEClass.getESuperTypes().add(this.getModuleObject());
		operationEClass.getESuperTypes().add(this.getModuleObject());
		executableEntityEClass.getESuperTypes().add(this.getFunction());
		bswSchedulableEntityEClass.getESuperTypes().add(this.getExecutableEntity());
		runnableEntityEClass.getESuperTypes().add(this.getExecutableEntity());
		rteApiEClass.getESuperTypes().add(this.getFunction());
		writeApiEClass.getESuperTypes().add(this.getRteApi());
		sendOperationEClass.getESuperTypes().add(this.getOperation());
		rteBufferNonqueuedSendOperationEClass.getESuperTypes().add(this.getSendOperation());
		rteBufferNonqueuedReadOperationEClass.getESuperTypes().add(this.getReadOperation());
		readOperationEClass.getESuperTypes().add(this.getOperation());
		readApiEClass.getESuperTypes().add(this.getRteApi());
		irvReadOperationEClass.getESuperTypes().add(this.getOperation());
		irvReadApiEClass.getESuperTypes().add(this.getRteApi());
		irvWriteOperationEClass.getESuperTypes().add(this.getOperation());
		irvWriteApiEClass.getESuperTypes().add(this.getRteApi());
		rteBufferVariableSetEClass.getESuperTypes().add(this.getGlobalVariable());
		globalVariableSetEClass.getESuperTypes().add(this.getGlobalVariable());
		comProxyFunctionTableVariableEClass.getESuperTypes().add(this.getGlobalVariable());
		rteSourceEClass.getESuperTypes().add(this.getSourceFile());
		globalVariableEClass.getESuperTypes().add(this.getVariable());
		fileEClass.getESuperTypes().add(this.getModuleReferrable());
		parameterEClass.getESuperTypes().add(this.getVariable());
		typeEClass.getESuperTypes().add(this.getModuleReferrable());
		localVariableEClass.getESuperTypes().add(this.getVariable());
		rteApplicationHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		functionEClass.getESuperTypes().add(this.getModuleReferrable());
		logicalCompartmentEClass.getESuperTypes().add(this.getModuleReferrable());
		rteEClass.getESuperTypes().add(this.getLogicalCompartment());
		coreEClass.getESuperTypes().add(this.getLogicalCompartment());
		partitionEClass.getESuperTypes().add(this.getLogicalCompartment());
		swcEClass.getESuperTypes().add(this.getLogicalCompartment());
		rteHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteBswApiHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteLifecycleHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteApplicationTypeHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteVfbTraceHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteConfigurationHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteCallbackHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteTypeHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		invalidateApiEClass.getESuperTypes().add(this.getRteApi());
		iocNonqueuedSendOperationEClass.getESuperTypes().add(this.getIocSendOperation());
		directComSendOperationEClass.getESuperTypes().add(this.getComSendOperation());
		trustedFunctionRteOperationEClass.getESuperTypes().add(this.getSendOperation());
		trustedFunctionRteSendOperationEClass.getESuperTypes().add(this.getTrustedFunctionRteOperation());
		trustedFunctionRteBufferWriteSendOperationEClass.getESuperTypes().add(this.getTrustedFunctionRteOperation());
		trustedFunctionComSendOperationEClass.getESuperTypes().add(this.getComSendOperation());
		immediateProxyComSendOperationEClass.getESuperTypes().add(this.getProxyComSendOperation());
		periodicProxyComSendOperationEClass.getESuperTypes().add(this.getProxyComSendOperation());
		iocNonqueuedReadOperationEClass.getESuperTypes().add(this.getReadOperation());
		comReadOperationEClass.getESuperTypes().add(this.getReadOperation());
		iocNonqueuedCommunicationEClass.getESuperTypes().add(this.getIocCommunication());
		iocWriteApiEClass.getESuperTypes().add(this.getIocApi());
		iocReadApiEClass.getESuperTypes().add(this.getIocApi());
		comSendSignalApiEClass.getESuperTypes().add(this.getComApi());
		comReceiveSignalApiEClass.getESuperTypes().add(this.getComApi());
		comReceiveCallbackEClass.getESuperTypes().add(this.getComCallback());
		comSendOperationEClass.getESuperTypes().add(this.getSendOperation());
		comCallbackEClass.getESuperTypes().add(this.getFunction());
		comReceiveTimeoutCallbackEClass.getESuperTypes().add(this.getComCallback());
		comInvalidateCallbackEClass.getESuperTypes().add(this.getComCallback());
		comSendSignalProxyEntityEClass.getESuperTypes().add(this.getBswSchedulableEntity());
		comSendSignalImmediateEntityEClass.getESuperTypes().add(this.getComSendSignalProxyEntity());
		comSendSignalPeriodicEntityEClass.getESuperTypes().add(this.getComSendSignalProxyEntity());
		filterOperationEClass.getESuperTypes().add(this.getOperation());
		maskedNewDiffersMaskedOldFilterOperationEClass.getESuperTypes().add(this.getFilterOperation());
		maskedNewDiffersXFilterOperationEClass.getESuperTypes().add(this.getFilterOperation());
		newIsWithinFilterOperationEClass.getESuperTypes().add(this.getFilterOperation());
		newIsOutsideFilterOperationEClass.getESuperTypes().add(this.getFilterOperation());
		maskedNewEqualsXFilterOperationEClass.getESuperTypes().add(this.getFilterOperation());
		oneEveryNFilterOperationEClass.getESuperTypes().add(this.getFilterOperation());
		rteCoreStartApiImplEClass.getESuperTypes().add(this.getRteLifecycleApi());
		rteStopApiEClass.getESuperTypes().add(this.getRteLifecycleApi());
		restartPartitionApiEClass.getESuperTypes().add(this.getRteLifecycleApi());
		partitionRestartingApiEClass.getESuperTypes().add(this.getRteLifecycleApi());
		partitionTerminatedApiEClass.getESuperTypes().add(this.getRteLifecycleApi());
		rteLifecycleApiEClass.getESuperTypes().add(this.getFunction());
		sendApiEClass.getESuperTypes().add(this.getRteApi());
		receiveApiEClass.getESuperTypes().add(this.getRteApi());
		rteBufferQueuedSendOperationEClass.getESuperTypes().add(this.getSendOperation());
		rteBufferQueuedVariableEClass.getESuperTypes().add(this.getGlobalVariable());
		rteBufferQueuedReadOperationEClass.getESuperTypes().add(this.getReadOperation());
		iocQueuedCommunicationEClass.getESuperTypes().add(this.getIocCommunication());
		iocReceiveApiEClass.getESuperTypes().add(this.getIocApi());
		iocSendApiEClass.getESuperTypes().add(this.getIocApi());
		iocSendOperationEClass.getESuperTypes().add(this.getSendOperation());
		iocQueuedSendOperationEClass.getESuperTypes().add(this.getIocSendOperation());
		iocQueuedReadOperationEClass.getESuperTypes().add(this.getReadOperation());
		callApiEClass.getESuperTypes().add(this.getRteApi());
		tfCallApiEClass.getESuperTypes().add(this.getCallApi());
		executableStartOperationEClass.getESuperTypes().add(this.getOperation());
		disabledInModeEClass.getESuperTypes().add(this.getOperation());
		excludeOperationEClass.getESuperTypes().add(this.getOperation());
		allInterruptBlockExcludeOperationEClass.getESuperTypes().add(this.getExcludeOperation());
		osInterruptBlockExcludeOperationEClass.getESuperTypes().add(this.getExcludeOperation());
		osSpinlockExcludeOperationEClass.getESuperTypes().add(this.getExcludeOperation());
		osResourceExcludeOperationEClass.getESuperTypes().add(this.getExcludeOperation());
		noneExcludeOperationEClass.getESuperTypes().add(this.getExcludeOperation());
		constantEClass.getESuperTypes().add(this.getValue());
		constantMemberEClass.getESuperTypes().add(this.getConstant());
		rteEnterApiEClass.getESuperTypes().add(this.getRteApi());
		rteExitApiEClass.getESuperTypes().add(this.getRteApi());
		osTaskActivationExecutableTaskBodyEClass.getESuperTypes().add(this.getTaskBody());
		osEventSetExecutableTaskBodyEClass.getESuperTypes().add(this.getTaskBody());
		osTaskActivationOperationEClass.getESuperTypes().add(this.getContextActivationOperation());
		osEventSetActivationOperationEClass.getESuperTypes().add(this.getContextActivationOperation());
		contextActivationOperationEClass.getESuperTypes().add(this.getOperation());
		timingTriggeringExecutableStartOperationEClass.getESuperTypes().add(this.getExecutableStartOperation());
		modeSwitchTriggeringExecutableStartOperationEClass.getESuperTypes().add(this.getExecutableStartOperation());
		cycleCountupOperationEClass.getESuperTypes().add(this.getOperation());
		startOffsetCountupOperationEClass.getESuperTypes().add(this.getOperation());
		taskBodyEClass.getESuperTypes().add(this.getFunction());
		iocEmptyQueueApiEClass.getESuperTypes().add(this.getIocApi());
		comApiEClass.getESuperTypes().add(this.getFunction());
		iocApiEClass.getESuperTypes().add(this.getFunction());
		valueEClass.getESuperTypes().add(this.getModuleReferrable());
		trustedFunctionEClass.getESuperTypes().add(this.getFunction());
		comSendSignalTrustedFunctionEClass.getESuperTypes().add(this.getTrustedFunction());
		osSetEventApiEClass.getESuperTypes().add(this.getOsApi());
		osApiEClass.getESuperTypes().add(this.getFunction());
		comSendSignalImmediateTaskBodyEClass.getESuperTypes().add(this.getTaskBody());
		variableEClass.getESuperTypes().add(this.getValue());
		primitiveComSendProxyOperationEClass.getESuperTypes().add(this.getOperation());
		complexComSendProxyOperationEClass.getESuperTypes().add(this.getOperation());
		iocReceiveGroupApiEClass.getESuperTypes().add(this.getIocReceiveApi());
		initializeOperationEClass.getESuperTypes().add(this.getOperation());
		variableInitializeOperationEClass.getESuperTypes().add(this.getInitializeOperation());
		iocInitializeOperationEClass.getESuperTypes().add(this.getInitializeOperation());
		osSuspendAllInterruptsApiEClass.getESuperTypes().add(this.getOsApi());
		osGetSpinlockApiEClass.getESuperTypes().add(this.getOsApi());
		multicoreRteStartApiEClass.getESuperTypes().add(this.getRteLifecycleApi());
		multicoreRteStartApiEClass.getESuperTypes().add(this.getRteStartApi());
		rteBufferWriteTrustedFunctionEClass.getESuperTypes().add(this.getTrustedFunction());
		csTrustedFunctionEClass.getESuperTypes().add(this.getTrustedFunction());
		csTfCalledRunnableEClass.getESuperTypes().add(this.getModuleObject());
		serverRunnableStartOperationEClass.getESuperTypes().add(this.getExecutableStartOperation());
		proxyComSendOperationEClass.getESuperTypes().add(this.getComSendOperation());
		iocSendGroupApiEClass.getESuperTypes().add(this.getIocSendApi());
		iocQueuedGroupCommunicationEClass.getESuperTypes().add(this.getIocCommunication());
		singlecoreRteStartApiEClass.getESuperTypes().add(this.getRteStartApi());
		rteStartApiEClass.getESuperTypes().add(this.getRteLifecycleApi());
		headerFileEClass.getESuperTypes().add(this.getFile());
		sourceFileEClass.getESuperTypes().add(this.getFile());
		rteInternalHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		modeTypeEClass.getESuperTypes().add(this.getType());
		modeDeclarationGroupEClass.getESuperTypes().add(this.getModuleReferrable());
		modeQueueTypeEClass.getESuperTypes().add(this.getType());
		modeQueuedVariableEClass.getESuperTypes().add(this.getGlobalVariable());
		modeMachineInstanceEClass.getESuperTypes().add(this.getModuleReferrable());
		functionMacroEClass.getESuperTypes().add(this.getModuleObject());
		comProxyFunctionTableFileContentsGroupEClass.getESuperTypes().add(this.getModuleObject());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		redefinitionPrimitiveTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		redefinitionPrimitiveTypeEClass.getESuperTypes().add(this.getRedefinitionType());
		arrayTypeEClass.getESuperTypes().add(this.getType());
		redefinitionArrayTypeEClass.getESuperTypes().add(this.getArrayType());
		redefinitionArrayTypeEClass.getESuperTypes().add(this.getRedefinitionType());
		unionTypeEClass.getESuperTypes().add(this.getType());
		redefinitionUnionTypeEClass.getESuperTypes().add(this.getUnionType());
		redefinitionUnionTypeEClass.getESuperTypes().add(this.getRedefinitionType());
		structTypeEClass.getESuperTypes().add(this.getType());
		redefinitionStructTypeEClass.getESuperTypes().add(this.getStructType());
		redefinitionStructTypeEClass.getESuperTypes().add(this.getRedefinitionType());
		blackboxTypeEClass.getESuperTypes().add(this.getType());
		unionMemberEClass.getESuperTypes().add(this.getModuleObject());
		structMemberEClass.getESuperTypes().add(this.getModuleObject());
		variableMemberEClass.getESuperTypes().add(this.getVariable());
		rteUtilityHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		blackboxHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		rteBufferQueueTypeEClass.getESuperTypes().add(this.getType());
		rteSendTrustedFunctionParamTypeEClass.getESuperTypes().add(this.getType());
		comSendTrustedFunctionParamTypeEClass.getESuperTypes().add(this.getType());
		csTrustedFunctionParamTypeEClass.getESuperTypes().add(this.getType());
		neverReadOperationEClass.getESuperTypes().add(this.getReadOperation());
		rteBufferInvalidateTrustedFunctionEClass.getESuperTypes().add(this.getTrustedFunction());
		trustedFunctionRteBufferInvalidateSendOperationEClass.getESuperTypes().add(this.getSendOperation());
		memoryMappingEClass.getESuperTypes().add(this.getModuleReferrable());
		swcMemoryMappingEClass.getESuperTypes().add(this.getMemoryMapping());
		bswMemoryMappingEClass.getESuperTypes().add(this.getMemoryMapping());
		globalVariableFileContentsGroupEClass.getESuperTypes().add(this.getModuleObject());
		functionFileContentsGroupEClass.getESuperTypes().add(this.getModuleObject());
		rteApiFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		rteLifecycleApiFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		taskBodyFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		bswSchedulableEntityFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		comCallbackFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		trustedFunctionFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		executableEntityFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		bswMemoryMappingHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		swcMemoryMappingHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		generationInfoEClass.getESuperTypes().add(this.getModuleObject());
		macroEClass.getESuperTypes().add(this.getModuleReferrable());
		schmApiEClass.getESuperTypes().add(this.getFunction());
		comSignalApiWrapperEClass.getESuperTypes().add(this.getFunction());
		comProxyFunctionEClass.getESuperTypes().add(this.getFunction());
		comSendSignalApiWrapperEClass.getESuperTypes().add(this.getComSignalApiWrapper());
		comReceiveSignalApiWrapperEClass.getESuperTypes().add(this.getComSignalApiWrapper());
		schmLifecycleApiEClass.getESuperTypes().add(this.getFunction());
		schmEnterApiEClass.getESuperTypes().add(this.getSchmApi());
		schmExitApiEClass.getESuperTypes().add(this.getSchmApi());
		schmModeApiEClass.getESuperTypes().add(this.getSchmApi());
		schmSwitchApiEClass.getESuperTypes().add(this.getSchmApi());
		osTaskEventsTriggeredByModeEClass.getESuperTypes().add(this.getModuleObject());
		osTaskEventEClass.getESuperTypes().add(this.getModuleObject());
		moduleInterlinkHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		schmApiFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		comSignalApiWrapperFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		comProxyFunctionFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		moduleInterlinkTypeHeaderEClass.getESuperTypes().add(this.getHeaderFile());
		schmLifecycleApiFileContentsGroupEClass.getESuperTypes().add(this.getFunctionFileContentsGroup());
		partedBswmEClass.getESuperTypes().add(this.getLogicalCompartment());
		bswmEClass.getESuperTypes().add(this.getLogicalCompartment());
		schmDeinitApiEClass.getESuperTypes().add(this.getSchmLifecycleApi());
		schmInitApiEClass.getESuperTypes().add(this.getSchmLifecycleApi());
		singlecoreSchmInitApiEClass.getESuperTypes().add(this.getSchmInitApi());
		multicoreSchmInitApiEClass.getESuperTypes().add(this.getSchmInitApi());
		schmCoreInitApiImplEClass.getESuperTypes().add(this.getSchmInitApi());
		pointerTypeEClass.getESuperTypes().add(this.getType());
		redefinitionPointerTypeEClass.getESuperTypes().add(this.getPointerType());
		redefinitionPointerTypeEClass.getESuperTypes().add(this.getRedefinitionType());
		redefinitionTypeEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleObjectEClass, ModuleObject.class, "ModuleObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModuleObject_Source(), ecorePackage.getEObject(), null, "source", null, 0, -1, ModuleObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleObject_SingleSource(), ecorePackage.getEObject(), null, "singleSource", null, 0, 1, ModuleObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getModuleObject_RoleName(), this.getString(), "roleName", null, 0, 1, ModuleObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(moduleReferrableEClass, ModuleReferrable.class, "ModuleReferrable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getModuleReferrable_Id(), this.getString(), "id", null, 1, 1, ModuleReferrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(executableEntityEClass, ExecutableEntity.class, "ExecutableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExecutableEntity_RoleParam(), this.getParameter(), null, "roleParam", null, 0, -1, ExecutableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExecutableEntity_IsNoMock(), this.getBoolean(), "isNoMock", null, 1, 1, ExecutableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(bswSchedulableEntityEClass, BswSchedulableEntity.class, "BswSchedulableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBswSchedulableEntity_ParentPartedBswm(), this.getPartedBswm(), this.getPartedBswm_DependentBswSchedulableEntity(), "parentPartedBswm", null, 0, 1, BswSchedulableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(runnableEntityEClass, RunnableEntity.class, "RunnableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRunnableEntity_HasReturnValue(), this.getBoolean(), "hasReturnValue", null, 1, 1, RunnableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteApiEClass, RteApi.class, "RteApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteApi_Parent(), this.getSwc(), this.getSwc_RteApi(), "parent", null, 1, 1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRteApi_ApiMappingName(), this.getCIdentifier(), "apiMappingName", null, 1, 1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRteApi_IsConnected(), this.getBoolean(), "isConnected", null, 1, 1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRteApi_IsInline(), this.getBoolean(), "isInline", null, 1, 1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApi_ReturnValue(), this.getValue(), null, "returnValue", null, 0, 1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApi_InlineConstant(), this.getConstant(), null, "inlineConstant", null, 0, -1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApi_InlineGlobalVariable(), this.getGlobalVariable(), null, "inlineGlobalVariable", null, 0, -1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApi_InlineRunnableEntity(), this.getRunnableEntity(), null, "inlineRunnableEntity", null, 0, -1, RteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(writeApiEClass, WriteApi.class, "WriteApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWriteApi_Operation(), this.getSendOperation(), null, "operation", null, 0, -1, WriteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWriteApi_DataParam(), this.getParameter(), null, "dataParam", null, 1, 1, WriteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWriteApi_NeedsCheckArg(), this.getBoolean(), "needsCheckArg", null, 1, 1, WriteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sendOperationEClass, SendOperation.class, "SendOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSendOperation_SendValue(), this.getValue(), null, "sendValue", null, 1, 1, SendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendOperation_SendStatus(), this.getValue(), null, "sendStatus", null, 1, 1, SendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendOperation_ExcludeOperation(), this.getExcludeOperation(), null, "excludeOperation", null, 0, 1, SendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendOperation_ReturnVariable(), this.getVariable(), null, "returnVariable", null, 0, 1, SendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSendOperation_IsWriteApi(), this.getBoolean(), "isWriteApi", null, 1, 1, SendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferNonqueuedSendOperationEClass, RteBufferNonqueuedSendOperation.class, "RteBufferNonqueuedSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferNonqueuedSendOperation_AccessVariable(), this.getRteBufferVariableSet(), null, "accessVariable", null, 1, 1, RteBufferNonqueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferNonqueuedSendOperation_FilterOperation(), this.getFilterOperation(), null, "filterOperation", null, 0, 1, RteBufferNonqueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferNonqueuedReadOperationEClass, RteBufferNonqueuedReadOperation.class, "RteBufferNonqueuedReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferNonqueuedReadOperation_AccessVariable(), this.getRteBufferVariableSet(), null, "accessVariable", null, 1, 1, RteBufferNonqueuedReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(readOperationEClass, ReadOperation.class, "ReadOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadOperation_InvalidValueConstant(), this.getConstant(), null, "invalidValueConstant", null, 0, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadOperation_ReadValueVariable(), this.getVariable(), null, "readValueVariable", null, 1, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadOperation_ReadStatusVariable(), this.getVariable(), null, "readStatusVariable", null, 0, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadOperation_ExcludeOperation(), this.getExcludeOperation(), null, "excludeOperation", null, 0, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(readApiEClass, ReadApi.class, "ReadApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadApi_Operation(), this.getReadOperation(), null, "operation", null, 0, 1, ReadApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadApi_DataParam(), this.getParameter(), null, "dataParam", null, 1, 1, ReadApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(irvReadOperationEClass, IrvReadOperation.class, "IrvReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIrvReadOperation_AccessVariable(), this.getRteBufferVariableSet(), null, "accessVariable", null, 1, 1, IrvReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIrvReadOperation_ReadValueVariable(), this.getVariable(), null, "readValueVariable", null, 1, 1, IrvReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIrvReadOperation_ExcludeOperation(), this.getExcludeOperation(), null, "excludeOperation", null, 0, 1, IrvReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(irvReadApiEClass, IrvReadApi.class, "IrvReadApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIrvReadApi_Operation(), this.getIrvReadOperation(), null, "operation", null, 1, 1, IrvReadApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIrvReadApi_DataParam(), this.getParameter(), null, "dataParam", null, 0, 1, IrvReadApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(irvWriteOperationEClass, IrvWriteOperation.class, "IrvWriteOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIrvWriteOperation_AccessVariable(), this.getRteBufferVariableSet(), null, "accessVariable", null, 1, 1, IrvWriteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIrvWriteOperation_WriteValueVariable(), this.getVariable(), null, "writeValueVariable", null, 1, 1, IrvWriteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIrvWriteOperation_ExcludeOperation(), this.getExcludeOperation(), null, "excludeOperation", null, 0, 1, IrvWriteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(irvWriteApiEClass, IrvWriteApi.class, "IrvWriteApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIrvWriteApi_Operation(), this.getIrvWriteOperation(), null, "operation", null, 1, 1, IrvWriteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIrvWriteApi_DataParam(), this.getParameter(), null, "dataParam", null, 1, 1, IrvWriteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferVariableSetEClass, RteBufferVariableSet.class, "RteBufferVariableSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferVariableSet_ValueVariable(), this.getGlobalVariable(), null, "valueVariable", null, 1, 1, RteBufferVariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferVariableSet_StatusVariable(), this.getGlobalVariable(), null, "statusVariable", null, 0, 1, RteBufferVariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferVariableSet_InitValueVariable(), this.getGlobalVariable(), null, "initValueVariable", null, 0, 1, RteBufferVariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferVariableSet_ComplexVariable(), this.getGlobalVariable(), null, "complexVariable", null, 0, 1, RteBufferVariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(globalVariableSetEClass, GlobalVariableSet.class, "GlobalVariableSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGlobalVariableSet_GlobalVariable(), this.getGlobalVariable(), null, "globalVariable", null, 0, -1, GlobalVariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comProxyFunctionTableVariableEClass, ComProxyFunctionTableVariable.class, "ComProxyFunctionTableVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rteSourceEClass, RteSource.class, "RteSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteSource_GlobalVariableGroup(), this.getGlobalVariableFileContentsGroup(), null, "globalVariableGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_DependentExternalExecutableEntityGroup(), this.getExecutableEntityFileContentsGroup(), null, "dependentExternalExecutableEntityGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_BswSchedulableEntityGroup(), this.getBswSchedulableEntityFileContentsGroup(), null, "bswSchedulableEntityGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_RteApiGroup(), this.getRteApiFileContentsGroup(), null, "rteApiGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_RteLifecycleApiGroup(), this.getRteLifecycleApiFileContentsGroup(), null, "rteLifecycleApiGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_TaskBodyGroup(), this.getTaskBodyFileContentsGroup(), null, "taskBodyGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_ComCallbackGroup(), this.getComCallbackFileContentsGroup(), null, "comCallbackGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_TrustedFunctionGroup(), this.getTrustedFunctionFileContentsGroup(), null, "trustedFunctionGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_SourceMacro(), this.getMacro(), null, "sourceMacro", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_SchmLifecycleApiGroup(), this.getSchmLifecycleApiFileContentsGroup(), null, "schmLifecycleApiGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_SchmApiGroup(), this.getSchmApiFileContentsGroup(), null, "schmApiGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_ComSignalApiWrapperGroup(), this.getComSignalApiWrapperFileContentsGroup(), null, "comSignalApiWrapperGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteSource_ComProxyFunctionGroup(), this.getComProxyFunctionFileContentsGroup(), null, "comProxyFunctionGroup", null, 0, -1, RteSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteModuleEClass, RteModule.class, "RteModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteModule_DependentHeader(), this.getHeaderFile(), null, "dependentHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_BswMemoryMappingHeader(), this.getBswMemoryMappingHeader(), null, "bswMemoryMappingHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_SwcMemoryMappingHeader(), this.getSwcMemoryMappingHeader(), null, "swcMemoryMappingHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteHeader(), this.getRteHeader(), null, "rteHeader", null, 1, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteTypeHeader(), this.getRteTypeHeader(), null, "rteTypeHeader", null, 1, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteApplicationTypeHeader(), this.getRteApplicationTypeHeader(), null, "rteApplicationTypeHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteApplicationHeader(), this.getRteApplicationHeader(), null, "rteApplicationHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_ModuleInterlinkTypeHeader(), this.getModuleInterlinkTypeHeader(), null, "moduleInterlinkTypeHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_ModuleInterlinkHeader(), this.getModuleInterlinkHeader(), null, "moduleInterlinkHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteLifecycleHeader(), this.getRteLifecycleHeader(), null, "rteLifecycleHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteConfigurationHeader(), this.getRteConfigurationHeader(), null, "rteConfigurationHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteVfbTraceHeader(), this.getRteVfbTraceHeader(), null, "rteVfbTraceHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteCallbackHeader(), this.getRteCallbackHeader(), null, "rteCallbackHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteUtilityHeader(), this.getRteUtilityHeader(), null, "rteUtilityHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteBswApiHeader(), this.getRteBswApiHeader(), null, "rteBswApiHeader", null, 1, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteCommonHeader(), this.getRteInternalHeader(), null, "rteCommonHeader", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RtePartitionHeader(), this.getRteInternalHeader(), null, "rtePartitionHeader", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RteCommonSource(), this.getRteSource(), null, "rteCommonSource", null, 0, 1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteModule_RtePartitionSource(), this.getRteSource(), null, "rtePartitionSource", null, 0, -1, RteModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGlobalVariable_InitValueConstant(), this.getConstant(), null, "initValueConstant", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGlobalVariable_MemoryMapping(), this.getMemoryMapping(), null, "memoryMapping", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGlobalVariable_InitAtDefinition(), this.getBoolean(), "initAtDefinition", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGlobalVariable_InitWithConstantValue(), this.getBoolean(), "initWithConstantValue", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGlobalVariable_HasConst(), this.getBoolean(), "hasConst", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGlobalVariable_HasStatic(), this.getBoolean(), "hasStatic", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFile_FileName(), this.getString(), "fileName", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFile_GenerationInfo(), this.getGenerationInfo(), null, "generationInfo", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getParameter_PassType(), this.getParameterPassTypeEnum(), "passType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameter_Direction(), this.getParameterDirectionEnum(), "direction", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameter_HasConst(), this.getBoolean(), "hasConst", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getType_SymbolName(), this.getCIdentifier(), "symbolName", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getType_IsAnonymous(), this.getBoolean(), "isAnonymous", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getType_Signedness(), this.getSignednessEnum(), "signedness", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getType_OriginalTypeSymbolName(), this.getCIdentifier(), "originalTypeSymbolName", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getType_Size(), this.getInteger(), "size", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLocalVariable_InitValueConstant(), this.getConstant(), null, "initValueConstant", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLocalVariable_Parent(), this.getFunction(), this.getFunction_LocalVariable(), "parent", null, 1, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteApplicationHeaderEClass, RteApplicationHeader.class, "RteApplicationHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRteApplicationHeader_HasInlineApi(), this.getBoolean(), "hasInlineApi", null, 1, 1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApplicationHeader_SourceMacro(), this.getMacro(), null, "sourceMacro", null, 0, -1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApplicationHeader_GlobalVariableGroup(), this.getGlobalVariableFileContentsGroup(), null, "globalVariableGroup", null, 0, -1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApplicationHeader_RteApiGroup(), this.getRteApiFileContentsGroup(), null, "rteApiGroup", null, 0, -1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApplicationHeader_DeclarationsRteApiGroup(), this.getRteApiFileContentsGroup(), null, "DeclarationsRteApiGroup", null, 0, -1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApplicationHeader_Constant(), this.getConstant(), null, "constant", null, 0, -1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteApplicationHeader_DependentExecutableEntityGroup(), this.getExecutableEntityFileContentsGroup(), null, "dependentExecutableEntityGroup", null, 0, -1, RteApplicationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFunction_ReturnType(), this.getType(), null, "returnType", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunction_Param(), this.getParameter(), null, "param", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunction_LocalVariable(), this.getLocalVariable(), this.getLocalVariable_Parent(), "localVariable", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunction_LocalType(), this.getType(), null, "localType", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunction_MemoryMapping(), this.getMemoryMapping(), null, "memoryMapping", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFunction_SymbolName(), this.getCIdentifier(), "symbolName", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(logicalCompartmentEClass, LogicalCompartment.class, "LogicalCompartment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLogicalCompartment_CompartmentName(), this.getString(), "compartmentName", null, 1, 1, LogicalCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteEClass, Rte.class, "Rte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRte_Core(), this.getCore(), null, "core", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_Bswm(), this.getBswm(), null, "bswm", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_GenerationInfo(), this.getGenerationInfo(), null, "generationInfo", null, 1, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_DependentType(), this.getType(), null, "dependentType", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_DependentConstant(), this.getConstant(), null, "dependentConstant", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_DependentOsApi(), this.getOsApi(), null, "dependentOsApi", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_DependentIocCommunication(), this.getIocCommunication(), null, "dependentIocCommunication", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_DependentComApi(), this.getComApi(), null, "dependentComApi", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_IocInitValueConstant(), this.getConstant(), null, "iocInitValueConstant", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_IocInitValueVariableSet(), this.getRteBufferVariableSet(), null, "iocInitValueVariableSet", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_RteMemoryMapping(), this.getBswMemoryMapping(), null, "rteMemoryMapping", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ImplementationDataType(), this.getType(), null, "implementationDataType", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComSendSignalTfParamType(), this.getComSendTrustedFunctionParamType(), null, "comSendSignalTfParamType", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComSendSignalGroupTfParamType(), this.getComSendTrustedFunctionParamType(), null, "comSendSignalGroupTfParamType", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_CsTfParamType(), this.getCsTrustedFunctionParamType(), null, "csTfParamType", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_SrRteSendTfParamType(), this.getRteSendTrustedFunctionParamType(), null, "srRteSendTfParamType", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_SrRteBufferQueueMaxLengthConstant(), this.getConstant(), null, "srRteBufferQueueMaxLengthConstant", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_SrRteBufferQueueType(), this.getRteBufferQueueType(), null, "srRteBufferQueueType", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ImmediateConstant(), this.getConstant(), null, "immediateConstant", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComSendSignalTrustedFunction(), this.getComSendSignalTrustedFunction(), null, "comSendSignalTrustedFunction", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComSendSignalPeriodicEntity(), this.getComSendSignalPeriodicEntity(), null, "comSendSignalPeriodicEntity", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComSendSignalImmediateEntity(), this.getComSendSignalImmediateEntity(), null, "comSendSignalImmediateEntity", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComSendSignalImmediateTaskBody(), this.getComSendSignalImmediateTaskBody(), null, "comSendSignalImmediateTaskBody", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_ComCallback(), this.getComCallback(), null, "comCallback", null, 0, -1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_RteStartApi(), this.getRteStartApi(), null, "rteStartApi", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_RteStopApi(), this.getRteStopApi(), null, "rteStopApi", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_SchmInitApi(), this.getSchmInitApi(), null, "schmInitApi", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRte_SchmDeinitApi(), this.getSchmDeinitApi(), null, "schmDeinitApi", null, 0, 1, Rte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCore_Partition(), this.getPartition(), this.getPartition_Parent(), "partition", null, 0, -1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCore_CoreId(), this.getInteger(), "coreId", null, 1, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCore_IsMasterCore(), this.getBoolean(), "isMasterCore", null, 1, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCore_RteCoreStartApiImpl(), this.getRteCoreStartApiImpl(), this.getRteCoreStartApiImpl_Parent(), "rteCoreStartApiImpl", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCore_SchmCoreInitApiImpl(), this.getSchmCoreInitApiImpl(), this.getSchmCoreInitApiImpl_Parent(), "schmCoreInitApiImpl", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPartition_Parent(), this.getCore(), this.getCore_Partition(), "parent", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_Swc(), this.getSwc(), this.getSwc_Parent(), "swc", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_PartedBswm(), this.getPartedBswm(), this.getPartedBswm_Parent(), "partedBswm", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPartition_IsBswPartition(), this.getBoolean(), "isBswPartition", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_OsTrustedMacro(), this.getMacro(), null, "osTrustedMacro", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComReceiveBufferVariableSet(), this.getRteBufferVariableSet(), null, "comReceiveBufferVariableSet", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComSignalApiWrapper(), this.getComSignalApiWrapper(), this.getComSignalApiWrapper_Parent(), "comSignalApiWrapper", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComSignalApiAlias(), this.getFunctionMacro(), null, "comSignalApiAlias", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComMetaDataVariableSet(), this.getGlobalVariableSet(), null, "comMetaDataVariableSet", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComProxyFunction(), this.getComProxyFunction(), this.getComProxyFunction_Parent(), "comProxyFunction", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComProxyFunctionTableIndexConstant(), this.getConstant(), null, "comProxyFunctionTableIndexConstant", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComProxyFunctionTableSizeConstant(), this.getConstant(), null, "comProxyFunctionTableSizeConstant", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComProxyFunctionTableVariable(), this.getGlobalVariable(), null, "comProxyFunctionTableVariable", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_ComProxyBufferVariableSet(), this.getRteBufferVariableSet(), null, "comProxyBufferVariableSet", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_SrRteBufferInitValueConstant(), this.getConstant(), null, "srRteBufferInitValueConstant", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_SrRteBufferVariableSet(), this.getRteBufferVariableSet(), null, "srRteBufferVariableSet", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_SrRteBufferQueuedVariable(), this.getRteBufferQueuedVariable(), null, "srRteBufferQueuedVariable", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_RteBufferSendTrustedFunction(), this.getTrustedFunction(), null, "rteBufferSendTrustedFunction", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_SrFilterConstant(), this.getConstant(), null, "srFilterConstant", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_SrFilterOldValueVariable(), this.getGlobalVariable(), null, "srFilterOldValueVariable", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_SrFilterOccurrenceVariable(), this.getGlobalVariable(), null, "srFilterOccurrenceVariable", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_CsTfArgcConstant(), this.getConstant(), null, "csTfArgcConstant", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_CsTfOpidConstant(), this.getConstant(), null, "csTfOpidConstant", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_CsTrustedFunction(), this.getCsTrustedFunction(), null, "csTrustedFunction", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_EntityStartVariable(), this.getGlobalVariable(), null, "entityStartVariable", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_EntityStartConstant(), this.getConstant(), null, "entityStartConstant", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_TaskBody(), this.getTaskBody(), null, "taskBody", null, 0, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_RestartPartitionApi(), this.getRestartPartitionApi(), null, "restartPartitionApi", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_PartitionTerminatedApi(), this.getPartitionTerminatedApi(), null, "partitionTerminatedApi", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartition_PartitionRestartingApi(), this.getPartitionRestartingApi(), null, "partitionRestartingApi", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(swcEClass, Swc.class, "Swc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSwc_Parent(), this.getPartition(), this.getPartition_Swc(), "parent", null, 1, 1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_SwcMemoryMapping(), this.getSwcMemoryMapping(), null, "swcMemoryMapping", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_DependentRunnableEntity(), this.getRunnableEntity(), null, "dependentRunnableEntity", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_DependentExternalRunnableEntity(), this.getRunnableEntity(), null, "dependentExternalRunnableEntity", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_RteApi(), this.getRteApi(), this.getRteApi_Parent(), "rteApi", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_ApiEnumConstant(), this.getConstant(), null, "apiEnumConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_ApiUpperLowerLimitConstant(), this.getConstant(), null, "apiUpperLowerLimitConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_SrApiInitValueConstant(), this.getConstant(), null, "srApiInitValueConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_SrImplInitValueConstant(), this.getConstant(), null, "srImplInitValueConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_SrImplInvalidValueConstant(), this.getConstant(), null, "srImplInvalidValueConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_SrFilterConstant(), this.getConstant(), null, "srFilterConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_CsApiApplicationErrorConstant(), this.getConstant(), null, "csApiApplicationErrorConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_CsPortArgValueConstant(), this.getConstant(), null, "csPortArgValueConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_CsPortArgValueVariable(), this.getGlobalVariable(), null, "csPortArgValueVariable", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_IrvBufferInitValueConstant(), this.getConstant(), null, "irvBufferInitValueConstant", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSwc_IrvBufferVariableSet(), this.getRteBufferVariableSet(), null, "irvBufferVariableSet", null, 0, -1, Swc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteHeaderEClass, RteHeader.class, "RteHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rteBswApiHeaderEClass, RteBswApiHeader.class, "RteBswApiHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBswApiHeader_IocApi(), this.getIocApi(), null, "iocApi", null, 0, -1, RteBswApiHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteLifecycleHeaderEClass, RteLifecycleHeader.class, "RteLifecycleHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteLifecycleHeader_RteLifecycleApiGroup(), this.getRteLifecycleApiFileContentsGroup(), null, "rteLifecycleApiGroup", null, 0, -1, RteLifecycleHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteLifecycleHeader_SchmLifecycleApiGroup(), this.getSchmLifecycleApiFileContentsGroup(), null, "schmLifecycleApiGroup", null, 0, -1, RteLifecycleHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteApplicationTypeHeaderEClass, RteApplicationTypeHeader.class, "RteApplicationTypeHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteApplicationTypeHeader_Constant(), this.getConstant(), null, "constant", null, 0, -1, RteApplicationTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteVfbTraceHeaderEClass, RteVfbTraceHeader.class, "RteVfbTraceHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rteConfigurationHeaderEClass, RteConfigurationHeader.class, "RteConfigurationHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rteCallbackHeaderEClass, RteCallbackHeader.class, "RteCallbackHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteCallbackHeader_ComCallbackGroup(), this.getComCallbackFileContentsGroup(), null, "comCallbackGroup", null, 0, -1, RteCallbackHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteTypeHeaderEClass, RteTypeHeader.class, "RteTypeHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteTypeHeader_RteType(), this.getType(), null, "rteType", null, 0, -1, RteTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteTypeHeader_RteTypeConstant(), this.getConstant(), null, "rteTypeConstant", null, 0, -1, RteTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRteTypeHeader_ProvidesSignalGroupTransmission(), this.getBoolean(), "providesSignalGroupTransmission", null, 1, 1, RteTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(invalidateApiEClass, InvalidateApi.class, "InvalidateApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInvalidateApi_Operation(), this.getSendOperation(), null, "operation", null, 0, -1, InvalidateApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocNonqueuedSendOperationEClass, IocNonqueuedSendOperation.class, "IocNonqueuedSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocNonqueuedSendOperation_AccessApi(), this.getIocWriteApi(), null, "accessApi", null, 1, 1, IocNonqueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(directComSendOperationEClass, DirectComSendOperation.class, "DirectComSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(trustedFunctionRteOperationEClass, TrustedFunctionRteOperation.class, "TrustedFunctionRteOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrustedFunctionRteOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, TrustedFunctionRteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(trustedFunctionRteSendOperationEClass, TrustedFunctionRteSendOperation.class, "TrustedFunctionRteSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrustedFunctionRteSendOperation_Type(), this.getType(), null, "type", null, 1, 1, TrustedFunctionRteSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTrustedFunctionRteSendOperation_SrSendTfSymbolName(), this.getCIdentifier(), "srSendTfSymbolName", null, 1, 1, TrustedFunctionRteSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTrustedFunctionRteSendOperation_TrustedFunctionParamVariable(), this.getVariable(), null, "trustedFunctionParamVariable", null, 1, 1, TrustedFunctionRteSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTrustedFunctionRteSendOperation_IsGroup(), this.getBoolean(), "isGroup", null, 1, 1, TrustedFunctionRteSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(trustedFunctionRteBufferWriteSendOperationEClass, TrustedFunctionRteBufferWriteSendOperation.class, "TrustedFunctionRteBufferWriteSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrustedFunctionRteBufferWriteSendOperation_AccessTrustedFunction(), this.getRteBufferWriteTrustedFunction(), null, "accessTrustedFunction", null, 1, 1, TrustedFunctionRteBufferWriteSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(trustedFunctionComSendOperationEClass, TrustedFunctionComSendOperation.class, "TrustedFunctionComSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrustedFunctionComSendOperation_Type(), this.getType(), null, "type", null, 1, 1, TrustedFunctionComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTrustedFunctionComSendOperation_AccessTrustedFunction(), this.getComSendSignalTrustedFunction(), null, "accessTrustedFunction", null, 1, 1, TrustedFunctionComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTrustedFunctionComSendOperation_TrustedFunctionParamVariable(), this.getVariable(), null, "trustedFunctionParamVariable", null, 1, 1, TrustedFunctionComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTrustedFunctionComSendOperation_IsGroup(), this.getBoolean(), "isGroup", null, 1, 1, TrustedFunctionComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(immediateProxyComSendOperationEClass, ImmediateProxyComSendOperation.class, "ImmediateProxyComSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getImmediateProxyComSendOperation_ActivationApi(), this.getOsSetEventApi(), null, "activationApi", null, 1, 1, ImmediateProxyComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(periodicProxyComSendOperationEClass, PeriodicProxyComSendOperation.class, "PeriodicProxyComSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iocNonqueuedReadOperationEClass, IocNonqueuedReadOperation.class, "IocNonqueuedReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocNonqueuedReadOperation_AccessApi(), this.getIocReadApi(), null, "accessApi", null, 1, 1, IocNonqueuedReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comReadOperationEClass, ComReadOperation.class, "ComReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComReadOperation_AccessApi(), this.getComReceiveSignalApi(), null, "accessApi", null, 1, 1, ComReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComReadOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, ComReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocNonqueuedCommunicationEClass, IocNonqueuedCommunication.class, "IocNonqueuedCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocNonqueuedCommunication_WriteApi(), this.getIocWriteApi(), this.getIocWriteApi_Parent(), "writeApi", null, 0, -1, IocNonqueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocNonqueuedCommunication_ReadApi(), this.getIocReadApi(), null, "readApi", null, 1, 1, IocNonqueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocNonqueuedCommunication_InitValue(), this.getConstant(), null, "initValue", null, 1, 1, IocNonqueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocNonqueuedCommunication_InitValueVariable(), this.getGlobalVariable(), null, "initValueVariable", null, 1, 1, IocNonqueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocWriteApiEClass, IocWriteApi.class, "IocWriteApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocWriteApi_Parent(), this.getIocNonqueuedCommunication(), this.getIocNonqueuedCommunication_WriteApi(), "parent", null, 1, 1, IocWriteApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocReadApiEClass, IocReadApi.class, "IocReadApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comSendSignalApiEClass, ComSendSignalApi.class, "ComSendSignalApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comReceiveSignalApiEClass, ComReceiveSignalApi.class, "ComReceiveSignalApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comReceiveCallbackEClass, ComReceiveCallback.class, "ComReceiveCallback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComReceiveCallback_Operation(), this.getSendOperation(), null, "operation", null, 0, -1, ComReceiveCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComReceiveCallback_DataVariable(), this.getVariable(), null, "dataVariable", null, 1, 1, ComReceiveCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComReceiveCallback_AccessApi(), this.getComReceiveSignalApi(), null, "accessApi", null, 1, 1, ComReceiveCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSendOperationEClass, ComSendOperation.class, "ComSendOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComSendOperation_AccessApi(), this.getComSendSignalApi(), null, "accessApi", null, 1, 1, ComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComSendOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, ComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comCallbackEClass, ComCallback.class, "ComCallback", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comReceiveTimeoutCallbackEClass, ComReceiveTimeoutCallback.class, "ComReceiveTimeoutCallback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComReceiveTimeoutCallback_Operation(), this.getSendOperation(), null, "operation", null, 0, -1, ComReceiveTimeoutCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComReceiveTimeoutCallback_DataVariable(), this.getVariable(), null, "dataVariable", null, 1, 1, ComReceiveTimeoutCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComReceiveTimeoutCallback_AccessApi(), this.getComReceiveSignalApi(), null, "accessApi", null, 1, 1, ComReceiveTimeoutCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comInvalidateCallbackEClass, ComInvalidateCallback.class, "ComInvalidateCallback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComInvalidateCallback_Operation(), this.getSendOperation(), null, "operation", null, 0, -1, ComInvalidateCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComInvalidateCallback_FilterResultVariable(), this.getLocalVariable(), null, "filterResultVariable", null, 0, 1, ComInvalidateCallback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSendSignalProxyEntityEClass, ComSendSignalProxyEntity.class, "ComSendSignalProxyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComSendSignalProxyEntity_PrimitiveOperation(), this.getPrimitiveComSendProxyOperation(), null, "primitiveOperation", null, 0, -1, ComSendSignalProxyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComSendSignalProxyEntity_ComplexOperation(), this.getComplexComSendProxyOperation(), null, "complexOperation", null, 0, -1, ComSendSignalProxyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSendSignalImmediateEntityEClass, ComSendSignalImmediateEntity.class, "ComSendSignalImmediateEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comSendSignalPeriodicEntityEClass, ComSendSignalPeriodicEntity.class, "ComSendSignalPeriodicEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(filterOperationEClass, FilterOperation.class, "FilterOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFilterOperation_FilterResultVariable(), this.getVariable(), null, "filterResultVariable", null, 1, 1, FilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(maskedNewDiffersMaskedOldFilterOperationEClass, MaskedNewDiffersMaskedOldFilterOperation.class, "MaskedNewDiffersMaskedOldFilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMaskedNewDiffersMaskedOldFilterOperation_OldValueVariable(), this.getGlobalVariable(), null, "oldValueVariable", null, 1, 1, MaskedNewDiffersMaskedOldFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMaskedNewDiffersMaskedOldFilterOperation_Mask(), this.getConstant(), null, "mask", null, 1, 1, MaskedNewDiffersMaskedOldFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(maskedNewDiffersXFilterOperationEClass, MaskedNewDiffersXFilterOperation.class, "MaskedNewDiffersXFilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMaskedNewDiffersXFilterOperation_Mask(), this.getConstant(), null, "mask", null, 1, 1, MaskedNewDiffersXFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMaskedNewDiffersXFilterOperation_X(), this.getConstant(), null, "x", null, 1, 1, MaskedNewDiffersXFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(newIsWithinFilterOperationEClass, NewIsWithinFilterOperation.class, "NewIsWithinFilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNewIsWithinFilterOperation_Min(), this.getConstant(), null, "min", null, 1, 1, NewIsWithinFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNewIsWithinFilterOperation_Max(), this.getConstant(), null, "max", null, 1, 1, NewIsWithinFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(newIsOutsideFilterOperationEClass, NewIsOutsideFilterOperation.class, "NewIsOutsideFilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNewIsOutsideFilterOperation_Min(), this.getConstant(), null, "min", null, 1, 1, NewIsOutsideFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getNewIsOutsideFilterOperation_Max(), this.getConstant(), null, "max", null, 1, 1, NewIsOutsideFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(maskedNewEqualsXFilterOperationEClass, MaskedNewEqualsXFilterOperation.class, "MaskedNewEqualsXFilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMaskedNewEqualsXFilterOperation_Mask(), this.getConstant(), null, "mask", null, 1, 1, MaskedNewEqualsXFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getMaskedNewEqualsXFilterOperation_X(), this.getConstant(), null, "x", null, 1, 1, MaskedNewEqualsXFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oneEveryNFilterOperationEClass, OneEveryNFilterOperation.class, "OneEveryNFilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOneEveryNFilterOperation_OccurrenceVariable(), this.getGlobalVariable(), null, "occurrenceVariable", null, 1, 1, OneEveryNFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOneEveryNFilterOperation_Period(), this.getConstant(), null, "period", null, 1, 1, OneEveryNFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOneEveryNFilterOperation_Offset(), this.getConstant(), null, "offset", null, 1, 1, OneEveryNFilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteCoreStartApiImplEClass, RteCoreStartApiImpl.class, "RteCoreStartApiImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteCoreStartApiImpl_Operation(), this.getInitializeOperation(), null, "operation", null, 0, -1, RteCoreStartApiImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteCoreStartApiImpl_Parent(), this.getCore(), this.getCore_RteCoreStartApiImpl(), "parent", null, 1, 1, RteCoreStartApiImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteStopApiEClass, RteStopApi.class, "RteStopApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(restartPartitionApiEClass, RestartPartitionApi.class, "RestartPartitionApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRestartPartitionApi_Operation(), this.getInitializeOperation(), null, "operation", null, 0, -1, RestartPartitionApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(partitionRestartingApiEClass, PartitionRestartingApi.class, "PartitionRestartingApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPartitionRestartingApi_SrInterPartitionTimeoutOperation(), this.getInterPartitionTimeoutOperation(), null, "srInterPartitionTimeoutOperation", null, 0, 1, PartitionRestartingApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(partitionTerminatedApiEClass, PartitionTerminatedApi.class, "PartitionTerminatedApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPartitionTerminatedApi_SrInterPartitionTimeoutOperation(), this.getInterPartitionTimeoutOperation(), null, "srInterPartitionTimeoutOperation", null, 0, 1, PartitionTerminatedApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteLifecycleApiEClass, RteLifecycleApi.class, "RteLifecycleApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sendApiEClass, SendApi.class, "SendApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSendApi_Operation(), this.getSendOperation(), null, "operation", null, 0, -1, SendApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendApi_DataParam(), this.getParameter(), null, "dataParam", null, 1, 1, SendApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendApi_StatusVariable(), this.getLocalVariable(), null, "statusVariable", null, 1, 1, SendApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendApi_TrustedFunctionParamVariable(), this.getLocalVariable(), null, "trustedFunctionParamVariable", null, 0, 1, SendApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSendApi_FilterResultVariable(), this.getLocalVariable(), null, "filterResultVariable", null, 0, 1, SendApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSendApi_NeedsCheckArg(), this.getBoolean(), "needsCheckArg", null, 1, 1, SendApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(receiveApiEClass, ReceiveApi.class, "ReceiveApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReceiveApi_Operation(), this.getReadOperation(), null, "operation", null, 0, 1, ReceiveApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReceiveApi_DataParam(), this.getParameter(), null, "dataParam", null, 1, 1, ReceiveApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getReceiveApi_StatusVariable(), this.getLocalVariable(), null, "statusVariable", null, 1, 1, ReceiveApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferQueuedSendOperationEClass, RteBufferQueuedSendOperation.class, "RteBufferQueuedSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferQueuedSendOperation_AccessVariable(), this.getRteBufferQueuedVariable(), null, "accessVariable", null, 1, 1, RteBufferQueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferQueuedSendOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, RteBufferQueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferQueuedSendOperation_Type(), this.getType(), null, "type", null, 1, 1, RteBufferQueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferQueuedVariableEClass, RteBufferQueuedVariable.class, "RteBufferQueuedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferQueuedVariable_QueueType(), this.getRteBufferQueueType(), null, "queueType", null, 1, 1, RteBufferQueuedVariable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferQueuedReadOperationEClass, RteBufferQueuedReadOperation.class, "RteBufferQueuedReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferQueuedReadOperation_AccessVariable(), this.getRteBufferQueuedVariable(), null, "accessVariable", null, 1, 1, RteBufferQueuedReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocQueuedCommunicationEClass, IocQueuedCommunication.class, "IocQueuedCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocQueuedCommunication_SendApi(), this.getIocSendApi(), null, "sendApi", null, 0, -1, IocQueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocQueuedCommunication_ReceiveApi(), this.getIocReceiveApi(), null, "receiveApi", null, 1, 1, IocQueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocQueuedCommunication_IocEmptyQueueApi(), this.getIocEmptyQueueApi(), null, "IocEmptyQueueApi", null, 1, 1, IocQueuedCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocReceiveApiEClass, IocReceiveApi.class, "IocReceiveApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iocSendApiEClass, IocSendApi.class, "IocSendApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iocSendOperationEClass, IocSendOperation.class, "IocSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocSendOperation_Type(), this.getType(), null, "type", null, 1, 1, IocSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocQueuedSendOperationEClass, IocQueuedSendOperation.class, "IocQueuedSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocQueuedSendOperation_AccessApi(), this.getIocSendApi(), null, "accessApi", null, 1, 1, IocQueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocQueuedSendOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, IocQueuedSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocQueuedReadOperationEClass, IocQueuedReadOperation.class, "IocQueuedReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocQueuedReadOperation_AccessApi(), this.getIocReceiveApi(), null, "accessApi", null, 1, 1, IocQueuedReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocQueuedReadOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, IocQueuedReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(callApiEClass, CallApi.class, "CallApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCallApi_Operation(), this.getServerRunnableStartOperation(), null, "operation", null, 0, 1, CallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCallApi_OperationParam(), this.getParameter(), null, "operationParam", null, 0, -1, CallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCallApi_PortArgValue(), this.getValue(), null, "portArgValue", null, 0, -1, CallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCallApi_ReturnVariable(), this.getLocalVariable(), null, "returnVariable", null, 0, 1, CallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(tfCallApiEClass, TfCallApi.class, "TfCallApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTfCallApi_CsTfParamTypeName(), this.getCIdentifier(), "csTfParamTypeName", null, 1, 1, TfCallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTfCallApi_CsTfArgcConstantName(), this.getCIdentifier(), "csTfArgcConstantName", null, 1, 1, TfCallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTfCallApi_CsTfOpidConstantName(), this.getCIdentifier(), "csTfOpidConstantName", null, 1, 1, TfCallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTfCallApi_CsTfName(), this.getCIdentifier(), "csTfName", null, 1, 1, TfCallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTfCallApi_NeedsCheckArg(), this.getBoolean(), "needsCheckArg", null, 1, 1, TfCallApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(executableStartOperationEClass, ExecutableStartOperation.class, "ExecutableStartOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExecutableStartOperation_StartExecutable(), this.getExecutableEntity(), null, "startExecutable", null, 1, 1, ExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExecutableStartOperation_RieaExcludeOperation(), this.getExcludeOperation(), null, "rieaExcludeOperation", null, 0, -1, ExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExecutableStartOperation_DisabledInMode(), this.getDisabledInMode(), null, "disabledInMode", null, 0, -1, ExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(disabledInModeEClass, DisabledInMode.class, "DisabledInMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDisabledInMode_DisabledMode(), this.getConstant(), null, "disabledMode", null, 1, 1, DisabledInMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDisabledInMode_ModeMachineInstance(), this.getModeMachineInstance(), null, "modeMachineInstance", null, 1, 1, DisabledInMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(excludeOperationEClass, ExcludeOperation.class, "ExcludeOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(allInterruptBlockExcludeOperationEClass, AllInterruptBlockExcludeOperation.class, "AllInterruptBlockExcludeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(osInterruptBlockExcludeOperationEClass, OsInterruptBlockExcludeOperation.class, "OsInterruptBlockExcludeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(osSpinlockExcludeOperationEClass, OsSpinlockExcludeOperation.class, "OsSpinlockExcludeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOsSpinlockExcludeOperation_OsSpinlockId(), this.getCIdentifier(), "osSpinlockId", null, 1, 1, OsSpinlockExcludeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osResourceExcludeOperationEClass, OsResourceExcludeOperation.class, "OsResourceExcludeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOsResourceExcludeOperation_OsResourceId(), this.getCIdentifier(), "osResourceId", null, 1, 1, OsResourceExcludeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(noneExcludeOperationEClass, NoneExcludeOperation.class, "NoneExcludeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConstant_SymbolName(), this.getCIdentifier(), "symbolName", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConstant_ExternalSymbolName(), this.getCIdentifier(), "externalSymbolName", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstant_Type(), this.getType(), null, "type", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConstant_Value(), this.getVerbatimString(), "value", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConstant_ConstantValueType(), this.getConstantValueTypeEnum(), "constantValueType", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConstant_Member(), this.getConstantMember(), this.getConstantMember_Parent(), "member", null, 0, -1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConstant_RepresentedVariableName(), this.getString(), "representedVariableName", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(constantMemberEClass, ConstantMember.class, "ConstantMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConstantMember_Parent(), this.getConstant(), this.getConstant_Member(), "parent", null, 1, 1, ConstantMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteEnterApiEClass, RteEnterApi.class, "RteEnterApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteEnterApi_Operation(), this.getExcludeOperation(), null, "operation", null, 1, 1, RteEnterApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRteEnterApi_IsNoneExclude(), this.getBoolean(), "isNoneExclude", null, 1, 1, RteEnterApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteExitApiEClass, RteExitApi.class, "RteExitApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteExitApi_Operation(), this.getExcludeOperation(), null, "operation", null, 1, 1, RteExitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRteExitApi_IsNoneExclude(), this.getBoolean(), "isNoneExclude", null, 1, 1, RteExitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osTaskActivationExecutableTaskBodyEClass, OsTaskActivationExecutableTaskBody.class, "OsTaskActivationExecutableTaskBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOsTaskActivationExecutableTaskBody_Operation(), this.getOsTaskActivationOperation(), null, "operation", null, 1, 1, OsTaskActivationExecutableTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osEventSetExecutableTaskBodyEClass, OsEventSetExecutableTaskBody.class, "OsEventSetExecutableTaskBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOsEventSetExecutableTaskBody_Operation(), this.getOsEventSetActivationOperation(), null, "operation", null, 0, -1, OsEventSetExecutableTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOsEventSetExecutableTaskBody_OsEventId(), this.getCIdentifier(), "osEventId", null, 1, -1, OsEventSetExecutableTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOsEventSetExecutableTaskBody_ChecksOsEventId(), this.getBoolean(), "checksOsEventId", null, 1, 1, OsEventSetExecutableTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOsEventSetExecutableTaskBody_EventVariable(), this.getVariable(), null, "eventVariable", null, 0, 1, OsEventSetExecutableTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osTaskActivationOperationEClass, OsTaskActivationOperation.class, "OsTaskActivationOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(osEventSetActivationOperationEClass, OsEventSetActivationOperation.class, "OsEventSetActivationOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOsEventSetActivationOperation_ActivationOsEventId(), this.getCIdentifier(), "activationOsEventId", null, 1, 1, OsEventSetActivationOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(contextActivationOperationEClass, ContextActivationOperation.class, "ContextActivationOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContextActivationOperation_ExecutableStartOperation(), this.getExecutableStartOperation(), null, "executableStartOperation", null, 0, -1, ContextActivationOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getContextActivationOperation_CycleCountupOperation(), this.getCycleCountupOperation(), null, "cycleCountupOperation", null, 0, 1, ContextActivationOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getContextActivationOperation_StartOffsetCountupOperation(), this.getStartOffsetCountupOperation(), null, "startOffsetCountupOperation", null, 0, 1, ContextActivationOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timingTriggeringExecutableStartOperationEClass, TimingTriggeringExecutableStartOperation.class, "TimingTriggeringExecutableStartOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTimingTriggeringExecutableStartOperation_CyclePeriodConstant(), this.getConstant(), null, "cyclePeriodConstant", null, 0, 1, TimingTriggeringExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTimingTriggeringExecutableStartOperation_CycleOffsetConstant(), this.getConstant(), null, "cycleOffsetConstant", null, 0, 1, TimingTriggeringExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTimingTriggeringExecutableStartOperation_StartOffsetConstant(), this.getConstant(), null, "startOffsetConstant", null, 0, 1, TimingTriggeringExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTimingTriggeringExecutableStartOperation_StartOffsetCounterVariable(), this.getGlobalVariable(), null, "startOffsetCounterVariable", null, 0, 1, TimingTriggeringExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTimingTriggeringExecutableStartOperation_CycleCounterVariable(), this.getGlobalVariable(), null, "cycleCounterVariable", null, 0, 1, TimingTriggeringExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(modeSwitchTriggeringExecutableStartOperationEClass, ModeSwitchTriggeringExecutableStartOperation.class, "ModeSwitchTriggeringExecutableStartOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModeSwitchTriggeringExecutableStartOperation_StartMode(), this.getConstant(), null, "startMode", null, 0, -1, ModeSwitchTriggeringExecutableStartOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cycleCountupOperationEClass, CycleCountupOperation.class, "CycleCountupOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCycleCountupOperation_CounterVariable(), this.getGlobalVariable(), null, "counterVariable", null, 1, 1, CycleCountupOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCycleCountupOperation_MaxConstant(), this.getConstant(), null, "maxConstant", null, 1, 1, CycleCountupOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(startOffsetCountupOperationEClass, StartOffsetCountupOperation.class, "StartOffsetCountupOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStartOffsetCountupOperation_CounterVariable(), this.getGlobalVariable(), null, "counterVariable", null, 1, 1, StartOffsetCountupOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStartOffsetCountupOperation_MaxConstant(), this.getConstant(), null, "maxConstant", null, 1, 1, StartOffsetCountupOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(taskBodyEClass, TaskBody.class, "TaskBody", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTaskBody_OsTaskId(), this.getCIdentifier(), "osTaskId", null, 0, 1, TaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocEmptyQueueApiEClass, IocEmptyQueueApi.class, "IocEmptyQueueApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comApiEClass, ComApi.class, "ComApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComApi_IsSignalGroup(), this.getBoolean(), "isSignalGroup", null, 1, 1, ComApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComApi_ComSignalSymbolName(), this.getCIdentifier(), "comSignalSymbolName", null, 1, 1, ComApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocApiEClass, IocApi.class, "IocApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIocApi_MappingName(), this.getString(), "mappingName", null, 1, 1, IocApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(trustedFunctionEClass, TrustedFunction.class, "TrustedFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTrustedFunction_TrustedFunctionIndex(), this.getCIdentifier(), "trustedFunctionIndex", null, 1, 1, TrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSendSignalTrustedFunctionEClass, ComSendSignalTrustedFunction.class, "ComSendSignalTrustedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComSendSignalTrustedFunction_IsGroup(), this.getBoolean(), "isGroup", null, 1, 1, ComSendSignalTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComSendSignalTrustedFunction_SignalGroupSymbolName(), this.getCIdentifier(), "signalGroupSymbolName", null, 1, 1, ComSendSignalTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osSetEventApiEClass, OsSetEventApi.class, "OsSetEventApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOsSetEventApi_OsTaskId(), this.getCIdentifier(), "osTaskId", null, 1, 1, OsSetEventApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOsSetEventApi_OsEventId(), this.getCIdentifier(), "osEventId", null, 1, 1, OsSetEventApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osApiEClass, OsApi.class, "OsApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comSendSignalImmediateTaskBodyEClass, ComSendSignalImmediateTaskBody.class, "ComSendSignalImmediateTaskBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComSendSignalImmediateTaskBody_StartEntity(), this.getComSendSignalImmediateEntity(), null, "startEntity", null, 1, 1, ComSendSignalImmediateTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComSendSignalImmediateTaskBody_OsEventId(), this.getCIdentifier(), "osEventId", null, 1, 1, ComSendSignalImmediateTaskBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariable_Type(), this.getType(), null, "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariable_Member(), this.getVariableMember(), this.getVariableMember_Parent(), "member", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVariable_SymbolName(), this.getCIdentifier(), "symbolName", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(primitiveComSendProxyOperationEClass, PrimitiveComSendProxyOperation.class, "PrimitiveComSendProxyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPrimitiveComSendProxyOperation_ReadValueVariable(), this.getVariable(), null, "readValueVariable", null, 1, 1, PrimitiveComSendProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPrimitiveComSendProxyOperation_AccessApi(), this.getIocReceiveGroupApi(), null, "accessApi", null, 1, 1, PrimitiveComSendProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPrimitiveComSendProxyOperation_SignalIdVariable(), this.getVariable(), null, "signalIdVariable", null, 1, 1, PrimitiveComSendProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(complexComSendProxyOperationEClass, ComplexComSendProxyOperation.class, "ComplexComSendProxyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComplexComSendProxyOperation_AccessApi(), this.getIocReceiveApi(), null, "accessApi", null, 1, 1, ComplexComSendProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComplexComSendProxyOperation_FunctionTableSymbolName(), this.getCIdentifier(), "functionTableSymbolName", null, 1, 1, ComplexComSendProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComplexComSendProxyOperation_TableIndexVariable(), this.getVariable(), null, "tableIndexVariable", null, 1, 1, ComplexComSendProxyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocReceiveGroupApiEClass, IocReceiveGroupApi.class, "IocReceiveGroupApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIocReceiveGroupApi_ComSendSignalSymbolName(), this.getCIdentifier(), "comSendSignalSymbolName", null, 1, 1, IocReceiveGroupApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(moduleRootEClass, ModuleRoot.class, "ModuleRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModuleRoot_RteModule(), this.getRteModule(), null, "rteModule", null, 1, 1, ModuleRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleRoot_Rte(), this.getRte(), null, "rte", null, 1, 1, ModuleRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(interPartitionTimeoutOperationEClass, InterPartitionTimeoutOperation.class, "InterPartitionTimeoutOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInterPartitionTimeoutOperation_TimeoutVariable(), this.getRteBufferVariableSet(), null, "timeoutVariable", null, 1, -1, InterPartitionTimeoutOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterPartitionTimeoutOperation_ExcludeOperation(), this.getExcludeOperation(), null, "excludeOperation", null, 0, 1, InterPartitionTimeoutOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(initializeOperationEClass, InitializeOperation.class, "InitializeOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(variableInitializeOperationEClass, VariableInitializeOperation.class, "VariableInitializeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariableInitializeOperation_InitVariable(), this.getGlobalVariable(), null, "initVariable", null, 0, -1, VariableInitializeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariableInitializeOperation_ExcludeOperation(), this.getExcludeOperation(), null, "excludeOperation", null, 0, 1, VariableInitializeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocInitializeOperationEClass, IocInitializeOperation.class, "IocInitializeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocInitializeOperation_InitIocApi(), this.getIocApi(), null, "initIocApi", null, 0, -1, IocInitializeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osSuspendAllInterruptsApiEClass, OsSuspendAllInterruptsApi.class, "OsSuspendAllInterruptsApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(osGetSpinlockApiEClass, OsGetSpinlockApi.class, "OsGetSpinlockApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(multicoreRteStartApiEClass, MulticoreRteStartApi.class, "MulticoreRteStartApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMulticoreRteStartApi_CoreStartApiImpl(), this.getRteCoreStartApiImpl(), null, "coreStartApiImpl", null, 0, -1, MulticoreRteStartApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferWriteTrustedFunctionEClass, RteBufferWriteTrustedFunction.class, "RteBufferWriteTrustedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferWriteTrustedFunction_Operation(), this.getSendOperation(), null, "operation", null, 1, 1, RteBufferWriteTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferWriteTrustedFunction_DataVariable(), this.getLocalVariable(), null, "dataVariable", null, 1, 1, RteBufferWriteTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(csTrustedFunctionEClass, CsTrustedFunction.class, "CsTrustedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCsTrustedFunction_DataVariable(), this.getLocalVariable(), null, "dataVariable", null, 1, 1, CsTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCsTrustedFunction_CsTfParamTypeName(), this.getCIdentifier(), "csTfParamTypeName", null, 1, 1, CsTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCsTrustedFunction_CsTfCalledRunnable(), this.getCsTfCalledRunnable(), null, "csTfCalledRunnable", null, 0, -1, CsTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(csTfCalledRunnableEClass, CsTfCalledRunnable.class, "CsTfCalledRunnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCsTfCalledRunnable_CsTfOpidConstantName(), this.getCIdentifier(), "csTfOpidConstantName", null, 1, 1, CsTfCalledRunnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCsTfCalledRunnable_StartOperation(), this.getServerRunnableStartOperation(), null, "startOperation", null, 1, 1, CsTfCalledRunnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(serverRunnableStartOperationEClass, ServerRunnableStartOperation.class, "ServerRunnableStartOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getServerRunnableStartOperation_StartServerRunnable(), this.getRunnableEntity(), null, "startServerRunnable", null, 1, 1, ServerRunnableStartOperation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocCommunicationEClass, IocCommunication.class, "IocCommunication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(proxyComSendOperationEClass, ProxyComSendOperation.class, "ProxyComSendOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProxyComSendOperation_Type(), this.getType(), null, "type", null, 1, 1, ProxyComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProxyComSendOperation_RequestProxyIocApi(), this.getIocSendApi(), null, "requestProxyIocApi", null, 1, 1, ProxyComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProxyComSendOperation_ValueProxyIocApi(), this.getIocSendApi(), null, "valueProxyIocApi", null, 0, 1, ProxyComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProxyComSendOperation_ProxyFunctionIndexConstantName(), this.getCIdentifier(), "proxyFunctionIndexConstantName", null, 0, 1, ProxyComSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(iocSendGroupApiEClass, IocSendGroupApi.class, "IocSendGroupApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iocQueuedGroupCommunicationEClass, IocQueuedGroupCommunication.class, "IocQueuedGroupCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIocQueuedGroupCommunication_ReceiveApi(), this.getIocReceiveGroupApi(), null, "receiveApi", null, 1, 1, IocQueuedGroupCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getIocQueuedGroupCommunication_SendApi(), this.getIocSendGroupApi(), null, "sendApi", null, 1, 1, IocQueuedGroupCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(singlecoreRteStartApiEClass, SinglecoreRteStartApi.class, "SinglecoreRteStartApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSinglecoreRteStartApi_Operation(), this.getInitializeOperation(), null, "operation", null, 0, -1, SinglecoreRteStartApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteStartApiEClass, RteStartApi.class, "RteStartApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(headerFileEClass, HeaderFile.class, "HeaderFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHeaderFile_GuardName(), this.getString(), "guardName", null, 1, 1, HeaderFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHeaderFile_IncludeHeader(), this.getHeaderFile(), null, "includeHeader", null, 0, -1, HeaderFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sourceFileEClass, SourceFile.class, "SourceFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSourceFile_IncludeHeader(), this.getHeaderFile(), null, "includeHeader", null, 0, -1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteInternalHeaderEClass, RteInternalHeader.class, "RteInternalHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteInternalHeader_Constant(), this.getConstant(), null, "constant", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_GlobalVariableGroup(), this.getGlobalVariableFileContentsGroup(), null, "globalVariableGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_TrustedFunctionGroup(), this.getTrustedFunctionFileContentsGroup(), null, "trustedFunctionGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_BswSchedulableEntityGroup(), this.getBswSchedulableEntityFileContentsGroup(), null, "bswSchedulableEntityGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_RteCoreStartApiImpl(), this.getRteCoreStartApiImpl(), null, "rteCoreStartApiImpl", null, 0, 1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_DependentExecutableEntityGroup(), this.getExecutableEntityFileContentsGroup(), null, "dependentExecutableEntityGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_SchmCoreInitApiImpl(), this.getSchmCoreInitApiImpl(), null, "schmCoreInitApiImpl", null, 0, 1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_FunctionMacro(), this.getFunctionMacro(), null, "functionMacro", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_ComProxyFunctionTableGroup(), this.getComProxyFunctionTableFileContentsGroup(), null, "comProxyFunctionTableGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_ComSignalApiWrapperGroup(), this.getComSignalApiWrapperFileContentsGroup(), null, "comSignalApiWrapperGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_ModeType(), this.getModeType(), null, "modeType", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_ModeDeclarationGroup(), this.getModeDeclarationGroup(), null, "modeDeclarationGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_ModeMachineInstance(), this.getModeMachineInstance(), null, "modeMachineInstance", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_RteApiGroup(), this.getRteApiFileContentsGroup(), null, "rteApiGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteInternalHeader_SchmApiGroup(), this.getSchmApiFileContentsGroup(), null, "schmApiGroup", null, 0, -1, RteInternalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(modeTypeEClass, ModeType.class, "ModeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getModeType_GuardName(), this.getCIdentifier(), "guardName", null, 1, 1, ModeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeType_ImplementationDataType(), this.getType(), null, "implementationDataType", null, 1, 1, ModeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(modeDeclarationGroupEClass, ModeDeclarationGroup.class, "ModeDeclarationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModeDeclarationGroup_ModeType(), this.getModeType(), null, "modeType", null, 1, 1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeDeclarationGroup_ImplementationDataType(), this.getType(), null, "implementationDataType", null, 1, 1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeDeclarationGroup_ModeConstant(), this.getConstant(), null, "modeConstant", null, 0, -1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeDeclarationGroup_ModeTransitionStatusConstant(), this.getConstant(), null, "modeTransitionStatusConstant", null, 1, 1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeDeclarationGroup_InitModeConstant(), this.getConstant(), null, "initModeConstant", null, 1, 1, ModeDeclarationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(modeQueueTypeEClass, ModeQueueType.class, "ModeQueueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModeQueueType_MaxLengthConstant(), this.getConstant(), null, "maxLengthConstant", null, 1, 1, ModeQueueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeQueueType_ElementType(), this.getType(), null, "elementType", null, 1, 1, ModeQueueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(modeQueuedVariableEClass, ModeQueuedVariable.class, "ModeQueuedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModeQueuedVariable_QueueType(), this.getModeQueueType(), null, "queueType", null, 1, 1, ModeQueuedVariable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(modeMachineInstanceEClass, ModeMachineInstance.class, "ModeMachineInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModeMachineInstance_RequestModeQueueType(), this.getModeQueueType(), null, "requestModeQueueType", null, 1, 1, ModeMachineInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeMachineInstance_RequestModeQueue(), this.getModeQueuedVariable(), null, "requestModeQueue", null, 1, 1, ModeMachineInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeMachineInstance_CurrentModeVariable(), this.getGlobalVariable(), null, "currentModeVariable", null, 1, 1, ModeMachineInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeMachineInstance_NextModeVariable(), this.getGlobalVariable(), null, "nextModeVariable", null, 1, 1, ModeMachineInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeMachineInstance_InitModeConstant(), this.getConstant(), null, "initModeConstant", null, 1, 1, ModeMachineInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(functionMacroEClass, FunctionMacro.class, "FunctionMacro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFunctionMacro_SymbolName(), this.getCIdentifier(), "symbolName", null, 1, 1, FunctionMacro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFunctionMacro_FunctionName(), this.getCIdentifier(), "functionName", null, 1, 1, FunctionMacro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comProxyFunctionTableFileContentsGroupEClass, ComProxyFunctionTableFileContentsGroup.class, "ComProxyFunctionTableFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComProxyFunctionTableFileContentsGroup_SrWriteProxyName(), this.getCIdentifier(), "srWriteProxyName", null, 0, -1, ComProxyFunctionTableFileContentsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(redefinitionPrimitiveTypeEClass, RedefinitionPrimitiveType.class, "RedefinitionPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArrayType_ArraySize(), this.getInteger(), "arraySize", null, 1, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(redefinitionArrayTypeEClass, RedefinitionArrayType.class, "RedefinitionArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(unionTypeEClass, UnionType.class, "UnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getUnionType_Member(), this.getUnionMember(), null, "member", null, 0, -1, UnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(redefinitionUnionTypeEClass, RedefinitionUnionType.class, "RedefinitionUnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStructType_Member(), this.getStructMember(), null, "member", null, 0, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(redefinitionStructTypeEClass, RedefinitionStructType.class, "RedefinitionStructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(blackboxTypeEClass, BlackboxType.class, "BlackboxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(unionMemberEClass, UnionMember.class, "UnionMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getUnionMember_MemberName(), this.getCIdentifier(), "memberName", null, 1, 1, UnionMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getUnionMember_Type(), this.getType(), null, "type", null, 1, 1, UnionMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(structMemberEClass, StructMember.class, "StructMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStructMember_MemberName(), this.getCIdentifier(), "memberName", null, 1, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructMember_Type(), this.getType(), null, "type", null, 1, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(variableMemberEClass, VariableMember.class, "VariableMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariableMember_Parent(), this.getVariable(), this.getVariable_Member(), "parent", null, 1, 1, VariableMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteUtilityHeaderEClass, RteUtilityHeader.class, "RteUtilityHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(blackboxHeaderEClass, BlackboxHeader.class, "BlackboxHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rteBufferQueueTypeEClass, RteBufferQueueType.class, "RteBufferQueueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferQueueType_MaxLengthConstant(), this.getConstant(), null, "maxLengthConstant", null, 1, 1, RteBufferQueueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRteBufferQueueType_ElementType(), this.getType(), null, "elementType", null, 1, 1, RteBufferQueueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteSendTrustedFunctionParamTypeEClass, RteSendTrustedFunctionParamType.class, "RteSendTrustedFunctionParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comSendTrustedFunctionParamTypeEClass, ComSendTrustedFunctionParamType.class, "ComSendTrustedFunctionParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComSendTrustedFunctionParamType_IsGroup(), this.getBoolean(), "isGroup", null, 1, 1, ComSendTrustedFunctionParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(csTrustedFunctionParamTypeEClass, CsTrustedFunctionParamType.class, "CsTrustedFunctionParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(neverReadOperationEClass, NeverReadOperation.class, "NeverReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNeverReadOperation_InitValueConstant(), this.getConstant(), null, "initValueConstant", null, 1, 1, NeverReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteBufferInvalidateTrustedFunctionEClass, RteBufferInvalidateTrustedFunction.class, "RteBufferInvalidateTrustedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteBufferInvalidateTrustedFunction_Operation(), this.getSendOperation(), null, "operation", null, 1, 1, RteBufferInvalidateTrustedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(trustedFunctionRteBufferInvalidateSendOperationEClass, TrustedFunctionRteBufferInvalidateSendOperation.class, "TrustedFunctionRteBufferInvalidateSendOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrustedFunctionRteBufferInvalidateSendOperation_AccessTrustedFunction(), this.getRteBufferInvalidateTrustedFunction(), null, "accessTrustedFunction", null, 1, 1, TrustedFunctionRteBufferInvalidateSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTrustedFunctionRteBufferInvalidateSendOperation_TempReturnVariable(), this.getVariable(), null, "tempReturnVariable", null, 0, 1, TrustedFunctionRteBufferInvalidateSendOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(memoryMappingEClass, MemoryMapping.class, "MemoryMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMemoryMapping_Prefix(), this.getCIdentifier(), "prefix", null, 1, 1, MemoryMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMemoryMapping_MemorySectionSymbolName(), this.getCIdentifier(), "memorySectionSymbolName", null, 1, 1, MemoryMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(swcMemoryMappingEClass, SwcMemoryMapping.class, "SwcMemoryMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(bswMemoryMappingEClass, BswMemoryMapping.class, "BswMemoryMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(globalVariableFileContentsGroupEClass, GlobalVariableFileContentsGroup.class, "GlobalVariableFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGlobalVariableFileContentsGroup_GlobalVariable(), this.getGlobalVariable(), null, "globalVariable", null, 0, -1, GlobalVariableFileContentsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGlobalVariableFileContentsGroup_MemoryMapping(), this.getMemoryMapping(), null, "memoryMapping", null, 1, 1, GlobalVariableFileContentsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(functionFileContentsGroupEClass, FunctionFileContentsGroup.class, "FunctionFileContentsGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFunctionFileContentsGroup_MemoryMapping(), this.getMemoryMapping(), null, "memoryMapping", null, 1, 1, FunctionFileContentsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunctionFileContentsGroup_Function(), this.getFunction(), null, "function", null, 0, -1, FunctionFileContentsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteApiFileContentsGroupEClass, RteApiFileContentsGroup.class, "RteApiFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteApiFileContentsGroup_RteApi(), this.getRteApi(), null, "rteApi", null, 0, -1, RteApiFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rteLifecycleApiFileContentsGroupEClass, RteLifecycleApiFileContentsGroup.class, "RteLifecycleApiFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRteLifecycleApiFileContentsGroup_RteLifecycleApi(), this.getRteLifecycleApi(), null, "rteLifecycleApi", null, 0, -1, RteLifecycleApiFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(taskBodyFileContentsGroupEClass, TaskBodyFileContentsGroup.class, "TaskBodyFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTaskBodyFileContentsGroup_TaskBody(), this.getTaskBody(), null, "taskBody", null, 0, -1, TaskBodyFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(bswSchedulableEntityFileContentsGroupEClass, BswSchedulableEntityFileContentsGroup.class, "BswSchedulableEntityFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBswSchedulableEntityFileContentsGroup_BswSchedulableEntity(), this.getBswSchedulableEntity(), null, "bswSchedulableEntity", null, 0, -1, BswSchedulableEntityFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comCallbackFileContentsGroupEClass, ComCallbackFileContentsGroup.class, "ComCallbackFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComCallbackFileContentsGroup_ComCallback(), this.getComCallback(), null, "comCallback", null, 0, -1, ComCallbackFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(trustedFunctionFileContentsGroupEClass, TrustedFunctionFileContentsGroup.class, "TrustedFunctionFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTrustedFunctionFileContentsGroup_TrustedFunction(), this.getTrustedFunction(), null, "trustedFunction", null, 0, -1, TrustedFunctionFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(executableEntityFileContentsGroupEClass, ExecutableEntityFileContentsGroup.class, "ExecutableEntityFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExecutableEntityFileContentsGroup_ExecutableEntity(), this.getExecutableEntity(), null, "executableEntity", null, 0, -1, ExecutableEntityFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(bswMemoryMappingHeaderEClass, BswMemoryMappingHeader.class, "BswMemoryMappingHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBswMemoryMappingHeader_MemoryMapping(), this.getBswMemoryMapping(), null, "memoryMapping", null, 0, -1, BswMemoryMappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(swcMemoryMappingHeaderEClass, SwcMemoryMappingHeader.class, "SwcMemoryMappingHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSwcMemoryMappingHeader_MemoryMapping(), this.getSwcMemoryMapping(), null, "memoryMapping", null, 0, -1, SwcMemoryMappingHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(generationInfoEClass, GenerationInfo.class, "GenerationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGenerationInfo_GeneratorName(), this.getString(), "generatorName", null, 1, 1, GenerationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenerationInfo_GeneratorVersion(), this.getString(), "generatorVersion", null, 1, 1, GenerationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenerationInfo_GenerationDate(), this.getString(), "generationDate", null, 0, 1, GenerationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(macroEClass, Macro.class, "Macro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMacro_SymbolName(), theM2Package.getCIdentifier(), "symbolName", null, 1, 1, Macro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmApiEClass, SchmApi.class, "SchmApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmApi_ReturnValue(), this.getValue(), null, "returnValue", null, 0, 1, SchmApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmApi_Parent(), this.getPartedBswm(), this.getPartedBswm_SchmApi(), "parent", null, 1, 1, SchmApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSchmApi_IsInline(), this.getBoolean(), "isInline", null, 1, 1, SchmApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSignalApiWrapperEClass, ComSignalApiWrapper.class, "ComSignalApiWrapper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComSignalApiWrapper_DataParam(), this.getParameter(), null, "dataParam", null, 1, 1, ComSignalApiWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComSignalApiWrapper_Parent(), this.getPartition(), this.getPartition_ComSignalApiWrapper(), "parent", null, 1, 1, ComSignalApiWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComSignalApiWrapper_SignalSymbolName(), this.getCIdentifier(), "signalSymbolName", null, 1, 1, ComSignalApiWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComSignalApiWrapper_SignalGroupSymbolName(), this.getCIdentifier(), "signalGroupSymbolName", null, 1, 1, ComSignalApiWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comProxyFunctionEClass, ComProxyFunction.class, "ComProxyFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComProxyFunction_Parent(), this.getPartition(), this.getPartition_ComProxyFunction(), "parent", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComProxyFunction_IocReceiveSymbolName(), this.getCIdentifier(), "iocReceiveSymbolName", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComProxyFunction_SignalGroupSymbolName(), this.getCIdentifier(), "signalGroupSymbolName", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComProxyFunction_BufferComProxySymbolName(), this.getCIdentifier(), "bufferComProxySymbolName", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComProxyFunction_BufferComMetaComplexDataSymbolName(), this.getCIdentifier(), "bufferComMetaComplexDataSymbolName", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComProxyFunction_ProxyDataTypeName(), this.getCIdentifier(), "proxyDataTypeName", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComProxyFunction_IsGroup(), this.getBoolean(), "isGroup", null, 1, 1, ComProxyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSendSignalApiWrapperEClass, ComSendSignalApiWrapper.class, "ComSendSignalApiWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(comReceiveSignalApiWrapperEClass, ComReceiveSignalApiWrapper.class, "ComReceiveSignalApiWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(schmLifecycleApiEClass, SchmLifecycleApi.class, "SchmLifecycleApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(schmEnterApiEClass, SchmEnterApi.class, "SchmEnterApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmEnterApi_Operation(), this.getExcludeOperation(), null, "operation", null, 1, 1, SchmEnterApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSchmEnterApi_IsNoneExclude(), this.getBoolean(), "isNoneExclude", null, 1, 1, SchmEnterApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmExitApiEClass, SchmExitApi.class, "SchmExitApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmExitApi_Operation(), this.getExcludeOperation(), null, "operation", null, 1, 1, SchmExitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSchmExitApi_IsNoneExclude(), this.getBoolean(), "isNoneExclude", null, 1, 1, SchmExitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmModeApiEClass, SchmModeApi.class, "SchmModeApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmModeApi_ModeDeclarationGroup(), this.getModeDeclarationGroup(), null, "modeDeclarationGroup", null, 1, 1, SchmModeApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmModeApi_ModeMachineInstance(), this.getModeMachineInstance(), null, "modeMachineInstance", null, 0, 1, SchmModeApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmSwitchApiEClass, SchmSwitchApi.class, "SchmSwitchApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmSwitchApi_ModeMachineInstance(), this.getModeMachineInstance(), null, "modeMachineInstance", null, 0, 1, SchmSwitchApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmSwitchApi_OsTaskEventTriggeredByMode(), this.getOsTaskEventsTriggeredByMode(), null, "osTaskEventTriggeredByMode", null, 0, -1, SchmSwitchApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmSwitchApi_ExecutableStartOperation(), this.getModeSwitchTriggeringExecutableStartOperation(), null, "executableStartOperation", null, 0, -1, SchmSwitchApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osTaskEventsTriggeredByModeEClass, OsTaskEventsTriggeredByMode.class, "OsTaskEventsTriggeredByMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOsTaskEventsTriggeredByMode_StartMode(), this.getConstant(), null, "startMode", null, 1, 1, OsTaskEventsTriggeredByMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOsTaskEventsTriggeredByMode_OsTaskEvent(), this.getOsTaskEvent(), null, "osTaskEvent", null, 0, -1, OsTaskEventsTriggeredByMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(osTaskEventEClass, OsTaskEvent.class, "OsTaskEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOsTaskEvent_OsTaskId(), this.getCIdentifier(), "osTaskId", null, 1, 1, OsTaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOsTaskEvent_OsEventId(), this.getCIdentifier(), "osEventId", null, 0, -1, OsTaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOsTaskEvent_OsTaskPriority(), this.getInteger(), "osTaskPriority", null, 1, 1, OsTaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(moduleInterlinkHeaderEClass, ModuleInterlinkHeader.class, "ModuleInterlinkHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModuleInterlinkHeader_GlobalVariableGroup(), this.getGlobalVariableFileContentsGroup(), null, "globalVariableGroup", null, 0, -1, ModuleInterlinkHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleInterlinkHeader_SchmApiGroup(), this.getSchmApiFileContentsGroup(), null, "schmApiGroup", null, 0, -1, ModuleInterlinkHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleInterlinkHeader_DependentExecutableEntityGroup(), this.getExecutableEntityFileContentsGroup(), null, "dependentExecutableEntityGroup", null, 0, -1, ModuleInterlinkHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleInterlinkHeader_Constant(), this.getConstant(), null, "constant", null, 0, -1, ModuleInterlinkHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmApiFileContentsGroupEClass, SchmApiFileContentsGroup.class, "SchmApiFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmApiFileContentsGroup_SchmApi(), this.getSchmApi(), null, "schmApi", null, 0, -1, SchmApiFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comSignalApiWrapperFileContentsGroupEClass, ComSignalApiWrapperFileContentsGroup.class, "ComSignalApiWrapperFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComSignalApiWrapperFileContentsGroup_ComSignalApiWrapper(), this.getComSignalApiWrapper(), null, "comSignalApiWrapper", null, 0, -1, ComSignalApiWrapperFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(comProxyFunctionFileContentsGroupEClass, ComProxyFunctionFileContentsGroup.class, "ComProxyFunctionFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComProxyFunctionFileContentsGroup_ComProxyFunction(), this.getComProxyFunction(), null, "comProxyFunction", null, 0, -1, ComProxyFunctionFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(moduleInterlinkTypeHeaderEClass, ModuleInterlinkTypeHeader.class, "ModuleInterlinkTypeHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModuleInterlinkTypeHeader_Constant(), this.getConstant(), null, "constant", null, 0, -1, ModuleInterlinkTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleInterlinkTypeHeader_ModeType(), this.getModeType(), null, "modeType", null, 0, -1, ModuleInterlinkTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getModuleInterlinkTypeHeader_ModeDeclarationGroup(), this.getModeDeclarationGroup(), null, "modeDeclarationGroup", null, 0, -1, ModuleInterlinkTypeHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmLifecycleApiFileContentsGroupEClass, SchmLifecycleApiFileContentsGroup.class, "SchmLifecycleApiFileContentsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmLifecycleApiFileContentsGroup_SchmLifecycleApi(), this.getSchmLifecycleApi(), null, "schmLifecycleApi", null, 0, -1, SchmLifecycleApiFileContentsGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(partedBswmEClass, PartedBswm.class, "PartedBswm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPartedBswm_Parent(), this.getPartition(), this.getPartition_PartedBswm(), "parent", null, 1, 1, PartedBswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartedBswm_Bswm(), this.getBswm(), this.getBswm_PartedBswm(), "bswm", null, 1, 1, PartedBswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartedBswm_BswMemoryMapping(), this.getBswMemoryMapping(), null, "bswMemoryMapping", null, 0, -1, PartedBswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartedBswm_DependentBswSchedulableEntity(), this.getBswSchedulableEntity(), this.getBswSchedulableEntity_ParentPartedBswm(), "dependentBswSchedulableEntity", null, 0, -1, PartedBswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartedBswm_ModeMachineInstance(), this.getModeMachineInstance(), null, "modeMachineInstance", null, 0, -1, PartedBswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPartedBswm_SchmApi(), this.getSchmApi(), this.getSchmApi_Parent(), "schmApi", null, 0, -1, PartedBswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(bswmEClass, Bswm.class, "Bswm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBswm_PartedBswm(), this.getPartedBswm(), this.getPartedBswm_Bswm(), "partedBswm", null, 0, -1, Bswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getBswm_ModeDeclarationGroup(), this.getModeDeclarationGroup(), null, "modeDeclarationGroup", null, 0, -1, Bswm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getBswm__GetSinglePartedBswm__Partition(), this.getPartedBswm(), "getSinglePartedBswm", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getPartition(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmDeinitApiEClass, SchmDeinitApi.class, "SchmDeinitApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(schmInitApiEClass, SchmInitApi.class, "SchmInitApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmInitApi_Operation(), this.getInitializeOperation(), null, "operation", null, 0, -1, SchmInitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmInitApi_InitialExecutableStartOperation(), this.getModeSwitchTriggeringExecutableStartOperation(), null, "initialExecutableStartOperation", null, 0, -1, SchmInitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmInitApi_InitialExecutableOsTaskEvent(), this.getOsTaskEvent(), null, "initialExecutableOsTaskEvent", null, 0, -1, SchmInitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSchmInitApi_InitTargetModeMachineInstance(), this.getModeMachineInstance(), null, "initTargetModeMachineInstance", null, 0, -1, SchmInitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(singlecoreSchmInitApiEClass, SinglecoreSchmInitApi.class, "SinglecoreSchmInitApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(multicoreSchmInitApiEClass, MulticoreSchmInitApi.class, "MulticoreSchmInitApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMulticoreSchmInitApi_CoreInitApiImpl(), this.getSchmCoreInitApiImpl(), null, "coreInitApiImpl", null, 0, -1, MulticoreSchmInitApi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(schmCoreInitApiImplEClass, SchmCoreInitApiImpl.class, "SchmCoreInitApiImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSchmCoreInitApiImpl_Parent(), this.getCore(), this.getCore_SchmCoreInitApiImpl(), "parent", null, 1, 1, SchmCoreInitApiImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pointerTypeEClass, PointerType.class, "PointerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPointerType_Type(), this.getType(), null, "type", null, 1, 1, PointerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPointerType_IsConstPointer(), this.getBoolean(), "isConstPointer", null, 1, 1, PointerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPointerType_IsConstTarget(), this.getBoolean(), "isConstTarget", null, 1, 1, PointerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(redefinitionPointerTypeEClass, RedefinitionPointerType.class, "RedefinitionPointerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(redefinitionTypeEClass, RedefinitionType.class, "RedefinitionType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRedefinitionType_SourceType(), this.getType(), null, "sourceType", null, 1, 1, RedefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getRedefinitionType__GetLeafType(), this.getType(), "getLeafType", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(parameterPassTypeEnumEEnum, ParameterPassTypeEnum.class, "ParameterPassTypeEnum"); //$NON-NLS-1$
		addEEnumLiteral(parameterPassTypeEnumEEnum, ParameterPassTypeEnum.VALUE);
		addEEnumLiteral(parameterPassTypeEnumEEnum, ParameterPassTypeEnum.REFERENCE);

		initEEnum(parameterDirectionEnumEEnum, ParameterDirectionEnum.class, "ParameterDirectionEnum"); //$NON-NLS-1$
		addEEnumLiteral(parameterDirectionEnumEEnum, ParameterDirectionEnum.IN);
		addEEnumLiteral(parameterDirectionEnumEEnum, ParameterDirectionEnum.OUT);
		addEEnumLiteral(parameterDirectionEnumEEnum, ParameterDirectionEnum.INOUT);

		initEEnum(signednessEnumEEnum, SignednessEnum.class, "SignednessEnum"); //$NON-NLS-1$
		addEEnumLiteral(signednessEnumEEnum, SignednessEnum.SIGNED);
		addEEnumLiteral(signednessEnumEEnum, SignednessEnum.UNSIGNED);

		initEEnum(constantValueTypeEnumEEnum, ConstantValueTypeEnum.class, "ConstantValueTypeEnum"); //$NON-NLS-1$
		addEEnumLiteral(constantValueTypeEnumEEnum, ConstantValueTypeEnum.NUMERICAL_VALUE);
		addEEnumLiteral(constantValueTypeEnumEEnum, ConstantValueTypeEnum.TEXT_VALUE);
		addEEnumLiteral(constantValueTypeEnumEEnum, ConstantValueTypeEnum.UNKNOWN_VALUE);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(verbatimStringEDataType, String.class, "VerbatimString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(cIdentifierEDataType, String.class, "CIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$ //$NON-NLS-2$
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$ //$NON-NLS-2$
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"; //$NON-NLS-1$	
		addAnnotation
		  (getRteBufferQueuedVariable_QueueType(), 
		   source, 
		   new String[] {
			 "derivation", "self.type.oclAsType(RteBufferQueueType)" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getServerRunnableStartOperation_StartServerRunnable(), 
		   source, 
		   new String[] {
			 "derivation", "self.startExecutable.oclAsType(RunnableEntity)" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getModeQueuedVariable_QueueType(), 
		   source, 
		   new String[] {
			 "derivation", "self.type.oclAsType(ModeQueueType)" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRteApiFileContentsGroup_RteApi(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(RteApi)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRteLifecycleApiFileContentsGroup_RteLifecycleApi(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(RteLifecycleApi)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTaskBodyFileContentsGroup_TaskBody(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(TaskBody)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getBswSchedulableEntityFileContentsGroup_BswSchedulableEntity(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(BswSchedulableEntity)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getComCallbackFileContentsGroup_ComCallback(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(ComCallback)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTrustedFunctionFileContentsGroup_TrustedFunction(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(TrustedFunction)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getExecutableEntityFileContentsGroup_ExecutableEntity(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(ExecutableEntity)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSchmApiFileContentsGroup_SchmApi(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(SchmApi)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getComSignalApiWrapperFileContentsGroup_ComSignalApiWrapper(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(ComSignalApiWrapper)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getComProxyFunctionFileContentsGroup_ComProxyFunction(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(ComProxyFunction)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSchmLifecycleApiFileContentsGroup_SchmLifecycleApi(), 
		   source, 
		   new String[] {
			 "derivation", "self.function.oclAsType(SchmLifecycleApi)->asOrderedSet()" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRedefinitionType__GetLeafType(), 
		   source, 
		   new String[] {
			 "body", "if sourceType.oclIsKindOf(RedefinitionType)\n\t\t\tthen sourceType.oclAsType(RedefinitionType).getLeafType()\n\t\t\telse sourceType\n\t\t\tendif" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //ModulePackageImpl
