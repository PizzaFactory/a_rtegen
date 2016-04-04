/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interlink Type Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl#getModeType <em>Mode Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl#getModeDeclarationGroup <em>Mode Declaration Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleInterlinkTypeHeaderImpl extends HeaderFileImpl implements ModuleInterlinkTypeHeader {
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
	 * The cached value of the '{@link #getModeType() <em>Mode Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeType()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeType> modeType;

	/**
	 * The cached value of the '{@link #getModeDeclarationGroup() <em>Mode Declaration Group</em>}' reference list.
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
	protected ModuleInterlinkTypeHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODULE_INTERLINK_TYPE_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.MODULE_INTERLINK_TYPE_HEADER__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeType> getModeType() {
		if (modeType == null) {
			modeType = new EObjectResolvingEList<ModeType>(ModeType.class, this, ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_TYPE);
		}
		return modeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroup> getModeDeclarationGroup() {
		if (modeDeclarationGroup == null) {
			modeDeclarationGroup = new EObjectResolvingEList<ModeDeclarationGroup>(ModeDeclarationGroup.class, this, ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_DECLARATION_GROUP);
		}
		return modeDeclarationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__CONSTANT:
				return getConstant();
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_TYPE:
				return getModeType();
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_DECLARATION_GROUP:
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
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_TYPE:
				getModeType().clear();
				getModeType().addAll((Collection<? extends ModeType>)newValue);
				return;
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_DECLARATION_GROUP:
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
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__CONSTANT:
				getConstant().clear();
				return;
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_TYPE:
				getModeType().clear();
				return;
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_DECLARATION_GROUP:
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
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__CONSTANT:
				return constant != null && !constant.isEmpty();
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_TYPE:
				return modeType != null && !modeType.isEmpty();
			case ModulePackage.MODULE_INTERLINK_TYPE_HEADER__MODE_DECLARATION_GROUP:
				return modeDeclarationGroup != null && !modeDeclarationGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleInterlinkTypeHeaderImpl
