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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION_COLLECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_OS;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.SW_COMPONENT_INSTANCE_IN_SYSTEM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CORE__CORE_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.ConfigValues;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartitionCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsOS;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.GeneratorInfos;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

/**
 * �������Υ�ǥ���ۤ��롣
 */
public class LogicalCompartmentModelBuilder {
	private final ModuleModelBuildContext context;

	public LogicalCompartmentModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	/**
	 * �����ƥॳ��ե����졼����󤫤��������Υ�ǥ���ۤ��롣
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildFromSystem() throws ModelException {
		buildRoot();

		Optional<EcucPartitionCollection> ecucPartitionCollection = this.context.query.tryFindSingleByKind(ECUC_PARTITION_COLLECTION);
		if (ecucPartitionCollection.isPresent()) {
			// �ѡ��ƥ�����󤢤깽��
			buildFromPartitionedSystem(this.context.cache.rte, ecucPartitionCollection.get());
		} else {
			// �ѡ��ƥ������ʤ�����
			buildFromNonPartitionedSystem(this.context.cache.rte);
		}
		
		buildBswm(this.context.cache.rte);
	}

	/**
	 * SW-C��BSWM�Υ���ե����졼����󤫤��������Υ�ǥ���ۤ��롣
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildFromSwcAndBswm() throws ModelException {
		buildRoot();
		buildFromSwcAndBswm(this.context.cache.rte);
	}

	private void buildFromSwcAndBswm(Rte targetRte) {
		Core destCore = createDefaultCore();
		targetRte.getCore().add(destCore);

		Partition destPartition = createDefaultPartition();
		destCore.getPartition().add(destPartition);

		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			destPartition.getSwc().add(createSwc(sourceSwComponentType));
		}

		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			BswInternalBehavior internalBehavior = sourceBswModuleDescription.getEnableInternalBehavior();
			if (internalBehavior == null) {
				continue;
			}

			Bswm destBswm = createBswm(sourceBswModuleDescription);
			targetRte.getBswm().add(destBswm);

			// ���������塼���֥��partedBswm����Ͽ����
			for (BswSchedulableEntity sourceBswSchedulableEntity : internalBehavior.getBswSchedulableEntity()) {
				PartedBswm targetPartedBswm = createPartedBswm(destBswm, destPartition);
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity destBswSchedulableEntity = createBswSchedulableEntity(sourceBswSchedulableEntity, sourceBswModuleDescription);
				targetPartedBswm.getDependentBswSchedulableEntity().add(destBswSchedulableEntity);
			}
		}

		// �ޥ���������BSWM���֥ѡ��ƥ������򥭥�å���
		this.context.cache.masterBswPartition = destPartition;
	}
	
	private void buildBswm(Rte targetRte) throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			BswInternalBehavior internalBehavior = sourceBswModuleDescription.getEnableInternalBehavior();
			if (internalBehavior == null) {
				continue;
			}
			Bswm bswm = createBswm(sourceBswModuleDescription);
			targetRte.getBswm().add(bswm);

			// ���������塼���֥��partedBswm����Ͽ����
			for (BswSchedulableEntity sourceBswSchedulableEntity : internalBehavior.getBswSchedulableEntity()) {
				Collection<EcucPartition> usingEcucPartitions = this.context.query.get(sourceBswSchedulableEntity, BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY);
				EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345�ˤ�ꡢ�⡼��������롼�ץץ�ȥ����פ���Ѥ���ѡ��ƥ�������¿���٤�0..1
				Partition targetPartition = this.context.builtQuery.findDestPartition(usingEcucPartition);
				
				PartedBswm targetPartedBswm = createPartedBswm(bswm, targetPartition);
				jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity destBswSchedulableEntity = createBswSchedulableEntity(sourceBswSchedulableEntity, sourceBswModuleDescription);
				targetPartedBswm.getDependentBswSchedulableEntity().add(destBswSchedulableEntity);
			}
		}
	}

	private void buildRoot() {
		Rte destRte = ModuleFactory.eINSTANCE.createRte();
		destRte.setGenerationInfo(createGenerationInfo());
		this.context.cache.moduleRoot.setRte(destRte);
		this.context.cache.rte = destRte;
	}

	private GenerationInfo createGenerationInfo() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		GenerationInfo destGenerationInfo = ModuleFactory.eINSTANCE.createGenerationInfo();
		destGenerationInfo.setGeneratorName(GeneratorInfos.GENERATOR_TOOL_NAME);
		destGenerationInfo.setGeneratorVersion(GeneratorInfos.GENERATOR_VERSION);
		if (context.options.writeGenerationTimeStamp) {
			destGenerationInfo.setGenerationDate(format.format(new Date()));
		}
		return destGenerationInfo;
	}

	private void buildFromPartitionedSystem(Rte targetRte, EcucPartitionCollection sourceEcucPartitionCollection) throws ModelException {
		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		for (Integer sourceCoreId : sourceEcucPartitionCollection.getAssignedCores()) {
			targetRte.getCore().add(createCore(sourceCoreId, osOs));
		}

		for (EcucPartition sourceEcucPartition : sourceEcucPartitionCollection.getEcucPartition()) {
			Core targetOwnerCore = this.context.query.findSingle(hasAttr(CORE__CORE_ID, sourceEcucPartition.getOwnerCore()));

			Partition destPartition = createPartition(sourceEcucPartition);
			targetOwnerCore.getPartition().add(destPartition);

			for (SwComponentInstanceInSystem sourceSwComponentInstanceInSystem : sourceEcucPartition.getEcucPartitionSoftwareComponent()) {
				destPartition.getSwc().add(createSwc(sourceSwComponentInstanceInSystem.getPrototype().getType()));
			}
		}

		// �ޥ���������BSWM���֥ѡ��ƥ������򥭥�å���
		this.context.cache.masterBswPartition = this.context.builtQuery.findDestPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE �ѡ��ƥ���������Ǥϥޥ���������BSWM���֥ѡ��ƥ�������ɬ��¸�ߤ���
	}

	private void buildFromNonPartitionedSystem(Rte targetRte) {
		Core destCore = createDefaultCore();
		targetRte.getCore().add(destCore);

		Partition destPartition = createDefaultPartition();
		destCore.getPartition().add(destPartition);

		for (SwComponentInstanceInSystem sourceSwComponentInstanceInSystem : this.context.query.<SwComponentInstanceInSystem> findByKind(SW_COMPONENT_INSTANCE_IN_SYSTEM)) {
			Swc destSwc = createSwc(sourceSwComponentInstanceInSystem.getPrototype().getType());
			destPartition.getSwc().add(destSwc);
		}

		// �ޥ���������BSWM���֥ѡ��ƥ������򥭥�å���
		this.context.cache.masterBswPartition = destPartition;
	}

	private Core createDefaultCore() {
		Core destCore = ModuleFactory.eINSTANCE.createCore();
		destCore.setCompartmentName(String.valueOf(ConfigValues.DEFAULT_CORE_ID));
		destCore.setCoreId(ConfigValues.DEFAULT_CORE_ID);
		destCore.setIsMasterCore(true);
		return destCore;
	}

	private Core createCore(Integer sourceCoreId, OsOS osOs) {
		Core destCore = ModuleFactory.eINSTANCE.createCore();
		destCore.setCompartmentName(String.valueOf(sourceCoreId));
		destCore.setCoreId(sourceCoreId);
		destCore.setIsMasterCore(Objects.equal(osOs.getOsMasterCoreId(), destCore.getCoreId()));
		return destCore;
	}

	private Partition createDefaultPartition() {
		Partition partition = ModuleFactory.eINSTANCE.createPartition();
		partition.setCompartmentName("DefaultPartition");
		return partition;
	}

	private Partition createPartition(EcucPartition sourceEcucPartition) {
		Partition destPartition = ModuleFactory.eINSTANCE.createPartition();
		destPartition.setCompartmentName(sourceEcucPartition.getShortName());
		destPartition.setIsBswPartition(sourceEcucPartition.getEcucPartitionBswModuleExecution());
		destPartition.setSingleSource(sourceEcucPartition);
		return destPartition;
	}

	private Swc createSwc(SwComponentType sourceSwComponentType) {
		Swc destSwc = ModuleFactory.eINSTANCE.createSwc();
		destSwc.setCompartmentName(sourceSwComponentType.getShortName());
		destSwc.setSingleSource(sourceSwComponentType);
		return destSwc;
	}

	private Bswm createBswm(BswModuleDescription sourceBswModuleDescription) {
		Bswm destBswm = ModuleFactory.eINSTANCE.createBswm();
		destBswm.setCompartmentName(Identifiers.getBswSchedulerNamePrefix(sourceBswModuleDescription));
		destBswm.setSingleSource(sourceBswModuleDescription);
		return destBswm;
	}
	
	private PartedBswm createPartedBswm(Bswm targetBswm, Partition targetPartition) {
		PartedBswm destPartedBswm = targetBswm.getSinglePartedBswm(targetPartition);
		if (destPartedBswm == null) {
			destPartedBswm = ModuleFactory.eINSTANCE.createPartedBswm();
			targetPartition.getPartedBswm().add(destPartedBswm);
			targetBswm.getPartedBswm().add(destPartedBswm);
		}
		return destPartedBswm;
	}
	
	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity createBswSchedulableEntity(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity sourceBswModuleEntity, BswModuleDescription sourceBswModuleDescription) {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity destEntity = ModuleFactory.eINSTANCE.createBswSchedulableEntity();
		destEntity.setSingleSource(sourceBswModuleEntity);
		destEntity.setSymbolName(SymbolNames.createBswSchedulableEntityName(sourceBswModuleDescription, sourceBswModuleEntity));
		return destEntity;
	}
}
