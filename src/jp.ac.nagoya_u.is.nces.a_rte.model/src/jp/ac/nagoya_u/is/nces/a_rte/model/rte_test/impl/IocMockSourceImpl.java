/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Mock Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.IocMockSourceImpl#getIocApi <em>Ioc Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocMockSourceImpl extends SourceFileImpl implements IocMockSource {
	/**
	 * The cached value of the '{@link #getIocApi() <em>Ioc Api</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocApi()
	 * @generated
	 * @ordered
	 */
	protected EList<IocApi> iocApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocMockSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RteTestPackage.Literals.IOC_MOCK_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocApi> getIocApi() {
		if (iocApi == null) {
			iocApi = new EObjectResolvingEList<IocApi>(IocApi.class, this, RteTestPackage.IOC_MOCK_SOURCE__IOC_API);
		}
		return iocApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RteTestPackage.IOC_MOCK_SOURCE__IOC_API:
				return getIocApi();
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
			case RteTestPackage.IOC_MOCK_SOURCE__IOC_API:
				getIocApi().clear();
				getIocApi().addAll((Collection<? extends IocApi>)newValue);
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
			case RteTestPackage.IOC_MOCK_SOURCE__IOC_API:
				getIocApi().clear();
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
			case RteTestPackage.IOC_MOCK_SOURCE__IOC_API:
				return iocApi != null && !iocApi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IocMockSourceImpl
