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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_RECEIVE_GROUP_API;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComplexComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember;


public class ComProxyOperationModelBuilder {

	private final ModuleModelBuildContext context;

	public ComProxyOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	// Primitive用
	public PrimitiveComSendProxyOperation createPrimitiveComSendProxyOperation(ComSendProxyInteraction sourceProxyInteraction, LocalVariable signalIdVariable, VariableMember dataVariable) throws ModelException {
		IocReceiveGroupApi accessApi = this.context.builtQuery.findDest(IOC_RECEIVE_GROUP_API, sourceProxyInteraction.getRequestOsIocCommunication());
		accessApi.setComSendSignalSymbolName(SymbolNames.CALL_BSW_COM_SEND_SIGNAL_API_NAME);

		PrimitiveComSendProxyOperation destOperation = ModuleFactory.eINSTANCE.createPrimitiveComSendProxyOperation();
		destOperation.setSingleSource(sourceProxyInteraction);
		destOperation.setAccessApi(accessApi);
		destOperation.setSignalIdVariable(signalIdVariable);
		destOperation.setReadValueVariable(dataVariable);
		return destOperation;
	}
	
	// 複合型用
	public ComplexComSendProxyOperation createComplexComSendProxyOperation(List<ComSendProxyInteraction> sourceProxyInteractions, LocalVariable indexVariable) throws ModelException {
		// NOTE 要求伝搬用のIOC通信はパーティション毎に共通のため、代表のComSendProxyInteractionのものを使用する
		IocReceiveApi accessApi = this.context.builtQuery.findDest(IOC_RECEIVE_API, sourceProxyInteractions.get(0).getRequestOsIocCommunication());
		
		ComplexComSendProxyOperation destOperation = ModuleFactory.eINSTANCE.createComplexComSendProxyOperation();
		destOperation.getSource().addAll(sourceProxyInteractions);
		destOperation.setAccessApi(accessApi);
		destOperation.setFunctionTableSymbolName(SymbolNames.COM_PROXY_FUNCTION_TABLE_NAME);
		destOperation.setTableIndexVariable(indexVariable);
		return destOperation;
	}
}
