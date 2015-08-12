/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
		// 本来は直接関数起動するオペレーション呼出しイベントについてもインタラクションを生成すべきだが，
		// 現状はそこまで必要ないので構築していない．
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

			// OSイベントが設定されているかどうか
			if (eventToTaskMapping.getUsedOsEvent() == null) {
				// OSタスク起動によるエクスキュータブル起動
				targetInteractionRoot.getInteractionEnd().add(createOsTaskEntityStarter(sourceOsTask, eventToTaskMapping));
			} else {
				// OSイベント設定によるエクスキュータブル起動
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
		if ((eventToTaskMapping.getUsedOsAlarm() != null)) { // COVERAGE 常にtrue(現状，タスクがマッピングされる場合，アラームも同時に設定されるため)
			targetEntityStarter.setExpectedConfig(eventToTaskMapping.getUsedOsAlarm().getExpectedConfig().get(0));
		}
	}

	private void buildEntityStartInteractions(InteractionRoot targetInteractionRoot) {
		// OSタスク起動により起動するエクスキュータブルの開始連携を構築
		for (OsTaskActivateEntityStarter entityStarter : this.context.query.<OsTaskActivateEntityStarter> findByKind(OS_TASK_ACTIVATE_ENTITY_STARTER)) {
			if (entityStarter.getSourceOsTask().getMappedRteEvent().isEmpty() == false) {
				for (RteEventToTaskMapping sourceRteEventConfig : entityStarter.getSourceOsTask().getMappedRteEvent()) {
					targetInteractionRoot.getInteraction().add(createRunnableEntityStartInteraction(sourceRteEventConfig, entityStarter));
				}
			}
			
			if (entityStarter.getSourceOsTask().getMappedRteBswEvent().isEmpty() == false) {
				for (RteBswEventToTaskMapping sourceRteBswEventConfig : entityStarter.getSourceOsTask().getMappedRteBswEvent()) {
					// BswImplementationが存在しているBswInternalBehaviorに属しているBswSchedulableEntityのみ生成の対象とする.
					if (!sourceRteBswEventConfig.getRteBswEvent().getStartsOnEvent().getParent().getImplementation().isEmpty()) {
						// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
						// BSWイベントが有効でない(有効なInternalBehavior)に含まれていない場合
						targetInteractionRoot.getInteraction().add(createBswSchedulableEntityStartInteraction(sourceRteBswEventConfig, entityStarter));
					}
				}
			}
		}

		// OSイベント設定により起動するエクスキュータブルの開始連携を構築
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
			// 現状のサポート範囲では周期イベントとオペレーション呼出しイベントのみ
			if (targetStartInteraction.getEventToTaskMapping().getEvent() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent) { // COVERAGE 常にtrue(現状，EntityStartInteractionは周期イベントに対してのみ生成されるため)
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent timingEvent = (jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingEvent) targetStartInteraction.getEventToTaskMapping().getEvent();
				targetStartInteraction.setImplementation(createTimingTriggeringEntityStartImplementation(targetStartInteraction, timingEvent.getPeriod()));
			} else if (targetStartInteraction.getEventToTaskMapping().getEvent() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent modeSwitchEvent = (jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ModeSwitchEvent) targetStartInteraction.getEventToTaskMapping().getEvent();
				targetStartInteraction.setImplementation(createModeSwitchTriggeringEntityStartImplementation(targetStartInteraction, modeSwitchEvent));
			}
		}
	}

	private TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation(EntityStartInteraction targetStartInteraction, BigDecimal period) {
		// 周期イベントの場合，必ずEntityStarterに周期情報が設定されているはず
		RteUsedOsActivation expectedConfig = targetStartInteraction.getStarter().getExpectedConfig();
		BigDecimal starterStartOffset = expectedConfig.getRteExpectedActivationOffset();
		BigDecimal starterPeriod = expectedConfig.getRteExpectedTickDuration();
		BigDecimal entityStartOffset = (targetStartInteraction.getEventToTaskMapping().getActivationOffset() == null) ? BigDecimal.ZERO : targetStartInteraction.getEventToTaskMapping().getActivationOffset();

		// Starterとエクスキュータブルの間の周期，およびオフセットの差分を算出
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

			// 周期調整が必要な場合，調整用カウンタを用意する
			if (this.context.query.exists(startImplementations, hasOp(TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST, true))) {
				targetEntityStarter.setCycleCounterImplementation(createCycleCounterImplementation(startImplementations, targetEntityStarter.getOwnerPartition()));
			}

			// 開始オフセット調整が必要な場合，調整用カウンタを用意する
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

		if (rteEventToTaskMapping.getRteEvent() instanceof TimingEvent) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
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
		} else if (rteBswEventToTaskMapping.getRteBswEvent() instanceof BswModeSwitchEvent) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
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