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
 *  $Id: CddLockLed.c 488 2015-04-14 08:39:42Z mtakada $
 */

#include "Os.h"
#include "prc_sil.h"
#include "Rte_CddLockLed.h"
#include "Rte_CddLockLed_Stub.h"

#define LED_R_BASE	0x08000430
#define LED_R_0		0x00000001
#define LED_R_1		0x00000002
#define LED_R_2		0x00000004
#define LED_R_3		0x00000008
#define LED_R_0_3	0x0000000F
#define LED_R_17	0x00020000
#define LED_R_16	0x00010000
#define LED_R_15	0x00008000
#define LED_R_1_3	0x0000000E

void
SetLedState(LockState state)
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
	
	if (state) {
		sil_wrw_iop((void *) LED_R_BASE, (LED_R_17 | tmp));
	}
	else {
		sil_wrw_iop((void *) LED_R_BASE, (~LED_R_17 & tmp));
	}
}

void
SetLedState2(LockState state)
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
	
	if (state) {
		sil_wrw_iop((void *) LED_R_BASE, (LED_R_16 | tmp));
	}
	else {
		sil_wrw_iop((void *) LED_R_BASE, (~LED_R_16 & tmp));
	}
}

void
SetLedState3(LockState state)
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
	
	if (state) {
		sil_wrw_iop((void *) LED_R_BASE, (LED_R_15 | tmp));
	}
	else {
		sil_wrw_iop((void *) LED_R_BASE, (~LED_R_15 & tmp));
	}
}

void
SetLedStateWdgOK()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
		
	sil_wrw_iop((void *) LED_R_BASE, ((LED_R_0 | tmp) & ~LED_R_1_3));
}

void
SetLedStateWdgFAILED()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);
		
	sil_wrw_iop((void *) LED_R_BASE, (LED_R_1 | tmp));
}

void
SetLedStateWdgEXPIRED()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);

	sil_wrw_iop((void *) LED_R_BASE, (LED_R_2 | tmp));
}

void
SetLedStateWdgSTOPPED()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);

	sil_wrw_iop((void *) LED_R_BASE, (LED_R_3 | tmp));
}

void
SetLedStateWdgCLEAR()
{
	uint32 tmp;
	
	tmp = sil_rew_iop((void *) LED_R_BASE);

	sil_wrw_iop((void *) LED_R_BASE, (~LED_R_0_3 | tmp));
}
