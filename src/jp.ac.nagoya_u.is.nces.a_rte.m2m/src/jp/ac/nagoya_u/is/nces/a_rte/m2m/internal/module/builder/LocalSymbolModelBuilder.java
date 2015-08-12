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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Variables;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDirectionEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions;

import com.google.common.collect.Lists;

public class LocalSymbolModelBuilder {

	private final ModuleModelBuildContext context;

	public LocalSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public Parameter createInDataParam(Type type) {
		Parameter param = createDataParam(type, getInParameterPassType(type));
		param.setIsIn(true);
		param.setHasConst(!((type instanceof PrimitiveType) || (type instanceof PointerType)));
		return param;
	}

	public Parameter createOutDataParam(Type type) {
		Parameter param =createDataParam(type, ParameterPassTypeEnum.REFERENCE);
		param.setIsIn(false);
		return param;
	}

	private Parameter createDataParam(Type type, ParameterPassTypeEnum passType) {
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

	private Parameter createPortArgValueParam(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Type type = this.context.builtQuery.<Type> findDest(TYPE, sourcePortDefinedArgumentValue.getValueType());
		Parameter param =  createInDataParam(type);
		param.setSymbolName(SymbolNames.createPortArgValueParamName(sourcePortDefinedArgumentValue, index));
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

	private Parameter createOperationParam(ArgumentDataPrototype sourceArgumentDataPrototype, ImplementationDataType implementationDataType) throws ModelException {
		Type type = this.context.builtQuery.<Type> findDest(TYPE, implementationDataType);
		Parameter param = null;
		if (sourceArgumentDataPrototype.getDirection() == ArgumentDirectionEnum.IN) {
			param = createInDataParam(type);
		} else { // OUT,INOUT�ΤȤ�
			param = createOutDataParam(type);
		}
		param.setSymbolName(sourceArgumentDataPrototype.getShortName());
		return param;
	}

	public ParameterPassTypeEnum getInParameterPassType(Type type) {
		if (type instanceof PrimitiveType || type instanceof PointerType) {
			return ParameterPassTypeEnum.VALUE;
		} else {
			return ParameterPassTypeEnum.REFERENCE;
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

	public LocalVariable createDataVariable(VariableDataInstanceInSwc dataInstanceInSwc, String symbolName) throws ModelException {
		LocalVariable dataVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		dataVariable.setType(this.context.builtQuery.findType(dataInstanceInSwc));
		dataVariable.setSymbolName(symbolName);
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

	public LocalVariable createComSendSignalTrustedFunctionParamVariable(boolean isForSignalGroup) {
		LocalVariable trustedFunctionParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		if (isForSignalGroup) {
			trustedFunctionParamVariable.setType(this.context.cache.comSendSignalGroupTrustedFunctionParamType.orNull());
			trustedFunctionParamVariable.setSymbolName(SymbolNames.COM_GROUP_TRUSTED_FUNCTION_GROUP_PARAM_VAR_NAME);
		} else {
			trustedFunctionParamVariable.setType(this.context.cache.comSendSignalTrustedFunctionParamType.orNull());
			trustedFunctionParamVariable.setSymbolName(SymbolNames.COM_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		}
		return trustedFunctionParamVariable;
	}

	public LocalVariable createSignalIdVariable() {
		LocalVariable variable = ModuleFactory.eINSTANCE.createLocalVariable();
		variable.setType(this.context.cache.comSignalIdType);
		variable.setSymbolName(SymbolNames.SIGNAL_ID_VAR_NAME);
		return variable;
	}

	public LocalVariable createSrWriteProxyFunctionTableIndexVariable() {
		LocalVariable variable = ModuleFactory.eINSTANCE.createLocalVariable();
		variable.setType(this.context.cache.SrWriteProxyFunctionTableIndex);
		variable.setSymbolName(SymbolNames.INX_VAR_NAME);
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

	private ValueSpecification getLeafValueSpecification(ValueSpecification value) {
		// OCL�ȼ�������뤬����Ͽ���Ƥ��ʤ�ValueSpecification������������Τǡ�Java�Ǽ�������
		if (value instanceof ConstantReference) {
			return getLeafValueSpecification(((ConstantReference)value).getEndValueSpec());
		}
		return value;
	}
	
	private String getValueString(ValueSpecification value) {
		// OCL�ȼ�������뤬����Ͽ���Ƥ��ʤ�ValueSpecification������������Τǡ�Java�Ǽ�������
		value = getLeafValueSpecification(value);
		if (value instanceof NumericalValueSpecification) {
			return ((NumericalValueSpecification)value).getValue().toString();
		} else if (value instanceof TextValueSpecification) {
			return ((TextValueSpecification)value).getValue();
		}

		// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
		// ����/��¤�η�/�����η��Υ��Ф�ɬ���ץ�ߥƥ��ַ��Ǥ��뤳�Ȥ��ǥ�������ݾڤ��Ƥ���.
		return null;
	}
	
	public void setupConstant(Constant constant, Type type, ValueSpecification value) throws ModelException {
		if (value == null) {
			constant.setValue(String.valueOf(ConfigValues.DEFAULT_DATA_ELEMENT_INIT_VALUE));
		} else {
			value = getLeafValueSpecification(value);
			if (type instanceof RedefinitionType) {
				type = ((RedefinitionType)type).getLeafType();
			}
			if (type instanceof ArrayType) {
				setupConstantMembersForArray((ArrayValueSpecification)value, constant, type);
			} else if (type instanceof StructType) {
				setupConstantMembersForRecord((RecordValueSpecification)value, constant, (StructType)type);
			} else if (type instanceof UnionType) {
				setupConstantMembersForUnion((RecordValueSpecification)value, constant, (UnionType)type);
			} else {
				constant.setValue(getValueString(value));
			}
			setConstantType(value, constant);
		}
	}

	private ConstantMember createConstantForArrayElement(ValueSpecification element, Type type) throws ModelException {
		// array��¿�����ˤ�̤�б�
		ConstantMember memberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		//memberConstant.setSingleSource(sourceValueBufferImplementation);
		memberConstant.setType(type);

		if (element == null) {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// ��¤�η��˥ѥǥ��󥰥��Ф�ޤ�ʤ����ˤ��ѹ��Ȥʤä�.
			// for padding
			memberConstant.setValue("0");
			memberConstant.setConstantType(ConstantTypeEnum.NUMERICAL_VALUE);
		} else {
			memberConstant.setValue(getValueString(element));
			setConstantType(element, memberConstant);
		}
		return memberConstant;
	}

	private ConstantMember createConstantForStructElement(ValueSpecification element, StructMember structMember) throws ModelException {
		// array��¿�����ˤ�̤�б�
		ConstantMember memberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		memberConstant.setType(structMember.getType());

		if (element == null) {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// ��¤�η��˥ѥǥ��󥰥��Ф�ޤ�ʤ����ˤ��ѹ��Ȥʤä�.
			// padding
			String typeName = structMember.getType().getOriginalTypeSymbolName();
			Type mType = getConstantMemberType(typeName);
			int arraySize = ((ArrayType)structMember.getType()).getArraySize();
			for (int i = 0; i < arraySize; i++) {
				memberConstant.getMember().add(createConstantForArrayElement(null, mType));
			}
		} else {
			memberConstant.setValue(getValueString(element));
			setConstantType(element, memberConstant);
		}
		return memberConstant;
	}

	private ConstantMember createConstantForUnionElement(ValueSpecification element, UnionMember unionMember) throws ModelException {
		ConstantMember memberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		memberConstant.setType(unionMember.getType());
		memberConstant.setValue(getValueString(element));
		setConstantType(element, memberConstant);
		return memberConstant;
	}

	private void setupConstantMembersForArray(ArrayValueSpecification initValue, Constant initValueConstant, Type type) throws ModelException {
		String typeName = type.getOriginalTypeSymbolName();
		Type mType = getConstantMemberType(typeName);
		for (ValueSpecification element : initValue.getElement()) {
			initValueConstant.getMember().add(createConstantForArrayElement(element, mType));
		}
	}

	private void setupConstantMembersForRecord(RecordValueSpecification initValue, Constant initValueConstant, StructType type) throws ModelException {
		int index = 0;
		for (StructMember member : type.getMember()) {
			// validation���ݾ㤵��뤿�ᡢindex�ϼ�����ǽ�ȷ���Ǥ�
			initValueConstant.getMember().add(createConstantForStructElement(initValue.getField().get(index++), member));
		}
	}

	private Type getConstantMemberType(String typeName) throws ModelException {
		try {
			return this.context.query.selectSingle(this.context.cache.rte.getDependentType(), EObjectConditions.hasAttr(TYPE__SYMBOL_NAME, typeName));
		} catch (ModelException me) {
			return this.context.query.selectSingle(this.context.cache.rte.getRteType(), EObjectConditions.hasAttr(TYPE__SYMBOL_NAME, typeName));
		}
	}

	private void setupConstantMembersForUnion(RecordValueSpecification initValue, Constant initValueConstant, UnionType type) throws ModelException {
		// 1���ܤΥ��С��Τ��ɲ�
		initValueConstant.getMember().add(createConstantForUnionElement(initValue.getField().get(0), type.getMember().get(0)));
	}
	
	public void setConstantType(ValueSpecification valueSpec, Constant valueConst) throws ModelException {
		if (valueSpec instanceof ConstantReference) {
			valueSpec = getLeafValueSpecification(valueSpec);
		}
		if (valueSpec instanceof NumericalValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.NUMERICAL_VALUE);
		} else if (valueSpec instanceof TextValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.TEXT_VALUE);			
		} else { // COVERAGE (numerical, text�ʳ������ꤹ�뤳�ȤϤʤ�����̤��ã)
			valueConst.setConstantType(ConstantTypeEnum.UNKNOWN_VALUE);
		}
	}
}
