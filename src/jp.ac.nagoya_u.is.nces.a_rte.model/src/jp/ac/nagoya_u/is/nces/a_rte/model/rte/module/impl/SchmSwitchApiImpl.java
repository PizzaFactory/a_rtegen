/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi;

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
 * An implementation of the model object '<em><b>Schm Switch Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getOsTaskEventTriggeredByMode <em>Os Task Event Triggered By Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmSwitchApiImpl#getExecutableStartOperation <em>Executable Start Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmSwitchApiImpl extends SchmApiImpl implements SchmSwitchApi {
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
	 * The cached value of the '{@link #getOsTaskEventTriggeredByMode() <em>Os Task Event Triggered By Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskEventTriggeredByMode()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTaskEventsTriggeredByMode> osTaskEventTriggeredByMode;

	/**
	 * The cached value of the '{@link #getExecutableStartOperation() <em>Executable Start Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableStartOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeSwitchTriggeringExecutableStartOperation> executableStartOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchmSwitchApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_SWITCH_API;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE, oldModeMachineInstance, modeMachineInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTaskEventsTriggeredByMode> getOsTaskEventTriggeredByMode() {
		if (osTaskEventTriggeredByMode == null) {
			osTaskEventTriggeredByMode = new EObjectContainmentEList<OsTaskEventsTriggeredByMode>(OsTaskEventsTriggeredByMode.class, this, ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE);
		}
		return osTaskEventTriggeredByMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeSwitchTriggeringExecutableStartOperation> getExecutableStartOperation() {
		if (executableStartOperation == null) {
			executableStartOperation = new EObjectContainmentEList<ModeSwitchTriggeringExecutableStartOperation>(ModeSwitchTriggeringExecutableStartOperation.class, this, ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION);
		}
		return executableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				return ((InternalEList<?>)getOsTaskEventTriggeredByMode()).basicRemove(otherEnd, msgs);
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return ((InternalEList<?>)getExecutableStartOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				if (resolve) return getModeMachineInstance();
				return basicGetModeMachineInstance();
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				return getOsTaskEventTriggeredByMode();
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return getExecutableStartOperation();
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				getOsTaskEventTriggeredByMode().clear();
				getOsTaskEventTriggeredByMode().addAll((Collection<? extends OsTaskEventsTriggeredByMode>)newValue);
				return;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
				getExecutableStartOperation().addAll((Collection<? extends ModeSwitchTriggeringExecutableStartOperation>)newValue);
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				setModeMachineInstance((ModeMachineInstance)null);
				return;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				getOsTaskEventTriggeredByMode().clear();
				return;
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				getExecutableStartOperation().clear();
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
			case ModulePackage.SCHM_SWITCH_API__MODE_MACHINE_INSTANCE:
				return modeMachineInstance != null;
			case ModulePackage.SCHM_SWITCH_API__OS_TASK_EVENT_TRIGGERED_BY_MODE:
				return osTaskEventTriggeredByMode != null && !osTaskEventTriggeredByMode.isEmpty();
			case ModulePackage.SCHM_SWITCH_API__EXECUTABLE_START_OPERATION:
				return executableStartOperation != null && !executableStartOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchmSwitchApiImpl
