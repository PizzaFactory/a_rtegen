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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Sw Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AtomicSwComponentTypeImpl#getInternalBehavior <em>Internal Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AtomicSwComponentTypeImpl extends SwComponentTypeImpl implements AtomicSwComponentType {
	/**
	 * The cached value of the '{@link #getInternalBehavior() <em>Internal Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalBehavior()
	 * @generated
	 * @ordered
	 */
	protected SwcInternalBehavior internalBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicSwComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior getInternalBehavior() {
		return internalBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalBehavior(SwcInternalBehavior newInternalBehavior, NotificationChain msgs) {
		SwcInternalBehavior oldInternalBehavior = internalBehavior;
		internalBehavior = newInternalBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR, oldInternalBehavior, newInternalBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalBehavior(SwcInternalBehavior newInternalBehavior) {
		if (newInternalBehavior != internalBehavior) {
			NotificationChain msgs = null;
			if (internalBehavior != null)
				msgs = ((InternalEObject)internalBehavior).eInverseRemove(this, M2Package.SWC_INTERNAL_BEHAVIOR__PARENT, SwcInternalBehavior.class, msgs);
			if (newInternalBehavior != null)
				msgs = ((InternalEObject)newInternalBehavior).eInverseAdd(this, M2Package.SWC_INTERNAL_BEHAVIOR__PARENT, SwcInternalBehavior.class, msgs);
			msgs = basicSetInternalBehavior(newInternalBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR, newInternalBehavior, newInternalBehavior));
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingApplicationDataTypes() <em>Get Using Application Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingApplicationDataTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_APPLICATION_DATA_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ApplicationDataType> getUsingApplicationDataTypes() {
		try {
			return (EList<ApplicationDataType>)GET_USING_APPLICATION_DATA_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingImplementationDataTypes() <em>Get Using Implementation Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingImplementationDataTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_IMPLEMENTATION_DATA_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationDataType> getUsingImplementationDataTypes() {
		try {
			return (EList<ImplementationDataType>)GET_USING_IMPLEMENTATION_DATA_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingDataTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_DATA_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AutosarDataType> getUsingDataTypes() {
		try {
			return (EList<AutosarDataType>)GET_USING_DATA_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType) <em>Get Implementation Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_DATA_TYPE_AUTOSAR_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType(AutosarDataType dataType) {
		try {
			return (ImplementationDataType)GET_IMPLEMENTATION_DATA_TYPE_AUTOSAR_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{dataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Implementation Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataTypes(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_IMPLEMENTATION_DATA_TYPES_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationDataType> getImplementationDataTypes(ApplicationDataType applicationDataType) {
		try {
			return (EList<ImplementationDataType>)GET_IMPLEMENTATION_DATA_TYPES_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{applicationDataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingClientServerInterfaces() <em>Get Using Client Server Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingClientServerInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_CLIENT_SERVER_INTERFACES__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClientServerInterface> getUsingClientServerInterfaces() {
		try {
			return (EList<ClientServerInterface>)GET_USING_CLIENT_SERVER_INTERFACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getRPorts() <em>Get RPorts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPorts()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_RPORTS__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RPortPrototype> getRPorts() {
		try {
			return (EList<RPortPrototype>)GET_RPORTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getPPorts() <em>Get PPorts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPorts()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_PPORTS__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PPortPrototype> getPPorts() {
		try {
			return (EList<PPortPrototype>)GET_PPORTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR:
				if (internalBehavior != null)
					msgs = ((InternalEObject)internalBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR, null, msgs);
				return basicSetInternalBehavior((SwcInternalBehavior)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR:
				return basicSetInternalBehavior(null, msgs);
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
			case M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR:
				return getInternalBehavior();
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
			case M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR:
				setInternalBehavior((SwcInternalBehavior)newValue);
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
			case M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR:
				setInternalBehavior((SwcInternalBehavior)null);
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
			case M2Package.ATOMIC_SW_COMPONENT_TYPE__INTERNAL_BEHAVIOR:
				return internalBehavior != null;
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
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_USING_APPLICATION_DATA_TYPES:
				return getUsingApplicationDataTypes();
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_USING_IMPLEMENTATION_DATA_TYPES:
				return getUsingImplementationDataTypes();
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_USING_DATA_TYPES:
				return getUsingDataTypes();
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPE__AUTOSARDATATYPE:
				return getImplementationDataType((AutosarDataType)arguments.get(0));
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_IMPLEMENTATION_DATA_TYPES__APPLICATIONDATATYPE:
				return getImplementationDataTypes((ApplicationDataType)arguments.get(0));
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_USING_CLIENT_SERVER_INTERFACES:
				return getUsingClientServerInterfaces();
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_RPORTS:
				return getRPorts();
			case M2Package.ATOMIC_SW_COMPONENT_TYPE___GET_PPORTS:
				return getPPorts();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AtomicSwComponentTypeImpl
