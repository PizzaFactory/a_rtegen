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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage
 * @generated
 */
public interface EcucFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcucFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte</em>'.
	 * @generated
	 */
	Rte createRte();

	/**
	 * Returns a new object of class '<em>Rte Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Generation</em>'.
	 * @generated
	 */
	RteGeneration createRteGeneration();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	EcucRoot createEcucRoot();

	/**
	 * Returns a new object of class '<em>Rte Sw Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Sw Component Instance</em>'.
	 * @generated
	 */
	RteSwComponentInstance createRteSwComponentInstance();

	/**
	 * Returns a new object of class '<em>Rte Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Event To Task Mapping</em>'.
	 * @generated
	 */
	RteEventToTaskMapping createRteEventToTaskMapping();

	/**
	 * Returns a new object of class '<em>Os</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os</em>'.
	 * @generated
	 */
	Os createOs();

	/**
	 * Returns a new object of class '<em>Os Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task</em>'.
	 * @generated
	 */
	OsTask createOsTask();

	/**
	 * Returns a new object of class '<em>Rte Exclusive Area Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Exclusive Area Implementation</em>'.
	 * @generated
	 */
	RteExclusiveAreaImplementation createRteExclusiveAreaImplementation();

	/**
	 * Returns a new object of class '<em>Os Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event</em>'.
	 * @generated
	 */
	OsEvent createOsEvent();

	/**
	 * Returns a new object of class '<em>Com</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com</em>'.
	 * @generated
	 */
	Com createCom();

	/**
	 * Returns a new object of class '<em>Com Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Config</em>'.
	 * @generated
	 */
	ComConfig createComConfig();

	/**
	 * Returns a new object of class '<em>Com Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Signal</em>'.
	 * @generated
	 */
	ComSignal createComSignal();

	/**
	 * Returns a new object of class '<em>Os Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Alarm</em>'.
	 * @generated
	 */
	OsAlarm createOsAlarm();

	/**
	 * Returns a new object of class '<em>Os Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Resource</em>'.
	 * @generated
	 */
	OsResource createOsResource();

	/**
	 * Returns a new object of class '<em>Os Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Application</em>'.
	 * @generated
	 */
	OsApplication createOsApplication();

	/**
	 * Returns a new object of class '<em>Ecu C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecu C</em>'.
	 * @generated
	 */
	EcuC createEcuC();

	/**
	 * Returns a new object of class '<em>Partition Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Collection</em>'.
	 * @generated
	 */
	EcucPartitionCollection createEcucPartitionCollection();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	EcucPartition createEcucPartition();

	/**
	 * Returns a new object of class '<em>Os Spinlock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Spinlock</em>'.
	 * @generated
	 */
	OsSpinlock createOsSpinlock();

	/**
	 * Returns a new object of class '<em>Rte Os Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Os Interaction</em>'.
	 * @generated
	 */
	RteOsInteraction createRteOsInteraction();

	/**
	 * Returns a new object of class '<em>Rte Used Os Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Used Os Activation</em>'.
	 * @generated
	 */
	RteUsedOsActivation createRteUsedOsActivation();

	/**
	 * Returns a new object of class '<em>Rte Initialization Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Initialization Behavior</em>'.
	 * @generated
	 */
	RteInitializationBehavior createRteInitializationBehavior();

	/**
	 * Returns a new object of class '<em>Os Ioc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc</em>'.
	 * @generated
	 */
	OsIoc createOsIoc();

	/**
	 * Returns a new object of class '<em>Os Ioc Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Communication</em>'.
	 * @generated
	 */
	OsIocCommunication createOsIocCommunication();

	/**
	 * Returns a new object of class '<em>Os Ioc Sender Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Sender Properties</em>'.
	 * @generated
	 */
	OsIocSenderProperties createOsIocSenderProperties();

	/**
	 * Returns a new object of class '<em>Os Ioc Receiver Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Receiver Properties</em>'.
	 * @generated
	 */
	OsIocReceiverProperties createOsIocReceiverProperties();

	/**
	 * Returns a new object of class '<em>Os Ioc Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Ioc Data Properties</em>'.
	 * @generated
	 */
	OsIocDataProperties createOsIocDataProperties();

	/**
	 * Returns a new object of class '<em>Os Application Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Application Trusted Function</em>'.
	 * @generated
	 */
	OsApplicationTrustedFunction createOsApplicationTrustedFunction();

	/**
	 * Returns a new object of class '<em>Os OS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os OS</em>'.
	 * @generated
	 */
	OsOS createOsOS();

	/**
	 * Returns a new object of class '<em>Rte Bsw Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Event To Task Mapping</em>'.
	 * @generated
	 */
	RteBswEventToTaskMapping createRteBswEventToTaskMapping();

	/**
	 * Returns a new object of class '<em>Rte Bsw Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Module Instance</em>'.
	 * @generated
	 */
	RteBswModuleInstance createRteBswModuleInstance();

	/**
	 * Returns a new object of class '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Exclusive Area Impl</em>'.
	 * @generated
	 */
	RteBswExclusiveAreaImpl createRteBswExclusiveAreaImpl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcucPackage getEcucPackage();

} //EcucFactory
