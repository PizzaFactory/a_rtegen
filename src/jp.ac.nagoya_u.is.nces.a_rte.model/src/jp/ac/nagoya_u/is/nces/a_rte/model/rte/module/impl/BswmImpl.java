/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bswm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswmImpl#getPartedBswm <em>Parted Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswmImpl#getModeDeclarationGroup <em>Mode Declaration Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswmImpl extends LogicalCompartmentImpl implements Bswm {
	/**
	 * The cached value of the '{@link #getPartedBswm() <em>Parted Bswm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartedBswm()
	 * @generated
	 * @ordered
	 */
	protected EList<PartedBswm> partedBswm;

	/**
	 * The cached value of the '{@link #getModeDeclarationGroup() <em>Mode Declaration Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclarationGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroup> modeDeclarationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.BSWM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartedBswm> getPartedBswm() {
		if (partedBswm == null) {
			partedBswm = new EObjectWithInverseResolvingEList<PartedBswm>(PartedBswm.class, this, ModulePackage.BSWM__PARTED_BSWM, ModulePackage.PARTED_BSWM__BSWM);
		}
		return partedBswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroup> getModeDeclarationGroup() {
		if (modeDeclarationGroup == null) {
			modeDeclarationGroup = new EObjectContainmentEList<ModeDeclarationGroup>(ModeDeclarationGroup.class, this, ModulePackage.BSWM__MODE_DECLARATION_GROUP);
		}
		return modeDeclarationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PartedBswm getSinglePartedBswm(Partition parent) {
		for (PartedBswm p : this.getPartedBswm()) {
			if (p.getParent() == parent) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.BSWM__PARTED_BSWM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartedBswm()).basicAdd(otherEnd, msgs);
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
			case ModulePackage.BSWM__PARTED_BSWM:
				return ((InternalEList<?>)getPartedBswm()).basicRemove(otherEnd, msgs);
			case ModulePackage.BSWM__MODE_DECLARATION_GROUP:
				return ((InternalEList<?>)getModeDeclarationGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.BSWM__PARTED_BSWM:
				return getPartedBswm();
			case ModulePackage.BSWM__MODE_DECLARATION_GROUP:
				return getModeDeclarationGroup();
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
			case ModulePackage.BSWM__PARTED_BSWM:
				getPartedBswm().clear();
				getPartedBswm().addAll((Collection<? extends PartedBswm>)newValue);
				return;
			case ModulePackage.BSWM__MODE_DECLARATION_GROUP:
				getModeDeclarationGroup().clear();
				getModeDeclarationGroup().addAll((Collection<? extends ModeDeclarationGroup>)newValue);
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
			case ModulePackage.BSWM__PARTED_BSWM:
				getPartedBswm().clear();
				return;
			case ModulePackage.BSWM__MODE_DECLARATION_GROUP:
				getModeDeclarationGroup().clear();
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
			case ModulePackage.BSWM__PARTED_BSWM:
				return partedBswm != null && !partedBswm.isEmpty();
			case ModulePackage.BSWM__MODE_DECLARATION_GROUP:
				return modeDeclarationGroup != null && !modeDeclarationGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModulePackage.BSWM___GET_SINGLE_PARTED_BSWM__PARTITION:
				return getSinglePartedBswm((Partition)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BswmImpl
