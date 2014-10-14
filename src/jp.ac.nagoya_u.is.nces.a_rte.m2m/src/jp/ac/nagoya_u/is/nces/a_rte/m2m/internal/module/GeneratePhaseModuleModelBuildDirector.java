/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_REFERRABLE;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.BuiltinSymbolModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.ComApiModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.IocCommunicationModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.LogicalCompartmentModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.ModuleModelBuildContext;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.OsApiModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.RteFileModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.RteFunctionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.RteStaticSymbolModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.SourceModelCacheBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.util.ModuleModelUtils;

public class GeneratePhaseModuleModelBuildDirector implements IModuleModelBuildDirector {

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.IModuleModelBuildDirector#build(jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder.ModuleModelBuildContext)
	 */
	@Override
	public void build(ModuleModelBuildContext context) throws M2MException {
		ModuleRoot moduleRoot = ModuleFactory.eINSTANCE.createModuleRoot();
		context.eResource.getContents().add(moduleRoot);
		context.cache.moduleRoot = moduleRoot;

		try {
			// ��������ǥ�Υ���å������
			SourceModelCacheBuilder sourceModelCacheBuilder = new SourceModelCacheBuilder(context);
			sourceModelCacheBuilder.build();

			// �⥸�塼���ǥ��������¤�ι���
			LogicalCompartmentModelBuilder logicalCompartmentModelBuilder = new LogicalCompartmentModelBuilder(context);
			logicalCompartmentModelBuilder.buildFromSystem();

			// ���췿��ǥ�ι���
			BuiltinSymbolModelBuilder builtinTypeBuilder = new BuiltinSymbolModelBuilder(context);
			builtinTypeBuilder.build();

			// RTE����Ū����ܥ��ǥ�ι���
			RteStaticSymbolModelBuilder rteStaticSymbolModelBuilder = new RteStaticSymbolModelBuilder(context);
			rteStaticSymbolModelBuilder.buildApiSymbols();
			rteStaticSymbolModelBuilder.buildImplSymbols();

			// OS/COM��ǥ�ι���
			OsApiModelBuilder osApiModelBuilder = new OsApiModelBuilder(context);
			osApiModelBuilder.build();

			IocCommunicationModelBuilder iocCommunicationModelBuilder = new IocCommunicationModelBuilder(context);
			iocCommunicationModelBuilder.build();

			ComApiModelBuilder comApiModelBuilder = new ComApiModelBuilder(context);
			comApiModelBuilder.build();

			// RTE�δؿ���ǥ�ι���
			RteFunctionModelBuilder rteApiBuilder = new RteFunctionModelBuilder(context);
			rteApiBuilder.buildApiFunctions();
			rteApiBuilder.buildImplFunctions();

			// RTE�Υե������ǥ�ι���
			RteFileModelBuilder fileBuilder = new RteFileModelBuilder(context);
			fileBuilder.buildRoot();
			fileBuilder.buildApiFiles();
			fileBuilder.buildImplFiles();
			if (context.options.doesGenerateMemoryMappingHeaderSkelton) {
				fileBuilder.buildMemoryMappingHeaders();
			}
			fileBuilder.buildGenerationInfo();
			fileBuilder.sortFileContents();

			// ��ǥ��ID���꿶��
			buildModelIds(context);
		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new M2MException("Internal error occurred while building RTE code structures.", e);
		}
	}

	private void buildModelIds(ModuleModelBuildContext context) {
		int idIndex = 1;
		for (ModuleReferrable referrable : context.query.<ModuleReferrable> findByKind(MODULE_REFERRABLE)) {
			referrable.setId(ModuleModelUtils.ID_PREFIX + referrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}
}
