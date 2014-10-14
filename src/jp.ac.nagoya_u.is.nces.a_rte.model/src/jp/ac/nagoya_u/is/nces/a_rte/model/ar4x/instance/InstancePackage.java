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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface InstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/ar4x/instance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancePackage eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject <em>IInstance Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getIInstanceObject()
	 * @generated
	 */
	int IINSTANCE_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINSTANCE_OBJECT__INSTANCE_ID = 0;

	/**
	 * The number of structural features of the '<em>IInstance Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINSTANCE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IInstance Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINSTANCE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceReferrableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getInstanceReferrable()
	 * @generated
	 */
	int INSTANCE_REFERRABLE = 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERRABLE__INSTANCE_ID = IINSTANCE_OBJECT__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERRABLE__ID = IINSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERRABLE_FEATURE_COUNT = IINSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERRABLE_OPERATION_COUNT = IINSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PortInstanceInCompositionImpl <em>Port Instance In Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PortInstanceInCompositionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getPortInstanceInComposition()
	 * @generated
	 */
	int PORT_INSTANCE_IN_COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION__INSTANCE_ID = INSTANCE_REFERRABLE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION__ID = INSTANCE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Context Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION__CONTEXT_COMPONENT = INSTANCE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION__PROTOTYPE = INSTANCE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION__DATA_ELEMENT = INSTANCE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION__OPERATION = INSTANCE_REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Instance In Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION_FEATURE_COUNT = INSTANCE_REFERRABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Port Instance In Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_IN_COMPOSITION_OPERATION_COUNT = INSTANCE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl <em>Variable Data Instance In Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getVariableDataInstanceInSwc()
	 * @generated
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC = 2;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl <em>Variable Data Instance In Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getVariableDataInstanceInComposition()
	 * @generated
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION = 3;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PVariableDataInstanceInSwcImpl <em>PVariable Data Instance In Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PVariableDataInstanceInSwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getPVariableDataInstanceInSwc()
	 * @generated
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC = 4;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.RVariableDataInstanceInSwcImpl <em>RVariable Data Instance In Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.RVariableDataInstanceInSwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getRVariableDataInstanceInSwc()
	 * @generated
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC = 5;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyDataInstanceConnectorImpl <em>Assembly Data Instance Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyDataInstanceConnectorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getAssemblyDataInstanceConnector()
	 * @generated
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR = 6;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.DelegationDataInstanceConnectorImpl <em>Delegation Data Instance Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.DelegationDataInstanceConnectorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getDelegationDataInstanceConnector()
	 * @generated
	 */
	int DELEGATION_DATA_INSTANCE_CONNECTOR = 7;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInSwcImpl <em>Operation Instance In Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInSwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getOperationInstanceInSwc()
	 * @generated
	 */
	int OPERATION_INSTANCE_IN_SWC = 8;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.ROperationInstanceInSwcImpl <em>ROperation Instance In Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.ROperationInstanceInSwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getROperationInstanceInSwc()
	 * @generated
	 */
	int ROPERATION_INSTANCE_IN_SWC = 9;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.POperationInstanceInSwcImpl <em>POperation Instance In Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.POperationInstanceInSwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getPOperationInstanceInSwc()
	 * @generated
	 */
	int POPERATION_INSTANCE_IN_SWC = 10;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInCompositionImpl <em>Operation Instance In Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInCompositionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getOperationInstanceInComposition()
	 * @generated
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION = 11;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyOperationInstanceConnectorImpl <em>Assembly Operation Instance Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyOperationInstanceConnectorImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getAssemblyOperationInstanceConnector()
	 * @generated
	 */
	int ASSEMBLY_OPERATION_INSTANCE_CONNECTOR = 12;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl <em>Sw Component Instance In System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getSwComponentInstanceInSystem()
	 * @generated
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM = 14;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getInstanceRoot()
	 * @generated
	 */
	int INSTANCE_ROOT = 15;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceImpl <em>Variable Data Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getVariableDataInstance()
	 * @generated
	 */
	int VARIABLE_DATA_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE__INSTANCE_ID = INSTANCE_REFERRABLE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE__ID = INSTANCE_REFERRABLE__ID;

	/**
	 * The number of structural features of the '<em>Variable Data Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_FEATURE_COUNT = INSTANCE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Data Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_OPERATION_COUNT = INSTANCE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE_ID = VARIABLE_DATA_INSTANCE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC__ID = VARIABLE_DATA_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Data Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Target Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Base Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Invalid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Sw Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Application Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Owner Atomic Swc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Variable Data Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION__INSTANCE_ID = VARIABLE_DATA_INSTANCE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION__ID = VARIABLE_DATA_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requester Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Data Instance In Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_FEATURE_COUNT = VARIABLE_DATA_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Provided</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Data Instance In Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_INSTANCE_IN_COMPOSITION_OPERATION_COUNT = VARIABLE_DATA_INSTANCE_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE_ID = VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC__ID = VARIABLE_DATA_INSTANCE_IN_SWC__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE = VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT = VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE = VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE;

	/**
	 * The feature id for the '<em><b>Context PPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PPORT = VARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PVariable Data Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT = VARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME = VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS = VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY = VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY;

	/**
	 * The operation id for the '<em>Get Base Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE;

	/**
	 * The operation id for the '<em>Get Invalid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD = VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD;

	/**
	 * The operation id for the '<em>Get Sw Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT = VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT;

	/**
	 * The operation id for the '<em>Get Application Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE;

	/**
	 * The operation id for the '<em>Get Owner Atomic Swc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC;

	/**
	 * The operation id for the '<em>Is Invalidation Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Invalidation Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Com Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>PVariable Data Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE_ID = VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC__ID = VARIABLE_DATA_INSTANCE_IN_SWC__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE = VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT = VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE = VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE;

	/**
	 * The feature id for the '<em><b>Context RPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT = VARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RVariable Data Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT = VARIABLE_DATA_INSTANCE_IN_SWC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME = VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME;

	/**
	 * The operation id for the '<em>Is Event Semantics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS = VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS;

	/**
	 * The operation id for the '<em>Get Sw Impl Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY = VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY;

	/**
	 * The operation id for the '<em>Get Base Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE;

	/**
	 * The operation id for the '<em>Get Invalid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE;

	/**
	 * The operation id for the '<em>Get Sw Addr Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD = VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD;

	/**
	 * The operation id for the '<em>Get Sw Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT = VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT;

	/**
	 * The operation id for the '<em>Get Application Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE;

	/**
	 * The operation id for the '<em>Get Implementation Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE = VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE;

	/**
	 * The operation id for the '<em>Get Owner Atomic Swc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC;

	/**
	 * The operation id for the '<em>Is Filter Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Alive Timeout Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Invalidation Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Invalidation Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Init Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Queue Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Com Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>RVariable Data Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RVARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT = VARIABLE_DATA_INSTANCE_IN_SWC_OPERATION_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Requester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER = 1;

	/**
	 * The number of structural features of the '<em>Assembly Data Instance Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assembly Data Instance Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DATA_INSTANCE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Outer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER = 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_DATA_INSTANCE_CONNECTOR__INNER = 1;

	/**
	 * The number of structural features of the '<em>Delegation Data Instance Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_DATA_INSTANCE_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delegation Data Instance Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_DATA_INSTANCE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC__INSTANCE_ID = INSTANCE_REFERRABLE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC__ID = INSTANCE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC__PROTOTYPE = INSTANCE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT = INSTANCE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC__INSTANCE = INSTANCE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC_FEATURE_COUNT = INSTANCE_REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Owner Atomic Swc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = INSTANCE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_SWC_OPERATION_COUNT = INSTANCE_REFERRABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC__INSTANCE_ID = OPERATION_INSTANCE_IN_SWC__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC__ID = OPERATION_INSTANCE_IN_SWC__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC__PROTOTYPE = OPERATION_INSTANCE_IN_SWC__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC__CONTEXT_PORT = OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC__INSTANCE = OPERATION_INSTANCE_IN_SWC__INSTANCE;

	/**
	 * The number of structural features of the '<em>ROperation Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC_FEATURE_COUNT = OPERATION_INSTANCE_IN_SWC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Owner Atomic Swc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = OPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC;

	/**
	 * The number of operations of the '<em>ROperation Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPERATION_INSTANCE_IN_SWC_OPERATION_COUNT = OPERATION_INSTANCE_IN_SWC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC__INSTANCE_ID = OPERATION_INSTANCE_IN_SWC__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC__ID = OPERATION_INSTANCE_IN_SWC__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC__PROTOTYPE = OPERATION_INSTANCE_IN_SWC__PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC__CONTEXT_PORT = OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC__INSTANCE = OPERATION_INSTANCE_IN_SWC__INSTANCE;

	/**
	 * The feature id for the '<em><b>Operation Invoked Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC__OPERATION_INVOKED_EVENT = OPERATION_INSTANCE_IN_SWC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>POperation Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC_FEATURE_COUNT = OPERATION_INSTANCE_IN_SWC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner Atomic Swc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = OPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC;

	/**
	 * The number of operations of the '<em>POperation Instance In Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPERATION_INSTANCE_IN_SWC_OPERATION_COUNT = OPERATION_INSTANCE_IN_SWC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION__INSTANCE_ID = INSTANCE_REFERRABLE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION__ID = INSTANCE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE = INSTANCE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION__PARENT = INSTANCE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requester Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION = INSTANCE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION = INSTANCE_REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation Instance In Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION_FEATURE_COUNT = INSTANCE_REFERRABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Target Short Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME = INSTANCE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Instance In Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INSTANCE_IN_COMPOSITION_OPERATION_COUNT = INSTANCE_REFERRABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__PROVIDER = 1;

	/**
	 * The number of structural features of the '<em>Assembly Operation Instance Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_INSTANCE_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assembly Operation Instance Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_INSTANCE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM__INSTANCE_ID = INSTANCE_REFERRABLE__INSTANCE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM__ID = INSTANCE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Context Root Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION = INSTANCE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE = INSTANCE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION = INSTANCE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sw Component Instance In System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM_FEATURE_COUNT = INSTANCE_REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sw Component Instance In System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_INSTANCE_IN_SYSTEM_OPERATION_COUNT = INSTANCE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Data Instance Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Delegation Data Instance Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Sw Component Instance In System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Port Instance In Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Variable Data Instance In Swc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC = 4;

	/**
	 * The feature id for the '<em><b>Operation Instance In Swc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC = 5;

	/**
	 * The feature id for the '<em><b>Assembly Operation Instance Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR = 6;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ROOT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable
	 * @generated
	 */
	EClass getInstanceReferrable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable#getId()
	 * @see #getInstanceReferrable()
	 * @generated
	 */
	EAttribute getInstanceReferrable_Id();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition <em>Port Instance In Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance In Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition
	 * @generated
	 */
	EClass getPortInstanceInComposition();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getContextComponent <em>Context Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Component</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getContextComponent()
	 * @see #getPortInstanceInComposition()
	 * @generated
	 */
	EReference getPortInstanceInComposition_ContextComponent();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getPrototype()
	 * @see #getPortInstanceInComposition()
	 * @generated
	 */
	EReference getPortInstanceInComposition_Prototype();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Element</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getDataElement()
	 * @see #getPortInstanceInComposition()
	 * @generated
	 */
	EReference getPortInstanceInComposition_DataElement();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition#getOperation()
	 * @see #getPortInstanceInComposition()
	 * @generated
	 */
	EReference getPortInstanceInComposition_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc <em>Variable Data Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc
	 * @generated
	 */
	EClass getVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getPrototype()
	 * @see #getVariableDataInstanceInSwc()
	 * @generated
	 */
	EReference getVariableDataInstanceInSwc_Prototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getContextPort <em>Context Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getContextPort()
	 * @see #getVariableDataInstanceInSwc()
	 * @generated
	 */
	EReference getVariableDataInstanceInSwc_ContextPort();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getInstance()
	 * @see #getVariableDataInstanceInSwc()
	 * @generated
	 */
	EReference getVariableDataInstanceInSwc_Instance();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getTargetShortName() <em>Get Target Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Short Name</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getTargetShortName()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetTargetShortName();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#isEventSemantics() <em>Is Event Semantics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Event Semantics</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#isEventSemantics()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__IsEventSemantics();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getSwImplPolicy() <em>Get Sw Impl Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Impl Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getSwImplPolicy()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetSwImplPolicy();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getBaseType() <em>Get Base Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getBaseType()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetBaseType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getInvalidValue() <em>Get Invalid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invalid Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getInvalidValue()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetInvalidValue();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getSwAddrMethod() <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Addr Method</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getSwAddrMethod()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetSwAddrMethod();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getSwAlignment() <em>Get Sw Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sw Alignment</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getSwAlignment()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetSwAlignment();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getApplicationDataType() <em>Get Application Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Application Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getApplicationDataType()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetApplicationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getImplementationDataType() <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation Data Type</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getImplementationDataType()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetImplementationDataType();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getOwnerAtomicSwc() <em>Get Owner Atomic Swc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Owner Atomic Swc</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getOwnerAtomicSwc()
	 * @generated
	 */
	EOperation getVariableDataInstanceInSwc__GetOwnerAtomicSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition <em>Variable Data Instance In Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Instance In Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition
	 * @generated
	 */
	EClass getVariableDataInstanceInComposition();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getPrototype()
	 * @see #getVariableDataInstanceInComposition()
	 * @generated
	 */
	EReference getVariableDataInstanceInComposition_Prototype();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getParent()
	 * @see #getVariableDataInstanceInComposition()
	 * @generated
	 */
	EReference getVariableDataInstanceInComposition_Parent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getRequesterConnection <em>Requester Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requester Connection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getRequesterConnection()
	 * @see #getVariableDataInstanceInComposition()
	 * @generated
	 */
	EReference getVariableDataInstanceInComposition_RequesterConnection();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getProviderConnection <em>Provider Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provider Connection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getProviderConnection()
	 * @see #getVariableDataInstanceInComposition()
	 * @generated
	 */
	EReference getVariableDataInstanceInComposition_ProviderConnection();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#isProvided() <em>Is Provided</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Provided</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#isProvided()
	 * @generated
	 */
	EOperation getVariableDataInstanceInComposition__IsProvided();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#isRequired() <em>Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Required</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#isRequired()
	 * @generated
	 */
	EOperation getVariableDataInstanceInComposition__IsRequired();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getTargetShortName() <em>Get Target Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Short Name</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getTargetShortName()
	 * @generated
	 */
	EOperation getVariableDataInstanceInComposition__GetTargetShortName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc <em>PVariable Data Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVariable Data Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc
	 * @generated
	 */
	EClass getPVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getContextPPort <em>Context PPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context PPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getContextPPort()
	 * @see #getPVariableDataInstanceInSwc()
	 * @generated
	 */
	EReference getPVariableDataInstanceInSwc_ContextPPort();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Invalidation Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#isInvalidationEnabled()
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwc__IsInvalidationEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getInvalidationPolicy() <em>Get Invalidation Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invalidation Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getInvalidationPolicy()
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwc__GetInvalidationPolicy();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getInitValue() <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getInitValue()
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwc__GetInitValue();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getComSpec() <em>Get Com Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Com Spec</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc#getComSpec()
	 * @generated
	 */
	EOperation getPVariableDataInstanceInSwc__GetComSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc <em>RVariable Data Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RVariable Data Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc
	 * @generated
	 */
	EClass getRVariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getContextRPort <em>Context RPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context RPort</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getContextRPort()
	 * @see #getRVariableDataInstanceInSwc()
	 * @generated
	 */
	EReference getRVariableDataInstanceInSwc_ContextRPort();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#isFilterEnabled() <em>Is Filter Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filter Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#isFilterEnabled()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__IsFilterEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getFilter() <em>Get Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Filter</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getFilter()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__GetFilter();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#isAliveTimeoutEnabled() <em>Is Alive Timeout Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Alive Timeout Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#isAliveTimeoutEnabled()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__IsAliveTimeoutEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Invalidation Enabled</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#isInvalidationEnabled()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__IsInvalidationEnabled();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getInvalidationPolicy() <em>Get Invalidation Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invalidation Policy</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getInvalidationPolicy()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__GetInvalidationPolicy();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getInitValue() <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Init Value</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getInitValue()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__GetInitValue();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getQueueLength() <em>Get Queue Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Queue Length</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getQueueLength()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__GetQueueLength();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getComSpec() <em>Get Com Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Com Spec</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc#getComSpec()
	 * @generated
	 */
	EOperation getRVariableDataInstanceInSwc__GetComSpec();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector <em>Assembly Data Instance Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Data Instance Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector
	 * @generated
	 */
	EClass getAssemblyDataInstanceConnector();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector#getProvider()
	 * @see #getAssemblyDataInstanceConnector()
	 * @generated
	 */
	EReference getAssemblyDataInstanceConnector_Provider();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector#getRequester <em>Requester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requester</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector#getRequester()
	 * @see #getAssemblyDataInstanceConnector()
	 * @generated
	 */
	EReference getAssemblyDataInstanceConnector_Requester();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector <em>Delegation Data Instance Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Data Instance Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector
	 * @generated
	 */
	EClass getDelegationDataInstanceConnector();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector#getOuter <em>Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector#getOuter()
	 * @see #getDelegationDataInstanceConnector()
	 * @generated
	 */
	EReference getDelegationDataInstanceConnector_Outer();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector#getInner()
	 * @see #getDelegationDataInstanceConnector()
	 * @generated
	 */
	EReference getDelegationDataInstanceConnector_Inner();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc <em>Operation Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc
	 * @generated
	 */
	EClass getOperationInstanceInSwc();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getPrototype()
	 * @see #getOperationInstanceInSwc()
	 * @generated
	 */
	EReference getOperationInstanceInSwc_Prototype();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getContextPort <em>Context Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Port</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getContextPort()
	 * @see #getOperationInstanceInSwc()
	 * @generated
	 */
	EReference getOperationInstanceInSwc_ContextPort();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getInstance()
	 * @see #getOperationInstanceInSwc()
	 * @generated
	 */
	EReference getOperationInstanceInSwc_Instance();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getOwnerAtomicSwc() <em>Get Owner Atomic Swc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Owner Atomic Swc</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc#getOwnerAtomicSwc()
	 * @generated
	 */
	EOperation getOperationInstanceInSwc__GetOwnerAtomicSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc <em>ROperation Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROperation Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc
	 * @generated
	 */
	EClass getROperationInstanceInSwc();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc <em>POperation Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POperation Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc
	 * @generated
	 */
	EClass getPOperationInstanceInSwc();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc#getOperationInvokedEvent <em>Operation Invoked Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation Invoked Event</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc#getOperationInvokedEvent()
	 * @see #getPOperationInstanceInSwc()
	 * @generated
	 */
	EReference getPOperationInstanceInSwc_OperationInvokedEvent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition <em>Operation Instance In Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Instance In Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition
	 * @generated
	 */
	EClass getOperationInstanceInComposition();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getPrototype()
	 * @see #getOperationInstanceInComposition()
	 * @generated
	 */
	EReference getOperationInstanceInComposition_Prototype();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getParent()
	 * @see #getOperationInstanceInComposition()
	 * @generated
	 */
	EReference getOperationInstanceInComposition_Parent();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getRequesterConnection <em>Requester Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requester Connection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getRequesterConnection()
	 * @see #getOperationInstanceInComposition()
	 * @generated
	 */
	EReference getOperationInstanceInComposition_RequesterConnection();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getProviderConnection <em>Provider Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provider Connection</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getProviderConnection()
	 * @see #getOperationInstanceInComposition()
	 * @generated
	 */
	EReference getOperationInstanceInComposition_ProviderConnection();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getTargetShortName() <em>Get Target Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Short Name</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition#getTargetShortName()
	 * @generated
	 */
	EOperation getOperationInstanceInComposition__GetTargetShortName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector <em>Assembly Operation Instance Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Operation Instance Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector
	 * @generated
	 */
	EClass getAssemblyOperationInstanceConnector();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector#getRequester <em>Requester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requester</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector#getRequester()
	 * @see #getAssemblyOperationInstanceConnector()
	 * @generated
	 */
	EReference getAssemblyOperationInstanceConnector_Requester();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector#getProvider()
	 * @see #getAssemblyOperationInstanceConnector()
	 * @generated
	 */
	EReference getAssemblyOperationInstanceConnector_Provider();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject <em>IInstance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IInstance Object</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject
	 * @generated
	 */
	EClass getIInstanceObject();

	/**
	 * Returns the meta object for the attribute list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instance Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject#getInstanceId()
	 * @see #getIInstanceObject()
	 * @generated
	 */
	EAttribute getIInstanceObject_InstanceId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem <em>Sw Component Instance In System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sw Component Instance In System</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem
	 * @generated
	 */
	EClass getSwComponentInstanceInSystem();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getContextRootComposition <em>Context Root Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Root Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getContextRootComposition()
	 * @see #getSwComponentInstanceInSystem()
	 * @generated
	 */
	EReference getSwComponentInstanceInSystem_ContextRootComposition();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getPrototype()
	 * @see #getSwComponentInstanceInSystem()
	 * @generated
	 */
	EReference getSwComponentInstanceInSystem_Prototype();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getOwnerPartition <em>Owner Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem#getOwnerPartition()
	 * @see #getSwComponentInstanceInSystem()
	 * @generated
	 */
	EReference getSwComponentInstanceInSystem_OwnerPartition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot
	 * @generated
	 */
	EClass getInstanceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getAssemblyDataInstanceConnector <em>Assembly Data Instance Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Data Instance Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getAssemblyDataInstanceConnector()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_AssemblyDataInstanceConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getDelegationDataInstanceConnector <em>Delegation Data Instance Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Data Instance Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getDelegationDataInstanceConnector()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_DelegationDataInstanceConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getSwComponentInstanceInSystem <em>Sw Component Instance In System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sw Component Instance In System</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getSwComponentInstanceInSystem()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_SwComponentInstanceInSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getPortInstanceInComposition <em>Port Instance In Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Instance In Composition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getPortInstanceInComposition()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_PortInstanceInComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getVariableDataInstanceInSwc <em>Variable Data Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Data Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getVariableDataInstanceInSwc()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_VariableDataInstanceInSwc();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getOperationInstanceInSwc <em>Operation Instance In Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Instance In Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getOperationInstanceInSwc()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_OperationInstanceInSwc();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getAssemblyOperationInstanceConnector <em>Assembly Operation Instance Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Operation Instance Connector</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot#getAssemblyOperationInstanceConnector()
	 * @see #getInstanceRoot()
	 * @generated
	 */
	EReference getInstanceRoot_AssemblyOperationInstanceConnector();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstance <em>Variable Data Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Instance</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstance
	 * @generated
	 */
	EClass getVariableDataInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstanceFactory getInstanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceReferrableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getInstanceReferrable()
		 * @generated
		 */
		EClass INSTANCE_REFERRABLE = eINSTANCE.getInstanceReferrable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_REFERRABLE__ID = eINSTANCE.getInstanceReferrable_Id();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PortInstanceInCompositionImpl <em>Port Instance In Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PortInstanceInCompositionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getPortInstanceInComposition()
		 * @generated
		 */
		EClass PORT_INSTANCE_IN_COMPOSITION = eINSTANCE.getPortInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Context Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_IN_COMPOSITION__CONTEXT_COMPONENT = eINSTANCE.getPortInstanceInComposition_ContextComponent();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_IN_COMPOSITION__PROTOTYPE = eINSTANCE.getPortInstanceInComposition_Prototype();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_IN_COMPOSITION__DATA_ELEMENT = eINSTANCE.getPortInstanceInComposition_DataElement();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_IN_COMPOSITION__OPERATION = eINSTANCE.getPortInstanceInComposition_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl <em>Variable Data Instance In Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInSwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getVariableDataInstanceInSwc()
		 * @generated
		 */
		EClass VARIABLE_DATA_INSTANCE_IN_SWC = eINSTANCE.getVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_SWC__PROTOTYPE = eINSTANCE.getVariableDataInstanceInSwc_Prototype();

		/**
		 * The meta object literal for the '<em><b>Context Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT = eINSTANCE.getVariableDataInstanceInSwc_ContextPort();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE = eINSTANCE.getVariableDataInstanceInSwc_Instance();

		/**
		 * The meta object literal for the '<em><b>Get Target Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME = eINSTANCE.getVariableDataInstanceInSwc__GetTargetShortName();

		/**
		 * The meta object literal for the '<em><b>Is Event Semantics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___IS_EVENT_SEMANTICS = eINSTANCE.getVariableDataInstanceInSwc__IsEventSemantics();

		/**
		 * The meta object literal for the '<em><b>Get Sw Impl Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_IMPL_POLICY = eINSTANCE.getVariableDataInstanceInSwc__GetSwImplPolicy();

		/**
		 * The meta object literal for the '<em><b>Get Base Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_BASE_TYPE = eINSTANCE.getVariableDataInstanceInSwc__GetBaseType();

		/**
		 * The meta object literal for the '<em><b>Get Invalid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALID_VALUE = eINSTANCE.getVariableDataInstanceInSwc__GetInvalidValue();

		/**
		 * The meta object literal for the '<em><b>Get Sw Addr Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ADDR_METHOD = eINSTANCE.getVariableDataInstanceInSwc__GetSwAddrMethod();

		/**
		 * The meta object literal for the '<em><b>Get Sw Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_SW_ALIGNMENT = eINSTANCE.getVariableDataInstanceInSwc__GetSwAlignment();

		/**
		 * The meta object literal for the '<em><b>Get Application Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_APPLICATION_DATA_TYPE = eINSTANCE.getVariableDataInstanceInSwc__GetApplicationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Implementation Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_IMPLEMENTATION_DATA_TYPE = eINSTANCE.getVariableDataInstanceInSwc__GetImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Get Owner Atomic Swc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = eINSTANCE.getVariableDataInstanceInSwc__GetOwnerAtomicSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl <em>Variable Data Instance In Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getVariableDataInstanceInComposition()
		 * @generated
		 */
		EClass VARIABLE_DATA_INSTANCE_IN_COMPOSITION = eINSTANCE.getVariableDataInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE = eINSTANCE.getVariableDataInstanceInComposition_Prototype();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT = eINSTANCE.getVariableDataInstanceInComposition_Parent();

		/**
		 * The meta object literal for the '<em><b>Requester Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION = eINSTANCE.getVariableDataInstanceInComposition_RequesterConnection();

		/**
		 * The meta object literal for the '<em><b>Provider Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION = eINSTANCE.getVariableDataInstanceInComposition_ProviderConnection();

		/**
		 * The meta object literal for the '<em><b>Is Provided</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED = eINSTANCE.getVariableDataInstanceInComposition__IsProvided();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED = eINSTANCE.getVariableDataInstanceInComposition__IsRequired();

		/**
		 * The meta object literal for the '<em><b>Get Target Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME = eINSTANCE.getVariableDataInstanceInComposition__GetTargetShortName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PVariableDataInstanceInSwcImpl <em>PVariable Data Instance In Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.PVariableDataInstanceInSwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getPVariableDataInstanceInSwc()
		 * @generated
		 */
		EClass PVARIABLE_DATA_INSTANCE_IN_SWC = eINSTANCE.getPVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Context PPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PPORT = eINSTANCE.getPVariableDataInstanceInSwc_ContextPPort();

		/**
		 * The meta object literal for the '<em><b>Is Invalidation Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED = eINSTANCE.getPVariableDataInstanceInSwc__IsInvalidationEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Invalidation Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY = eINSTANCE.getPVariableDataInstanceInSwc__GetInvalidationPolicy();

		/**
		 * The meta object literal for the '<em><b>Get Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE = eINSTANCE.getPVariableDataInstanceInSwc__GetInitValue();

		/**
		 * The meta object literal for the '<em><b>Get Com Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC = eINSTANCE.getPVariableDataInstanceInSwc__GetComSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.RVariableDataInstanceInSwcImpl <em>RVariable Data Instance In Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.RVariableDataInstanceInSwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getRVariableDataInstanceInSwc()
		 * @generated
		 */
		EClass RVARIABLE_DATA_INSTANCE_IN_SWC = eINSTANCE.getRVariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Context RPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT = eINSTANCE.getRVariableDataInstanceInSwc_ContextRPort();

		/**
		 * The meta object literal for the '<em><b>Is Filter Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED = eINSTANCE.getRVariableDataInstanceInSwc__IsFilterEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER = eINSTANCE.getRVariableDataInstanceInSwc__GetFilter();

		/**
		 * The meta object literal for the '<em><b>Is Alive Timeout Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED = eINSTANCE.getRVariableDataInstanceInSwc__IsAliveTimeoutEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Invalidation Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED = eINSTANCE.getRVariableDataInstanceInSwc__IsInvalidationEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Invalidation Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY = eINSTANCE.getRVariableDataInstanceInSwc__GetInvalidationPolicy();

		/**
		 * The meta object literal for the '<em><b>Get Init Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE = eINSTANCE.getRVariableDataInstanceInSwc__GetInitValue();

		/**
		 * The meta object literal for the '<em><b>Get Queue Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH = eINSTANCE.getRVariableDataInstanceInSwc__GetQueueLength();

		/**
		 * The meta object literal for the '<em><b>Get Com Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC = eINSTANCE.getRVariableDataInstanceInSwc__GetComSpec();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyDataInstanceConnectorImpl <em>Assembly Data Instance Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyDataInstanceConnectorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getAssemblyDataInstanceConnector()
		 * @generated
		 */
		EClass ASSEMBLY_DATA_INSTANCE_CONNECTOR = eINSTANCE.getAssemblyDataInstanceConnector();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER = eINSTANCE.getAssemblyDataInstanceConnector_Provider();

		/**
		 * The meta object literal for the '<em><b>Requester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER = eINSTANCE.getAssemblyDataInstanceConnector_Requester();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.DelegationDataInstanceConnectorImpl <em>Delegation Data Instance Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.DelegationDataInstanceConnectorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getDelegationDataInstanceConnector()
		 * @generated
		 */
		EClass DELEGATION_DATA_INSTANCE_CONNECTOR = eINSTANCE.getDelegationDataInstanceConnector();

		/**
		 * The meta object literal for the '<em><b>Outer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER = eINSTANCE.getDelegationDataInstanceConnector_Outer();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_DATA_INSTANCE_CONNECTOR__INNER = eINSTANCE.getDelegationDataInstanceConnector_Inner();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInSwcImpl <em>Operation Instance In Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInSwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getOperationInstanceInSwc()
		 * @generated
		 */
		EClass OPERATION_INSTANCE_IN_SWC = eINSTANCE.getOperationInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_SWC__PROTOTYPE = eINSTANCE.getOperationInstanceInSwc_Prototype();

		/**
		 * The meta object literal for the '<em><b>Context Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT = eINSTANCE.getOperationInstanceInSwc_ContextPort();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_SWC__INSTANCE = eINSTANCE.getOperationInstanceInSwc_Instance();

		/**
		 * The meta object literal for the '<em><b>Get Owner Atomic Swc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_INSTANCE_IN_SWC___GET_OWNER_ATOMIC_SWC = eINSTANCE.getOperationInstanceInSwc__GetOwnerAtomicSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.ROperationInstanceInSwcImpl <em>ROperation Instance In Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.ROperationInstanceInSwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getROperationInstanceInSwc()
		 * @generated
		 */
		EClass ROPERATION_INSTANCE_IN_SWC = eINSTANCE.getROperationInstanceInSwc();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.POperationInstanceInSwcImpl <em>POperation Instance In Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.POperationInstanceInSwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getPOperationInstanceInSwc()
		 * @generated
		 */
		EClass POPERATION_INSTANCE_IN_SWC = eINSTANCE.getPOperationInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Operation Invoked Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPERATION_INSTANCE_IN_SWC__OPERATION_INVOKED_EVENT = eINSTANCE.getPOperationInstanceInSwc_OperationInvokedEvent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInCompositionImpl <em>Operation Instance In Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.OperationInstanceInCompositionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getOperationInstanceInComposition()
		 * @generated
		 */
		EClass OPERATION_INSTANCE_IN_COMPOSITION = eINSTANCE.getOperationInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE = eINSTANCE.getOperationInstanceInComposition_Prototype();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_COMPOSITION__PARENT = eINSTANCE.getOperationInstanceInComposition_Parent();

		/**
		 * The meta object literal for the '<em><b>Requester Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION = eINSTANCE.getOperationInstanceInComposition_RequesterConnection();

		/**
		 * The meta object literal for the '<em><b>Provider Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION = eINSTANCE.getOperationInstanceInComposition_ProviderConnection();

		/**
		 * The meta object literal for the '<em><b>Get Target Short Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME = eINSTANCE.getOperationInstanceInComposition__GetTargetShortName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyOperationInstanceConnectorImpl <em>Assembly Operation Instance Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.AssemblyOperationInstanceConnectorImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getAssemblyOperationInstanceConnector()
		 * @generated
		 */
		EClass ASSEMBLY_OPERATION_INSTANCE_CONNECTOR = eINSTANCE.getAssemblyOperationInstanceConnector();

		/**
		 * The meta object literal for the '<em><b>Requester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER = eINSTANCE.getAssemblyOperationInstanceConnector_Requester();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__PROVIDER = eINSTANCE.getAssemblyOperationInstanceConnector_Provider();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject <em>IInstance Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getIInstanceObject()
		 * @generated
		 */
		EClass IINSTANCE_OBJECT = eINSTANCE.getIInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Instance Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IINSTANCE_OBJECT__INSTANCE_ID = eINSTANCE.getIInstanceObject_InstanceId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl <em>Sw Component Instance In System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getSwComponentInstanceInSystem()
		 * @generated
		 */
		EClass SW_COMPONENT_INSTANCE_IN_SYSTEM = eINSTANCE.getSwComponentInstanceInSystem();

		/**
		 * The meta object literal for the '<em><b>Context Root Composition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION = eINSTANCE.getSwComponentInstanceInSystem_ContextRootComposition();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE = eINSTANCE.getSwComponentInstanceInSystem_Prototype();

		/**
		 * The meta object literal for the '<em><b>Owner Partition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION = eINSTANCE.getSwComponentInstanceInSystem_OwnerPartition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getInstanceRoot()
		 * @generated
		 */
		EClass INSTANCE_ROOT = eINSTANCE.getInstanceRoot();

		/**
		 * The meta object literal for the '<em><b>Assembly Data Instance Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR = eINSTANCE.getInstanceRoot_AssemblyDataInstanceConnector();

		/**
		 * The meta object literal for the '<em><b>Delegation Data Instance Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR = eINSTANCE.getInstanceRoot_DelegationDataInstanceConnector();

		/**
		 * The meta object literal for the '<em><b>Sw Component Instance In System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM = eINSTANCE.getInstanceRoot_SwComponentInstanceInSystem();

		/**
		 * The meta object literal for the '<em><b>Port Instance In Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION = eINSTANCE.getInstanceRoot_PortInstanceInComposition();

		/**
		 * The meta object literal for the '<em><b>Variable Data Instance In Swc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC = eINSTANCE.getInstanceRoot_VariableDataInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Operation Instance In Swc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC = eINSTANCE.getInstanceRoot_OperationInstanceInSwc();

		/**
		 * The meta object literal for the '<em><b>Assembly Operation Instance Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR = eINSTANCE.getInstanceRoot_AssemblyOperationInstanceConnector();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceImpl <em>Variable Data Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstancePackageImpl#getVariableDataInstance()
		 * @generated
		 */
		EClass VARIABLE_DATA_INSTANCE = eINSTANCE.getVariableDataInstance();

	}

} //InstancePackage
