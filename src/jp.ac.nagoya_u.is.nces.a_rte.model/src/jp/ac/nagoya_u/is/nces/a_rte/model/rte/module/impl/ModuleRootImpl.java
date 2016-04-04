/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleRootImpl#getRteModule <em>Rte Module</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleRootImpl#getRte <em>Rte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleRootImpl extends ExtendedEObjectImpl implements ModuleRoot {
	/**
	 * The cached value of the '{@link #getRteModule() <em>Rte Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteModule()
	 * @generated
	 * @ordered
	 */
	protected RteModule rteModule;

	/**
	 * The cached value of the '{@link #getRte() <em>Rte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRte()
	 * @generated
	 * @ordered
	 */
	protected Rte rte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODULE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteModule getRteModule() {
		return rteModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteModule(RteModule newRteModule, NotificationChain msgs) {
		RteModule oldRteModule = rteModule;
		rteModule = newRteModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE_ROOT__RTE_MODULE, oldRteModule, newRteModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteModule(RteModule newRteModule) {
		if (newRteModule != rteModule) {
			NotificationChain msgs = null;
			if (rteModule != null)
				msgs = ((InternalEObject)rteModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODULE_ROOT__RTE_MODULE, null, msgs);
			if (newRteModule != null)
				msgs = ((InternalEObject)newRteModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODULE_ROOT__RTE_MODULE, null, msgs);
			msgs = basicSetRteModule(newRteModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE_ROOT__RTE_MODULE, newRteModule, newRteModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rte getRte() {
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRte(Rte newRte, NotificationChain msgs) {
		Rte oldRte = rte;
		rte = newRte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE_ROOT__RTE, oldRte, newRte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRte(Rte newRte) {
		if (newRte != rte) {
			NotificationChain msgs = null;
			if (rte != null)
				msgs = ((InternalEObject)rte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODULE_ROOT__RTE, null, msgs);
			if (newRte != null)
				msgs = ((InternalEObject)newRte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODULE_ROOT__RTE, null, msgs);
			msgs = basicSetRte(newRte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE_ROOT__RTE, newRte, newRte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODULE_ROOT__RTE_MODULE:
				return basicSetRteModule(null, msgs);
			case ModulePackage.MODULE_ROOT__RTE:
				return basicSetRte(null, msgs);
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
			case ModulePackage.MODULE_ROOT__RTE_MODULE:
				return getRteModule();
			case ModulePackage.MODULE_ROOT__RTE:
				return getRte();
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
			case ModulePackage.MODULE_ROOT__RTE_MODULE:
				setRteModule((RteModule)newValue);
				return;
			case ModulePackage.MODULE_ROOT__RTE:
				setRte((Rte)newValue);
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
			case ModulePackage.MODULE_ROOT__RTE_MODULE:
				setRteModule((RteModule)null);
				return;
			case ModulePackage.MODULE_ROOT__RTE:
				setRte((Rte)null);
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
			case ModulePackage.MODULE_ROOT__RTE_MODULE:
				return rteModule != null;
			case ModulePackage.MODULE_ROOT__RTE:
				return rte != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleRootImpl
