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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rte Exclusive Area Impl Mechanism Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteExclusiveAreaImplMechanismEnum()
 * @model
 * @generated
 */
public enum RteExclusiveAreaImplMechanismEnum implements Enumerator {
	/**
	 * The '<em><b>ALL INTERRUPT BLOCKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INTERRUPT_BLOCKING_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_INTERRUPT_BLOCKING(0, "ALL_INTERRUPT_BLOCKING", "ALL_INTERRUPT_BLOCKING"),

	/**
	 * The '<em><b>COOPERATIVE RUNNABLE PLACEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE_RUNNABLE_PLACEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COOPERATIVE_RUNNABLE_PLACEMENT(1, "COOPERATIVE_RUNNABLE_PLACEMENT", "COOPERATIVE_RUNNABLE_PLACEMENT"),

	/**
	 * The '<em><b>OS INTERRUPT BLOCKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_INTERRUPT_BLOCKING_VALUE
	 * @generated
	 * @ordered
	 */
	OS_INTERRUPT_BLOCKING(2, "OS_INTERRUPT_BLOCKING", "OS_INTERRUPT_BLOCKING"),

	/**
	 * The '<em><b>OS RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	OS_RESOURCE(3, "OS_RESOURCE", "OS_RESOURCE"),

	/**
	 * The '<em><b>OS SPINLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_SPINLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	OS_SPINLOCK(4, "OS_SPINLOCK", "OS_SPINLOCK"), /**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "NONE", "NONE");

	/**
	 * The '<em><b>ALL INTERRUPT BLOCKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL INTERRUPT BLOCKING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_INTERRUPT_BLOCKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_INTERRUPT_BLOCKING_VALUE = 0;

	/**
	 * The '<em><b>COOPERATIVE RUNNABLE PLACEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COOPERATIVE RUNNABLE PLACEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE_RUNNABLE_PLACEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COOPERATIVE_RUNNABLE_PLACEMENT_VALUE = 1;

	/**
	 * The '<em><b>OS INTERRUPT BLOCKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS INTERRUPT BLOCKING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_INTERRUPT_BLOCKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS_INTERRUPT_BLOCKING_VALUE = 2;

	/**
	 * The '<em><b>OS RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS_RESOURCE_VALUE = 3;

	/**
	 * The '<em><b>OS SPINLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS SPINLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_SPINLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS_SPINLOCK_VALUE = 4;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Rte Exclusive Area Impl Mechanism Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RteExclusiveAreaImplMechanismEnum[] VALUES_ARRAY =
		new RteExclusiveAreaImplMechanismEnum[] {
			ALL_INTERRUPT_BLOCKING,
			COOPERATIVE_RUNNABLE_PLACEMENT,
			OS_INTERRUPT_BLOCKING,
			OS_RESOURCE,
			OS_SPINLOCK,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rte Exclusive Area Impl Mechanism Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RteExclusiveAreaImplMechanismEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rte Exclusive Area Impl Mechanism Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteExclusiveAreaImplMechanismEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RteExclusiveAreaImplMechanismEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rte Exclusive Area Impl Mechanism Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteExclusiveAreaImplMechanismEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RteExclusiveAreaImplMechanismEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rte Exclusive Area Impl Mechanism Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RteExclusiveAreaImplMechanismEnum get(int value) {
		switch (value) {
			case ALL_INTERRUPT_BLOCKING_VALUE: return ALL_INTERRUPT_BLOCKING;
			case COOPERATIVE_RUNNABLE_PLACEMENT_VALUE: return COOPERATIVE_RUNNABLE_PLACEMENT;
			case OS_INTERRUPT_BLOCKING_VALUE: return OS_INTERRUPT_BLOCKING;
			case OS_RESOURCE_VALUE: return OS_RESOURCE;
			case OS_SPINLOCK_VALUE: return OS_SPINLOCK;
			case NONE_VALUE: return NONE;
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
	private RteExclusiveAreaImplMechanismEnum(int value, String name, String literal) {
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
	
} //RteExclusiveAreaImplMechanismEnum
