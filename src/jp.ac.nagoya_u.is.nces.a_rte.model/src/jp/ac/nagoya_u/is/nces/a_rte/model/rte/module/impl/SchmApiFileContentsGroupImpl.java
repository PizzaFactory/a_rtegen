/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Api File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiFileContentsGroupImpl#getSchmApi <em>Schm Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmApiFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements SchmApiFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getSchmApi() <em>Schm Api</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmApi()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SCHM_API__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.SCHM_API_FILE_CONTENTS_GROUP__SCHM_API).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchmApiFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_API_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SchmApi> getSchmApi() {
		return (EList<SchmApi>)SCHM_API__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SCHM_API_FILE_CONTENTS_GROUP__SCHM_API:
				return getSchmApi();
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
			case ModulePackage.SCHM_API_FILE_CONTENTS_GROUP__SCHM_API:
				return SCHM_API__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //SchmApiFileContentsGroupImpl
