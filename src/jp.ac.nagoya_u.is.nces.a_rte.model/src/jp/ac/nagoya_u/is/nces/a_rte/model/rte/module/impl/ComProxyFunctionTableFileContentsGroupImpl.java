/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionTableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Proxy Function Table File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionTableFileContentsGroupImpl#getSrWriteProxyName <em>Sr Write Proxy Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComProxyFunctionTableFileContentsGroupImpl extends ModuleObjectImpl implements ComProxyFunctionTableFileContentsGroup {
	/**
	 * The cached value of the '{@link #getSrWriteProxyName() <em>Sr Write Proxy Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrWriteProxyName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> srWriteProxyName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComProxyFunctionTableFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSrWriteProxyName() {
		if (srWriteProxyName == null) {
			srWriteProxyName = new EDataTypeUniqueEList<String>(String.class, this, ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP__SR_WRITE_PROXY_NAME);
		}
		return srWriteProxyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP__SR_WRITE_PROXY_NAME:
				return getSrWriteProxyName();
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
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP__SR_WRITE_PROXY_NAME:
				getSrWriteProxyName().clear();
				getSrWriteProxyName().addAll((Collection<? extends String>)newValue);
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
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP__SR_WRITE_PROXY_NAME:
				getSrWriteProxyName().clear();
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
			case ModulePackage.COM_PROXY_FUNCTION_TABLE_FILE_CONTENTS_GROUP__SR_WRITE_PROXY_NAME:
				return srWriteProxyName != null && !srWriteProxyName.isEmpty();
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
		result.append(" (srWriteProxyName: "); //$NON-NLS-1$
		result.append(srWriteProxyName);
		result.append(')');
		return result.toString();
	}

} //ComProxyFunctionTableFileContentsGroupImpl
