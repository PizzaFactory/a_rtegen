/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;

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
 * An implementation of the model object '<em><b>Com Inv Callback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvCallbackImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvCallbackImpl#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvCallbackImpl#getActivationFlag <em>Activation Flag</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvCallbackImpl#getFilterResultVariable <em>Filter Result Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComInvCallbackImpl extends ComCallbackImpl implements ComInvCallback {
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
	 * The cached value of the '{@link #getFilterResultVariable() <em>Filter Result Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterResultVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable filterResultVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComInvCallbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_INV_CALLBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<SendOperation>(SendOperation.class, this, ModulePackage.COM_INV_CALLBACK__OPERATION);
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
			activationOperation = new EObjectContainmentEList<ActivationOperation>(ActivationOperation.class, this, ModulePackage.COM_INV_CALLBACK__ACTIVATION_OPERATION);
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
			activationFlag = new EObjectResolvingEList<LocalVariable>(LocalVariable.class, this, ModulePackage.COM_INV_CALLBACK__ACTIVATION_FLAG);
		}
		return activationFlag;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_INV_CALLBACK__FILTER_RESULT_VARIABLE, oldFilterResultVariable, filterResultVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_INV_CALLBACK__FILTER_RESULT_VARIABLE, oldFilterResultVariable, filterResultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_INV_CALLBACK__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_OPERATION:
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
			case ModulePackage.COM_INV_CALLBACK__OPERATION:
				return getOperation();
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_OPERATION:
				return getActivationOperation();
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_FLAG:
				return getActivationFlag();
			case ModulePackage.COM_INV_CALLBACK__FILTER_RESULT_VARIABLE:
				if (resolve) return getFilterResultVariable();
				return basicGetFilterResultVariable();
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
			case ModulePackage.COM_INV_CALLBACK__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends SendOperation>)newValue);
				return;
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				getActivationOperation().addAll((Collection<? extends ActivationOperation>)newValue);
				return;
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_FLAG:
				getActivationFlag().clear();
				getActivationFlag().addAll((Collection<? extends LocalVariable>)newValue);
				return;
			case ModulePackage.COM_INV_CALLBACK__FILTER_RESULT_VARIABLE:
				setFilterResultVariable((LocalVariable)newValue);
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
			case ModulePackage.COM_INV_CALLBACK__OPERATION:
				getOperation().clear();
				return;
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_OPERATION:
				getActivationOperation().clear();
				return;
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_FLAG:
				getActivationFlag().clear();
				return;
			case ModulePackage.COM_INV_CALLBACK__FILTER_RESULT_VARIABLE:
				setFilterResultVariable((LocalVariable)null);
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
			case ModulePackage.COM_INV_CALLBACK__OPERATION:
				return operation != null && !operation.isEmpty();
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_OPERATION:
				return activationOperation != null && !activationOperation.isEmpty();
			case ModulePackage.COM_INV_CALLBACK__ACTIVATION_FLAG:
				return activationFlag != null && !activationFlag.isEmpty();
			case ModulePackage.COM_INV_CALLBACK__FILTER_RESULT_VARIABLE:
				return filterResultVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ComInvCallbackImpl
