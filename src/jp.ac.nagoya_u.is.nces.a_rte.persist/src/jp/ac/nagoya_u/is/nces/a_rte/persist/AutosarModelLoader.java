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
package jp.ac.nagoya_u.is.nces.a_rte.persist;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.Activator;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.InstanceModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelLoader;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelMerger;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelReferenceResolver;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ToEcucMapper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;

public class AutosarModelLoader {
	private final M2ModelMerger m2ModelMerger;

	private IFile schemaFile;
	private M2ModelLoader m2ModelLoader;

	/**
	 * �����ͥ졼�ȥե������Ѥ�AutosarModelLoader���������롥
	 * 
	 * @return �������줿�����ͥ졼�ȥȥե������Ѥ�AutosarModelLoader��
	 */
	public static AutosarModelLoader forGeneratePhase() {
		return new AutosarModelLoader();
	}

	/**
	 * ����ȥ饯�ȥե������Ѥ�AutosarModelLoader���������롥 �����������ͥ졼�ȥե������Ȥκ��ۤ��ߤ��Ƥ��ʤ���
	 * 
	 * @return �������줿����ȥ饯�ȥե������Ѥ�AutosarModelLoader��
	 */
	public static AutosarModelLoader forContractPhase() {
		return new AutosarModelLoader();
	}

	private AutosarModelLoader() {
		this.m2ModelMerger = new M2ModelMerger();
	}

	public void setSchemaFile(IFile schemaFile) {
		this.schemaFile = schemaFile;
		this.m2ModelLoader = null;
	}

	public void loadM2(IProject project, Resource eResource, Iterable<String> files) throws CoreException {
		Autosar mergedAutosar = M2Factory.eINSTANCE.createAutosar();
		final ILog logger = Activator.getDefault().getLog();
		final MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, 0, "Errors in loading AUTOSAR file(s)", null);
		for (String filePath : files) {
			final IStatus status1 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Loading AUTOSAR file " + filePath);
			logger.log(status1);
			IFile file = project.getFile(filePath);
			try {
				M2Root m2Root = getM2ModelLoader().load(file.getContents());

				final IStatus status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Merging AUTOSAR file " + filePath);
				logger.log(status2);
				this.m2ModelMerger.merge(mergedAutosar, m2Root.getAutosar());
			} catch (CoreException | PersistException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, filePath, e);
				multiStatus.add(status);
			}
		}
		if (!multiStatus.isOK()) {
			throw new CoreException(multiStatus);
		}

		M2Root m2Root = M2Factory.eINSTANCE.createM2Root();
		m2Root.setAutosar(mergedAutosar);
		eResource.getContents().add(m2Root);

		M2ModelReferenceResolver referenceResolver = new M2ModelReferenceResolver();
		try {
			referenceResolver.resolve(m2Root.getAutosar());
		} catch (PersistException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e);
			throw new CoreException(status);
		}
	}

	public void loadInstance(Resource eResource) throws PersistException {
		// ���󥹥��󥹥�ǥ�ι���
		InstanceModelBuilder builder = new InstanceModelBuilder(eResource);
		builder.build();

		// M2��ǥ�����ECUC��ǥ�ؤΥޥåԥ�
		M2ToEcucMapper mapper = new M2ToEcucMapper(eResource);
		mapper.map();
	}
	private M2ModelLoader getM2ModelLoader() throws PersistException {
		if (this.m2ModelLoader == null) {
			this.m2ModelLoader = new M2ModelLoader(this.schemaFile);
		}
		return this.m2ModelLoader;
	}
}
