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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Proxy Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getRequesterPartition <em>Requester Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getSignalDataType <em>Signal Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getRequestOsIocCommunication <em>Request Os Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getValueOsIocCommunicationForComplexType <em>Value Os Ioc Communication For Complex Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendProxyInteractionImpl extends InteractionImpl implements ComSendProxyInteraction {
	/**
	 * The cached value of the '{@link #getRequesterPartition() <em>Requester Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterPartition()
	 * @generated
	 * @ordered
	 */
	protected EcucPartition requesterPartition;

	/**
	 * The cached value of the '{@link #getSignalDataType() <em>Signal Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType signalDataType;

	/**
	 * The cached value of the '{@link #getRequestOsIocCommunication() <em>Request Os Ioc Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOsIocCommunication()
	 * @generated
	 * @ordered
	 */
	protected OsIocCommunication requestOsIocCommunication;

	/**
	 * The cached value of the '{@link #getValueOsIocCommunicationForComplexType() <em>Value Os Ioc Communication For Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOsIocCommunicationForComplexType()
	 * @generated
	 * @ordered
	 */
	protected OsIocCommunication valueOsIocCommunicationForComplexType;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected ComSendProxy proxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendProxyInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition getRequesterPartition() {
		if (requesterPartition != null && ((EObject)requesterPartition).eIsProxy()) {
			InternalEObject oldRequesterPartition = (InternalEObject)requesterPartition;
			requesterPartition = (EcucPartition)eResolveProxy(oldRequesterPartition);
			if (requesterPartition != oldRequesterPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, oldRequesterPartition, requesterPartition));
			}
		}
		return requesterPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition basicGetRequesterPartition() {
		return requesterPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequesterPartition(EcucPartition newRequesterPartition) {
		EcucPartition oldRequesterPartition = requesterPartition;
		requesterPartition = newRequesterPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, oldRequesterPartition, requesterPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getSignalDataType() {
		if (signalDataType != null && ((EObject)signalDataType).eIsProxy()) {
			InternalEObject oldSignalDataType = (InternalEObject)signalDataType;
			signalDataType = (ImplementationDataType)eResolveProxy(oldSignalDataType);
			if (signalDataType != oldSignalDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, oldSignalDataType, signalDataType));
			}
		}
		return signalDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetSignalDataType() {
		return signalDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalDataType(ImplementationDataType newSignalDataType) {
		ImplementationDataType oldSignalDataType = signalDataType;
		signalDataType = newSignalDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, oldSignalDataType, signalDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication getRequestOsIocCommunication() {
		if (requestOsIocCommunication != null && ((EObject)requestOsIocCommunication).eIsProxy()) {
			InternalEObject oldRequestOsIocCommunication = (InternalEObject)requestOsIocCommunication;
			requestOsIocCommunication = (OsIocCommunication)eResolveProxy(oldRequestOsIocCommunication);
			if (requestOsIocCommunication != oldRequestOsIocCommunication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION, oldRequestOsIocCommunication, requestOsIocCommunication));
			}
		}
		return requestOsIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication basicGetRequestOsIocCommunication() {
		return requestOsIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOsIocCommunication(OsIocCommunication newRequestOsIocCommunication) {
		OsIocCommunication oldRequestOsIocCommunication = requestOsIocCommunication;
		requestOsIocCommunication = newRequestOsIocCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION, oldRequestOsIocCommunication, requestOsIocCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication getValueOsIocCommunicationForComplexType() {
		if (valueOsIocCommunicationForComplexType != null && ((EObject)valueOsIocCommunicationForComplexType).eIsProxy()) {
			InternalEObject oldValueOsIocCommunicationForComplexType = (InternalEObject)valueOsIocCommunicationForComplexType;
			valueOsIocCommunicationForComplexType = (OsIocCommunication)eResolveProxy(oldValueOsIocCommunicationForComplexType);
			if (valueOsIocCommunicationForComplexType != oldValueOsIocCommunicationForComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION_FOR_COMPLEX_TYPE, oldValueOsIocCommunicationForComplexType, valueOsIocCommunicationForComplexType));
			}
		}
		return valueOsIocCommunicationForComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication basicGetValueOsIocCommunicationForComplexType() {
		return valueOsIocCommunicationForComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOsIocCommunicationForComplexType(OsIocCommunication newValueOsIocCommunicationForComplexType) {
		OsIocCommunication oldValueOsIocCommunicationForComplexType = valueOsIocCommunicationForComplexType;
		valueOsIocCommunicationForComplexType = newValueOsIocCommunicationForComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION_FOR_COMPLEX_TYPE, oldValueOsIocCommunicationForComplexType, valueOsIocCommunicationForComplexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxy getProxy() {
		if (proxy != null && ((EObject)proxy).eIsProxy()) {
			InternalEObject oldProxy = (InternalEObject)proxy;
			proxy = (ComSendProxy)eResolveProxy(oldProxy);
			if (proxy != oldProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY, oldProxy, proxy));
			}
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxy basicGetProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxy(ComSendProxy newProxy, NotificationChain msgs) {
		ComSendProxy oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY, oldProxy, newProxy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(ComSendProxy newProxy) {
		if (newProxy != proxy) {
			NotificationChain msgs = null;
			if (proxy != null)
				msgs = ((InternalEObject)proxy).eInverseRemove(this, InteractionPackage.COM_SEND_PROXY__INTERACTION, ComSendProxy.class, msgs);
			if (newProxy != null)
				msgs = ((InternalEObject)newProxy).eInverseAdd(this, InteractionPackage.COM_SEND_PROXY__INTERACTION, ComSendProxy.class, msgs);
			msgs = basicSetProxy(newProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY, newProxy, newProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				if (proxy != null)
					msgs = ((InternalEObject)proxy).eInverseRemove(this, InteractionPackage.COM_SEND_PROXY__INTERACTION, ComSendProxy.class, msgs);
				return basicSetProxy((ComSendProxy)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				return basicSetProxy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				if (resolve) return getRequesterPartition();
				return basicGetRequesterPartition();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				if (resolve) return getSignalDataType();
				return basicGetSignalDataType();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION:
				if (resolve) return getRequestOsIocCommunication();
				return basicGetRequestOsIocCommunication();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION_FOR_COMPLEX_TYPE:
				if (resolve) return getValueOsIocCommunicationForComplexType();
				return basicGetValueOsIocCommunicationForComplexType();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				if (resolve) return getProxy();
				return basicGetProxy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				setRequesterPartition((EcucPartition)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				setSignalDataType((ImplementationDataType)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION:
				setRequestOsIocCommunication((OsIocCommunication)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION_FOR_COMPLEX_TYPE:
				setValueOsIocCommunicationForComplexType((OsIocCommunication)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				setProxy((ComSendProxy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				setRequesterPartition((EcucPartition)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				setSignalDataType((ImplementationDataType)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION:
				setRequestOsIocCommunication((OsIocCommunication)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION_FOR_COMPLEX_TYPE:
				setValueOsIocCommunicationForComplexType((OsIocCommunication)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				setProxy((ComSendProxy)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				return requesterPartition != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				return signalDataType != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUEST_OS_IOC_COMMUNICATION:
				return requestOsIocCommunication != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__VALUE_OS_IOC_COMMUNICATION_FOR_COMPLEX_TYPE:
				return valueOsIocCommunicationForComplexType != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				return proxy != null;
		}
		return super.eIsSet(featureID);
	}

} //ComSendProxyInteractionImpl
