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
package jp.ac.nagoya_u.is.nces.a_rte.app;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.app.internal.CmdLineParserUtils;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.ContractPhaseRteGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratePhaseRteGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratorOptions;
import jp.ac.nagoya_u.is.nces.a_rte.app.internal.IRteGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelEnvironment;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.GeneratorInfos;
import jp.ac.nagoya_u.is.nces.a_rte.validation.ModelValidationEnvironment;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

/**
 * RTE�����ͥ졼���Υ��ץꥱ�������ǽ���󶡤��롣
 */
public class RteGeneratorApp {
	private static final Logger LOGGER = Logger.getLogger(RteGeneratorApp.class.getName());

	private GeneratePhaseRteGenerator generatePhaseRteGenerator;
	private ContractPhaseRteGenerator contractPhaseRteGenerator;

	private final GeneratorInitOptions generatorInitOptions;

	/**
	 * RTE�����ͥ졼����Java���ץꥱ�������¹Ի��Υ���ȥ�ݥ���ȡ�
	 * @param args Java���ץꥱ�������¹԰���
	 */
	public static void main(String[] args) {
		RteGeneratorApp app = new RteGeneratorApp();
		app.execute(args);
	}

	/**
	 * �ǥե���Ȥ�{@link RteGeneratorApp}���ۤ��롣
	 */
	public RteGeneratorApp() {
		GeneratorInitOptions generatorInitOptions = new GeneratorInitOptions();
		generatorInitOptions.internalDataTypesFile = AppResources.getDefaultInternalDataTypesFile();
		generatorInitOptions.schemaFile = AppResources.getDefaultSchemaFile();
		generatorInitOptions.uncrustifyExecutableFile = AppResources.getDefaultUncrustifyExecutableFile();
		generatorInitOptions.uncrustifyConfigFile = AppResources.getDefaultUncrustifyConfigFile();
		this.generatorInitOptions = generatorInitOptions;
	}

	/**
	 * ���ץꥱ�������ν���������ꤷ��{@link RteGeneratorApp}���ۤ��롣
	 * @param generatorInitOptions ���ץꥱ�������ν�������ץ����
	 */
	public RteGeneratorApp(GeneratorInitOptions generatorInitOptions) {
		this.generatorInitOptions = generatorInitOptions;
	}

	/**
	 * ���ץꥱ��������¹Ԥ��롣
	 * @param args ���ץꥱ�������¹԰���
	 */
	public void execute(String[] args) {
		GeneratorOptions options = new GeneratorOptions();

		CmdLineParser parser = new CmdLineParser(options);
		parser.setUsageWidth(100);

		try {
			parser.parseArgument(args);

		} catch (CmdLineException e) {
			// ɽ�����ץ����ʥإ��ɽ�����⤷���ϥС������ɽ���ˤ����ꤵ�줿���ϡ����顼��̵�뤹��
			if (!options.isShowsOptionEnabled()) {
				System.err.println("Invalid command line options.");
				System.err.println(e.getMessage());
				System.err.println();
				showUsage(System.err, parser);
				return;
			}
		}

		if (options.showsHelp) {
			showUsage(System.out, parser);
			return;
		}

		if (options.showsVersion) {
			showVersion();
			return;
		}

		generate(options);
	}

	private void showUsage(PrintStream outputStream, CmdLineParser parser) {
		outputStream.print("Usage: rtegen");
		CmdLineParserUtils.printSingleLineUsage(parser, outputStream);
		outputStream.println();
		outputStream.println();
		parser.printUsage(outputStream);
	}

	private void showVersion() {
		System.out.println(GeneratorInfos.GENERATOR_COMMAND_NAME + " (" + GeneratorInfos.GENERATOR_TOOL_NAME + ") " + GeneratorInfos.GENERATOR_VERSION);
	}

	private void generate(GeneratorOptions options) {
		options.inputFiles.add(0, this.generatorInitOptions.internalDataTypesFile.getAbsolutePath());

		try {
			// RTE�����ͥ졼����¹�
			IRteGenerator rteGenerator = getRteGenerator(options);
			rteGenerator.generate(options);

		} catch (AppException e) {
			System.err.println("Generation cancelled on error.");
			LOGGER.log(Level.SEVERE, e.getMessage(), e);

		} catch (Exception e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			System.err.println("Generation cancelled on error.");
			LOGGER.log(Level.SEVERE, "Internal error occurred.", e);
		}
	}

	private IRteGenerator getRteGenerator(GeneratorOptions options) throws AppException {
		switch (options.generationPhase) {
		case CONTRACT:
			return this.getContractPhaseRteGenerator();
		case GENERATE:
		default:
			return this.getGeneratePhaseRteGenerator();
		}
	}

	private GeneratePhaseRteGenerator getGeneratePhaseRteGenerator() throws AppException {
		if (this.generatePhaseRteGenerator == null) {
			ModelEnvironment.initializeEnvironment();
			ModelValidationEnvironment.initializeEnvironment();

			GeneratePhaseRteGenerator generator = new GeneratePhaseRteGenerator(this.generatorInitOptions);
			this.generatePhaseRteGenerator = generator;
		}
		return this.generatePhaseRteGenerator;
	}

	private ContractPhaseRteGenerator getContractPhaseRteGenerator() throws AppException {
		if (this.contractPhaseRteGenerator == null) {
			ModelEnvironment.initializeEnvironment();
			ModelValidationEnvironment.initializeEnvironment();

			ContractPhaseRteGenerator generator = new ContractPhaseRteGenerator(this.generatorInitOptions);
			this.contractPhaseRteGenerator = generator;
		}
		return this.contractPhaseRteGenerator;
	}
}
