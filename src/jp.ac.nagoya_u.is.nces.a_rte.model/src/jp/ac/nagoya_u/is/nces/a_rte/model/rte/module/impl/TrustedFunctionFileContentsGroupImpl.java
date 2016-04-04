/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionFileContentsGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionFileContentsGroupImpl#getTrustedFunction <em>Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements TrustedFunctionFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getTrustedFunction() <em>Trusted Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRUSTED_FUNCTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP__TRUSTED_FUNCTION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TrustedFunction> getTrustedFunction() {
		return (EList<TrustedFunction>)TRUSTED_FUNCTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP__TRUSTED_FUNCTION:
				return getTrustedFunction();
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
			case ModulePackage.TRUSTED_FUNCTION_FILE_CONTENTS_GROUP__TRUSTED_FUNCTION:
				return TRUSTED_FUNCTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TrustedFunctionFileContentsGroupImpl
