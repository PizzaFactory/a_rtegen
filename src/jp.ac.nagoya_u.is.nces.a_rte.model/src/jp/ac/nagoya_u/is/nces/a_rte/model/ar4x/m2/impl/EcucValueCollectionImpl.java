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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecuc Value Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucValueCollectionImpl#getEcucValue <em>Ecuc Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.EcucValueCollectionImpl#getEcuExtract <em>Ecu Extract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucValueCollectionImpl extends ArElementImpl implements EcucValueCollection {
	/**
	 * The cached value of the '{@link #getEcucValue() <em>Ecuc Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucValue()
	 * @generated
	 * @ordered
	 */
	protected EList<EcucModuleConfigurationValues> ecucValue;

	/**
	 * The cached value of the '{@link #getEcuExtract() <em>Ecu Extract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuExtract()
	 * @generated
	 * @ordered
	 */
	protected jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System ecuExtract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucValueCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ECUC_VALUE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcucModuleConfigurationValues> getEcucValue() {
		if (ecucValue == null) {
			ecucValue = new EObjectResolvingEList<EcucModuleConfigurationValues>(EcucModuleConfigurationValues.class, this, M2Package.ECUC_VALUE_COLLECTION__ECUC_VALUE);
		}
		return ecucValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System getEcuExtract() {
		if (ecuExtract != null && ((EObject)ecuExtract).eIsProxy()) {
			InternalEObject oldEcuExtract = (InternalEObject)ecuExtract;
			ecuExtract = (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System)eResolveProxy(oldEcuExtract);
			if (ecuExtract != oldEcuExtract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ECUC_VALUE_COLLECTION__ECU_EXTRACT, oldEcuExtract, ecuExtract));
			}
		}
		return ecuExtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System basicGetEcuExtract() {
		return ecuExtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcuExtract(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System newEcuExtract) {
		jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System oldEcuExtract = ecuExtract;
		ecuExtract = newEcuExtract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ECUC_VALUE_COLLECTION__ECU_EXTRACT, oldEcuExtract, ecuExtract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.ECUC_VALUE_COLLECTION__ECUC_VALUE:
				return getEcucValue();
			case M2Package.ECUC_VALUE_COLLECTION__ECU_EXTRACT:
				if (resolve) return getEcuExtract();
				return basicGetEcuExtract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M2Package.ECUC_VALUE_COLLECTION__ECUC_VALUE:
				getEcucValue().clear();
				getEcucValue().addAll((Collection<? extends EcucModuleConfigurationValues>)newValue);
				return;
			case M2Package.ECUC_VALUE_COLLECTION__ECU_EXTRACT:
				setEcuExtract((jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System)newValue);
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
			case M2Package.ECUC_VALUE_COLLECTION__ECUC_VALUE:
				getEcucValue().clear();
				return;
			case M2Package.ECUC_VALUE_COLLECTION__ECU_EXTRACT:
				setEcuExtract((jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System)null);
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
			case M2Package.ECUC_VALUE_COLLECTION__ECUC_VALUE:
				return ecucValue != null && !ecucValue.isEmpty();
			case M2Package.ECUC_VALUE_COLLECTION__ECU_EXTRACT:
				return ecuExtract != null;
		}
		return super.eIsSet(featureID);
	}

} //EcucValueCollectionImpl
