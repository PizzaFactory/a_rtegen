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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Buffer Nonqueued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl#getAccessVariable <em>Access Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl#getFilterOperation <em>Filter Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBufferNonqueuedSendOperationImpl extends SendOperationImpl implements RteBufferNonqueuedSendOperation {
	/**
	 * The cached value of the '{@link #getAccessVariable() <em>Access Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessVariable()
	 * @generated
	 * @ordered
	 */
	protected RteBufferVariableSet accessVariable;

	/**
	 * The cached value of the '{@link #getFilterOperation() <em>Filter Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperation()
	 * @generated
	 * @ordered
	 */
	protected FilterOperation filterOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBufferNonqueuedSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_BUFFER_NONQUEUED_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferVariableSet getAccessVariable() {
		if (accessVariable != null && ((EObject)accessVariable).eIsProxy()) {
			InternalEObject oldAccessVariable = (InternalEObject)accessVariable;
			accessVariable = (RteBufferVariableSet)eResolveProxy(oldAccessVariable);
			if (accessVariable != oldAccessVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE, oldAccessVariable, accessVariable));
			}
		}
		return accessVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferVariableSet basicGetAccessVariable() {
		return accessVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessVariable(RteBufferVariableSet newAccessVariable) {
		RteBufferVariableSet oldAccessVariable = accessVariable;
		accessVariable = newAccessVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE, oldAccessVariable, accessVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperation getFilterOperation() {
		return filterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterOperation(FilterOperation newFilterOperation, NotificationChain msgs) {
		FilterOperation oldFilterOperation = filterOperation;
		filterOperation = newFilterOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, oldFilterOperation, newFilterOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOperation(FilterOperation newFilterOperation) {
		if (newFilterOperation != filterOperation) {
			NotificationChain msgs = null;
			if (filterOperation != null)
				msgs = ((InternalEObject)filterOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, null, msgs);
			if (newFilterOperation != null)
				msgs = ((InternalEObject)newFilterOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, null, msgs);
			msgs = basicSetFilterOperation(newFilterOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, newFilterOperation, newFilterOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				return basicSetFilterOperation(null, msgs);
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				if (resolve) return getAccessVariable();
				return basicGetAccessVariable();
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				return getFilterOperation();
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				setAccessVariable((RteBufferVariableSet)newValue);
				return;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				setFilterOperation((FilterOperation)newValue);
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				setAccessVariable((RteBufferVariableSet)null);
				return;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				setFilterOperation((FilterOperation)null);
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				return accessVariable != null;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				return filterOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //RteBufferNonqueuedSendOperationImpl
