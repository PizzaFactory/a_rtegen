/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Offset Countup Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.StartOffsetCountupOperationImpl#getCounterVariable <em>Counter Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.StartOffsetCountupOperationImpl#getMaxConstant <em>Max Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartOffsetCountupOperationImpl extends OperationImpl implements StartOffsetCountupOperation {
	/**
	 * The cached value of the '{@link #getCounterVariable() <em>Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable counterVariable;

	/**
	 * The cached value of the '{@link #getMaxConstant() <em>Max Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant maxConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartOffsetCountupOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.START_OFFSET_COUNTUP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCounterVariable() {
		if (counterVariable != null && ((EObject)counterVariable).eIsProxy()) {
			InternalEObject oldCounterVariable = (InternalEObject)counterVariable;
			counterVariable = (GlobalVariable)eResolveProxy(oldCounterVariable);
			if (counterVariable != oldCounterVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE, oldCounterVariable, counterVariable));
			}
		}
		return counterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetCounterVariable() {
		return counterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterVariable(GlobalVariable newCounterVariable) {
		GlobalVariable oldCounterVariable = counterVariable;
		counterVariable = newCounterVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE, oldCounterVariable, counterVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getMaxConstant() {
		if (maxConstant != null && ((EObject)maxConstant).eIsProxy()) {
			InternalEObject oldMaxConstant = (InternalEObject)maxConstant;
			maxConstant = (Constant)eResolveProxy(oldMaxConstant);
			if (maxConstant != oldMaxConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT, oldMaxConstant, maxConstant));
			}
		}
		return maxConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetMaxConstant() {
		return maxConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConstant(Constant newMaxConstant) {
		Constant oldMaxConstant = maxConstant;
		maxConstant = newMaxConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT, oldMaxConstant, maxConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE:
				if (resolve) return getCounterVariable();
				return basicGetCounterVariable();
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT:
				if (resolve) return getMaxConstant();
				return basicGetMaxConstant();
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
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE:
				setCounterVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT:
				setMaxConstant((Constant)newValue);
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
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE:
				setCounterVariable((GlobalVariable)null);
				return;
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT:
				setMaxConstant((Constant)null);
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
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE:
				return counterVariable != null;
			case ModulePackage.START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT:
				return maxConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //StartOffsetCountupOperationImpl
