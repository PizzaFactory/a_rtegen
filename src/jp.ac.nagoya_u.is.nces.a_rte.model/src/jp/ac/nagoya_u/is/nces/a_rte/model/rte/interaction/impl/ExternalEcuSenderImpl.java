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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Ecu Sender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getSourceSignal <em>Source Signal</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getSourceSignalGroup <em>Source Signal Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getRequiresRteFilter <em>Requires Rte Filter</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getRequiresRteInvalidation <em>Requires Rte Invalidation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ExternalEcuSenderImpl#getRequiresRteInitialization <em>Requires Rte Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalEcuSenderImpl extends SenderImpl implements ExternalEcuSender {
	/**
	 * The cached value of the '{@link #getSourceSignal() <em>Source Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSignal()
	 * @generated
	 * @ordered
	 */
	protected ComSignal sourceSignal;

	/**
	 * The cached value of the '{@link #getSourceSignalGroup() <em>Source Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected ComSignalGroup sourceSignalGroup;

	/**
	 * The default value of the '{@link #getRequiresRteFilter() <em>Requires Rte Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_RTE_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRteFilter() <em>Requires Rte Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteFilter()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresRteFilter = REQUIRES_RTE_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresRteInvalidation() <em>Requires Rte Invalidation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInvalidation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_RTE_INVALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRteInvalidation() <em>Requires Rte Invalidation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInvalidation()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresRteInvalidation = REQUIRES_RTE_INVALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresRteInitialization() <em>Requires Rte Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_RTE_INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRteInitialization() <em>Requires Rte Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRteInitialization()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresRteInitialization = REQUIRES_RTE_INITIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalEcuSenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal getSourceSignal() {
		if (sourceSignal != null && ((EObject)sourceSignal).eIsProxy()) {
			InternalEObject oldSourceSignal = (InternalEObject)sourceSignal;
			sourceSignal = (ComSignal)eResolveProxy(oldSourceSignal);
			if (sourceSignal != oldSourceSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL, oldSourceSignal, sourceSignal));
			}
		}
		return sourceSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignal basicGetSourceSignal() {
		return sourceSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSignal(ComSignal newSourceSignal) {
		ComSignal oldSourceSignal = sourceSignal;
		sourceSignal = newSourceSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL, oldSourceSignal, sourceSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup getSourceSignalGroup() {
		if (sourceSignalGroup != null && ((EObject)sourceSignalGroup).eIsProxy()) {
			InternalEObject oldSourceSignalGroup = (InternalEObject)sourceSignalGroup;
			sourceSignalGroup = (ComSignalGroup)eResolveProxy(oldSourceSignalGroup);
			if (sourceSignalGroup != oldSourceSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP, oldSourceSignalGroup, sourceSignalGroup));
			}
		}
		return sourceSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSignalGroup basicGetSourceSignalGroup() {
		return sourceSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSignalGroup(ComSignalGroup newSourceSignalGroup) {
		ComSignalGroup oldSourceSignalGroup = sourceSignalGroup;
		sourceSignalGroup = newSourceSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP, oldSourceSignalGroup, sourceSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequiresRteFilter() {
		return requiresRteFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRteFilter(Boolean newRequiresRteFilter) {
		Boolean oldRequiresRteFilter = requiresRteFilter;
		requiresRteFilter = newRequiresRteFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER, oldRequiresRteFilter, requiresRteFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequiresRteInvalidation() {
		return requiresRteInvalidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRteInvalidation(Boolean newRequiresRteInvalidation) {
		Boolean oldRequiresRteInvalidation = requiresRteInvalidation;
		requiresRteInvalidation = newRequiresRteInvalidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION, oldRequiresRteInvalidation, requiresRteInvalidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequiresRteInitialization() {
		return requiresRteInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRteInitialization(Boolean newRequiresRteInitialization) {
		Boolean oldRequiresRteInitialization = requiresRteInitialization;
		requiresRteInitialization = newRequiresRteInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION, oldRequiresRteInitialization, requiresRteInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				if (resolve) return getSourceSignal();
				return basicGetSourceSignal();
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				if (resolve) return getSourceSignalGroup();
				return basicGetSourceSignalGroup();
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				return getRequiresRteFilter();
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				return getRequiresRteInvalidation();
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				return getRequiresRteInitialization();
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
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				setSourceSignal((ComSignal)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				setSourceSignalGroup((ComSignalGroup)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				setRequiresRteFilter((Boolean)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				setRequiresRteInvalidation((Boolean)newValue);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				setRequiresRteInitialization((Boolean)newValue);
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
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				setSourceSignal((ComSignal)null);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				setSourceSignalGroup((ComSignalGroup)null);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				setRequiresRteFilter(REQUIRES_RTE_FILTER_EDEFAULT);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				setRequiresRteInvalidation(REQUIRES_RTE_INVALIDATION_EDEFAULT);
				return;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				setRequiresRteInitialization(REQUIRES_RTE_INITIALIZATION_EDEFAULT);
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
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL:
				return sourceSignal != null;
			case InteractionPackage.EXTERNAL_ECU_SENDER__SOURCE_SIGNAL_GROUP:
				return sourceSignalGroup != null;
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_FILTER:
				return REQUIRES_RTE_FILTER_EDEFAULT == null ? requiresRteFilter != null : !REQUIRES_RTE_FILTER_EDEFAULT.equals(requiresRteFilter);
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INVALIDATION:
				return REQUIRES_RTE_INVALIDATION_EDEFAULT == null ? requiresRteInvalidation != null : !REQUIRES_RTE_INVALIDATION_EDEFAULT.equals(requiresRteInvalidation);
			case InteractionPackage.EXTERNAL_ECU_SENDER__REQUIRES_RTE_INITIALIZATION:
				return REQUIRES_RTE_INITIALIZATION_EDEFAULT == null ? requiresRteInitialization != null : !REQUIRES_RTE_INITIALIZATION_EDEFAULT.equals(requiresRteInitialization);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (requiresRteFilter: ");
		result.append(requiresRteFilter);
		result.append(", requiresRteInvalidation: ");
		result.append(requiresRteInvalidation);
		result.append(", requiresRteInitialization: ");
		result.append(requiresRteInitialization);
		result.append(')');
		return result.toString();
	}

} //ExternalEcuSenderImpl
