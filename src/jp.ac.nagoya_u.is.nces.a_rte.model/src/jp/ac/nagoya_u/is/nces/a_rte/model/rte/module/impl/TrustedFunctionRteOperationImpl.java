/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function Rte Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteOperationImpl#getActivationFlagOnRxSuccess <em>Activation Flag On Rx Success</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionRteOperationImpl extends SendOperationImpl implements TrustedFunctionRteOperation {
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
	 * The cached value of the '{@link #getTempReturnVariable() <em>Temp Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempReturnVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable tempReturnVariable;

	/**
	 * The cached value of the '{@link #getTrustedFunctionParamVariable() <em>Trusted Function Param Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionParamVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable trustedFunctionParamVariable;

	/**
	 * The cached value of the '{@link #getActivationFlagOnRxSuccess() <em>Activation Flag On Rx Success</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFlagOnRxSuccess()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> activationFlagOnRxSuccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionRteOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION_RTE_OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTempReturnVariable() {
		if (tempReturnVariable != null && ((EObject)tempReturnVariable).eIsProxy()) {
			InternalEObject oldTempReturnVariable = (InternalEObject)tempReturnVariable;
			tempReturnVariable = (Variable)eResolveProxy(oldTempReturnVariable);
			if (tempReturnVariable != oldTempReturnVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
			}
		}
		return tempReturnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTempReturnVariable() {
		return tempReturnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempReturnVariable(Variable newTempReturnVariable) {
		Variable oldTempReturnVariable = tempReturnVariable;
		tempReturnVariable = newTempReturnVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE, oldTempReturnVariable, tempReturnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getTrustedFunctionParamVariable() {
		if (trustedFunctionParamVariable != null && ((EObject)trustedFunctionParamVariable).eIsProxy()) {
			InternalEObject oldTrustedFunctionParamVariable = (InternalEObject)trustedFunctionParamVariable;
			trustedFunctionParamVariable = (LocalVariable)eResolveProxy(oldTrustedFunctionParamVariable);
			if (trustedFunctionParamVariable != oldTrustedFunctionParamVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
			}
		}
		return trustedFunctionParamVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetTrustedFunctionParamVariable() {
		return trustedFunctionParamVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustedFunctionParamVariable(LocalVariable newTrustedFunctionParamVariable) {
		LocalVariable oldTrustedFunctionParamVariable = trustedFunctionParamVariable;
		trustedFunctionParamVariable = newTrustedFunctionParamVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getActivationFlagOnRxSuccess() {
		if (activationFlagOnRxSuccess == null) {
			activationFlagOnRxSuccess = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS);
		}
		return activationFlagOnRxSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				if (resolve) return getTempReturnVariable();
				return basicGetTempReturnVariable();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				if (resolve) return getTrustedFunctionParamVariable();
				return basicGetTrustedFunctionParamVariable();
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				return getActivationFlagOnRxSuccess();
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((LocalVariable)newValue);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				getActivationFlagOnRxSuccess().clear();
				getActivationFlagOnRxSuccess().addAll((Collection<? extends LocalVariable>)newValue);
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				setType((Type)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				setTempReturnVariable((Variable)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((LocalVariable)null);
				return;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				getActivationFlagOnRxSuccess().clear();
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TYPE:
				return type != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TEMP_RETURN_VARIABLE:
				return tempReturnVariable != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE:
				return trustedFunctionParamVariable != null;
			case ModulePackage.TRUSTED_FUNCTION_RTE_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				return activationFlagOnRxSuccess != null && !activationFlagOnRxSuccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrustedFunctionRteOperationImpl
