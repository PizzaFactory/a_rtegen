/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schm Init Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl#getInitialExecutableStartOperation <em>Initial Executable Start Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl#getInitialExecutableOsTaskEvent <em>Initial Executable Os Task Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl#getInitTargetModeMachineInstance <em>Init Target Mode Machine Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchmInitApiImpl extends SchmLifecycleApiImpl implements SchmInitApi {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<InitializeOperation> operation;

	/**
	 * The cached value of the '{@link #getInitialExecutableStartOperation() <em>Initial Executable Start Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialExecutableStartOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeSwitchTriggeringExecutableStartOperation> initialExecutableStartOperation;

	/**
	 * The cached value of the '{@link #getInitialExecutableOsTaskEvent() <em>Initial Executable Os Task Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialExecutableOsTaskEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTaskEvent> initialExecutableOsTaskEvent;

	/**
	 * The cached value of the '{@link #getInitTargetModeMachineInstance() <em>Init Target Mode Machine Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTargetModeMachineInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeMachineInstance> initTargetModeMachineInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchmInitApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SCHM_INIT_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitializeOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<InitializeOperation>(InitializeOperation.class, this, ModulePackage.SCHM_INIT_API__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeSwitchTriggeringExecutableStartOperation> getInitialExecutableStartOperation() {
		if (initialExecutableStartOperation == null) {
			initialExecutableStartOperation = new EObjectContainmentEList<ModeSwitchTriggeringExecutableStartOperation>(ModeSwitchTriggeringExecutableStartOperation.class, this, ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION);
		}
		return initialExecutableStartOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTaskEvent> getInitialExecutableOsTaskEvent() {
		if (initialExecutableOsTaskEvent == null) {
			initialExecutableOsTaskEvent = new EObjectContainmentEList<OsTaskEvent>(OsTaskEvent.class, this, ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT);
		}
		return initialExecutableOsTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeMachineInstance> getInitTargetModeMachineInstance() {
		if (initTargetModeMachineInstance == null) {
			initTargetModeMachineInstance = new EObjectResolvingEList<ModeMachineInstance>(ModeMachineInstance.class, this, ModulePackage.SCHM_INIT_API__INIT_TARGET_MODE_MACHINE_INSTANCE);
		}
		return initTargetModeMachineInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SCHM_INIT_API__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION:
				return ((InternalEList<?>)getInitialExecutableStartOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT:
				return ((InternalEList<?>)getInitialExecutableOsTaskEvent()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.SCHM_INIT_API__OPERATION:
				return getOperation();
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION:
				return getInitialExecutableStartOperation();
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT:
				return getInitialExecutableOsTaskEvent();
			case ModulePackage.SCHM_INIT_API__INIT_TARGET_MODE_MACHINE_INSTANCE:
				return getInitTargetModeMachineInstance();
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
			case ModulePackage.SCHM_INIT_API__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends InitializeOperation>)newValue);
				return;
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION:
				getInitialExecutableStartOperation().clear();
				getInitialExecutableStartOperation().addAll((Collection<? extends ModeSwitchTriggeringExecutableStartOperation>)newValue);
				return;
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT:
				getInitialExecutableOsTaskEvent().clear();
				getInitialExecutableOsTaskEvent().addAll((Collection<? extends OsTaskEvent>)newValue);
				return;
			case ModulePackage.SCHM_INIT_API__INIT_TARGET_MODE_MACHINE_INSTANCE:
				getInitTargetModeMachineInstance().clear();
				getInitTargetModeMachineInstance().addAll((Collection<? extends ModeMachineInstance>)newValue);
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
			case ModulePackage.SCHM_INIT_API__OPERATION:
				getOperation().clear();
				return;
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION:
				getInitialExecutableStartOperation().clear();
				return;
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT:
				getInitialExecutableOsTaskEvent().clear();
				return;
			case ModulePackage.SCHM_INIT_API__INIT_TARGET_MODE_MACHINE_INSTANCE:
				getInitTargetModeMachineInstance().clear();
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
			case ModulePackage.SCHM_INIT_API__OPERATION:
				return operation != null && !operation.isEmpty();
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_START_OPERATION:
				return initialExecutableStartOperation != null && !initialExecutableStartOperation.isEmpty();
			case ModulePackage.SCHM_INIT_API__INITIAL_EXECUTABLE_OS_TASK_EVENT:
				return initialExecutableOsTaskEvent != null && !initialExecutableOsTaskEvent.isEmpty();
			case ModulePackage.SCHM_INIT_API__INIT_TARGET_MODE_MACHINE_INSTANCE:
				return initTargetModeMachineInstance != null && !initTargetModeMachineInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchmInitApiImpl
