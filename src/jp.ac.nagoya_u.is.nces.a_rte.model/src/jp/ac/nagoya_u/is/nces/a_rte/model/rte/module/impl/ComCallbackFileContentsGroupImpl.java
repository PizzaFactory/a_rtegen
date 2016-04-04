/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Callback File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackFileContentsGroupImpl#getComCallback <em>Com Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComCallbackFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements ComCallbackFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getComCallback() <em>Com Callback</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComCallback()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COM_CALLBACK__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.COM_CALLBACK_FILE_CONTENTS_GROUP__COM_CALLBACK).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComCallbackFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_CALLBACK_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComCallback> getComCallback() {
		return (EList<ComCallback>)COM_CALLBACK__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_CALLBACK_FILE_CONTENTS_GROUP__COM_CALLBACK:
				return getComCallback();
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
			case ModulePackage.COM_CALLBACK_FILE_CONTENTS_GROUP__COM_CALLBACK:
				return COM_CALLBACK__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ComCallbackFileContentsGroupImpl
