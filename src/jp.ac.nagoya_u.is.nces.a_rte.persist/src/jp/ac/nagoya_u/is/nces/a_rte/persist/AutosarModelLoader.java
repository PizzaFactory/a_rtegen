/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.persist;

import java.io.IOException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.Activator;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelMerger;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelReferenceResolver;
import jp.pizzafactory.a_rte.core.resource.M2ResourceFactoryImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class AutosarModelLoader {
	private final M2ModelMerger m2ModelMerger;

	/**
	 * ジェネレートフェーズ用のAutosarModelLoaderを生成する．
	 * 
	 * @return 生成されたジェネレートトフェーズ用のAutosarModelLoader．
	 */
	public static AutosarModelLoader forGeneratePhase() {
		return new AutosarModelLoader();
	}

	/**
	 * コントラクトフェーズ用のAutosarModelLoaderを生成する． 現状，ジェネレートフェーズとの差異は設けていない．
	 * 
	 * @return 生成されたコントラクトフェーズ用のAutosarModelLoader．
	 */
	public static AutosarModelLoader forContractPhase() {
		return new AutosarModelLoader();
	}

	private AutosarModelLoader() {
		this.m2ModelMerger = new M2ModelMerger();
	}

	public void loadM2(IProject project, Resource eResource, Iterable<String> files) throws CoreException {
		Autosar mergedAutosar = M2Factory.eINSTANCE.createAutosar();
		final ILog logger = Activator.getDefault().getLog();
		final MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, 0, "Errors in loading AUTOSAR file(s)", null);
		for (String filePath : files) {
			final IStatus status1 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Loading AUTOSAR file " + filePath);
			logger.log(status1);
			IFile file = project.getFile(filePath);
			M2ResourceFactoryImpl factory = new M2ResourceFactoryImpl();
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = factory.createResource(uri);
			try {
				resource.load(null);
				Autosar autosar = (Autosar)resource.getContents();
			
				final IStatus status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Merging AUTOSAR file " + filePath);
				logger.log(status2);
				this.m2ModelMerger.merge(mergedAutosar, autosar);
			} catch (IOException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, filePath, e);
				multiStatus.add(status);
			}
		}
		if (!multiStatus.isOK()) {
			throw new CoreException(multiStatus);
		}

		eResource.getContents().add(mergedAutosar);

		M2ModelReferenceResolver referenceResolver = new M2ModelReferenceResolver();
		try {
			referenceResolver.resolve(mergedAutosar);
		} catch (PersistException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e);
			throw new CoreException(status);
		}
	}
}
