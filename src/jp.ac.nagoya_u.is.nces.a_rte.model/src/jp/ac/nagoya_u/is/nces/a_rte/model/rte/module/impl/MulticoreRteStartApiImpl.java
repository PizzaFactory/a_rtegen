/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicore Rte Start Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreRteStartApiImpl#getCoreStartApiImpl <em>Core Start Api Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MulticoreRteStartApiImpl extends RteLifecycleApiImpl implements MulticoreRteStartApi {
	/**
	 * The cached value of the '{@link #getCoreStartApiImpl() <em>Core Start Api Impl</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreStartApiImpl()
	 * @generated
	 * @ordered
	 */
	protected EList<RteCoreStartApiImpl> coreStartApiImpl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticoreRteStartApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MULTICORE_RTE_START_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteCoreStartApiImpl> getCoreStartApiImpl() {
		if (coreStartApiImpl == null) {
			coreStartApiImpl = new EObjectResolvingEList<RteCoreStartApiImpl>(RteCoreStartApiImpl.class, this, ModulePackage.MULTICORE_RTE_START_API__CORE_START_API_IMPL);
		}
		return coreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MULTICORE_RTE_START_API__CORE_START_API_IMPL:
				return getCoreStartApiImpl();
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
			case ModulePackage.MULTICORE_RTE_START_API__CORE_START_API_IMPL:
				getCoreStartApiImpl().clear();
				getCoreStartApiImpl().addAll((Collection<? extends RteCoreStartApiImpl>)newValue);
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
			case ModulePackage.MULTICORE_RTE_START_API__CORE_START_API_IMPL:
				getCoreStartApiImpl().clear();
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
			case ModulePackage.MULTICORE_RTE_START_API__CORE_START_API_IMPL:
				return coreStartApiImpl != null && !coreStartApiImpl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MulticoreRteStartApiImpl
