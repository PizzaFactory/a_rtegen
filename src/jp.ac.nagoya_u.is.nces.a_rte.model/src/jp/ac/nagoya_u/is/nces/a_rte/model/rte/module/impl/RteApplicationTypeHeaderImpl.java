/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Application Type Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationTypeHeaderImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteApplicationTypeHeaderImpl extends HeaderFileImpl implements RteApplicationTypeHeader {
	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteApplicationTypeHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_APPLICATION_TYPE_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_APPLICATION_TYPE_HEADER__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.RTE_APPLICATION_TYPE_HEADER__CONSTANT:
				return getConstant();
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
			case ModulePackage.RTE_APPLICATION_TYPE_HEADER__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
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
			case ModulePackage.RTE_APPLICATION_TYPE_HEADER__CONSTANT:
				getConstant().clear();
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
			case ModulePackage.RTE_APPLICATION_TYPE_HEADER__CONSTANT:
				return constant != null && !constant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteApplicationTypeHeaderImpl
