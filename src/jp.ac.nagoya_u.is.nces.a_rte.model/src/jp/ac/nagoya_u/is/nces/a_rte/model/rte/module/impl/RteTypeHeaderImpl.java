/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Type Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl#getRteType <em>Rte Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl#getRteTypeConstant <em>Rte Type Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl#getProvidesSignalGroupTransmission <em>Provides Signal Group Transmission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteTypeHeaderImpl extends HeaderFileImpl implements RteTypeHeader {
	/**
	 * The cached value of the '{@link #getRteType() <em>Rte Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> rteType;

	/**
	 * The cached value of the '{@link #getRteTypeConstant() <em>Rte Type Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteTypeConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> rteTypeConstant;

	/**
	 * The default value of the '{@link #getProvidesSignalGroupTransmission() <em>Provides Signal Group Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesSignalGroupTransmission()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROVIDES_SIGNAL_GROUP_TRANSMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvidesSignalGroupTransmission() <em>Provides Signal Group Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesSignalGroupTransmission()
	 * @generated
	 * @ordered
	 */
	protected Boolean providesSignalGroupTransmission = PROVIDES_SIGNAL_GROUP_TRANSMISSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteTypeHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_TYPE_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRteType() {
		if (rteType == null) {
			rteType = new EObjectResolvingEList<Type>(Type.class, this, ModulePackage.RTE_TYPE_HEADER__RTE_TYPE);
		}
		return rteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getRteTypeConstant() {
		if (rteTypeConstant == null) {
			rteTypeConstant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_TYPE_HEADER__RTE_TYPE_CONSTANT);
		}
		return rteTypeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getProvidesSignalGroupTransmission() {
		return providesSignalGroupTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesSignalGroupTransmission(Boolean newProvidesSignalGroupTransmission) {
		Boolean oldProvidesSignalGroupTransmission = providesSignalGroupTransmission;
		providesSignalGroupTransmission = newProvidesSignalGroupTransmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_TYPE_HEADER__PROVIDES_SIGNAL_GROUP_TRANSMISSION, oldProvidesSignalGroupTransmission, providesSignalGroupTransmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE:
				return getRteType();
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE_CONSTANT:
				return getRteTypeConstant();
			case ModulePackage.RTE_TYPE_HEADER__PROVIDES_SIGNAL_GROUP_TRANSMISSION:
				return getProvidesSignalGroupTransmission();
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
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE:
				getRteType().clear();
				getRteType().addAll((Collection<? extends Type>)newValue);
				return;
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE_CONSTANT:
				getRteTypeConstant().clear();
				getRteTypeConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE_TYPE_HEADER__PROVIDES_SIGNAL_GROUP_TRANSMISSION:
				setProvidesSignalGroupTransmission((Boolean)newValue);
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
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE:
				getRteType().clear();
				return;
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE_CONSTANT:
				getRteTypeConstant().clear();
				return;
			case ModulePackage.RTE_TYPE_HEADER__PROVIDES_SIGNAL_GROUP_TRANSMISSION:
				setProvidesSignalGroupTransmission(PROVIDES_SIGNAL_GROUP_TRANSMISSION_EDEFAULT);
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
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE:
				return rteType != null && !rteType.isEmpty();
			case ModulePackage.RTE_TYPE_HEADER__RTE_TYPE_CONSTANT:
				return rteTypeConstant != null && !rteTypeConstant.isEmpty();
			case ModulePackage.RTE_TYPE_HEADER__PROVIDES_SIGNAL_GROUP_TRANSMISSION:
				return PROVIDES_SIGNAL_GROUP_TRANSMISSION_EDEFAULT == null ? providesSignalGroupTransmission != null : !PROVIDES_SIGNAL_GROUP_TRANSMISSION_EDEFAULT.equals(providesSignalGroupTransmission);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (providesSignalGroupTransmission: "); //$NON-NLS-1$
		result.append(providesSignalGroupTransmission);
		result.append(')');
		return result.toString();
	}

} //RteTypeHeaderImpl
