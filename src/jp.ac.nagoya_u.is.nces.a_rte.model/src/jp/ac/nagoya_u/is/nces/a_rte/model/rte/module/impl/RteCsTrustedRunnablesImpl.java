/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
