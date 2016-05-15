/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ecuc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcucTests extends TestSuite {

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
		TestSuite suite = new EcucTests("ecuc Tests"); //$NON-NLS-1$
		suite.addTestSuite(RteTest.class);
		suite.addTestSuite(RteGenerationTest.class);
		suite.addTestSuite(RteBswGeneralTest.class);
		suite.addTestSuite(RteSwComponentInstanceTest.class);
		suite.addTestSuite(RteEventToTaskMappingTest.class);
		suite.addTestSuite(OsTest.class);
		suite.addTestSuite(OsTaskTest.class);
		suite.addTestSuite(RteExclusiveAreaImplementationTest.class);
		suite.addTestSuite(OsEventTest.class);
		suite.addTestSuite(ComTest.class);
		suite.addTestSuite(ComConfigTest.class);
		suite.addTestSuite(ComSignalTest.class);
		suite.addTestSuite(ComSignalGroupTest.class);
		suite.addTestSuite(ComGroupSignalTest.class);
		suite.addTestSuite(OsAlarmTest.class);
		suite.addTestSuite(OsResourceTest.class);
		suite.addTestSuite(OsApplicationTest.class);
		suite.addTestSuite(EcuCTest.class);
		suite.addTestSuite(EcucPartitionCollectionTest.class);
		suite.addTestSuite(EcucPartitionTest.class);
		suite.addTestSuite(OsSpinlockTest.class);
		suite.addTestSuite(RteOsInteractionTest.class);
		suite.addTestSuite(RteUsedOsActivationTest.class);
		suite.addTestSuite(RteInitializationBehaviorTest.class);
		suite.addTestSuite(OsIocTest.class);
		suite.addTestSuite(OsIocCommunicationTest.class);
		suite.addTestSuite(OsIocSenderPropertiesTest.class);
		suite.addTestSuite(OsIocReceiverPropertiesTest.class);
		suite.addTestSuite(OsIocDataPropertiesTest.class);
		suite.addTestSuite(OsApplicationTrustedFunctionTest.class);
		suite.addTestSuite(OsOSTest.class);
		suite.addTestSuite(RteBswEventToTaskMappingTest.class);
		suite.addTestSuite(RteBswRequiredModeGroupConnectionTest.class);
		suite.addTestSuite(RteBswModuleInstanceTest.class);
		suite.addTestSuite(RteBswExclusiveAreaImplTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucTests(String name) {
		super(name);
	}

} //EcucTests
