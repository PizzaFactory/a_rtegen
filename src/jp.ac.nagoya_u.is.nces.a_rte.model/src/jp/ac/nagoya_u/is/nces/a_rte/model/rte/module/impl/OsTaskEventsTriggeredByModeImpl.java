/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode;

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
 * An implementation of the model object '<em><b>Os Task Events Triggered By Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventsTriggeredByModeImpl#getStartMode <em>Start Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskEventsTriggeredByModeImpl#getOsTaskEvent <em>Os Task Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsTaskEventsTriggeredByModeImpl extends ModuleObjectImpl implements OsTaskEventsTriggeredByMode {
	/**
	 * The cached value of the '{@link #getStartMode() <em>Start Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMode()
	 * @generated
	 * @ordered
	 */
	protected Constant startMode;

	/**
	 * The cached value of the '{@link #getOsTaskEvent() <em>Os Task Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTaskEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<OsTaskEvent> osTaskEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsTaskEventsTriggeredByModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_TASK_EVENTS_TRIGGERED_BY_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getStartMode() {
		if (startMode != null && ((EObject)startMode).eIsProxy()) {
			InternalEObject oldStartMode = (InternalEObject)startMode;
			startMode = (Constant)eResolveProxy(oldStartMode);
			if (startMode != oldStartMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, oldStartMode, startMode));
			}
		}
		return startMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetStartMode() {
		return startMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMode(Constant newStartMode) {
		Constant oldStartMode = startMode;
		startMode = newStartMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE, oldStartMode, startMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsTaskEvent> getOsTaskEvent() {
		if (osTaskEvent == null) {
			osTaskEvent = new EObjectContainmentEList<OsTaskEvent>(OsTaskEvent.class, this, ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT);
		}
		return osTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT:
				return ((InternalEList<?>)getOsTaskEvent()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE:
				if (resolve) return getStartMode();
				return basicGetStartMode();
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT:
				return getOsTaskEvent();
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
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE:
				setStartMode((Constant)newValue);
				return;
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT:
				getOsTaskEvent().clear();
				getOsTaskEvent().addAll((Collection<? extends OsTaskEvent>)newValue);
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
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE:
				setStartMode((Constant)null);
				return;
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT:
				getOsTaskEvent().clear();
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
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__START_MODE:
				return startMode != null;
			case ModulePackage.OS_TASK_EVENTS_TRIGGERED_BY_MODE__OS_TASK_EVENT:
				return osTaskEvent != null && !osTaskEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OsTaskEventsTriggeredByModeImpl
