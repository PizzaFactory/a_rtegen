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
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ��������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ��������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataFilter;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InvalidationPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ReceiverComSpec;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RVariable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.RVariableDataInstanceInSwcImpl#getContextRPort <em>Context RPort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RVariableDataInstanceInSwcImpl extends VariableDataInstanceInSwcImpl implements RVariableDataInstanceInSwc {
	/**
	 * The cached setting delegate for the '{@link #getContextRPort() <em>Context RPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTEXT_RPORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RVariableDataInstanceInSwcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototype getContextRPort() {
		return (RPortPrototype)CONTEXT_RPORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The cached invocation delegate for the '{@link #isFilterEnabled() <em>Is Filter Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FILTER_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilterEnabled() {
		try {
			return (Boolean)IS_FILTER_ENABLED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getFilter() <em>Get Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_FILTER__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFilter getFilter() {
		try {
			return (DataFilter)GET_FILTER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isAliveTimeoutEnabled() <em>Is Alive Timeout Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAliveTimeoutEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ALIVE_TIMEOUT_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAliveTimeoutEnabled() {
		try {
			return (Boolean)IS_ALIVE_TIMEOUT_ENABLED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInvalidationEnabled() <em>Is Invalidation Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INVALIDATION_ENABLED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvalidationEnabled() {
		try {
			return (Boolean)IS_INVALIDATION_ENABLED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInvalidationPolicy() <em>Get Invalidation Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INVALIDATION_POLICY__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidationPolicy getInvalidationPolicy() {
		try {
			return (InvalidationPolicy)GET_INVALIDATION_POLICY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitValue() <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INIT_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInitValue() {
		try {
			return (ValueSpecification)GET_INIT_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getQueueLength() <em>Get Queue Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_QUEUE_LENGTH__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQueueLength() {
		try {
			return (Integer)GET_QUEUE_LENGTH__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getComSpec() <em>Get Com Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSpec()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_COM_SPEC__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverComSpec getComSpec() {
		try {
			return (ReceiverComSpec)GET_COM_SPEC__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT:
				return getContextRPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_RPORT:
				return CONTEXT_RPORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_FILTER_ENABLED:
				return isFilterEnabled();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_FILTER:
				return getFilter();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_ALIVE_TIMEOUT_ENABLED:
				return isAliveTimeoutEnabled();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___IS_INVALIDATION_ENABLED:
				return isInvalidationEnabled();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INVALIDATION_POLICY:
				return getInvalidationPolicy();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_INIT_VALUE:
				return getInitValue();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_QUEUE_LENGTH:
				return getQueueLength();
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC___GET_COM_SPEC:
				return getComSpec();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RVariableDataInstanceInSwcImpl