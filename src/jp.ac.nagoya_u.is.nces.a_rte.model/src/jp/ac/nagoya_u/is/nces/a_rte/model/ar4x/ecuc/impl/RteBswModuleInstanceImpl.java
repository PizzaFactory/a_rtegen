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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswModuleInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswImplementation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Bsw Module Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswEventToTaskMapping <em>Rte Bsw Event To Task Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswExclusiveAreaImpl <em>Rte Bsw Exclusive Area Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswImplementation <em>Rte Bsw Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.RteBswModuleInstanceImpl#getRteBswRequiredModeGroupConnection <em>Rte Bsw Required Mode Group Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBswModuleInstanceImpl extends EcucContainerImpl implements RteBswModuleInstance {
	/**
	 * The cached value of the '{@link #getRteBswEventToTaskMapping() <em>Rte Bsw Event To Task Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswEventToTaskMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswEventToTaskMapping> rteBswEventToTaskMapping;

	/**
	 * The cached value of the '{@link #getRteBswExclusiveAreaImpl() <em>Rte Bsw Exclusive Area Impl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswExclusiveAreaImpl()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswExclusiveAreaImpl> rteBswExclusiveAreaImpl;

	/**
	 * The cached value of the '{@link #getRteBswImplementation() <em>Rte Bsw Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswImplementation()
	 * @generated
	 * @ordered
	 */
	protected BswImplementation rteBswImplementation;

	/**
	 * The cached value of the '{@link #getRteBswRequiredModeGroupConnection() <em>Rte Bsw Required Mode Group Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBswRequiredModeGroupConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswRequiredModeGroupConnection> rteBswRequiredModeGroupConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBswModuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.RTE_BSW_MODULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswEventToTaskMapping> getRteBswEventToTaskMapping() {
		if (rteBswEventToTaskMapping == null) {
			rteBswEventToTaskMapping = new EObjectContainmentEList<RteBswEventToTaskMapping>(RteBswEventToTaskMapping.class, this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING);
		}
		return rteBswEventToTaskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswExclusiveAreaImpl> getRteBswExclusiveAreaImpl() {
		if (rteBswExclusiveAreaImpl == null) {
			rteBswExclusiveAreaImpl = new EObjectContainmentEList<RteBswExclusiveAreaImpl>(RteBswExclusiveAreaImpl.class, this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL);
		}
		return rteBswExclusiveAreaImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswImplementation getRteBswImplementation() {
		return rteBswImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteBswImplementation(BswImplementation newRteBswImplementation, NotificationChain msgs) {
		BswImplementation oldRteBswImplementation = rteBswImplementation;
		rteBswImplementation = newRteBswImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION, oldRteBswImplementation, newRteBswImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteBswImplementation(BswImplementation newRteBswImplementation) {
		if (newRteBswImplementation != rteBswImplementation) {
			NotificationChain msgs = null;
			if (rteBswImplementation != null)
				msgs = ((InternalEObject)rteBswImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION, null, msgs);
			if (newRteBswImplementation != null)
				msgs = ((InternalEObject)newRteBswImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION, null, msgs);
			msgs = basicSetRteBswImplementation(newRteBswImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION, newRteBswImplementation, newRteBswImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswRequiredModeGroupConnection> getRteBswRequiredModeGroupConnection() {
		if (rteBswRequiredModeGroupConnection == null) {
			rteBswRequiredModeGroupConnection = new EObjectContainmentWithInverseEList<RteBswRequiredModeGroupConnection>(RteBswRequiredModeGroupConnection.class, this, EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION, EcucPackage.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__PARENT);
		}
		return rteBswRequiredModeGroupConnection;
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRteBswRequiredModeGroupConnection()).basicAdd(otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				return ((InternalEList<?>)getRteBswEventToTaskMapping()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				return ((InternalEList<?>)getRteBswExclusiveAreaImpl()).basicRemove(otherEnd, msgs);
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				return basicSetRteBswImplementation(null, msgs);
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return ((InternalEList<?>)getRteBswRequiredModeGroupConnection()).basicRemove(otherEnd, msgs);
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				return getRteBswEventToTaskMapping();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				return getRteBswExclusiveAreaImpl();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				return getRteBswImplementation();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return getRteBswRequiredModeGroupConnection();
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				getRteBswEventToTaskMapping().clear();
				getRteBswEventToTaskMapping().addAll((Collection<? extends RteBswEventToTaskMapping>)newValue);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				getRteBswExclusiveAreaImpl().clear();
				getRteBswExclusiveAreaImpl().addAll((Collection<? extends RteBswExclusiveAreaImpl>)newValue);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				setRteBswImplementation((BswImplementation)newValue);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				getRteBswRequiredModeGroupConnection().clear();
				getRteBswRequiredModeGroupConnection().addAll((Collection<? extends RteBswRequiredModeGroupConnection>)newValue);
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				getRteBswEventToTaskMapping().clear();
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				getRteBswExclusiveAreaImpl().clear();
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				setRteBswImplementation((BswImplementation)null);
				return;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				getRteBswRequiredModeGroupConnection().clear();
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
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EVENT_TO_TASK_MAPPING:
				return rteBswEventToTaskMapping != null && !rteBswEventToTaskMapping.isEmpty();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_EXCLUSIVE_AREA_IMPL:
				return rteBswExclusiveAreaImpl != null && !rteBswExclusiveAreaImpl.isEmpty();
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_IMPLEMENTATION:
				return rteBswImplementation != null;
			case EcucPackage.RTE_BSW_MODULE_INSTANCE__RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION:
				return rteBswRequiredModeGroupConnection != null && !rteBswRequiredModeGroupConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteBswModuleInstanceImpl
