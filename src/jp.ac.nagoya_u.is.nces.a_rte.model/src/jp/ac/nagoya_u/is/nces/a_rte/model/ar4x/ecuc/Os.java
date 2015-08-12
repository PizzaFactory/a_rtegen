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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsTask <em>Os Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsEvent <em>Os Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsApplication <em>Os Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsAlarm <em>Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsResource <em>Os Resource</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsSpinlock <em>Os Spinlock</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsIoc <em>Os Ioc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsOS <em>Os OS</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs()
 * @model
 * @generated
 */
public interface Os extends EcucModule {
	/**
	 * Returns the value of the '<em><b>Os Task</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Task</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsTask> getOsTask();

	/**
	 * Returns the value of the '<em><b>Os Event</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Event</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsEvent> getOsEvent();

	/**
	 * Returns the value of the '<em><b>Os Application</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Application</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Application</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsApplication()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsApplication> getOsApplication();

	/**
	 * Returns the value of the '<em><b>Os Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsAlarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Alarm</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsAlarm()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsAlarm> getOsAlarm();

	/**
	 * Returns the value of the '<em><b>Os Resource</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Resource</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsResource> getOsResource();

	/**
	 * Returns the value of the '<em><b>Os Spinlock</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Spinlock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Spinlock</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsSpinlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsSpinlock> getOsSpinlock();

	/**
	 * Returns the value of the '<em><b>Os Ioc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Ioc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Ioc</em>' containment reference.
	 * @see #setOsIoc(OsIoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsIoc()
	 * @model containment="true"
	 * @generated
	 */
	OsIoc getOsIoc();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsIoc <em>Os Ioc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Ioc</em>' containment reference.
	 * @see #getOsIoc()
	 * @generated
	 */
	void setOsIoc(OsIoc value);

	/**
	 * Returns the value of the '<em><b>Os OS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os OS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os OS</em>' containment reference.
	 * @see #setOsOS(OsOS)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getOs_OsOS()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OsOS getOsOS();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os#getOsOS <em>Os OS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os OS</em>' containment reference.
	 * @see #getOsOS()
	 * @generated
	 */
	void setOsOS(OsOS value);

} // Os
