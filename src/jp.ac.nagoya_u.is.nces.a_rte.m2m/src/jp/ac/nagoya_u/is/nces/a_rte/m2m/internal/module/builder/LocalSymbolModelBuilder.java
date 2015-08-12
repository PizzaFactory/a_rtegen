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
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Variables;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArgumentDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantValueTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import com.google.common.collect.Lists;

public class LocalSymbolModelBuilder {

	private final ModuleModelBuildContext context;

	public LocalSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public Parameter createIocInDataParam(OsIocDataProperties sourceOsIocDataProperties) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceOsIocDataProperties.getOsIocDataType());

		return createInParam(sourceOsIocDataProperties.getShortName(), type);
	}

	public Parameter createIocOutDataParam(OsIocDataProperties sourceOsIocDataProperties) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceOsIocDataProperties.getOsIocDataType());

		return createOutParam(sourceOsIocDataProperties.getShortName(), type);
	}

	public Parameter createSrInDataParam(Type type) {
		return createInParam(getSymbolNameOfSrDataParam(getInParameterPassType(type)), type);
	}

	public Parameter createSrOutDataParam(Type type) {
		return createOutParam(getSymbolNameOfSrDataParam(ParameterPassTypeEnum.REFERENCE), type);
	}

	private String getSymbolNameOfSrDataParam(ParameterPassTypeEnum passType) {
		switch (passType) {
		case REFERENCE:
			return SymbolNames.SR_DATA_REFERENCE_PARAM_NAME;
		case VALUE:
		default:
			return SymbolNames.SR_DATA_PARAM_NAME;
		}
	}

	public List<Parameter> createCsPortArgValueParams(POperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		List<Parameter> destPortArgValueParams = Lists.newArrayList();
		if (!sourceOperationInstanceInSwc.getContextPort().getPortApiOption().isEmpty()) {
			PortApiOption sourcePortApiOption = sourceOperationInstanceInSwc.getContextPort().getPortApiOption().get(0);

			int i = 0;
			for (PortDefinedArgumentValue sourcePortDefinedArgumentValue : sourcePortApiOption.getPortArgValue()) {
				destPortArgValueParams.add(createCsPortArgValueParam(sourcePortDefinedArgumentValue, i));
				i++;
			}
		}
		return destPortArgValueParams;
	}

	private Parameter createCsPortArgValueParam(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Type type = this.context.builtQuery.<Type> findDest(TYPE, sourcePortDefinedArgumentValue.getValueType());

		return createInParam(SymbolNames.createCsPortArgValueParamName(sourcePortDefinedArgumentValue, index), type);
	}

	public List<Parameter> createCsOperationParams(OperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		AtomicSwComponentType sourceSwComponentType = (AtomicSwComponentType) sourceOperationInstanceInSwc.getContextPort().getParent();

		List<Parameter> destOperationParams = Lists.newArrayList();
		for (ArgumentDataPrototype sourceArgumentDataPrototype : sourceOperationInstanceInSwc.getPrototype().getArgument()) {
			ImplementationDataType sourceImplementationDataType = sourceSwComponentType.getImplementationDataType(sourceArgumentDataPrototype.getType());
			destOperationParams.add(createCsOperationParam(sourceArgumentDataPrototype, sourceImplementationDataType));
		}
		return destOperationParams;
	}

	private Parameter createCsOperationParam(ArgumentDataPrototype sourceArgumentDataPrototype, ImplementationDataType sourceImplementationDataType) throws ModelException {
		Type type = this.context.builtQuery.<Type> findDest(TYPE, sourceImplementationDataType);

		switch (sourceArgumentDataPrototype.getDirection()) {
		case IN:
			return createInParam(sourceArgumentDataPrototype.getShortName(), type);
		case OUT:
			return createOutParam(sourceArgumentDataPrototype.getShortName(), type);
		case INOUT:
		default:
			return createInOutParam(sourceArgumentDataPrototype.getShortName(), type);
		}
	}

	public Parameter createModeParam(ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, Type type) {
		Parameter destParam = ModuleFactory.eINSTANCE.createParameter();
		destParam.setSymbolName(SymbolNames.MODE_VAR_NAME);
		destParam.setType(type);
		return destParam;
	}

	public Parameter createIrvInDataParam(Type type) {
		return createInParam(getSymbolNameOfIrvDataParam(getInParameterPassType(type)), type);
	}

	public Parameter createIrvOutDataParam(Type type) {
		return createOutParam(getSymbolNameOfIrvDataParam(ParameterPassTypeEnum.REFERENCE), type);
	}

	private String getSymbolNameOfIrvDataParam(ParameterPassTypeEnum passType) {
		switch (passType) {
		case REFERENCE:
			return SymbolNames.IRV_DATA_REFERENCE_PARAM_NAME;
		case VALUE:
		default:
			return SymbolNames.IRV_DATA_PARAM_NAME;
		}
	}

	public Parameter createTrustedFunctionIndexParam() {
		Parameter destFunctionIndexParam = ModuleFactory.eINSTANCE.createParameter();
		destFunctionIndexParam.setType(this.context.cache.osTfIndexType);
		destFunctionIndexParam.setSymbolName(SymbolNames.OS_TRUSTED_FUNCTION_INDEX_PARAM_NAME);
		destFunctionIndexParam.setDirection(ParameterDirectionEnum.IN);
		destFunctionIndexParam.setPassType(ParameterPassTypeEnum.VALUE);
		destFunctionIndexParam.setHasConst(false);
		return destFunctionIndexParam;
	}

	public Parameter createTrustedFunctionParamsParam() {
		Parameter destFunctionParamsParam = ModuleFactory.eINSTANCE.createParameter();
		destFunctionParamsParam.setType(this.context.cache.osTfParamRefType);
		destFunctionParamsParam.setSymbolName(SymbolNames.OS_TRUSTED_FUNCTION_PARAMS_PARAM_NAME);
		destFunctionParamsParam.setDirection(ParameterDirectionEnum.IN); // NOTE �����INOUT�������������������Թ�帽�ߤ�����Ȥ��Ƥ���
		destFunctionParamsParam.setPassType(ParameterPassTypeEnum.VALUE); // NOTE �����REFERENCE�������������������Թ�帽�ߤ�����Ȥ��Ƥ���
		destFunctionParamsParam.setHasConst(false);
		return destFunctionParamsParam;
	}

	private Parameter createInParam(String symbolName, Type type) {
		ParameterPassTypeEnum passType = getInParameterPassType(type);
		boolean hasConst = (passType == ParameterPassTypeEnum.REFERENCE);

		return createParam(symbolName, type, ParameterDirectionEnum.IN, passType, hasConst);
	}

	private Parameter createOutParam(String symbolName, Type type) {
		return createParam(symbolName, type, ParameterDirectionEnum.OUT, ParameterPassTypeEnum.REFERENCE, false);
	}

	private Parameter createInOutParam(String symbolName, Type type) {
		return createParam(symbolName, type, ParameterDirectionEnum.INOUT, ParameterPassTypeEnum.REFERENCE, false);
	}

	private Parameter createParam(String symbolName, Type type, ParameterDirectionEnum direction, ParameterPassTypeEnum passType, boolean hasConst) {
		Parameter destParam = ModuleFactory.eINSTANCE.createParameter();
		destParam.setSymbolName(symbolName);
		destParam.setType(type);
		destParam.setDirection(direction);
		destParam.setPassType(passType);
		destParam.setHasConst(hasConst);
		return destParam;
	}

	public ParameterPassTypeEnum getInParameterPassType(Type type) {
		if (type instanceof PrimitiveType || type instanceof PointerType) {
			return ParameterPassTypeEnum.VALUE;
		} else {
			return ParameterPassTypeEnum.REFERENCE;
		}
	}

	public LocalVariable createReturnValueVariable() {
		LocalVariable destStatusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destStatusVariable.setType(this.context.cache.stdReturnType);
		destStatusVariable.setSymbolName(SymbolNames.RETURN_VALUE_LOCAL_VAR_NAME);
		return destStatusVariable;
	}

	public LocalVariable createTempReturnValueVariable() {
		LocalVariable destStatusVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destStatusVariable.setType(this.context.cache.stdReturnType);
		destStatusVariable.setSymbolName(SymbolNames.TEMP_RETURN_VALUE_LOCAL_VAR_NAME);
		return destStatusVariable;
	}

	public LocalVariable createSrDataVariable(VariableDataInstanceInSwc sourceDataInstanceInSwc, String symbolName) throws ModelException {
		LocalVariable destDataVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destDataVariable.setType(this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType()));
		destDataVariable.setSymbolName(symbolName);
		return destDataVariable;
	}

	public LocalVariable createSrInvalidValueVariable(VariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		LocalVariable destInvalidValueVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destInvalidValueVariable.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destInvalidValueVariable.setSymbolName(SymbolNames.SR_INVALID_VALUE_VAR_NAME);
		return destInvalidValueVariable;
	}

	public LocalVariable createSrFilterResultVariable() {
		LocalVariable destFilterResultVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destFilterResultVariable.setType(this.context.cache.booleanType);
		destFilterResultVariable.setSymbolName(SymbolNames.SR_FILTER_RESULT_VAR_NAME);
		return destFilterResultVariable;
	}

	public LocalVariable createRteSendTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.rteSendTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.RTE_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createComSendSignalTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.comSendSignalTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.COM_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createComSendSignalGroupTrustedFunctionParamVariable() {
		LocalVariable destTfParamVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destTfParamVariable.setType(this.context.cache.comSendSignalGroupTfParamType.get());
		destTfParamVariable.setSymbolName(SymbolNames.COM_GROUP_TRUSTED_FUNCTION_PARAM_VAR_NAME);
		return destTfParamVariable;
	}

	public LocalVariable createComProxySignalIdVariable() {
		LocalVariable destVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destVariable.setType(this.context.cache.comSignalIdType);
		destVariable.setSymbolName(SymbolNames.COM_PROXY_SIGNAL_ID_VAR_NAME);
		return destVariable;
	}

	public LocalVariable createComProxyFunctionTableIndexVariable() {
		LocalVariable destVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destVariable.setType(this.context.cache.comProxyFunctionTableIndexType);
		destVariable.setSymbolName(SymbolNames.COM_PROXY_FUNCTION_TABLE_INDEX_VAR_NAME);
		return destVariable;
	}
	
	public LocalVariable createEntityEventVariable() {
		LocalVariable destVariable = ModuleFactory.eINSTANCE.createLocalVariable();
		destVariable.setType(this.context.cache.osEventMaskType);
		destVariable.setSymbolName(SymbolNames.ENTITY_EVENT_VAR_NAME);
		return destVariable;
	}

	public LocalVariable createComProxyUnionDataVariable(UnionType proxyUnionType) {
		return Variables.createUnionTypeLocalVariable(proxyUnionType, SymbolNames.COM_PROXY_UNION_DATA_VAR_NAME);
	}

	public UnionType createPrimitiveComProxyUnionType() {
		UnionType destProxyUnionType = ModuleFactory.eINSTANCE.createUnionType();
		destProxyUnionType.setIsAnonymous(true);
		destProxyUnionType.getMember().add(createComProxyUnionMember(this.context.cache.uint8Type));
		destProxyUnionType.getMember().add(createComProxyUnionMember(this.context.cache.uint16Type));
		destProxyUnionType.getMember().add(createComProxyUnionMember(this.context.cache.uint32Type));
		return destProxyUnionType;
	}

	private UnionMember createComProxyUnionMember(PrimitiveType type) {
		UnionMember destUnionMember = ModuleFactory.eINSTANCE.createUnionMember();
		destUnionMember.setMemberName(SymbolNames.createComProxyUnionVariableMemberName(type));
		destUnionMember.setType(type);
		return destUnionMember;
	}

	public void removeUnusedLocalVariables(Function targetFunction) {
		for (LocalVariable targetLocalVariable : Lists.newArrayList(targetFunction.getLocalVariable())) {
			if (isUnusedLocalVariable(targetLocalVariable, targetFunction)) {
				targetFunction.getLocalVariable().remove(targetLocalVariable);
			}
		}
	}

	private boolean isUnusedLocalVariable(LocalVariable localVariable, Function function) {
		return this.context.query.find(function, ref(localVariable)).isEmpty();
	}

	private ValueSpecification getLeafValueSpecification(ValueSpecification sourceValue) {
		// OCL�ȼ�������뤬����Ͽ���Ƥ��ʤ�ValueSpecification������������Τǡ�Java�Ǽ�������
		if (sourceValue instanceof ConstantReference) {
			return getLeafValueSpecification(((ConstantReference)sourceValue).getEndValueSpec());
		}
		return sourceValue;
	}

	public void buildConstantValue(Constant targetConstant, ValueSpecification sourceValue, Type type) throws ModelException {
		if (sourceValue == null) {
			targetConstant.setValue(String.valueOf(ConfigValues.DEFAULT_DATA_ELEMENT_INIT_VALUE));

		} else {
			ValueSpecification sourceLeafValue = getLeafValueSpecification(sourceValue);
			Type leafType;
			if (type instanceof RedefinitionType) {
				leafType = ((RedefinitionType) type).getLeafType();
			} else {
				leafType = type;
			}

			if (leafType instanceof ArrayType) {
				buildConstantMembersForArray(targetConstant, (ArrayValueSpecification) sourceLeafValue, leafType);

			} else if (leafType instanceof StructType) {
				buildConstantMembersForRecord(targetConstant, (RecordValueSpecification) sourceLeafValue, (StructType) leafType);

			} else if (leafType instanceof UnionType) {
				buildConstantMembersForUnion(targetConstant, (RecordValueSpecification) sourceLeafValue, (UnionType) leafType);

			} else {
				targetConstant.setValue(getValueString(sourceLeafValue));
			}
			buildConstantValueType(targetConstant, sourceLeafValue);
		}
	}

	private void buildConstantMembersForArray(Constant targetConstant, ArrayValueSpecification sourceValue, Type type) throws ModelException {
		Type memberType = getConstantMemberType(type.getOriginalTypeSymbolName());

		for (ValueSpecification sourceElementValue : sourceValue.getElement()) {
			targetConstant.getMember().add(createConstantForArrayElement(sourceElementValue, memberType));
		}
	}

	private ConstantMember createConstantForArrayElement(ValueSpecification sourceElementValue, Type type) {
		// array��¿�����ˤ�̤�б�
		ConstantMember destMemberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		destMemberConstant.setType(type);
		destMemberConstant.setValue(getValueString(sourceElementValue));
		buildConstantValueType(destMemberConstant, sourceElementValue);
		return destMemberConstant;
	}

	private void buildConstantMembersForRecord(Constant targetConstant, RecordValueSpecification sourceValue, StructType type) {
		int index = 0;
		for (StructMember member : type.getMember()) {
			// NOTE validation���ݾ㤵��뤿�ᡢindex�ϼ�����ǽ�ȷ���Ǥ�
			targetConstant.getMember().add(createConstantForRecordElement(sourceValue.getField().get(index++), member));
		}
	}

	private ConstantMember createConstantForRecordElement(ValueSpecification sourceElementValue, StructMember structMember) {
		// array��¿�����ˤ�̤�б�
		ConstantMember destMemberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		destMemberConstant.setType(structMember.getType());
		destMemberConstant.setValue(getValueString(sourceElementValue));
		buildConstantValueType(destMemberConstant, sourceElementValue);
		return destMemberConstant;
	}

	private void buildConstantMembersForUnion(Constant targetConstant, RecordValueSpecification sourceValue, UnionType type) {
		// 1���ܤΥ��С��Τ��ɲ�
		targetConstant.getMember().add(createConstantForUnionElement(sourceValue.getField().get(0), type.getMember().get(0)));
	}

	private ConstantMember createConstantForUnionElement(ValueSpecification sourceElementValue, UnionMember unionMember) {
		ConstantMember destMemberConstant = ModuleFactory.eINSTANCE.createConstantMember();
		destMemberConstant.setType(unionMember.getType());
		destMemberConstant.setValue(getValueString(sourceElementValue));
		buildConstantValueType(destMemberConstant, sourceElementValue);
		return destMemberConstant;
	}

	private Type getConstantMemberType(String typeName) throws ModelException {
		try {
			return this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, typeName));
		} catch (ModelException e) {
			return this.context.query.selectSingle(this.context.cache.rte.getImplementationDataType(), hasAttr(TYPE__SYMBOL_NAME, typeName));
		}
	}

	private String getValueString(ValueSpecification sourceValue) {
		// OCL�ȼ�������뤬����Ͽ���Ƥ��ʤ�ValueSpecification������������Τǡ�Java�Ǽ�������
		ValueSpecification sourceLeafValue = getLeafValueSpecification(sourceValue);
		if (sourceValue instanceof NumericalValueSpecification) {
			return ((NumericalValueSpecification) sourceLeafValue).getValue().toString();

		} else if (sourceValue instanceof TextValueSpecification) {
			return ((TextValueSpecification) sourceLeafValue).getValue();
		}

		// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
		// ����/��¤�η�/�����η��Υ��Ф�ɬ���ץ�ߥƥ��ַ��Ǥ��뤳�Ȥ��ǥ�������ݾڤ��Ƥ���.
		return null;
	}

	public void buildConstantValueType(Constant targetConstant, ValueSpecification sourceValue) {
		ValueSpecification sourceLeafValue;
		if (sourceValue instanceof ConstantReference) {
			sourceLeafValue = getLeafValueSpecification(sourceValue);
		} else {
			sourceLeafValue = sourceValue;
		}

		if (sourceLeafValue instanceof NumericalValueSpecification) {
			targetConstant.setConstantValueType(ConstantValueTypeEnum.NUMERICAL_VALUE);

		} else if (sourceLeafValue instanceof TextValueSpecification) {
			targetConstant.setConstantValueType(ConstantValueTypeEnum.TEXT_VALUE);			

		} else { // COVERAGE (numerical, text�ʳ������ꤹ�뤳�ȤϤʤ�����̤��ã)
			targetConstant.setConstantValueType(ConstantValueTypeEnum.UNKNOWN_VALUE);
		}
	}
}
