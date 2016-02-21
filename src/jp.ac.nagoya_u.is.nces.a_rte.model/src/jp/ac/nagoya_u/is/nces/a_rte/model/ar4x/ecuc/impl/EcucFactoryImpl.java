/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.*;

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
public class EcucFactoryImpl extends EFactoryImpl implements EcucFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucFactory init() {
		try {
			EcucFactory theEcucFactory = (EcucFactory)EPackage.Registry.INSTANCE.getEFactory(EcucPackage.eNS_URI);
			if (theEcucFactory != null) {
				return theEcucFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcucFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucFactoryImpl() {
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
			case EcucPackage.RTE: return (EObject)createRte();
			case EcucPackage.RTE_GENERATION: return (EObject)createRteGeneration();
			case EcucPackage.RTE_BSW_GENERAL: return (EObject)createRteBswGeneral();
			case EcucPackage.ECUC_ROOT: return (EObject)createEcucRoot();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE: return (EObject)createRteSwComponentInstance();
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING: return (EObject)createRteEventToTaskMapping();
			case EcucPackage.OS: return (EObject)createOs();
			case EcucPackage.OS_TASK: return (EObject)createOsTask();
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION: return (EObject)createRteExclusiveAreaImplementation();
			case EcucPackage.OS_EVENT: return (EObject)createOsEvent();
			case EcucPackage.COM: return (EObject)createCom();
			case EcucPackage.COM_CONFIG: return (EObject)createComConfig();
			case EcucPackage.COM_SIGNAL: return (EObject)createComSignal();
			case EcucPackage.COM_SIGNAL_GROUP: return (EObject)createComSignalGroup();
			case EcucPackage.COM_GROUP_SIGNAL: return (EObject)createComGroupSignal();
			case EcucPackage.OS_ALARM: return (EObject)createOsAlarm();
			case EcucPackage.OS_RESOURCE: return (EObject)createOsResource();
			case EcucPackage.OS_APPLICATION: return (EObject)createOsApplication();
			case EcucPackage.ECU_C: return (EObject)createEcuC();
			case EcucPackage.ECUC_PARTITION_COLLECTION: return (EObject)createEcucPartitionCollection();
			case EcucPackage.ECUC_PARTITION: return (EObject)createEcucPartition();
			case EcucPackage.OS_SPINLOCK: return (EObject)createOsSpinlock();
			case EcucPackage.RTE_OS_INTERACTION: return (EObject)createRteOsInteraction();
			case EcucPackage.RTE_USED_OS_ACTIVATION: return (EObject)createRteUsedOsActivation();
			case EcucPackage.RTE_INITIALIZATION_BEHAVIOR: return (EObject)createRteInitializationBehavior();
			case EcucPackage.OS_IOC: return (EObject)createOsIoc();
			case EcucPackage.OS_IOC_COMMUNICATION: return (EObject)createOsIocCommunication();
			case EcucPackage.OS_IOC_SENDER_PROPERTIES: return (EObject)createOsIocSenderProperties();
			case EcucPackage.OS_IOC_RECEIVER_PROPERTIES: return (EObject)createOsIocReceiverProperties();
			case EcucPackage.OS_IOC_DATA_PROPERTIES: return (EObject)createOsIocDataProperties();
			case EcucPackage.OS_APPLICATION_TRUSTED_FUNCTION: return (EObject)createOsApplicationTrustedFunction();
			case EcucPackage.OS_OS: return (EObject)createOsOS();
			case EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING: return (EObject)createRteBswEventToTaskMapping();
			case EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION: return (EObject)createRteBswRequiredModeGroupConnection();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE: return (EObject)createRteBswModuleInstance();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL: return (EObject)createRteBswExclusiveAreaImpl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case EcucPackage.OS_TASK_SCHEDULE_ENUM:
				return createOsTaskScheduleEnumFromString(eDataType, initialValue);
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM:
				return createRteExclusiveAreaImplMechanismEnumFromString(eDataType, initialValue);
			case EcucPackage.COM_TRANSFER_PROPERTY_ENUM:
				return createComTransferPropertyEnumFromString(eDataType, initialValue);
			case EcucPackage.OS_SPINLOCK_LOCK_METHOD_ENUM:
				return createOsSpinlockLockMethodEnumFromString(eDataType, initialValue);
			case EcucPackage.RTE_INITIALIZATION_STRATEGY_ENUM:
				return createRteInitializationStrategyEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case EcucPackage.OS_TASK_SCHEDULE_ENUM:
				return convertOsTaskScheduleEnumToString(eDataType, instanceValue);
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_ENUM:
				return convertRteExclusiveAreaImplMechanismEnumToString(eDataType, instanceValue);
			case EcucPackage.COM_TRANSFER_PROPERTY_ENUM:
				return convertComTransferPropertyEnumToString(eDataType, instanceValue);
			case EcucPackage.OS_SPINLOCK_LOCK_METHOD_ENUM:
				return convertOsSpinlockLockMethodEnumToString(eDataType, instanceValue);
			case EcucPackage.RTE_INITIALIZATION_STRATEGY_ENUM:
				return convertRteInitializationStrategyEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rte createRte() {
		RteImpl rte = new RteImpl();
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteGeneration createRteGeneration() {
		RteGenerationImpl rteGeneration = new RteGenerationImpl();
		return rteGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswGeneral createRteBswGeneral() {
		RteBswGeneralImpl rteBswGeneral = new RteBswGeneralImpl();
		return rteBswGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucRoot createEcucRoot() {
		EcucRootImpl ecucRoot = new EcucRootImpl();
		return ecucRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSwComponentInstance createRteSwComponentInstance() {
		RteSwComponentInstanceImpl rteSwComponentInstance = new RteSwComponentInstanceImpl();
		return rteSwComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEventToTaskMapping createRteEventToTaskMapping() {
		RteEventToTaskMappingImpl rteEventToTaskMapping = new RteEventToTaskMappingImpl();
		return rteEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os createOs() {
		OsImpl os = new OsImpl();
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTask createOsTask() {
		OsTaskImpl osTask = new OsTaskImpl();
		return osTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExclusiveAreaImplementation createRteExclusiveAreaImplementation() {
		RteExclusiveAreaImplementationImpl rteExclusiveAreaImplementation = new RteExclusiveAreaImplementationImpl();
		return rteExclusiveAreaImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent createOsEvent() {
		OsEventImpl osEvent = new OsEventImpl();
		return osEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Com createCom() {
		ComImpl com = new ComImpl();
		return com;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComConfig createComConfig() {
		ComConfigImpl comConfig = new ComConfigImpl();
		return comConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal createComSignal() {
		ComSignalImpl comSignal = new ComSignalImpl();
		return comSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup createComSignalGroup() {
		ComSignalGroupImpl comSignalGroup = new ComSignalGroupImpl();
		return comSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComGroupSignal createComGroupSignal() {
		ComGroupSignalImpl comGroupSignal = new ComGroupSignalImpl();
		return comGroupSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAlarm createOsAlarm() {
		OsAlarmImpl osAlarm = new OsAlarmImpl();
		return osAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource createOsResource() {
		OsResourceImpl osResource = new OsResourceImpl();
		return osResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplication createOsApplication() {
		OsApplicationImpl osApplication = new OsApplicationImpl();
		return osApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcuC createEcuC() {
		EcuCImpl ecuC = new EcuCImpl();
		return ecuC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartitionCollection createEcucPartitionCollection() {
		EcucPartitionCollectionImpl ecucPartitionCollection = new EcucPartitionCollectionImpl();
		return ecucPartitionCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition createEcucPartition() {
		EcucPartitionImpl ecucPartition = new EcucPartitionImpl();
		return ecucPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock createOsSpinlock() {
		OsSpinlockImpl osSpinlock = new OsSpinlockImpl();
		return osSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteOsInteraction createRteOsInteraction() {
		RteOsInteractionImpl rteOsInteraction = new RteOsInteractionImpl();
		return rteOsInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivation createRteUsedOsActivation() {
		RteUsedOsActivationImpl rteUsedOsActivation = new RteUsedOsActivationImpl();
		return rteUsedOsActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationBehavior createRteInitializationBehavior() {
		RteInitializationBehaviorImpl rteInitializationBehavior = new RteInitializationBehaviorImpl();
		return rteInitializationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIoc createOsIoc() {
		OsIocImpl osIoc = new OsIocImpl();
		return osIoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication createOsIocCommunication() {
		OsIocCommunicationImpl osIocCommunication = new OsIocCommunicationImpl();
		return osIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocSenderProperties createOsIocSenderProperties() {
		OsIocSenderPropertiesImpl osIocSenderProperties = new OsIocSenderPropertiesImpl();
		return osIocSenderProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocReceiverProperties createOsIocReceiverProperties() {
		OsIocReceiverPropertiesImpl osIocReceiverProperties = new OsIocReceiverPropertiesImpl();
		return osIocReceiverProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocDataProperties createOsIocDataProperties() {
		OsIocDataPropertiesImpl osIocDataProperties = new OsIocDataPropertiesImpl();
		return osIocDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplicationTrustedFunction createOsApplicationTrustedFunction() {
		OsApplicationTrustedFunctionImpl osApplicationTrustedFunction = new OsApplicationTrustedFunctionImpl();
		return osApplicationTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsOS createOsOS() {
		OsOSImpl osOS = new OsOSImpl();
		return osOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswEventToTaskMapping createRteBswEventToTaskMapping() {
		RteBswEventToTaskMappingImpl rteBswEventToTaskMapping = new RteBswEventToTaskMappingImpl();
		return rteBswEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswRequiredModeGroupConnection createRteBswRequiredModeGroupConnection() {
		RteBswRequiredModeGroupConnectionImpl rteBswRequiredModeGroupConnection = new RteBswRequiredModeGroupConnectionImpl();
		return rteBswRequiredModeGroupConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswModuleInstance createRteBswModuleInstance() {
		RteBswModuleInstanceImpl rteBswModuleInstance = new RteBswModuleInstanceImpl();
		return rteBswModuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswExclusiveAreaImpl createRteBswExclusiveAreaImpl() {
		RteBswExclusiveAreaImplImpl rteBswExclusiveAreaImpl = new RteBswExclusiveAreaImplImpl();
		return rteBswExclusiveAreaImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskScheduleEnum createOsTaskScheduleEnumFromString(EDataType eDataType, String initialValue) {
		OsTaskScheduleEnum result = OsTaskScheduleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsTaskScheduleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExclusiveAreaImplMechanismEnum createRteExclusiveAreaImplMechanismEnumFromString(EDataType eDataType, String initialValue) {
		RteExclusiveAreaImplMechanismEnum result = RteExclusiveAreaImplMechanismEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRteExclusiveAreaImplMechanismEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransferPropertyEnum createComTransferPropertyEnumFromString(EDataType eDataType, String initialValue) {
		ComTransferPropertyEnum result = ComTransferPropertyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComTransferPropertyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlockLockMethodEnum createOsSpinlockLockMethodEnumFromString(EDataType eDataType, String initialValue) {
		OsSpinlockLockMethodEnum result = OsSpinlockLockMethodEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsSpinlockLockMethodEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum createRteInitializationStrategyEnumFromString(EDataType eDataType, String initialValue) {
		RteInitializationStrategyEnum result = RteInitializationStrategyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRteInitializationStrategyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPackage getEcucPackage() {
		return (EcucPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcucPackage getPackage() {
		return EcucPackage.eINSTANCE;
	}

} //EcucFactoryImpl
