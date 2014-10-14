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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.GeneratedEcuConfiguration;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Interaction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionEnd;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl#getInteractionEnd <em>Interaction End</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.InteractionRootImpl#getGeneratedEcuConfiguration <em>Generated Ecu Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionRootImpl extends ExtendedEObjectImpl implements InteractionRoot {
	/**
	 * The cached value of the '{@link #getInteractionEnd() <em>Interaction End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionEnd> interactionEnd;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interaction;

	/**
	 * The cached value of the '{@link #getGeneratedEcuConfiguration() <em>Generated Ecu Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedEcuConfiguration()
	 * @generated
	 * @ordered
	 */
	protected GeneratedEcuConfiguration generatedEcuConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionEnd> getInteractionEnd() {
		if (interactionEnd == null) {
			interactionEnd = new EObjectContainmentEList<InteractionEnd>(InteractionEnd.class, this, InteractionPackage.INTERACTION_ROOT__INTERACTION_END);
		}
		return interactionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<Interaction>(Interaction.class, this, InteractionPackage.INTERACTION_ROOT__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedEcuConfiguration getGeneratedEcuConfiguration() {
		return generatedEcuConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedEcuConfiguration(GeneratedEcuConfiguration newGeneratedEcuConfiguration, NotificationChain msgs) {
		GeneratedEcuConfiguration oldGeneratedEcuConfiguration = generatedEcuConfiguration;
		generatedEcuConfiguration = newGeneratedEcuConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, oldGeneratedEcuConfiguration, newGeneratedEcuConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedEcuConfiguration(GeneratedEcuConfiguration newGeneratedEcuConfiguration) {
		if (newGeneratedEcuConfiguration != generatedEcuConfiguration) {
			NotificationChain msgs = null;
			if (generatedEcuConfiguration != null)
				msgs = ((InternalEObject)generatedEcuConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, null, msgs);
			if (newGeneratedEcuConfiguration != null)
				msgs = ((InternalEObject)newGeneratedEcuConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, null, msgs);
			msgs = basicSetGeneratedEcuConfiguration(newGeneratedEcuConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION, newGeneratedEcuConfiguration, newGeneratedEcuConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				return ((InternalEList<?>)getInteractionEnd()).basicRemove(otherEnd, msgs);
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				return basicSetGeneratedEcuConfiguration(null, msgs);
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				return getInteractionEnd();
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				return getInteraction();
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				return getGeneratedEcuConfiguration();
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				getInteractionEnd().clear();
				getInteractionEnd().addAll((Collection<? extends InteractionEnd>)newValue);
				return;
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends Interaction>)newValue);
				return;
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				setGeneratedEcuConfiguration((GeneratedEcuConfiguration)newValue);
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				getInteractionEnd().clear();
				return;
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				getInteraction().clear();
				return;
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				setGeneratedEcuConfiguration((GeneratedEcuConfiguration)null);
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
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
				return interactionEnd != null && !interactionEnd.isEmpty();
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
				return generatedEcuConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionRootImpl
