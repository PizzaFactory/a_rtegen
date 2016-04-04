/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeTypeImpl#getGuardName <em>Guard Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeTypeImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeTypeImpl extends TypeImpl implements ModeType {
	/**
	 * The default value of the '{@link #getGuardName() <em>Guard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardName()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardName() <em>Guard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardName()
	 * @generated
	 * @ordered
	 */
	protected String guardName = GUARD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected Type implementationDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardName() {
		return guardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardName(String newGuardName) {
		String oldGuardName = guardName;
		guardName = newGuardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_TYPE__GUARD_NAME, oldGuardName, guardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getImplementationDataType() {
		if (implementationDataType != null && ((EObject)implementationDataType).eIsProxy()) {
			InternalEObject oldImplementationDataType = (InternalEObject)implementationDataType;
			implementationDataType = (Type)eResolveProxy(oldImplementationDataType);
			if (implementationDataType != oldImplementationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODE_TYPE__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
			}
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetImplementationDataType() {
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDataType(Type newImplementationDataType) {
		Type oldImplementationDataType = implementationDataType;
		implementationDataType = newImplementationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_TYPE__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MODE_TYPE__GUARD_NAME:
				return getGuardName();
			case ModulePackage.MODE_TYPE__IMPLEMENTATION_DATA_TYPE:
				if (resolve) return getImplementationDataType();
				return basicGetImplementationDataType();
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
			case ModulePackage.MODE_TYPE__GUARD_NAME:
				setGuardName((String)newValue);
				return;
			case ModulePackage.MODE_TYPE__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((Type)newValue);
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
			case ModulePackage.MODE_TYPE__GUARD_NAME:
				setGuardName(GUARD_NAME_EDEFAULT);
				return;
			case ModulePackage.MODE_TYPE__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((Type)null);
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
			case ModulePackage.MODE_TYPE__GUARD_NAME:
				return GUARD_NAME_EDEFAULT == null ? guardName != null : !GUARD_NAME_EDEFAULT.equals(guardName);
			case ModulePackage.MODE_TYPE__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null;
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
		result.append(" (guardName: "); //$NON-NLS-1$
		result.append(guardName);
		result.append(')');
		return result.toString();
	}

} //ModeTypeImpl
