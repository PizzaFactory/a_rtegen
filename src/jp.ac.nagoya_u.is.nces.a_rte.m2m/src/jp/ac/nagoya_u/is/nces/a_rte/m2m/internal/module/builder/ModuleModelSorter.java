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
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION__RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION__RECEIVE_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INITIALIZE_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.INTER_PARTITION_TIMEOUT_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_INITIALIZE_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING__PREFIX;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PRIMITIVE_COM_SEND_PROXY_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SEND_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE_INITIALIZE_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;

import java.util.Comparator;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ModelSortUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.base.Functions;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class ModuleModelSorter {

	private ModuleModelBuildContext context;

	public ModuleModelSorter(ModuleModelBuildContext context) {
		this.context = context;
	}

	@SuppressWarnings("unchecked")
	public void sortFileContents(File targetFile) {
		for (EReference eReference : targetFile.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
//				if (TYPE.isSuperTypeOf(eReference.getEReferenceType())) {
//					EList<Type> targetTypes = (EList<Type>) targetFile.eGet(eReference);
//					sortTypes(targetTypes);
//
//				} else
				if (CONSTANT.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<Constant> targetConstants = (EList<Constant>) targetFile.eGet(eReference);
					sortConstants(targetConstants);

				} else if (GLOBAL_VARIABLE.isSuperTypeOf(eReference.getEReferenceType())) {	// COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
					EList<GlobalVariable> targetGlobalVariables = (EList<GlobalVariable>) targetFile.eGet(eReference);
					sortGlobalVariables(targetGlobalVariables);

				} else if (FUNCTION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<Function> targetFunctions = (EList<Function>) targetFile.eGet(eReference);
					sortFunctions(targetFunctions);

				} else if (MEMORY_MAPPING.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<MemoryMapping> targetMemoryMappings = (EList<MemoryMapping>) targetFile.eGet(eReference);
					sortMemoryMappings(targetMemoryMappings);

				} else if (GLOBAL_VARIABLE_FILE_CONTENTS_GROUP.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<GlobalVariableFileContentsGroup> targetGlobalVariableGroups = (EList<GlobalVariableFileContentsGroup>) targetFile.eGet(eReference);
					sortGlobalVariableGroups(targetGlobalVariableGroups);

				} else if (FUNCTION_FILE_CONTENTS_GROUP.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<FunctionFileContentsGroup> targetFunctionGroups = (EList<FunctionFileContentsGroup>) targetFile.eGet(eReference);
					sortFunctionGroups(targetFunctionGroups);
				} else if (MODE_DECLARATION_GROUP.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<ModeDeclarationGroup> targetModeDeclarationGroups = (EList<ModeDeclarationGroup>) targetFile.eGet(eReference);
					sortModeDeclarationGroups(targetModeDeclarationGroups);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void sortFunctionContents(Function targetFunction) {
		
		for (EAttribute eAttribute : targetFunction.eClass().getEAllAttributes()) {
			if (OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID.equals(eAttribute)) {
				EList<OsEventSetExecutableTaskBody> targetOperations = (EList<OsEventSetExecutableTaskBody>) targetFunction.eGet(eAttribute);
				ECollections.sort(targetOperations);
			}
		}
		
		for (EReference eReference : targetFunction.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
				if (INITIALIZE_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<InitializeOperation> targetOperations = (EList<InitializeOperation>) targetFunction.eGet(eReference);
					sortInitializeOperations(targetOperations);
				} else if (SEND_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<SendOperation> targetOperations = (EList<SendOperation>) targetFunction.eGet(eReference);
					sortSendOperations(targetOperations);
				} else if (PRIMITIVE_COM_SEND_PROXY_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<PrimitiveComSendProxyOperation> targetOperations = (EList<PrimitiveComSendProxyOperation>) targetFunction.eGet(eReference);
					sortProxyComSendOperations(targetOperations);
				} else if (RTE_CORE_START_API_IMPL.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<RteCoreStartApiImpl> targetOperations = (EList<RteCoreStartApiImpl>) targetFunction.eGet(eReference);
					sortRteCoreStartApi(targetOperations);
				} else if (SCHM_CORE_INIT_API_IMPL.isSuperTypeOf(eReference.getEReferenceType())) {
					EList<SchmCoreInitApiImpl> targetOperations = (EList<SchmCoreInitApiImpl>) targetFunction.eGet(eReference);
					sortSchmCoreInitApi(targetOperations);
				}

				// NOTE ReadOperation��ɬ��¿����1�Τ��ᡤ�����Ȥ�Ԥʤ�ʤ���
				// NOTE ContextActivationOperation, RunnableStartOperation���㳰Ū��Operation���������˥����Ȥ�Ԥ����ᡤ�����Ǥϥ����Ȥ��ʤ���

			} else {
				if (INTER_PARTITION_TIMEOUT_OPERATION.isSuperTypeOf(eReference.getEReferenceType())) {
					InterPartitionTimeoutOperation targetOperation = (InterPartitionTimeoutOperation) targetFunction.eGet(eReference);
					if (targetOperation == null) { // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
						continue;
					}
					sortInterPartitionTimeoutOperationContents(targetOperation);

				}
			}
		}
	}

	private void sortInitializeOperations(EList<InitializeOperation> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModelSortUtils.eObject2EClassPriorityFunction(VARIABLE_INITIALIZE_OPERATION, IOC_INITIALIZE_OPERATION));
		ECollections.sort(targetOperations, ordering);

		for (InitializeOperation targetOperation : targetOperations) {
			sortInitializeOperationContents(targetOperation);
		}
	}

	private void sortInitializeOperationContents(InitializeOperation targetOperation) {
		if (targetOperation instanceof VariableInitializeOperation) {
			VariableInitializeOperation variableInitializeOperation = (VariableInitializeOperation) targetOperation;
			sortGlobalVariables(variableInitializeOperation.getInitVariable());

		} else if (targetOperation instanceof IocInitializeOperation) { // COVERAGE ���true(������InitializeOperation�ϡ�VariableInitializeOperation��IocInitializeOperation�Τ����줫�Ǥ��뤿��)
			IocInitializeOperation iocInitializeOperation = (IocInitializeOperation) targetOperation;
			sortFunctions(iocInitializeOperation.getInitIocApi());
		}
	}

	private void sortSendOperations(EList<SendOperation> targetOperations) {
		com.google.common.base.Function<EObject, ReceiveInteraction> sendOperation2ReceiveInteraction = ModuleModelSorter.this.context.query.<ReceiveInteraction> features2Function(MODULE_OBJECT__SOURCE, SEND_INTERACTION__RECEIVE_INTERACTION);

		com.google.common.base.Function<EObject, Receiver> sendOperation2Receiver = Functions
				.compose(ModuleModelSorter.this.context.query.<Receiver> feature2Function(RECEIVE_INTERACTION__RECEIVER), sendOperation2ReceiveInteraction);
		com.google.common.base.Function<EObject, InternalEcuReceiver> sendOperation2InternalEcuReceiver = Functions.compose(
				ModuleModelSorter.this.context.query.<InternalEcuReceiver> operation2Function(RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS), sendOperation2ReceiveInteraction);
		com.google.common.base.Function<EObject, ExternalEcuReceiver> sendOperation2ExternalEcuReceiver = Functions.compose(
				ModuleModelSorter.this.context.query.<ExternalEcuReceiver> operation2Function(RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS), sendOperation2ReceiveInteraction);

		Ordering<EObject> ordering = Ordering.natural().onResultOf(Functions.compose(ModelSortUtils.eObject2EClassPriorityFunction(INTERNAL_ECU_RECEIVER, EXTERNAL_ECU_RECEIVER), sendOperation2Receiver))
				.compound(Ordering.from(createInternalEcuReceiverComparator()).nullsLast().onResultOf(sendOperation2InternalEcuReceiver))
				.compound(Ordering.from(createExternalEcuReceiverComparator()).nullsLast().onResultOf(sendOperation2ExternalEcuReceiver));
		ECollections.sort(targetOperations, ordering);
	}

	private Comparator<InternalEcuReceiver> createInternalEcuReceiverComparator() {
		return new Comparator<InternalEcuReceiver>() {
			@Override
			public int compare(InternalEcuReceiver o1, InternalEcuReceiver o2) {
				VariableDataInstanceInComposition source1 = o1.getSource();
				PortPrototype contextPort1 = source1.getPrototype().getContextPort();
				SwComponentType contextSwc1 = contextPort1.getParent();

				VariableDataInstanceInComposition source2 = o2.getSource();
				PortPrototype contextPort2 = source2.getPrototype().getContextPort();
				SwComponentType contextSwc2 = contextPort2.getParent();

				return ComparisonChain.start().compare(contextSwc1.getShortName(), contextSwc2.getShortName()).compare(contextPort1.getShortName(), contextPort2.getShortName())
						.compare(source1.getTargetShortName(), source2.getTargetShortName()).result();
			}
		};
	}

	private Comparator<ExternalEcuReceiver> createExternalEcuReceiverComparator() {
		return new Comparator<ExternalEcuReceiver>() {
			@Override
			public int compare(ExternalEcuReceiver o1, ExternalEcuReceiver o2) {
				String o1Signal = o1.getSourceSignal() != null ? o1.getSourceSignal().getShortName() : o1.getSourceSignalGroup().getShortName();
				String o2Signal = o2.getSourceSignal() != null ? o2.getSourceSignal().getShortName() : o2.getSourceSignalGroup().getShortName();
				return ComparisonChain.start().compare(o1Signal, o2Signal).result();
			}
		};
	}

	private void sortInterPartitionTimeoutOperationContents(InterPartitionTimeoutOperation targetOperation) {
		sortGlobalVariables(targetOperation.getTimeoutVariable());
	}

	private void sortProxyComSendOperations(EList<PrimitiveComSendProxyOperation> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API, FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetOperations, ordering);
	}
	
	private void sortSchmCoreInitApi(EList<SchmCoreInitApiImpl> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetOperations, ordering);
	}

	private void sortRteCoreStartApi(EList<RteCoreStartApiImpl> targetOperations) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetOperations, ordering);
	}

	private void sortFunctionGroups(EList<? extends FunctionFileContentsGroup> targetFunctionGroups) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__PREFIX))
				.compound(Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME)));
		ECollections.sort(targetFunctionGroups, ordering);

		for (FunctionFileContentsGroup functionFileContentsGroup : targetFunctionGroups) {
			sortFunctionGroupContents(functionFileContentsGroup);
		}
	}

	private void sortFunctionGroupContents(FunctionFileContentsGroup targetFunctionGroup) {
		sortFunctions(targetFunctionGroup.getFunction());
	}

	private void sortGlobalVariableGroups(EList<? extends GlobalVariableFileContentsGroup> targetGlobalVariableGroups) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__PREFIX))
				.compound(Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME)));
		ECollections.sort(targetGlobalVariableGroups, ordering);

		for (GlobalVariableFileContentsGroup targetGlobalVariableGroup : targetGlobalVariableGroups) {
			sortGlobalVariableGroupContents(targetGlobalVariableGroup);
		}
	}

	private void sortGlobalVariableGroupContents(GlobalVariableFileContentsGroup targetGlobalVariableGroup) {
		sortGlobalVariables(targetGlobalVariableGroup.getGlobalVariable());
	}

	private void sortConstants(EList<? extends Constant> targetConstants) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(CONSTANT__SYMBOL_NAME));
		ECollections.sort(targetConstants, ordering);
	}

	private void sortGlobalVariables(EList<? extends GlobalVariable> targetGlobalVariables) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(VARIABLE__SYMBOL_NAME));
		ECollections.sort(targetGlobalVariables, ordering);
	}

	private void sortFunctions(EList<? extends Function> targetFunctions) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(FUNCTION__SYMBOL_NAME));
		ECollections.sort(targetFunctions, ordering);

		for (Function targetFunction : targetFunctions) {
			sortFunctionContents(targetFunction);
		}
	}

	private void sortMemoryMappings(EList<? extends MemoryMapping> targetMemoryMappings) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(MEMORY_MAPPING__PREFIX))
				.compound(Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> feature2Function(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME)));
		ECollections.sort(targetMemoryMappings, ordering);
	}

	private void sortModeDeclarationGroups(EList<ModeDeclarationGroup> targetModeDeclarationGroups) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(ModuleModelSorter.this.context.query.<String> features2Function(MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, CONSTANT__SYMBOL_NAME));
		ECollections.sort(targetModeDeclarationGroups, ordering);
	}
}
