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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_IOC_COMMUNICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_IOC_SENDER_PROPERTIES;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_SPINLOCK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocReceiverProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;

/**
 * ��­���Ƥ���ECUC������������롥 ���ϥ�ǥ���ˡ������оݤ�ECUC����¸�ߤ��Ƥ�����ϡ����Ϥ��줿ECUC�������Ѥ��롥
 */
public class GeneratedEcucModelBuilder {
	private final InteractionModelBuildContext context;
	private final InteractionModelSorter sorter;

	public GeneratedEcucModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
		this.sorter = new InteractionModelSorter(context);
	}

	public void build() throws ModelException {
		Os targetOs = this.context.query.findSingleByKind(OS);

		// �ޥ�������ˤ�������¾�Τ���Υ��ԥ��å����ɲ�
		if (targetOs.getOsOS().isMulticoreOs()) {
			buildRteInternalSpinlock(targetOs);
		}

		// �ץ���COM�̿��Τ���Υ����������٥�ȡ�IOC���ɲ�
		Optional<ImmediateComSendProxy> immediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (immediateComSendProxy.isPresent()) {
			OsApplication targetOsApplication = immediateComSendProxy.get().getOwnerPartition().getImplOsApplication().get(0);
			buildComSendSignalImmediateOsEventAndTask(targetOs, targetOsApplication, immediateComSendProxy.get());
		}

		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			buildOsIocCommunication(getOrCreateOsIoc(targetOs), proxyInteraction);
		}

		// IOC�����Τ����IOC���ɲ�
		for (IocValueBufferImplementation sourceValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			buildOsIocCommunication(getOrCreateOsIoc(targetOs), sourceValueBufferImplementation);
		}

		// ����ؿ�COM�����Τ���ο���ؿ����ɲ�
		if (!this.context.query.findByKind(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).isEmpty()) {
			buildComSendSignalTrustedFunction(targetOs);
		}

		// ����ؿ�RTE�Хåե������Τ���ο���ؿ����ɲ�
		for (TrustedFunctionRteSendImplementation sourceSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			buildRteBufferSendTrustedFunction(sourceSendImplementation);
		}

		// ��������ECUC�Υ�����
		GeneratedEcuConfiguration generatedEcuConfiguration = this.context.cache.interactionRoot.getGeneratedEcuConfiguration();
		if (generatedEcuConfiguration != null) {
			this.sorter.sortEcucContainers(generatedEcuConfiguration.getGeneratedOsEvent());
			this.sorter.sortEcucContainers(generatedEcuConfiguration.getGeneratedOsTask());
			this.sorter.sortEcucContainers(generatedEcuConfiguration.getGeneratedOsSpinlock());
			this.sorter.sortEcucContainers(generatedEcuConfiguration.getGeneratedOsTrustedFunction());
			this.sorter.sortEcucContainers(generatedEcuConfiguration.getGeneratedOsIocCommunication());
		}
	}

	private OsIoc getOrCreateOsIoc(Os targetOs) {
		if (targetOs.getOsIoc() == null) {
			OsIoc osIoc = EcucFactory.eINSTANCE.createOsIoc();
			osIoc.setShortName(Identifiers.DEFAULT_OS_IOC_NAME);
			targetOs.setOsIoc(osIoc);
		}
		return targetOs.getOsIoc();
	}

	private void buildRteInternalSpinlock(Os targetOs) {
		Optional<OsSpinlock> inputOsSpinlock = tryFindOsConfig(OS_SPINLOCK, Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		if (!inputOsSpinlock.isPresent()) {
			OsSpinlock osSpinlock = createRteInternalSpinlock(targetOs);
			targetOs.getOsSpinlock().add(osSpinlock);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsSpinlock().add(osSpinlock);
		}
	}

	private OsSpinlock createRteInternalSpinlock(Os os) {
		OsSpinlock osSpinlock = EcucFactory.eINSTANCE.createOsSpinlock();
		osSpinlock.setShortName(Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		osSpinlock.getOsSpinlockAccessingApplication().addAll(os.getOsApplication());
		osSpinlock.setOsSpinlockLockMethod(OsSpinlockLockMethodEnum.LOCK_ALL_INTERRUPTS);
		return osSpinlock;
	}

	private void buildComSendSignalImmediateOsEventAndTask(Os targetOs, OsApplication targetOsApplication, ImmediateComSendProxy sourceComSendProxy) {
		// OS���٥�Ȥι���
		OsEvent osEvent;

		Optional<OsEvent> inputOsEvent = tryFindOsConfig(OS_EVENT, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		if (inputOsEvent.isPresent()) {
			osEvent = inputOsEvent.get();

		} else {
			osEvent = createComSendSignalImmediateOsEvent();
			targetOs.getOsEvent().add(osEvent);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsEvent().add(osEvent);
		}

		sourceComSendProxy.setOsEvent(osEvent);

		// OS�������ι���
		Optional<OsTask> inputOsTask = tryFindOsConfig(OS_TASK, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		if (!inputOsTask.isPresent()) {
			OsTask osTask = createComSendSignalImmediateOsTask(targetOs, sourceComSendProxy, osEvent);
			targetOsApplication.getOsAppTask().add(osTask);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTask().add(osTask);
		}
	}

	private OsTask createComSendSignalImmediateOsTask(Os targetOs, ImmediateComSendProxy sourceComSendProxy, OsEvent osEvent) {
		OsTask osTask = EcucFactory.eINSTANCE.createOsTask();
		osTask.setShortName(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		osTask.setOsTaskActivation(ConfigValues.DEFAULT_OS_TASK_ACTIVATION);
		osTask.setOsTaskPriority(ConfigValues.DEFAULT_OS_TASK_PRIORITY);
		osTask.setOsTaskSchedule(ConfigValues.DEFAULT_OS_TASK_SCHEDULE);
		osTask.getOsTaskAccessingApplication().addAll(sourceComSendProxy.getRequesterOsApplications());
		osTask.getOsTaskEvent().add(osEvent);
		targetOs.getOsTask().add(osTask);
		return osTask;
	}

	private OsEvent createComSendSignalImmediateOsEvent() {
		OsEvent osEvent = EcucFactory.eINSTANCE.createOsEvent();
		osEvent.setShortName(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		return osEvent;
	}

	private void buildOsIocCommunication(OsIoc targetOsIoc, ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		OsIocCommunication osIocCommunication;

		Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, Identifiers.createOsIocCommunicationName(sourceProxyInteraction));
		if (inputOsIocCommunication.isPresent()) {
			osIocCommunication = inputOsIocCommunication.get();

		} else {
			// IOC�ι���
			osIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
			osIocCommunication.setShortName(Identifiers.createOsIocCommunicationName(sourceProxyInteraction));
			osIocCommunication.setOsIocBufferLength(getDefaultComSendProxyIocBufferLength(sourceProxyInteraction));
			targetOsIoc.getOsIocCommunication().add(osIocCommunication);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(osIocCommunication);

			// �ǡ�������ι���
			osIocCommunication.getOsIocDataProperties().add(createSignalIdDataProperties());
			osIocCommunication.getOsIocDataProperties().add(createSignalDataDataProperties(sourceProxyInteraction));

			// ����¦����ι���
			osIocCommunication.setOsIocReceiverProperties(createOsIocReceiverProperties(sourceProxyInteraction));

			// ����¦����ι���
			osIocCommunication.getOsIocSenderProperties().add(createOsIocSenderProperties(sourceProxyInteraction));
		}

		// �����˻��Ѥ���IOC��Ҥ�Ť�
		sourceProxyInteraction.setOsIocCommunication(osIocCommunication);
	}

	private OsIocSenderProperties createOsIocSenderProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocSenderProperties osIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		osIocSenderProperties.setShortName(Identifiers.DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME);
		osIocSenderProperties.setOsIocSendingOsApplication(sourceProxyInteraction.getRequesterPartition().getImplOsApplication().get(0));
		return osIocSenderProperties;
	}

	private OsIocReceiverProperties createOsIocReceiverProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocReceiverProperties osIocReceiverProperties = EcucFactory.eINSTANCE.createOsIocReceiverProperties();
		osIocReceiverProperties.setShortName(Identifiers.DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME);
		osIocReceiverProperties.setOsIocReceivingOsApplication(sourceProxyInteraction.getProxy().getOwnerPartition().getImplOsApplication().get(0));
		return osIocReceiverProperties;
	}

	private OsIocDataProperties createSignalDataDataProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocDataProperties signalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		signalDataDataProperties.setShortName(Identifiers.COM_PROXY_DATA_DATA_NAME);
		signalDataDataProperties.setOsIocDataType(sourceProxyInteraction.getSignalDataType());
		signalDataDataProperties.setOsIocDataPropertyIndex(1);
		return signalDataDataProperties;
	}

	private OsIocDataProperties createSignalIdDataProperties() {
		OsIocDataProperties signalIdDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		signalIdDataProperties.setShortName(Identifiers.COM_PROXY_SIGNAL_ID_DATA_NAME);
		signalIdDataProperties.setOsIocDataType(this.context.cache.comSignalIdType);
		signalIdDataProperties.setOsIocDataPropertyIndex(0);
		return signalIdDataProperties;
	}

	private int getDefaultComSendProxyIocBufferLength(ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		return this.context.query.find(isKindOf(PROXY_COM_SEND_IMPLEMENTATION).AND(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceProxyInteraction))).size();
	}

	private void buildOsIocCommunication(OsIoc targetOsIoc, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		ReceiveInteraction receiveInteraction = sourceValueBufferImplementation.getParent();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstance = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		// IOC�̿�����
		OsIocCommunication osIocCommunication;

		Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, Identifiers.createOsIocCommunicationName(dataInstance));
		if (inputOsIocCommunication.isPresent()) {
			osIocCommunication = inputOsIocCommunication.get();

		} else {
			osIocCommunication = createOsIocCommunication(dataInstance);
			targetOsIoc.getOsIocCommunication().add(osIocCommunication);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(osIocCommunication);

			// �ǡ�������ι���
			osIocCommunication.getOsIocDataProperties().add(createOsIocDataProperties(receiver, dataInstance));

			// ����¦����ι���
			osIocCommunication.setOsIocReceiverProperties(createOsIocReceiverProperties(sourceValueBufferImplementation));
		}

		// �����˻��Ѥ���IOC��Ҥ�Ť�
		sourceValueBufferImplementation.setOsIocCommunication(osIocCommunication);

		// ����¦�������

		// ������Ѥˡ��롼�ץХå�������¦�������
		if (!dataInstance.isEventSemantics()) {
			Optional<EcucReferrable> inputLoopbackOsIocSenderProperties = tryFindOsConfig(osIocCommunication, OS_IOC_SENDER_PROPERTIES,
					Identifiers.createOsIocSenderPropertiesName(receiver.getSource()));
			if (!inputLoopbackOsIocSenderProperties.isPresent()) {
				osIocCommunication.getOsIocSenderProperties().add(createLoopbackOsIocSenderProperties(receiver));
			}
		}

		// ���������Ѥ�����¦�������
		for (SendInteraction sendInteraction : receiveInteraction.getSendInteraction()) {
			Sender sender = sendInteraction.getSender().get(0);
			IocSendImplementation iocSendImplementation = (IocSendImplementation) sendInteraction.getImplementation();

			OsIocSenderProperties osIocSenderProperties;

			Optional<OsIocSenderProperties> inputOsIocSenderProperties = tryFindOsConfig(osIocCommunication, OS_IOC_SENDER_PROPERTIES, createOsIocSenderPropertyName(sender));
			if (inputOsIocSenderProperties.isPresent()) {
				osIocSenderProperties = inputOsIocSenderProperties.get();

			} else {
				osIocSenderProperties = createOsIocSenderProperties(sendInteraction, sender);
				osIocCommunication.getOsIocSenderProperties().add(osIocSenderProperties);
			}

			// �����˻��Ѥ���IOC�������Ҥ�Ť�
			iocSendImplementation.setOcIocSenderProperties(osIocSenderProperties);
		}

		// OsIocSenderProperties�򥽡���
		this.sorter.sortEcucContainers(osIocCommunication.getOsIocSenderProperties());

		// senderId���꿶��������Կ���N�ξ��Τߡ�
		if (osIocCommunication.getOsIocSenderProperties().size() > 1) {
			int nextSenderId = 0;
			for (OsIocSenderProperties targetOsIocSenderProperties : osIocCommunication.getOsIocSenderProperties()) {
				targetOsIocSenderProperties.setOsIocSenderId(nextSenderId);
				nextSenderId++;
			}
		}
	}

	private OsIocSenderProperties createLoopbackOsIocSenderProperties(InternalEcuReceiver receiver) {
		OsIocSenderProperties osIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		osIocSenderProperties.setShortName(Identifiers.createOsIocSenderPropertiesName(receiver.getSource()));
		osIocSenderProperties.setOsIocSendingOsApplication(receiver.getOwnerPartition().getImplOsApplication().get(0));
		return osIocSenderProperties;
	}

	private OsIocSenderProperties createOsIocSenderProperties(SendInteraction sourceSendInteraction, Sender sender) {
		OsIocSenderProperties osIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		osIocSenderProperties.setShortName(createOsIocSenderPropertyName(sender));
		osIocSenderProperties.setOsIocSendingOsApplication(sender.getOwnerPartition().getImplOsApplication().get(0));
		return osIocSenderProperties;
	}

	private String createOsIocSenderPropertyName(Sender sender) {
		if (sender instanceof InternalEcuSender) {
			InternalEcuSender internalEcuSender = (InternalEcuSender) sender;
			return Identifiers.createOsIocSenderPropertiesName(internalEcuSender.getSource());

		} else {
			ExternalEcuSender externalEcuSender = (ExternalEcuSender) sender;
			return Identifiers.createOsIocSenderPropertiesName(externalEcuSender.getSource());
		}
	}

	private OsIocReceiverProperties createOsIocReceiverProperties(IocValueBufferImplementation sourceValueBufferImplementation) {
		OsIocReceiverProperties osIocReceiverProperties = EcucFactory.eINSTANCE.createOsIocReceiverProperties();
		osIocReceiverProperties.setShortName(Identifiers.DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME);
		osIocReceiverProperties.setOsIocReceivingOsApplication(sourceValueBufferImplementation.getOwnerPartition().getImplOsApplication().get(0));
		return osIocReceiverProperties;
	}

	private OsIocCommunication createOsIocCommunication(RVariableDataInstanceInSwc sourceDataInstance) {
		OsIocCommunication osIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
		osIocCommunication.setShortName(Identifiers.createOsIocCommunicationName(sourceDataInstance));
		if (sourceDataInstance.isEventSemantics()) {
			osIocCommunication.setOsIocBufferLength(sourceDataInstance.getQueueLength());
		}
		return osIocCommunication;
	}

	private OsIocDataProperties createOsIocDataProperties(InternalEcuReceiver sourceReceiver, RVariableDataInstanceInSwc dataInstance) throws ModelException {
		OsIocDataProperties osIocDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		osIocDataProperties.setShortName(Identifiers.DEFAULT_OS_IOC_DATA_PROPERTIES_NAME);
		if (!dataInstance.isEventSemantics()) {
			ValueSpecification initValue = this.context.query.get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);

			osIocDataProperties.setOsIocInitValue(EmfUtils.<String> exInvoke(initValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));
		}
		osIocDataProperties.setOsIocDataType(dataInstance.getImplementationDataType());
		return osIocDataProperties;
	}

	private void buildComSendSignalTrustedFunction(Os targetOs) throws ModelException {
		EcucPartition masterBswPartition = this.context.query.findSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		OsApplication targetOsApplication = masterBswPartition.getImplOsApplication().get(0);


		Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
				Identifiers.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME);
		if (!inputTrustedFunction.isPresent()) {
			OsApplicationTrustedFunction osTrustedFunction = createComSendSignalTrustedFunction();
			targetOsApplication.getOsApplicationTrustedFunction().add(osTrustedFunction);
			
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(osTrustedFunction);
		}
	}

	private OsApplicationTrustedFunction createComSendSignalTrustedFunction() {
		OsApplicationTrustedFunction osTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		osTrustedFunction.setShortName(Identifiers.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME);
		osTrustedFunction.setOsTrustedFunctionName(SymbolNames.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME);
		return osTrustedFunction;
	}

	private void buildRteBufferSendTrustedFunction(TrustedFunctionRteSendImplementation sourceSendImplementation) throws ModelException {
		SendInteraction sendInteraction = sourceSendImplementation.getParent();
		InternalEcuSender sender = sendInteraction.getInternalEcuSenders().get(0);
		InternalEcuReceiver receiver = sendInteraction.getReceiveInteraction().getInternalEcuReceivers().get(0);
		PVariableDataInstanceInSwc dataInstanceInSwc = (PVariableDataInstanceInSwc) sender.getSource().getPrototype();

		EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
				hasOp(ECUC_PARTITION___GET_OWNER_CORE, sender.getOwnerPartition().getOwnerCore())));
		OsApplication targetOsApplication = bswPartition.getImplOsApplication().get(0);

		// �ǡ����񤭹����Ѥο���ؿ��ι���
		OsApplicationTrustedFunction writeTrustedFunction;

		Optional<OsApplicationTrustedFunction> inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
				Identifiers.createRteBufferWriteTrustedFunctionName(sender.getSource(), receiver.getSource()));
		if (inputWriteTrustedFunction.isPresent()) {
			writeTrustedFunction = inputWriteTrustedFunction.get();

		} else {
			writeTrustedFunction = createRteBufferWriteTrustedFunction(sender, receiver);
			targetOsApplication.getOsApplicationTrustedFunction().add(writeTrustedFunction);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(writeTrustedFunction);
		}

		sourceSendImplementation.setWriteOsTrustedFunction(writeTrustedFunction);

		// �ǡ���̵�����Ѥο���ؿ��ι���
		if (dataInstanceInSwc.isInvalidationEnabled()) {
			OsApplicationTrustedFunction invalidateTrustedFunction;

			Optional<OsApplicationTrustedFunction> inputInvalidateTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createRteBufferInvalidateTrustedFunctionName(sender.getSource(), receiver.getSource()));
			if (inputInvalidateTrustedFunction.isPresent()) {
				invalidateTrustedFunction = inputInvalidateTrustedFunction.get();

			} else {
				invalidateTrustedFunction = createRteBufferInvalidateTrustedFunction(sender, receiver);
				targetOsApplication.getOsApplicationTrustedFunction().add(invalidateTrustedFunction);

				getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(invalidateTrustedFunction);
			}

			sourceSendImplementation.setInvalidateOsTrustedFunction(invalidateTrustedFunction);
		}
	}

	private OsApplicationTrustedFunction createRteBufferWriteTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver) {
		OsApplicationTrustedFunction osApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		osApplicationTrustedFunction.setShortName(Identifiers.createRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		osApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		return osApplicationTrustedFunction;
	}

	private OsApplicationTrustedFunction createRteBufferInvalidateTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver) {
		OsApplicationTrustedFunction osApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		osApplicationTrustedFunction.setShortName(Identifiers.createRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		osApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		return osApplicationTrustedFunction;
	}

	private GeneratedEcuConfiguration getOrCreateGeneratedEcuConfiguration() {
		if (this.context.cache.interactionRoot.getGeneratedEcuConfiguration() == null) {
			this.context.cache.interactionRoot.setGeneratedEcuConfiguration(InteractionFactory.eINSTANCE.createGeneratedEcuConfiguration());
		}
		return this.context.cache.interactionRoot.getGeneratedEcuConfiguration();
	}

	private <T extends EcucReferrable> Optional<T> tryFindOsConfig(EObject eObject, EClass eClass, String shortName) {
		return this.context.query.tryFindSingle(eObject, isKindOf(eClass).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, shortName)));
	}

	private <T extends EcucReferrable> Optional<T> tryFindOsConfig(EClass eClass, String shortName) {
		return this.context.query.tryFindSingle(isKindOf(eClass).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, shortName)));
	}
}
