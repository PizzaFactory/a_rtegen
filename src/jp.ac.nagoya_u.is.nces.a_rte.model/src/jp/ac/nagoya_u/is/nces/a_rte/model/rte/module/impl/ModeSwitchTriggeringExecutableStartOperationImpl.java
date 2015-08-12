/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DisabledInMode;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Switch Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getExcludeOperation <em>Exclude Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getStartExecutable <em>Start Executable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getCurrentMode <em>Current Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getNextMode <em>Next Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getDisabledMode <em>Disabled Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getStartMode <em>Start Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeSwitchTriggeringExecutableStartOperationImpl extends OperationImpl implements ModeSwitchTriggeringExecutableStartOperation {
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
	 * The cached value of the '{@link #getStartMode() <em>Start Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> startMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeSwitchTriggeringExecutableStartOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExcludeOperation> getExcludeOperation() {
		if (excludeOperation == null) {
			excludeOperation = new EObjectContainmentEList<ExcludeOperation>(ExcludeOperation.class, this, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE, oldStartExecutable, startExecutable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE, oldStartExecutable, startExecutable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE, oldCurrentMode, currentMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE, oldNextMode, nextMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisabledInMode> getDisabledMode() {
		if (disabledMode == null) {
			disabledMode = new EObjectContainmentEList<DisabledInMode>(DisabledInMode.class, this, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE);
		}
		return disabledMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getStartMode() {
		if (startMode == null) {
			startMode = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE);
		}
		return startMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				return ((InternalEList<?>)getExcludeOperation()).basicRemove(otherEnd, msgs);
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
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
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				return getExcludeOperation();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				if (resolve) return getStartExecutable();
				return basicGetStartExecutable();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				return getCurrentMode();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				return getNextMode();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				return getDisabledMode();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE:
				return getStartMode();
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
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				getExcludeOperation().clear();
				getExcludeOperation().addAll((Collection<? extends ExcludeOperation>)newValue);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				setStartExecutable((ExecutableEntity)newValue);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				setCurrentMode((String)newValue);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				setNextMode((String)newValue);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				getDisabledMode().clear();
				getDisabledMode().addAll((Collection<? extends DisabledInMode>)newValue);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE:
				getStartMode().clear();
				getStartMode().addAll((Collection<? extends Constant>)newValue);
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
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				getExcludeOperation().clear();
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				setStartExecutable((ExecutableEntity)null);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				setCurrentMode(CURRENT_MODE_EDEFAULT);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				setNextMode(NEXT_MODE_EDEFAULT);
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				getDisabledMode().clear();
				return;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE:
				getStartMode().clear();
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
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION:
				return excludeOperation != null && !excludeOperation.isEmpty();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE:
				return startExecutable != null;
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE:
				return CURRENT_MODE_EDEFAULT == null ? currentMode != null : !CURRENT_MODE_EDEFAULT.equals(currentMode);
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE:
				return NEXT_MODE_EDEFAULT == null ? nextMode != null : !NEXT_MODE_EDEFAULT.equals(nextMode);
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE:
				return disabledMode != null && !disabledMode.isEmpty();
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE:
				return startMode != null && !startMode.isEmpty();
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
				case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION: return ModulePackage.EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION;
				case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE: return ModulePackage.EXECUTABLE_START_OPERATION__START_EXECUTABLE;
				case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE: return ModulePackage.EXECUTABLE_START_OPERATION__CURRENT_MODE;
				case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE: return ModulePackage.EXECUTABLE_START_OPERATION__NEXT_MODE;
				case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE: return ModulePackage.EXECUTABLE_START_OPERATION__DISABLED_MODE;
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
				case ModulePackage.EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION: return ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION;
				case ModulePackage.EXECUTABLE_START_OPERATION__START_EXECUTABLE: return ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE;
				case ModulePackage.EXECUTABLE_START_OPERATION__CURRENT_MODE: return ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__CURRENT_MODE;
				case ModulePackage.EXECUTABLE_START_OPERATION__NEXT_MODE: return ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__NEXT_MODE;
				case ModulePackage.EXECUTABLE_START_OPERATION__DISABLED_MODE: return ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__DISABLED_MODE;
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

} //ModeSwitchTriggeringExecutableStartOperationImpl
