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
 *  $Id: measure.h 353 2014-03-13 04:07:34Z shigihara $
 */

#ifndef MEASURE_H
#define MEASURE_H

#include "Os.h"
#include "t_syslog.h"
#include "histogram.h"
#include "suspend_interrupts.h"

/* SC3�Ǥ�����OSAP������ǽɾ���饤�֥�����Ѳ�ǽ�Ȥ��� */
#ifdef CFG_USE_SCALABILITYCLASS3
#include "perf_trap_syssrv.h"
#include "perf_trap_replace.h"
#endif /* CFG_USE_SCALABILITYCLASS3 */

#define LOOP_COUNT	10000U
#define MAX_TIME	1024U

LOCAL_INLINE void
WrapperCancelAlarm1(void)
{
	StatusType ercd = E_OK;

#ifdef TOPPERS_USE_MULTICORE
	/* �ޥ�������ǤϤɤ���Υ����Ǥ��б���ǽ�Ȥ��� */
	if (GetCoreID() == 0U) {
		ercd = CancelAlarm(ALARM_CORE0);
	}
	else {
		ercd = CancelAlarm(ALARM_CORE1);
	}
#else
	ercd = CancelAlarm(ALARM1);
#endif /* TOPPERS_USE_MULTICORE */

	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CancelAlarm returns an error [%d]", ercd);
	}
}

LOCAL_INLINE void
WrapperCancelAlarm2(void)
{
	StatusType ercd = E_OK;

#ifdef TOPPERS_USE_MULTICORE
	/* �ޥ�������ǤϤɤ���Υ����Ǥ��б���ǽ�Ȥ��� */
	if (GetCoreID() == 0U) {
		ercd = CancelAlarm(ALARM_CORE0);
	}
	else {
		ercd = CancelAlarm(ALARM_CORE1);
	}
#else
	ercd = CancelAlarm(ALARM2);
#endif /* TOPPERS_USE_MULTICORE */

	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CancelAlarm returns an error [%d]", ercd);
	}
}

LOCAL_INLINE void
WrapperShutdownOS(void)
{
	StatusType ercd = E_OK;

#ifdef CFG_USE_SCALABILITYCLASS1

#ifdef TOPPERS_USE_MULTICORE
	ShutdownAllCores(E_OK);
#else
	ShutdownOS(E_OK);
#endif /* TOPPERS_USE_MULTICORE */

#else

#ifdef TOPPERS_USE_MULTICORE
	if (GetCoreID() == 0U) {
		ercd = CallTrustedFunction(TrustedShutdown_Core0, NULL_PTR);
	}
	else {
		ercd = CallTrustedFunction(TrustedShutdown_Core1, NULL_PTR);
	}
#else
	ercd = CallTrustedFunction(TrustedShutdown, NULL_PTR);
#endif /* TOPPERS_USE_MULTICORE */

#endif /* CFG_USE_SCALABILITYCLASS1 */

	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CallTrustedFunction returns an error [%d]", ercd);
	}
}

LOCAL_INLINE void
WrapperSuspendAllInterruptsWithoutOS(void)
{
	StatusType ercd = E_OK;

#ifdef CFG_USE_SCALABILITYCLASS1

	SuspendAllInterruptsWithoutOS();

#else

#ifdef TOPPERS_USE_MULTICORE
	if (GetCoreID() == 0U) {
		ercd = CallTrustedFunction(TrustedSuspendAllInterruptsWithoutOS_Core0, NULL_PTR);
	}
	else {
		ercd = CallTrustedFunction(TrustedSuspendAllInterruptsWithoutOS_Core1, NULL_PTR);
	}
#else
	ercd = CallTrustedFunction(TrustedSuspendAllInterruptsWithoutOS, NULL_PTR);
#endif /* TOPPERS_USE_MULTICORE */

#endif /* CFG_USE_SCALABILITYCLASS1 */

	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CallTrustedFunction returns an error [%d]", ercd);
	}
}

LOCAL_INLINE void
WrapperResumeAllInterruptsWithoutOS(void)
{
	StatusType ercd = E_OK;

#ifdef CFG_USE_SCALABILITYCLASS1

	ResumeAllInterruptsWithoutOS();

#else

#ifdef TOPPERS_USE_MULTICORE
	if (GetCoreID() == 0U) {
		ercd = CallTrustedFunction(TrustedResumeAllInterruptsWithoutOS_Core0, NULL_PTR);
	}
	else {
		ercd = CallTrustedFunction(TrustedResumeAllInterruptsWithoutOS_Core1, NULL_PTR);
	}
#else
	ercd = CallTrustedFunction(TrustedResumeAllInterruptsWithoutOS, NULL_PTR);
#endif /* TOPPERS_USE_MULTICORE */

#endif /* CFG_USE_SCALABILITYCLASS1 */

	if (ercd != E_OK) {
		syslog(LOG_NOTICE, "## CallTrustedFunction returns an error [%d]", ercd);
	}
}

#endif /* MEASURE_H */
