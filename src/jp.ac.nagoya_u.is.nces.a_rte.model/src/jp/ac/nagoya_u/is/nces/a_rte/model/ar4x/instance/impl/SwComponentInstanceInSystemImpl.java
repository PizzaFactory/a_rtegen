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

import java.util.Collection;
import java.util.Collections;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Component Instance In System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl#getContextRootComposition <em>Context Root Composition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.SwComponentInstanceInSystemImpl#getOwnerPartition <em>Owner Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwComponentInstanceInSystemImpl extends InstanceReferrableImpl implements SwComponentInstanceInSystem {
	/**
	 * The cached value of the '{@link #getContextRootComposition() <em>Context Root Composition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRootComposition()
	 * @generated
	 * @ordered
	 */
	protected RootSwCompositionPrototype contextRootComposition;

	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected SwComponentPrototype prototype;

	/**
	 * The cached value of the '{@link #getOwnerPartition() <em>Owner Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<EcucPartition> ownerPartition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwComponentInstanceInSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.SW_COMPONENT_INSTANCE_IN_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceId() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		Collections.addAll(instanceRefs, getContextRootComposition().getId(), getPrototype().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootSwCompositionPrototype getContextRootComposition() {
		if (contextRootComposition != null && ((EObject)contextRootComposition).eIsProxy()) {
			InternalEObject oldContextRootComposition = (InternalEObject)contextRootComposition;
			contextRootComposition = (RootSwCompositionPrototype)eResolveProxy(oldContextRootComposition);
			if (contextRootComposition != oldContextRootComposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION, oldContextRootComposition, contextRootComposition));
			}
		}
		return contextRootComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootSwCompositionPrototype basicGetContextRootComposition() {
		return contextRootComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextRootComposition(RootSwCompositionPrototype newContextRootComposition) {
		RootSwCompositionPrototype oldContextRootComposition = contextRootComposition;
		contextRootComposition = newContextRootComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION, oldContextRootComposition, contextRootComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype getPrototype() {
		if (prototype != null && ((EObject)prototype).eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (SwComponentPrototype)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrototype(SwComponentPrototype newPrototype, NotificationChain msgs) {
		SwComponentPrototype oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE, oldPrototype, newPrototype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototype(SwComponentPrototype newPrototype) {
		if (newPrototype != prototype) {
			NotificationChain msgs = null;
			if (prototype != null)
				msgs = ((InternalEObject)prototype).eInverseRemove(this, M2Package.SW_COMPONENT_PROTOTYPE__INSTANCE, SwComponentPrototype.class, msgs);
			if (newPrototype != null)
				msgs = ((InternalEObject)newPrototype).eInverseAdd(this, M2Package.SW_COMPONENT_PROTOTYPE__INSTANCE, SwComponentPrototype.class, msgs);
			msgs = basicSetPrototype(newPrototype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE, newPrototype, newPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcucPartition> getOwnerPartition() {
		if (ownerPartition == null) {
			ownerPartition = new EObjectWithInverseResolvingEList.ManyInverse<EcucPartition>(EcucPartition.class, this, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION, EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT);
		}
		return ownerPartition;
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
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE:
				if (prototype != null)
					msgs = ((InternalEObject)prototype).eInverseRemove(this, M2Package.SW_COMPONENT_PROTOTYPE__INSTANCE, SwComponentPrototype.class, msgs);
				return basicSetPrototype((SwComponentPrototype)otherEnd, msgs);
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnerPartition()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE:
				return basicSetPrototype(null, msgs);
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION:
				return ((InternalEList<?>)getOwnerPartition()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION:
				if (resolve) return getContextRootComposition();
				return basicGetContextRootComposition();
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION:
				return getOwnerPartition();
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
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION:
				setContextRootComposition((RootSwCompositionPrototype)newValue);
				return;
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE:
				setPrototype((SwComponentPrototype)newValue);
				return;
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION:
				getOwnerPartition().clear();
				getOwnerPartition().addAll((Collection<? extends EcucPartition>)newValue);
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
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION:
				setContextRootComposition((RootSwCompositionPrototype)null);
				return;
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE:
				setPrototype((SwComponentPrototype)null);
				return;
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION:
				getOwnerPartition().clear();
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
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__CONTEXT_ROOT_COMPOSITION:
				return contextRootComposition != null;
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__PROTOTYPE:
				return prototype != null;
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION:
				return ownerPartition != null && !ownerPartition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwComponentInstanceInSystemImpl
