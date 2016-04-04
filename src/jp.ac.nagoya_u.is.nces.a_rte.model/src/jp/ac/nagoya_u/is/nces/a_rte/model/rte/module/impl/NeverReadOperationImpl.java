/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Never Read Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NeverReadOperationImpl#getInitValueConstant <em>Init Value Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeverReadOperationImpl extends ReadOperationImpl implements NeverReadOperation {
	/**
	 * The cached value of the '{@link #getInitValueConstant() <em>Init Value Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initValueConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeverReadOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.NEVER_READ_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitValueConstant() {
		if (initValueConstant != null && ((EObject)initValueConstant).eIsProxy()) {
			InternalEObject oldInitValueConstant = (InternalEObject)initValueConstant;
			initValueConstant = (Constant)eResolveProxy(oldInitValueConstant);
			if (initValueConstant != oldInitValueConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.NEVER_READ_OPERATION__INIT_VALUE_CONSTANT, oldInitValueConstant, initValueConstant));
			}
		}
		return initValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetInitValueConstant() {
		return initValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValueConstant(Constant newInitValueConstant) {
		Constant oldInitValueConstant = initValueConstant;
		initValueConstant = newInitValueConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.NEVER_READ_OPERATION__INIT_VALUE_CONSTANT, oldInitValueConstant, initValueConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.NEVER_READ_OPERATION__INIT_VALUE_CONSTANT:
				if (resolve) return getInitValueConstant();
				return basicGetInitValueConstant();
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
			case ModulePackage.NEVER_READ_OPERATION__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)newValue);
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
			case ModulePackage.NEVER_READ_OPERATION__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)null);
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
			case ModulePackage.NEVER_READ_OPERATION__INIT_VALUE_CONSTANT:
				return initValueConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //NeverReadOperationImpl
