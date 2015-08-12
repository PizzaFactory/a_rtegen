/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
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
		// ReceiveInteractionのImplementationを設定
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
			// フィルタNEVERの場合，実装を生成しない
			return;
		}

		// 値保持用のバッファを生成
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

		// フィルタ用のバッファを生成
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
			// targetReceiveInteraction中のSenderの中に１つでもOwnerPartitionがUntrustedであれば、falseを返す
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
		// SendInteractionのImplementationを設定
		for (Sender targetSender : this.context.query.<Sender> findByKind(SENDER)) {
			for (SendInteraction targetSendInteraction : targetSender.getSendInteraction()) {
				buildSendImplementation(targetSendInteraction, targetSender);
			}
		}
	}

	private void buildSendImplementation(SendInteraction targetSendInteraction, Sender sender) throws ModelException {
		Receiver receiver = targetSendInteraction.getReceiveInteraction().getReceiver().get(0);
		if (receiver instanceof InternalEcuReceiver) {
			// ECU内
			if (targetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof RteValueBufferImplementation) {
				if (!targetSendInteraction.isInterPartition() || sender.getOwnerPartition().isTrusted()) {
					// RTEバッファ送信
					RteSendImplementation rteSendImplementation = InteractionFactory.eINSTANCE.createRteSendImplementation();
					targetSendInteraction.setImplementation(rteSendImplementation);
				} else {
					// 信頼関数経由RTEバッファ送信
					TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionRteSendImplementation();
					targetSendInteraction.setImplementation(trustedFunctionRteSendImplementation);
				}
			} else if (targetSendInteraction.getReceiveInteraction().getValueBufferImplementation() instanceof IocValueBufferImplementation) {
				// IOC送信
				IocSendImplementation iocSendImplementation = InteractionFactory.eINSTANCE.createIocSendImplementation();
				targetSendInteraction.setImplementation(iocSendImplementation);
			}
		} else {
			// ECU間
			ExternalEcuReceiver externalEcuReceiver = (ExternalEcuReceiver) receiver;
			ComSignal comSignal = externalEcuReceiver.getSourceSignal();
			ComSignalGroup comSignalGroup = externalEcuReceiver.getSourceSignalGroup();
			if (sender.getOwnerPartition() == null) {
				// パーティション構成なしの場合，直接COM送信
				DirectComSendImplementation directComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
				directComSendImplementation.setComSignal(comSignal);
				directComSendImplementation.setComSignalGroup(comSignalGroup);
				targetSendInteraction.setImplementation(directComSendImplementation);
			} else if (this.context.query.get(sender.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION)) {
				// マスタコア
				if (sender.getOwnerPartition().isTrusted()) {
					// 信頼パーティションの場合，直接COM送信
					DirectComSendImplementation directComSendImplementation = InteractionFactory.eINSTANCE.createDirectComSendImplementation();
					directComSendImplementation.setComSignal(comSignal);
					directComSendImplementation.setComSignalGroup(comSignalGroup);
					targetSendInteraction.setImplementation(directComSendImplementation);
				} else {
					// 非信頼パーティションの場合，信頼関数経由COM送信
					TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = InteractionFactory.eINSTANCE.createTrustedFunctionComSendImplementation();
					trustedFunctionComSendImplementation.setComSignal(comSignal);
					trustedFunctionComSendImplementation.setComSignalGroup(comSignalGroup);
					targetSendInteraction.setImplementation(trustedFunctionComSendImplementation);
				}
			} else {
				// スレーブコア
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
		// Comコールバックが不要な場合はCom受信に変更
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

		// Receive RTEバッファでない場合は最適化対象外
		if (!(targetReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation)) {
			return;
		}

		// セマンティクス判定:イベントの場合は最適化対象外
		if (dataInstanceInSwc.isEventSemantics()) {
			return;
		}

		// タイムアウトが設定されている場合は最適化対象外
		if (dataInstanceInSwc.isAliveTimeoutEnabled()) {
			return;
		}

		// 送信者が複数の場合は最適化対象外
		// 送信者のExternalEcuSenderが存在しない場合は最適化対象外
		if (receiver.hasMultipleSenders() || receiver.getExternalEcuSenders().isEmpty()) {
			return;
		}

		// RTEによる無効化，もしくはフィルタが必要な場合は最適化対象外
		ExternalEcuSender externalEcuSender = receiver.getExternalEcuSenders().get(0);
		if (externalEcuSender.getRequiresRteInvalidation() || externalEcuSender.getRequiresRteInitialization() || externalEcuSender.getRequiresRteFilter()) {
			return;
		}

		// A-COM独自仕様オプション指定時以外はマスタコアのBSWPartitionでない場合は最適化対象外
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
			// BSWPartitionでない場合は最適化対象外
			if (receiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, receiver.getOwnerCore())));
				if (receiver.getOwnerPartition() != bswPartition) {
					return;
				}
			}
		}

		// 最適化を実施
		// SendInteractionのImplementationを削除する。
		for (SendInteraction targetSendInteraction : targetReceiveInteraction.getSendInteraction()) {
			targetSendInteraction.setImplementation(null);
		}

		// ReceiveInteractionのImplementaitionをComバッファに変更する。
		ComSignal comSignal = externalEcuSender.getSourceSignal();
		ComSignalGroup comSignalGroup = externalEcuSender.getSourceSignalGroup();
		ComValueBufferImplementation comValueBufferImplementation = InteractionFactory.eINSTANCE.createComValueBufferImplementation();
		comValueBufferImplementation.setComSignal(comSignal);
		comValueBufferImplementation.setComSignalGroup(comSignalGroup);
		targetReceiveInteraction.setValueBufferImplementation(comValueBufferImplementation);
	}
}