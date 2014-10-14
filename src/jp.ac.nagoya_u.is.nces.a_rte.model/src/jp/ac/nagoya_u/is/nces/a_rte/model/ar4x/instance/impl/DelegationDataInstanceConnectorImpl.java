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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Data Instance Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.DelegationDataInstanceConnectorImpl#getOuter <em>Outer</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.DelegationDataInstanceConnectorImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationDataInstanceConnectorImpl extends ExtendedEObjectImpl implements DelegationDataInstanceConnector {
	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInSwc outer;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInComposition inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationDataInstanceConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DELEGATION_DATA_INSTANCE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc getOuter() {
		if (outer != null && ((EObject)outer).eIsProxy()) {
			InternalEObject oldOuter = (InternalEObject)outer;
			outer = (VariableDataInstanceInSwc)eResolveProxy(oldOuter);
			if (outer != oldOuter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER, oldOuter, outer));
			}
		}
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc basicGetOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(VariableDataInstanceInSwc newOuter) {
		VariableDataInstanceInSwc oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER, oldOuter, outer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition getInner() {
		if (inner != null && ((EObject)inner).eIsProxy()) {
			InternalEObject oldInner = (InternalEObject)inner;
			inner = (VariableDataInstanceInComposition)eResolveProxy(oldInner);
			if (inner != oldInner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__INNER, oldInner, inner));
			}
		}
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInComposition basicGetInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(VariableDataInstanceInComposition newInner) {
		VariableDataInstanceInComposition oldInner = inner;
		inner = newInner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__INNER, oldInner, inner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER:
				if (resolve) return getOuter();
				return basicGetOuter();
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__INNER:
				if (resolve) return getInner();
				return basicGetInner();
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
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER:
				setOuter((VariableDataInstanceInSwc)newValue);
				return;
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__INNER:
				setInner((VariableDataInstanceInComposition)newValue);
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
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER:
				setOuter((VariableDataInstanceInSwc)null);
				return;
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__INNER:
				setInner((VariableDataInstanceInComposition)null);
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
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__OUTER:
				return outer != null;
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationDataInstanceConnectorImpl
