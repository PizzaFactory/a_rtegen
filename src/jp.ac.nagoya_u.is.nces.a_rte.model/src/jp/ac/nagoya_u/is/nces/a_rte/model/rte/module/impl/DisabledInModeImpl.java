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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disabled In Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getDisabledMode <em>Disabled Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getCurrentModeVariable <em>Current Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getNextModeVariable <em>Next Mode Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisabledInModeImpl extends ModuleReferrableImpl implements DisabledInMode {
	/**
	 * The cached value of the '{@link #getDisabledMode() <em>Disabled Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMode()
	 * @generated
	 * @ordered
	 */
	protected Constant disabledMode;

	/**
	 * The cached value of the '{@link #getCurrentModeVariable() <em>Current Mode Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable currentModeVariable;

	/**
	 * The cached value of the '{@link #getNextModeVariable() <em>Next Mode Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable nextModeVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisabledInModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.DISABLED_IN_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getDisabledMode() {
		if (disabledMode != null && ((EObject)disabledMode).eIsProxy()) {
			InternalEObject oldDisabledMode = (InternalEObject)disabledMode;
			disabledMode = (Constant)eResolveProxy(oldDisabledMode);
			if (disabledMode != oldDisabledMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__DISABLED_MODE, oldDisabledMode, disabledMode));
			}
		}
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetDisabledMode() {
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledMode(Constant newDisabledMode) {
		Constant oldDisabledMode = disabledMode;
		disabledMode = newDisabledMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__DISABLED_MODE, oldDisabledMode, disabledMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCurrentModeVariable() {
		if (currentModeVariable != null && ((EObject)currentModeVariable).eIsProxy()) {
			InternalEObject oldCurrentModeVariable = (InternalEObject)currentModeVariable;
			currentModeVariable = (GlobalVariable)eResolveProxy(oldCurrentModeVariable);
			if (currentModeVariable != oldCurrentModeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, currentModeVariable));
			}
		}
		return currentModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetCurrentModeVariable() {
		return currentModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentModeVariable(GlobalVariable newCurrentModeVariable) {
		GlobalVariable oldCurrentModeVariable = currentModeVariable;
		currentModeVariable = newCurrentModeVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, currentModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getNextModeVariable() {
		if (nextModeVariable != null && ((EObject)nextModeVariable).eIsProxy()) {
			InternalEObject oldNextModeVariable = (InternalEObject)nextModeVariable;
			nextModeVariable = (GlobalVariable)eResolveProxy(oldNextModeVariable);
			if (nextModeVariable != oldNextModeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE, oldNextModeVariable, nextModeVariable));
			}
		}
		return nextModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetNextModeVariable() {
		return nextModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextModeVariable(GlobalVariable newNextModeVariable) {
		GlobalVariable oldNextModeVariable = nextModeVariable;
		nextModeVariable = newNextModeVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE, oldNextModeVariable, nextModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				if (resolve) return getDisabledMode();
				return basicGetDisabledMode();
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				if (resolve) return getCurrentModeVariable();
				return basicGetCurrentModeVariable();
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				if (resolve) return getNextModeVariable();
				return basicGetNextModeVariable();
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				setDisabledMode((Constant)newValue);
				return;
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)newValue);
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				setDisabledMode((Constant)null);
				return;
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)null);
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				return disabledMode != null;
			case ModulePackage.DISABLED_IN_MODE__CURRENT_MODE_VARIABLE:
				return currentModeVariable != null;
			case ModulePackage.DISABLED_IN_MODE__NEXT_MODE_VARIABLE:
				return nextModeVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //DisabledInModeImpl
