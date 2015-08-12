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

import java.lang.reflect.InvocationTargetException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Triggering Entity Start Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl#getCyclePeriod <em>Cycle Period</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.TimingTriggeringEntityStartImplementationImpl#getStartOffset <em>Start Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingTriggeringEntityStartImplementationImpl extends EntityStartImplementationImpl implements TimingTriggeringEntityStartImplementation {
	/**
	 * The default value of the '{@link #getCyclePeriod() <em>Cycle Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CYCLE_PERIOD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCyclePeriod() <em>Cycle Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclePeriod()
	 * @generated
	 * @ordered
	 */
	protected Integer cyclePeriod = CYCLE_PERIOD_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_OFFSET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer startOffset = START_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingTriggeringEntityStartImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCyclePeriod() {
		return cyclePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclePeriod(Integer newCyclePeriod) {
		Integer oldCyclePeriod = cyclePeriod;
		cyclePeriod = newCyclePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD, oldCyclePeriod, cyclePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCycleOffset() {
		try {
			return (Integer)GET_CYCLE_OFFSET__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartOffset() {
		return startOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOffset(Integer newStartOffset) {
		Integer oldStartOffset = startOffset;
		startOffset = newStartOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET, oldStartOffset, startOffset));
	}

	/**
	 * The cached invocation delegate for the '{@link #getCycleOffset() <em>Get Cycle Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleOffset()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CYCLE_OFFSET__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET).getInvocationDelegate();
	/**
	 * The cached invocation delegate for the '{@link #requiresCycleAdjust() <em>Requires Cycle Adjust</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresCycleAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_CYCLE_ADJUST__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requiresCycleAdjust() {
		try {
			return (Boolean)REQUIRES_CYCLE_ADJUST__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #requiresStartOffsetAdjust() <em>Requires Start Offset Adjust</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #requiresStartOffsetAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRES_START_OFFSET_ADJUST__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean requiresStartOffsetAdjust() {
		try {
			return (Boolean)REQUIRES_START_OFFSET_ADJUST__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				return getCyclePeriod();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				return getStartOffset();
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
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				setCyclePeriod((Integer)newValue);
				return;
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				setStartOffset((Integer)newValue);
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
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				setCyclePeriod(CYCLE_PERIOD_EDEFAULT);
				return;
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				setStartOffset(START_OFFSET_EDEFAULT);
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
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__CYCLE_PERIOD:
				return CYCLE_PERIOD_EDEFAULT == null ? cyclePeriod != null : !CYCLE_PERIOD_EDEFAULT.equals(cyclePeriod);
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION__START_OFFSET:
				return START_OFFSET_EDEFAULT == null ? startOffset != null : !START_OFFSET_EDEFAULT.equals(startOffset);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___GET_CYCLE_OFFSET:
				return getCycleOffset();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_CYCLE_ADJUST:
				return requiresCycleAdjust();
			case InteractionPackage.TIMING_TRIGGERING_ENTITY_START_IMPLEMENTATION___REQUIRES_START_OFFSET_ADJUST:
				return requiresStartOffsetAdjust();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (cyclePeriod: ");
		result.append(cyclePeriod);
		result.append(", startOffset: ");
		result.append(startOffset);
		result.append(')');
		return result.toString();
	}

} //TimingTriggeringEntityStartImplementationImpl
