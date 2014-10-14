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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Variables;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import com.google.common.collect.Lists;

public class LocalSymbolModelBuilder {

	private final ModuleModelBuildContext context;

	public LocalSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public Parameter createDataParam(Type type, ParameterPassTypeEnum passType) {
		Parameter param = ModuleFactory.eINSTANCE.createParameter();
		param.setSymbolName(getSymbolNameOfDataParam(passType));
		param.setPassType(passType);
		param.setType(type);
		return param;
	}

	private String getSymbolNameOfDataParam(ParameterPassTypeEnum passType) {
		switch (passType) {
		case REFERENCE:
			return SymbolNames.DATA_REFERENCE_PARAM_NAME;
		case VALUE:
		default:
			return SymbolNames.DATA_PARAM_NAME;
		}
	}

	public List<Parameter> createPortArgValueParams(POperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		List<Parameter> portArgValueParams = Lists.newArrayList();
		if (!sourceOperationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			PortApiOption portApiOption = sourceOperationInstanceInSwc.getContextPort().getPortApiOption().get(0);

			int i = 0;
			for (PortDefinedArgumentValue sourcePortDefinedArgumentValue : portApiOption.getPortArgValue()) {
				portArgValueParams.add(createPortArgValueParam(sourcePortDefinedArgumentValue, i));
				i++;
			}
		}
		return portArgValueParams;
	}

	public Parameter createPortArgValueParam(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Parameter param = ModuleFactory.eINSTANCE.createParameter();
		param.setSymbolName(SymbolNames.createPortArgValueParamName(sourcePortDefinedArgumentValue, index));
		param.setPassType(ParameterPassTypeEnum.VALUE);
		param.setType(this.context.builtQuery.<Type> findDest(TYPE, sourcePortDefinedArgumentValue.getValueType()));
		return param;
	}

	public List<Parameter> createOperationParams(OperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		AtomicSwComponentType swComponentType = (AtomicSwComponentType) sourceOperationInstanceInSwc.getContextPort().getParent();

		List<Parameter> operationParams = Lists.newArrayList();
		for (ArgumentDataPrototype sourceArgumentDataPrototype : sourceOperationInstanceInSwc.getPrototype().getArgument()) {
			ImplementationDataType implementationDataType = swComponentType.getImplementationDataType(sourceArgumentDataPrototype.getType());
			operationParams.add(createOperationParam(sourceArgumentDataPrototype, implementationDataType));
		}
		return operationParams;
	}

	public Parameter createOperationParam(ArgumentDataPrototype sourceArgumentDataPrototype, ImplementationDataType implementationDataType) throws ModelException {
		Parameter param = ModuleFactory.eINSTANCE.createParameter();
		param.setSymbolName(sourceArgumentDataPrototype.getShortName());
		param.setPassType(getPassType(sourceArgumentDataPrototype));
		param.setType(this.context.builtQuery.<Type> findDest(TYPE, implementationDataType));
		return param;
	}

	private ParameterPassTypeEnum getPassType(ArgumentDataPrototype sourceArgumentDataPrototype) {
		// サポート範囲がプリミティブ型のみなので，INであれば値渡しに決まる
		switch (sourceArgumentDataPrototype.getDirection()) {
		case INOUT:
		case OUT:
			return ParameterPassTypeEnum.REFERENCE;
		case IN:
		default:
			return ParameterPassTypeEnum.VALUE;
		}
	}

	public Parameter createTrustedFunctionIndexParam() {
		Parameter functionIndexParam = ModuleFactory.eINSTANCE.createParameter();
		functionIndexParam.setType(this.context.cache.osTrustedFunctionIndexType);
		functionIndexParam.setSymbolName(SymbolNames.OS_TRUSTED_FUNCTION_INDEX_PARAM_NAME);
		functionIndexParam.setPassType(ParameterPassTypeEnum.VALUE);
		return functionIndexParam;
	}

	public Parameter createTrustedFunctionParamsParam() {
		Parameter functionParamsParam = ModuleFactory.eINSTANCE.createParameter();
		functionParamsParam.setType(this.context.cache.osTrustedFunctionParamRefType);
		functionParamsParam.setSymbolName(SymbolNames.OS_TRUSTED_FUNCTION_PARAMS_PARAM_NAME);
		functionParamsParam.setPassType(ParameterPassTypeEnum.VALUE);
		return functionParamsParam;
	}

	public LocalVariable createReturnValueVariable() {
		LocalVariable statusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		statusVariable.setType(this.context.cache.stdReturnType);
		statusVariable.setSymbolName(SymbolNames.RETURN_VALUE_LOCAL_VAR_NAME);
		return statusVariable;
	}

	public LocalVariable createTempReturnValueVariable() {
		LocalVariable statusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		statusVariable.setType(this.context.cache.stdReturnType);
		statusVariable.setSymbolName(SymbolNames.TEMP_RETURN_VALUE_LOCAL_VAR_NAME);
		return statusVariable;
	}

	public LocalVariable createDataVariable(VariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		LocalVariable dataVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		dataVariable.setType(this.context.builtQuery.findPrimitiveType(dataInstanceInSwc));
		dataVariable.setSymbolName(SymbolNames.DATA_VAR_NAME);
		return dataVariable;
	}

	public LocalVariable createInvalidValueVariable(VariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		LocalVariable dataVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		dataVariable.setType(this.context.builtQuery.findPrimitiveType(dataInstanceInSwc));
		dataVariable.setSymbolName(SymbolNames.INVALID_VALUE_VAR_NAME);
		return dataVariable;
	}

	public LocalVariable createFilterResultVariable() {
		LocalVariable filterResultVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		filterResultVariable.setType(this.context.cache.booleanType);
		filterResultVariable.setSymbolName(SymbolNames.FILTER_RESULT_VAR_NAME);
		return filterResultVariable;
	}

	public LocalVariable createComSendSignalTrustedFunctionParamVariable() {
		LocalVariable trustedFunctionParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		trustedFunctionParamVariable.setType(this.context.cache.comSendSignalTrustedFunctionParamType.orNull());
		trustedFunctionParamVariable.setSymbolName(SymbolNames.TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return trustedFunctionParamVariable;
	}

	public LocalVariable createSignalIdVariable() {
		LocalVariable variable = ModuleFactory.eINSTANCE.createLocalVariable();
		variable.setType(this.context.cache.comSignalIdType);
		variable.setSymbolName(SymbolNames.SIGNAL_ID_VAR_NAME);
		return variable;
	}

	public LocalVariable createEventVariable() {
		LocalVariable variable = ModuleFactory.eINSTANCE.createLocalVariable();
		variable.setType(this.context.cache.osEventMaskType);
		variable.setSymbolName(SymbolNames.EVENT_VAR_NAME);
		return variable;
	}

	public LocalVariable createProxyUnionDataVariable(UnionType proxyUnionType) {
		return Variables.createLocalVariable(proxyUnionType, SymbolNames.PROXY_UNION_DATA_VARIABLE);
	}

	public UnionType createProxyUnionType() {
		UnionType proxyUnionType = ModuleFactory.eINSTANCE.createUnionType();
		proxyUnionType.setIsAnonymous(true);
		proxyUnionType.getMember().add(createProxyUnionMember(this.context.cache.uint8Type));
		proxyUnionType.getMember().add(createProxyUnionMember(this.context.cache.uint16Type));
		proxyUnionType.getMember().add(createProxyUnionMember(this.context.cache.uint32Type));
		return proxyUnionType;
	}

	private UnionMember createProxyUnionMember(PrimitiveType type) {
		UnionMember unionMember = ModuleFactory.eINSTANCE.createUnionMember();
		unionMember.setMemberName(SymbolNames.createProxyUnionVariableMemberName(type));
		unionMember.setType(type);
		return unionMember;
	}

	public void removeUnusedLocalVariables(Function function) {
		for (LocalVariable localVariable : Lists.newArrayList(function.getLocalVariable())) {
			if (isUnusedLocalVariable(localVariable, function)) {
				function.getLocalVariable().remove(localVariable);
			}
		}
	}

	private boolean isUnusedLocalVariable(LocalVariable localVariable, Function function) {
		return this.context.query.find(function, ref(localVariable)).isEmpty();
	}
}
