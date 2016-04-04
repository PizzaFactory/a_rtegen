/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FilterOperationImpl#getFilterResultVariable <em>Filter Result Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FilterOperationImpl extends OperationImpl implements FilterOperation {
	/**
	 * The cached value of the '{@link #getFilterResultVariable() <em>Filter Result Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterResultVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable filterResultVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.FILTER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getFilterResultVariable() {
		if (filterResultVariable != null && ((EObject)filterResultVariable).eIsProxy()) {
			InternalEObject oldFilterResultVariable = (InternalEObject)filterResultVariable;
			filterResultVariable = (Variable)eResolveProxy(oldFilterResultVariable);
			if (filterResultVariable != oldFilterResultVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.FILTER_OPERATION__FILTER_RESULT_VARIABLE, oldFilterResultVariable, filterResultVariable));
			}
		}
		return filterResultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetFilterResultVariable() {
		return filterResultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterResultVariable(Variable newFilterResultVariable) {
		Variable oldFilterResultVariable = filterResultVariable;
		filterResultVariable = newFilterResultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.FILTER_OPERATION__FILTER_RESULT_VARIABLE, oldFilterResultVariable, filterResultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.FILTER_OPERATION__FILTER_RESULT_VARIABLE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.FILTER_OPERATION__FILTER_RESULT_VARIABLE:
				setFilterResultVariable((Variable)newValue);
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
			case ModulePackage.FILTER_OPERATION__FILTER_RESULT_VARIABLE:
				setFilterResultVariable((Variable)null);
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
			case ModulePackage.FILTER_OPERATION__FILTER_RESULT_VARIABLE:
				return filterResultVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterOperationImpl
