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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTestModule <em>Rte Test Module</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTest <em>Rte Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestRoot()
 * @model
 * @generated
 */
public interface RteTestRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Rte Test Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Test Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Test Module</em>' containment reference.
	 * @see #setRteTestModule(RteTestModule)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestRoot_RteTestModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteTestModule getRteTestModule();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTestModule <em>Rte Test Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Test Module</em>' containment reference.
	 * @see #getRteTestModule()
	 * @generated
	 */
	void setRteTestModule(RteTestModule value);

	/**
	 * Returns the value of the '<em><b>Rte Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Test</em>' containment reference.
	 * @see #setRteTest(RteTest)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage#getRteTestRoot_RteTest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteTest getRteTest();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot#getRteTest <em>Rte Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Test</em>' containment reference.
	 * @see #getRteTest()
	 * @generated
	 */
	void setRteTest(RteTest value);

} // RteTestRoot
