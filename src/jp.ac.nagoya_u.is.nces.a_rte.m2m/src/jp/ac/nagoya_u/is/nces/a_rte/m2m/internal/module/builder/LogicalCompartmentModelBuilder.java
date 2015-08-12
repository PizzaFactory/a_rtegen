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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
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

public class LogicalCompartmentModelBuilder {
	private final ModuleModelBuildContext context;

	public LogicalCompartmentModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

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

	public void buildFromSwcAndBswm() throws ModelException {
		buildRoot();
		buildFromSwcAndBswm(this.context.cache.rte);
	}

	private void buildFromSwcAndBswm(Rte targetRte) throws ModelException {
		Core core = createDefaultCore();
		targetRte.getCore().add(core);

		Partition partition = createDefaultPartition();
		core.getPartition().add(partition);

		for (AtomicSwComponentType swComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			partition.getSwc().add(createSwc(swComponentType));
		}

		for (BswModuleDescription bswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			BswInternalBehavior internalBehavior = bswModuleDescription.getEnableInternalBehavior();
			if (internalBehavior == null) {
				continue;
			}

			Bswm bswm = createBswm(bswModuleDescription);
			targetRte.getBswm().add(bswm);

			// ���������塼���֥��partedBswm����Ͽ����
			for (BswSchedulableEntity entity : internalBehavior.getBswSchedulableEntity()) {
				PartedBswm partedBswm = createPartedBswm(bswm, partition);
				ExecutableEntity executableEntity = createExecutableEntity(entity, generateBswSchedulerNamePrefix(bswModuleDescription));
				partedBswm.getDependentExecutableEntity().add(executableEntity);
			}
		}

		// �ޥ���������BSWM���֥ѡ��ƥ������򥭥�å���
		this.context.cache.masterBswPartition = partition;
	}
	
	private void buildBswm(Rte targetRte) throws ModelException {
		for (BswModuleDescription bswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			BswInternalBehavior internalBehavior = bswModuleDescription.getEnableInternalBehavior();
			if (internalBehavior == null) {
				continue;
			}
			Bswm bswm = createBswm(bswModuleDescription);
			targetRte.getBswm().add(bswm);

			// ���������塼���֥��partedBswm����Ͽ����
			for (BswSchedulableEntity entity : internalBehavior.getBswSchedulableEntity()) {
				Collection<EcucPartition> usingEcucPartitions = this.context.query.get(entity, BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY);
				EcucPartition usingEcucPartition = Iterables.getFirst(usingEcucPartitions, null); // NOTE nrte_sws_0345�ˤ�ꡢ�⡼��������롼�ץץ�ȥ����פ���Ѥ���ѡ��ƥ�������¿���٤�0..1
				Partition targetPartition = this.context.builtQuery.findPartition(usingEcucPartition);
				
				PartedBswm partedBswm = createPartedBswm(bswm, targetPartition);
				ExecutableEntity executableEntity = createExecutableEntity(entity, generateBswSchedulerNamePrefix(bswModuleDescription));
				partedBswm.getDependentExecutableEntity().add(executableEntity);
			}
		}
	}

	private void buildRoot() {
		Rte rte = ModuleFactory.eINSTANCE.createRte();
		rte.setGenerationInfo(createGenerationInfo());
		this.context.cache.moduleRoot.setRte(rte);
		this.context.cache.rte = rte;
	}

	private GenerationInfo createGenerationInfo() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		GenerationInfo generationInfo = ModuleFactory.eINSTANCE.createGenerationInfo();
		generationInfo.setGeneratorName(GeneratorInfos.GENERATOR_TOOL_NAME);
		generationInfo.setGeneratorVersion(GeneratorInfos.GENERATOR_VERSION);
		if (context.options.writeGenerationTimeStamp) {
			generationInfo.setGenerationDate(format.format(new Date()));
		}
		return generationInfo;
	}

	private void buildFromPartitionedSystem(Rte targetRte, EcucPartitionCollection sourceEcucPartitionCollection) throws ModelException {
		OsOS osOs = this.context.query.findSingleByKind(OS_OS);

		for (Integer coreId : sourceEcucPartitionCollection.getAssignedCores()) {
			targetRte.getCore().add(createCore(coreId, osOs));
		}

		for (EcucPartition ecucPartition : sourceEcucPartitionCollection.getEcucPartition()) {
			Core ownerCore = this.context.query.findSingle(hasAttr(CORE__CORE_ID, ecucPartition.getOwnerCore()));

			Partition partition = createPartition(ecucPartition);
			ownerCore.getPartition().add(partition);

			for (SwComponentInstanceInSystem swComponentInstanceInSystem : ecucPartition.getEcucPartitionSoftwareComponent()) {
				partition.getSwc().add(createSwc(swComponentInstanceInSystem.getPrototype().getType()));
			}
		}

		// �ޥ���������BSWM���֥ѡ��ƥ������򥭥�å���
		this.context.cache.masterBswPartition = this.context.builtQuery.findPartition(this.context.cache.sourceMasterBswPartition.get()); // NOTE �ѡ��ƥ���������Ǥϥޥ���������BSWM���֥ѡ��ƥ�������ɬ��¸�ߤ���
	}

	private void buildFromNonPartitionedSystem(Rte targetRte) {
		Core core = createDefaultCore();
		targetRte.getCore().add(core);

		Partition partition = createDefaultPartition();
		core.getPartition().add(partition);

		for (SwComponentInstanceInSystem swComponentInstanceInSystem : this.context.query.<SwComponentInstanceInSystem> findByKind(SW_COMPONENT_INSTANCE_IN_SYSTEM)) {
			Swc swc = createSwc(swComponentInstanceInSystem.getPrototype().getType());
			partition.getSwc().add(swc);
		}

		// �ޥ���������BSWM���֥ѡ��ƥ������򥭥�å���
		this.context.cache.masterBswPartition = partition;
	}

	private Core createDefaultCore() {
		Core core = ModuleFactory.eINSTANCE.createCore();
		core.setCompartmentName(String.valueOf(ConfigValues.DEFAULT_CORE_ID));
		core.setCoreId(ConfigValues.DEFAULT_CORE_ID);
		core.setIsMasterCore(true);
		return core;
	}

	private Core createCore(Integer sourceCoreId, OsOS osOs) throws ModelException {
		Core core = ModuleFactory.eINSTANCE.createCore();
		core.setCompartmentName(String.valueOf(sourceCoreId));
		core.setCoreId(sourceCoreId);
		core.setIsMasterCore(Objects.equal(osOs.getOsMasterCoreId(), core.getCoreId()));
		return core;
	}

	private Partition createDefaultPartition() {
		Partition partition = ModuleFactory.eINSTANCE.createPartition();
		partition.setCompartmentName("DefaultPartition");
		return partition;
	}

	private Partition createPartition(EcucPartition sourceEcucPartition) {
		Partition partition = ModuleFactory.eINSTANCE.createPartition();
		partition.setCompartmentName(sourceEcucPartition.getShortName());
		partition.setIsBswPartition(sourceEcucPartition.getEcucPartitionBswModuleExecution());
		partition.setSingleSource(sourceEcucPartition);
		return partition;
	}

	private Swc createSwc(SwComponentType sourceSwComponentType) {
		Swc swc = ModuleFactory.eINSTANCE.createSwc();
		swc.setCompartmentName(sourceSwComponentType.getShortName());
		swc.setSingleSource(sourceSwComponentType);
		return swc;
	}

	private Bswm createBswm(BswModuleDescription sourceBswModuleDescription) {
		Bswm bswm = ModuleFactory.eINSTANCE.createBswm();
		bswm.setCompartmentName(generateBswSchedulerNamePrefix(sourceBswModuleDescription));
		bswm.setSingleSource(sourceBswModuleDescription);
		return bswm;
	}
	
	private PartedBswm createPartedBswm(Bswm bswm, Partition targetPartition) {
		PartedBswm partedBswm = bswm.getSinglePartedBswm(targetPartition);
		if (partedBswm == null) {
			partedBswm = ModuleFactory.eINSTANCE.createPartedBswm();
			targetPartition.getPartedBswm().add(partedBswm);
			bswm.getPartedBswm().add(partedBswm);
		}		
		return partedBswm;
	}
	
	private String generateBswSchedulerNamePrefix(BswModuleDescription sourceBswModuleDescription) {
		// ��������ñ���BswModuleDescription�Υ��硼�ȥ͡����<bsnp>�Ȥ���.
		// BswSchedulerNamePrefix���饹����Ѥ���<bsnp>�������б�������ϡ��ܴؿ��������뤳��.
		return sourceBswModuleDescription.getShortName();
	}
	
	private ExecutableEntity createExecutableEntity(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity sourceEntity, String bsnp) throws ModelException {
		ExecutableEntity executableEntity = ModuleFactory.eINSTANCE.createExecutableEntity();
		executableEntity.setSingleSource(sourceEntity);
		executableEntity.setSymbolName(bsnp + "_" + sourceEntity.getImplementedEntry().getShortName());
		return executableEntity;
	}
}
