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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getIocReceiveSymbolName <em>Ioc Receive Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getSignalGroupSymbolName <em>Signal Group Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getBufferComProxySymbolName <em>Buffer Com Proxy Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getBufferComMetaComplexDataSymbolName <em>Buffer Com Meta Complex Data Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getProxyDataTypeName <em>Proxy Data Type Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionImpl#getIsGroup <em>Is Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComProxyFunctionImpl extends FunctionImpl implements ComProxyFunction {
	/**
	 * The default value of the '{@link #getIocReceiveSymbolName() <em>Ioc Receive Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocReceiveSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String IOC_RECEIVE_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIocReceiveSymbolName() <em>Ioc Receive Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocReceiveSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String iocReceiveSymbolName = IOC_RECEIVE_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalGroupSymbolName() <em>Signal Group Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalGroupSymbolName() <em>Signal Group Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String signalGroupSymbolName = SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferComProxySymbolName() <em>Buffer Com Proxy Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferComProxySymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_COM_PROXY_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferComProxySymbolName() <em>Buffer Com Proxy Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferComProxySymbolName()
	 * @generated
	 * @ordered
	 */
	protected String bufferComProxySymbolName = BUFFER_COM_PROXY_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferComMetaComplexDataSymbolName() <em>Buffer Com Meta Complex Data Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferComMetaComplexDataSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferComMetaComplexDataSymbolName() <em>Buffer Com Meta Complex Data Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferComMetaComplexDataSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String bufferComMetaComplexDataSymbolName = BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxyDataTypeName() <em>Proxy Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyDataTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_DATA_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyDataTypeName() <em>Proxy Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyDataTypeName()
	 * @generated
	 * @ordered
	 */
	protected String proxyDataTypeName = PROXY_DATA_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroup()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGroup = IS_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComProxyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_PROXY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getParent() {
		if (eContainerFeatureID() != ModulePackage.COM_PROXY_FUNCTION__PARENT) return null;
		return (Partition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Partition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.COM_PROXY_FUNCTION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Partition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.COM_PROXY_FUNCTION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.PARTITION__COM_PROXY_FUNCTION, Partition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIocReceiveSymbolName() {
		return iocReceiveSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIocReceiveSymbolName(String newIocReceiveSymbolName) {
		String oldIocReceiveSymbolName = iocReceiveSymbolName;
		iocReceiveSymbolName = newIocReceiveSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME, oldIocReceiveSymbolName, iocReceiveSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignalGroupSymbolName() {
		return signalGroupSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalGroupSymbolName(String newSignalGroupSymbolName) {
		String oldSignalGroupSymbolName = signalGroupSymbolName;
		signalGroupSymbolName = newSignalGroupSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME, oldSignalGroupSymbolName, signalGroupSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBufferComProxySymbolName() {
		return bufferComProxySymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferComProxySymbolName(String newBufferComProxySymbolName) {
		String oldBufferComProxySymbolName = bufferComProxySymbolName;
		bufferComProxySymbolName = newBufferComProxySymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_PROXY_SYMBOL_NAME, oldBufferComProxySymbolName, bufferComProxySymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBufferComMetaComplexDataSymbolName() {
		return bufferComMetaComplexDataSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferComMetaComplexDataSymbolName(String newBufferComMetaComplexDataSymbolName) {
		String oldBufferComMetaComplexDataSymbolName = bufferComMetaComplexDataSymbolName;
		bufferComMetaComplexDataSymbolName = newBufferComMetaComplexDataSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME, oldBufferComMetaComplexDataSymbolName, bufferComMetaComplexDataSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxyDataTypeName() {
		return proxyDataTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyDataTypeName(String newProxyDataTypeName) {
		String oldProxyDataTypeName = proxyDataTypeName;
		proxyDataTypeName = newProxyDataTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__PROXY_DATA_TYPE_NAME, oldProxyDataTypeName, proxyDataTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsGroup() {
		return isGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGroup(Boolean newIsGroup) {
		Boolean oldIsGroup = isGroup;
		isGroup = newIsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_PROXY_FUNCTION__IS_GROUP, oldIsGroup, isGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Partition)otherEnd, msgs);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.PARTITION__COM_PROXY_FUNCTION, Partition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return getParent();
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				return getIocReceiveSymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				return getSignalGroupSymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_PROXY_SYMBOL_NAME:
				return getBufferComProxySymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME:
				return getBufferComMetaComplexDataSymbolName();
			case ModulePackage.COM_PROXY_FUNCTION__PROXY_DATA_TYPE_NAME:
				return getProxyDataTypeName();
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				return getIsGroup();
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				setParent((Partition)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				setIocReceiveSymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				setSignalGroupSymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_PROXY_SYMBOL_NAME:
				setBufferComProxySymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME:
				setBufferComMetaComplexDataSymbolName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__PROXY_DATA_TYPE_NAME:
				setProxyDataTypeName((String)newValue);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				setIsGroup((Boolean)newValue);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				setParent((Partition)null);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				setIocReceiveSymbolName(IOC_RECEIVE_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				setSignalGroupSymbolName(SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_PROXY_SYMBOL_NAME:
				setBufferComProxySymbolName(BUFFER_COM_PROXY_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME:
				setBufferComMetaComplexDataSymbolName(BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__PROXY_DATA_TYPE_NAME:
				setProxyDataTypeName(PROXY_DATA_TYPE_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				setIsGroup(IS_GROUP_EDEFAULT);
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
			case ModulePackage.COM_PROXY_FUNCTION__PARENT:
				return getParent() != null;
			case ModulePackage.COM_PROXY_FUNCTION__IOC_RECEIVE_SYMBOL_NAME:
				return IOC_RECEIVE_SYMBOL_NAME_EDEFAULT == null ? iocReceiveSymbolName != null : !IOC_RECEIVE_SYMBOL_NAME_EDEFAULT.equals(iocReceiveSymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				return SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT == null ? signalGroupSymbolName != null : !SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT.equals(signalGroupSymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_PROXY_SYMBOL_NAME:
				return BUFFER_COM_PROXY_SYMBOL_NAME_EDEFAULT == null ? bufferComProxySymbolName != null : !BUFFER_COM_PROXY_SYMBOL_NAME_EDEFAULT.equals(bufferComProxySymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME:
				return BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME_EDEFAULT == null ? bufferComMetaComplexDataSymbolName != null : !BUFFER_COM_META_COMPLEX_DATA_SYMBOL_NAME_EDEFAULT.equals(bufferComMetaComplexDataSymbolName);
			case ModulePackage.COM_PROXY_FUNCTION__PROXY_DATA_TYPE_NAME:
				return PROXY_DATA_TYPE_NAME_EDEFAULT == null ? proxyDataTypeName != null : !PROXY_DATA_TYPE_NAME_EDEFAULT.equals(proxyDataTypeName);
			case ModulePackage.COM_PROXY_FUNCTION__IS_GROUP:
				return IS_GROUP_EDEFAULT == null ? isGroup != null : !IS_GROUP_EDEFAULT.equals(isGroup);
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
		result.append(" (iocReceiveSymbolName: ");
		result.append(iocReceiveSymbolName);
		result.append(", signalGroupSymbolName: ");
		result.append(signalGroupSymbolName);
		result.append(", bufferComProxySymbolName: ");
		result.append(bufferComProxySymbolName);
		result.append(", bufferComMetaComplexDataSymbolName: ");
		result.append(bufferComMetaComplexDataSymbolName);
		result.append(", proxyDataTypeName: ");
		result.append(proxyDataTypeName);
		result.append(", isGroup: ");
		result.append(isGroup);
		result.append(')');
		return result.toString();
	}

} //ComProxyFunctionImpl
