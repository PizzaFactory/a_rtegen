/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Data Instance In Composition Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Declaration</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Start</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Partition Restart</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value As Text</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Initialization Strategy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Section Initialization Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Equals Init Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class VariableDataInstanceInCompositionExTest extends TestCase {

	/**
	 * The fixture for this Variable Data Instance In Composition Ex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInCompositionEx fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableDataInstanceInCompositionExTest.class);
	}

	/**
	 * Constructs a new Variable Data Instance In Composition Ex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInCompositionExTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Variable Data Instance In Composition Ex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VariableDataInstanceInCompositionEx fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Variable Data Instance In Composition Ex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInCompositionEx getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExFactory.eINSTANCE.createVariableDataInstanceInCompositionEx());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetPartition__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testInitAtDeclaration__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testInitAtStart__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Partition Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testInitAtPartitionRestart__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value As Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetInitValueAsText__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Initialization Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 */
	public void testGetInitializationStrategy__VariableDataInstanceInSwc() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Section Initialization Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 */
	public void testGetSectionInitializationPolicy__VariableDataInstanceInSwc() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetInitValue__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetReceiverInitValue__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetSenderInitValue__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetSwAddrMethod__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetReceiverSwAddrMethod__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testGetSenderSwAddrMethod__VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Equals Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx#equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 */
	public void testEqualsInitValue__VariableDataInstanceInComposition_VariableDataInstanceInComposition() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //VariableDataInstanceInCompositionExTest
