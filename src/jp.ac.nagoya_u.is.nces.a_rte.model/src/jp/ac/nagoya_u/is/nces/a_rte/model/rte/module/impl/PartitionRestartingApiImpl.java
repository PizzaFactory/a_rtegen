/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Restarting Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionRestartingApiImpl#getSrInterPartitionTimeoutOperation <em>Sr Inter Partition Timeout Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionRestartingApiImpl#getActivationOperation <em>Activation Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionRestartingApiImpl extends RteLifecycleApiImpl implements PartitionRestartingApi {
	/**
	 * The cached value of the '{@link #getSrInterPartitionTimeoutOperation() <em>Sr Inter Partition Timeout Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrInterPartitionTimeoutOperation()
	 * @generated
	 * @ordered
	 */
	protected InterPartitionTimeoutOperation srInterPartitionTimeoutOperation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionRestartingApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PARTITION_RESTARTING_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterPartitionTimeoutOperation getSrInterPartitionTimeoutOperation() {
		return srInterPartitionTimeoutOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrInterPartitionTimeoutOperation(InterPartitionTimeoutOperation newSrInterPartitionTimeoutOperation, NotificationChain msgs) {
		InterPartitionTimeoutOperation oldSrInterPartitionTimeoutOperation = srInterPartitionTimeoutOperation;
		srInterPartitionTimeoutOperation = newSrInterPartitionTimeoutOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, oldSrInterPartitionTimeoutOperation, newSrInterPartitionTimeoutOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrInterPartitionTimeoutOperation(InterPartitionTimeoutOperation newSrInterPartitionTimeoutOperation) {
		if (newSrInterPartitionTimeoutOperation != srInterPartitionTimeoutOperation) {
			NotificationChain msgs = null;
			if (srInterPartitionTimeoutOperation != null)
				msgs = ((InternalEObject)srInterPartitionTimeoutOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, null, msgs);
			if (newSrInterPartitionTimeoutOperation != null)
				msgs = ((InternalEObject)newSrInterPartitionTimeoutOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, null, msgs);
			msgs = basicSetSrInterPartitionTimeoutOperation(newSrInterPartitionTimeoutOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, newSrInterPartitionTimeoutOperation, newSrInterPartitionTimeoutOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationOperation> getActivationOperation() {
		if (activationOperation == null) {
			activationOperation = new EObjectContainmentEList<ActivationOperation>(ActivationOperation.class, this, ModulePackage.PARTITION_RESTARTING_API__ACTIVATION_OPERATION);
		}
		return activationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				return basicSetSrInterPartitionTimeoutOperation(null, msgs);
			case ModulePackage.PARTITION_RESTARTING_API__ACTIVATION_OPERATION:
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
			case ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				return getSrInterPartitionTimeoutOperation();
			case ModulePackage.PARTITION_RESTARTING_API__ACTIVATION_OPERATION:
				return getActivationOperation();
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
			case ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				setSrInterPartitionTimeoutOperation((InterPartitionTimeoutOperation)newValue);
				return;
			case ModulePackage.PARTITION_RESTARTING_API__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				getActivationOperation().addAll((Collection<? extends ActivationOperation>)newValue);
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
			case ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				setSrInterPartitionTimeoutOperation((InterPartitionTimeoutOperation)null);
				return;
			case ModulePackage.PARTITION_RESTARTING_API__ACTIVATION_OPERATION:
				getActivationOperation().clear();
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
			case ModulePackage.PARTITION_RESTARTING_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				return srInterPartitionTimeoutOperation != null;
			case ModulePackage.PARTITION_RESTARTING_API__ACTIVATION_OPERATION:
				return activationOperation != null && !activationOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartitionRestartingApiImpl
