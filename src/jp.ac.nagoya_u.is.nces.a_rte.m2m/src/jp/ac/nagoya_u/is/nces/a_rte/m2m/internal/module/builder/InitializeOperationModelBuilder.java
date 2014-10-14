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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.CYCLE_COUNTER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_INTER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RTE_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.START_OFFSET_COUNTER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.VALUE_BUFFER_IMPLEMENTATION__PARENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.VARIABLE_IMPLEMENTATION__OWNER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_EMPTY_QUEUE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_QUEUED_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

@SuppressWarnings("unused")
public class InitializeOperationModelBuilder {

	private ModuleModelBuildContext context;
	private ExcludeOperationModelBuilder excludeOperationBuilder;

	public InitializeOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public VariableInitializeOperation createRteVariableInitializeOperationAtStart(Core sourceCore) throws ModelException {
		VariableInitializeOperation variableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		for (Partition partition : sourceCore.getPartition()) {
			EcucPartition sourcePartition = (EcucPartition) partition.getSingleSource();

			buildRteBufferInitVariables(variableInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION);
			buildFilterBufferInitVariables(variableInitializeOperation, sourcePartition);
			buildRunnableEntityInitVariables(variableInitializeOperation, sourcePartition);
		}
		return variableInitializeOperation;
	}

	public VariableInitializeOperation createSchmVariableInitializeOperationAtStart(Core sourceCore) throws ModelException {
		VariableInitializeOperation variableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		for (Partition partition : sourceCore.getPartition()) {
			EcucPartition sourcePartition = (EcucPartition) partition.getSingleSource();
			buildBswSchedulableEntityInitVariables(variableInitializeOperation, sourcePartition);
		}
		return variableInitializeOperation;
	}

	public VariableInitializeOperation createRteVariableInitializeOperationAtPartitionRestart(EcucPartition sourcePartition) throws ModelException {
		VariableInitializeOperation variableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		buildRteBufferInitVariables(variableInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		buildRunnableEntityInitVariables(variableInitializeOperation, sourcePartition);
		buildExcludeOperation(variableInitializeOperation);
		return variableInitializeOperation;
	}

	private void buildRteBufferInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		for (RteValueBufferImplementation valueBufferImplementation : this.context.query.<RteValueBufferImplementation> find(isKindOf(RTE_VALUE_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			InternalEcuReceiver receiver = valueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition dataInstanceInComposition = receiver.getSource();

			if (this.context.query.get(dataInstanceInComposition, initPredicateOperation)) {
				GlobalVariable rteBufferVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, valueBufferImplementation);
				targetInitializeOperation.getInitVariable().add(rteBufferVariable);
			}
		}
	}

	private void buildFilterBufferInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (FilterBufferImplementation filterBufferImplementation : this.context.query.<FilterBufferImplementation> find(isKindOf(FILTER_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			GlobalVariable rteBufferVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, filterBufferImplementation);
			targetInitializeOperation.getInitVariable().add(rteBufferVariable);
		}
	}

	private void buildRunnableEntityInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (StartOffsetCounterImplementation counterImplementation : this.context.query.<StartOffsetCounterImplementation> find(isKindOf(START_OFFSET_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof RunnableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}

		for (CycleCounterImplementation counterImplementation : this.context.query.<CycleCounterImplementation> find(isKindOf(CYCLE_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof RunnableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}
	}

	private void buildBswSchedulableEntityInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (StartOffsetCounterImplementation counterImplementation : this.context.query.<StartOffsetCounterImplementation> find(isKindOf(START_OFFSET_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof BswSchedulableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}

		for (CycleCounterImplementation counterImplementation : this.context.query.<CycleCounterImplementation> find(isKindOf(CYCLE_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof BswSchedulableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}
	}

	private void buildExcludeOperation(VariableInitializeOperation targetInitializeOperation) {
		List<RteBufferVariableSet> rteBufferVariableSets = this.context.query.selectByKind(targetInitializeOperation.getInitVariable(), RTE_BUFFER_VARIABLE_SET);
		boolean isRteBufferWithStatusExists = this.context.query.exists(rteBufferVariableSets, refExists(RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE));
		boolean isQueueExists = this.context.query.exists(targetInitializeOperation.getInitVariable(), isKindOf(RTE_BUFFER_QUEUED_VARIABLE));

		if (isQueueExists || isRteBufferWithStatusExists) {
			boolean accessedInterCore = anyVariableAccessedInterCore(targetInitializeOperation);
			targetInitializeOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(accessedInterCore));
		}
	}

	private boolean anyVariableAccessedInterCore(VariableInitializeOperation targetInitializeOperation) {
		List<EObject> sources = this.context.query.collect(targetInitializeOperation.getInitVariable(), MODULE_OBJECT__SOURCE);
		List<RteValueBufferImplementation> sourceBufferImplementations = this.context.query.selectByKind(sources, RTE_VALUE_BUFFER_IMPLEMENTATION);
		List<ReceiveInteraction> receiveInteractions = this.context.query.collect(sourceBufferImplementations, VALUE_BUFFER_IMPLEMENTATION__PARENT);
		return this.context.query.exists(receiveInteractions, hasOp(RECEIVE_INTERACTION___RECEIVES_INTER_CORE, true));
	}

	public IocInitializeOperation createIocInitializeOperationAtPartitionRestart(EcucPartition sourcePartition) throws ModelException {
		IocInitializeOperation iocInitializeOperation = ModuleFactory.eINSTANCE.createIocInitializeOperation();
		buildInitIocApis(iocInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		return iocInitializeOperation;
	}

	private void buildInitIocApis(IocInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		for (IocValueBufferImplementation valueBufferImplementation : this.context.query.<IocValueBufferImplementation> find(isKindOf(IOC_VALUE_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			InternalEcuReceiver receiver = valueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition dataInstanceInComposition = receiver.getSource();

			if (this.context.query.get(dataInstanceInComposition, initPredicateOperation)) {
				if (dataInstanceInComposition.getPrototype().isEventSemantics()) {
					IocEmptyQueueApi iocEmptyQueueApi = this.context.builtQuery.findDest(IOC_EMPTY_QUEUE_API, valueBufferImplementation.getOsIocCommunication());
					targetInitializeOperation.getInitIocApi().add(iocEmptyQueueApi);
				} else {
					IocWriteApi iocWriteApi = this.context.builtQuery.findDest(IOC_WRITE_API, valueBufferImplementation.getOsIocCommunication().getLoopbackSenderProperties());
					targetInitializeOperation.getInitIocApi().add(iocWriteApi);
				}
			}
		}
	}

}
