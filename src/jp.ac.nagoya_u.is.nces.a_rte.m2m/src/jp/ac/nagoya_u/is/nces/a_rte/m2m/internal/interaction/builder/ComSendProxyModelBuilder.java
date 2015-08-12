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
			// �����̿��ѤΥץ�������
			PeriodicComSendProxy destPeriodicComSendProxy = createPeriodicComSendProxy();
			targetInteractionRoot.getInteractionEnd().add(destPeriodicComSendProxy);

			// �����̿��ѤΥץ���COM�̿���Ϣ�Ȥ���
			buildComSendProxyInteractions(targetInteractionRoot, destPeriodicComSendProxy, sourceSendImplementations);
		}
	}

	private PeriodicComSendProxy createPeriodicComSendProxy() {
		PeriodicComSendProxy destPeriodicComSendProxy = InteractionFactory.eINSTANCE.createPeriodicComSendProxy();
		destPeriodicComSendProxy.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE COM�ץ���������������������硢�ޥ���������BSWM���֥ѡ��ƥ�������ɬ��¸�ߤ��롣
		return destPeriodicComSendProxy;
	}

	private void buildImmediateComSendProxy() throws ModelException {
		InteractionRoot targetInteractionRoot = this.context.cache.interactionRoot;

		List<ImmediateProxyComSendImplementation> sourceSendImplementations = this.context.query.<ImmediateProxyComSendImplementation> findByKind(IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);
		if (!sourceSendImplementations.isEmpty()) {
			// ¨���̿��ѤΥץ���COM�̿���Ϣ�Ȥ���
			ImmediateComSendProxy destImmediateComSendProxy = createImmediateComSendProxy();
			targetInteractionRoot.getInteractionEnd().add(destImmediateComSendProxy);
	
			// ¨���̿��ѤΥץ���COM�̿���Ϣ�Ȥ���
			buildComSendProxyInteractions(targetInteractionRoot, destImmediateComSendProxy, sourceSendImplementations);
		}
	}

	private ImmediateComSendProxy createImmediateComSendProxy() {
		ImmediateComSendProxy destImmediateComSendProxy = InteractionFactory.eINSTANCE.createImmediateComSendProxy();
		destImmediateComSendProxy.setOwnerPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE COM�ץ���������������������硢�ޥ���������BSWM���֥ѡ��ƥ�������ɬ��¸�ߤ��롣
		return destImmediateComSendProxy;
	}

	private void buildComSendProxyInteractions(InteractionRoot targetInteractionRoot, ComSendProxy targetComSendProxy, List<? extends ProxyComSendImplementation> sourceAndTargetSendImplementations)
			throws ModelException {
		// �ץ�ߥƥ��ַ������Υץ���Ϣ�Ȥ���
		buildComSendProxyInteractionsForPrimitiveType(targetInteractionRoot, targetComSendProxy, selectProxyComSendImplementationsForPrimitiveType(sourceAndTargetSendImplementations));

		// ʣ��ǡ����������Υץ���Ϣ�Ȥ���
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

			// �ץ���Ϣ�Ȥ�����
			ComSendProxyInteraction destProxyInteraction = InteractionFactory.eINSTANCE.createComSendProxyInteraction();
			destProxyInteraction.setRequesterPartition(sourceSender.getOwnerPartition());
			destProxyInteraction.setSignalDataType(getSignalDataTypeForPrimitiveProxyInteraction(sourceLeafImplDataType));
			destPrimitiveProxyInteractions.add(destProxyInteraction);
		}

		List<ComSendProxyInteraction> destUniquePeridicProxyInteractions = this.context.query.uniqueByKeys(destPrimitiveProxyInteractions, COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION,
				COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE);
		targetInteractionRoot.getInteraction().addAll(destUniquePeridicProxyInteractions);

		// �ץ�����Ϣ�Ȥ�Ҥ�Ť�
		targetComSendProxy.getInteraction().addAll(destUniquePeridicProxyInteractions);

		// �����˻��Ѥ���ץ���Ϣ�Ȥ�����
		for (ProxyComSendImplementation sourceAndTargetProxyComSendImplementation : sourcePrimitiveImplementations) {
			InternalEcuSender sourceSender = sourceAndTargetProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceLeafImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType().getLeafImplementationDataType();

			ComSendProxyInteraction proxyInteraction = this.context.query.selectSingle(destUniquePeridicProxyInteractions, ref(COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, sourceSender.getOwnerPartition())
					.AND(ref(COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, getSignalDataTypeForPrimitiveProxyInteraction(sourceLeafImplDataType))));
			sourceAndTargetProxyComSendImplementation.setProxyInteraction(proxyInteraction);
		}
	}

	private void buildComSendProxyInteractionsForComplexType(InteractionRoot targetInteractionRoot, ComSendProxy targetComSendProxy, List<ProxyComSendImplementation> sourceComplexImplementations) {
		// NOTE Complex���ϥ����ʥ�ˤ��¸���뤫�ġ�IOC��2��ɬ�פʤΤ�1�Ĥ�ή�Ѥ���뤿�ᡢ������ʣ���ˤʤ롣
		// IOC�Ͻ��ϥ������������ϤǤʤ����ᡢ�ְ�������add���롣��������MockOsIoc��ǽ�ʣ���ʤ��褦�����椹�롣
		for (ProxyComSendImplementation proxyComplexProxyComSendImplementation : sourceComplexImplementations) {
			InternalEcuSender sourceSender = proxyComplexProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			ImplementationDataType sourceLeafImplDataType = sourceSender.getSource().getPrototype().getImplementationDataType().getLeafImplementationDataType();

			// �ץ���Ϣ�Ȥ�����
			ComSendProxyInteraction destProxyInteraction = InteractionFactory.eINSTANCE.createComSendProxyInteraction();
			destProxyInteraction.setRequesterPartition(sourceSender.getOwnerPartition());
			destProxyInteraction.setSignalDataType(sourceLeafImplDataType);
			targetInteractionRoot.getInteraction().add(destProxyInteraction);

			// �ץ�����Ϣ�Ȥ�Ҥ�Ť�
			targetComSendProxy.getInteraction().add(destProxyInteraction);

			// �����˻��Ѥ���ץ���Ϣ�Ȥ�����
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