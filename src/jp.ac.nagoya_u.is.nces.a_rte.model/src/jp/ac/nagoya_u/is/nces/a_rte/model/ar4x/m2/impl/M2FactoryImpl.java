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
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ��������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ��������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.*;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class M2FactoryImpl extends EFactoryImpl implements M2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static M2Factory init() {
		try {
			M2Factory theM2Factory = (M2Factory)EPackage.Registry.INSTANCE.getEFactory(M2Package.eNS_URI);
			if (theM2Factory != null) {
				return theM2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new M2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2FactoryImpl() {
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
			case M2Package.M2_ROOT: return (EObject)createM2Root();
			case M2Package.AUTOSAR: return (EObject)createAutosar();
			case M2Package.AR_PACKAGE: return (EObject)createArPackage();
			case M2Package.SW_BASE_TYPE: return (EObject)createSwBaseType();
			case M2Package.SENDER_RECEIVER_INTERFACE: return (EObject)createSenderReceiverInterface();
			case M2Package.VARIABLE_DATA_PROTOTYPE: return (EObject)createVariableDataPrototype();
			case M2Package.APPLICATION_SW_COMPONENT_TYPE: return (EObject)createApplicationSwComponentType();
			case M2Package.RPORT_PROTOTYPE: return (EObject)createRPortPrototype();
			case M2Package.PPORT_PROTOTYPE: return (EObject)createPPortPrototype();
			case M2Package.SWC_INTERNAL_BEHAVIOR: return (EObject)createSwcInternalBehavior();
			case M2Package.RUNNABLE_ENTITY: return (EObject)createRunnableEntity();
			case M2Package.VARIABLE_ACCESS: return (EObject)createVariableAccess();
			case M2Package.AUTOSAR_VARIABLE_REF: return (EObject)createAutosarVariableRef();
			case M2Package.VARIABLE_IN_ATOMIC_SWC_INSTANCE_REF: return (EObject)createVariableInAtomicSwcInstanceRef();
			case M2Package.TIMING_EVENT: return (EObject)createTimingEvent();
			case M2Package.ECUC_MODULE_CONFIGURATION_VALUES: return (EObject)createEcucModuleConfigurationValues();
			case M2Package.ECUC_CONTAINER_VALUE: return (EObject)createEcucContainerValue();
			case M2Package.ECUC_NUMERICAL_PARAM_VALUE: return (EObject)createEcucNumericalParamValue();
			case M2Package.ECUC_TEXTUAL_PARAM_VALUE: return (EObject)createEcucTextualParamValue();
			case M2Package.ECUC_REFERENCE_VALUE: return (EObject)createEcucReferenceValue();
			case M2Package.ECUC_INSTANCE_REFERENCE_VALUE: return (EObject)createEcucInstanceReferenceValue();
			case M2Package.NONQUEUED_SENDER_COM_SPEC: return (EObject)createNonqueuedSenderComSpec();
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC: return (EObject)createNonqueuedReceiverComSpec();
			case M2Package.PORT_INTERFACE: return (EObject)createPortInterface();
			case M2Package.COMPOSITION_SW_COMPONENT_TYPE: return (EObject)createCompositionSwComponentType();
			case M2Package.ASSEMBLY_SW_CONNECTOR: return (EObject)createAssemblySwConnector();
			case M2Package.DELEGATION_SW_CONNECTOR: return (EObject)createDelegationSwConnector();
			case M2Package.RPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF: return (EObject)createRPortPrototypeInCompositionInstanceRef();
			case M2Package.PPORT_PROTOTYPE_IN_COMPOSITION_INSTANCE_REF: return (EObject)createPPortPrototypeInCompositionInstanceRef();
			case M2Package.SW_COMPONENT_PROTOTYPE: return (EObject)createSwComponentPrototype();
			case M2Package.IMPLEMENTATION_DATA_TYPE: return (EObject)createImplementationDataType();
			case M2Package.SW_DATA_DEF_PROPS: return (EObject)createSwDataDefProps();
			case M2Package.DATA_TYPE_MAP: return (EObject)createDataTypeMap();
			case M2Package.DATA_TYPE_MAPPING_SET: return (EObject)createDataTypeMappingSet();
			case M2Package.APPLICATION_PRIMITIVE_DATA_TYPE: return (EObject)createApplicationPrimitiveDataType();
			case M2Package.EXCLUSIVE_AREA: return (EObject)createExclusiveArea();
			case M2Package.NUMERICAL_VALUE_SPECIFICATION: return (EObject)createNumericalValueSpecification();
			case M2Package.TEXT_VALUE_SPECIFICATION: return (EObject)createTextValueSpecification();
			case M2Package.CONSTANT_REFERENCE: return (EObject)createConstantReference();
			case M2Package.REFERENCE_VALUE_SPECIFICATION: return (EObject)createReferenceValueSpecification();
			case M2Package.ARRAY_VALUE_SPECIFICATION: return (EObject)createArrayValueSpecification();
			case M2Package.RECORD_VALUE_SPECIFICATION: return (EObject)createRecordValueSpecification();
			case M2Package.APPLICATION_VALUE_SPECIFICATION: return (EObject)createApplicationValueSpecification();
			case M2Package.CONSTANT_SPECIFICATION: return (EObject)createConstantSpecification();
			case M2Package.OPERATION_INVOKED_EVENT: return (EObject)createOperationInvokedEvent();
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF: return (EObject)createPOperationInAtomicSwcInstanceRef();
			case M2Package.CLIENT_SERVER_INTERFACE: return (EObject)createClientServerInterface();
			case M2Package.CLIENT_SERVER_OPERATION: return (EObject)createClientServerOperation();
			case M2Package.APPLICATION_ERROR: return (EObject)createApplicationError();
			case M2Package.ARGUMENT_DATA_PROTOTYPE: return (EObject)createArgumentDataPrototype();
			case M2Package.DATA_FILTER: return (EObject)createDataFilter();
			case M2Package.QUEUED_RECEIVER_COM_SPEC: return (EObject)createQueuedReceiverComSpec();
			case M2Package.INVALIDATION_POLICY: return (EObject)createInvalidationPolicy();
			case M2Package.PORT_API_OPTION: return (EObject)createPortApiOption();
			case M2Package.PORT_DEFINED_ARGUMENT_VALUE: return (EObject)createPortDefinedArgumentValue();
			case M2Package.INCLUDED_DATA_TYPE_SET: return (EObject)createIncludedDataTypeSet();
			case M2Package.SYSTEM: return (EObject)createSystem();
			case M2Package.ROOT_SW_COMPOSITION_PROTOTYPE: return (EObject)createRootSwCompositionPrototype();
			case M2Package.SYSTEM_MAPPING: return (EObject)createSystemMapping();
			case M2Package.SYSTEM_SIGNAL: return (EObject)createSystemSignal();
			case M2Package.ISIGNAL: return (EObject)createISignal();
			case M2Package.ISIGNAL_IPDU: return (EObject)createISignalIPdu();
			case M2Package.ISIGNAL_TO_IPDU_MAPPING: return (EObject)createISignalToIPduMapping();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_MAPPING: return (EObject)createSenderReceiverToSignalMapping();
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF: return (EObject)createVariableDataPrototypeInSystemInstanceRef();
			case M2Package.ECUC_VALUE_COLLECTION: return (EObject)createEcucValueCollection();
			case M2Package.SYNCHRONOUS_SERVER_CALL_POINT: return (EObject)createSynchronousServerCallPoint();
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF: return (EObject)createROperationInAtomicSwcInstanceRef();
			case M2Package.SW_ADDR_METHOD: return (EObject)createSwAddrMethod();
			case M2Package.COMPU_METHOD: return (EObject)createCompuMethod();
			case M2Package.DATA_CONSTR: return (EObject)createDataConstr();
			case M2Package.DATA_CONSTR_RULE: return (EObject)createDataConstrRule();
			case M2Package.INTERNAL_CONSTRS: return (EObject)createInternalConstrs();
			case M2Package.COMPU: return (EObject)createCompu();
			case M2Package.LIMIT: return (EObject)createLimit();
			case M2Package.COMPU_SCALE: return (EObject)createCompuScale();
			case M2Package.ANY_INSTANCE_REF: return (EObject)createAnyInstanceRef();
			case M2Package.ECU_ABSTRACTION_SW_COMPONENT_TYPE: return (EObject)createEcuAbstractionSwComponentType();
			case M2Package.NV_BLOCK_SW_COMPONENT_TYPE: return (EObject)createNvBlockSwComponentType();
			case M2Package.SENSOR_ACTUATOR_SW_COMPONENT_TYPE: return (EObject)createSensorActuatorSwComponentType();
			case M2Package.COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE: return (EObject)createComplexDeviceDriverSwComponentType();
			case M2Package.SERVICE_PROXY_SW_COMPONENT_TYPE: return (EObject)createServiceProxySwComponentType();
			case M2Package.SERVICE_SW_COMPONENT_TYPE: return (EObject)createServiceSwComponentType();
			case M2Package.PPORT_IN_COMPOSITION_INSTANCE_REF: return (EObject)createPPortInCompositionInstanceRef();
			case M2Package.RPORT_IN_COMPOSITION_INSTANCE_REF: return (EObject)createRPortInCompositionInstanceRef();
			case M2Package.SWC_BSW_RUNNABLE_MAPPING: return (EObject)createSwcBswRunnableMapping();
			case M2Package.SWC_BSW_MAPPING: return (EObject)createSwcBswMapping();
			case M2Package.BSW_INTERNAL_BEHAVIOR: return (EObject)createBswInternalBehavior();
			case M2Package.BSW_IMPLEMENTATION: return (EObject)createBswImplementation();
			case M2Package.BSW_MODULE_DESCRIPTION: return (EObject)createBswModuleDescription();
			case M2Package.BSW_MODULE_ENTRY: return (EObject)createBswModuleEntry();
			case M2Package.BSW_SCHEDULABLE_ENTITY: return (EObject)createBswSchedulableEntity();
			case M2Package.BSW_TIMING_EVENT: return (EObject)createBswTimingEvent();
			case M2Package.BSW_CALLED_ENTITY: return (EObject)createBswCalledEntity();
			case M2Package.BSW_INTERRUPT_ENTITY: return (EObject)createBswInterruptEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case M2Package.ARGUMENT_DIRECTION_ENUM:
				return createArgumentDirectionEnumFromString(eDataType, initialValue);
			case M2Package.DATA_FILTER_TYPE_ENUM:
				return createDataFilterTypeEnumFromString(eDataType, initialValue);
			case M2Package.HANDLE_INVALID_ENUM:
				return createHandleInvalidEnumFromString(eDataType, initialValue);
			case M2Package.SW_IMPL_POLICY_ENUM:
				return createSwImplPolicyEnumFromString(eDataType, initialValue);
			case M2Package.MEMORY_ALLOCATION_KEYWORD_POLICY_TYPE:
				return createMemoryAllocationKeywordPolicyTypeFromString(eDataType, initialValue);
			case M2Package.ECUC_CONFIGURATION_VARIANT_ENUM:
				return createEcucConfigurationVariantEnumFromString(eDataType, initialValue);
			case M2Package.BSW_CALL_TYPE_ENUM:
				return createBswCallTypeEnumFromString(eDataType, initialValue);
			case M2Package.BSW_EXECUTION_CONTEXT_ENUM:
				return createBswExecutionContextEnumFromString(eDataType, initialValue);
			case M2Package.BSW_INTERRUPT_CATEGORY:
				return createBswInterruptCategoryFromString(eDataType, initialValue);
			case M2Package.NUMERICAL:
				return createNumericalFromString(eDataType, initialValue);
			case M2Package.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case M2Package.UNLIMITED_INTEGER:
				return createUnlimitedIntegerFromString(eDataType, initialValue);
			case M2Package.POSITIVE_INTEGER:
				return createPositiveIntegerFromString(eDataType, initialValue);
			case M2Package.TIME_VALUE:
				return createTimeValueFromString(eDataType, initialValue);
			case M2Package.REF:
				return createRefFromString(eDataType, initialValue);
			case M2Package.CIDENTIFIER:
				return createCIdentifierFromString(eDataType, initialValue);
			case M2Package.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case M2Package.VERBATIM_STRING:
				return createVerbatimStringFromString(eDataType, initialValue);
			case M2Package.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case M2Package.NATIVE_DECLARATION_STRING:
				return createNativeDeclarationStringFromString(eDataType, initialValue);
			case M2Package.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case M2Package.SECTION_INITIALIZATION_POLICY_TYPE:
				return createSectionInitializationPolicyTypeFromString(eDataType, initialValue);
			case M2Package.CATEGORY_STRING:
				return createCategoryStringFromString(eDataType, initialValue);
			case M2Package.STRING:
				return createStringFromString(eDataType, initialValue);
			case M2Package.BASE_TYPE_ENCODING_STRING:
				return createBaseTypeEncodingStringFromString(eDataType, initialValue);
			case M2Package.REVISION_LABEL_STRING:
				return createRevisionLabelStringFromString(eDataType, initialValue);
			case M2Package.ALIGNMENT_TYPE:
				return createAlignmentTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case M2Package.ARGUMENT_DIRECTION_ENUM:
				return convertArgumentDirectionEnumToString(eDataType, instanceValue);
			case M2Package.DATA_FILTER_TYPE_ENUM:
				return convertDataFilterTypeEnumToString(eDataType, instanceValue);
			case M2Package.HANDLE_INVALID_ENUM:
				return convertHandleInvalidEnumToString(eDataType, instanceValue);
			case M2Package.SW_IMPL_POLICY_ENUM:
				return convertSwImplPolicyEnumToString(eDataType, instanceValue);
			case M2Package.MEMORY_ALLOCATION_KEYWORD_POLICY_TYPE:
				return convertMemoryAllocationKeywordPolicyTypeToString(eDataType, instanceValue);
			case M2Package.ECUC_CONFIGURATION_VARIANT_ENUM:
				return convertEcucConfigurationVariantEnumToString(eDataType, instanceValue);
			case M2Package.BSW_CALL_TYPE_ENUM:
				return convertBswCallTypeEnumToString(eDataType, instanceValue);
			case M2Package.BSW_EXECUTION_CONTEXT_ENUM:
				return convertBswExecutionContextEnumToString(eDataType, instanceValue);
			case M2Package.BSW_INTERRUPT_CATEGORY:
				return convertBswInterruptCategoryToString(eDataType, instanceValue);
			case M2Package.NUMERICAL:
				return convertNumericalToString(eDataType, instanceValue);
			case M2Package.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case M2Package.UNLIMITED_INTEGER:
				return convertUnlimitedIntegerToString(eDataType, instanceValue);
			case M2Package.POSITIVE_INTEGER:
				return convertPositiveIntegerToString(eDataType, instanceValue);
			case M2Package.TIME_VALUE:
				return convertTimeValueToString(eDataType, instanceValue);
			case M2Package.REF:
				return convertRefToString(eDataType, instanceValue);
			case M2Package.CIDENTIFIER:
				return convertCIdentifierToString(eDataType, instanceValue);
			case M2Package.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case M2Package.VERBATIM_STRING:
				return convertVerbatimStringToString(eDataType, instanceValue);
			case M2Package.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case M2Package.NATIVE_DECLARATION_STRING:
				return convertNativeDeclarationStringToString(eDataType, instanceValue);
			case M2Package.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case M2Package.SECTION_INITIALIZATION_POLICY_TYPE:
				return convertSectionInitializationPolicyTypeToString(eDataType, instanceValue);
			case M2Package.CATEGORY_STRING:
				return convertCategoryStringToString(eDataType, instanceValue);
			case M2Package.STRING:
				return convertStringToString(eDataType, instanceValue);
			case M2Package.BASE_TYPE_ENCODING_STRING:
				return convertBaseTypeEncodingStringToString(eDataType, instanceValue);
			case M2Package.REVISION_LABEL_STRING:
				return convertRevisionLabelStringToString(eDataType, instanceValue);
			case M2Package.ALIGNMENT_TYPE:
				return convertAlignmentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2Root createM2Root() {
		M2RootImpl m2Root = new M2RootImpl();
		return m2Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Autosar createAutosar() {
		AutosarImpl autosar = new AutosarImpl();
		return autosar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArPackage createArPackage() {
		ArPackageImpl arPackage = new ArPackageImpl();
		return arPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwBaseType createSwBaseType() {
		SwBaseTypeImpl swBaseType = new SwBaseTypeImpl();
		return swBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverInterface createSenderReceiverInterface() {
		SenderReceiverInterfaceImpl senderReceiverInterface = new SenderReceiverInterfaceImpl();
		return senderReceiverInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype createVariableDataPrototype() {
		VariableDataPrototypeImpl variableDataPrototype = new VariableDataPrototypeImpl();
		return variableDataPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSwComponentType createApplicationSwComponentType() {
		ApplicationSwComponentTypeImpl applicationSwComponentType = new ApplicationSwComponentTypeImpl();
		return applicationSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototype createRPortPrototype() {
		RPortPrototypeImpl rPortPrototype = new RPortPrototypeImpl();
		return rPortPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortPrototype createPPortPrototype() {
		PPortPrototypeImpl pPortPrototype = new PPortPrototypeImpl();
		return pPortPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior createSwcInternalBehavior() {
		SwcInternalBehaviorImpl swcInternalBehavior = new SwcInternalBehaviorImpl();
		return swcInternalBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntity createRunnableEntity() {
		RunnableEntityImpl runnableEntity = new RunnableEntityImpl();
		return runnableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAccess createVariableAccess() {
		VariableAccessImpl variableAccess = new VariableAccessImpl();
		return variableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutosarVariableRef createAutosarVariableRef() {
		AutosarVariableRefImpl autosarVariableRef = new AutosarVariableRefImpl();
		return autosarVariableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInAtomicSwcInstanceRef createVariableInAtomicSwcInstanceRef() {
		VariableInAtomicSwcInstanceRefImpl variableInAtomicSwcInstanceRef = new VariableInAtomicSwcInstanceRefImpl();
		return variableInAtomicSwcInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingEvent createTimingEvent() {
		TimingEventImpl timingEvent = new TimingEventImpl();
		return timingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucModuleConfigurationValues createEcucModuleConfigurationValues() {
		EcucModuleConfigurationValuesImpl ecucModuleConfigurationValues = new EcucModuleConfigurationValuesImpl();
		return ecucModuleConfigurationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucContainerValue createEcucContainerValue() {
		EcucContainerValueImpl ecucContainerValue = new EcucContainerValueImpl();
		return ecucContainerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucNumericalParamValue createEcucNumericalParamValue() {
		EcucNumericalParamValueImpl ecucNumericalParamValue = new EcucNumericalParamValueImpl();
		return ecucNumericalParamValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucTextualParamValue createEcucTextualParamValue() {
		EcucTextualParamValueImpl ecucTextualParamValue = new EcucTextualParamValueImpl();
		return ecucTextualParamValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucReferenceValue createEcucReferenceValue() {
		EcucReferenceValueImpl ecucReferenceValue = new EcucReferenceValueImpl();
		return ecucReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucInstanceReferenceValue createEcucInstanceReferenceValue() {
		EcucInstanceReferenceValueImpl ecucInstanceReferenceValue = new EcucInstanceReferenceValueImpl();
		return ecucInstanceReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonqueuedSenderComSpec createNonqueuedSenderComSpec() {
		NonqueuedSenderComSpecImpl nonqueuedSenderComSpec = new NonqueuedSenderComSpecImpl();
		return nonqueuedSenderComSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonqueuedReceiverComSpec createNonqueuedReceiverComSpec() {
		NonqueuedReceiverComSpecImpl nonqueuedReceiverComSpec = new NonqueuedReceiverComSpecImpl();
		return nonqueuedReceiverComSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInterface createPortInterface() {
		PortInterfaceImpl portInterface = new PortInterfaceImpl();
		return portInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSwComponentType createCompositionSwComponentType() {
		CompositionSwComponentTypeImpl compositionSwComponentType = new CompositionSwComponentTypeImpl();
		return compositionSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblySwConnector createAssemblySwConnector() {
		AssemblySwConnectorImpl assemblySwConnector = new AssemblySwConnectorImpl();
		return assemblySwConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationSwConnector createDelegationSwConnector() {
		DelegationSwConnectorImpl delegationSwConnector = new DelegationSwConnectorImpl();
		return delegationSwConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototypeInCompositionInstanceRef createRPortPrototypeInCompositionInstanceRef() {
		RPortPrototypeInCompositionInstanceRefImpl rPortPrototypeInCompositionInstanceRef = new RPortPrototypeInCompositionInstanceRefImpl();
		return rPortPrototypeInCompositionInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortPrototypeInCompositionInstanceRef createPPortPrototypeInCompositionInstanceRef() {
		PPortPrototypeInCompositionInstanceRefImpl pPortPrototypeInCompositionInstanceRef = new PPortPrototypeInCompositionInstanceRefImpl();
		return pPortPrototypeInCompositionInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype createSwComponentPrototype() {
		SwComponentPrototypeImpl swComponentPrototype = new SwComponentPrototypeImpl();
		return swComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType createImplementationDataType() {
		ImplementationDataTypeImpl implementationDataType = new ImplementationDataTypeImpl();
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwDataDefProps createSwDataDefProps() {
		SwDataDefPropsImpl swDataDefProps = new SwDataDefPropsImpl();
		return swDataDefProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeMap createDataTypeMap() {
		DataTypeMapImpl dataTypeMap = new DataTypeMapImpl();
		return dataTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeMappingSet createDataTypeMappingSet() {
		DataTypeMappingSetImpl dataTypeMappingSet = new DataTypeMappingSetImpl();
		return dataTypeMappingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPrimitiveDataType createApplicationPrimitiveDataType() {
		ApplicationPrimitiveDataTypeImpl applicationPrimitiveDataType = new ApplicationPrimitiveDataTypeImpl();
		return applicationPrimitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea createExclusiveArea() {
		ExclusiveAreaImpl exclusiveArea = new ExclusiveAreaImpl();
		return exclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalValueSpecification createNumericalValueSpecification() {
		NumericalValueSpecificationImpl numericalValueSpecification = new NumericalValueSpecificationImpl();
		return numericalValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextValueSpecification createTextValueSpecification() {
		TextValueSpecificationImpl textValueSpecification = new TextValueSpecificationImpl();
		return textValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantReference createConstantReference() {
		ConstantReferenceImpl constantReference = new ConstantReferenceImpl();
		return constantReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceValueSpecification createReferenceValueSpecification() {
		ReferenceValueSpecificationImpl referenceValueSpecification = new ReferenceValueSpecificationImpl();
		return referenceValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValueSpecification createArrayValueSpecification() {
		ArrayValueSpecificationImpl arrayValueSpecification = new ArrayValueSpecificationImpl();
		return arrayValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordValueSpecification createRecordValueSpecification() {
		RecordValueSpecificationImpl recordValueSpecification = new RecordValueSpecificationImpl();
		return recordValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationValueSpecification createApplicationValueSpecification() {
		ApplicationValueSpecificationImpl applicationValueSpecification = new ApplicationValueSpecificationImpl();
		return applicationValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantSpecification createConstantSpecification() {
		ConstantSpecificationImpl constantSpecification = new ConstantSpecificationImpl();
		return constantSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInvokedEvent createOperationInvokedEvent() {
		OperationInvokedEventImpl operationInvokedEvent = new OperationInvokedEventImpl();
		return operationInvokedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POperationInAtomicSwcInstanceRef createPOperationInAtomicSwcInstanceRef() {
		POperationInAtomicSwcInstanceRefImpl pOperationInAtomicSwcInstanceRef = new POperationInAtomicSwcInstanceRefImpl();
		return pOperationInAtomicSwcInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerInterface createClientServerInterface() {
		ClientServerInterfaceImpl clientServerInterface = new ClientServerInterfaceImpl();
		return clientServerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerOperation createClientServerOperation() {
		ClientServerOperationImpl clientServerOperation = new ClientServerOperationImpl();
		return clientServerOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationError createApplicationError() {
		ApplicationErrorImpl applicationError = new ApplicationErrorImpl();
		return applicationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentDataPrototype createArgumentDataPrototype() {
		ArgumentDataPrototypeImpl argumentDataPrototype = new ArgumentDataPrototypeImpl();
		return argumentDataPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFilter createDataFilter() {
		DataFilterImpl dataFilter = new DataFilterImpl();
		return dataFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuedReceiverComSpec createQueuedReceiverComSpec() {
		QueuedReceiverComSpecImpl queuedReceiverComSpec = new QueuedReceiverComSpecImpl();
		return queuedReceiverComSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidationPolicy createInvalidationPolicy() {
		InvalidationPolicyImpl invalidationPolicy = new InvalidationPolicyImpl();
		return invalidationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortApiOption createPortApiOption() {
		PortApiOptionImpl portApiOption = new PortApiOptionImpl();
		return portApiOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinedArgumentValue createPortDefinedArgumentValue() {
		PortDefinedArgumentValueImpl portDefinedArgumentValue = new PortDefinedArgumentValueImpl();
		return portDefinedArgumentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedDataTypeSet createIncludedDataTypeSet() {
		IncludedDataTypeSetImpl includedDataTypeSet = new IncludedDataTypeSetImpl();
		return includedDataTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootSwCompositionPrototype createRootSwCompositionPrototype() {
		RootSwCompositionPrototypeImpl rootSwCompositionPrototype = new RootSwCompositionPrototypeImpl();
		return rootSwCompositionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMapping createSystemMapping() {
		SystemMappingImpl systemMapping = new SystemMappingImpl();
		return systemMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignal createSystemSignal() {
		SystemSignalImpl systemSignal = new SystemSignalImpl();
		return systemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignal createISignal() {
		ISignalImpl iSignal = new ISignalImpl();
		return iSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalIPdu createISignalIPdu() {
		ISignalIPduImpl iSignalIPdu = new ISignalIPduImpl();
		return iSignalIPdu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping createISignalToIPduMapping() {
		ISignalToIPduMappingImpl iSignalToIPduMapping = new ISignalToIPduMappingImpl();
		return iSignalToIPduMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMapping createSenderReceiverToSignalMapping() {
		SenderReceiverToSignalMappingImpl senderReceiverToSignalMapping = new SenderReceiverToSignalMappingImpl();
		return senderReceiverToSignalMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototypeInSystemInstanceRef createVariableDataPrototypeInSystemInstanceRef() {
		VariableDataPrototypeInSystemInstanceRefImpl variableDataPrototypeInSystemInstanceRef = new VariableDataPrototypeInSystemInstanceRefImpl();
		return variableDataPrototypeInSystemInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucValueCollection createEcucValueCollection() {
		EcucValueCollectionImpl ecucValueCollection = new EcucValueCollectionImpl();
		return ecucValueCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousServerCallPoint createSynchronousServerCallPoint() {
		SynchronousServerCallPointImpl synchronousServerCallPoint = new SynchronousServerCallPointImpl();
		return synchronousServerCallPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROperationInAtomicSwcInstanceRef createROperationInAtomicSwcInstanceRef() {
		ROperationInAtomicSwcInstanceRefImpl rOperationInAtomicSwcInstanceRef = new ROperationInAtomicSwcInstanceRefImpl();
		return rOperationInAtomicSwcInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod createSwAddrMethod() {
		SwAddrMethodImpl swAddrMethod = new SwAddrMethodImpl();
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod createCompuMethod() {
		CompuMethodImpl compuMethod = new CompuMethodImpl();
		return compuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr createDataConstr() {
		DataConstrImpl dataConstr = new DataConstrImpl();
		return dataConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstrRule createDataConstrRule() {
		DataConstrRuleImpl dataConstrRule = new DataConstrRuleImpl();
		return dataConstrRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConstrs createInternalConstrs() {
		InternalConstrsImpl internalConstrs = new InternalConstrsImpl();
		return internalConstrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compu createCompu() {
		CompuImpl compu = new CompuImpl();
		return compu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuScale createCompuScale() {
		CompuScaleImpl compuScale = new CompuScaleImpl();
		return compuScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyInstanceRef createAnyInstanceRef() {
		AnyInstanceRefImpl anyInstanceRef = new AnyInstanceRefImpl();
		return anyInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcuAbstractionSwComponentType createEcuAbstractionSwComponentType() {
		EcuAbstractionSwComponentTypeImpl ecuAbstractionSwComponentType = new EcuAbstractionSwComponentTypeImpl();
		return ecuAbstractionSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NvBlockSwComponentType createNvBlockSwComponentType() {
		NvBlockSwComponentTypeImpl nvBlockSwComponentType = new NvBlockSwComponentTypeImpl();
		return nvBlockSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorActuatorSwComponentType createSensorActuatorSwComponentType() {
		SensorActuatorSwComponentTypeImpl sensorActuatorSwComponentType = new SensorActuatorSwComponentTypeImpl();
		return sensorActuatorSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexDeviceDriverSwComponentType createComplexDeviceDriverSwComponentType() {
		ComplexDeviceDriverSwComponentTypeImpl complexDeviceDriverSwComponentType = new ComplexDeviceDriverSwComponentTypeImpl();
		return complexDeviceDriverSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProxySwComponentType createServiceProxySwComponentType() {
		ServiceProxySwComponentTypeImpl serviceProxySwComponentType = new ServiceProxySwComponentTypeImpl();
		return serviceProxySwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSwComponentType createServiceSwComponentType() {
		ServiceSwComponentTypeImpl serviceSwComponentType = new ServiceSwComponentTypeImpl();
		return serviceSwComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortInCompositionInstanceRef createPPortInCompositionInstanceRef() {
		PPortInCompositionInstanceRefImpl pPortInCompositionInstanceRef = new PPortInCompositionInstanceRefImpl();
		return pPortInCompositionInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortInCompositionInstanceRef createRPortInCompositionInstanceRef() {
		RPortInCompositionInstanceRefImpl rPortInCompositionInstanceRef = new RPortInCompositionInstanceRefImpl();
		return rPortInCompositionInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcBswRunnableMapping createSwcBswRunnableMapping() {
		SwcBswRunnableMappingImpl swcBswRunnableMapping = new SwcBswRunnableMappingImpl();
		return swcBswRunnableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcBswMapping createSwcBswMapping() {
		SwcBswMappingImpl swcBswMapping = new SwcBswMappingImpl();
		return swcBswMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior createBswInternalBehavior() {
		BswInternalBehaviorImpl bswInternalBehavior = new BswInternalBehaviorImpl();
		return bswInternalBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswImplementation createBswImplementation() {
		BswImplementationImpl bswImplementation = new BswImplementationImpl();
		return bswImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleDescription createBswModuleDescription() {
		BswModuleDescriptionImpl bswModuleDescription = new BswModuleDescriptionImpl();
		return bswModuleDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleEntry createBswModuleEntry() {
		BswModuleEntryImpl bswModuleEntry = new BswModuleEntryImpl();
		return bswModuleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntity createBswSchedulableEntity() {
		BswSchedulableEntityImpl bswSchedulableEntity = new BswSchedulableEntityImpl();
		return bswSchedulableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswTimingEvent createBswTimingEvent() {
		BswTimingEventImpl bswTimingEvent = new BswTimingEventImpl();
		return bswTimingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswCalledEntity createBswCalledEntity() {
		BswCalledEntityImpl bswCalledEntity = new BswCalledEntityImpl();
		return bswCalledEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInterruptEntity createBswInterruptEntity() {
		BswInterruptEntityImpl bswInterruptEntity = new BswInterruptEntityImpl();
		return bswInterruptEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentDirectionEnum createArgumentDirectionEnumFromString(EDataType eDataType, String initialValue) {
		ArgumentDirectionEnum result = ArgumentDirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArgumentDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFilterTypeEnum createDataFilterTypeEnumFromString(EDataType eDataType, String initialValue) {
		DataFilterTypeEnum result = DataFilterTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataFilterTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleInvalidEnum createHandleInvalidEnumFromString(EDataType eDataType, String initialValue) {
		HandleInvalidEnum result = HandleInvalidEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandleInvalidEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwImplPolicyEnum createSwImplPolicyEnumFromString(EDataType eDataType, String initialValue) {
		SwImplPolicyEnum result = SwImplPolicyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwImplPolicyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAllocationKeywordPolicyType createMemoryAllocationKeywordPolicyTypeFromString(EDataType eDataType, String initialValue) {
		MemoryAllocationKeywordPolicyType result = MemoryAllocationKeywordPolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryAllocationKeywordPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucConfigurationVariantEnum createEcucConfigurationVariantEnumFromString(EDataType eDataType, String initialValue) {
		EcucConfigurationVariantEnum result = EcucConfigurationVariantEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEcucConfigurationVariantEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswCallTypeEnum createBswCallTypeEnumFromString(EDataType eDataType, String initialValue) {
		BswCallTypeEnum result = BswCallTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBswCallTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswExecutionContextEnum createBswExecutionContextEnumFromString(EDataType eDataType, String initialValue) {
		BswExecutionContextEnum result = BswExecutionContextEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBswExecutionContextEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInterruptCategory createBswInterruptCategoryFromString(EDataType eDataType, String initialValue) {
		BswInterruptCategory result = BswInterruptCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBswInterruptCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createNumericalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnlimitedIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTimeValueFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeValueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerbatimStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerbatimStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFloatFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNativeDeclarationStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNativeDeclarationStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSectionInitializationPolicyTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSectionInitializationPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCategoryStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBaseTypeEncodingStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseTypeEncodingStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRevisionLabelStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionLabelStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2Package getM2Package() {
		return (M2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static M2Package getPackage() {
		return M2Package.eINSTANCE;
	}

} //M2FactoryImpl