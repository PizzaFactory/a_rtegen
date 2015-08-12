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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallTrustedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Trusted Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallTrustedApiImpl#getCsArgsTrustedFunctionParamTypeName <em>Cs Args Trusted Function Param Type Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallTrustedApiImpl#getRteCallArgcName <em>Rte Call Argc Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallTrustedApiImpl#getRteCallOpidName <em>Rte Call Opid Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallTrustedApiImpl#getRteCsTfName <em>Rte Cs Tf Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallTrustedApiImpl#getDeclareTaskId <em>Declare Task Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallTrustedApiImpl extends CallApiImpl implements CallTrustedApi {
	/**
	 * The default value of the '{@link #getCsArgsTrustedFunctionParamTypeName() <em>Cs Args Trusted Function Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsArgsTrustedFunctionParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsArgsTrustedFunctionParamTypeName() <em>Cs Args Trusted Function Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsArgsTrustedFunctionParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected String csArgsTrustedFunctionParamTypeName = CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRteCallArgcName() <em>Rte Call Argc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCallArgcName()
	 * @generated
	 * @ordered
	 */
	protected static final String RTE_CALL_ARGC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteCallArgcName() <em>Rte Call Argc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCallArgcName()
	 * @generated
	 * @ordered
	 */
	protected String rteCallArgcName = RTE_CALL_ARGC_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getRteCsTfName() <em>Rte Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCsTfName()
	 * @generated
	 * @ordered
	 */
	protected static final String RTE_CS_TF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRteCsTfName() <em>Rte Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCsTfName()
	 * @generated
	 * @ordered
	 */
	protected String rteCsTfName = RTE_CS_TF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclareTaskId() <em>Declare Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DECLARE_TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclareTaskId() <em>Declare Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareTaskId()
	 * @generated
	 * @ordered
	 */
	protected Boolean declareTaskId = DECLARE_TASK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallTrustedApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CALL_TRUSTED_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsArgsTrustedFunctionParamTypeName() {
		return csArgsTrustedFunctionParamTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsArgsTrustedFunctionParamTypeName(String newCsArgsTrustedFunctionParamTypeName) {
		String oldCsArgsTrustedFunctionParamTypeName = csArgsTrustedFunctionParamTypeName;
		csArgsTrustedFunctionParamTypeName = newCsArgsTrustedFunctionParamTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CALL_TRUSTED_API__CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME, oldCsArgsTrustedFunctionParamTypeName, csArgsTrustedFunctionParamTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRteCallArgcName() {
		return rteCallArgcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCallArgcName(String newRteCallArgcName) {
		String oldRteCallArgcName = rteCallArgcName;
		rteCallArgcName = newRteCallArgcName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CALL_TRUSTED_API__RTE_CALL_ARGC_NAME, oldRteCallArgcName, rteCallArgcName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CALL_TRUSTED_API__RTE_CALL_OPID_NAME, oldRteCallOpidName, rteCallOpidName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRteCsTfName() {
		return rteCsTfName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCsTfName(String newRteCsTfName) {
		String oldRteCsTfName = rteCsTfName;
		rteCsTfName = newRteCsTfName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CALL_TRUSTED_API__RTE_CS_TF_NAME, oldRteCsTfName, rteCsTfName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeclareTaskId() {
		return declareTaskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclareTaskId(Boolean newDeclareTaskId) {
		Boolean oldDeclareTaskId = declareTaskId;
		declareTaskId = newDeclareTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CALL_TRUSTED_API__DECLARE_TASK_ID, oldDeclareTaskId, declareTaskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.CALL_TRUSTED_API__CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME:
				return getCsArgsTrustedFunctionParamTypeName();
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_ARGC_NAME:
				return getRteCallArgcName();
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_OPID_NAME:
				return getRteCallOpidName();
			case ModulePackage.CALL_TRUSTED_API__RTE_CS_TF_NAME:
				return getRteCsTfName();
			case ModulePackage.CALL_TRUSTED_API__DECLARE_TASK_ID:
				return getDeclareTaskId();
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
			case ModulePackage.CALL_TRUSTED_API__CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME:
				setCsArgsTrustedFunctionParamTypeName((String)newValue);
				return;
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_ARGC_NAME:
				setRteCallArgcName((String)newValue);
				return;
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_OPID_NAME:
				setRteCallOpidName((String)newValue);
				return;
			case ModulePackage.CALL_TRUSTED_API__RTE_CS_TF_NAME:
				setRteCsTfName((String)newValue);
				return;
			case ModulePackage.CALL_TRUSTED_API__DECLARE_TASK_ID:
				setDeclareTaskId((Boolean)newValue);
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
			case ModulePackage.CALL_TRUSTED_API__CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME:
				setCsArgsTrustedFunctionParamTypeName(CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME_EDEFAULT);
				return;
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_ARGC_NAME:
				setRteCallArgcName(RTE_CALL_ARGC_NAME_EDEFAULT);
				return;
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_OPID_NAME:
				setRteCallOpidName(RTE_CALL_OPID_NAME_EDEFAULT);
				return;
			case ModulePackage.CALL_TRUSTED_API__RTE_CS_TF_NAME:
				setRteCsTfName(RTE_CS_TF_NAME_EDEFAULT);
				return;
			case ModulePackage.CALL_TRUSTED_API__DECLARE_TASK_ID:
				setDeclareTaskId(DECLARE_TASK_ID_EDEFAULT);
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
			case ModulePackage.CALL_TRUSTED_API__CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME:
				return CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME_EDEFAULT == null ? csArgsTrustedFunctionParamTypeName != null : !CS_ARGS_TRUSTED_FUNCTION_PARAM_TYPE_NAME_EDEFAULT.equals(csArgsTrustedFunctionParamTypeName);
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_ARGC_NAME:
				return RTE_CALL_ARGC_NAME_EDEFAULT == null ? rteCallArgcName != null : !RTE_CALL_ARGC_NAME_EDEFAULT.equals(rteCallArgcName);
			case ModulePackage.CALL_TRUSTED_API__RTE_CALL_OPID_NAME:
				return RTE_CALL_OPID_NAME_EDEFAULT == null ? rteCallOpidName != null : !RTE_CALL_OPID_NAME_EDEFAULT.equals(rteCallOpidName);
			case ModulePackage.CALL_TRUSTED_API__RTE_CS_TF_NAME:
				return RTE_CS_TF_NAME_EDEFAULT == null ? rteCsTfName != null : !RTE_CS_TF_NAME_EDEFAULT.equals(rteCsTfName);
			case ModulePackage.CALL_TRUSTED_API__DECLARE_TASK_ID:
				return DECLARE_TASK_ID_EDEFAULT == null ? declareTaskId != null : !DECLARE_TASK_ID_EDEFAULT.equals(declareTaskId);
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
		result.append(" (csArgsTrustedFunctionParamTypeName: ");
		result.append(csArgsTrustedFunctionParamTypeName);
		result.append(", rteCallArgcName: ");
		result.append(rteCallArgcName);
		result.append(", rteCallOpidName: ");
		result.append(rteCallOpidName);
		result.append(", rteCsTfName: ");
		result.append(rteCsTfName);
		result.append(", declareTaskId: ");
		result.append(declareTaskId);
		result.append(')');
		return result.toString();
	}

} //CallTrustedApiImpl
