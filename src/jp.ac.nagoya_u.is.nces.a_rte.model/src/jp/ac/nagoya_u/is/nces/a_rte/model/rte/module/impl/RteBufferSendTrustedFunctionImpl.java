/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferSendTrustedFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Buffer Send Trusted Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferSendTrustedFunctionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferSendTrustedFunctionImpl#getDataVariable <em>Data Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBufferSendTrustedFunctionImpl extends TrustedFunctionImpl implements RteBufferSendTrustedFunction {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected RteBufferQueuedSendOperation operation;

	/**
	 * The cached value of the '{@link #getDataVariable() <em>Data Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable dataVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBufferSendTrustedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_BUFFER_SEND_TRUSTED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferQueuedSendOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(RteBufferQueuedSendOperation newOperation, NotificationChain msgs) {
		RteBufferQueuedSendOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(RteBufferQueuedSendOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getDataVariable() {
		if (dataVariable != null && ((EObject)dataVariable).eIsProxy()) {
			InternalEObject oldDataVariable = (InternalEObject)dataVariable;
			dataVariable = (LocalVariable)eResolveProxy(oldDataVariable);
			if (dataVariable != oldDataVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__DATA_VARIABLE, oldDataVariable, dataVariable));
			}
		}
		return dataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetDataVariable() {
		return dataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataVariable(LocalVariable newDataVariable) {
		LocalVariable oldDataVariable = dataVariable;
		dataVariable = newDataVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__DATA_VARIABLE, oldDataVariable, dataVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION:
				return basicSetOperation(null, msgs);
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
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION:
				return getOperation();
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__DATA_VARIABLE:
				if (resolve) return getDataVariable();
				return basicGetDataVariable();
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
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION:
				setOperation((RteBufferQueuedSendOperation)newValue);
				return;
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__DATA_VARIABLE:
				setDataVariable((LocalVariable)newValue);
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
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION:
				setOperation((RteBufferQueuedSendOperation)null);
				return;
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__DATA_VARIABLE:
				setDataVariable((LocalVariable)null);
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
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__OPERATION:
				return operation != null;
			case ModulePackage.RTE_BUFFER_SEND_TRUSTED_FUNCTION__DATA_VARIABLE:
				return dataVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //RteBufferSendTrustedFunctionImpl
