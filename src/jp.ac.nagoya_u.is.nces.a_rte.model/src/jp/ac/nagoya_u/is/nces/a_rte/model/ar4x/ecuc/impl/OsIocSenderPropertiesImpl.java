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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Ioc Sender Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl#getOsIocSendingOsApplication <em>Os Ioc Sending Os Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsIocSenderPropertiesImpl#getOsIocSenderId <em>Os Ioc Sender Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsIocSenderPropertiesImpl extends EcucContainerImpl implements OsIocSenderProperties {
	/**
	 * The cached value of the '{@link #getOsIocSendingOsApplication() <em>Os Ioc Sending Os Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocSendingOsApplication()
	 * @generated
	 * @ordered
	 */
	protected OsApplication osIocSendingOsApplication;

	/**
	 * The default value of the '{@link #getOsIocSenderId() <em>Os Ioc Sender Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocSenderId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_IOC_SENDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsIocSenderId() <em>Os Ioc Sender Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocSenderId()
	 * @generated
	 * @ordered
	 */
	protected Integer osIocSenderId = OS_IOC_SENDER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsIocSenderPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_IOC_SENDER_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsIocSenderId() {
		return osIocSenderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocSenderId(Integer newOsIocSenderId) {
		Integer oldOsIocSenderId = osIocSenderId;
		osIocSenderId = newOsIocSenderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID, oldOsIocSenderId, osIocSenderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplication getOsIocSendingOsApplication() {
		if (osIocSendingOsApplication != null && ((EObject)osIocSendingOsApplication).eIsProxy()) {
			InternalEObject oldOsIocSendingOsApplication = (InternalEObject)osIocSendingOsApplication;
			osIocSendingOsApplication = (OsApplication)eResolveProxy(oldOsIocSendingOsApplication);
			if (osIocSendingOsApplication != oldOsIocSendingOsApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION, oldOsIocSendingOsApplication, osIocSendingOsApplication));
			}
		}
		return osIocSendingOsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApplication basicGetOsIocSendingOsApplication() {
		return osIocSendingOsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocSendingOsApplication(OsApplication newOsIocSendingOsApplication) {
		OsApplication oldOsIocSendingOsApplication = osIocSendingOsApplication;
		osIocSendingOsApplication = newOsIocSendingOsApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION, oldOsIocSendingOsApplication, osIocSendingOsApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication getParent() {
		if (eContainerFeatureID() != EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT) return null;
		return (OsIocCommunication)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(OsIocCommunication newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(OsIocCommunication newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES, OsIocCommunication.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((OsIocCommunication)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				return eInternalContainer().eInverseRemove(this, EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES, OsIocCommunication.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION:
				if (resolve) return getOsIocSendingOsApplication();
				return basicGetOsIocSendingOsApplication();
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				return getParent();
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID:
				return getOsIocSenderId();
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
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION:
				setOsIocSendingOsApplication((OsApplication)newValue);
				return;
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				setParent((OsIocCommunication)newValue);
				return;
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID:
				setOsIocSenderId((Integer)newValue);
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
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION:
				setOsIocSendingOsApplication((OsApplication)null);
				return;
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				setParent((OsIocCommunication)null);
				return;
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID:
				setOsIocSenderId(OS_IOC_SENDER_ID_EDEFAULT);
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
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDING_OS_APPLICATION:
				return osIocSendingOsApplication != null;
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__PARENT:
				return getParent() != null;
			case EcucPackage.OS_IOC_SENDER_PROPERTIES__OS_IOC_SENDER_ID:
				return OS_IOC_SENDER_ID_EDEFAULT == null ? osIocSenderId != null : !OS_IOC_SENDER_ID_EDEFAULT.equals(osIocSenderId);
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
		result.append(" (osIocSenderId: ");
		result.append(osIocSenderId);
		result.append(')');
		return result.toString();
	}

} //OsIocSenderPropertiesImpl
