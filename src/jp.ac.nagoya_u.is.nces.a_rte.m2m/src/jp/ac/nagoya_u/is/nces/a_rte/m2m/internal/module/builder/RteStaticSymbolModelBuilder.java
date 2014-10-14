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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.IMPLEMENTATION_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.OS_TASK_EX___GET_OWNER_PARTITION__OSTASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RTE_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ConstantReference;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Optional;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class RteStaticSymbolModelBuilder {

	private final ModuleModelBuildContext context;
	private MemoryMappingModelBuilder memmapBuilder;

	public RteStaticSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
	}

	public void buildApiSymbols() throws ModelException {
		buildApiTypes(this.context.cache.rte);
		buildApiConstants();
	}

	private void buildApiTypes(Rte targetRte) throws ModelException {
		// ������������
		for (ImplementationDataType dataType : this.context.query.<ImplementationDataType> findByKind(IMPLEMENTATION_DATA_TYPE)) {
			PrimitiveType type = createImplementationDataType(dataType);

			// ���������������뤫��Ƚ�̡��������ʤ���硤��¸���Ȥ������
			if (this.context.query.get(dataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE)) {
				targetRte.getRteType().add(type);
			} else {
				targetRte.getDependentType().add(type);
			}
		}

		// ����������������Ʊ�쥷��ܥ�̾�ˤʤ��ΤϤޤȤ���
		ListMultimap<String, Type> typeName2TypeMap = this.context.query.groupByKey(targetRte.getRteType(), TYPE__SYMBOL_NAME);
		for (String keyTypeName : typeName2TypeMap.keys()) {
			List<Type> types = typeName2TypeMap.get(keyTypeName);

			Type firstType = types.get(0);
			for (Type anotherType : types.subList(1, types.size())) {
				firstType.getSource().addAll(anotherType.getSource());
				EcoreUtil.remove(anotherType);
			}
		}
	}

	private PrimitiveType createImplementationDataType(ImplementationDataType sourceDataType) {
		PrimitiveType type = ModuleFactory.eINSTANCE.createPrimitiveType();
		type.setSymbolName(sourceDataType.getShortName());
		type.setSingleSource(sourceDataType);
		type.setOriginalTypeSymbolName(sourceDataType.getBaseType().getNativeDeclaration());
		type.setSignedness(Types.getSignedness(sourceDataType));
		return type;
	}

	private void buildApiConstants() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Swc targetSwc = optionalSwc.get();

			// ���������ι���
			for (PPortPrototype portPrototype : swComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getApiInitValueConstant().add(createApiInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
					}
				}
			}
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getApiInitValueConstant().add(createApiInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
					}
				}
			}

			// ����͡�����Ӳ���������ι���
			for (ApplicationDataType sourceApplicationDataType : this.context.query.select(swComponentType.getUsingApplicationDataTypes(),
					hasOp(APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE, true))) {
				buildUpperLowerLimitConstant(targetSwc, sourceApplicationDataType, swComponentType);
			}

			// ���������ι���
			for (AutosarDataType sourceDataType : swComponentType.getUsingDataTypes()) {
				ApplicationDataType sourceApplicationDataType;
				ImplementationDataType sourceImplementationDataType;
				if (sourceDataType instanceof ApplicationDataType) {
					sourceApplicationDataType = (ApplicationDataType) sourceDataType;
					sourceImplementationDataType = swComponentType.getImplementationDataType(sourceApplicationDataType);
				} else {
					sourceApplicationDataType = null;
					sourceImplementationDataType = (ImplementationDataType) sourceDataType;
				}

				if (this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE, sourceApplicationDataType)) {
					CompuMethod sourceCompuMethod = this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE,
							sourceApplicationDataType);
					buildEnumConstant(targetSwc, sourceImplementationDataType, sourceCompuMethod, swComponentType);
				}
			}

			// ���ץꥱ������󥨥顼����ι���
			targetSwc.getApiApplicationErrorConstant().addAll(createApplicationErrorConstants(swComponentType));
		}
	}

	private Constant createApiInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createInitValueConstantName(sourceDataInstanceInSwc), RoleNames.INIT_VALUE);
	}

	private List<Constant> createApplicationErrorConstants(AtomicSwComponentType sourceSwComponentType) {
		// ���ץꥱ������󥨥顼����ι���
		List<Constant> applicationErrorConstants = Lists.newArrayList();
		for (ClientServerInterface clientServerInterface : sourceSwComponentType.getUsingClientServerInterfaces()) {
			for (ApplicationError applicationError : clientServerInterface.getPossibleError()) {
				// ���ץꥱ������󥨥顼���������
				applicationErrorConstants.add(createApplicationErrorConstant(applicationError));
			}
		}

		// ���ץꥱ������󥨥顼���������ʥ���ܥ�̾�ν�ʣ�����������������
		List<Constant> normalizedApplicationErrorConstants = Lists.newArrayList();

		ListMultimap<String, Constant> symbolName2ConstantMap = this.context.query.groupByKey(applicationErrorConstants, CONSTANT__SYMBOL_NAME);
		for (String keySymbolName : symbolName2ConstantMap.keys()) {
			List<Constant> constants = symbolName2ConstantMap.get(keySymbolName);

			Constant firstConstant = constants.get(0);
			for (Constant anotherConstant : constants.subList(1, constants.size())) {
				firstConstant.getSource().addAll(anotherConstant.getSource());
			}
			normalizedApplicationErrorConstants.add(firstConstant);
		}
		return normalizedApplicationErrorConstants;
	}

	private Constant createApplicationErrorConstant(ApplicationError sourceApplicationError) {
		Constant applicationErrorConstant = ModuleFactory.eINSTANCE.createConstant();
		applicationErrorConstant.setSymbolName(SymbolNames.createApplicationErrorConstantName(sourceApplicationError));
		applicationErrorConstant.setType(this.context.cache.stdReturnType);
		applicationErrorConstant.setValue(String.valueOf(sourceApplicationError.getErrorCode()));
		return applicationErrorConstant;
	}

	private Constant createInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification initValueInSwc, String symbolName, String roleName) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc);
		ValueSpecification initValue;
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) {
			initValue = initValueInSwc;
		} else {
			initValue = this.context.query.get(sourceDataInstanceInSwc.getInstance().get(0), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		}

		String initValueString;
		if (initValue == null) {
			initValueString = String.valueOf(ConfigValues.DEFAULT_DATA_ELEMENT_INIT_VALUE);
		} else {
			initValueString = EmfUtils.<String> exInvoke(initValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION);
		}

		// ��������������
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSingleSource(sourceDataInstanceInSwc);
		initValueConstant.setRoleName(roleName);
		initValueConstant.setSymbolName(symbolName);
		initValueConstant.setType(type);
		initValueConstant.setValue(initValueString);
		
		//Constant �μ�������
		ValueSpecification valueSpec = initValue;
		Constant valueConst = initValueConstant;
		if (valueSpec instanceof ConstantReference) {
			valueSpec = EmfUtils.<ValueSpecification> exInvoke(valueSpec, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		}
		if (valueSpec instanceof NumericalValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.NUMERICAL_VALUE);
		} else if (valueSpec instanceof TextValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.TEXT_VALUE);			
		} else { // COVERAGE (numerical, text�ʳ������ꤹ�뤳�ȤϤʤ�����̤��ã)
			valueConst.setConstantType(ConstantTypeEnum.UNKNOWN_VALUE);
		}
		return initValueConstant;
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, ApplicationDataType sourceApplicationDataType, AtomicSwComponentType swComponentType) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, swComponentType.getImplementationDataType(sourceApplicationDataType));
		List<IncludedDataTypeSet> includedDataTypeSets = swComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(sourceApplicationDataType);
		Set<String> literalPrefixes = Sets.newHashSet(this.context.query.<String> collect(includedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));

		// ����͡������ͤ�����
		if (literalPrefixes.isEmpty()) {
			buildUpperLowerLimitConstant(targetSwc, null, sourceApplicationDataType, type);
		} else {
			for (String literalPrefix : literalPrefixes) {
				buildUpperLowerLimitConstant(targetSwc, literalPrefix, sourceApplicationDataType, type);
			}
		}
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, String sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		targetSwc.getApiUpperLowerLimitConstant().add(createUpperLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
		targetSwc.getApiUpperLowerLimitConstant().add(createLowerLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
	}

	private Constant createLowerLimitConstant(String sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant lowerLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		lowerLimitConstant.setSymbolName(SymbolNames.createLowerLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		lowerLimitConstant.setType(type);
		lowerLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getLowerLimitValue());
		return lowerLimitConstant;
	}

	private Constant createUpperLimitConstant(String sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant upperLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		upperLimitConstant.setSymbolName(SymbolNames.createUpperLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		upperLimitConstant.setType(type);
		upperLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getUpperLimitValue());
		return upperLimitConstant;
	}

	private void buildEnumConstant(Swc targetSwc, ImplementationDataType implementationDataType, CompuMethod sourceCompuMethod, AtomicSwComponentType swComponentType) throws ModelException {
		// ����͡������ͤ�����
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, implementationDataType);
		List<IncludedDataTypeSet> includedDataTypeSets = swComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(implementationDataType);
		Set<String> literalPrefixes = Sets.newHashSet(this.context.query.<String> collect(includedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));

		if (literalPrefixes.isEmpty()) {
			for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
				if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
					targetSwc.getApiEnumConstant().add(createEnumConstant(null, sourceCompuScale, type));
				}
			}
		} else {
			for (String literalPrefix : literalPrefixes) {
				for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
					if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
						targetSwc.getApiEnumConstant().add(createEnumConstant(literalPrefix, sourceCompuScale, type));
					}
				}
			}
		}
	}

	private Constant createEnumConstant(String sourceLiteralPrefix, CompuScale sourceCompuScale, PrimitiveType type) throws ModelException {
		String enumLiteral = this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE);

		Constant lowerLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		lowerLimitConstant.setSymbolName(SymbolNames.createEnumConstantName(sourceLiteralPrefix, enumLiteral));
		lowerLimitConstant.setType(type);
		lowerLimitConstant.setValue(sourceCompuScale.getLowerLimit().getValue());
		return lowerLimitConstant;
	}

	public void buildImplSymbols() throws ModelException {
		buildOsTrustedMacros();
		buildTrustedFunctionParamTypes(this.context.cache.rte);
		buildSwcImplConstants();
		buildRteBufferSymbols();
		buildFilterSymbols();
		buildEntityStartSymbols();
	}

	private void buildOsTrustedMacros() throws ModelException {
		for (EcucPartition sourceEcucPartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(sourceEcucPartition);

			targetPartition.setOsTrustedMacro(createOsTrustedMacro(sourceEcucPartition));
		}
	}

	private Macro createOsTrustedMacro(EcucPartition sourceEcucPartition) {
		Macro macro = ModuleFactory.eINSTANCE.createMacro();
		macro.setSingleSource(sourceEcucPartition);
		macro.setSymbolName(sourceEcucPartition.isTrusted() ? SymbolNames.OS_TRUSTED_MACRO : SymbolNames.OS_NON_TRUSTED_MACRO);
		return macro;
	}

	private void buildTrustedFunctionParamTypes(Rte targetRte) {
		if (!this.context.query.findByKind(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).isEmpty()) {
			ComSendTrustedFunctionParamType type = createComSendTrustedFunctionParamType();
			targetRte.getRteType().add(type);
			this.context.cache.comSendSignalTrustedFunctionParamType = Optional.of(type);
		} else {
			this.context.cache.comSendSignalTrustedFunctionParamType = Optional.absent();
		}
	}

	private ComSendTrustedFunctionParamType createComSendTrustedFunctionParamType() {
		ComSendTrustedFunctionParamType type = ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType();
		type.setSymbolName(SymbolNames.COM_SEND_SIGNAL_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
		return type;
	}

	private void buildSwcImplConstants() throws ModelException {
		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, swComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Swc targetSwc = optionalSwc.get();
			for (RPortPrototype portPrototype : swComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					// ̵��������ι���
					if (dataInstanceInSwc.isInvalidationEnabled()) {
						buildInvalidValueConstant(targetSwc, dataInstanceInSwc);
					}

					// RTE�����������������ι���
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getImplInitValueConstant().add(createImplInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
					}

					// �ե��륿����ι���
					if (dataInstanceInSwc.isFilterEnabled()) {
						buildFilterConstant(targetSwc, dataInstanceInSwc);
					}
				}
			}

			for (PPortPrototype portPrototype : swComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc dataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					// ̵��������ι���
					if (dataInstanceInSwc.isInvalidationEnabled()) {
						buildInvalidValueConstant(targetSwc, dataInstanceInSwc);
					}

					// RTE�����������������ι���
					if (this.context.query.get(dataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getImplInitValueConstant().add(createImplInitValueConstant(dataInstanceInSwc, dataInstanceInSwc.getInitValue()));
					}
				}

				// �ݡ�����������ι���
				if (!portPrototype.getPortApiOption().isEmpty()) {
					PortApiOption portApiOption = portPrototype.getPortApiOption().get(0);
					buildPortArgValueConstants(targetSwc, portApiOption);
				}
			}
		}
	}

	private Constant createImplInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createImplInitValueConstantName(sourceDataInstanceInSwc), RoleNames.IMPL_INIT_VALUE);
	}

	private void buildInvalidValueConstant(Swc targetSwc, VariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc);
		ValueSpecification invalidValue = sourceDataInstanceInSwc.getInvalidValue();

		// ̵�������������
		Constant invalidValueConstant = ModuleFactory.eINSTANCE.createConstant();
		invalidValueConstant.setSingleSource(sourceDataInstanceInSwc);
		invalidValueConstant.setRoleName(RoleNames.INVALID_VALUE);
		invalidValueConstant.setSymbolName(SymbolNames.createInvalidValueConstantName(sourceDataInstanceInSwc));
		invalidValueConstant.setType(type);
		invalidValueConstant.setValue(EmfUtils.<String> exInvoke(invalidValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));

		//Constant �μ�������
		ValueSpecification valueSpec = invalidValue;
		Constant valueConst = invalidValueConstant;
		if (valueSpec instanceof ConstantReference) {
			valueSpec = EmfUtils.<ValueSpecification> exInvoke(valueSpec, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		}
		if (valueSpec instanceof NumericalValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.NUMERICAL_VALUE);
		} else if (valueSpec instanceof TextValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.TEXT_VALUE);			
		} else { // COVERAGE (numerical, text�ʳ������ꤹ�뤳�ȤϤʤ�����̤��ã)
			valueConst.setConstantType(ConstantTypeEnum.UNKNOWN_VALUE);
		}
		targetSwc.getInvalidValueConstant().add(invalidValueConstant);
	}

	private void buildPortArgValueConstants(Swc targetSwc, PortApiOption sourcePortApiOption) throws ModelException {
		int i = 0;
		for (PortDefinedArgumentValue sourcePortDefinedArgumentValue : sourcePortApiOption.getPortArgValue()) {
			targetSwc.getPortArgValueConstant().add(createPortArgValueConstant(sourcePortDefinedArgumentValue, i));
			i++;
		}
	}

	private Constant createPortArgValueConstant(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSingleSource(sourcePortDefinedArgumentValue);
		constant.setSymbolName(SymbolNames.createPortArgValueConstantName(sourcePortDefinedArgumentValue, index));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourcePortDefinedArgumentValue.getValueType()));
		constant.setValue(EmfUtils.<String> exInvoke(sourcePortDefinedArgumentValue.getValue(), VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));
		return constant;
	}

	private void buildFilterConstant(Swc targetSwc, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		switch (sourceDataInstanceInSwc.getFilter().getDataFilterType()) {
		case MASKED_NEW_DIFFERS_MASKED_OLD: {
			targetSwc.getFilterConstant().add(createFilterMaskConstant(sourceDataInstanceInSwc));
			break;
		}
		case MASKED_NEW_DIFFERS_X:
		case MASKED_NEW_EQUALS_X: {
			targetSwc.getFilterConstant().add(createFilterMaskConstant(sourceDataInstanceInSwc));
			targetSwc.getFilterConstant().add(createFilterXConstant(sourceDataInstanceInSwc));
			break;
		}
		case NEW_IS_OUTSIDE:
		case NEW_IS_WITHIN: {
			targetSwc.getFilterConstant().add(createFilterMinConstant(sourceDataInstanceInSwc));
			targetSwc.getFilterConstant().add(createFilterMaxConstant(sourceDataInstanceInSwc));
			break;
		}
		case ONE_EVERY_N: {
			targetSwc.getFilterConstant().add(createFilterPeriodConstant(sourceDataInstanceInSwc));
			targetSwc.getFilterConstant().add(createFilterOffsetConstant(sourceDataInstanceInSwc));
			break;
		}
		case ALWAYS:
		case NEVER:
		default:
			break;
		}
	}

	private Constant createFilterMaskConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterMaskConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMask()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_MASK_ROLE_NAME);
		return constant;
	}

	private Constant createFilterXConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterXConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getX()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_X_ROLE_NAME);
		return constant;
	}

	private Constant createFilterMinConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterMinConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMin()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_MIN_ROLE_NAME);
		return constant;
	}

	private Constant createFilterMaxConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterMaxConstantName(sourceDataInstanceInSwc));
		constant.setType(this.context.builtQuery.findPrimitiveType(sourceDataInstanceInSwc));
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMax()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_MAX_ROLE_NAME);
		return constant;
	}

	private Constant createFilterPeriodConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceDataInstanceInSwc.getFilter().getPeriod());
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterPeriodConstantName(sourceDataInstanceInSwc));
		constant.setType(type);
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getPeriod()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_PERIOD_ROLE_NAME);
		return constant;
	}

	private Constant createFilterOffsetConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceDataInstanceInSwc.getFilter().getPeriod());
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(SymbolNames.createFilterOffsetConstantName(sourceDataInstanceInSwc));
		constant.setType(type);
		constant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getOffset()));
		constant.setSingleSource(sourceDataInstanceInSwc);
		constant.setRoleName(RoleNames.FILTER_OFFSET_ROLE_NAME);
		return constant;
	}

	private void buildRteBufferSymbols() throws ModelException {
		for (RteValueBufferImplementation sourceValueBufferImplementation : this.context.query.<RteValueBufferImplementation> findByKind(RTE_VALUE_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(sourceValueBufferImplementation.getOwnerPartition());

			InternalEcuReceiver receiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			if (receiver.getSource().getPrototype().isEventSemantics()) {
				Constant maxLengthConstant = createRteBufferQueueMaxLengthConstant(sourceValueBufferImplementation, receiver);
				this.context.cache.rte.getRteTypeConstant().add(maxLengthConstant);

				RteBufferQueueType queueType = createRteBufferQueueType(sourceValueBufferImplementation, receiver, maxLengthConstant);
				this.context.cache.rte.getRteType().add(queueType);

				RteBufferQueuedVariable queuedVariable = createRteBufferQueuedVariable(sourceValueBufferImplementation, receiver, queueType);
				queuedVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
				targetPartition.getRteBufferQueuedVariable().add(queuedVariable);

			} else {
				buildRteBufferVariableSet(targetPartition, sourceValueBufferImplementation, receiver);
			}
		}
	}

	private void buildFilterSymbols() throws ModelException {
		for (FilterBufferImplementation filterBufferImplementation : this.context.query.<FilterBufferImplementation> findByKind(FILTER_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findPartition(filterBufferImplementation.getOwnerPartition());
			buildFilterVariable(targetPartition, filterBufferImplementation);
		}
	}

	private void buildRteBufferVariableSet(Partition targetPartition, RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findPrimitiveType(receiver.getSource().getPrototype());

		// RTE�Хåե��ν��������ι���
		Constant initValueConstant = createRteBufferInitValueConstant(sourceValueBufferImplementation, receiver, type);
		targetPartition.getRteBufferInitValueConstant().add(initValueConstant);

		// RTE�Хåե��ι���
		targetPartition.getRteBufferVariableSet().add(createRteBufferVariableSet(sourceValueBufferImplementation, receiver, type, initValueConstant));
	}

	private RteBufferVariableSet createRteBufferVariableSet(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type, Constant initValueConstant)
			throws ModelException {
		boolean initAtDefinition = EmfUtils.<Boolean> exInvoke(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION);

		RteBufferVariableSet rteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		rteBuffer.setSingleSource(sourceValueBufferImplementation);
		 // NOTE C�����ˤϸ���ʤ����ۥ���ܥ�����������Ȥ��Թ�奷��ܥ�̾�����ꤷ�Ƥ���
		rteBuffer.setSymbolName(SymbolNames.createRteBufferVariableName(receiver.getSource()));

		GlobalVariable valueVariable = createRteBufferValueVariable(sourceValueBufferImplementation, receiver, type, initValueConstant, initAtDefinition);
		valueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
		rteBuffer.setValueVariable(valueVariable);
		
		if (sourceValueBufferImplementation.getHasStatus()) {
			GlobalVariable statusVariable = createRteBufferStatusVariable(sourceValueBufferImplementation, receiver, initAtDefinition);
			statusVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition())));
			rteBuffer.setStatusVariable(statusVariable);
		}
		return rteBuffer;
	}

	private Constant createRteBufferInitValueConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type) throws ModelException {
		ValueSpecification initValue = this.context.query.get(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);

		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSingleSource(sourceValueBufferImplementation);
		initValueConstant.setSymbolName(SymbolNames.createRteBufferInitValueConstantName(receiver.getSource()));
		initValueConstant.setType(type);
		initValueConstant.setValue(EmfUtils.<String> exInvoke(initValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));

		//Constant �μ�������
		ValueSpecification valueSpec = initValue;
		Constant valueConst = initValueConstant;
		if (valueSpec instanceof ConstantReference) {
			valueSpec = EmfUtils.<ValueSpecification> exInvoke(valueSpec, VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION);
		}
		if (valueSpec instanceof NumericalValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.NUMERICAL_VALUE);
		} else if (valueSpec instanceof TextValueSpecification) {
			valueConst.setConstantType(ConstantTypeEnum.TEXT_VALUE);			
		} else { // COVERAGE (numerical, text�ʳ������ꤹ�뤳�ȤϤʤ�����̤��ã)
			valueConst.setConstantType(ConstantTypeEnum.UNKNOWN_VALUE);
		}
		return initValueConstant;
	}

	private GlobalVariable createRteBufferValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type, Constant initValueConstant,
			boolean initAtDefinition) throws ModelException {
		GlobalVariable valueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		valueVariable.setSymbolName(SymbolNames.createRteBufferValueVariableName(receiver.getSource()));
		valueVariable.setType(type);
		valueVariable.setInitValueConstant(initValueConstant);
		valueVariable.setInitAtDefinition(initAtDefinition);
		return valueVariable;
	}

	private GlobalVariable createRteBufferStatusVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, boolean initAtDefinition) throws ModelException {
		GlobalVariable statusVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		statusVariable.setSymbolName(SymbolNames.createRteBufferStatusVariableName(receiver.getSource()));
		statusVariable.setType(this.context.cache.stdReturnType);
		statusVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		statusVariable.setInitAtDefinition(initAtDefinition);
		return statusVariable;
	}

	private RteBufferQueueType createRteBufferQueueType(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Constant maxLengthConstant) throws ModelException {
		RteBufferQueueType queuedVariable = ModuleFactory.eINSTANCE.createRteBufferQueueType();
		queuedVariable.setSingleSource(sourceValueBufferImplementation);
		queuedVariable.setSymbolName(SymbolNames.createRteBufferQueueTypeName(receiver.getSource()));
		queuedVariable.setElementType(this.context.builtQuery.findPrimitiveType(receiver.getSource().getPrototype()));
		queuedVariable.setMaxLengthConstant(maxLengthConstant);
		return queuedVariable;
	}

	private RteBufferQueuedVariable createRteBufferQueuedVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, RteBufferQueueType queueType)
			throws ModelException {
		RteBufferQueuedVariable queuedVariable = ModuleFactory.eINSTANCE.createRteBufferQueuedVariable();
		queuedVariable.setSingleSource(sourceValueBufferImplementation);
		queuedVariable.setSymbolName(SymbolNames.createRteBufferQueuedVariableName(receiver.getSource()));
		queuedVariable.setType(queueType);

		queuedVariable.setInitAtDefinition(EmfUtils.<Boolean> exInvoke(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION));
		return queuedVariable;
	}

	private Constant createRteBufferQueueMaxLengthConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver) {
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		Constant maxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		maxLengthConstant.setSymbolName(SymbolNames.createRteBufferQueuedVariableMaxLengthConstantName(receiver.getSource()));
		maxLengthConstant.setType(this.context.cache.uint32Type);
		maxLengthConstant.setValue(String.valueOf(dataInstanceInSwc.getQueueLength()));
		maxLengthConstant.setSingleSource(sourceValueBufferImplementation);
		return maxLengthConstant;
	}

	private void buildFilterVariable(Partition ownerPartition, FilterBufferImplementation filterBufferImplementation) throws ModelException {
		InternalEcuReceiver receiver = filterBufferImplementation.getParent().getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstance = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		// �ե��륿�Хåե�������
		if (this.context.query.get(dataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC)) {
			// �ե��륿����ͥХåե�������
			PrimitiveType type = this.context.builtQuery.findPrimitiveType(dataInstance);

			GlobalVariable filterVariable = createFilterOldValueVariable(filterBufferImplementation, receiver, type);
			ownerPartition.getFilterOldValueVariable().add(filterVariable);
		} else {
			// �ե��륿����Хåե�������
			PrimitiveType type = this.context.builtQuery.getAppropriateType(dataInstance.getFilter().getPeriod());

			Constant filterOccurrenceInitValue = createFilterOccurrenceInitValueConstant(filterBufferImplementation, receiver, dataInstance, type);
			ownerPartition.getFilterConstant().add(filterOccurrenceInitValue);

			GlobalVariable filterVariable = createFilterOccurrenceVariable(filterBufferImplementation, receiver, type, filterOccurrenceInitValue);
			ownerPartition.getFilterOccurrenceVariable().add(filterVariable);
		}
	}

	private Constant createFilterOccurrenceInitValueConstant(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver receiver, RVariableDataInstanceInSwc dataInstanceInSwc,
			PrimitiveType type) {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSingleSource(sourceFilterBufferImplementation);
		constant.setSymbolName(SymbolNames.createFilterOccurrenceInitValueConstantName(receiver.getSource()));
		constant.setType(type);
		constant.setValue("0");
		return constant;
	}

	private GlobalVariable createFilterOccurrenceVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type,
			Constant filterOccurrenceInitValue) throws ModelException {
		GlobalVariable filterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		filterVariable.setSingleSource(sourceFilterBufferImplementation);
		filterVariable.setSymbolName(SymbolNames.createFilterOccurrenceVariableName(receiver.getSource()));
		filterVariable.setType(type);
		filterVariable.setInitValueConstant(filterOccurrenceInitValue);
		filterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		return filterVariable;
	}

	private GlobalVariable createFilterOldValueVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver receiver, PrimitiveType type) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceFilterBufferImplementation.getParent().getValueBufferImplementation());

		GlobalVariable filterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		filterVariable.setSymbolName(SymbolNames.createFilterOldValueVariableName(receiver.getSource()));
		filterVariable.setType(type);
		filterVariable.setSingleSource(sourceFilterBufferImplementation);
		filterVariable.setInitValueConstant(initValueConstant);
		filterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		return filterVariable;
	}

	private void buildEntityStartSymbols() throws ModelException {
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			EcucPartition ecucPartition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);
			Partition targetPartition = this.context.builtQuery.findPartition(ecucPartition);

			Optional<OsTaskActivateEntityStarter> osTaskActivateEntityStarter = this.context.query.tryFindSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
			List<OsEventSetEntityStarter> osEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));

			if (osTaskActivateEntityStarter.isPresent()) {
				// ���ʥ֥뵯ư�ˤĤ��ƤΥ����Х��ѿ�����������������
				buildEntityStartStaticSymbols(targetPartition, osTaskActivateEntityStarter.get(), sourceOsTask, null);

			} else if (!osEventSetEntityStarters.isEmpty()) {
				// ���ʥ֥뵯ư�ˤĤ��ƤΥ����Х��ѿ�����������������
				for (OsEventSetEntityStarter sourceEntityStarter : osEventSetEntityStarters) {
					buildEntityStartStaticSymbols(targetPartition, sourceEntityStarter, sourceOsTask, sourceEntityStarter.getSourceOsEvent());
				}
			}
		}
	}

	private void buildEntityStartStaticSymbols(Partition targetPartition, EntityStarter sourceEntityStarter, OsTask osTask, OsEvent osEvent) throws ModelException {
		// ����Ĵ���������ѿ��ι���
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceEntityStarter.getCycleCounterImplementation().getMaxCount());

			targetPartition.getEntityStartConstant().add(createEntityCycleMaxConstant(sourceEntityStarter.getCycleCounterImplementation(), osTask, osEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityCycleCounterVariable(sourceEntityStarter.getCycleCounterImplementation(), osTask, osEvent, type));
		}

		// ���ϥ��ե��å�Ĵ���������ѿ��ι���
		if (sourceEntityStarter.getStartOffsetCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateType(sourceEntityStarter.getStartOffsetCounterImplementation().getMaxCount());

			targetPartition.getEntityStartConstant().add(createEntityStartOffsetMaxConstant(sourceEntityStarter.getStartOffsetCounterImplementation(), osTask, osEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityStartOffsetCounterVariable(sourceEntityStarter.getStartOffsetCounterImplementation(), osTask, osEvent, type));
		}

		// ���������塼���֥뵯ư�����ι���
		for (EntityStartInteraction sourceStartInteraction : sourceEntityStarter.getStartInteraction()) {
			if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE ���true(������EntityStartImplementation��TimingTriggeringEntityStartImplementation�ΤߤΤ���)
				TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();

				if (timingTriggeringEntityStartImplementation.requiresCycleAdjust()) {
					GlobalVariable cycleCounterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceEntityStarter.getCycleCounterImplementation());

					targetPartition.getEntityStartConstant().add(
							createEntityCyclePeriodConstant(timingTriggeringEntityStartImplementation, osTask, osEvent, sourceStartInteraction, cycleCounterVariable));
					targetPartition.getEntityStartConstant().add(
							createEntityCycleOffsetConstant(timingTriggeringEntityStartImplementation, osTask, osEvent, sourceStartInteraction, cycleCounterVariable));
				}

				if (timingTriggeringEntityStartImplementation.requiresStartOffsetAdjust()) {
					GlobalVariable startOffsetCounterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceEntityStarter.getStartOffsetCounterImplementation());

					targetPartition.getEntityStartConstant().add(
							createEntityStartOffsetConstant(timingTriggeringEntityStartImplementation, osTask, osEvent, sourceStartInteraction, startOffsetCounterVariable));
				}
			}
		}
	}

	private Constant createEntityStartOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask osTask, OsEvent osEvent,
			EntityStartInteraction entityStartInteraction, GlobalVariable startOffsetCounterVariable) {
		Constant startOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		startOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		startOffsetConstant.setRoleName(RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME);
		startOffsetConstant.setSymbolName(SymbolNames.createEntityStartOffsetConstantName(osTask, osEvent, entityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		startOffsetConstant.setType((PrimitiveType) startOffsetCounterVariable.getType());
		startOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getStartOffset()));
		return startOffsetConstant;
	}

	private Constant createEntityCycleOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask osTask, OsEvent osEvent,
			EntityStartInteraction entityStartInteraction, GlobalVariable cycleCounterVariable) {
		Constant cycleOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		cycleOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		cycleOffsetConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME);
		cycleOffsetConstant.setSymbolName(SymbolNames.createEntityCycleOffsetConstantName(osTask, osEvent, entityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		cycleOffsetConstant.setType((PrimitiveType) cycleCounterVariable.getType());
		cycleOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCycleOffset()));
		return cycleOffsetConstant;
	}

	private Constant createEntityCyclePeriodConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask osTask, OsEvent osEvent,
			EntityStartInteraction entityStartInteraction, GlobalVariable cycleCounterVariable) {
		Constant cyclePeriodConstant = ModuleFactory.eINSTANCE.createConstant();
		cyclePeriodConstant.setSingleSource(sourceEntityStartImplementation);
		cyclePeriodConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME);
		cyclePeriodConstant.setSymbolName(SymbolNames.createEntityCyclePeriodConstantName(osTask, osEvent, entityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		cyclePeriodConstant.setType((PrimitiveType) cycleCounterVariable.getType());
		cyclePeriodConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCyclePeriod()));
		return cyclePeriodConstant;
	}

	private GlobalVariable createEntityStartOffsetCounterVariable(StartOffsetCounterImplementation sourceCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) throws ModelException {
		GlobalVariable startOffsetCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		startOffsetCounterVariable.setSingleSource(sourceCounterImplementation);
		startOffsetCounterVariable.setSymbolName(SymbolNames.createEntityStartOffsetCounterName(osTask, osEvent));
		startOffsetCounterVariable.setType(type);
		startOffsetCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		return startOffsetCounterVariable;
	}

	private Constant createEntityStartOffsetMaxConstant(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) {
		Constant startOffsetMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		startOffsetMaxConstant.setSingleSource(sourceStartOffsetCounterImplementation);
		startOffsetMaxConstant.setSymbolName(SymbolNames.createEntityMaxStartOffsetConstantName(osTask, osEvent));
		startOffsetMaxConstant.setType(type);
		startOffsetMaxConstant.setValue(String.valueOf(sourceStartOffsetCounterImplementation.getMaxCount()));
		return startOffsetMaxConstant;
	}

	private GlobalVariable createEntityCycleCounterVariable(CycleCounterImplementation sourceCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) throws ModelException {
		GlobalVariable cycleCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		cycleCounterVariable.setSingleSource(sourceCounterImplementation);
		cycleCounterVariable.setSymbolName(SymbolNames.createEntityCycleCounterName(osTask, osEvent));
		cycleCounterVariable.setType(type);
		cycleCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		return cycleCounterVariable;
	}

	private Constant createEntityCycleMaxConstant(CycleCounterImplementation sourceCycleCounterImplementation, OsTask osTask, OsEvent osEvent, PrimitiveType type) {
		Constant cycleMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		cycleMaxConstant.setSingleSource(sourceCycleCounterImplementation);
		cycleMaxConstant.setSymbolName(SymbolNames.createEntityMaxCycleConstantName(osTask, osEvent));
		cycleMaxConstant.setType(type);
		cycleMaxConstant.setValue(String.valueOf(sourceCycleCounterImplementation.getMaxCount()));
		return cycleMaxConstant;
	}
}
