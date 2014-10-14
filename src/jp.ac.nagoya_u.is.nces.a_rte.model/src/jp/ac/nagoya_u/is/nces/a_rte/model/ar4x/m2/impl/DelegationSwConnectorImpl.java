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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInCompositionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Sw Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl#getInnerPort <em>Inner Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl#getOuterPort <em>Outer Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DelegationSwConnectorImpl#getInnerPortIref <em>Inner Port Iref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationSwConnectorImpl extends SwConnectorImpl implements DelegationSwConnector {
	/**
	 * The cached value of the '{@link #getInnerPort() <em>Inner Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPort()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceInComposition innerPort;

	/**
	 * The cached value of the '{@link #getOuterPort() <em>Outer Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterPort()
	 * @generated
	 * @ordered
	 */
	protected PortPrototype outerPort;

	/**
	 * The cached value of the '{@link #getInnerPortIref() <em>Inner Port Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPortIref()
	 * @generated
	 * @ordered
	 */
	protected PortInCompositionInstanceRef innerPortIref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationSwConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.DELEGATION_SW_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype getOuterPort() {
		if (outerPort != null && ((EObject)outerPort).eIsProxy()) {
			InternalEObject oldOuterPort = (InternalEObject)outerPort;
			outerPort = (PortPrototype)eResolveProxy(oldOuterPort);
			if (outerPort != oldOuterPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT, oldOuterPort, outerPort));
			}
		}
		return outerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype basicGetOuterPort() {
		return outerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterPort(PortPrototype newOuterPort) {
		PortPrototype oldOuterPort = outerPort;
		outerPort = newOuterPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT, oldOuterPort, outerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInCompositionInstanceRef getInnerPortIref() {
		return innerPortIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerPortIref(PortInCompositionInstanceRef newInnerPortIref, NotificationChain msgs) {
		PortInCompositionInstanceRef oldInnerPortIref = innerPortIref;
		innerPortIref = newInnerPortIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, oldInnerPortIref, newInnerPortIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPortIref(PortInCompositionInstanceRef newInnerPortIref) {
		if (newInnerPortIref != innerPortIref) {
			NotificationChain msgs = null;
			if (innerPortIref != null)
				msgs = ((InternalEObject)innerPortIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, null, msgs);
			if (newInnerPortIref != null)
				msgs = ((InternalEObject)newInnerPortIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, null, msgs);
			msgs = basicSetInnerPortIref(newInnerPortIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF, newInnerPortIref, newInnerPortIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				return basicSetInnerPortIref(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getInnerPort() {
		if (innerPort != null && ((EObject)innerPort).eIsProxy()) {
			InternalEObject oldInnerPort = (InternalEObject)innerPort;
			innerPort = (PortInstanceInComposition)eResolveProxy(oldInnerPort);
			if (innerPort != oldInnerPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT, oldInnerPort, innerPort));
			}
		}
		return innerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition basicGetInnerPort() {
		return innerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPort(PortInstanceInComposition newInnerPort) {
		PortInstanceInComposition oldInnerPort = innerPort;
		innerPort = newInnerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT, oldInnerPort, innerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				if (resolve) return getInnerPort();
				return basicGetInnerPort();
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				if (resolve) return getOuterPort();
				return basicGetOuterPort();
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				return getInnerPortIref();
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
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				setInnerPort((PortInstanceInComposition)newValue);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				setOuterPort((PortPrototype)newValue);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				setInnerPortIref((PortInCompositionInstanceRef)newValue);
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
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				setInnerPort((PortInstanceInComposition)null);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				setOuterPort((PortPrototype)null);
				return;
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				setInnerPortIref((PortInCompositionInstanceRef)null);
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
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT:
				return innerPort != null;
			case M2Package.DELEGATION_SW_CONNECTOR__OUTER_PORT:
				return outerPort != null;
			case M2Package.DELEGATION_SW_CONNECTOR__INNER_PORT_IREF:
				return innerPortIref != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationSwConnectorImpl
