/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl#getDataParam <em>Data Param</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl#getStatusVariable <em>Status Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveApiImpl extends RteApiImpl implements ReceiveApi {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ReadOperation operation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RECEIVE_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ReadOperation newOperation, NotificationChain msgs) {
		ReadOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RECEIVE_API__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ReadOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RECEIVE_API__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RECEIVE_API__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RECEIVE_API__OPERATION, newOperation, newOperation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RECEIVE_API__DATA_PARAM, oldDataParam, dataParam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RECEIVE_API__DATA_PARAM, oldDataParam, dataParam));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RECEIVE_API__STATUS_VARIABLE, oldStatusVariable, statusVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RECEIVE_API__STATUS_VARIABLE, oldStatusVariable, statusVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RECEIVE_API__OPERATION:
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
			case ModulePackage.RECEIVE_API__OPERATION:
				return getOperation();
			case ModulePackage.RECEIVE_API__DATA_PARAM:
				if (resolve) return getDataParam();
				return basicGetDataParam();
			case ModulePackage.RECEIVE_API__STATUS_VARIABLE:
				if (resolve) return getStatusVariable();
				return basicGetStatusVariable();
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
			case ModulePackage.RECEIVE_API__OPERATION:
				setOperation((ReadOperation)newValue);
				return;
			case ModulePackage.RECEIVE_API__DATA_PARAM:
				setDataParam((Parameter)newValue);
				return;
			case ModulePackage.RECEIVE_API__STATUS_VARIABLE:
				setStatusVariable((LocalVariable)newValue);
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
			case ModulePackage.RECEIVE_API__OPERATION:
				setOperation((ReadOperation)null);
				return;
			case ModulePackage.RECEIVE_API__DATA_PARAM:
				setDataParam((Parameter)null);
				return;
			case ModulePackage.RECEIVE_API__STATUS_VARIABLE:
				setStatusVariable((LocalVariable)null);
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
			case ModulePackage.RECEIVE_API__OPERATION:
				return operation != null;
			case ModulePackage.RECEIVE_API__DATA_PARAM:
				return dataParam != null;
			case ModulePackage.RECEIVE_API__STATUS_VARIABLE:
				return statusVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiveApiImpl
