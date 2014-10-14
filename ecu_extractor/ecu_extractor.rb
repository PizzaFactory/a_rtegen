#!ruby -Ke
#
#  ECU Extractor
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
# $Id: ecu_extractor.rb 141 2014-09-26 09:13:20Z mtakada $

require "pp"
require "rexml/document.rb"
include REXML

if (ARGV.size() == 0)
  abort("Argument error !!")
end
sFileName = ARGV[0]

# �ե����뤬¸�ߤ��ʤ���票�顼
if (!File.exist?(sFileName))
  abort("Argument error !! [#{sFileName}]")
end

# ���ϥե�����̾����
if (File.extname(sFileName) != ".arxml")
  abort("not ARXML file !! [#{sFileName}]")
end

# XML�饤�֥��Ǥ��ɤ߹���
cXmlData = REXML::Document.new(open(sFileName))

# ECU���󥹥��󥹤򸡺�
aEcuInstances = []
XPath.each(cXmlData, "//ECU-INSTANCE/SHORT-NAME"){|cElement|
  aEcuInstances.push(cElement.text())
}

# ECU���󥹥��󥹤�¸�ߤ��ʤ���票�顼
if (aEcuInstances.size() == 0)
  abort("ECU Instance not found !! [#{sFileName}]")
end

# ECU���󥹥������SW-C������Ǽ����ϥå������
hEcuData = {}
aEcuInstances.each{|sEcu|
  hEcuData[sEcu] = []
}

# ��ECU���󥹥��󥹤˽�°����SW-C�����
XPath.each(cXmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  sEcuName = File.basename(cElement.elements["ECU-INSTANCE-REF"].text())
  if (!hEcuData.has_key?(sEcuName))
    abort("Unknown ECU Instance !! [#{sEcuName}]")
  end
  hEcuData[sEcuName].push(File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text()))
}

# CONNECTORS����ƥʤ���
XPath.each(cXmlData, "//COMPOSITION-SW-COMPONENT-TYPE/CONNECTORS"){|cElement|
  cElement.parent().delete_element(cElement)
}

# ECU-INSTANCE����ƥʤ���
XPath.each(cXmlData, "//ELEMENTS/ECU-INSTANCE"){|cElement|
  cElement.parent().delete_element(cElement)
}

# SWC-TO-ECU-MAPPING����ƥʤ���
XPath.each(cXmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  cElement.parent().delete_element(cElement)
}

cXmlData.freeze()

# ECU���ARXML���������
hEcuData.each{|sEcu, aSwc|
  cTempXml = cXmlData.deep_clone()

  # �оݳ���APPLICATION-SW-COMPONENT-TYPE����
  XPath.each(cTempXml, "//ELEMENTS/APPLICATION-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # �оݳ���COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE����
  XPath.each(cTempXml, "//ELEMENTS/COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # �оݳ���SENSOR-ACTUATOR-SW-COMPONENT-TYPE����
  XPath.each(cTempXml, "//ELEMENTS/SENSOR-ACTUATOR-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # �оݳ���SENDER-RECEIVER-TO-SIGNAL-MAPPING����
  XPath.each(cTempXml, "//MAPPINGS/SYSTEM-MAPPING/DATA-MAPPINGS/SENDER-RECEIVER-TO-SIGNAL-MAPPING"){|cElement|
    if (!aSwc.include?(File.basename(cElement.elements["DATA-ELEMENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text())))
      cElement.parent().delete_element(cElement)
    end
  }

  # �оݳ���SW-COMPONENT-PROTOTYPE����
  XPath.each(cTempXml, "//COMPOSITION-SW-COMPONENT-TYPE/COMPONENTS/SW-COMPONENT-PROTOTYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # �ڤ�Ф���XMLʸ�������
  sXmlCode = String.new()
  cTempXml.write(sXmlCode, 4, false)
  sXmlCode.gsub!("'", "\"")
  sXmlCode.gsub!(/>\n[\s]+([\w\.\[\]\(\)\+-\/\*~&;\s]*?)\n[\s]+</, ">\\1<")
  sXmlCode.gsub!("    ", "\t")
  sXmlCode.gsub!("\n", "\r\n")

  # ���ϥե�����̾��<���Υե�����̾>_<ECU���󥹥���̾>.arxml
  sOutputName = File.dirname(sFileName) + "/" + File.basename(sFileName, File.extname(sFileName)) + "_" + sEcu + File.extname(sFileName)
  File.open(sOutputName, "w") {|io|
    io.print(sXmlCode)
  }
  puts("Generated #{sOutputName}")
}
