/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Queued Group Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl#getReceiveApi <em>Receive Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl#getSendApi <em>Send Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocQueuedGroupCommunicationImpl extends IocCommunicationImpl implements IocQueuedGroupCommunication {
	/**
	 * The cached value of the '{@link #getReceiveApi() <em>Receive Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveApi()
	 * @generated
	 * @ordered
	 */
	protected IocReceiveGroupApi receiveApi;

	/**
	 * The cached value of the '{@link #getSendApi() <em>Send Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendApi()
	 * @generated
	 * @ordered
	 */
	protected IocSendGroupApi sendApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocQueuedGroupCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_QUEUED_GROUP_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi getReceiveApi() {
		return receiveApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveApi(IocReceiveGroupApi newReceiveApi, NotificationChain msgs) {
		IocReceiveGroupApi oldReceiveApi = receiveApi;
		receiveApi = newReceiveApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, oldReceiveApi, newReceiveApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveApi(IocReceiveGroupApi newReceiveApi) {
		if (newReceiveApi != receiveApi) {
			NotificationChain msgs = null;
			if (receiveApi != null)
				msgs = ((InternalEObject)receiveApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, null, msgs);
			if (newReceiveApi != null)
				msgs = ((InternalEObject)newReceiveApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, null, msgs);
			msgs = basicSetReceiveApi(newReceiveApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API, newReceiveApi, newReceiveApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocSendGroupApi getSendApi() {
		return sendApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendApi(IocSendGroupApi newSendApi, NotificationChain msgs) {
		IocSendGroupApi oldSendApi = sendApi;
		sendApi = newSendApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, oldSendApi, newSendApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendApi(IocSendGroupApi newSendApi) {
		if (newSendApi != sendApi) {
			NotificationChain msgs = null;
			if (sendApi != null)
				msgs = ((InternalEObject)sendApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, null, msgs);
			if (newSendApi != null)
				msgs = ((InternalEObject)newSendApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, null, msgs);
			msgs = basicSetSendApi(newSendApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API, newSendApi, newSendApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				return basicSetReceiveApi(null, msgs);
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				return basicSetSendApi(null, msgs);
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				return getReceiveApi();
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				return getSendApi();
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveGroupApi)newValue);
				return;
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				setSendApi((IocSendGroupApi)newValue);
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveGroupApi)null);
				return;
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				setSendApi((IocSendGroupApi)null);
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
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API:
				return receiveApi != null;
			case ModulePackage.IOC_QUEUED_GROUP_COMMUNICATION__SEND_API:
				return sendApi != null;
		}
		return super.eIsSet(featureID);
	}

} //IocQueuedGroupCommunicationImpl
