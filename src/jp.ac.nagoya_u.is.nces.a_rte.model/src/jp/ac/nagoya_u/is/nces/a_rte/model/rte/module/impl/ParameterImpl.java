/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl#getPassType <em>Pass Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl#getHasConst <em>Has Const</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends VariableImpl implements Parameter {
	/**
	 * The default value of the '{@link #getPassType() <em>Pass Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterPassTypeEnum PASS_TYPE_EDEFAULT = ParameterPassTypeEnum.VALUE;

	/**
	 * The cached value of the '{@link #getPassType() <em>Pass Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassType()
	 * @generated
	 * @ordered
	 */
	protected ParameterPassTypeEnum passType = PASS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionEnum DIRECTION_EDEFAULT = ParameterDirectionEnum.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionEnum direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasConst() <em>Has Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasConst() <em>Has Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConst()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasConst = HAS_CONST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPassTypeEnum getPassType() {
		return passType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassType(ParameterPassTypeEnum newPassType) {
		ParameterPassTypeEnum oldPassType = passType;
		passType = newPassType == null ? PASS_TYPE_EDEFAULT : newPassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARAMETER__PASS_TYPE, oldPassType, passType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionEnum getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionEnum newDirection) {
		ParameterDirectionEnum oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasConst() {
		return hasConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConst(Boolean newHasConst) {
		Boolean oldHasConst = hasConst;
		hasConst = newHasConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARAMETER__HAS_CONST, oldHasConst, hasConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.PARAMETER__PASS_TYPE:
				return getPassType();
			case ModulePackage.PARAMETER__DIRECTION:
				return getDirection();
			case ModulePackage.PARAMETER__HAS_CONST:
				return getHasConst();
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
			case ModulePackage.PARAMETER__PASS_TYPE:
				setPassType((ParameterPassTypeEnum)newValue);
				return;
			case ModulePackage.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionEnum)newValue);
				return;
			case ModulePackage.PARAMETER__HAS_CONST:
				setHasConst((Boolean)newValue);
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
			case ModulePackage.PARAMETER__PASS_TYPE:
				setPassType(PASS_TYPE_EDEFAULT);
				return;
			case ModulePackage.PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ModulePackage.PARAMETER__HAS_CONST:
				setHasConst(HAS_CONST_EDEFAULT);
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
			case ModulePackage.PARAMETER__PASS_TYPE:
				return passType != PASS_TYPE_EDEFAULT;
			case ModulePackage.PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ModulePackage.PARAMETER__HAS_CONST:
				return HAS_CONST_EDEFAULT == null ? hasConst != null : !HAS_CONST_EDEFAULT.equals(hasConst);
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
		result.append(" (passType: "); //$NON-NLS-1$
		result.append(passType);
		result.append(", direction: "); //$NON-NLS-1$
		result.append(direction);
		result.append(", hasConst: "); //$NON-NLS-1$
		result.append(hasConst);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
