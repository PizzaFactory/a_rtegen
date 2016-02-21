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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlockLockMethodEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Spinlock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl#getOsSpinlockAccessingApplication <em>Os Spinlock Accessing Application</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.OsSpinlockImpl#getOsSpinlockLockMethod <em>Os Spinlock Lock Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsSpinlockImpl extends EcucContainerImpl implements OsSpinlock {
	/**
	 * The cached value of the '{@link #getOsSpinlockAccessingApplication() <em>Os Spinlock Accessing Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockAccessingApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> osSpinlockAccessingApplication;
	/**
	 * The default value of the '{@link #getOsSpinlockLockMethod() <em>Os Spinlock Lock Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockLockMethod()
	 * @generated
	 * @ordered
	 */
	protected static final OsSpinlockLockMethodEnum OS_SPINLOCK_LOCK_METHOD_EDEFAULT = OsSpinlockLockMethodEnum.LOCK_NOTHING;
	/**
	 * The cached value of the '{@link #getOsSpinlockLockMethod() <em>Os Spinlock Lock Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockLockMethod()
	 * @generated
	 * @ordered
	 */
	protected OsSpinlockLockMethodEnum osSpinlockLockMethod = OS_SPINLOCK_LOCK_METHOD_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsSpinlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.OS_SPINLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getOsSpinlockAccessingApplication() {
		if (osSpinlockAccessingApplication == null) {
			osSpinlockAccessingApplication = new EObjectResolvingEList<OsApplication>(OsApplication.class, this, EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION);
		}
		return osSpinlockAccessingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsSpinlockLockMethodEnum getOsSpinlockLockMethod() {
		return osSpinlockLockMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsSpinlockLockMethod(OsSpinlockLockMethodEnum newOsSpinlockLockMethod) {
		OsSpinlockLockMethodEnum oldOsSpinlockLockMethod = osSpinlockLockMethod;
		osSpinlockLockMethod = newOsSpinlockLockMethod == null ? OS_SPINLOCK_LOCK_METHOD_EDEFAULT : newOsSpinlockLockMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD, oldOsSpinlockLockMethod, osSpinlockLockMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				return getOsSpinlockAccessingApplication();
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				return getOsSpinlockLockMethod();
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
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				getOsSpinlockAccessingApplication().clear();
				getOsSpinlockAccessingApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				setOsSpinlockLockMethod((OsSpinlockLockMethodEnum)newValue);
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
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				getOsSpinlockAccessingApplication().clear();
				return;
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				setOsSpinlockLockMethod(OS_SPINLOCK_LOCK_METHOD_EDEFAULT);
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
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_ACCESSING_APPLICATION:
				return osSpinlockAccessingApplication != null && !osSpinlockAccessingApplication.isEmpty();
			case EcucPackage.OS_SPINLOCK__OS_SPINLOCK_LOCK_METHOD:
				return osSpinlockLockMethod != OS_SPINLOCK_LOCK_METHOD_EDEFAULT;
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
		result.append(" (osSpinlockLockMethod: "); //$NON-NLS-1$
		result.append(osSpinlockLockMethod);
		result.append(')');
		return result.toString();
	}

} //OsSpinlockImpl
