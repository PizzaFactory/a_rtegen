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
#  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
#  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
#  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
#  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
#      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
#      ����������˴ޤޤ�Ƥ��뤳�ȡ�
#  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
#      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
#      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
#      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
#  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
#      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
#      �ȡ�
#    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
#        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
#    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
#        ��𤹤뤳�ȡ�
#  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
#      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
#      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
#      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
#      ���դ��뤳�ȡ�
#
#  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
#  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
#  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
#  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
#
#  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
#  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
#  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
#  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
#  ����Ǥ�����ʤ���
#
# $Id: configure.sh 427 2015-03-23 12:38:40Z mtakada $
#

#
# �����
#

# OS�����������ɤޤǤ����Хѥ�
OS_PATH=../../../../atk2-sc1-mc

# A-RTEGEN�ޤǤ����Хѥ�
RTE_PATH=../../../

# ���̥����������ɤޤǤ����Хѥ�
GENERAL_PATH=$RTE_PATH/sample/general

# �������å�̾
TARGET=nios2_dev_gcc

# ���ץꥱ�������̾(OS����ե�����졼�����ե�����̾)
APPLICATION=HelloAutosar

# �ӥ�ɥ⥸�塼��̾
MODULE="SWC1.o SWC2.o Rte_Partition_EcucPartition_SWC1.o Rte_Partition_EcucPartition_SWC2.o Rte_Partition_EcucPartition_Rte_Core0.o Rte_Partition_EcucPartition_Rte_Core1.o"


#
# ��ǽɾ�������
#
CMP_OPT="-o -DTOPPERS_USE_MULTICORE"
if [ $1 ] && [ $1 == "perf" ]
then
	MODULE="$MODULE histogram.o measure_swc1.o measure_swc2.o"
	INCLUDE="$GENERAL_PATH/HelloAutosar/performance $GENERAL_PATH/HelloAutosar/performance/$TARGET"
	CFG_OPT="-s"
	CMP_OPT="$CMP_OPT -DTOPPERS_PERFORMANCE -DMEASURE_100_NANO"
fi


#
# ���������ɰ��������
#
if [ $1 ] && [ $1 == "del" ]
then
	make realclean
	rm -f Rte* Makefile* $APPLICATION.arxml
	exit
fi


#
# ����������
#

# configure������ץȤˤ��Makefile����
perl $OS_PATH/configure -T $TARGET -A Rte $CFG_OPT \
	-a "$GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar $INCLUDE" \
	-C "$APPLICATION $GENERAL_PATH/HelloAutosar/SystemDesk Rte_InternalDataTypes" \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o" "$CMP_OPT"

# ABREX�ˤ��ARXML�κ���
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml

# A-RTEGEN�ˤ��ɬ�פ�IOC�ǡ�������
$RTE_PATH/bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk.arxml $APPLICATION.arxml

if [ -e Rte_GeneratedEcuc.arxml ]
then
	# �����ֵ�ư�������ѥ���ե����졼��������ޡ����Τ����YAML���Ѵ�
	ruby $OS_PATH/utils/abrex/abrex.rb -i Rte_GeneratedEcuc.arxml

	# ABREX�ˤ��ޡ�������ARXML�κ���
	ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml Rte_GeneratedEcuc.yaml
fi

# A-RTEGEN�ˤ��A-RTE�⥸�塼�����
$RTE_PATH/bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk.arxml $APPLICATION.arxml Rte_InternalDataTypes.arxml
