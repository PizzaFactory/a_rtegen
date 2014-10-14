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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComTransferPropertyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ISignalToIPduMapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComSystemTemplateSystemSignal <em>Com System Template System Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComHandleId <em>Com Handle Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.ComSignalImpl#getComTransferProperty <em>Com Transfer Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSignalImpl extends EcucContainerImpl implements ComSignal {
	/**
	 * The cached value of the '{@link #getComSystemTemplateSystemSignal() <em>Com System Template System Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSystemTemplateSystemSignal()
	 * @generated
	 * @ordered
	 */
	protected ISignalToIPduMapping comSystemTemplateSystemSignal;

	/**
	 * The default value of the '{@link #getComHandleId() <em>Com Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComHandleId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COM_HANDLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComHandleId() <em>Com Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComHandleId()
	 * @generated
	 * @ordered
	 */
	protected Integer comHandleId = COM_HANDLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComTransferProperty() <em>Com Transfer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComTransferProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ComTransferPropertyEnum COM_TRANSFER_PROPERTY_EDEFAULT = ComTransferPropertyEnum.PENDING;

	/**
	 * The cached value of the '{@link #getComTransferProperty() <em>Com Transfer Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComTransferProperty()
	 * @generated
	 * @ordered
	 */
	protected ComTransferPropertyEnum comTransferProperty = COM_TRANSFER_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.COM_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping getComSystemTemplateSystemSignal() {
		if (comSystemTemplateSystemSignal != null && ((EObject)comSystemTemplateSystemSignal).eIsProxy()) {
			InternalEObject oldComSystemTemplateSystemSignal = (InternalEObject)comSystemTemplateSystemSignal;
			comSystemTemplateSystemSignal = (ISignalToIPduMapping)eResolveProxy(oldComSystemTemplateSystemSignal);
			if (comSystemTemplateSystemSignal != oldComSystemTemplateSystemSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL, oldComSystemTemplateSystemSignal, comSystemTemplateSystemSignal));
			}
		}
		return comSystemTemplateSystemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISignalToIPduMapping basicGetComSystemTemplateSystemSignal() {
		return comSystemTemplateSystemSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSystemTemplateSystemSignal(ISignalToIPduMapping newComSystemTemplateSystemSignal) {
		ISignalToIPduMapping oldComSystemTemplateSystemSignal = comSystemTemplateSystemSignal;
		comSystemTemplateSystemSignal = newComSystemTemplateSystemSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL, oldComSystemTemplateSystemSignal, comSystemTemplateSystemSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getComHandleId() {
		return comHandleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComHandleId(Integer newComHandleId) {
		Integer oldComHandleId = comHandleId;
		comHandleId = newComHandleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_HANDLE_ID, oldComHandleId, comHandleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransferPropertyEnum getComTransferProperty() {
		return comTransferProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComTransferProperty(ComTransferPropertyEnum newComTransferProperty) {
		ComTransferPropertyEnum oldComTransferProperty = comTransferProperty;
		comTransferProperty = newComTransferProperty == null ? COM_TRANSFER_PROPERTY_EDEFAULT : newComTransferProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY, oldComTransferProperty, comTransferProperty));
	}

	/**
	 * The cached invocation delegate for the '{@link #transfersImmediately() <em>Transfers Immediately</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #transfersImmediately()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TRANSFERS_IMMEDIATELY__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.COM_SIGNAL___TRANSFERS_IMMEDIATELY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean transfersImmediately() {
		try {
			return (Boolean)TRANSFERS_IMMEDIATELY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				if (resolve) return getComSystemTemplateSystemSignal();
				return basicGetComSystemTemplateSystemSignal();
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				return getComHandleId();
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				return getComTransferProperty();
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				setComSystemTemplateSystemSignal((ISignalToIPduMapping)newValue);
				return;
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				setComHandleId((Integer)newValue);
				return;
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				setComTransferProperty((ComTransferPropertyEnum)newValue);
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				setComSystemTemplateSystemSignal((ISignalToIPduMapping)null);
				return;
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				setComHandleId(COM_HANDLE_ID_EDEFAULT);
				return;
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				setComTransferProperty(COM_TRANSFER_PROPERTY_EDEFAULT);
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
			case EcucPackage.COM_SIGNAL__COM_SYSTEM_TEMPLATE_SYSTEM_SIGNAL:
				return comSystemTemplateSystemSignal != null;
			case EcucPackage.COM_SIGNAL__COM_HANDLE_ID:
				return COM_HANDLE_ID_EDEFAULT == null ? comHandleId != null : !COM_HANDLE_ID_EDEFAULT.equals(comHandleId);
			case EcucPackage.COM_SIGNAL__COM_TRANSFER_PROPERTY:
				return comTransferProperty != COM_TRANSFER_PROPERTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcucPackage.COM_SIGNAL___TRANSFERS_IMMEDIATELY:
				return transfersImmediately();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (comHandleId: ");
		result.append(comHandleId);
		result.append(", comTransferProperty: ");
		result.append(comTransferProperty);
		result.append(')');
		return result.toString();
	}

} //ComSignalImpl
