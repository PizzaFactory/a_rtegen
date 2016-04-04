/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Declaration Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getModeType <em>Mode Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getModeConstant <em>Mode Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getModeTransitionStatusConstant <em>Mode Transition Status Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeDeclarationGroupImpl#getInitModeConstant <em>Init Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeDeclarationGroupImpl extends ModuleReferrableImpl implements ModeDeclarationGroup {
	/**
	 * The cached value of the '{@link #getModeType() <em>Mode Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeType()
	 * @generated
	 * @ordered
	 */
	protected ModeType modeType;

	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected Type implementationDataType;

	/**
	 * The cached value of the '{@link #getModeConstant() <em>Mode Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> modeConstant;

	/**
	 * The cached value of the '{@link #getModeTransitionStatusConstant() <em>Mode Transition Status Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransitionStatusConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant modeTransitionStatusConstant;

	/**
	 * The cached value of the '{@link #getInitModeConstant() <em>Init Mode Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModeConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initModeConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeDeclarationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_DECLARATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getModeType() {
		return modeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeType(ModeType newModeType, NotificationChain msgs) {
		ModeType oldModeType = modeType;
		modeType = newModeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, oldModeType, newModeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeType(ModeType newModeType) {
		if (newModeType != modeType) {
			NotificationChain msgs = null;
			if (modeType != null)
				msgs = ((InternalEObject)modeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, null, msgs);
			if (newModeType != null)
				msgs = ((InternalEObject)newModeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, null, msgs);
			msgs = basicSetModeType(newModeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE, newModeType, newModeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getImplementationDataType() {
		if (implementationDataType != null && ((EObject)implementationDataType).eIsProxy()) {
			InternalEObject oldImplementationDataType = (InternalEObject)implementationDataType;
			implementationDataType = (Type)eResolveProxy(oldImplementationDataType);
			if (implementationDataType != oldImplementationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
			}
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetImplementationDataType() {
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDataType(Type newImplementationDataType) {
		Type oldImplementationDataType = implementationDataType;
		implementationDataType = newImplementationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getModeConstant() {
		if (modeConstant == null) {
			modeConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT);
		}
		return modeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getModeTransitionStatusConstant() {
		return modeTransitionStatusConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeTransitionStatusConstant(Constant newModeTransitionStatusConstant, NotificationChain msgs) {
		Constant oldModeTransitionStatusConstant = modeTransitionStatusConstant;
		modeTransitionStatusConstant = newModeTransitionStatusConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, oldModeTransitionStatusConstant, newModeTransitionStatusConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeTransitionStatusConstant(Constant newModeTransitionStatusConstant) {
		if (newModeTransitionStatusConstant != modeTransitionStatusConstant) {
			NotificationChain msgs = null;
			if (modeTransitionStatusConstant != null)
				msgs = ((InternalEObject)modeTransitionStatusConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, null, msgs);
			if (newModeTransitionStatusConstant != null)
				msgs = ((InternalEObject)newModeTransitionStatusConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, null, msgs);
			msgs = basicSetModeTransitionStatusConstant(newModeTransitionStatusConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT, newModeTransitionStatusConstant, newModeTransitionStatusConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitModeConstant() {
		return initModeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitModeConstant(Constant newInitModeConstant, NotificationChain msgs) {
		Constant oldInitModeConstant = initModeConstant;
		initModeConstant = newInitModeConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, oldInitModeConstant, newInitModeConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitModeConstant(Constant newInitModeConstant) {
		if (newInitModeConstant != initModeConstant) {
			NotificationChain msgs = null;
			if (initModeConstant != null)
				msgs = ((InternalEObject)initModeConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, null, msgs);
			if (newInitModeConstant != null)
				msgs = ((InternalEObject)newInitModeConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, null, msgs);
			msgs = basicSetInitModeConstant(newInitModeConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT, newInitModeConstant, newInitModeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				return basicSetModeType(null, msgs);
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				return ((InternalEList<?>)getModeConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				return basicSetModeTransitionStatusConstant(null, msgs);
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				return basicSetInitModeConstant(null, msgs);
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				return getModeType();
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				if (resolve) return getImplementationDataType();
				return basicGetImplementationDataType();
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				return getModeConstant();
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				return getModeTransitionStatusConstant();
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				return getInitModeConstant();
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				setModeType((ModeType)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((Type)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				getModeConstant().clear();
				getModeConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				setModeTransitionStatusConstant((Constant)newValue);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)newValue);
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				setModeType((ModeType)null);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((Type)null);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				getModeConstant().clear();
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				setModeTransitionStatusConstant((Constant)null);
				return;
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)null);
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
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
				return modeType != null;
			case ModulePackage.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null;
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
				return modeConstant != null && !modeConstant.isEmpty();
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
				return modeTransitionStatusConstant != null;
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
				return initModeConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeDeclarationGroupImpl
