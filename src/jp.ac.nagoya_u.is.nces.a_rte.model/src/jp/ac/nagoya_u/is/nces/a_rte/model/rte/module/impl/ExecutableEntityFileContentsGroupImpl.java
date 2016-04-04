/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Entity File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityFileContentsGroupImpl#getExecutableEntity <em>Executable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutableEntityFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements ExecutableEntityFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getExecutableEntity() <em>Executable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXECUTABLE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP__EXECUTABLE_ENTITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableEntityFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExecutableEntity> getExecutableEntity() {
		return (EList<ExecutableEntity>)EXECUTABLE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP__EXECUTABLE_ENTITY:
				return getExecutableEntity();
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
			case ModulePackage.EXECUTABLE_ENTITY_FILE_CONTENTS_GROUP__EXECUTABLE_ENTITY:
				return EXECUTABLE_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ExecutableEntityFileContentsGroupImpl
