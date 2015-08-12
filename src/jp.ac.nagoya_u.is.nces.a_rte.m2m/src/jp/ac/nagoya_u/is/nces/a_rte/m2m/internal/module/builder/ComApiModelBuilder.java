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
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;

public class ComApiModelBuilder {

	private final ModuleModelBuildContext context;

	public ComApiModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildSendApis(this.context.cache.rte);
		buildReceiveApis(this.context.cache.rte);
	}

	private void buildSendApis(Rte targetRte) throws ModelException {
		for (ExternalEcuReceiver externalEcuReceiver : this.context.query.<ExternalEcuReceiver> findByKind(EXTERNAL_ECU_RECEIVER)) {
			targetRte.getDependentComApi().add(createComSendSignalApi(externalEcuReceiver));
		}
	}

	private ComSendSignalApi createComSendSignalApi(ExternalEcuReceiver sourceExternalEcuReceiver) throws ModelException {
		ComSendSignalApi comSendSignalApi = ModuleFactory.eINSTANCE.createComSendSignalApi();
		EcucContainer ecucContainer = sourceExternalEcuReceiver.getSourceSignal() != null ? sourceExternalEcuReceiver.getSourceSignal() : sourceExternalEcuReceiver.getSourceSignalGroup();
		comSendSignalApi.setSingleSource(ecucContainer);
		setComSendSignalApi(sourceExternalEcuReceiver, comSendSignalApi, ecucContainer);
		return comSendSignalApi;
	}

	private void setComSendSignalApi(ExternalEcuReceiver sourceExternalEcuReceiver, ComSendSignalApi comSendSignalApi, EcucContainer ecucContainer) throws ModelException {
		if (ecucContainer instanceof ComSignal) {
			comSendSignalApi.setIsSignalGroup(false);
			comSendSignalApi.setSymbolName(SymbolNames.RTE_CALL_BSW_COM_SEND_SIGNAL_API_NAME);
			comSendSignalApi.setComSignalSymbolName(SymbolNames.createComSignalSymbolicName(ecucContainer));
		} else {
			ComSignalGroup signalGroup = sourceExternalEcuReceiver.getSourceSignalGroup();
			comSendSignalApi.setIsSignalGroup(true);
			comSendSignalApi.setSymbolName(SymbolNames.createRteComSendSignalGroupFunctionName(sourceExternalEcuReceiver.getOwnerPartition()));
			comSendSignalApi.setComSignalSymbolName(SymbolNames.createBufferComMetaComplexDataName(signalGroup));
		}
	}
	
	private void buildReceiveApis(Rte targetRte) throws ModelException {
		for (ExternalEcuSender externalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
			targetRte.getDependentComApi().add(createComReceiveSignalApi(externalEcuSender));
		}
	}

	private ComReceiveSignalApi createComReceiveSignalApi(ExternalEcuSender sourceExternalEcuSender) throws ModelException {
		ComReceiveSignalApi comReceiveSignalApi = ModuleFactory.eINSTANCE.createComReceiveSignalApi();
		EcucContainer ecucContainer = sourceExternalEcuSender.getSourceSignal() != null ? sourceExternalEcuSender.getSourceSignal() : sourceExternalEcuSender.getSourceSignalGroup();
		comReceiveSignalApi.setSingleSource(ecucContainer);
		setReceiveComSignalApi(sourceExternalEcuSender, comReceiveSignalApi, ecucContainer);
		return comReceiveSignalApi;
	}

	private void setReceiveComSignalApi(ExternalEcuSender sourceExternalEcuSender, ComReceiveSignalApi comReceiveSignalApi, EcucContainer ecucContainer) throws ModelException {
		if (ecucContainer instanceof ComSignal) {
			comReceiveSignalApi.setIsSignalGroup(false);
			comReceiveSignalApi.setSymbolName(SymbolNames.RTE_CALL_BSW_COM_RECEIVE_SIGNAL_API_NAME);
			comReceiveSignalApi.setComSignalSymbolName(SymbolNames.createComSignalSymbolicName(ecucContainer));
		} else {
			ComSignalGroup signalGroup = sourceExternalEcuSender.getSourceSignalGroup();
			comReceiveSignalApi.setIsSignalGroup(true);
			comReceiveSignalApi.setSymbolName(SymbolNames.createComReceiveSignalGroupFunctionName(sourceExternalEcuSender.getOwnerPartition()));
			comReceiveSignalApi.setComSignalSymbolName(SymbolNames.createBufferComMetaComplexDataName(signalGroup));
		}
	}
}
