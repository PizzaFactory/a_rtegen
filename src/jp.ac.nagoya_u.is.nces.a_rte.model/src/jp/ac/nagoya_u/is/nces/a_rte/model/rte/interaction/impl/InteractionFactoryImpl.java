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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.*;

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
public class InteractionFactoryImpl extends EFactoryImpl implements InteractionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionFactory init() {
		try {
			InteractionFactory theInteractionFactory = (InteractionFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionPackage.eNS_URI);
			if (theInteractionFactory != null) {
				return theInteractionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFactoryImpl() {
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
			case InteractionPackage.INTERACTION_OBJECT: return (EObject)createInteractionObject();
			case InteractionPackage.INTERACTION_REFERRABLE: return (EObject)createInteractionReferrable();
			case InteractionPackage.INTERNAL_ECU_SENDER: return (EObject)createInternalEcuSender();
			case InteractionPackage.EXTERNAL_ECU_SENDER: return (EObject)createExternalEcuSender();
			case InteractionPackage.SEND_INTERACTION: return (EObject)createSendInteraction();
			case InteractionPackage.RECEIVE_INTERACTION: return (EObject)createReceiveInteraction();
			case InteractionPackage.RECEIVER: return (EObject)createReceiver();
			case InteractionPackage.INTERNAL_ECU_RECEIVER: return (EObject)createInternalEcuReceiver();
			case InteractionPackage.RTE_VALUE_BUFFER_IMPLEMENTATION: return (EObject)createRteValueBufferImplementation();
			case InteractionPackage.EXTERNAL_ECU_RECEIVER: return (EObject)createExternalEcuReceiver();
			case InteractionPackage.RTE_SEND_IMPLEMENTATION: return (EObject)createRteSendImplementation();
			case InteractionPackage.IOC_SEND_IMPLEMENTATION: return (EObject)createIocSendImplementation();
			case InteractionPackage.DIRECT_COM_SEND_IMPLEMENTATION: return (EObject)createDirectComSendImplementation();
			case InteractionPackage.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION: return (EObject)createTrustedFunctionComSendImplementation();
			case InteractionPackage.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION: return (EObject)createPeriodicProxyComSendImplementation();
			case InteractionPackage.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION: return (EObject)createImmediateProxyComSendImplementation();
			case InteractionPackage.FILTER_BUFFER_IMPLEMENTATION: return (EObject)createFilterBufferImplementation();
			case InteractionPackage.IOC_VALUE_BUFFER_IMPLEMENTATION: return (EObject)createIocValueBufferImplementation();
			case InteractionPackage.COM_VALUE_BUFFER_IMPLEMENTATION: return (EObject)createComValueBufferImplementation();
			case InteractionPackage.INTERACTION_ROOT: return (EObject)createInteractionRoot();
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION: return (EObject)createTrustedFunctionRteSendImplementation();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION: return (EObject)createComSendProxyInteraction();
			case InteractionPackage.PERIODIC_COM_SEND_PROXY: return (EObject)createPeriodicComSendProxy();
			case InteractionPackage.IMMEDIATE_COM_SEND_PROXY: return (EObject)createImmediateComSendProxy();
			case InteractionPackage.OS_TASK_ACTIVATE_ENTITY_STARTER: return (EObject)createOsTaskActivateEntityStarter();
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER: return (EObject)createOsEventSetEntityStarter();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION: return (EObject)createTimingTriggeringEntityStartImplementation();
			case InteractionPackage.MODE_SWITCH_TRIGGERING_ENTITY_START_IMPLEMENTATION: return (EObject)createModeSwitchTriggeringEntityStartImplementation();
			case InteractionPackage.RUNNABLE_ENTITY_START_INTERACTION: return (EObject)createRunnableEntityStartInteraction();
			case InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION: return (EObject)createStartOffsetCounterImplementation();
			case InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION: return (EObject)createCycleCounterImplementation();
			case InteractionPackage.GENERATED_ECU_CONFIGURATION: return (EObject)createGeneratedEcuConfiguration();
			case InteractionPackage.BSW_SCHEDULABLE_ENTITY_START_INTERACTION: return (EObject)createBswSchedulableEntityStartInteraction();
			case InteractionPackage.EVENT_TO_TASK_MAPPING: return (EObject)createEventToTaskMapping();
			case InteractionPackage.EVENT: return (EObject)createEvent();
			case InteractionPackage.TIMING_EVENT: return (EObject)createTimingEvent();
			case InteractionPackage.MODE_SWITCH_EVENT: return (EObject)createModeSwitchEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionObject createInteractionObject() {
		InteractionObjectImpl interactionObject = new InteractionObjectImpl();
		return interactionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionReferrable createInteractionReferrable() {
		InteractionReferrableImpl interactionReferrable = new InteractionReferrableImpl();
		return interactionReferrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEcuSender createInternalEcuSender() {
		InternalEcuSenderImpl internalEcuSender = new InternalEcuSenderImpl();
		return internalEcuSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuSender createExternalEcuSender() {
		ExternalEcuSenderImpl externalEcuSender = new ExternalEcuSenderImpl();
		return externalEcuSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteraction createSendInteraction() {
		SendInteractionImpl sendInteraction = new SendInteractionImpl();
		return sendInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteraction createReceiveInteraction() {
		ReceiveInteractionImpl receiveInteraction = new ReceiveInteractionImpl();
		return receiveInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEcuReceiver createInternalEcuReceiver() {
		InternalEcuReceiverImpl internalEcuReceiver = new InternalEcuReceiverImpl();
		return internalEcuReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteValueBufferImplementation createRteValueBufferImplementation() {
		RteValueBufferImplementationImpl rteValueBufferImplementation = new RteValueBufferImplementationImpl();
		return rteValueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEcuReceiver createExternalEcuReceiver() {
		ExternalEcuReceiverImpl externalEcuReceiver = new ExternalEcuReceiverImpl();
		return externalEcuReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSendImplementation createRteSendImplementation() {
		RteSendImplementationImpl rteSendImplementation = new RteSendImplementationImpl();
		return rteSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendImplementation createIocSendImplementation() {
		IocSendImplementationImpl iocSendImplementation = new IocSendImplementationImpl();
		return iocSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectComSendImplementation createDirectComSendImplementation() {
		DirectComSendImplementationImpl directComSendImplementation = new DirectComSendImplementationImpl();
		return directComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionComSendImplementation createTrustedFunctionComSendImplementation() {
		TrustedFunctionComSendImplementationImpl trustedFunctionComSendImplementation = new TrustedFunctionComSendImplementationImpl();
		return trustedFunctionComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicProxyComSendImplementation createPeriodicProxyComSendImplementation() {
		PeriodicProxyComSendImplementationImpl periodicProxyComSendImplementation = new PeriodicProxyComSendImplementationImpl();
		return periodicProxyComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateProxyComSendImplementation createImmediateProxyComSendImplementation() {
		ImmediateProxyComSendImplementationImpl immediateProxyComSendImplementation = new ImmediateProxyComSendImplementationImpl();
		return immediateProxyComSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterBufferImplementation createFilterBufferImplementation() {
		FilterBufferImplementationImpl filterBufferImplementation = new FilterBufferImplementationImpl();
		return filterBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocValueBufferImplementation createIocValueBufferImplementation() {
		IocValueBufferImplementationImpl iocValueBufferImplementation = new IocValueBufferImplementationImpl();
		return iocValueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComValueBufferImplementation createComValueBufferImplementation() {
		ComValueBufferImplementationImpl comValueBufferImplementation = new ComValueBufferImplementationImpl();
		return comValueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionRoot createInteractionRoot() {
		InteractionRootImpl interactionRoot = new InteractionRootImpl();
		return interactionRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteSendImplementation createTrustedFunctionRteSendImplementation() {
		TrustedFunctionRteSendImplementationImpl trustedFunctionRteSendImplementation = new TrustedFunctionRteSendImplementationImpl();
		return trustedFunctionRteSendImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxyInteraction createComSendProxyInteraction() {
		ComSendProxyInteractionImpl comSendProxyInteraction = new ComSendProxyInteractionImpl();
		return comSendProxyInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicComSendProxy createPeriodicComSendProxy() {
		PeriodicComSendProxyImpl periodicComSendProxy = new PeriodicComSendProxyImpl();
		return periodicComSendProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateComSendProxy createImmediateComSendProxy() {
		ImmediateComSendProxyImpl immediateComSendProxy = new ImmediateComSendProxyImpl();
		return immediateComSendProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsTaskActivateEntityStarter createOsTaskActivateEntityStarter() {
		OsTaskActivateEntityStarterImpl osTaskActivateEntityStarter = new OsTaskActivateEntityStarterImpl();
		return osTaskActivateEntityStarter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEventSetEntityStarter createOsEventSetEntityStarter() {
		OsEventSetEntityStarterImpl osEventSetEntityStarter = new OsEventSetEntityStarterImpl();
		return osEventSetEntityStarter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation() {
		TimingTriggeringEntityStartImplementationImpl timingTriggeringEntityStartImplementation = new TimingTriggeringEntityStartImplementationImpl();
		return timingTriggeringEntityStartImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitchTriggeringEntityStartImplementation createModeSwitchTriggeringEntityStartImplementation() {
		ModeSwitchTriggeringEntityStartImplementationImpl modeSwitchTriggeringEntityStartImplementation = new ModeSwitchTriggeringEntityStartImplementationImpl();
		return modeSwitchTriggeringEntityStartImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntityStartInteraction createRunnableEntityStartInteraction() {
		RunnableEntityStartInteractionImpl runnableEntityStartInteraction = new RunnableEntityStartInteractionImpl();
		return runnableEntityStartInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOffsetCounterImplementation createStartOffsetCounterImplementation() {
		StartOffsetCounterImplementationImpl startOffsetCounterImplementation = new StartOffsetCounterImplementationImpl();
		return startOffsetCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCounterImplementation createCycleCounterImplementation() {
		CycleCounterImplementationImpl cycleCounterImplementation = new CycleCounterImplementationImpl();
		return cycleCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedEcuConfiguration createGeneratedEcuConfiguration() {
		GeneratedEcuConfigurationImpl generatedEcuConfiguration = new GeneratedEcuConfigurationImpl();
		return generatedEcuConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction() {
		BswSchedulableEntityStartInteractionImpl bswSchedulableEntityStartInteraction = new BswSchedulableEntityStartInteractionImpl();
		return bswSchedulableEntityStartInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventToTaskMapping createEventToTaskMapping() {
		EventToTaskMappingImpl eventToTaskMapping = new EventToTaskMappingImpl();
		return eventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
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
	public ModeSwitchEvent createModeSwitchEvent() {
		ModeSwitchEventImpl modeSwitchEvent = new ModeSwitchEventImpl();
		return modeSwitchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionPackage getInteractionPackage() {
		return (InteractionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionPackage getPackage() {
		return InteractionPackage.eINSTANCE;
	}

} //InteractionFactoryImpl
