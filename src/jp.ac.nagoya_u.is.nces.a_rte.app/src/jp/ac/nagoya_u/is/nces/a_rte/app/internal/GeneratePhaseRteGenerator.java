/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *  Copyright (C) 2016 by Monami-ya LLC, Japan.
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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ROOT_SW_COMPOSITION_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERACTION_ROOT;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import jp.ac.nagoya_u.is.nces.a_rte.app.AppException;
import jp.ac.nagoya_u.is.nces.a_rte.app.GeneratorInitOptions;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.CodeFormatter;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.CodegenException;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.NullCodeFormatter;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.RteCodeGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.RteTestCodeGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.GeneratedEcucModelExtractor;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteInteractionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteInteractionModelBuilderOptions;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteModuleModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteModuleModelBuilderOptions;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteTestModuleModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelEnvironment;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;
import jp.ac.nagoya_u.is.nces.a_rte.persist.AutosarModelLoader;
import jp.ac.nagoya_u.is.nces.a_rte.persist.AutosarModelSaver;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;
import jp.ac.nagoya_u.is.nces.a_rte.validation.ModelValidator;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.google.common.base.Optional;
import com.google.common.io.Files;

/**
 * GENERATE�ե�����������RTE���������롣
 */
public class GeneratePhaseRteGenerator implements IRteGenerator {
	private static final String GENERATED_ECUC_ARXML_FILE_NAME = "Rte_GeneratedEcuc.arxml";

	private final GeneratorInitOptions generatorInitOptions;
	private final AutosarModelLoader loader;
	private final ModelValidator rteValidatorM2;
	private final ModelValidator rteValidatorInstance;
	private final ModelValidator bswmValidatorM2;
	private final ModelValidator bswmValidatorInstance;
	private final ModelValidator commonValidatorM2;
	private final ModelValidator commonValidatorInstance;
	private final RteInteractionModelBuilder interactionModelBuilder;
	private final RteModuleModelBuilder moduleModelBuilder;
	private final RteCodeGenerator codeGenerator;
	private final GeneratedEcucModelExtractor ecucModelExtractor;
	private final AutosarModelSaver saver;

	// �ƥ��ȥ�����������
	private final RteTestModuleModelBuilder testModuleModelBuilder;
	private final RteTestCodeGenerator testCodeGenerator;
	private PrintStream stdout;

	/**
	 * {@link GeneratePhaseRteGenerator}���ۤ��롣
	 * @param generatorInitOptions RTE�����ͥ졼���ν�����ꥪ�ץ����
	 * @throws AppException {@link GeneratePhaseRteGenerator}�ι�����˥��顼��ȯ���������
	 */
	public GeneratePhaseRteGenerator(GeneratorInitOptions generatorInitOptions, PrintStream stdout) throws AppException {
		this.generatorInitOptions = generatorInitOptions;
		this.stdout = stdout;
		try {
			this.loader = AutosarModelLoader.forGeneratePhase();
			this.loader.setSchemaFile(generatorInitOptions.schemaFile);

			this.rteValidatorM2 = ModelValidator.forRteGeneratePhaseM2();
			this.rteValidatorInstance = ModelValidator.forRteGeneratePhaseInstance();
			this.bswmValidatorM2 = ModelValidator.forBswmGeneratePhaseM2();
			this.bswmValidatorInstance = ModelValidator.forBswmGeneratePhaseInstance();
			this.commonValidatorM2 = ModelValidator.forCommonGeneratePhaseM2();
			this.commonValidatorInstance = ModelValidator.forCommonGeneratePhaseInstance();
			this.interactionModelBuilder = RteInteractionModelBuilder.forGeneratePhase();
			this.moduleModelBuilder = RteModuleModelBuilder.forGeneratePhase();
			this.codeGenerator = RteCodeGenerator.forGeneratePhase();
			this.ecucModelExtractor = new GeneratedEcucModelExtractor();
			this.saver = new AutosarModelSaver();

			this.testModuleModelBuilder = RteTestModuleModelBuilder.forGeneratePhase();
			this.testCodeGenerator = RteTestCodeGenerator.forGeneratePhase();

			//TODO: Use CDT code formatter.
			CodeFormatter uncrustifyCodeFormatter = new NullCodeFormatter();
			this.codeGenerator.addCodeFormatter(uncrustifyCodeFormatter);
			this.testCodeGenerator.addCodeFormatter(uncrustifyCodeFormatter);

		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new AppException(e);
		}
	}

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.app.internal.IRteGenerator#generate(jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratorOptions)
	 */
	@Override
	public void generate(GeneratorOptions options) throws AppException {

		ResourceSet eResourceSet = new ResourceSetImpl();
		XMIResource eGenSourceResource = new XMIResourceImpl();
		eResourceSet.getResources().add(eGenSourceResource);

		XMIResource eGeneratedEcucResource = new XMIResourceImpl();
		eResourceSet.getResources().add(eGeneratedEcucResource);

		try {
			options.stdout.println("Checking input AUTOSAR XMLs...");

			// ��ǥ�Ķ��ν����
			ModelEnvironment.initResource(eGenSourceResource);

			// AUTOSAR M2��ǥ���ɤ߹���
			this.loader.loadM2(eGenSourceResource, options.inputFiles);

			ModelQuery query = new ModelQuery(eGenSourceResource);

			BasicDiagnostic diagnostics = new BasicDiagnostic();
			Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
			Optional<BswImplementation> bswImplementation = query.tryFindSingleByKind(BSW_IMPLEMENTATION);
			boolean hasRteConfig = rootSwCompositionPrototype.isPresent();
			boolean hasSchmConfig = bswImplementation.isPresent();

			// RootSwCompositionPrototype��BswImplementation��ξ�����������Ƥ��ʤ�����,
			// [nrte_sws_226]�Υ�å�������ɽ������������RTE�θ��ڷ�̤�ɽ������.				
			boolean validatesRte = false;
			if (!hasRteConfig && !hasSchmConfig) {
				validatesRte = true;
			}

			// AUTOSAR M2��ǥ븡��
			if (hasRteConfig || validatesRte) {
				this.rteValidatorM2.validate(eGenSourceResource, diagnostics);
			}
			if (hasSchmConfig) {
				this.bswmValidatorM2.validate(eGenSourceResource, diagnostics);
			}
			this.commonValidatorM2.validate(eGenSourceResource, diagnostics);

			// AUTOSAR Instance��ǥ���ɤ߹���
			this.loader.loadInstance(eGenSourceResource);

			// AUTOSAR Instance��ǥ븡��
			if (hasRteConfig || validatesRte) {
				this.rteValidatorInstance.validate(eGenSourceResource, diagnostics);
			}
			if (hasSchmConfig) {
				this.bswmValidatorInstance.validate(eGenSourceResource, diagnostics);
			}
			this.commonValidatorInstance.validate(eGenSourceResource, diagnostics);

			if (!diagnostics.getChildren().isEmpty()) {
				options.stderr.println("Generation cancelled on validation error.");
				if (validatesRte) {
					options.stderr.println("Validation error: " + ValidationMessage.NRTE_SWS_0226_MESSAGE);					
				}
				for (Diagnostic diagnostic : diagnostics.getChildren()) {
					options.stderr.println("Validation error: " + diagnostic.getMessage());
				}
				return;
			}

			// AUTOSAR��ǥ� -> ���󥿥饯������ǥ��Ѵ�
			RteInteractionModelBuilderOptions builderOptions = options.createRteInteractionModelBuilderOptions();
			this.interactionModelBuilder.build(eGenSourceResource, builderOptions);

			// RTE���⤷����AUTOSAR XML������
			InteractionRoot interactionRoot = query.findSingleByKind(INTERACTION_ROOT);

			generateInternalDataTypeFile(options);

			if (interactionRoot.getGeneratedEcuConfiguration() != null) {
				// ��­���󤬤����硤AUTOSAR XML�Ȥ��ƽ���
				generateInsufficientArxmls(eGeneratedEcucResource, eGenSourceResource, options);
			}
			if (interactionRoot.getGeneratedEcuConfiguration() == null || options.forcesGenerateRte) {
				// ��­���󤬤ʤ���硤RTE������
				generateRte(eGenSourceResource, options);
			}
		} catch (PersistException e) {
			throw new AppException(e);

		} catch (M2MException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new AppException(e);

		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new AppException(e);

		} catch (CodegenException e) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			throw new AppException(e);
		}
	}

	private void generateInsufficientArxmls(XMIResource eGeneratedEcucResource, XMIResource eGenSourceResource, GeneratorOptions options) throws M2MException, PersistException {
		stdout.println("There are some insufficient configurations for RTE.");
		stdout.println("Generating AUTOSAR XMLs to complement the insufficient configurations... ");

		File outputDir = new File(options.outputDirectory);

		// ECUC ARXML�ν���
		File generatedEcucFile = new File(outputDir, GENERATED_ECUC_ARXML_FILE_NAME);

		stdout.println("Generating " + generatedEcucFile.getPath() + " ...");
		this.ecucModelExtractor.extract(eGeneratedEcucResource, eGenSourceResource);
		this.saver.save(eGeneratedEcucResource, generatedEcucFile);

		stdout.println("Generation done.");
	}

	private void generateInternalDataTypeFile(GeneratorOptions options) throws AppException {
		// �����ǡ�������ARXML�ν���
		File outputDir = new File(options.outputDirectory);
		File generatedInternalDataTypeFile = new File(outputDir, this.generatorInitOptions.internalDataTypesFile.getName());

		options.stdout.println("Generating " + generatedInternalDataTypeFile.getPath() + " ...");
		try {
			Files.createParentDirs(generatedInternalDataTypeFile);
			Files.copy(this.generatorInitOptions.internalDataTypesFile, generatedInternalDataTypeFile);
		} catch (IOException e) {
			throw new AppException("Internal error occurred while generating AUTOSAR XML. " + e.getMessage(), e);
		}
	}

	private void generateRte(XMIResource eGenSourceResource, GeneratorOptions options) throws M2MException, ModelException, CodegenException {
		ModelQuery query = new ModelQuery(eGenSourceResource);
		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		Optional<BswImplementation> bswImplementation = query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		boolean hasRteConfig = rootSwCompositionPrototype.isPresent();
		boolean hasSchmConfig = bswImplementation.isPresent();

		String messege = "Generating ";
		if (hasRteConfig && hasSchmConfig) {
			messege += "RTE and SCHM...";
		} else if (hasRteConfig && !hasSchmConfig) { // COVERAGE (ʬ������Ϥ���Ƥ���Τǥƥ����׷���������Ƥ���)
			messege += "RTE...";
		} else /* if (!rootSwCompositionPrototype.isPresent() && bswImplementation.isPresent()) */ {
			messege += "SCHM...";
		}
		options.stdout.println(messege);

		// AUTOSAR��ǥ롤���󥿥饯������ǥ� -> �⥸�塼���ǥ��Ѵ�
		RteModuleModelBuilderOptions builderOptions = options.createRteModuleModelBuilderOptions();
		builderOptions.doesGenerateRte = hasRteConfig;
		builderOptions.doesGenerateSchm = hasSchmConfig;
		this.moduleModelBuilder.build(eGenSourceResource, builderOptions);

		// RTE����������
		RteModule rteModule = query.findSingleByKind(ModulePackage.Literals.RTE_MODULE);
		this.codeGenerator.generate(rteModule, new File(options.outputDirectory));

		// RTE�ƥ��ȥ���������
		if (options.doesGenerateTests) {
			this.testModuleModelBuilder.build(eGenSourceResource);

			RteTestModule rteTestModule = query.findSingleByKind(RteTestPackage.Literals.RTE_TEST_MODULE);
			this.testCodeGenerator.generate(rteTestModule, new File(options.outputDirectory));
		}

		options.stdout.println("Generation done.");
	}
}