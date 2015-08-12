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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Start Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStartInteractionImpl#getEventToTaskMapping <em>Event To Task Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityStartInteractionImpl extends InteractionImpl implements EntityStartInteraction {
	/**
	 * The cached value of the '{@link #getStarter() <em>Starter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarter()
	 * @generated
	 * @ordered
	 */
	protected EntityStarter starter;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EntityStartImplementation implementation;

	/**
	 * The cached value of the '{@link #getEventToTaskMapping() <em>Event To Task Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventToTaskMapping()
	 * @generated
	 * @ordered
	 */
	protected EventToTaskMapping eventToTaskMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityStartInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ENTITY_START_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarter getStarter() {
		if (starter != null && ((EObject)starter).eIsProxy()) {
			InternalEObject oldStarter = (InternalEObject)starter;
			starter = (EntityStarter)eResolveProxy(oldStarter);
			if (starter != oldStarter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ENTITY_START_INTERACTION__STARTER, oldStarter, starter));
			}
		}
		return starter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarter basicGetStarter() {
		return starter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(EntityStarter newStarter, NotificationChain msgs) {
		EntityStarter oldStarter = starter;
		starter = newStarter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__STARTER, oldStarter, newStarter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarter(EntityStarter newStarter) {
		if (newStarter != starter) {
			NotificationChain msgs = null;
			if (starter != null)
				msgs = ((InternalEObject)starter).eInverseRemove(this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, EntityStarter.class, msgs);
			if (newStarter != null)
				msgs = ((InternalEObject)newStarter).eInverseAdd(this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, EntityStarter.class, msgs);
			msgs = basicSetStarter(newStarter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__STARTER, newStarter, newStarter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStartImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(EntityStartImplementation newImplementation, NotificationChain msgs) {
		EntityStartImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(EntityStartImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventToTaskMapping getEventToTaskMapping() {
		return eventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventToTaskMapping(EventToTaskMapping newEventToTaskMapping, NotificationChain msgs) {
		EventToTaskMapping oldEventToTaskMapping = eventToTaskMapping;
		eventToTaskMapping = newEventToTaskMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING, oldEventToTaskMapping, newEventToTaskMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventToTaskMapping(EventToTaskMapping newEventToTaskMapping) {
		if (newEventToTaskMapping != eventToTaskMapping) {
			NotificationChain msgs = null;
			if (eventToTaskMapping != null)
				msgs = ((InternalEObject)eventToTaskMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING, null, msgs);
			if (newEventToTaskMapping != null)
				msgs = ((InternalEObject)newEventToTaskMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING, null, msgs);
			msgs = basicSetEventToTaskMapping(newEventToTaskMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING, newEventToTaskMapping, newEventToTaskMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				if (starter != null)
					msgs = ((InternalEObject)starter).eInverseRemove(this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, EntityStarter.class, msgs);
				return basicSetStarter((EntityStarter)otherEnd, msgs);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				return basicSetStarter(null, msgs);
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING:
				return basicSetEventToTaskMapping(null, msgs);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				if (resolve) return getStarter();
				return basicGetStarter();
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				return getImplementation();
			case InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING:
				return getEventToTaskMapping();
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				setStarter((EntityStarter)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				setImplementation((EntityStartImplementation)newValue);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING:
				setEventToTaskMapping((EventToTaskMapping)newValue);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				setStarter((EntityStarter)null);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				setImplementation((EntityStartImplementation)null);
				return;
			case InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING:
				setEventToTaskMapping((EventToTaskMapping)null);
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
			case InteractionPackage.ENTITY_START_INTERACTION__STARTER:
				return starter != null;
			case InteractionPackage.ENTITY_START_INTERACTION__IMPLEMENTATION:
				return implementation != null;
			case InteractionPackage.ENTITY_START_INTERACTION__EVENT_TO_TASK_MAPPING:
				return eventToTaskMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityStartInteractionImpl
