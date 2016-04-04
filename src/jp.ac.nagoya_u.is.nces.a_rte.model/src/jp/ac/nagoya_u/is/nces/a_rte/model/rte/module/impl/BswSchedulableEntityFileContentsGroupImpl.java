/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Schedulable Entity File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityFileContentsGroupImpl#getBswSchedulableEntity <em>Bsw Schedulable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswSchedulableEntityFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements BswSchedulableEntityFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getBswSchedulableEntity() <em>Bsw Schedulable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswSchedulableEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BSW_SCHEDULABLE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP__BSW_SCHEDULABLE_ENTITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswSchedulableEntityFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BswSchedulableEntity> getBswSchedulableEntity() {
		return (EList<BswSchedulableEntity>)BSW_SCHEDULABLE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP__BSW_SCHEDULABLE_ENTITY:
				return getBswSchedulableEntity();
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
			case ModulePackage.BSW_SCHEDULABLE_ENTITY_FILE_CONTENTS_GROUP__BSW_SCHEDULABLE_ENTITY:
				return BSW_SCHEDULABLE_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //BswSchedulableEntityFileContentsGroupImpl
