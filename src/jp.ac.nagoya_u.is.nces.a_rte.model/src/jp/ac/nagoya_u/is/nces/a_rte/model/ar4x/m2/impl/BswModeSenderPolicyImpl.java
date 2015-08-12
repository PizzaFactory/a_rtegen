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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Mode Sender Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSenderPolicyImpl#getProvidedModeGroup <em>Provided Mode Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModeSenderPolicyImpl#getQueueLength <em>Queue Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswModeSenderPolicyImpl extends M2ObjectImpl implements BswModeSenderPolicy {
	/**
	 * The cached value of the '{@link #getProvidedModeGroup() <em>Provided Mode Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedModeGroup()
	 * @generated
	 * @ordered
	 */
	protected ModeDeclarationGroupPrototype providedModeGroup;
	/**
	 * The default value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUEUE_LENGTH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Integer queueLength = QUEUE_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswModeSenderPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_MODE_SENDER_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototype getProvidedModeGroup() {
		if (providedModeGroup != null && ((EObject)providedModeGroup).eIsProxy()) {
			InternalEObject oldProvidedModeGroup = (InternalEObject)providedModeGroup;
			providedModeGroup = (ModeDeclarationGroupPrototype)eResolveProxy(oldProvidedModeGroup);
			if (providedModeGroup != oldProvidedModeGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP, oldProvidedModeGroup, providedModeGroup));
			}
		}
		return providedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototype basicGetProvidedModeGroup() {
		return providedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedModeGroup(ModeDeclarationGroupPrototype newProvidedModeGroup) {
		ModeDeclarationGroupPrototype oldProvidedModeGroup = providedModeGroup;
		providedModeGroup = newProvidedModeGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP, oldProvidedModeGroup, providedModeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQueueLength() {
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueLength(Integer newQueueLength) {
		Integer oldQueueLength = queueLength;
		queueLength = newQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODE_SENDER_POLICY__QUEUE_LENGTH, oldQueueLength, queueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP:
				if (resolve) return getProvidedModeGroup();
				return basicGetProvidedModeGroup();
			case M2Package.BSW_MODE_SENDER_POLICY__QUEUE_LENGTH:
				return getQueueLength();
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
			case M2Package.BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP:
				setProvidedModeGroup((ModeDeclarationGroupPrototype)newValue);
				return;
			case M2Package.BSW_MODE_SENDER_POLICY__QUEUE_LENGTH:
				setQueueLength((Integer)newValue);
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
			case M2Package.BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP:
				setProvidedModeGroup((ModeDeclarationGroupPrototype)null);
				return;
			case M2Package.BSW_MODE_SENDER_POLICY__QUEUE_LENGTH:
				setQueueLength(QUEUE_LENGTH_EDEFAULT);
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
			case M2Package.BSW_MODE_SENDER_POLICY__PROVIDED_MODE_GROUP:
				return providedModeGroup != null;
			case M2Package.BSW_MODE_SENDER_POLICY__QUEUE_LENGTH:
				return QUEUE_LENGTH_EDEFAULT == null ? queueLength != null : !QUEUE_LENGTH_EDEFAULT.equals(queueLength);
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
		result.append(" (queueLength: ");
		result.append(queueLength);
		result.append(')');
		return result.toString();
	}

} //BswModeSenderPolicyImpl
