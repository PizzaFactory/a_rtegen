/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicore Schm Init Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreSchmInitApiImpl#getCoreInitApiImpl <em>Core Init Api Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MulticoreSchmInitApiImpl extends SchmInitApiImpl implements MulticoreSchmInitApi {
	/**
	 * The cached value of the '{@link #getCoreInitApiImpl() <em>Core Init Api Impl</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreInitApiImpl()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmCoreInitApiImpl> coreInitApiImpl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticoreSchmInitApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MULTICORE_SCHM_INIT_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmCoreInitApiImpl> getCoreInitApiImpl() {
		if (coreInitApiImpl == null) {
			coreInitApiImpl = new EObjectResolvingEList<SchmCoreInitApiImpl>(SchmCoreInitApiImpl.class, this, ModulePackage.MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL);
		}
		return coreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL:
				return getCoreInitApiImpl();
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
			case ModulePackage.MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL:
				getCoreInitApiImpl().clear();
				getCoreInitApiImpl().addAll((Collection<? extends SchmCoreInitApiImpl>)newValue);
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
			case ModulePackage.MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL:
				getCoreInitApiImpl().clear();
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
			case ModulePackage.MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL:
				return coreInitApiImpl != null && !coreInitApiImpl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MulticoreSchmInitApiImpl
