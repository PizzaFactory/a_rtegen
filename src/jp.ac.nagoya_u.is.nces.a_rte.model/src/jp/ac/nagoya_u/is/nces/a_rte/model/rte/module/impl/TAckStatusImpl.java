/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAck Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TAckStatusImpl#getStatusVariable <em>Status Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAckStatusImpl extends LogicalBlockImpl implements TAckStatus {
	/**
	 * The cached value of the '{@link #getStatusVariable() <em>Status Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable statusVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAckStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TACK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getStatusVariable() {
		return statusVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusVariable(GlobalVariable newStatusVariable, NotificationChain msgs) {
		GlobalVariable oldStatusVariable = statusVariable;
		statusVariable = newStatusVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.TACK_STATUS__STATUS_VARIABLE, oldStatusVariable, newStatusVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusVariable(GlobalVariable newStatusVariable) {
		if (newStatusVariable != statusVariable) {
			NotificationChain msgs = null;
			if (statusVariable != null)
				msgs = ((InternalEObject)statusVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.TACK_STATUS__STATUS_VARIABLE, null, msgs);
			if (newStatusVariable != null)
				msgs = ((InternalEObject)newStatusVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.TACK_STATUS__STATUS_VARIABLE, null, msgs);
			msgs = basicSetStatusVariable(newStatusVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TACK_STATUS__STATUS_VARIABLE, newStatusVariable, newStatusVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.TACK_STATUS__STATUS_VARIABLE:
				return basicSetStatusVariable(null, msgs);
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
			case ModulePackage.TACK_STATUS__STATUS_VARIABLE:
				return getStatusVariable();
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
			case ModulePackage.TACK_STATUS__STATUS_VARIABLE:
				setStatusVariable((GlobalVariable)newValue);
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
			case ModulePackage.TACK_STATUS__STATUS_VARIABLE:
				setStatusVariable((GlobalVariable)null);
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
			case ModulePackage.TACK_STATUS__STATUS_VARIABLE:
				return statusVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //TAckStatusImpl
