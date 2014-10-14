/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_STARTER__START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EVENT_TO_TASK_MAPPING__POSITION_IN_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;

import com.google.common.collect.Iterables;
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
	
		// エクスキュータブル起動処理の構築
		List<EntityStartInteraction> startInteractions = this.context.query.selectByKind(sourceEntityStarter.getStartInteraction(), ENTITY_START_INTERACTION);
		for (EntityStartInteraction sourceStartInteraction : sortedCopyOfEntityStartInteractions(startInteractions)) {
			buildExecutableStartOperation(osTaskActivationOperation, sourceStartInteraction);
		}
		return osTaskActivationOperation;
	}

	public List<OsEventSetActivationOperation> createOsEventSetActivationOperations(List<OsEventSetEntityStarter> sourceEntityStarters, OsTask osTask) throws ModelException {
		// エンティティ起動処理を構築
		List<OsEventSetActivationOperation> operations = Lists.newArrayList();
	
		List<EntityStartInteraction> entityStartInteractions = this.context.query.collect(sourceEntityStarters, ENTITY_STARTER__START_INTERACTION);
		List<EntityStartInteraction> sortedEntityStartInteractions = sortedCopyOfEntityStartInteractions(entityStartInteractions);
	
		// タスク内実行順序によりソート
		for (EntityStartInteraction sourceStartInteraction : sortedEntityStartInteractions) {
			OsEventSetEntityStarter sourceEntityStarter = (OsEventSetEntityStarter) sourceStartInteraction.getStarter();
			operations.add(createOsEventSetActivationOperation(sourceEntityStarter, sourceStartInteraction, osTask));
		}
	
		// 同一のインタラクションから生成されたオペレーションが並んでいる場合，OSイベントの処理を結合
		List<OsEventSetActivationOperation> combinedOperations = Lists.newArrayList(operations.get(0));
		OsEventSetActivationOperation targetOperation = combinedOperations.get(0);
	
		for (OsEventSetActivationOperation operation : operations.subList(1, operations.size())) {
			if (targetOperation.getSingleSource() == operation.getSingleSource()) {
				// 元になったEntityStarterが同一なので，処理を結合
				targetOperation.getExecutableStartOperation().addAll(operation.getExecutableStartOperation());
			} else {
				// 元になったEntityStarterが異なるので，次の結合を開始する
				combinedOperations.add(operation);
				targetOperation = operation;
			}
		}
	
		// カウントアップ処理を構築
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
	
		// エクスキュータブル起動処理の構築
		buildExecutableStartOperation(contextActivationOperation, sourceStartInteraction);
		contextActivationOperation.setActivationOsEventId(sourceEntityStarter.getSourceOsEvent().getShortName());
		return contextActivationOperation;
	}

	private void buildExecutableStartOperation(ContextActivationOperation targetContextActivationOperation, EntityStartInteraction sourceStartInteraction) throws ModelException {
		if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE 常にtrue(現状，ImplementationはTimingTriggeringEntityStartImplementationのみのため)
			TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
	
			targetContextActivationOperation.getExecutableStartOperation().add(createTimingTriggeringExecutableStartOperation(sourceStartInteraction, timingTriggeringEntityStartImplementation));
		}
	}

	private void buildEntityCountupOperation(ContextActivationOperation targetContextActivationOperation, EntityStarter sourceEntityStarter) throws ModelException {
		// 周期調整カウンタ変数の構築
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			targetContextActivationOperation.setCycleCountupOperation(createCycleCountupOperation(sourceEntityStarter.getCycleCounterImplementation()));
		}
	
		// 開始オフセット調整カウンタ変数の構築
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

	private TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation(EntityStartInteraction sourceStartInteraction,
			TimingTriggeringEntityStartImplementation startImplementation) throws ModelException {
		TimingTriggeringExecutableStartOperation startOperation = ModuleFactory.eINSTANCE.createTimingTriggeringExecutableStartOperation();
		buildExecutableStartOperation(startOperation, sourceStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent());
		if (startImplementation.requiresCycleAdjust()) {
			startOperation.setCycleCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getCycleCounterImplementation()));
			startOperation.setCyclePeriodConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, startImplementation, RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME));
			startOperation.setCycleOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, startImplementation, RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME));
		}
		if (startImplementation.requiresStartOffsetAdjust()) {
			startOperation.setStartOffsetCounterVariable(this.context.builtQuery.<GlobalVariable> findDest(GLOBAL_VARIABLE, sourceStartInteraction.getStarter().getStartOffsetCounterImplementation()));
			startOperation.setStartOffsetConstant(this.context.builtQuery.<Constant> findDest(CONSTANT, startImplementation, RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME));
		}
		return startOperation;
	}

	private void buildExecutableStartOperation(ExecutableStartOperation targetOperation, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		ExecutableEntity executableEntity = this.context.builtQuery.findDest(EXECUTABLE_ENTITY, sourceExecutableEntity);

		targetOperation.setStartExecutable(executableEntity);
		for (ExclusiveArea exclusiveArea : sourceExecutableEntity.getRunsInsideExclusiveArea()) {
			targetOperation.getExcludeOperation().add(this.excludeOperationBuilder.createExcludeOperation(exclusiveArea));
		}
	}
}
