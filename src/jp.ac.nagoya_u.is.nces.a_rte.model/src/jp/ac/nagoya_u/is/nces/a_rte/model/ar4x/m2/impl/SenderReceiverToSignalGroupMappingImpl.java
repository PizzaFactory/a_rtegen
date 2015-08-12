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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstance;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Receiver To Signal Group Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getDataElementIref <em>Data Element Iref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getDataElement <em>Data Element</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderReceiverToSignalGroupMappingImpl#getTypeMapping <em>Type Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderReceiverToSignalGroupMappingImpl extends DataMappingImpl implements SenderReceiverToSignalGroupMapping {
	/**
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected SystemSignalGroup signalGroup;

	/**
	 * The cached value of the '{@link #getDataElementIref() <em>Data Element Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElementIref()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototypeInSystemInstanceRef dataElementIref;

	/**
	 * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElement()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstance dataElement;

	/**
	 * The cached value of the '{@link #getTypeMapping() <em>Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected SenderRecCompositeTypeMapping typeMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverToSignalGroupMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignalGroup getSignalGroup() {
		if (signalGroup != null && ((EObject)signalGroup).eIsProxy()) {
			InternalEObject oldSignalGroup = (InternalEObject)signalGroup;
			signalGroup = (SystemSignalGroup)eResolveProxy(oldSignalGroup);
			if (signalGroup != oldSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, oldSignalGroup, signalGroup));
			}
		}
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignalGroup basicGetSignalGroup() {
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalGroup(SystemSignalGroup newSignalGroup) {
		SystemSignalGroup oldSignalGroup = signalGroup;
		signalGroup = newSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, oldSignalGroup, signalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototypeInSystemInstanceRef getDataElementIref() {
		return dataElementIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataElementIref(VariableDataPrototypeInSystemInstanceRef newDataElementIref, NotificationChain msgs) {
		VariableDataPrototypeInSystemInstanceRef oldDataElementIref = dataElementIref;
		dataElementIref = newDataElementIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, oldDataElementIref, newDataElementIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElementIref(VariableDataPrototypeInSystemInstanceRef newDataElementIref) {
		if (newDataElementIref != dataElementIref) {
			NotificationChain msgs = null;
			if (dataElementIref != null)
				msgs = ((InternalEObject)dataElementIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, null, msgs);
			if (newDataElementIref != null)
				msgs = ((InternalEObject)newDataElementIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, null, msgs);
			msgs = basicSetDataElementIref(newDataElementIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF, newDataElementIref, newDataElementIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstance getDataElement() {
		if (dataElement != null && ((EObject)dataElement).eIsProxy()) {
			InternalEObject oldDataElement = (InternalEObject)dataElement;
			dataElement = (VariableDataInstance)eResolveProxy(oldDataElement);
			if (dataElement != oldDataElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT, oldDataElement, dataElement));
			}
		}
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstance basicGetDataElement() {
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElement(VariableDataInstance newDataElement) {
		VariableDataInstance oldDataElement = dataElement;
		dataElement = newDataElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT, oldDataElement, dataElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRecCompositeTypeMapping getTypeMapping() {
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMapping(SenderRecCompositeTypeMapping newTypeMapping, NotificationChain msgs) {
		SenderRecCompositeTypeMapping oldTypeMapping = typeMapping;
		typeMapping = newTypeMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, oldTypeMapping, newTypeMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMapping(SenderRecCompositeTypeMapping newTypeMapping) {
		if (newTypeMapping != typeMapping) {
			NotificationChain msgs = null;
			if (typeMapping != null)
				msgs = ((InternalEObject)typeMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, null, msgs);
			if (newTypeMapping != null)
				msgs = ((InternalEObject)newTypeMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, null, msgs);
			msgs = basicSetTypeMapping(newTypeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING, newTypeMapping, newTypeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				return basicSetDataElementIref(null, msgs);
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				return basicSetTypeMapping(null, msgs);
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				if (resolve) return getSignalGroup();
				return basicGetSignalGroup();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				return getDataElementIref();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				if (resolve) return getDataElement();
				return basicGetDataElement();
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				return getTypeMapping();
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				setSignalGroup((SystemSignalGroup)newValue);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				setDataElementIref((VariableDataPrototypeInSystemInstanceRef)newValue);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				setDataElement((VariableDataInstance)newValue);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				setTypeMapping((SenderRecCompositeTypeMapping)newValue);
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				setSignalGroup((SystemSignalGroup)null);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				setDataElementIref((VariableDataPrototypeInSystemInstanceRef)null);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				setDataElement((VariableDataInstance)null);
				return;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				setTypeMapping((SenderRecCompositeTypeMapping)null);
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
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP:
				return signalGroup != null;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
				return dataElementIref != null;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT:
				return dataElement != null;
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
				return typeMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //SenderReceiverToSignalGroupMappingImpl
