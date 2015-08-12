/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.google.common.base.Strings;

public class IndentingXMLStreamWriter implements XMLStreamWriter {

	private static final String DEFAULT_INDENT_CHARS = "\t";
	private static final String DEFAULT_LINE_SEPARATOR = "\n";

	private final XMLStreamWriter xmlStreamWriter;
	private int indentLevel = 0;

	private int prevEventType;
	private final String lineSeparator;
	private final String indentChars;

	public IndentingXMLStreamWriter(XMLStreamWriter xmlStreamWriter) {
		this.xmlStreamWriter = xmlStreamWriter;
		this.lineSeparator = DEFAULT_LINE_SEPARATOR;
		this.indentChars = DEFAULT_INDENT_CHARS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#close()
	 */
	@Override
	public void close() throws XMLStreamException {
		this.xmlStreamWriter.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#flush()
	 */
	@Override
	public void flush() throws XMLStreamException {
		this.xmlStreamWriter.flush();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#getNamespaceContext()
	 */
	@Override
	public NamespaceContext getNamespaceContext() {
		return this.xmlStreamWriter.getNamespaceContext(); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#getPrefix(java.lang.String)
	 */
	@Override
	public String getPrefix(String uri) throws XMLStreamException {
		return this.xmlStreamWriter.getPrefix(uri); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#getProperty(java.lang.String)
	 */
	@Override
	public Object getProperty(String name) throws IllegalArgumentException {
		return this.xmlStreamWriter.getProperty(name); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#setDefaultNamespace(java.lang.String)
	 */
	@Override
	public void setDefaultNamespace(String uri) throws XMLStreamException { // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
		this.xmlStreamWriter.setDefaultNamespace(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#setNamespaceContext(javax.xml.namespace
	 * .NamespaceContext)
	 */
	@Override
	public void setNamespaceContext(NamespaceContext context) throws XMLStreamException {
		this.xmlStreamWriter.setNamespaceContext(context); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#setPrefix(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void setPrefix(String prefix, String uri) throws XMLStreamException {
		this.xmlStreamWriter.setPrefix(prefix, uri); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeAttribute(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void writeAttribute(String prefix, String namespaceURI, String localName, String value) throws XMLStreamException {
		this.xmlStreamWriter.writeAttribute(prefix, namespaceURI, localName, value); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeAttribute(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void writeAttribute(String namespaceURI, String localName, String value) throws XMLStreamException {
		this.xmlStreamWriter.writeAttribute(namespaceURI, localName, value); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeAttribute(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeAttribute(String localName, String value) throws XMLStreamException {
		this.xmlStreamWriter.writeAttribute(localName, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeCData(java.lang.String)
	 */
	@Override
	public void writeCData(String data) throws XMLStreamException {
		this.xmlStreamWriter.writeCData(data); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeCharacters(char[], int, int)
	 */
	@Override
	public void writeCharacters(char[] text, int start, int len) throws XMLStreamException {
		this.xmlStreamWriter.writeCharacters(text, start, len); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeCharacters(java.lang.String)
	 */
	@Override
	public void writeCharacters(String text) throws XMLStreamException {
		this.xmlStreamWriter.writeCharacters(text);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeComment(java.lang.String)
	 */
	@Override
	public void writeComment(String data) throws XMLStreamException {
		this.xmlStreamWriter.writeComment(data); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeDTD(java.lang.String)
	 */
	@Override
	public void writeDTD(String dtd) throws XMLStreamException {
		this.xmlStreamWriter.writeDTD(dtd); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeDefaultNamespace(java.lang.String)
	 */
	@Override
	public void writeDefaultNamespace(String namespaceURI) throws XMLStreamException {
		this.xmlStreamWriter.writeDefaultNamespace(namespaceURI); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEmptyElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void writeEmptyElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		beforeStartElement();
		beforeEndElement();
		this.xmlStreamWriter.writeEmptyElement(prefix, localName, namespaceURI); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEmptyElement(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeEmptyElement(String namespaceURI, String localName) throws XMLStreamException {
		this.xmlStreamWriter.writeEmptyElement(namespaceURI, localName); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEmptyElement(java.lang.String)
	 */
	@Override
	public void writeEmptyElement(String localName) throws XMLStreamException {
		this.xmlStreamWriter.writeEmptyElement(localName); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEndDocument()
	 */
	@Override
	public void writeEndDocument() throws XMLStreamException {
		this.xmlStreamWriter.writeEndDocument();
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEndElement()
	 */
	@Override
	public void writeEndElement() throws XMLStreamException {
		beforeEndElement();
		this.xmlStreamWriter.writeEndElement();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeEntityRef(java.lang.String)
	 */
	@Override
	public void writeEntityRef(String name) throws XMLStreamException {
		this.xmlStreamWriter.writeEntityRef(name); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeNamespace(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeNamespace(String prefix, String namespaceURI) throws XMLStreamException {
		this.xmlStreamWriter.writeNamespace(prefix, namespaceURI);
	}

	@Override
	public void writeProcessingInstruction(String target, String data) throws XMLStreamException {
		this.xmlStreamWriter.writeProcessingInstruction(target, data); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeProcessingInstruction(java.lang
	 * .String)
	 */
	@Override
	public void writeProcessingInstruction(String target) throws XMLStreamException {
		this.xmlStreamWriter.writeProcessingInstruction(target); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartDocument()
	 */
	@Override
	public void writeStartDocument() throws XMLStreamException {
		this.xmlStreamWriter.writeStartDocument(); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeStartDocument(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeStartDocument(String encoding, String version) throws XMLStreamException {
		this.xmlStreamWriter.writeStartDocument(encoding, version);
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.xml.stream.XMLStreamWriter#writeStartDocument(java.lang.String)
	 */
	@Override
	public void writeStartDocument(String version) throws XMLStreamException {
		this.xmlStreamWriter.writeStartDocument(version); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
		lineFeed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void writeStartElement(String prefix, String localName, String namespaceURI) throws XMLStreamException {
		beforeStartElement();
		this.xmlStreamWriter.writeStartElement(prefix, localName, namespaceURI); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartElement(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void writeStartElement(String namespaceURI, String localName) throws XMLStreamException {
		beforeStartElement();
		this.xmlStreamWriter.writeStartElement(namespaceURI, localName); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.xml.stream.XMLStreamWriter#writeStartElement(java.lang.String)
	 */
	@Override
	public void writeStartElement(String localName) throws XMLStreamException {
		beforeStartElement();
		this.xmlStreamWriter.writeStartElement(localName);
	}

	private void beforeStartElement() throws XMLStreamException {
		if (this.prevEventType == XMLStreamConstants.START_ELEMENT) {
			incrementIndent();
		}
		lineFeed();
		this.prevEventType = XMLStreamConstants.START_ELEMENT;
	}

	private void beforeEndElement() throws XMLStreamException {
		if (this.prevEventType == XMLStreamConstants.END_ELEMENT) {
			decrementIndent();
			lineFeed();
		}
		this.prevEventType = XMLStreamConstants.END_ELEMENT;
	}

	private void lineFeed() throws XMLStreamException {
		this.xmlStreamWriter.writeCharacters(this.lineSeparator + Strings.repeat(this.indentChars, this.indentLevel));
	}

	private void incrementIndent() {
		this.indentLevel++;
	}

	private void decrementIndent() {
		this.indentLevel--;
	}

}