/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function Com Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl#getAccessTrustedFunction <em>Access Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl#getIsGroup <em>Is Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionComSendOperationImpl extends ComSendOperationImpl implements TrustedFunctionComSendOperation {
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
	 * The cached value of the '{@link #getAccessTrustedFunction() <em>Access Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalTrustedFunction accessTrustedFunction;

	/**
	 * The cached value of the '{@link #getTrustedFunctionParamVariable() <em>Trusted Function Param Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionParamVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable trustedFunctionParamVariable;

	/**
	 * The default value of the '{@link #getIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroup()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGroup = IS_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionComSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION_COM_SEND_OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalTrustedFunction getAccessTrustedFunction() {
		if (accessTrustedFunction != null && ((EObject)accessTrustedFunction).eIsProxy()) {
			InternalEObject oldAccessTrustedFunction = (InternalEObject)accessTrustedFunction;
			accessTrustedFunction = (ComSendSignalTrustedFunction)eResolveProxy(oldAccessTrustedFunction);
			if (accessTrustedFunction != oldAccessTrustedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION, oldAccessTrustedFunction, accessTrustedFunction));
			}
		}
		return accessTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalTrustedFunction basicGetAccessTrustedFunction() {
		return accessTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTrustedFunction(ComSendSignalTrustedFunction newAccessTrustedFunction) {
		ComSendSignalTrustedFunction oldAccessTrustedFunction = accessTrustedFunction;
		accessTrustedFunction = newAccessTrustedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION, oldAccessTrustedFunction, accessTrustedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTrustedFunctionParamVariable() {
		if (trustedFunctionParamVariable != null && ((EObject)trustedFunctionParamVariable).eIsProxy()) {
			InternalEObject oldTrustedFunctionParamVariable = (InternalEObject)trustedFunctionParamVariable;
			trustedFunctionParamVariable = (Variable)eResolveProxy(oldTrustedFunctionParamVariable);
			if (trustedFunctionParamVariable != oldTrustedFunctionParamVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
			}
		}
		return trustedFunctionParamVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTrustedFunctionParamVariable() {
		return trustedFunctionParamVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustedFunctionParamVariable(Variable newTrustedFunctionParamVariable) {
		Variable oldTrustedFunctionParamVariable = trustedFunctionParamVariable;
		trustedFunctionParamVariable = newTrustedFunctionParamVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsGroup() {
		return isGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGroup(Boolean newIsGroup) {
		Boolean oldIsGroup = isGroup;
		isGroup = newIsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__IS_GROUP, oldIsGroup, isGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				if (resolve) return getAccessTrustedFunction();
				return basicGetAccessTrustedFunction();
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				if (resolve) return getTrustedFunctionParamVariable();
				return basicGetTrustedFunctionParamVariable();
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__IS_GROUP:
				return getIsGroup();
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
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				setAccessTrustedFunction((ComSendSignalTrustedFunction)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((Variable)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__IS_GROUP:
				setIsGroup((Boolean)newValue);
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
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE:
				setType((Type)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				setAccessTrustedFunction((ComSendSignalTrustedFunction)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((Variable)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__IS_GROUP:
				setIsGroup(IS_GROUP_EDEFAULT);
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
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TYPE:
				return type != null;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				return accessTrustedFunction != null;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				return trustedFunctionParamVariable != null;
			case ModulePackage.TRUSTED_FUNCTION_COM_SEND_OPERATION__IS_GROUP:
				return IS_GROUP_EDEFAULT == null ? isGroup != null : !IS_GROUP_EDEFAULT.equals(isGroup);
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
		result.append(" (isGroup: "); //$NON-NLS-1$
		result.append(isGroup);
		result.append(')');
		return result.toString();
	}

} //TrustedFunctionComSendOperationImpl
