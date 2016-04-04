/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disabled In Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getDisabledMode <em>Disabled Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DisabledInModeImpl#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisabledInModeImpl extends OperationImpl implements DisabledInMode {
	/**
	 * The cached value of the '{@link #getDisabledMode() <em>Disabled Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMode()
	 * @generated
	 * @ordered
	 */
	protected Constant disabledMode;

	/**
	 * The cached value of the '{@link #getModeMachineInstance() <em>Mode Machine Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeMachineInstance()
	 * @generated
	 * @ordered
	 */
	protected ModeMachineInstance modeMachineInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisabledInModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.DISABLED_IN_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getDisabledMode() {
		if (disabledMode != null && ((EObject)disabledMode).eIsProxy()) {
			InternalEObject oldDisabledMode = (InternalEObject)disabledMode;
			disabledMode = (Constant)eResolveProxy(oldDisabledMode);
			if (disabledMode != oldDisabledMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__DISABLED_MODE, oldDisabledMode, disabledMode));
			}
		}
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetDisabledMode() {
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledMode(Constant newDisabledMode) {
		Constant oldDisabledMode = disabledMode;
		disabledMode = newDisabledMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__DISABLED_MODE, oldDisabledMode, disabledMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance getModeMachineInstance() {
		if (modeMachineInstance != null && ((EObject)modeMachineInstance).eIsProxy()) {
			InternalEObject oldModeMachineInstance = (InternalEObject)modeMachineInstance;
			modeMachineInstance = (ModeMachineInstance)eResolveProxy(oldModeMachineInstance);
			if (modeMachineInstance != oldModeMachineInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.DISABLED_IN_MODE__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
			}
		}
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstance basicGetModeMachineInstance() {
		return modeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeMachineInstance(ModeMachineInstance newModeMachineInstance) {
		ModeMachineInstance oldModeMachineInstance = modeMachineInstance;
		modeMachineInstance = newModeMachineInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.DISABLED_IN_MODE__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				if (resolve) return getDisabledMode();
				return basicGetDisabledMode();
			case ModulePackage.DISABLED_IN_MODE__MODE_MACHINE_INSTANCE:
				if (resolve) return getModeMachineInstance();
				return basicGetModeMachineInstance();
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				setDisabledMode((Constant)newValue);
				return;
			case ModulePackage.DISABLED_IN_MODE__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)newValue);
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				setDisabledMode((Constant)null);
				return;
			case ModulePackage.DISABLED_IN_MODE__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)null);
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
			case ModulePackage.DISABLED_IN_MODE__DISABLED_MODE:
				return disabledMode != null;
			case ModulePackage.DISABLED_IN_MODE__MODE_MACHINE_INSTANCE:
				return modeMachineInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //DisabledInModeImpl
