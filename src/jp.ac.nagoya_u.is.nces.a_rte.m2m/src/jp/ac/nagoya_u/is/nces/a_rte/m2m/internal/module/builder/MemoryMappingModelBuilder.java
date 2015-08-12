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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping;

import com.google.common.base.Optional;

public class MemoryMappingModelBuilder {

	private final ModuleModelBuildContext context;

	public MemoryMappingModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public MemoryMapping buildDataElementMemoryMapping(Optional<EcucPartition> sourcePartition, VariableDataInstanceInComposition sourceDataInstanceInComposition) throws ModelException {
		SwAddrMethod swAddrMethod = this.context.query.get(sourceDataInstanceInComposition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION);
		String alignment = this.context.query.get(sourceDataInstanceInComposition.getPrototype(), VARIABLE_DATA_INSTANCE_IN_SWC_EX___GET_MEMORY_MAPPING_ALIGNMENT__VARIABLEDATAINSTANCEINSWC);
		String memorySectionName = swAddrMethod != null ? SymbolNames.createVariableMemorySectionName(swAddrMethod, Optional.fromNullable(alignment)) : SymbolNames
				.createVariableMemorySectionName(sourcePartition);

		return buildRteMemoryMapping(memorySectionName);
	}

	public MemoryMapping buildDataElementMemoryMapping(Optional<EcucPartition> sourcePartition, VariableDataPrototype prototype) {
		SwAddrMethod swAddrMethod =prototype.getSwAddrMethod();
		String alignment = prototype.getSwAlignment();
		String memorySectionName = swAddrMethod != null ? SymbolNames.createVariableMemorySectionName(swAddrMethod, Optional.fromNullable(alignment)) : SymbolNames
				.createVariableMemorySectionName(sourcePartition);

		return buildRteMemoryMapping(memorySectionName);
	}

	public MemoryMapping buildModeDeclarationMemoryMapping(Optional<EcucPartition> sourcePartition, ModeDeclarationGroupPrototype prototype) {
		String memorySectionName = SymbolNames.createVariableMemorySectionName(sourcePartition);
		return buildRteMemoryMapping(memorySectionName);
	}
	
	public MemoryMapping buildRteVariableMemoryMapping(Optional<EcucPartition> sourcePartition) {
		String memorySectionName = SymbolNames.createVariableMemorySectionName(sourcePartition);
		return buildRteMemoryMapping(memorySectionName);
	}

	public MemoryMapping buildRteFunctionMemoryMapping(Optional<EcucPartition> sourcePartition) {
		String memorySectionName = SymbolNames.createFunctionMemorySectionName(sourcePartition);
		return buildRteMemoryMapping(memorySectionName);
	}

	private BswMemoryMapping buildRteMemoryMapping(String memorySectionName) {
		Optional<BswMemoryMapping> foundMemoryMapping = this.context.query.trySelectSingle(this.context.cache.rte.getRteMemoryMapping(),
				hasAttr(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, memorySectionName));
		if (foundMemoryMapping.isPresent()) {
			return foundMemoryMapping.get();

		} else {
			BswMemoryMapping memoryMapping = ModuleFactory.eINSTANCE.createBswMemoryMapping();
			memoryMapping.setPrefix(SymbolNames.RTE_MEMORY_MAPPING_PREFIX);
			memoryMapping.setMemorySectionSymbolName(memorySectionName);
			this.context.cache.rte.getRteMemoryMapping().add(memoryMapping);
			return memoryMapping;
		}
	}

	public SwcMemoryMapping buildRunnableEntityMemoryMapping(Swc targetSwc, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity sourceRunnableEntity) {
		String memorySectionName = sourceRunnableEntity.getSwAddrMethod() != null ? SymbolNames.createFunctionMemorySectionName(sourceRunnableEntity.getSwAddrMethod())
				: SymbolNames.createSwcFunctionMemorySectionName();

		return buildSwcMemoryMapping(targetSwc, memorySectionName);
	}

	public BswMemoryMapping buildBswSchedulableEntityMemoryMapping(PartedBswm targetPartedBswm, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity sourceBswSchedulableEntity) {
		String memorySectionName = sourceBswSchedulableEntity.getSwAddrMethod() != null ? SymbolNames.createFunctionMemorySectionName(sourceBswSchedulableEntity.getSwAddrMethod())
				: SymbolNames.createSwcFunctionMemorySectionName();

		return buildBswmMemoryMapping(targetPartedBswm, memorySectionName);
	}

	private BswMemoryMapping buildBswmMemoryMapping(PartedBswm targetPartedBswm, String memorySectionName) {
		Optional<BswMemoryMapping> foundMemoryMapping = this.context.query.trySelectSingle(targetPartedBswm.getBswMemoryMapping(),
				hasAttr(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, memorySectionName));
		if (foundMemoryMapping.isPresent()) {
			return foundMemoryMapping.get();

		} else {
			BswMemoryMapping memoryMapping = ModuleFactory.eINSTANCE.createBswMemoryMapping();
			memoryMapping.setPrefix(generateSnp(targetPartedBswm.getBswm()));
			memoryMapping.setMemorySectionSymbolName(memorySectionName);
			targetPartedBswm.getBswMemoryMapping().add(memoryMapping);
			return memoryMapping;
		}
	}

	private SwcMemoryMapping buildSwcMemoryMapping(Swc targetSwc, String memorySectionName) {
		Optional<SwcMemoryMapping> foundMemoryMapping = this.context.query.trySelectSingle(targetSwc.getSwcMemoryMapping(),
				hasAttr(MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, memorySectionName));
		if (foundMemoryMapping.isPresent()) {
			return foundMemoryMapping.get();

		} else {
			SwcMemoryMapping memoryMapping = ModuleFactory.eINSTANCE.createSwcMemoryMapping();
			memoryMapping.setPrefix(targetSwc.getCompartmentName());
			memoryMapping.setMemorySectionSymbolName(memorySectionName);
			targetSwc.getSwcMemoryMapping().add(memoryMapping);
			return memoryMapping;
		}
	}
	
	private String generateSnp(Bswm targetBswm) {
		// SectionNamePrefix���б�������Ϥ������ѹ�����ɬ�פ���
		return ((BswModuleDescription) targetBswm.getSingleSource()).getShortName();	
	}
}
