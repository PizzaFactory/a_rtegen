/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LocalVariableImpl#getInitValueConstant <em>Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LocalVariableImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalVariableImpl extends VariableImpl implements LocalVariable {
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
	protected LocalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.LOCAL_VARIABLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.LOCAL_VARIABLE__INIT_VALUE_CONSTANT, oldInitValueConstant, initValueConstant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.LOCAL_VARIABLE__INIT_VALUE_CONSTANT, oldInitValueConstant, initValueConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getParent() {
		if (eContainerFeatureID() != ModulePackage.LOCAL_VARIABLE__PARENT) return null;
		return (Function)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Function newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.LOCAL_VARIABLE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Function newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.LOCAL_VARIABLE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.FUNCTION__LOCAL_VARIABLE, Function.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.LOCAL_VARIABLE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Function)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.FUNCTION__LOCAL_VARIABLE, Function.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.LOCAL_VARIABLE__INIT_VALUE_CONSTANT:
				if (resolve) return getInitValueConstant();
				return basicGetInitValueConstant();
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				return getParent();
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
			case ModulePackage.LOCAL_VARIABLE__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)newValue);
				return;
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				setParent((Function)newValue);
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
			case ModulePackage.LOCAL_VARIABLE__INIT_VALUE_CONSTANT:
				setInitValueConstant((Constant)null);
				return;
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				setParent((Function)null);
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
			case ModulePackage.LOCAL_VARIABLE__INIT_VALUE_CONSTANT:
				return initValueConstant != null;
			case ModulePackage.LOCAL_VARIABLE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalVariableImpl
