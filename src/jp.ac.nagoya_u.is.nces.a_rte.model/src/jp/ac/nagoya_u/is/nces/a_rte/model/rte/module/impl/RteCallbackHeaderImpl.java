/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Callback Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCallbackHeaderImpl#getComCallbackGroup <em>Com Callback Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteCallbackHeaderImpl extends HeaderFileImpl implements RteCallbackHeader {
	/**
	 * The cached value of the '{@link #getComCallbackGroup() <em>Com Callback Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComCallbackGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ComCallbackFileContentsGroup> comCallbackGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteCallbackHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_CALLBACK_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComCallbackFileContentsGroup> getComCallbackGroup() {
		if (comCallbackGroup == null) {
			comCallbackGroup = new EObjectContainmentEList<ComCallbackFileContentsGroup>(ComCallbackFileContentsGroup.class, this, ModulePackage.RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP);
		}
		return comCallbackGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP:
				return ((InternalEList<?>)getComCallbackGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP:
				return getComCallbackGroup();
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
			case ModulePackage.RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP:
				getComCallbackGroup().clear();
				getComCallbackGroup().addAll((Collection<? extends ComCallbackFileContentsGroup>)newValue);
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
			case ModulePackage.RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP:
				getComCallbackGroup().clear();
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
			case ModulePackage.RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP:
				return comCallbackGroup != null && !comCallbackGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteCallbackHeaderImpl
