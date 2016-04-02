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
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id: measure.h 427 2015-03-23 12:38:40Z mtakada $
 */

#ifndef MEASURE_H
#define MEASURE_H

#include "Os.h"
#include "t_syslog.h"
#include "histogram.h"
#include "suspend_interrupts.h"

/* SC3では非信頼OSAPから性能評価ライブラリを使用可能とする */
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
	/* マルチコアではどちらのコアでも対応可能とする */
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
	/* マルチコアではどちらのコアでも対応可能とする */
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
