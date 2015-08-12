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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMap;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMapImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.DataTypeMapImpl#getApplicationDataType <em>Application Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeMapImpl extends M2ObjectImpl implements DataTypeMap {
	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType implementationDataType;

	/**
	 * The cached value of the '{@link #getApplicationDataType() <em>Application Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDataType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDataType applicationDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.DATA_TYPE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType() {
		if (implementationDataType != null && ((EObject)implementationDataType).eIsProxy()) {
			InternalEObject oldImplementationDataType = (InternalEObject)implementationDataType;
			implementationDataType = (ImplementationDataType)eResolveProxy(oldImplementationDataType);
			if (implementationDataType != oldImplementationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
			}
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetImplementationDataType() {
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDataType(ImplementationDataType newImplementationDataType) {
		ImplementationDataType oldImplementationDataType = implementationDataType;
		implementationDataType = newImplementationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataType getApplicationDataType() {
		if (applicationDataType != null && ((EObject)applicationDataType).eIsProxy()) {
			InternalEObject oldApplicationDataType = (InternalEObject)applicationDataType;
			applicationDataType = (ApplicationDataType)eResolveProxy(oldApplicationDataType);
			if (applicationDataType != oldApplicationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.DATA_TYPE_MAP__APPLICATION_DATA_TYPE, oldApplicationDataType, applicationDataType));
			}
		}
		return applicationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataType basicGetApplicationDataType() {
		return applicationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationDataType(ApplicationDataType newApplicationDataType) {
		ApplicationDataType oldApplicationDataType = applicationDataType;
		applicationDataType = newApplicationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.DATA_TYPE_MAP__APPLICATION_DATA_TYPE, oldApplicationDataType, applicationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE:
				if (resolve) return getImplementationDataType();
				return basicGetImplementationDataType();
			case M2Package.DATA_TYPE_MAP__APPLICATION_DATA_TYPE:
				if (resolve) return getApplicationDataType();
				return basicGetApplicationDataType();
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
			case M2Package.DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((ImplementationDataType)newValue);
				return;
			case M2Package.DATA_TYPE_MAP__APPLICATION_DATA_TYPE:
				setApplicationDataType((ApplicationDataType)newValue);
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
			case M2Package.DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((ImplementationDataType)null);
				return;
			case M2Package.DATA_TYPE_MAP__APPLICATION_DATA_TYPE:
				setApplicationDataType((ApplicationDataType)null);
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
			case M2Package.DATA_TYPE_MAP__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null;
			case M2Package.DATA_TYPE_MAP__APPLICATION_DATA_TYPE:
				return applicationDataType != null;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeMapImpl
