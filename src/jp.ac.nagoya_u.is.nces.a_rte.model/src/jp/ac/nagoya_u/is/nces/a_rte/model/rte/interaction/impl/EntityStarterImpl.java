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

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Starter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getExpectedConfig <em>Expected Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getStartInteraction <em>Start Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getStartOffsetCounterImplementation <em>Start Offset Counter Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EntityStarterImpl#getCycleCounterImplementation <em>Cycle Counter Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityStarterImpl extends InteractionEndImpl implements EntityStarter {
	/**
	 * The cached value of the '{@link #getExpectedConfig() <em>Expected Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedConfig()
	 * @generated
	 * @ordered
	 */
	protected RteUsedOsActivation expectedConfig;

	/**
	 * The cached value of the '{@link #getStartInteraction() <em>Start Interaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityStartInteraction> startInteraction;

	/**
	 * The cached value of the '{@link #getStartOffsetCounterImplementation() <em>Start Offset Counter Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffsetCounterImplementation()
	 * @generated
	 * @ordered
	 */
	protected StartOffsetCounterImplementation startOffsetCounterImplementation;

	/**
	 * The cached value of the '{@link #getCycleCounterImplementation() <em>Cycle Counter Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCounterImplementation()
	 * @generated
	 * @ordered
	 */
	protected CycleCounterImplementation cycleCounterImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityStarterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ENTITY_STARTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivation getExpectedConfig() {
		if (expectedConfig != null && ((EObject)expectedConfig).eIsProxy()) {
			InternalEObject oldExpectedConfig = (InternalEObject)expectedConfig;
			expectedConfig = (RteUsedOsActivation)eResolveProxy(oldExpectedConfig);
			if (expectedConfig != oldExpectedConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG, oldExpectedConfig, expectedConfig));
			}
		}
		return expectedConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivation basicGetExpectedConfig() {
		return expectedConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedConfig(RteUsedOsActivation newExpectedConfig) {
		RteUsedOsActivation oldExpectedConfig = expectedConfig;
		expectedConfig = newExpectedConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG, oldExpectedConfig, expectedConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityStartInteraction> getStartInteraction() {
		if (startInteraction == null) {
			startInteraction = new EObjectWithInverseResolvingEList<EntityStartInteraction>(EntityStartInteraction.class, this, InteractionPackage.ENTITY_STARTER__START_INTERACTION, InteractionPackage.ENTITY_START_INTERACTION__STARTER);
		}
		return startInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOffsetCounterImplementation getStartOffsetCounterImplementation() {
		return startOffsetCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOffsetCounterImplementation(StartOffsetCounterImplementation newStartOffsetCounterImplementation, NotificationChain msgs) {
		StartOffsetCounterImplementation oldStartOffsetCounterImplementation = startOffsetCounterImplementation;
		startOffsetCounterImplementation = newStartOffsetCounterImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION, oldStartOffsetCounterImplementation, newStartOffsetCounterImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffsetCounterImplementation(StartOffsetCounterImplementation newStartOffsetCounterImplementation) {
		if (newStartOffsetCounterImplementation != startOffsetCounterImplementation) {
			NotificationChain msgs = null;
			if (startOffsetCounterImplementation != null)
				msgs = ((InternalEObject)startOffsetCounterImplementation).eInverseRemove(this, InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION__PARENT, StartOffsetCounterImplementation.class, msgs);
			if (newStartOffsetCounterImplementation != null)
				msgs = ((InternalEObject)newStartOffsetCounterImplementation).eInverseAdd(this, InteractionPackage.START_OFFSET_COUNTER_IMPLEMENTATION__PARENT, StartOffsetCounterImplementation.class, msgs);
			msgs = basicSetStartOffsetCounterImplementation(newStartOffsetCounterImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION, newStartOffsetCounterImplementation, newStartOffsetCounterImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CycleCounterImplementation getCycleCounterImplementation() {
		return cycleCounterImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCycleCounterImplementation(CycleCounterImplementation newCycleCounterImplementation, NotificationChain msgs) {
		CycleCounterImplementation oldCycleCounterImplementation = cycleCounterImplementation;
		cycleCounterImplementation = newCycleCounterImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION, oldCycleCounterImplementation, newCycleCounterImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleCounterImplementation(CycleCounterImplementation newCycleCounterImplementation) {
		if (newCycleCounterImplementation != cycleCounterImplementation) {
			NotificationChain msgs = null;
			if (cycleCounterImplementation != null)
				msgs = ((InternalEObject)cycleCounterImplementation).eInverseRemove(this, InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION__PARENT, CycleCounterImplementation.class, msgs);
			if (newCycleCounterImplementation != null)
				msgs = ((InternalEObject)newCycleCounterImplementation).eInverseAdd(this, InteractionPackage.CYCLE_COUNTER_IMPLEMENTATION__PARENT, CycleCounterImplementation.class, msgs);
			msgs = basicSetCycleCounterImplementation(newCycleCounterImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION, newCycleCounterImplementation, newCycleCounterImplementation));
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
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartInteraction()).basicAdd(otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				if (startOffsetCounterImplementation != null)
					msgs = ((InternalEObject)startOffsetCounterImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION, null, msgs);
				return basicSetStartOffsetCounterImplementation((StartOffsetCounterImplementation)otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				if (cycleCounterImplementation != null)
					msgs = ((InternalEObject)cycleCounterImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION, null, msgs);
				return basicSetCycleCounterImplementation((CycleCounterImplementation)otherEnd, msgs);
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
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return ((InternalEList<?>)getStartInteraction()).basicRemove(otherEnd, msgs);
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				return basicSetStartOffsetCounterImplementation(null, msgs);
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				return basicSetCycleCounterImplementation(null, msgs);
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
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				if (resolve) return getExpectedConfig();
				return basicGetExpectedConfig();
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return getStartInteraction();
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				return getStartOffsetCounterImplementation();
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				return getCycleCounterImplementation();
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
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				setExpectedConfig((RteUsedOsActivation)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				getStartInteraction().clear();
				getStartInteraction().addAll((Collection<? extends EntityStartInteraction>)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				setStartOffsetCounterImplementation((StartOffsetCounterImplementation)newValue);
				return;
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				setCycleCounterImplementation((CycleCounterImplementation)newValue);
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
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				setExpectedConfig((RteUsedOsActivation)null);
				return;
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				getStartInteraction().clear();
				return;
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				setStartOffsetCounterImplementation((StartOffsetCounterImplementation)null);
				return;
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				setCycleCounterImplementation((CycleCounterImplementation)null);
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
			case InteractionPackage.ENTITY_STARTER__EXPECTED_CONFIG:
				return expectedConfig != null;
			case InteractionPackage.ENTITY_STARTER__START_INTERACTION:
				return startInteraction != null && !startInteraction.isEmpty();
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
				return startOffsetCounterImplementation != null;
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
				return cycleCounterImplementation != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityStarterImpl
