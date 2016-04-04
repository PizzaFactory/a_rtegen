/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Is Outside Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsOutsideFilterOperationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsOutsideFilterOperationImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewIsOutsideFilterOperationImpl extends FilterOperationImpl implements NewIsOutsideFilterOperation {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Constant min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Constant max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewIsOutsideFilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.NEW_IS_OUTSIDE_FILTER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getMin() {
		if (min != null && ((EObject)min).eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (Constant)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Constant newMin) {
		Constant oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getMax() {
		if (max != null && ((EObject)max).eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (Constant)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Constant newMax) {
		Constant oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MAX:
				if (resolve) return getMax();
				return basicGetMax();
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
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MIN:
				setMin((Constant)newValue);
				return;
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MAX:
				setMax((Constant)newValue);
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
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MIN:
				setMin((Constant)null);
				return;
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MAX:
				setMax((Constant)null);
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
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MIN:
				return min != null;
			case ModulePackage.NEW_IS_OUTSIDE_FILTER_OPERATION__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //NewIsOutsideFilterOperationImpl
