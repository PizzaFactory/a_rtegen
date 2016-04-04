/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapper;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal Api Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSignalApiWrapperImpl#getDataParam <em>Data Param</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSignalApiWrapperImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSignalApiWrapperImpl#getSignalSymbolName <em>Signal Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSignalApiWrapperImpl#getSignalGroupSymbolName <em>Signal Group Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComSignalApiWrapperImpl extends FunctionImpl implements ComSignalApiWrapper {
	/**
	 * The cached value of the '{@link #getDataParam() <em>Data Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataParam()
	 * @generated
	 * @ordered
	 */
	protected Parameter dataParam;

	/**
	 * The default value of the '{@link #getSignalSymbolName() <em>Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalSymbolName() <em>Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String signalSymbolName = SIGNAL_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalGroupSymbolName() <em>Signal Group Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalGroupSymbolName() <em>Signal Group Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String signalGroupSymbolName = SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalApiWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.COM_SIGNAL_API_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getDataParam() {
		if (dataParam != null && ((EObject)dataParam).eIsProxy()) {
			InternalEObject oldDataParam = (InternalEObject)dataParam;
			dataParam = (Parameter)eResolveProxy(oldDataParam);
			if (dataParam != oldDataParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.COM_SIGNAL_API_WRAPPER__DATA_PARAM, oldDataParam, dataParam));
			}
		}
		return dataParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetDataParam() {
		return dataParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataParam(Parameter newDataParam) {
		Parameter oldDataParam = dataParam;
		dataParam = newDataParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SIGNAL_API_WRAPPER__DATA_PARAM, oldDataParam, dataParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getParent() {
		if (eContainerFeatureID() != ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT) return null;
		return (Partition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Partition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Partition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER, Partition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignalSymbolName() {
		return signalSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalSymbolName(String newSignalSymbolName) {
		String oldSignalSymbolName = signalSymbolName;
		signalSymbolName = newSignalSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_SYMBOL_NAME, oldSignalSymbolName, signalSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignalGroupSymbolName() {
		return signalGroupSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalGroupSymbolName(String newSignalGroupSymbolName) {
		String oldSignalGroupSymbolName = signalGroupSymbolName;
		signalGroupSymbolName = newSignalGroupSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_GROUP_SYMBOL_NAME, oldSignalGroupSymbolName, signalGroupSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Partition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER, Partition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.COM_SIGNAL_API_WRAPPER__DATA_PARAM:
				if (resolve) return getDataParam();
				return basicGetDataParam();
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				return getParent();
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_SYMBOL_NAME:
				return getSignalSymbolName();
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_GROUP_SYMBOL_NAME:
				return getSignalGroupSymbolName();
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
			case ModulePackage.COM_SIGNAL_API_WRAPPER__DATA_PARAM:
				setDataParam((Parameter)newValue);
				return;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				setParent((Partition)newValue);
				return;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_SYMBOL_NAME:
				setSignalSymbolName((String)newValue);
				return;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_GROUP_SYMBOL_NAME:
				setSignalGroupSymbolName((String)newValue);
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
			case ModulePackage.COM_SIGNAL_API_WRAPPER__DATA_PARAM:
				setDataParam((Parameter)null);
				return;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				setParent((Partition)null);
				return;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_SYMBOL_NAME:
				setSignalSymbolName(SIGNAL_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_GROUP_SYMBOL_NAME:
				setSignalGroupSymbolName(SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT);
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
			case ModulePackage.COM_SIGNAL_API_WRAPPER__DATA_PARAM:
				return dataParam != null;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__PARENT:
				return getParent() != null;
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_SYMBOL_NAME:
				return SIGNAL_SYMBOL_NAME_EDEFAULT == null ? signalSymbolName != null : !SIGNAL_SYMBOL_NAME_EDEFAULT.equals(signalSymbolName);
			case ModulePackage.COM_SIGNAL_API_WRAPPER__SIGNAL_GROUP_SYMBOL_NAME:
				return SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT == null ? signalGroupSymbolName != null : !SIGNAL_GROUP_SYMBOL_NAME_EDEFAULT.equals(signalGroupSymbolName);
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
		result.append(" (signalSymbolName: "); //$NON-NLS-1$
		result.append(signalSymbolName);
		result.append(", signalGroupSymbolName: "); //$NON-NLS-1$
		result.append(signalGroupSymbolName);
		result.append(')');
		return result.toString();
	}

} //ComSignalApiWrapperImpl
