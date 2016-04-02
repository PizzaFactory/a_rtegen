/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
 *  Copyright (C) 2016 by Monami-ya LLC, Japan.
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
package jp.ac.nagoya_u.is.nces.a_rte.app.internal;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ROOT_SW_COMPOSITION_PROTOTYPE;
import jp.ac.nagoya_u.is.nces.a_rte.app.AppException;
import jp.ac.nagoya_u.is.nces.a_rte.app.AppResources;
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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.google.common.base.Optional;

/**
 * CONTRACTフェーズ向けのRTEを生成する。
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
	 * {@link ContractPhaseRteGenerator}を構築する。
	 * @param generatorInitOptions RTEジェネレータの初期設定オプション
	 * @throws AppException {@link ContractPhaseRteGenerator}の構築中にエラーが発生した場合
	 */
	public ContractPhaseRteGenerator(GeneratorInitOptions generatorInitOptions) throws AppException {
		try {
			this.loader = AutosarModelLoader.forContractPhase();
			
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

		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new AppException(e);
		}
	}

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.app.internal.IRteGenerator#generate(jp.ac.nagoya_u.is.nces.a_rte.app.internal.GeneratorOptions)
	 */
	@Override
	public void generate(GeneratorOptions options) throws AppException {

		ResourceSet eResourceSet = new ResourceSetImpl();
		XMIResource eResource = new XMIResourceImpl();
		eResourceSet.getResources().add(eResource);

		try {
			options.stdout.println("Checking input AUTOSAR XMLs...");

			// モデル環境の初期化
			ModelEnvironment.initResource(eResource);

			// AUTOSAR M2モデルの読み込み
			this.loader.loadM2(options.project, eResource, options.inputFiles);

			ModelQuery query = new ModelQuery(eResource);

			BasicDiagnostic diagnostics = new BasicDiagnostic();
			Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
			Optional<BswImplementation> bswImplementation = query.tryFindSingleByKind(BSW_IMPLEMENTATION);
			boolean hasRteConfig = rootSwCompositionPrototype.isPresent();
			boolean hasSchmConfig = bswImplementation.isPresent();

			// RootSwCompositionPrototypeとBswImplementationが両方共定義されていない場合は,
			// [nrte_sws_226]のメッセージを表示したうえでRTEの検証結果を表示する.
			boolean validatesRte = false;
			if (!hasRteConfig && !hasSchmConfig) {
				validatesRte = true;
			}

			// AUTOSAR M2モデル検証
			if (hasRteConfig || validatesRte) {
				this.rteValidatorM2.validate(eResource, diagnostics);
			}
			if (hasSchmConfig) {
				this.bswmValidatorM2.validate(eResource, diagnostics);
			}
			this.commonValidatorM2.validate(eResource, diagnostics);

			// AUTOSAR Instanceモデルの読み込み
			this.loader.loadInstance(eResource);

			// AUTOSAR Instanceモデル検証
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

			// RTE生成
			generateRte(options, eResource);

		} catch (PersistException e) {
			throw new AppException(e);

		} catch (M2MException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new AppException(e);

		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new AppException(e);

		} catch (CodegenException e) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
			throw new AppException(e);
		} catch (CoreException e) {
			throw new AppException(e);
		}
	}

	private void generateRte(GeneratorOptions options, XMIResource eResource) throws M2MException, ModelException, CodegenException {
		ModelQuery query = new ModelQuery(eResource);
		Optional<RootSwCompositionPrototype> rootSwCompositionPrototype = query.tryFindSingleByKind(ROOT_SW_COMPOSITION_PROTOTYPE);
		Optional<BswImplementation> bswImplementation = query.tryFindSingleByKind(BSW_IMPLEMENTATION);
		boolean hasRteConfig = rootSwCompositionPrototype.isPresent();
		boolean hasSchmConfig = bswImplementation.isPresent();

		String messege = "Generating ";
		if (hasRteConfig && hasSchmConfig) {
			messege += "RTE and SCHM...";
		} else if (hasRteConfig && !hasSchmConfig) { // COVERAGE (分岐網羅はされているのでテスト要件を満たしている)
			messege += "RTE...";
		} else /* if (!rootSwCompositionPrototype.isPresent() && bswImplementation.isPresent()) */ {
			messege += "SCHM...";
		}
		options.stdout.println(messege);

		// AUTOSARモデル->モジュールモデル変換
		RteModuleModelBuilderOptions builderOptions = options.createRteModuleModelBuilderOptions();
		builderOptions.doesGenerateRte = hasRteConfig;
		builderOptions.doesGenerateSchm = hasSchmConfig;
		this.moduleModelBuilder.build(eResource, builderOptions);

		// RTEコード生成
		RteModule rteModule = query.findSingleByKind(ModulePackage.Literals.RTE_MODULE);
		final IContainer container;
		if (".".equals(options.outputDirectory)) {
			container = options.project;
		} else {
			container = options.project.getFolder(options.outputDirectory);
			if (!container.exists()) {
				try {
					((IFolder)container).create(true, true, null);
				} catch (CoreException e) {
					throw new CodegenException("Can't create output folder", e);
				}
			}
		}
		this.codeGenerator.generate(rteModule, container);

		options.stdout.println("Generation done.");
	}
}
