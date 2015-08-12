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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.OS_TASK_EX___GET_OWNER_PARTITION__OSTASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.MathUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswTimingEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimingEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

public class EntityInteractionModelBuilder {
	private final InteractionModelBuildContext context;

	public EntityInteractionModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		buildEntityStarters(this.context.cache.interactionRoot);
		buildEntityStartInteractions(this.context.cache.interactionRoot);
		buildEntityStartImplementations(this.context.cache.interactionRoot);
		buildStarterCounterImplementations(this.context.cache.interactionRoot);
	}

	private void buildEntityStarters(InteractionRoot targetInteractionRoot) throws ModelException {
		// �����ľ�ܴؿ���ư���륪�ڥ졼�����ƽФ����٥�ȤˤĤ��Ƥ⥤�󥿥饯�������������٤�������
		// �����Ϥ����ޤ�ɬ�פʤ��Τǹ��ۤ��Ƥ��ʤ���
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			if (sourceOsTask.getMappedRteEvent().isEmpty() && sourceOsTask.getMappedRteBswEvent().isEmpty()) {
				continue;
			}
			
			EventToTaskMapping eventToTaskMapping;
			if (sourceOsTask.getMappedRteEvent().isEmpty() == false) {
				eventToTaskMapping = createEventToTaskMapping(sourceOsTask.getMappedRteEvent().get(0));
			} else {
				eventToTaskMapping = createEventToTaskMapping(sourceOsTask.getMappedRteBswEvent().get(0));
			}

			// OS���٥�Ȥ����ꤵ��Ƥ��뤫�ɤ���
			if (eventToTaskMapping.getUsedOsEvent() == null) {
				// OS��������ư�ˤ�륨�������塼���֥뵯ư
				targetInteractionRoot.getInteractionEnd().add(createOsTaskEntityStarter(sourceOsTask, eventToTaskMapping));
			} else {
				// OS���٥������ˤ�륨�������塼���֥뵯ư
				Set<OsEvent> sourceOsEvents = Sets.newHashSet(this.context.query.<OsEvent> collect(sourceOsTask.getMappedRteEvent(), RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT));
				sourceOsEvents.addAll(Sets.newHashSet(this.context.query.<OsEvent> collect(sourceOsTask.getMappedRteBswEvent(), RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT)));
				for (OsEvent sourceOsEvent : sourceOsEvents) {
					targetInteractionRoot.getInteractionEnd().add(createOsEventEntityStarter(sourceOsTask, sourceOsEvent));
				}
			}
		}
	}

	private OsTaskActivateEntityStarter createOsTaskEntityStarter(OsTask sourceOsTask, EventToTaskMapping eventToTaskMapping) throws ModelException {
		EcucPartition partition = EmfUtils.exInvoke(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		OsTaskActivateEntityStarter entityStarter = InteractionFactory.eINSTANCE.createOsTaskActivateEntityStarter();
		entityStarter.setSourceOsTask(sourceOsTask);
		entityStarter.setOwnerPartition(partition);
		buildExpectedConfig(entityStarter, eventToTaskMapping);
		return entityStarter;
	}

	private OsEventSetEntityStarter createOsEventEntityStarter(OsTask sourceOsTask, OsEvent sourceOsEvent) throws ModelException {
		EcucPartition partition = EmfUtils.exInvoke(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		OsEventSetEntityStarter entityStarter = InteractionFactory.eINSTANCE.createOsEventSetEntityStarter();
		entityStarter.setSourceOsTask(sourceOsTask);
		entityStarter.setSourceOsEvent(sourceOsEvent);
		entityStarter.setOwnerPartition(partition);
		buildExpectedConfig(entityStarter, getMappedEvents(entityStarter).get(0));
		return entityStarter;
	}

	private void buildExpectedConfig(EntityStarter targetEntityStarter, EventToTaskMapping eventToTaskMapping) {
		if ((eventToTaskMapping.getUsedOsAlarm() != null)) { // COVERAGE ���true(���������������ޥåԥ󥰤�����硤���顼���Ʊ�������ꤵ��뤿��)
			targetEntityStarter.setExpectedConfig(eventToTaskMapping.getUsedOsAlarm().getExpectedConfig().get(0));
		}
	}

	private void buildEntityStartInteractions(InteractionRoot targetInteractionRoot) {
		// OS��������ư�ˤ�굯ư���륨�������塼���֥�γ���Ϣ�Ȥ���
		for (OsTaskActivateEntityStarter entityStarter : this.context.query.<OsTaskActivateEntityStarter> findByKind(OS_TASK_ACTIVATE_ENTITY_STARTER)) {
			if (entityStarter.getSourceOsTask().getMappedRteEvent().isEmpty() == false) {
				for (RteEventToTaskMapping sourceRteEventConfig : entityStarter.getSourceOsTask().getMappedRteEvent()) {
					targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, entityStarter));
				}
			}
			
			if (entityStarter.getSourceOsTask().getMappedRteBswEvent().isEmpty() == false) {
				for (RteBswEventToTaskMapping sourceRteBswEventConfig : entityStarter.getSourceOsTask().getMappedRteBswEvent()) {
					// BswImplementation��¸�ߤ��Ƥ���BswInternalBehavior��°���Ƥ���BswSchedulableEntity�Τ��������оݤȤ���.
					if (!sourceRteBswEventConfig.getRteBswEvent().getStartsOnEvent().getParent().getImplementation().isEmpty()) {
						// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
						// BSW���٥�Ȥ�ͭ���Ǥʤ�(ͭ����InternalBehavior)�˴ޤޤ�Ƥ��ʤ����
						targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceRteBswEventConfig, entityStarter));
					}
				}
			}
		}

		// OS���٥������ˤ�굯ư���륨�������塼���֥�γ���Ϣ�Ȥ���
		for (OsEventSetEntityStarter entityStarter : this.context.query.<OsEventSetEntityStarter> findByKind(OS_EVENT_SET_ENTITY_STARTER)) {
			if (entityStarter.getSourceOsTask().getMappedRteEvent().isEmpty() == false) {
				for (RteEventToTaskMapping sourceRteEventConfig : getMappedRteEvents(entityStarter)) {
					targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, entityStarter));
				}
			}

			if (entityStarter.getSourceOsTask().getMappedRteBswEvent().isEmpty() == false) {
				for (RteBswEventToTaskMapping sourceRteBswEventConfig : getMappedRteBswEvents(entityStarter)) {
					targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceRteBswEventConfig, entityStarter));
				}
			}
		}
	}

	private List<RteEventToTaskMapping> getMappedRteEvents(OsEventSetEntityStarter entityStarter) {
		return this.context.query.select(entityStarter.getSourceOsTask().getMappedRteEvent(), ref(RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, entityStarter.getSourceOsEvent()));
	}

	private List<RteBswEventToTaskMapping> getMappedRteBswEvents(OsEventSetEntityStarter entityStarter) {
		return this.context.query.select(entityStarter.getSourceOsTask().getMappedRteBswEvent(), ref(RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT, entityStarter.getSourceOsEvent()));
	}

	private List<EventToTaskMapping> getMappedEvents(OsEventSetEntityStarter entityStarter) {
		List<EventToTaskMapping> events = new ArrayList<EventToTaskMapping>();
		for (RteEventToTaskMapping rteEvent : getMappedRteEvents(entityStarter)) {
			events.add(createEventToTaskMapping(rteEvent));
		}

		for (RteBswEventToTaskMapping rteBswEvent : getMappedRteBswEvents(entityStarter)) {
			events.add(createEventToTaskMapping(rteBswEvent));
		}
		
		return events;
	}

	private RunnableEntityStartInteraction createRunnableEntityStartInteraction(RteEventToTaskMapping sourceRteEventConfig, EntityStarter entityStarter) {
		RunnableEntityStartInteraction startInteraction = InteractionFactory.eINSTANCE.createRunnableEntityStartInteraction();
		startInteraction.setStarter(entityStarter);
		startInteraction.setEventToTaskMapping(createEventToTaskMapping(sourceRteEventConfig));
		return startInteraction;
	}

	private BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction(RteBswEventToTaskMapping sourceRteBswEventConfig, EntityStarter entityStarter) {
		BswSchedulableEntityStartInteraction startInteraction = InteractionFactory.eINSTANCE.createBswSchedulableEntityStartInteraction();
		startInteraction.setStarter(entityStarter);
		startInteraction.setEventToTaskMapping(createEventToTaskMapping(sourceRteBswEventConfig));
		return startInteraction;
	}

	private void buildEntityStartImplementations(InteractionRoot targetInteractionRoot) {
		for (EntityStartInteraction targetStartInteraction : this.context.query.<EntityStartInteraction> findByKind(ENTITY_START_INTERACTION)) {
			// �����Υ��ݡ����ϰϤǤϼ������٥�Ȥȥ��ڥ졼�����ƽФ����٥�ȤΤ�
			if (targetStartInteraction.getEventToTaskMapping().getEvent() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent) { // COVERAGE ���true(������EntityStartInteraction�ϼ������٥�Ȥ��Ф��ƤΤ���������뤿��)
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent timingEvent = (jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent) targetStartInteraction.getEventToTaskMapping().getEvent();
				targetStartInteraction.setImplementation(createTimingTriggeringEntityStartImplementation(targetStartInteraction, timingEvent.getPeriod()));
			} else if (targetStartInteraction.getEventToTaskMapping().getEvent() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent modeSwitchEvent = (jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent) targetStartInteraction.getEventToTaskMapping().getEvent();
				targetStartInteraction.setImplementation(createModeSwitchTriggeringEntityStartImplementation(targetStartInteraction, modeSwitchEvent));
			}
		}
	}

	private TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation(EntityStartInteraction targetStartInteraction, BigDecimal period) {
		// �������٥�Ȥξ�硤ɬ��EntityStarter�˼����������ꤵ��Ƥ���Ϥ�
		RteUsedOsActivation expectedConfig = targetStartInteraction.getStarter().getExpectedConfig();
		BigDecimal starterStartOffset = expectedConfig.getRteExpectedActivationOffset();
		BigDecimal starterPeriod = expectedConfig.getRteExpectedTickDuration();
		BigDecimal entityStartOffset = (targetStartInteraction.getEventToTaskMapping().getActivationOffset() == null) ? BigDecimal.ZERO : targetStartInteraction.getEventToTaskMapping().getActivationOffset();

		// Starter�ȥ��������塼���֥�δ֤μ���������ӥ��ե��åȤκ�ʬ�򻻽�
		TimingTriggeringEntityStartImplementation startImplementation = InteractionFactory.eINSTANCE.createTimingTriggeringEntityStartImplementation();
		startImplementation.setStartOffset(entityStartOffset.subtract(starterStartOffset).divide(starterPeriod).intValue());
		startImplementation.setCyclePeriod(period.divide(starterPeriod).intValue());
		return startImplementation;
	}

	private ModeSwitchTriggeringEntityStartImplementation createModeSwitchTriggeringEntityStartImplementation(EntityStartInteraction targetStartInteraction, ModeSwitchEvent modeSwitchEvent) {
		ModeSwitchTriggeringEntityStartImplementation startImplementation = InteractionFactory.eINSTANCE.createModeSwitchTriggeringEntityStartImplementation();
		return startImplementation;
	}
	
	private void buildStarterCounterImplementations(InteractionRoot targetInteractionRoot) throws ModelException {
		for (EntityStarter targetEntityStarter : this.context.query.<EntityStarter> findByKind(ENTITY_STARTER)) {
			List<TimingTriggeringEntityStartImplementation> startImplementations = EmfUtils.exInvoke(targetEntityStarter,
					ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER);

			// ����Ĵ����ɬ�פʾ�硤Ĵ���ѥ����󥿤��Ѱդ���
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST, true))) {
				targetEntityStarter.setCycleCounterImplementation(createCycleCounterImplementation(startImplementations, targetEntityStarter.getOwnerPartition()));
			}

			// ���ϥ��ե��å�Ĵ����ɬ�פʾ�硤Ĵ���ѥ����󥿤��Ѱդ���
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST, true))) {
				targetEntityStarter.setStartOffsetCounterImplementation(createStartOffsetCounterImplementation(startImplementations, targetEntityStarter.getOwnerPartition()));
			}
		}
	}

	private StartOffsetCounterImplementation createStartOffsetCounterImplementation(List<TimingTriggeringEntityStartImplementation> startImplementations, EcucPartition ownerPartition) {
		List<Integer> startOffsets = this.context.query.collect(startImplementations, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET);

		StartOffsetCounterImplementation startOffsetCounterImplementation = InteractionFactory.eINSTANCE.createStartOffsetCounterImplementation();
		startOffsetCounterImplementation.setMaxCount(Ordering.natural().max(startOffsets));
		startOffsetCounterImplementation.setOwnerPartition(ownerPartition);
		return startOffsetCounterImplementation;
	}

	private CycleCounterImplementation createCycleCounterImplementation(List<TimingTriggeringEntityStartImplementation> startImplementations, EcucPartition ownerPartition) {
		List<Integer> cyclePeriods = this.context.query.collect(startImplementations, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD);

		CycleCounterImplementation cycleCounterImplementation = InteractionFactory.eINSTANCE.createCycleCounterImplementation();
		cycleCounterImplementation.setMaxCount(MathUtils.lcm(cyclePeriods));
		cycleCounterImplementation.setOwnerPartition(ownerPartition);
		return cycleCounterImplementation;
	}
	
	private EventToTaskMapping createEventToTaskMapping(RteEventToTaskMapping rteEventToTaskMapping) {
		EventToTaskMapping eventToTaskMapping = InteractionFactory.eINSTANCE.createEventToTaskMapping();
		
		eventToTaskMapping.setActivationOffset(rteEventToTaskMapping.getRteActivationOffset());
		eventToTaskMapping.setPositionInTask(rteEventToTaskMapping.getRtePositionInTask());

		if (rteEventToTaskMapping.getRteEvent() instanceof TimingEvent) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			TimingEvent rteTimingEvent = (TimingEvent)rteEventToTaskMapping.getRteEvent();
			eventToTaskMapping.setEvent(createTimingEvent(rteTimingEvent.getStartOnEvent(), rteTimingEvent.getPeriod()));
		}
		
		eventToTaskMapping.setUsedOsAlarm(rteEventToTaskMapping.getRteUsedOsAlarm());
		eventToTaskMapping.setUsedOsEvent(rteEventToTaskMapping.getRteUsedOsEvent());
		
		return eventToTaskMapping;
	}

	private EventToTaskMapping createEventToTaskMapping(RteBswEventToTaskMapping rteBswEventToTaskMapping) {
		EventToTaskMapping eventToTaskMapping = InteractionFactory.eINSTANCE.createEventToTaskMapping();
		
		eventToTaskMapping.setActivationOffset(rteBswEventToTaskMapping.getRteBswActivationOffset());
		eventToTaskMapping.setPositionInTask(rteBswEventToTaskMapping.getRteBswPositionInTask());

		if (rteBswEventToTaskMapping.getRteBswEvent() instanceof BswTimingEvent) {
			BswTimingEvent rteBswTimingEvent = (BswTimingEvent)rteBswEventToTaskMapping.getRteBswEvent();
			eventToTaskMapping.setEvent(createTimingEvent(rteBswTimingEvent.getStartsOnEvent(), rteBswTimingEvent.getPeriod(), rteBswTimingEvent));
		} else if (rteBswEventToTaskMapping.getRteBswEvent() instanceof BswModeSwitchEvent) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			BswModeSwitchEvent rteBswModeSwitchEvent = (BswModeSwitchEvent)rteBswEventToTaskMapping.getRteBswEvent();
			eventToTaskMapping.setEvent(createModeSwitchEvent(rteBswModeSwitchEvent.getStartsOnEvent(), rteBswModeSwitchEvent));
		}
		
		eventToTaskMapping.setUsedOsAlarm(rteBswEventToTaskMapping.getRteBswUsedOsAlarm());
		eventToTaskMapping.setUsedOsEvent(rteBswEventToTaskMapping.getRteBswUsedOsEvent());
		
		return eventToTaskMapping;
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent createTimingEvent(ExecutableEntity executableEntity, BigDecimal period, BswTimingEvent event) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent timingEvent = createTimingEvent(executableEntity, period);
		timingEvent.setBswEvent(event);
		return timingEvent;
	}
	
	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent createTimingEvent(ExecutableEntity executableEntity, BigDecimal period) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent timingEvent = InteractionFactory.eINSTANCE.createTimingEvent();
		
		timingEvent.setStartOnEvent(executableEntity);
		timingEvent.setPeriod(period);
		
		return timingEvent;
	}
	
	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent createModeSwitchEvent(ExecutableEntity executableEntity, BswModeSwitchEvent event) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent modeSwitchEvent = InteractionFactory.eINSTANCE.createModeSwitchEvent();
		
		modeSwitchEvent.setStartOnEvent(executableEntity);
		modeSwitchEvent.setBswEvent(event);
		
		return modeSwitchEvent;
	}
}