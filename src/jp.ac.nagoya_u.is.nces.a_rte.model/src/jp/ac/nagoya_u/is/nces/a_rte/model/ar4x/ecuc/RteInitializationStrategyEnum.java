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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rte Initialization Strategy Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteInitializationStrategyEnum()
 * @model
 * @generated
 */
public enum RteInitializationStrategyEnum implements Enumerator {
	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION(0, "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION", "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION"),

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION AND PARTITION RESTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART(1, "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART", "RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART"),

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_RTE_START(2, "RTE_INITIALIZATION_STRATEGY_AT_RTE_START", "RTE_INITIALIZATION_STRATEGY_AT_RTE_START"), /**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START AND PARTITION RESTART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART(3, "RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART", "RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART"),

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	RTE_INITIALIZATION_STRATEGY_NONE(4, "RTE_INITIALIZATION_STRATEGY_NONE", "RTE_INITIALIZATION_STRATEGY_NONE");

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_VALUE = 0;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION AND PARTITION RESTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT DATA DECLARATION AND PARTITION RESTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART_VALUE = 1;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT RTE START</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_RTE_START_VALUE = 2;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY AT RTE START AND PARTITION RESTART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY AT RTE START AND PARTITION RESTART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART_VALUE = 3;

	/**
	 * The '<em><b>RTE INITIALIZATION STRATEGY NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTE INITIALIZATION STRATEGY NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTE_INITIALIZATION_STRATEGY_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTE_INITIALIZATION_STRATEGY_NONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Rte Initialization Strategy Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RteInitializationStrategyEnum[] VALUES_ARRAY =
		new RteInitializationStrategyEnum[] {
			RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION,
			RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART,
			RTE_INITIALIZATION_STRATEGY_AT_RTE_START,
			RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART,
			RTE_INITIALIZATION_STRATEGY_NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rte Initialization Strategy Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RteInitializationStrategyEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rte Initialization Strategy Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteInitializationStrategyEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RteInitializationStrategyEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rte Initialization Strategy Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteInitializationStrategyEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RteInitializationStrategyEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rte Initialization Strategy Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteInitializationStrategyEnum get(int value) {
		switch (value) {
			case RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION;
			case RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_DATA_DECLARATION_AND_PARTITION_RESTART;
			case RTE_INITIALIZATION_STRATEGY_AT_RTE_START_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_RTE_START;
			case RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART_VALUE: return RTE_INITIALIZATION_STRATEGY_AT_RTE_START_AND_PARTITION_RESTART;
			case RTE_INITIALIZATION_STRATEGY_NONE_VALUE: return RTE_INITIALIZATION_STRATEGY_NONE;
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
	private RteInitializationStrategyEnum(int value, String name, String literal) {
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
	
} //RteInitializationStrategyEnum
