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
# �㥵��ץ륢�ץꥱ��������ס�
# ��ATK2��nios2_dev_gcc��¸���ǥ��ݡ��Ȥ����DE2-115�ܡ��ɤǤΤ�ư���
# ��PowerWindowController�إ�å������å���ǽ���ɲä���
# �������å�������ʤΤ�ΤȤ��ơ���ž��¦�Υ�å������å����ϵ�����
#
# �������ˡ��
# ��KEY0�������ʤ�����Ĥ�륹���å�(��å����̵��)
# ��KEY1�������ʤ���򳫤��륹���å�(��å����̵��)
# ��GREEN LED����γ����̤�ɽ��(�����̤�8�ʳ�)
# ��SW17����ž�ʥ�å������å�
# ��RED LED17����ž�ʥ�å��饤��(��å���������)
#
# ��SW-C������
# ��CddButton
#   - KEY0��KEY1�ξ��֤��������
# ��SensorButton
#   - ��ž�ʥ�å������å���ON�ξ��ϡ���å��饤�Ȥ������������Ļؼ��򤷤ʤ�
#   - ��ž�ʥ�å������å���OFF�ξ��ϡ���å��饤�Ȥ��������
#     KEY0��KEY1�ξ��֤���PowerWindowController�س��Ĥ��׵��Ф�
# ��PowerWindowController
#   - SensorButton�����׵�������ꡤCddWindow�س��Ĥλؼ���Ф�
# ��CddWindow
#   - PowerWindowController�������������ꡤGREEN LED�˳��Ĥ��ͻҤ�ɽ������
# ��CddLockLed
#   - RED LED17�˥�å����֤��ͻҤ�ɽ������
# ��CddLockSwitch
#   - SW17�ξ��֤��������
#
# ��ե����빽����
# ��SystemDesk.arxml
#   - SystemDesk�Ǻ������������ƥ�ǥ�������ץ����ե�����
# ��CddButton.c
#   - CddButton����������
# ��SensorButton.c
#   - SensorButton����������
# ��PowerWindowController.c
#   - PowerWindowController����������
# ��CddWindow.c
#   - CddWindow����������
# ��CddLockLed.c
#   - CddLockLed����������
# ��CddLockSwitch.c
#   - CddLockSwitch����������
# ��PWCTopLevel.png
#   - SystemDesk�ˤ��SW-C������
# ��PowerWindowController2.yaml
#   - OS��RTE�Υ���ե�����졼�����ե�����
#


#
# �����
#

# OS�����������ɤޤǤ����Хѥ�
OS_PATH=../../../../atk2-sc1

# A-RTEGEN�ޤǤ����Хѥ�
RTE_PATH=../../../

# A-WDGSTACK�ޤǤ����Хѥ�
WDG_PATH=../../../../a-wdgstack

# ���̥����������ɤޤǤ����Хѥ�
GENERAL_PATH=$RTE_PATH/sample/general

# �������å�̾
TARGET=nios2_dev_gcc

# ���ץꥱ�������̾(OS����ե�����졼�����ե�����̾)
APPLICATION=PowerWindowController2

# �ӥ�ɥ⥸�塼��̾
MODULE="CddButton.o SensorButton.o PowerWindowController.o CddWindow.o CddLockSwitch.o CddLockLed.o WdgState.o Rte_Stub.o"

CMP_OPT="-o -DTOPPERS_USE_WDGSTACK"

#
# ���������ɰ��������
#
if [ $1 ] && [ $1 == "del" ]
then
	make realclean
	rm -f Rte* Makefile* $APPLICATION.arxml WdgM_* WdgIf_* Wdg_* SchM_* *.bak *.log
	exit
fi

# A-WDGSTACK��ɬ�פʥ⥸�塼��
MODULE="$MODULE WdgM.o WdgM_PBcfg.o WdgM_Cfg.o WdgIf.o Wdg.o Wdg_PBcfg.o Wdg_Irq.o"

#
# ����������
#

# configure������ץȤˤ��Makefile����
perl $OS_PATH/configure -T $TARGET -A Rte \
	-a "$WDG_PATH/wdgm $WDG_PATH/wdgif $WDG_PATH/wdg/ $WDG_PATH/stub ./stub $WDG_PATH/wdg/target/nios2_dev_gcc $GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar" \
	-C $APPLICATION \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o" "$CMP_OPT"

# ABREX�ˤ��ARXML�κ���
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml

# A-RTEGEN�ˤ��A-RTE�⥸�塼�����
$RTE_PATH/bin/bin/rtegen.sh $OS_PATH/target/$TARGET/target_hw_counter.arxml ./SystemDesk.arxml $APPLICATION.arxml

# A-WdgM�����ͥ졼���ˤ��A-WdgM�⥸�塼�����
echo "Generate WdgM"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $WDG_PATH/wdgm/wdgm.ini --api-table $WDG_PATH/wdgm/wdgm.csv -T $WDG_PATH/wdgm/wdgm.tf $APPLICATION.arxml $OS_PATH/target/$TARGET/target_hw_counter.arxml

echo "Generate WdgIf"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $WDG_PATH/wdgif/wdgif.ini --api-table $WDG_PATH/wdgif/wdgif.csv -T $WDG_PATH/wdgif/wdgif.tf $APPLICATION.arxml

echo "Generate Wdg"
$OS_PATH/cfg/cfg/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file $WDG_PATH/wdg/wdg.ini --api-table $WDG_PATH/wdg/wdg.csv -I $WDG_PATH/wdg -T $WDG_PATH/wdg/target/$TARGET/Wdg_Target.tf $APPLICATION.arxml

# RTEGEN��mode switch���б�����ޤǤδ֡�Rte_WdgM.h��Rte_Stub.h���ɲä���
if [ -e Rte_WdgM.h ]
then
	mv Rte_WdgM.h Rte_WdgM.orig
	perl -le 'open(FH,"Rte_WdgM.orig");	open(WF,">>Rte_WdgM.h"); while(my $line=<FH>){chomp($line);print WF $line;if(index($line,"#include \"Rte_WdgM_Type.h\"")!=-1){print WF "#include \"Rte_Stub.h\"";}}'
	rm Rte_WdgM.orig
fi
