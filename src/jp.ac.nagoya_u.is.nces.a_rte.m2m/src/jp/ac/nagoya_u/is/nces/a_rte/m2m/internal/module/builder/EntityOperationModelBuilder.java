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
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER__START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EVENT_TO_TASK_MAPPING__POSITION_IN_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.DISABLED_IN_MODE__DISABLED_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ServerRunnableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class EntityOperationModelBuilder {

	private final ModuleModelBuildContext context;
	private final ModuleRules moduleRules;

	private final ExcludeOperationModelBuilder excludeOperationBuilder;


	public EntityOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.moduleRules = new ModuleRules(context);
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public OsTaskActivationOperation createOsTaskActivationOperation(OsTaskActivateEntityStarter sourceEntityStarter, OsTask sourceOsTask) throws ModelException {
		OsTaskActivationOperation destOsTaskActivationOperation = ModuleFactory.eINSTANCE.createOsTaskActivationOperation();
		destOsTaskActivationOperation.setSingleSource(sourceEntityStarter);
		buildEntityCountupOperation(destOsTaskActivationOperation, sourceEntityStarter);
	
		// ���������塼���֥뵯ư�����ι���
		for (EntityStartInteraction sourceStartInteraction : sortedCopyOfEntityStartInteractions(sourceEntityStarter.getStartInteraction())) {
			buildExecutableStartOperation(destOsTaskActivationOperation, sourceStartInteraction);
		}
		return destOsTaskActivationOperation;
	}

	public List<OsEventSetActivationOperation> createOsEventSetActivationOperations(List<OsEventSetEntityStarter> sourceEntityStarters, OsTask sourceOsTask) throws ModelException {

		// EntityStartInteraction�򥿥�����¹Խ���ˤ�꥽����
		List<EntityStartInteraction> entityStartInteractions = this.context.query.collect(sourceEntityStarters, ENTITY_STARTER__START_INTERACTION);
		List<EntityStartInteraction> sortedEntityStartInteractions = sortedCopyOfEntityStartInteractions(entityStartInteractions);

		// OS���٥������Υϥ�ɥ�󥰽�������
		List<OsEventSetActivationOperation> destOperations = Lists.newArrayList();
		for (EntityStartInteraction sourceStartInteraction : sortedEntityStartInteractions) {
			OsEventSetEntityStarter sourceEntityStarter = (OsEventSetEntityStarter) sourceStartInteraction.getStarter();
			destOperations.add(createOsEventSetActivationOperation(sourceEntityStarter, sourceStartInteraction, sourceOsTask));
		}

		// Ʊ���EntityStarter�����������줿���ڥ졼������¤�Ǥ����硤OS���٥������Υϥ�ɥ�󥰽�������
		List<OsEventSetActivationOperation> destCombinedOperations = Lists.newArrayList(destOperations.get(0));
		OsEventSetActivationOperation destCombineTargetOperation = destCombinedOperations.get(0);

		for (OsEventSetActivationOperation destOperation : destOperations.subList(1, destOperations.size())) {
			if (destCombineTargetOperation.getSingleSource() == destOperation.getSingleSource()) {
				// ���ˤʤä�EntityStarter��Ʊ��ʤΤǡ���������
				destCombineTargetOperation.getExecutableStartOperation().addAll(destOperation.getExecutableStartOperation());
			} else {
				// ���ˤʤä�EntityStarter���ۤʤ�Τǡ����η��򳫻Ϥ���
				destCombinedOperations.add(destOperation);
				destCombineTargetOperation = destOperation;
			}
		}
	
		// ������ȥ��å׽�������
		for (OsEventSetEntityStarter sourceEntityStarter : sourceEntityStarters) {
			List<OsEventSetActivationOperation> targetActivationOperations = this.context.builtQuery.selectDests(destCombinedOperations, sourceEntityStarter);
			OsEventSetActivationOperation targetActivationOperation = Iterables.getLast(targetActivationOperations);
	
			buildEntityCountupOperation(targetActivationOperation, sourceEntityStarter);
		}
		return destCombinedOperations;
	}

	private List<EntityStartInteraction> sortedCopyOfEntityStartInteractions(List<EntityStartInteraction> sourceEntityStartInteractions) {
		return Ordering.natural().onResultOf(this.context.query.<Integer> features2Function(ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING, EVENT_TO_TASK_MAPPING__POSITION_IN_TASK)).sortedCopy(sourceEntityStartInteractions);
	}

	private OsEventSetActivationOperation createOsEventSetActivationOperation(OsEventSetEntityStarter sourceEntityStarter, EntityStartInteraction sourceStartInteraction, OsTask sourceOsTask)
			throws ModelException {
		OsEventSetActivationOperation destContextActivationOperation = ModuleFactory.eINSTANCE.createOsEventSetActivationOperation();
		destContextActivationOperation.setSingleSource(sourceEntityStarter);
	
		// ���������塼���֥뵯ư�����ι���
		buildExecutableStartOperation(destContextActivationOperation, sourceStartInteraction);
		destContextActivationOperation.setActivationOsEventId(sourceEntityStarter.getSourceOsEvent().getShortName());
		return destContextActivationOperation;
	}

	private void buildExecutableStartOperation(ContextActivationOperation targetContextActivationOperation, EntityStartInteraction sourceStartInteraction) throws ModelException {
		if (!isEnabledEntityStartInteraction(sourceStartInteraction)) {
			return;
		}
		if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE ���true(������Implementation��TimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementation�ΤߤΤ���)
			TimingTriggeringEntityStartImplementation sourceTimingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createTimingTriggeringExecutableStartOperation(sourceStartInteraction, sourceTimingTriggeringEntityStartImplementation));

		} else if (sourceStartInteraction.getImplementation() instanceof ModeSwitchTriggeringEntityStartImplementation) { // COVERAGE ���true(������Implementation��TimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementation�ΤߤΤ���)
			ModeSwitchTriggeringEntityStartImplementation sourceModeSwitchImplementation = (ModeSwitchTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createModeSwitchTriggeringExecutableStartOperation(sourceStartInteraction, sourceModeSwitchImplementation));
		}
	}

	private boolean isEnabledEntityStartInteraction(EntityStartInteraction sourceStartInteraction) {
		if (sourceStartInteraction.getEventToTaskMapping().getEvent().getSourceBswEvent() == null) {
			// RTE���٥�Ȥξ��
			return true; // ���ͭ��
		} else {
			// BSW���٥�Ȥξ��
			return this.moduleRules.isEnabledBswEvent(sourceStartInteraction.getEventToTaskMapping().getEvent().getSourceBswEvent());
		}
	}

	private TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			TimingTriggeringEntityStartImplementation sourceStartImplementation) throws ModelException {

		TimingTriggeringExecutableStartOperation destOperation = ModuleFactory.eINSTANCE.createTimingTriggeringExecutableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent());
		buildDisabledInModePartOfExecutableStartOperation(destOperation, sourceStartInteraction.getEventToTaskMapping().getEvent());

		if (sourceStartImplementation.requiresCycleAdjust()) {
			destOperation.setCycleCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getCycleCounterImplementation()));
			destOperation.setCyclePeriodConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartImplementation, RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME));
			destOperation.setCycleOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartImplementation, RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME));
		}
		if (sourceStartImplementation.requiresStartOffsetAdjust()) {
			destOperation.setStartOffsetCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getStartOffsetCounterImplementation()));
			destOperation.setStartOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartImplementation, RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME));
		}

		return destOperation;
	}

	private ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			ModeSwitchTriggeringEntityStartImplementation sourceModeSwitchImplementation) throws ModelException {

		ModeSwitchTriggeringExecutableStartOperation destOperation = ModuleFactory.eINSTANCE.createModeSwitchTriggeringExecutableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent());
		buildDisabledInModePartOfExecutableStartOperation(destOperation, sourceStartInteraction.getEventToTaskMapping().getEvent());
		return destOperation;
	}

	private Optional<ModeDeclarationGroupPrototype> tryGetEnableProvidedModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype prototype) {
		// ͭ������¦�Ǥ���С�������֤�
		Optional<ModeMachineInstance> providedInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, prototype);
		if (providedInstance.isPresent()) {
			return Optional.of(prototype);
		}

		// �׵�¦�ξ�硢ͭ������¦������Ф�����֤�
		Optional<RteBswRequiredModeGroupConnection> connection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION)
				.AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, prototype)));
		if (connection.isPresent()) { // 1:1(n)
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, connection.get().getRteBswProvidedModeGroup());
			if (modeInstance.isPresent()) {
				return Optional.of(connection.get().getRteBswProvidedModeGroup());
			}
		}
		return Optional.absent();
	}
	
	private void buildDisabledInModePartOfExecutableStartOperation(ExecutableStartOperation targetOperation, Event sourceEvent) throws ModelException {
		BswEvent sourceBswEvent = sourceEvent.getSourceBswEvent();
		if (sourceBswEvent == null) {
			return;
		}
		buildDisabledInModePartOfExecutableStartOperation(targetOperation, sourceBswEvent);
	}

	private void buildDisabledInModePartOfExecutableStartOperation(ExecutableStartOperation targetOperation, BswEvent sourceBswEvent) throws ModelException {
		for (ModeInBswModuleDescriptionInstanceRef sourceDisabledInModeIref : sourceBswEvent.getDisabledInMode()) {
			Optional<ModeDeclarationGroupPrototype> sourceEnableProvidedModePrototype = tryGetEnableProvidedModeDeclarationGroupPrototype(sourceDisabledInModeIref.getContextModeDeclarationGroup());
			if (!sourceEnableProvidedModePrototype.isPresent()) {
				// 0:1Ϣ��(��¦�Υ⡼�ɥޥ��󥤥󥹥��󥹤����פʥ�������ޤ�)�ξ��Ϥ�������롣����(isEnabledEvent())��ɬ�פ�Ƚ�ꤵ��Ƥ��뤿�ᡢdisabledȽ�������
				continue;
			}

			Bswm sourceBswm = this.context.builtQuery.findDest(BSWM, sourceBswEvent.getParent().getParent());
			ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(sourceBswm.getModeDeclarationGroup(), sourceDisabledInModeIref.getContextModeDeclarationGroup().getType());
			Constant disabledModeConstant = this.context.builtQuery.selectDest(modeDeclarationGroup.getModeConstant(), sourceDisabledInModeIref.getTargetMode());

			ModeMachineInstance machineInstance = this.context.builtQuery.findDest(MODE_MACHINE_INSTANCE, sourceEnableProvidedModePrototype.get());

			DisabledInMode destDisabledInMode = ModuleFactory.eINSTANCE.createDisabledInMode();
			destDisabledInMode.setDisabledMode(disabledModeConstant);
			destDisabledInMode.setModeMachineInstance(machineInstance);
			targetOperation.getDisabledInMode().add(destDisabledInMode);
		}

		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> features2Function(DISABLED_IN_MODE__DISABLED_MODE, CONSTANT__SYMBOL_NAME));
		ECollections.sort(targetOperation.getDisabledInMode(), ordering);
	}

	public ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation(BswModuleDescription sourceBswModuleDescription, BswModeSwitchEvent sourceBswModeSwitchEvent) throws ModelException {
		ModeSwitchTriggeringExecutableStartOperation destOperation = ModuleFactory.eINSTANCE.createModeSwitchTriggeringExecutableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceBswModeSwitchEvent.getStartsOnEvent());
		buildDisabledInModePartOfExecutableStartOperation(destOperation, sourceBswModeSwitchEvent);
		setStartMode(sourceBswModuleDescription, destOperation, sourceBswModeSwitchEvent);
		return destOperation;
	}

	private void setStartMode(BswModuleDescription sourceBswModuleDescription, ModeSwitchTriggeringExecutableStartOperation targetOperation, BswModeSwitchEvent sourceBswModeSwitchEvent) throws ModelException {
		String startModeConstantName = SymbolNames.createModeConstantName(sourceBswModuleDescription, sourceBswModeSwitchEvent.getModeIref().get(0));
		Constant startMode = this.context.query.findSingle(isKindOf(CONSTANT).AND(hasAttr(CONSTANT__SYMBOL_NAME, startModeConstantName)));

		targetOperation.getStartMode().add(startMode);
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
		CycleCountupOperation destCycleCountupOperation = ModuleFactory.eINSTANCE.createCycleCountupOperation();
		destCycleCountupOperation.setCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceCycleCounterImplementation));
		destCycleCountupOperation.setMaxConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceCycleCounterImplementation));
		return destCycleCountupOperation;
	}

	private StartOffsetCountupOperation createStartOffsetCountupOperation(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation) throws ModelException {
		StartOffsetCountupOperation destStartOffsetCountupOperation = ModuleFactory.eINSTANCE.createStartOffsetCountupOperation();
		destStartOffsetCountupOperation.setCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartOffsetCounterImplementation));
		destStartOffsetCountupOperation.setMaxConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, sourceStartOffsetCounterImplementation));
		return destStartOffsetCountupOperation;
	}

	public ServerRunnableStartOperation createServerRunnableStartOperation(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		ServerRunnableStartOperation destOperation = ModuleFactory.eINSTANCE.createServerRunnableStartOperation();
		buildCommonPartOfExecutableStartOperation(destOperation, sourceExecutableEntity);
		return destOperation;
	}
	
	private void buildCommonPartOfExecutableStartOperation(ExecutableStartOperation targetOperation, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		ExecutableEntity executableEntity = this.context.builtQuery.findDest(EXECUTABLE_ENTITY, sourceExecutableEntity);

		targetOperation.setStartExecutable(executableEntity);
		for (ExclusiveArea sourceExclusiveArea : sourceExecutableEntity.getRunsInsideExclusiveArea()) {
			targetOperation.getRieaExcludeOperation().add(this.excludeOperationBuilder.createExcludeOperation(sourceExclusiveArea));
		}
	}
}
