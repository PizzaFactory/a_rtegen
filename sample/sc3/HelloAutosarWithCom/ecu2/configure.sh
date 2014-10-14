#!/bin/sh
#
#  TOPPERS/A-RTEGEN
#      Automotive Runtime Environment Generator
#
#  Copyright (C) 2013-2014 by Center for Embedded Computing Systems
#              Graduate School of Information Science, Nagoya Univ., JAPAN
#  Copyright (C) 2013-2014 by FUJI SOFT INCORPORATED, JAPAN
#  Copyright (C) 2013-2014 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
#  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
#  Copyright (C) 2013-2014 by Sunny Giken Inc., JAPAN
#  Copyright (C) 2013-2014 by TOSHIBA CORPORATION, JAPAN
#  Copyright (C) 2013-2014 by Witz Corporation, JAPAN
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
# $Id: configure.sh 141 2014-09-26 09:13:20Z mtakada $
#

#
# �����
#

# ATK2�����������ɤޤǤ����Хѥ�
OS_PATH=../../../../../atk2-sc3

# ���̥����������ɤޤǤ����Хѥ�
GENERAL_PATH=../../../general

# A-COMSTACK�ޤǤ����Хѥ�
COMSTACK_PATH=../../../../../a-comstack

# �������å�̾
TARGET=nios2_dev_gcc

# ���ץꥱ�������̾(OS����ե�����졼�����ե�����̾)
APPLICATION=HelloAutosarWithCom_ECU2

# �ӥ�ɥ⥸�塼��̾
MODULE="SWC2.o Rte_Partition_EcucPartition_Rte.o Rte_Partition_EcucPartition_SWC2.o"

# A-COM�����������ɤޤǤ����Хѥ�
COM_PATH=$COMSTACK_PATH/com

# A-PDUR�����������ɤޤǤ����Хѥ�
PDUR_PATH=$COMSTACK_PATH/pdur

# A-CANIF�����������ɤޤǤ����Хѥ�
CANIF_PATH=$COMSTACK_PATH/canif

# A-CAN�����������ɤޤǤ����Хѥ�
CAN_PATH=$COMSTACK_PATH/can

# ����¾ɬ�פʥ����������ɤޤǤ����Хѥ�
COM_STUB_PATH=$COMSTACK_PATH/stub
COM_GENERAL_PATH=$COMSTACK_PATH/general

# A-COMSTACK��ɬ�פʥ⥸�塼��
MODULE="$MODULE Com.o Com_PBcfg.o CanIf.o CanIf_PBcfg.o CanIf_Lcfg.o Can.o Can_Irq.o Can_PBcfg.o"


#
# ��ǽɾ�������
#
CMP_OPT="-o -DTOPPERS_USE_COMSTACK"
if [ $1 ] && [ $1 == "perf" ]
then
	MODULE="$MODULE histogram.o measure_swc2.o trusted_functions.o"
	ADD_YAML="$GENERAL_PATH/HelloAutosar/performance/trusted_functions.yaml \
			  $GENERAL_PATH/HelloAutosar/performance/accessing_alarm2.yaml"
	INCLUDE="$GENERAL_PATH/HelloAutosar/performance $GENERAL_PATH/HelloAutosar/performance/$TARGET"
	CFG_OPT="-s"
	CMP_OPT="$CMP_OPT -DTOPPERS_PERFORMANCE -DMEASURE_100_NANO -DOTHER_PRC_SVC_TABLE=perf_add_syssrv.h -DUSE_KERNEL_LIBRARY_SYSLOG"
fi


#
# ���������ɰ��������
#
if [ $1 ] && [ $1 == "del" ]
then
	make realclean
	rm -f Rte* SchM* Com* PduR* CanIf* Can* Makefile* $APPLICATION.arxml
	exit
fi


#
# ����������
#

# configure������ץȤˤ��Makefile����
perl $OS_PATH/configure -T $TARGET -A Rte $CFG_OPT \
	-a "$COM_PATH $PDUR_PATH $CANIF_PATH $CAN_PATH $COM_STUB_PATH $COM_GENERAL_PATH $GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar $INCLUDE" \
	-C "$APPLICATION $GENERAL_PATH/HelloAutosar/SystemDesk_WithCom_EcuInstance2 Rte_GeneratedEcuc" \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o" "$CMP_OPT"

# ABREX�ˤ��ARXML�κ���
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml $ADD_YAML

# A-RTEGEN�ˤ��ɬ�פ�IOC����
../../../../bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk_WithCom_EcuInstance2.arxml $APPLICATION.arxml

# A-RTEGEN�ˤ��A-RTE�⥸�塼�����
../../../../bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml $GENERAL_PATH/HelloAutosar/SystemDesk_WithCom_EcuInstance2.arxml $APPLICATION.arxml Rte_GeneratedEcuc.arxml

# A-COM�����ͥ졼���ˤ��A-COM�⥸�塼�����
echo "Generate Com"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $COM_PATH/com.ini --api-table $COM_PATH/com.csv -T $COM_PATH/com.tf $APPLICATION.arxml

# A-PDUR�����ͥ졼���ˤ��A-PDUR�⥸�塼�����
echo "Generate PduR"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $PDUR_PATH/pdur.ini --api-table $PDUR_PATH/pdur.csv -T $PDUR_PATH/pdur.tf $APPLICATION.arxml

# A-CANIF�����ͥ졼���ˤ��A-CANIF�⥸�塼�����
echo "Generate CanIf"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $CANIF_PATH/canif.ini --api-table $CANIF_PATH/canif.csv -T $CANIF_PATH/canif.tf $APPLICATION.arxml

# A-CAN�����ͥ졼���ˤ��A-CAN�⥸�塼�����
echo "Generate Can"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $CAN_PATH/can.ini --api-table $CAN_PATH/can.csv -T $CAN_PATH/can.tf $APPLICATION.arxml
