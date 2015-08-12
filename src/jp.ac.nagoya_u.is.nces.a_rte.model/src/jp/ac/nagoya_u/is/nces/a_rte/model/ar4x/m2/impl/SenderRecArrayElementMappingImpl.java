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

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IndexedArrayElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Rec Array Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl#getIndexedArrayElement <em>Indexed Array Element</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl#getComplexTypeMapping <em>Complex Type Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SenderRecArrayElementMappingImpl#getSystemSignal <em>System Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderRecArrayElementMappingImpl extends ExtendedEObjectImpl implements SenderRecArrayElementMapping {
	/**
	 * The cached value of the '{@link #getIndexedArrayElement() <em>Indexed Array Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexedArrayElement()
	 * @generated
	 * @ordered
	 */
	protected IndexedArrayElement indexedArrayElement;

	/**
	 * The cached value of the '{@link #getComplexTypeMapping() <em>Complex Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected SenderRecCompositeTypeMapping complexTypeMapping;

	/**
	 * The cached value of the '{@link #getSystemSignal() <em>System Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemSignal()
	 * @generated
	 * @ordered
	 */
	protected SystemSignal systemSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderRecArrayElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SENDER_REC_ARRAY_ELEMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexedArrayElement getIndexedArrayElement() {
		return indexedArrayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexedArrayElement(IndexedArrayElement newIndexedArrayElement, NotificationChain msgs) {
		IndexedArrayElement oldIndexedArrayElement = indexedArrayElement;
		indexedArrayElement = newIndexedArrayElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT, oldIndexedArrayElement, newIndexedArrayElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexedArrayElement(IndexedArrayElement newIndexedArrayElement) {
		if (newIndexedArrayElement != indexedArrayElement) {
			NotificationChain msgs = null;
			if (indexedArrayElement != null)
				msgs = ((InternalEObject)indexedArrayElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT, null, msgs);
			if (newIndexedArrayElement != null)
				msgs = ((InternalEObject)newIndexedArrayElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT, null, msgs);
			msgs = basicSetIndexedArrayElement(newIndexedArrayElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT, newIndexedArrayElement, newIndexedArrayElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderRecCompositeTypeMapping getComplexTypeMapping() {
		return complexTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexTypeMapping(SenderRecCompositeTypeMapping newComplexTypeMapping, NotificationChain msgs) {
		SenderRecCompositeTypeMapping oldComplexTypeMapping = complexTypeMapping;
		complexTypeMapping = newComplexTypeMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, oldComplexTypeMapping, newComplexTypeMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexTypeMapping(SenderRecCompositeTypeMapping newComplexTypeMapping) {
		if (newComplexTypeMapping != complexTypeMapping) {
			NotificationChain msgs = null;
			if (complexTypeMapping != null)
				msgs = ((InternalEObject)complexTypeMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, null, msgs);
			if (newComplexTypeMapping != null)
				msgs = ((InternalEObject)newComplexTypeMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, null, msgs);
			msgs = basicSetComplexTypeMapping(newComplexTypeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING, newComplexTypeMapping, newComplexTypeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignal getSystemSignal() {
		if (systemSignal != null && ((EObject)systemSignal).eIsProxy()) {
			InternalEObject oldSystemSignal = (InternalEObject)systemSignal;
			systemSignal = (SystemSignal)eResolveProxy(oldSystemSignal);
			if (systemSignal != oldSystemSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL, oldSystemSignal, systemSignal));
			}
		}
		return systemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSignal basicGetSystemSignal() {
		return systemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemSignal(SystemSignal newSystemSignal) {
		SystemSignal oldSystemSignal = systemSignal;
		systemSignal = newSystemSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL, oldSystemSignal, systemSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT:
				return basicSetIndexedArrayElement(null, msgs);
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				return basicSetComplexTypeMapping(null, msgs);
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
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT:
				return getIndexedArrayElement();
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				return getComplexTypeMapping();
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				if (resolve) return getSystemSignal();
				return basicGetSystemSignal();
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
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT:
				setIndexedArrayElement((IndexedArrayElement)newValue);
				return;
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				setComplexTypeMapping((SenderRecCompositeTypeMapping)newValue);
				return;
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				setSystemSignal((SystemSignal)newValue);
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
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT:
				setIndexedArrayElement((IndexedArrayElement)null);
				return;
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				setComplexTypeMapping((SenderRecCompositeTypeMapping)null);
				return;
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				setSystemSignal((SystemSignal)null);
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
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__INDEXED_ARRAY_ELEMENT:
				return indexedArrayElement != null;
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__COMPLEX_TYPE_MAPPING:
				return complexTypeMapping != null;
			case M2Package.SENDER_REC_ARRAY_ELEMENT_MAPPING__SYSTEM_SIGNAL:
				return systemSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //SenderRecArrayElementMappingImpl
