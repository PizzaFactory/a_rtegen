/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>m2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class M2Tests extends TestSuite {

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
		TestSuite suite = new M2Tests("m2 Tests"); //$NON-NLS-1$
		suite.addTestSuite(AutosarTest.class);
		suite.addTestSuite(ArPackageTest.class);
		suite.addTestSuite(SwBaseTypeTest.class);
		suite.addTestSuite(SenderReceiverInterfaceTest.class);
		suite.addTestSuite(VariableDataPrototypeTest.class);
		suite.addTestSuite(ApplicationSwComponentTypeTest.class);
		suite.addTestSuite(RPortPrototypeTest.class);
		suite.addTestSuite(PPortPrototypeTest.class);
		suite.addTestSuite(SwcInternalBehaviorTest.class);
		suite.addTestSuite(RunnableEntityTest.class);
		suite.addTestSuite(VariableAccessTest.class);
		suite.addTestSuite(VariableInAtomicSwcTypeInstanceRefTest.class);
		suite.addTestSuite(TimingEventTest.class);
		suite.addTestSuite(BackgroundEventTest.class);
		suite.addTestSuite(DataSendCompletedEventTest.class);
		suite.addTestSuite(DataReceivedEventTest.class);
		suite.addTestSuite(DataReceiveErrorEventTest.class);
		suite.addTestSuite(RVariableInAtomicSwcInstanceRefTest.class);
		suite.addTestSuite(EcucModuleConfigurationValuesTest.class);
		suite.addTestSuite(EcucContainerValueTest.class);
		suite.addTestSuite(PortInterfaceTest.class);
		suite.addTestSuite(CompositionSwComponentTypeTest.class);
		suite.addTestSuite(AssemblySwConnectorTest.class);
		suite.addTestSuite(DelegationSwConnectorTest.class);
		suite.addTestSuite(RPortPrototypeInCompositionInstanceRefTest.class);
		suite.addTestSuite(PPortPrototypeInCompositionInstanceRefTest.class);
		suite.addTestSuite(SwComponentPrototypeTest.class);
		suite.addTestSuite(ImplementationDataTypeTest.class);
		suite.addTestSuite(ImplementationDataTypeElementTest.class);
		suite.addTestSuite(DataTypeMappingSetTest.class);
		suite.addTestSuite(ModeDeclarationGroupPrototypeTest.class);
		suite.addTestSuite(ModeDeclarationTest.class);
		suite.addTestSuite(ModeDeclarationGroupTest.class);
		suite.addTestSuite(ApplicationPrimitiveDataTypeTest.class);
		suite.addTestSuite(ExclusiveAreaTest.class);
		suite.addTestSuite(ConstantReferenceTest.class);
		suite.addTestSuite(ConstantSpecificationTest.class);
		suite.addTestSuite(OperationInvokedEventTest.class);
		suite.addTestSuite(POperationInAtomicSwcInstanceRefTest.class);
		suite.addTestSuite(ClientServerInterfaceTest.class);
		suite.addTestSuite(ClientServerOperationTest.class);
		suite.addTestSuite(ApplicationErrorTest.class);
		suite.addTestSuite(ArgumentDataPrototypeTest.class);
		suite.addTestSuite(DataFilterTest.class);
		suite.addTestSuite(InvalidationPolicyTest.class);
		suite.addTestSuite(PortDefinedArgumentValueTest.class);
		suite.addTestSuite(SystemTest.class);
		suite.addTestSuite(RootSwCompositionPrototypeTest.class);
		suite.addTestSuite(SystemMappingTest.class);
		suite.addTestSuite(SystemSignalTest.class);
		suite.addTestSuite(ISignalTest.class);
		suite.addTestSuite(ISignalIPduTest.class);
		suite.addTestSuite(ISignalToIPduMappingTest.class);
		suite.addTestSuite(VariableDataPrototypeInSystemInstanceRefTest.class);
		suite.addTestSuite(EcucValueCollectionTest.class);
		suite.addTestSuite(SynchronousServerCallPointTest.class);
		suite.addTestSuite(ROperationInAtomicSwcInstanceRefTest.class);
		suite.addTestSuite(SwAddrMethodTest.class);
		suite.addTestSuite(CompuMethodTest.class);
		suite.addTestSuite(DataConstrTest.class);
		suite.addTestSuite(AnyInstanceRefTest.class);
		suite.addTestSuite(EcuAbstractionSwComponentTypeTest.class);
		suite.addTestSuite(NvBlockSwComponentTypeTest.class);
		suite.addTestSuite(SensorActuatorSwComponentTypeTest.class);
		suite.addTestSuite(ComplexDeviceDriverSwComponentTypeTest.class);
		suite.addTestSuite(ServiceProxySwComponentTypeTest.class);
		suite.addTestSuite(ServiceSwComponentTypeTest.class);
		suite.addTestSuite(PPortInCompositionInstanceRefTest.class);
		suite.addTestSuite(RPortInCompositionInstanceRefTest.class);
		suite.addTestSuite(SwcBswMappingTest.class);
		suite.addTestSuite(BswInternalBehaviorTest.class);
		suite.addTestSuite(BswImplementationTest.class);
		suite.addTestSuite(BswModuleDescriptionTest.class);
		suite.addTestSuite(BswModuleEntryTest.class);
		suite.addTestSuite(BswSchedulableEntityTest.class);
		suite.addTestSuite(BswModeSwitchEventTest.class);
		suite.addTestSuite(ModeInBswModuleDescriptionInstanceRefTest.class);
		suite.addTestSuite(BswTimingEventTest.class);
		suite.addTestSuite(BswBackgroundEventTest.class);
		suite.addTestSuite(BswCalledEntityTest.class);
		suite.addTestSuite(BswInterruptEntityTest.class);
		suite.addTestSuite(SystemSignalGroupTest.class);
		suite.addTestSuite(ISignalGroupTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2Tests(String name) {
		super(name);
	}

} //M2Tests
