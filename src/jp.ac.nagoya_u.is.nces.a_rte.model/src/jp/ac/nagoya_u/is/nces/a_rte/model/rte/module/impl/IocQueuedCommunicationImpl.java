/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Queued Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl#getSendApi <em>Send Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl#getReceiveApi <em>Receive Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl#getIocEmptyQueueApi <em>Ioc Empty Queue Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocQueuedCommunicationImpl extends IocCommunicationImpl implements IocQueuedCommunication {
	/**
	 * The cached value of the '{@link #getSendApi() <em>Send Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendApi()
	 * @generated
	 * @ordered
	 */
	protected EList<IocSendApi> sendApi;

	/**
	 * The cached value of the '{@link #getReceiveApi() <em>Receive Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveApi()
	 * @generated
	 * @ordered
	 */
	protected IocReceiveApi receiveApi;

	/**
	 * The cached value of the '{@link #getIocEmptyQueueApi() <em>Ioc Empty Queue Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocEmptyQueueApi()
	 * @generated
	 * @ordered
	 */
	protected IocEmptyQueueApi iocEmptyQueueApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocQueuedCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.IOC_QUEUED_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocSendApi> getSendApi() {
		if (sendApi == null) {
			sendApi = new EObjectContainmentEList<IocSendApi>(IocSendApi.class, this, ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API);
		}
		return sendApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveApi getReceiveApi() {
		return receiveApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveApi(IocReceiveApi newReceiveApi, NotificationChain msgs) {
		IocReceiveApi oldReceiveApi = receiveApi;
		receiveApi = newReceiveApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, oldReceiveApi, newReceiveApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveApi(IocReceiveApi newReceiveApi) {
		if (newReceiveApi != receiveApi) {
			NotificationChain msgs = null;
			if (receiveApi != null)
				msgs = ((InternalEObject)receiveApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, null, msgs);
			if (newReceiveApi != null)
				msgs = ((InternalEObject)newReceiveApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, null, msgs);
			msgs = basicSetReceiveApi(newReceiveApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API, newReceiveApi, newReceiveApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocEmptyQueueApi getIocEmptyQueueApi() {
		return iocEmptyQueueApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIocEmptyQueueApi(IocEmptyQueueApi newIocEmptyQueueApi, NotificationChain msgs) {
		IocEmptyQueueApi oldIocEmptyQueueApi = iocEmptyQueueApi;
		iocEmptyQueueApi = newIocEmptyQueueApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, oldIocEmptyQueueApi, newIocEmptyQueueApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIocEmptyQueueApi(IocEmptyQueueApi newIocEmptyQueueApi) {
		if (newIocEmptyQueueApi != iocEmptyQueueApi) {
			NotificationChain msgs = null;
			if (iocEmptyQueueApi != null)
				msgs = ((InternalEObject)iocEmptyQueueApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, null, msgs);
			if (newIocEmptyQueueApi != null)
				msgs = ((InternalEObject)newIocEmptyQueueApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, null, msgs);
			msgs = basicSetIocEmptyQueueApi(newIocEmptyQueueApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API, newIocEmptyQueueApi, newIocEmptyQueueApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				return ((InternalEList<?>)getSendApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				return basicSetReceiveApi(null, msgs);
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				return basicSetIocEmptyQueueApi(null, msgs);
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				return getSendApi();
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				return getReceiveApi();
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				return getIocEmptyQueueApi();
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				getSendApi().clear();
				getSendApi().addAll((Collection<? extends IocSendApi>)newValue);
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveApi)newValue);
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				setIocEmptyQueueApi((IocEmptyQueueApi)newValue);
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				getSendApi().clear();
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				setReceiveApi((IocReceiveApi)null);
				return;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				setIocEmptyQueueApi((IocEmptyQueueApi)null);
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
			case ModulePackage.IOC_QUEUED_COMMUNICATION__SEND_API:
				return sendApi != null && !sendApi.isEmpty();
			case ModulePackage.IOC_QUEUED_COMMUNICATION__RECEIVE_API:
				return receiveApi != null;
			case ModulePackage.IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API:
				return iocEmptyQueueApi != null;
		}
		return super.eIsSet(featureID);
	}

} //IocQueuedCommunicationImpl
