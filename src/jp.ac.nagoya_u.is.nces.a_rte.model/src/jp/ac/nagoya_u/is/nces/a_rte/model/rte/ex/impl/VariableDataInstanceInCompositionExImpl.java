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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx;

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
 * An implementation of the model object '<em><b>Variable Data Instance In Composition Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.VariableDataInstanceInCompositionExImpl#getValueSpecificationEx <em>Value Specification Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDataInstanceInCompositionExImpl extends ExtendedEObjectImpl implements VariableDataInstanceInCompositionEx {
	/**
	 * The cached value of the '{@link #getValueSpecificationEx() <em>Value Specification Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecificationEx()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecificationEx valueSpecificationEx;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInCompositionExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationEx getValueSpecificationEx() {
		if (valueSpecificationEx != null && ((EObject)valueSpecificationEx).eIsProxy()) {
			InternalEObject oldValueSpecificationEx = (InternalEObject)valueSpecificationEx;
			valueSpecificationEx = (ValueSpecificationEx)eResolveProxy(oldValueSpecificationEx);
			if (valueSpecificationEx != oldValueSpecificationEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX, oldValueSpecificationEx, valueSpecificationEx));
			}
		}
		return valueSpecificationEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationEx basicGetValueSpecificationEx() {
		return valueSpecificationEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSpecificationEx(ValueSpecificationEx newValueSpecificationEx) {
		ValueSpecificationEx oldValueSpecificationEx = valueSpecificationEx;
		valueSpecificationEx = newValueSpecificationEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX, oldValueSpecificationEx, valueSpecificationEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_PARTITION_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition getPartition(VariableDataInstanceInComposition this_) {
		try {
			return (EcucPartition)GET_PARTITION_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_DECLARATION_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtDeclaration(VariableDataInstanceInComposition this_) {
		try {
			return (Boolean)INIT_AT_DECLARATION_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_START_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtStart(VariableDataInstanceInComposition this_) {
		try {
			return (Boolean)INIT_AT_START_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Init At Partition Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_PARTITION_RESTART_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtPartitionRestart(VariableDataInstanceInComposition this_) {
		try {
			return (Boolean)INIT_AT_PARTITION_RESTART_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value As Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValueAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INIT_VALUE_AS_TEXT_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE_AS_TEXT__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitValueAsText(VariableDataInstanceInComposition this_) {
		try {
			return (String)GET_INIT_VALUE_AS_TEXT_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Initialization Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INITIALIZATION_STRATEGY_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAINSTANCEINSWC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum getInitializationStrategy(VariableDataInstanceInSwc this_) {
		try {
			return (RteInitializationStrategyEnum)GET_INITIALIZATION_STRATEGY_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc) <em>Get Section Initialization Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SECTION_INITIALIZATION_POLICY_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAINSTANCEINSWC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionInitializationPolicy(VariableDataInstanceInSwc this_) {
		try {
			return (String)GET_SECTION_INITIALIZATION_POLICY_VARIABLE_DATA_INSTANCE_IN_SWC__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInitValue(VariableDataInstanceInComposition this_) {
		try {
			return (ValueSpecification)GET_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_RECEIVER_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReceiverInitValue(VariableDataInstanceInComposition this_) {
		try {
			return (ValueSpecification)GET_RECEIVER_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SENDER_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSenderInitValue(VariableDataInstanceInComposition this_) {
		try {
			return (ValueSpecification)GET_SENDER_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_ADDR_METHOD_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod(VariableDataInstanceInComposition this_) {
		try {
			return (SwAddrMethod)GET_SW_ADDR_METHOD_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Receiver Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_RECEIVER_SW_ADDR_METHOD_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getReceiverSwAddrMethod(VariableDataInstanceInComposition this_) {
		try {
			return (SwAddrMethod)GET_RECEIVER_SW_ADDR_METHOD_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Get Sender Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SENDER_SW_ADDR_METHOD_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSenderSwAddrMethod(VariableDataInstanceInComposition this_) {
		try {
			return (SwAddrMethod)GET_SENDER_SW_ADDR_METHOD_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition) <em>Equals Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUALS_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___EQUALS_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION_VARIABLEDATAINSTANCEINCOMPOSITION).getInvocationDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalsInitValue(VariableDataInstanceInComposition v1, VariableDataInstanceInComposition v2) {
		try {
			return (Boolean)EQUALS_INIT_VALUE_VARIABLE_DATA_INSTANCE_IN_COMPOSITION_VARIABLE_DATA_INSTANCE_IN_COMPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{v1, v2}));
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX:
				if (resolve) return getValueSpecificationEx();
				return basicGetValueSpecificationEx();
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX:
				setValueSpecificationEx((ValueSpecificationEx)newValue);
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX:
				setValueSpecificationEx((ValueSpecificationEx)null);
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX__VALUE_SPECIFICATION_EX:
				return valueSpecificationEx != null;
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
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_PARTITION__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getPartition((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION:
				return initAtDeclaration((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION:
				return initAtStart((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION:
				return initAtPartitionRestart((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE_AS_TEXT__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getInitValueAsText((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAINSTANCEINSWC:
				return getInitializationStrategy((VariableDataInstanceInSwc)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAINSTANCEINSWC:
				return getSectionInitializationPolicy((VariableDataInstanceInSwc)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getInitValue((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getReceiverInitValue((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getSenderInitValue((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getSwAddrMethod((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_RECEIVER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getReceiverSwAddrMethod((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_SENDER_SW_ADDR_METHOD__VARIABLEDATAINSTANCEINCOMPOSITION:
				return getSenderSwAddrMethod((VariableDataInstanceInComposition)arguments.get(0));
			case ExPackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___EQUALS_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION_VARIABLEDATAINSTANCEINCOMPOSITION:
				return equalsInitValue((VariableDataInstanceInComposition)arguments.get(0), (VariableDataInstanceInComposition)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableDataInstanceInCompositionExImpl
