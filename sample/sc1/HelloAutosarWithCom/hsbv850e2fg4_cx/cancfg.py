#!python
# -*- coding: euc-jp -*-
#
#  TOPPERS ATK2
#      Toyohashi Open Platform for Embedded Real-Time Systems
#      Automotive Kernel Version 2
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
# $Id: cancfg.py 427 2015-03-23 12:38:40Z mtakada $
#

import os.path
import os
import subprocess
import sys
import time

os.chdir(os.path.dirname(project.Path))

common.Source("./def.py")

src_abs_path = os.path.abspath(SRCDIR)
wd_abs_path = os.path.abspath('.')
proj_rel_dir = ""

common.Source(src_abs_path + "/arch/cx/common.py")

project.Create(wd_abs_path + "\\cancfg\\cfg",
				MicomType.V850, 
				TARGET_MCU, 
				ProjectKind.Application,
				Compiler.CX,
				False)

str = src_abs_path + '\\' + statup_file
project.File.Add(str, u"�������ȥ��å�")

project.File.Add("cfg1_out.c", u"configuration")

project.Close(True)

inputstr = ReadFile('./cancfg/cfg.mtpj')

inputstr = NewSetCxIncludes(inputstr, cfg_rel_includes, INCLUDES, "../" + SRCDIR)
inputstr = NewSetCxIncludes(inputstr, cfg_rel_includes, ['.', 'arch/fcn', 'target/hsbv850e2fg4_cx'], '../../../../../../a-comstack/can/')
inputstr = ChangeItemXml(inputstr, 'OutputMessageFormat-0', '%Program% %Options%')
inputstr = ChangeItemXml(inputstr, 'UseProEpiRuntimeLibrary-0', 'False')
inputstr = ChangeItemXml(inputstr, 'HexadecimalFileFormat-0','MotrolaSType32Bit')
inputstr = ChangeItemXml(inputstr, 'HexadecimalFileName-0', 'cfg1_out.srec')
inputstr = ChangeItemXml(inputstr, 'OutputLinkMapFile-0', 'True')
inputstr = ChangeItemXml(inputstr, 'OutputSymbolInformationToLinkMapFile-0', 'True')
inputstr = ChangeItemXml(inputstr, 'HexadecimalFileOutputFolder-0', '.')
inputstr = NewSetDefine(inputstr, USER_MACRO)

WriteFile('./cancfg/cfg.mtpj', inputstr)

project.Open('./cancfg/cfg.mtpj')

cfg_command = cfg + " --pass 1 " + "--kernel " + CFG_KERNEL 
cfg_command += " --api-table " + cfg_api_table
cfg_command += " " + cfg_cfg1_def_tables + " --cfg1-def-table ../../../../../../a-comstack/can/arch/fcn/prc_def.csv " + cfg_includes 
cfg_command += " --ini-file " + cfg_ini_file
cfg_command += " " + cfg_input_str

print cfg_command

try:
	output = subprocess.check_output(cfg_command, stderr=subprocess.STDOUT)
except subprocess.CalledProcessError, e:
	print "ERROR!! : ", e.output

print output

if build.All():

	inputfile = open("./cancfg/DefaultBuild/cfg.map")
	outputfile = open("./cfg1_out.syms", 'w')

	r = re.compile("^\s+\d+\s+(0x[0-9a-f]+)\s+0x[0-9a-f]+\s+\w+\s+\w+\s+(\w+)")
	line = inputfile.readline() 
	while line:
		line = line.replace('\r\n','')   #delete newline
		m = r.search(line)
		if m:
			outputfile.write(m.group(1) + " T " + m.group(2) + "\n")
		line = inputfile.readline()

	inputfile.close()
	outputfile.close()

project.Close(True)
CubeSuiteExit()
time.sleep(1)
