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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Sw Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl#getRteEventToTaskMapping <em>Rte Event To Task Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl#getRteExclusiveAreaImplementation <em>Rte Exclusive Area Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteSwComponentInstanceImpl#getRteSoftwareComponentInstance <em>Rte Software Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteSwComponentInstanceImpl extends EcucContainerImpl implements RteSwComponentInstance {
	/**
	 * The cached value of the '{@link #getRteEventToTaskMapping() <em>Rte Event To Task Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteEventToTaskMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RteEventToTaskMapping> rteEventToTaskMapping;
	/**
	 * The cached value of the '{@link #getRteExclusiveAreaImplementation() <em>Rte Exclusive Area Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteExclusiveAreaImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<RteExclusiveAreaImplementation> rteExclusiveAreaImplementation;
	/**
	 * The cached value of the '{@link #getRteSoftwareComponentInstance() <em>Rte Software Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteSoftwareComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected SwComponentPrototype rteSoftwareComponentInstance;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteSwComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_SW_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteEventToTaskMapping> getRteEventToTaskMapping() {
		if (rteEventToTaskMapping == null) {
			rteEventToTaskMapping = new EObjectContainmentEList<RteEventToTaskMapping>(RteEventToTaskMapping.class, this, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING);
		}
		return rteEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteExclusiveAreaImplementation> getRteExclusiveAreaImplementation() {
		if (rteExclusiveAreaImplementation == null) {
			rteExclusiveAreaImplementation = new EObjectContainmentEList<RteExclusiveAreaImplementation>(RteExclusiveAreaImplementation.class, this, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION);
		}
		return rteExclusiveAreaImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype getRteSoftwareComponentInstance() {
		if (rteSoftwareComponentInstance != null && ((EObject)rteSoftwareComponentInstance).eIsProxy()) {
			InternalEObject oldRteSoftwareComponentInstance = (InternalEObject)rteSoftwareComponentInstance;
			rteSoftwareComponentInstance = (SwComponentPrototype)eResolveProxy(oldRteSoftwareComponentInstance);
			if (rteSoftwareComponentInstance != oldRteSoftwareComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE, oldRteSoftwareComponentInstance, rteSoftwareComponentInstance));
			}
		}
		return rteSoftwareComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype basicGetRteSoftwareComponentInstance() {
		return rteSoftwareComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteSoftwareComponentInstance(SwComponentPrototype newRteSoftwareComponentInstance) {
		SwComponentPrototype oldRteSoftwareComponentInstance = rteSoftwareComponentInstance;
		rteSoftwareComponentInstance = newRteSoftwareComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE, oldRteSoftwareComponentInstance, rteSoftwareComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				return ((InternalEList<?>)getRteEventToTaskMapping()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				return ((InternalEList<?>)getRteExclusiveAreaImplementation()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				return getRteEventToTaskMapping();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				return getRteExclusiveAreaImplementation();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				if (resolve) return getRteSoftwareComponentInstance();
				return basicGetRteSoftwareComponentInstance();
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				getRteEventToTaskMapping().clear();
				getRteEventToTaskMapping().addAll((Collection<? extends RteEventToTaskMapping>)newValue);
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				getRteExclusiveAreaImplementation().clear();
				getRteExclusiveAreaImplementation().addAll((Collection<? extends RteExclusiveAreaImplementation>)newValue);
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				setRteSoftwareComponentInstance((SwComponentPrototype)newValue);
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				getRteEventToTaskMapping().clear();
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				getRteExclusiveAreaImplementation().clear();
				return;
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				setRteSoftwareComponentInstance((SwComponentPrototype)null);
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
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EVENT_TO_TASK_MAPPING:
				return rteEventToTaskMapping != null && !rteEventToTaskMapping.isEmpty();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_EXCLUSIVE_AREA_IMPLEMENTATION:
				return rteExclusiveAreaImplementation != null && !rteExclusiveAreaImplementation.isEmpty();
			case EcucPackage.RTE_SW_COMPONENT_INSTANCE__RTE_SOFTWARE_COMPONENT_INSTANCE:
				return rteSoftwareComponentInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RteSwComponentInstanceImpl
