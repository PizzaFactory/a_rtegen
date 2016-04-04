/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestImpl#getOsStubConstant <em>Os Stub Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestImpl#getComStubConstant <em>Com Stub Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteTestImpl extends MinimalEObjectImpl.Container implements RteTest {
	/**
	 * The cached value of the '{@link #getOsStubConstant() <em>Os Stub Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsStubConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> osStubConstant;

	/**
	 * The cached value of the '{@link #getComStubConstant() <em>Com Stub Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComStubConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> comStubConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RteTestPackage.Literals.RTE_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getOsStubConstant() {
		if (osStubConstant == null) {
			osStubConstant = new EObjectContainmentEList<Constant>(Constant.class, this, RteTestPackage.RTE_TEST__OS_STUB_CONSTANT);
		}
		return osStubConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getComStubConstant() {
		if (comStubConstant == null) {
			comStubConstant = new EObjectContainmentEList<Constant>(Constant.class, this, RteTestPackage.RTE_TEST__COM_STUB_CONSTANT);
		}
		return comStubConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RteTestPackage.RTE_TEST__OS_STUB_CONSTANT:
				return ((InternalEList<?>)getOsStubConstant()).basicRemove(otherEnd, msgs);
			case RteTestPackage.RTE_TEST__COM_STUB_CONSTANT:
				return ((InternalEList<?>)getComStubConstant()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RteTestPackage.RTE_TEST__OS_STUB_CONSTANT:
				return getOsStubConstant();
			case RteTestPackage.RTE_TEST__COM_STUB_CONSTANT:
				return getComStubConstant();
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
			case RteTestPackage.RTE_TEST__OS_STUB_CONSTANT:
				getOsStubConstant().clear();
				getOsStubConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case RteTestPackage.RTE_TEST__COM_STUB_CONSTANT:
				getComStubConstant().clear();
				getComStubConstant().addAll((Collection<? extends Constant>)newValue);
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
			case RteTestPackage.RTE_TEST__OS_STUB_CONSTANT:
				getOsStubConstant().clear();
				return;
			case RteTestPackage.RTE_TEST__COM_STUB_CONSTANT:
				getComStubConstant().clear();
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
			case RteTestPackage.RTE_TEST__OS_STUB_CONSTANT:
				return osStubConstant != null && !osStubConstant.isEmpty();
			case RteTestPackage.RTE_TEST__COM_STUB_CONSTANT:
				return comStubConstant != null && !comStubConstant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteTestImpl
