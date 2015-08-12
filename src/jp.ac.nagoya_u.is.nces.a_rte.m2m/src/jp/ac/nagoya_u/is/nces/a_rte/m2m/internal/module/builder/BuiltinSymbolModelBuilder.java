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

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum;

/**
 * �ȹ�����ܥ�Υ�ǥ���ۤ��ޤ���
 * 
 * �ȹ�����ܥ�ϡ�����ե������Ƥ˴ؤ�餺���Ƥ�����Υ���ܥ�(������������¦�Ƿ���Ǥ�����Ƥ�����)��ɽ����
 */
public class BuiltinSymbolModelBuilder {

	private final ModuleModelBuildContext context;

	public BuiltinSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() {
		buildBuiltinTypes(this.context.cache.rte);
		buildBuiltinConstants(this.context.cache.rte);
	}

	private void buildBuiltinTypes(Rte targetRte) {
		this.context.cache.voidType = buildBuiltinBlackboxType(targetRte, SymbolNames.VOID_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.booleanType = buildBuiltinPrimitiveType(targetRte, SymbolNames.BOOLEAN_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.uint8Type = buildBuiltinPrimitiveType(targetRte, SymbolNames.UINT8_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.uint16Type = buildBuiltinPrimitiveType(targetRte, SymbolNames.UINT16_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.uint32Type = buildBuiltinPrimitiveType(targetRte, SymbolNames.UINT32_TYPE_NAME, SignednessEnum.UNSIGNED);

		this.context.cache.stdReturnType = buildBuiltinPrimitiveType(targetRte, SymbolNames.STD_RETURN_TYPE_NAME, SignednessEnum.UNSIGNED);

		this.context.cache.osStatusType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_STATUS_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osApplicationType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_APPLICATION_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osTaskType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_TASK_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osEventMaskType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_EVENT_MASK_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osResourceType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_RESOURCE_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osSpinlockIdType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_SPINLOCK_ID_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osTfIndexType = buildBuiltinPrimitiveType(targetRte, SymbolNames.OS_TRUSTED_FUNCTION_INDEX_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.osTfParamRefType = buildBuiltinBlackboxType(targetRte, SymbolNames.OS_TRUSTED_FUNCTION_PARAMETER_REF_TYPE_NAME, SignednessEnum.UNSIGNED);

		this.context.cache.comSignalIdType = buildBuiltinPrimitiveType(targetRte, SymbolNames.COM_SIGNAL_ID_TYPE_NAME, SignednessEnum.UNSIGNED);
		
		this.context.cache.comMetaDataTypeMemberOffsetType = buildBuiltinBlackboxType(targetRte, SymbolNames.COM_META_DATA_TYPE_MEMBER_OFFSET_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.comMetaDataType = buildBuiltinBlackboxType(targetRte, SymbolNames.COM_META_DATA_TYPE_NAME, SignednessEnum.UNSIGNED);
		this.context.cache.comProxyFunctionTableIndexType = buildBuiltinPrimitiveType(targetRte, SymbolNames.COM_PROXY_FUNCTION_TABLE_INDEX_TYPE_NAME, SignednessEnum.UNSIGNED);
	}

	private PrimitiveType buildBuiltinPrimitiveType(Rte targetRte, String symbolName, SignednessEnum signedness) {
		PrimitiveType type = ModuleFactory.eINSTANCE.createPrimitiveType();
		type.setSymbolName(symbolName);
		type.setSignedness(signedness);
		targetRte.getDependentType().add(type);
		return type;
	}

	private BlackboxType buildBuiltinBlackboxType(Rte targetRte, String symbolName, SignednessEnum signedness) {
		BlackboxType type = ModuleFactory.eINSTANCE.createBlackboxType();
		type.setSymbolName(symbolName);
		type.setSignedness(signedness);
		targetRte.getDependentType().add(type);
		return type;
	}

	private void buildBuiltinConstants(Rte targetRte) {
		this.context.cache.rteErrorOkConstant = createBuiltinConstant(SymbolNames.RTE_E_OK_CONSTANT_NAME);
		targetRte.getDependentConstant().add(this.context.cache.rteErrorOkConstant);

		this.context.cache.rteErrorInvalidConstant = createBuiltinConstant(SymbolNames.RTE_E_INVALID_CONSTANT_NAME);
		targetRte.getDependentConstant().add(this.context.cache.rteErrorInvalidConstant);

		this.context.cache.rteErrorMaxAgeExceededConstant = createBuiltinConstant(SymbolNames.RTE_E_MAX_AGE_EXCEEDED_CONSTANT_NAME);
		targetRte.getDependentConstant().add(this.context.cache.rteErrorMaxAgeExceededConstant);
	}

	private Constant createBuiltinConstant(String symbolName) {
		Constant constant = ModuleFactory.eINSTANCE.createConstant();
		constant.setSymbolName(symbolName);
		return constant;
	}
}
