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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.Lists;

public class ComSendProxyModelBuilder {
	private final InteractionModelBuildContext context;

	public ComSendProxyModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		if (!this.context.cache.masterBswPartition.isPresent()) {
			return;
		}

		buildPeriodicComSendProxy(this.context.cache.interactionRoot);
		buildImmediateComSendProxy(this.context.cache.interactionRoot);
	}

	private void buildPeriodicComSendProxy(InteractionRoot targetInteractionRoot) throws ModelException {
		// �����̿��ѤΥץ�������
		PeriodicComSendProxy periodicComSendProxy = createPeriodicComSendProxy();
		targetInteractionRoot.getInteractionEnd().add(periodicComSendProxy);

		// �����̿��ѤΥץ���COM�̿���Ϣ�Ȥ���
		buildComSendProxyInteractions(targetInteractionRoot, periodicComSendProxy, PERIODIC_PROXY_COM_SEND_IMPLEMENTATION);

		// Ϣ�Ȥ��ʤ���硤�ץ�������
		if (periodicComSendProxy.getInteraction().isEmpty()) {
			EcoreUtil.remove(periodicComSendProxy);
		}
	}

	private PeriodicComSendProxy createPeriodicComSendProxy() {
		PeriodicComSendProxy periodicComSendProxy = InteractionFactory.eINSTANCE.createPeriodicComSendProxy();
		periodicComSendProxy.setOwnerPartition(this.context.cache.masterBswPartition.get());
		return periodicComSendProxy;
	}

	private void buildImmediateComSendProxy(InteractionRoot InteractionRoot) throws ModelException {
		// ¨���̿��ѤΥץ���COM�̿���Ϣ�Ȥ���
		ImmediateComSendProxy immediateComSendProxy = createImmediateComSendProxy();
		InteractionRoot.getInteractionEnd().add(immediateComSendProxy);

		// ¨���̿��ѤΥץ���COM�̿���Ϣ�Ȥ���
		buildComSendProxyInteractions(InteractionRoot, immediateComSendProxy, IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);

		// Ϣ�Ȥ��ʤ���硤�ץ�������
		if (immediateComSendProxy.getInteraction().isEmpty()) {
			EcoreUtil.remove(immediateComSendProxy);
		}
	}

	private ImmediateComSendProxy createImmediateComSendProxy() {
		ImmediateComSendProxy immediateComSendProxy = InteractionFactory.eINSTANCE.createImmediateComSendProxy();
		immediateComSendProxy.setOwnerPartition(this.context.cache.masterBswPartition.get());
		return immediateComSendProxy;
	}

	private void buildComSendProxyInteractions(InteractionRoot targetInteractionRoot, ComSendProxy comSendProxy, EClass sourceSendImplementationKind) throws ModelException {
		List<ProxyComSendImplementation> sourceSendImplementations = this.context.query.<ProxyComSendImplementation> findByKind(sourceSendImplementationKind);

		// �ץ���Ϣ�Ȥ���
		List<ComSendProxyInteraction> peridicProxyInteractions = Lists.newArrayList();
		for (ProxyComSendImplementation proxyComSendImplementation : sourceSendImplementations) {
			InternalEcuSender sender = proxyComSendImplementation.getParent().getInternalEcuSenders().get(0);

			ComSendProxyInteraction proxyInteraction = InteractionFactory.eINSTANCE.createComSendProxyInteraction();
			proxyInteraction.setRequesterPartition(sender.getOwnerPartition());
			proxyInteraction.setSignalDataType(getAppropriateType(sender.getSource().getPrototype().getImplementationDataType()));
			peridicProxyInteractions.add(proxyInteraction);
		}

		List<ComSendProxyInteraction> uniquePeridicProxyInteractions = this.context.query.uniqueByKeys(peridicProxyInteractions, COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION,
				COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE);
		targetInteractionRoot.getInteraction().addAll(uniquePeridicProxyInteractions);

		// �ץ�����Ϣ�Ȥ�Ҥ�Ť�
		comSendProxy.getInteraction().addAll(uniquePeridicProxyInteractions);

		// �����˻��Ѥ���ץ���Ϣ�Ȥ�����
		for (ProxyComSendImplementation sourceProxyComSendImplementation : sourceSendImplementations) {
			InternalEcuSender sender = sourceProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			VariableDataInstanceInSwc dataInstanceInSwc = sender.getSource().getPrototype();

			ComSendProxyInteraction proxyInteraction = this.context.query.selectSingle(uniquePeridicProxyInteractions, ref(COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, sender.getOwnerPartition())
					.AND(ref(COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, getAppropriateType(dataInstanceInSwc.getImplementationDataType()))));
			sourceProxyComSendImplementation.setProxyInteraction(proxyInteraction);
		}
	}

	private ImplementationDataType getAppropriateType(ImplementationDataType sourceImplementationDataType) {
		return getAppropriateType(sourceImplementationDataType.getBaseType().getBaseTypeSize());
	}

	public ImplementationDataType getAppropriateType(int baseTypeSize) {
		if (baseTypeSize <= 8) {
			return this.context.cache.uint8Type;
		} else if (baseTypeSize <= 16) {
			return this.context.cache.uint16Type;
		} else {
			return this.context.cache.uint32Type;
		}
	}
}