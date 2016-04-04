/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Signal Immediate Task Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl#getStartEntity <em>Start Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl#getOsEventId <em>Os Event Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendSignalImmediateTaskBodyImpl extends TaskBodyImpl implements ComSendSignalImmediateTaskBody {
	/**
	 * The cached value of the '{@link #getStartEntity() <em>Start Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEntity()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalImmediateEntity startEntity;

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
	protected ComSendSignalImmediateTaskBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity getStartEntity() {
		if (startEntity != null && ((EObject)startEntity).eIsProxy()) {
			InternalEObject oldStartEntity = (InternalEObject)startEntity;
			startEntity = (ComSendSignalImmediateEntity)eResolveProxy(oldStartEntity);
			if (startEntity != oldStartEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY, oldStartEntity, startEntity));
			}
		}
		return startEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity basicGetStartEntity() {
		return startEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEntity(ComSendSignalImmediateEntity newStartEntity) {
		ComSendSignalImmediateEntity oldStartEntity = startEntity;
		startEntity = newStartEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY, oldStartEntity, startEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID, oldOsEventId, osEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				if (resolve) return getStartEntity();
				return basicGetStartEntity();
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
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
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				setStartEntity((ComSendSignalImmediateEntity)newValue);
				return;
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
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
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				setStartEntity((ComSendSignalImmediateEntity)null);
				return;
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
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
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY:
				return startEntity != null;
			case ModulePackage.COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID:
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
		result.append(" (osEventId: "); //$NON-NLS-1$
		result.append(osEventId);
		result.append(')');
		return result.toString();
	}

} //ComSendSignalImmediateTaskBodyImpl
