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
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS;
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
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;
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
		if (isSpinLock(targetOs)) {
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
		buildComSendSignalTrustedFunction();

		// ����ؿ�RTE�Хåե������Τ���ο���ؿ����ɲ�
		for (TrustedFunctionRteSendImplementation sourceSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			buildRteBufferSendTrustedFunction(sourceSendImplementation);
		}

		// ����ؿ�CS�Τ���ο���ؿ����ɲ�
		buildCsTrustedFunction(targetOs);

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

	private boolean isSpinLock(Os targetOs) {

		// �ޥ������OSȽ��
		if (!targetOs.getOsOS().isMulticoreOs()) {
			return false;
		}

		for (InternalEcuReceiver targetReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {

			if (targetReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			// �����٤�Ƚ��
			// �ʲ��ϡ�SenderReceiverImplementationModelBuilder:buildReceiveImplementations�ˤ�ReceiveInteraction�ˡ�0�פΤߤ����ꤷ�Ƥ��뤿�ᡢƱ�ͤ˼���
			ReceiveInteraction receiveInteraction = targetReceiver.getReceiveInteraction().get(0);
			if (!receiveInteraction.receivesInterCore()) {
				// �����٤��Ǥʤ���硢���ԥ��å��ʤ�
				continue;
			}

			// �֥��ޥ�ƥ������ס֥����ॢ���ȡס֥ե��륿����Ƚ��
			RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) targetReceiver.getSource().getPrototype();
			ImplementationDataType sourceDataType = dataInstanceInSwc.getImplementationDataType();
			if (!isComplexType(sourceDataType) &&
				!(dataInstanceInSwc.isEventSemantics()) && 
				!(dataInstanceInSwc.isAliveTimeoutEnabled()) &&
				!(dataInstanceInSwc.isFilterEnabled()))
			{
				// ��Primitive�� and �֥ǡ������ޥ�ƥ������� and �֥����ॢ����̵���� and �֥ե��륿��̵���פξ�硢���ԥ��å��ʤ�
				continue;
			}

			// �¸�����Ƚ��
			ValueBufferImplementation valueBufferImplementation = receiveInteraction.getValueBufferImplementation();
			if (!isRteImplementation(valueBufferImplementation)) {
				// �¸�������RteValueBufferImplementation�Ǥʤ���硢���ԥ��å��ʤ�
				continue;
			}

			// ���ԥ��å�����
			return true;
		}

		return false;
	}

	private boolean isComplexType(ImplementationDataType sourceDataType) {
		String typeCategory = sourceDataType.getCategory();
		if ("TYPE_REFERENCE".equals(typeCategory)) {
			ImplementationDataType sourceImplType = sourceDataType.getSwDataDefProps().getImplementationDataType();
			typeCategory = sourceImplType.getCategory();
		}

		if ("ARRAY".equals(typeCategory) || "STRUCTURE".equals(typeCategory) || "UNION".equals(typeCategory)) {
			return true;
		}

		return false;
	}

	private boolean isRteImplementation(ValueBufferImplementation implementation) {
		if (implementation instanceof RteValueBufferImplementation) {
			return true;
		}

		return false;
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
		ImplementationDataType type = sourceProxyInteraction.getSignalDataType();
		type = type.getLeafImplementationDataType();
		
		// primitive�� or Complex�δؿ��ơ��֥륤��ǥå�����
		String osIocCommunicationName = null;
		if ("VALUE".equals(type.getCategory())) {
			osIocCommunicationName = (sourceProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					? Identifiers.createOsIocCommunicationPeriodicName(sourceProxyInteraction)
					: Identifiers.createOsIocCommunicationImmediateName(sourceProxyInteraction);
			Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, osIocCommunicationName);
			if (inputOsIocCommunication.isPresent()) {
				osIocCommunication = inputOsIocCommunication.get();
			} else {
				osIocCommunication = createIocCommunication(targetOsIoc, sourceProxyInteraction, osIocCommunicationName);
				osIocCommunication.setOsIocBufferLength(getDefaultComSendProxyIocBufferLength(sourceProxyInteraction));
				osIocCommunication.getOsIocDataProperties().add(createSignalIdDataProperties());
				osIocCommunication.getOsIocDataProperties().add(createSignalDataDataProperties(sourceProxyInteraction, 1));
			}
			sourceProxyInteraction.setOsIocCommunication(osIocCommunication);
		} else {
			osIocCommunicationName = (sourceProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					? Identifiers.createOsIocCommunicationPeriodicComplexName(sourceProxyInteraction)
					: Identifiers.createOsIocCommunicationImmediateComplexName(sourceProxyInteraction);
			Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, osIocCommunicationName);
			if (inputOsIocCommunication.isPresent()) {
				osIocCommunication = inputOsIocCommunication.get();
			} else {
				osIocCommunication = createIocCommunication(targetOsIoc, sourceProxyInteraction, osIocCommunicationName);
				osIocCommunication.setOsIocBufferLength(getDefaultComSendProxyComplexIocBufferLength(sourceProxyInteraction));
				osIocCommunication.getOsIocDataProperties().add(createFunctionTableIndexDataProperties());
			}
			sourceProxyInteraction.setOsIocCommunication(osIocCommunication);
			
			ProxyComSendImplementation sendImplementation = this.context.query.<ProxyComSendImplementation> findSingle(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceProxyInteraction));
			InternalEcuSender sender = sendImplementation.getParent().getInternalEcuSenders().get(0);
			VariableDataInstanceInSwc dataInstanceInSwc = sender.getSource().getPrototype();

			EcucReferrable signal = sendImplementation.getComSignal() != null
					? sendImplementation.getComSignal() : sendImplementation.getComSignalGroup();
			String osIocComForComplexName = (sourceProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					? Identifiers.createOsIocCommunicationPeriodicDataName(dataInstanceInSwc, signal)
					: Identifiers.createOsIocCommunicationImmediateDataName(dataInstanceInSwc, signal);
			
			OsIocCommunication osIocComForComplex;
			Optional<OsIocCommunication> inputOsIocForComplex = tryFindOsConfig(OS_IOC_COMMUNICATION, osIocComForComplexName);
			if (inputOsIocForComplex.isPresent()) {
				osIocComForComplex = inputOsIocForComplex.get();
			} else {
				osIocComForComplex = createIocCommunication(targetOsIoc, sourceProxyInteraction, osIocComForComplexName);
				osIocComForComplex.setOsIocBufferLength(1);
				osIocComForComplex.getOsIocDataProperties().add(createSignalDataDataProperties(sourceProxyInteraction));
			}
			sourceProxyInteraction.setOsIocCommunicationForComplexValue(osIocComForComplex);
		}
	}

	private OsIocCommunication createIocCommunication(OsIoc targetOsIoc, ComSendProxyInteraction sourceProxyInteraction, String osIocCommunicationName) throws ModelException {
		OsIocCommunication osIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
		osIocCommunication.setShortName(osIocCommunicationName);
		targetOsIoc.getOsIocCommunication().add(osIocCommunication);
		
		// ��������ECUC�Ǥ��뤳�Ȥ�����
		getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(osIocCommunication);

		// ����¦����ι���
		osIocCommunication.setOsIocReceiverProperties(createOsIocReceiverProperties(sourceProxyInteraction));

		// ����¦����ι���
		osIocCommunication.getOsIocSenderProperties().add(createOsIocSenderProperties(sourceProxyInteraction));
		return osIocCommunication;
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

	private OsIocDataProperties createSignalDataDataProperties(ComSendProxyInteraction sourceProxyInteraction, int index) {
		OsIocDataProperties signalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		signalDataDataProperties.setShortName(Identifiers.COM_PROXY_DATA_DATA_NAME);
		signalDataDataProperties.setOsIocDataType(sourceProxyInteraction.getSignalDataType());
		signalDataDataProperties.setOsIocDataPropertyIndex(index);
		return signalDataDataProperties;
	}

	private OsIocDataProperties createSignalIdDataProperties() {
		OsIocDataProperties signalIdDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		signalIdDataProperties.setShortName(Identifiers.COM_PROXY_SIGNAL_ID_DATA_NAME);
		signalIdDataProperties.setOsIocDataType(this.context.cache.comSignalIdType);
		signalIdDataProperties.setOsIocDataPropertyIndex(0);
		return signalIdDataProperties;
	}

	private OsIocDataProperties createSignalDataDataProperties(ComSendProxyInteraction sourceProxyInteraction) {
		OsIocDataProperties signalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		signalDataDataProperties.setShortName(Identifiers.COM_PROXY_DATA_DATA_NAME);
		signalDataDataProperties.setOsIocDataType(sourceProxyInteraction.getSignalDataType());
		return signalDataDataProperties;
	}

	private OsIocDataProperties createFunctionTableIndexDataProperties() {
		OsIocDataProperties signalDataDataProperties = EcucFactory.eINSTANCE.createOsIocDataProperties();
		signalDataDataProperties.setShortName(Identifiers.COM_PROXY_FUNCTION_INDEX_NAME);
		signalDataDataProperties.setOsIocDataType(this.context.cache.uint32Type);
		return signalDataDataProperties;
	}

	private int getDefaultComSendProxyIocBufferLength(ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		return this.context.query.find(isKindOf(PROXY_COM_SEND_IMPLEMENTATION).AND(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceProxyInteraction))).size();
	}

	private int getDefaultComSendProxyComplexIocBufferLength(ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		int count = 0; // ���Ȥ�ɬ��­�����ि�ᡢ0���饹�����Ȥ���
		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			if (proxyInteraction.getRequesterPartition() == sourceProxyInteraction.getRequesterPartition()) {
				if ((proxyInteraction.getProxy() instanceof PeriodicComSendProxy && sourceProxyInteraction.getProxy() instanceof PeriodicComSendProxy)
					|| (proxyInteraction.getProxy() instanceof ImmediateComSendProxy && sourceProxyInteraction.getProxy() instanceof ImmediateComSendProxy)) {
					ImplementationDataType type = proxyInteraction.getSignalDataType();
					type = type.getLeafImplementationDataType();
					if (!"VALUE".equals(type.getCategory())) {
						count++;
					}
				}
			}
		}
		return count;
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
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// S/R�μ¸��������������ˤ��ѹ��Ȥʤ�ECU�֤Ǥ�IOC�Хåե�����Ѥ��ʤ��ʤä��ط���,��Ƚ���else�����̲ᤷ�ʤ��褦�ˤʤäƤ���.
			ExternalEcuSender externalEcuSender = (ExternalEcuSender) sender;
			if (externalEcuSender.getSourceSignal() != null) {
				return Identifiers.createOsIocSenderPropertiesName(externalEcuSender.getSourceSignal());
			} else {
				return Identifiers.createOsIocSenderPropertiesName(externalEcuSender.getSourceSignalGroup());
			}
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
			osIocDataProperties.setOsIocInitValue(getValueSpecificationValueAsText(initValue));
		}
		osIocDataProperties.setOsIocDataType(dataInstance.getImplementationDataType());
		return osIocDataProperties;
	}

	private String getValueSpecificationValueAsText(ValueSpecification value) throws ModelException {
		value = EmfUtils.<ValueSpecification> exInvoke(value, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		String text = "";
		// TODO ����Ū�ˤ�¿�����ˤ��б� ex. {1, {2, 3}, 4}
		if (value instanceof ArrayValueSpecification) {
			for (ValueSpecification valueSpecification : ((ArrayValueSpecification) value).getElement()) {
				text += EmfUtils.<String> exInvoke(valueSpecification, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION) + ",";
			}
			int last = text.lastIndexOf(",");
			text = "{" + text.substring(0, last) + "}";
			return text;
		} else if (value instanceof RecordValueSpecification) {
			for (ValueSpecification valueSpecification : ((RecordValueSpecification) value).getField()) {
				text += EmfUtils.<String> exInvoke(valueSpecification, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION) + ",";
			}
			int last = text.lastIndexOf(",");
			text = "{" + text.substring(0, last) + "}";
			return text;
		} else {
			return EmfUtils.<String> exInvoke(value, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION);
		}
	}
	
	private void buildComSendSignalTrustedFunction() throws ModelException {
		Optional<TrustedFunctionComSendImplementation> imp = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (imp.isPresent()) {
			setupTrustedComSendSignalTrustedFunction(Identifiers.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME, SymbolNames.COM_SEND_SIGNAL_TRUSTED_FUNCTION_NAME);
		}
		imp = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (imp.isPresent()) {
			setupTrustedComSendSignalTrustedFunction(Identifiers.COM_SEND_SIGNAL_GROUP_TRUSTED_FUNCTION_NAME, SymbolNames.COM_SEND_SIGNAL_GROUP_TRUSTED_FUNCTION_NAME);
		}
	}

	private void setupTrustedComSendSignalTrustedFunction(String container, String function) throws ModelException {
		EcucPartition masterBswPartition = this.context.query.findSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
		String containerName = container + "_" + masterBswPartition.getShortName();
		Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION, containerName);
		if (!inputTrustedFunction.isPresent()) {
			OsApplicationTrustedFunction osTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
			osTrustedFunction.setShortName(containerName);
			osTrustedFunction.setOsTrustedFunctionName(function + "_" + masterBswPartition.getShortName());
			OsApplication targetOsApplication = masterBswPartition.getImplOsApplication().get(0);
			targetOsApplication.getOsApplicationTrustedFunction().add(osTrustedFunction);
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(osTrustedFunction);
		}
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

		Optional<OsApplicationTrustedFunction> inputWriteTrustedFunction;
		Boolean isEventSemantics = dataInstanceInSwc.isEventSemantics();
		if (isEventSemantics) {
			inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createRteBufferSendTrustedFunctionName(sender.getSource(), receiver.getSource()));
		} else {
			inputWriteTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
					Identifiers.createRteBufferWriteTrustedFunctionName(sender.getSource(), receiver.getSource()));
		}
		
		if (inputWriteTrustedFunction.isPresent()) {
			writeTrustedFunction = inputWriteTrustedFunction.get();

		} else {
			writeTrustedFunction = createRteBufferWriteTrustedFunction(sender, receiver, isEventSemantics);
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

	private OsApplicationTrustedFunction createRteBufferWriteTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver, Boolean isEventSemantics) {
		OsApplicationTrustedFunction osApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();

		if (isEventSemantics) {
			osApplicationTrustedFunction.setShortName(Identifiers.createRteBufferSendTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
			osApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createRteBufferSendTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));			
		} else {
			osApplicationTrustedFunction.setShortName(Identifiers.createRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
			osApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createRteBufferWriteTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));			
		}

		return osApplicationTrustedFunction;
	}

	private OsApplicationTrustedFunction createRteBufferInvalidateTrustedFunction(InternalEcuSender internalEcuSender, InternalEcuReceiver internalEcuReceiver) {
		OsApplicationTrustedFunction osApplicationTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		osApplicationTrustedFunction.setShortName(Identifiers.createRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		osApplicationTrustedFunction.setOsTrustedFunctionName(SymbolNames.createRteBufferInvalidateTrustedFunctionName(internalEcuSender.getSource(), internalEcuReceiver.getSource()));
		return osApplicationTrustedFunction;
	}
	
	private void buildCsTrustedFunction(Os targetOs) throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (ROperationInstanceInSwc operationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(operationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Optional<OsApplicationTrustedFunction> inputTrustedFunction = tryFindOsConfig(OS_APPLICATION_TRUSTED_FUNCTION,
								SymbolNames.createCallCstfName(operationInstanceInSwc));
						if (!inputTrustedFunction.isPresent()) {
							EcucPartition sourceRPartition = getEcucRPartition(operationInstanceInSwc);
							EcucPartition sourcePPartition = getEcucPPartition(operationInstanceInSwc);

							// COVERAGE (ecucPartition��null�ΤȤ���pEcucPartition��null�Ǥ��뤿�ᥫ�Х�å����ѥ����ʤ��������ɥ�ӥ塼������ʤ����Ȥ��ǧ)
							if (sourceRPartition != null && sourcePPartition != null
									&& !sourceRPartition.isTrusted() && sourcePPartition.isTrusted()) {
								// ���������ꡢ����������ξ�硢����ؿ�����
								OsApplication targetOsApplication = sourcePPartition.getImplOsApplication().get(0);
								OsApplicationTrustedFunction osTrustedFunction = createCsTrustedFunction(operationInstanceInSwc);
								targetOsApplication.getOsApplicationTrustedFunction().add(osTrustedFunction);
								getOrCreateGeneratedEcuConfiguration().getGeneratedOsTrustedFunction().add(osTrustedFunction);
							}
						}
					}
				}
			}
		}
	}
	
	private EcucPartition getEcucRPartition(OperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		PortInstanceInComposition portInComposition = null;
		OperationInstanceInComposition opInComposition;
		EcucPartition ecucPartition = null;
		try {
			opInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, operationInstanceInSwc));
			AssemblyOperationInstanceConnector connector = this.context.query.<AssemblyOperationInstanceConnector> findSingle(ref(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER, opInComposition));
			portInComposition = (PortInstanceInComposition)connector.getRequester().eContainer();
			if (portInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
				return null;
			}
			ecucPartition = portInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0);
		} catch (ModelException e) {
			// 1:0�ξ�����꤬¸�ߤ��ʤ�
		}

		return ecucPartition;
	}
	
	private EcucPartition getEcucPPartition(OperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		PortInstanceInComposition portInComposition = null;
		OperationInstanceInComposition opInComposition;
		EcucPartition ecucPartition = null;
		try {
			opInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, operationInstanceInSwc));
			AssemblyOperationInstanceConnector connector = this.context.query.<AssemblyOperationInstanceConnector> findSingle(ref(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER, opInComposition));
			portInComposition = (PortInstanceInComposition)connector.getProvider().eContainer();
			if (portInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
				return null;
			}
			ecucPartition = portInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0);
		} catch (ModelException e) {
			// 0:1�ξ�����꤬¸�ߤ��ʤ�
		}
		return ecucPartition;
	}

	private OsApplicationTrustedFunction createCsTrustedFunction(ROperationInstanceInSwc operationInstanceInSwc) {

		// ����ؿ�����
		OsApplicationTrustedFunction osTrustedFunction = EcucFactory.eINSTANCE.createOsApplicationTrustedFunction();
		osTrustedFunction.setShortName(SymbolNames.createCallCstfName(operationInstanceInSwc));
		osTrustedFunction.setOsTrustedFunctionName(SymbolNames.createCsTrustedFunctionName(operationInstanceInSwc));
		
		return osTrustedFunction;
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
