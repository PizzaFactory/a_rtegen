/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.HeaderFileImpl#getGuardName <em>Guard Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.HeaderFileImpl#getIncludeHeader <em>Include Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HeaderFileImpl extends FileImpl implements HeaderFile {
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
	 * The cached value of the '{@link #getIncludeHeader() <em>Include Header</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderFile> includeHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.HEADER_FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.HEADER_FILE__GUARD_NAME, oldGuardName, guardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderFile> getIncludeHeader() {
		if (includeHeader == null) {
			includeHeader = new EObjectResolvingEList<HeaderFile>(HeaderFile.class, this, ModulePackage.HEADER_FILE__INCLUDE_HEADER);
		}
		return includeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.HEADER_FILE__GUARD_NAME:
				return getGuardName();
			case ModulePackage.HEADER_FILE__INCLUDE_HEADER:
				return getIncludeHeader();
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
			case ModulePackage.HEADER_FILE__GUARD_NAME:
				setGuardName((String)newValue);
				return;
			case ModulePackage.HEADER_FILE__INCLUDE_HEADER:
				getIncludeHeader().clear();
				getIncludeHeader().addAll((Collection<? extends HeaderFile>)newValue);
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
			case ModulePackage.HEADER_FILE__GUARD_NAME:
				setGuardName(GUARD_NAME_EDEFAULT);
				return;
			case ModulePackage.HEADER_FILE__INCLUDE_HEADER:
				getIncludeHeader().clear();
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
			case ModulePackage.HEADER_FILE__GUARD_NAME:
				return GUARD_NAME_EDEFAULT == null ? guardName != null : !GUARD_NAME_EDEFAULT.equals(guardName);
			case ModulePackage.HEADER_FILE__INCLUDE_HEADER:
				return includeHeader != null && !includeHeader.isEmpty();
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

} //HeaderFileImpl
