/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getDataParam <em>Data Param</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getStatusVariable <em>Status Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getFilterResultVariable <em>Filter Result Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getNeedsCheckArg <em>Needs Check Arg</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getActivationFlag <em>Activation Flag</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendApiImpl extends RteApiImpl implements SendApi {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<SendOperation> operation;

	/**
	 * The cached value of the '{@link #getDataParam() <em>Data Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataParam()
	 * @generated
	 * @ordered
	 */
	protected Parameter dataParam;

	/**
	 * The cached value of the '{@link #getStatusVariable() <em>Status Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable statusVariable;

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
	 * The cached value of the '{@link #getFilterResultVariable() <em>Filter Result Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterResultVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable filterResultVariable;

	/**
	 * The default value of the '{@link #getNeedsCheckArg() <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCheckArg()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEEDS_CHECK_ARG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedsCheckArg() <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCheckArg()
	 * @generated
	 * @ordered
	 */
	protected Boolean needsCheckArg = NEEDS_CHECK_ARG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivationOperation() <em>Activation Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivationOperation> activationOperation;

	/**
	 * The cached value of the '{@link #getActivationFlag() <em>Activation Flag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFlag()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> activationFlag;

	/**
	 * The cached value of the '{@link #getTAckStatus() <em>TAck Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAckStatus()
	 * @generated
	 * @ordered
	 */
	protected TAckStatus tAckStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SEND_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<SendOperation>(SendOperation.class, this, ModulePackage.SEND_API__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getDataParam() {
		if (dataParam != null && ((EObject)dataParam).eIsProxy()) {
			InternalEObject oldDataParam = (InternalEObject)dataParam;
			dataParam = (Parameter)eResolveProxy(oldDataParam);
			if (dataParam != oldDataParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_API__DATA_PARAM, oldDataParam, dataParam));
			}
		}
		return dataParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetDataParam() {
		return dataParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataParam(Parameter newDataParam) {
		Parameter oldDataParam = dataParam;
		dataParam = newDataParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_API__DATA_PARAM, oldDataParam, dataParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getStatusVariable() {
		if (statusVariable != null && ((EObject)statusVariable).eIsProxy()) {
			InternalEObject oldStatusVariable = (InternalEObject)statusVariable;
			statusVariable = (LocalVariable)eResolveProxy(oldStatusVariable);
			if (statusVariable != oldStatusVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_API__STATUS_VARIABLE, oldStatusVariable, statusVariable));
			}
		}
		return statusVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetStatusVariable() {
		return statusVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusVariable(LocalVariable newStatusVariable) {
		LocalVariable oldStatusVariable = statusVariable;
		statusVariable = newStatusVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_API__STATUS_VARIABLE, oldStatusVariable, statusVariable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE, oldTrustedFunctionParamVariable, trustedFunctionParamVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getFilterResultVariable() {
		if (filterResultVariable != null && ((EObject)filterResultVariable).eIsProxy()) {
			InternalEObject oldFilterResultVariable = (InternalEObject)filterResultVariable;
			filterResultVariable = (LocalVariable)eResolveProxy(oldFilterResultVariable);
			if (filterResultVariable != oldFilterResultVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_API__FILTER_RESULT_VARIABLE, oldFilterResultVariable, filterResultVariable));
			}
		}
		return filterResultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetFilterResultVariable() {
		return filterResultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterResultVariable(LocalVariable newFilterResultVariable) {
		LocalVariable oldFilterResultVariable = filterResultVariable;
		filterResultVariable = newFilterResultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_API__FILTER_RESULT_VARIABLE, oldFilterResultVariable, filterResultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNeedsCheckArg() {
		return needsCheckArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsCheckArg(Boolean newNeedsCheckArg) {
		Boolean oldNeedsCheckArg = needsCheckArg;
		needsCheckArg = newNeedsCheckArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_API__NEEDS_CHECK_ARG, oldNeedsCheckArg, needsCheckArg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationOperation> getActivationOperation() {
		if (activationOperation == null) {
			activationOperation = new EObjectContainmentEList<ActivationOperation>(ActivationOperation.class, this, ModulePackage.SEND_API__ACTIVATION_OPERATION);
		}
		return activationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getActivationFlag() {
		if (activationFlag == null) {
			activationFlag = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.SEND_API__ACTIVATION_FLAG);
		}
		return activationFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus getTAckStatus() {
		if (tAckStatus != null && ((EObject)tAckStatus).eIsProxy()) {
			InternalEObject oldTAckStatus = (InternalEObject)tAckStatus;
			tAckStatus = (TAckStatus)eResolveProxy(oldTAckStatus);
			if (tAckStatus != oldTAckStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SEND_API__TACK_STATUS, oldTAckStatus, tAckStatus));
			}
		}
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAckStatus basicGetTAckStatus() {
		return tAckStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTAckStatus(TAckStatus newTAckStatus) {
		TAckStatus oldTAckStatus = tAckStatus;
		tAckStatus = newTAckStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SEND_API__TACK_STATUS, oldTAckStatus, tAckStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SEND_API__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.SEND_API__ACTIVATION_OPERATION:
				return ((InternalEList<?>)getActivationOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.SEND_API__OPERATION:
				return getOperation();
			case ModulePackage.SEND_API__DATA_PARAM:
				if (resolve) return getDataParam();
				return basicGetDataParam();
			case ModulePackage.SEND_API__STATUS_VARIABLE:
				if (resolve) return getStatusVariable();
				return basicGetStatusVariable();
			case ModulePackage.SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE:
				if (resolve) return getTrustedFunctionParamVariable();
				return basicGetTrustedFunctionParamVariable();
			case ModulePackage.SEND_API__FILTER_RESULT_VARIABLE:
				if (resolve) return getFilterResultVariable();
				return basicGetFilterResultVariable();
			case ModulePackage.SEND_API__NEEDS_CHECK_ARG:
				return getNeedsCheckArg();
			case ModulePackage.SEND_API__ACTIVATION_OPERATION:
				return getActivationOperation();
			case ModulePackage.SEND_API__ACTIVATION_FLAG:
				return getActivationFlag();
			case ModulePackage.SEND_API__TACK_STATUS:
				if (resolve) return getTAckStatus();
				return basicGetTAckStatus();
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
			case ModulePackage.SEND_API__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends SendOperation>)newValue);
				return;
			case ModulePackage.SEND_API__DATA_PARAM:
				setDataParam((Parameter)newValue);
				return;
			case ModulePackage.SEND_API__STATUS_VARIABLE:
				setStatusVariable((LocalVariable)newValue);
				return;
			case ModulePackage.SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((LocalVariable)newValue);
				return;
			case ModulePackage.SEND_API__FILTER_RESULT_VARIABLE:
				setFilterResultVariable((LocalVariable)newValue);
				return;
			case ModulePackage.SEND_API__NEEDS_CHECK_ARG:
				setNeedsCheckArg((Boolean)newValue);
				return;
			case ModulePackage.SEND_API__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				getActivationOperation().addAll((Collection<? extends ActivationOperation>)newValue);
				return;
			case ModulePackage.SEND_API__ACTIVATION_FLAG:
				getActivationFlag().clear();
				getActivationFlag().addAll((Collection<? extends LocalVariable>)newValue);
				return;
			case ModulePackage.SEND_API__TACK_STATUS:
				setTAckStatus((TAckStatus)newValue);
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
			case ModulePackage.SEND_API__OPERATION:
				getOperation().clear();
				return;
			case ModulePackage.SEND_API__DATA_PARAM:
				setDataParam((Parameter)null);
				return;
			case ModulePackage.SEND_API__STATUS_VARIABLE:
				setStatusVariable((LocalVariable)null);
				return;
			case ModulePackage.SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE:
				setTrustedFunctionParamVariable((LocalVariable)null);
				return;
			case ModulePackage.SEND_API__FILTER_RESULT_VARIABLE:
				setFilterResultVariable((LocalVariable)null);
				return;
			case ModulePackage.SEND_API__NEEDS_CHECK_ARG:
				setNeedsCheckArg(NEEDS_CHECK_ARG_EDEFAULT);
				return;
			case ModulePackage.SEND_API__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				return;
			case ModulePackage.SEND_API__ACTIVATION_FLAG:
				getActivationFlag().clear();
				return;
			case ModulePackage.SEND_API__TACK_STATUS:
				setTAckStatus((TAckStatus)null);
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
			case ModulePackage.SEND_API__OPERATION:
				return operation != null && !operation.isEmpty();
			case ModulePackage.SEND_API__DATA_PARAM:
				return dataParam != null;
			case ModulePackage.SEND_API__STATUS_VARIABLE:
				return statusVariable != null;
			case ModulePackage.SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE:
				return trustedFunctionParamVariable != null;
			case ModulePackage.SEND_API__FILTER_RESULT_VARIABLE:
				return filterResultVariable != null;
			case ModulePackage.SEND_API__NEEDS_CHECK_ARG:
				return NEEDS_CHECK_ARG_EDEFAULT == null ? needsCheckArg != null : !NEEDS_CHECK_ARG_EDEFAULT.equals(needsCheckArg);
			case ModulePackage.SEND_API__ACTIVATION_OPERATION:
				return activationOperation != null && !activationOperation.isEmpty();
			case ModulePackage.SEND_API__ACTIVATION_FLAG:
				return activationFlag != null && !activationFlag.isEmpty();
			case ModulePackage.SEND_API__TACK_STATUS:
				return tAckStatus != null;
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
		result.append(" (needsCheckArg: "); //$NON-NLS-1$
		result.append(needsCheckArg);
		result.append(')');
		return result.toString();
	}

} //SendApiImpl
