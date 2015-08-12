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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getCanEnterExclusiveArea <em>Can Enter Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getRunsInsideExclusiveArea <em>Runs Inside Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getExecutableEntity()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableEntity extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Can Enter Exclusive Area</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getEnterExecutableEntity <em>Enter Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Enter Exclusive Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Enter Exclusive Area</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getExecutableEntity_CanEnterExclusiveArea()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea#getEnterExecutableEntity
	 * @model opposite="enterExecutableEntity"
	 * @generated
	 */
	EList<ExclusiveArea> getCanEnterExclusiveArea();

	/**
	 * Returns the value of the '<em><b>Runs Inside Exclusive Area</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs Inside Exclusive Area</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs Inside Exclusive Area</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getExecutableEntity_RunsInsideExclusiveArea()
	 * @model
	 * @generated
	 */
	EList<ExclusiveArea> getRunsInsideExclusiveArea();

	/**
	 * Returns the value of the '<em><b>Sw Addr Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Addr Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Addr Method</em>' reference.
	 * @see #setSwAddrMethod(SwAddrMethod)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getExecutableEntity_SwAddrMethod()
	 * @model
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity#getSwAddrMethod <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Addr Method</em>' reference.
	 * @see #getSwAddrMethod()
	 * @generated
	 */
	void setSwAddrMethod(SwAddrMethod value);

} // ExecutableEntity
