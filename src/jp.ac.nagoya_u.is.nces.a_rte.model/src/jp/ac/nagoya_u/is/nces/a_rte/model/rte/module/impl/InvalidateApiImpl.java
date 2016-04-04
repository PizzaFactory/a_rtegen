/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
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
 * An implementation of the model object '<em><b>Invalidate Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl#getActivationFlag <em>Activation Flag</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvalidateApiImpl extends RteApiImpl implements InvalidateApi {
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
	protected InvalidateApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.INVALIDATE_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<SendOperation>(SendOperation.class, this, ModulePackage.INVALIDATE_API__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationOperation> getActivationOperation() {
		if (activationOperation == null) {
			activationOperation = new EObjectContainmentEList<ActivationOperation>(ActivationOperation.class, this, ModulePackage.INVALIDATE_API__ACTIVATION_OPERATION);
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
			activationFlag = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.INVALIDATE_API__ACTIVATION_FLAG);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.INVALIDATE_API__TACK_STATUS, oldTAckStatus, tAckStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.INVALIDATE_API__TACK_STATUS, oldTAckStatus, tAckStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.INVALIDATE_API__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.INVALIDATE_API__ACTIVATION_OPERATION:
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
			case ModulePackage.INVALIDATE_API__OPERATION:
				return getOperation();
			case ModulePackage.INVALIDATE_API__ACTIVATION_OPERATION:
				return getActivationOperation();
			case ModulePackage.INVALIDATE_API__ACTIVATION_FLAG:
				return getActivationFlag();
			case ModulePackage.INVALIDATE_API__TACK_STATUS:
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
			case ModulePackage.INVALIDATE_API__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends SendOperation>)newValue);
				return;
			case ModulePackage.INVALIDATE_API__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				getActivationOperation().addAll((Collection<? extends ActivationOperation>)newValue);
				return;
			case ModulePackage.INVALIDATE_API__ACTIVATION_FLAG:
				getActivationFlag().clear();
				getActivationFlag().addAll((Collection<? extends LocalVariable>)newValue);
				return;
			case ModulePackage.INVALIDATE_API__TACK_STATUS:
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
			case ModulePackage.INVALIDATE_API__OPERATION:
				getOperation().clear();
				return;
			case ModulePackage.INVALIDATE_API__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				return;
			case ModulePackage.INVALIDATE_API__ACTIVATION_FLAG:
				getActivationFlag().clear();
				return;
			case ModulePackage.INVALIDATE_API__TACK_STATUS:
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
			case ModulePackage.INVALIDATE_API__OPERATION:
				return operation != null && !operation.isEmpty();
			case ModulePackage.INVALIDATE_API__ACTIVATION_OPERATION:
				return activationOperation != null && !activationOperation.isEmpty();
			case ModulePackage.INVALIDATE_API__ACTIVATION_FLAG:
				return activationFlag != null && !activationFlag.isEmpty();
			case ModulePackage.INVALIDATE_API__TACK_STATUS:
				return tAckStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //InvalidateApiImpl
