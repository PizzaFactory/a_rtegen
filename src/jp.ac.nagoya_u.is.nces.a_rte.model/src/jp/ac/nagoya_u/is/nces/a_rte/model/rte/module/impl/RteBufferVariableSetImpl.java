/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Buffer Variable Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl#getValueVariable <em>Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl#getStatusVariable <em>Status Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl#getInitValueVariable <em>Init Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl#getComplexVariable <em>Complex Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBufferVariableSetImpl extends GlobalVariableImpl implements RteBufferVariableSet {
	/**
	 * The cached value of the '{@link #getValueVariable() <em>Value Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable valueVariable;

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
	 * The cached value of the '{@link #getInitValueVariable() <em>Init Value Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValueVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable initValueVariable;

	/**
	 * The cached value of the '{@link #getComplexVariable() <em>Complex Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable complexVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBufferVariableSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getValueVariable() {
		return valueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueVariable(GlobalVariable newValueVariable, NotificationChain msgs) {
		GlobalVariable oldValueVariable = valueVariable;
		valueVariable = newValueVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE, oldValueVariable, newValueVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueVariable(GlobalVariable newValueVariable) {
		if (newValueVariable != valueVariable) {
			NotificationChain msgs = null;
			if (valueVariable != null)
				msgs = ((InternalEObject)valueVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE, null, msgs);
			if (newValueVariable != null)
				msgs = ((InternalEObject)newValueVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE, null, msgs);
			msgs = basicSetValueVariable(newValueVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE, newValueVariable, newValueVariable));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE, oldStatusVariable, newStatusVariable);
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
				msgs = ((InternalEObject)statusVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE, null, msgs);
			if (newStatusVariable != null)
				msgs = ((InternalEObject)newStatusVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE, null, msgs);
			msgs = basicSetStatusVariable(newStatusVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE, newStatusVariable, newStatusVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getInitValueVariable() {
		return initValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitValueVariable(GlobalVariable newInitValueVariable, NotificationChain msgs) {
		GlobalVariable oldInitValueVariable = initValueVariable;
		initValueVariable = newInitValueVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE, oldInitValueVariable, newInitValueVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValueVariable(GlobalVariable newInitValueVariable) {
		if (newInitValueVariable != initValueVariable) {
			NotificationChain msgs = null;
			if (initValueVariable != null)
				msgs = ((InternalEObject)initValueVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE, null, msgs);
			if (newInitValueVariable != null)
				msgs = ((InternalEObject)newInitValueVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE, null, msgs);
			msgs = basicSetInitValueVariable(newInitValueVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE, newInitValueVariable, newInitValueVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getComplexVariable() {
		return complexVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexVariable(GlobalVariable newComplexVariable, NotificationChain msgs) {
		GlobalVariable oldComplexVariable = complexVariable;
		complexVariable = newComplexVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE, oldComplexVariable, newComplexVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexVariable(GlobalVariable newComplexVariable) {
		if (newComplexVariable != complexVariable) {
			NotificationChain msgs = null;
			if (complexVariable != null)
				msgs = ((InternalEObject)complexVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE, null, msgs);
			if (newComplexVariable != null)
				msgs = ((InternalEObject)newComplexVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE, null, msgs);
			msgs = basicSetComplexVariable(newComplexVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE, newComplexVariable, newComplexVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE:
				return basicSetValueVariable(null, msgs);
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE:
				return basicSetStatusVariable(null, msgs);
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE:
				return basicSetInitValueVariable(null, msgs);
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE:
				return basicSetComplexVariable(null, msgs);
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
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE:
				return getValueVariable();
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE:
				return getStatusVariable();
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE:
				return getInitValueVariable();
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE:
				return getComplexVariable();
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
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE:
				setValueVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE:
				setStatusVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE:
				setInitValueVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE:
				setComplexVariable((GlobalVariable)newValue);
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
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE:
				setValueVariable((GlobalVariable)null);
				return;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE:
				setStatusVariable((GlobalVariable)null);
				return;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE:
				setInitValueVariable((GlobalVariable)null);
				return;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE:
				setComplexVariable((GlobalVariable)null);
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
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE:
				return valueVariable != null;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE:
				return statusVariable != null;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE:
				return initValueVariable != null;
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE:
				return complexVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //RteBufferVariableSetImpl
