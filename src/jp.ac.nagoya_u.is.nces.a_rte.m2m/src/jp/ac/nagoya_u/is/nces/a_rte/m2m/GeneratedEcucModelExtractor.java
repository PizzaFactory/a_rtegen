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
package jp.ac.nagoya_u.is.nces.a_rte.m2m;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_ROOT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.GENERATED_ECU_CONFIGURATION;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIoc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.resource.Resource;

public class GeneratedEcucModelExtractor {
	private class Extractor {
		private final ModelQuery sourceQuery;
		private EcucRoot sourceEcucRoot;
		private GeneratedEcuConfiguration generatedEcuConfiguration;

		private final Resource eDestResource;
		private EcucRoot destEcucRoot;

		public Extractor(Resource eDestResource, Resource eSourceResource) {
			this.eDestResource = eDestResource;
			this.sourceQuery = new ModelQuery(eSourceResource);
		}

		public void extract() throws ModelException {
			this.generatedEcuConfiguration = this.sourceQuery.findSingleByKind(GENERATED_ECU_CONFIGURATION);
			this.sourceEcucRoot = this.sourceQuery.findSingleByKind(ECUC_ROOT);

			// ECUC�Υ롼�Ȥ���
			this.destEcucRoot = EmfUtils.copyItself(this.sourceEcucRoot);
			this.eDestResource.getContents().add(this.destEcucRoot);

			// OS��ECUC����
			extractOs(this.destEcucRoot, this.sourceEcucRoot.getOs());
		}

		private void extractOs(EcucRoot destEcucRoot, Os sourceOs) {
			Os destOs = EmfUtils.copyItself(sourceOs);
			destEcucRoot.setOs(destOs);

			extractOsEvent(destOs, sourceOs);
			extractOsSpinlock(destOs, sourceOs);
			extractOsTask(destOs, sourceOs);
			extractOsIoc(destOs, sourceOs);
			extractOsTrustedFunction(destOs, sourceOs);
		}

		private void extractOsEvent(Os destOs, Os sourceOs) {
			for (OsEvent sourceOsEvent : this.generatedEcuConfiguration.getGeneratedOsEvent()) {
				destOs.getOsEvent().add(EmfUtils.copy(sourceOsEvent));
			}
		}

		private void extractOsSpinlock(Os destOs, Os sourceOs) {
			for (OsSpinlock sourceOsSpinlock : this.generatedEcuConfiguration.getGeneratedOsSpinlock()) {
				destOs.getOsSpinlock().add(EmfUtils.copy(sourceOsSpinlock));
			}
		}

		private void extractOsTask(Os destOs, Os sourceOs) {
			for (OsTask sourceOsTask : this.generatedEcuConfiguration.getGeneratedOsTask()) {
				OsTask destOsTask = EmfUtils.copy(sourceOsTask);
				destOs.getOsTask().add(destOsTask);

				// OS���ץꥱ�������˳���դ�
				if (!sourceOsTask.getOwnerApplication().isEmpty()) { // COVERAGE ���true(������OSAP����ξ��ˤ�������������������ʤ�����)
					OsApplication destOsApplication = findOrCreateDestOsApplication(destOs, sourceOsTask.getOwnerApplication().get(0));
					destOsApplication.getOsAppTask().add(destOsTask);
				}
			}
		}

		private void extractOsIoc(Os destOs, Os sourceOs) {
			OsIoc destOsIoc = EmfUtils.copyItself(sourceOs.getOsIoc());
			destOs.setOsIoc(destOsIoc);

			for (OsIocCommunication sourceOsIocCommunication : this.generatedEcuConfiguration.getGeneratedOsIocCommunication()) {
				destOsIoc.getOsIocCommunication().add(EmfUtils.copy(sourceOsIocCommunication));
			}
		}

		private void extractOsTrustedFunction(Os destOs, Os sourceOs) {
			for (OsApplicationTrustedFunction sourceOsTrustedFunction : this.generatedEcuConfiguration.getGeneratedOsTrustedFunction()) {
				OsApplication destOsApplication = findOrCreateDestOsApplication(destOs, sourceOsTrustedFunction.getParent());
				destOsApplication.getOsApplicationTrustedFunction().add(EmfUtils.copy(sourceOsTrustedFunction));
			}
		}

		private OsApplication findOrCreateDestOsApplication(Os destOs, OsApplication sourceOsApplication) {
			OsApplication destOsApplication = (OsApplication) this.eDestResource.getEObject(sourceOsApplication.getId());
			if (destOsApplication == null) {
				destOsApplication = EmfUtils.copyItself(sourceOsApplication);
				destOs.getOsApplication().add(destOsApplication);
			}
			/*
			 * TODO��#91, #93�б�
			 * �����AUTOSARɸ����ͤ˽��äƥġ����������λ�����������RTE�����ͥ졼���ν��ϻ��ͤ��������٤�������
			 * 2014/3����꡼���˸����ƻ���Ū�˰ʲ����б��Ȥ��롥
			 *����OsTrusted�Ͻ��Ϥ��ʤ�(#91)
			 *����OsApplicationCoreAssignment�Ͻ��Ϥ��ʤ�(#93)
			 */
			destOsApplication.setOsTrusted(null);
			destOsApplication.setOsApplicationCoreAssignment(null);
			return destOsApplication;
		}
	}

	public void extract(Resource eDestResource, Resource eSourceResource) throws M2MException {
		try {
			Extractor extractor = new Extractor(eDestResource, eSourceResource);
			extractor.extract();
		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new M2MException("Internal error occurred while generating OS configurations.", e);
		}
	}
}
