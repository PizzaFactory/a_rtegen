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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Bsw Exclusive Area Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteBswExclusiveArea <em>Rte Bsw Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteBswExclusiveAreaOsResource <em>Rte Bsw Exclusive Area Os Resource</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswExclusiveAreaImplImpl#getRteBswExclusiveAreaOsSpinlock <em>Rte Bsw Exclusive Area Os Spinlock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBswExclusiveAreaImplImpl extends EcucContainerImpl implements RteBswExclusiveAreaImpl {
	/**
	 * The cached value of the '{@link #getRteBswExclusiveArea() <em>Rte Bsw Exclusive Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected ExclusiveArea rteBswExclusiveArea;

	/**
	 * The cached value of the '{@link #getRteBswExclusiveAreaOsResource() <em>Rte Bsw Exclusive Area Os Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveAreaOsResource()
	 * @generated
	 * @ordered
	 */
	protected OsResource rteBswExclusiveAreaOsResource;

	/**
	 * The default value of the '{@link #getRteExclusiveAreaImplMechanism() <em>Rte Exclusive Area Impl Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaImplMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final RteExclusiveAreaImplMechanismEnum RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT = RteExclusiveAreaImplMechanismEnum.ALL_INTERRUPT_BLOCKING;

	/**
	 * The cached value of the '{@link #getRteExclusiveAreaImplMechanism() <em>Rte Exclusive Area Impl Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaImplMechanism()
	 * @generated
	 * @ordered
	 */
	protected RteExclusiveAreaImplMechanismEnum rteExclusiveAreaImplMechanism = RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteBswExclusiveAreaOsSpinlock() <em>Rte Bsw Exclusive Area Os Spinlock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveAreaOsSpinlock()
	 * @generated
	 * @ordered
	 */
	protected OsSpinlock rteBswExclusiveAreaOsSpinlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBswExclusiveAreaImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_BSW_EXCLUSIVE_AREA_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea getRteBswExclusiveArea() {
		if (rteBswExclusiveArea != null && ((EObject)rteBswExclusiveArea).eIsProxy()) {
			InternalEObject oldRteBswExclusiveArea = (InternalEObject)rteBswExclusiveArea;
			rteBswExclusiveArea = (ExclusiveArea)eResolveProxy(oldRteBswExclusiveArea);
			if (rteBswExclusiveArea != oldRteBswExclusiveArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA, oldRteBswExclusiveArea, rteBswExclusiveArea));
			}
		}
		return rteBswExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea basicGetRteBswExclusiveArea() {
		return rteBswExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswExclusiveArea(ExclusiveArea newRteBswExclusiveArea, NotificationChain msgs) {
		ExclusiveArea oldRteBswExclusiveArea = rteBswExclusiveArea;
		rteBswExclusiveArea = newRteBswExclusiveArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA, oldRteBswExclusiveArea, newRteBswExclusiveArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswExclusiveArea(ExclusiveArea newRteBswExclusiveArea) {
		if (newRteBswExclusiveArea != rteBswExclusiveArea) {
			NotificationChain msgs = null;
			if (rteBswExclusiveArea != null)
				msgs = ((InternalEObject)rteBswExclusiveArea).eInverseRemove(this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, ExclusiveArea.class, msgs);
			if (newRteBswExclusiveArea != null)
				msgs = ((InternalEObject)newRteBswExclusiveArea).eInverseAdd(this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, ExclusiveArea.class, msgs);
			msgs = basicSetRteBswExclusiveArea(newRteBswExclusiveArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA, newRteBswExclusiveArea, newRteBswExclusiveArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteExclusiveAreaImplMechanismEnum getRteExclusiveAreaImplMechanism() {
		return rteExclusiveAreaImplMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExclusiveAreaImplMechanism(RteExclusiveAreaImplMechanismEnum newRteExclusiveAreaImplMechanism) {
		RteExclusiveAreaImplMechanismEnum oldRteExclusiveAreaImplMechanism = rteExclusiveAreaImplMechanism;
		rteExclusiveAreaImplMechanism = newRteExclusiveAreaImplMechanism == null ? RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT : newRteExclusiveAreaImplMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM, oldRteExclusiveAreaImplMechanism, rteExclusiveAreaImplMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock getRteBswExclusiveAreaOsSpinlock() {
		if (rteBswExclusiveAreaOsSpinlock != null && ((EObject)rteBswExclusiveAreaOsSpinlock).eIsProxy()) {
			InternalEObject oldRteBswExclusiveAreaOsSpinlock = (InternalEObject)rteBswExclusiveAreaOsSpinlock;
			rteBswExclusiveAreaOsSpinlock = (OsSpinlock)eResolveProxy(oldRteBswExclusiveAreaOsSpinlock);
			if (rteBswExclusiveAreaOsSpinlock != oldRteBswExclusiveAreaOsSpinlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK, oldRteBswExclusiveAreaOsSpinlock, rteBswExclusiveAreaOsSpinlock));
			}
		}
		return rteBswExclusiveAreaOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock basicGetRteBswExclusiveAreaOsSpinlock() {
		return rteBswExclusiveAreaOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswExclusiveAreaOsSpinlock(OsSpinlock newRteBswExclusiveAreaOsSpinlock) {
		OsSpinlock oldRteBswExclusiveAreaOsSpinlock = rteBswExclusiveAreaOsSpinlock;
		rteBswExclusiveAreaOsSpinlock = newRteBswExclusiveAreaOsSpinlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK, oldRteBswExclusiveAreaOsSpinlock, rteBswExclusiveAreaOsSpinlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource getRteBswExclusiveAreaOsResource() {
		if (rteBswExclusiveAreaOsResource != null && ((EObject)rteBswExclusiveAreaOsResource).eIsProxy()) {
			InternalEObject oldRteBswExclusiveAreaOsResource = (InternalEObject)rteBswExclusiveAreaOsResource;
			rteBswExclusiveAreaOsResource = (OsResource)eResolveProxy(oldRteBswExclusiveAreaOsResource);
			if (rteBswExclusiveAreaOsResource != oldRteBswExclusiveAreaOsResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE, oldRteBswExclusiveAreaOsResource, rteBswExclusiveAreaOsResource));
			}
		}
		return rteBswExclusiveAreaOsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource basicGetRteBswExclusiveAreaOsResource() {
		return rteBswExclusiveAreaOsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswExclusiveAreaOsResource(OsResource newRteBswExclusiveAreaOsResource) {
		OsResource oldRteBswExclusiveAreaOsResource = rteBswExclusiveAreaOsResource;
		rteBswExclusiveAreaOsResource = newRteBswExclusiveAreaOsResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE, oldRteBswExclusiveAreaOsResource, rteBswExclusiveAreaOsResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				if (rteBswExclusiveArea != null)
					msgs = ((InternalEObject)rteBswExclusiveArea).eInverseRemove(this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, ExclusiveArea.class, msgs);
				return basicSetRteBswExclusiveArea((ExclusiveArea)otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				return basicSetRteBswExclusiveArea(null, msgs);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				if (resolve) return getRteBswExclusiveArea();
				return basicGetRteBswExclusiveArea();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				if (resolve) return getRteBswExclusiveAreaOsResource();
				return basicGetRteBswExclusiveAreaOsResource();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				return getRteExclusiveAreaImplMechanism();
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				if (resolve) return getRteBswExclusiveAreaOsSpinlock();
				return basicGetRteBswExclusiveAreaOsSpinlock();
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				setRteBswExclusiveArea((ExclusiveArea)newValue);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				setRteBswExclusiveAreaOsResource((OsResource)newValue);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				setRteExclusiveAreaImplMechanism((RteExclusiveAreaImplMechanismEnum)newValue);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				setRteBswExclusiveAreaOsSpinlock((OsSpinlock)newValue);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				setRteBswExclusiveArea((ExclusiveArea)null);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				setRteBswExclusiveAreaOsResource((OsResource)null);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				setRteExclusiveAreaImplMechanism(RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT);
				return;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				setRteBswExclusiveAreaOsSpinlock((OsSpinlock)null);
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
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA:
				return rteBswExclusiveArea != null;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE:
				return rteBswExclusiveAreaOsResource != null;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				return rteExclusiveAreaImplMechanism != RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT;
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK:
				return rteBswExclusiveAreaOsSpinlock != null;
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
		result.append(" (rteExclusiveAreaImplMechanism: ");
		result.append(rteExclusiveAreaImplMechanism);
		result.append(')');
		return result.toString();
	}

} //RteBswExclusiveAreaImplImpl
