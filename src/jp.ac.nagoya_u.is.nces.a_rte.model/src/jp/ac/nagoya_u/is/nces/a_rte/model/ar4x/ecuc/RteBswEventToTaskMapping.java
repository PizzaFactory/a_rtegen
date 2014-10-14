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

import java.math.BigDecimal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Bsw Event To Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswActivationOffset <em>Rte Bsw Activation Offset</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswEvent <em>Rte Bsw Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswPositionInTask <em>Rte Bsw Position In Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswMappedToTask <em>Rte Bsw Mapped To Task</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsAlarm <em>Rte Bsw Used Os Alarm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsEvent <em>Rte Bsw Used Os Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping()
 * @model
 * @generated
 */
public interface RteBswEventToTaskMapping extends EcucContainer {
	/**
	 * Returns the value of the '<em><b>Rte Bsw Activation Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Activation Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Activation Offset</em>' attribute.
	 * @see #setRteBswActivationOffset(BigDecimal)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswActivationOffset()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TimeValue"
	 * @generated
	 */
	BigDecimal getRteBswActivationOffset();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswActivationOffset <em>Rte Bsw Activation Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Activation Offset</em>' attribute.
	 * @see #getRteBswActivationOffset()
	 * @generated
	 */
	void setRteBswActivationOffset(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Event</em>' reference.
	 * @see #setRteBswEvent(BswEvent)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswEvent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent#getConfig
	 * @model opposite="config" required="true"
	 * @generated
	 */
	BswEvent getRteBswEvent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswEvent <em>Rte Bsw Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Event</em>' reference.
	 * @see #getRteBswEvent()
	 * @generated
	 */
	void setRteBswEvent(BswEvent value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Position In Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Position In Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Position In Task</em>' attribute.
	 * @see #setRteBswPositionInTask(Integer)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswPositionInTask()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Integer"
	 * @generated
	 */
	Integer getRteBswPositionInTask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswPositionInTask <em>Rte Bsw Position In Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Position In Task</em>' attribute.
	 * @see #getRteBswPositionInTask()
	 * @generated
	 */
	void setRteBswPositionInTask(Integer value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Mapped To Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteBswEvent <em>Mapped Rte Bsw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Mapped To Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Mapped To Task</em>' reference.
	 * @see #setRteBswMappedToTask(OsTask)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswMappedToTask()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask#getMappedRteBswEvent
	 * @model opposite="mappedRteBswEvent"
	 * @generated
	 */
	OsTask getRteBswMappedToTask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswMappedToTask <em>Rte Bsw Mapped To Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Mapped To Task</em>' reference.
	 * @see #getRteBswMappedToTask()
	 * @generated
	 */
	void setRteBswMappedToTask(OsTask value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Used Os Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Used Os Alarm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Used Os Alarm</em>' reference.
	 * @see #setRteBswUsedOsAlarm(OsAlarm)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswUsedOsAlarm()
	 * @model
	 * @generated
	 */
	OsAlarm getRteBswUsedOsAlarm();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsAlarm <em>Rte Bsw Used Os Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Used Os Alarm</em>' reference.
	 * @see #getRteBswUsedOsAlarm()
	 * @generated
	 */
	void setRteBswUsedOsAlarm(OsAlarm value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Used Os Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Used Os Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Used Os Event</em>' reference.
	 * @see #setRteBswUsedOsEvent(OsEvent)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage#getRteBswEventToTaskMapping_RteBswUsedOsEvent()
	 * @model
	 * @generated
	 */
	OsEvent getRteBswUsedOsEvent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping#getRteBswUsedOsEvent <em>Rte Bsw Used Os Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Used Os Event</em>' reference.
	 * @see #getRteBswUsedOsEvent()
	 * @generated
	 */
	void setRteBswUsedOsEvent(OsEvent value);

} // RteBswEventToTaskMapping
