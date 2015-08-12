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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage
 * @generated
 */
public interface InteractionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	InteractionObject createInteractionObject();

	/**
	 * Returns a new object of class '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referrable</em>'.
	 * @generated
	 */
	InteractionReferrable createInteractionReferrable();

	/**
	 * Returns a new object of class '<em>Internal Ecu Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Ecu Sender</em>'.
	 * @generated
	 */
	InternalEcuSender createInternalEcuSender();

	/**
	 * Returns a new object of class '<em>External Ecu Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Sender</em>'.
	 * @generated
	 */
	ExternalEcuSender createExternalEcuSender();

	/**
	 * Returns a new object of class '<em>Send Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Interaction</em>'.
	 * @generated
	 */
	SendInteraction createSendInteraction();

	/**
	 * Returns a new object of class '<em>Receive Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Interaction</em>'.
	 * @generated
	 */
	ReceiveInteraction createReceiveInteraction();

	/**
	 * Returns a new object of class '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver</em>'.
	 * @generated
	 */
	Receiver createReceiver();

	/**
	 * Returns a new object of class '<em>Internal Ecu Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Ecu Receiver</em>'.
	 * @generated
	 */
	InternalEcuReceiver createInternalEcuReceiver();

	/**
	 * Returns a new object of class '<em>Rte Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Value Buffer Implementation</em>'.
	 * @generated
	 */
	RteValueBufferImplementation createRteValueBufferImplementation();

	/**
	 * Returns a new object of class '<em>External Ecu Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Ecu Receiver</em>'.
	 * @generated
	 */
	ExternalEcuReceiver createExternalEcuReceiver();

	/**
	 * Returns a new object of class '<em>Rte Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Send Implementation</em>'.
	 * @generated
	 */
	RteSendImplementation createRteSendImplementation();

	/**
	 * Returns a new object of class '<em>Ioc Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Implementation</em>'.
	 * @generated
	 */
	IocSendImplementation createIocSendImplementation();

	/**
	 * Returns a new object of class '<em>Direct Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Com Send Implementation</em>'.
	 * @generated
	 */
	DirectComSendImplementation createDirectComSendImplementation();

	/**
	 * Returns a new object of class '<em>Trusted Function Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Com Send Implementation</em>'.
	 * @generated
	 */
	TrustedFunctionComSendImplementation createTrustedFunctionComSendImplementation();

	/**
	 * Returns a new object of class '<em>Periodic Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Proxy Com Send Implementation</em>'.
	 * @generated
	 */
	PeriodicProxyComSendImplementation createPeriodicProxyComSendImplementation();

	/**
	 * Returns a new object of class '<em>Immediate Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Proxy Com Send Implementation</em>'.
	 * @generated
	 */
	ImmediateProxyComSendImplementation createImmediateProxyComSendImplementation();

	/**
	 * Returns a new object of class '<em>Filter Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Buffer Implementation</em>'.
	 * @generated
	 */
	FilterBufferImplementation createFilterBufferImplementation();

	/**
	 * Returns a new object of class '<em>Ioc Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Value Buffer Implementation</em>'.
	 * @generated
	 */
	IocValueBufferImplementation createIocValueBufferImplementation();

	/**
	 * Returns a new object of class '<em>Com Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Value Buffer Implementation</em>'.
	 * @generated
	 */
	ComValueBufferImplementation createComValueBufferImplementation();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	InteractionRoot createInteractionRoot();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Send Implementation</em>'.
	 * @generated
	 */
	TrustedFunctionRteSendImplementation createTrustedFunctionRteSendImplementation();

	/**
	 * Returns a new object of class '<em>Com Send Proxy Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Proxy Interaction</em>'.
	 * @generated
	 */
	ComSendProxyInteraction createComSendProxyInteraction();

	/**
	 * Returns a new object of class '<em>Periodic Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Com Send Proxy</em>'.
	 * @generated
	 */
	PeriodicComSendProxy createPeriodicComSendProxy();

	/**
	 * Returns a new object of class '<em>Immediate Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Com Send Proxy</em>'.
	 * @generated
	 */
	ImmediateComSendProxy createImmediateComSendProxy();

	/**
	 * Returns a new object of class '<em>Os Task Activate Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Activate Entity Starter</em>'.
	 * @generated
	 */
	OsTaskActivateEntityStarter createOsTaskActivateEntityStarter();

	/**
	 * Returns a new object of class '<em>Os Event Set Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event Set Entity Starter</em>'.
	 * @generated
	 */
	OsEventSetEntityStarter createOsEventSetEntityStarter();

	/**
	 * Returns a new object of class '<em>Timing Triggering Entity Start Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Triggering Entity Start Implementation</em>'.
	 * @generated
	 */
	TimingTriggeringEntityStartImplementation createTimingTriggeringEntityStartImplementation();

	/**
	 * Returns a new object of class '<em>Mode Switch Triggering Entity Start Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Switch Triggering Entity Start Implementation</em>'.
	 * @generated
	 */
	ModeSwitchTriggeringEntityStartImplementation createModeSwitchTriggeringEntityStartImplementation();

	/**
	 * Returns a new object of class '<em>Runnable Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable Entity Start Interaction</em>'.
	 * @generated
	 */
	RunnableEntityStartInteraction createRunnableEntityStartInteraction();

	/**
	 * Returns a new object of class '<em>Start Offset Counter Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Offset Counter Implementation</em>'.
	 * @generated
	 */
	StartOffsetCounterImplementation createStartOffsetCounterImplementation();

	/**
	 * Returns a new object of class '<em>Cycle Counter Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cycle Counter Implementation</em>'.
	 * @generated
	 */
	CycleCounterImplementation createCycleCounterImplementation();

	/**
	 * Returns a new object of class '<em>Generated Ecu Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generated Ecu Configuration</em>'.
	 * @generated
	 */
	GeneratedEcuConfiguration createGeneratedEcuConfiguration();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * @generated
	 */
	BswSchedulableEntityStartInteraction createBswSchedulableEntityStartInteraction();

	/**
	 * Returns a new object of class '<em>Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event To Task Mapping</em>'.
	 * @generated
	 */
	EventToTaskMapping createEventToTaskMapping();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Event</em>'.
	 * @generated
	 */
	TimingEvent createTimingEvent();

	/**
	 * Returns a new object of class '<em>Mode Switch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Switch Event</em>'.
	 * @generated
	 */
	ModeSwitchEvent createModeSwitchEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionPackage getInteractionPackage();

} //InteractionFactory
