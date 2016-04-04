/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Lifecycle Api File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiFileContentsGroupImpl#getRteLifecycleApi <em>Rte Lifecycle Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteLifecycleApiFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements RteLifecycleApiFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getRteLifecycleApi() <em>Rte Lifecycle Api</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteLifecycleApi()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RTE_LIFECYCLE_API__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP__RTE_LIFECYCLE_API).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteLifecycleApiFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RteLifecycleApi> getRteLifecycleApi() {
		return (EList<RteLifecycleApi>)RTE_LIFECYCLE_API__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP__RTE_LIFECYCLE_API:
				return getRteLifecycleApi();
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
			case ModulePackage.RTE_LIFECYCLE_API_FILE_CONTENTS_GROUP__RTE_LIFECYCLE_API:
				return RTE_LIFECYCLE_API__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //RteLifecycleApiFileContentsGroupImpl
