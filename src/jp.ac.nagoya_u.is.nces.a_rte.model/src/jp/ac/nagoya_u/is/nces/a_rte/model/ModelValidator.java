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
package jp.ac.nagoya_u.is.nces.a_rte.model;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.internal.EmfModelValidator;
import jp.ac.nagoya_u.is.nces.a_rte.model.internal.IModelValidator;
import jp.ac.nagoya_u.is.nces.a_rte.model.internal.OclModelValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.io.Resources;

public class ModelValidator {

	private static final Function<String, URL> string2Resource = new Function<String, URL>() {
		@Override
		public URL apply(String input) {
			return Resources.getResource(ModelValidator.class, input);
		}
	};

	private static final List<String> RTE_GENERATE_PHASE_M2_RULE_FILES = Lists.newArrayList("/rte/validation_common_m2.ocl", "/rte/validation_generatePhase_m2.ocl");
	private static final List<String> RTE_CONTRACT_PHASE_M2_RULE_FILES = Lists.newArrayList("/rte/validation_common_m2.ocl", "/rte/validation_contractPhase_m2.ocl");
	private static final List<String> RTE_GENERATE_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/rte/validation_common_instance.ocl", "/rte/validation_generatePhase_instance.ocl");
	private static final List<String> RTE_CONTRACT_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/rte/validation_common_instance.ocl", "/rte/validation_contractPhase_instance.ocl");
	private static final List<String> BSWM_GENERATE_PHASE_M2_RULE_FILES = Lists.newArrayList("/bswm/validation_common_m2.ocl", "/bswm/validation_generatePhase_m2.ocl");
	private static final List<String> BSWM_CONTRACT_PHASE_M2_RULE_FILES = Lists.newArrayList("/bswm/validation_common_m2.ocl", "/bswm/validation_contractPhase_m2.ocl");
	private static final List<String> BSWM_GENERATE_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/bswm/validation_common_instance.ocl", "/bswm/validation_generatePhase_instance.ocl");
	private static final List<String> BSWM_CONTRACT_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/bswm/validation_common_instance.ocl", "/bswm/validation_contractPhase_instance.ocl");
	private static final List<String> COMMON_GENERATE_PHASE_M2_RULE_FILES = Lists.newArrayList("/common/validation_common_m2.ocl", "/common/validation_generatePhase_m2.ocl");
	private static final List<String> COMMON_CONTRACT_PHASE_M2_RULE_FILES = Lists.newArrayList("/common/validation_common_m2.ocl", "/common/validation_contractPhase_m2.ocl");
	private static final List<String> COMMON_GENERATE_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/common/validation_common_instance.ocl", "/common/validation_generatePhase_instance.ocl");
	private static final List<String> COMMON_CONTRACT_PHASE_INSTANCE_RULE_FILES = Lists.newArrayList("/common/validation_common_instance.ocl", "/common/validation_contractPhase_instance.ocl");

	public static final String EMF_VALIDATION_MESSAGES_PROPERTIES = "/emfValidationMessages.properties";
	private static final List<String> MESSAGE_FILES = Lists.newArrayList("/validationMessages.properties");

	private final List<IModelValidator> validators;

	public static ModelValidator forRteGeneratePhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(RTE_GENERATE_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forRteContractPhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(RTE_CONTRACT_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}
	public static ModelValidator forRteGeneratePhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(RTE_GENERATE_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forRteContractPhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(RTE_CONTRACT_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmGeneratePhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(BSWM_GENERATE_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmContractPhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(BSWM_CONTRACT_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmGeneratePhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(BSWM_GENERATE_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forBswmContractPhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(BSWM_CONTRACT_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonGeneratePhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(COMMON_GENERATE_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonContractPhaseM2() throws ModelException {
		return new ModelValidator(new OclModelValidator(Iterables.transform(COMMON_CONTRACT_PHASE_M2_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonGeneratePhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(COMMON_GENERATE_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}

	public static ModelValidator forCommonContractPhaseInstance() throws ModelException {
		return new ModelValidator(new EmfModelValidator(), new OclModelValidator(Iterables.transform(COMMON_CONTRACT_PHASE_INSTANCE_RULE_FILES, string2Resource), Iterables.transform(MESSAGE_FILES, string2Resource)));
	}
	private ModelValidator(IModelValidator... validators) {
		this.validators = Arrays.asList(validators);
	}

	public boolean validate(Resource eResource, DiagnosticChain diagnostics) {
		boolean isValid = true;
		for (IModelValidator validator : validators) {
			if (!validator.validate(eResource, diagnostics)) {
				isValid = false;
			}
		}
		return isValid;
	}
}
