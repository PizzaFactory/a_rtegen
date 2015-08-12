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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Object;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Referrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.CharMatcher;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class M2ModelUtils {

	public static final String ID_PREFIX = "m2.";
	public static final String REFERENCE_SEPARATOR = "/";
	public static final String REFERENCE_ROLE_SUFFIX = "Ref";
	public static final String TYPE_REFERENCE_ROLE_SUFFIX = "Tref";
	public static final String INSTANCE_REFERENCE_ROLE_SUFFIX = "Iref";
	public static final String MIXED_STRING_VALUE_FEATURE_NAME = "value";

	// ���͡�����������ͤ�ʸ����ɽ��
	private static final String BINARY_PREFIX = "0b";
	private static final String OCTAL_PREFIX = "0";
	private static final CharMatcher OCTAL_RANGE = CharMatcher.inRange('0', '7').precomputed();
	private static final String HEX_PREFIX = "0x";
	private static final CharMatcher FLOAT_SPECIFIC_CHARS = CharMatcher.anyOf(".E").precomputed();
	private static final Integer BOOLEAN_TRUE_VALUE = 1;
	private static final Integer BOOLEAN_FALSE_VALUE = 0;
	private static final List<String> BOOLEAN_TRUE_TEXT_REPRESENTATIONS = Lists.newArrayList("1", "true");

	// ��ǥ�Υ��ƥ쥪�����פ˴ؤ��륢�Υơ������
	private static final String IS_OF_TYPE_STEREOTYPE = "isOfType";
	private static final String MIXED_STRING_STEREOTYPE = "atpMixedString";
	private static final String NON_M2_STEREOTYPE = "nonM2";

	// XML��³���˴ؤ��륢�Υơ������
	private static final String XML_ROLE_WRAPPER_ELEMENT_TAG = "xml.roleWrapperElement"; // �����åѡ�����Ū��ͭ���ˤ���
	private static final String XML_NAME_TAG = "xml.name"; // ������б�����XML����̾(ñ����)
	private static final String XML_NAME_PLURAL_TAG = "xml.namePlural"; // ������б�����XML����̾(ʣ����)

	public static final String DEFAULT_ECUC_DEF_EDITION = "4.2.0";

	public static enum ReferenceType {
		CONTAINMENT, REFERENCE, TYPE_REFERENCE,
	}

	public static String getIrefRoleNameOfRoleFeature(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getName() + INSTANCE_REFERENCE_ROLE_SUFFIX;
	}

	public static ReferenceType getReferenceType(EReference eReference) {
		if (eReference.isContainment()) {
			return ReferenceType.CONTAINMENT;
		} else {
			if (EmfUtils.hasStereotype(eReference, IS_OF_TYPE_STEREOTYPE)) {
				return ReferenceType.TYPE_REFERENCE;
			} else {
				return ReferenceType.REFERENCE;
			}
		}
	}

	public static Object convertValueForFeature(String originalValue, EStructuralFeature eFeature) throws ModelException {
		return convertValueToType(originalValue, (EDataType) eFeature.getEType());
	}

	public static Object convertValueForFeature(BigDecimal originalValue, EStructuralFeature eFeature) throws ModelException {
		return convertValueToType(originalValue, (EDataType) eFeature.getEType());
	}

	public static boolean tryConvertValueToType(String originalValue, EDataType type) {
		try {
			tryConvertValueToType(originalValue, type);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static Object convertValueToType(String originalValue, EDataType type) throws ModelException {
		try {
			if (isJavaBigDecimal(type)) {
				return parseNumerical(originalValue);
			} else if (isJavaBigInteger(type)) {
				return parseBigInteger(originalValue);
			} else if (isJavaIntegerType(type)) {
				return parseInteger(originalValue);
			} else if (isJavaBooleanType(type)) {
				return parseBoolean(originalValue);
			} else if (isJavaStringType(type)) {
				return originalValue;
			} else if (type instanceof EEnum) {
				EEnum eEnum = (EEnum) type;
				if (eEnum.getEEnumLiteral(originalValue) == null) {
					throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
				} else {
					return type.getEPackage().getEFactoryInstance().createFromString(type, originalValue);
				}
			} else {
				throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
			}
		} catch (NumberFormatException e) {
			throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".", e);
		}
	}

	public static Object convertValueToType(BigDecimal originalValue, EDataType type) throws ModelException {
		try {
			if (isJavaBigDecimal(type)) {
				return originalValue;
			} else if (isJavaBigInteger(type)) {
				return originalValue.toBigIntegerExact();
			}
			if (isJavaIntegerType(type)) {
				return originalValue.intValueExact();
			} else if (isJavaBooleanType(type)) {
				return BOOLEAN_TRUE_VALUE.equals(originalValue.intValueExact());
			} else if (isJavaStringType(type)) {
				return String.valueOf(originalValue);
			} else {
				throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
			}
		} catch (ArithmeticException e) {
			throw new ModelException("Invalid value '" + originalValue + "' for the type " + type.getName() + ".");
		}
	}

	private static boolean isJavaBigDecimal(EDataType type) {
		return BigDecimal.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaBigInteger(EDataType type) {
		return BigInteger.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaIntegerType(EDataType type) {
		return Integer.class.equals(type.getInstanceClass()) || int.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaBooleanType(EDataType type) {
		return Boolean.class.equals(type.getInstanceClass()) || boolean.class.equals(type.getInstanceClass());
	}

	private static boolean isJavaStringType(EDataType type) {
		return String.class.equals(type.getInstanceClass());
	}

	public static BigDecimal parseNumerical(String originalValue) {
		if ("true".equals(originalValue)) {
			originalValue = "1";
		} else if ("false".equals(originalValue)) {
			originalValue = "0";
		}
		if (FLOAT_SPECIFIC_CHARS.matchesAnyOf(originalValue)) {
			return new BigDecimal(originalValue);
		} else {
			return new BigDecimal(parseBigInteger(originalValue));
		}
	}

	private static BigInteger parseBigInteger(String originalValue) {
		if (isBinaryString(originalValue)) {
			return new BigInteger(originalValue.substring(BINARY_PREFIX.length()), 2);
		} else if (isOctalString(originalValue)) {
			return new BigInteger(originalValue.substring(OCTAL_PREFIX.length()), 8);
		} else if (isHexString(originalValue)) {
			return new BigInteger(originalValue.substring(HEX_PREFIX.length()), 16);
		} else {
			return new BigInteger(originalValue);
		}
	}

	private static int parseInteger(String originalValue) {
		if (isBinaryString(originalValue)) {
			return Integer.parseInt(originalValue.substring(BINARY_PREFIX.length()), 2);
		} else if (isOctalString(originalValue)) {
			return Integer.parseInt(originalValue.substring(OCTAL_PREFIX.length()), 8);
		} else if (isHexString(originalValue)) {
			return Integer.parseInt(originalValue.substring(HEX_PREFIX.length()), 16);
		} else {
			return Integer.parseInt(originalValue);
		}
	}

	private static boolean isBinaryString(String originalValue) {
		return originalValue.startsWith(BINARY_PREFIX);
	}

	private static boolean isHexString(String originalValue) {
		return originalValue.startsWith(HEX_PREFIX);
	}

	private static boolean isOctalString(String originalValue) {
		return originalValue.startsWith(OCTAL_PREFIX) && originalValue.length() > 1 && OCTAL_RANGE.matchesAllOf(originalValue);
	}

	private static boolean parseBoolean(String originalValue) {
		return BOOLEAN_TRUE_TEXT_REPRESENTATIONS.contains(originalValue);
	}

	public static boolean hasMixedStringStereotype(EClass eClass) {
		return EmfUtils.hasStereotype(eClass, MIXED_STRING_STEREOTYPE);
	}

	public static boolean isXmlRoleWrapperEnabled(EStructuralFeature eStructuralFeature, boolean defaultValue) {
		return EmfUtils.getBooleanTagValue(eStructuralFeature, XML_ROLE_WRAPPER_ELEMENT_TAG, defaultValue);
	}

	public static Optional<String> tryGetXmlName(EStructuralFeature eStructuralFeature) {
		return EmfUtils.tryGetTag(eStructuralFeature, XML_NAME_TAG);
	}

	public static Optional<String> tryGetXmlPluralName(EStructuralFeature eStructuralFeature) {
		return EmfUtils.tryGetTag(eStructuralFeature, XML_NAME_PLURAL_TAG);
	}

	public static BigDecimal convertValueToBigDecimal(Object value) {
		if (value instanceof BigDecimal) {
			return new BigDecimal((BigInteger) value);

		} else if (value instanceof BigInteger) {
			return new BigDecimal((BigInteger) value);

		} else if (value instanceof Boolean) {
			Boolean booleanValue = (Boolean) value;
			return BigDecimal.valueOf(booleanValue ? BOOLEAN_TRUE_VALUE : BOOLEAN_FALSE_VALUE);

		} else if (value instanceof Integer) {
			return BigDecimal.valueOf((Integer) value);

		} else {
			return null;
		}
	}

	public static boolean isNumericalAttribute(EAttribute eAttribute) {
		return isJavaBooleanType(eAttribute.getEAttributeType()) || isJavaIntegerType(eAttribute.getEAttributeType()) || isJavaBigInteger(eAttribute.getEAttributeType())
				|| isJavaBigDecimal(eAttribute.getEAttributeType());
	}

	public static String generateAutosarReference(M2Object object) {
		StringBuilder sb = new StringBuilder();

		EObject container = object;
		while (container != null) {
			if (container instanceof Referrable) {
				Referrable referrable = (Referrable) container;
				sb.insert(0, REFERENCE_SEPARATOR + referrable.getShortName());
			}
			container = container.eContainer();
		}
		return sb.toString();
	}

	public static String getReferenceBase(Referrable referrable) {
		String reference = referrable.getReference();
		int lastIndex = reference.lastIndexOf(REFERENCE_SEPARATOR);
		return lastIndex == -1 ? "" : reference.substring(0, lastIndex);
	}

	public static boolean isNonM2Feature(EStructuralFeature eFeature) {
		return EmfUtils.hasStereotype(eFeature, NON_M2_STEREOTYPE);
	}
}
