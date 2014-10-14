/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.Ar4xPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.impl.Ar4xPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.M2PackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RteFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.RteRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionPackageImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtePackageImpl extends EPackageImpl implements RtePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteRootEClass = null;

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.RtePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtePackageImpl() {
		super(eNS_URI, RteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtePackage init() {
		if (isInited) return (RtePackage)EPackage.Registry.INSTANCE.getEPackage(RtePackage.eNS_URI);

		// Obtain or create and register package
		RtePackageImpl theRtePackage = (RtePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExPackageImpl theExPackage = (ExPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) instanceof ExPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI) : ExPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		ModulePackageImpl theModulePackage = (ModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) instanceof ModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI) : ModulePackage.eINSTANCE);
		Ar4xPackageImpl theAr4xPackage = (Ar4xPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) instanceof Ar4xPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ar4xPackage.eNS_URI) : Ar4xPackage.eINSTANCE);
		M2PackageImpl theM2Package = (M2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) instanceof M2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI) : M2Package.eINSTANCE);
		EcucPackageImpl theEcucPackage = (EcucPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) instanceof EcucPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcucPackage.eNS_URI) : EcucPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theRtePackage.createPackageContents();
		theExPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theModulePackage.createPackageContents();
		theAr4xPackage.createPackageContents();
		theM2Package.createPackageContents();
		theEcucPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theRtePackage.initializePackageContents();
		theExPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theModulePackage.initializePackageContents();
		theAr4xPackage.initializePackageContents();
		theM2Package.initializePackageContents();
		theEcucPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtePackage.eNS_URI, theRtePackage);
		return theRtePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteRoot() {
		return rteRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteFactory getRteFactory() {
		return (RteFactory)getEFactoryInstance();
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
		rteRootEClass = createEClass(RTE_ROOT);
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
		ExPackage theExPackage = (ExPackage)EPackage.Registry.INSTANCE.getEPackage(ExPackage.eNS_URI);
		InteractionPackage theInteractionPackage = (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);
		ModulePackage theModulePackage = (ModulePackage)EPackage.Registry.INSTANCE.getEPackage(ModulePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExPackage);
		getESubpackages().add(theInteractionPackage);
		getESubpackages().add(theModulePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rteRootEClass, RteRoot.class, "RteRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/",
			 "ecuc", "ar4x.ecore#//ecuc",
			 "instance", "ar4x.ecore#//instance",
			 "m2", "ar4x.ecore#//m2"
		   });
	}

} //RtePackageImpl
