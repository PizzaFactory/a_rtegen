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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;

import com.google.common.base.Optional;

/**
 * RTE����¸����COM API�Υ�ǥ���ۤ��롣
 */
public class ComApiModelBuilder {

	private final ModuleModelBuildContext context;

	public ComApiModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() {
		buildSendApis(this.context.cache.rte);
		buildReceiveApis(this.context.cache.rte);
	}

	private void buildSendApis(Rte targetRte) {
		for (ExternalEcuReceiver sourceExternalEcuReceiver : this.context.query.<ExternalEcuReceiver> findByKind(EXTERNAL_ECU_RECEIVER)) {
			targetRte.getDependentComApi().add(createComSendSignalApi(sourceExternalEcuReceiver));
		}
	}

	private ComSendSignalApi createComSendSignalApi(ExternalEcuReceiver sourceExternalEcuReceiver) {
		EcucContainer sourceComSignalorComSignalGroup = sourceExternalEcuReceiver.getSourceSignal() != null ? sourceExternalEcuReceiver.getSourceSignal() : sourceExternalEcuReceiver.getSourceSignalGroup();

		ComSendSignalApi destComSendSignalApi = ModuleFactory.eINSTANCE.createComSendSignalApi();
		destComSendSignalApi.setSingleSource(sourceComSignalorComSignalGroup);
		if (sourceComSignalorComSignalGroup instanceof ComSignal) {
			destComSendSignalApi.setIsSignalGroup(false);
			destComSendSignalApi.setSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);
			destComSendSignalApi.setComSignalSymbolName(SymbolNames.createComSignalSymbolicName(Optional.of(sourceComSignalorComSignalGroup)));
		} else {
			ComSignalGroup sourceComSignalGroup = sourceExternalEcuReceiver.getSourceSignalGroup();
		
			destComSendSignalApi.setIsSignalGroup(true);
			destComSendSignalApi.setSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(Optional.fromNullable(sourceExternalEcuReceiver.getOwnerPartition())));
			destComSendSignalApi.setComSignalSymbolName(SymbolNames.createComMetaVariableName(sourceComSignalGroup));
		}
		return destComSendSignalApi;
	}

	private void buildReceiveApis(Rte targetRte) {
		for (ExternalEcuSender externalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			targetRte.getDependentComApi().add(createComReceiveSignalApi(externalEcuSender));
		}
	}

	private ComReceiveSignalApi createComReceiveSignalApi(ExternalEcuSender sourceExternalEcuSender) {
		EcucContainer sourceComSignalOrComSignalGroup = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();

		ComReceiveSignalApi destComReceiveSignalApi = ModuleFactory.eINSTANCE.createComReceiveSignalApi();
		destComReceiveSignalApi.setSingleSource(sourceComSignalOrComSignalGroup);
		if (sourceComSignalOrComSignalGroup instanceof ComSignal) {
			destComReceiveSignalApi.setIsSignalGroup(false);
			destComReceiveSignalApi.setSymbolName(SymbolNames.CALL_BSW_COM_RECEIVE_SIGNAL_API_NAME);
			destComReceiveSignalApi.setComSignalSymbolName(SymbolNames.createComSignalSymbolicName(Optional.of(sourceComSignalOrComSignalGroup)));
		} else {
			ComSignalGroup sourceComSignalGroup = sourceExternalEcuSender.getSourceSignalGroup();
		
			destComReceiveSignalApi.setIsSignalGroup(true);
			destComReceiveSignalApi.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionAliasName(Optional.fromNullable(sourceExternalEcuSender.getOwnerPartition())));
			destComReceiveSignalApi.setComSignalSymbolName(SymbolNames.createComMetaVariableName(sourceComSignalGroup));
		}
		return destComReceiveSignalApi;
	}
}
