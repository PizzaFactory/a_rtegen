/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComTxTOutCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckNotifyOperation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Tx TOut Callback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComTxTOutCallbackImpl#getTAckNotifyOperation <em>TAck Notify Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComTxTOutCallbackImpl extends ComCallbackImpl implements ComTxTOutCallback {
	/**
	 * The cached value of the '{@link #getTAckNotifyOperation() <em>TAck Notify Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAckNotifyOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<TAckNotifyOperation> tAckNotifyOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComTxTOutCallbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_TX_TOUT_CALLBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAckNotifyOperation> getTAckNotifyOperation() {
		if (tAckNotifyOperation == null) {
			tAckNotifyOperation = new EObjectContainmentEList<TAckNotifyOperation>(TAckNotifyOperation.class, this, ModulePackage.COM_TX_TOUT_CALLBACK__TACK_NOTIFY_OPERATION);
		}
		return tAckNotifyOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_TX_TOUT_CALLBACK__TACK_NOTIFY_OPERATION:
				return ((InternalEList<?>)getTAckNotifyOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.COM_TX_TOUT_CALLBACK__TACK_NOTIFY_OPERATION:
				return getTAckNotifyOperation();
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
			case ModulePackage.COM_TX_TOUT_CALLBACK__TACK_NOTIFY_OPERATION:
				getTAckNotifyOperation().clear();
				getTAckNotifyOperation().addAll((Collection<? extends TAckNotifyOperation>)newValue);
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
			case ModulePackage.COM_TX_TOUT_CALLBACK__TACK_NOTIFY_OPERATION:
				getTAckNotifyOperation().clear();
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
			case ModulePackage.COM_TX_TOUT_CALLBACK__TACK_NOTIFY_OPERATION:
				return tAckNotifyOperation != null && !tAckNotifyOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComTxTOutCallbackImpl
