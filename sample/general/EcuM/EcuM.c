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
 *  $Id: EcuM.c 353 2014-03-13 04:07:34Z shigihara $
 */

#include "EcuM_Callout.h"

void
EcuM_Init(void)
{
#ifdef TOPPERS_USE_MULTICORE
	StatusType	ercd;
	CoreIdType	i;
#endif /* TOPPERS_USE_MULTICORE */

	/* BSW��ɬ�פȤ���ɥ饤�Фν���������륢���� */
	EcuM_AL_DriverInitZero();

#ifdef TOPPERS_USE_MULTICORE
	/* �ޥ������ */
	if (GetCoreID() == OS_CORE_ID_MASTER) {
		for (i = 0U; i < TotalNumberOfCores; i++) {
			if (i != OS_CORE_ID_MASTER) {
				StartCore(i, &ercd);
			}
		}
		StartOS(MainApp);
	}
	else {
		StartOS(DONOTCARE);
	}
#else
	/* ���󥰥륳�� */
	StartOS(MainApp);
#endif /* TOPPERS_USE_MULTICORE */

	while (1) {
	}
}

void
EcuM_StartUpTwo(void)
{
/* BSW�ϥޥ��������ǤΤ߻��Ѳ�ǽ */
#ifdef TOPPERS_USE_MULTICORE
	if (GetCoreID() == OS_CORE_ID_MASTER) {
#endif /* TOPPERS_USE_MULTICORE */

#ifdef TOPPERS_USE_COMSTACK

#ifdef Rte_ComSendSignalProxyImmediateTask
	/* ���졼�֥�������COM����Ѥ������ɬ�פʥ������ε�ư */
	(void) ActivateTask(Rte_ComSendSignalProxyImmediateTask);
#endif /* Rte_ComSendSignalProxyImmediateTask */

	/* BSW�������塼������ */
	SchM_Init();
#endif /* TOPPERS_USE_COMSTACK */

	/* BSW�ν�������������ȥ��å� */
	EcuM_BswStartupTwo();

#ifdef TOPPERS_USE_MULTICORE
}
#endif /* TOPPERS_USE_MULTICORE */

	/* RTE/���ץꥱ�������ν�������������ȥ��å� */
	EcuM_ApplicationStartupTwo();
}
