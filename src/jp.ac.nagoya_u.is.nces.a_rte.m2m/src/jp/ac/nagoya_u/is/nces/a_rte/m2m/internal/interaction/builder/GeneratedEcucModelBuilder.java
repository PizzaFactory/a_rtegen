/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
 * 不足しているECUC情報を生成する． 入力モデル中に，生成対象のECUC情報が存在している場合は，入力されたECUC情報を使用する．
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

		// マルチコアにおける排他のためのスピンロックを追加
		if (targetOs.getOsOS().isMulticoreOs()) {
			buildRteInternalSpinlock(targetOs);
		}

		// プロキシCOM通信のためのタスク，イベント，IOCを追加
		Optional<ImmediateComSendProxy> immediateComSendProxy = this.context.query.tryFindSingleByKind(IMMEDIATE_COM_SEND_PROXY);
		if (immediateComSendProxy.isPresent()) {
			OsApplication targetOsApplication = immediateComSendProxy.get().getOwnerPartition().getImplOsApplication().get(0);
			buildComSendSignalImmediateOsEventAndTask(targetOs, targetOsApplication, immediateComSendProxy.get());
		}

		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			buildOsIocCommunication(getOrCreateOsIoc(targetOs), proxyInteraction);
		}

		// IOC送信のためのIOCを追加
		for (IocValueBufferImplementation sourceValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			buildOsIocCommunication(getOrCreateOsIoc(targetOs), sourceValueBufferImplementation);
		}

		// 信頼関数COM送信のための信頼関数を追加
		if (!this.context.query.findByKind(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).isEmpty()) {
			buildComSendSignalTrustedFunction(targetOs);
		}

		// 信頼関数RTEバッファ送信のための信頼関数を追加
		for (TrustedFunctionRteSendImplementation sourceSendImplementation : this.context.query.<TrustedFunctionRteSendImplementation> findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION)) {
			buildRteBufferSendTrustedFunction(sourceSendImplementation);
		}

		// 生成したECUCのソート
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
		// OSイベントの構築
		OsEvent osEvent;

		Optional<OsEvent> inputOsEvent = tryFindOsConfig(OS_EVENT, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_EVENT_NAME);
		if (inputOsEvent.isPresent()) {
			osEvent = inputOsEvent.get();

		} else {
			osEvent = createComSendSignalImmediateOsEvent();
			targetOs.getOsEvent().add(osEvent);

			// 生成したECUCであることを明示
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsEvent().add(osEvent);
		}

		sourceComSendProxy.setOsEvent(osEvent);

		// OSタスクの構築
		Optional<OsTask> inputOsTask = tryFindOsConfig(OS_TASK, Identifiers.COM_SEND_SIGNAL_IMMEDIATE_TASK_NAME);
		if (!inputOsTask.isPresent()) {
			OsTask osTask = createComSendSignalImmediateOsTask(targetOs, sourceComSendProxy, osEvent);
			targetOsApplication.getOsAppTask().add(osTask);

			// 生成したECUCであることを明示
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
			// IOCの構築
			osIocCommunication = EcucFactory.eINSTANCE.createOsIocCommunication();
			osIocCommunication.setShortName(Identifiers.createOsIocCommunicationName(sourceProxyInteraction));
			osIocCommunication.setOsIocBufferLength(getDefaultComSendProxyIocBufferLength(sourceProxyInteraction));
			targetOsIoc.getOsIocCommunication().add(osIocCommunication);

			// 生成したECUCであることを明示
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(osIocCommunication);

			// データ情報の構築
			osIocCommunication.getOsIocDataProperties().add(createSignalIdDataProperties());
			osIocCommunication.getOsIocDataProperties().add(createSignalDataDataProperties(sourceProxyInteraction));

			// 受信側情報の構築
			osIocCommunication.setOsIocReceiverProperties(createOsIocReceiverProperties(sourceProxyInteraction));

			// 送信側情報の構築
			osIocCommunication.getOsIocSenderProperties().add(createOsIocSenderProperties(sourceProxyInteraction));
		}

		// 実装に使用するIOCをひもづけ
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

		// IOC通信を構築
		OsIocCommunication osIocCommunication;

		Optional<OsIocCommunication> inputOsIocCommunication = tryFindOsConfig(OS_IOC_COMMUNICATION, Identifiers.createOsIocCommunicationName(dataInstance));
		if (inputOsIocCommunication.isPresent()) {
			osIocCommunication = inputOsIocCommunication.get();

		} else {
			osIocCommunication = createOsIocCommunication(dataInstance);
			targetOsIoc.getOsIocCommunication().add(osIocCommunication);

			// 生成したECUCであることを明示
			getOrCreateGeneratedEcuConfiguration().getGeneratedOsIocCommunication().add(osIocCommunication);

			// データ情報の構築
			osIocCommunication.getOsIocDataProperties().add(createOsIocDataProperties(receiver, dataInstance));

			// 受信側情報の構築
			osIocCommunication.setOsIocReceiverProperties(createOsIocReceiverProperties(sourceValueBufferImplementation));
		}

		// 実装に使用するIOCをひもづけ
		sourceValueBufferImplementation.setOsIocCommunication(osIocCommunication);

		// 送信側情報を構築

		// 初期化用に，ループバックの送信側情報を構築
		if (!dataInstance.isEventSemantics()) {
			Optional<EcucReferrable> inputLoopbackOsIocSenderProperties = tryFindOsConfig(osIocCommunication, OS_IOC_SENDER_PROPERTIES,
					Identifiers.createOsIocSenderPropertiesName(receiver.getSource()));
			if (!inputLoopbackOsIocSenderProperties.isPresent()) {
				osIocCommunication.getOsIocSenderProperties().add(createLoopbackOsIocSenderProperties(receiver));
			}
		}

		// 各送信者用の送信側情報を構築
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

			// 実装に使用するIOCセンダをひもづけ
			iocSendImplementation.setOcIocSenderProperties(osIocSenderProperties);
		}

		// OsIocSenderPropertiesをソート
		this.sorter.sortEcucContainers(osIocCommunication.getOsIocSenderProperties());

		// senderIdを割り振り（送信者数がNの場合のみ）
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

		// データ書き込み用の信頼関数の構築
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

		// データ無効化用の信頼関数の構築
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
