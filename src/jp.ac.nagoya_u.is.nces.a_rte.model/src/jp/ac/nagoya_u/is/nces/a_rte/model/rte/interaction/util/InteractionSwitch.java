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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage
 * @generated
 */
public class InteractionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionSwitch() {
		if (modelPackage == null) {
			modelPackage = InteractionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InteractionPackage.INTERACTION_OBJECT: {
				InteractionObject interactionObject = (InteractionObject)theEObject;
				T result = caseInteractionObject(interactionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.INTERACTION_REFERRABLE: {
				InteractionReferrable interactionReferrable = (InteractionReferrable)theEObject;
				T result = caseInteractionReferrable(interactionReferrable);
				if (result == null) result = caseInteractionObject(interactionReferrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.SENDER: {
				Sender sender = (Sender)theEObject;
				T result = caseSender(sender);
				if (result == null) result = caseInteractionEnd(sender);
				if (result == null) result = caseInteractionReferrable(sender);
				if (result == null) result = caseInteractionObject(sender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.INTERNAL_ECU_SENDER: {
				InternalEcuSender internalEcuSender = (InternalEcuSender)theEObject;
				T result = caseInternalEcuSender(internalEcuSender);
				if (result == null) result = caseSender(internalEcuSender);
				if (result == null) result = caseInteractionEnd(internalEcuSender);
				if (result == null) result = caseInteractionReferrable(internalEcuSender);
				if (result == null) result = caseInteractionObject(internalEcuSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.EXTERNAL_ECU_SENDER: {
				ExternalEcuSender externalEcuSender = (ExternalEcuSender)theEObject;
				T result = caseExternalEcuSender(externalEcuSender);
				if (result == null) result = caseSender(externalEcuSender);
				if (result == null) result = caseInteractionEnd(externalEcuSender);
				if (result == null) result = caseInteractionReferrable(externalEcuSender);
				if (result == null) result = caseInteractionObject(externalEcuSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.SEND_INTERACTION: {
				SendInteraction sendInteraction = (SendInteraction)theEObject;
				T result = caseSendInteraction(sendInteraction);
				if (result == null) result = caseInteraction(sendInteraction);
				if (result == null) result = caseInteractionReferrable(sendInteraction);
				if (result == null) result = caseInteractionObject(sendInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.RECEIVE_INTERACTION: {
				ReceiveInteraction receiveInteraction = (ReceiveInteraction)theEObject;
				T result = caseReceiveInteraction(receiveInteraction);
				if (result == null) result = caseInteraction(receiveInteraction);
				if (result == null) result = caseInteractionReferrable(receiveInteraction);
				if (result == null) result = caseInteractionObject(receiveInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.RECEIVER: {
				Receiver receiver = (Receiver)theEObject;
				T result = caseReceiver(receiver);
				if (result == null) result = caseInteractionEnd(receiver);
				if (result == null) result = caseInteractionReferrable(receiver);
				if (result == null) result = caseInteractionObject(receiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.INTERNAL_ECU_RECEIVER: {
				InternalEcuReceiver internalEcuReceiver = (InternalEcuReceiver)theEObject;
				T result = caseInternalEcuReceiver(internalEcuReceiver);
				if (result == null) result = caseReceiver(internalEcuReceiver);
				if (result == null) result = caseInteractionEnd(internalEcuReceiver);
				if (result == null) result = caseInteractionReferrable(internalEcuReceiver);
				if (result == null) result = caseInteractionObject(internalEcuReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.VALUE_BUFFER_IMPLEMENTATION: {
				ValueBufferImplementation valueBufferImplementation = (ValueBufferImplementation)theEObject;
				T result = caseValueBufferImplementation(valueBufferImplementation);
				if (result == null) result = caseVariableImplementation(valueBufferImplementation);
				if (result == null) result = caseInteractionReferrable(valueBufferImplementation);
				if (result == null) result = caseInteractionObject(valueBufferImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.RTE_VALUE_BUFFER_IMPLEMENTATION: {
				RteValueBufferImplementation rteValueBufferImplementation = (RteValueBufferImplementation)theEObject;
				T result = caseRteValueBufferImplementation(rteValueBufferImplementation);
				if (result == null) result = caseValueBufferImplementation(rteValueBufferImplementation);
				if (result == null) result = caseVariableImplementation(rteValueBufferImplementation);
				if (result == null) result = caseInteractionReferrable(rteValueBufferImplementation);
				if (result == null) result = caseInteractionObject(rteValueBufferImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.EXTERNAL_ECU_RECEIVER: {
				ExternalEcuReceiver externalEcuReceiver = (ExternalEcuReceiver)theEObject;
				T result = caseExternalEcuReceiver(externalEcuReceiver);
				if (result == null) result = caseReceiver(externalEcuReceiver);
				if (result == null) result = caseInteractionEnd(externalEcuReceiver);
				if (result == null) result = caseInteractionReferrable(externalEcuReceiver);
				if (result == null) result = caseInteractionObject(externalEcuReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.SEND_IMPLEMENTATION: {
				SendImplementation sendImplementation = (SendImplementation)theEObject;
				T result = caseSendImplementation(sendImplementation);
				if (result == null) result = caseInteractionReferrable(sendImplementation);
				if (result == null) result = caseInteractionObject(sendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.RTE_SEND_IMPLEMENTATION: {
				RteSendImplementation rteSendImplementation = (RteSendImplementation)theEObject;
				T result = caseRteSendImplementation(rteSendImplementation);
				if (result == null) result = caseSendImplementation(rteSendImplementation);
				if (result == null) result = caseInteractionReferrable(rteSendImplementation);
				if (result == null) result = caseInteractionObject(rteSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.IOC_SEND_IMPLEMENTATION: {
				IocSendImplementation iocSendImplementation = (IocSendImplementation)theEObject;
				T result = caseIocSendImplementation(iocSendImplementation);
				if (result == null) result = caseSendImplementation(iocSendImplementation);
				if (result == null) result = caseInteractionReferrable(iocSendImplementation);
				if (result == null) result = caseInteractionObject(iocSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.DIRECT_COM_SEND_IMPLEMENTATION: {
				DirectComSendImplementation directComSendImplementation = (DirectComSendImplementation)theEObject;
				T result = caseDirectComSendImplementation(directComSendImplementation);
				if (result == null) result = caseComSendImplementation(directComSendImplementation);
				if (result == null) result = caseSendImplementation(directComSendImplementation);
				if (result == null) result = caseInteractionReferrable(directComSendImplementation);
				if (result == null) result = caseInteractionObject(directComSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION: {
				TrustedFunctionComSendImplementation trustedFunctionComSendImplementation = (TrustedFunctionComSendImplementation)theEObject;
				T result = caseTrustedFunctionComSendImplementation(trustedFunctionComSendImplementation);
				if (result == null) result = caseComSendImplementation(trustedFunctionComSendImplementation);
				if (result == null) result = caseSendImplementation(trustedFunctionComSendImplementation);
				if (result == null) result = caseInteractionReferrable(trustedFunctionComSendImplementation);
				if (result == null) result = caseInteractionObject(trustedFunctionComSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION: {
				PeriodicProxyComSendImplementation periodicProxyComSendImplementation = (PeriodicProxyComSendImplementation)theEObject;
				T result = casePeriodicProxyComSendImplementation(periodicProxyComSendImplementation);
				if (result == null) result = caseProxyComSendImplementation(periodicProxyComSendImplementation);
				if (result == null) result = caseComSendImplementation(periodicProxyComSendImplementation);
				if (result == null) result = caseSendImplementation(periodicProxyComSendImplementation);
				if (result == null) result = caseInteractionReferrable(periodicProxyComSendImplementation);
				if (result == null) result = caseInteractionObject(periodicProxyComSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION: {
				ImmediateProxyComSendImplementation immediateProxyComSendImplementation = (ImmediateProxyComSendImplementation)theEObject;
				T result = caseImmediateProxyComSendImplementation(immediateProxyComSendImplementation);
				if (result == null) result = caseProxyComSendImplementation(immediateProxyComSendImplementation);
				if (result == null) result = caseComSendImplementation(immediateProxyComSendImplementation);
				if (result == null) result = caseSendImplementation(immediateProxyComSendImplementation);
				if (result == null) result = caseInteractionReferrable(immediateProxyComSendImplementation);
				if (result == null) result = caseInteractionObject(immediateProxyComSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.FILTER_BUFFER_IMPLEMENTATION: {
				FilterBufferImplementation filterBufferImplementation = (FilterBufferImplementation)theEObject;
				T result = caseFilterBufferImplementation(filterBufferImplementation);
				if (result == null) result = caseVariableImplementation(filterBufferImplementation);
				if (result == null) result = caseInteractionReferrable(filterBufferImplementation);
				if (result == null) result = caseInteractionObject(filterBufferImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.IOC_VALUE_BUFFER_IMPLEMENTATION: {
				IocValueBufferImplementation iocValueBufferImplementation = (IocValueBufferImplementation)theEObject;
				T result = caseIocValueBufferImplementation(iocValueBufferImplementation);
				if (result == null) result = caseValueBufferImplementation(iocValueBufferImplementation);
				if (result == null) result = caseVariableImplementation(iocValueBufferImplementation);
				if (result == null) result = caseInteractionReferrable(iocValueBufferImplementation);
				if (result == null) result = caseInteractionObject(iocValueBufferImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.COM_VALUE_BUFFER_IMPLEMENTATION: {
				ComValueBufferImplementation comValueBufferImplementation = (ComValueBufferImplementation)theEObject;
				T result = caseComValueBufferImplementation(comValueBufferImplementation);
				if (result == null) result = caseValueBufferImplementation(comValueBufferImplementation);
				if (result == null) result = caseVariableImplementation(comValueBufferImplementation);
				if (result == null) result = caseInteractionReferrable(comValueBufferImplementation);
				if (result == null) result = caseInteractionObject(comValueBufferImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.VARIABLE_IMPLEMENTATION: {
				VariableImplementation variableImplementation = (VariableImplementation)theEObject;
				T result = caseVariableImplementation(variableImplementation);
				if (result == null) result = caseInteractionReferrable(variableImplementation);
				if (result == null) result = caseInteractionObject(variableImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.INTERACTION_END: {
				InteractionEnd interactionEnd = (InteractionEnd)theEObject;
				T result = caseInteractionEnd(interactionEnd);
				if (result == null) result = caseInteractionReferrable(interactionEnd);
				if (result == null) result = caseInteractionObject(interactionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.COM_SEND_IMPLEMENTATION: {
				ComSendImplementation comSendImplementation = (ComSendImplementation)theEObject;
				T result = caseComSendImplementation(comSendImplementation);
				if (result == null) result = caseSendImplementation(comSendImplementation);
				if (result == null) result = caseInteractionReferrable(comSendImplementation);
				if (result == null) result = caseInteractionObject(comSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.INTERACTION_ROOT: {
				InteractionRoot interactionRoot = (InteractionRoot)theEObject;
				T result = caseInteractionRoot(interactionRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION: {
				TrustedFunctionRteSendImplementation trustedFunctionRteSendImplementation = (TrustedFunctionRteSendImplementation)theEObject;
				T result = caseTrustedFunctionRteSendImplementation(trustedFunctionRteSendImplementation);
				if (result == null) result = caseSendImplementation(trustedFunctionRteSendImplementation);
				if (result == null) result = caseInteractionReferrable(trustedFunctionRteSendImplementation);
				if (result == null) result = caseInteractionObject(trustedFunctionRteSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.PROXY_COM_SEND_IMPLEMENTATION: {
				ProxyComSendImplementation proxyComSendImplementation = (ProxyComSendImplementation)theEObject;
				T result = caseProxyComSendImplementation(proxyComSendImplementation);
				if (result == null) result = caseComSendImplementation(proxyComSendImplementation);
				if (result == null) result = caseSendImplementation(proxyComSendImplementation);
				if (result == null) result = caseInteractionReferrable(proxyComSendImplementation);
				if (result == null) result = caseInteractionObject(proxyComSendImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.COM_SEND_PROXY_INTERACTION: {
				ComSendProxyInteraction comSendProxyInteraction = (ComSendProxyInteraction)theEObject;
				T result = caseComSendProxyInteraction(comSendProxyInteraction);
				if (result == null) result = caseInteraction(comSendProxyInteraction);
				if (result == null) result = caseInteractionReferrable(comSendProxyInteraction);
				if (result == null) result = caseInteractionObject(comSendProxyInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.COM_SEND_PROXY: {
				ComSendProxy comSendProxy = (ComSendProxy)theEObject;
				T result = caseComSendProxy(comSendProxy);
				if (result == null) result = caseInteractionEnd(comSendProxy);
				if (result == null) result = caseInteractionReferrable(comSendProxy);
				if (result == null) result = caseInteractionObject(comSendProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.PERIODIC_COM_SEND_PROXY: {
				PeriodicComSendProxy periodicComSendProxy = (PeriodicComSendProxy)theEObject;
				T result = casePeriodicComSendProxy(periodicComSendProxy);
				if (result == null) result = caseComSendProxy(periodicComSendProxy);
				if (result == null) result = caseInteractionEnd(periodicComSendProxy);
				if (result == null) result = caseInteractionReferrable(periodicComSendProxy);
				if (result == null) result = caseInteractionObject(periodicComSendProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.IMMEDIATE_COM_SEND_PROXY: {
				ImmediateComSendProxy immediateComSendProxy = (ImmediateComSendProxy)theEObject;
				T result = caseImmediateComSendProxy(immediateComSendProxy);
				if (result == null) result = caseComSendProxy(immediateComSendProxy);
				if (result == null) result = caseInteractionEnd(immediateComSendProxy);
				if (result == null) result = caseInteractionReferrable(immediateComSendProxy);
				if (result == null) result = caseInteractionObject(immediateComSendProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseInteractionReferrable(interaction);
				if (result == null) result = caseInteractionObject(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.ENTITY_STARTER: {
				EntityStarter entityStarter = (EntityStarter)theEObject;
				T result = caseEntityStarter(entityStarter);
				if (result == null) result = caseInteractionEnd(entityStarter);
				if (result == null) result = caseInteractionReferrable(entityStarter);
				if (result == null) result = caseInteractionObject(entityStarter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.OS_TASK_ACTIVATE_ENTITY_STARTER: {
				OsTaskActivateEntityStarter osTaskActivateEntityStarter = (OsTaskActivateEntityStarter)theEObject;
				T result = caseOsTaskActivateEntityStarter(osTaskActivateEntityStarter);
				if (result == null) result = caseEntityStarter(osTaskActivateEntityStarter);
				if (result == null) result = caseInteractionEnd(osTaskActivateEntityStarter);
				if (result == null) result = caseInteractionReferrable(osTaskActivateEntityStarter);
				if (result == null) result = caseInteractionObject(osTaskActivateEntityStarter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.OS_EVENT_SET_ENTITY_STARTER: {
				OsEventSetEntityStarter osEventSetEntityStarter = (OsEventSetEntityStarter)theEObject;
				T result = caseOsEventSetEntityStarter(osEventSetEntityStarter);
				if (result == null) result = caseEntityStarter(osEventSetEntityStarter);
				if (result == null) result = caseInteractionEnd(osEventSetEntityStarter);
				if (result == null) result = caseInteractionReferrable(osEventSetEntityStarter);
				if (result == null) result = caseInteractionObject(osEventSetEntityStarter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.ENTITY_START_INTERACTION: {
				EntityStartInteraction entityStartInteraction = (EntityStartInteraction)theEObject;
				T result = caseEntityStartInteraction(entityStartInteraction);
				if (result == null) result = caseInteraction(entityStartInteraction);
				if (result == null) result = caseInteractionReferrable(entityStartInteraction);
				if (result == null) result = caseInteractionObject(entityStartInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.ENTITY_START_IMPLEMENTATION: {
				EntityStartImplementation entityStartImplementation = (EntityStartImplementation)theEObject;
				T result = caseEntityStartImplementation(entityStartImplementation);
				if (result == null) result = caseInteractionObject(entityStartImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION: {
				TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation)theEObject;
				T result = caseTimingTriggeringEntityStartImplementation(timingTriggeringEntityStartImplementation);
				if (result == null) result = caseEntityStartImplementation(timingTriggeringEntityStartImplementation);
				if (result == null) result = caseInteractionObject(timingTriggeringEntityStartImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.RUNNABLE_ENTITY_START_INTERACTION: {
				RunnableEntityStartInteraction runnableEntityStartInteraction = (RunnableEntityStartInteraction)theEObject;
				T result = caseRunnableEntityStartInteraction(runnableEntityStartInteraction);
				if (result == null) result = caseEntityStartInteraction(runnableEntityStartInteraction);
				if (result == null) result = caseInteraction(runnableEntityStartInteraction);
				if (result == null) result = caseInteractionReferrable(runnableEntityStartInteraction);
				if (result == null) result = caseInteractionObject(runnableEntityStartInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION: {
				StartOffsetCounterImplementation startOffsetCounterImplementation = (StartOffsetCounterImplementation)theEObject;
				T result = caseStartOffsetCounterImplementation(startOffsetCounterImplementation);
				if (result == null) result = caseVariableImplementation(startOffsetCounterImplementation);
				if (result == null) result = caseInteractionReferrable(startOffsetCounterImplementation);
				if (result == null) result = caseInteractionObject(startOffsetCounterImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION: {
				CycleCounterImplementation cycleCounterImplementation = (CycleCounterImplementation)theEObject;
				T result = caseCycleCounterImplementation(cycleCounterImplementation);
				if (result == null) result = caseVariableImplementation(cycleCounterImplementation);
				if (result == null) result = caseInteractionReferrable(cycleCounterImplementation);
				if (result == null) result = caseInteractionObject(cycleCounterImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.GENERATED_ECU_CONFIGURATION: {
				GeneratedEcuConfiguration generatedEcuConfiguration = (GeneratedEcuConfiguration)theEObject;
				T result = caseGeneratedEcuConfiguration(generatedEcuConfiguration);
				if (result == null) result = caseInteractionObject(generatedEcuConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.BSW_SCHEDULABLE_ENTITY_START_INTERACTION: {
				BswSchedulableEntityStartInteraction bswSchedulableEntityStartInteraction = (BswSchedulableEntityStartInteraction)theEObject;
				T result = caseBswSchedulableEntityStartInteraction(bswSchedulableEntityStartInteraction);
				if (result == null) result = caseEntityStartInteraction(bswSchedulableEntityStartInteraction);
				if (result == null) result = caseInteraction(bswSchedulableEntityStartInteraction);
				if (result == null) result = caseInteractionReferrable(bswSchedulableEntityStartInteraction);
				if (result == null) result = caseInteractionObject(bswSchedulableEntityStartInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.EVENT_TO_TASK_MAPPING: {
				EventToTaskMapping eventToTaskMapping = (EventToTaskMapping)theEObject;
				T result = caseEventToTaskMapping(eventToTaskMapping);
				if (result == null) result = caseInteractionObject(eventToTaskMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseInteractionObject(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionPackage.TIMING_EVENT: {
				TimingEvent timingEvent = (TimingEvent)theEObject;
				T result = caseTimingEvent(timingEvent);
				if (result == null) result = caseEvent(timingEvent);
				if (result == null) result = caseInteractionObject(timingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionObject(InteractionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionReferrable(InteractionReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSender(Sender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Ecu Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Ecu Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEcuSender(InternalEcuSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Ecu Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Ecu Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEcuSender(ExternalEcuSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendInteraction(SendInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveInteraction(ReceiveInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiver(Receiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Ecu Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Ecu Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEcuReceiver(InternalEcuReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Buffer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueBufferImplementation(ValueBufferImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Value Buffer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteValueBufferImplementation(RteValueBufferImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Ecu Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Ecu Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEcuReceiver(ExternalEcuReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendImplementation(SendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rte Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rte Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRteSendImplementation(RteSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocSendImplementation(IocSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Com Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectComSendImplementation(DirectComSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Com Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionComSendImplementation(TrustedFunctionComSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Proxy Com Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicProxyComSendImplementation(PeriodicProxyComSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Proxy Com Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateProxyComSendImplementation(ImmediateProxyComSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Buffer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterBufferImplementation(FilterBufferImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Value Buffer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocValueBufferImplementation(IocValueBufferImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Value Buffer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Value Buffer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComValueBufferImplementation(ComValueBufferImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableImplementation(VariableImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionEnd(InteractionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendImplementation(ComSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionRoot(InteractionRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted Function Rte Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted Function Rte Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedFunctionRteSendImplementation(TrustedFunctionRteSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Com Send Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Com Send Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyComSendImplementation(ProxyComSendImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Proxy Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Proxy Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendProxyInteraction(ComSendProxyInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Send Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComSendProxy(ComSendProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Com Send Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicComSendProxy(PeriodicComSendProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Com Send Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Com Send Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateComSendProxy(ImmediateComSendProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Starter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStarter(EntityStarter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Task Activate Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Task Activate Entity Starter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsTaskActivateEntityStarter(OsTaskActivateEntityStarter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Event Set Entity Starter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Event Set Entity Starter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsEventSetEntityStarter(OsEventSetEntityStarter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Start Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStartInteraction(EntityStartInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Start Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Start Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStartImplementation(EntityStartImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Triggering Entity Start Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Triggering Entity Start Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingTriggeringEntityStartImplementation(TimingTriggeringEntityStartImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Entity Start Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableEntityStartInteraction(RunnableEntityStartInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Offset Counter Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Offset Counter Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOffsetCounterImplementation(StartOffsetCounterImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cycle Counter Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cycle Counter Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCycleCounterImplementation(CycleCounterImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generated Ecu Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generated Ecu Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratedEcuConfiguration(GeneratedEcuConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bsw Schedulable Entity Start Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBswSchedulableEntityStartInteraction(BswSchedulableEntityStartInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event To Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event To Task Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventToTaskMapping(EventToTaskMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingEvent(TimingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InteractionSwitch
