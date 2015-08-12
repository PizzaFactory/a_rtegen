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
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilterTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

public class SenderReceiverImplementationModelBuilder {
	private final InteractionModelBuildContext context;

	public SenderReceiverImplementationModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildReceiveImplementations();
		buildSendImplementations();
		optimizeComValueBufferImplementations();
	}

	private void buildReceiveImplementations() throws ModelException {
		// ReceiveInteraction��Implementation������
		for (InternalEcuReceiver targetReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (targetReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			ReceiveInteraction targetReceiveInteraction = targetReceiver.getReceiveInteraction().get(0);

			buildReceiveImplementation(targetReceiveInteraction, targetReceiver);
		}
	}

	private void buildReceiveImplementation(ReceiveInteraction targetReceiveInteraction, InternalEcuReceiver receiver) throws ModelException {
		RVariableDataInstanceInSwc dataInstance = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		boolean isIntraEcuExists = !receiver.getInternalEcuSenders().isEmpty();
		boolean isInterEcuExists = !receiver.getExternalEcuSenders().isEmpty();
		boolean isInterPartitionExists = this.context.query.exists(targetReceiveInteraction.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true));
		if (dataInstance.isFilterEnabled() && DataFilterTypeEnum.NEVER.equals(dataInstance.getFilter().getDataFilterType())) {
			// �ե��륿NEVER�ξ�硤�������������ʤ�
			return;
		}

		// ���ݻ��ѤΥХåե�������
		EcucPartition ownerPartition = this.context.query.get(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION);
		if (isMakeRteValueBuffer(targetReceiveInteraction, receiver, dataInstance)) {
			RteValueBufferImplementation valueBufferImplementation = InteractionFactory.eINSTANCE.createRteValueBufferImplementation();
			valueBufferImplementation.setOwnerPartition(ownerPartition);
			targetReceiveInteraction.setValueBufferImplementation(valueBufferImplementation);
		} else {
			IocValueBufferImplementation iocBufferImplementation = InteractionFactory.eINSTANCE.createIocValueBufferImplementation();
			iocBufferImplementation.setOwnerPartition(ownerPartition);
			targetReceiveInteraction.setValueBufferImplementation(iocBufferImplementation);
		}

		targetReceiveInteraction.getValueBufferImplementation().setHasStatus(dataInstance.isAliveTimeoutEnabled() && (isInterEcuExists || isInterPartitionExists));

		// �ե��륿�ѤΥХåե�������
		boolean anySenderRequiresRteFilter = isIntraEcuExists || this.context.query.exists(receiver.getExternalEcuSenders(), hasAttr(EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER, true));
		if (EmfUtils.<Boolean> exInvoke(dataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC) && anySenderRequiresRteFilter) {
			FilterBufferImplementation filterBufferImplementation = InteractionFactory.eINSTANCE.createFilterBufferImplementation();
			filterBufferImplementation.setOwnerPartition(ownerPartition);
			targetReceiveInteraction.setFilterBufferImplementation(filterBufferImplementation);
		}
	}

	private boolean isMakeRteValueBuffer(ReceiveInteraction targetReceiveInteraction, InternalEcuReceiver receiver, RVariableDataInstanceInSwc dataInstance) {
		boolean isInterEcuExists = !receiver.getExternalEcuSenders().isEmpty();
		boolean isInterPartitionExists = this.context.query.exists(targetReceiveInteraction.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true));
		if (!isInterPartitionExists) {
			return true;
		}
		if (dataInstance.isFilterEnabled()) {
			return true;
		}
		if (dataInstance.isAliveTimeoutEnabled()) {
			return true;
		}
		if (dataInstance.isInvalidationEnabled()) {
			return true;
		}
		if (!isInterEcuExists) {
			// targetReceiveInteraction���Sender����ˣ��ĤǤ�OwnerPartition��Untrusted�Ǥ���С�false���֤�
			for (SendInteraction sendInteraction : targetReceiveInteraction.getSendInteraction()) {
				for (Sender sender : sendInteraction.getSender()) {
					if (!sender.getOwnerPartition().isTrusted()) {
						return false;
					}
				}
			}
			return true;
		} else {
			return true;
		}
	}

	private void buildSendImplementations() throws ModelException {
		// SendInteraction��Implementation������
		for (Sender targetSender : this.context.query.<Sender> findByKind(SENDER)) {
			for (SendInteraction targetSendInteraction : targetSender.getSendInteraction()) {
				buildSendImplementation(targetSendInteraction, targetSender);
			}
		}
	}

	private void buildSendImplementation(SendInteraction targetSendInteraction, Sender sender) throws ModelException {
		Receiver receiver = targetSendInteraction.getReceiveInteraction().getReceiver().get(0);
		if (receiver instanceof InternalEcuReceiver) {
			// ECU��
			if (targetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof RteValueBufferImplementation) {
				if (!targetSendInteraction.isInterPartition() || sender.getOwnerPartition().isTrusted()) {
					// RTE�Хåե�����
					RteSendImplementation rteSendImplementation = InteractionFactory.eINSTANCE.createRteSendImplementation();
					targetSendInteraction.setImplementation(rteSendImplementation);
				} else {
					// ����ؿ���ͳRTE�Хåե�����
					TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionRteSendImplementation();
					targetSendInteraction.setImplementation(trustedFunctionRteSendImplementation);
				}
			} else if (targetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof IocValueBufferImplementation) {
				// IOC����
				IocSendImplementation iocSendImplementation = InteractionFactory.eINSTANCE.createIocSendImplementation();
				targetSendInteraction.setImplementation(iocSendImplementation);
			}
		} else {
			// ECU��
			ExternalEcuReceiver externalEcuReceiver = (ExternalEcuReceiver) receiver;
			ComSignal comSignal = externalEcuReceiver.getSourceSignal();
			ComSignalGroup comSignalGroup = externalEcuReceiver.getSourceSignalGroup();
			if (sender.getOwnerPartition() == null) {
				// �ѡ��ƥ���������ʤ��ξ�硤ľ��COM����
				DirectComSendImplementation directComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
				directComSendImplementation.setComSignal(comSignal);
				directComSendImplementation.setComSignalGroup(comSignalGroup);
				targetSendInteraction.setImplementation(directComSendImplementation);
			} else if (this.context.query.get(sender.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION)) {
				// �ޥ�������
				if (sender.getOwnerPartition().isTrusted()) {
					// ����ѡ��ƥ������ξ�硤ľ��COM����
					DirectComSendImplementation directComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
					directComSendImplementation.setComSignal(comSignal);
					directComSendImplementation.setComSignalGroup(comSignalGroup);
					targetSendInteraction.setImplementation(directComSendImplementation);
				} else {
					// ����ѡ��ƥ������ξ�硤����ؿ���ͳCOM����
					TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionComSendImplementation();
					trustedFunctionComSendImplementation.setComSignal(comSignal);
					trustedFunctionComSendImplementation.setComSignalGroup(comSignalGroup);
					targetSendInteraction.setImplementation(trustedFunctionComSendImplementation);
				}
			} else {
				// ���졼�֥���
				if ((comSignal != null && comSignal.transfersImmediately()) ||
					(comSignalGroup != null && comSignalGroup.transfersImmediately())) {
					ImmediateProxyComSendImplementation immediateProxyComSendImplementation = InteractionFactory.eINSTANCE.createImmediateProxyComSendImplementation();
					immediateProxyComSendImplementation.setComSignal(comSignal);
					immediateProxyComSendImplementation.setComSignalGroup(comSignalGroup);
					targetSendInteraction.setImplementation(immediateProxyComSendImplementation);
				} else {
					PeriodicProxyComSendImplementation periodicProxyComSendImplementation = InteractionFactory.eINSTANCE.createPeriodicProxyComSendImplementation();
					periodicProxyComSendImplementation.setComSignal(comSignal);
					periodicProxyComSendImplementation.setComSignalGroup(comSignalGroup);
					targetSendInteraction.setImplementation(periodicProxyComSendImplementation);
				}
			}
		}
	}

	private void optimizeComValueBufferImplementations() throws ModelException {
		// Com������Хå������פʾ���Com�������ѹ�
		for (InternalEcuReceiver targetInternalEcuReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (targetInternalEcuReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			ReceiveInteraction targetReceiveInteraction = targetInternalEcuReceiver.getReceiveInteraction().get(0);
			optimizeComValueBufferImplementation(targetReceiveInteraction, targetInternalEcuReceiver);
		}
	}

	private void optimizeComValueBufferImplementation(ReceiveInteraction targetReceiveInteraction, InternalEcuReceiver receiver) throws ModelException {
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		// Receive RTE�Хåե��Ǥʤ����Ϻ�Ŭ���оݳ�
		if (!(targetReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation)) {
			return;
		}

		// ���ޥ�ƥ�����Ƚ��:���٥�Ȥξ��Ϻ�Ŭ���оݳ�
		if (dataInstanceInSwc.isEventSemantics()) {
			return;
		}

		// �����ॢ���Ȥ����ꤵ��Ƥ�����Ϻ�Ŭ���оݳ�
		if (dataInstanceInSwc.isAliveTimeoutEnabled()) {
			return;
		}

		// �����Ԥ�ʣ���ξ��Ϻ�Ŭ���оݳ�
		// �����Ԥ�ExternalEcuSender��¸�ߤ��ʤ����Ϻ�Ŭ���оݳ�
		if (receiver.hasMultipleSenders() || receiver.getExternalEcuSenders().isEmpty()) {
			return;
		}

		// RTE�ˤ��̵�������⤷���ϥե��륿��ɬ�פʾ��Ϻ�Ŭ���оݳ�
		ExternalEcuSender externalEcuSender = receiver.getExternalEcuSenders().get(0);
		if (externalEcuSender.getRequiresRteInvalidation() || externalEcuSender.getRequiresRteInitialization() || externalEcuSender.getRequiresRteFilter()) {
			return;
		}

		// A-COM�ȼ����ͥ��ץ���������ʳ��ϥޥ���������BSWPartition�Ǥʤ����Ϻ�Ŭ���оݳ�
		if (!this.context.options.comMultiCore) {
			if (receiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, receiver.getOwnerCore())));
				if ((receiver.getOwnerPartition() != bswPartition) || 
					(this.context.query.get(receiver.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION) == Boolean.FALSE)) {
					return;
				}
			}
		} else {
			// BSWPartition�Ǥʤ����Ϻ�Ŭ���оݳ�
			if (receiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, receiver.getOwnerCore())));
				if (receiver.getOwnerPartition() != bswPartition) {
					return;
				}
			}
		}

		// ��Ŭ����»�
		// SendInteraction��Implementation�������롣
		for (SendInteraction targetSendInteraction : targetReceiveInteraction.getSendInteraction()) {
			targetSendInteraction.setImplementation(null);
		}

		// ReceiveInteraction��Implementaition��Com�Хåե����ѹ����롣
		ComSignal comSignal = externalEcuSender.getSourceSignal();
		ComSignalGroup comSignalGroup = externalEcuSender.getSourceSignalGroup();
		ComValueBufferImplementation comValueBufferImplementation = InteractionFactory.eINSTANCE.createComValueBufferImplementation();
		comValueBufferImplementation.setComSignal(comSignal);
		comValueBufferImplementation.setComSignalGroup(comSignalGroup);
		targetReceiveInteraction.setValueBufferImplementation(comValueBufferImplementation);
	}
}