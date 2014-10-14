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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl#getReceiveInteraction <em>Receive Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.SendInteractionImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendInteractionImpl extends InteractionImpl implements SendInteraction {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected EList<Sender> sender;

	/**
	 * The cached value of the '{@link #getReceiveInteraction() <em>Receive Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveInteraction()
	 * @generated
	 * @ordered
	 */
	protected ReceiveInteraction receiveInteraction;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected SendImplementation implementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.SEND_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sender> getSender() {
		if (sender == null) {
			sender = new EObjectWithInverseResolvingEList.ManyInverse<Sender>(Sender.class, this, InteractionPackage.SEND_INTERACTION__SENDER, InteractionPackage.SENDER__SEND_INTERACTION);
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteraction getReceiveInteraction() {
		if (receiveInteraction != null && ((EObject)receiveInteraction).eIsProxy()) {
			InternalEObject oldReceiveInteraction = (InternalEObject)receiveInteraction;
			receiveInteraction = (ReceiveInteraction)eResolveProxy(oldReceiveInteraction);
			if (receiveInteraction != oldReceiveInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION, oldReceiveInteraction, receiveInteraction));
			}
		}
		return receiveInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteraction basicGetReceiveInteraction() {
		return receiveInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveInteraction(ReceiveInteraction newReceiveInteraction, NotificationChain msgs) {
		ReceiveInteraction oldReceiveInteraction = receiveInteraction;
		receiveInteraction = newReceiveInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION, oldReceiveInteraction, newReceiveInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveInteraction(ReceiveInteraction newReceiveInteraction) {
		if (newReceiveInteraction != receiveInteraction) {
			NotificationChain msgs = null;
			if (receiveInteraction != null)
				msgs = ((InternalEObject)receiveInteraction).eInverseRemove(this, InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION, ReceiveInteraction.class, msgs);
			if (newReceiveInteraction != null)
				msgs = ((InternalEObject)newReceiveInteraction).eInverseAdd(this, InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION, ReceiveInteraction.class, msgs);
			msgs = basicSetReceiveInteraction(newReceiveInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION, newReceiveInteraction, newReceiveInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(SendImplementation newImplementation, NotificationChain msgs) {
		SendImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.SEND_INTERACTION__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(SendImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, InteractionPackage.SEND_IMPLEMENTATION__PARENT, SendImplementation.class, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, InteractionPackage.SEND_IMPLEMENTATION__PARENT, SendImplementation.class, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SEND_INTERACTION__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * The cached invocation delegate for the '{@link #getInternalEcuSenders() <em>Get Internal Ecu Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEcuSenders()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INTERNAL_ECU_SENDERS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.SEND_INTERACTION___GET_INTERNAL_ECU_SENDERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InternalEcuSender> getInternalEcuSenders() {
		try {
			return (EList<InternalEcuSender>)GET_INTERNAL_ECU_SENDERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getExternalEcuSenders() <em>Get External Ecu Senders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalEcuSenders()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EXTERNAL_ECU_SENDERS__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.SEND_INTERACTION___GET_EXTERNAL_ECU_SENDERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExternalEcuSender> getExternalEcuSenders() {
		try {
			return (EList<ExternalEcuSender>)GET_EXTERNAL_ECU_SENDERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInterCore() <em>Is Inter Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterCore()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INTER_CORE__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_CORE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInterCore() {
		try {
			return (Boolean)IS_INTER_CORE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInterPartition() <em>Is Inter Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterPartition()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INTER_PARTITION__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInterPartition() {
		try {
			return (Boolean)IS_INTER_PARTITION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case InteractionPackage.SEND_INTERACTION__SENDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSender()).basicAdd(otherEnd, msgs);
			case InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION:
				if (receiveInteraction != null)
					msgs = ((InternalEObject)receiveInteraction).eInverseRemove(this, InteractionPackage.RECEIVE_INTERACTION__SEND_INTERACTION, ReceiveInteraction.class, msgs);
				return basicSetReceiveInteraction((ReceiveInteraction)otherEnd, msgs);
			case InteractionPackage.SEND_INTERACTION__IMPLEMENTATION:
				if (implementation != null)
					msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionPackage.SEND_INTERACTION__IMPLEMENTATION, null, msgs);
				return basicSetImplementation((SendImplementation)otherEnd, msgs);
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
			case InteractionPackage.SEND_INTERACTION__SENDER:
				return ((InternalEList<?>)getSender()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION:
				return basicSetReceiveInteraction(null, msgs);
			case InteractionPackage.SEND_INTERACTION__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
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
			case InteractionPackage.SEND_INTERACTION__SENDER:
				return getSender();
			case InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION:
				if (resolve) return getReceiveInteraction();
				return basicGetReceiveInteraction();
			case InteractionPackage.SEND_INTERACTION__IMPLEMENTATION:
				return getImplementation();
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
			case InteractionPackage.SEND_INTERACTION__SENDER:
				getSender().clear();
				getSender().addAll((Collection<? extends Sender>)newValue);
				return;
			case InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION:
				setReceiveInteraction((ReceiveInteraction)newValue);
				return;
			case InteractionPackage.SEND_INTERACTION__IMPLEMENTATION:
				setImplementation((SendImplementation)newValue);
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
			case InteractionPackage.SEND_INTERACTION__SENDER:
				getSender().clear();
				return;
			case InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION:
				setReceiveInteraction((ReceiveInteraction)null);
				return;
			case InteractionPackage.SEND_INTERACTION__IMPLEMENTATION:
				setImplementation((SendImplementation)null);
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
			case InteractionPackage.SEND_INTERACTION__SENDER:
				return sender != null && !sender.isEmpty();
			case InteractionPackage.SEND_INTERACTION__RECEIVE_INTERACTION:
				return receiveInteraction != null;
			case InteractionPackage.SEND_INTERACTION__IMPLEMENTATION:
				return implementation != null;
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
			case InteractionPackage.SEND_INTERACTION___GET_INTERNAL_ECU_SENDERS:
				return getInternalEcuSenders();
			case InteractionPackage.SEND_INTERACTION___GET_EXTERNAL_ECU_SENDERS:
				return getExternalEcuSenders();
			case InteractionPackage.SEND_INTERACTION___IS_INTER_CORE:
				return isInterCore();
			case InteractionPackage.SEND_INTERACTION___IS_INTER_PARTITION:
				return isInterPartition();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SendInteractionImpl
