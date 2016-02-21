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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplMechanismEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
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
 * An implementation of the model object '<em><b>Rte Exclusive Area Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl#getRteExclusiveAreaImplMechanism <em>Rte Exclusive Area Impl Mechanism</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl#getRteExclusiveArea <em>Rte Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl#getRteExclusiveAreaOsResource <em>Rte Exclusive Area Os Resource</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteExclusiveAreaImplementationImpl#getRteExclusiveAreaOsSpinlock <em>Rte Exclusive Area Os Spinlock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteExclusiveAreaImplementationImpl extends EcucContainerImpl implements RteExclusiveAreaImplementation {
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
	 * The cached value of the '{@link #getRteExclusiveArea() <em>Rte Exclusive Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected ExclusiveArea rteExclusiveArea;

	/**
	 * The cached value of the '{@link #getRteExclusiveAreaOsResource() <em>Rte Exclusive Area Os Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaOsResource()
	 * @generated
	 * @ordered
	 */
	protected OsResource rteExclusiveAreaOsResource;

	/**
	 * The cached value of the '{@link #getRteExclusiveAreaOsSpinlock() <em>Rte Exclusive Area Os Spinlock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaOsSpinlock()
	 * @generated
	 * @ordered
	 */
	protected OsSpinlock rteExclusiveAreaOsSpinlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteExclusiveAreaImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_EXCLUSIVE_AREA_IMPLEMENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM, oldRteExclusiveAreaImplMechanism, rteExclusiveAreaImplMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea getRteExclusiveArea() {
		if (rteExclusiveArea != null && ((EObject)rteExclusiveArea).eIsProxy()) {
			InternalEObject oldRteExclusiveArea = (InternalEObject)rteExclusiveArea;
			rteExclusiveArea = (ExclusiveArea)eResolveProxy(oldRteExclusiveArea);
			if (rteExclusiveArea != oldRteExclusiveArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA, oldRteExclusiveArea, rteExclusiveArea));
			}
		}
		return rteExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveArea basicGetRteExclusiveArea() {
		return rteExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteExclusiveArea(ExclusiveArea newRteExclusiveArea, NotificationChain msgs) {
		ExclusiveArea oldRteExclusiveArea = rteExclusiveArea;
		rteExclusiveArea = newRteExclusiveArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA, oldRteExclusiveArea, newRteExclusiveArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExclusiveArea(ExclusiveArea newRteExclusiveArea) {
		if (newRteExclusiveArea != rteExclusiveArea) {
			NotificationChain msgs = null;
			if (rteExclusiveArea != null)
				msgs = ((InternalEObject)rteExclusiveArea).eInverseRemove(this, M2Package.EXCLUSIVE_AREA__SWC_CONFIG, ExclusiveArea.class, msgs);
			if (newRteExclusiveArea != null)
				msgs = ((InternalEObject)newRteExclusiveArea).eInverseAdd(this, M2Package.EXCLUSIVE_AREA__SWC_CONFIG, ExclusiveArea.class, msgs);
			msgs = basicSetRteExclusiveArea(newRteExclusiveArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA, newRteExclusiveArea, newRteExclusiveArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource getRteExclusiveAreaOsResource() {
		if (rteExclusiveAreaOsResource != null && ((EObject)rteExclusiveAreaOsResource).eIsProxy()) {
			InternalEObject oldRteExclusiveAreaOsResource = (InternalEObject)rteExclusiveAreaOsResource;
			rteExclusiveAreaOsResource = (OsResource)eResolveProxy(oldRteExclusiveAreaOsResource);
			if (rteExclusiveAreaOsResource != oldRteExclusiveAreaOsResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE, oldRteExclusiveAreaOsResource, rteExclusiveAreaOsResource));
			}
		}
		return rteExclusiveAreaOsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsResource basicGetRteExclusiveAreaOsResource() {
		return rteExclusiveAreaOsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExclusiveAreaOsResource(OsResource newRteExclusiveAreaOsResource) {
		OsResource oldRteExclusiveAreaOsResource = rteExclusiveAreaOsResource;
		rteExclusiveAreaOsResource = newRteExclusiveAreaOsResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE, oldRteExclusiveAreaOsResource, rteExclusiveAreaOsResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock getRteExclusiveAreaOsSpinlock() {
		if (rteExclusiveAreaOsSpinlock != null && ((EObject)rteExclusiveAreaOsSpinlock).eIsProxy()) {
			InternalEObject oldRteExclusiveAreaOsSpinlock = (InternalEObject)rteExclusiveAreaOsSpinlock;
			rteExclusiveAreaOsSpinlock = (OsSpinlock)eResolveProxy(oldRteExclusiveAreaOsSpinlock);
			if (rteExclusiveAreaOsSpinlock != oldRteExclusiveAreaOsSpinlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK, oldRteExclusiveAreaOsSpinlock, rteExclusiveAreaOsSpinlock));
			}
		}
		return rteExclusiveAreaOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlock basicGetRteExclusiveAreaOsSpinlock() {
		return rteExclusiveAreaOsSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteExclusiveAreaOsSpinlock(OsSpinlock newRteExclusiveAreaOsSpinlock) {
		OsSpinlock oldRteExclusiveAreaOsSpinlock = rteExclusiveAreaOsSpinlock;
		rteExclusiveAreaOsSpinlock = newRteExclusiveAreaOsSpinlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK, oldRteExclusiveAreaOsSpinlock, rteExclusiveAreaOsSpinlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA:
				if (rteExclusiveArea != null)
					msgs = ((InternalEObject)rteExclusiveArea).eInverseRemove(this, M2Package.EXCLUSIVE_AREA__SWC_CONFIG, ExclusiveArea.class, msgs);
				return basicSetRteExclusiveArea((ExclusiveArea)otherEnd, msgs);
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
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA:
				return basicSetRteExclusiveArea(null, msgs);
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
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				return getRteExclusiveAreaImplMechanism();
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA:
				if (resolve) return getRteExclusiveArea();
				return basicGetRteExclusiveArea();
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE:
				if (resolve) return getRteExclusiveAreaOsResource();
				return basicGetRteExclusiveAreaOsResource();
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK:
				if (resolve) return getRteExclusiveAreaOsSpinlock();
				return basicGetRteExclusiveAreaOsSpinlock();
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
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				setRteExclusiveAreaImplMechanism((RteExclusiveAreaImplMechanismEnum)newValue);
				return;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA:
				setRteExclusiveArea((ExclusiveArea)newValue);
				return;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE:
				setRteExclusiveAreaOsResource((OsResource)newValue);
				return;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK:
				setRteExclusiveAreaOsSpinlock((OsSpinlock)newValue);
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
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				setRteExclusiveAreaImplMechanism(RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT);
				return;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA:
				setRteExclusiveArea((ExclusiveArea)null);
				return;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE:
				setRteExclusiveAreaOsResource((OsResource)null);
				return;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK:
				setRteExclusiveAreaOsSpinlock((OsSpinlock)null);
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
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
				return rteExclusiveAreaImplMechanism != RTE_EXCLUSIVE_AREA_IMPL_MECHANISM_EDEFAULT;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA:
				return rteExclusiveArea != null;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_RESOURCE:
				return rteExclusiveAreaOsResource != null;
			case EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA_OS_SPINLOCK:
				return rteExclusiveAreaOsSpinlock != null;
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
		result.append(" (rteExclusiveAreaImplMechanism: "); //$NON-NLS-1$
		result.append(rteExclusiveAreaImplMechanism);
		result.append(')');
		return result.toString();
	}

} //RteExclusiveAreaImplementationImpl
