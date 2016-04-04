/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Spinlock Exclude Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSpinlockExcludeOperationImpl#getOsSpinlockId <em>Os Spinlock Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsSpinlockExcludeOperationImpl extends ExcludeOperationImpl implements OsSpinlockExcludeOperation {
	/**
	 * The default value of the '{@link #getOsSpinlockId() <em>Os Spinlock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockId()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_SPINLOCK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsSpinlockId() <em>Os Spinlock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsSpinlockId()
	 * @generated
	 * @ordered
	 */
	protected String osSpinlockId = OS_SPINLOCK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsSpinlockExcludeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_SPINLOCK_EXCLUDE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsSpinlockId() {
		return osSpinlockId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsSpinlockId(String newOsSpinlockId) {
		String oldOsSpinlockId = osSpinlockId;
		osSpinlockId = newOsSpinlockId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID, oldOsSpinlockId, osSpinlockId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID:
				return getOsSpinlockId();
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
			case ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID:
				setOsSpinlockId((String)newValue);
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
			case ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID:
				setOsSpinlockId(OS_SPINLOCK_ID_EDEFAULT);
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
			case ModulePackage.OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID:
				return OS_SPINLOCK_ID_EDEFAULT == null ? osSpinlockId != null : !OS_SPINLOCK_ID_EDEFAULT.equals(osSpinlockId);
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
		result.append(" (osSpinlockId: "); //$NON-NLS-1$
		result.append(osSpinlockId);
		result.append(')');
		return result.toString();
	}

} //OsSpinlockExcludeOperationImpl
