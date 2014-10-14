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
# $Id: ecu_extractor.rb 141 2014-09-26 09:13:20Z mtakada $

require "pp"
require "rexml/document.rb"
include REXML

if (ARGV.size() == 0)
  abort("Argument error !!")
end
sFileName = ARGV[0]

# ファイルが存在しない場合エラー
if (!File.exist?(sFileName))
  abort("Argument error !! [#{sFileName}]")
end

# 出力ファイル名作成
if (File.extname(sFileName) != ".arxml")
  abort("not ARXML file !! [#{sFileName}]")
end

# XMLライブラリでの読み込み
cXmlData = REXML::Document.new(open(sFileName))

# ECUインスタンスを検索
aEcuInstances = []
XPath.each(cXmlData, "//ECU-INSTANCE/SHORT-NAME"){|cElement|
  aEcuInstances.push(cElement.text())
}

# ECUインスタンスが存在しない場合エラー
if (aEcuInstances.size() == 0)
  abort("ECU Instance not found !! [#{sFileName}]")
end

# ECUインスタンス毎のSW-C情報を格納するハッシュ定義
hEcuData = {}
aEcuInstances.each{|sEcu|
  hEcuData[sEcu] = []
}

# 各ECUインスタンスに所属するSW-Cを取得
XPath.each(cXmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  sEcuName = File.basename(cElement.elements["ECU-INSTANCE-REF"].text())
  if (!hEcuData.has_key?(sEcuName))
    abort("Unknown ECU Instance !! [#{sEcuName}]")
  end
  hEcuData[sEcuName].push(File.basename(cElement.elements["COMPONENT-IREFS"].elements["COMPONENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text()))
}

# CONNECTORSコンテナを削除
XPath.each(cXmlData, "//COMPOSITION-SW-COMPONENT-TYPE/CONNECTORS"){|cElement|
  cElement.parent().delete_element(cElement)
}

# ECU-INSTANCEコンテナを削除
XPath.each(cXmlData, "//ELEMENTS/ECU-INSTANCE"){|cElement|
  cElement.parent().delete_element(cElement)
}

# SWC-TO-ECU-MAPPINGコンテナを削除
XPath.each(cXmlData, "//SW-MAPPINGS/SWC-TO-ECU-MAPPING"){|cElement|
  cElement.parent().delete_element(cElement)
}

cXmlData.freeze()

# ECU毎にARXMLを作成する
hEcuData.each{|sEcu, aSwc|
  cTempXml = cXmlData.deep_clone()

  # 対象外のAPPLICATION-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/APPLICATION-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のCOMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSENSOR-ACTUATOR-SW-COMPONENT-TYPEを削除
  XPath.each(cTempXml, "//ELEMENTS/SENSOR-ACTUATOR-SW-COMPONENT-TYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSENDER-RECEIVER-TO-SIGNAL-MAPPINGを削除
  XPath.each(cTempXml, "//MAPPINGS/SYSTEM-MAPPING/DATA-MAPPINGS/SENDER-RECEIVER-TO-SIGNAL-MAPPING"){|cElement|
    if (!aSwc.include?(File.basename(cElement.elements["DATA-ELEMENT-IREF"].elements["CONTEXT-COMPONENT-REF"].text())))
      cElement.parent().delete_element(cElement)
    end
  }

  # 対象外のSW-COMPONENT-PROTOTYPEを削除
  XPath.each(cTempXml, "//COMPOSITION-SW-COMPONENT-TYPE/COMPONENTS/SW-COMPONENT-PROTOTYPE"){|cElement|
    if (!aSwc.include?(cElement.elements["SHORT-NAME"].text()))
      cElement.parent().delete_element(cElement)
    end
  }

  # 切り出したXML文字列作成
  sXmlCode = String.new()
  cTempXml.write(sXmlCode, 4, false)
  sXmlCode.gsub!("'", "\"")
  sXmlCode.gsub!(/>\n[\s]+([\w\.\[\]\(\)\+-\/\*~&;\s]*?)\n[\s]+</, ">\\1<")
  sXmlCode.gsub!("    ", "\t")
  sXmlCode.gsub!("\n", "\r\n")

  # 出力ファイル名：<元のファイル名>_<ECUインスタンス名>.arxml
  sOutputName = File.dirname(sFileName) + "/" + File.basename(sFileName, File.extname(sFileName)) + "_" + sEcu + File.extname(sFileName)
  File.open(sOutputName, "w") {|io|
    io.print(sXmlCode)
  }
  puts("Generated #{sOutputName}")
}
