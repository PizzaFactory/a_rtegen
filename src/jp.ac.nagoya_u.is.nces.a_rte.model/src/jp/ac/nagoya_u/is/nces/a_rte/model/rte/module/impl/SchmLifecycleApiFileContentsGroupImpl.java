/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Lifecycle Api File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiFileContentsGroupImpl#getSchmLifecycleApi <em>Schm Lifecycle Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmLifecycleApiFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements SchmLifecycleApiFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getSchmLifecycleApi() <em>Schm Lifecycle Api</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmLifecycleApi()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SCHM_LIFECYCLE_API__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP__SCHM_LIFECYCLE_API).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchmLifecycleApiFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SchmLifecycleApi> getSchmLifecycleApi() {
		return (EList<SchmLifecycleApi>)SCHM_LIFECYCLE_API__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP__SCHM_LIFECYCLE_API:
				return getSchmLifecycleApi();
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
			case ModulePackage.SCHM_LIFECYCLE_API_FILE_CONTENTS_GROUP__SCHM_LIFECYCLE_API:
				return SCHM_LIFECYCLE_API__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //SchmLifecycleApiFileContentsGroupImpl
