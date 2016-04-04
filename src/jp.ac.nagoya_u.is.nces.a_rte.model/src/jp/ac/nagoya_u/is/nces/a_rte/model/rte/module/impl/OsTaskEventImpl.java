/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Task Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getOsTaskId <em>Os Task Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getOsEventId <em>Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventImpl#getOsTaskPriority <em>Os Task Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsTaskEventImpl extends ModuleObjectImpl implements OsTaskEvent {
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
	 * The cached value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> osEventId;

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
	protected OsTaskEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_TASK_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__OS_TASK_ID, oldOsTaskId, osTaskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOsEventId() {
		if (osEventId == null) {
			osEventId = new EDataTypeUniqueEList<String>(String.class, this, ModulePackage.OS_TASK_EVENT__OS_EVENT_ID);
		}
		return osEventId;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY, oldOsTaskPriority, osTaskPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				return getOsTaskId();
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				return getOsEventId();
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
				return getOsTaskPriority();
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
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				setOsTaskId((String)newValue);
				return;
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				getOsEventId().clear();
				getOsEventId().addAll((Collection<? extends String>)newValue);
				return;
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
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
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				setOsTaskId(OS_TASK_ID_EDEFAULT);
				return;
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				getOsEventId().clear();
				return;
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
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
			case ModulePackage.OS_TASK_EVENT__OS_TASK_ID:
				return OS_TASK_ID_EDEFAULT == null ? osTaskId != null : !OS_TASK_ID_EDEFAULT.equals(osTaskId);
			case ModulePackage.OS_TASK_EVENT__OS_EVENT_ID:
				return osEventId != null && !osEventId.isEmpty();
			case ModulePackage.OS_TASK_EVENT__OS_TASK_PRIORITY:
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
		result.append(" (osTaskId: "); //$NON-NLS-1$
		result.append(osTaskId);
		result.append(", osEventId: "); //$NON-NLS-1$
		result.append(osEventId);
		result.append(", osTaskPriority: "); //$NON-NLS-1$
		result.append(osTaskPriority);
		result.append(')');
		return result.toString();
	}

} //OsTaskEventImpl
