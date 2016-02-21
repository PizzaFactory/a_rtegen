/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RunnableEntityImpl#getHasReturnValue <em>Has Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnableEntityImpl extends ExecutableEntityImpl implements RunnableEntity {
	/**
	 * The default value of the '{@link #getHasReturnValue() <em>Has Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_RETURN_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHasReturnValue() <em>Has Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReturnValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasReturnValue = HAS_RETURN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RUNNABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasReturnValue() {
		return hasReturnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReturnValue(Boolean newHasReturnValue) {
		Boolean oldHasReturnValue = hasReturnValue;
		hasReturnValue = newHasReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RUNNABLE_ENTITY__HAS_RETURN_VALUE, oldHasReturnValue, hasReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.RUNNABLE_ENTITY__HAS_RETURN_VALUE:
				return getHasReturnValue();
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
			case ModulePackage.RUNNABLE_ENTITY__HAS_RETURN_VALUE:
				setHasReturnValue((Boolean)newValue);
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
			case ModulePackage.RUNNABLE_ENTITY__HAS_RETURN_VALUE:
				setHasReturnValue(HAS_RETURN_VALUE_EDEFAULT);
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
			case ModulePackage.RUNNABLE_ENTITY__HAS_RETURN_VALUE:
				return HAS_RETURN_VALUE_EDEFAULT == null ? hasReturnValue != null : !HAS_RETURN_VALUE_EDEFAULT.equals(hasReturnValue);
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
		result.append(" (hasReturnValue: "); //$NON-NLS-1$
		result.append(hasReturnValue);
		result.append(')');
		return result.toString();
	}

} //RunnableEntityImpl
