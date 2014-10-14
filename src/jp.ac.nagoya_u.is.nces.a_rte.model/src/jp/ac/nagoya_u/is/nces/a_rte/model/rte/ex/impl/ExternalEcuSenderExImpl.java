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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
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
 * An implementation of the model object '<em><b>External Ecu Sender Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ExternalEcuSenderExImpl#getVariableDataInstanceInCompositionEx <em>Variable Data Instance In Composition Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalEcuSenderExImpl extends ExtendedEObjectImpl implements ExternalEcuSenderEx {
	/**
	 * The cached value of the '{@link #getVariableDataInstanceInCompositionEx() <em>Variable Data Instance In Composition Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDataInstanceInCompositionEx()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInCompositionEx variableDataInstanceInCompositionEx;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalEcuSenderExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.EXTERNAL_ECU_SENDER_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInCompositionEx getVariableDataInstanceInCompositionEx() {
		if (variableDataInstanceInCompositionEx != null && ((EObject)variableDataInstanceInCompositionEx).eIsProxy()) {
			InternalEObject oldVariableDataInstanceInCompositionEx = (InternalEObject)variableDataInstanceInCompositionEx;
			variableDataInstanceInCompositionEx = (VariableDataInstanceInCompositionEx)eResolveProxy(oldVariableDataInstanceInCompositionEx);
			if (variableDataInstanceInCompositionEx != oldVariableDataInstanceInCompositionEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX, oldVariableDataInstanceInCompositionEx, variableDataInstanceInCompositionEx));
			}
		}
		return variableDataInstanceInCompositionEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInCompositionEx basicGetVariableDataInstanceInCompositionEx() {
		return variableDataInstanceInCompositionEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDataInstanceInCompositionEx(VariableDataInstanceInCompositionEx newVariableDataInstanceInCompositionEx) {
		VariableDataInstanceInCompositionEx oldVariableDataInstanceInCompositionEx = variableDataInstanceInCompositionEx;
		variableDataInstanceInCompositionEx = newVariableDataInstanceInCompositionEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX, oldVariableDataInstanceInCompositionEx, variableDataInstanceInCompositionEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #requiresRteFilter(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Requires Rte Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresRteFilter(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_RTE_FILTER_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requiresRteFilter(ExternalEcuSender this_) {
		try {
			return (Boolean)REQUIRES_RTE_FILTER_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #requiresRteInvalidation(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Requires Rte Invalidation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresRteInvalidation(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_RTE_INVALIDATION_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requiresRteInvalidation(ExternalEcuSender this_) {
		try {
			return (Boolean)REQUIRES_RTE_INVALIDATION_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #requiresRteInitialization(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Requires Rte Initialization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresRteInitialization(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_RTE_INITIALIZATION_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requiresRteInitialization(ExternalEcuSender this_) {
		try {
			return (Boolean)REQUIRES_RTE_INITIALIZATION_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #providesComReceiveCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Receive Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesComReceiveCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_COM_RECEIVE_CALLBACK_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_CALLBACK__EXTERNALECUSENDER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean providesComReceiveCallback(ExternalEcuSender this_) {
		try {
			return (Boolean)PROVIDES_COM_RECEIVE_CALLBACK_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #providesComInvalidateCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Invalidate Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesComInvalidateCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_COM_INVALIDATE_CALLBACK_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INVALIDATE_CALLBACK__EXTERNALECUSENDER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean providesComInvalidateCallback(ExternalEcuSender this_) {
		try {
			return (Boolean)PROVIDES_COM_INVALIDATE_CALLBACK_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #providesComReceiveTimeoutCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender) <em>Provides Com Receive Timeout Callback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesComReceiveTimeoutCallback(jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK__EXTERNALECUSENDER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean providesComReceiveTimeoutCallback(ExternalEcuSender this_) {
		try {
			return (Boolean)PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK_EXTERNAL_ECU_SENDER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
			case ExPackage.EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX:
				if (resolve) return getVariableDataInstanceInCompositionEx();
				return basicGetVariableDataInstanceInCompositionEx();
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
			case ExPackage.EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX:
				setVariableDataInstanceInCompositionEx((VariableDataInstanceInCompositionEx)newValue);
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
			case ExPackage.EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX:
				setVariableDataInstanceInCompositionEx((VariableDataInstanceInCompositionEx)null);
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
			case ExPackage.EXTERNAL_ECU_SENDER_EX__VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX:
				return variableDataInstanceInCompositionEx != null;
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
			case ExPackage.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_FILTER__EXTERNALECUSENDER:
				return requiresRteFilter((ExternalEcuSender)arguments.get(0));
			case ExPackage.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INVALIDATION__EXTERNALECUSENDER:
				return requiresRteInvalidation((ExternalEcuSender)arguments.get(0));
			case ExPackage.EXTERNAL_ECU_SENDER_EX___REQUIRES_RTE_INITIALIZATION__EXTERNALECUSENDER:
				return requiresRteInitialization((ExternalEcuSender)arguments.get(0));
			case ExPackage.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_CALLBACK__EXTERNALECUSENDER:
				return providesComReceiveCallback((ExternalEcuSender)arguments.get(0));
			case ExPackage.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_INVALIDATE_CALLBACK__EXTERNALECUSENDER:
				return providesComInvalidateCallback((ExternalEcuSender)arguments.get(0));
			case ExPackage.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_RECEIVE_TIMEOUT_CALLBACK__EXTERNALECUSENDER:
				return providesComReceiveTimeoutCallback((ExternalEcuSender)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalEcuSenderExImpl
