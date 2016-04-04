/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PointerTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PointerTypeImpl#getIsConstPointer <em>Is Const Pointer</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PointerTypeImpl#getIsConstTarget <em>Is Const Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerTypeImpl extends TypeImpl implements PointerType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getIsConstPointer() <em>Is Const Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstPointer()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONST_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConstPointer() <em>Is Const Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstPointer()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConstPointer = IS_CONST_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConstTarget() <em>Is Const Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONST_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConstTarget() <em>Is Const Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstTarget()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConstTarget = IS_CONST_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.POINTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && ((EObject)type).eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.POINTER_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.POINTER_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConstPointer() {
		return isConstPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstPointer(Boolean newIsConstPointer) {
		Boolean oldIsConstPointer = isConstPointer;
		isConstPointer = newIsConstPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.POINTER_TYPE__IS_CONST_POINTER, oldIsConstPointer, isConstPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConstTarget() {
		return isConstTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstTarget(Boolean newIsConstTarget) {
		Boolean oldIsConstTarget = isConstTarget;
		isConstTarget = newIsConstTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.POINTER_TYPE__IS_CONST_TARGET, oldIsConstTarget, isConstTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.POINTER_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModulePackage.POINTER_TYPE__IS_CONST_POINTER:
				return getIsConstPointer();
			case ModulePackage.POINTER_TYPE__IS_CONST_TARGET:
				return getIsConstTarget();
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
			case ModulePackage.POINTER_TYPE__TYPE:
				setType((Type)newValue);
				return;
			case ModulePackage.POINTER_TYPE__IS_CONST_POINTER:
				setIsConstPointer((Boolean)newValue);
				return;
			case ModulePackage.POINTER_TYPE__IS_CONST_TARGET:
				setIsConstTarget((Boolean)newValue);
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
			case ModulePackage.POINTER_TYPE__TYPE:
				setType((Type)null);
				return;
			case ModulePackage.POINTER_TYPE__IS_CONST_POINTER:
				setIsConstPointer(IS_CONST_POINTER_EDEFAULT);
				return;
			case ModulePackage.POINTER_TYPE__IS_CONST_TARGET:
				setIsConstTarget(IS_CONST_TARGET_EDEFAULT);
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
			case ModulePackage.POINTER_TYPE__TYPE:
				return type != null;
			case ModulePackage.POINTER_TYPE__IS_CONST_POINTER:
				return IS_CONST_POINTER_EDEFAULT == null ? isConstPointer != null : !IS_CONST_POINTER_EDEFAULT.equals(isConstPointer);
			case ModulePackage.POINTER_TYPE__IS_CONST_TARGET:
				return IS_CONST_TARGET_EDEFAULT == null ? isConstTarget != null : !IS_CONST_TARGET_EDEFAULT.equals(isConstTarget);
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
		result.append(" (isConstPointer: "); //$NON-NLS-1$
		result.append(isConstPointer);
		result.append(", isConstTarget: "); //$NON-NLS-1$
		result.append(isConstTarget);
		result.append(')');
		return result.toString();
	}

} //PointerTypeImpl
