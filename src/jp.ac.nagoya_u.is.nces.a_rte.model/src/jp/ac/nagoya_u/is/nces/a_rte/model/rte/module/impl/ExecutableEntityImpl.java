/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityImpl#getRoleParam <em>Role Param</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityImpl#getIsNoMock <em>Is No Mock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableEntityImpl extends FunctionImpl implements ExecutableEntity {
	/**
	 * The cached value of the '{@link #getRoleParam() <em>Role Param</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> roleParam;

	/**
	 * The default value of the '{@link #getIsNoMock() <em>Is No Mock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNoMock()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NO_MOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNoMock() <em>Is No Mock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNoMock()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNoMock = IS_NO_MOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.EXECUTABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getRoleParam() {
		if (roleParam == null) {
			roleParam = new EObjectResolvingEList<Parameter>(Parameter.class, this, ModulePackage.EXECUTABLE_ENTITY__ROLE_PARAM);
		}
		return roleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNoMock() {
		return isNoMock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNoMock(Boolean newIsNoMock) {
		Boolean oldIsNoMock = isNoMock;
		isNoMock = newIsNoMock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.EXECUTABLE_ENTITY__IS_NO_MOCK, oldIsNoMock, isNoMock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.EXECUTABLE_ENTITY__ROLE_PARAM:
				return getRoleParam();
			case ModulePackage.EXECUTABLE_ENTITY__IS_NO_MOCK:
				return getIsNoMock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.EXECUTABLE_ENTITY__ROLE_PARAM:
				getRoleParam().clear();
				getRoleParam().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ModulePackage.EXECUTABLE_ENTITY__IS_NO_MOCK:
				setIsNoMock((Boolean)newValue);
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
			case ModulePackage.EXECUTABLE_ENTITY__ROLE_PARAM:
				getRoleParam().clear();
				return;
			case ModulePackage.EXECUTABLE_ENTITY__IS_NO_MOCK:
				setIsNoMock(IS_NO_MOCK_EDEFAULT);
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
			case ModulePackage.EXECUTABLE_ENTITY__ROLE_PARAM:
				return roleParam != null && !roleParam.isEmpty();
			case ModulePackage.EXECUTABLE_ENTITY__IS_NO_MOCK:
				return IS_NO_MOCK_EDEFAULT == null ? isNoMock != null : !IS_NO_MOCK_EDEFAULT.equals(isNoMock);
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
		result.append(" (isNoMock: "); //$NON-NLS-1$
		result.append(isNoMock);
		result.append(')');
		return result.toString();
	}

} //ExecutableEntityImpl
