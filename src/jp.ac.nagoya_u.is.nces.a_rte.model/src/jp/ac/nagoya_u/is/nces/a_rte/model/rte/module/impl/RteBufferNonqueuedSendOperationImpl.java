/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Buffer Nonqueued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl#getAccessVariable <em>Access Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl#getFilterOperation <em>Filter Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl#getActivationFlagOnRxSuccess <em>Activation Flag On Rx Success</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBufferNonqueuedSendOperationImpl extends SendOperationImpl implements RteBufferNonqueuedSendOperation {
	/**
	 * The cached value of the '{@link #getAccessVariable() <em>Access Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessVariable()
	 * @generated
	 * @ordered
	 */
	protected RteBufferVariableSet accessVariable;

	/**
	 * The cached value of the '{@link #getFilterOperation() <em>Filter Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperation()
	 * @generated
	 * @ordered
	 */
	protected FilterOperation filterOperation;

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
	protected RteBufferNonqueuedSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_BUFFER_NONQUEUED_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferVariableSet getAccessVariable() {
		if (accessVariable != null && ((EObject)accessVariable).eIsProxy()) {
			InternalEObject oldAccessVariable = (InternalEObject)accessVariable;
			accessVariable = (RteBufferVariableSet)eResolveProxy(oldAccessVariable);
			if (accessVariable != oldAccessVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE, oldAccessVariable, accessVariable));
			}
		}
		return accessVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferVariableSet basicGetAccessVariable() {
		return accessVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessVariable(RteBufferVariableSet newAccessVariable) {
		RteBufferVariableSet oldAccessVariable = accessVariable;
		accessVariable = newAccessVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE, oldAccessVariable, accessVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperation getFilterOperation() {
		return filterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterOperation(FilterOperation newFilterOperation, NotificationChain msgs) {
		FilterOperation oldFilterOperation = filterOperation;
		filterOperation = newFilterOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, oldFilterOperation, newFilterOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOperation(FilterOperation newFilterOperation) {
		if (newFilterOperation != filterOperation) {
			NotificationChain msgs = null;
			if (filterOperation != null)
				msgs = ((InternalEObject)filterOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, null, msgs);
			if (newFilterOperation != null)
				msgs = ((InternalEObject)newFilterOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, null, msgs);
			msgs = basicSetFilterOperation(newFilterOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION, newFilterOperation, newFilterOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getActivationFlagOnRxSuccess() {
		if (activationFlagOnRxSuccess == null) {
			activationFlagOnRxSuccess = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS);
		}
		return activationFlagOnRxSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				return basicSetFilterOperation(null, msgs);
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				if (resolve) return getAccessVariable();
				return basicGetAccessVariable();
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				return getFilterOperation();
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				setAccessVariable((RteBufferVariableSet)newValue);
				return;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				setFilterOperation((FilterOperation)newValue);
				return;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				setAccessVariable((RteBufferVariableSet)null);
				return;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				setFilterOperation((FilterOperation)null);
				return;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
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
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE:
				return accessVariable != null;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION:
				return filterOperation != null;
			case ModulePackage.RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACTIVATION_FLAG_ON_RX_SUCCESS:
				return activationFlagOnRxSuccess != null && !activationFlagOnRxSuccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteBufferNonqueuedSendOperationImpl
