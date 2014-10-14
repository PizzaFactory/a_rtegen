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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteGeneration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteInitializationBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteOsInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteSwComponentInstance;

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
 * An implementation of the model object '<em><b>Rte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteGeneration <em>Rte Generation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteSwComponentInstance <em>Rte Sw Component Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteOsInteraction <em>Rte Os Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteInitializationBehavior <em>Rte Initialization Behavior</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteImpl#getRteBswModuleInstance <em>Rte Bsw Module Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteImpl extends EcucModuleImpl implements Rte {
	/**
	 * The cached value of the '{@link #getRteGeneration() <em>Rte Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteGeneration()
	 * @generated
	 * @ordered
	 */
	protected RteGeneration rteGeneration;

	/**
	 * The cached value of the '{@link #getRteSwComponentInstance() <em>Rte Sw Component Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteSwComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RteSwComponentInstance> rteSwComponentInstance;

	/**
	 * The cached value of the '{@link #getRteOsInteraction() <em>Rte Os Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteOsInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<RteOsInteraction> rteOsInteraction;

	/**
	 * The cached value of the '{@link #getRteInitializationBehavior() <em>Rte Initialization Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInitializationBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<RteInitializationBehavior> rteInitializationBehavior;

	/**
	 * The cached value of the '{@link #getRteBswModuleInstance() <em>Rte Bsw Module Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswModuleInstance> rteBswModuleInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteGeneration getRteGeneration() {
		return rteGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteGeneration(RteGeneration newRteGeneration, NotificationChain msgs) {
		RteGeneration oldRteGeneration = rteGeneration;
		rteGeneration = newRteGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE__RTE_GENERATION, oldRteGeneration, newRteGeneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteGeneration(RteGeneration newRteGeneration) {
		if (newRteGeneration != rteGeneration) {
			NotificationChain msgs = null;
			if (rteGeneration != null)
				msgs = ((InternalEObject)rteGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE__RTE_GENERATION, null, msgs);
			if (newRteGeneration != null)
				msgs = ((InternalEObject)newRteGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE__RTE_GENERATION, null, msgs);
			msgs = basicSetRteGeneration(newRteGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE__RTE_GENERATION, newRteGeneration, newRteGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteSwComponentInstance> getRteSwComponentInstance() {
		if (rteSwComponentInstance == null) {
			rteSwComponentInstance = new EObjectContainmentEList<RteSwComponentInstance>(RteSwComponentInstance.class, this, EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE);
		}
		return rteSwComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteOsInteraction> getRteOsInteraction() {
		if (rteOsInteraction == null) {
			rteOsInteraction = new EObjectContainmentEList<RteOsInteraction>(RteOsInteraction.class, this, EcucPackage.RTE__RTE_OS_INTERACTION);
		}
		return rteOsInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteInitializationBehavior> getRteInitializationBehavior() {
		if (rteInitializationBehavior == null) {
			rteInitializationBehavior = new EObjectContainmentEList<RteInitializationBehavior>(RteInitializationBehavior.class, this, EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR);
		}
		return rteInitializationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswModuleInstance> getRteBswModuleInstance() {
		if (rteBswModuleInstance == null) {
			rteBswModuleInstance = new EObjectContainmentEList<RteBswModuleInstance>(RteBswModuleInstance.class, this, EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE);
		}
		return rteBswModuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.RTE__RTE_GENERATION:
				return basicSetRteGeneration(null, msgs);
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				return ((InternalEList<?>)getRteSwComponentInstance()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				return ((InternalEList<?>)getRteOsInteraction()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				return ((InternalEList<?>)getRteInitializationBehavior()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				return ((InternalEList<?>)getRteBswModuleInstance()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.RTE__RTE_GENERATION:
				return getRteGeneration();
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				return getRteSwComponentInstance();
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				return getRteOsInteraction();
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				return getRteInitializationBehavior();
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				return getRteBswModuleInstance();
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
			case EcucPackage.RTE__RTE_GENERATION:
				setRteGeneration((RteGeneration)newValue);
				return;
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				getRteSwComponentInstance().clear();
				getRteSwComponentInstance().addAll((Collection<? extends RteSwComponentInstance>)newValue);
				return;
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				getRteOsInteraction().clear();
				getRteOsInteraction().addAll((Collection<? extends RteOsInteraction>)newValue);
				return;
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				getRteInitializationBehavior().clear();
				getRteInitializationBehavior().addAll((Collection<? extends RteInitializationBehavior>)newValue);
				return;
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				getRteBswModuleInstance().clear();
				getRteBswModuleInstance().addAll((Collection<? extends RteBswModuleInstance>)newValue);
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
			case EcucPackage.RTE__RTE_GENERATION:
				setRteGeneration((RteGeneration)null);
				return;
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				getRteSwComponentInstance().clear();
				return;
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				getRteOsInteraction().clear();
				return;
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				getRteInitializationBehavior().clear();
				return;
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				getRteBswModuleInstance().clear();
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
			case EcucPackage.RTE__RTE_GENERATION:
				return rteGeneration != null;
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
				return rteSwComponentInstance != null && !rteSwComponentInstance.isEmpty();
			case EcucPackage.RTE__RTE_OS_INTERACTION:
				return rteOsInteraction != null && !rteOsInteraction.isEmpty();
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
				return rteInitializationBehavior != null && !rteInitializationBehavior.isEmpty();
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
				return rteBswModuleInstance != null && !rteBswModuleInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteImpl
