/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.codegen.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.regex.Pattern;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * �����������ɤ˥ե����ޥåȤ�ݤ��ޤ�
 */
public class CSourceFormatter {

	private static final String DEFAULT_LINE_SEPARATOR = "\n";
	private static final String DEFAULT_INDENT_CHARS = "\t";

	/** {����Ƚ��ѥ����� */
	private static final Pattern IF_CLOSE_PATTERN = Pattern.compile("\\{(/\\*.*\\*/|\\s)*\\\\?\\s*$");
	private static final Pattern EXTERN_C_PATTERN = Pattern.compile("extern\\s*\"C\"");

	/** ����ǥ�Ȥ򤫤��륪�ڥ졼�������� */
	private static final List<String> INDENT_OPERATORS = Lists.newArrayList("+", "-", "=", "|", "?", "&&", "||");
	/** ����ǥ�Ȥ򤫤��ʤ����ڥ졼�������� */
	private static final List<String> NON_INDENT_OPERATORS = Lists.newArrayList("++", "--");

	/** IndexCount */
	private int indexCount = 0;

	/** ���Ԥ˥���ǥ�Ȥ�ݤ���٤����ɤ��� */
	private boolean isNextLineShoudIndexed = false;

	private final Reader reader;
	private final Writer writer;
	private final String lineSeparator;
	private final String indentChars;

	/**
	 * @param reader �ե����ޥåȤ�ݤ�����ʸ��������ϸ�Reader
	 * @param writer �ե����ޥåȸ�ʸ����ν�����Writer
	 */
	public CSourceFormatter(Reader reader, Writer writer) {
		this.reader = reader;
		this.writer = writer;
		this.lineSeparator = DEFAULT_LINE_SEPARATOR;
		this.indentChars = DEFAULT_INDENT_CHARS;
	}

	/**
	 * C�����ɥե����ޥåȤ�ݤ��ޤ���
	 * <p>
	 * �ʲ��Υե����ޥåȤ�ݤ��ޤ�
	 * <ul>
	 * <li>����"{"�Υ���ǥ�Ȥ�Tab�ǹԤ�</li>
	 * <li>���԰ʾ�ζ��Ԥϣ��ԤˤޤȤ��</li>
	 * </ul>
	 * </p>
	 * 
	 * @throws IOException
	 */
	public final void format() throws IOException {
		boolean prevLineisEmpty = false;
		BufferedReader bufferedReader = new BufferedReader(this.reader);

		try {
			while (true) {
				String line = bufferedReader.readLine();
				if (line == null) {
					break;
				}
				// �ե����ޥåȤ�ݤ�������򤷤ޤ�
				// ����-> ���ڡ����ִ�
				// �Ԥ�����Υ��ڡ����Υȥ�ߥ�
				String preparedLine = prepareFormatLine(line);

				// 2�԰ʾ���Ԥ�³�����Ͻ񤭹��ߤ��ʤ�
				if (preparedLine.isEmpty() && prevLineisEmpty) {
					continue;
				}
				decIndexCountIfCloseBrace(preparedLine);

				String formattedLine = ajustFormatIndex(ajustOperatorIndex(preparedLine));

				incIndexCountIfStartBrace(preparedLine);

				// ���ԤΥե����ޥåȤν���
				this.isNextLineShoudIndexed = endWithAnyOperatorOf(line, INDENT_OPERATORS);

				if (formattedLine.startsWith("*")) {
					formattedLine = " " + formattedLine;
				}

				String s = formattedLine.trim();
				if (s.isEmpty()) {
					formattedLine = s;
				}
				prevLineisEmpty = formattedLine.isEmpty();

				this.writer.write(formattedLine);
				this.writer.write(this.lineSeparator);
			}
		} finally { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			bufferedReader.close();
		}
	}

	private String ajustFormatIndex(final String line) {
		return createFormatIndex() + line;
	}

	private void incIndexCountIfStartBrace(final String line) {
		if (IF_CLOSE_PATTERN.matcher(line).find() && !EXTERN_C_PATTERN.matcher(line).find()) {
			this.indexCount++;
		}
	}

	private String createFormatIndex() {
		return Strings.repeat(this.indentChars, getIndexCount());
	}

	private int getIndexCount() {
		return this.indexCount;
	}

	private void decIndexCountIfCloseBrace(final String line) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		if (this.indexCount == 0) {
			return;
		}
		if (line.startsWith("}") && !EXTERN_C_PATTERN.matcher(line).find()) {
			this.indexCount--;
		}
	}

	private String prepareFormatLine(final String line) {
		return line.replaceAll("\t", this.indentChars).trim();
	}

	private String ajustOperatorIndex(final String line) {
		if (this.isNextLineShoudIndexed) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return this.indentChars + line;
		} else if (startWithAnyOperatorOf(line, INDENT_OPERATORS) && !startWithAnyOperatorOf(line, NON_INDENT_OPERATORS)) {
			return this.indentChars + line;
		} else {
			return line;
		}
	}

	private boolean endWithAnyOperatorOf(final String line, List<String> indentOperators) {
		return Iterables.any(indentOperators, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return line.endsWith(input);
			}
		});
	}

	private boolean startWithAnyOperatorOf(final String line, List<String> indentOperators) {
		return Iterables.any(indentOperators, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return line.startsWith(input);
			}
		});
	}
}