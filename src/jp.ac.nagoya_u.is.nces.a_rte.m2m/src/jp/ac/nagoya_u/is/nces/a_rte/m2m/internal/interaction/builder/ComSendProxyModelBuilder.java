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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;

import com.google.common.collect.Lists;

public class ComSendProxyModelBuilder {
	private final InteractionModelBuildContext context;

	public ComSendProxyModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildPeriodicComSendProxy();
		buildImmediateComSendProxy();
	}

	private void buildPeriodicComSendProxy() throws ModelException {
		InteractionRoot targetInteractionRoot = this.context.cache.interactionRoot;

		List<PeriodicProxyComSendImplementation> sourceSendImplementations = this.context.query.<PeriodicProxyComSendImplementation> findByKind(PERIODIC_PROXY_COM_SEND_IMPLEMENTATION);
		if (!sourceSendImplementations.isEmpty()) {
			// 周期通信用のプロキシを構築
			PeriodicComSendProxy destPeriodicComSendProxy = createPeriodicComSendProxy();
			targetInteractionRoot.getInteractionEnd().add(destPeriodicComSendProxy);

			// 周期通信用のプロキシCOM通信の連携を構築
			buildComSendProxyInteractions(targetInteractionRoot, destPeriodicComSendProxy, sourceSendImplementations);
		}
	}

	private PeriodicComSendProxy createPeriodicComSendProxy() {
		PeriodicComSendProxy destPeriodicComSendProxy = InteractionFactory.eINSTANCE.createPeriodicComSendProxy();
		destPeriodicComSendProxy.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE COMプロキシの生成条件を満たす場合、マスタコアのBSWM配置パーティションは必ず存在する。
		return destPeriodicComSendProxy;
	}

	private void buildImmediateComSendProxy() throws ModelException {
		InteractionRoot targetInteractionRoot = this.context.cache.interactionRoot;

		List<ImmediateProxyComSendImplementation> sourceSendImplementations = this.context.query.<ImmediateProxyComSendImplementation> findByKind(IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);
		if (!sourceSendImplementations.isEmpty()) {
			// 即時通信用のプロキシCOM通信の連携を構築
			ImmediateComSendProxy destImmediateComSendProxy = createImmediateComSendProxy();
			targetInteractionRoot.getInteractionEnd().add(destImmediateComSendProxy);
	
			// 即時通信用のプロキシCOM通信の連携を構築
			buildComSendProxyInteractions(targetInteractionRoot, destImmediateComSendProxy, sourceSendImplementations);
		}
	}

	private ImmediateComSendProxy createImmediateComSendProxy() {
		ImmediateComSendProxy destImmediateComSendProxy = InteractionFactory.eINSTANCE.createImmediateComSendProxy();
		destImmediateComSendProxy.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE COMプロキシの生成条件を満たす場合、マスタコアのBSWM配置パーティションは必ず存在する。
		return destImmediateComSendProxy;
	}

	private void buildComSendProxyInteractions(InteractionRoot targetInteractionRoot, ComSendProxy targetComSendProxy, List<? extends ProxyComSendImplementation> sourceAndTargetSendImplementations)
			throws ModelException {
		// プリミティブ型向けのプロキシ連携を構築
		buildComSendProxyInteractionsForPrimitiveType(targetInteractionRoot, targetComSendProxy, selectProxyComSendImplementationsForPrimitiveType(sourceAndTargetSendImplementations));

		// 複合データ型向けのプロキシ連携を構築
		buildComSendProxyInteractionsForComplexType(targetInteractionRoot, targetComSendProxy, selectProxyComSendImplementationsForComplexType(sourceAndTargetSendImplementations));
	}

	private List<ProxyComSendImplementation> selectProxyComSendImplementationsForPrimitiveType(List<? extends ProxyComSendImplementation> sourceAndTargetSendImplementations) {
		List<ProxyComSendImplementation> sourcePrimitiveImplementations = Lists.newArrayList();

		for (ProxyComSendImplementation proxyComSendImplementation : sourceAndTargetSendImplementations) {
			InternalEcuSender sourceSender = proxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType();

			if (sourceImplDataType.isPrimitiveType()) {
				sourcePrimitiveImplementations.add(proxyComSendImplementation);
			}
		}
		return sourcePrimitiveImplementations;
	}

	private List<ProxyComSendImplementation> selectProxyComSendImplementationsForComplexType(List<? extends ProxyComSendImplementation> sourceAndTargetSendImplementations) {
		List<ProxyComSendImplementation> sourceComplexImplementations = Lists.newArrayList();

		for (ProxyComSendImplementation proxyComSendImplementation : sourceAndTargetSendImplementations) {
			InternalEcuSender sourceSender = proxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType();

			if (sourceImplDataType.isComplexType()) {
				sourceComplexImplementations.add(proxyComSendImplementation);
			}
		}
		return sourceComplexImplementations;
	}

	private void buildComSendProxyInteractionsForPrimitiveType(InteractionRoot targetInteractionRoot, ComSendProxy targetComSendProxy, List<ProxyComSendImplementation> sourcePrimitiveImplementations)
			throws ModelException {
		List<ComSendProxyInteraction> destPrimitiveProxyInteractions = Lists.newArrayList();
		for (ProxyComSendImplementation sourcePrimitiveProxyComSendImplementation : sourcePrimitiveImplementations) {
			InternalEcuSender sourceSender = sourcePrimitiveProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceLeafImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType().getLeafImplementationDataType();

			// プロキシ連携を生成
			ComSendProxyInteraction destProxyInteraction = InteractionFactory.eINSTANCE.createComSendProxyInteraction();
			destProxyInteraction.setRequesterPartition(sourceSender.getOwnerPartition());
			destProxyInteraction.setSignalDataType(getSignalDataTypeForPrimitiveProxyInteraction(sourceLeafImplDataType));
			destPrimitiveProxyInteractions.add(destProxyInteraction);
		}

		List<ComSendProxyInteraction> destUniquePeridicProxyInteractions = this.context.query.uniqueByKeys(destPrimitiveProxyInteractions, COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION,
				COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE);
		targetInteractionRoot.getInteraction().addAll(destUniquePeridicProxyInteractions);

		// プロキシに連携をひもづけ
		targetComSendProxy.getInteraction().addAll(destUniquePeridicProxyInteractions);

		// 実装に使用するプロキシ連携を設定
		for (ProxyComSendImplementation sourceAndTargetProxyComSendImplementation : sourcePrimitiveImplementations) {
			InternalEcuSender sourceSender = sourceAndTargetProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceLeafImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType().getLeafImplementationDataType();

			ComSendProxyInteraction proxyInteraction = this.context.query.selectSingle(destUniquePeridicProxyInteractions, ref(COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, sourceSender.getOwnerPartition())
					.AND(ref(COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, getSignalDataTypeForPrimitiveProxyInteraction(sourceLeafImplDataType))));
			sourceAndTargetProxyComSendImplementation.setProxyInteraction(proxyInteraction);
		}
	}

	private void buildComSendProxyInteractionsForComplexType(InteractionRoot targetInteractionRoot, ComSendProxy targetComSendProxy, List<ProxyComSendImplementation> sourceComplexImplementations) {
		// NOTE Complex型はシグナルにも依存するかつ、IOCが2つ必要なのに1つは流用されるため、処理が複雑になる。
		// IOCは出力ソース内に定義はでないため、間引かずにaddする。ただし、MockOsIoc内で重複しないように制御する。
		for (ProxyComSendImplementation proxyComplexProxyComSendImplementation : sourceComplexImplementations) {
			InternalEcuSender sourceSender = proxyComplexProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceLeafImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType().getLeafImplementationDataType();

			// プロキシ連携を生成
			ComSendProxyInteraction destProxyInteraction = InteractionFactory.eINSTANCE.createComSendProxyInteraction();
			destProxyInteraction.setRequesterPartition(sourceSender.getOwnerPartition());
			destProxyInteraction.setSignalDataType(sourceLeafImplDataType);
			targetInteractionRoot.getInteraction().add(destProxyInteraction);

			// プロキシに連携をひもづけ
			targetComSendProxy.getInteraction().add(destProxyInteraction);

			// 実装に使用するプロキシ連携を設定
			proxyComplexProxyComSendImplementation.setProxyInteraction(destProxyInteraction);
		}
	}

	private ImplementationDataType getSignalDataTypeForPrimitiveProxyInteraction(ImplementationDataType sourceImplementationDataType) {
		return getAppropriateType(sourceImplementationDataType.getBaseType().getBaseTypeSize());
	}

	private ImplementationDataType getAppropriateType(int baseTypeSize) {
		if (baseTypeSize <= 8) {
			return this.context.cache.sourceUint8Type;
		} else if (baseTypeSize <= 16) {
			return this.context.cache.sourceUint16Type;
		} else {
			return this.context.cache.sourceUint32Type;
		}
	}
}