/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Set Event Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSetEventApiImpl#getOsTaskId <em>Os Task Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSetEventApiImpl#getOsEventId <em>Os Event Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsSetEventApiImpl extends OsApiImpl implements OsSetEventApi {
	/**
	 * The default value of the '{@link #getOsTaskId() <em>Os Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsTaskId() <em>Os Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskId()
	 * @generated
	 * @ordered
	 */
	protected String osTaskId = OS_TASK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected String osEventId = OS_EVENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsSetEventApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_SET_EVENT_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsTaskId() {
		return osTaskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTaskId(String newOsTaskId) {
		String oldOsTaskId = osTaskId;
		osTaskId = newOsTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_SET_EVENT_API__OS_TASK_ID, oldOsTaskId, osTaskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsEventId() {
		return osEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsEventId(String newOsEventId) {
		String oldOsEventId = osEventId;
		osEventId = newOsEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_SET_EVENT_API__OS_EVENT_ID, oldOsEventId, osEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_SET_EVENT_API__OS_TASK_ID:
				return getOsTaskId();
			case ModulePackage.OS_SET_EVENT_API__OS_EVENT_ID:
				return getOsEventId();
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
			case ModulePackage.OS_SET_EVENT_API__OS_TASK_ID:
				setOsTaskId((String)newValue);
				return;
			case ModulePackage.OS_SET_EVENT_API__OS_EVENT_ID:
				setOsEventId((String)newValue);
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
			case ModulePackage.OS_SET_EVENT_API__OS_TASK_ID:
				setOsTaskId(OS_TASK_ID_EDEFAULT);
				return;
			case ModulePackage.OS_SET_EVENT_API__OS_EVENT_ID:
				setOsEventId(OS_EVENT_ID_EDEFAULT);
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
			case ModulePackage.OS_SET_EVENT_API__OS_TASK_ID:
				return OS_TASK_ID_EDEFAULT == null ? osTaskId != null : !OS_TASK_ID_EDEFAULT.equals(osTaskId);
			case ModulePackage.OS_SET_EVENT_API__OS_EVENT_ID:
				return OS_EVENT_ID_EDEFAULT == null ? osEventId != null : !OS_EVENT_ID_EDEFAULT.equals(osEventId);
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
		result.append(" (osTaskId: "); //$NON-NLS-1$
		result.append(osTaskId);
		result.append(", osEventId: "); //$NON-NLS-1$
		result.append(osEventId);
		result.append(')');
		return result.toString();
	}

} //OsSetEventApiImpl
