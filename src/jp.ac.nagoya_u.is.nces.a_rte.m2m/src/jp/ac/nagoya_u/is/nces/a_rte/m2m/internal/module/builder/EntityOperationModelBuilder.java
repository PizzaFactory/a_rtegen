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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER__START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EVENT_TO_TASK_MAPPING__POSITION_IN_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.DISABLED_IN_MODE__DISABLED_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Event;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class EntityOperationModelBuilder {

	private final ModuleModelBuildContext context;

	private final ExcludeOperationModelBuilder excludeOperationBuilder;

	public EntityOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public OsTaskActivationOperation createOsTaskActivationOperation(OsTaskActivateEntityStarter sourceEntityStarter, OsTask osTask) throws ModelException {
		OsTaskActivationOperation osTaskActivationOperation = ModuleFactory.eINSTANCE.createOsTaskActivationOperation();
		osTaskActivationOperation.setSingleSource(sourceEntityStarter);
		buildEntityCountupOperation(osTaskActivationOperation, sourceEntityStarter);
	
		// ���������塼���֥뵯ư�����ι���
		List<EntityStartInteraction> startInteractions = this.context.query.selectByKind(sourceEntityStarter.getStartInteraction(), ENTITY_START_INTERACTION);
		for (EntityStartInteraction sourceStartInteraction : sortedCopyOfEntityStartInteractions(startInteractions)) {
			buildExecutableStartOperation(osTaskActivationOperation, sourceStartInteraction);
		}
		return osTaskActivationOperation;
	}

	public List<OsEventSetActivationOperation> createOsEventSetActivationOperations(List<OsEventSetEntityStarter> sourceEntityStarters, OsTask osTask) throws ModelException {
		// ����ƥ��ƥ���ư��������
		List<OsEventSetActivationOperation> operations = Lists.newArrayList();
	
		List<EntityStartInteraction> entityStartInteractions = this.context.query.collect(sourceEntityStarters, ENTITY_STARTER__START_INTERACTION);
		List<EntityStartInteraction> sortedEntityStartInteractions = sortedCopyOfEntityStartInteractions(entityStartInteractions);
	
		// ��������¹Խ���ˤ�꥽����
		for (EntityStartInteraction sourceStartInteraction : sortedEntityStartInteractions) {
			OsEventSetEntityStarter sourceEntityStarter = (OsEventSetEntityStarter) sourceStartInteraction.getStarter();
			operations.add(createOsEventSetActivationOperation(sourceEntityStarter, sourceStartInteraction, osTask));
		}
	
		// Ʊ��Υ��󥿥饯����󤫤��������줿���ڥ졼������¤�Ǥ����硤OS���٥�Ȥν�������
		List<OsEventSetActivationOperation> combinedOperations = Lists.newArrayList(operations.get(0));
		OsEventSetActivationOperation targetOperation = combinedOperations.get(0);
	
		for (OsEventSetActivationOperation operation : operations.subList(1, operations.size())) {
			if (targetOperation.getSingleSource() == operation.getSingleSource()) {
				// ���ˤʤä�EntityStarter��Ʊ��ʤΤǡ���������
				targetOperation.getExecutableStartOperation().addAll(operation.getExecutableStartOperation());
			} else {
				// ���ˤʤä�EntityStarter���ۤʤ�Τǡ����η��򳫻Ϥ���
				combinedOperations.add(operation);
				targetOperation = operation;
			}
		}
	
		// ������ȥ��å׽�������
		for (OsEventSetEntityStarter sourceEntityStarter : sourceEntityStarters) {
			List<OsEventSetActivationOperation> activationOperations = this.context.query.select(combinedOperations, ref(MODULE_OBJECT__SOURCE, sourceEntityStarter));
			OsEventSetActivationOperation targetActivationOperation = Iterables.getLast(activationOperations);
	
			buildEntityCountupOperation(targetActivationOperation, sourceEntityStarter);
		}
		return combinedOperations;
	}

	private List<EntityStartInteraction> sortedCopyOfEntityStartInteractions(List<EntityStartInteraction> entityStartInteractions) {
		return Ordering.natural().onResultOf(this.context.query.<Integer> features2Function(ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING, EVENT_TO_TASK_MAPPING__POSITION_IN_TASK)).sortedCopy(entityStartInteractions);
	}

	private OsEventSetActivationOperation createOsEventSetActivationOperation(OsEventSetEntityStarter sourceEntityStarter, EntityStartInteraction sourceStartInteraction, OsTask osTask)
			throws ModelException {
		OsEventSetActivationOperation contextActivationOperation = ModuleFactory.eINSTANCE.createOsEventSetActivationOperation();
		contextActivationOperation.setSingleSource(sourceEntityStarter);
	
		// ���������塼���֥뵯ư�����ι���
		buildExecutableStartOperation(contextActivationOperation, sourceStartInteraction);
		contextActivationOperation.setActivationOsEventId(sourceEntityStarter.getSourceOsEvent().getShortName());
		return contextActivationOperation;
	}

	private void buildExecutableStartOperation(ContextActivationOperation targetContextActivationOperation, EntityStartInteraction sourceStartInteraction) throws ModelException {
		if (!isEnabledEntityStartInteraction(sourceStartInteraction)) {
			return;
		}
		if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE ���true(������Implementation��TimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementation�ΤߤΤ���)
			TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createTimingTriggeringExecutableStartOperation(sourceStartInteraction, timingTriggeringEntityStartImplementation));
		} else if (sourceStartInteraction.getImplementation() instanceof ModeSwitchTriggeringEntityStartImplementation) { // COVERAGE ���true(������Implementation��TimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementation�ΤߤΤ���)
			ModeSwitchTriggeringEntityStartImplementation modeSwitchImplementation = (ModeSwitchTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createModeSwitchTriggeringExecutableStartOperation(sourceStartInteraction, modeSwitchImplementation));
		}
	}

	private boolean isEnabledEntityStartInteraction(EntityStartInteraction sourceStartInteraction) {
		if (sourceStartInteraction.getEventToTaskMapping().getEvent().getBswEvent() == null) {
			// RTE���٥�Ȥξ��
			return true; // ���ͭ��
		} else {
			// BSW���٥�Ȥξ��
			return isEnabledBswEvent(sourceStartInteraction.getEventToTaskMapping().getEvent().getBswEvent());
		}
	}

	private TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			TimingTriggeringEntityStartImplementation startImplementation) throws ModelException {
		TimingTriggeringExecutableStartOperation operation = ModuleFactory.eINSTANCE.createTimingTriggeringExecutableStartOperation();
		buildExecutableStartOperation(operation, sourceStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent());
		if (startImplementation.requiresCycleAdjust()) {
			operation.setCycleCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getCycleCounterImplementation()));
			operation.setCyclePeriodConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, startImplementation, RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME));
			operation.setCycleOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, startImplementation, RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME));
		}
		if (startImplementation.requiresStartOffsetAdjust()) {
			operation.setStartOffsetCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getStartOffsetCounterImplementation()));
			operation.setStartOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, startImplementation, RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME));
		}

		buildExecutableStartOperationForMode(operation, sourceStartInteraction.getEventToTaskMapping().getEvent());

		return operation;
	}

	private ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			ModeSwitchTriggeringEntityStartImplementation modeSwitchImplementation) throws ModelException {
		ModeSwitchTriggeringExecutableStartOperation operation = ModuleFactory.eINSTANCE.createModeSwitchTriggeringExecutableStartOperation();
		buildExecutableStartOperation(operation, sourceStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent());

		buildExecutableStartOperationForMode(operation, sourceStartInteraction.getEventToTaskMapping().getEvent());
		
		return operation;
	}
	
	/**
	 * ͭ����BSW���٥�Ȥ���Ƚ�ꤹ��
	 * @param bswEvent��Ƚ���оݤ�BSW���٥��
	 * @return ͭ����BSW���٥�Ȥξ�硢true������ʳ��ξ�硢false��
	 */
	public boolean isEnabledBswEvent(BswEvent bswEvent) {
		// BSW���٥�ȶ��̤�ͭ����̵��Ƚ��
		if (!checksEnabledOfBswEventCommonPart(bswEvent)) {
			return false;
		}

		// ��BSW���٥�ȸ�ͭ��ͭ����̵��Ƚ��
		if (bswEvent instanceof BswModeSwitchEvent) {
			// �⡼�����إ��٥��
			return checksEnabledOfBswModeSwitchEventSpecificPart((BswModeSwitchEvent) bswEvent);
		} else {
			// ����¾���٥��
			return true; // ��ͭ�Υ����å��ʤ�
		}
	}

	// BSW���٥�Ȥ�ͭ���Ǥ��뤫��Ƚ��(�⡼�����إ��٥�ȸ�ͭ����ʬ�Τߥ����å�)
	private boolean checksEnabledOfBswModeSwitchEventSpecificPart(BswModeSwitchEvent bswModeSwitchEvent) {
		// NOTE ����onEntry�Τߥ��ݡ��Ȥ��Ƥ��뤿�ᡢonEntry�ʳ�(onTransition��onExit)��̵���ʥ��٥�Ȥ�Ƚ�ꤹ��
		if (!ModeActivationKind.ON_ENTRY.equals(bswModeSwitchEvent.getActivation())) {
			return false;
		}

		ModeInBswModuleDescriptionInstanceRef onEntryModeIref = bswModeSwitchEvent.getModeIref().get(0);

		// ���٥�Ȥ�ȯ�и��Ȥʤ�⡼��������롼�ץץ�ȥ����פ˥����������ʤ���С�̵���ʥ��٥�Ȥ�Ƚ��
		if (!bswModeSwitchEvent.getStartsOnEvent().getAccessedModeGroup().contains(onEntryModeIref.getContextModeDeclarationGroup())) {
			return false;
		}

		// ���٥�Ȥ�ȯ�и��Ȥʤ�⡼�ɤ�̵��������Ƥ���С�̵���ʥ��٥�Ȥ�Ƚ��
		for (ModeInBswModuleDescriptionInstanceRef disabledInModeIref : bswModeSwitchEvent.getDisabledInMode()) {
			if (onEntryModeIref.getContextModeDeclarationGroup() == disabledInModeIref.getContextModeDeclarationGroup() && onEntryModeIref.getTargetMode() == disabledInModeIref.getTargetMode()) {
				return false;
			}
		}

		return true;
	}

	// BSW���٥�Ȥ�ͭ���Ǥ��뤫��Ƚ��(��BSW���٥�ȶ��̤���ʬ�Τߥ����å�)
	private boolean checksEnabledOfBswEventCommonPart(BswEvent bswEvent) {
		return !isBswEventDisabledByMode(bswEvent);
	}

	// BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ��뤫��Ƚ��
	private boolean isBswEventDisabledByMode(BswEvent bswEvent) {
		// �⡼�ɰ�¸̵����������оݤȤʤ�⡼��������롼�ץץ�ȥ����פ�ñ�̤˥��롼�ײ�
		ListMultimap<ModeDeclarationGroupPrototype, ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefsGroupByContextModeGroup = this.context.query.groupByKey(bswEvent.getDisabledInMode(),
				MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP);

		// �ƥ⡼��������롼�ץץ�ȥ����פˤĤ��ơ�BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ��뤫��Ƚ��
		for (ModeDeclarationGroupPrototype disabledInModeContextModeGroup : disabledInModeIrefsGroupByContextModeGroup.keySet()) {
			List<ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefs = disabledInModeIrefsGroupByContextModeGroup.get(disabledInModeContextModeGroup);
			List<ModeDeclaration> disabledInModeTargetModes = this.context.query.collect(disabledInModeIrefs, MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE);

			// ͭ������¦�Ǥ��뤫���⤷���ϡ� �׵�¦�򻲾Ȥ��Ƥ���Ȥ��ˡ�ͭ������¦�����뤫������å�
			ModeDeclarationGroupPrototype enabledProvidedPrototype = getEnableProvidedModeDeclarationGroupPrototype(disabledInModeContextModeGroup);
			if (enabledProvidedPrototype == null) {
				// ͭ������¦��¸�ߤ��ʤ����
				// NOTE ͭ������¦��¸�ߤ��ʤ���Х⡼�ɤ�����⡼�ɰʳ������ܤ��뤳�ȤϤʤ��Τǡ�����⡼�ɤ�̵��������Ƥ���С�BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ����Ƚ�ꤹ��
				if (disabledInModeTargetModes.contains(disabledInModeContextModeGroup.getType().getInitialMode())) {
					return true;
				}
			} else {
				// ͭ������¦��¸�ߤ�����
				// �⡼��������롼�ץץ�ȥ����פ����⡼�ɤ�̵��������Ƥ���С�BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ����Ƚ�ꤹ��
				if (disabledInModeTargetModes.containsAll(disabledInModeContextModeGroup.getType().getModeDeclaration())) {
					return true;
				}
			}
		}

		return false;
	}

	private ModeDeclarationGroupPrototype getEnableProvidedModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype prototype) {
		// ͭ������¦�Ǥ���С�������֤�
		Optional<ModeMachineInstance> providedInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, prototype);
		if (providedInstance.isPresent()) {
			return prototype;
		}

		// �׵�¦�ξ�硢ͭ������¦������Ф�����֤�
		Optional<RteBswRequiredModeGroupConnection> connection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION)
				.AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, prototype)));
		if (connection.isPresent()) { // 1:1(n)
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, connection.get().getRteBswProvidedModeGroup());
			if (modeInstance.isPresent()) {
				return connection.get().getRteBswProvidedModeGroup();
			}
		}
		return null;
	}
	
	private void buildExecutableStartOperationForMode(ExecutableStartOperation operation, Event event) throws ModelException {
		BswEvent bswEvent = event.getBswEvent();
		if (bswEvent == null) {
			return;
		}
		setDisabledInModes(operation, bswEvent, bswEvent.getParent().getParent());
	}

	public ModeSwitchTriggeringExecutableStartOperation createExcutableStartOperation(BswModuleDescription description, BswModeSwitchEvent bswModeSwitchEvent, ModeDeclarationGroupPrototype modePrototype) throws ModelException {
		Optional<ExecutableEntity> executablexeOptional = this.context.builtQuery.tryFindDest(EXECUTABLE_ENTITY, bswModeSwitchEvent.getStartsOnEvent());
		if (!executablexeOptional.isPresent()) {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// BSW���٥�Ȥε�ư�оݤ�BSW�������塼��֥�Υ���ܥ뤬��������Ƥ��ʤ����
			return null;
		}

		// ľ�ܴؿ��ƤӽФ��������å�
		BswSchedulableEntity schedulableEntity = bswModeSwitchEvent.getStartsOnEvent();
		if (!schedulableEntity.getAccessedModeGroup().contains(modePrototype)) {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			//EntityOperationModelBuilder.isEnabledEvent��Ʊ�ͤΥ����å��������äƤ���
			return null;
		}
		
		// nrte_sws_0193 �ˤ��caller��callee��context��TASK�ʤΤǡ�context�ˤ�뵯ư�����å�����
		
		ModeSwitchTriggeringExecutableStartOperation operation = ModuleFactory.eINSTANCE.createModeSwitchTriggeringExecutableStartOperation();
//		String startModeName = SymbolNames.createSchmStartModeName(description, bswModeSwitchEvent, bswModeSwitchEvent.getModeIref().get(0));
		setStartMode(operation, bswModeSwitchEvent);
		setDisabledInModes(operation, bswModeSwitchEvent, description);
		operation.setStartExecutable(executablexeOptional.get());
		for (ExclusiveArea exclusiveArea : schedulableEntity.getRunsInsideExclusiveArea()) {
			operation.getExcludeOperation().add(this.excludeOperationBuilder.createExcludeOperation(exclusiveArea));
		}
		
		return operation;
	}

	private void setDisabledInModes(ExecutableStartOperation operation, BswEvent bswEvent, BswModuleDescription description) throws ModelException {
		for (ModeInBswModuleDescriptionInstanceRef instanceRef : bswEvent.getDisabledInMode()) {
			ModeDeclarationGroupPrototype prototype = getEnableProvidedModeDeclarationGroupPrototype(instanceRef.getContextModeDeclarationGroup());
			if (prototype == null) {
				// 0:1Ϣ��(��¦�Υ⡼�ɥޥ��󥤥󥹥��󥹤����פʥ�������ޤ�)�ξ��Ϥ�������롣����(isEnabledEvent())��ɬ�פ�Ƚ�ꤵ��Ƥ��뤿�ᡢdisabledȽ�������
				continue;
			}
			String disabledModeName = SymbolNames.createModeConstantName(instanceRef);
			DisabledInMode disabledInMode = ModuleFactory.eINSTANCE.createDisabledInMode();
			Constant disabledMode = this.context.query.findSingle(isKindOf(CONSTANT).AND(hasAttr(CONSTANT__SYMBOL_NAME, disabledModeName)));
			operation.getDisabledMode().add(disabledInMode);
			disabledInMode.setDisabledMode(disabledMode);
			ModeMachineInstance machineInstance = this.context.builtQuery.<ModeMachineInstance> findDest(MODE_MACHINE_INSTANCE, prototype);
			disabledInMode.setCurrentModeVariable(machineInstance.getCurrentModeVariable());
			disabledInMode.setNextModeVariable(machineInstance.getNextModeVariable());
		}
		
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(DISABLED_IN_MODE__DISABLED_MODE, CONSTANT__SYMBOL_NAME));
		ECollections.sort(operation.getDisabledMode(), ordering);
	}

	private void setStartMode(ModeSwitchTriggeringExecutableStartOperation operation, BswModeSwitchEvent bswModeSwitchEvent) throws ModelException {
		String startModeName = SymbolNames.createModeConstantName(bswModeSwitchEvent.getModeIref().get(0));
		Constant startMode = this.context.query.findSingle(isKindOf(CONSTANT).AND(hasAttr(CONSTANT__SYMBOL_NAME, startModeName)));
		operation.getStartMode().add(startMode);
	}
	
	private void buildEntityCountupOperation(ContextActivationOperation targetContextActivationOperation, EntityStarter sourceEntityStarter) throws ModelException {
		// ����Ĵ���������ѿ��ι���
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			targetContextActivationOperation.setCycleCountupOperation(createCycleCountupOperation(sourceEntityStarter.getCycleCounterImplementation()));
		}
	
		// ���ϥ��ե��å�Ĵ���������ѿ��ι���
		if (sourceEntityStarter.getStartOffsetCounterImplementation() != null) {
			targetContextActivationOperation.setStartOffsetCountupOperation(createStartOffsetCountupOperation(sourceEntityStarter.getStartOffsetCounterImplementation()));
		}
	}

	private CycleCountupOperation createCycleCountupOperation(CycleCounterImplementation sourceCycleCounterImplementation) throws ModelException {
		CycleCountupOperation cycleCountupOperation = ModuleFactory.eINSTANCE.createCycleCountupOperation();
		cycleCountupOperation.setCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceCycleCounterImplementation));
		cycleCountupOperation.setMaxConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceCycleCounterImplementation));
		return cycleCountupOperation;
	}

	private StartOffsetCountupOperation createStartOffsetCountupOperation(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation) throws ModelException {
		StartOffsetCountupOperation startOffsetCountupOperation = ModuleFactory.eINSTANCE.createStartOffsetCountupOperation();
		startOffsetCountupOperation.setCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartOffsetCounterImplementation));
		startOffsetCountupOperation.setMaxConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartOffsetCounterImplementation));
		return startOffsetCountupOperation;
	}

	public DirectExecutableStartOperation createDirectExecutableStartOperation(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		DirectExecutableStartOperation operation = ModuleFactory.eINSTANCE.createDirectExecutableStartOperation();
		buildExecutableStartOperation(operation, sourceExecutableEntity);
		return operation;
	}
	
	private void buildExecutableStartOperation(ExecutableStartOperation targetOperation, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		ExecutableEntity executableEntity = this.context.builtQuery.findDest(EXECUTABLE_ENTITY, sourceExecutableEntity);

		targetOperation.setStartExecutable(executableEntity);
		for (ExclusiveArea exclusiveArea : sourceExecutableEntity.getRunsInsideExclusiveArea()) {
			targetOperation.getExcludeOperation().add(this.excludeOperationBuilder.createExcludeOperation(exclusiveArea));
		}
	}
}
