/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Center for Embedded Computing Systems
 *              Graduate School of Information Science, Nagoya Univ., JAPAN
 *  Copyright (C) 2013-2014 by FUJISOFT INCORPORATED, JAPAN
 *  Copyright (C) 2013-2014 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
 *  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
 *  Copyright (C) 2013-2014 by Sunny Giken Inc., JAPAN
 *  Copyright (C) 2013-2014 by TOSHIBA CORPORATION, JAPAN
 *  Copyright (C) 2013-2014 by Witz Corporation, JAPAN
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
 *  $Id: EcuM_Callout.h 351 2014-03-07 05:31:11Z shigihara $
 */

#ifndef ECUM_CALLOUT_H
#define ECUM_CALLOUT_H

#include "Os.h"
#include "Rte_Main.h"
#include "sysmod/serial.h"
#include "sysmod/syslog.h"
#include "sysmod/banner.h"
#include "t_syslog.h"

#ifdef TOPPERS_USE_COMSTACK
#include "Com.h"
#include "CanIf.h"
#include "Can.h"
#endif /* TOPPERS_USE_COMSTACK */

#ifdef TOPPERS_PERFORMANCE
#include "target_timer.h"
#endif /* TOPPERS_PERFORMANCE */

LOCAL_INLINE void
EcuM_AL_DriverInitZero(void)
{
#ifdef TOPPERS_PERFORMANCE
	target_timer_initialize();
#endif /* TOPPERS_PERFORMANCE */

	syslog_initialize();
	syslog_msk_log(LOG_UPTO(LOG_INFO));
	InitSerial();
	print_banner();
}

LOCAL_INLINE void
EcuM_BswStartupTwo(void)
{
#ifdef TOPPERS_USE_COMSTACK
	Std_ReturnType		ercd;
	Com_IpduGroupVector	vector_on;

	/* Can�⥸�塼������ */
	Can_Init(NULL_PTR);

	/* CanIf�⥸�塼������ */
	CanIf_Init(NULL_PTR);
	/* CanIf�⥸�塼�륹�����ȥ��å� */
	ercd = CanIf_SetControllerMode(0U, CANIF_CS_STARTED);
	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CanIf_SetControllerMode returns E_NOT_OK !!");
	}
	ercd = CanIf_SetPduMode(0U, CANIF_SET_ONLINE);
	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CanIf_SetPduMode returns E_NOT_OK !!");
	}

	/* Com�⥸�塼������ */
	Com_Init(NULL_PTR);
	/* Com�⥸�塼�륹�����ȥ��å� */
	Com_SetIpduGroup(vector_on, 0, TRUE);
	Com_IpduGroupControl(vector_on, TRUE);
#endif /* TOPPERS_USE_COMSTACK */
}

LOCAL_INLINE void
EcuM_ApplicationStartupTwo(void)
{
	/* RTE�ν���� */
	Rte_Start();
}

#endif /* ECUM_CALLOUT_H */
