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
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__MAPPED_RTE_BSW_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK__MAPPED_RTE_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM;
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

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.MathUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm;
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

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Ordering;

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

			// OS���٥�Ȥ����ꤵ��Ƥ��뤫�ɤ���
			List<OsEvent> sourceUsedOsEvents = getUsedOsEvents(sourceOsTask);
			if (sourceUsedOsEvents.isEmpty()) {
				// OS��������ư�ˤ�륨�������塼���֥뵯ư
				targetInteractionRoot.getInteractionEnd().add(createOsTaskEntityStarter(sourceOsTask));
			} else {
				// OS���٥������ˤ�륨�������塼���֥뵯ư
				for (OsEvent sourceUsedOsEvent : sourceUsedOsEvents) {
					targetInteractionRoot.getInteractionEnd().add(createOsEventEntityStarter(sourceOsTask, sourceUsedOsEvent));
				}
			}
		}
	}

	private OsTaskActivateEntityStarter createOsTaskEntityStarter(OsTask sourceOsTask) throws ModelException {
		List<OsAlarm> sourceOsAlarms = getUsedOsAlarms(sourceOsTask);
		EcucPartition partition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		OsTaskActivateEntityStarter destEntityStarter = InteractionFactory.eINSTANCE.createOsTaskActivateEntityStarter();
		destEntityStarter.setSourceOsTask(sourceOsTask);
		destEntityStarter.setOwnerPartition(partition);
		buildExpectedConfigOfEntityStarter(destEntityStarter, sourceOsAlarms);
		return destEntityStarter;
	}

	private OsEventSetEntityStarter createOsEventEntityStarter(OsTask sourceOsTask, OsEvent sourceOsEvent) throws ModelException {
		List<OsAlarm> sourceOsAlarms = getUsedOsAlarms(sourceOsTask, sourceOsEvent);
		EcucPartition partition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);

		OsEventSetEntityStarter destEntityStarter = InteractionFactory.eINSTANCE.createOsEventSetEntityStarter();
		destEntityStarter.setSourceOsTask(sourceOsTask);
		destEntityStarter.setSourceOsEvent(sourceOsEvent);
		destEntityStarter.setOwnerPartition(partition);
		buildExpectedConfigOfEntityStarter(destEntityStarter, sourceOsAlarms);
		return destEntityStarter;
	}

	private void buildExpectedConfigOfEntityStarter(EntityStarter targetEntityStarter, List<OsAlarm> sourceOsAlarms) {
		if (sourceOsAlarms.isEmpty()) {
			return;
		}

		targetEntityStarter.setExpectedConfig(sourceOsAlarms.get(0).getExpectedConfig().get(0));
	}

	private void buildEntityStartInteractions(InteractionRoot targetInteractionRoot) {
		// OS��������ư�ˤ�굯ư���륨�������塼���֥�γ���Ϣ�Ȥ���
		for (OsTaskActivateEntityStarter sourceAndTargetEntityStarter : this.context.query.<OsTaskActivateEntityStarter> findByKind(OS_TASK_ACTIVATE_ENTITY_STARTER)) {
			for (RteEventToTaskMapping sourceRteEventConfig : sourceAndTargetEntityStarter.getSourceOsTask().getMappedRteEvent()) {
				targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, sourceAndTargetEntityStarter));
			}
			
			for (RteBswEventToTaskMapping sourceBswEventConfig : sourceAndTargetEntityStarter.getSourceOsTask().getMappedRteBswEvent()) {
				// BswImplementation��¸�ߤ��Ƥ���BswInternalBehavior��°���Ƥ���BswSchedulableEntity�Τ��������оݤȤ���.
				if (!sourceBswEventConfig.getRteBswEvent().getStartsOnEvent().getParent().getImplementation().isEmpty()) {
					// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
					// BSW���٥�Ȥ�ͭ���Ǥʤ�(ͭ����InternalBehavior)�˴ޤޤ�Ƥ��ʤ����
					targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceBswEventConfig, sourceAndTargetEntityStarter));
				}
			}
		}

		// OS���٥������ˤ�굯ư���륨�������塼���֥�γ���Ϣ�Ȥ���
		for (OsEventSetEntityStarter sourceAndTargetEntityStarter : this.context.query.<OsEventSetEntityStarter> findByKind(OS_EVENT_SET_ENTITY_STARTER)) {
			for (RteEventToTaskMapping sourceRteEventConfig : getMappedRteEventConfigs(sourceAndTargetEntityStarter.getSourceOsTask(), sourceAndTargetEntityStarter.getSourceOsEvent())) {
				targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, sourceAndTargetEntityStarter));
			}

			for (RteBswEventToTaskMapping sourceBswEventConfig : getMappedBswEventConfigs(sourceAndTargetEntityStarter.getSourceOsTask(), sourceAndTargetEntityStarter.getSourceOsEvent())) {
				targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceBswEventConfig, sourceAndTargetEntityStarter));
			}
		}
	}

	private List<OsEvent> getUsedOsEvents(OsTask osTask) {
		List<OsEvent> usedOsEvents = new ArrayList<OsEvent>();
		usedOsEvents.addAll(this.context.query.<OsEvent> collect(osTask, OS_TASK__MAPPED_RTE_EVENT, RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT));
		usedOsEvents.addAll(this.context.query.<OsEvent> collect(osTask, OS_TASK__MAPPED_RTE_BSW_EVENT, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT));
		return ImmutableSet.copyOf(usedOsEvents).asList();
	}

	private List<OsAlarm> getUsedOsAlarms(OsTask osTask) {
		List<OsAlarm> usedOsAlarms = new ArrayList<OsAlarm>();
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(osTask, OS_TASK__MAPPED_RTE_EVENT, RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM));
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(osTask, OS_TASK__MAPPED_RTE_BSW_EVENT, RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM));
		return ImmutableSet.copyOf(usedOsAlarms).asList();
	}

	private List<OsAlarm> getUsedOsAlarms(OsTask osTask, OsEvent osEvent) {
		List<OsAlarm> usedOsAlarms = new ArrayList<OsAlarm>();
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(getMappedRteEventConfigs(osTask, osEvent), RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM));
		usedOsAlarms.addAll(this.context.query.<OsAlarm> collect(getMappedBswEventConfigs(osTask, osEvent), RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_ALARM));
		return ImmutableSet.copyOf(usedOsAlarms).asList();
	}

	private List<RteEventToTaskMapping> getMappedRteEventConfigs(OsTask osTask, OsEvent osEvent) {
		return this.context.query.select(osTask.getMappedRteEvent(), ref(RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT, osEvent));
	}

	private List<RteBswEventToTaskMapping> getMappedBswEventConfigs(OsTask osTask, OsEvent osEvent) {
		return this.context.query.select(osTask.getMappedRteBswEvent(), ref(RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_USED_OS_EVENT, osEvent));
	}

	private RunnableEntityStartInteraction createRunnableEntityStartInteraction(RteEventToTaskMapping sourceRteEventConfig, EntityStarter entityStarter) {
		RunnableEntityStartInteraction destStartInteraction = InteractionFactory.eINSTANCE.createRunnableEntityStartInteraction();
		destStartInteraction.setStarter(entityStarter);
		destStartInteraction.setEventToTaskMapping(createEventToTaskMapping(sourceRteEventConfig));
		return destStartInteraction;
	}

	private BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction(RteBswEventToTaskMapping sourceRteBswEventConfig, EntityStarter entityStarter) {
		BswSchedulableEntityStartInteraction destStartInteraction = InteractionFactory.eINSTANCE.createBswSchedulableEntityStartInteraction();
		destStartInteraction.setStarter(entityStarter);
		destStartInteraction.setEventToTaskMapping(createEventToTaskMapping(sourceRteBswEventConfig));
		return destStartInteraction;
	}
	
	private EventToTaskMapping createEventToTaskMapping(RteEventToTaskMapping sourceRteEventToTaskMapping) {
		EventToTaskMapping destEventToTaskMapping = InteractionFactory.eINSTANCE.createEventToTaskMapping();
		
		destEventToTaskMapping.setActivationOffset(sourceRteEventToTaskMapping.getRteActivationOffset());
		destEventToTaskMapping.setPositionInTask(sourceRteEventToTaskMapping.getRtePositionInTask());

		if (sourceRteEventToTaskMapping.getRteEvent() instanceof TimingEvent) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			TimingEvent sourceRteTimingEvent = (TimingEvent)sourceRteEventToTaskMapping.getRteEvent();
			destEventToTaskMapping.setEvent(createTimingEvent(sourceRteTimingEvent));
		}
		
		return destEventToTaskMapping;
	}

	private EventToTaskMapping createEventToTaskMapping(RteBswEventToTaskMapping sourceRteBswEventToTaskMapping) {
		EventToTaskMapping destEventToTaskMapping = InteractionFactory.eINSTANCE.createEventToTaskMapping();
		
		destEventToTaskMapping.setActivationOffset(sourceRteBswEventToTaskMapping.getRteBswActivationOffset());
		destEventToTaskMapping.setPositionInTask(sourceRteBswEventToTaskMapping.getRteBswPositionInTask());

		if (sourceRteBswEventToTaskMapping.getRteBswEvent() instanceof BswTimingEvent) {
			BswTimingEvent sourceBswTimingEvent = (BswTimingEvent) sourceRteBswEventToTaskMapping.getRteBswEvent();
			destEventToTaskMapping.setEvent(createTimingEvent(sourceBswTimingEvent));

		} else if (sourceRteBswEventToTaskMapping.getRteBswEvent() instanceof BswModeSwitchEvent) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			BswModeSwitchEvent sourceBswModeSwitchEvent = (BswModeSwitchEvent) sourceRteBswEventToTaskMapping.getRteBswEvent();
			destEventToTaskMapping.setEvent(createModeSwitchEvent(sourceBswModeSwitchEvent, sourceBswModeSwitchEvent.getStartsOnEvent()));
		}
		
		return destEventToTaskMapping;
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent createTimingEvent(TimingEvent sourceEvent) {
		return createTimingEvent(sourceEvent.getStartOnEvent(), sourceEvent.getPeriod());
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent createTimingEvent(BswTimingEvent sourceEvent) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent destTimingEvent = createTimingEvent(sourceEvent.getStartsOnEvent(), sourceEvent.getPeriod());
		destTimingEvent.setSourceBswEvent(sourceEvent);
		return destTimingEvent;
	}
	
	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent createTimingEvent(ExecutableEntity sourceExecutableEntity, BigDecimal sourcePeriod) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent destTimingEvent = InteractionFactory.eINSTANCE.createTimingEvent();
		
		destTimingEvent.setStartOnEvent(sourceExecutableEntity);
		destTimingEvent.setPeriod(sourcePeriod);
		
		return destTimingEvent;
	}
	
	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent createModeSwitchEvent(BswModeSwitchEvent sourceEvent, ExecutableEntity soureExecutableEntity) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent destModeSwitchEvent = InteractionFactory.eINSTANCE.createModeSwitchEvent();
		
		destModeSwitchEvent.setStartOnEvent(soureExecutableEntity);
		destModeSwitchEvent.setSourceBswEvent(sourceEvent);
		
		return destModeSwitchEvent;
	}

	private void buildEntityStartImplementations(InteractionRoot targetInteractionRoot) {
		for (EntityStartInteraction sourceAndTargetStartInteraction : this.context.query.<EntityStartInteraction> findByKind(ENTITY_START_INTERACTION)) {
			// �����Υ��ݡ����ϰϤǤϼ������٥�Ȥȥ��ڥ졼�����ƽФ����٥�ȤΤ�
			if (sourceAndTargetStartInteraction.getEventToTaskMapping().getEvent() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent) { // COVERAGE ���true(������EntityStartInteraction�ϼ������٥�Ȥ��Ф��ƤΤ���������뤿��)
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent sourceTimingEvent = (jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent) sourceAndTargetStartInteraction.getEventToTaskMapping().getEvent();
				sourceAndTargetStartInteraction.setImplementation(createTimingTriggeringEntityStartImplementation(sourceAndTargetStartInteraction, sourceTimingEvent));

			} else if (sourceAndTargetStartInteraction.getEventToTaskMapping().getEvent() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent sourceModeSwitchEvent = (jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent) sourceAndTargetStartInteraction.getEventToTaskMapping().getEvent();
				sourceAndTargetStartInteraction.setImplementation(createModeSwitchTriggeringEntityStartImplementation(sourceAndTargetStartInteraction, sourceModeSwitchEvent));
			}
		}
	}

	private TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation(EntityStartInteraction sourceAndTargetStartInteraction, jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent sourceTimingEvent) {
		// NOTE �������٥�Ȥξ�硤ɬ��EntityStarter�˼����������ꤵ��Ƥ��뤿�ᡢ¸�ߥ����å��ϹԤ�ʤ�
		RteUsedOsActivation sourceExpectedConfig = sourceAndTargetStartInteraction.getStarter().getExpectedConfig();
		BigDecimal starterStartOffset = sourceExpectedConfig.getRteExpectedActivationOffset();
		BigDecimal starterPeriod = sourceExpectedConfig.getRteExpectedTickDuration();
		BigDecimal entityStartOffset = (sourceAndTargetStartInteraction.getEventToTaskMapping().getActivationOffset() == null) ? BigDecimal.ZERO : sourceAndTargetStartInteraction.getEventToTaskMapping().getActivationOffset();

		// Starter�ȥ��������塼���֥�δ֤μ���������ӥ��ե��åȤκ�ʬ�򻻽�
		TimingTriggeringEntityStartImplementation destStartImplementation = InteractionFactory.eINSTANCE.createTimingTriggeringEntityStartImplementation();
		destStartImplementation.setStartOffset(entityStartOffset.subtract(starterStartOffset).divide(starterPeriod).intValue());
		destStartImplementation.setCyclePeriod(sourceTimingEvent.getPeriod().divide(starterPeriod).intValue());
		return destStartImplementation;
	}

	private ModeSwitchTriggeringEntityStartImplementation createModeSwitchTriggeringEntityStartImplementation(EntityStartInteraction sourceAndTargetStartInteraction, ModeSwitchEvent sourceModeSwitchEvent) {
		return InteractionFactory.eINSTANCE.createModeSwitchTriggeringEntityStartImplementation();
	}
	
	private void buildStarterCounterImplementations(InteractionRoot targetInteractionRoot) throws ModelException {
		for (EntityStarter sourceAndTargetEntityStarter : this.context.query.<EntityStarter> findByKind(ENTITY_STARTER)) {
			List<TimingTriggeringEntityStartImplementation> startImplementations = this.context.query.get(sourceAndTargetEntityStarter,
					ENTITY_STARTER_EX___GET_TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATIONS__ENTITYSTARTER);

			// ����Ĵ����ɬ�פʾ�硤Ĵ���ѥ����󥿤��Ѱդ���
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST, true))) {
				sourceAndTargetEntityStarter.setCycleCounterImplementation(createCycleCounterImplementation(startImplementations, sourceAndTargetEntityStarter.getOwnerPartition()));
			}

			// ���ϥ��ե��å�Ĵ����ɬ�פʾ�硤Ĵ���ѥ����󥿤��Ѱդ���
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST, true))) {
				sourceAndTargetEntityStarter.setStartOffsetCounterImplementation(createStartOffsetCounterImplementation(startImplementations, sourceAndTargetEntityStarter.getOwnerPartition()));
			}
		}
	}

	private StartOffsetCounterImplementation createStartOffsetCounterImplementation(List<TimingTriggeringEntityStartImplementation> startImplementations, EcucPartition ownerPartition) {
		List<Integer> startOffsets = this.context.query.collect(startImplementations, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET);

		StartOffsetCounterImplementation destStartOffsetCounterImplementation = InteractionFactory.eINSTANCE.createStartOffsetCounterImplementation();
		destStartOffsetCounterImplementation.setMaxCount(Ordering.natural().max(startOffsets));
		destStartOffsetCounterImplementation.setOwnerPartition(ownerPartition);
		return destStartOffsetCounterImplementation;
	}

	private CycleCounterImplementation createCycleCounterImplementation(List<TimingTriggeringEntityStartImplementation> startImplementations, EcucPartition ownerPartition) {
		List<Integer> cyclePeriods = this.context.query.collect(startImplementations, TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD);

		CycleCounterImplementation destCycleCounterImplementation = InteractionFactory.eINSTANCE.createCycleCounterImplementation();
		destCycleCounterImplementation.setMaxCount(MathUtils.lcm(cyclePeriods));
		destCycleCounterImplementation.setOwnerPartition(ownerPartition);
		return destCycleCounterImplementation;
	}
}