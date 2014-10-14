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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;

public class IocCommunicationModelBuilder {

	private final ModuleModelBuildContext context;

	public IocCommunicationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildSenderReceiverIocCommunications(this.context.cache.rte);
		buildComProxyIocCommunications(this.context.cache.rte);
	}

	private void buildSenderReceiverIocCommunications(Rte targetRte) throws ModelException {
		for (IocValueBufferImplementation iocValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			InternalEcuReceiver receiver = iocValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);

			if (receiver.getSource().getPrototype().isEventSemantics()) {
				buildIocQueuedCommunication(targetRte, iocValueBufferImplementation);
			} else {
				buildIocNonqueuedCommunication(targetRte, iocValueBufferImplementation);
			}
		}
	}

	private boolean buildIocQueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		return targetRte.getDependentIocCommunication().add(createIocQueuedCommunication(sourceValueBufferImplementation));
	}

	private IocQueuedCommunication createIocQueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		IocQueuedCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();

		IocReceiveApi iocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		iocReceiveApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		iocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(iocReceiveApi, sourceValueBufferImplementation.getOsIocCommunication());
		iocCommunication.setReceiveApi(iocReceiveApi);

		IocEmptyQueueApi iocEmptyQueueApi = ModuleFactory.eINSTANCE.createIocEmptyQueueApi();
		iocEmptyQueueApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		iocEmptyQueueApi.setSymbolName(SymbolNames.createIocEmptyQueueApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		iocEmptyQueueApi.setReturnType(this.context.cache.osStatusType);
		iocCommunication.setIocEmptyQueueApi(iocEmptyQueueApi);

		for (OsIocSenderProperties osIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocSendApi iocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
			iocSendApi.setSingleSource(osIocSenderProperties);
			iocSendApi.setSymbolName(SymbolNames.createIocSendApiName(osIocSenderProperties));
			buildSenderIocApiSignature(iocSendApi, sourceValueBufferImplementation.getOsIocCommunication());
			iocCommunication.getSendApi().add(iocSendApi);
		}
		return iocCommunication;
	}

	private void buildIocNonqueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		OsIocDataProperties osIocDataProperties = sourceValueBufferImplementation.getOsIocCommunication().getOsIocDataProperties().get(0);
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, osIocDataProperties.getOsIocDataType());

		// IOC初期値定数の構築
		Constant initValueConstant = createIocInitValueConstant(sourceValueBufferImplementation, osIocDataProperties, type);
		targetRte.getIocInitValueConstant().add(initValueConstant);

		// IOC連携の構築
		IocNonqueuedCommunication iocCommunication = createIocNonqueuedCommunication(sourceValueBufferImplementation, initValueConstant);
		targetRte.getDependentIocCommunication().add(iocCommunication);
	}

	private IocNonqueuedCommunication createIocNonqueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation, Constant initValueConstant) throws ModelException {
		IocNonqueuedCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocNonqueuedCommunication();
		iocCommunication.setInitValue(initValueConstant);

		IocReadApi iocReadApi = ModuleFactory.eINSTANCE.createIocReadApi();
		iocReadApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		iocReadApi.setSymbolName(SymbolNames.createIocReadApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(iocReadApi, sourceValueBufferImplementation.getOsIocCommunication());
		iocCommunication.setReadApi(iocReadApi);

		for (OsIocSenderProperties osIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocWriteApi iocWriteApi = ModuleFactory.eINSTANCE.createIocWriteApi();
			iocWriteApi.setSingleSource(osIocSenderProperties);
			iocWriteApi.setSymbolName(SymbolNames.createIocWriteApiName(osIocSenderProperties));
			buildSenderIocApiSignature(iocWriteApi, sourceValueBufferImplementation.getOsIocCommunication());
			iocCommunication.getWriteApi().add(iocWriteApi);
		}
		return iocCommunication;
	}

	private Constant createIocInitValueConstant(IocValueBufferImplementation sourceValueBufferImplementation, OsIocDataProperties osIocDataProperties, PrimitiveType type) {
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSymbolName(SymbolNames.createIocInitValueConstantName(sourceValueBufferImplementation.getOsIocCommunication()));
		initValueConstant.setType(type);
		initValueConstant.setValue(osIocDataProperties.getOsIocInitValue());
		return initValueConstant;
	}

	private void buildComProxyIocCommunications(Rte targetRte) throws ModelException {
		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			targetRte.getDependentIocCommunication().add(createIocQueuedGroupCommunication(proxyInteraction));
		}
	}

	private IocQueuedGroupCommunication createIocQueuedGroupCommunication(ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		IocQueuedGroupCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocQueuedGroupCommunication();

		IocReceiveGroupApi iocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveGroupApi();
		iocReceiveApi.setSingleSource(sourceProxyInteraction.getOsIocCommunication());
		iocReceiveApi.setSymbolName(SymbolNames.createIocReceiveGroupApiName(sourceProxyInteraction.getOsIocCommunication()));
		buildReceiverIocApiSignature(iocReceiveApi, sourceProxyInteraction.getOsIocCommunication());
		iocCommunication.setReceiveApi(iocReceiveApi);

		// グループ通信では送信プロパティは必ず1つ
		OsIocSenderProperties osIocSenderProperties = sourceProxyInteraction.getOsIocCommunication().getOsIocSenderProperties().get(0);
		IocSendGroupApi iocSendApi = ModuleFactory.eINSTANCE.createIocSendGroupApi();
		iocSendApi.setSingleSource(osIocSenderProperties);
		iocSendApi.setSymbolName(SymbolNames.createIocSendGroupApiName(osIocSenderProperties));
		buildSenderIocApiSignature(iocSendApi, sourceProxyInteraction.getOsIocCommunication());
		iocCommunication.setSendApi(iocSendApi);
		return iocCommunication;
	}

	private void buildReceiverIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties osIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(createIocParam(osIocDataProperties, ParameterPassTypeEnum.REFERENCE));
		}
	}

	private void buildSenderIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties osIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(createIocParam(osIocDataProperties, ParameterPassTypeEnum.VALUE));
		}
	}

	private Parameter createIocParam(OsIocDataProperties osIocDataProperties, ParameterPassTypeEnum passType) throws ModelException {
		Parameter iocParam = ModuleFactory.eINSTANCE.createParameter();
		iocParam.setSymbolName(osIocDataProperties.getShortName());
		iocParam.setType(this.context.builtQuery.findPrimitiveType(osIocDataProperties.getOsIocDataType()));
		iocParam.setPassType(passType);
		return iocParam;
	}
}
