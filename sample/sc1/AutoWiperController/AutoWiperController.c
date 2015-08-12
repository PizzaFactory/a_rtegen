/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Center for Embedded Computing Systems
 *              Graduate School of Information Science, Nagoya Univ., JAPAN
 *  Copyright (C) 2014-2015 by AISIN COMCRUISE Co., Ltd., JAPAN
 *  Copyright (C) 2013-2015 by FUJI SOFT INCORPORATED, JAPAN
 *  Copyright (C) 2014-2015 by NEC Communication Systems, Ltd., JAPAN
 *  Copyright (C) 2013-2015 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
 *  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
 *  Copyright (C) 2014-2015 by SCSK Corporation, JAPAN
 *  Copyright (C) 2013-2015 by Sunny Giken Inc., JAPAN
 *  Copyright (C) 2013-2015 by TOSHIBA CORPORATION, JAPAN
 *  Copyright (C) 2013-2015 by Witz Corporation
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
 *  $Id: AutoWiperController.c 427 2015-03-23 12:38:40Z mtakada $
 */

#include "Rte_AutoWiperController.h"

void
AutoWiperController(void)
{
	SwitchState			cur_sw_state;
	Rainfall			cur_rainfall;
	static SwitchState	before_sw_state = 0U;
	static uint8		wipe_timing_cnt = 0U;

	/* ���ߤΥ磻�ѡ������å��ξ��֤���� */
	Rte_Call_WiperSwitchIn_GetWiperSwitchState(&cur_sw_state);

	/* �����å����ڤ��ؤ�ä���¨�¤�1���ܤζ�ư���׵᤹�� */
	if (before_sw_state != cur_sw_state) {
		wipe_timing_cnt = 50U;
	}

	if (cur_sw_state == 5U) {
		/* �����å���AUTO�ξ�硤�쥤�󥻥󥵤��鸽�ߤι߱��̤���� */
		Rte_Call_RainfallInAWC_GetRainfall(&cur_rainfall);
	}
	else {
		/* AUTO�Ǥʤ���硤0��4�Υ����å����֤򤽤Τޤ޹߱��̤ȸ��ʤ� */
		cur_rainfall = cur_sw_state;
	}

	/* �磻�ѡ���ư�����ߥ󥰥����󥿤򥤥󥯥����(�����С��ե��ɻ�) */
	if (wipe_timing_cnt < 50U) {
		wipe_timing_cnt++;
	}

	/* �ƥ��ԡ��ɤ˱��������ʬ���֤��вᤷ����磻�ѡ���ư�׵������ */
	if (((cur_rainfall == 1U) && (wipe_timing_cnt > 30U)) ||
		((cur_rainfall == 2U) && (wipe_timing_cnt > 15U)) ||
		((cur_rainfall == 3U) && (wipe_timing_cnt > 8U)) ||
		(cur_rainfall == 4U)) {
		Rte_Write_WipeRequestOut_request(TRUE);
		wipe_timing_cnt = 0U;
	}
	else {
		Rte_Write_WipeRequestOut_request(FALSE);
	}

	before_sw_state = cur_sw_state;
}
