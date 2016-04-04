/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Switch Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeSwitchTriggeringExecutableStartOperationImpl#getStartMode <em>Start Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeSwitchTriggeringExecutableStartOperationImpl extends ExecutableStartOperationImpl implements ModeSwitchTriggeringExecutableStartOperation {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case ModulePackage.MODE_SWITCH_TRIGGERING_EXECUTABLE_START_OPERATION__START_MODE:
				return startMode != null && !startMode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModeSwitchTriggeringExecutableStartOperationImpl
