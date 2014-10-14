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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_DATA_INSTANCE_CONNECTOR;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class SenderReceiverInteractionModelBuilder {
	private final InteractionModelBuildContext context;

	public SenderReceiverInteractionModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildInternalEcuPeers(this.context.cache.interactionRoot);
		buildExternalEcuPeers(this.context.cache.interactionRoot);
		buildIntraEcuInteractions(this.context.cache.interactionRoot);
		buildInterEcuInteractions(this.context.cache.interactionRoot);
		normalizeInteractions(this.context.cache.interactionRoot);

		determinesRteComResponsibility();
	}

	private void buildInternalEcuPeers(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�������¦������Ӽ���¦�ǡ������Ǥ�����
		for (VariableDataInstanceInComposition dataInstanceInComposition : this.context.query
				.<VariableDataInstanceInComposition> find(hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED, true))) {
			targetInteractionRoot.getInteractionEnd().add(createInternalEcuSender(dataInstanceInComposition));
		}
		for (VariableDataInstanceInComposition dataInstanceInComposition : this.context.query
				.<VariableDataInstanceInComposition> find(hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED, true))) {
			targetInteractionRoot.getInteractionEnd().add(createInternalEcuReceiver(dataInstanceInComposition));
		}
	}

	private InternalEcuSender createInternalEcuSender(VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		EcucPartition ownerPartition = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);

		InternalEcuSender sender = InteractionFactory.eINSTANCE.createInternalEcuSender();
		sender.setOwnerPartition(ownerPartition);
		sender.setSource(sourceDataInstanceInComposition);
		return sender;
	}

	private InternalEcuReceiver createInternalEcuReceiver(VariableDataInstanceInComposition dataInstanceInComposition) throws ModelException {
		EcucPartition ownerPartition = this.context.query.get(dataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);

		InternalEcuReceiver receiver = InteractionFactory.eINSTANCE.createInternalEcuReceiver();
		receiver.setOwnerPartition(ownerPartition);
		receiver.setSource(dataInstanceInComposition);
		return receiver;
	}

	private void buildExternalEcuPeers(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�֤�����¦������Ӽ���¦�ǡ������Ǥ�����
		for (ComSignal signal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (dataInstanceInCompositionList.isEmpty()) {
				continue;
			}

			if (this.context.query.get(signal, COM_SIGNAL_EX___IS_SENDER__COMSIGNAL)) {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuReceiver(signal));
			} else {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuSender(signal));
			}
		}
	}

	private ExternalEcuSender createExternalEcuSender(ComSignal sourceComSignal) {
		ExternalEcuSender sender = InteractionFactory.eINSTANCE.createExternalEcuSender();
		sender.setSource(sourceComSignal);
		if (this.context.cache.masterBswPartition.isPresent()) {
			sender.setOwnerPartition(this.context.cache.masterBswPartition.get());
		}
		return sender;
	}

	private ExternalEcuReceiver createExternalEcuReceiver(ComSignal sourceComSignal) {
		ExternalEcuReceiver receiver = InteractionFactory.eINSTANCE.createExternalEcuReceiver();
		receiver.setSource(sourceComSignal);
		if (this.context.cache.masterBswPartition.isPresent()) {
			receiver.setOwnerPartition(this.context.cache.masterBswPartition.get());
		}
		return receiver;
	}

	private void buildIntraEcuInteractions(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�������¦������Ӽ���¦�ǡ������Ǵ֤Υ��󥿥饯����������
		for (AssemblyDataInstanceConnector sourceConnector : this.context.query.<AssemblyDataInstanceConnector> findByKind(ASSEMBLY_DATA_INSTANCE_CONNECTOR)) {
			InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceConnector.getProvider()));
			InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnector.getRequester()));

			ReceiveInteraction receiveInteraction = createReceiveInteraction(sourceConnector, receiver);
			SendInteraction sendInteraction = createSendInteraction(sourceConnector, sender, receiver, receiveInteraction);

			targetInteractionRoot.getInteraction().add(sendInteraction);
			targetInteractionRoot.getInteraction().add(receiveInteraction);
		}
	}

	private SendInteraction createSendInteraction(AssemblyDataInstanceConnector sourceConnector, InternalEcuSender sender, InternalEcuReceiver receiver, ReceiveInteraction receiveInteraction) {
		SendInteraction sendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		sendInteraction.getSender().add(sender);

		sendInteraction.setReceiveInteraction(receiveInteraction);
		return sendInteraction;
	}

	private ReceiveInteraction createReceiveInteraction(AssemblyDataInstanceConnector sourceConnector, InternalEcuReceiver receiver) {
		ReceiveInteraction receiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		receiveInteraction.getReceiver().add(receiver);
		return receiveInteraction;
	}

	private void buildInterEcuInteractions(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�֤�����¦������Ӽ���¦�ǡ������Ǵ֤Υ��󥿥饯����������
		for (ComSignal signal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (dataInstanceInCompositionList.isEmpty()) {
				continue;
			}

			Optional<ExternalEcuReceiver> optionalExtReceiver = this.context.query.tryFindSingle(ref(EXTERNAL_ECU_RECEIVER__SOURCE, signal));
			if (optionalExtReceiver.isPresent()) {
				// ECU��->ECU���Υ��󥿥饯��������
				ExternalEcuReceiver extReceiver = optionalExtReceiver.get();

				for (VariableDataInstanceInComposition dataInstanceInComposition : dataInstanceInCompositionList) {
					ReceiveInteraction receiveInteraction = createReceiveInteractionToExternalEcu(dataInstanceInComposition, signal, extReceiver);
					SendInteraction sendInteraction = createSendInteractionFromInternalEcu(dataInstanceInComposition, signal, extReceiver, receiveInteraction);

					targetInteractionRoot.getInteraction().add(sendInteraction);
					targetInteractionRoot.getInteraction().add(receiveInteraction);
				}
			} else {
				// ECU��->ECU��Υ��󥿥饯��������
				ExternalEcuSender extSender = this.context.query.<ExternalEcuSender> findSingle(ref(EXTERNAL_ECU_SENDER__SOURCE, signal));
				for (VariableDataInstanceInComposition dataInstanceInComposition : dataInstanceInCompositionList) {
					InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));

					ReceiveInteraction receiveInteraction = createReceiveInteractionFromExternalEcu(signal, dataInstanceInComposition, receiver);
					SendInteraction sendInteraction = createSendInteraction(signal, dataInstanceInComposition, extSender, receiver, receiveInteraction);

					targetInteractionRoot.getInteraction().add(sendInteraction);
					targetInteractionRoot.getInteraction().add(receiveInteraction);
				}
			}
		}
	}

	private SendInteraction createSendInteraction(ComSignal sourceComSignal, VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuSender extSender,
			InternalEcuReceiver receiver, ReceiveInteraction receiveInteraction) {
		SendInteraction sendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		sendInteraction.getSender().add(extSender);
		sendInteraction.setReceiveInteraction(receiveInteraction);
		return sendInteraction;
	}

	private ReceiveInteraction createReceiveInteractionFromExternalEcu(ComSignal sourceComSignal, VariableDataInstanceInComposition sourceDataInstanceInComposition, InternalEcuReceiver receiver) {
		ReceiveInteraction receiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		receiveInteraction.getReceiver().add(receiver);
		return receiveInteraction;
	}

	private SendInteraction createSendInteractionFromInternalEcu(VariableDataInstanceInComposition sourceDataInstanceInComposition, ComSignal sourceComSignal, ExternalEcuReceiver extReceiver,
			ReceiveInteraction receiveInteraction) throws ModelException {
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));
		SendInteraction sendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		sendInteraction.getSender().add(sender);
		sendInteraction.setReceiveInteraction(receiveInteraction);
		return sendInteraction;
	}

	private ReceiveInteraction createReceiveInteractionToExternalEcu(VariableDataInstanceInComposition sourceDataInstanceInComposition, ComSignal sourceComSignal, ExternalEcuReceiver extReceiver) {
		ReceiveInteraction receiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		receiveInteraction.getReceiver().add(extReceiver);
		return receiveInteraction;
	}

	private void normalizeInteractions(InteractionRoot targetInteractionRoot) {
		// �������󥿥饯�����ο���������
		for (InternalEcuReceiver receiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (receiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			List<ReceiveInteraction> oldReceiveInteractions = Lists.newArrayList(receiver.getReceiveInteraction());

			// �������ꤵ��Ƥ����������󥿥饯������꥽�����������
			receiver.getReceiveInteraction().clear();
			for (ReceiveInteraction receiveInteraction : oldReceiveInteractions) {
				EcoreUtil.remove(receiveInteraction);
			}

			ReceiveInteraction combinedReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
			combinedReceiveInteraction.getReceiver().add(receiver);
			targetInteractionRoot.getInteraction().add(combinedReceiveInteraction);

			// �������󥿥饯�����λ������«�ͤ��������󥿥饯�������֤�����
			for (ReceiveInteraction receiveInteraction : oldReceiveInteractions) {
				for (SendInteraction sendInteraction : Lists.newArrayList(receiveInteraction.getSendInteraction())) {
					sendInteraction.setReceiveInteraction(combinedReceiveInteraction);
				}
			}
		}
	}

	private void determinesRteComResponsibility() throws ModelException {
		// �ݡ�����³¿���١�����Ӽ���¦�ǡ������Ǥ����꺹�ۤ򸫤ơ�RTE���б���ɬ�פ���Ƚ�Ǥ���
		for (ExternalEcuSender targetSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			targetSender.setRequiresRteInvalidation(EmfUtils.<Boolean> exInvoke(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteInitialization(EmfUtils.<Boolean> exInvoke(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteFilter(EmfUtils.<Boolean> exInvoke(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER));
		}
	}
}