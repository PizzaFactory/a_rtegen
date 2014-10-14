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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Signal Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ComSignalExImpl#getSenderReceiverToSignalMappingEx <em>Sender Receiver To Signal Mapping Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSignalExImpl extends ExtendedEObjectImpl implements ComSignalEx {
	/**
	 * The cached value of the '{@link #getSenderReceiverToSignalMappingEx() <em>Sender Receiver To Signal Mapping Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderReceiverToSignalMappingEx()
	 * @generated
	 * @ordered
	 */
	protected SenderReceiverToSignalMappingEx senderReceiverToSignalMappingEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.COM_SIGNAL_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMappingEx getSenderReceiverToSignalMappingEx() {
		if (senderReceiverToSignalMappingEx != null && ((EObject)senderReceiverToSignalMappingEx).eIsProxy()) {
			InternalEObject oldSenderReceiverToSignalMappingEx = (InternalEObject)senderReceiverToSignalMappingEx;
			senderReceiverToSignalMappingEx = (SenderReceiverToSignalMappingEx)eResolveProxy(oldSenderReceiverToSignalMappingEx);
			if (senderReceiverToSignalMappingEx != oldSenderReceiverToSignalMappingEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX, oldSenderReceiverToSignalMappingEx, senderReceiverToSignalMappingEx));
			}
		}
		return senderReceiverToSignalMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalMappingEx basicGetSenderReceiverToSignalMappingEx() {
		return senderReceiverToSignalMappingEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderReceiverToSignalMappingEx(SenderReceiverToSignalMappingEx newSenderReceiverToSignalMappingEx) {
		SenderReceiverToSignalMappingEx oldSenderReceiverToSignalMappingEx = senderReceiverToSignalMappingEx;
		senderReceiverToSignalMappingEx = newSenderReceiverToSignalMappingEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX, oldSenderReceiverToSignalMappingEx, senderReceiverToSignalMappingEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Is Sender</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSender(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SENDER_COM_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSender(ComSignal this_) {
		try {
			return (Boolean)IS_SENDER_COM_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Is Receiver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceiver(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_RECEIVER_COM_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isReceiver(ComSignal this_) {
		try {
			return (Boolean)IS_RECEIVER_COM_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal) <em>Get Variable Data Instance In Compositions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDataInstanceInCompositions(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS_COM_SIGNAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VariableDataInstanceInComposition> getVariableDataInstanceInCompositions(ComSignal this_) {
		try {
			return (EList<VariableDataInstanceInComposition>)GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS_COM_SIGNAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				if (resolve) return getSenderReceiverToSignalMappingEx();
				return basicGetSenderReceiverToSignalMappingEx();
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				setSenderReceiverToSignalMappingEx((SenderReceiverToSignalMappingEx)newValue);
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				setSenderReceiverToSignalMappingEx((SenderReceiverToSignalMappingEx)null);
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
			case ExPackage.COM_SIGNAL_EX__SENDER_RECEIVER_TO_SIGNAL_MAPPING_EX:
				return senderReceiverToSignalMappingEx != null;
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
			case ExPackage.COM_SIGNAL_EX___IS_SENDER__COMSIGNAL:
				return isSender((ComSignal)arguments.get(0));
			case ExPackage.COM_SIGNAL_EX___IS_RECEIVER__COMSIGNAL:
				return isReceiver((ComSignal)arguments.get(0));
			case ExPackage.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL:
				return getVariableDataInstanceInCompositions((ComSignal)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComSignalExImpl
