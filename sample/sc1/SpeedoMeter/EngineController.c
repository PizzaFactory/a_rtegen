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
 *  $Id: EngineController.c 351 2014-03-07 05:31:11Z shigihara $
 */

#include "Rte_EngineController.h"

/*
 * ñ�̡�m/s
 */
#define VELOCITY_MAX	2147483647U
static sint32	CurrentVelocity = 0;

static sint32	DecFrictionVelocity = 0;
static sint32	DecBrakeVelocity = 0;
static sint32	IncAcceleratorVelocity = 0;
#define CALC_SCALE					10000
#define ACCELERATION_FACTOR			1
#define FRICTION_SLOWDOWN_FACTOR	10
#define BRAKE_SLOWDOWN_FACTOR		100

// m/s ==> Km/H / 10000
#define CONVERT_SPEED_UNIT(speed)	(speed * 36 / (CALC_SCALE / 10000))

static void
calcSlowDown(void)
{
	BrakeEvent IsBrakeEvent;
	Rte_Read_BrakeStateIn_BrakeEvent(&IsBrakeEvent);

	DecFrictionVelocity = FRICTION_SLOWDOWN_FACTOR;
	DecBrakeVelocity = IsBrakeEvent * BRAKE_SLOWDOWN_FACTOR;
	return;
}


static void
calcAcceleration(void)
{
	AccelLevel AcceleratorLevel;
	Rte_Read_LevelToECIn_LevelToEC(&AcceleratorLevel);

	IncAcceleratorVelocity = AcceleratorLevel * ACCELERATION_FACTOR;
	return;
}

void
calcSpeedo(void)
{
	calcSlowDown();
	calcAcceleration();

	CurrentVelocity = CurrentVelocity
					  + IncAcceleratorVelocity
					  - DecBrakeVelocity
					  - DecFrictionVelocity;
	if (CurrentVelocity < 0) {
		CurrentVelocity = 0;
	}
	else if (((uint32) CurrentVelocity) > VELOCITY_MAX) {
		CurrentVelocity = VELOCITY_MAX;
	}

	Rte_Write_SpeedoValueOut_SpeedoValue((Speedo) CurrentVelocity);
	return;
}
