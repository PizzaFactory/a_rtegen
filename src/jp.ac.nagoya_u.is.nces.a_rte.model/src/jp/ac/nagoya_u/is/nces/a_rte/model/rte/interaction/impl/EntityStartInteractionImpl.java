/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
