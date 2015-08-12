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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCsTrustedRunnables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Cs Trusted Runnables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCsTrustedRunnablesImpl#getRteCallOpidName <em>Rte Call Opid Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCsTrustedRunnablesImpl#getIsReturn <em>Is Return</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCsTrustedRunnablesImpl#getServerRunnableName <em>Server Runnable Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCsTrustedRunnablesImpl#getRunnableParam <em>Runnable Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteCsTrustedRunnablesImpl extends ExtendedEObjectImpl implements RteCsTrustedRunnables {
	/**
	 * The default value of the '{@link #getRteCallOpidName() <em>Rte Call Opid Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCallOpidName()
	 * @generated
	 * @ordered
	 */
	protected static final String RTE_CALL_OPID_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteCallOpidName() <em>Rte Call Opid Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCallOpidName()
	 * @generated
	 * @ordered
	 */
	protected String rteCallOpidName = RTE_CALL_OPID_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsReturn() <em>Is Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReturn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_RETURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReturn() <em>Is Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReturn()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReturn = IS_RETURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerRunnableName() <em>Server Runnable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerRunnableName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_RUNNABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerRunnableName() <em>Server Runnable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerRunnableName()
	 * @generated
	 * @ordered
	 */
	protected String serverRunnableName = SERVER_RUNNABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunnableParam() <em>Runnable Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> runnableParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteCsTrustedRunnablesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_CS_TRUSTED_RUNNABLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRteCallOpidName() {
		return rteCallOpidName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCallOpidName(String newRteCallOpidName) {
		String oldRteCallOpidName = rteCallOpidName;
		rteCallOpidName = newRteCallOpidName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RTE_CALL_OPID_NAME, oldRteCallOpidName, rteCallOpidName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReturn() {
		return isReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReturn(Boolean newIsReturn) {
		Boolean oldIsReturn = isReturn;
		isReturn = newIsReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_CS_TRUSTED_RUNNABLES__IS_RETURN, oldIsReturn, isReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerRunnableName() {
		return serverRunnableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerRunnableName(String newServerRunnableName) {
		String oldServerRunnableName = serverRunnableName;
		serverRunnableName = newServerRunnableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_CS_TRUSTED_RUNNABLES__SERVER_RUNNABLE_NAME, oldServerRunnableName, serverRunnableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getRunnableParam() {
		if (runnableParam == null) {
			runnableParam = new EObjectContainmentEList<Parameter>(Parameter.class, this, ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RUNNABLE_PARAM);
		}
		return runnableParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RUNNABLE_PARAM:
				return ((InternalEList<?>)getRunnableParam()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RTE_CALL_OPID_NAME:
				return getRteCallOpidName();
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__IS_RETURN:
				return getIsReturn();
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__SERVER_RUNNABLE_NAME:
				return getServerRunnableName();
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RUNNABLE_PARAM:
				return getRunnableParam();
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
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RTE_CALL_OPID_NAME:
				setRteCallOpidName((String)newValue);
				return;
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__IS_RETURN:
				setIsReturn((Boolean)newValue);
				return;
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__SERVER_RUNNABLE_NAME:
				setServerRunnableName((String)newValue);
				return;
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RUNNABLE_PARAM:
				getRunnableParam().clear();
				getRunnableParam().addAll((Collection<? extends Parameter>)newValue);
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
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RTE_CALL_OPID_NAME:
				setRteCallOpidName(RTE_CALL_OPID_NAME_EDEFAULT);
				return;
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__IS_RETURN:
				setIsReturn(IS_RETURN_EDEFAULT);
				return;
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__SERVER_RUNNABLE_NAME:
				setServerRunnableName(SERVER_RUNNABLE_NAME_EDEFAULT);
				return;
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RUNNABLE_PARAM:
				getRunnableParam().clear();
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
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RTE_CALL_OPID_NAME:
				return RTE_CALL_OPID_NAME_EDEFAULT == null ? rteCallOpidName != null : !RTE_CALL_OPID_NAME_EDEFAULT.equals(rteCallOpidName);
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__IS_RETURN:
				return IS_RETURN_EDEFAULT == null ? isReturn != null : !IS_RETURN_EDEFAULT.equals(isReturn);
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__SERVER_RUNNABLE_NAME:
				return SERVER_RUNNABLE_NAME_EDEFAULT == null ? serverRunnableName != null : !SERVER_RUNNABLE_NAME_EDEFAULT.equals(serverRunnableName);
			case ModulePackage.RTE_CS_TRUSTED_RUNNABLES__RUNNABLE_PARAM:
				return runnableParam != null && !runnableParam.isEmpty();
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
		result.append(" (rteCallOpidName: ");
		result.append(rteCallOpidName);
		result.append(", isReturn: ");
		result.append(isReturn);
		result.append(", serverRunnableName: ");
		result.append(serverRunnableName);
		result.append(')');
		return result.toString();
	}

} //RteCsTrustedRunnablesImpl
