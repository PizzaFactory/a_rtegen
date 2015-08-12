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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION_COLLECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ROOT_SW_COMPOSITION_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSW_SCHEDULABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSW_SCHEDULABLE_ENTITY_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_CALLBACK_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FILE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION_MACRO_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IMMEDIATE_PROXY_COM_SEND_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MACRO;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PERIODIC_PROXY_COM_SEND_OPERATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PROXY_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PROXY_API_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_LIFECYCLE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_LIFECYCLE_API_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_API_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_LIFECYCLE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_LIFECYCLE_API_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SIGNAL_API_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TASK_BODY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TASK_BODY_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TRUSTED_FUNCTION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;

import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.FileNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacroGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyFunctionTableGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBswApiHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup;

import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Optional;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;

public class RteFileModelBuilder {

	private final ModuleModelBuildContext context;
	private ModuleModelSorter moduleModelSorter;

	public RteFileModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.moduleModelSorter = new ModuleModelSorter(context);
	}

	public void buildRoot() {
		// RTEモジュールの生成
		this.context.cache.rteModule = ModuleFactory.eINSTANCE.createRteModule();
		this.context.cache.moduleRoot.setRteModule(this.context.cache.rteModule);
	}

	public void buildApiFiles() {
		RteModule targetRteModule = this.context.cache.rteModule;

		// RTEヘッダの構築
		RteHeader rteHeader = createRteHeader();
		targetRteModule.setRteHeader(rteHeader);

		// COMヘッダの構築
		Optional<Com> com = this.context.query.tryFindSingleByKind(COM);
		if (com.isPresent()) {
			BlackboxHeader header = createComHeader(com.get());
			targetRteModule.getDependentHeader().add(header);
			this.context.cache.comHeader = Optional.of(header);
		} else {
			this.context.cache.comHeader = Optional.absent();
		}

		// RTEタイプヘッダの構築
		RteTypeHeader rteTypeHeader = createRteTypeHeader(this.context.cache.rte);
		targetRteModule.setRteTypeHeader(rteTypeHeader);

		// アプリケーションヘッダファイル，およびアプリケーションタイプヘッダファイルの構築
		buildApplicationHeaders(targetRteModule);
		
		// BSWスケジューラのモジュール連結ヘッダファイル、およびモジュール連結タイプヘッダファイルの構築
		Optional<BswImplementation> bswImplementation = this.context.query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		if (bswImplementation.isPresent()) {
			buildModuleInterlinkHeaders(targetRteModule);
		}
	}

	private BlackboxHeader createComHeader(Com sourceCom) {
		BlackboxHeader comHeader = ModuleFactory.eINSTANCE.createBlackboxHeader();
		comHeader.setSingleSource(sourceCom);
		comHeader.setFileName(FileNames.COM_HEADER_NAME);
		return comHeader;
	}
	private BlackboxHeader createIocHeader() {
		BlackboxHeader iocHeader = ModuleFactory.eINSTANCE.createBlackboxHeader();
		iocHeader.setFileName(FileNames.IOC_HEADER_NAME);
		return iocHeader;
	}

	private RteHeader createRteHeader() {
		RteHeader rteHeader = ModuleFactory.eINSTANCE.createRteHeader();
		rteHeader.setFileName(FileNames.RTE_HEADER_NAME);
		rteHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME);
		return rteHeader;
	}

	private RteBswApiHeader createRteBswApiHeader() {
		RteBswApiHeader rteHeader = ModuleFactory.eINSTANCE.createRteBswApiHeader();
		Rte sourceRte = this.context.cache.rte;
		rteHeader.setFileName(FileNames.RTE_BSW_API_HEADER_NAME);
		rteHeader.setGuardName(FileNames.RTE_BSW_API_HEADER_GUARD_NAME);
		List<IocApi> iocapis = this.context.query.<IocApi>findByKind(sourceRte, IOC_API);
		rteHeader.getIocApi().addAll(iocapis);
		return rteHeader;
	}

	private RteTypeHeader createRteTypeHeader(Rte sourceRte) {
		RteTypeHeader rteTypeHeader = ModuleFactory.eINSTANCE.createRteTypeHeader();
		rteTypeHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Type" + FileNames.H_POSTFIX);
		rteTypeHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "TYPE" + FileNames.HEADER_GUARD_POSTFIX);
		if (this.context.cache.comHeader.isPresent()) {
			rteTypeHeader.getDependentHeaders().add(this.context.cache.comHeader.get());
		}
		rteTypeHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteHeader());
		rteTypeHeader.getRteType().addAll(sourceRte.getRteType());
		rteTypeHeader.getRteTypeConstant().addAll(sourceRte.getRteTypeConstant());
		rteTypeHeader.setProvidesSignalGroupTransmission(this.context.cache.comHeader.isPresent());
		return rteTypeHeader;
	}

	private void buildApplicationHeaders(RteModule targetRteModule) {
		for (Swc swc : this.context.query.<Swc> findByKind(SWC)) {
			RteApplicationTypeHeader applicationTypeHeader = createRteApplicationTypeHeader(swc, this.context.cache.rteModule.getRteTypeHeader());
			targetRteModule.getRteApplicationTypeHeader().add(applicationTypeHeader);

			RteApplicationHeader applicationHeader = createRteApplicationHeader(swc, applicationTypeHeader);
			targetRteModule.getRteApplicationHeader().add(applicationHeader);
		}
	}

	private RteApplicationTypeHeader createRteApplicationTypeHeader(Swc sourceSwc, RteTypeHeader rteTypeHeader) {
		RteApplicationTypeHeader applicationTypeHeader = ModuleFactory.eINSTANCE.createRteApplicationTypeHeader();
		applicationTypeHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + "_Type" + FileNames.H_POSTFIX);
		applicationTypeHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + "_Type" + FileNames.HEADER_GUARD_POSTFIX);
		applicationTypeHeader.getDependentHeaders().add(rteTypeHeader);
		applicationTypeHeader.getConstant().addAll(sourceSwc.getApiEnumConstant());
		applicationTypeHeader.getConstant().addAll(sourceSwc.getApiUpperLowerLimitConstant());
		return applicationTypeHeader;
	}

	private boolean hasInlineApi(RteApplicationHeader applicationHeader) {
		for (RteApiGroup group : applicationHeader.getDeclarationsRteApiGroup()) {
			for (RteApi api : group.getRteApi()) {
				if (api.getIsInline()) {
					return true;
				}
			}
		}
		return false;
	}
	
	private RteApplicationHeader createRteApplicationHeader(Swc sourceSwc, RteApplicationTypeHeader applicationTypeHeader) {
		RteApplicationHeader applicationHeader = ModuleFactory.eINSTANCE.createRteApplicationHeader();
		applicationHeader.setSingleSource(sourceSwc);
		applicationHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + FileNames.H_POSTFIX);
		applicationHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + FileNames.HEADER_GUARD_POSTFIX);
		applicationHeader.getDependentHeaders().add(applicationTypeHeader);
		applicationHeader.getConstant().addAll(sourceSwc.getApiInitValueConstant());
		applicationHeader.getConstant().addAll(sourceSwc.getApiApplicationErrorConstant());
		applicationHeader.getRteApiGroup().addAll(this.<RteApiGroup> groupFunctionsByMemoryMapping(RTE_API_GROUP, sourceSwc.getRteApi()));
		setDeclarationsRteApiGroup(this.<RteApiGroup> groupFunctionsByMemoryMapping(RTE_API_GROUP, sourceSwc.getRteApi()), applicationHeader.getDeclarationsRteApiGroup());
		applicationHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_GROUP, sourceSwc.getDependentExecutableEntity()));
		applicationHeader.setHasInlineApi(hasInlineApi(applicationHeader));
		if (applicationHeader.getHasInlineApi()) {
			// Partition種別によるマクロを設定する(TOPPERS_TRUSTED等)
			applicationHeader.getSourceMacro().addAll(this.context.query.<Macro> findByKind(sourceSwc.getParent(), MACRO));
			
			// Os.hは、hasInlineApiがtrueのときに、mtlで直接includeする
			applicationHeader.getDependentHeaders().add(getAndPrepareRteUtilityHeader());
			applicationHeader.getDependentHeaders().add(getAndPrepareRteBswApiHeader());

			applicationHeader.getConstant().addAll(sourceSwc.getInlineConstant());
			applicationHeader.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(sourceSwc.getInlineGlobalVariables()));
			applicationHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_GROUP, sourceSwc.getInlineExecutableEntity()));
		}
		return applicationHeader;
	}

	private void setDeclarationsRteApiGroup(List<RteApiGroup> rteApiGroup, List<RteApiGroup> declarationsGroup) {
		for (int i = 0; i < rteApiGroup.size(); i++) {
			RteApiGroup apiGroup = rteApiGroup.get(i);
			if (isNeededGroup(apiGroup)) {
				declarationsGroup.add(apiGroup);
			}
		}
	}

	private void setDeclarationsSchmApiGroup(List<SchmApiGroup> schmApiGroup, List<SchmApiGroup> declarationsGroup) {
		for (int i = 0; i < schmApiGroup.size(); i++) {
			SchmApiGroup apiGroup = schmApiGroup.get(i);
			if (isNeededGroup(apiGroup)) {
				declarationsGroup.add(apiGroup);
			}
		}
	}
	
	private boolean isNeededGroup(RteApiGroup apiGroup) {
		for (RteApi api : apiGroup.getRteApi()) {
			if (api instanceof RteEnterApi && !((RteEnterApi)api).getIsNoneExclude()) {
				return true;
			} else if (api instanceof RteExitApi && !((RteExitApi)api).getIsNoneExclude()) {
				return true;
			} else if (!(api instanceof RteEnterApi) && !(api instanceof RteExitApi)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isNeededGroup(SchmApiGroup schmGroup) {
		for (SchmApi api : schmGroup.getSchmApi()) {
			if (api instanceof SchmEnterApi && !((SchmEnterApi)api).getIsNoneExclude()) {
				return true;
			} else if (api instanceof SchmExitApi && !((SchmExitApi)api).getIsNoneExclude()) {
				return true;
			} else if (api instanceof SchmModeApi && !((SchmModeApi)api).getIsNoneExclude()) {
				return true;
			} else if (api instanceof SchmSwitchApi && !((SchmSwitchApi)api).getIsNoneExclude()) {
				return true;
			}
		}
		return false;
	}

	private void buildModuleInterlinkHeaders(RteModule targetRteModule) {
		for (Bswm bswm : this.context.query.<Bswm> findByKind(BSWM)) {
			ModuleInterlinkTypeHeader moduleInterlinkTypeHeader = createModuleInterlinkTypeHeader(bswm, this.context.cache.rteModule.getRteTypeHeader());
			targetRteModule.getModuleInterlinkTypeHeader().add(moduleInterlinkTypeHeader);
			ModuleInterlinkHeader moduleInterlinkHeader = createModuleInterlinkHeader(bswm, moduleInterlinkTypeHeader);
			moduleInterlinkHeader.setSingleSource(bswm);
			targetRteModule.getModuleInterlinkHeader().add(moduleInterlinkHeader);
		}
	}

	private ModuleInterlinkTypeHeader createModuleInterlinkTypeHeader (Bswm sourceBswm, RteTypeHeader rteTypeHeader) {
		ModuleInterlinkTypeHeader moduleInterlinkTypeHeader = ModuleFactory.eINSTANCE.createModuleInterlinkTypeHeader();
		moduleInterlinkTypeHeader.setFileName(FileNames.SCHM_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + "_Type" + FileNames.H_POSTFIX);
		moduleInterlinkTypeHeader.setGuardName(FileNames.SCHM_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + "_Type" + FileNames.HEADER_GUARD_POSTFIX);
		moduleInterlinkTypeHeader.getDependentHeaders().add(rteTypeHeader);
		// モード連携
		moduleInterlinkTypeHeader.getModeType().addAll(sourceBswm.getModeType());
		moduleInterlinkTypeHeader.getModeRequestVariable().addAll(sourceBswm.getModeRequestVariable());
		return moduleInterlinkTypeHeader;
	}

	private ModuleInterlinkHeader createModuleInterlinkHeader(Bswm sourceBswm, ModuleInterlinkTypeHeader moduleInterlinkTypeHeader) {
		ModuleInterlinkHeader moduleInterlinkHeader = ModuleFactory.eINSTANCE.createModuleInterlinkHeader();
		moduleInterlinkHeader.setSingleSource(sourceBswm);
		moduleInterlinkHeader.setFileName(FileNames.SCHM_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + FileNames.H_POSTFIX);
		moduleInterlinkHeader.setGuardName(FileNames.SCHM_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + FileNames.HEADER_GUARD_POSTFIX);
		moduleInterlinkHeader.getDependentHeaders().add(moduleInterlinkTypeHeader);

		List<SchmApi> schmApis = Lists.newArrayList();
		for (PartedBswm partedBswm : sourceBswm.getPartedBswm()) {
			schmApis.addAll(partedBswm.getSchmApi());
		}
		moduleInterlinkHeader.getSchmApiGroup().addAll(this.<SchmApiGroup> groupFunctionsByMemoryMapping(SCHM_API_GROUP, schmApis));

		List<ExecutableEntity> entities = Lists.newArrayList();
		for (PartedBswm partedBswm : sourceBswm.getPartedBswm()) {
			for (ExecutableEntity entity : partedBswm.getDependentExecutableEntity()) {
				if (entity.getSingleSource() instanceof jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				entities.add(entity);
			}
		}
		moduleInterlinkHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_GROUP, entities));
		return moduleInterlinkHeader;
	}

	public void buildImplFiles() throws ModelException {
		RteModule targetRteModule = this.context.cache.rteModule;
		Rte sourceRte = this.context.cache.rte;

		// ライフサイクルヘッダの生成
		RteLifecycleHeader rteLifecycleHeader = createRteLifecycleHeader(sourceRte);
		targetRteModule.setRteLifecycleHeader(rteLifecycleHeader);

		// RTEコンフィギュレーションヘッダファイルの生成
		RteConfigurationHeader rteConfigurationHeader = createRteConfigurationHeader();
		if (this.context.options.suppressConfigHeader) {
			targetRteModule.getDependentHeader().add(rteConfigurationHeader);
		} else {
			targetRteModule.setRteConfigurationHeader(rteConfigurationHeader);
		}

		// VFBトレースヘッダの生成
		RteVfbTraceHeader rteVfbTraceHeader = createRteVfbTraceHeader(rteConfigurationHeader);
		targetRteModule.setRteVfbTraceHeader(rteVfbTraceHeader);

		// RTEコールバックヘッダの生成
		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = this.context.query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		if (rootSwCompositionPrototype.isPresent()) {
			RteCallbackHeader rteCallbackHeader = createRteCallbackHeader(sourceRte);
			targetRteModule.setRteCallbackHeader(rteCallbackHeader);
		}

		// RTEユーティリティヘッダの生成
		getAndPrepareRteUtilityHeader();

		// RTE BSW APIヘッダの構築
		getAndPrepareRteBswApiHeader();

		// RTEソースファイルの生成
		if (isEcucPartitionCollectionExists()) {
			// パーティション構成の場合
			buildPartitionedSystemRteSources(targetRteModule, sourceRte);
		} else {
			// 非パーティション構成の場合
			buildNonPartitionedSystemRteSource(targetRteModule, sourceRte);
		}
	}

	private RteUtilityHeader getAndPrepareRteUtilityHeader() {
		RteModule targetRteModule = this.context.cache.rteModule;
		Rte sourceRte = this.context.cache.rte;
		if (targetRteModule.getRteUtilityHeader() == null) {
			targetRteModule.setRteUtilityHeader(createRteUtilityHeader(sourceRte));
		}
		return targetRteModule.getRteUtilityHeader();
	}

	private RteBswApiHeader getAndPrepareRteBswApiHeader() {
		RteModule targetRteModule = this.context.cache.rteModule;
		if (targetRteModule.getRteBswApiHeader() == null) {
			targetRteModule.setRteBswApiHeader(createRteBswApiHeader());
		}
		return targetRteModule.getRteBswApiHeader();
	}

	private RteUtilityHeader createRteUtilityHeader(Rte sourceRte) {
		RteUtilityHeader rteUtilityHeader = ModuleFactory.eINSTANCE.createRteUtilityHeader();
		rteUtilityHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Util" + FileNames.H_POSTFIX);
		rteUtilityHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "UTIL" + FileNames.HEADER_GUARD_POSTFIX);
		rteUtilityHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteTypeHeader());
		return rteUtilityHeader;
	}

	private RteLifecycleHeader createRteLifecycleHeader(Rte sourceRte) {
		RteLifecycleHeader rteLifecycleHeader = ModuleFactory.eINSTANCE.createRteLifecycleHeader();
		rteLifecycleHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Main" + FileNames.H_POSTFIX);
		rteLifecycleHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "MAIN" + FileNames.HEADER_GUARD_POSTFIX);
		rteLifecycleHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteHeader());
		rteLifecycleHeader.getRteLifecycleApiGroup().addAll(this.<RteLifecycleApiGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_GROUP, this.context.query.<RteLifecycleApi> findByKind(sourceRte, RTE_LIFECYCLE_API)));
		rteLifecycleHeader.getSchmLifecycleApiGroup().addAll(this.<SchmLifecycleApiGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_GROUP, this.context.query.<SchmLifecycleApi> findByKind(sourceRte, SCHM_LIFECYCLE_API)));
		return rteLifecycleHeader;
	}

	private RteConfigurationHeader createRteConfigurationHeader() {
		RteConfigurationHeader rteConfigurationHeader = ModuleFactory.eINSTANCE.createRteConfigurationHeader();
		rteConfigurationHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Cfg" + FileNames.H_POSTFIX);
		rteConfigurationHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "CFG" + FileNames.HEADER_GUARD_POSTFIX);
		return rteConfigurationHeader;
	}

	private RteVfbTraceHeader createRteVfbTraceHeader(RteConfigurationHeader rteConfigurationHeader) {
		RteVfbTraceHeader rteVfbTraceHeader = ModuleFactory.eINSTANCE.createRteVfbTraceHeader();
		rteVfbTraceHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Hook" + FileNames.H_POSTFIX);
		rteVfbTraceHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "HOOK" + FileNames.HEADER_GUARD_POSTFIX);
		rteVfbTraceHeader.getDependentHeaders().add(rteConfigurationHeader);
		rteVfbTraceHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteTypeHeader());
		return rteVfbTraceHeader;
	}

	private RteCallbackHeader createRteCallbackHeader(Rte sourceRte) {
		RteCallbackHeader rteCallbackHeader = ModuleFactory.eINSTANCE.createRteCallbackHeader();
		rteCallbackHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Cbk" + FileNames.H_POSTFIX);
		rteCallbackHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "CBK" + FileNames.HEADER_GUARD_POSTFIX);
		rteCallbackHeader.getComCallbackGroup().addAll(this.<ComCallbackGroup> groupFunctionsByMemoryMapping(COM_CALLBACK_GROUP, sourceRte.getComCallback()));
		return rteCallbackHeader;
	}

	private void buildNonPartitionedSystemRteSource(RteModule targetRteModule, Rte sourceRte) {
		RteInternalHeader rteCommonHeader = createSystemCommonRteHeader(sourceRte);
		targetRteModule.setRteCommonHeader(rteCommonHeader);
		targetRteModule.setRteCommonSource(createNonPartitionedSystemRteSource(targetRteModule, sourceRte, rteCommonHeader));
	}

	private RteInternalHeader createSystemCommonRteHeader(Rte sourceRte) {
		RteInternalHeader rteInternalHeader = ModuleFactory.eINSTANCE.createRteInternalHeader();
		rteInternalHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Common" + FileNames.H_POSTFIX);
		rteInternalHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "COMMON" + FileNames.HEADER_GUARD_POSTFIX);
		if (this.context.cache.comHeader.isPresent()) {
			rteInternalHeader.getDependentHeaders().add(this.context.cache.comHeader.get());
		}
		rteInternalHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteTypeHeader());
		rteInternalHeader.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getGlobalVariablesDefinedInRteSource(sourceRte)));
		rteInternalHeader.getConstant().addAll(getConstantsDefinedInRteSource(sourceRte));

		if (!isEcucPartitionCollectionExists()) {
			rteInternalHeader.getTrustedFunctionGroup().addAll(this.<TrustedFunctionGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_GROUP, this.context.query.<TrustedFunction> findByKind(sourceRte, TRUSTED_FUNCTION)));
			rteInternalHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_GROUP, this.context.query.<ExecutableEntity> findByKind(sourceRte, EXECUTABLE_ENTITY)));
		}

		rteInternalHeader.getFunctionMacroGroup().addAll(getFunctionMacroDefinedInRteSource(sourceRte));
		rteInternalHeader.getSignalApiGroup().addAll(this.<SignalApiGroup> groupFunctionsByMemoryMapping(SIGNAL_API_GROUP, this.context.query.<SignalApi> findByKind(SIGNAL_API)));

		// モード連携
		createModeCommonHeader(sourceRte, rteInternalHeader);
		
		return rteInternalHeader;
	}

	private boolean isEcucPartitionCollectionExists() {
		Optional<EcucPartitionCollection> foundPartitionCollection = this.context.query.tryFindSingleByKind(ECUC_PARTITION_COLLECTION);
		return foundPartitionCollection.isPresent();
	}

	private RteSource createNonPartitionedSystemRteSource(RteModule targetRteModule, Rte sourceRte, RteInternalHeader rteCommonHeader) {
		RteSource rteSource = ModuleFactory.eINSTANCE.createRteSource();
		rteSource.setFileName(FileNames.RTE_SOURCE_NAME);
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteVfbTraceHeader());
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteUtilityHeader());
		rteSource.getDependentHeaders().add(rteCommonHeader);
		
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteLifecycleHeader());
		if (this.context.cache.rteModule.getRteCallbackHeader() != null) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteCallbackHeader());
		}

		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteBswApiHeader());
		
		rteSource.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getGlobalVariablesDefinedInRteSource(sourceRte)));
		rteSource.getBswSchedulableEntityGroup().addAll(
				this.<BswSchedulableEntityGroup> groupFunctionsByMemoryMapping(BSW_SCHEDULABLE_ENTITY_GROUP, this.context.query.<BswSchedulableEntity> findByKind(sourceRte, BSW_SCHEDULABLE_ENTITY)));
		setDeclarationsRteApiGroup(this.<RteApiGroup> groupFunctionsByMemoryMapping(RTE_API_GROUP, this.context.query.<RteApi> findByKind(sourceRte, RTE_API)), rteSource.getRteApiGroup());
		rteSource.getRteLifecycleApiGroup().addAll(
				this.<RteLifecycleApiGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_GROUP, this.context.query.<RteLifecycleApi> findByKind(sourceRte, RTE_LIFECYCLE_API)));
		setDeclarationsSchmApiGroup(this.<SchmApiGroup> groupFunctionsByMemoryMapping(SCHM_API_GROUP, this.context.query.<SchmApi> findByKind(sourceRte, SCHM_API)), rteSource.getSchmApiGroup());
		rteSource.getSchmLifecycleApiGroup().addAll(
				this.<SchmLifecycleApiGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_GROUP, this.context.query.<SchmLifecycleApi> findByKind(sourceRte, SCHM_LIFECYCLE_API)));
		rteSource.getTaskBodyGroup().addAll(this.<TaskBodyGroup> groupFunctionsByMemoryMapping(TASK_BODY_GROUP, this.context.query.<TaskBody> findByKind(sourceRte, TASK_BODY)));
		rteSource.getComCallbackGroup().addAll(this.<ComCallbackGroup> groupFunctionsByMemoryMapping(COM_CALLBACK_GROUP, sourceRte.getComCallback()));
		rteSource.getTrustedFunctionGroup().addAll(
				this.<TrustedFunctionGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_GROUP, this.context.query.<TrustedFunction> findByKind(sourceRte, TRUSTED_FUNCTION)));
		rteSource.getSignalApiGroup().addAll(
				this.<SignalApiGroup> groupFunctionsByMemoryMapping(SIGNAL_API_GROUP, this.context.query.<SignalApi> findByKind(sourceRte, SIGNAL_API)));
		rteSource.getProxyApiGroup().addAll(
				this.<ProxyApiGroup> groupFunctionsByMemoryMapping(PROXY_API_GROUP, this.context.query.<ProxyApi> findByKind(sourceRte, PROXY_API)));
		
		return rteSource;
	}

	private void buildPartitionedSystemRteSources(RteModule targetRteModule, Rte sourceRte) throws ModelException {
		// 共通のRTEソースファイルの生成
		RteInternalHeader commonRteHeader = createSystemCommonRteHeader(sourceRte);
		targetRteModule.setRteCommonHeader(commonRteHeader);
		targetRteModule.setRteCommonSource(createPartitionedSystemCommonRteSource(sourceRte, commonRteHeader));

		// CommonにProxyFunctionTableGroup設定
		Optional<PeriodicProxyComSendOperation> periodicProxyComSendOperation = this.context.query.tryFindSingleByKind(PERIODIC_PROXY_COM_SEND_OPERATION);
		Optional<ImmediateProxyComSendOperation> immediateProxyComSendOperation = this.context.query.tryFindSingleByKind(IMMEDIATE_PROXY_COM_SEND_OPERATION);
		if (periodicProxyComSendOperation.isPresent() || immediateProxyComSendOperation.isPresent()) {
			ProxyFunctionTableGroup proxyFunctionTableGroup = getProxyFunctionTableGroup();
			if (proxyFunctionTableGroup != null) {
				commonRteHeader.getProxyFunctionTableGroup().add(proxyFunctionTableGroup);
			}
		}
		
		if (sourceRte.getDependentIocCommunication().isEmpty()) {
			this.context.cache.iocHeader = Optional.absent();
		} else {
			BlackboxHeader header = createIocHeader();
			this.context.cache.iocHeader = Optional.of(header);
			targetRteModule.getDependentHeader().add(header);
		}

		// パーティション毎のRTEソースファイルの生成
		for (Core sourceCore : sourceRte.getCore()) {
			for (Partition sourcePartition : sourceCore.getPartition()) {
				RteInternalHeader partitionRteHeader = createPartitionRteHeader(sourcePartition, sourceRte, commonRteHeader);
				targetRteModule.getRtePartitionHeader().add(partitionRteHeader);
				targetRteModule.getRtePartitionSource().add(createPartitionRteSource(targetRteModule, sourcePartition, sourceRte, partitionRteHeader));
			}
		}
		
		// 共通のRTEソースファイルからコア毎のヘッダファイルを参照させる
		targetRteModule.getRteCommonSource().getDependentHeaders().addAll(targetRteModule.getRtePartitionHeader());
	}

	private void createModeCommonHeader(Rte sourceRte, RteInternalHeader commonRteHeader) {
		for (Bswm bswm : sourceRte.getBswm()) {
			commonRteHeader.getModeType().addAll(bswm.getModeType());
			commonRteHeader.getModeRequestVariable().addAll(bswm.getModeRequestVariable());

			for (PartedBswm partedBswm : bswm.getPartedBswm()) {
				commonRteHeader.getModeMachineInstance().addAll(partedBswm.getModeMachineInstance());
			}
		}
	}

	private ProxyFunctionTableGroup getProxyFunctionTableGroup() throws ModelException {
		Optional<GlobalVariable> functionTable = this.context.query.tryFindSingle(isKindOf(GLOBAL_VARIABLE).AND(hasAttr(VARIABLE__SYMBOL_NAME, SymbolNames.createFunctionTableName())));
		if (functionTable.isPresent()) {
			ProxyFunctionTableGroup proxyFunctionTableGroup = ModuleFactory.eINSTANCE.createProxyFunctionTableGroup();
			for (ConstantMember member : functionTable.get().getInitValueConstant().getMember()) {
				// 先頭の'&'を削除して登録する
				proxyFunctionTableGroup.getSrWriteProxyName().add(member.getValue().substring(1));
			}
			return proxyFunctionTableGroup;
		}
		return null;
	}

	private RteSource createPartitionedSystemCommonRteSource(Rte sourceRte, RteInternalHeader commonRteHeader) {
		RteSource rteSource = ModuleFactory.eINSTANCE.createRteSource();
		rteSource.setFileName(FileNames.RTE_SOURCE_NAME);
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteVfbTraceHeader());
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteUtilityHeader());
		rteSource.getDependentHeaders().add(commonRteHeader);

		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteLifecycleHeader());

		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteBswApiHeader());

		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = this.context.query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		if (rootSwCompositionPrototype.isPresent()) {
			rteSource.getRteLifecycleApiGroup().addAll(
					this.<RteLifecycleApiGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_GROUP, Lists.newArrayList(sourceRte.getRteStartApi(), sourceRte.getRteStopApi())));
		}

		Optional<BswImplementation> bswImplementation = this.context.query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		if (bswImplementation.isPresent()) {
		rteSource.getSchmLifecycleApiGroup().addAll(
				this.<SchmLifecycleApiGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_GROUP, Lists.newArrayList(sourceRte.getSchmInitApi(), sourceRte.getSchmDeinitApi())));
		}

		return rteSource;
	}

	private RteInternalHeader createPartitionRteHeader(Partition sourcePartition, Rte sourceRte, RteInternalHeader commonRteHeader) throws ModelException {
		List<TrustedFunction> trustedFunctions = Lists.newArrayList();
		List<BswSchedulableEntity> bswSchedulableEntities = Lists.newArrayList();

		trustedFunctions.addAll(this.context.query.<TrustedFunction> findByKind(sourcePartition, TRUSTED_FUNCTION));
		if (sourcePartition.getParent().getIsMasterCore() && sourcePartition.getIsBswPartition()) {
			trustedFunctions.addAll(sourceRte.getComSendSignalTrustedFunction());
			bswSchedulableEntities.addAll(this.context.query.<BswSchedulableEntity> findByKind(sourceRte, BSW_SCHEDULABLE_ENTITY));
		}

		RteInternalHeader rteInternalHeader = ModuleFactory.eINSTANCE.createRteInternalHeader();
		rteInternalHeader.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Partition_" + sourcePartition.getCompartmentName() + FileNames.H_POSTFIX);
		rteInternalHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME_PREFIX + "PARTITION_" + sourcePartition.getCompartmentName() + FileNames.HEADER_GUARD_POSTFIX);
		if (this.context.cache.comHeader.isPresent()) {
			rteInternalHeader.getDependentHeaders().add(this.context.cache.comHeader.get());
		}
		if (this.context.cache.iocHeader.isPresent()) {
			rteInternalHeader.getDependentHeaders().add(this.context.cache.iocHeader.get());
		}
		rteInternalHeader.getDependentHeaders().add(commonRteHeader);
		rteInternalHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteUtilityHeader());
		if (sourcePartition.getIsBswPartition()) {
			if (sourcePartition.getParent().getRteStartApi() != null) {
				rteInternalHeader.setRteCoreStartApiImpl(sourcePartition.getParent().getRteStartApi());
			}
			if (sourcePartition.getParent().getSchmInitApi() != null) {
				rteInternalHeader.setSchmCoreInitApiImpl(sourcePartition.getParent().getSchmInitApi());
			}
		}
		
		rteInternalHeader.getTrustedFunctionGroup().addAll(this.<TrustedFunctionGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_GROUP, trustedFunctions));
		rteInternalHeader.getBswSchedulableEntityGroup().addAll(this.<BswSchedulableEntityGroup> groupFunctionsByMemoryMapping(BSW_SCHEDULABLE_ENTITY_GROUP, bswSchedulableEntities));
		rteInternalHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_GROUP, this.context.query.<ExecutableEntity> findByKind(sourcePartition, EXECUTABLE_ENTITY)));
		return rteInternalHeader;
	}

	private RteSource createPartitionRteSource(RteModule targetRteModule, Partition sourcePartition, Rte sourceRte, RteInternalHeader coreRteHeader) {
		List<RteLifecycleApi> rteLifecycleApis = Lists.newArrayList();
		rteLifecycleApis.addAll(this.context.query.<RteLifecycleApi> findByKind(sourcePartition, RTE_LIFECYCLE_API));
		List<SchmLifecycleApi> schmLifecycleApis = Lists.newArrayList();
		schmLifecycleApis.addAll(this.context.query.<SchmLifecycleApi> findByKind(sourcePartition, SCHM_LIFECYCLE_API));
		
		if (sourcePartition.getIsBswPartition()) {
			if (sourcePartition.getParent().getRteStartApi() != null) {
				rteLifecycleApis.add(sourcePartition.getParent().getRteStartApi());
			}
			if (sourcePartition.getParent().getSchmInitApi() != null) {
				schmLifecycleApis.add(sourcePartition.getParent().getSchmInitApi());
			}
		}
		
		RteSource rteSource = ModuleFactory.eINSTANCE.createRteSource();
		rteSource.setFileName(FileNames.RTE_FILE_NAME_PREFIX + "Partition_" + sourcePartition.getCompartmentName() + FileNames.C_POSTFIX);
		rteSource.getSourceMacro().addAll(this.context.query.<Macro> findByKind(sourcePartition, MACRO));
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteVfbTraceHeader());
		rteSource.getDependentHeaders().add(coreRteHeader);
		
		if (this.context.cache.rteModule.getRteCallbackHeader() != null) {
			rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteCallbackHeader());
		}
		rteSource.getDependentHeaders().add(this.context.cache.rteModule.getRteBswApiHeader());
		
		rteSource.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getGlobalVariablesDefinedInRteSource(sourcePartition)));
		setDeclarationsRteApiGroup(this.<RteApiGroup> groupFunctionsByMemoryMapping(RTE_API_GROUP, this.context.query.<RteApi> findByKind(sourcePartition, RTE_API)), rteSource.getRteApiGroup());
		rteSource.getRteLifecycleApiGroup().addAll(this.<RteLifecycleApiGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_GROUP, rteLifecycleApis));
		setDeclarationsSchmApiGroup(this.<SchmApiGroup> groupFunctionsByMemoryMapping(SCHM_API_GROUP, this.context.query.<SchmApi> findByKind(sourcePartition, SCHM_API)), rteSource.getSchmApiGroup());
		rteSource.getSchmLifecycleApiGroup().addAll(this.<SchmLifecycleApiGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_GROUP, schmLifecycleApis));
		rteSource.getSignalApiGroup().addAll(this.<SignalApiGroup> groupFunctionsByMemoryMapping(SIGNAL_API_GROUP, this.context.query.<SignalApi> findByKind(sourcePartition, SIGNAL_API)));
		rteSource.getProxyApiGroup().addAll(this.<ProxyApiGroup> groupFunctionsByMemoryMapping(PROXY_API_GROUP, this.context.query.<ProxyApi> findByKind(sourcePartition, PROXY_API)));
		rteSource.getTaskBodyGroup().addAll(this.<TaskBodyGroup> groupFunctionsByMemoryMapping(TASK_BODY_GROUP, this.context.query.<TaskBody> findByKind(sourcePartition, TASK_BODY)));
		rteSource.getTrustedFunctionGroup().addAll(this.<TrustedFunctionGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_GROUP, this.context.query.<TrustedFunction> findByKind(sourcePartition, TRUSTED_FUNCTION)));

		if (sourcePartition.getParent().getIsMasterCore() && sourcePartition.getIsBswPartition()) {
			rteSource.getBswSchedulableEntityGroup().addAll(
					this.<BswSchedulableEntityGroup> groupFunctionsByMemoryMapping(BSW_SCHEDULABLE_ENTITY_GROUP,
							this.context.query.<BswSchedulableEntity> findByKind(sourceRte, BSW_SCHEDULABLE_ENTITY)));
			rteSource.getComCallbackGroup().addAll(this.<ComCallbackGroup> groupFunctionsByMemoryMapping(COM_CALLBACK_GROUP, sourceRte.getComCallback()));
			rteSource.getTrustedFunctionGroup().addAll(this.<TrustedFunctionGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_GROUP, sourceRte.getComSendSignalTrustedFunction()));
			if (sourceRte.getComSendSignalImmediateTaskBody() != null) {
				rteSource.getTaskBodyGroup().addAll(this.<TaskBodyGroup> groupFunctionsByMemoryMapping(TASK_BODY_GROUP, sourceRte.getComSendSignalImmediateTaskBody()));
			}
		}
		return rteSource;
	}
	
	private List<Constant> getConstantsDefinedInRteSource(Rte sourceRte) {
		List<Constant> constants = Lists.newArrayList();
		constants.addAll(sourceRte.getIocInitValueConstant());

		for (Partition sourcePartition : this.context.query.<Partition> findByKind(sourceRte, PARTITION)) {
			constants.addAll(sourcePartition.getEntityStartConstant());
			constants.addAll(sourcePartition.getRteBufferInitValueConstant());
			constants.addAll(sourcePartition.getFilterConstant());
		}

		for (Swc sourceSwc : this.context.query.<Swc> findByKind(sourceRte, SWC)) {
			constants.addAll(sourceSwc.getFilterConstant());
			constants.addAll(sourceSwc.getImplInitValueConstant());
			constants.addAll(sourceSwc.getInvalidValueConstant());
			constants.addAll(sourceSwc.getPortArgValueConstant());
		}

		return constants;
	}

	private List<GlobalVariable> getGlobalVariablesDefinedInRteSource(LogicalCompartment sourceRte) {
		List<GlobalVariable> globalVariables = Lists.newArrayList();
		globalVariables.addAll(this.context.query.<GlobalVariable> findByKind(sourceRte, GLOBAL_VARIABLE));
		globalVariables.removeAll(this.context.query.<RteBufferVariableSet> findByKind(sourceRte, RTE_BUFFER_VARIABLE_SET));
		List<GlobalVariableSet> setList =this.context.query.<GlobalVariableSet> findByKind(sourceRte, GLOBAL_VARIABLE_SET);

		// GlobalVariableSet内にあるGlobalVariableは削除する
		for (GlobalVariableSet variableSet : setList) {
			globalVariables.removeAll(variableSet.getGlobalVariable());
		}

		return globalVariables;
	}
	
	private List<FunctionMacroGroup> getFunctionMacroDefinedInRteSource(LogicalCompartment sourceRte) {
		List<FunctionMacroGroup> functionMacroGroup = Lists.newArrayList();
		functionMacroGroup.addAll(this.context.query.<FunctionMacroGroup> findByKind(sourceRte, FUNCTION_MACRO_GROUP));
		return functionMacroGroup;
	}
	
	private List<GlobalVariableGroup> groupGlobalVariablesByMemoryMapping(List<GlobalVariable> globalVariables) {
		List<GlobalVariableGroup> groups = Lists.newArrayList();
		ListMultimap<MemoryMapping, GlobalVariable> memmap2Vars = this.context.query.groupByKey(globalVariables, GLOBAL_VARIABLE__MEMORY_MAPPING);
		for (MemoryMapping keyMemmap : memmap2Vars.keySet()) {
			GlobalVariableGroup globalVariableGroup = ModuleFactory.eINSTANCE.createGlobalVariableGroup();
			globalVariableGroup.setMemoryMapping(keyMemmap);
			globalVariableGroup.getGlobalVariable().addAll(memmap2Vars.get(keyMemmap));
			groups.add(globalVariableGroup);
		}
		return groups;
	}
	
	private <FG extends FunctionGroup> List<FG> groupFunctionsByMemoryMapping(EClass eGroupClass, Function function) {
		return groupFunctionsByMemoryMapping(eGroupClass, Collections.singletonList(function));
	}

	private <FG extends FunctionGroup> List<FG> groupFunctionsByMemoryMapping(EClass eGroupClass, List<? extends Function> functions) {
		List<FG> groups = Lists.newArrayList();

		ListMultimap<MemoryMapping, ? extends Function> memmap2Funcs = this.context.query.groupByKey(functions, FUNCTION__MEMORY_MAPPING);
		for (MemoryMapping keyMemmap : memmap2Funcs.keySet()) {
			@SuppressWarnings("unchecked")
			FG globalVariableGroup = (FG) ModuleFactory.eINSTANCE.create(eGroupClass);
			globalVariableGroup.setMemoryMapping(keyMemmap);
			globalVariableGroup.getFunction().addAll(memmap2Funcs.get(keyMemmap));
			groups.add(globalVariableGroup);
		}
		return groups;
	}

	public void buildMemoryMappingHeaders() {
		RteModule targetRteModule = this.context.cache.rteModule;
		Rte sourceRte = this.context.cache.rte;

		targetRteModule.setBswMemoryMappingHeader(createBswMemoryMappingHeader(sourceRte));

		for (Swc sourceSwc : this.context.query.<Swc> findByKind(SWC)) {
			targetRteModule.getSwcMemoryMappingHeader().add(createSwcMemoryMappingHeader(sourceSwc));
		}
	}

	private SwcMemoryMappingHeader createSwcMemoryMappingHeader(Swc sourceSwc) {
		SwcMemoryMappingHeader swcMemoryMappingHeader = ModuleFactory.eINSTANCE.createSwcMemoryMappingHeader();
		swcMemoryMappingHeader.setFileName(sourceSwc.getCompartmentName() + FileNames.SWC_MEMORY_MAPPING_HEADER_POSTFIX);
		swcMemoryMappingHeader.getMemoryMapping().addAll(sourceSwc.getSwcMemoryMapping());
		return swcMemoryMappingHeader;
	}

	private BswMemoryMappingHeader createBswMemoryMappingHeader(Rte sourceRte) {
		BswMemoryMappingHeader bswMemoryMappingHeader = ModuleFactory.eINSTANCE.createBswMemoryMappingHeader();
		bswMemoryMappingHeader.setFileName(FileNames.BSW_MEMORY_MAPPING_HEADER_NAME);
		bswMemoryMappingHeader.getMemoryMapping().addAll(sourceRte.getRteMemoryMapping());
		return bswMemoryMappingHeader;
	}

	public void buildGenerationInfo() {
		for (File targetFile : this.context.query.<File> findByKind(FILE)) {
			targetFile.setGenerationInfo(this.context.cache.rte.getGenerationInfo());
		}
	}

	public void sortFileContents() {
		for (File targetFile : this.context.query.<File> findByKind(FILE)) {
			this.moduleModelSorter.sortFileContents(targetFile);
		}
	}
}
