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

import java.io.File;

import jp.ac.nagoya_u.is.nces.a_rte.app.AppException;
import jp.ac.nagoya_u.is.nces.a_rte.app.GeneratorInitOptions;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.CodeFormatter;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.CodegenException;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.NullCodeFormatter;
import jp.ac.nagoya_u.is.nces.a_rte.codegen.RteCodeGenerator;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteModuleModelBuilderOptions;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.RteModuleModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelEnvironment;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.persist.AutosarModelLoader;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;
import jp.ac.nagoya_u.is.nces.a_rte.validation.ModelValidator;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.google.common.base.Optional;

/**
 * CONTRACT�ե�����������RTE���������롣
 */
public class ContractPhaseRteGenerator implements IRteGenerator {
	private final AutosarModelLoader loader;
	private final ModelValidator rteValidatorM2;
	private final ModelValidator rteValidatorInstance;
	private final ModelValidator bswmValidatorM2;
	private final ModelValidator bswmValidatorInstance;
	private final ModelValidator commonValidatorM2;
	private final ModelValidator commonValidatorInstance;
	private final RteModuleModelBuilder moduleModelBuilder;
	private final RteCodeGenerator codeGenerator;

	/**
	 * {@link ContractPhaseRteGenerator}���ۤ��롣
	 * @param generatorInitOptions RTE�����ͥ졼���ν�����ꥪ�ץ����
	 * @throws AppException {@link ContractPhaseRteGenerator}�ι�����˥��顼��ȯ���������
	 */
	public ContractPhaseRteGenerator(GeneratorInitOptions generatorInitOptions) throws AppException {
		try {
			this.loader = AutosarModelLoader.forContractPhase();
			this.loader.setSchemaFile(generatorInitOptions.schemaFile);

			this.rteValidatorM2 = ModelValidator.forRteContractPhaseM2();
			this.rteValidatorInstance = ModelValidator.forRteContractPhaseInstance();
			this.bswmValidatorM2 = ModelValidator.forBswmContractPhaseM2();
			this.bswmValidatorInstance = ModelValidator.forBswmContractPhaseInstance();
			this.commonValidatorM2 = ModelValidator.forCommonContractPhaseM2();
			this.commonValidatorInstance = ModelValidator.forCommonContractPhaseInstance();
			this.moduleModelBuilder = RteModuleModelBuilder.forContractPhase();
			this.codeGenerator = RteCodeGenerator.forContractPhase();

			//TODO: Use CDT code formatter.
			CodeFormatter uncrustifyCodeFormatter = new NullCodeFormatter();
			this.codeGenerator.addCodeFormatter(uncrustifyCodeFormatter);

		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new AppException(e);
		}
	}

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.app.internal.IRteGenerator#generate(jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratorOptions)
	 */
	@Override
	public void generate(GeneratorOptions options) throws AppException {

		File outputDirectory = new File(options.outputDirectory);

		ResourceSet eResourceSet = new ResourceSetImpl();
		XMIResource eResource = new XMIResourceImpl();
		eResourceSet.getResources().add(eResource);

		try {
			options.stdout.println("Checking input AUTOSAR XMLs...");

			// ��ǥ�Ķ��ν����
			ModelEnvironment.initResource(eResource);

			// AUTOSAR M2��ǥ���ɤ߹���
			this.loader.loadM2(eResource, options.inputFiles);

			ModelQuery query = new ModelQuery(eResource);

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
				this.rteValidatorM2.validate(eResource, diagnostics);
			}
			if (hasSchmConfig) {
				this.bswmValidatorM2.validate(eResource, diagnostics);
			}
			this.commonValidatorM2.validate(eResource, diagnostics);

			// AUTOSAR Instance��ǥ���ɤ߹���
			this.loader.loadInstance(eResource);

			// AUTOSAR Instance��ǥ븡��
			if (hasRteConfig || validatesRte) {
				this.rteValidatorInstance.validate(eResource, diagnostics);
			}
			if (hasSchmConfig) {
				this.bswmValidatorInstance.validate(eResource, diagnostics);
			}
			this.commonValidatorInstance.validate(eResource, diagnostics);

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

			// RTE����
			generateRte(options, outputDirectory, eResource);

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

	private void generateRte(GeneratorOptions options, File outputDirectory, XMIResource eResource) throws M2MException, ModelException, CodegenException {
		ModelQuery query = new ModelQuery(eResource);
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

		// AUTOSAR��ǥ�->�⥸�塼���ǥ��Ѵ�
		RteModuleModelBuilderOptions builderOptions = options.createRteModuleModelBuilderOptions();
		builderOptions.doesGenerateRte = hasRteConfig;
		builderOptions.doesGenerateSchm = hasSchmConfig;
		this.moduleModelBuilder.build(eResource, builderOptions);

		// RTE����������
		RteModule rteModule = query.findSingleByKind(ModulePackage.Literals.RTE_MODULE);
		this.codeGenerator.generate(rteModule, outputDirectory);

		options.stdout.println("Generation done.");
	}
}