/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveComSendProxyOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Proxy Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveComSendProxyOperationImpl#getReadValueVariable <em>Read Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveComSendProxyOperationImpl#getAccessApi <em>Access Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveComSendProxyOperationImpl#getSignalIdVariable <em>Signal Id Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveComSendProxyOperationImpl extends OperationImpl implements PrimitiveComSendProxyOperation {
	/**
	 * The cached value of the '{@link #getReadValueVariable() <em>Read Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadValueVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable readValueVariable;

	/**
	 * The cached value of the '{@link #getAccessApi() <em>Access Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessApi()
	 * @generated
	 * @ordered
	 */
	protected IocReceiveGroupApi accessApi;

	/**
	 * The cached value of the '{@link #getSignalIdVariable() <em>Signal Id Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalIdVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable signalIdVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveComSendProxyOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PRIMITIVE_COM_SEND_PROXY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReadValueVariable() {
		if (readValueVariable != null && ((EObject)readValueVariable).eIsProxy()) {
			InternalEObject oldReadValueVariable = (InternalEObject)readValueVariable;
			readValueVariable = (Variable)eResolveProxy(oldReadValueVariable);
			if (readValueVariable != oldReadValueVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE, oldReadValueVariable, readValueVariable));
			}
		}
		return readValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReadValueVariable() {
		return readValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadValueVariable(Variable newReadValueVariable) {
		Variable oldReadValueVariable = readValueVariable;
		readValueVariable = newReadValueVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE, oldReadValueVariable, readValueVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi getAccessApi() {
		if (accessApi != null && ((EObject)accessApi).eIsProxy()) {
			InternalEObject oldAccessApi = (InternalEObject)accessApi;
			accessApi = (IocReceiveGroupApi)eResolveProxy(oldAccessApi);
			if (accessApi != oldAccessApi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API, oldAccessApi, accessApi));
			}
		}
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocReceiveGroupApi basicGetAccessApi() {
		return accessApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessApi(IocReceiveGroupApi newAccessApi) {
		IocReceiveGroupApi oldAccessApi = accessApi;
		accessApi = newAccessApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API, oldAccessApi, accessApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSignalIdVariable() {
		if (signalIdVariable != null && ((EObject)signalIdVariable).eIsProxy()) {
			InternalEObject oldSignalIdVariable = (InternalEObject)signalIdVariable;
			signalIdVariable = (Variable)eResolveProxy(oldSignalIdVariable);
			if (signalIdVariable != oldSignalIdVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE, oldSignalIdVariable, signalIdVariable));
			}
		}
		return signalIdVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSignalIdVariable() {
		return signalIdVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalIdVariable(Variable newSignalIdVariable) {
		Variable oldSignalIdVariable = signalIdVariable;
		signalIdVariable = newSignalIdVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE, oldSignalIdVariable, signalIdVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				if (resolve) return getReadValueVariable();
				return basicGetReadValueVariable();
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				if (resolve) return getAccessApi();
				return basicGetAccessApi();
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				if (resolve) return getSignalIdVariable();
				return basicGetSignalIdVariable();
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
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				setReadValueVariable((Variable)newValue);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				setAccessApi((IocReceiveGroupApi)newValue);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				setSignalIdVariable((Variable)newValue);
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
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				setReadValueVariable((Variable)null);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				setAccessApi((IocReceiveGroupApi)null);
				return;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				setSignalIdVariable((Variable)null);
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
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE:
				return readValueVariable != null;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__ACCESS_API:
				return accessApi != null;
			case ModulePackage.PRIMITIVE_COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE:
				return signalIdVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveComSendProxyOperationImpl
