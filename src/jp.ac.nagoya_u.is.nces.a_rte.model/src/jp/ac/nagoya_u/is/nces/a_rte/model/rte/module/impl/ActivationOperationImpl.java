/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ActivationOperationImpl#getActivationApi <em>Activation Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ActivationOperationImpl#getActivationFlag <em>Activation Flag</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ActivationOperationImpl#getOsTaskPriority <em>Os Task Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationOperationImpl extends OperationImpl implements ActivationOperation {
	/**
	 * The cached value of the '{@link #getActivationApi() <em>Activation Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationApi()
	 * @generated
	 * @ordered
	 */
	protected OsApi activationApi;

	/**
	 * The cached value of the '{@link #getActivationFlag() <em>Activation Flag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFlag()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable activationFlag;

	/**
	 * The default value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TASK_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskPriority() <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer osTaskPriority = OS_TASK_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.ACTIVATION_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApi getActivationApi() {
		if (activationApi != null && ((EObject)activationApi).eIsProxy()) {
			InternalEObject oldActivationApi = (InternalEObject)activationApi;
			activationApi = (OsApi)eResolveProxy(oldActivationApi);
			if (activationApi != oldActivationApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ACTIVATION_OPERATION__ACTIVATION_API, oldActivationApi, activationApi));
			}
		}
		return activationApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsApi basicGetActivationApi() {
		return activationApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationApi(OsApi newActivationApi) {
		OsApi oldActivationApi = activationApi;
		activationApi = newActivationApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ACTIVATION_OPERATION__ACTIVATION_API, oldActivationApi, activationApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getActivationFlag() {
		if (activationFlag != null && ((EObject)activationFlag).eIsProxy()) {
			InternalEObject oldActivationFlag = (InternalEObject)activationFlag;
			activationFlag = (LocalVariable)eResolveProxy(oldActivationFlag);
			if (activationFlag != oldActivationFlag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.ACTIVATION_OPERATION__ACTIVATION_FLAG, oldActivationFlag, activationFlag));
			}
		}
		return activationFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetActivationFlag() {
		return activationFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationFlag(LocalVariable newActivationFlag) {
		LocalVariable oldActivationFlag = activationFlag;
		activationFlag = newActivationFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ACTIVATION_OPERATION__ACTIVATION_FLAG, oldActivationFlag, activationFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOsTaskPriority() {
		return osTaskPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskPriority(Integer newOsTaskPriority) {
		Integer oldOsTaskPriority = osTaskPriority;
		osTaskPriority = newOsTaskPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.ACTIVATION_OPERATION__OS_TASK_PRIORITY, oldOsTaskPriority, osTaskPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_API:
				if (resolve) return getActivationApi();
				return basicGetActivationApi();
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_FLAG:
				if (resolve) return getActivationFlag();
				return basicGetActivationFlag();
			case ModulePackage.ACTIVATION_OPERATION__OS_TASK_PRIORITY:
				return getOsTaskPriority();
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
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_API:
				setActivationApi((OsApi)newValue);
				return;
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_FLAG:
				setActivationFlag((LocalVariable)newValue);
				return;
			case ModulePackage.ACTIVATION_OPERATION__OS_TASK_PRIORITY:
				setOsTaskPriority((Integer)newValue);
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
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_API:
				setActivationApi((OsApi)null);
				return;
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_FLAG:
				setActivationFlag((LocalVariable)null);
				return;
			case ModulePackage.ACTIVATION_OPERATION__OS_TASK_PRIORITY:
				setOsTaskPriority(OS_TASK_PRIORITY_EDEFAULT);
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
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_API:
				return activationApi != null;
			case ModulePackage.ACTIVATION_OPERATION__ACTIVATION_FLAG:
				return activationFlag != null;
			case ModulePackage.ACTIVATION_OPERATION__OS_TASK_PRIORITY:
				return OS_TASK_PRIORITY_EDEFAULT == null ? osTaskPriority != null : !OS_TASK_PRIORITY_EDEFAULT.equals(osTaskPriority);
		}
		return super.eIsSet(featureID);
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
		result.append(" (osTaskPriority: "); //$NON-NLS-1$
		result.append(osTaskPriority);
		result.append(')');
		return result.toString();
	}

} //ActivationOperationImpl
