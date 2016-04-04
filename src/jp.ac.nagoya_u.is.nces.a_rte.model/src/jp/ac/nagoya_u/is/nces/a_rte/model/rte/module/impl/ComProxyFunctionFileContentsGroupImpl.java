/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Proxy Function File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComProxyFunctionFileContentsGroupImpl#getComProxyFunction <em>Com Proxy Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComProxyFunctionFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements ComProxyFunctionFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getComProxyFunction() <em>Com Proxy Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComProxyFunction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COM_PROXY_FUNCTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP__COM_PROXY_FUNCTION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComProxyFunctionFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComProxyFunction> getComProxyFunction() {
		return (EList<ComProxyFunction>)COM_PROXY_FUNCTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP__COM_PROXY_FUNCTION:
				return getComProxyFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModulePackage.COM_PROXY_FUNCTION_FILE_CONTENTS_GROUP__COM_PROXY_FUNCTION:
				return COM_PROXY_FUNCTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ComProxyFunctionFileContentsGroupImpl
