/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getCyclePeriodConstant <em>Cycle Period Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getCycleOffsetConstant <em>Cycle Offset Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getStartOffsetConstant <em>Start Offset Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getStartOffsetCounterVariable <em>Start Offset Counter Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getCycleCounterVariable <em>Cycle Counter Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingTriggeringExecutableStartOperationImpl extends ExecutableStartOperationImpl implements TimingTriggeringExecutableStartOperation {
	/**
	 * The cached value of the '{@link #getCyclePeriodConstant() <em>Cycle Period Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclePeriodConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant cyclePeriodConstant;

	/**
	 * The cached value of the '{@link #getCycleOffsetConstant() <em>Cycle Offset Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleOffsetConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant cycleOffsetConstant;

	/**
	 * The cached value of the '{@link #getStartOffsetConstant() <em>Start Offset Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffsetConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant startOffsetConstant;

	/**
	 * The cached value of the '{@link #getStartOffsetCounterVariable() <em>Start Offset Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffsetCounterVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable startOffsetCounterVariable;

	/**
	 * The cached value of the '{@link #getCycleCounterVariable() <em>Cycle Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCounterVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable cycleCounterVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingTriggeringExecutableStartOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getCyclePeriodConstant() {
		if (cyclePeriodConstant != null && ((EObject)cyclePeriodConstant).eIsProxy()) {
			InternalEObject oldCyclePeriodConstant = (InternalEObject)cyclePeriodConstant;
			cyclePeriodConstant = (Constant)eResolveProxy(oldCyclePeriodConstant);
			if (cyclePeriodConstant != oldCyclePeriodConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT, oldCyclePeriodConstant, cyclePeriodConstant));
			}
		}
		return cyclePeriodConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetCyclePeriodConstant() {
		return cyclePeriodConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclePeriodConstant(Constant newCyclePeriodConstant) {
		Constant oldCyclePeriodConstant = cyclePeriodConstant;
		cyclePeriodConstant = newCyclePeriodConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT, oldCyclePeriodConstant, cyclePeriodConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getCycleOffsetConstant() {
		if (cycleOffsetConstant != null && ((EObject)cycleOffsetConstant).eIsProxy()) {
			InternalEObject oldCycleOffsetConstant = (InternalEObject)cycleOffsetConstant;
			cycleOffsetConstant = (Constant)eResolveProxy(oldCycleOffsetConstant);
			if (cycleOffsetConstant != oldCycleOffsetConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT, oldCycleOffsetConstant, cycleOffsetConstant));
			}
		}
		return cycleOffsetConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetCycleOffsetConstant() {
		return cycleOffsetConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleOffsetConstant(Constant newCycleOffsetConstant) {
		Constant oldCycleOffsetConstant = cycleOffsetConstant;
		cycleOffsetConstant = newCycleOffsetConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT, oldCycleOffsetConstant, cycleOffsetConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getStartOffsetConstant() {
		if (startOffsetConstant != null && ((EObject)startOffsetConstant).eIsProxy()) {
			InternalEObject oldStartOffsetConstant = (InternalEObject)startOffsetConstant;
			startOffsetConstant = (Constant)eResolveProxy(oldStartOffsetConstant);
			if (startOffsetConstant != oldStartOffsetConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT, oldStartOffsetConstant, startOffsetConstant));
			}
		}
		return startOffsetConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetStartOffsetConstant() {
		return startOffsetConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffsetConstant(Constant newStartOffsetConstant) {
		Constant oldStartOffsetConstant = startOffsetConstant;
		startOffsetConstant = newStartOffsetConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT, oldStartOffsetConstant, startOffsetConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getStartOffsetCounterVariable() {
		if (startOffsetCounterVariable != null && ((EObject)startOffsetCounterVariable).eIsProxy()) {
			InternalEObject oldStartOffsetCounterVariable = (InternalEObject)startOffsetCounterVariable;
			startOffsetCounterVariable = (GlobalVariable)eResolveProxy(oldStartOffsetCounterVariable);
			if (startOffsetCounterVariable != oldStartOffsetCounterVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE, oldStartOffsetCounterVariable, startOffsetCounterVariable));
			}
		}
		return startOffsetCounterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetStartOffsetCounterVariable() {
		return startOffsetCounterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffsetCounterVariable(GlobalVariable newStartOffsetCounterVariable) {
		GlobalVariable oldStartOffsetCounterVariable = startOffsetCounterVariable;
		startOffsetCounterVariable = newStartOffsetCounterVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE, oldStartOffsetCounterVariable, startOffsetCounterVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCycleCounterVariable() {
		if (cycleCounterVariable != null && ((EObject)cycleCounterVariable).eIsProxy()) {
			InternalEObject oldCycleCounterVariable = (InternalEObject)cycleCounterVariable;
			cycleCounterVariable = (GlobalVariable)eResolveProxy(oldCycleCounterVariable);
			if (cycleCounterVariable != oldCycleCounterVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE, oldCycleCounterVariable, cycleCounterVariable));
			}
		}
		return cycleCounterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable basicGetCycleCounterVariable() {
		return cycleCounterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleCounterVariable(GlobalVariable newCycleCounterVariable) {
		GlobalVariable oldCycleCounterVariable = cycleCounterVariable;
		cycleCounterVariable = newCycleCounterVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE, oldCycleCounterVariable, cycleCounterVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT:
				if (resolve) return getCyclePeriodConstant();
				return basicGetCyclePeriodConstant();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT:
				if (resolve) return getCycleOffsetConstant();
				return basicGetCycleOffsetConstant();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT:
				if (resolve) return getStartOffsetConstant();
				return basicGetStartOffsetConstant();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE:
				if (resolve) return getStartOffsetCounterVariable();
				return basicGetStartOffsetCounterVariable();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE:
				if (resolve) return getCycleCounterVariable();
				return basicGetCycleCounterVariable();
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
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT:
				setCyclePeriodConstant((Constant)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT:
				setCycleOffsetConstant((Constant)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT:
				setStartOffsetConstant((Constant)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE:
				setStartOffsetCounterVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE:
				setCycleCounterVariable((GlobalVariable)newValue);
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
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT:
				setCyclePeriodConstant((Constant)null);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT:
				setCycleOffsetConstant((Constant)null);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT:
				setStartOffsetConstant((Constant)null);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE:
				setStartOffsetCounterVariable((GlobalVariable)null);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE:
				setCycleCounterVariable((GlobalVariable)null);
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
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT:
				return cyclePeriodConstant != null;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT:
				return cycleOffsetConstant != null;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT:
				return startOffsetConstant != null;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE:
				return startOffsetCounterVariable != null;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE:
				return cycleCounterVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingTriggeringExecutableStartOperationImpl
