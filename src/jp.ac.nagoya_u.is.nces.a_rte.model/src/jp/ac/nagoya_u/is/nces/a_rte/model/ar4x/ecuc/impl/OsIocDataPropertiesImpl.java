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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Ioc Data Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl#getOsIocDataPropertyIndex <em>Os Ioc Data Property Index</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl#getOsIocInitValue <em>Os Ioc Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocDataPropertiesImpl#getOsIocDataType <em>Os Ioc Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsIocDataPropertiesImpl extends EcucContainerImpl implements OsIocDataProperties {
	/**
	 * The default value of the '{@link #getOsIocDataPropertyIndex() <em>Os Ioc Data Property Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataPropertyIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsIocDataPropertyIndex() <em>Os Ioc Data Property Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataPropertyIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer osIocDataPropertyIndex = OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsIocInitValue() <em>Os Ioc Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_IOC_INIT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsIocInitValue() <em>Os Ioc Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocInitValue()
	 * @generated
	 * @ordered
	 */
	protected String osIocInitValue = OS_IOC_INIT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOsIocDataType() <em>Os Ioc Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType osIocDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsIocDataPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_IOC_DATA_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsIocDataPropertyIndex() {
		return osIocDataPropertyIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocDataPropertyIndex(Integer newOsIocDataPropertyIndex) {
		Integer oldOsIocDataPropertyIndex = osIocDataPropertyIndex;
		osIocDataPropertyIndex = newOsIocDataPropertyIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX, oldOsIocDataPropertyIndex, osIocDataPropertyIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsIocInitValue() {
		return osIocInitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocInitValue(String newOsIocInitValue) {
		String oldOsIocInitValue = osIocInitValue;
		osIocInitValue = newOsIocInitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE, oldOsIocInitValue, osIocInitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getOsIocDataType() {
		if (osIocDataType != null && ((EObject)osIocDataType).eIsProxy()) {
			InternalEObject oldOsIocDataType = (InternalEObject)osIocDataType;
			osIocDataType = (ImplementationDataType)eResolveProxy(oldOsIocDataType);
			if (osIocDataType != oldOsIocDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE, oldOsIocDataType, osIocDataType));
			}
		}
		return osIocDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetOsIocDataType() {
		return osIocDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocDataType(ImplementationDataType newOsIocDataType) {
		ImplementationDataType oldOsIocDataType = osIocDataType;
		osIocDataType = newOsIocDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE, oldOsIocDataType, osIocDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				return getOsIocDataPropertyIndex();
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				return getOsIocInitValue();
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				if (resolve) return getOsIocDataType();
				return basicGetOsIocDataType();
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
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				setOsIocDataPropertyIndex((Integer)newValue);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				setOsIocInitValue((String)newValue);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				setOsIocDataType((ImplementationDataType)newValue);
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
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				setOsIocDataPropertyIndex(OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				setOsIocInitValue(OS_IOC_INIT_VALUE_EDEFAULT);
				return;
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				setOsIocDataType((ImplementationDataType)null);
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
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_PROPERTY_INDEX:
				return OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT == null ? osIocDataPropertyIndex != null : !OS_IOC_DATA_PROPERTY_INDEX_EDEFAULT.equals(osIocDataPropertyIndex);
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_INIT_VALUE:
				return OS_IOC_INIT_VALUE_EDEFAULT == null ? osIocInitValue != null : !OS_IOC_INIT_VALUE_EDEFAULT.equals(osIocInitValue);
			case EcucPackage.OS_IOC_DATA_PROPERTIES__OS_IOC_DATA_TYPE:
				return osIocDataType != null;
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
		result.append(" (osIocDataPropertyIndex: ");
		result.append(osIocDataPropertyIndex);
		result.append(", osIocInitValue: ");
		result.append(osIocInitValue);
		result.append(')');
		return result.toString();
	}

} //OsIocDataPropertiesImpl
