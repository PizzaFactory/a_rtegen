/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckNotifyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAck Notify Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TAckNotifyOperationImpl#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TAckNotifyOperationImpl#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAckNotifyOperationImpl extends ExtendedEObjectImpl implements TAckNotifyOperation {
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
	protected TAckNotifyOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TACK_NOTIFY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationOperation> getActivationOperation() {
		if (activationOperation == null) {
			activationOperation = new EObjectContainmentEList<ActivationOperation>(ActivationOperation.class, this, ModulePackage.TACK_NOTIFY_OPERATION__ACTIVATION_OPERATION);
		}
		return activationOperation;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TACK_NOTIFY_OPERATION__TACK_STATUS, oldTAckStatus, tAckStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TACK_NOTIFY_OPERATION__TACK_STATUS, oldTAckStatus, tAckStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.TACK_NOTIFY_OPERATION__ACTIVATION_OPERATION:
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
			case ModulePackage.TACK_NOTIFY_OPERATION__ACTIVATION_OPERATION:
				return getActivationOperation();
			case ModulePackage.TACK_NOTIFY_OPERATION__TACK_STATUS:
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
			case ModulePackage.TACK_NOTIFY_OPERATION__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				getActivationOperation().addAll((Collection<? extends ActivationOperation>)newValue);
				return;
			case ModulePackage.TACK_NOTIFY_OPERATION__TACK_STATUS:
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
			case ModulePackage.TACK_NOTIFY_OPERATION__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				return;
			case ModulePackage.TACK_NOTIFY_OPERATION__TACK_STATUS:
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
			case ModulePackage.TACK_NOTIFY_OPERATION__ACTIVATION_OPERATION:
				return activationOperation != null && !activationOperation.isEmpty();
			case ModulePackage.TACK_NOTIFY_OPERATION__TACK_STATUS:
				return tAckStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //TAckNotifyOperationImpl
