/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Event Set Activation Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetActivationOperationImpl#getActivationOsEventId <em>Activation Os Event Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsEventSetActivationOperationImpl extends ContextActivationOperationImpl implements OsEventSetActivationOperation {
	/**
	 * The default value of the '{@link #getActivationOsEventId() <em>Activation Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationOsEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_OS_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationOsEventId() <em>Activation Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationOsEventId()
	 * @generated
	 * @ordered
	 */
	protected String activationOsEventId = ACTIVATION_OS_EVENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsEventSetActivationOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_EVENT_SET_ACTIVATION_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivationOsEventId() {
		return activationOsEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationOsEventId(String newActivationOsEventId) {
		String oldActivationOsEventId = activationOsEventId;
		activationOsEventId = newActivationOsEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID, oldActivationOsEventId, activationOsEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID:
				return getActivationOsEventId();
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
			case ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID:
				setActivationOsEventId((String)newValue);
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
			case ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID:
				setActivationOsEventId(ACTIVATION_OS_EVENT_ID_EDEFAULT);
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
			case ModulePackage.OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID:
				return ACTIVATION_OS_EVENT_ID_EDEFAULT == null ? activationOsEventId != null : !ACTIVATION_OS_EVENT_ID_EDEFAULT.equals(activationOsEventId);
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
		result.append(" (activationOsEventId: "); //$NON-NLS-1$
		result.append(activationOsEventId);
		result.append(')');
		return result.toString();
	}

} //OsEventSetActivationOperationImpl
