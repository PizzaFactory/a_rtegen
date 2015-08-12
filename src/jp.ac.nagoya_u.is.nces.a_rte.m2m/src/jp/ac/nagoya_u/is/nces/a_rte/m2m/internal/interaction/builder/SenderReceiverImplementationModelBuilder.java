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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
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

public class SenderReceiverImplementationModelBuilder {
	private final InteractionModelBuildContext context;
	private final InteractionRules interactionRules;

	public SenderReceiverImplementationModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
		this.interactionRules = new InteractionRules(context);
	}

	public void build() throws ModelException {
		buildReceiveImplementations();
		buildSendImplementations();
		optimizeComValueBufferImplementations();
	}

	private void buildReceiveImplementations() throws ModelException {
		// ReceiveInteraction��Implementation������
		for (InternalEcuReceiver sourceReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (sourceReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			ReceiveInteraction sourceAndTargetReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);

			buildReceiveImplementation(sourceAndTargetReceiveInteraction, sourceReceiver);
		}
	}

	private void buildReceiveImplementation(ReceiveInteraction sourceAndTargetReceiveInteraction, InternalEcuReceiver sourceReceiver) throws ModelException {
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		boolean isIntraEcuExists = !sourceReceiver.getInternalEcuSenders().isEmpty();
		boolean isInterEcuExists = !sourceReceiver.getExternalEcuSenders().isEmpty();
		boolean isInterPartitionExists = this.context.query.exists(sourceAndTargetReceiveInteraction.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true));

		if (sourceDataInstance.isFilterEnabled() && DataFilterTypeEnum.NEVER.equals(sourceDataInstance.getFilter().getDataFilterType())) {
			// �ե��륿NEVER�ξ�硤�������������ʤ�
			return;
		}

		// ���ݻ��ѤΥХåե�������
		if (this.interactionRules.usesRteBufferForReceiveInteraction(sourceAndTargetReceiveInteraction, sourceReceiver)) {
			RteValueBufferImplementation destValueBufferImplementation = InteractionFactory.eINSTANCE.createRteValueBufferImplementation();
			destValueBufferImplementation.setOwnerPartition(sourceReceiver.getOwnerPartition());
			sourceAndTargetReceiveInteraction.setValueBufferImplementation(destValueBufferImplementation);
		} else {
			IocValueBufferImplementation destValueBufferImplementation = InteractionFactory.eINSTANCE.createIocValueBufferImplementation();
			destValueBufferImplementation.setOwnerPartition(sourceReceiver.getOwnerPartition());
			sourceAndTargetReceiveInteraction.setValueBufferImplementation(destValueBufferImplementation);
		}

		sourceAndTargetReceiveInteraction.getValueBufferImplementation().setHasStatus(sourceDataInstance.isAliveTimeoutEnabled() && (isInterEcuExists || isInterPartitionExists));

		// �ե��륿�ѤΥХåե�������
		boolean anySenderRequiresRteFilter = isIntraEcuExists || this.context.query.exists(sourceReceiver.getExternalEcuSenders(), hasAttr(EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER, true));
		if (this.context.query.<Boolean> get(sourceDataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_VARIABLE__RVARIABLEDATAINSTANCEINSWC) && anySenderRequiresRteFilter) {
			FilterBufferImplementation destFilterBufferImplementation = InteractionFactory.eINSTANCE.createFilterBufferImplementation();
			destFilterBufferImplementation.setOwnerPartition(sourceReceiver.getOwnerPartition());
			sourceAndTargetReceiveInteraction.setFilterBufferImplementation(destFilterBufferImplementation);
		}
	}

	private void buildSendImplementations() throws ModelException {
		// SendInteraction��Implementation������
		for (Sender sourceSender : this.context.query.<Sender> findByKind(SENDER)) {
			for (SendInteraction sourceAndTargetSendInteraction : sourceSender.getSendInteraction()) {
				buildSendImplementation(sourceAndTargetSendInteraction, sourceSender);
			}
		}
	}

	private void buildSendImplementation(SendInteraction sourceAndTargetSendInteraction, Sender sourceSender) throws ModelException {
		Receiver sourceReceiver = sourceAndTargetSendInteraction.getReceiveInteraction().getReceiver().get(0);

		if (sourceReceiver instanceof InternalEcuReceiver) {
			// ECU��
			if (sourceAndTargetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof RteValueBufferImplementation) {
				if (!sourceAndTargetSendInteraction.isInterPartition() || sourceSender.getOwnerPartition().isTrusted()) {
					// RTE�Хåե�����
					RteSendImplementation destRteSendImplementation = InteractionFactory.eINSTANCE.createRteSendImplementation();
					sourceAndTargetSendInteraction.setImplementation(destRteSendImplementation);
				} else {
					// ����ؿ���ͳRTE�Хåե�����
					TrustedFunctionRteSendImplementation destTrustedFunctionRteSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionRteSendImplementation();
					sourceAndTargetSendInteraction.setImplementation(destTrustedFunctionRteSendImplementation);
				}
			} else if (sourceAndTargetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof IocValueBufferImplementation) {
				// IOC����
				IocSendImplementation destIocSendImplementation = InteractionFactory.eINSTANCE.createIocSendImplementation();
				sourceAndTargetSendInteraction.setImplementation(destIocSendImplementation);
			}
		} else {
			// ECU��
			ExternalEcuReceiver sourceExternalEcuReceiver = (ExternalEcuReceiver) sourceReceiver;

			ComSignal sourceComSignal = sourceExternalEcuReceiver.getSourceSignal();
			ComSignalGroup sourceComSignalGroup = sourceExternalEcuReceiver.getSourceSignalGroup();

			if (sourceSender.getOwnerPartition() == null) {
				// �ѡ��ƥ���������ʤ��ξ�硤ľ��COM����
				DirectComSendImplementation destDirectComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
				destDirectComSendImplementation.setComSignal(sourceComSignal);
				destDirectComSendImplementation.setComSignalGroup(sourceComSignalGroup);
				sourceAndTargetSendInteraction.setImplementation(destDirectComSendImplementation);
			} else if (this.context.query.get(sourceSender.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION)) {
				// �ޥ�������
				if (sourceSender.getOwnerPartition().isTrusted()) {
					// ����ѡ��ƥ������ξ�硤ľ��COM����
					DirectComSendImplementation destDirectComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
					destDirectComSendImplementation.setComSignal(sourceComSignal);
					destDirectComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destDirectComSendImplementation);
				} else {
					// ����ѡ��ƥ������ξ�硤����ؿ���ͳCOM����
					TrustedFunctionComSendImplementation destTrustedFunctionComSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionComSendImplementation();
					destTrustedFunctionComSendImplementation.setComSignal(sourceComSignal);
					destTrustedFunctionComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destTrustedFunctionComSendImplementation);
				}
			} else {
				// ���졼�֥���
				if ((sourceComSignal != null && sourceComSignal.transfersImmediately()) ||
					(sourceComSignalGroup != null && sourceComSignalGroup.transfersImmediately())) {
					ImmediateProxyComSendImplementation destImmediateProxyComSendImplementation = InteractionFactory.eINSTANCE.createImmediateProxyComSendImplementation();
					destImmediateProxyComSendImplementation.setComSignal(sourceComSignal);
					destImmediateProxyComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destImmediateProxyComSendImplementation);
				} else {
					PeriodicProxyComSendImplementation destPeriodicProxyComSendImplementation = InteractionFactory.eINSTANCE.createPeriodicProxyComSendImplementation();
					destPeriodicProxyComSendImplementation.setComSignal(sourceComSignal);
					destPeriodicProxyComSendImplementation.setComSignalGroup(sourceComSignalGroup);
					sourceAndTargetSendInteraction.setImplementation(destPeriodicProxyComSendImplementation);
				}
			}
		}
	}

	private void optimizeComValueBufferImplementations() throws ModelException {
		// Com������Хå������פʾ���Com�������ѹ�
		for (InternalEcuReceiver sourceInternalEcuReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (sourceInternalEcuReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			ReceiveInteraction sourceAndTargetReceiveInteraction = sourceInternalEcuReceiver.getReceiveInteraction().get(0);
			optimizeComValueBufferImplementation(sourceAndTargetReceiveInteraction, sourceInternalEcuReceiver);
		}
	}

	private void optimizeComValueBufferImplementation(ReceiveInteraction sourceAndTargetReceiveInteraction, InternalEcuReceiver sourceReceiver) throws ModelException {
		if (!this.interactionRules.appliesSrComValueBufferOptimization(sourceAndTargetReceiveInteraction, sourceReceiver)) {
			return;
		}

		ExternalEcuSender sourceExternalEcuSender = sourceReceiver.getExternalEcuSenders().get(0);

		// ��Ŭ����»�
		// SendInteraction��Implementation�������롣
		for (SendInteraction targetSendInteraction : sourceAndTargetReceiveInteraction.getSendInteraction()) {
			targetSendInteraction.setImplementation(null);
		}

		// ReceiveInteraction��Implementaition��Com�Хåե����ѹ����롣
		ComSignal comSignal = sourceExternalEcuSender.getSourceSignal();
		ComSignalGroup comSignalGroup = sourceExternalEcuSender.getSourceSignalGroup();

		ComValueBufferImplementation destComValueBufferImplementation = InteractionFactory.eINSTANCE.createComValueBufferImplementation();
		destComValueBufferImplementation.setComSignal(comSignal);
		destComValueBufferImplementation.setComSignalGroup(comSignalGroup);
		sourceAndTargetReceiveInteraction.setValueBufferImplementation(destComValueBufferImplementation);
	}
}