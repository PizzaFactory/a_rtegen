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
		// ECU内の送信側，および受信側データ要素の生成
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
		// ECU間の送信側，および受信側データ要素の生成
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
		// ECU内の送信側，および受信側データ要素間のインタラクションを生成
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
		// ECU間の送信側，および受信側データ要素間のインタラクションを生成
		for (ComSignal signal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			List<VariableDataInstanceInComposition> dataInstanceInCompositionList = this.context.query.get(signal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
			if (dataInstanceInCompositionList.isEmpty()) {
				continue;
			}

			Optional<ExternalEcuReceiver> optionalExtReceiver = this.context.query.tryFindSingle(ref(EXTERNAL_ECU_RECEIVER__SOURCE, signal));
			if (optionalExtReceiver.isPresent()) {
				// ECU内->ECU外のインタラクションを構築
				ExternalEcuReceiver extReceiver = optionalExtReceiver.get();

				for (VariableDataInstanceInComposition dataInstanceInComposition : dataInstanceInCompositionList) {
					ReceiveInteraction receiveInteraction = createReceiveInteractionToExternalEcu(dataInstanceInComposition, signal, extReceiver);
					SendInteraction sendInteraction = createSendInteractionFromInternalEcu(dataInstanceInComposition, signal, extReceiver, receiveInteraction);

					targetInteractionRoot.getInteraction().add(sendInteraction);
					targetInteractionRoot.getInteraction().add(receiveInteraction);
				}
			} else {
				// ECU外->ECU内のインタラクションを構築
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
		// 受信インタラクションの数を正規化
		for (InternalEcuReceiver receiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {
			if (receiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			List<ReceiveInteraction> oldReceiveInteractions = Lists.newArrayList(receiver.getReceiveInteraction());

			// 元々設定されていた受信インタラクションをリソースから除外
			receiver.getReceiveInteraction().clear();
			for (ReceiveInteraction receiveInteraction : oldReceiveInteractions) {
				EcoreUtil.remove(receiveInteraction);
			}

			ReceiveInteraction combinedReceiveInteraction = InteractionFactory.eINSTANCE.createReceiveInteraction();
			combinedReceiveInteraction.getReceiver().add(receiver);
			targetInteractionRoot.getInteraction().add(combinedReceiveInteraction);

			// 送信インタラクションの参照先を，束ねた受信インタラクションに置き換え
			for (ReceiveInteraction receiveInteraction : oldReceiveInteractions) {
				for (SendInteraction sendInteraction : Lists.newArrayList(receiveInteraction.getSendInteraction())) {
					sendInteraction.setReceiveInteraction(combinedReceiveInteraction);
				}
			}
		}
	}

	private void determinesRteComResponsibility() throws ModelException {
		// ポート接続多重度，および受信側データ要素の設定差異を見て，RTEで対応が必要かを判断する
		for (ExternalEcuSender targetSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			targetSender.setRequiresRteInvalidation(EmfUtils.<Boolean> exInvoke(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteInitialization(EmfUtils.<Boolean> exInvoke(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER));
			targetSender.setRequiresRteFilter(EmfUtils.<Boolean> exInvoke(targetSender, EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER));
		}
	}
}