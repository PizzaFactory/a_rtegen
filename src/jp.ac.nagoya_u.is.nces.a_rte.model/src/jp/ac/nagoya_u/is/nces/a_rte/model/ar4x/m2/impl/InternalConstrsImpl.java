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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalConstrs;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Limit;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Constrs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InternalConstrsImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.InternalConstrsImpl#getUpperLimit <em>Upper Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalConstrsImpl extends M2ObjectImpl implements InternalConstrs {
	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected Limit lowerLimit;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected Limit upperLimit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalConstrsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.INTERNAL_CONSTRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerLimit(Limit newLowerLimit, NotificationChain msgs) {
		Limit oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.INTERNAL_CONSTRS__LOWER_LIMIT, oldLowerLimit, newLowerLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(Limit newLowerLimit) {
		if (newLowerLimit != lowerLimit) {
			NotificationChain msgs = null;
			if (lowerLimit != null)
				msgs = ((InternalEObject)lowerLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.INTERNAL_CONSTRS__LOWER_LIMIT, null, msgs);
			if (newLowerLimit != null)
				msgs = ((InternalEObject)newLowerLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.INTERNAL_CONSTRS__LOWER_LIMIT, null, msgs);
			msgs = basicSetLowerLimit(newLowerLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.INTERNAL_CONSTRS__LOWER_LIMIT, newLowerLimit, newLowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperLimit(Limit newUpperLimit, NotificationChain msgs) {
		Limit oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.INTERNAL_CONSTRS__UPPER_LIMIT, oldUpperLimit, newUpperLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(Limit newUpperLimit) {
		if (newUpperLimit != upperLimit) {
			NotificationChain msgs = null;
			if (upperLimit != null)
				msgs = ((InternalEObject)upperLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.INTERNAL_CONSTRS__UPPER_LIMIT, null, msgs);
			if (newUpperLimit != null)
				msgs = ((InternalEObject)newUpperLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.INTERNAL_CONSTRS__UPPER_LIMIT, null, msgs);
			msgs = basicSetUpperLimit(newUpperLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.INTERNAL_CONSTRS__UPPER_LIMIT, newUpperLimit, newUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.INTERNAL_CONSTRS__LOWER_LIMIT:
				return basicSetLowerLimit(null, msgs);
			case M2Package.INTERNAL_CONSTRS__UPPER_LIMIT:
				return basicSetUpperLimit(null, msgs);
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
			case M2Package.INTERNAL_CONSTRS__LOWER_LIMIT:
				return getLowerLimit();
			case M2Package.INTERNAL_CONSTRS__UPPER_LIMIT:
				return getUpperLimit();
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
			case M2Package.INTERNAL_CONSTRS__LOWER_LIMIT:
				setLowerLimit((Limit)newValue);
				return;
			case M2Package.INTERNAL_CONSTRS__UPPER_LIMIT:
				setUpperLimit((Limit)newValue);
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
			case M2Package.INTERNAL_CONSTRS__LOWER_LIMIT:
				setLowerLimit((Limit)null);
				return;
			case M2Package.INTERNAL_CONSTRS__UPPER_LIMIT:
				setUpperLimit((Limit)null);
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
			case M2Package.INTERNAL_CONSTRS__LOWER_LIMIT:
				return lowerLimit != null;
			case M2Package.INTERNAL_CONSTRS__UPPER_LIMIT:
				return upperLimit != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalConstrsImpl
