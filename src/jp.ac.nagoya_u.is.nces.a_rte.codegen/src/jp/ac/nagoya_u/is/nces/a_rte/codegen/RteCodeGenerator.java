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
package jp.ac.nagoya_u.is.nces.a_rte.codegen;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.codegen.internal.InternalCodeFormatter;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.internal.InternalCodegenException;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.rte.main.RteCodes;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;

import org.eclipse.acceleo.engine.event.AbstractAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.emf.common.util.BasicMonitor;

import com.google.common.collect.Lists;

public class RteCodeGenerator {

	private final List<CodeFormatter> codeFormatters = Lists.newArrayList();

	public static RteCodeGenerator forGeneratePhase() {
		return new RteCodeGenerator();
	}

	public static RteCodeGenerator forContractPhase() {
		return new RteCodeGenerator();
	}

	private RteCodeGenerator() {
		this.codeFormatters.add(new InternalCodeFormatter());
	}

	public void addCodeFormatter(CodeFormatter codeFormatter) {
		this.codeFormatters.add(codeFormatter);
	}

	public void generate(RteModule rteModule, File outputDirectory) throws CodegenException {
		try {
			final List<InternalCodegenException> caughtExceptions = Lists.newArrayList();

			RteCodes rteCodes = new RteCodes(rteModule, outputDirectory, Collections.emptyList());
			rteCodes.addGenerationListener(new AbstractAcceleoTextGenerationListener() {
				@Override
				public void fileGenerated(AcceleoTextGenerationEvent event) {
					File generatedFile = new File(event.getText());
					try {
						for (CodeFormatter codeFormatter : RteCodeGenerator.this.codeFormatters) {
							codeFormatter.format(generatedFile);
						}
					} catch (InternalCodegenException e) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
						caughtExceptions.add(e);
					}
				}
			});

			rteCodes.doGenerate(new BasicMonitor());

			if (!caughtExceptions.isEmpty()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				throw new CodegenException("Error occurred while generating RTE codes. " + caughtExceptions.get(0).getMessage(), caughtExceptions.get(0));
			}

		} catch (IOException e) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			throw new CodegenException("Error occurred while generating RTE codes. " + e.getMessage(), e);
		}
	}
}
