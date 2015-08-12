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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.NameStringUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Optional;

/**
 * ECUC��ǥ�˴ؤ���桼�ƥ���ƥ���ǽ���󶡤��롣
 */
public class EcucModelUtils {

	/**
	 * ECUC��ǥ��ID��Ƭ��
	 */
	public static final String ID_PREFIX = "ecuc.";

	/**
	 * ECUC��ǥ뤫��EcucDef�ؤΥ�ե���󥹤���Ƭ��
	 */
	public static final String DEFAULT_ECUC_DEFINITION_REFERENCE_PREFIX = "/AUTOSAR/EcucDefs/";

	private static final String REFERENCE_ROLE_SUFFIX = "Ref";
	private static final String INSTANCE_REFERENCE_ROLE_SUFFIX = "InstanceRef";
	private static final String NON_ECUC_STEREOTYPE = "nonEcuc";

	// ECUC�˴ؤ��륿��
	private static final String DEFINITION_SHORT_NAME_TAG = "ecuc.definitionShortName";

	/**
	 * DefinitionRef���饷�硼�ȥ͡���������Ф��롣
	 * @param definitionRef DefinitionRef��ʸ����
	 * @return DefinitionRef�Υ��硼�ȥ͡�����
	 */
	public static String getShortNameOfDefinitionRef(String definitionRef) {
		String[] shortNames = definitionRef.split(M2ModelUtils.REFERENCE_SEPARATOR);
		return shortNames[shortNames.length - 1];
	}

	/**
	 * {@link EAttribute}���б�����DefinitionRef�Υ��硼�ȥ͡�������������롣
	 * @param eAttribute ��������{@link EAttribute}
	 * @return DefinitionRef�Υ��硼�ȥ͡�����
	 */
	public static String getParameterDefinitionShortNameOfRoleFeature(EAttribute eAttribute) {
		return NameStringUtils.camelCaseToPascalCase(eAttribute.getName());
	}

	/**
	 * {@link EReference}���б�����DefinitionRef�Υ��硼�ȥ͡�������������롣
	 * @param eReference ��������{@link EReference}
	 * @return DefinitionRef�Υ��硼�ȥ͡�����
	 */
	public static String getReferenceDefinitionShortNameOfRoleFeature(EReference eReference) {
		Optional<String> definitionShortName = getDefinitionShortName(eReference);
		return definitionShortName.or(NameStringUtils.camelCaseToPascalCase(eReference.getName() + REFERENCE_ROLE_SUFFIX));
	}

	/**
	 * {@link EcucContainer}��DefinitionRef���б��������̾��������롣
	 * @param definitionRef {@link EcucContainer}��DefinitionRef
	 * @return {@link EcucContainer}��DefinitionRef���б��������̾
	 */
	public static String getRoleNameOfContainerDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef));
	}

	/**
	 * {@link EcucParameterValue}��DefinitionRef���б��������̾��������롣
	 * @param definitionRef {@link EcucParameterValue}��DefinitionRef
	 * @return {@link EcucParameterValue}��DefinitionRef���б��������̾
	 */
	public static String getRoleNameOfParameterDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef));
	}

	/**
	 * {@link EcucReferenceValue}��DefinitionRef���б��������̾��������롣
	 * @param definitionRef {@link EcucReferenceValue}��DefinitionRef
	 * @return {@link EcucReferenceValue}��DefinitionRef���б��������̾
	 */
	public static String getRoleNameOfReferenceDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef)).replace(REFERENCE_ROLE_SUFFIX, "");
	}

	/**
	 * {@link EcucInstanceReferenceValue}��DefinitionRef���б��������̾��������롣
	 * @param definitionRef {@link EcucInstanceReferenceValue}��DefinitionRef
	 * @return {@link EcucInstanceReferenceValue}��DefinitionRef���б��������̾
	 */
	public static String getRoleNameOfInstanceReferenceDef(String definitionRef) {
		return NameStringUtils.pascalCaseToCamelCase(getShortNameOfDefinitionRef(definitionRef)).replace(INSTANCE_REFERENCE_ROLE_SUFFIX, "");
	}

	/**
	 * AUTOSAR��EcucParamDef���������Ƥ��ʤ�°������ե���󥹤��ɤ�����Ƚ�ꤹ�롣
	 * @param eStructuralFeature Ƚ���оݤ�{@link EStructuralFeature}
	 * @return AUTOSAR��EcucParamDef���������Ƥ��ʤ�°������ե���󥹤ξ�硢true������ʳ��ξ�硢false��
	 */
	public static boolean isNonEcucFeature(EStructuralFeature eStructuralFeature) {
		return EmfUtils.hasStereotype(eStructuralFeature, NON_ECUC_STEREOTYPE);
	}

	private static Optional<String> getDefinitionShortName(EStructuralFeature eStructuralFeature) {
		return EmfUtils.tryGetTag(eStructuralFeature, DEFINITION_SHORT_NAME_TAG);
	}
}
