/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *  Copyright (C) 2016 by Monami-ya LLC, Japan
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
package jp.ac.nagoya_u.is.nces.a_rte.app.internal;

import java.io.PrintStream;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteInteractionModelBuilderOptions;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteModuleModelBuilderOptions;

import org.eclipse.core.resources.IProject;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import com.google.common.collect.Lists;

/**
 * RTE�����ͥ졼���μ¹Ի��Υ��ץ�����ɽ����
 */
public class GeneratorOptions {

	/**
	 * RTE�������ե�������ɽ����
	 */
	public enum GenerationPhase {
		/**
		 * CONTRACT�ե�����
		 */
		CONTRACT,

		/**
		 * GENERATE�ե�����
		 */
		GENERATE,
	}

	/**
	 * �إ�פ�ɽ�����뤫�ɤ���
	 */
	@Option(name = "--help", usage = "Display this information")
	public boolean showsHelp = false;

	/**
	 * ��������RTE�Υե��������������Υ����ॹ����פ���Ϥ��뤫�ɤ���
	 */
	@Option(name = "-t", aliases = "--output-timestamp", usage = "Write the generation timestamp in RTE/SCHM codes")
	public boolean writeGenerationTimeStamp = false;

	/**
	 * RTE�����ͥ졼���ΥС�������ɽ�����뤫�ɤ���
	 */
	@Option(name = "-v", aliases = "--version", usage = "Display the version of the RTE generator")
	public boolean showsVersion = false;

	/**
	 * ��������RTE�ν��ϥǥ��쥯�ȥ�Υѥ�
	 */
	@Option(name = "-o", aliases = "--output-directory", usage = "Specify the output directory for generated files (default: .)", metaVar = "<directory>")
	public String outputDirectory = ".";

	/**
	 * RTE�������ե�����
	 */
	@Option(name = "-p", aliases = "--generation-phase", usage = "Specify the RTE/SCHM generation phase(CONTRACT or GENERATE) (default: GENERATE)", metaVar = "<phase>")
	public GenerationPhase generationPhase = GenerationPhase.GENERATE;

	/**
	 * <p>�ǥХå��⡼�ɤ�ͭ���ˤ��뤫�ɤ���</p>
	 * <p>�ǥХå��⡼�ɤ�ͭ�������ꤵ�줿��硢RTE�����ͥ졼���ϼ¹Ի���������ǥ�Υ���ץե��������Ϥ��롣</p>
	 */
	@Option(hidden = true, name = "--debug", usage = "Enable debug mode")
	public boolean debugModeEnabled = false;

	/**
	 * RTE����ե����졼�����إå�����Ϥ��뤫�ɤ���
	 */
	@Option(hidden = true, name = "--suppress-config-header", usage = "Suppress the generation of RTE Configuration Header")
	public boolean suppressConfigHeader = false;

	/**
	 * ����ޥåԥ�header�Υ�����ȥ���������뤫�ɤ���
	 */
	@Option(hidden = true, name = "--generate-memmap-skel", usage = "Generate memory mapping skeltons")
	public boolean doesGenerateMemoryMappingHeaderSkelton = false;

	/**
	 * RTE�ƥ����ѤΥإ�ѥե�����(���ե⥸�塼��Υ����֡���å�)���������뤫�ɤ���
	 */
	@Option(hidden = true, name = "--generate-tests", usage = "Generate test helpers")
	public boolean doesGenerateTests = false;

	/**
	 * <p>RTE����Ū���������뤫�ɤ���</p>
	 * <p>���Υ��ץ�������ꤵ�줿��硢RTE�����ͥ졼���ϡ�RTE��������ɬ�פ�ECUC����ե����졼�������­���Ƥ�����Ǥ⡢����ե����졼������䴰��ǽ�Ǥ����RTE���������롣</p>
	 */
	@Option(hidden = true, name = "--force-generate-rte", usage = "Force to generate RTE")
	public boolean forcesGenerateRte = false;

	/**
	 * <p>static inline�ˤ�륤��饤�󲽤��������뤫�ɤ���</p>
	 * <p>���Υ��ץ����</p>
	 */
	@Option(name = "--without-static-inline", usage = "Suppress static inlines")
	public boolean withoutStaticInline = false;

	/**
	 * <p>�ޥ�������б���COM����Ѥ��뤫�ɤ���</p>
	 * <p>���Υ��ץ�������ꤵ�줿��硢RTE�����ͥ졼���ϥޥ�������б���COM�˺�Ŭ�����줿RTE���������롣</p>
	 */
	@Option(name = "--com-multicore", usage = "Use COM Apis for multi core support")
	public boolean comMultiCore = false;
	
	/**
	 * RTE�����ͥ졼�������ϤȤʤ�AUTOSAR XML
	 */
	@Argument(usage = "Input files(AUTOSAR XMLs)", metaVar = "<file1> [<file2> [<file3>] ...]", required = true)
	public List<String> inputFiles = Lists.newArrayList();

	public GeneratorOptions(IProject project) {
		this.project = project;
	}

	/**
	 * �ġ�������ɽ���Τ���Υ��ץ���󤬻��ꤵ��Ƥ��뤫��Ƚ�ꤹ�롣
	 * @return ɽ�����ץ���󤬻��ꤵ��Ƥ����硢true������ʳ��ξ�硢false��
	 */
	public boolean isShowsOptionEnabled() {
		return this.showsHelp || this.showsVersion;
	}

	public PrintStream stdout = System.out;

	public PrintStream stderr = System.err;

	public IProject project;

	/**
	 * RTEϢ�ȥ�ǥ������ѤΥ��ץ������������롣
	 * @return �����������ץ����
	 */
	public RteInteractionModelBuilderOptions createRteInteractionModelBuilderOptions() {
		RteInteractionModelBuilderOptions builderOptions = new RteInteractionModelBuilderOptions();
		builderOptions.comMultiCore = this.comMultiCore;
		return builderOptions;
	}

	/**
	 * RTE�⥸�塼���ǥ������ѤΥ��ץ������������롣
	 * @return �����������ץ����
	 */
	public RteModuleModelBuilderOptions createRteModuleModelBuilderOptions() {
		RteModuleModelBuilderOptions builderOptions = new RteModuleModelBuilderOptions();
		builderOptions.suppressConfigHeader = this.suppressConfigHeader;
		builderOptions.writeGenerationTimeStamp = this.writeGenerationTimeStamp;
		builderOptions.doesGenerateMemoryMappingHeaderSkelton = this.doesGenerateMemoryMappingHeaderSkelton;
		builderOptions.withoutStaticInline = this.withoutStaticInline;
		builderOptions.generationPhase = (this.generationPhase == GenerationPhase.GENERATE);
		return builderOptions;
	}
}
