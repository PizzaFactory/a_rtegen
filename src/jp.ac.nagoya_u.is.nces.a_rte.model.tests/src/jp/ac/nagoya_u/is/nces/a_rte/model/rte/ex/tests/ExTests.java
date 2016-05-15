/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ex</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExTests extends TestSuite {

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
		TestSuite suite = new ExTests("ex Tests"); //$NON-NLS-1$
		suite.addTestSuite(TimeValueExTest.class);
		suite.addTestSuite(AlignmentTypeExTest.class);
		suite.addTestSuite(ValueSpecificationExTest.class);
		suite.addTestSuite(NonqueuedSenderComSpecExTest.class);
		suite.addTestSuite(CompuMethodExTest.class);
		suite.addTestSuite(CompuScaleExTest.class);
		suite.addTestSuite(ApplicationDataTypeExTest.class);
		suite.addTestSuite(ImplementationDataTypeExTest.class);
		suite.addTestSuite(ExclusiveAreaExTest.class);
		suite.addTestSuite(SenderReceiverToSignalMappingExTest.class);
		suite.addTestSuite(SenderReceiverToSignalGroupMappingExTest.class);
		suite.addTestSuite(OsTaskExTest.class);
		suite.addTestSuite(ComSignalExTest.class);
		suite.addTestSuite(ComSignalGroupExTest.class);
		suite.addTestSuite(EcucPartitionExTest.class);
		suite.addTestSuite(VariableDataPrototypeExTest.class);
		suite.addTestSuite(VariableDataInstanceInCompositionExTest.class);
		suite.addTestSuite(VariableDataInstanceInSwcExTest.class);
		suite.addTestSuite(PVariableDataInstanceInSwcExTest.class);
		suite.addTestSuite(RVariableDataInstanceInSwcExTest.class);
		suite.addTestSuite(ROperationInstanceInSwcExTest.class);
		suite.addTestSuite(AssemblyDataInstanceConnectorExTest.class);
		suite.addTestSuite(ExternalEcuSenderExTest.class);
		suite.addTestSuite(ExternalEcuReceiverExTest.class);
		suite.addTestSuite(EntityStarterExTest.class);
		suite.addTestSuite(BswSchedulableEntityExTest.class);
		suite.addTestSuite(ModeDeclarationGroupPrototypeExTest.class);
		suite.addTestSuite(RteEventExTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExTests(String name) {
		super(name);
	}

} //ExTests
