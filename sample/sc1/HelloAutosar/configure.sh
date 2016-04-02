#!/bin/sh
#
#  TOPPERS/A-RTEGEN
#      Automotive Runtime Environment Generator
#
#  Copyright (C) 2013-2015 by Center for Embedded Computing Systems
#              Graduate School of Information Science, Nagoya Univ., JAPAN
#  Copyright (C) 2014-2015 by AISIN COMCRUISE Co., Ltd., JAPAN
#  Copyright (C) 2013-2015 by FUJI SOFT INCORPORATED, JAPAN
#  Copyright (C) 2014-2015 by NEC Communication Systems, Ltd., JAPAN
#  Copyright (C) 2013-2015 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
#  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
#  Copyright (C) 2014-2015 by SCSK Corporation, JAPAN
#  Copyright (C) 2013-2015 by Sunny Giken Inc., JAPAN
#  Copyright (C) 2013-2015 by TOSHIBA CORPORATION, JAPAN
#  Copyright (C) 2013-2015 by Witz Corporation
#
#  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
#  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
#  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
#  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
#      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
#      スコード中に含まれていること．
#  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
#      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
#      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
#      の無保証規定を掲載すること．
#  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
#      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
#      と．
#    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
#        作権表示，この利用条件および下記の無保証規定を掲載すること．
#    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
#        報告すること．
#  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
#      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
#      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
#      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
#      免責すること．
#
#  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
#  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
#  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
#  用する者に対して，AUTOSARパートナーになることを求めている．
#
#  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
#  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
#  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
#  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
#  の責任を負わない．
#
# $Id: configure.sh 427 2015-03-23 12:38:40Z mtakada $
#

#
# 各定義
#

# OSソースコードまでの相対パス
OS_PATH=../../../../atk2-sc1

# A-RTEGENまでの相対パス
RTE_PATH=../../../

# 共通ソースコードまでの相対パス
GENERAL_PATH=$RTE_PATH/sample/general

# ターゲット名
TARGET=nios2_dev_gcc
#TARGET=fl850pj4_gcc

# アプリケーション名(OSコンフィギュレーションファイル名)
APPLICATION=HelloAutosar

# ビルドモジュール名
MODULE="SWC1.o SWC2.o"


#
# 性能評価用定義
#
if [ $1 ] && [ $1 == "perf" ]
then
	MODULE="$MODULE histogram.o measure_swc1.o measure_swc2.o"
	INCLUDE="$GENERAL_PATH/HelloAutosar/performance $GENERAL_PATH/HelloAutosar/performance/$TARGET"
	CFG_OPT="-s"
	CMP_OPT="-o -DTOPPERS_PERFORMANCE -DMEASURE_100_NANO"
fi


#
# 生成コード一括削除処理
#
if [ $1 ] && [ $1 == "del" ]
then
	make realclean
	rm -f Rte* Makefile* $APPLICATION.arxml
	exit
fi


#
# コード生成
#

# configureスクリプトによるMakefile作成
perl $OS_PATH/configure -T $TARGET -A Rte $CFG_OPT \
	-a "$GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar $INCLUDE" \
	-C $APPLICATION \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o" "$CMP_OPT"

# ABREXによるARXMLの作成
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml

# A-RTEGENによるA-RTEモジュール作成
$RTE_PATH/bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk.arxml $APPLICATION.arxml
