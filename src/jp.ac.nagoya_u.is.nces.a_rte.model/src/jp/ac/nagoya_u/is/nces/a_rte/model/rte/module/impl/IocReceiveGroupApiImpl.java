/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Receive Group Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveGroupApiImpl#getComSendSignalSymbolName <em>Com Send Signal Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocReceiveGroupApiImpl extends IocReceiveApiImpl implements IocReceiveGroupApi {
	/**
	 * The default value of the '{@link #getComSendSignalSymbolName() <em>Com Send Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String COM_SEND_SIGNAL_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComSendSignalSymbolName() <em>Com Send Signal Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String comSendSignalSymbolName = COM_SEND_SIGNAL_SYMBOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocReceiveGroupApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_RECEIVE_GROUP_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComSendSignalSymbolName() {
		return comSendSignalSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalSymbolName(String newComSendSignalSymbolName) {
		String oldComSendSignalSymbolName = comSendSignalSymbolName;
		comSendSignalSymbolName = newComSendSignalSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_RECEIVE_GROUP_API__COM_SEND_SIGNAL_SYMBOL_NAME, oldComSendSignalSymbolName, comSendSignalSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.IOC_RECEIVE_GROUP_API__COM_SEND_SIGNAL_SYMBOL_NAME:
				return getComSendSignalSymbolName();
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
			case ModulePackage.IOC_RECEIVE_GROUP_API__COM_SEND_SIGNAL_SYMBOL_NAME:
				setComSendSignalSymbolName((String)newValue);
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
			case ModulePackage.IOC_RECEIVE_GROUP_API__COM_SEND_SIGNAL_SYMBOL_NAME:
				setComSendSignalSymbolName(COM_SEND_SIGNAL_SYMBOL_NAME_EDEFAULT);
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
			case ModulePackage.IOC_RECEIVE_GROUP_API__COM_SEND_SIGNAL_SYMBOL_NAME:
				return COM_SEND_SIGNAL_SYMBOL_NAME_EDEFAULT == null ? comSendSignalSymbolName != null : !COM_SEND_SIGNAL_SYMBOL_NAME_EDEFAULT.equals(comSendSignalSymbolName);
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
		result.append(" (comSendSignalSymbolName: "); //$NON-NLS-1$
		result.append(comSendSignalSymbolName);
		result.append(')');
		return result.toString();
	}

} //IocReceiveGroupApiImpl
