/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RteTestFactoryImpl extends EFactoryImpl implements RteTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteTestFactory init() {
		try {
			RteTestFactory theRteTestFactory = (RteTestFactory)EPackage.Registry.INSTANCE.getEFactory(RteTestPackage.eNS_URI);
			if (theRteTestFactory != null) {
				return theRteTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RteTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RteTestPackage.RTE_TEST_MODULE: return createRteTestModule();
			case RteTestPackage.OS_STUB_HEADER: return createOsStubHeader();
			case RteTestPackage.COM_STUB_HEADER: return createComStubHeader();
			case RteTestPackage.IOC_MOCK_HEADER: return createIocMockHeader();
			case RteTestPackage.SWC_MOCK_HEADER: return createSwcMockHeader();
			case RteTestPackage.RTE_TEST_ROOT: return createRteTestRoot();
			case RteTestPackage.IOC_MOCK_SOURCE: return createIocMockSource();
			case RteTestPackage.SWC_MOCK_SOURCE: return createSwcMockSource();
			case RteTestPackage.RTE_TEST: return createRteTest();
			case RteTestPackage.BSWM_MOCK_HEADER: return createBswmMockHeader();
			case RteTestPackage.BSWM_MOCK_SOURCE: return createBswmMockSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestModule createRteTestModule() {
		RteTestModuleImpl rteTestModule = new RteTestModuleImpl();
		return rteTestModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsStubHeader createOsStubHeader() {
		OsStubHeaderImpl osStubHeader = new OsStubHeaderImpl();
		return osStubHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComStubHeader createComStubHeader() {
		ComStubHeaderImpl comStubHeader = new ComStubHeaderImpl();
		return comStubHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocMockHeader createIocMockHeader() {
		IocMockHeaderImpl iocMockHeader = new IocMockHeaderImpl();
		return iocMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcMockHeader createSwcMockHeader() {
		SwcMockHeaderImpl swcMockHeader = new SwcMockHeaderImpl();
		return swcMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestRoot createRteTestRoot() {
		RteTestRootImpl rteTestRoot = new RteTestRootImpl();
		return rteTestRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocMockSource createIocMockSource() {
		IocMockSourceImpl iocMockSource = new IocMockSourceImpl();
		return iocMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcMockSource createSwcMockSource() {
		SwcMockSourceImpl swcMockSource = new SwcMockSourceImpl();
		return swcMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTest createRteTest() {
		RteTestImpl rteTest = new RteTestImpl();
		return rteTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswmMockHeader createBswmMockHeader() {
		BswmMockHeaderImpl bswmMockHeader = new BswmMockHeaderImpl();
		return bswmMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswmMockSource createBswmMockSource() {
		BswmMockSourceImpl bswmMockSource = new BswmMockSourceImpl();
		return bswmMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestPackage getRteTestPackage() {
		return (RteTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RteTestPackage getPackage() {
		return RteTestPackage.eINSTANCE;
	}

} //RteTestFactoryImpl
