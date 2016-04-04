/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Masked New Differs Masked Old Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersMaskedOldFilterOperationImpl#getOldValueVariable <em>Old Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersMaskedOldFilterOperationImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaskedNewDiffersMaskedOldFilterOperationImpl extends FilterOperationImpl implements MaskedNewDiffersMaskedOldFilterOperation {
	/**
	 * The cached value of the '{@link #getOldValueVariable() <em>Old Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValueVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable oldValueVariable;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected Constant mask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaskedNewDiffersMaskedOldFilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getOldValueVariable() {
		if (oldValueVariable != null && ((EObject)oldValueVariable).eIsProxy()) {
			InternalEObject oldOldValueVariable = (InternalEObject)oldValueVariable;
			oldValueVariable = (GlobalVariable)eResolveProxy(oldOldValueVariable);
			if (oldValueVariable != oldOldValueVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE, oldOldValueVariable, oldValueVariable));
			}
		}
		return oldValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetOldValueVariable() {
		return oldValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldValueVariable(GlobalVariable newOldValueVariable) {
		GlobalVariable oldOldValueVariable = oldValueVariable;
		oldValueVariable = newOldValueVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE, oldOldValueVariable, oldValueVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getMask() {
		if (mask != null && ((EObject)mask).eIsProxy()) {
			InternalEObject oldMask = (InternalEObject)mask;
			mask = (Constant)eResolveProxy(oldMask);
			if (mask != oldMask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK, oldMask, mask));
			}
		}
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(Constant newMask) {
		Constant oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE:
				if (resolve) return getOldValueVariable();
				return basicGetOldValueVariable();
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK:
				if (resolve) return getMask();
				return basicGetMask();
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
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE:
				setOldValueVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK:
				setMask((Constant)newValue);
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
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE:
				setOldValueVariable((GlobalVariable)null);
				return;
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK:
				setMask((Constant)null);
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
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE:
				return oldValueVariable != null;
			case ModulePackage.MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK:
				return mask != null;
		}
		return super.eIsSet(featureID);
	}

} //MaskedNewDiffersMaskedOldFilterOperationImpl
