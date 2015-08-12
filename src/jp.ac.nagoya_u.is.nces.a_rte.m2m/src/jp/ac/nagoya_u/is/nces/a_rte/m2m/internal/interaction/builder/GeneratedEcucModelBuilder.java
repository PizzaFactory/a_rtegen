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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_IOC_COMMUNICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_IOC_SENDER_PROPERTIES;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_SPINLOCK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
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
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;

/**
 * ��­���Ƥ���ECUC������������롥 ���ϥ�ǥ���ˡ������оݤ�ECUC����¸�ߤ��Ƥ�����ϡ����Ϥ��줿ECUC�������Ѥ��롥
 */
public class GeneratedEcucModelBuilder {
	private final InteractionModelBuildContext context;
	private final InteractionRules interactionRules;
	private final InteractionModelSorter sorter;

	public GeneratedEcucModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
		this.interactionRules = new InteractionRules(context);
		this.sorter = new InteractionModelSorter(context);
	}

	public void build() throws ModelException {
		Os sourceAndTargetOs = this.context.cache.sourceOs;

		// ������Ϣ�Ȥˤ�������¾�Τ���Υ��ԥ��å����ɲ�
		if (this.interactionRules.needsSpinlockForRteInternalExclusion()) {
			buildRteInternalSpinlock(sourceAndTargetOs);
		}

		// �ץ���COM�̿��Τ���Υ����������٥�ȡ�IOC���ɲ�
		Optional<ImmediateComSendProxy> sourceAndTargetImmediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (sourceAndTargetImmediateComSendProxy.isPresent()) {
			OsApplication targetOsApplication = sourceAndTargetImmediateComSendProxy.get().getOwnerPartition().getImplOsApplication().get(0);
			buildComSendSignalImmediateOsEventAndTask(sourceAndTargetOs, targetOsApplication, sourceAndTargetImmediateComSendProxy.get());
		}

		for (ComSendProxyInteraction sourceAndTargetProxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			buildComSendProxyOsIocCommunication(getOrCreateOsIoc(sourceAndTargetOs), sourceAndTargetProxyInteraction);
		}

		// S/R IOC�����Τ����IOC���ɲ�
		for (IocValueBufferImplementation sourceAndTargetValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			buildSrInterPartitionOsIocCommunication(getOrCreateOsIoc(sourceAndTargetOs), sourceAndTargetValueBufferImplementation);
		}

		// ����ؿ���ͳCOM�����Τ���ο���ؿ����ɲ�
		buildComSendSignalTrustedFunctions();

		// ����ؿ���ͳ��S/R�Τ���ο���ؿ����ɲ�
		buildSrTrustedFunctions();

		// ����ؿ���ͳ��C/S�Τ���ο���ؿ����ɲ�
		buildCsTrustedFunctions();

		// ��������ECUC�Υ�����
		GeneratedEcuConfiguration targetGeneratedEcuConfiguration = this.context.cache.interactionRoot.getGeneratedEcuConfiguration();
		if (targetGeneratedEcuConfiguration != null) {
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsEvent());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsTask());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsSpinlock());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsTrustedFunction());
			this.sorter.sortEcucContainers(targetGeneratedEcuConfiguration.getGeneratedOsIocCommunication());
		}
	}

	private void buildSrTrustedFunctions() throws ModelException {
		// ����ؿ���ͳRTE�����Τ���ο���ؿ����ɲ�
		for (TrustedFunctionRteSendImplementation sourceAndTargetSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			buildRteBufferSendTrustedFunctions(sourceAndTargetSendImplementation);
		}
	}

	private OsIoc getOrCreateOsIoc(Os sourceAndTargetOs) {
		if (sourceAndTargetOs.getOsIoc() == null) {
			OsIoc destOsIoc = EcucFactory.eINSTANCE.createOsIoc();
			destOsIoc.setShortName(Identifiers.DEFAULT_OS_IOC_NAME);
			sourceAndTargetOs.setOsIoc(destOsIoc);
		}
		return sourceAndTargetOs.getOsIoc();
	}

	private void buildRteInternalSpinlock(Os targetOs) {
		Optional<OsSpinlock> inputOsSpinlock = tryFindOsConfig(OS_SPINLOCK, Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		if (!inputOsSpinlock.isPresent()) {
			OsSpinlock destOsSpinlock = createRteInternalSpinlock(targetOs);
			targetOs.getOsSpinlock().add(destOsSpinlock);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsSpinlock().add(destOsSpinlock);
		}
	}

	private OsSpinlock createRteInternalSpinlock(Os os) {
		OsSpinlock destOsSpinlock = EcucFactory.eINSTANCE.createOsSpinlock();
		destOsSpinlock.setShortName(Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		destOsSpinlock.getOsSpinlockAccessingApplication().addAll(os.getOsApplication());
		destOsSpinlock.setOsSpinlockLockMethod(OsSpinlockLockMethodEnum.LOCK_ALL_INTERRUPTS);
		return destOsSpinlock;
	}

	private void buildComSendSignalImmediateOsEventAndTask(Os targetOs, OsApplication targetOsApplication, ImmediateComSendProxy sourceAndTargetComSendProxy) {
		// OS���٥�Ȥι���
		OsEvent destOsEvent;

		Optional<OsEvent> inputOsEvent = tryFindOsConfig(OS_EVENT, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		if (inputOsEvent.isPresent()) {
			destOsEvent = inputOsEvent.get();

		} else {
			destOsEvent = createComSendSignalImmediateOsEvent();
			targetOs.getOsEvent().add(destOsEvent);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsEvent().add(destOsEvent);
		}

		sourceAndTargetComSendProxy.setOsEvent(destOsEvent);

		// OS�������ι���
		Optional<OsTask> inputOsTask = tryFindOsConfig(OS_TASK, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		if (!inputOsTask.isPresent()) {
			OsTask destOsTask = createComSendSignalImmediateOsTask(targetOs, sourceAndTargetComSendProxy, destOsEvent);
			targetOsApplication.getOsAppTask().add(destOsTask);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTask().add(destOsTask);
		}
	}

	private OsTask createComSendSignalImmediateOsTask(Os targetOs, ImmediateComSendProxy sourceComSendProxy, OsEvent osEvent) {
		OsTask destOsTask = EcucFactory.eINSTANCE.createOsTask();
		destOsTask.setShortName(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		destOsTask.setOsTaskActivation(ConfigValues.DEFAULT_OS_TASK_ACTIVATION);
		destOsTask.setOsTaskPriority(ConfigValues.DEFAULT_OS_TASK_PRIORITY);
		destOsTask.setOsTaskSchedule(ConfigValues.DEFAULT_OS_TASK_SCHEDULE);
		destOsTask.getOsTaskAccessingApplication().addAll(sourceComSendProxy.getRequesterOsApplications());
		destOsTask.getOsTaskEvent().add(osEvent);
		targetOs.getOsTask().add(destOsTask);
		return destOsTask;
	}

	private OsEvent createComSendSignalImmediateOsEvent() {
		OsEvent destOsEvent = EcucFactory.eINSTANCE.createOsEvent();
		destOsEvent.setShortName(Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		return destOsEvent;
	}

	private void buildComSendProxyOsIocCommunication(OsIoc targetOsIoc, ComSendProxyInteraction sourceAndTargetProxyInteraction) throws ModelException {
		if (sourceAndTargetProxyInteraction.getSignalDataType().isPrimitiveType()) {
			// �ץ�ߥƥ��ַ��ξ��
			// �׵ᡦ�������Ѥ�IOC�̿�����
			OsIocCommunication destOsIocCommunication;

			String osIocCommunicationName = (sourceAndTargetProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					? Identifiers.createPeriodicComProxyRequestOsIocCommunicationNameForPrimitiveType(sourceAndTargetProxyInteraction)
					: Identifiers.createImmediateComProxyRequestOsIocCommunicationNameForPrimitiveType(sourceAndTargetProxyInteraction);
			Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, osIocCommunicationName);
			if (inputOsIocCommunication.isPresent()) {
				destOsIocCommunication = inputOsIocCommunication.get();
			} else {
				destOsIocCommunication = createComSendProxyIocCommunication(targetOsIoc, sourceAndTargetProxyInteraction, osIocCommunicationName);
				destOsIocCommunication.setOsIocBufferLength(getComSendProxyRequestIocDefaultBufferLength(sourceAndTargetProxyInteraction));
				destOsIocCommunication.getOsIocDataProperties().add(createComSendProxySignalIdDataProperties());
				destOsIocCommunication.getOsIocDataProperties().add(createComSendProxySignalDataDataProperties(sourceAndTargetProxyInteraction, 1));
			}
			sourceAndTargetProxyInteraction.setRequestOsIocCommunication(destOsIocCommunication);

		} else {
			// ʣ��ǡ������ξ��
			// �׵������Ѥ�IOC�̿�����
			OsIocCommunication destRequestOsIocCommunication;

			String requestOsIocComName = (sourceAndTargetProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					? Identifiers.createPeriodicComProxyRequestOsIocCommunicationNameForComplexType(sourceAndTargetProxyInteraction)
					: Identifiers.createImmediateComProxyRequestOsIocCommunicationNameForComplexType(sourceAndTargetProxyInteraction);
			Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, requestOsIocComName);
			if (inputOsIocCommunication.isPresent()) {
				destRequestOsIocCommunication = inputOsIocCommunication.get();
			} else {
				destRequestOsIocCommunication = createComSendProxyIocCommunication(targetOsIoc, sourceAndTargetProxyInteraction, requestOsIocComName);
				destRequestOsIocCommunication.setOsIocBufferLength(getComSendProxyValueIocDefaultBufferLength(sourceAndTargetProxyInteraction));
				destRequestOsIocCommunication.getOsIocDataProperties().add(createComSendProxyFunctionTableIndexDataProperties());
			}
			sourceAndTargetProxyInteraction.setRequestOsIocCommunication(destRequestOsIocCommunication);

			// �������Ѥ�IOC�̿�����
			ProxyComSendImplementation sourceSendImplementation = this.context.query.<ProxyComSendImplementation> findSingle(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceAndTargetProxyInteraction));
			InternalEcuSender sourceSender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
			VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceSender.getSource().getPrototype();

			EcucReferrable sourceComSignalOrComSignalGroup = sourceSendImplementation.getComSignal() != null ? sourceSendImplementation.getComSignal() : sourceSendImplementation.getComSignalGroup();
			String valueIocComName = (sourceAndTargetProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					? Identifiers.createPeriodicComProxyValueOsIocCommunicationName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup)
					: Identifiers.createImmediateComProxyValueOsIocCommunicationName(sourceDataInstanceInSwc, sourceComSignalOrComSignalGroup);
			
			OsIocCommunication destValueIocComForComplexType;
			Optional<OsIocCommunication> inputOsIocForComplex = tryFindOsConfig(OS_IOC_COMMUNICATION, valueIocComName);
			if (inputOsIocForComplex.isPresent()) {
				destValueIocComForComplexType = inputOsIocForComplex.get();
			} else {
				destValueIocComForComplexType = createComSendProxyIocCommunication(targetOsIoc, sourceAndTargetProxyInteraction, valueIocComName);
				destValueIocComForComplexType.setOsIocBufferLength(1);
				destValueIocComForComplexType.getOsIocDataProperties().add(createComSendProxySignalDataDataProperties(sourceAndTargetProxyInteraction));
			}
			sourceAndTargetProxyInteraction.setValueOsIocCommunicationForComplexType(destValueIocComForComplexType);
		}
	}

	private OsIocCommunication createComSendProxyIocCommunication(OsIoc targetOsIoc, ComSendProxyInteraction sourceProxyInteraction, String osIocCommunicationName) {
		OsIocCommunication destOsIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
		destOsIocCommunication.setShortName(osIocCommunicationName);
		targetOsIoc.getOsIocCommunication().add(destOsIocCommunication);
		
		// ��������ECUC�Ǥ��뤳�Ȥ�����
		getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(destOsIocCommunication);

		// ����¦����ι���
		destOsIocCommunication.setOsIocReceiverProperties(createComSendProxyOsIocReceiverProperties(sourceProxyInteraction));

		// ����¦����ι���
		destOsIocCommunication.getOsIocSenderProperties().add(createComSendProxyOsIocSenderProperties(sourceProxyInteraction));
		return destOsIocCommunication;
	}

	private OsIocSenderProperties createComSendProxyOsIocSenderProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocSenderProperties destOsIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		destOsIocSenderProperties.setShortName(Identifiers.DEFAULT_OS_IOC_SENDER_PROPERTIES_NAME);
		destOsIocSenderProperties.setOsIocSendingOsApplication(sourceProxyInteraction.getRequesterPartition().getImplOsApplication().get(0));
		return destOsIocSenderProperties;
	}

	private OsIocReceiverProperties createComSendProxyOsIocReceiverProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocReceiverProperties destOsIocReceiverProperties = EcucFactory.eINSTANCE.createOsIocReceiverProperties();
		destOsIocReceiverProperties.setShortName(Identifiers.DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME);
		destOsIocReceiverProperties.setOsIocReceivingOsApplication(sourceProxyInteraction.getProxy().getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocReceiverProperties;
	}

	private OsIocDataProperties createComSendProxySignalDataDataProperties(ComSendProxyInteraction sourceProxyInteraction, int index) {
		OsIocDataProperties destSignalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destSignalDataDataProperties.setShortName(Identifiers.COM_PROXY_DATA_DATA_NAME);
		destSignalDataDataProperties.setOsIocDataType(sourceProxyInteraction.getSignalDataType());
		destSignalDataDataProperties.setOsIocDataPropertyIndex(index);
		return destSignalDataDataProperties;
	}

	private OsIocDataProperties createComSendProxySignalIdDataProperties() {
		OsIocDataProperties destSignalIdDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destSignalIdDataProperties.setShortName(Identifiers.COM_PROXY_SIGNAL_ID_DATA_NAME);
		destSignalIdDataProperties.setOsIocDataType(this.context.cache.sourceComSignalIdType);
		destSignalIdDataProperties.setOsIocDataPropertyIndex(0);
		return destSignalIdDataProperties;
	}

	private OsIocDataProperties createComSendProxySignalDataDataProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocDataProperties destSignalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destSignalDataDataProperties.setShortName(Identifiers.COM_PROXY_DATA_DATA_NAME);
		destSignalDataDataProperties.setOsIocDataType(sourceProxyInteraction.getSignalDataType());
		return destSignalDataDataProperties;
	}

	private OsIocDataProperties createComSendProxyFunctionTableIndexDataProperties() {
		OsIocDataProperties destFunctionTableIndexDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destFunctionTableIndexDataProperties.setShortName(Identifiers.COM_PROXY_FUNCTION_INDEX_NAME);
		destFunctionTableIndexDataProperties.setOsIocDataType(this.context.cache.sourceUint32Type);
		return destFunctionTableIndexDataProperties;
	}

	private int getComSendProxyRequestIocDefaultBufferLength(ComSendProxyInteraction sourceProxyInteraction) {
		return this.context.query.find(isKindOf(PROXY_COM_SEND_IMPLEMENTATION).AND(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceProxyInteraction))).size();
	}

	private int getComSendProxyValueIocDefaultBufferLength(ComSendProxyInteraction sourceProxyInteraction) {
		int count = 0; // ���Ȥ�ɬ��­�����ि�ᡢ0���饹�����Ȥ���
		for (ComSendProxyInteraction sourceAnotherProxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			if (sourceAnotherProxyInteraction.getRequesterPartition() == sourceProxyInteraction.getRequesterPartition()) {
				if ((sourceAnotherProxyInteraction.getProxy() instanceof PeriodicComSendProxy && sourceProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					|| (sourceAnotherProxyInteraction.getProxy() instanceof ImmediateComSendProxy && sourceProxyInteraction.getProxy() instanceof ImmediateComSendProxy)) {
					ImplementationDataType sourceLeafType = sourceAnotherProxyInteraction.getSignalDataType().getLeafImplementationDataType();
					if (!sourceLeafType.isPrimitiveType()) {
						count++;
					}
				}
			}
		}
		return count;
	}

	private void buildSrInterPartitionOsIocCommunication(OsIoc targetOsIoc, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		ReceiveInteraction sourceReceiveInteraction = sourceValueBufferImplementation.getParent();
		InternalEcuReceiver sourceReceiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		// IOC�̿�����
		OsIocCommunication destOsIocCommunication;

		Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, Identifiers.createSrInterPartitionOsIocCommunicationName(sourceDataInstance));
		if (inputOsIocCommunication.isPresent()) {
			destOsIocCommunication = inputOsIocCommunication.get();

		} else {
			destOsIocCommunication = createSrInterPartitionOsIocCommunication(sourceDataInstance);
			targetOsIoc.getOsIocCommunication().add(destOsIocCommunication);

			// ��������ECUC�Ǥ��뤳�Ȥ�����
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(destOsIocCommunication);

			// �ǡ�������ι���
			destOsIocCommunication.getOsIocDataProperties().add(createSrInterPartitionOsIocDataProperties(sourceReceiver, sourceDataInstance));

			// ����¦����ι���
			destOsIocCommunication.setOsIocReceiverProperties(createSrInterPartitionOsIocReceiverProperties(sourceValueBufferImplementation));
		}

		// �����˻��Ѥ���IOC��Ҥ�Ť�
		sourceValueBufferImplementation.setOsIocCommunication(destOsIocCommunication);

		// ����¦�������

		// ������Ѥˡ��롼�ץХå�������¦�������
		if (!sourceDataInstance.isEventSemantics()) {
			Optional<EcucReferrable> inputLoopbackOsIocSenderProperties = tryFindOsConfig(destOsIocCommunication, OS_IOC_SENDER_PROPERTIES,
					Identifiers.createOsIocSenderPropertiesName(sourceReceiver.getSource()));
			if (!inputLoopbackOsIocSenderProperties.isPresent()) {
				destOsIocCommunication.getOsIocSenderProperties().add(createSrInterPartitionLoopbackOsIocSenderProperties(sourceReceiver));
			}
		}

		// ���������Ѥ�����¦�������
		for (SendInteraction sourceSendInteraction : sourceReceiveInteraction.getSendInteraction()) {
			Sender sourceSender = sourceSendInteraction.getSender().get(0);
			IocSendImplementation targetIocSendImplementation = (IocSendImplementation) sourceSendInteraction.getImplementation(); // NOTE IOC�Хåե�����Ѥ����硢����¦��ɬ��IOC����

			OsIocSenderProperties destOsIocSenderProperties;

			Optional<OsIocSenderProperties> inputOsIocSenderProperties = tryFindOsConfig(destOsIocCommunication, OS_IOC_SENDER_PROPERTIES, createSrInterPartitionOsIocSenderPropertyName(sourceSender));
			if (inputOsIocSenderProperties.isPresent()) {
				destOsIocSenderProperties = inputOsIocSenderProperties.get();

			} else {
				destOsIocSenderProperties = createSrInterPartitionOsIocSenderProperties(sourceSendInteraction, sourceSender);
				destOsIocCommunication.getOsIocSenderProperties().add(destOsIocSenderProperties);
			}

			// �����˻��Ѥ���IOC�������Ҥ�Ť�
			targetIocSendImplementation.setOsIocSenderProperties(destOsIocSenderProperties);
		}

		// OsIocSenderProperties�򥽡���
		this.sorter.sortEcucContainers(destOsIocCommunication.getOsIocSenderProperties());

		// senderId���꿶��������Կ���N�ξ��Τߡ�
		if (destOsIocCommunication.getOsIocSenderProperties().size() > 1) {
			int nextSenderId = 0;
			for (OsIocSenderProperties targetOsIocSenderProperties : destOsIocCommunication.getOsIocSenderProperties()) {
				targetOsIocSenderProperties.setOsIocSenderId(nextSenderId);
				nextSenderId++;
			}
		}
	}

	private OsIocSenderProperties createSrInterPartitionLoopbackOsIocSenderProperties(InternalEcuReceiver sourceReceiver) {
		OsIocSenderProperties destOsIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		destOsIocSenderProperties.setShortName(Identifiers.createOsIocSenderPropertiesName(sourceReceiver.getSource()));
		destOsIocSenderProperties.setOsIocSendingOsApplication(sourceReceiver.getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocSenderProperties;
	}

	private OsIocSenderProperties createSrInterPartitionOsIocSenderProperties(SendInteraction sourceSendInteraction, Sender sender) {
		OsIocSenderProperties destOsIocSenderProperties = EcucFactory.eINSTANCE.createOsIocSenderProperties();
		destOsIocSenderProperties.setShortName(createSrInterPartitionOsIocSenderPropertyName(sender));
		destOsIocSenderProperties.setOsIocSendingOsApplication(sender.getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocSenderProperties;
	}

	private String createSrInterPartitionOsIocSenderPropertyName(Sender sourceSender) {
		if (sourceSender instanceof InternalEcuSender) {
			InternalEcuSender sourceInternalEcuSender = (InternalEcuSender) sourceSender;
			return Identifiers.createOsIocSenderPropertiesName(sourceInternalEcuSender.getSource());

		} else {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// S/R�μ¸��������������ˤ��ѹ��Ȥʤ�ECU�֤Ǥ�IOC�Хåե�����Ѥ��ʤ��ʤä��ط���,��Ƚ���else�����̲ᤷ�ʤ��褦�ˤʤäƤ���.
			ExternalEcuSender sourceExternalEcuSender = (ExternalEcuSender) sourceSender;
			if (sourceExternalEcuSender.getSourceSignal() != null) {
				return Identifiers.createOsIocSenderPropertiesName(sourceExternalEcuSender.getSourceSignal());
			} else {
				return Identifiers.createOsIocSenderPropertiesName(sourceExternalEcuSender.getSourceSignalGroup());
			}
		}
	}

	private OsIocReceiverProperties createSrInterPartitionOsIocReceiverProperties(IocValueBufferImplementation sourceValueBufferImplementation) {
		OsIocReceiverProperties destOsIocReceiverProperties = EcucFactory.eINSTANCE.createOsIocReceiverProperties();
		destOsIocReceiverProperties.setShortName(Identifiers.DEFAULT_OS_IOC_RECEIVER_PROPERTIES_NAME);
		destOsIocReceiverProperties.setOsIocReceivingOsApplication(sourceValueBufferImplementation.getOwnerPartition().getImplOsApplication().get(0));
		return destOsIocReceiverProperties;
	}

	private OsIocCommunication createSrInterPartitionOsIocCommunication(RVariableDataInstanceInSwc sourceDataInstance) {
		OsIocCommunication destOsIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
		destOsIocCommunication.setShortName(Identifiers.createSrInterPartitionOsIocCommunicationName(sourceDataInstance));
		if (sourceDataInstance.isEventSemantics()) {
			destOsIocCommunication.setOsIocBufferLength(sourceDataInstance.getQueueLength());
		}
		return destOsIocCommunication;
	}

	private OsIocDataProperties createSrInterPartitionOsIocDataProperties(InternalEcuReceiver sourceReceiver, RVariableDataInstanceInSwc sourceDataInstance) throws ModelException {
		OsIocDataProperties destOsIocDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		destOsIocDataProperties.setShortName(Identifiers.DEFAULT_OS_IOC_DATA_PROPERTIES_NAME);
		if (!sourceDataInstance.isEventSemantics()) {
			ValueSpecification initValue = this.context.query.get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
			destOsIocDataProperties.setOsIocInitValue(getValueSpecificationValueAsText(initValue));
		}
		destOsIocDataProperties.setOsIocDataType(sourceDataInstance.getImplementationDataType());
		return destOsIocDataProperties;
	}

	private String getValueSpecificationValueAsText(ValueSpecification value) throws ModelException {
		value = this.context.query.get(value, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		String text = "";
		if (value instanceof ArrayValueSpecification) {
			for (ValueSpecification valueSpecification : ((ArrayValueSpecification) value).getElement()) {
				text += this.context.query.get(valueSpecification, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION) + ",";
			}
			int last = text.lastIndexOf(",");
			text = "{" + text.substring(0, last) + "}";
			return text;
		} else if (value instanceof RecordValueSpecification) {
			for (ValueSpecification valueSpecification : ((RecordValueSpecification) value).getField()) {
				text += this.context.query.get(valueSpecification, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION) + ",";
			}
			int last = text.lastIndexOf(",");
			text = "{" + text.substring(0, last) + "}";
			return text;
		} else {
			return this.context.query.get(value, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION);
		}
	}
	
	private void buildComSendSignalTrustedFunctions() {
		Optional<TrustedFunctionComSendImplementation> sourceImplForComSignal = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (sourceImplForComSignal.isPresent()) {
			EcucPartition sourceMasterBswPartition = this.context.cache.sourceMasterBswPartition.get(); // NOTE ����ؿ����ۤ�����ˤ�ɬ���ޥ����ѡ��ƥ������¸�ߤ��뤿�ᡢ¸�ߥ����å���Ԥ�ʤ�
			buildComSendSignalTrustedFunction(Identifiers.createComSendSignalTrustedFunctionName(sourceMasterBswPartition), SymbolNames.createComSendSignalTrustedFunctionName(sourceMasterBswPartition));
		}

		Optional<TrustedFunctionComSendImplementation> sourceImplForComSignalGroup = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (sourceImplForComSignalGroup.isPresent()) {
			EcucPartition sourceMasterBswPartition = this.context.cache.sourceMasterBswPartition.get(); // NOTE ����ؿ����ۤ�����ˤ�ɬ���ޥ����ѡ��ƥ������¸�ߤ��뤿�ᡢ¸�ߥ����å���Ԥ�ʤ�
			buildComSendSignalTrustedFunction(Identifiers.createComSendSignalGroupTrustedFunctionName(sourceMasterBswPartition), SymbolNames.createComSendSignalGroupTrustedFunctionName(sourceMasterBswPartition));
		}
	}

	private void buildComSendSignalTrustedFunction(String tfShortName, String tfSymbolName) {
		EcucPartition sourceMasterBswPartition = this.context.cache.sourceMasterBswPartition.get(); // NOTE ����ؿ����ۤ�����ˤ�ɬ���ޥ����ѡ��ƥ������¸�ߤ��뤿�ᡢ¸�ߥ����å���Ԥ�ʤ�

		Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION, tfShortName);
		if (!inputTrustedFunction.isPresent()) {
			OsApplication targetOsApplication = sourceMasterBswPartition.getImplOsApplication().get(0);

			OsApplicationTrustedFunction destOsTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
			destOsTrustedFunction.setShortName(tfShortName);
			destOsTrustedFunction.setOsTrustedFunctionName(tfSymbolName);
			targetOsApplication.getOsApplicationTrustedFunction().add(destOsTrustedFunction);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destOsTrustedFunction);
		}
	}

	private void buildRteBufferSendTrustedFunctions(TrustedFunctionRteSendImplementation sourceAndTargetSendImplementation) throws ModelException {
		SendInteraction sourceSendInteraction = sourceAndTargetSendImplementation.getParent();
		InternalEcuSender sourceSender = sourceSendInteraction.getInternalEcuSenders().get(0);
		InternalEcuReceiver sourceReceiver = sourceSendInteraction.getReceiveInteraction().getInternalEcuReceivers().get(0);
		PVariableDataInstanceInSwc sourceDataInstanceInSwc = (PVariableDataInstanceInSwc) sourceSender.getSource().getPrototype();

		EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
				hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceSender.getOwnerPartition().getOwnerCore())));
		OsApplication targetOsApplication = bswPartition.getImplOsApplication().get(0);

		// �ǡ����񤭹����Ѥο���ؿ��ι���
		OsApplicationTrustedFunction destWriteTrustedFunction;

		Optional<OsApplicationTrustedFunction> inputWriteTrustedFunction;
		if (sourceDataInstanceInSwc.isEventSemantics()) {
			inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createSrRteBufferSendTrustedFunctionName(sourceSender.getSource(), sourceReceiver.getSource()));
		} else {
			inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createSrRteBufferWriteTrustedFunctionName(sourceSender.getSource(), sourceReceiver.getSource()));
		}
		
		if (inputWriteTrustedFunction.isPresent()) {
			destWriteTrustedFunction = inputWriteTrustedFunction.get();

		} else {
			destWriteTrustedFunction = createRteBufferWriteTrustedFunction(sourceSender, sourceReceiver, sourceDataInstanceInSwc.isEventSemantics());
			targetOsApplication.getOsApplicationTrustedFunction().add(destWriteTrustedFunction);

			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destWriteTrustedFunction);
		}

		sourceAndTargetSendImplementation.setWriteOsTrustedFunction(destWriteTrustedFunction);

		// �ǡ���̵�����Ѥο���ؿ��ι���
		if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
			OsApplicationTrustedFunction destInvalidateTrustedFunction;

			Optional<OsApplicationTrustedFunction> inputInvalidateTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createSrRteBufferInvalidateTrustedFunctionName(sourceSender.getSource(), sourceReceiver.getSource()));
			if (inputInvalidateTrustedFunction.isPresent()) {
				destInvalidateTrustedFunction = inputInvalidateTrustedFunction.get();

			} else {
				destInvalidateTrustedFunction = createRteBufferInvalidateTrustedFunction(sourceSender, sourceReceiver);
				targetOsApplication.getOsApplicationTrustedFunction().add(destInvalidateTrustedFunction);

				getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destInvalidateTrustedFunction);
			}

			sourceAndTargetSendImplementation.setInvalidateOsTrustedFunction(destInvalidateTrustedFunction);
		}
	}

	private OsApplicationTrustedFunction createRteBufferWriteTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver, Boolean isEventSemantics) {
		OsApplicationTrustedFunction destOsApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();

		if (isEventSemantics) {
			destOsApplicationTrustedFunction.setShortName(Identifiers.createSrRteBufferSendTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
			destOsApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createSrRteBufferSendTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));			
		} else {
			destOsApplicationTrustedFunction.setShortName(Identifiers.createSrRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
			destOsApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createSrRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));			
		}

		return destOsApplicationTrustedFunction;
	}

	private OsApplicationTrustedFunction createRteBufferInvalidateTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver) {
		OsApplicationTrustedFunction destOsApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		destOsApplicationTrustedFunction.setShortName(Identifiers.createSrRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		destOsApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createSrRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		return destOsApplicationTrustedFunction;
	}
	
	private void buildCsTrustedFunctions() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (ROperationInstanceInSwc sourceOperationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.interactionRules.needsTrustedFunctionForCsCall(sourceOperationInstanceInSwc)) {
						// ���������ꡢ����������ξ�硢����ؿ�����
						Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION, Identifiers.createCsCallTfName(sourceSwComponentType));
						if (!inputTrustedFunction.isPresent()) {
							Optional<EcucPartition> sourcePPartition = tryGetPEcucPartition(sourceOperationInstanceInSwc);

							OsApplication targetOsApplication = sourcePPartition.get().getImplOsApplication().get(0); // NOTE ����ؿ�����Ѥ����硢�׵�¦�ѡ��ƥ�������ɬ��¸�ߤ���
							OsApplicationTrustedFunction destOsTrustedFunction = createCsTrustedFunction(sourceSwComponentType);
							targetOsApplication.getOsApplicationTrustedFunction().add(destOsTrustedFunction);

							getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(destOsTrustedFunction);
						}
					}
				}
			}
		}
	}

	// NOTE �Ǥ����ex��ǥ����������ۤ����褤
	private Optional<EcucPartition> tryGetPEcucPartition(ROperationInstanceInSwc rOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition rOpInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, rOperationInstanceInSwc));
		Optional<AssemblyOperationInstanceConnector> connector = this.context.query.<AssemblyOperationInstanceConnector> tryFindSingle(ref(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER, rOpInComposition));
		if (!connector.isPresent()) { // COVERAGE �����ϡ����false(����ؿ�����Ѥ����硢�׵�¦�ѡ��ƥ�������ɬ��¸�ߤ���)
			return Optional.absent();
		}

		PortInstanceInComposition pPortInComposition = connector.get().getProvider().getParent();
		if (pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
			return Optional.absent(); // COVERAGE �����ϡ����false(����ؿ�����Ѥ����硢�׵�¦�ѡ��ƥ�������ɬ��¸�ߤ���)
		}

		return Optional.of(pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0));
	}

	private OsApplicationTrustedFunction createCsTrustedFunction(AtomicSwComponentType sourceSwComponentType) {
		OsApplicationTrustedFunction destOsTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		destOsTrustedFunction.setShortName(Identifiers.createCsCallTfName(sourceSwComponentType));
		destOsTrustedFunction.setOsTrustedFunctionName(SymbolNames.createCsCallTfName(sourceSwComponentType));
		return destOsTrustedFunction;
	}

	private GeneratedEcuConfiguration getOrCreateGeneratedEcuConfiguration() {
		InteractionRoot targetInteractionRoot = this.context.cache.interactionRoot;

		if (targetInteractionRoot.getGeneratedEcuConfiguration() == null) {
			targetInteractionRoot.setGeneratedEcuConfiguration(InteractionFactory.eINSTANCE.createGeneratedEcuConfiguration());
		}
		return targetInteractionRoot.getGeneratedEcuConfiguration();
	}

	private <T extends EcucReferrable> Optional<T> tryFindOsConfig(EObject eObject, EClass eClass, String shortName) {
		return this.context.query.tryFindSingle(eObject, isKindOf(eClass).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, shortName)));
	}

	private <T extends EcucReferrable> Optional<T> tryFindOsConfig(EClass eClass, String shortName) {
		return this.context.query.tryFindSingle(isKindOf(eClass).AND(hasAttr(ECUC_REFERRABLE__SHORT_NAME, shortName)));
	}
}
