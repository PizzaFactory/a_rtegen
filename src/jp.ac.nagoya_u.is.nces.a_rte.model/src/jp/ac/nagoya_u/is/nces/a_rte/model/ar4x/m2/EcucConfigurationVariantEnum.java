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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ecuc Configuration Variant Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getEcucConfigurationVariantEnum()
 * @model
 * @generated
 */
public enum EcucConfigurationVariantEnum implements Enumerator {
	/**
	 * The '<em><b>Variant Post Build Selectable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_SELECTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_POST_BUILD_SELECTABLE(5, "variantPostBuildSelectable", "variantPostBuildSelectable"),

	/**
	 * The '<em><b>Variant Pre Compile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_PRE_COMPILE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_PRE_COMPILE(6, "variantPreCompile", "variantPreCompile"),

	/**
	 * The '<em><b>Preconfigured Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONFIGURED_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONFIGURED_CONFIGURATION(0, "preconfiguredConfiguration", "preconfiguredConfiguration"),

	/**
	 * The '<em><b>Variant Post Build Loadable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_LOADABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_POST_BUILD_LOADABLE(4, "variantPostBuildLoadable", "variantPostBuildLoadable"),

	/**
	 * The '<em><b>Variant Post Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_POST_BUILD(3, "variantPostBuild", "variantPostBuild"),

	/**
	 * The '<em><b>Variant Link Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_LINK_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT_LINK_TIME(2, "variantLinkTime", "variantLinkTime"),

	/**
	 * The '<em><b>Recommended Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDED_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMENDED_CONFIGURATION(1, "recommendedConfiguration", "recommendedConfiguration");

	/**
	 * The '<em><b>Variant Post Build Selectable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Post Build Selectable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_SELECTABLE
	 * @model name="variantPostBuildSelectable"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_POST_BUILD_SELECTABLE_VALUE = 5;

	/**
	 * The '<em><b>Variant Pre Compile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Pre Compile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_PRE_COMPILE
	 * @model name="variantPreCompile"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_PRE_COMPILE_VALUE = 6;

	/**
	 * The '<em><b>Preconfigured Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preconfigured Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECONFIGURED_CONFIGURATION
	 * @model name="preconfiguredConfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONFIGURED_CONFIGURATION_VALUE = 0;

	/**
	 * The '<em><b>Variant Post Build Loadable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Post Build Loadable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD_LOADABLE
	 * @model name="variantPostBuildLoadable"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_POST_BUILD_LOADABLE_VALUE = 4;

	/**
	 * The '<em><b>Variant Post Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Post Build</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_POST_BUILD
	 * @model name="variantPostBuild"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_POST_BUILD_VALUE = 3;

	/**
	 * The '<em><b>Variant Link Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variant Link Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANT_LINK_TIME
	 * @model name="variantLinkTime"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_LINK_TIME_VALUE = 2;

	/**
	 * The '<em><b>Recommended Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recommended Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDED_CONFIGURATION
	 * @model name="recommendedConfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDED_CONFIGURATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ecuc Configuration Variant Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EcucConfigurationVariantEnum[] VALUES_ARRAY =
		new EcucConfigurationVariantEnum[] {
			VARIANT_POST_BUILD_SELECTABLE,
			VARIANT_PRE_COMPILE,
			PRECONFIGURED_CONFIGURATION,
			VARIANT_POST_BUILD_LOADABLE,
			VARIANT_POST_BUILD,
			VARIANT_LINK_TIME,
			RECOMMENDED_CONFIGURATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Ecuc Configuration Variant Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EcucConfigurationVariantEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ecuc Configuration Variant Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucConfigurationVariantEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EcucConfigurationVariantEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ecuc Configuration Variant Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucConfigurationVariantEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EcucConfigurationVariantEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ecuc Configuration Variant Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcucConfigurationVariantEnum get(int value) {
		switch (value) {
			case VARIANT_POST_BUILD_SELECTABLE_VALUE: return VARIANT_POST_BUILD_SELECTABLE;
			case VARIANT_PRE_COMPILE_VALUE: return VARIANT_PRE_COMPILE;
			case PRECONFIGURED_CONFIGURATION_VALUE: return PRECONFIGURED_CONFIGURATION;
			case VARIANT_POST_BUILD_LOADABLE_VALUE: return VARIANT_POST_BUILD_LOADABLE;
			case VARIANT_POST_BUILD_VALUE: return VARIANT_POST_BUILD;
			case VARIANT_LINK_TIME_VALUE: return VARIANT_LINK_TIME;
			case RECOMMENDED_CONFIGURATION_VALUE: return RECOMMENDED_CONFIGURATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EcucConfigurationVariantEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EcucConfigurationVariantEnum
