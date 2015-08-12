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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.math.BigDecimal;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NonqueuedReceiverComSpec;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonqueued Receiver Com Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl#getAliveTimeout <em>Alive Timeout</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.NonqueuedReceiverComSpecImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonqueuedReceiverComSpecImpl extends ReceiverComSpecImpl implements NonqueuedReceiverComSpec {
	/**
	 * The default value of the '{@link #getAliveTimeout() <em>Alive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliveTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ALIVE_TIMEOUT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAliveTimeout() <em>Alive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliveTimeout()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal aliveTimeout = ALIVE_TIMEOUT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification initValue;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected DataFilter filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonqueuedReceiverComSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.NONQUEUED_RECEIVER_COM_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getAliveTimeout() {
		return aliveTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliveTimeout(BigDecimal newAliveTimeout) {
		BigDecimal oldAliveTimeout = aliveTimeout;
		aliveTimeout = newAliveTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT, oldAliveTimeout, aliveTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInitValue() {
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitValue(ValueSpecification newInitValue, NotificationChain msgs) {
		ValueSpecification oldInitValue = initValue;
		initValue = newInitValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE, oldInitValue, newInitValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValue(ValueSpecification newInitValue) {
		if (newInitValue != initValue) {
			NotificationChain msgs = null;
			if (initValue != null)
				msgs = ((InternalEObject)initValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE, null, msgs);
			if (newInitValue != null)
				msgs = ((InternalEObject)newInitValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE, null, msgs);
			msgs = basicSetInitValue(newInitValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE, newInitValue, newInitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFilter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(DataFilter newFilter, NotificationChain msgs) {
		DataFilter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(DataFilter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE:
				return basicSetInitValue(null, msgs);
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER:
				return basicSetFilter(null, msgs);
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
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT:
				return getAliveTimeout();
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE:
				return getInitValue();
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER:
				return getFilter();
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
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT:
				setAliveTimeout((BigDecimal)newValue);
				return;
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE:
				setInitValue((ValueSpecification)newValue);
				return;
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER:
				setFilter((DataFilter)newValue);
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
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT:
				setAliveTimeout(ALIVE_TIMEOUT_EDEFAULT);
				return;
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE:
				setInitValue((ValueSpecification)null);
				return;
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER:
				setFilter((DataFilter)null);
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
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__ALIVE_TIMEOUT:
				return ALIVE_TIMEOUT_EDEFAULT == null ? aliveTimeout != null : !ALIVE_TIMEOUT_EDEFAULT.equals(aliveTimeout);
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__INIT_VALUE:
				return initValue != null;
			case M2Package.NONQUEUED_RECEIVER_COM_SPEC__FILTER:
				return filter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aliveTimeout: ");
		result.append(aliveTimeout);
		result.append(')');
		return result.toString();
	}

} //NonqueuedReceiverComSpecImpl
