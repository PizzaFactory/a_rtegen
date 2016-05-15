/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.tests.EcucTests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.tests.InstanceTests;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.tests.M2Tests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.tests.ExTests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.tests.InteractionTests;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.tests.ModuleTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Rte</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class RteAllTests extends TestSuite {

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
		TestSuite suite = new RteAllTests("Rte Tests"); //$NON-NLS-1$
		suite.addTest(ExTests.suite());
		suite.addTest(InteractionTests.suite());
		suite.addTest(ModuleTests.suite());
		suite.addTest(M2Tests.suite());
		suite.addTest(EcucTests.suite());
		suite.addTest(InstanceTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteAllTests(String name) {
		super(name);
	}

} //RteAllTests
