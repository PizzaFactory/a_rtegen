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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage
 * @generated
 */
public class ModuleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModulePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModulePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleSwitch<Adapter> modelSwitch =
		new ModuleSwitch<Adapter>() {
			@Override
			public Adapter caseModuleObject(ModuleObject object) {
				return createModuleObjectAdapter();
			}
			@Override
			public Adapter caseModuleReferrable(ModuleReferrable object) {
				return createModuleReferrableAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseWriteApi(WriteApi object) {
				return createWriteApiAdapter();
			}
			@Override
			public Adapter caseSendOperation(SendOperation object) {
				return createSendOperationAdapter();
			}
			@Override
			public Adapter caseRteBufferNonqueuedSendOperation(RteBufferNonqueuedSendOperation object) {
				return createRteBufferNonqueuedSendOperationAdapter();
			}
			@Override
			public Adapter caseRteBufferNonqueuedReadOperation(RteBufferNonqueuedReadOperation object) {
				return createRteBufferNonqueuedReadOperationAdapter();
			}
			@Override
			public Adapter caseReadOperation(ReadOperation object) {
				return createReadOperationAdapter();
			}
			@Override
			public Adapter caseReadApi(ReadApi object) {
				return createReadApiAdapter();
			}
			@Override
			public Adapter caseIrvReadOperation(IrvReadOperation object) {
				return createIrvReadOperationAdapter();
			}
			@Override
			public Adapter caseIrvReadApi(IrvReadApi object) {
				return createIrvReadApiAdapter();
			}
			@Override
			public Adapter caseIrvWriteOperation(IrvWriteOperation object) {
				return createIrvWriteOperationAdapter();
			}
			@Override
			public Adapter caseIrvWriteApi(IrvWriteApi object) {
				return createIrvWriteApiAdapter();
			}
			@Override
			public Adapter caseRteBufferVariableSet(RteBufferVariableSet object) {
				return createRteBufferVariableSetAdapter();
			}
			@Override
			public Adapter caseGlobalVariableSet(GlobalVariableSet object) {
				return createGlobalVariableSetAdapter();
			}
			@Override
			public Adapter caseRteSource(RteSource object) {
				return createRteSourceAdapter();
			}
			@Override
			public Adapter caseRteApi(RteApi object) {
				return createRteApiAdapter();
			}
			@Override
			public Adapter caseRteModule(RteModule object) {
				return createRteModuleAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseLocalVariable(LocalVariable object) {
				return createLocalVariableAdapter();
			}
			@Override
			public Adapter caseRteApplicationHeader(RteApplicationHeader object) {
				return createRteApplicationHeaderAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseLogicalCompartment(LogicalCompartment object) {
				return createLogicalCompartmentAdapter();
			}
			@Override
			public Adapter caseCore(Core object) {
				return createCoreAdapter();
			}
			@Override
			public Adapter casePartition(Partition object) {
				return createPartitionAdapter();
			}
			@Override
			public Adapter caseSwc(Swc object) {
				return createSwcAdapter();
			}
			@Override
			public Adapter caseRteHeader(RteHeader object) {
				return createRteHeaderAdapter();
			}
			@Override
			public Adapter caseRteBswApiHeader(RteBswApiHeader object) {
				return createRteBswApiHeaderAdapter();
			}
			@Override
			public Adapter caseRteLifecycleHeader(RteLifecycleHeader object) {
				return createRteLifecycleHeaderAdapter();
			}
			@Override
			public Adapter caseRteApplicationTypeHeader(RteApplicationTypeHeader object) {
				return createRteApplicationTypeHeaderAdapter();
			}
			@Override
			public Adapter caseRteVfbTraceHeader(RteVfbTraceHeader object) {
				return createRteVfbTraceHeaderAdapter();
			}
			@Override
			public Adapter caseRteConfigurationHeader(RteConfigurationHeader object) {
				return createRteConfigurationHeaderAdapter();
			}
			@Override
			public Adapter caseRteCallbackHeader(RteCallbackHeader object) {
				return createRteCallbackHeaderAdapter();
			}
			@Override
			public Adapter caseRteTypeHeader(RteTypeHeader object) {
				return createRteTypeHeaderAdapter();
			}
			@Override
			public Adapter caseInvalidateApi(InvalidateApi object) {
				return createInvalidateApiAdapter();
			}
			@Override
			public Adapter caseIocNonqueuedSendOperation(IocNonqueuedSendOperation object) {
				return createIocNonqueuedSendOperationAdapter();
			}
			@Override
			public Adapter caseDirectComSendOperation(DirectComSendOperation object) {
				return createDirectComSendOperationAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionRteOperation(TrustedFunctionRteOperation object) {
				return createTrustedFunctionRteOperationAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionRteSendOperation(TrustedFunctionRteSendOperation object) {
				return createTrustedFunctionRteSendOperationAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionRteBufferWriteSendOperation(TrustedFunctionRteBufferWriteSendOperation object) {
				return createTrustedFunctionRteBufferWriteSendOperationAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionComSendOperation(TrustedFunctionComSendOperation object) {
				return createTrustedFunctionComSendOperationAdapter();
			}
			@Override
			public Adapter caseImmediateProxyComSendOperation(ImmediateProxyComSendOperation object) {
				return createImmediateProxyComSendOperationAdapter();
			}
			@Override
			public Adapter casePeriodicProxyComSendOperation(PeriodicProxyComSendOperation object) {
				return createPeriodicProxyComSendOperationAdapter();
			}
			@Override
			public Adapter caseIocNonqueuedReadOperation(IocNonqueuedReadOperation object) {
				return createIocNonqueuedReadOperationAdapter();
			}
			@Override
			public Adapter caseComReadOperation(ComReadOperation object) {
				return createComReadOperationAdapter();
			}
			@Override
			public Adapter caseIocNonqueuedCommunication(IocNonqueuedCommunication object) {
				return createIocNonqueuedCommunicationAdapter();
			}
			@Override
			public Adapter caseIocWriteApi(IocWriteApi object) {
				return createIocWriteApiAdapter();
			}
			@Override
			public Adapter caseIocReadApi(IocReadApi object) {
				return createIocReadApiAdapter();
			}
			@Override
			public Adapter caseComSendSignalApi(ComSendSignalApi object) {
				return createComSendSignalApiAdapter();
			}
			@Override
			public Adapter caseComReceiveSignalApi(ComReceiveSignalApi object) {
				return createComReceiveSignalApiAdapter();
			}
			@Override
			public Adapter caseComReceiveCallback(ComReceiveCallback object) {
				return createComReceiveCallbackAdapter();
			}
			@Override
			public Adapter caseComSendOperation(ComSendOperation object) {
				return createComSendOperationAdapter();
			}
			@Override
			public Adapter caseComCallback(ComCallback object) {
				return createComCallbackAdapter();
			}
			@Override
			public Adapter caseComReceiveTimeoutCallback(ComReceiveTimeoutCallback object) {
				return createComReceiveTimeoutCallbackAdapter();
			}
			@Override
			public Adapter caseComInvalidateCallback(ComInvalidateCallback object) {
				return createComInvalidateCallbackAdapter();
			}
			@Override
			public Adapter caseComSendSignalProxyEntity(ComSendSignalProxyEntity object) {
				return createComSendSignalProxyEntityAdapter();
			}
			@Override
			public Adapter caseComSendSignalImmediateEntity(ComSendSignalImmediateEntity object) {
				return createComSendSignalImmediateEntityAdapter();
			}
			@Override
			public Adapter caseComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity object) {
				return createComSendSignalPeriodicEntityAdapter();
			}
			@Override
			public Adapter caseFilterOperation(FilterOperation object) {
				return createFilterOperationAdapter();
			}
			@Override
			public Adapter caseMaskedNewDiffersMaskedOldFilterOperation(MaskedNewDiffersMaskedOldFilterOperation object) {
				return createMaskedNewDiffersMaskedOldFilterOperationAdapter();
			}
			@Override
			public Adapter caseMaskedNewDiffersXFilterOperation(MaskedNewDiffersXFilterOperation object) {
				return createMaskedNewDiffersXFilterOperationAdapter();
			}
			@Override
			public Adapter caseNewIsWithinFilterOperation(NewIsWithinFilterOperation object) {
				return createNewIsWithinFilterOperationAdapter();
			}
			@Override
			public Adapter caseNewIsOutsideFilterOperation(NewIsOutsideFilterOperation object) {
				return createNewIsOutsideFilterOperationAdapter();
			}
			@Override
			public Adapter caseMaskedNewEqualsXFilterOperation(MaskedNewEqualsXFilterOperation object) {
				return createMaskedNewEqualsXFilterOperationAdapter();
			}
			@Override
			public Adapter caseOneEveryNFilterOperation(OneEveryNFilterOperation object) {
				return createOneEveryNFilterOperationAdapter();
			}
			@Override
			public Adapter caseRteCoreStartApiImpl(RteCoreStartApiImpl object) {
				return createRteCoreStartApiImplAdapter();
			}
			@Override
			public Adapter caseRteStopApi(RteStopApi object) {
				return createRteStopApiAdapter();
			}
			@Override
			public Adapter caseRestartPartitionApi(RestartPartitionApi object) {
				return createRestartPartitionApiAdapter();
			}
			@Override
			public Adapter casePartitionRestartingApi(PartitionRestartingApi object) {
				return createPartitionRestartingApiAdapter();
			}
			@Override
			public Adapter casePartitionTerminatedApi(PartitionTerminatedApi object) {
				return createPartitionTerminatedApiAdapter();
			}
			@Override
			public Adapter caseRteLifecycleApi(RteLifecycleApi object) {
				return createRteLifecycleApiAdapter();
			}
			@Override
			public Adapter caseSendApi(SendApi object) {
				return createSendApiAdapter();
			}
			@Override
			public Adapter caseReceiveApi(ReceiveApi object) {
				return createReceiveApiAdapter();
			}
			@Override
			public Adapter caseRteBufferQueuedSendOperation(RteBufferQueuedSendOperation object) {
				return createRteBufferQueuedSendOperationAdapter();
			}
			@Override
			public Adapter caseRteBufferQueuedVariable(RteBufferQueuedVariable object) {
				return createRteBufferQueuedVariableAdapter();
			}
			@Override
			public Adapter caseRteBufferQueuedReadOperation(RteBufferQueuedReadOperation object) {
				return createRteBufferQueuedReadOperationAdapter();
			}
			@Override
			public Adapter caseIocQueuedCommunication(IocQueuedCommunication object) {
				return createIocQueuedCommunicationAdapter();
			}
			@Override
			public Adapter caseIocReceiveApi(IocReceiveApi object) {
				return createIocReceiveApiAdapter();
			}
			@Override
			public Adapter caseIocSendApi(IocSendApi object) {
				return createIocSendApiAdapter();
			}
			@Override
			public Adapter caseIocSendOperation(IocSendOperation object) {
				return createIocSendOperationAdapter();
			}
			@Override
			public Adapter caseIocQueuedSendOperation(IocQueuedSendOperation object) {
				return createIocQueuedSendOperationAdapter();
			}
			@Override
			public Adapter caseIocQueuedReadOperation(IocQueuedReadOperation object) {
				return createIocQueuedReadOperationAdapter();
			}
			@Override
			public Adapter caseCallApi(CallApi object) {
				return createCallApiAdapter();
			}
			@Override
			public Adapter caseCallTrustedApi(CallTrustedApi object) {
				return createCallTrustedApiAdapter();
			}
			@Override
			public Adapter caseExecutableStartOperation(ExecutableStartOperation object) {
				return createExecutableStartOperationAdapter();
			}
			@Override
			public Adapter caseDisabledInMode(DisabledInMode object) {
				return createDisabledInModeAdapter();
			}
			@Override
			public Adapter caseExecutableEntity(ExecutableEntity object) {
				return createExecutableEntityAdapter();
			}
			@Override
			public Adapter caseExcludeOperation(ExcludeOperation object) {
				return createExcludeOperationAdapter();
			}
			@Override
			public Adapter caseAllInterruptBlockExcludeOperation(AllInterruptBlockExcludeOperation object) {
				return createAllInterruptBlockExcludeOperationAdapter();
			}
			@Override
			public Adapter caseOsInterruptBlockExcludeOperation(OsInterruptBlockExcludeOperation object) {
				return createOsInterruptBlockExcludeOperationAdapter();
			}
			@Override
			public Adapter caseOsSpinlockExcludeOperation(OsSpinlockExcludeOperation object) {
				return createOsSpinlockExcludeOperationAdapter();
			}
			@Override
			public Adapter caseOsResourceExcludeOperation(OsResourceExcludeOperation object) {
				return createOsResourceExcludeOperationAdapter();
			}
			@Override
			public Adapter caseNoneExcludeOperation(NoneExcludeOperation object) {
				return createNoneExcludeOperationAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseConstantMember(ConstantMember object) {
				return createConstantMemberAdapter();
			}
			@Override
			public Adapter caseBswSchedulableEntity(BswSchedulableEntity object) {
				return createBswSchedulableEntityAdapter();
			}
			@Override
			public Adapter caseRteEnterApi(RteEnterApi object) {
				return createRteEnterApiAdapter();
			}
			@Override
			public Adapter caseRteExitApi(RteExitApi object) {
				return createRteExitApiAdapter();
			}
			@Override
			public Adapter caseOsTaskActivationExecutableTaskBody(OsTaskActivationExecutableTaskBody object) {
				return createOsTaskActivationExecutableTaskBodyAdapter();
			}
			@Override
			public Adapter caseOsEventSetExecutableTaskBody(OsEventSetExecutableTaskBody object) {
				return createOsEventSetExecutableTaskBodyAdapter();
			}
			@Override
			public Adapter caseOsTaskActivationOperation(OsTaskActivationOperation object) {
				return createOsTaskActivationOperationAdapter();
			}
			@Override
			public Adapter caseOsEventSetActivationOperation(OsEventSetActivationOperation object) {
				return createOsEventSetActivationOperationAdapter();
			}
			@Override
			public Adapter caseContextActivationOperation(ContextActivationOperation object) {
				return createContextActivationOperationAdapter();
			}
			@Override
			public Adapter caseTimingTriggeringExecutableStartOperation(TimingTriggeringExecutableStartOperation object) {
				return createTimingTriggeringExecutableStartOperationAdapter();
			}
			@Override
			public Adapter caseModeSwitchTriggeringExecutableStartOperation(ModeSwitchTriggeringExecutableStartOperation object) {
				return createModeSwitchTriggeringExecutableStartOperationAdapter();
			}
			@Override
			public Adapter caseCycleCountupOperation(CycleCountupOperation object) {
				return createCycleCountupOperationAdapter();
			}
			@Override
			public Adapter caseStartOffsetCountupOperation(StartOffsetCountupOperation object) {
				return createStartOffsetCountupOperationAdapter();
			}
			@Override
			public Adapter caseTaskBody(TaskBody object) {
				return createTaskBodyAdapter();
			}
			@Override
			public Adapter caseIocEmptyQueueApi(IocEmptyQueueApi object) {
				return createIocEmptyQueueApiAdapter();
			}
			@Override
			public Adapter caseComApi(ComApi object) {
				return createComApiAdapter();
			}
			@Override
			public Adapter caseIocApi(IocApi object) {
				return createIocApiAdapter();
			}
			@Override
			public Adapter caseRte(Rte object) {
				return createRteAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseTrustedFunction(TrustedFunction object) {
				return createTrustedFunctionAdapter();
			}
			@Override
			public Adapter caseComSendSignalTrustedFunction(ComSendSignalTrustedFunction object) {
				return createComSendSignalTrustedFunctionAdapter();
			}
			@Override
			public Adapter caseOsSetEventApi(OsSetEventApi object) {
				return createOsSetEventApiAdapter();
			}
			@Override
			public Adapter caseOsApi(OsApi object) {
				return createOsApiAdapter();
			}
			@Override
			public Adapter caseComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody object) {
				return createComSendSignalImmediateTaskBodyAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseComSendProxyOperation(ComSendProxyOperation object) {
				return createComSendProxyOperationAdapter();
			}
			@Override
			public Adapter caseComSendProxyComplexOperation(ComSendProxyComplexOperation object) {
				return createComSendProxyComplexOperationAdapter();
			}
			@Override
			public Adapter caseIocReceiveGroupApi(IocReceiveGroupApi object) {
				return createIocReceiveGroupApiAdapter();
			}
			@Override
			public Adapter caseModuleRoot(ModuleRoot object) {
				return createModuleRootAdapter();
			}
			@Override
			public Adapter caseInterPartitionTimeoutOperation(InterPartitionTimeoutOperation object) {
				return createInterPartitionTimeoutOperationAdapter();
			}
			@Override
			public Adapter caseInitializeOperation(InitializeOperation object) {
				return createInitializeOperationAdapter();
			}
			@Override
			public Adapter caseVariableInitializeOperation(VariableInitializeOperation object) {
				return createVariableInitializeOperationAdapter();
			}
			@Override
			public Adapter caseIocInitializeOperation(IocInitializeOperation object) {
				return createIocInitializeOperationAdapter();
			}
			@Override
			public Adapter caseOsSuspendAllInterruptsApi(OsSuspendAllInterruptsApi object) {
				return createOsSuspendAllInterruptsApiAdapter();
			}
			@Override
			public Adapter caseOsGetSpinlockApi(OsGetSpinlockApi object) {
				return createOsGetSpinlockApiAdapter();
			}
			@Override
			public Adapter caseMulticoreRteStartApi(MulticoreRteStartApi object) {
				return createMulticoreRteStartApiAdapter();
			}
			@Override
			public Adapter caseRteBufferWriteTrustedFunction(RteBufferWriteTrustedFunction object) {
				return createRteBufferWriteTrustedFunctionAdapter();
			}
			@Override
			public Adapter caseRteCsTrustedFunction(RteCsTrustedFunction object) {
				return createRteCsTrustedFunctionAdapter();
			}
			@Override
			public Adapter caseRteCsTrustedRunnables(RteCsTrustedRunnables object) {
				return createRteCsTrustedRunnablesAdapter();
			}
			@Override
			public Adapter caseIocCommunication(IocCommunication object) {
				return createIocCommunicationAdapter();
			}
			@Override
			public Adapter caseProxyComSendOperation(ProxyComSendOperation object) {
				return createProxyComSendOperationAdapter();
			}
			@Override
			public Adapter caseIocSendGroupApi(IocSendGroupApi object) {
				return createIocSendGroupApiAdapter();
			}
			@Override
			public Adapter caseIocQueuedGroupCommunication(IocQueuedGroupCommunication object) {
				return createIocQueuedGroupCommunicationAdapter();
			}
			@Override
			public Adapter caseDirectExecutableStartOperation(DirectExecutableStartOperation object) {
				return createDirectExecutableStartOperationAdapter();
			}
			@Override
			public Adapter caseSinglecoreRteStartApi(SinglecoreRteStartApi object) {
				return createSinglecoreRteStartApiAdapter();
			}
			@Override
			public Adapter caseRteStartApi(RteStartApi object) {
				return createRteStartApiAdapter();
			}
			@Override
			public Adapter caseHeaderFile(HeaderFile object) {
				return createHeaderFileAdapter();
			}
			@Override
			public Adapter caseSourceFile(SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter caseRteInternalHeader(RteInternalHeader object) {
				return createRteInternalHeaderAdapter();
			}
			@Override
			public Adapter caseModeRequestVariableSet(ModeRequestVariableSet object) {
				return createModeRequestVariableSetAdapter();
			}
			@Override
			public Adapter caseModeMachineInstance(ModeMachineInstance object) {
				return createModeMachineInstanceAdapter();
			}
			@Override
			public Adapter caseFunctionMacroGroup(FunctionMacroGroup object) {
				return createFunctionMacroGroupAdapter();
			}
			@Override
			public Adapter caseFunctionMacro(FunctionMacro object) {
				return createFunctionMacroAdapter();
			}
			@Override
			public Adapter caseProxyFunctionTableGroup(ProxyFunctionTableGroup object) {
				return createProxyFunctionTableGroupAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseRedefinitionPrimitiveType(RedefinitionPrimitiveType object) {
				return createRedefinitionPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseRedefinitionArrayType(RedefinitionArrayType object) {
				return createRedefinitionArrayTypeAdapter();
			}
			@Override
			public Adapter caseUnionType(UnionType object) {
				return createUnionTypeAdapter();
			}
			@Override
			public Adapter caseRedefinitionUnionType(RedefinitionUnionType object) {
				return createRedefinitionUnionTypeAdapter();
			}
			@Override
			public Adapter caseStructType(StructType object) {
				return createStructTypeAdapter();
			}
			@Override
			public Adapter caseRedefinitionStructType(RedefinitionStructType object) {
				return createRedefinitionStructTypeAdapter();
			}
			@Override
			public Adapter caseBlackboxType(BlackboxType object) {
				return createBlackboxTypeAdapter();
			}
			@Override
			public Adapter caseUnionMember(UnionMember object) {
				return createUnionMemberAdapter();
			}
			@Override
			public Adapter caseStructMember(StructMember object) {
				return createStructMemberAdapter();
			}
			@Override
			public Adapter caseModeType(ModeType object) {
				return createModeTypeAdapter();
			}
			@Override
			public Adapter caseVariableMember(VariableMember object) {
				return createVariableMemberAdapter();
			}
			@Override
			public Adapter caseRteUtilityHeader(RteUtilityHeader object) {
				return createRteUtilityHeaderAdapter();
			}
			@Override
			public Adapter caseBlackboxHeader(BlackboxHeader object) {
				return createBlackboxHeaderAdapter();
			}
			@Override
			public Adapter caseRteBufferQueueType(RteBufferQueueType object) {
				return createRteBufferQueueTypeAdapter();
			}
			@Override
			public Adapter caseModeQueueType(ModeQueueType object) {
				return createModeQueueTypeAdapter();
			}
			@Override
			public Adapter caseRteSendTrustedFunctionParamType(RteSendTrustedFunctionParamType object) {
				return createRteSendTrustedFunctionParamTypeAdapter();
			}
			@Override
			public Adapter caseComSendTrustedFunctionParamType(ComSendTrustedFunctionParamType object) {
				return createComSendTrustedFunctionParamTypeAdapter();
			}
			@Override
			public Adapter caseComCsTrustedFunctionParamType(ComCsTrustedFunctionParamType object) {
				return createComCsTrustedFunctionParamTypeAdapter();
			}
			@Override
			public Adapter caseNeverReadOperation(NeverReadOperation object) {
				return createNeverReadOperationAdapter();
			}
			@Override
			public Adapter caseRteBufferInvalidateTrustedFunction(RteBufferInvalidateTrustedFunction object) {
				return createRteBufferInvalidateTrustedFunctionAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionRteBufferInvalidateSendOperation(TrustedFunctionRteBufferInvalidateSendOperation object) {
				return createTrustedFunctionRteBufferInvalidateSendOperationAdapter();
			}
			@Override
			public Adapter caseMemoryMapping(MemoryMapping object) {
				return createMemoryMappingAdapter();
			}
			@Override
			public Adapter caseSwcMemoryMapping(SwcMemoryMapping object) {
				return createSwcMemoryMappingAdapter();
			}
			@Override
			public Adapter caseBswMemoryMapping(BswMemoryMapping object) {
				return createBswMemoryMappingAdapter();
			}
			@Override
			public Adapter caseGlobalVariableGroup(GlobalVariableGroup object) {
				return createGlobalVariableGroupAdapter();
			}
			@Override
			public Adapter caseFunctionGroup(FunctionGroup object) {
				return createFunctionGroupAdapter();
			}
			@Override
			public Adapter caseRteApiGroup(RteApiGroup object) {
				return createRteApiGroupAdapter();
			}
			@Override
			public Adapter caseRteLifecycleApiGroup(RteLifecycleApiGroup object) {
				return createRteLifecycleApiGroupAdapter();
			}
			@Override
			public Adapter caseTaskBodyGroup(TaskBodyGroup object) {
				return createTaskBodyGroupAdapter();
			}
			@Override
			public Adapter caseBswSchedulableEntityGroup(BswSchedulableEntityGroup object) {
				return createBswSchedulableEntityGroupAdapter();
			}
			@Override
			public Adapter caseComCallbackGroup(ComCallbackGroup object) {
				return createComCallbackGroupAdapter();
			}
			@Override
			public Adapter caseTrustedFunctionGroup(TrustedFunctionGroup object) {
				return createTrustedFunctionGroupAdapter();
			}
			@Override
			public Adapter caseExecutableEntityGroup(ExecutableEntityGroup object) {
				return createExecutableEntityGroupAdapter();
			}
			@Override
			public Adapter caseBswMemoryMappingHeader(BswMemoryMappingHeader object) {
				return createBswMemoryMappingHeaderAdapter();
			}
			@Override
			public Adapter caseSwcMemoryMappingHeader(SwcMemoryMappingHeader object) {
				return createSwcMemoryMappingHeaderAdapter();
			}
			@Override
			public Adapter caseGenerationInfo(GenerationInfo object) {
				return createGenerationInfoAdapter();
			}
			@Override
			public Adapter caseMacro(Macro object) {
				return createMacroAdapter();
			}
			@Override
			public Adapter caseSchmApi(SchmApi object) {
				return createSchmApiAdapter();
			}
			@Override
			public Adapter caseSignalApi(SignalApi object) {
				return createSignalApiAdapter();
			}
			@Override
			public Adapter caseProxyApi(ProxyApi object) {
				return createProxyApiAdapter();
			}
			@Override
			public Adapter caseSendSignalApi(SendSignalApi object) {
				return createSendSignalApiAdapter();
			}
			@Override
			public Adapter caseReceiveSignalApi(ReceiveSignalApi object) {
				return createReceiveSignalApiAdapter();
			}
			@Override
			public Adapter caseSchmLifecycleApi(SchmLifecycleApi object) {
				return createSchmLifecycleApiAdapter();
			}
			@Override
			public Adapter caseSchmEnterApi(SchmEnterApi object) {
				return createSchmEnterApiAdapter();
			}
			@Override
			public Adapter caseSchmExitApi(SchmExitApi object) {
				return createSchmExitApiAdapter();
			}
			@Override
			public Adapter caseSchmModeApi(SchmModeApi object) {
				return createSchmModeApiAdapter();
			}
			@Override
			public Adapter caseSchmSwitchApi(SchmSwitchApi object) {
				return createSchmSwitchApiAdapter();
			}
			@Override
			public Adapter caseOsTaskEventsTriggeredByMode(OsTaskEventsTriggeredByMode object) {
				return createOsTaskEventsTriggeredByModeAdapter();
			}
			@Override
			public Adapter caseOsTaskEvent(OsTaskEvent object) {
				return createOsTaskEventAdapter();
			}
			@Override
			public Adapter caseModeQueuedVariable(ModeQueuedVariable object) {
				return createModeQueuedVariableAdapter();
			}
			@Override
			public Adapter caseModuleInterlinkHeader(ModuleInterlinkHeader object) {
				return createModuleInterlinkHeaderAdapter();
			}
			@Override
			public Adapter caseSchmApiGroup(SchmApiGroup object) {
				return createSchmApiGroupAdapter();
			}
			@Override
			public Adapter caseSignalApiGroup(SignalApiGroup object) {
				return createSignalApiGroupAdapter();
			}
			@Override
			public Adapter caseProxyApiGroup(ProxyApiGroup object) {
				return createProxyApiGroupAdapter();
			}
			@Override
			public Adapter caseModuleInterlinkTypeHeader(ModuleInterlinkTypeHeader object) {
				return createModuleInterlinkTypeHeaderAdapter();
			}
			@Override
			public Adapter caseSchmLifecycleApiGroup(SchmLifecycleApiGroup object) {
				return createSchmLifecycleApiGroupAdapter();
			}
			@Override
			public Adapter casePartedBswm(PartedBswm object) {
				return createPartedBswmAdapter();
			}
			@Override
			public Adapter caseBswm(Bswm object) {
				return createBswmAdapter();
			}
			@Override
			public Adapter caseSchmDeinitApi(SchmDeinitApi object) {
				return createSchmDeinitApiAdapter();
			}
			@Override
			public Adapter caseSchmInitApi(SchmInitApi object) {
				return createSchmInitApiAdapter();
			}
			@Override
			public Adapter caseSinglecoreSchmInitApi(SinglecoreSchmInitApi object) {
				return createSinglecoreSchmInitApiAdapter();
			}
			@Override
			public Adapter caseMulticoreSchmInitApi(MulticoreSchmInitApi object) {
				return createMulticoreSchmInitApiAdapter();
			}
			@Override
			public Adapter caseSchmCoreInitApiImpl(SchmCoreInitApiImpl object) {
				return createSchmCoreInitApiImplAdapter();
			}
			@Override
			public Adapter casePointerType(PointerType object) {
				return createPointerTypeAdapter();
			}
			@Override
			public Adapter caseRedefinitionPointerType(RedefinitionPointerType object) {
				return createRedefinitionPointerTypeAdapter();
			}
			@Override
			public Adapter caseRedefinitionType(RedefinitionType object) {
				return createRedefinitionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject
	 * @generated
	 */
	public Adapter createModuleObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable
	 * @generated
	 */
	public Adapter createModuleReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi <em>Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi
	 * @generated
	 */
	public Adapter createWriteApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation <em>Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation
	 * @generated
	 */
	public Adapter createSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation <em>Rte Buffer Nonqueued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation
	 * @generated
	 */
	public Adapter createRteBufferNonqueuedSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation <em>Rte Buffer Nonqueued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation
	 * @generated
	 */
	public Adapter createRteBufferNonqueuedReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation <em>Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation
	 * @generated
	 */
	public Adapter createReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi <em>Read Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi
	 * @generated
	 */
	public Adapter createReadApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadOperation <em>Irv Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadOperation
	 * @generated
	 */
	public Adapter createIrvReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi <em>Irv Read Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi
	 * @generated
	 */
	public Adapter createIrvReadApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation <em>Irv Write Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteOperation
	 * @generated
	 */
	public Adapter createIrvWriteOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteApi <em>Irv Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvWriteApi
	 * @generated
	 */
	public Adapter createIrvWriteApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet <em>Rte Buffer Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet
	 * @generated
	 */
	public Adapter createRteBufferVariableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet <em>Global Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet
	 * @generated
	 */
	public Adapter createGlobalVariableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource <em>Rte Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource
	 * @generated
	 */
	public Adapter createRteSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi <em>Rte Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi
	 * @generated
	 */
	public Adapter createRteApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule <em>Rte Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule
	 * @generated
	 */
	public Adapter createRteModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader <em>Rte Application Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader
	 * @generated
	 */
	public Adapter createRteApplicationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment <em>Logical Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment
	 * @generated
	 */
	public Adapter createLogicalCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc <em>Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc
	 * @generated
	 */
	public Adapter createSwcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader <em>Rte Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader
	 * @generated
	 */
	public Adapter createRteHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBswApiHeader <em>Rte Bsw Api Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBswApiHeader
	 * @generated
	 */
	public Adapter createRteBswApiHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader <em>Rte Lifecycle Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader
	 * @generated
	 */
	public Adapter createRteLifecycleHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader <em>Rte Application Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader
	 * @generated
	 */
	public Adapter createRteApplicationTypeHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader <em>Rte Vfb Trace Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader
	 * @generated
	 */
	public Adapter createRteVfbTraceHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader <em>Rte Configuration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader
	 * @generated
	 */
	public Adapter createRteConfigurationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader <em>Rte Callback Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader
	 * @generated
	 */
	public Adapter createRteCallbackHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader <em>Rte Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader
	 * @generated
	 */
	public Adapter createRteTypeHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi <em>Invalidate Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi
	 * @generated
	 */
	public Adapter createInvalidateApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation <em>Ioc Nonqueued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation
	 * @generated
	 */
	public Adapter createIocNonqueuedSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation <em>Direct Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation
	 * @generated
	 */
	public Adapter createDirectComSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation <em>Trusted Function Rte Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation
	 * @generated
	 */
	public Adapter createTrustedFunctionRteOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteSendOperation <em>Trusted Function Rte Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteSendOperation
	 * @generated
	 */
	public Adapter createTrustedFunctionRteSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation <em>Trusted Function Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation
	 * @generated
	 */
	public Adapter createTrustedFunctionComSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation <em>Immediate Proxy Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation
	 * @generated
	 */
	public Adapter createImmediateProxyComSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation <em>Periodic Proxy Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation
	 * @generated
	 */
	public Adapter createPeriodicProxyComSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation <em>Ioc Nonqueued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation
	 * @generated
	 */
	public Adapter createIocNonqueuedReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation <em>Com Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation
	 * @generated
	 */
	public Adapter createComReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication <em>Ioc Nonqueued Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication
	 * @generated
	 */
	public Adapter createIocNonqueuedCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi <em>Ioc Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi
	 * @generated
	 */
	public Adapter createIocWriteApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi <em>Ioc Read Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi
	 * @generated
	 */
	public Adapter createIocReadApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi <em>Com Send Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi
	 * @generated
	 */
	public Adapter createComSendSignalApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi <em>Com Receive Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi
	 * @generated
	 */
	public Adapter createComReceiveSignalApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback <em>Com Receive Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback
	 * @generated
	 */
	public Adapter createComReceiveCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation <em>Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation
	 * @generated
	 */
	public Adapter createComSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback <em>Com Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback
	 * @generated
	 */
	public Adapter createComCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback <em>Com Receive Timeout Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback
	 * @generated
	 */
	public Adapter createComReceiveTimeoutCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback <em>Com Invalidate Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback
	 * @generated
	 */
	public Adapter createComInvalidateCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalProxyEntity <em>Com Send Signal Proxy Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalProxyEntity
	 * @generated
	 */
	public Adapter createComSendSignalProxyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity
	 * @generated
	 */
	public Adapter createComSendSignalImmediateEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity
	 * @generated
	 */
	public Adapter createComSendSignalPeriodicEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation
	 * @generated
	 */
	public Adapter createFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation <em>Masked New Differs Masked Old Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation
	 * @generated
	 */
	public Adapter createMaskedNewDiffersMaskedOldFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation <em>Masked New Differs XFilter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation
	 * @generated
	 */
	public Adapter createMaskedNewDiffersXFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation <em>New Is Within Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation
	 * @generated
	 */
	public Adapter createNewIsWithinFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation <em>New Is Outside Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation
	 * @generated
	 */
	public Adapter createNewIsOutsideFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation <em>Masked New Equals XFilter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation
	 * @generated
	 */
	public Adapter createMaskedNewEqualsXFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation <em>One Every NFilter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation
	 * @generated
	 */
	public Adapter createOneEveryNFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl
	 * @generated
	 */
	public Adapter createRteCoreStartApiImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi <em>Rte Stop Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi
	 * @generated
	 */
	public Adapter createRteStopApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile <em>Header File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile
	 * @generated
	 */
	public Adapter createHeaderFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader <em>Rte Internal Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader
	 * @generated
	 */
	public Adapter createRteInternalHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeRequestVariableSet <em>Mode Request Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeRequestVariableSet
	 * @generated
	 */
	public Adapter createModeRequestVariableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance <em>Mode Machine Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance
	 * @generated
	 */
	public Adapter createModeMachineInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacroGroup <em>Function Macro Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacroGroup
	 * @generated
	 */
	public Adapter createFunctionMacroGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro <em>Function Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro
	 * @generated
	 */
	public Adapter createFunctionMacroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyFunctionTableGroup <em>Proxy Function Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyFunctionTableGroup
	 * @generated
	 */
	public Adapter createProxyFunctionTableGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType
	 * @generated
	 */
	public Adapter createModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionPrimitiveType <em>Redefinition Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionPrimitiveType
	 * @generated
	 */
	public Adapter createRedefinitionPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionArrayType <em>Redefinition Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionArrayType
	 * @generated
	 */
	public Adapter createRedefinitionArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType
	 * @generated
	 */
	public Adapter createUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionUnionType <em>Redefinition Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionUnionType
	 * @generated
	 */
	public Adapter createRedefinitionUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType
	 * @generated
	 */
	public Adapter createStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionStructType <em>Redefinition Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionStructType
	 * @generated
	 */
	public Adapter createRedefinitionStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType <em>Blackbox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType
	 * @generated
	 */
	public Adapter createBlackboxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember <em>Union Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember
	 * @generated
	 */
	public Adapter createUnionMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember
	 * @generated
	 */
	public Adapter createStructMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember <em>Variable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember
	 * @generated
	 */
	public Adapter createVariableMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader <em>Rte Utility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader
	 * @generated
	 */
	public Adapter createRteUtilityHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader <em>Blackbox Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader
	 * @generated
	 */
	public Adapter createBlackboxHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType <em>Rte Buffer Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType
	 * @generated
	 */
	public Adapter createRteBufferQueueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType <em>Mode Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType
	 * @generated
	 */
	public Adapter createModeQueueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSendTrustedFunctionParamType <em>Rte Send Trusted Function Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSendTrustedFunctionParamType
	 * @generated
	 */
	public Adapter createRteSendTrustedFunctionParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType <em>Com Send Trusted Function Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType
	 * @generated
	 */
	public Adapter createComSendTrustedFunctionParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCsTrustedFunctionParamType <em>Com Cs Trusted Function Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCsTrustedFunctionParamType
	 * @generated
	 */
	public Adapter createComCsTrustedFunctionParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation <em>Never Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation
	 * @generated
	 */
	public Adapter createNeverReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction <em>Rte Buffer Invalidate Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction
	 * @generated
	 */
	public Adapter createRteBufferInvalidateTrustedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation <em>Trusted Function Rte Buffer Invalidate Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation
	 * @generated
	 */
	public Adapter createTrustedFunctionRteBufferInvalidateSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping
	 * @generated
	 */
	public Adapter createMemoryMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping <em>Swc Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping
	 * @generated
	 */
	public Adapter createSwcMemoryMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping <em>Bsw Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping
	 * @generated
	 */
	public Adapter createBswMemoryMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup <em>Global Variable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup
	 * @generated
	 */
	public Adapter createGlobalVariableGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup <em>Function Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup
	 * @generated
	 */
	public Adapter createFunctionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup <em>Rte Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup
	 * @generated
	 */
	public Adapter createRteApiGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup
	 * @generated
	 */
	public Adapter createRteLifecycleApiGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup <em>Task Body Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup
	 * @generated
	 */
	public Adapter createTaskBodyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup
	 * @generated
	 */
	public Adapter createBswSchedulableEntityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup <em>Com Callback Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup
	 * @generated
	 */
	public Adapter createComCallbackGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup <em>Trusted Function Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup
	 * @generated
	 */
	public Adapter createTrustedFunctionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup <em>Executable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup
	 * @generated
	 */
	public Adapter createExecutableEntityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader <em>Bsw Memory Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader
	 * @generated
	 */
	public Adapter createBswMemoryMappingHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader <em>Swc Memory Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader
	 * @generated
	 */
	public Adapter createSwcMemoryMappingHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo <em>Generation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo
	 * @generated
	 */
	public Adapter createGenerationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro
	 * @generated
	 */
	public Adapter createMacroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi <em>Schm Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi
	 * @generated
	 */
	public Adapter createSchmApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApi <em>Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApi
	 * @generated
	 */
	public Adapter createSignalApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApi <em>Proxy Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApi
	 * @generated
	 */
	public Adapter createProxyApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendSignalApi <em>Send Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendSignalApi
	 * @generated
	 */
	public Adapter createSendSignalApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveSignalApi <em>Receive Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveSignalApi
	 * @generated
	 */
	public Adapter createReceiveSignalApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi <em>Schm Lifecycle Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi
	 * @generated
	 */
	public Adapter createSchmLifecycleApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi <em>Schm Enter Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi
	 * @generated
	 */
	public Adapter createSchmEnterApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi <em>Schm Exit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi
	 * @generated
	 */
	public Adapter createSchmExitApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi <em>Schm Switch Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi
	 * @generated
	 */
	public Adapter createSchmSwitchApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode <em>Os Task Events Triggered By Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode
	 * @generated
	 */
	public Adapter createOsTaskEventsTriggeredByModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent <em>Os Task Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent
	 * @generated
	 */
	public Adapter createOsTaskEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable <em>Mode Queued Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable
	 * @generated
	 */
	public Adapter createModeQueuedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi <em>Schm Mode Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi
	 * @generated
	 */
	public Adapter createSchmModeApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader <em>Interlink Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader
	 * @generated
	 */
	public Adapter createModuleInterlinkHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup <em>Schm Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup
	 * @generated
	 */
	public Adapter createSchmApiGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApiGroup <em>Signal Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApiGroup
	 * @generated
	 */
	public Adapter createSignalApiGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApiGroup <em>Proxy Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApiGroup
	 * @generated
	 */
	public Adapter createProxyApiGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader <em>Interlink Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader
	 * @generated
	 */
	public Adapter createModuleInterlinkTypeHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup
	 * @generated
	 */
	public Adapter createSchmLifecycleApiGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm <em>Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm
	 * @generated
	 */
	public Adapter createPartedBswmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm <em>Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm
	 * @generated
	 */
	public Adapter createBswmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi <em>Schm Deinit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi
	 * @generated
	 */
	public Adapter createSchmDeinitApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi <em>Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi
	 * @generated
	 */
	public Adapter createSchmInitApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi <em>Singlecore Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi
	 * @generated
	 */
	public Adapter createSinglecoreSchmInitApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi <em>Multicore Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi
	 * @generated
	 */
	public Adapter createMulticoreSchmInitApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl
	 * @generated
	 */
	public Adapter createSchmCoreInitApiImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType
	 * @generated
	 */
	public Adapter createPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionPointerType <em>Redefinition Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionPointerType
	 * @generated
	 */
	public Adapter createRedefinitionPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType <em>Redefinition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType
	 * @generated
	 */
	public Adapter createRedefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi <em>Restart Partition Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi
	 * @generated
	 */
	public Adapter createRestartPartitionApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi <em>Partition Restarting Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi
	 * @generated
	 */
	public Adapter createPartitionRestartingApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi <em>Partition Terminated Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi
	 * @generated
	 */
	public Adapter createPartitionTerminatedApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi <em>Rte Lifecycle Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi
	 * @generated
	 */
	public Adapter createRteLifecycleApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi <em>Send Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi
	 * @generated
	 */
	public Adapter createSendApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi <em>Receive Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi
	 * @generated
	 */
	public Adapter createReceiveApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation <em>Rte Buffer Queued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation
	 * @generated
	 */
	public Adapter createRteBufferQueuedSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable <em>Rte Buffer Queued Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable
	 * @generated
	 */
	public Adapter createRteBufferQueuedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation <em>Rte Buffer Queued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation
	 * @generated
	 */
	public Adapter createRteBufferQueuedReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication <em>Ioc Queued Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication
	 * @generated
	 */
	public Adapter createIocQueuedCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi <em>Ioc Receive Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi
	 * @generated
	 */
	public Adapter createIocReceiveApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi <em>Ioc Send Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi
	 * @generated
	 */
	public Adapter createIocSendApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendOperation <em>Ioc Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendOperation
	 * @generated
	 */
	public Adapter createIocSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation <em>Ioc Queued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation
	 * @generated
	 */
	public Adapter createIocQueuedSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation <em>Ioc Queued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation
	 * @generated
	 */
	public Adapter createIocQueuedReadOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi <em>Call Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi
	 * @generated
	 */
	public Adapter createCallApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallTrustedApi <em>Call Trusted Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallTrustedApi
	 * @generated
	 */
	public Adapter createCallTrustedApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation <em>Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation
	 * @generated
	 */
	public Adapter createExecutableStartOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode <em>Disabled In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode
	 * @generated
	 */
	public Adapter createDisabledInModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity
	 * @generated
	 */
	public Adapter createExecutableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation
	 * @generated
	 */
	public Adapter createExcludeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation <em>All Interrupt Block Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation
	 * @generated
	 */
	public Adapter createAllInterruptBlockExcludeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation <em>Os Interrupt Block Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation
	 * @generated
	 */
	public Adapter createOsInterruptBlockExcludeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation <em>Os Spinlock Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation
	 * @generated
	 */
	public Adapter createOsSpinlockExcludeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation <em>Os Resource Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation
	 * @generated
	 */
	public Adapter createOsResourceExcludeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NoneExcludeOperation <em>None Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NoneExcludeOperation
	 * @generated
	 */
	public Adapter createNoneExcludeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember <em>Constant Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember
	 * @generated
	 */
	public Adapter createConstantMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity <em>Bsw Schedulable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity
	 * @generated
	 */
	public Adapter createBswSchedulableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi <em>Rte Enter Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi
	 * @generated
	 */
	public Adapter createRteEnterApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi <em>Rte Exit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi
	 * @generated
	 */
	public Adapter createRteExitApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody <em>Os Task Activation Executable Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody
	 * @generated
	 */
	public Adapter createOsTaskActivationExecutableTaskBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody <em>Os Event Set Executable Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody
	 * @generated
	 */
	public Adapter createOsEventSetExecutableTaskBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation <em>Os Task Activation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation
	 * @generated
	 */
	public Adapter createOsTaskActivationOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation <em>Os Event Set Activation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation
	 * @generated
	 */
	public Adapter createOsEventSetActivationOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation <em>Context Activation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation
	 * @generated
	 */
	public Adapter createContextActivationOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation <em>Timing Triggering Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation
	 * @generated
	 */
	public Adapter createTimingTriggeringExecutableStartOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation <em>Mode Switch Triggering Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation
	 * @generated
	 */
	public Adapter createModeSwitchTriggeringExecutableStartOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation <em>Cycle Countup Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation
	 * @generated
	 */
	public Adapter createCycleCountupOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation <em>Start Offset Countup Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation
	 * @generated
	 */
	public Adapter createStartOffsetCountupOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody <em>Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody
	 * @generated
	 */
	public Adapter createTaskBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi <em>Ioc Empty Queue Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi
	 * @generated
	 */
	public Adapter createIocEmptyQueueApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi <em>Com Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi
	 * @generated
	 */
	public Adapter createComApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi <em>Ioc Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi
	 * @generated
	 */
	public Adapter createIocApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte
	 * @generated
	 */
	public Adapter createRteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction <em>Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction
	 * @generated
	 */
	public Adapter createTrustedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction
	 * @generated
	 */
	public Adapter createComSendSignalTrustedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi <em>Os Set Event Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi
	 * @generated
	 */
	public Adapter createOsSetEventApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi <em>Os Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi
	 * @generated
	 */
	public Adapter createOsApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody
	 * @generated
	 */
	public Adapter createComSendSignalImmediateTaskBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation <em>Com Send Proxy Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation
	 * @generated
	 */
	public Adapter createComSendProxyOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyComplexOperation <em>Com Send Proxy Complex Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyComplexOperation
	 * @generated
	 */
	public Adapter createComSendProxyComplexOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi <em>Ioc Receive Group Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi
	 * @generated
	 */
	public Adapter createIocReceiveGroupApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot
	 * @generated
	 */
	public Adapter createModuleRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation <em>Inter Partition Timeout Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation
	 * @generated
	 */
	public Adapter createInterPartitionTimeoutOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation <em>Initialize Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation
	 * @generated
	 */
	public Adapter createInitializeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation <em>Variable Initialize Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation
	 * @generated
	 */
	public Adapter createVariableInitializeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation <em>Ioc Initialize Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation
	 * @generated
	 */
	public Adapter createIocInitializeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSuspendAllInterruptsApi <em>Os Suspend All Interrupts Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSuspendAllInterruptsApi
	 * @generated
	 */
	public Adapter createOsSuspendAllInterruptsApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsGetSpinlockApi <em>Os Get Spinlock Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsGetSpinlockApi
	 * @generated
	 */
	public Adapter createOsGetSpinlockApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi <em>Multicore Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi
	 * @generated
	 */
	public Adapter createMulticoreRteStartApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction <em>Rte Buffer Write Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction
	 * @generated
	 */
	public Adapter createRteBufferWriteTrustedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedFunction <em>Rte Cs Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedFunction
	 * @generated
	 */
	public Adapter createRteCsTrustedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedRunnables <em>Rte Cs Trusted Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedRunnables
	 * @generated
	 */
	public Adapter createRteCsTrustedRunnablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation <em>Trusted Function Rte Buffer Write Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation
	 * @generated
	 */
	public Adapter createTrustedFunctionRteBufferWriteSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication <em>Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication
	 * @generated
	 */
	public Adapter createIocCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation <em>Proxy Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation
	 * @generated
	 */
	public Adapter createProxyComSendOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi <em>Ioc Send Group Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi
	 * @generated
	 */
	public Adapter createIocSendGroupApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication <em>Ioc Queued Group Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication
	 * @generated
	 */
	public Adapter createIocQueuedGroupCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectExecutableStartOperation <em>Direct Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectExecutableStartOperation
	 * @generated
	 */
	public Adapter createDirectExecutableStartOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi <em>Singlecore Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi
	 * @generated
	 */
	public Adapter createSinglecoreRteStartApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi <em>Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi
	 * @generated
	 */
	public Adapter createRteStartApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModuleAdapterFactory
