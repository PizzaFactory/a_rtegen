/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Schedulable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityImpl#getParentPartedBswm <em>Parent Parted Bswm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswSchedulableEntityImpl extends ExecutableEntityImpl implements BswSchedulableEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswSchedulableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.BSW_SCHEDULABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartedBswm getParentPartedBswm() {
		if (eContainerFeatureID() != ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM) return null;
		return (PartedBswm)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPartedBswm(PartedBswm newParentPartedBswm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPartedBswm, ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPartedBswm(PartedBswm newParentPartedBswm) {
		if (newParentPartedBswm != eInternalContainer() || (eContainerFeatureID() != ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM && newParentPartedBswm != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParentPartedBswm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPartedBswm != null)
				msgs = ((InternalEObject)newParentPartedBswm).eInverseAdd(this, ModulePackage.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY, PartedBswm.class, msgs);
			msgs = basicSetParentPartedBswm(newParentPartedBswm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM, newParentPartedBswm, newParentPartedBswm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPartedBswm((PartedBswm)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				return basicSetParentPartedBswm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				return eInternalContainer().eInverseRemove(this, ModulePackage.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY, PartedBswm.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				return getParentPartedBswm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				setParentPartedBswm((PartedBswm)newValue);
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
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				setParentPartedBswm((PartedBswm)null);
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
			case ModulePackage.BSW_SCHEDULABLE_ENTITY__PARENT_PARTED_BSWM:
				return getParentPartedBswm() != null;
		}
		return super.eIsSet(featureID);
	}

} //BswSchedulableEntityImpl
