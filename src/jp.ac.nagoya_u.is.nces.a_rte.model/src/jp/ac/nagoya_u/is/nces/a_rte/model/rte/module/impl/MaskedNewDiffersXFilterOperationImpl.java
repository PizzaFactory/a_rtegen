/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Masked New Differs XFilter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersXFilterOperationImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersXFilterOperationImpl#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaskedNewDiffersXFilterOperationImpl extends FilterOperationImpl implements MaskedNewDiffersXFilterOperation {
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
	 * The cached value of the '{@link #getX() <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Constant x;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaskedNewDiffersXFilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MASKED_NEW_DIFFERS_XFILTER_OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK, oldMask, mask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getX() {
		if (x != null && ((EObject)x).eIsProxy()) {
			InternalEObject oldX = (InternalEObject)x;
			x = (Constant)eResolveProxy(oldX);
			if (x != oldX) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__X, oldX, x));
			}
		}
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Constant newX) {
		Constant oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK:
				if (resolve) return getMask();
				return basicGetMask();
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__X:
				if (resolve) return getX();
				return basicGetX();
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
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK:
				setMask((Constant)newValue);
				return;
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__X:
				setX((Constant)newValue);
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
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK:
				setMask((Constant)null);
				return;
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__X:
				setX((Constant)null);
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
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK:
				return mask != null;
			case ModulePackage.MASKED_NEW_DIFFERS_XFILTER_OPERATION__X:
				return x != null;
		}
		return super.eIsSet(featureID);
	}

} //MaskedNewDiffersXFilterOperationImpl
