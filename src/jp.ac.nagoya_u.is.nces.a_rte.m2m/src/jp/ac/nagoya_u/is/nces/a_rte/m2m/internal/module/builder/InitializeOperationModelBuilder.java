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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.SW_COMPONENT_INSTANCE_IN_SYSTEM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.CYCLE_COUNTER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
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

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import com.google.common.base.Optional;

public class InitializeOperationModelBuilder {

	private ModuleModelBuildContext context;
	private ExcludeOperationModelBuilder excludeOperationBuilder;

	public InitializeOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public VariableInitializeOperation createRteVariableInitializeOperationAtStart(Core sourceCore) throws ModelException {
		VariableInitializeOperation destVariableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		for (Partition partition : sourceCore.getPartition()) {
			EcucPartition sourceEcucPartition = (EcucPartition) partition.getSingleSource();

			buildSrBufferInitVariables(destVariableInitializeOperation, sourceEcucPartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION);
			buildSrFilterInitVariables(destVariableInitializeOperation, sourceEcucPartition);
			buildEntityStartInitVariables(destVariableInitializeOperation, sourceEcucPartition);
			buildIrvInitVariables(destVariableInitializeOperation, Optional.fromNullable(sourceEcucPartition), VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE);
		}
		return destVariableInitializeOperation;
	}

	public VariableInitializeOperation createRteVariableInitializeOperationAtPartitionRestart(EcucPartition sourcePartition) throws ModelException {
		VariableInitializeOperation destVariableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		buildSrBufferInitVariables(destVariableInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		buildIrvInitVariables(destVariableInitializeOperation, Optional.of(sourcePartition), VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE);
		buildEntityStartInitVariables(destVariableInitializeOperation, sourcePartition);
		buildExcludeOperation(destVariableInitializeOperation);
		return destVariableInitializeOperation;
	}

	private void buildSrBufferInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		for (RteValueBufferImplementation sourceValueBufferImplementation : this.context.query.<RteValueBufferImplementation> find(isKindOf(RTE_VALUE_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			InternalEcuReceiver sourceReceiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceReceiver.getSource();
			VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceDataInstanceInComposition.getPrototype();

			if (this.context.query.get(sourceDataInstanceInComposition, initPredicateOperation)) {
				if (sourceDataInstanceInSwc.isEventSemantics()) {
					// ���٥�ȥ��ޥ�ƥ������ξ��
					RteBufferQueuedVariable srRteBufferQueue = this.context.builtQuery.findDest(RTE_BUFFER_QUEUED_VARIABLE, sourceValueBufferImplementation);
					targetInitializeOperation.getInitVariable().add(srRteBufferQueue);

				} else {
					// �ǡ������ޥ�ƥ������ξ��
					RteBufferVariableSet srRteBufferVariableSet = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceValueBufferImplementation);
					targetInitializeOperation.getInitVariable().add(srRteBufferVariableSet);
				}
			}
		}
	}

	private void buildSrFilterInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (FilterBufferImplementation sourceFilterBufferImplementation : this.context.query.<FilterBufferImplementation> find(isKindOf(FILTER_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			GlobalVariable filterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceFilterBufferImplementation);
			targetInitializeOperation.getInitVariable().add(filterVariable);
		}
	}

	private void buildEntityStartInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (StartOffsetCounterImplementation sourceCounterImplementation : this.context.query.<StartOffsetCounterImplementation> find(isKindOf(START_OFFSET_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (sourceCounterImplementation.getParent().getStartInteraction().get(0) instanceof RunnableEntityStartInteraction) {
				GlobalVariable counterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceCounterImplementation);
				targetInitializeOperation.getInitVariable().add(counterVariable);
			}
		}

		for (CycleCounterImplementation sourceCounterImplementation : this.context.query.<CycleCounterImplementation> find(isKindOf(CYCLE_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (sourceCounterImplementation.getParent().getStartInteraction().get(0) instanceof RunnableEntityStartInteraction) {
				GlobalVariable counterVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceCounterImplementation);
				targetInitializeOperation.getInitVariable().add(counterVariable);
			}
		}
	}

	private void buildIrvInitVariables(VariableInitializeOperation targetInitializeOperation, Optional<EcucPartition> sourcePartition, EOperation initPredicateOperation) throws ModelException {
		if (!sourcePartition.isPresent()) {
			// noPartition�ξ��ϡ�query��SwComponentInstanceInSystem���������
			for (SwComponentInstanceInSystem sourceSwComponentInstanceInSystem : this.context.query.<SwComponentInstanceInSystem> findByKind(SW_COMPONENT_INSTANCE_IN_SYSTEM)) {
				buildIrvInitVariables(targetInitializeOperation, initPredicateOperation, sourceSwComponentInstanceInSystem.getPrototype().getType());
			}
		} else {
			for (SwComponentInstanceInSystem sourceSwComponentInstanceInSystem : sourcePartition.get().getEcucPartitionSoftwareComponent()) {
				buildIrvInitVariables(targetInitializeOperation, initPredicateOperation, sourceSwComponentInstanceInSystem.getPrototype().getType());
			}
		}
	}

	private void buildIrvInitVariables(VariableInitializeOperation targetInitializeOperation, EOperation initPredicateOperation, SwComponentType swComponentType)
			throws ModelException {
		if (!(swComponentType instanceof AtomicSwComponentType)) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			return;
		}

		for (VariableDataPrototype sourceDataPrototype : ((AtomicSwComponentType) swComponentType).getInternalBehavior().getExplicitInterRunnableVariable()) {
			if (this.context.query.get(sourceDataPrototype, initPredicateOperation)) {
				RteBufferVariableSet irvBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceDataPrototype);
				targetInitializeOperation.getInitVariable().add(irvBuffer);
			}
		}
	}

	private void buildExcludeOperation(VariableInitializeOperation targetInitializeOperation) {
		// NOTE RteBufferVariableSet��S/R�������̿��Хåե��ʳ��ˡ�IOC����������IRV�Хåե���COM�����Хåե���COM�ץ����Хåե��ˤ���Ѥ���Ƥ��뤿�ᡢ�ʲ��Υ�����ǰ��˼�������뤳�Ȥ���ա�
		List<RteBufferVariableSet> rteBufferVariableSets = this.context.query.selectByKind(targetInitializeOperation.getInitVariable(), RTE_BUFFER_VARIABLE_SET);
		boolean isRteBufferWithStatusExists = this.context.query.exists(rteBufferVariableSets, refExists(RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE));
		boolean isSrQueueExists = this.context.query.exists(targetInitializeOperation.getInitVariable(), isKindOf(RTE_BUFFER_QUEUED_VARIABLE));

		boolean isNonAtomicTypeExists = false;
		for (RteBufferVariableSet rteBufferVariableSet : rteBufferVariableSets) {
			Type type = rteBufferVariableSet.getValueVariable().getType();
			if (!Types.isAtomicType(type)) {
				isNonAtomicTypeExists = true;
			}
		}

		if (isSrQueueExists || isRteBufferWithStatusExists || isNonAtomicTypeExists) {
			boolean accessedInterCore = anyVariableAccessedInterCore(targetInitializeOperation);
			targetInitializeOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(accessedInterCore));
		}
	}

	private boolean anyVariableAccessedInterCore(VariableInitializeOperation targetInitializeOperation) {
		List<EObject> sources = this.context.query.collect(targetInitializeOperation.getInitVariable(), MODULE_OBJECT__SOURCE);

		// NOTE ������S/R�Τߤ��������̿���Ԥ����ᡢS/R��Ϣ�ȥ�ǥ뤫�饳�����̿���̵ͭ��Ƚ��
		List<RteValueBufferImplementation> sourceValueBufferImplementations = this.context.query.selectByKind(sources, RTE_VALUE_BUFFER_IMPLEMENTATION);
		List<ReceiveInteraction> sourceReceiveInteractions = this.context.query.collect(sourceValueBufferImplementations, VALUE_BUFFER_IMPLEMENTATION__PARENT);
		return this.context.query.exists(sourceReceiveInteractions, hasOp(RECEIVE_INTERACTION___RECEIVES_INTER_CORE, true));
	}

	public IocInitializeOperation createIocInitializeOperationAtPartitionRestart(EcucPartition sourcePartition) throws ModelException {
		IocInitializeOperation destIocInitializeOperation = ModuleFactory.eINSTANCE.createIocInitializeOperation();
		buildInitIocApis(destIocInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		return destIocInitializeOperation;
	}

	private void buildInitIocApis(IocInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		for (IocValueBufferImplementation sourceValueBufferImplementation : this.context.query.<IocValueBufferImplementation> find(isKindOf(IOC_VALUE_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			InternalEcuReceiver sourceReceiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceReceiver.getSource();
			VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceDataInstanceInComposition.getPrototype();

			if (this.context.query.get(sourceDataInstanceInComposition, initPredicateOperation)) {
				if (sourceDataInstanceInSwc.isEventSemantics()) {
					IocEmptyQueueApi iocEmptyQueueApi = this.context.builtQuery.findDest(IOC_EMPTY_QUEUE_API, sourceValueBufferImplementation.getOsIocCommunication());
					targetInitializeOperation.getInitIocApi().add(iocEmptyQueueApi);
				} else {
					IocWriteApi loopbackIocWriteApi = this.context.builtQuery.findDest(IOC_WRITE_API, sourceValueBufferImplementation.getOsIocCommunication().getLoopbackSenderProperties());
					targetInitializeOperation.getInitIocApi().add(loopbackIocWriteApi);
				}
			}
		}
	}

	public VariableInitializeOperation createSchmVariableInitializeOperationAtStart(Core sourceCore) throws ModelException {
		VariableInitializeOperation destVariableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		for (Partition partition : sourceCore.getPartition()) {
			EcucPartition sourceEcucPartition = (EcucPartition) partition.getSingleSource();
			buildSchmEntityStartInitVariables(destVariableInitializeOperation, sourceEcucPartition);
		}
		return destVariableInitializeOperation;
	}

	private void buildSchmEntityStartInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (StartOffsetCounterImplementation sourceCounterImplementation : this.context.query.<StartOffsetCounterImplementation> find(isKindOf(START_OFFSET_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (sourceCounterImplementation.getParent().getStartInteraction().get(0) instanceof BswSchedulableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceCounterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}

		for (CycleCounterImplementation sourceCounterImplementation : this.context.query.<CycleCounterImplementation> find(isKindOf(CYCLE_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (sourceCounterImplementation.getParent().getStartInteraction().get(0) instanceof BswSchedulableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceCounterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}
	}
}
