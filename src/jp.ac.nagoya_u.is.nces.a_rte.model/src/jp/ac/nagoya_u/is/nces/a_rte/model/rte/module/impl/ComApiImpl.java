/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComApiImpl#getIsSignalGroup <em>Is Signal Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComApiImpl#getComSignalSymbolName <em>Com Signal Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComApiImpl extends FunctionImpl implements ComApi {
	/**
	 * The default value of the '{@link #getIsSignalGroup() <em>Is Signal Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SIGNAL_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSignalGroup() <em>Is Signal Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSignalGroup = IS_SIGNAL_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getComSignalSymbolName() <em>Com Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String COM_SIGNAL_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComSignalSymbolName() <em>Com Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String comSignalSymbolName = COM_SIGNAL_SYMBOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSignalGroup() {
		return isSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSignalGroup(Boolean newIsSignalGroup) {
		Boolean oldIsSignalGroup = isSignalGroup;
		isSignalGroup = newIsSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_API__IS_SIGNAL_GROUP, oldIsSignalGroup, isSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComSignalSymbolName() {
		return comSignalSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSignalSymbolName(String newComSignalSymbolName) {
		String oldComSignalSymbolName = comSignalSymbolName;
		comSignalSymbolName = newComSignalSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_API__COM_SIGNAL_SYMBOL_NAME, oldComSignalSymbolName, comSignalSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_API__IS_SIGNAL_GROUP:
				return getIsSignalGroup();
			case ModulePackage.COM_API__COM_SIGNAL_SYMBOL_NAME:
				return getComSignalSymbolName();
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
			case ModulePackage.COM_API__IS_SIGNAL_GROUP:
				setIsSignalGroup((Boolean)newValue);
				return;
			case ModulePackage.COM_API__COM_SIGNAL_SYMBOL_NAME:
				setComSignalSymbolName((String)newValue);
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
			case ModulePackage.COM_API__IS_SIGNAL_GROUP:
				setIsSignalGroup(IS_SIGNAL_GROUP_EDEFAULT);
				return;
			case ModulePackage.COM_API__COM_SIGNAL_SYMBOL_NAME:
				setComSignalSymbolName(COM_SIGNAL_SYMBOL_NAME_EDEFAULT);
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
			case ModulePackage.COM_API__IS_SIGNAL_GROUP:
				return IS_SIGNAL_GROUP_EDEFAULT == null ? isSignalGroup != null : !IS_SIGNAL_GROUP_EDEFAULT.equals(isSignalGroup);
			case ModulePackage.COM_API__COM_SIGNAL_SYMBOL_NAME:
				return COM_SIGNAL_SYMBOL_NAME_EDEFAULT == null ? comSignalSymbolName != null : !COM_SIGNAL_SYMBOL_NAME_EDEFAULT.equals(comSignalSymbolName);
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
		result.append(" (isSignalGroup: "); //$NON-NLS-1$
		result.append(isSignalGroup);
		result.append(", comSignalSymbolName: "); //$NON-NLS-1$
		result.append(comSignalSymbolName);
		result.append(')');
		return result.toString();
	}

} //ComApiImpl
