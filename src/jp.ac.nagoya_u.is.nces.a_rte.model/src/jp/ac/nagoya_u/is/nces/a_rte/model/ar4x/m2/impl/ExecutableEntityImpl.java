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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl#getCanEnterExclusiveArea <em>Can Enter Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl#getRunsInsideExclusiveArea <em>Runs Inside Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExecutableEntityImpl#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableEntityImpl extends IdentifiableImpl implements ExecutableEntity {
	/**
	 * The cached value of the '{@link #getCanEnterExclusiveArea() <em>Can Enter Exclusive Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanEnterExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveArea> canEnterExclusiveArea;

	/**
	 * The cached value of the '{@link #getRunsInsideExclusiveArea() <em>Runs Inside Exclusive Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsInsideExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveArea> runsInsideExclusiveArea;

	/**
	 * The cached value of the '{@link #getSwAddrMethod() <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected SwAddrMethod swAddrMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.EXECUTABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveArea> getCanEnterExclusiveArea() {
		if (canEnterExclusiveArea == null) {
			canEnterExclusiveArea = new EObjectWithInverseResolvingEList.ManyInverse<ExclusiveArea>(ExclusiveArea.class, this, M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA, M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY);
		}
		return canEnterExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveArea> getRunsInsideExclusiveArea() {
		if (runsInsideExclusiveArea == null) {
			runsInsideExclusiveArea = new EObjectResolvingEList<ExclusiveArea>(ExclusiveArea.class, this, M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA);
		}
		return runsInsideExclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		if (swAddrMethod != null && ((EObject)swAddrMethod).eIsProxy()) {
			InternalEObject oldSwAddrMethod = (InternalEObject)swAddrMethod;
			swAddrMethod = (SwAddrMethod)eResolveProxy(oldSwAddrMethod);
			if (swAddrMethod != oldSwAddrMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
			}
		}
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod basicGetSwAddrMethod() {
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAddrMethod(SwAddrMethod newSwAddrMethod) {
		SwAddrMethod oldSwAddrMethod = swAddrMethod;
		swAddrMethod = newSwAddrMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCanEnterExclusiveArea()).basicAdd(otherEnd, msgs);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return ((InternalEList<?>)getCanEnterExclusiveArea()).basicRemove(otherEnd, msgs);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return getCanEnterExclusiveArea();
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				return getRunsInsideExclusiveArea();
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				if (resolve) return getSwAddrMethod();
				return basicGetSwAddrMethod();
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				getCanEnterExclusiveArea().clear();
				getCanEnterExclusiveArea().addAll((Collection<? extends ExclusiveArea>)newValue);
				return;
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				getRunsInsideExclusiveArea().clear();
				getRunsInsideExclusiveArea().addAll((Collection<? extends ExclusiveArea>)newValue);
				return;
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)newValue);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				getCanEnterExclusiveArea().clear();
				return;
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				getRunsInsideExclusiveArea().clear();
				return;
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)null);
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
			case M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA:
				return canEnterExclusiveArea != null && !canEnterExclusiveArea.isEmpty();
			case M2Package.EXECUTABLE_ENTITY__RUNS_INSIDE_EXCLUSIVE_AREA:
				return runsInsideExclusiveArea != null && !runsInsideExclusiveArea.isEmpty();
			case M2Package.EXECUTABLE_ENTITY__SW_ADDR_METHOD:
				return swAddrMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutableEntityImpl
