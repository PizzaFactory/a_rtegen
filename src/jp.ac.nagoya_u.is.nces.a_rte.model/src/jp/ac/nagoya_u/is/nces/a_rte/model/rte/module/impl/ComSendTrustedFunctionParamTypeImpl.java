/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Trusted Function Param Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendTrustedFunctionParamTypeImpl#getIsGroup <em>Is Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendTrustedFunctionParamTypeImpl extends TypeImpl implements ComSendTrustedFunctionParamType {
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
	protected ComSendTrustedFunctionParamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_GROUP, oldIsGroup, isGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_GROUP:
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
			case ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_GROUP:
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
			case ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_GROUP:
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
			case ModulePackage.COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_GROUP:
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
		result.append(" (isGroup: "); //$NON-NLS-1$
		result.append(isGroup);
		result.append(')');
		return result.toString();
	}

} //ComSendTrustedFunctionParamTypeImpl
