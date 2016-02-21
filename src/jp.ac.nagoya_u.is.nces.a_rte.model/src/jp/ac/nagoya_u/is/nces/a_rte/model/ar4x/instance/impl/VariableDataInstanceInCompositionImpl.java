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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data Instance In Swc Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl#getRequesterConnection <em>Requester Connection</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.VariableDataInstanceInCompositionImpl#getProviderConnection <em>Provider Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDataInstanceInCompositionImpl extends VariableDataInstanceImpl implements VariableDataInstanceInComposition {
	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInSwc prototype;

	/**
	 * The cached value of the '{@link #getRequesterConnection() <em>Requester Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyDataInstanceConnector> requesterConnection;

	/**
	 * The cached value of the '{@link #getProviderConnection() <em>Provider Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyDataInstanceConnector> providerConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceId() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		instanceRefs.addAll(getParent().getInstanceId());
		instanceRefs.add(getPrototype().getPrototype().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc getPrototype() {
		if (prototype != null && ((EObject)prototype).eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (VariableDataInstanceInSwc)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrototype(VariableDataInstanceInSwc newPrototype, NotificationChain msgs) {
		VariableDataInstanceInSwc oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE, oldPrototype, newPrototype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototype(VariableDataInstanceInSwc newPrototype) {
		if (newPrototype != prototype) {
			NotificationChain msgs = null;
			if (prototype != null)
				msgs = ((InternalEObject)prototype).eInverseRemove(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE, VariableDataInstanceInSwc.class, msgs);
			if (newPrototype != null)
				msgs = ((InternalEObject)newPrototype).eInverseAdd(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE, VariableDataInstanceInSwc.class, msgs);
			msgs = basicSetPrototype(newPrototype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE, newPrototype, newPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceInComposition getParent() {
		if (eContainerFeatureID() != InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT) return null;
		return (PortInstanceInComposition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(PortInstanceInComposition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(PortInstanceInComposition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, InstancePackage.PORT_INSTANCE_IN_COMPOSITION__DATA_ELEMENT, PortInstanceInComposition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyDataInstanceConnector> getRequesterConnection() {
		if (requesterConnection == null) {
			requesterConnection = new EObjectWithInverseResolvingEList<AssemblyDataInstanceConnector>(AssemblyDataInstanceConnector.class, this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__PROVIDER);
		}
		return requesterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyDataInstanceConnector> getProviderConnection() {
		if (providerConnection == null) {
			providerConnection = new EObjectWithInverseResolvingEList<AssemblyDataInstanceConnector>(AssemblyDataInstanceConnector.class, this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION, InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR__REQUESTER);
		}
		return providerConnection;
	}

	/**
	 * The cached invocation delegate for the '{@link #isProvided() <em>Is Provided</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvided()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_PROVIDED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvided() {
		try {
			return (Boolean)IS_PROVIDED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isRequired() <em>Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_REQUIRED__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		try {
			return (Boolean)IS_REQUIRED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getTargetShortName() <em>Get Target Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetShortName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TARGET_SHORT_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetShortName() {
		try {
			return (String)GET_TARGET_SHORT_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE:
				if (prototype != null)
					msgs = ((InternalEObject)prototype).eInverseRemove(this, InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC__INSTANCE, VariableDataInstanceInSwc.class, msgs);
				return basicSetPrototype((VariableDataInstanceInSwc)otherEnd, msgs);
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((PortInstanceInComposition)otherEnd, msgs);
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequesterConnection()).basicAdd(otherEnd, msgs);
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProviderConnection()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE:
				return basicSetPrototype(null, msgs);
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				return basicSetParent(null, msgs);
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION:
				return ((InternalEList<?>)getRequesterConnection()).basicRemove(otherEnd, msgs);
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION:
				return ((InternalEList<?>)getProviderConnection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				return eInternalContainer().eInverseRemove(this, InstancePackage.PORT_INSTANCE_IN_COMPOSITION__DATA_ELEMENT, PortInstanceInComposition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				return getParent();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION:
				return getRequesterConnection();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION:
				return getProviderConnection();
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE:
				setPrototype((VariableDataInstanceInSwc)newValue);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				setParent((PortInstanceInComposition)newValue);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION:
				getRequesterConnection().clear();
				getRequesterConnection().addAll((Collection<? extends AssemblyDataInstanceConnector>)newValue);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION:
				getProviderConnection().clear();
				getProviderConnection().addAll((Collection<? extends AssemblyDataInstanceConnector>)newValue);
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE:
				setPrototype((VariableDataInstanceInSwc)null);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				setParent((PortInstanceInComposition)null);
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION:
				getRequesterConnection().clear();
				return;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION:
				getProviderConnection().clear();
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROTOTYPE:
				return prototype != null;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PARENT:
				return getParent() != null;
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__REQUESTER_CONNECTION:
				return requesterConnection != null && !requesterConnection.isEmpty();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION__PROVIDER_CONNECTION:
				return providerConnection != null && !providerConnection.isEmpty();
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
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_PROVIDED:
				return isProvided();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___IS_REQUIRED:
				return isRequired();
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME:
				return getTargetShortName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VariableDataInstanceInSwcInstanceImpl
