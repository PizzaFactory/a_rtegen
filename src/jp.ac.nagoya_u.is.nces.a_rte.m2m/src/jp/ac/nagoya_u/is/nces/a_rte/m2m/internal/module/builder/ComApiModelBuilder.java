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
