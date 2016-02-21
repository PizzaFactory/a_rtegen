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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.*;

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
public class ExFactoryImpl extends EFactoryImpl implements ExFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExFactory init() {
		try {
			ExFactory theExFactory = (ExFactory)EPackage.Registry.INSTANCE.getEFactory(ExPackage.eNS_URI);
			if (theExFactory != null) {
				return theExFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExFactoryImpl() {
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
			case ExPackage.TIME_VALUE_EX: return (EObject)createTimeValueEx();
			case ExPackage.ALIGNMENT_TYPE_EX: return (EObject)createAlignmentTypeEx();
			case ExPackage.ATOMIC_SW_COMPONENT_TYPE_EX: return (EObject)createAtomicSwComponentTypeEx();
			case ExPackage.VALUE_SPECIFICATION_EX: return (EObject)createValueSpecificationEx();
			case ExPackage.NONQUEUED_SENDER_COM_SPEC_EX: return (EObject)createNonqueuedSenderComSpecEx();
			case ExPackage.COMPU_METHOD_EX: return (EObject)createCompuMethodEx();
			case ExPackage.COMPU_SCALE_EX: return (EObject)createCompuScaleEx();
			case ExPackage.APPLICATION_DATA_TYPE_EX: return (EObject)createApplicationDataTypeEx();
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX: return (EObject)createImplementationDataTypeEx();
			case ExPackage.EXCLUSIVE_AREA_EX: return (EObject)createExclusiveAreaEx();
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX: return (EObject)createSenderReceiverToSignalMappingEx();
			case ExPackage.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING_EX: return (EObject)createSenderReceiverToSignalGroupMappingEx();
			case ExPackage.OS_TASK_EX: return (EObject)createOsTaskEx();
			case ExPackage.COM_SIGNAL_EX: return (EObject)createComSignalEx();
			case ExPackage.COM_SIGNAL_GROUP_EX: return (EObject)createComSignalGroupEx();
			case ExPackage.ECUC_PARTITION_EX: return (EObject)createEcucPartitionEx();
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX: return (EObject)createVariableDataPrototypeEx();
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX: return (EObject)createVariableDataInstanceInCompositionEx();
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_SWC_EX: return (EObject)createVariableDataInstanceInSwcEx();
			case ExPackage.PVARIABLE_DATA_INSTANCE_IN_SWC_EX: return (EObject)createPVariableDataInstanceInSwcEx();
			case ExPackage.RVARIABLE_DATA_INSTANCE_IN_SWC_EX: return (EObject)createRVariableDataInstanceInSwcEx();
			case ExPackage.ROPERATION_INSTANCE_IN_SWC_EX: return (EObject)createROperationInstanceInSwcEx();
			case ExPackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR_EX: return (EObject)createAssemblyDataInstanceConnectorEx();
			case ExPackage.RECEIVER_EX: return (EObject)createReceiverEx();
			case ExPackage.EXTERNAL_ECU_SENDER_EX: return (EObject)createExternalEcuSenderEx();
			case ExPackage.ENTITY_STARTER_EX: return (EObject)createEntityStarterEx();
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX: return (EObject)createBswSchedulableEntityEx();
			case ExPackage.MODE_DECLARATION_GROUP_PROTOTYPE_EX: return (EObject)createModeDeclarationGroupPrototypeEx();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueEx createTimeValueEx() {
		TimeValueExImpl timeValueEx = new TimeValueExImpl();
		return timeValueEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentTypeEx createAlignmentTypeEx() {
		AlignmentTypeExImpl alignmentTypeEx = new AlignmentTypeExImpl();
		return alignmentTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverEx createReceiverEx() {
		ReceiverExImpl receiverEx = new ReceiverExImpl();
		return receiverEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuSenderEx createExternalEcuSenderEx() {
		ExternalEcuSenderExImpl externalEcuSenderEx = new ExternalEcuSenderExImpl();
		return externalEcuSenderEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarterEx createEntityStarterEx() {
		EntityStarterExImpl entityStarterEx = new EntityStarterExImpl();
		return entityStarterEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntityEx createBswSchedulableEntityEx() {
		BswSchedulableEntityExImpl bswSchedulableEntityEx = new BswSchedulableEntityExImpl();
		return bswSchedulableEntityEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototypeEx createModeDeclarationGroupPrototypeEx() {
		ModeDeclarationGroupPrototypeExImpl modeDeclarationGroupPrototypeEx = new ModeDeclarationGroupPrototypeExImpl();
		return modeDeclarationGroupPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDataInstanceConnectorEx createAssemblyDataInstanceConnectorEx() {
		AssemblyDataInstanceConnectorExImpl assemblyDataInstanceConnectorEx = new AssemblyDataInstanceConnectorExImpl();
		return assemblyDataInstanceConnectorEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInCompositionEx createVariableDataInstanceInCompositionEx() {
		VariableDataInstanceInCompositionExImpl variableDataInstanceInCompositionEx = new VariableDataInstanceInCompositionExImpl();
		return variableDataInstanceInCompositionEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalEx createComSignalEx() {
		ComSignalExImpl comSignalEx = new ComSignalExImpl();
		return comSignalEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroupEx createComSignalGroupEx() {
		ComSignalGroupExImpl comSignalGroupEx = new ComSignalGroupExImpl();
		return comSignalGroupEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwcEx createVariableDataInstanceInSwcEx() {
		VariableDataInstanceInSwcExImpl variableDataInstanceInSwcEx = new VariableDataInstanceInSwcExImpl();
		return variableDataInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RVariableDataInstanceInSwcEx createRVariableDataInstanceInSwcEx() {
		RVariableDataInstanceInSwcExImpl rVariableDataInstanceInSwcEx = new RVariableDataInstanceInSwcExImpl();
		return rVariableDataInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PVariableDataInstanceInSwcEx createPVariableDataInstanceInSwcEx() {
		PVariableDataInstanceInSwcExImpl pVariableDataInstanceInSwcEx = new PVariableDataInstanceInSwcExImpl();
		return pVariableDataInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROperationInstanceInSwcEx createROperationInstanceInSwcEx() {
		ROperationInstanceInSwcExImpl rOperationInstanceInSwcEx = new ROperationInstanceInSwcExImpl();
		return rOperationInstanceInSwcEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMappingEx createSenderReceiverToSignalMappingEx() {
		SenderReceiverToSignalMappingExImpl senderReceiverToSignalMappingEx = new SenderReceiverToSignalMappingExImpl();
		return senderReceiverToSignalMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalGroupMappingEx createSenderReceiverToSignalGroupMappingEx() {
		SenderReceiverToSignalGroupMappingExImpl senderReceiverToSignalGroupMappingEx = new SenderReceiverToSignalGroupMappingExImpl();
		return senderReceiverToSignalGroupMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskEx createOsTaskEx() {
		OsTaskExImpl osTaskEx = new OsTaskExImpl();
		return osTaskEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartitionEx createEcucPartitionEx() {
		EcucPartitionExImpl ecucPartitionEx = new EcucPartitionExImpl();
		return ecucPartitionEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototypeEx createVariableDataPrototypeEx() {
		VariableDataPrototypeExImpl variableDataPrototypeEx = new VariableDataPrototypeExImpl();
		return variableDataPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSwComponentTypeEx createAtomicSwComponentTypeEx() {
		AtomicSwComponentTypeExImpl atomicSwComponentTypeEx = new AtomicSwComponentTypeExImpl();
		return atomicSwComponentTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationEx createValueSpecificationEx() {
		ValueSpecificationExImpl valueSpecificationEx = new ValueSpecificationExImpl();
		return valueSpecificationEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonqueuedSenderComSpecEx createNonqueuedSenderComSpecEx() {
		NonqueuedSenderComSpecExImpl nonqueuedSenderComSpecEx = new NonqueuedSenderComSpecExImpl();
		return nonqueuedSenderComSpecEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethodEx createCompuMethodEx() {
		CompuMethodExImpl compuMethodEx = new CompuMethodExImpl();
		return compuMethodEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuScaleEx createCompuScaleEx() {
		CompuScaleExImpl compuScaleEx = new CompuScaleExImpl();
		return compuScaleEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataTypeEx createApplicationDataTypeEx() {
		ApplicationDataTypeExImpl applicationDataTypeEx = new ApplicationDataTypeExImpl();
		return applicationDataTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeEx createImplementationDataTypeEx() {
		ImplementationDataTypeExImpl implementationDataTypeEx = new ImplementationDataTypeExImpl();
		return implementationDataTypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveAreaEx createExclusiveAreaEx() {
		ExclusiveAreaExImpl exclusiveAreaEx = new ExclusiveAreaExImpl();
		return exclusiveAreaEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExPackage getExPackage() {
		return (ExPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExPackage getPackage() {
		return ExPackage.eINSTANCE;
	}

} //ExFactoryImpl
