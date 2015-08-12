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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERACTION_REFERRABLE;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.ComSendProxyModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.EntityInteractionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.GeneratedEcucModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.InteractionModelBuildContext;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.SenderReceiverImplementationModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.SenderReceiverInteractionModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder.SourceModelCacheBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.util.InteractionModelUtils;

public class InteractionModelBuildDirector implements IInteractionModelBuildDirector {
	/*
	 * (non-Javadoc)
	 * 
	 * @see jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.
	 * IInteractionModelBuildDirector
	 * #build(jp.ac.nagoya_u.is.nces.a_rte.m2m.internal
	 * .interaction.builder.BuildContext)
	 */
	@Override
	public void build(InteractionModelBuildContext context) throws M2MException {

		try {
			// ��ǥ��Ѵ�����ǥ�Υ���å������
			SourceModelCacheBuilder sourceModelCacheBuilder = new SourceModelCacheBuilder(context);
			sourceModelCacheBuilder.build();

			// ��ǥ�ι���
			InteractionRoot interactionRoot = InteractionFactory.eINSTANCE.createInteractionRoot();
			context.eResource.getContents().add(interactionRoot);
			context.cache.interactionRoot = interactionRoot;

			// S/R��Ϣ�����ƥ�ǥ����
			SenderReceiverInteractionModelBuilder srInteractionBuilder = new SenderReceiverInteractionModelBuilder(context);
			srInteractionBuilder.build();

			// S/R��Ϣ�ȼ¸�������ǥ����
			SenderReceiverImplementationModelBuilder srImplementationBuilder = new SenderReceiverImplementationModelBuilder(context);
			srImplementationBuilder.build();

			ComSendProxyModelBuilder comSendProxyBuilder = new ComSendProxyModelBuilder(context);
			comSendProxyBuilder.build();

			// ����ƥ��ƥ���Ϣ�����ơ�Ϣ�ȼ¸�������ǥ����
			EntityInteractionModelBuilder entityInteractionBuilder = new EntityInteractionModelBuilder(context);
			entityInteractionBuilder.build();

			// ��­���Ƥ���ECUC��ǥ������
			GeneratedEcucModelBuilder generatedEcucBuilder = new GeneratedEcucModelBuilder(context);
			generatedEcucBuilder.build();

			// ���ۤ�����ǥ��ID���꿶��
			buildModelIds(context);

		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new M2MException("Internal error occurred while building RTE design.", e);
		}
	}

	private void buildModelIds(InteractionModelBuildContext context) {
		int idIndex = 1;
		for (InteractionReferrable referrable : context.query.<InteractionReferrable> findByKind(INTERACTION_REFERRABLE)) {
			referrable.setId(InteractionModelUtils.ID_PREFIX + referrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}
}
