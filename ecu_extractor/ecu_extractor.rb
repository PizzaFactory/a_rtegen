#!ruby -Ke
#
#  ECU Extractor
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
# $Id: ecu_extractor.rb 427 2015-03-23 12:38:40Z mtakada $

require "pp"
require "rexml/document.rb"
include REXML

if (ARGV.size() == 0)
  abort("Argument error !!")
end

# ���Ϥ��줿���Ƥ�arxml��ޡ�������
sOutputFilePrefix = nil
cAllArxmlData = nil
ARGV.each{|sFileName|
  # �ե����뤬¸�ߤ��ʤ���票�顼
  if (!File.exist?(sFileName))
    abort("Argument error !! [#{sFileName}]")
  end

  # arxml�ե�����Ǥʤ���票�顼
  if (File.extname(sFileName) != ".arxml")
    abort("not ARXML file !! [#{sFileName}]")
  end

  # ���ϥե�����̾�ץ�ե��å�������
  if (sOutputFilePrefix.nil?())
    sOutputFilePrefix = File.dirname(sFileName) + "/" + File.basename(sFileName, File.extname(sFileName)) + "_"
  end

  # XML�饤�֥��Ǥ��ɤ߹���
  if (cAllArxmlData.nil?())
    cAllArxmlData = REXML::Document.new(open(sFileName))
  else
    # ʣ����arxml��ޡ������Ƥ���
    cTempXml = REXML::Document.new(open(sFileName))
    XPath.each(cTempXml, "//AUTOSAR/AR-PACKAGES/AR-PACKAGE"){|cElement|
      cAllArxmlData.elements["AUTOSAR/AR-PACKAGES"].add_element(cElement)
    }
  end
}


# ECU���󥹥��󥹤򸡺�
aEcuInstances = []
XPath.each(cAllArxmlData, "//ECU-INSTANCE/SHORT-NAME"){|cElement|
  aEcuInstances.push(cElement.text())
}

# ECU���󥹥��󥹤�¸�ߤ��ʤ���票�顼
if (aEcuInstances.size() == 0)
  abort("ECU Instance not found !!")
end

# ECU���󥹥������SW-C������Ǽ����ϥå���
hSwcOfEcu = {}
aEcuInstances.each{|sEcu|
  hSwcOfEcu[sEcu] = []
}

# ECU���󥹥�����Υ롼�ȥ���ݥ�����������Ǽ����ϥå���
hCompositionOfEcu = {}
aEcuInstances.each{|sEcu|
  hCompositionOfEcu[sEcu] = nil
}

# ��ECU���󥹥��󥹤˽�°����SW-C������ݥ����������
XPath.each(cAllArxmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  sEcuName = File.basename(cElement.elements["ECU-INSTANCE-REF"].text())
  if (!hSwcOfEcu.has_key?(sEcuName))
    abort("Unknown ECU Instance !! [#{sEcuName}]")
  end

  hSwcOfEcu[sEcuName].push(File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text()))

  if (hCompositionOfEcu[sEcuName].nil?)
    hCompositionOfEcu[sEcuName] = File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPOSITION-REF"].text())
  else
    if (hCompositionOfEcu[sEcuName] != File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPOSITION-REF"].text()))
      abort("Different compositions exist on 1 ECU Instance !! [#{sEcuName}]")
    end
  end
}

# ECU-INSTANCE����ƥʤ���
XPath.each(cAllArxmlData, "//ELEMENTS/ECU-INSTANCE"){|cElement|
  cElement.parent().delete_element(cElement)
}

# SWC-TO-ECU-MAPPING����ƥʤ���
XPath.each(cAllArxmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  cElement.parent().delete_element(cElement)
}

# SWC-BSW-MAPPING����ƥʤ���
XPath.each(cAllArxmlData, "//ELEMENTS/SWC-BSW-MAPPING"){|cElement|
  cElement.parent().delete_element(cElement)
}

cAllArxmlData.freeze()

# ECU���ARXML���������
hSwcOfEcu.each{|sEcu, aSwc|
  cTempXml = cAllArxmlData.deep_clone()

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

  # SW-COMPONENT-PROTOTYPE��̵���ʤ���ˤʤä�COMPOSITION-SW-COMPONENT-TYPE����
  XPath.each(cTempXml, "//ELEMENTS/COMPOSITION-SW-COMPONENT-TYPE/"){|cElement|
    if (cElement.elements["COMPONENTS"].has_elements?() == false)
      cElement.parent().delete_element(cElement)
    end
  }

  # �оݳ���ROOT-SW-COMPOSITION-PROTOTYPE����
  XPath.each(cTempXml, "//ROOT-SOFTWARE-COMPOSITIONS/ROOT-SW-COMPOSITION-PROTOTYPE"){|cElement|
    if (hCompositionOfEcu[sEcu] != cElement.elements["SHORT-NAME"].text())
      cElement.parent().delete_element(cElement)
    end
  }

  # �оݳ���ASSEMBLY-SW-CONNECTOR����
  XPath.each(cTempXml, "//COMPOSITION-SW-COMPONENT-TYPE/CONNECTORS/ASSEMBLY-SW-CONNECTOR"){|cElement|
    sProvider =  File.basename(cElement.elements["PROVIDER-IREF"].elements["CONTEXT-COMPONENT-REF"].text())
    sRequester =  File.basename(cElement.elements["REQUESTER-IREF"].elements["CONTEXT-COMPONENT-REF"].text())
    if (!aSwc.include?(sProvider) || !aSwc.include?(sRequester))
      cElement.parent().delete_element(cElement)
    end
  }

  # ASSEMBLY-SW-CONNECTOR��̵���ʤ���ˤʤä�CONNECTORS����
  XPath.each(cTempXml, "//ELEMENTS/COMPOSITION-SW-COMPONENT-TYPE/CONNECTORS"){|cElement|
    if (cElement.has_elements?() == false)
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

  # ���ϥե�����̾��<��Ƭ�Υե�����̾>_<ECU���󥹥���̾>.arxml
  sOutputName = sOutputFilePrefix + sEcu + ".arxml"
  File.open(sOutputName, "w") {|io|
    io.print(sXmlCode)
  }
  puts("Generated #{sOutputName}")
}
