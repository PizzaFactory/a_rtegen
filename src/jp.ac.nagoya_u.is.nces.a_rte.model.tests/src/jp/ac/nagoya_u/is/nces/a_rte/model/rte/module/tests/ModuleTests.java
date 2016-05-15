/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>module</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ModuleTests("module Tests"); //$NON-NLS-1$
		suite.addTestSuite(BswSchedulableEntityTest.class);
		suite.addTestSuite(RunnableEntityTest.class);
		suite.addTestSuite(WriteApiTest.class);
		suite.addTestSuite(RteBufferNonqueuedSendOperationTest.class);
		suite.addTestSuite(RteBufferNonqueuedReadOperationTest.class);
		suite.addTestSuite(ReadApiTest.class);
		suite.addTestSuite(IrvReadOperationTest.class);
		suite.addTestSuite(IrvReadApiTest.class);
		suite.addTestSuite(IrvWriteOperationTest.class);
		suite.addTestSuite(IrvWriteApiTest.class);
		suite.addTestSuite(RteBufferVariableSetTest.class);
		suite.addTestSuite(GlobalVariableSetTest.class);
		suite.addTestSuite(ComProxyFunctionTableVariableTest.class);
		suite.addTestSuite(RteSourceTest.class);
		suite.addTestSuite(GlobalVariableTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(LocalVariableTest.class);
		suite.addTestSuite(RteApplicationHeaderTest.class);
		suite.addTestSuite(RteTest.class);
		suite.addTestSuite(CoreTest.class);
		suite.addTestSuite(PartitionTest.class);
		suite.addTestSuite(SwcTest.class);
		suite.addTestSuite(RteHeaderTest.class);
		suite.addTestSuite(RteBswApiHeaderTest.class);
		suite.addTestSuite(RteLifecycleHeaderTest.class);
		suite.addTestSuite(RteApplicationTypeHeaderTest.class);
		suite.addTestSuite(RteVfbTraceHeaderTest.class);
		suite.addTestSuite(RteConfigurationHeaderTest.class);
		suite.addTestSuite(RteCallbackHeaderTest.class);
		suite.addTestSuite(RteTypeHeaderTest.class);
		suite.addTestSuite(InvalidateApiTest.class);
		suite.addTestSuite(IocNonqueuedSendOperationTest.class);
		suite.addTestSuite(DirectComSendOperationTest.class);
		suite.addTestSuite(TrustedFunctionRteOperationTest.class);
		suite.addTestSuite(TrustedFunctionRteBufferWriteSendOperationTest.class);
		suite.addTestSuite(TrustedFunctionRteBufferSendSendOperationTest.class);
		suite.addTestSuite(TrustedFunctionRteBufferInvalidateSendOperationTest.class);
		suite.addTestSuite(RteBufferInvalidateTrustedFunctionTest.class);
		suite.addTestSuite(TrustedFunctionComSendOperationTest.class);
		suite.addTestSuite(ImmediateProxyComSendOperationTest.class);
		suite.addTestSuite(PeriodicProxyComSendOperationTest.class);
		suite.addTestSuite(IocNonqueuedReadOperationTest.class);
		suite.addTestSuite(ComReadOperationTest.class);
		suite.addTestSuite(IocWriteApiTest.class);
		suite.addTestSuite(IocReadApiTest.class);
		suite.addTestSuite(ComSendSignalApiTest.class);
		suite.addTestSuite(ComReceiveSignalApiTest.class);
		suite.addTestSuite(ComRxCallbackTest.class);
		suite.addTestSuite(ComRxTOutCallbackTest.class);
		suite.addTestSuite(ComInvCallbackTest.class);
		suite.addTestSuite(ComSendSignalProxyEntityTest.class);
		suite.addTestSuite(ComSendSignalImmediateEntityTest.class);
		suite.addTestSuite(ComSendSignalPeriodicEntityTest.class);
		suite.addTestSuite(ComTxTOutCallbackTest.class);
		suite.addTestSuite(ComTAckCallbackTest.class);
		suite.addTestSuite(ComTErrCallbackTest.class);
		suite.addTestSuite(MaskedNewDiffersMaskedOldFilterOperationTest.class);
		suite.addTestSuite(MaskedNewDiffersXFilterOperationTest.class);
		suite.addTestSuite(NewIsWithinFilterOperationTest.class);
		suite.addTestSuite(NewIsOutsideFilterOperationTest.class);
		suite.addTestSuite(MaskedNewEqualsXFilterOperationTest.class);
		suite.addTestSuite(OneEveryNFilterOperationTest.class);
		suite.addTestSuite(RteCoreStartApiImplTest.class);
		suite.addTestSuite(RteStopApiTest.class);
		suite.addTestSuite(RestartPartitionApiTest.class);
		suite.addTestSuite(PartitionRestartingApiTest.class);
		suite.addTestSuite(PartitionTerminatedApiTest.class);
		suite.addTestSuite(SendApiTest.class);
		suite.addTestSuite(ReceiveApiTest.class);
		suite.addTestSuite(RteBufferQueuedSendOperationTest.class);
		suite.addTestSuite(RteBufferQueuedVariableTest.class);
		suite.addTestSuite(RteBufferQueuedReadOperationTest.class);
		suite.addTestSuite(IocReceiveApiTest.class);
		suite.addTestSuite(IocSendApiTest.class);
		suite.addTestSuite(IocSendOperationTest.class);
		suite.addTestSuite(IocQueuedSendOperationTest.class);
		suite.addTestSuite(IocQueuedReadOperationTest.class);
		suite.addTestSuite(CallApiTest.class);
		suite.addTestSuite(TfCallApiTest.class);
		suite.addTestSuite(DisabledInModeTest.class);
		suite.addTestSuite(AllInterruptBlockExcludeOperationTest.class);
		suite.addTestSuite(OsInterruptBlockExcludeOperationTest.class);
		suite.addTestSuite(OsSpinlockExcludeOperationTest.class);
		suite.addTestSuite(OsResourceExcludeOperationTest.class);
		suite.addTestSuite(NoneExcludeOperationTest.class);
		suite.addTestSuite(ConstantTest.class);
		suite.addTestSuite(ConstantMemberTest.class);
		suite.addTestSuite(RteEnterApiTest.class);
		suite.addTestSuite(RteExitApiTest.class);
		suite.addTestSuite(OsBackgroundTaskActivationExecutableTaskBodyTest.class);
		suite.addTestSuite(OsTaskActivationExecutableTaskBodyTest.class);
		suite.addTestSuite(OsEventSetExecutableTaskBodyTest.class);
		suite.addTestSuite(OsTaskActivationOperationTest.class);
		suite.addTestSuite(OsEventSetActivationOperationTest.class);
		suite.addTestSuite(TimingTriggeringExecutableStartOperationTest.class);
		suite.addTestSuite(PlainExecutableStartOperationTest.class);
		suite.addTestSuite(ModeSwitchTriggeringExecutableStartOperationTest.class);
		suite.addTestSuite(CycleCountupOperationTest.class);
		suite.addTestSuite(StartOffsetCountupOperationTest.class);
		suite.addTestSuite(IocEmptyQueueApiTest.class);
		suite.addTestSuite(ComSendSignalTrustedFunctionTest.class);
		suite.addTestSuite(OsSetEventApiTest.class);
		suite.addTestSuite(ComSendSignalImmediateTaskBodyTest.class);
		suite.addTestSuite(ComSendProxyOperationTest.class);
		suite.addTestSuite(IocReceiveGroupApiTest.class);
		suite.addTestSuite(VariableInitializeOperationTest.class);
		suite.addTestSuite(IocInitializeOperationTest.class);
		suite.addTestSuite(OsSuspendAllInterruptsApiTest.class);
		suite.addTestSuite(OsGetSpinlockApiTest.class);
		suite.addTestSuite(MulticoreRteStartApiTest.class);
		suite.addTestSuite(RteBufferWriteTrustedFunctionTest.class);
		suite.addTestSuite(RteBufferSendTrustedFunctionTest.class);
		suite.addTestSuite(CsTrustedFunctionTest.class);
		suite.addTestSuite(CsTfCalledRunnableTest.class);
		suite.addTestSuite(ServerRunnableStartOperationTest.class);
		suite.addTestSuite(IocSendGroupApiTest.class);
		suite.addTestSuite(SinglecoreRteStartApiTest.class);
		suite.addTestSuite(RteInternalHeaderTest.class);
		suite.addTestSuite(ModeTypeTest.class);
		suite.addTestSuite(ModeDeclarationGroupTest.class);
		suite.addTestSuite(ModeQueueTypeTest.class);
		suite.addTestSuite(ModeQueuedVariableTest.class);
		suite.addTestSuite(ModeMachineInstanceTest.class);
		suite.addTestSuite(FunctionMacroTest.class);
		suite.addTestSuite(ComProxyFunctionTableFileContentsGroupTest.class);
		suite.addTestSuite(PrimitiveTypeTest.class);
		suite.addTestSuite(RedefinitionPrimitiveTypeTest.class);
		suite.addTestSuite(ArrayTypeTest.class);
		suite.addTestSuite(RedefinitionArrayTypeTest.class);
		suite.addTestSuite(UnionTypeTest.class);
		suite.addTestSuite(RedefinitionUnionTypeTest.class);
		suite.addTestSuite(StructTypeTest.class);
		suite.addTestSuite(RedefinitionStructTypeTest.class);
		suite.addTestSuite(BlackboxTypeTest.class);
		suite.addTestSuite(UnionMemberTest.class);
		suite.addTestSuite(StructMemberTest.class);
		suite.addTestSuite(VariableMemberTest.class);
		suite.addTestSuite(RteUtilityHeaderTest.class);
		suite.addTestSuite(BlackboxHeaderTest.class);
		suite.addTestSuite(RteBufferQueueTypeTest.class);
		suite.addTestSuite(RteNonqueuedSendTrustedFunctionParamTypeTest.class);
		suite.addTestSuite(RteQueuedSendTrustedFunctionParamTypeTest.class);
		suite.addTestSuite(ComSendTrustedFunctionParamTypeTest.class);
		suite.addTestSuite(CsTrustedFunctionParamTypeTest.class);
		suite.addTestSuite(NeverReadOperationTest.class);
		suite.addTestSuite(SwcMemoryMappingTest.class);
		suite.addTestSuite(BswMemoryMappingTest.class);
		suite.addTestSuite(GlobalVariableFileContentsGroupTest.class);
		suite.addTestSuite(RteApiFileContentsGroupTest.class);
		suite.addTestSuite(RteLifecycleApiFileContentsGroupTest.class);
		suite.addTestSuite(TaskBodyFileContentsGroupTest.class);
		suite.addTestSuite(BswSchedulableEntityFileContentsGroupTest.class);
		suite.addTestSuite(ComCallbackFileContentsGroupTest.class);
		suite.addTestSuite(TrustedFunctionFileContentsGroupTest.class);
		suite.addTestSuite(ExecutableEntityFileContentsGroupTest.class);
		suite.addTestSuite(BswMemoryMappingHeaderTest.class);
		suite.addTestSuite(SwcMemoryMappingHeaderTest.class);
		suite.addTestSuite(GenerationInfoTest.class);
		suite.addTestSuite(MacroTest.class);
		suite.addTestSuite(ComProxyFunctionTest.class);
		suite.addTestSuite(ComSendSignalApiWrapperTest.class);
		suite.addTestSuite(ComReceiveSignalApiWrapperTest.class);
		suite.addTestSuite(SchmEnterApiTest.class);
		suite.addTestSuite(SchmExitApiTest.class);
		suite.addTestSuite(SchmModeApiTest.class);
		suite.addTestSuite(SchmSwitchApiTest.class);
		suite.addTestSuite(OsTaskEventsTriggeredByModeTest.class);
		suite.addTestSuite(OsTaskEventTest.class);
		suite.addTestSuite(ModuleInterlinkHeaderTest.class);
		suite.addTestSuite(SchmApiFileContentsGroupTest.class);
		suite.addTestSuite(ComSignalApiWrapperFileContentsGroupTest.class);
		suite.addTestSuite(ComProxyFunctionFileContentsGroupTest.class);
		suite.addTestSuite(ModuleInterlinkTypeHeaderTest.class);
		suite.addTestSuite(SchmLifecycleApiFileContentsGroupTest.class);
		suite.addTestSuite(PartedBswmTest.class);
		suite.addTestSuite(BswmTest.class);
		suite.addTestSuite(SchmDeinitApiTest.class);
		suite.addTestSuite(SchmInitApiTest.class);
		suite.addTestSuite(SinglecoreSchmInitApiTest.class);
		suite.addTestSuite(MulticoreSchmInitApiTest.class);
		suite.addTestSuite(SchmCoreInitApiImplTest.class);
		suite.addTestSuite(PointerTypeTest.class);
		suite.addTestSuite(RedefinitionPointerTypeTest.class);
		suite.addTestSuite(ActivationOperationTest.class);
		suite.addTestSuite(OsActivateTaskApiTest.class);
		suite.addTestSuite(FeedbackApiTest.class);
		suite.addTestSuite(TAckStatusTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleTests(String name) {
		super(name);
	}

} //ModuleTests
