/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;
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
 * An implementation of the model object '<em><b>Timing Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getExcludeOperation <em>Exclude Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getStartExecutable <em>Start Executable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getCurrentMode <em>Current Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getNextMode <em>Next Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl#getDisabledMode <em>Disabled Mode</em>}</li>
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
public class TimingTriggeringExecutableStartOperationImpl extends OperationImpl implements TimingTriggeringExecutableStartOperation {
	/**
	 * The cached value of the '{@link #getExcludeOperation() <em>Exclude Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcludeOperation> excludeOperation;

	/**
	 * The cached value of the '{@link #getStartExecutable() <em>Start Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartExecutable()
	 * @generated
	 * @ordered
	 */
	protected ExecutableEntity startExecutable;

	/**
	 * The default value of the '{@link #getCurrentMode() <em>Current Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMode()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentMode() <em>Current Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMode()
	 * @generated
	 * @ordered
	 */
	protected String currentMode = CURRENT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextMode() <em>Next Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMode()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextMode() <em>Next Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMode()
	 * @generated
	 * @ordered
	 */
	protected String nextMode = NEXT_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisabledMode() <em>Disabled Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMode()
	 * @generated
	 * @ordered
	 */
	protected EList<DisabledInMode> disabledMode;

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
	public EList<ExcludeOperation> getExcludeOperation() {
		if (excludeOperation == null) {
			excludeOperation = new EObjectContainmentEList<ExcludeOperation>(ExcludeOperation.class, this, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION);
		}
		return excludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntity getStartExecutable() {
		if (startExecutable != null && ((EObject)startExecutable).eIsProxy()) {
			InternalEObject oldStartExecutable = (InternalEObject)startExecutable;
			startExecutable = (ExecutableEntity)eResolveProxy(oldStartExecutable);
			if (startExecutable != oldStartExecutable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE, oldStartExecutable, startExecutable));
			}
		}
		return startExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntity basicGetStartExecutable() {
		return startExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartExecutable(ExecutableEntity newStartExecutable) {
		ExecutableEntity oldStartExecutable = startExecutable;
		startExecutable = newStartExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE, oldStartExecutable, startExecutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentMode() {
		return currentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMode(String newCurrentMode) {
		String oldCurrentMode = currentMode;
		currentMode = newCurrentMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE, oldCurrentMode, currentMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextMode() {
		return nextMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextMode(String newNextMode) {
		String oldNextMode = nextMode;
		nextMode = newNextMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE, oldNextMode, nextMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisabledInMode> getDisabledMode() {
		if (disabledMode == null) {
			disabledMode = new EObjectContainmentEList<DisabledInMode>(DisabledInMode.class, this, ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE);
		}
		return disabledMode;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				return ((InternalEList<?>)getExcludeOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				return ((InternalEList<?>)getDisabledMode()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				return getExcludeOperation();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				if (resolve) return getStartExecutable();
				return basicGetStartExecutable();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				return getCurrentMode();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				return getNextMode();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				return getDisabledMode();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				getExcludeOperation().clear();
				getExcludeOperation().addAll((Collection<? extends ExcludeOperation>)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				setStartExecutable((ExecutableEntity)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				setCurrentMode((String)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				setNextMode((String)newValue);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				getDisabledMode().clear();
				getDisabledMode().addAll((Collection<? extends DisabledInMode>)newValue);
				return;
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
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				getExcludeOperation().clear();
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				setStartExecutable((ExecutableEntity)null);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				setCurrentMode(CURRENT_MODE_EDEFAULT);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				setNextMode(NEXT_MODE_EDEFAULT);
				return;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				getDisabledMode().clear();
				return;
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
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				return excludeOperation != null && !excludeOperation.isEmpty();
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				return startExecutable != null;
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				return CURRENT_MODE_EDEFAULT == null ? currentMode != null : !CURRENT_MODE_EDEFAULT.equals(currentMode);
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				return NEXT_MODE_EDEFAULT == null ? nextMode != null : !NEXT_MODE_EDEFAULT.equals(nextMode);
			case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				return disabledMode != null && !disabledMode.isEmpty();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ExecutableStartOperation.class) {
			switch (derivedFeatureID) {
				case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION: return ModulePackage.EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION;
				case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE: return ModulePackage.EXECUTABLE_START_OPERATION__START_EXECUTABLE;
				case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE: return ModulePackage.EXECUTABLE_START_OPERATION__CURRENT_MODE;
				case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE: return ModulePackage.EXECUTABLE_START_OPERATION__NEXT_MODE;
				case ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE: return ModulePackage.EXECUTABLE_START_OPERATION__DISABLED_MODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ExecutableStartOperation.class) {
			switch (baseFeatureID) {
				case ModulePackage.EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION: return ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION;
				case ModulePackage.EXECUTABLE_START_OPERATION__START_EXECUTABLE: return ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE;
				case ModulePackage.EXECUTABLE_START_OPERATION__CURRENT_MODE: return ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE;
				case ModulePackage.EXECUTABLE_START_OPERATION__NEXT_MODE: return ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE;
				case ModulePackage.EXECUTABLE_START_OPERATION__DISABLED_MODE: return ModulePackage.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentMode: ");
		result.append(currentMode);
		result.append(", nextMode: ");
		result.append(nextMode);
		result.append(')');
		return result.toString();
	}

} //TimingTriggeringExecutableStartOperationImpl
