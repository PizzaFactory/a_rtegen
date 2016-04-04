/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionImpl#getTrustedFunctionIndex <em>Trusted Function Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrustedFunctionImpl extends FunctionImpl implements TrustedFunction {
	/**
	 * The default value of the '{@link #getTrustedFunctionIndex() <em>Trusted Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUSTED_FUNCTION_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustedFunctionIndex() <em>Trusted Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionIndex()
	 * @generated
	 * @ordered
	 */
	protected String trustedFunctionIndex = TRUSTED_FUNCTION_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrustedFunctionIndex() {
		return trustedFunctionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustedFunctionIndex(String newTrustedFunctionIndex) {
		String oldTrustedFunctionIndex = trustedFunctionIndex;
		trustedFunctionIndex = newTrustedFunctionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX, oldTrustedFunctionIndex, trustedFunctionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX:
				return getTrustedFunctionIndex();
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
			case ModulePackage.TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX:
				setTrustedFunctionIndex((String)newValue);
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
			case ModulePackage.TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX:
				setTrustedFunctionIndex(TRUSTED_FUNCTION_INDEX_EDEFAULT);
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
			case ModulePackage.TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX:
				return TRUSTED_FUNCTION_INDEX_EDEFAULT == null ? trustedFunctionIndex != null : !TRUSTED_FUNCTION_INDEX_EDEFAULT.equals(trustedFunctionIndex);
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
		result.append(" (trustedFunctionIndex: "); //$NON-NLS-1$
		result.append(trustedFunctionIndex);
		result.append(')');
		return result.toString();
	}

} //TrustedFunctionImpl
