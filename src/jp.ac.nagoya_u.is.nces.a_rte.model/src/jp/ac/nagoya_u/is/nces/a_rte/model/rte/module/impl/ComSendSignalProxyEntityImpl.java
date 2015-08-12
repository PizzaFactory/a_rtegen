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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComplexComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalProxyEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Signal Proxy Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalProxyEntityImpl#getPrimitiveOperation <em>Primitive Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalProxyEntityImpl#getComplexOperation <em>Complex Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendSignalProxyEntityImpl extends BswSchedulableEntityImpl implements ComSendSignalProxyEntity {
	/**
	 * The cached value of the '{@link #getPrimitiveOperation() <em>Primitive Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveComSendProxyOperation> primitiveOperation;

	/**
	 * The cached value of the '{@link #getComplexOperation() <em>Complex Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexComSendProxyOperation> complexOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendSignalProxyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SEND_SIGNAL_PROXY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveComSendProxyOperation> getPrimitiveOperation() {
		if (primitiveOperation == null) {
			primitiveOperation = new EObjectContainmentEList<PrimitiveComSendProxyOperation>(PrimitiveComSendProxyOperation.class, this, ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION);
		}
		return primitiveOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexComSendProxyOperation> getComplexOperation() {
		if (complexOperation == null) {
			complexOperation = new EObjectContainmentEList<ComplexComSendProxyOperation>(ComplexComSendProxyOperation.class, this, ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION);
		}
		return complexOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION:
				return ((InternalEList<?>)getPrimitiveOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION:
				return ((InternalEList<?>)getComplexOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION:
				return getPrimitiveOperation();
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION:
				return getComplexOperation();
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
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION:
				getPrimitiveOperation().clear();
				getPrimitiveOperation().addAll((Collection<? extends PrimitiveComSendProxyOperation>)newValue);
				return;
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION:
				getComplexOperation().clear();
				getComplexOperation().addAll((Collection<? extends ComplexComSendProxyOperation>)newValue);
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
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION:
				getPrimitiveOperation().clear();
				return;
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION:
				getComplexOperation().clear();
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
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__PRIMITIVE_OPERATION:
				return primitiveOperation != null && !primitiveOperation.isEmpty();
			case ModulePackage.COM_SEND_SIGNAL_PROXY_ENTITY__COMPLEX_OPERATION:
				return complexOperation != null && !complexOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComSendSignalProxyEntityImpl
