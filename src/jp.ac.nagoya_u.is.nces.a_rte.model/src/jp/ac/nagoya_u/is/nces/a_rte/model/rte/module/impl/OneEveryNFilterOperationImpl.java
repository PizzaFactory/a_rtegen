/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Every NFilter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl#getOccurrenceVariable <em>Occurrence Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneEveryNFilterOperationImpl extends FilterOperationImpl implements OneEveryNFilterOperation {
	/**
	 * The cached value of the '{@link #getOccurrenceVariable() <em>Occurrence Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable occurrenceVariable;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Constant period;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Constant offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneEveryNFilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.ONE_EVERY_NFILTER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getOccurrenceVariable() {
		if (occurrenceVariable != null && ((EObject)occurrenceVariable).eIsProxy()) {
			InternalEObject oldOccurrenceVariable = (InternalEObject)occurrenceVariable;
			occurrenceVariable = (GlobalVariable)eResolveProxy(oldOccurrenceVariable);
			if (occurrenceVariable != oldOccurrenceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE, oldOccurrenceVariable, occurrenceVariable));
			}
		}
		return occurrenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetOccurrenceVariable() {
		return occurrenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceVariable(GlobalVariable newOccurrenceVariable) {
		GlobalVariable oldOccurrenceVariable = occurrenceVariable;
		occurrenceVariable = newOccurrenceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE, oldOccurrenceVariable, occurrenceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getPeriod() {
		if (period != null && ((EObject)period).eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Constant)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Constant newPeriod) {
		Constant oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getOffset() {
		if (offset != null && ((EObject)offset).eIsProxy()) {
			InternalEObject oldOffset = (InternalEObject)offset;
			offset = (Constant)eResolveProxy(oldOffset);
			if (offset != oldOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET, oldOffset, offset));
			}
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Constant newOffset) {
		Constant oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				if (resolve) return getOccurrenceVariable();
				return basicGetOccurrenceVariable();
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				if (resolve) return getOffset();
				return basicGetOffset();
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
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				setOccurrenceVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				setPeriod((Constant)newValue);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				setOffset((Constant)newValue);
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
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				setOccurrenceVariable((GlobalVariable)null);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				setPeriod((Constant)null);
				return;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				setOffset((Constant)null);
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
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE:
				return occurrenceVariable != null;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__PERIOD:
				return period != null;
			case ModulePackage.ONE_EVERY_NFILTER_OPERATION__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //OneEveryNFilterOperationImpl
