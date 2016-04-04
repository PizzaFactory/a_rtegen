/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LogicalCompartmentImpl#getCompartmentName <em>Compartment Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LogicalCompartmentImpl extends ModuleReferrableImpl implements LogicalCompartment {
	/**
	 * The default value of the '{@link #getCompartmentName() <em>Compartment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARTMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompartmentName() <em>Compartment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentName()
	 * @generated
	 * @ordered
	 */
	protected String compartmentName = COMPARTMENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.LOGICAL_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompartmentName() {
		return compartmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentName(String newCompartmentName) {
		String oldCompartmentName = compartmentName;
		compartmentName = newCompartmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.LOGICAL_COMPARTMENT__COMPARTMENT_NAME, oldCompartmentName, compartmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.LOGICAL_COMPARTMENT__COMPARTMENT_NAME:
				return getCompartmentName();
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
			case ModulePackage.LOGICAL_COMPARTMENT__COMPARTMENT_NAME:
				setCompartmentName((String)newValue);
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
			case ModulePackage.LOGICAL_COMPARTMENT__COMPARTMENT_NAME:
				setCompartmentName(COMPARTMENT_NAME_EDEFAULT);
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
			case ModulePackage.LOGICAL_COMPARTMENT__COMPARTMENT_NAME:
				return COMPARTMENT_NAME_EDEFAULT == null ? compartmentName != null : !COMPARTMENT_NAME_EDEFAULT.equals(compartmentName);
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
		result.append(" (compartmentName: "); //$NON-NLS-1$
		result.append(compartmentName);
		result.append(')');
		return result.toString();
	}

} //LogicalCompartmentImpl
