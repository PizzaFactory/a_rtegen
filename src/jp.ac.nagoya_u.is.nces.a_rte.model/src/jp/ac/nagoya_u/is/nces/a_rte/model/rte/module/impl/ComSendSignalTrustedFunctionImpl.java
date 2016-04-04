/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Signal Trusted Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalTrustedFunctionImpl#getIsGroup <em>Is Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalTrustedFunctionImpl#getSignalGroupSymbolName <em>Signal Group Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendSignalTrustedFunctionImpl extends TrustedFunctionImpl implements ComSendSignalTrustedFunction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendSignalTrustedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SEND_SIGNAL_TRUSTED_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__IS_GROUP, oldIsGroup, isGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME, oldSignalGroupSymbolName, signalGroupSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__IS_GROUP:
				return getIsGroup();
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				return getSignalGroupSymbolName();
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
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__IS_GROUP:
				setIsGroup((Boolean)newValue);
				return;
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				setSignalGroupSymbolName((String)newValue);
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
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__IS_GROUP:
				setIsGroup(IS_GROUP_EDEFAULT);
				return;
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				setSignalGroupSymbolName(SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT);
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
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__IS_GROUP:
				return IS_GROUP_EDEFAULT == null ? isGroup != null : !IS_GROUP_EDEFAULT.equals(isGroup);
			case ModulePackage.COM_SEND_SIGNAL_TRUSTED_FUNCTION__SIGNAL_GROUP_SYMBOL_NAME:
				return SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT == null ? signalGroupSymbolName != null : !SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT.equals(signalGroupSymbolName);
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
		result.append(" (isGroup: "); //$NON-NLS-1$
		result.append(isGroup);
		result.append(", signalGroupSymbolName: "); //$NON-NLS-1$
		result.append(signalGroupSymbolName);
		result.append(')');
		return result.toString();
	}

} //ComSendSignalTrustedFunctionImpl
