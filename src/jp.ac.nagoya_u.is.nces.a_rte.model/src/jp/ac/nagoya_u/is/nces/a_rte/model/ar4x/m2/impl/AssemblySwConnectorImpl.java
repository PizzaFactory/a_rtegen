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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototypeInCompositionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototypeInCompositionInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Sw Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getProviderIref <em>Provider Iref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AssemblySwConnectorImpl#getRequesterIref <em>Requester Iref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblySwConnectorImpl extends SwConnectorImpl implements AssemblySwConnector {
	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceInComposition requester;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceInComposition provider;

	/**
	 * The cached value of the '{@link #getProviderIref() <em>Provider Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIref()
	 * @generated
	 * @ordered
	 */
	protected PPortPrototypeInCompositionInstanceRef providerIref;

	/**
	 * The cached value of the '{@link #getRequesterIref() <em>Requester Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterIref()
	 * @generated
	 * @ordered
	 */
	protected RPortPrototypeInCompositionInstanceRef requesterIref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblySwConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ASSEMBLY_SW_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getRequester() {
		if (requester != null && ((EObject)requester).eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (PortInstanceInComposition)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(PortInstanceInComposition newRequester) {
		PortInstanceInComposition oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER, oldRequester, requester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getProvider() {
		if (provider != null && ((EObject)provider).eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (PortInstanceInComposition)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(PortInstanceInComposition newProvider) {
		PortInstanceInComposition oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortPrototypeInCompositionInstanceRef getProviderIref() {
		return providerIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderIref(PPortPrototypeInCompositionInstanceRef newProviderIref, NotificationChain msgs) {
		PPortPrototypeInCompositionInstanceRef oldProviderIref = providerIref;
		providerIref = newProviderIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, oldProviderIref, newProviderIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderIref(PPortPrototypeInCompositionInstanceRef newProviderIref) {
		if (newProviderIref != providerIref) {
			NotificationChain msgs = null;
			if (providerIref != null)
				msgs = ((InternalEObject)providerIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, null, msgs);
			if (newProviderIref != null)
				msgs = ((InternalEObject)newProviderIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, null, msgs);
			msgs = basicSetProviderIref(newProviderIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF, newProviderIref, newProviderIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototypeInCompositionInstanceRef getRequesterIref() {
		return requesterIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequesterIref(RPortPrototypeInCompositionInstanceRef newRequesterIref, NotificationChain msgs) {
		RPortPrototypeInCompositionInstanceRef oldRequesterIref = requesterIref;
		requesterIref = newRequesterIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, oldRequesterIref, newRequesterIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequesterIref(RPortPrototypeInCompositionInstanceRef newRequesterIref) {
		if (newRequesterIref != requesterIref) {
			NotificationChain msgs = null;
			if (requesterIref != null)
				msgs = ((InternalEObject)requesterIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, null, msgs);
			if (newRequesterIref != null)
				msgs = ((InternalEObject)newRequesterIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, null, msgs);
			msgs = basicSetRequesterIref(newRequesterIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF, newRequesterIref, newRequesterIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				return basicSetProviderIref(null, msgs);
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				return basicSetRequesterIref(null, msgs);
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				return getProviderIref();
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				return getRequesterIref();
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				setRequester((PortInstanceInComposition)newValue);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				setProvider((PortInstanceInComposition)newValue);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				setProviderIref((PPortPrototypeInCompositionInstanceRef)newValue);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				setRequesterIref((RPortPrototypeInCompositionInstanceRef)newValue);
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				setRequester((PortInstanceInComposition)null);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				setProvider((PortInstanceInComposition)null);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				setProviderIref((PPortPrototypeInCompositionInstanceRef)null);
				return;
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				setRequesterIref((RPortPrototypeInCompositionInstanceRef)null);
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
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER:
				return requester != null;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER:
				return provider != null;
			case M2Package.ASSEMBLY_SW_CONNECTOR__PROVIDER_IREF:
				return providerIref != null;
			case M2Package.ASSEMBLY_SW_CONNECTOR__REQUESTER_IREF:
				return requesterIref != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblySwConnectorImpl
