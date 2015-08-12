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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationStrategyEnum;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data Prototype Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VariableDataPrototypeExImpl extends ExtendedEObjectImpl implements VariableDataPrototypeEx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataPrototypeExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX;
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtDeclaration(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_DECLARATION_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtDeclaration(VariableDataPrototype this_) {
		try {
			return (Boolean)INIT_AT_DECLARATION_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtStart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_START_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtStart(VariableDataPrototype this_) {
		try {
			return (Boolean)INIT_AT_START_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Init At Partition Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #initAtPartitionRestart(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INIT_AT_PARTITION_RESTART_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initAtPartitionRestart(VariableDataPrototype this_) {
		try {
			return (Boolean)INIT_AT_PARTITION_RESTART_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Initialization Strategy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializationStrategy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INITIALIZATION_STRATEGY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInitializationStrategyEnum getInitializationStrategy(VariableDataPrototype this_) {
		try {
			return (RteInitializationStrategyEnum)GET_INITIALIZATION_STRATEGY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Section Initialization Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SECTION_INITIALIZATION_POLICY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionInitializationPolicy(VariableDataPrototype this_) {
		try {
			return (String)GET_SECTION_INITIALIZATION_POLICY_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype) <em>Get Sw Addr Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_ADDR_METHOD_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod(VariableDataPrototype this_) {
		try {
			return (SwAddrMethod)GET_SW_ADDR_METHOD_VARIABLE_DATA_PROTOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE:
				return initAtDeclaration((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE:
				return initAtStart((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE:
				return initAtPartitionRestart((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___GET_INITIALIZATION_STRATEGY__VARIABLEDATAPROTOTYPE:
				return getInitializationStrategy((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___GET_SECTION_INITIALIZATION_POLICY__VARIABLEDATAPROTOTYPE:
				return getSectionInitializationPolicy((VariableDataPrototype)arguments.get(0));
			case ExPackage.VARIABLE_DATA_PROTOTYPE_EX___GET_SW_ADDR_METHOD__VARIABLEDATAPROTOTYPE:
				return getSwAddrMethod((VariableDataPrototype)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableDataPrototypeExImpl
