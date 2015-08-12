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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getSender <em>Sender</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction <em>Receive Interaction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction()
 * @model
 * @generated
 */
public interface SendInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getSendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction_Sender()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender#getSendInteraction
	 * @model opposite="sendInteraction"
	 * @generated
	 */
	EList<Sender> getSender();

	/**
	 * Returns the value of the '<em><b>Receive Interaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction <em>Send Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Interaction</em>' reference.
	 * @see #setReceiveInteraction(ReceiveInteraction)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction_ReceiveInteraction()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction#getSendInteraction
	 * @model opposite="sendInteraction" required="true"
	 * @generated
	 */
	ReceiveInteraction getReceiveInteraction();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getReceiveInteraction <em>Receive Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Interaction</em>' reference.
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	void setReceiveInteraction(ReceiveInteraction value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(SendImplementation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage#getSendInteraction_Implementation()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendImplementation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	SendImplementation getImplementation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(SendImplementation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sender\n\t\t\t\t\t->select(oclIsKindOf(interaction::InternalEcuSender)).oclAsType(interaction::InternalEcuSender)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<InternalEcuSender> getInternalEcuSenders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.sender\n\t\t\t\t\t->select(oclIsKindOf(interaction::ExternalEcuSender)).oclAsType(interaction::ExternalEcuSender)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ExternalEcuSender> getExternalEcuSenders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let senderCores : Set(m2::Integer) = self.sender.getOwnerCore()->asOrderedSet(),\n\t\t\t\t\t\treceiverCores : Set(m2::Integer) = self.receiveInteraction.receiver.getOwnerCore()->asOrderedSet()\n\t\t\t\tin senderCores->symmetricDifference(receiverCores)->notEmpty()'"
	 * @generated
	 */
	boolean isInterCore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let senderPartitions : Set(ecuc::EcucPartition) = self.sender.ownerPartition->asOrderedSet(),\n\t\t\t\t\t\treceiverPartitions : Set(ecuc::EcucPartition) = self.receiveInteraction.receiver.ownerPartition->asOrderedSet()\n\t\t\t\tin senderPartitions->symmetricDifference(receiverPartitions)->notEmpty()'"
	 * @generated
	 */
	boolean isInterPartition();

} // SendInteraction
