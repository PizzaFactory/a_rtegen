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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;

public class FileNames { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)
	// �ե�����̾����Ƭ����������
	public static final String SOURCE_FILE_NAME_POSTFIX = ".c";
	public static final String HEADER_FILE_NAME_POSTFIX = ".h";
	private static final String RTE_FILE_NAME_PREFIX = "Rte_";
	private static final String SCHM_FILE_NAME_PREFIX = "SchM_";

	// �إå������ɥޥ���̾����Ƭ����������
	private static final String HEADER_GUARD_NAME_POSTFIX = "_H";
	private static final String RTE_HEADER_GUARD_NAME_PREFIX = "RTE_";
	private static final String SCHM_HEADER_GUARD_NAME_PREFIX = "SCHM_";

	// �ե�����̾
	public static final String BSW_MEMORY_MAPPING_HEADER_FILE_NAME = "MemMap" + HEADER_FILE_NAME_POSTFIX;
	public static final String IOC_HEADER_FILE_NAME = "Ioc" + HEADER_FILE_NAME_POSTFIX;
	public static final String COM_HEADER_FILE_NAME = "Com" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_HEADER_FILE_NAME = "Rte" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_TYPE_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Type" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_LIFECYCLE_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Main" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_CONFIGURATION_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Cfg" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_VFB_TRACE_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Hook" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_CALLBACK_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Cbk" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_BSW_API_HEADER_NAME = RTE_FILE_NAME_PREFIX + "Bsw_Api" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_UTILITY_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Util" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_COMMON_RTE_INTERNAL_HEADER_FILE_NAME = RTE_FILE_NAME_PREFIX + "Common" + HEADER_FILE_NAME_POSTFIX;
	public static final String RTE_SOURCE_FILE_NAME = "Rte" + SOURCE_FILE_NAME_POSTFIX;

	// �إå������ɥޥ���̾
	public static final String RTE_HEADER_GUARD_NAME = "RTE" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_TYPE_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "TYPE" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_LIFECYCLE_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "MAIN" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_CONFIGURATION_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "CFG" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_VFB_TRACE_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "HOOK" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_CALLBACK_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "CBK" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_BSW_API_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "BSW_API" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_UTILITY_HEEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "UTIL" + HEADER_GUARD_NAME_POSTFIX;
	public static final String RTE_COMMON_RTE_INTERNAL_HEADER_GUARD_NAME = RTE_HEADER_GUARD_NAME_PREFIX + "COMMON" + HEADER_GUARD_NAME_POSTFIX;

	public static String createRteApplicationTypeHeaderFileName(Swc sourceSwc) {
		return RTE_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + "_Type" + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createRteApplicationTypeHeaderGuardName(Swc sourceSwc) {
		return RTE_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + "_Type" + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createRteApplicationHeaderFileName(Swc sourceSwc) {
		return RTE_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createRteApplicationHeaderGuardName(Swc sourceSwc) {
		return RTE_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkTypeHeaderFileName(Bswm sourceBswm) {
		return SCHM_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + "_Type" + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkTypeHeaderGuardName(Bswm sourceBswm) {
		return SCHM_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + "_Type" + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkHeaderFileName(Bswm sourceBswm) {
		return SCHM_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createSchmModuleInterlinkHeaderGuardName(Bswm sourceBswm) {
		return SCHM_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createPartitionRteInternalHeaderFileName(Partition sourcePartition) {
		return RTE_FILE_NAME_PREFIX + "Partition_" + sourcePartition.getCompartmentName() + HEADER_FILE_NAME_POSTFIX;
	}

	public static String createPartitionRteInternalHeaderGuardName(Partition sourcePartition) {
		return RTE_HEADER_GUARD_NAME_PREFIX + "PARTITION_" + sourcePartition.getCompartmentName() + HEADER_GUARD_NAME_POSTFIX;
	}

	public static String createPartitionRteSourceFileName(Partition sourcePartition) {
		return RTE_FILE_NAME_PREFIX + "Partition_" + sourcePartition.getCompartmentName() + SOURCE_FILE_NAME_POSTFIX;
	}

	public static String createSwcMemoryMappingHeaderFileName(Swc sourceSwc) {
		return sourceSwc.getCompartmentName() + "_MemMap" + HEADER_FILE_NAME_POSTFIX;
	}
}
