#!/bin/sh
#
#  TOPPERS/A-RTEGEN
#      Automotive Runtime Environment Generator
#
#  Copyright (C) 2013-2014 by Center for Embedded Computing Systems
#              Graduate School of Information Science, Nagoya Univ., JAPAN
#  Copyright (C) 2013-2014 by FUJISOFT INCORPORATED, JAPAN
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
# $Id: configure.sh 351 2014-03-07 05:31:11Z shigihara $
#

#
# �㥵��ץ륢�ץꥱ��������ס�
# ��ATK2��nios2_dev_gcc��¸���ǥ��ݡ��Ȥ����DE2-115�ܡ��ɤǤΤ�ư���
# ��DE2-115�ܡ��ɾ��LED�������å��ʤɤ���Ѥ��ƥ쥤�󥻥󥵤ˤ�륪����
#   �磻�ѡ����ϵ�����
#
# �������ˡ��
# ��KEY0���߱��̤򸺤餹
# ��KEY1���߱��̤����䤹
# ��SW13�������ȥ⡼��
# ��SW14���ޥ˥奢��⡼��/®��4
# ��SW15���ޥ˥奢��⡼��/®��3
# ��SW16���ޥ˥奢��⡼��/®��2
# ��SW17���ޥ˥奢��⡼��/®��1
# ��7SEG LED�����������ͻҤ�ɽ��
# ��RED LED���磻�ѡ���ư����ɽ��
# ��GREEN LED�����ߤι߱��̤�ɽ��(�߱��̤�4�ʳ�)
#
# ��SW-C������
# ��CddWiperSwitch
#   - SW13��SW17�ξ��֤��������
# ��CddRainSensor
#   - KEY0��KEY1�ξ��֤���߱��̤��Ѳ�������
#   - ���ߤι߱��̤�GREEN LED��ɽ������
# ��AutoWiperController
#   - CddWiperSwitch��CddRainSensor�������������ꡤ�磻�ѡ������椹��
# ��CddDisplayRain
#   - CddRainSensor�������������ꡤ7SEG LED�˸��ߤα��������ͻҤ�ɽ������
# ��CddWiperActuator
#   - AutoWiperController����λٻ��ˤ�ꡤRED LED�˥磻�ѡ���ư����ɽ������
#
# ��ե����빽����
# ��SystemDesk.arxml
#   - SystemDesk�Ǻ������������ƥ�ǥ�������ץ����ե�����
# ��AutoWiperController.c
#   - AutoWiperController����������
# ��CddDisplayRain.c
#   - CddDisplayRain����������
# ��CddRainSensor.c
#   - CddRainSensor����������
# ��CddWiperActuator.c
#   - CddWiperActuator����������
# ��CddWiperSwitch.c
#   - CddWiperSwitch����������
# ��AWCTopLevel.png
#   - SystemDesk�ˤ��SW-C������
# ��AutoWiperController.yaml
#   - OS��RTE�Υ���ե�����졼�����ե�����
#


#
# �����
#

# OS�����������ɤޤǤ����Хѥ�
OS_PATH=../../../../atk2-sc1

# ���̥����������ɤޤǤ����Хѥ�
GENERAL_PATH=../../general

# �������å�̾
TARGET=nios2_dev_gcc

# ���ץꥱ�������̾(OS����ե�����졼�����ե�����̾)
APPLICATION=AutoWiperController

# �ӥ�ɥ⥸�塼��̾
MODULE="AutoWiperController.o CddDisplayRain.o CddRainSensor.o CddWiperActuator.o CddWiperSwitch.o"


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
perl $OS_PATH/configure -T $TARGET -A Rte \
	-a "$GENERAL_PATH/EcuM $GENERAL_PATH/HelloAutosar" \
	-C $APPLICATION \
	-U "$MODULE C_Init_Code.o EcuM.o EcuM_StartupTask.o Os_Hook.o"

# ABREX�ˤ��ARXML�κ���
ruby $OS_PATH/utils/abrex/abrex.rb $APPLICATION.yaml

# A-RTEGEN�ˤ��A-RTE�⥸�塼�����
../../../bin/bin/rtegen $OS_PATH/target/$TARGET/target_hw_counter.arxml ./SystemDesk.arxml $APPLICATION.arxml
