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
		if (!isEnabledEntityStartInteraction(sourceStartInteraction)) {
			return;
		}
		if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE 常にtrue(現状，ImplementationはTimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementationのみのため)
			TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createTimingTriggeringExecutableStartOperation(sourceStartInteraction, timingTriggeringEntityStartImplementation));
		} else if (sourceStartInteraction.getImplementation() instanceof ModeSwitchTriggeringEntityStartImplementation) { // COVERAGE 常にtrue(現状，ImplementationはTimingTriggeringEntityStartImplementation,ModeSwitchTriggeringEntityStartImplementationのみのため)
			ModeSwitchTriggeringEntityStartImplementation modeSwitchImplementation = (ModeSwitchTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
			targetContextActivationOperation.getExecutableStartOperation().add(createModeSwitchTriggeringExecutableStartOperation(sourceStartInteraction, modeSwitchImplementation));
		}
	}

	private boolean isEnabledEntityStartInteraction(EntityStartInteraction sourceStartInteraction) {
		if (sourceStartInteraction.getEventToTaskMapping().getEvent().getBswEvent() == null) {
			// RTEイベントの場合
			return true; // 常に有効
		} else {
			// BSWイベントの場合
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
	 * 有効なBSWイベントかを判定する
	 * @param bswEvent　判定対象のBSWイベント
	 * @return 有効なBSWイベントの場合、true。それ以外の場合、false。
	 */
	public boolean isEnabledBswEvent(BswEvent bswEvent) {
		// BSWイベント共通の有効／無効判定
		if (!checksEnabledOfBswEventCommonPart(bswEvent)) {
			return false;
		}

		// 各BSWイベント固有の有効／無効判定
		if (bswEvent instanceof BswModeSwitchEvent) {
			// モード切替イベント
			return checksEnabledOfBswModeSwitchEventSpecificPart((BswModeSwitchEvent) bswEvent);
		} else {
			// その他イベント
			return true; // 固有のチェックなし
		}
	}

	// BSWイベントが有効であるかの判定(モード切替イベント固有の部分のみチェック)
	private boolean checksEnabledOfBswModeSwitchEventSpecificPart(BswModeSwitchEvent bswModeSwitchEvent) {
		// NOTE 現状onEntryのみサポートしているため、onEntry以外(onTransition・onExit)は無効なイベントと判定する
		if (!ModeActivationKind.ON_ENTRY.equals(bswModeSwitchEvent.getActivation())) {
			return false;
		}

		ModeInBswModuleDescriptionInstanceRef onEntryModeIref = bswModeSwitchEvent.getModeIref().get(0);

		// イベントの発火元となるモード宣言グループプロトタイプにアクセスがなければ、無効なイベントと判定
		if (!bswModeSwitchEvent.getStartsOnEvent().getAccessedModeGroup().contains(onEntryModeIref.getContextModeDeclarationGroup())) {
			return false;
		}

		// イベントの発火元となるモードが無効化されていれば、無効なイベントと判定
		for (ModeInBswModuleDescriptionInstanceRef disabledInModeIref : bswModeSwitchEvent.getDisabledInMode()) {
			if (onEntryModeIref.getContextModeDeclarationGroup() == disabledInModeIref.getContextModeDeclarationGroup() && onEntryModeIref.getTargetMode() == disabledInModeIref.getTargetMode()) {
				return false;
			}
		}

		return true;
	}

	// BSWイベントが有効であるかを判定(全BSWイベント共通の部分のみチェック)
	private boolean checksEnabledOfBswEventCommonPart(BswEvent bswEvent) {
		return !isBswEventDisabledByMode(bswEvent);
	}

	// BSWイベントがモード依存無効化制御により無効化されているかを判定
	private boolean isBswEventDisabledByMode(BswEvent bswEvent) {
		// モード依存無効化制御を対象となるモード宣言グループプロトタイプの単位にグループ化
		ListMultimap<ModeDeclarationGroupPrototype, ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefsGroupByContextModeGroup = this.context.query.groupByKey(bswEvent.getDisabledInMode(),
				MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP);

		// 各モード宣言グループプロトタイプについて、BSWイベントがモード依存無効化制御により無効化されているかを判定
		for (ModeDeclarationGroupPrototype disabledInModeContextModeGroup : disabledInModeIrefsGroupByContextModeGroup.keySet()) {
			List<ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefs = disabledInModeIrefsGroupByContextModeGroup.get(disabledInModeContextModeGroup);
			List<ModeDeclaration> disabledInModeTargetModes = this.context.query.collect(disabledInModeIrefs, MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE);

			// 有効な提供側であるか、もしくは、 要求側を参照しているときに、有効な提供側があるかをチェック
			ModeDeclarationGroupPrototype enabledProvidedPrototype = getEnableProvidedModeDeclarationGroupPrototype(disabledInModeContextModeGroup);
			if (enabledProvidedPrototype == null) {
				// 有効な提供側が存在しない場合
				// NOTE 有効な提供側が存在しなければモードが初期モード以外に遷移することはないので、初期モードが無効化されていれば、BSWイベントがモード依存無効化制御により無効化されていると判定する
				if (disabledInModeTargetModes.contains(disabledInModeContextModeGroup.getType().getInitialMode())) {
					return true;
				}
			} else {
				// 有効な提供側が存在する場合
				// モード宣言グループプロトタイプの全モードが無効化されていれば、BSWイベントがモード依存無効化制御により無効化されていると判定する
				if (disabledInModeTargetModes.containsAll(disabledInModeContextModeGroup.getType().getModeDeclaration())) {
					return true;
				}
			}
		}

		return false;
	}

	private ModeDeclarationGroupPrototype getEnableProvidedModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype prototype) {
		// 有効な提供側であれば、それを返す
		Optional<ModeMachineInstance> providedInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, prototype);
		if (providedInstance.isPresent()) {
			return prototype;
		}

		// 要求側の場合、有効な提供側があればそれを返す
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
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			// BSWイベントの起動対象のBSWスケジューラブルのシンボルが生成されていない場合
			return null;
		}

		// 直接関数呼び出し条件チェック
		BswSchedulableEntity schedulableEntity = bswModeSwitchEvent.getStartsOnEvent();
		if (!schedulableEntity.getAccessedModeGroup().contains(modePrototype)) {
			// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			//EntityOperationModelBuilder.isEnabledEventで同様のチェックがかかっている
			return null;
		}
		
		// nrte_sws_0193 によりcallerとcalleeのcontextはTASKなので、contextによる起動チェック不要
		
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
				// 0:1連携(提供側のモードマシンインスタンスが不要なケースを含む)の場合はここに来る。事前(isEnabledEvent())に必要と判定されているため、disabled判定は不要
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
	
	private void buildExecutableStartOperation(ExecutableStartOperation targetOperation, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity sourceExecutableEntity) throws ModelException {
		ExecutableEntity executableEntity = this.context.builtQuery.findDest(EXECUTABLE_ENTITY, sourceExecutableEntity);

		targetOperation.setStartExecutable(executableEntity);
		for (ExclusiveArea exclusiveArea : sourceExecutableEntity.getRunsInsideExclusiveArea()) {
			targetOperation.getExcludeOperation().add(this.excludeOperationBuilder.createExcludeOperation(exclusiveArea));
		}
	}
}
