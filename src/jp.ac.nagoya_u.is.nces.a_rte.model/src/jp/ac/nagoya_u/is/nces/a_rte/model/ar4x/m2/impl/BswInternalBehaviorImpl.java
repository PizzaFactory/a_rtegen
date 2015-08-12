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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Internal Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getDataTypeMapping <em>Data Type Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getExclusiveArea <em>Exclusive Area</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getModeSenderPolicy <em>Mode Sender Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswInternalBehaviorImpl#getBswSchedulableEntity <em>Bsw Schedulable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswInternalBehaviorImpl extends IdentifiableImpl implements BswInternalBehavior {
	/**
	 * The cached value of the '{@link #getDataTypeMapping() <em>Data Type Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeMappingSet> dataTypeMapping;

	/**
	 * The cached value of the '{@link #getExclusiveArea() <em>Exclusive Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveArea> exclusiveArea;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<BswModuleEntity> entity;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<BswEvent> event;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<BswImplementation> implementation;

	/**
	 * The cached value of the '{@link #getModeSenderPolicy() <em>Mode Sender Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeSenderPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<BswModeSenderPolicy> modeSenderPolicy;

	/**
	 * The cached setting delegate for the '{@link #getBswSchedulableEntity() <em>Bsw Schedulable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswSchedulableEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BSW_SCHEDULABLE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswInternalBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_INTERNAL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeMappingSet> getDataTypeMapping() {
		if (dataTypeMapping == null) {
			dataTypeMapping = new EObjectResolvingEList<DataTypeMappingSet>(DataTypeMappingSet.class, this, M2Package.BSW_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING);
		}
		return dataTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveArea> getExclusiveArea() {
		if (exclusiveArea == null) {
			exclusiveArea = new EObjectContainmentWithInverseEList<ExclusiveArea>(ExclusiveArea.class, this, M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA, M2Package.EXCLUSIVE_AREA__PARENT);
		}
		return exclusiveArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleDescription getParent() {
		if (eContainerFeatureID() != M2Package.BSW_INTERNAL_BEHAVIOR__PARENT) return null;
		return (BswModuleDescription)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BswModuleDescription newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.BSW_INTERNAL_BEHAVIOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BswModuleDescription newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.BSW_INTERNAL_BEHAVIOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR, BswModuleDescription.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_INTERNAL_BEHAVIOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswModuleEntity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentWithInverseEList<BswModuleEntity>(BswModuleEntity.class, this, M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY, M2Package.BSW_MODULE_ENTITY__PARENT);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentWithInverseEList<BswEvent>(BswEvent.class, this, M2Package.BSW_INTERNAL_BEHAVIOR__EVENT, M2Package.BSW_EVENT__PARENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswImplementation> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectWithInverseResolvingEList<BswImplementation>(BswImplementation.class, this, M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION, M2Package.BSW_IMPLEMENTATION__BEHAVIOR);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswModeSenderPolicy> getModeSenderPolicy() {
		if (modeSenderPolicy == null) {
			modeSenderPolicy = new EObjectContainmentEList<BswModeSenderPolicy>(BswModeSenderPolicy.class, this, M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY);
		}
		return modeSenderPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BswSchedulableEntity> getBswSchedulableEntity() {
		return (EList<BswSchedulableEntity>)BSW_SCHEDULABLE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExclusiveArea()).basicAdd(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BswModuleDescription)otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntity()).basicAdd(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvent()).basicAdd(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementation()).basicAdd(otherEnd, msgs);
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return ((InternalEList<?>)getExclusiveArea()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				return basicSetParent(null, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION:
				return ((InternalEList<?>)getImplementation()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY:
				return ((InternalEList<?>)getModeSenderPolicy()).basicRemove(otherEnd, msgs);
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR, BswModuleDescription.class, msgs);
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				return getDataTypeMapping();
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return getExclusiveArea();
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				return getParent();
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
				return getEntity();
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
				return getEvent();
			case M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION:
				return getImplementation();
			case M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY:
				return getModeSenderPolicy();
			case M2Package.BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY:
				return getBswSchedulableEntity();
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				getDataTypeMapping().clear();
				getDataTypeMapping().addAll((Collection<? extends DataTypeMappingSet>)newValue);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				getExclusiveArea().clear();
				getExclusiveArea().addAll((Collection<? extends ExclusiveArea>)newValue);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				setParent((BswModuleDescription)newValue);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends BswModuleEntity>)newValue);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends BswEvent>)newValue);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends BswImplementation>)newValue);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY:
				getModeSenderPolicy().clear();
				getModeSenderPolicy().addAll((Collection<? extends BswModeSenderPolicy>)newValue);
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				getDataTypeMapping().clear();
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				getExclusiveArea().clear();
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				setParent((BswModuleDescription)null);
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
				getEntity().clear();
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
				getEvent().clear();
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY:
				getModeSenderPolicy().clear();
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
			case M2Package.BSW_INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING:
				return dataTypeMapping != null && !dataTypeMapping.isEmpty();
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
				return exclusiveArea != null && !exclusiveArea.isEmpty();
			case M2Package.BSW_INTERNAL_BEHAVIOR__PARENT:
				return getParent() != null;
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
				return entity != null && !entity.isEmpty();
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
				return event != null && !event.isEmpty();
			case M2Package.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY:
				return modeSenderPolicy != null && !modeSenderPolicy.isEmpty();
			case M2Package.BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY:
				return BSW_SCHEDULABLE_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //BswInternalBehaviorImpl
