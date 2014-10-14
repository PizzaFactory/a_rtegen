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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation;

public class ExcludeOperationModelBuilder {

	@SuppressWarnings("unused")
	private final ModuleModelBuildContext context;

	public ExcludeOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
	}

	public ExcludeOperation createExcludeOperation(ExclusiveArea sourceExclusiveArea) {
		RteExclusiveAreaImplMechanismEnum rteExclusiveAreaImplMechanismEnum;
		String osResourceId = "", osSpinlockId = "";

		if (sourceExclusiveArea.getSwcConfig().isEmpty() == false) {
			RteExclusiveAreaImplementation rteExclusiveAreaImplementation = sourceExclusiveArea.getSwcConfig().get(0);
			rteExclusiveAreaImplMechanismEnum = rteExclusiveAreaImplementation.getRteExclusiveAreaImplMechanism();
			if (rteExclusiveAreaImplementation.getRteExclusiveAreaOsResource() != null) {
				osResourceId = rteExclusiveAreaImplementation.getRteExclusiveAreaOsResource().getShortName();
			}
			if (rteExclusiveAreaImplementation.getRteExclusiveAreaOsSpinlock() != null) {
				osSpinlockId = rteExclusiveAreaImplementation.getRteExclusiveAreaOsSpinlock().getShortName();
			}
		} else {
			RteBswExclusiveAreaImpl rteBswExclusiveAreaImpl = sourceExclusiveArea.getBswConfig().get(0);
			rteExclusiveAreaImplMechanismEnum = sourceExclusiveArea.getBswConfig().get(0).getRteExclusiveAreaImplMechanism();
			if (rteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsResource() != null) {
				osResourceId = rteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsResource().getShortName();
			}	
			if (rteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsSpinlock() != null) {
				osSpinlockId = rteBswExclusiveAreaImpl.getRteBswExclusiveAreaOsSpinlock().getShortName();
			}
		}
		
		switch (rteExclusiveAreaImplMechanismEnum) {
		case OS_INTERRUPT_BLOCKING: {
			return createOsInterruptBlockExcludeOperation();
		}
		case OS_RESOURCE: {
			return createOsResourceExcludeOperation(osResourceId);
		}
		case OS_SPINLOCK: {
			return createOsSpinlockExcludeOperation(osSpinlockId);
		}
		case ALL_INTERRUPT_BLOCKING: {
			return createAllInterruptBlockExcludeOperation();
		}
		case COOPERATIVE_RUNNABLE_PLACEMENT:
		default: { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			assert false;
			return null;
		}
		}
	}

	public ExcludeOperation createExcludeOperationForRteInternalLock(boolean isInterCoreLock) {
		if (isInterCoreLock) {
			return createOsSpinlockExcludeOperation(Identifiers.RTE_INTERNAL_SPINLOCK_NAME);
		} else {
			return createAllInterruptBlockExcludeOperation();
		}
	}

	private AllInterruptBlockExcludeOperation createAllInterruptBlockExcludeOperation() {
		return ModuleFactory.eINSTANCE.createAllInterruptBlockExcludeOperation();
	}

	private OsInterruptBlockExcludeOperation createOsInterruptBlockExcludeOperation() {
		return ModuleFactory.eINSTANCE.createOsInterruptBlockExcludeOperation();
	}

	private OsResourceExcludeOperation createOsResourceExcludeOperation(String osResourceId) {
		OsResourceExcludeOperation excludeOperation = ModuleFactory.eINSTANCE.createOsResourceExcludeOperation();
		excludeOperation.setOsResourceId(osResourceId);
		return excludeOperation;
	}

	private OsSpinlockExcludeOperation createOsSpinlockExcludeOperation(String osSpinlockId) {
		OsSpinlockExcludeOperation excludeOperation = ModuleFactory.eINSTANCE.createOsSpinlockExcludeOperation();
		excludeOperation.setOsSpinlockId(osSpinlockId);
		return excludeOperation;
	}
}
