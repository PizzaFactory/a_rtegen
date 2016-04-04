/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Initialize Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocInitializeOperationImpl#getInitIocApi <em>Init Ioc Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocInitializeOperationImpl extends InitializeOperationImpl implements IocInitializeOperation {
	/**
	 * The cached value of the '{@link #getInitIocApi() <em>Init Ioc Api</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitIocApi()
	 * @generated
	 * @ordered
	 */
	protected EList<IocApi> initIocApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocInitializeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_INITIALIZE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocApi> getInitIocApi() {
		if (initIocApi == null) {
			initIocApi = new EObjectResolvingEList<IocApi>(IocApi.class, this, ModulePackage.IOC_INITIALIZE_OPERATION__INIT_IOC_API);
		}
		return initIocApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.IOC_INITIALIZE_OPERATION__INIT_IOC_API:
				return getInitIocApi();
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
			case ModulePackage.IOC_INITIALIZE_OPERATION__INIT_IOC_API:
				getInitIocApi().clear();
				getInitIocApi().addAll((Collection<? extends IocApi>)newValue);
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
			case ModulePackage.IOC_INITIALIZE_OPERATION__INIT_IOC_API:
				getInitIocApi().clear();
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
			case ModulePackage.IOC_INITIALIZE_OPERATION__INIT_IOC_API:
				return initIocApi != null && !initIocApi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IocInitializeOperationImpl
