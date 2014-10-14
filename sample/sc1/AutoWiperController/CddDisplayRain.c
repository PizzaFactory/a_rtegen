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
 *  $Id: CddDisplayRain.c 351 2014-03-07 05:31:11Z shigihara $
 */

#include "Os.h"
#include "prc_sil.h"
#include "Rte_CddDisplayRain.h"

/* �߱���ɽ����ɬ�פ�HW��LED-G��7SEG */
#define SEG7_BASE	0x08000500
#define LED_G_BASE	0x08000420

#define SEG7_SET(index, value)	sil_wrw_iop((void *) (SEG7_BASE + (index * 4)), value);
#define SEG7_NUM	8U

void
SEG7_Clear(void)
{
	uint8 i;
	for (i = 0U; i < SEG7_NUM; i++) {
		SEG7_SET(i, 0U);
	}
}

void
DisplayRain(void)
{
	Rainfall		cur_rainfall;
	uint32			red = 0U;
	uint8			i;
	static uint8	line_pos[SEG7_NUM] = {
		0x00, 0x01, 0x40, 0x08, 0x01, 0x40, 0x00, 0x40
	};
	static Rainfall before_rainfall = 0U;
	static uint8	drop_cnt = 0U;

	/* ���ߤι߱��̼��� */
	Rte_Call_RainfallInDR_GetRainfall(&cur_rainfall);

	/* 7SEGɽ�� */
	if (before_rainfall != cur_rainfall) {
		before_rainfall = cur_rainfall;
		drop_cnt = 0;
	}

	if (cur_rainfall == 0) {
		SEG7_Clear();
	}
	else {
		drop_cnt++;
		if (drop_cnt > (4U - before_rainfall)) {
			for (i = 0; i < SEG7_NUM; i++) {
				switch (line_pos[i]) {
				// 1����
				case 0x01:
					line_pos[i] = 0x40;
					break;
				// 2����
				case 0x40:
					line_pos[i] = 0x08;
					break;
				// 3����
				case 0x08:
					line_pos[i] = 0x00;
					break;
				// �����
				default:
					line_pos[i] = 0x01;
					break;
				}
				SEG7_SET(i, line_pos[i]);
				drop_cnt = 0;
			}
		}
	}

	/* LEDɽ�� */
	while (cur_rainfall > 0) {
		red += 1 << (cur_rainfall - 1);
		cur_rainfall--;
	}
	sil_wrw_iop((void *) LED_G_BASE, red);
}
