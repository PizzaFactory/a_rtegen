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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Proxy Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveComSendProxyOperationImpl#getReadValueVariable <em>Read Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveComSendProxyOperationImpl#getAccessApi <em>Access Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveComSendProxyOperationImpl#getSignalIdVariable <em>Signal Id Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveComSendProxyOperationImpl extends OperationImpl implements PrimitiveComSendProxyOperation {
	/**
	 * The cached value of the '{@link #getReadValueVariable() <em>Read Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadValueVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable readValueVariable;

	/**
	 * The cached value of the '{@link #getAccessApi() <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessApi()
	 * @generated
	 * @ordered
	 */
	protected IocReceiveGroupApi accessApi;

	/**
	 * The cached value of the '{@link #getSignalIdVariable() <em>Signal Id Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalIdVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable signalIdVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveComSendProxyOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PRIMITIVE_COM_SEND_PROXY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReadValueVariable() {
		if (readValueVariable != null && ((EObject)readValueVariable).eIsProxy()) {
			InternalEObject oldReadValueVariable = (InternalEObject)readValueVariable;
			readValueVariable = (Variable)eResolveProxy(oldReadValueVariable);
			if (readValueVariable != oldReadValueVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE, oldReadValueVariable, readValueVariable));
			}
		}
		return readValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReadValueVariable() {
		return readValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadValueVariable(Variable newReadValueVariable) {
		Variable oldReadValueVariable = readValueVariable;
		readValueVariable = newReadValueVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE, oldReadValueVariable, readValueVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi getAccessApi() {
		if (accessApi != null && ((EObject)accessApi).eIsProxy()) {
			InternalEObject oldAccessApi = (InternalEObject)accessApi;
			accessApi = (IocReceiveGroupApi)eResolveProxy(oldAccessApi);
			if (accessApi != oldAccessApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API, oldAccessApi, accessApi));
			}
		}
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi basicGetAccessApi() {
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessApi(IocReceiveGroupApi newAccessApi) {
		IocReceiveGroupApi oldAccessApi = accessApi;
		accessApi = newAccessApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API, oldAccessApi, accessApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSignalIdVariable() {
		if (signalIdVariable != null && ((EObject)signalIdVariable).eIsProxy()) {
			InternalEObject oldSignalIdVariable = (InternalEObject)signalIdVariable;
			signalIdVariable = (Variable)eResolveProxy(oldSignalIdVariable);
			if (signalIdVariable != oldSignalIdVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE, oldSignalIdVariable, signalIdVariable));
			}
		}
		return signalIdVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSignalIdVariable() {
		return signalIdVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalIdVariable(Variable newSignalIdVariable) {
		Variable oldSignalIdVariable = signalIdVariable;
		signalIdVariable = newSignalIdVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE, oldSignalIdVariable, signalIdVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				if (resolve) return getReadValueVariable();
				return basicGetReadValueVariable();
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				if (resolve) return getAccessApi();
				return basicGetAccessApi();
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				if (resolve) return getSignalIdVariable();
				return basicGetSignalIdVariable();
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
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				setReadValueVariable((Variable)newValue);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				setAccessApi((IocReceiveGroupApi)newValue);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				setSignalIdVariable((Variable)newValue);
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
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				setReadValueVariable((Variable)null);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				setAccessApi((IocReceiveGroupApi)null);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				setSignalIdVariable((Variable)null);
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
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				return readValueVariable != null;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				return accessApi != null;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				return signalIdVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveComSendProxyOperationImpl
