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
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.NameStringUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Optional;

public class M2XmlUtils {
	public static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

	public enum XmlWrapType {
		ROLE_WRAPPER_AND_ROLE, ROLE_WRAPPER_AND_TYPE, ROLE_AND_TYPE, ROLE, TYPE, REFERENCE_WRAPPER_AND_REFERENCE, REFERENCE, TYPE_REFERENCE, UNKNOWN,
	}

	public static final String VARIANTS_TAG_NAME_SUFFIX = "-VARIANTS";
	public static final String CONDITIONAL_TAG_NAME_SUFFIX = "-CONDITIONAL";
	public static final String AUTOSAR_NAMESPACE = "http://autosar.org/schema/r4.0";
	public static final String NAMESPACE_XSI = "http://www.w3.org/2001/XMLSchema-instance";
	public static final String SCHEMA_LOCATION = "http://autosar.org/schema/r4.0 AUTOSAR_4-0-3.xsd";

	public static final String DEST_ATTRIBUTE_NAME = "DEST";

	public static EStructuralFeature getM2FeatureByTagName(EClass eClass, String xmlTagName) {
		for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
			String featureXmlTagName = getM2FeatureXmlTagName(eStructuralFeature);
			if (xmlTagName.equals(featureXmlTagName)) {
				return eStructuralFeature;
			}
		}
		return null;
	}

	public static XmlWrapType getXmlWrapType(EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature instanceof EAttribute) {
			return getXmlWrapType((EAttribute) eStructuralFeature);
		} else if (eStructuralFeature instanceof EReference) { // COVERAGE ���true(EStructuralFeature�ϡ�EAttribute��EReference�Τ����줫�Ǥ��뤿��)
			return getXmlWrapType((EReference) eStructuralFeature);
		} else { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			return XmlWrapType.UNKNOWN;
		}
	}

	private static XmlWrapType getXmlWrapType(EAttribute eAttribute) {
		if (eAttribute.isMany() || M2ModelUtils.isXmlRoleWrapperEnabled(eAttribute, false)) { // (ʬ������Ϥ���Ƥ���Τǥƥ����׷���������Ƥ���)
			return XmlWrapType.ROLE_WRAPPER_AND_ROLE;
		} else {
			return XmlWrapType.ROLE;
		}
	}

	private static XmlWrapType getXmlWrapType(EReference eReference) {
		M2ModelUtils.ReferenceType referenceType = M2ModelUtils.getReferenceType(eReference);
	
		switch (referenceType) {
		case CONTAINMENT:
			if (eReference.isMany() || M2ModelUtils.isXmlRoleWrapperEnabled(eReference, false)) {
				return XmlWrapType.ROLE_WRAPPER_AND_TYPE;
			} else if (((EClass) eReference.getEType()).isAbstract()) {
				return XmlWrapType.ROLE_AND_TYPE;
			} else {
				return XmlWrapType.ROLE;
			}
		case TYPE_REFERENCE:
			return XmlWrapType.TYPE_REFERENCE;
		case REFERENCE:
			if (eReference.isMany()) {
				return M2ModelUtils.isXmlRoleWrapperEnabled(eReference, true) ? XmlWrapType.REFERENCE_WRAPPER_AND_REFERENCE : XmlWrapType.REFERENCE;
			} else {
				return M2ModelUtils.isXmlRoleWrapperEnabled(eReference, false) ? XmlWrapType.REFERENCE_WRAPPER_AND_REFERENCE : XmlWrapType.REFERENCE; // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
			}
		default: // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			return XmlWrapType.UNKNOWN;
		}
	}

	private static String getM2FeatureXmlTagName(EStructuralFeature eStructuralFeature) {
		XmlWrapType wrapType = getXmlWrapType(eStructuralFeature);
		switch (wrapType) {
		case ROLE_WRAPPER_AND_ROLE:
		case ROLE_WRAPPER_AND_TYPE:
			return getXmlRoleWrapperName(eStructuralFeature);
		case ROLE_AND_TYPE:
		case ROLE:
			return getXmlRoleName(eStructuralFeature);
		case REFERENCE_WRAPPER_AND_REFERENCE:
			return getXmlReferenceWrapperRoleName(eStructuralFeature);
		case REFERENCE:
			return getXmlReferenceRoleName(eStructuralFeature);
		case TYPE_REFERENCE:
			return getXmlTypeReferenceRoleName(eStructuralFeature);
		default: // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			return null;
		}
	}

	public static String getXmlRoleWrapperName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlPluralName = M2ModelUtils.tryGetXmlPluralName(eStructuralFeature);
		return xmlPluralName.or(NameStringUtils.camelCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + "s"));
	}

	public static String getXmlRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlName = M2ModelUtils.tryGetXmlName(eStructuralFeature);
		return xmlName.or(NameStringUtils.camelCaseToUpperCaseWithHyphen(eStructuralFeature.getName()));
	}

	public static String getXmlReferenceWrapperRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlPluralName = M2ModelUtils.tryGetXmlPluralName(eStructuralFeature);
		return xmlPluralName.or(NameStringUtils.pascalCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + M2ModelUtils.REFERENCE_ROLE_SUFFIX + "s"));
	}

	public static String getXmlReferenceRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlName = M2ModelUtils.tryGetXmlName(eStructuralFeature);
		return xmlName.or(NameStringUtils.pascalCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + M2ModelUtils.REFERENCE_ROLE_SUFFIX));
	}

	public static String getXmlTypeReferenceRoleName(EStructuralFeature eStructuralFeature) {
		Optional<String> xmlName = M2ModelUtils.tryGetXmlName(eStructuralFeature);
		return xmlName.or(NameStringUtils.pascalCaseToUpperCaseWithHyphen(eStructuralFeature.getName() + M2ModelUtils.TYPE_REFERENCE_ROLE_SUFFIX));
	}

	public static String getM2EnumLiteralName(String originalValue) {
		return NameStringUtils.upperCaseWithHyphenToCamelCase(originalValue);
	}

	public static String getXmlEnumLiteralName(Object originalValue) {
		return NameStringUtils.camelCaseToUpperCaseWithHyphen(String.valueOf(originalValue));
	}

	public static String getXmlTypeName(EClass eClass) {
		return NameStringUtils.camelCaseToUpperCaseWithHyphen(eClass.getName());
	}
}
