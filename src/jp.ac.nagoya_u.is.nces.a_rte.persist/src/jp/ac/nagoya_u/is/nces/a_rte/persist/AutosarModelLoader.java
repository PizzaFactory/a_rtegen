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
package jp.ac.nagoya_u.is.nces.a_rte.persist;

import java.io.File;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.InstanceModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelLoader;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelMerger;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelReferenceResolver;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ToEcucMapper;

import org.eclipse.emf.ecore.resource.Resource;

public class AutosarModelLoader {
	private final static Logger LOGGER = Logger.getLogger(AutosarModelLoader.class.getName());

	private final M2ModelMerger m2ModelMerger;

	private File schemaFile;
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

	public void setSchemaFile(File schemaFile) {
		this.schemaFile = schemaFile;
		this.m2ModelLoader = null;
	}

	public void loadM2(Resource eResource, Iterable<String> files) throws PersistException {
		Autosar mergedAutosar = M2Factory.eINSTANCE.createAutosar();
		for (String file : files) {
			LOGGER.fine("Loading AUTOSAR file " + file);
			M2Root m2Root = getM2ModelLoader().load(file);

			LOGGER.fine("Merging AUTOSAR file " + file);
			this.m2ModelMerger.merge(mergedAutosar, m2Root.getAutosar());
		}

		M2Root m2Root = M2Factory.eINSTANCE.createM2Root();
		m2Root.setAutosar(mergedAutosar);
		eResource.getContents().add(m2Root);
		
		M2ModelReferenceResolver referenceResolver = new M2ModelReferenceResolver();
		referenceResolver.resolve(m2Root.getAutosar());
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
