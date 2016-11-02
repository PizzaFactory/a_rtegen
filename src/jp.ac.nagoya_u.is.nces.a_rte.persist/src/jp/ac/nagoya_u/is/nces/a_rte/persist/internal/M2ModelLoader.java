/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
 *  Copyright (C) 2016 by Monami-ya LLC, Japan
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
 *  $Id $
 */
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

public class M2ModelLoader {
	private final SAXParser saxParser;

	public M2ModelLoader(File schemaFile) throws PersistException {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setNamespaceAware(true);
		spf.setSchema(createSchema(schemaFile));

		try {
			this.saxParser = spf.newSAXParser();

		} catch (ParserConfigurationException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new PersistException("Internal error occurred while initialize model loader. ", e);

		} catch (SAXException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new PersistException("Internal error occurred while initialize model loader. ", e);
		}
	}

	private Schema createSchema(File schemaFile) throws PersistException {
		SchemaFactory factory = SchemaFactory.newInstance(M2XmlUtils.W3C_XML_SCHEMA);
		try {
			return factory.newSchema(schemaFile);
		} catch (SAXException e) {
			throw new PersistException("Error occurred while loading an AUTOSAR XML schema file. Please confirm that the file is installed.", e);
		}
	}

	public M2Root load(String file) throws PersistException {
		M2ModelLoadHandler handler = new M2ModelLoadHandler();

		try {
			XMLReader xmlReader = this.saxParser.getXMLReader();
			xmlReader.setContentHandler(handler);
			xmlReader.setErrorHandler(new ErrorHandler() {
				@Override
				public void warning(SAXParseException exception) throws SAXException { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				}

				@Override
				public void error(SAXParseException exception) throws SAXException {
					throw exception;
				}

				@Override
				public void fatalError(SAXParseException exception) throws SAXException {
					throw exception;
				}
			});
			xmlReader.parse(convertToFileURL(file));

		} catch (SAXException | IOException e) {
			throw new PersistException("Error occurred while loading file " + file + ". " + e.getMessage(), e);
		}

		return handler.getM2Root();
	}

	private static String convertToFileURL(String filename) {
		String path = new File(filename).getAbsolutePath();
		if (File.separatorChar != '/') { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			path = path.replace(File.separatorChar, '/');
		}

		if (!path.startsWith("/")) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			path = "/" + path;
		}
		return "file:" + path;
	}
}
