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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION_COLLECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_CALLBACK_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_PROXY_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SIGNAL_API_WRAPPER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CORE__PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FILE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION_MACRO;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.FUNCTION__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE__MEMORY_MAPPING;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MACRO;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTED_BSWM__SCHM_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION__OS_TRUSTED_MACRO;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION__PARTED_BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PARTITION__SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API__INLINE_CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API__INLINE_GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_API__INLINE_RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_CORE_START_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_LIFECYCLE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_API_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_CORE_INIT_API_IMPL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_LIFECYCLE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC__DEPENDENT_RUNNABLE_ENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC__RTE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TASK_BODY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TASK_BODY_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.FileNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionTableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapperFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.query.conditions.eobjects.ENot;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;

/**
 * �ե������ǥ���ۤ��롣
 */
public class RteFileModelBuilder {

	private final ModuleModelBuildContext context;
	private ModuleModelSorter moduleModelSorter;

	public RteFileModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.moduleModelSorter = new ModuleModelSorter(context);
	}

	public void buildRoot() {
		// RTE�⥸�塼�������
		RteModule destRteModule = ModuleFactory.eINSTANCE.createRteModule();
		this.context.cache.rteModule = destRteModule;
		this.context.cache.moduleRoot.setRteModule(destRteModule);
	}

	/**
	 * RTE�ΰ�¸�⥸�塼��Υե������ǥ���ۤ��롣
	 */
	public void buildDependentFiles() {
		// IOC�إå��ι���
		buildIocHeader(this.context.cache.rteModule);

		// COM�إå��ι���
		buildComHeader(this.context.cache.rteModule);
	}

	private void buildIocHeader(RteModule targetRteModule) {
		if (this.context.cache.rte.getDependentIocCommunication().isEmpty()) {
			this.context.cache.iocHeader = Optional.absent();
		} else {
			BlackboxHeader destIocHeader = createIocHeader();
			this.context.cache.iocHeader = Optional.of(destIocHeader);
			targetRteModule.getDependentHeader().add(destIocHeader);
		}
	}

	private void buildComHeader(RteModule targetRteModule) {
		Optional<Com> sourceCom = this.context.query.tryFindSingleByKind(COM);
		if (sourceCom.isPresent()) {
			BlackboxHeader destComHeader = createComHeader(sourceCom.get());
			targetRteModule.getDependentHeader().add(destComHeader);
			this.context.cache.comHeader = Optional.of(destComHeader);
		} else {
			this.context.cache.comHeader = Optional.absent();
		}
	}

	private BlackboxHeader createIocHeader() {
		BlackboxHeader destIocHeader = ModuleFactory.eINSTANCE.createBlackboxHeader();
		destIocHeader.setFileName(FileNames.IOC_HEADER_FILE_NAME);
		return destIocHeader;
	}

	private BlackboxHeader createComHeader(Com sourceCom) {
		BlackboxHeader destComHeader = ModuleFactory.eINSTANCE.createBlackboxHeader();
		destComHeader.setSingleSource(sourceCom);
		destComHeader.setFileName(FileNames.COM_HEADER_FILE_NAME);
		return destComHeader;
	}

	/**
	 * �ե������ǥ�(API)���ۤ��롣
	 * NOTE �����Ǥ���API�ϥ��ץꥱ�����������Τ�ΤΤߤǤ��ꡢ�饤�ե�������API�����������Ѥΰ����Ǥ��뤳�Ȥ���ա�
	 */
	public void buildApiFiles() {
		RteModule targetRteModule = this.context.cache.rteModule;

		// RTE�إå��ι���
		RteHeader destRteHeader = createRteHeader();
		targetRteModule.setRteHeader(destRteHeader);

		// RTE�����ץإå��ι���
		RteTypeHeader destRteTypeHeader = createRteTypeHeader(this.context.cache.rte);
		targetRteModule.setRteTypeHeader(destRteTypeHeader);

		// ���ץꥱ�������إå��ե����롤����ӥ��ץꥱ������󥿥��ץإå��ե�����ι���
		buildApplicationHeaders(targetRteModule);
		
		// BSW�������塼��Υ⥸�塼��Ϣ��إå��ե����롢����ӥ⥸�塼��Ϣ�륿���ץإå��ե�����ι���
		if (this.context.options.doesGenerateSchm) {
			buildSchmModuleInterlinkHeaders(targetRteModule);
		}
	}

	private RteHeader createRteHeader() {
		RteHeader destRteHeader = ModuleFactory.eINSTANCE.createRteHeader();
		destRteHeader.setFileName(FileNames.RTE_HEADER_FILE_NAME);
		destRteHeader.setGuardName(FileNames.RTE_HEADER_GUARD_NAME);
		return destRteHeader;
	}

	private RteTypeHeader createRteTypeHeader(Rte sourceRte) {
		RteTypeHeader destRteTypeHeader = ModuleFactory.eINSTANCE.createRteTypeHeader();
		destRteTypeHeader.setFileName(FileNames.RTE_TYPE_HEADER_FILE_NAME);
		destRteTypeHeader.setGuardName(FileNames.RTE_TYPE_HEADER_GUARD_NAME);

		if (this.context.cache.comHeader.isPresent()) {
			destRteTypeHeader.getIncludeHeader().add(this.context.cache.comHeader.get());
		}
		destRteTypeHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteHeader());

		destRteTypeHeader.getRteType().addAll(getTypesDefinedInRteTypeHeader(sourceRte));
		destRteTypeHeader.getRteTypeConstant().addAll(getConstantsDefinedInRteTypeHeader(sourceRte));
		destRteTypeHeader.setProvidesSignalGroupTransmission(this.context.cache.comHeader.isPresent());
		return destRteTypeHeader;
	}

	private List<Type> getTypesDefinedInRteTypeHeader(Rte sourceRte) {
		List<Type> types = Lists.newArrayList();
		types.addAll(sourceRte.getImplementationDataType());
		if (sourceRte.getSrRteSendTfParamType() != null) {
			types.add(sourceRte.getSrRteSendTfParamType());
		}
		if (sourceRte.getComSendSignalTfParamType() != null) {
			types.add(sourceRte.getComSendSignalTfParamType());
		}
		if (sourceRte.getComSendSignalGroupTfParamType() != null) {
			types.add(sourceRte.getComSendSignalGroupTfParamType());
		}
		types.addAll(sourceRte.getSrRteBufferQueueType());
		types.addAll(sourceRte.getCsTfParamType());
		return types;
	}

	private List<Constant> getConstantsDefinedInRteTypeHeader(Rte sourceRte) {
		List<Constant> constants = Lists.newArrayList();
		constants.addAll(sourceRte.getSrRteBufferQueueMaxLengthConstant());
		return constants;
	}

	private void buildApplicationHeaders(RteModule targetRteModule) {
		for (Swc sourceSwc : this.context.query.<Swc> findByKind(SWC)) {
			RteApplicationTypeHeader destApplicationTypeHeader = createRteApplicationTypeHeader(sourceSwc, this.context.cache.rteModule.getRteTypeHeader());
			targetRteModule.getRteApplicationTypeHeader().add(destApplicationTypeHeader);

			RteApplicationHeader destApplicationHeader = createRteApplicationHeader(sourceSwc, destApplicationTypeHeader);
			targetRteModule.getRteApplicationHeader().add(destApplicationHeader);
		}
	}

	private RteApplicationTypeHeader createRteApplicationTypeHeader(Swc sourceSwc, RteTypeHeader rteTypeHeader) {
		RteApplicationTypeHeader destApplicationTypeHeader = ModuleFactory.eINSTANCE.createRteApplicationTypeHeader();
		destApplicationTypeHeader.setFileName(FileNames.createRteApplicationTypeHeaderFileName(sourceSwc));
		destApplicationTypeHeader.setGuardName(FileNames.createRteApplicationTypeHeaderGuardName(sourceSwc));

		destApplicationTypeHeader.getIncludeHeader().add(rteTypeHeader);

		destApplicationTypeHeader.getConstant().addAll(sourceSwc.getApiEnumConstant());
		destApplicationTypeHeader.getConstant().addAll(sourceSwc.getApiUpperLowerLimitConstant());
		return destApplicationTypeHeader;
	}

	private RteApplicationHeader createRteApplicationHeader(Swc sourceSwc, RteApplicationTypeHeader applicationTypeHeader) {
		RteApplicationHeader destApplicationHeader = ModuleFactory.eINSTANCE.createRteApplicationHeader();
		destApplicationHeader.setSingleSource(sourceSwc);
		destApplicationHeader.setFileName(FileNames.createRteApplicationHeaderFileName(sourceSwc));
		destApplicationHeader.setGuardName(FileNames.createRteApplicationHeaderGuardName(sourceSwc));

		destApplicationHeader.getIncludeHeader().add(applicationTypeHeader);

		destApplicationHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityFileContentsGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP, sourceSwc.getDependentRunnableEntity()));

		destApplicationHeader.getConstant().addAll(sourceSwc.getSrApiInitValueConstant());
		destApplicationHeader.getConstant().addAll(sourceSwc.getCsApiApplicationErrorConstant());
		destApplicationHeader.getRteApiGroup().addAll(this.<RteApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_API_FILE_CONTENTS_GROUP, sourceSwc.getRteApi()));
		destApplicationHeader.getDeclarationsRteApiGroup().addAll(filterNotNeededRteApiGroups(this.<RteApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_API_FILE_CONTENTS_GROUP, sourceSwc.getRteApi())));
		destApplicationHeader.setHasInlineApi(hasInlineApi(destApplicationHeader));

		if (destApplicationHeader.getHasInlineApi()) {
			// ����饤��API��ɬ�פȤʤ륷��ܥ�����
			List<RunnableEntity> runnablesAccessedFromInlineApi = Lists.newArrayList(getRunnablesAccessedFromInlineApi(sourceSwc));
			runnablesAccessedFromInlineApi.removeAll(sourceSwc.getDependentRunnableEntity()); // NOTE SW-C�ΰ�¸���ʥ֥�����ӥإå��ե�������ɲä���뤿�ᡢ�����ǤϽ�������

			// Partition���̤ˤ��ޥ�������ꤹ��(TOPPERS_TRUSTED��)
			destApplicationHeader.getSourceMacro().addAll(this.context.query.<Macro> collect(sourceSwc.getParent(), PARTITION__OS_TRUSTED_MACRO));
			
			// NOTE Os.h�ϡ�hasInlineApi��true�ΤȤ��ˡ�mtl��ľ��include����
			destApplicationHeader.getIncludeHeader().add(getOrBuildRteUtilityHeader());
			destApplicationHeader.getIncludeHeader().add(getOrBuildRteBswApiHeader());

			destApplicationHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityFileContentsGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP, runnablesAccessedFromInlineApi));
			destApplicationHeader.getConstant().addAll(getConstantsAccessedFromInlineApi(sourceSwc));
			destApplicationHeader.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getGlobalVariablesAccessedFromInlineApi(sourceSwc)));
		}
		return destApplicationHeader;
	}

	private Collection<RunnableEntity> getRunnablesAccessedFromInlineApi(Swc sourceSwc) {
		List<RunnableEntity> runnables = this.context.query.collect(sourceSwc, SWC__RTE_API, RTE_API__INLINE_RUNNABLE_ENTITY);
		return ImmutableSet.copyOf(runnables);
	}

	private Collection<Constant> getConstantsAccessedFromInlineApi(Swc sourceSwc) {
		List<Constant> constants = this.context.query.collect(sourceSwc, SWC__RTE_API, RTE_API__INLINE_CONSTANT);
		return ImmutableSet.copyOf(constants);
	}

	private Collection<GlobalVariable> getGlobalVariablesAccessedFromInlineApi(Swc sourceSwc) {
		List<GlobalVariable> globalVariables = this.context.query.collect(sourceSwc, SWC__RTE_API, RTE_API__INLINE_GLOBAL_VARIABLE);
		return ImmutableSet.copyOf(globalVariables);
	}

	private boolean hasInlineApi(RteApplicationHeader applicationHeader) {
		for (RteApiFileContentsGroup group : applicationHeader.getDeclarationsRteApiGroup()) {
			for (RteApi api : group.getRteApi()) {
				if (api.getIsInline()) {
					return true;
				}
			}
		}
		return false;
	}

	private void buildSchmModuleInterlinkHeaders(RteModule targetRteModule) {
		for (Bswm sourceBswm : this.context.query.<Bswm> findByKind(BSWM)) {
			ModuleInterlinkTypeHeader destModuleInterlinkTypeHeader = createSchmModuleInterlinkTypeHeader(sourceBswm, this.context.cache.rteModule.getRteTypeHeader());
			targetRteModule.getModuleInterlinkTypeHeader().add(destModuleInterlinkTypeHeader);

			ModuleInterlinkHeader destModuleInterlinkHeader = createSchmModuleInterlinkHeader(sourceBswm, destModuleInterlinkTypeHeader);
			targetRteModule.getModuleInterlinkHeader().add(destModuleInterlinkHeader);
		}
	}

	private ModuleInterlinkTypeHeader createSchmModuleInterlinkTypeHeader (Bswm sourceBswm, RteTypeHeader rteTypeHeader) {
		ModuleInterlinkTypeHeader destModuleInterlinkTypeHeader = ModuleFactory.eINSTANCE.createModuleInterlinkTypeHeader();
		destModuleInterlinkTypeHeader.setSingleSource(sourceBswm);
		destModuleInterlinkTypeHeader.setFileName(FileNames.createSchmModuleInterlinkTypeHeaderFileName(sourceBswm));
		destModuleInterlinkTypeHeader.setGuardName(FileNames.createSchmModuleInterlinkTypeHeaderGuardName(sourceBswm));

		destModuleInterlinkTypeHeader.getIncludeHeader().add(rteTypeHeader);

		// �⡼��Ϣ��
		destModuleInterlinkTypeHeader.getModeType().addAll(this.context.query.<ModeType>collect(sourceBswm.getModeDeclarationGroup(), MODE_DECLARATION_GROUP__MODE_TYPE));
		destModuleInterlinkTypeHeader.getModeDeclarationGroup().addAll(sourceBswm.getModeDeclarationGroup());
		return destModuleInterlinkTypeHeader;
	}

	private ModuleInterlinkHeader createSchmModuleInterlinkHeader(Bswm sourceBswm, ModuleInterlinkTypeHeader moduleInterlinkTypeHeader) {
		ModuleInterlinkHeader destModuleInterlinkHeader = ModuleFactory.eINSTANCE.createModuleInterlinkHeader();
		destModuleInterlinkHeader.setSingleSource(sourceBswm);
		destModuleInterlinkHeader.setFileName(FileNames.createSchmModuleInterlinkHeaderFileName(sourceBswm));
		destModuleInterlinkHeader.setGuardName(FileNames.createSchmModuleInterlinkHeaderGuardName(sourceBswm));

		destModuleInterlinkHeader.getIncludeHeader().add(moduleInterlinkTypeHeader);

		destModuleInterlinkHeader.getDependentExecutableEntityGroup().addAll(
				this.<ExecutableEntityFileContentsGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP,
						this.context.query.<ExecutableEntity> collect(sourceBswm.getPartedBswm(), PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY)));

		destModuleInterlinkHeader.getSchmApiGroup().addAll(
				this.<SchmApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_API_FILE_CONTENTS_GROUP, this.context.query.<SchmApi> collect(sourceBswm.getPartedBswm(), PARTED_BSWM__SCHM_API)));
		return destModuleInterlinkHeader;
	}

	/**
	 * �ե������ǥ�(����������)���ۤ��롣
	 */
	public void buildImplFiles() {
		RteModule targetRteModule = this.context.cache.rteModule;
		Rte sourceRte = this.context.cache.rte;

		// �饤�ե�������إå�������
		RteLifecycleHeader destRteLifecycleHeader = createRteLifecycleHeader(sourceRte);
		targetRteModule.setRteLifecycleHeader(destRteLifecycleHeader);

		// RTE����ե�����졼�����إå��ե����������
		RteConfigurationHeader destRteConfigurationHeader = createRteConfigurationHeader();
		if (this.context.options.suppressConfigHeader) {
			targetRteModule.getDependentHeader().add(destRteConfigurationHeader);
		} else {
			targetRteModule.setRteConfigurationHeader(destRteConfigurationHeader);
		}

		// VFB�ȥ졼���إå�������
		RteVfbTraceHeader destRteVfbTraceHeader = createRteVfbTraceHeader(destRteConfigurationHeader);
		targetRteModule.setRteVfbTraceHeader(destRteVfbTraceHeader);

		// RTE������Хå��إå�������
		if (this.context.options.doesGenerateRte) {
			RteCallbackHeader destRteCallbackHeader = createRteCallbackHeader(sourceRte);
			targetRteModule.setRteCallbackHeader(destRteCallbackHeader);
		}

		// RTE�桼�ƥ���ƥ��إå�������
		getOrBuildRteUtilityHeader();

		// RTE BSW API�إå��ι���
		getOrBuildRteBswApiHeader();

		// RTE�������ե����������
		if (isEcucPartitionCollectionExists()) {
			// �ѡ��ƥ���������ξ��
			buildPartitionedSystemRteSources(targetRteModule, sourceRte);
		} else {
			// ��ѡ��ƥ���������ξ��
			buildNonPartitionedSystemRteSource(targetRteModule, sourceRte);
		}
	}

	private RteLifecycleHeader createRteLifecycleHeader(Rte sourceRte) {
		RteLifecycleHeader destRteLifecycleHeader = ModuleFactory.eINSTANCE.createRteLifecycleHeader();
		destRteLifecycleHeader.setFileName(FileNames.RTE_LIFECYCLE_HEADER_FILE_NAME);
		destRteLifecycleHeader.setGuardName(FileNames.RTE_LIFECYCLE_HEADER_GUARD_NAME);

		destRteLifecycleHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteHeader());

		destRteLifecycleHeader.getRteLifecycleApiGroup().addAll(
				this.<RteLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP,
						this.context.query.<RteLifecycleApi> find(sourceRte, isKindOf(RTE_LIFECYCLE_API).AND(new ENot(isKindOf(RTE_CORE_START_API_IMPL))))));
		destRteLifecycleHeader.getSchmLifecycleApiGroup().addAll(
				this.<SchmLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP,
						this.context.query.<SchmLifecycleApi> find(sourceRte, isKindOf(SCHM_LIFECYCLE_API).AND(new ENot(isKindOf(SCHM_CORE_INIT_API_IMPL))))));
		return destRteLifecycleHeader;
	}

	private RteConfigurationHeader createRteConfigurationHeader() {
		RteConfigurationHeader destRteConfigurationHeader = ModuleFactory.eINSTANCE.createRteConfigurationHeader();
		destRteConfigurationHeader.setFileName(FileNames.RTE_CONFIGURATION_HEADER_FILE_NAME);
		destRteConfigurationHeader.setGuardName(FileNames.RTE_CONFIGURATION_HEADER_GUARD_NAME);
		return destRteConfigurationHeader;
	}

	private RteVfbTraceHeader createRteVfbTraceHeader(RteConfigurationHeader rteConfigurationHeader) {
		RteVfbTraceHeader destRteVfbTraceHeader = ModuleFactory.eINSTANCE.createRteVfbTraceHeader();
		destRteVfbTraceHeader.setFileName(FileNames.RTE_VFB_TRACE_HEADER_FILE_NAME);
		destRteVfbTraceHeader.setGuardName(FileNames.RTE_VFB_TRACE_HEADER_GUARD_NAME);

		destRteVfbTraceHeader.getIncludeHeader().add(rteConfigurationHeader);
		destRteVfbTraceHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());
		return destRteVfbTraceHeader;
	}

	private RteCallbackHeader createRteCallbackHeader(Rte sourceRte) {
		RteCallbackHeader destRteCallbackHeader = ModuleFactory.eINSTANCE.createRteCallbackHeader();
		destRteCallbackHeader.setFileName(FileNames.RTE_CALLBACK_HEADER_FILE_NAME);
		destRteCallbackHeader.setGuardName(FileNames.RTE_CALLBACK_HEADER_GUARD_NAME);
		destRteCallbackHeader.getComCallbackGroup().addAll(this.<ComCallbackFileContentsGroup> groupFunctionsByMemoryMapping(COM_CALLBACK_FILE_CONTENTS_GROUP, sourceRte.getComCallback()));
		return destRteCallbackHeader;
	}

	private RteUtilityHeader getOrBuildRteUtilityHeader() {
		RteModule targetRteModule = this.context.cache.rteModule;
		Rte sourceRte = this.context.cache.rte;
		if (targetRteModule.getRteUtilityHeader() == null) {
			targetRteModule.setRteUtilityHeader(createRteUtilityHeader(sourceRte));
		}
		return targetRteModule.getRteUtilityHeader();
	}

	private RteUtilityHeader createRteUtilityHeader(Rte sourceRte) {
		RteUtilityHeader destRteUtilityHeader = ModuleFactory.eINSTANCE.createRteUtilityHeader();
		destRteUtilityHeader.setFileName(FileNames.RTE_UTILITY_HEADER_FILE_NAME);
		destRteUtilityHeader.setGuardName(FileNames.RTE_UTILITY_HEEADER_GUARD_NAME);

		destRteUtilityHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());
		return destRteUtilityHeader;
	}

	private RteBswApiHeader getOrBuildRteBswApiHeader() {
		RteModule targetRteModule = this.context.cache.rteModule;
		if (targetRteModule.getRteBswApiHeader() == null) {
			targetRteModule.setRteBswApiHeader(createRteBswApiHeader(this.context.cache.rte));
		}
		return targetRteModule.getRteBswApiHeader();
	}

	private RteBswApiHeader createRteBswApiHeader(Rte sourceRte) {
		RteBswApiHeader destRteBswApiHeader = ModuleFactory.eINSTANCE.createRteBswApiHeader();
		destRteBswApiHeader.setFileName(FileNames.RTE_BSW_API_HEADER_NAME);
		destRteBswApiHeader.setGuardName(FileNames.RTE_BSW_API_HEADER_GUARD_NAME);
		destRteBswApiHeader.getIocApi().addAll(this.context.query.<IocApi>findByKind(sourceRte, IOC_API));
		return destRteBswApiHeader;
	}

	private void buildNonPartitionedSystemRteSource(RteModule targetRteModule, Rte sourceRte) {
		RteInternalHeader destRteInternalHeader = createNonPartitionedSystemRteInternalHeader(sourceRte);
		targetRteModule.setRteCommonHeader(destRteInternalHeader);
		targetRteModule.setRteCommonSource(createNonPartitionedSystemRteSource(targetRteModule, sourceRte, destRteInternalHeader));
	}

	private RteInternalHeader createNonPartitionedSystemRteInternalHeader(Rte sourceRte) {
		// �ե�����˴�Ϣ�դ��륷��ܥ�����
		List<ExecutableEntity> dependentExecutableEntities = this.context.query.<ExecutableEntity> findByKind(sourceRte, EXECUTABLE_ENTITY);
		dependentExecutableEntities.addAll(this.context.query.<RunnableEntity> collect(sourceRte.getCore(), CORE__PARTITION, PARTITION__SWC, SWC__DEPENDENT_RUNNABLE_ENTITY));
		dependentExecutableEntities.addAll(this.context.query.<BswSchedulableEntity> collect(sourceRte.getCore(), CORE__PARTITION, PARTITION__PARTED_BSWM, PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY));

		// RTE�����إå�������
		RteInternalHeader destCommonRteInternalHeader = ModuleFactory.eINSTANCE.createRteInternalHeader();
		destCommonRteInternalHeader.setFileName(FileNames.RTE_COMMON_RTE_INTERNAL_HEADER_FILE_NAME);
		destCommonRteInternalHeader.setGuardName(FileNames.RTE_COMMON_RTE_INTERNAL_HEADER_GUARD_NAME);

		if (this.context.cache.comHeader.isPresent()) {
			destCommonRteInternalHeader.getIncludeHeader().add(this.context.cache.comHeader.get());
		}
		destCommonRteInternalHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());

		destCommonRteInternalHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityFileContentsGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP, dependentExecutableEntities));
		destCommonRteInternalHeader.getRteApiGroup().addAll(filterNotNeededRteApiGroupsForRteInternalHeader(this.<RteApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_API_FILE_CONTENTS_GROUP, this.context.query.<RteApi> findByKind(sourceRte, RTE_API))));
		destCommonRteInternalHeader.getSchmApiGroup().addAll(filterNotNeededSchmApiGroups(this.<SchmApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_API_FILE_CONTENTS_GROUP, this.context.query.<SchmApi> findByKind(sourceRte, SCHM_API))));
		
		destCommonRteInternalHeader.getConstant().addAll(getInternalConstants(sourceRte));
		destCommonRteInternalHeader.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getInternalGlobalVariables(sourceRte)));
		destCommonRteInternalHeader.getFunctionMacro().addAll(getInternalFunctionMacros(sourceRte));
		destCommonRteInternalHeader.getComSignalApiWrapperGroup().addAll(this.<ComSignalApiWrapperFileContentsGroup> groupFunctionsByMemoryMapping(COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP, this.context.query.<ComSignalApiWrapper> findByKind(COM_SIGNAL_API_WRAPPER)));

		// �⡼��Ϣ��
		buildModeSymbolPartOfCommonRteInternalHeader(destCommonRteInternalHeader, sourceRte);

		return destCommonRteInternalHeader;
	}

	private RteSource createNonPartitionedSystemRteSource(RteModule targetRteModule, Rte sourceRte, RteInternalHeader rteCommonHeader) {
		RteSource destRteSource = ModuleFactory.eINSTANCE.createRteSource();
		destRteSource.setFileName(FileNames.RTE_SOURCE_FILE_NAME);

		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteVfbTraceHeader());
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteUtilityHeader());
		destRteSource.getIncludeHeader().add(rteCommonHeader);
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteLifecycleHeader());
		if (this.context.cache.rteModule.getRteCallbackHeader() != null) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteCallbackHeader());
		}
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteBswApiHeader());

		destRteSource.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getInternalGlobalVariables(sourceRte)));
		destRteSource.getRteApiGroup().addAll(filterNotNeededRteApiGroups(this.<RteApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_API_FILE_CONTENTS_GROUP, this.context.query.<RteApi> findByKind(sourceRte, RTE_API))));
		destRteSource.getRteLifecycleApiGroup().addAll(
				this.<RteLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP, this.context.query.<RteLifecycleApi> findByKind(sourceRte, RTE_LIFECYCLE_API)));
		destRteSource.getSchmApiGroup().addAll(filterNotNeededSchmApiGroups(this.<SchmApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_API_FILE_CONTENTS_GROUP, this.context.query.<SchmApi> findByKind(sourceRte, SCHM_API))));
		destRteSource.getSchmLifecycleApiGroup().addAll(
				this.<SchmLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP, this.context.query.<SchmLifecycleApi> findByKind(sourceRte, SCHM_LIFECYCLE_API)));
		destRteSource.getTaskBodyGroup().addAll(this.<TaskBodyFileContentsGroup> groupFunctionsByMemoryMapping(TASK_BODY_FILE_CONTENTS_GROUP, this.context.query.<TaskBody> findByKind(sourceRte, TASK_BODY)));
		destRteSource.getComCallbackGroup().addAll(this.<ComCallbackFileContentsGroup> groupFunctionsByMemoryMapping(COM_CALLBACK_FILE_CONTENTS_GROUP, sourceRte.getComCallback()));
		destRteSource.getComSignalApiWrapperGroup().addAll(
				this.<ComSignalApiWrapperFileContentsGroup> groupFunctionsByMemoryMapping(COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP, this.context.query.<ComSignalApiWrapper> findByKind(sourceRte, COM_SIGNAL_API_WRAPPER)));

		return destRteSource;
	}

	private void buildPartitionedSystemRteSources(RteModule targetRteModule, Rte sourceRte) {
		// ���̤�RTE�������ե����������
		RteInternalHeader destCommonRteInternalHeader = createPartitionedSystemCommonRteInternalHeader(sourceRte);
		targetRteModule.setRteCommonHeader(destCommonRteInternalHeader);
		targetRteModule.setRteCommonSource(createPartitionedSystemCommonRteSource(sourceRte, destCommonRteInternalHeader));

		// �ѡ��ƥ���������RTE�������ե����������
		for (Core sourceCore : sourceRte.getCore()) {
			for (Partition sourcePartition : sourceCore.getPartition()) {
				RteInternalHeader destPartitionRteInternalHeader = createPartitionRteInternalHeader(sourcePartition, sourceRte, sourceCore, destCommonRteInternalHeader);
				targetRteModule.getRtePartitionHeader().add(destPartitionRteInternalHeader);
				targetRteModule.getRtePartitionSource().add(createPartitionRteSource(targetRteModule, sourcePartition, sourceRte, sourceCore, destPartitionRteInternalHeader));
			}
		}
		
		// ���̤�RTE�������ե����뤫�饳����Υإå��ե�����򻲾Ȥ�����
		targetRteModule.getRteCommonSource().getIncludeHeader().addAll(targetRteModule.getRtePartitionHeader());
	}

	private RteInternalHeader createPartitionedSystemCommonRteInternalHeader(Rte sourceRte) {
		RteInternalHeader destCommonRteInternalHeader = ModuleFactory.eINSTANCE.createRteInternalHeader();
		destCommonRteInternalHeader.setFileName(FileNames.RTE_COMMON_RTE_INTERNAL_HEADER_FILE_NAME);
		destCommonRteInternalHeader.setGuardName(FileNames.RTE_COMMON_RTE_INTERNAL_HEADER_GUARD_NAME);

		if (this.context.cache.comHeader.isPresent()) {
			destCommonRteInternalHeader.getIncludeHeader().add(this.context.cache.comHeader.get());
		}
		destCommonRteInternalHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteTypeHeader());

		destCommonRteInternalHeader.getConstant().addAll(getInternalConstants(sourceRte));
		destCommonRteInternalHeader.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(getInternalGlobalVariables(sourceRte)));
		destCommonRteInternalHeader.getFunctionMacro().addAll(getInternalFunctionMacros(sourceRte));
		destCommonRteInternalHeader.getComSignalApiWrapperGroup().addAll(this.<ComSignalApiWrapperFileContentsGroup> groupFunctionsByMemoryMapping(COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP, this.context.query.<ComSignalApiWrapper> findByKind(COM_SIGNAL_API_WRAPPER)));

		// �⡼��Ϣ��
		buildModeSymbolPartOfCommonRteInternalHeader(destCommonRteInternalHeader, sourceRte);

		// Common��ComProxyFunctionTableGroup����
		Optional<ComProxyFunctionTableFileContentsGroup> destComProxyFunctionTableGroup = createComProxyFunctionTableGroup();
		if (destComProxyFunctionTableGroup.isPresent()) {
			destCommonRteInternalHeader.getComProxyFunctionTableGroup().add(destComProxyFunctionTableGroup.get());
		}

		return destCommonRteInternalHeader;
	}

	private void buildModeSymbolPartOfCommonRteInternalHeader(RteInternalHeader targetRteCommonHeader, Rte sourceRte) {
		for (Bswm bswm : sourceRte.getBswm()) {
			targetRteCommonHeader.getModeDeclarationGroup().addAll(bswm.getModeDeclarationGroup());

			for (PartedBswm partedBswm : bswm.getPartedBswm()) {
				targetRteCommonHeader.getModeMachineInstance().addAll(partedBswm.getModeMachineInstance());
			}
		}
	}

	private Optional<ComProxyFunctionTableFileContentsGroup> createComProxyFunctionTableGroup() {
		Optional<GlobalVariable> functionTable = this.context.query.tryFindSingle(isKindOf(GLOBAL_VARIABLE).AND(hasAttr(VARIABLE__SYMBOL_NAME, SymbolNames.createComProxyFunctionTableVariableName())));
		if (!functionTable.isPresent()) {
			return Optional.absent();
		}

		ComProxyFunctionTableFileContentsGroup destComProxyFunctionTableGroup = ModuleFactory.eINSTANCE.createComProxyFunctionTableFileContentsGroup();
		for (ConstantMember member : functionTable.get().getInitValueConstant().getMember()) {
			// ��Ƭ��'&'����������Ͽ����
			destComProxyFunctionTableGroup.getSrWriteProxyName().add(member.getValue().substring(1));
		}
		return Optional.of(destComProxyFunctionTableGroup);
	}

	private RteSource createPartitionedSystemCommonRteSource(Rte sourceRte, RteInternalHeader commonRteInternalHeader) {
		RteSource destRteSource = ModuleFactory.eINSTANCE.createRteSource();
		destRteSource.setFileName(FileNames.RTE_SOURCE_FILE_NAME);

		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteVfbTraceHeader());
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteUtilityHeader());
		destRteSource.getIncludeHeader().add(commonRteInternalHeader);
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteLifecycleHeader());
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteBswApiHeader());

		if (this.context.options.doesGenerateRte) {
			destRteSource.getRteLifecycleApiGroup().addAll(
					this.<RteLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP, Lists.newArrayList(sourceRte.getRteStartApi(), sourceRte.getRteStopApi())));
		}

		if (this.context.options.doesGenerateSchm) {
			destRteSource.getSchmLifecycleApiGroup().addAll(
					this.<SchmLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP,
							Lists.newArrayList(sourceRte.getSchmInitApi(), sourceRte.getSchmDeinitApi())));
		}

		return destRteSource;
	}

	private RteInternalHeader createPartitionRteInternalHeader(Partition sourcePartition, Rte sourceRte, Core sourceCore, RteInternalHeader commonRteInternalHeader) {
		// �ե�����˴�Ϣ�դ��륷��ܥ�����
		List<ExecutableEntity> dependentExecutableEntities = Lists.newArrayList();
		dependentExecutableEntities.addAll(this.context.query.<BswSchedulableEntity> collect(sourcePartition.getPartedBswm(), PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY));
		dependentExecutableEntities.addAll(this.context.query.<RunnableEntity> collect(sourcePartition.getSwc(), SWC__DEPENDENT_RUNNABLE_ENTITY));
		List<RteApi> rteApis = this.context.query.<RteApi> collect(sourcePartition.getSwc(), SWC__RTE_API);
		List<SchmApi> schmApis = this.context.query.<SchmApi> findByKind(sourcePartition, SCHM_API);

		List<TrustedFunction> trustedFunctions = Lists.newArrayList();
		List<BswSchedulableEntity> rteBswSchedulableEntities = Lists.newArrayList();

		trustedFunctions.addAll(this.context.query.<TrustedFunction> findByKind(sourcePartition, TRUSTED_FUNCTION));
		if (sourceCore.getIsMasterCore() && sourcePartition.getIsBswPartition()) {
			trustedFunctions.addAll(sourceRte.getComSendSignalTrustedFunction());
			rteBswSchedulableEntities.addAll(getRteBswSchedulableEntities(sourceRte));
		}

		// RTE�����إå�������
		RteInternalHeader destRteInternalHeader = ModuleFactory.eINSTANCE.createRteInternalHeader();
		destRteInternalHeader.setFileName(FileNames.createPartitionRteInternalHeaderFileName(sourcePartition));
		destRteInternalHeader.setGuardName(FileNames.createPartitionRteInternalHeaderGuardName(sourcePartition));

		if (this.context.cache.comHeader.isPresent()) {
			destRteInternalHeader.getIncludeHeader().add(this.context.cache.comHeader.get());
		}
		if (this.context.cache.iocHeader.isPresent()) {
			destRteInternalHeader.getIncludeHeader().add(this.context.cache.iocHeader.get());
		}
		destRteInternalHeader.getIncludeHeader().add(commonRteInternalHeader);
		destRteInternalHeader.getIncludeHeader().add(this.context.cache.rteModule.getRteUtilityHeader());

		destRteInternalHeader.getDependentExecutableEntityGroup().addAll(this.<ExecutableEntityFileContentsGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP, dependentExecutableEntities));
		destRteInternalHeader.getRteApiGroup().addAll(filterNotNeededRteApiGroupsForRteInternalHeader(this.<RteApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_API_FILE_CONTENTS_GROUP, rteApis)));
		destRteInternalHeader.getSchmApiGroup().addAll(filterNotNeededSchmApiGroups(this.<SchmApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_API_FILE_CONTENTS_GROUP, schmApis)));

		if (sourcePartition.getIsBswPartition()) {
			if (sourceCore.getRteCoreStartApiImpl() != null) {
				destRteInternalHeader.setRteCoreStartApiImpl(sourceCore.getRteCoreStartApiImpl());
			}
			if (sourceCore.getSchmCoreInitApiImpl() != null) {
				destRteInternalHeader.setSchmCoreInitApiImpl(sourceCore.getSchmCoreInitApiImpl());
			}
		}
		
		destRteInternalHeader.getTrustedFunctionGroup().addAll(this.<TrustedFunctionFileContentsGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_FILE_CONTENTS_GROUP, trustedFunctions));
		destRteInternalHeader.getBswSchedulableEntityGroup().addAll(this.<BswSchedulableEntityFileContentsGroup> groupFunctionsByMemoryMapping(BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP, rteBswSchedulableEntities));
		return destRteInternalHeader;
	}

	private RteSource createPartitionRteSource(RteModule targetRteModule, Partition sourcePartition, Rte sourceRte, Core sourceCore, RteInternalHeader partitionRteInternalHeader) {
		// �ե�����˴�Ϣ�դ��륷��ܥ�����
		List<RteLifecycleApi> rteLifecycleApis = Lists.newArrayList();
		rteLifecycleApis.addAll(this.context.query.<RteLifecycleApi> findByKind(sourcePartition, RTE_LIFECYCLE_API));

		List<SchmLifecycleApi> schmLifecycleApis = Lists.newArrayList();
		schmLifecycleApis.addAll(this.context.query.<SchmLifecycleApi> findByKind(sourcePartition, SCHM_LIFECYCLE_API));

		List<GlobalVariable> globalVariables = Lists.newArrayList();
		globalVariables.addAll(getInternalGlobalVariablesDefinedForPartition(sourcePartition));

		if (sourcePartition.getIsBswPartition()) {
			if (sourceCore.getRteCoreStartApiImpl() != null) {
				rteLifecycleApis.add(sourceCore.getRteCoreStartApiImpl());
			}
			if (sourceCore.getSchmCoreInitApiImpl() != null) {
				schmLifecycleApis.add(sourceCore.getSchmCoreInitApiImpl());
			}
		}
		if (sourceCore.getIsMasterCore() && sourcePartition.getIsBswPartition()) {
			globalVariables.addAll(getInternalGlobalVariablesOnlyDefinedForMasterCoreBswPartition(sourceRte, sourceCore, sourcePartition));
		}

		// RTE������������
		RteSource destRteSource = ModuleFactory.eINSTANCE.createRteSource();
		destRteSource.setFileName(FileNames.createPartitionRteSourceFileName(sourcePartition));

		destRteSource.getSourceMacro().addAll(this.context.query.<Macro> findByKind(sourcePartition, MACRO));

		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteVfbTraceHeader());
		destRteSource.getIncludeHeader().add(partitionRteInternalHeader);
		if (this.context.cache.rteModule.getRteCallbackHeader() != null) {
			destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteCallbackHeader());
		}
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteLifecycleHeader());
		destRteSource.getIncludeHeader().add(this.context.cache.rteModule.getRteBswApiHeader());
		
		destRteSource.getGlobalVariableGroup().addAll(groupGlobalVariablesByMemoryMapping(globalVariables));
		destRteSource.getDependentExternalExecutableEntityGroup().addAll(this.<ExecutableEntityFileContentsGroup> groupFunctionsByMemoryMapping(EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP, this.context.query.<ExecutableEntity> collect(sourcePartition.getSwc(), SWC__DEPENDENT_EXTERNAL_RUNNABLE_ENTITY)));
		destRteSource.getRteApiGroup().addAll(filterNotNeededRteApiGroups(this.<RteApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_API_FILE_CONTENTS_GROUP, this.context.query.<RteApi> findByKind(sourcePartition, RTE_API))));
		destRteSource.getRteLifecycleApiGroup().addAll(this.<RteLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP, rteLifecycleApis));
		destRteSource.getSchmApiGroup().addAll(filterNotNeededSchmApiGroups(this.<SchmApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_API_FILE_CONTENTS_GROUP, this.context.query.<SchmApi> findByKind(sourcePartition, SCHM_API))));
		destRteSource.getSchmLifecycleApiGroup().addAll(this.<SchmLifecycleApiFileContentsGroup> groupFunctionsByMemoryMapping(SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP, schmLifecycleApis));
		destRteSource.getComSignalApiWrapperGroup().addAll(this.<ComSignalApiWrapperFileContentsGroup> groupFunctionsByMemoryMapping(COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP, this.context.query.<ComSignalApiWrapper> findByKind(sourcePartition, COM_SIGNAL_API_WRAPPER)));
		destRteSource.getComProxyFunctionGroup().addAll(this.<ComProxyFunctionFileContentsGroup> groupFunctionsByMemoryMapping(COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP, this.context.query.<ComProxyFunction> findByKind(sourcePartition, COM_PROXY_FUNCTION)));
		destRteSource.getTaskBodyGroup().addAll(this.<TaskBodyFileContentsGroup> groupFunctionsByMemoryMapping(TASK_BODY_FILE_CONTENTS_GROUP, this.context.query.<TaskBody> findByKind(sourcePartition, TASK_BODY)));
		destRteSource.getTrustedFunctionGroup().addAll(this.<TrustedFunctionFileContentsGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_FILE_CONTENTS_GROUP, this.context.query.<TrustedFunction> findByKind(sourcePartition, TRUSTED_FUNCTION)));

		if (sourceCore.getIsMasterCore() && sourcePartition.getIsBswPartition()) {
			destRteSource.getBswSchedulableEntityGroup().addAll(
					this.<BswSchedulableEntityFileContentsGroup> groupFunctionsByMemoryMapping(BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP, getRteBswSchedulableEntities(sourceRte)));
			destRteSource.getComCallbackGroup().addAll(this.<ComCallbackFileContentsGroup> groupFunctionsByMemoryMapping(COM_CALLBACK_FILE_CONTENTS_GROUP, sourceRte.getComCallback()));
			destRteSource.getTrustedFunctionGroup().addAll(this.<TrustedFunctionFileContentsGroup> groupFunctionsByMemoryMapping(TRUSTED_FUNCTION_FILE_CONTENTS_GROUP, sourceRte.getComSendSignalTrustedFunction()));
			if (sourceRte.getComSendSignalImmediateTaskBody() != null) {
				destRteSource.getTaskBodyGroup().addAll(this.<TaskBodyFileContentsGroup> groupFunctionByMemoryMapping(TASK_BODY_FILE_CONTENTS_GROUP, sourceRte.getComSendSignalImmediateTaskBody()));
			}
		}
		return destRteSource;
	}

	/**
	 * RTE���������BSW�������塼��֥��������롣
	 */
	private List<BswSchedulableEntity> getRteBswSchedulableEntities(Rte sourceRte) {
		List<BswSchedulableEntity> rteBswSchedulableEntities = Lists.newArrayList();
		if (sourceRte.getComSendSignalPeriodicEntity() != null) {
			rteBswSchedulableEntities.add(sourceRte.getComSendSignalPeriodicEntity());
		}
		if (sourceRte.getComSendSignalImmediateEntity() != null) {
			rteBswSchedulableEntities.add(sourceRte.getComSendSignalImmediateEntity());
		}
		return rteBswSchedulableEntities;
	}

	private List<Constant> getInternalConstants(Rte sourceRte) {
		List<Constant> constants = Lists.newArrayList();
		constants.addAll(sourceRte.getIocInitValueConstant());

		for (Partition sourcePartition : this.context.query.<Partition> findByKind(sourceRte, PARTITION)) {
			constants.addAll(sourcePartition.getSrRteBufferInitValueConstant());
			constants.addAll(sourcePartition.getSrFilterConstant());
			constants.addAll(sourcePartition.getComProxyFunctionTableIndexConstant());
			if (sourcePartition.getComProxyFunctionTableSizeConstant() != null) {
				constants.add(sourcePartition.getComProxyFunctionTableSizeConstant());
			}
			constants.addAll(sourcePartition.getCsTfArgcConstant());
			constants.addAll(sourcePartition.getCsTfOpidConstant());
			constants.addAll(sourcePartition.getEntityStartConstant());
		}

		for (Swc sourceSwc : this.context.query.<Swc> findByKind(sourceRte, SWC)) {
			constants.addAll(sourceSwc.getSrImplInitValueConstant());
			constants.addAll(sourceSwc.getSrImplInvalidValueConstant());
			constants.addAll(sourceSwc.getSrFilterConstant());
			constants.addAll(sourceSwc.getCsPortArgValueConstant());
			constants.addAll(sourceSwc.getIrvBufferInitValueConstant());
		}

		return constants;
	}

	private List<GlobalVariable> getInternalGlobalVariables(Rte sourceRte) {
		List<GlobalVariable> globalVariables = Lists.newArrayList();
		globalVariables.addAll(this.context.query.<GlobalVariable> findByKind(sourceRte, GLOBAL_VARIABLE));

		removeGlobalVariablesShouldBeExcludedFromFileContentsModel(globalVariables);
		return globalVariables;
	}

	/**
	 * NOTE �ܥ᥽�åɤμ�����̤ˤϡ��ޥ���������BSW���֥ѡ��ƥ��������������ѡ��ƥ������ˤΤ��������륷��ܥ�ϴޤޤ�ʤ����Ȥ���ա�
	 */
	private List<GlobalVariable> getInternalGlobalVariablesDefinedForPartition(Partition sourcePartition) {
		List<GlobalVariable> globalVariables = Lists.newArrayList(this.context.query.<GlobalVariable> findByKind(sourcePartition, GLOBAL_VARIABLE));
		globalVariables.addAll(this.context.query.<GlobalVariable> findByKind(sourcePartition, GLOBAL_VARIABLE));

		removeGlobalVariablesShouldBeExcludedFromFileContentsModel(globalVariables);
		return globalVariables;
	}

	/**
	 * �ޥ���������BSWM���֥ѡ��ƥ������ˤΤ��������륰���Х��ѿ��Υꥹ�Ȥ�������롣
	 */
	private List<GlobalVariable> getInternalGlobalVariablesOnlyDefinedForMasterCoreBswPartition(Rte sourceRte, Core sourceCore, Partition sourcePartition) {
		List<GlobalVariable> globalVariables = Lists.newArrayList(this.context.query.<GlobalVariable> findByKind(sourcePartition, GLOBAL_VARIABLE));
		globalVariables.addAll(this.context.query.<GlobalVariable> collect(sourceRte.getIocInitValueVariableSet(), RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE));

		removeGlobalVariablesShouldBeExcludedFromFileContentsModel(globalVariables);
		return globalVariables;
	}

	private void removeGlobalVariablesShouldBeExcludedFromFileContentsModel(List<GlobalVariable> globalVariables) {
		// NOTE RteBufferVariableSet����������ܥ�Τ����������
		globalVariables.removeAll(this.context.query.<GlobalVariable, RteBufferVariableSet> selectByKind(globalVariables, RTE_BUFFER_VARIABLE_SET));

		// NOTE GlobalVariableSet��GlobalVariableSetñ�̤ǥե�����˽��Ϥ��뤿�ᡢ���ФϽ�������
		List<GlobalVariableSet> globalVariableSets =this.context.query.<GlobalVariableSet> findByKind(GLOBAL_VARIABLE_SET);
		for (GlobalVariableSet variableSet : globalVariableSets) {
			globalVariables.removeAll(variableSet.getGlobalVariable());
		}
	}
	
	private List<FunctionMacro> getInternalFunctionMacros(Rte sourceRte) {
		return this.context.query.<FunctionMacro> findByKind(sourceRte, FUNCTION_MACRO);
	}
	
	private List<GlobalVariableFileContentsGroup> groupGlobalVariablesByMemoryMapping(Collection<GlobalVariable> globalVariables) {
		List<GlobalVariableFileContentsGroup> groups = Lists.newArrayList();
		ListMultimap<MemoryMapping, GlobalVariable> memmap2Vars = this.context.query.groupByKey(globalVariables, GLOBAL_VARIABLE__MEMORY_MAPPING);
		for (MemoryMapping keyMemmap : memmap2Vars.keySet()) {
			GlobalVariableFileContentsGroup globalVariableFileContentsGroup = ModuleFactory.eINSTANCE.createGlobalVariableFileContentsGroup();
			globalVariableFileContentsGroup.setMemoryMapping(keyMemmap);
			globalVariableFileContentsGroup.getGlobalVariable().addAll(memmap2Vars.get(keyMemmap));
			groups.add(globalVariableFileContentsGroup);
		}
		return groups;
	}
	
	private <FG extends FunctionFileContentsGroup> List<FG> groupFunctionByMemoryMapping(EClass eGroupClass, Function function) {
		return groupFunctionsByMemoryMapping(eGroupClass, Collections.singletonList(function));
	}

	private <FG extends FunctionFileContentsGroup> List<FG> groupFunctionsByMemoryMapping(EClass eGroupClass, Collection<? extends Function> functions) {
		List<FG> groups = Lists.newArrayList();

		ListMultimap<MemoryMapping, ? extends Function> memmap2Funcs = this.context.query.groupByKey(functions, FUNCTION__MEMORY_MAPPING);
		for (MemoryMapping keyMemmap : memmap2Funcs.keySet()) {
			@SuppressWarnings("unchecked")
			FG functionGroup = (FG) ModuleFactory.eINSTANCE.create(eGroupClass);
			functionGroup.setMemoryMapping(keyMemmap);
			functionGroup.getFunction().addAll(memmap2Funcs.get(keyMemmap));
			groups.add(functionGroup);
		}
		return groups;
	}

	private Collection<RteApiFileContentsGroup> filterNotNeededRteApiGroups(List<RteApiFileContentsGroup> rteApiFileContentsGroups) {
		return Collections2.filter(rteApiFileContentsGroups, new Predicate<RteApiFileContentsGroup>() {
			@Override
			public boolean apply(RteApiFileContentsGroup input) {
				return isNeededGroup(input);
			}
		});
	}

	private Collection<RteApiFileContentsGroup> filterNotNeededRteApiGroupsForRteInternalHeader(List<RteApiFileContentsGroup> rteApiFileContentsGroups) {
		return Collections2.filter(rteApiFileContentsGroups, new Predicate<RteApiFileContentsGroup>() {
			@Override
			public boolean apply(RteApiFileContentsGroup input) {
				return isNeededGroupForRteInternalHeader(input);
			}
		});
	}

	private Collection<SchmApiFileContentsGroup> filterNotNeededSchmApiGroups(List<SchmApiFileContentsGroup> schmApiFileContentsGroups) {
		return Collections2.filter(schmApiFileContentsGroups, new Predicate<SchmApiFileContentsGroup>() {
			@Override
			public boolean apply(SchmApiFileContentsGroup input) {
				return isNeededGroup(input);
			}
		});
	}

	private boolean isNeededGroup(RteApiFileContentsGroup apiGroup) {
		for (RteApi api : apiGroup.getRteApi()) {
			if (api instanceof RteEnterApi) {
				RteEnterApi rteEnterApi = (RteEnterApi) api;
				// Rte_Enter�������ؿ�����ľ�硢�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				if (!rteEnterApi.getIsNoneExclude()) {
					return true;
				}
	
			} else if (api instanceof RteExitApi) {
				RteExitApi rteExitApi = (RteExitApi) api;
				// Rte_Exit�������ؿ�����ľ�硢�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				if (!rteExitApi.getIsNoneExclude()) {
					return true;
				}
	
			} else {
				// NOTE Rte_Enter/Exit API�ʳ���RTE API�Ͼ�˼����ؿ�����Ĥ��ᡢ�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				return true;
			}
		}
		return false;
	}

	private boolean isNeededGroupForRteInternalHeader(RteApiFileContentsGroup apiGroup) {
		for (RteApi api : apiGroup.getRteApi()) {
			if (api instanceof RteEnterApi) {
				RteEnterApi rteEnterApi = (RteEnterApi) api;
				// Rte_Enter�������ؿ�����ľ�硢�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				if (!rteEnterApi.getIsNoneExclude()) {
					return true;
				}
	
			} else if (api instanceof RteExitApi) {
				RteExitApi rteExitApi = (RteExitApi) api;
				// Rte_Exit�������ؿ�����ľ�硢�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				if (!rteExitApi.getIsNoneExclude()) {
					return true; // COVERAGE (�����ɥ�ӥ塼������ʤ����Ȥ��ǧ��isNeededGroup��Ǽ��Ӥ��ꡥ)
				}
	
			} else {
				// NOTE Rte_Enter/Exit API�ʳ���RTE API�Ͼ�˼����ؿ�����Ĥ��ᡢ�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				// ��������INLINE�Τ�Τ�extern��������פˤʤ�Τǽ�������
				if (!api.getIsInline()) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isNeededGroup(SchmApiFileContentsGroup schmGroup) {
		for (SchmApi api : schmGroup.getSchmApi()) {
			if (api instanceof SchmEnterApi) {
				SchmEnterApi rteEnterApi = (SchmEnterApi) api;
				// SchM_Enter�������ؿ�����ľ�硢�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				if (!rteEnterApi.getIsNoneExclude()) {
					return true;
				}
	
			} else if (api instanceof SchmExitApi) {
				SchmExitApi rteExitApi = (SchmExitApi) api;
				// SchM_Exit�������ؿ�����ľ�硢�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				if (!rteExitApi.getIsNoneExclude()) {
					return true;
				}
	
			} else {
				// NOTE SchM_Enter/Exit�ʳ���BSW�������塼��API�Ͼ�˼����ؿ�����Ĥ��ᡢ�����ؿ������ɬ�פ�API���롼�פǤ����Ƚ��
				return true;
			}
		}
		return false;
	}

	private boolean isEcucPartitionCollectionExists() {
		Optional<EcucPartitionCollection> foundPartitionCollection = this.context.query.tryFindSingleByKind(ECUC_PARTITION_COLLECTION);
		return foundPartitionCollection.isPresent();
	}

	/**
	 * ����ޥåԥ󥰥إå��Υե������ǥ���ۤ��롣
	 */
	public void buildMemoryMappingHeaders() {
		RteModule targetRteModule = this.context.cache.rteModule;
		Rte sourceRte = this.context.cache.rte;

		targetRteModule.setBswMemoryMappingHeader(createBswMemoryMappingHeader(sourceRte));

		for (Swc sourceSwc : this.context.query.<Swc> findByKind(SWC)) {
			targetRteModule.getSwcMemoryMappingHeader().add(createSwcMemoryMappingHeader(sourceSwc));
		}
	}

	private SwcMemoryMappingHeader createSwcMemoryMappingHeader(Swc sourceSwc) {
		SwcMemoryMappingHeader destSwcMemoryMappingHeader = ModuleFactory.eINSTANCE.createSwcMemoryMappingHeader();
		destSwcMemoryMappingHeader.setFileName(FileNames.createSwcMemoryMappingHeaderFileName(sourceSwc));
		destSwcMemoryMappingHeader.getMemoryMapping().addAll(sourceSwc.getSwcMemoryMapping());
		return destSwcMemoryMappingHeader;
	}

	private BswMemoryMappingHeader createBswMemoryMappingHeader(Rte sourceRte) {
		BswMemoryMappingHeader destBswMemoryMappingHeader = ModuleFactory.eINSTANCE.createBswMemoryMappingHeader();
		destBswMemoryMappingHeader.setFileName(FileNames.BSW_MEMORY_MAPPING_HEADER_FILE_NAME);
		destBswMemoryMappingHeader.getMemoryMapping().addAll(sourceRte.getRteMemoryMapping());
		return destBswMemoryMappingHeader;
	}

	/**
	 * ��������Υ�ǥ���ۤ��롣
	 */
	public void buildGenerationInfo() {
		for (File targetFile : this.context.query.<File> findByKind(FILE)) {
			targetFile.setGenerationInfo(this.context.cache.rte.getGenerationInfo());
		}
	}

	/**
	 * �ե������ǥ���˴ޤޤ�륷��ܥ�򥽡��Ȥ��롣
	 */
	public void sortFileContents() {
		for (File targetFile : this.context.query.<File> findByKind(FILE)) {
			this.moduleModelSorter.sortFileContents(targetFile);
		}
	}
}
