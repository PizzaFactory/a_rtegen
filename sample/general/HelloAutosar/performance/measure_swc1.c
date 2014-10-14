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
 *  $Id: measure_swc1.c 353 2014-03-13 04:07:34Z shigihara $
 */

#include "measure.h"

static uint32 histarea[MAX_TIME + 1];

extern Std_ReturnType    Rte_Write_SWC1_PPort_time(IDT_TimeCount data);

#ifdef CHECK_TIMER
static void check_timer(void);
#endif /* CHECK_TIMER */

/*
 *  SW-C1����ǽɾ���ؿ�
 */
void
measure_swc1(void)
{
	volatile uint32			i;
	static IDT_TimeCount	cnt = 0;
	cnt++;

	WrapperCancelAlarm1();

	WrapperSuspendAllInterruptsWithoutOS();

#ifdef CHECK_TIMER
	check_timer();
#endif /* CHECK_TIMER */

	syslog(LOG_NOTICE, "== measure overhead ==");
	init_hist(1U, MAX_TIME, histarea);
	for (i = 0U; i < LOOP_COUNT; i++) {
		begin_measure(1U);
		end_measure(1U);
	}
	print_hist(1U);

	syslog(LOG_NOTICE, "== Rte_Write_SWC1_PPort_time  ==");
	init_hist(1U, MAX_TIME, histarea);
	for (i = 0U; i < LOOP_COUNT; i++) {
		begin_measure(1U);
		Rte_Write_SWC1_PPort_time(cnt);
		end_measure(1U);
	}
	print_hist(1U);

	WrapperResumeAllInterruptsWithoutOS();

/* ECU�֤ξ���SW-C1�Ǥ⽪λ���� */
#ifdef TOPPERS_USE_COMSTACK
	WrapperShutdownOS();
#endif /* TOPPERS_USE_COMSTACK */
}

/*
 *  ������ư���ǧ�Ѵؿ�
 */
#ifdef CHECK_TIMER
void
check_timer(void)
{
	volatile uint32 i, j, loop;

	syslog(LOG_NOTICE, "== 100us test ==");
	init_hist(1U, MAX_TIME, histarea);
	loop = LOOP_FOR_100US;
	for (i = 0U; i < LOOP_COUNT; i++) {
		begin_measure(1U);
		for (j = 0U; j < loop; j++) {
		}
		end_measure(1U);
	}
	print_hist(1U);

	loop = LOOP_FOR_100US * 100000U;
	syslog(LOG_NOTICE, "== 10s test start ==");
	for (j = 0U; j < loop; j++) {
	}
	syslog(LOG_NOTICE, "== 10s test end ==");

	WrapperShutdownOS();
}
#endif /* CHECK_TIMER */
