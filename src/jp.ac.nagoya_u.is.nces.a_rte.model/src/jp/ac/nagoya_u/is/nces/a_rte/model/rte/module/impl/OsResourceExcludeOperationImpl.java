/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Resource Exclude Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsResourceExcludeOperationImpl#getOsResourceId <em>Os Resource Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsResourceExcludeOperationImpl extends ExcludeOperationImpl implements OsResourceExcludeOperation {
	/**
	 * The default value of the '{@link #getOsResourceId() <em>Os Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsResourceId() <em>Os Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsResourceId()
	 * @generated
	 * @ordered
	 */
	protected String osResourceId = OS_RESOURCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsResourceExcludeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_RESOURCE_EXCLUDE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsResourceId() {
		return osResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsResourceId(String newOsResourceId) {
		String oldOsResourceId = osResourceId;
		osResourceId = newOsResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID, oldOsResourceId, osResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID:
				return getOsResourceId();
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
			case ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID:
				setOsResourceId((String)newValue);
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
			case ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID:
				setOsResourceId(OS_RESOURCE_ID_EDEFAULT);
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
			case ModulePackage.OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID:
				return OS_RESOURCE_ID_EDEFAULT == null ? osResourceId != null : !OS_RESOURCE_ID_EDEFAULT.equals(osResourceId);
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
		result.append(" (osResourceId: "); //$NON-NLS-1$
		result.append(osResourceId);
		result.append(')');
		return result.toString();
	}

} //OsResourceExcludeOperationImpl
