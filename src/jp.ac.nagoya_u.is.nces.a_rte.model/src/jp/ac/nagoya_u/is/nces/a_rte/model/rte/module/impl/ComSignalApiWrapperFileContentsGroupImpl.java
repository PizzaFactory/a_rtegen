/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapperFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal Api Wrapper File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSignalApiWrapperFileContentsGroupImpl#getComSignalApiWrapper <em>Com Signal Api Wrapper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSignalApiWrapperFileContentsGroupImpl extends FunctionFileContentsGroupImpl implements ComSignalApiWrapperFileContentsGroup {
	/**
	 * The cached setting delegate for the '{@link #getComSignalApiWrapper() <em>Com Signal Api Wrapper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSignalApiWrapper()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COM_SIGNAL_API_WRAPPER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModulePackage.Literals.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP__COM_SIGNAL_API_WRAPPER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalApiWrapperFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComSignalApiWrapper> getComSignalApiWrapper() {
		return (EList<ComSignalApiWrapper>)COM_SIGNAL_API_WRAPPER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP__COM_SIGNAL_API_WRAPPER:
				return getComSignalApiWrapper();
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
			case ModulePackage.COM_SIGNAL_API_WRAPPER_FILE_CONTENTS_GROUP__COM_SIGNAL_API_WRAPPER:
				return COM_SIGNAL_API_WRAPPER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ComSignalApiWrapperFileContentsGroupImpl
