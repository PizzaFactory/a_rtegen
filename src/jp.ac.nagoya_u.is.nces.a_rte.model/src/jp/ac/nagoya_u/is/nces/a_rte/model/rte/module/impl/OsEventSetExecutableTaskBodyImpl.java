/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Event Set Executable Task Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getOsEventId <em>Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getChecksOsEventId <em>Checks Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getEventVariable <em>Event Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsEventSetExecutableTaskBodyImpl extends TaskBodyImpl implements OsEventSetExecutableTaskBody {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEventSetActivationOperation> operation;

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
	 * The default value of the '{@link #getChecksOsEventId() <em>Checks Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksOsEventId()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHECKS_OS_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksOsEventId() <em>Checks Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksOsEventId()
	 * @generated
	 * @ordered
	 */
	protected Boolean checksOsEventId = CHECKS_OS_EVENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventVariable() <em>Event Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable eventVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsEventSetExecutableTaskBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_EVENT_SET_EXECUTABLE_TASK_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEventSetActivationOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OsEventSetActivationOperation>(OsEventSetActivationOperation.class, this, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOsEventId() {
		if (osEventId == null) {
			osEventId = new EDataTypeUniqueEList<String>(String.class, this, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID);
		}
		return osEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getChecksOsEventId() {
		return checksOsEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksOsEventId(Boolean newChecksOsEventId) {
		Boolean oldChecksOsEventId = checksOsEventId;
		checksOsEventId = newChecksOsEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID, oldChecksOsEventId, checksOsEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getEventVariable() {
		if (eventVariable != null && ((EObject)eventVariable).eIsProxy()) {
			InternalEObject oldEventVariable = (InternalEObject)eventVariable;
			eventVariable = (Variable)eResolveProxy(oldEventVariable);
			if (eventVariable != oldEventVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE, oldEventVariable, eventVariable));
			}
		}
		return eventVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetEventVariable() {
		return eventVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventVariable(Variable newEventVariable) {
		Variable oldEventVariable = eventVariable;
		eventVariable = newEventVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE, oldEventVariable, eventVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				return getOperation();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				return getOsEventId();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				return getChecksOsEventId();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				if (resolve) return getEventVariable();
				return basicGetEventVariable();
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
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OsEventSetActivationOperation>)newValue);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				getOsEventId().clear();
				getOsEventId().addAll((Collection<? extends String>)newValue);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				setChecksOsEventId((Boolean)newValue);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				setEventVariable((Variable)newValue);
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
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				getOperation().clear();
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				getOsEventId().clear();
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				setChecksOsEventId(CHECKS_OS_EVENT_ID_EDEFAULT);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				setEventVariable((Variable)null);
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
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				return operation != null && !operation.isEmpty();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				return osEventId != null && !osEventId.isEmpty();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				return CHECKS_OS_EVENT_ID_EDEFAULT == null ? checksOsEventId != null : !CHECKS_OS_EVENT_ID_EDEFAULT.equals(checksOsEventId);
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				return eventVariable != null;
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
		result.append(", checksOsEventId: "); //$NON-NLS-1$
		result.append(checksOsEventId);
		result.append(')');
		return result.toString();
	}

} //OsEventSetExecutableTaskBodyImpl
