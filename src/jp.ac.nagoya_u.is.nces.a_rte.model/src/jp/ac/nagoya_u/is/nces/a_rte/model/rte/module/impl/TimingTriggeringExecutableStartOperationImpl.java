/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
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
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TimingTriggeringExecutableStartOperationImpl
