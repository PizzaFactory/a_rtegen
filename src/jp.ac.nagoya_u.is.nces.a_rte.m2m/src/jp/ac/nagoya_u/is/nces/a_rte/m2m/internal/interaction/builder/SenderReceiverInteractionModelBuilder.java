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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_DATA_INSTANCE_CONNECTOR;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
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
		for (VariableDataInstanceInComposition sourceDataInstanceInComposition : this.context.query
				.<VariableDataInstanceInComposition> find(hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED, true))) {
			targetInteractionRoot.getInteractionEnd().add(createInternalEcuSender(sourceDataInstanceInComposition));
		}
		for (VariableDataInstanceInComposition sourceDataInstanceInComposition : this.context.query
				.<VariableDataInstanceInComposition> find(hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED, true))) {
			targetInteractionRoot.getInteractionEnd().add(createInternalEcuReceiver(sourceDataInstanceInComposition));
		}
	}

	private InternalEcuSender createInternalEcuSender(VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		EcucPartition ownerPartition = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);

		InternalEcuSender destSender = InteractionFactory.eINSTANCE.createInternalEcuSender();
		destSender.setOwnerPartition(ownerPartition);
		destSender.setSource(sourceDataInstanceInComposition);
		return destSender;
	}

	private InternalEcuReceiver createInternalEcuReceiver(VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		EcucPartition ownerPartition = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);

		InternalEcuReceiver destReceiver = InteractionFactory.eINSTANCE.createInternalEcuReceiver();
		destReceiver.setOwnerPartition(ownerPartition);
		destReceiver.setSource(sourceDataInstanceInComposition);
		return destReceiver;
	}

	private void buildExternalEcuPeers(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�֤�����¦������Ӽ���¦�ǡ������Ǥ�����
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> connectedDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (connectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			if (this.context.query.get(sourceComSignal, COM_SIGNAL_EX___IS_SENDER__COMSIGNAL)) {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuReceiver(sourceComSignal));
			} else {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuSender(sourceComSignal));
			}
		}

		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> connectedDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (connectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			if (this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___IS_SENDER__COMSIGNALGROUP)) {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuReceiver(sourceComSignalGroup));
			} else {
				targetInteractionRoot.getInteractionEnd().add(createExternalEcuSender(sourceComSignalGroup));
			}
		}
	}

	private ExternalEcuSender createExternalEcuSender(ComSignal sourceComSignal) {
		ExternalEcuSender destSender = InteractionFactory.eINSTANCE.createExternalEcuSender();
		destSender.setSourceSignal(sourceComSignal);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destSender.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destSender;
	}

	private ExternalEcuSender createExternalEcuSender(ComSignalGroup sourceComSignalGroup) {
		ExternalEcuSender destSender = InteractionFactory.eINSTANCE.createExternalEcuSender();
		destSender.setSourceSignalGroup(sourceComSignalGroup);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destSender.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destSender;
	}

	private ExternalEcuReceiver createExternalEcuReceiver(ComSignal sourceComSignal) {
		ExternalEcuReceiver destReceiver = InteractionFactory.eINSTANCE.createExternalEcuReceiver();
		destReceiver.setSourceSignal(sourceComSignal);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destReceiver.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destReceiver;
	}

	private ExternalEcuReceiver createExternalEcuReceiver(ComSignalGroup sourceComSignalGroup) {
		ExternalEcuReceiver destReceiver = InteractionFactory.eINSTANCE.createExternalEcuReceiver();
		destReceiver.setSourceSignalGroup(sourceComSignalGroup);

		if (this.context.cache.sourceMasterBswPartition.isPresent()) {
			destReceiver.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get());
		}
		return destReceiver;
	}

	private void buildIntraEcuInteractions(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�������¦������Ӽ���¦�ǡ������Ǵ֤Υ��󥿥饯����������
		for (AssemblyDataInstanceConnector sourceConnector : this.context.query.<AssemblyDataInstanceConnector> findByKind(ASSEMBLY_DATA_INSTANCE_CONNECTOR)) {
			InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceConnector.getProvider()));
			InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnector.getRequester()));

			ReceiveInteraction destReceiveInteraction = createIntraReceiveInteraction(sourceConnector, receiver);
			SendInteraction destSendInteraction = createIntraSendInteraction(sourceConnector, sender, receiver, destReceiveInteraction);

			targetInteractionRoot.getInteraction().add(destSendInteraction);
			targetInteractionRoot.getInteraction().add(destReceiveInteraction);
		}
	}

	private SendInteraction createIntraSendInteraction(AssemblyDataInstanceConnector sourceConnector, InternalEcuSender sender, InternalEcuReceiver receiver, ReceiveInteraction receiveInteraction) {
		SendInteraction destSendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		destSendInteraction.getSender().add(sender);

		destSendInteraction.setReceiveInteraction(receiveInteraction);
		return destSendInteraction;
	}

	private ReceiveInteraction createIntraReceiveInteraction(AssemblyDataInstanceConnector sourceConnector, InternalEcuReceiver receiver) {
		ReceiveInteraction destReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		destReceiveInteraction.getReceiver().add(receiver);
		return destReceiveInteraction;
	}

	private void buildInterEcuInteractions(InteractionRoot targetInteractionRoot) throws ModelException {
		// ECU�֤�����¦������Ӽ���¦�ǡ������Ǵ֤Υ��󥿥饯����������
		buildInterEcuInteractionsForComSignal(targetInteractionRoot);
		buildInterEcuInteractionsForComSignalGroup(targetInteractionRoot);
	}


	private void buildInterEcuInteractionsForComSignal(InteractionRoot targetInteractionRoot) throws ModelException {
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> sourceConnectedDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (sourceConnectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			Optional<ExternalEcuReceiver> optionalExtReceiver = this.context.query.tryFindSingle(ref(EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL, sourceComSignal));
			if (optionalExtReceiver.isPresent()) {
				// ECU��->ECU���Υ��󥿥饯��������
				ExternalEcuReceiver extReceiver = optionalExtReceiver.get();

				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver, destReceiveInteraction);

					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			} else {
				// ECU��->ECU��Υ��󥿥饯��������
				ExternalEcuSender extSender = this.context.query.<ExternalEcuSender> findSingle(ref(EXTERNAL_ECU_SENDER__SOURCE_SIGNAL, sourceComSignal));
				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnectedDataInstanceInComposition));

					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromExternalToInternal(sourceConnectedDataInstanceInComposition, receiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromExternalToInternal(sourceComSignal, sourceConnectedDataInstanceInComposition, extSender, receiver, destReceiveInteraction);

					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			}
		}
	}

	private void buildInterEcuInteractionsForComSignalGroup(InteractionRoot targetInteractionRoot) throws ModelException {
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceConnectedDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceConnectedDataInstanceInCompositions.isEmpty()) {
				continue;
			}
			
			Optional<ExternalEcuReceiver> optionalExtReceiver = this.context.query.tryFindSingle(ref(EXTERNAL_ECU_RECEIVER__SOURCE_SIGNAL_GROUP, sourceComSignalGroup));
			if (optionalExtReceiver.isPresent()) {
				// ECU��->ECU���Υ��󥿥饯��������
				ExternalEcuReceiver extReceiver = optionalExtReceiver.get();
				
				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromInternalToExternal(sourceConnectedDataInstanceInComposition, extReceiver, destReceiveInteraction);
					
					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			} else {
				// ECU��->ECU��Υ��󥿥饯��������
				ExternalEcuSender extSender = this.context.query.<ExternalEcuSender> findSingle(ref(EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP, sourceComSignalGroup));
				for (VariableDataInstanceInComposition sourceConnectedDataInstanceInComposition : sourceConnectedDataInstanceInCompositions) {
					InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, sourceConnectedDataInstanceInComposition));
					
					ReceiveInteraction destReceiveInteraction = createInterReceiveInteractionFromExternalToInternal(sourceConnectedDataInstanceInComposition, receiver);
					SendInteraction destSendInteraction = createInterSendInteractionFromExternalToInternal(sourceComSignalGroup, sourceConnectedDataInstanceInComposition, extSender, receiver, destReceiveInteraction);
					
					targetInteractionRoot.getInteraction().add(destSendInteraction);
					targetInteractionRoot.getInteraction().add(destReceiveInteraction);
				}
			}
		}
	}

	private SendInteraction createInterSendInteractionFromExternalToInternal(EcucContainer sourceComSignalOrComSignalGroup, VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuSender sender,
			InternalEcuReceiver receiver, ReceiveInteraction receiveInteraction) {
		SendInteraction destSendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		destSendInteraction.getSender().add(sender);
		destSendInteraction.setReceiveInteraction(receiveInteraction);
		return destSendInteraction;
	}

	private ReceiveInteraction createInterReceiveInteractionFromExternalToInternal(VariableDataInstanceInComposition sourceDataInstanceInComposition, InternalEcuReceiver receiver) {
		ReceiveInteraction destReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		destReceiveInteraction.getReceiver().add(receiver);
		return destReceiveInteraction;
	}

	private SendInteraction createInterSendInteractionFromInternalToExternal(VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuReceiver receiver,
			ReceiveInteraction receiveInteraction) throws ModelException {
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, sourceDataInstanceInComposition));

		SendInteraction destSendInteraction = InteractionFactory.eINSTANCE.createSendInteraction();
		destSendInteraction.getSender().add(sender);
		destSendInteraction.setReceiveInteraction(receiveInteraction);
		return destSendInteraction;
	}

	private ReceiveInteraction createInterReceiveInteractionFromInternalToExternal(VariableDataInstanceInComposition sourceDataInstanceInComposition, ExternalEcuReceiver receiver) {
		ReceiveInteraction destReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
		destReceiveInteraction.getReceiver().add(receiver);
		return destReceiveInteraction;
	}

	private void normalizeInteractions(InteractionRoot targetInteractionRoot) {
		// �������󥿥饯�����ο���������
		for (InternalEcuReceiver targetReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (targetReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			List<ReceiveInteraction> oldReceiveInteractions = Lists.newArrayList(targetReceiver.getReceiveInteraction());

			// �������ꤵ��Ƥ����������󥿥饯������꥽�����������
			targetReceiver.getReceiveInteraction().clear();
			for (ReceiveInteraction oldReceiveInteraction : oldReceiveInteractions) {
				EcoreUtil.remove(oldReceiveInteraction);
			}

			ReceiveInteraction destCombinedReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
			destCombinedReceiveInteraction.getReceiver().add(targetReceiver);
			targetInteractionRoot.getInteraction().add(destCombinedReceiveInteraction);

			// �������󥿥饯�����λ������«�ͤ��������󥿥饯�������֤�����
			for (ReceiveInteraction oldReceiveInteraction : oldReceiveInteractions) {
				for (SendInteraction targetSendInteraction : Lists.newArrayList(oldReceiveInteraction.getSendInteraction())) {
					targetSendInteraction.setReceiveInteraction(destCombinedReceiveInteraction);
				}
			}
		}
	}

	private void determinesRteComResponsibility() throws ModelException {
		// �ݡ�����³¿���١�����Ӽ���¦�ǡ������Ǥ����꺹�ۤ򸫤ơ��������̵�������ե��륿�μ�����RTE�ǹԤ�ɬ�פ����뤫��Ƚ�ꤹ��
		for (ExternalEcuSender targetSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			targetSender.setRequiresRteInvalidation(this.context.query.<Boolean> get(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteInitialization(this.context.query.<Boolean> get(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteFilter(this.context.query.<Boolean> get(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER));
		}
	}
}