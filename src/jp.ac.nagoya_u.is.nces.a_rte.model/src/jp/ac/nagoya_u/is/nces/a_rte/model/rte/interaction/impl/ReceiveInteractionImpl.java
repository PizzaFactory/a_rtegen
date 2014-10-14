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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Receiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getSendInteraction <em>Send Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getValueBufferImplementation <em>Value Buffer Implementation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ReceiveInteractionImpl#getFilterBufferImplementation <em>Filter Buffer Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveInteractionImpl extends InteractionImpl implements ReceiveInteraction {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Receiver> receiver;

	/**
	 * The cached value of the '{@link #getSendInteraction() <em>Send Interaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<SendInteraction> sendInteraction;

	/**
	 * The cached value of the '{@link #getValueBufferImplementation() <em>Value Buffer Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBufferImplementation()
	 * @generated
	 * @ordered
	 */
	protected ValueBufferImplementation valueBufferImplementation;

	/**
	 * The cached value of the '{@link #getFilterBufferImplementation() <em>Filter Buffer Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterBufferImplementation()
	 * @generated
	 * @ordered
	 */
	protected FilterBufferImplementation filterBufferImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.RECEIVE_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receiver> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectWithInverseResolvingEList.ManyInverse<Receiver>(Receiver.class, this, InteractionPackage.RECEIVE_INTERACTION__RECEIVER, InteractionPackage.RECEIVER__RECEIVE_INTERACTION);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendInteraction> getSendInteraction() {
		if (sendInteraction == null) {
			sendInteraction = new EObjectWithInverseResolvingEList<SendInteraction>(SendInteraction.class, this, InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION, InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION);
		}
		return sendInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBufferImplementation getValueBufferImplementation() {
		return valueBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBufferImplementation(ValueBufferImplementation newValueBufferImplementation, NotificationChain msgs) {
		ValueBufferImplementation oldValueBufferImplementation = valueBufferImplementation;
		valueBufferImplementation = newValueBufferImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION, oldValueBufferImplementation, newValueBufferImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBufferImplementation(ValueBufferImplementation newValueBufferImplementation) {
		if (newValueBufferImplementation != valueBufferImplementation) {
			NotificationChain msgs = null;
			if (valueBufferImplementation != null)
				msgs = ((InternalEObject)valueBufferImplementation).eInverseRemove(this, InteractionPackage.VALUE_BUFFER_IMPLEMENTATION__PARENT, ValueBufferImplementation.class, msgs);
			if (newValueBufferImplementation != null)
				msgs = ((InternalEObject)newValueBufferImplementation).eInverseAdd(this, InteractionPackage.VALUE_BUFFER_IMPLEMENTATION__PARENT, ValueBufferImplementation.class, msgs);
			msgs = basicSetValueBufferImplementation(newValueBufferImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION, newValueBufferImplementation, newValueBufferImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterBufferImplementation getFilterBufferImplementation() {
		return filterBufferImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterBufferImplementation(FilterBufferImplementation newFilterBufferImplementation, NotificationChain msgs) {
		FilterBufferImplementation oldFilterBufferImplementation = filterBufferImplementation;
		filterBufferImplementation = newFilterBufferImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION, oldFilterBufferImplementation, newFilterBufferImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterBufferImplementation(FilterBufferImplementation newFilterBufferImplementation) {
		if (newFilterBufferImplementation != filterBufferImplementation) {
			NotificationChain msgs = null;
			if (filterBufferImplementation != null)
				msgs = ((InternalEObject)filterBufferImplementation).eInverseRemove(this, InteractionPackage.FILTER_BUFFER_IMPLEMENTATION__PARENT, FilterBufferImplementation.class, msgs);
			if (newFilterBufferImplementation != null)
				msgs = ((InternalEObject)newFilterBufferImplementation).eInverseAdd(this, InteractionPackage.FILTER_BUFFER_IMPLEMENTATION__PARENT, FilterBufferImplementation.class, msgs);
			msgs = basicSetFilterBufferImplementation(newFilterBufferImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION, newFilterBufferImplementation, newFilterBufferImplementation));
	}

	/**
	 * The cached invocation delegate for the '{@link #getInternalEcuReceivers() <em>Get Internal Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEcuReceivers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InternalEcuReceiver> getInternalEcuReceivers() {
		try {
			return (EList<InternalEcuReceiver>)GET_INTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getExternalEcuReceivers() <em>Get External Ecu Receivers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalEcuReceivers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EXTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExternalEcuReceiver> getExternalEcuReceivers() {
		try {
			return (EList<ExternalEcuReceiver>)GET_EXTERNAL_ECU_RECEIVERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #receivesInterCore() <em>Receives Inter Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #receivesInterCore()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RECEIVES_INTER_CORE__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_INTER_CORE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean receivesInterCore() {
		try {
			return (Boolean)RECEIVES_INTER_CORE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #receivesFromMultipleCores() <em>Receives From Multiple Cores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #receivesFromMultipleCores()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RECEIVES_FROM_MULTIPLE_CORES__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean receivesFromMultipleCores() {
		try {
			return (Boolean)RECEIVES_FROM_MULTIPLE_CORES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiver()).basicAdd(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSendInteraction()).basicAdd(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				if (valueBufferImplementation != null)
					msgs = ((InternalEObject)valueBufferImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION, null, msgs);
				return basicSetValueBufferImplementation((ValueBufferImplementation)otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				if (filterBufferImplementation != null)
					msgs = ((InternalEObject)filterBufferImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION, null, msgs);
				return basicSetFilterBufferImplementation((FilterBufferImplementation)otherEnd, msgs);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return ((InternalEList<?>)getSendInteraction()).basicRemove(otherEnd, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				return basicSetValueBufferImplementation(null, msgs);
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				return basicSetFilterBufferImplementation(null, msgs);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return getReceiver();
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return getSendInteraction();
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				return getValueBufferImplementation();
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				return getFilterBufferImplementation();
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends Receiver>)newValue);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				getSendInteraction().clear();
				getSendInteraction().addAll((Collection<? extends SendInteraction>)newValue);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				setValueBufferImplementation((ValueBufferImplementation)newValue);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				setFilterBufferImplementation((FilterBufferImplementation)newValue);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				getReceiver().clear();
				return;
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				getSendInteraction().clear();
				return;
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				setValueBufferImplementation((ValueBufferImplementation)null);
				return;
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				setFilterBufferImplementation((FilterBufferImplementation)null);
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
			case InteractionPackage.RECEIVE_INTERACTION__RECEIVER:
				return receiver != null && !receiver.isEmpty();
			case InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION:
				return sendInteraction != null && !sendInteraction.isEmpty();
			case InteractionPackage.RECEIVE_INTERACTION__VALUE_BUFFER_IMPLEMENTATION:
				return valueBufferImplementation != null;
			case InteractionPackage.RECEIVE_INTERACTION__FILTER_BUFFER_IMPLEMENTATION:
				return filterBufferImplementation != null;
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
			case InteractionPackage.RECEIVE_INTERACTION___GET_INTERNAL_ECU_RECEIVERS:
				return getInternalEcuReceivers();
			case InteractionPackage.RECEIVE_INTERACTION___GET_EXTERNAL_ECU_RECEIVERS:
				return getExternalEcuReceivers();
			case InteractionPackage.RECEIVE_INTERACTION___RECEIVES_INTER_CORE:
				return receivesInterCore();
			case InteractionPackage.RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES:
				return receivesFromMultipleCores();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceiveInteractionImpl
