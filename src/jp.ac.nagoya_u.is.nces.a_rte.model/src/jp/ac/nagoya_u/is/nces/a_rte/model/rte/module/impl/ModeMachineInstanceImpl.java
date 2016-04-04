/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Machine Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getRequestModeQueueType <em>Request Mode Queue Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getRequestModeQueue <em>Request Mode Queue</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getCurrentModeVariable <em>Current Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getNextModeVariable <em>Next Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModeMachineInstanceImpl#getInitModeConstant <em>Init Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeMachineInstanceImpl extends ModuleReferrableImpl implements ModeMachineInstance {
	/**
	 * The cached value of the '{@link #getRequestModeQueueType() <em>Request Mode Queue Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestModeQueueType()
	 * @generated
	 * @ordered
	 */
	protected ModeQueueType requestModeQueueType;

	/**
	 * The cached value of the '{@link #getRequestModeQueue() <em>Request Mode Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestModeQueue()
	 * @generated
	 * @ordered
	 */
	protected ModeQueuedVariable requestModeQueue;

	/**
	 * The cached value of the '{@link #getCurrentModeVariable() <em>Current Mode Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable currentModeVariable;

	/**
	 * The cached value of the '{@link #getNextModeVariable() <em>Next Mode Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModeVariable()
	 * @generated
	 * @ordered
	 */
	protected GlobalVariable nextModeVariable;

	/**
	 * The cached value of the '{@link #getInitModeConstant() <em>Init Mode Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitModeConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant initModeConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeMachineInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MODE_MACHINE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueueType getRequestModeQueueType() {
		return requestModeQueueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestModeQueueType(ModeQueueType newRequestModeQueueType, NotificationChain msgs) {
		ModeQueueType oldRequestModeQueueType = requestModeQueueType;
		requestModeQueueType = newRequestModeQueueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE, oldRequestModeQueueType, newRequestModeQueueType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestModeQueueType(ModeQueueType newRequestModeQueueType) {
		if (newRequestModeQueueType != requestModeQueueType) {
			NotificationChain msgs = null;
			if (requestModeQueueType != null)
				msgs = ((InternalEObject)requestModeQueueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE, null, msgs);
			if (newRequestModeQueueType != null)
				msgs = ((InternalEObject)newRequestModeQueueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE, null, msgs);
			msgs = basicSetRequestModeQueueType(newRequestModeQueueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE, newRequestModeQueueType, newRequestModeQueueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeQueuedVariable getRequestModeQueue() {
		return requestModeQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestModeQueue(ModeQueuedVariable newRequestModeQueue, NotificationChain msgs) {
		ModeQueuedVariable oldRequestModeQueue = requestModeQueue;
		requestModeQueue = newRequestModeQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE, oldRequestModeQueue, newRequestModeQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestModeQueue(ModeQueuedVariable newRequestModeQueue) {
		if (newRequestModeQueue != requestModeQueue) {
			NotificationChain msgs = null;
			if (requestModeQueue != null)
				msgs = ((InternalEObject)requestModeQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE, null, msgs);
			if (newRequestModeQueue != null)
				msgs = ((InternalEObject)newRequestModeQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE, null, msgs);
			msgs = basicSetRequestModeQueue(newRequestModeQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE, newRequestModeQueue, newRequestModeQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getCurrentModeVariable() {
		return currentModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentModeVariable(GlobalVariable newCurrentModeVariable, NotificationChain msgs) {
		GlobalVariable oldCurrentModeVariable = currentModeVariable;
		currentModeVariable = newCurrentModeVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, oldCurrentModeVariable, newCurrentModeVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentModeVariable(GlobalVariable newCurrentModeVariable) {
		if (newCurrentModeVariable != currentModeVariable) {
			NotificationChain msgs = null;
			if (currentModeVariable != null)
				msgs = ((InternalEObject)currentModeVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, null, msgs);
			if (newCurrentModeVariable != null)
				msgs = ((InternalEObject)newCurrentModeVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, null, msgs);
			msgs = basicSetCurrentModeVariable(newCurrentModeVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE, newCurrentModeVariable, newCurrentModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable getNextModeVariable() {
		return nextModeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextModeVariable(GlobalVariable newNextModeVariable, NotificationChain msgs) {
		GlobalVariable oldNextModeVariable = nextModeVariable;
		nextModeVariable = newNextModeVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, oldNextModeVariable, newNextModeVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextModeVariable(GlobalVariable newNextModeVariable) {
		if (newNextModeVariable != nextModeVariable) {
			NotificationChain msgs = null;
			if (nextModeVariable != null)
				msgs = ((InternalEObject)nextModeVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, null, msgs);
			if (newNextModeVariable != null)
				msgs = ((InternalEObject)newNextModeVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, null, msgs);
			msgs = basicSetNextModeVariable(newNextModeVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE, newNextModeVariable, newNextModeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInitModeConstant() {
		if (initModeConstant != null && ((EObject)initModeConstant).eIsProxy()) {
			InternalEObject oldInitModeConstant = (InternalEObject)initModeConstant;
			initModeConstant = (Constant)eResolveProxy(oldInitModeConstant);
			if (initModeConstant != oldInitModeConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT, oldInitModeConstant, initModeConstant));
			}
		}
		return initModeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetInitModeConstant() {
		return initModeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitModeConstant(Constant newInitModeConstant) {
		Constant oldInitModeConstant = initModeConstant;
		initModeConstant = newInitModeConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT, oldInitModeConstant, initModeConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE:
				return basicSetRequestModeQueueType(null, msgs);
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE:
				return basicSetRequestModeQueue(null, msgs);
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				return basicSetCurrentModeVariable(null, msgs);
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				return basicSetNextModeVariable(null, msgs);
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
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE:
				return getRequestModeQueueType();
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE:
				return getRequestModeQueue();
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				return getCurrentModeVariable();
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				return getNextModeVariable();
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				if (resolve) return getInitModeConstant();
				return basicGetInitModeConstant();
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
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE:
				setRequestModeQueueType((ModeQueueType)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE:
				setRequestModeQueue((ModeQueuedVariable)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)newValue);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)newValue);
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
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE:
				setRequestModeQueueType((ModeQueueType)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE:
				setRequestModeQueue((ModeQueuedVariable)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				setCurrentModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				setNextModeVariable((GlobalVariable)null);
				return;
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				setInitModeConstant((Constant)null);
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
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE:
				return requestModeQueueType != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE:
				return requestModeQueue != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
				return currentModeVariable != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
				return nextModeVariable != null;
			case ModulePackage.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT:
				return initModeConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeMachineInstanceImpl
