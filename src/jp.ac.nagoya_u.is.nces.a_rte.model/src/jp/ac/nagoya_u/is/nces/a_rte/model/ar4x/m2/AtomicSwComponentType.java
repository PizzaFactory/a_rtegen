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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Sw Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getAtomicSwComponentType()
 * @model abstract="true"
 * @generated
 */
public interface AtomicSwComponentType extends SwComponentType {

	/**
	 * Returns the value of the '<em><b>Internal Behavior</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Behavior</em>' containment reference.
	 * @see #setInternalBehavior(SwcInternalBehavior)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getAtomicSwComponentType_InternalBehavior()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="tags xml.roleWrapperElement='true'"
	 * @generated
	 */
	SwcInternalBehavior getInternalBehavior();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Behavior</em>' containment reference.
	 * @see #getInternalBehavior()
	 * @generated
	 */
	void setInternalBehavior(SwcInternalBehavior value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���Ѥ��Ƥ��륢�ץꥱ�������ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getUsingDataTypes()\n\t\t\t\t\t->select(oclIsKindOf(ApplicationDataType)).oclAsType(ApplicationDataType)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ApplicationDataType> getUsingApplicationDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���Ѥ��Ƥ��륢�ץꥱ�������ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getUsingDataTypes()\n\t\t\t\t\t->collect(t | getImplementationDataType(t))\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ImplementationDataType> getUsingImplementationDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���Ѥ��Ƥ���AUTOSAR�ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let internalUsingDataTypes : Set(AutosarDataType) = if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen Set{}\n\t\t\t\t\telse self.internalBehavior.getUsingDataTypes()\n\t\t\t\t\tendif\n\t\t\t\tin getRPorts().getUsingDataTypes()\n\t\t\t\t\t->union(getPPorts().getUsingDataTypes())\n\t\t\t\t\t->union(internalUsingDataTypes)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<AutosarDataType> getUsingDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �����ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model required="true" dataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse self.internalBehavior.getImplementationDataType(dataType)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType(AutosarDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" applicationDataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.internalBehavior.oclIsUndefined()\n\t\t\t\t\tthen Set{}\n\t\t\t\t\telse self.internalBehavior.getImplementationDataTypes(applicationDataType)\n\t\t\t\t\tendif'"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes(ApplicationDataType applicationDataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getRPorts().requiredInterface\n\t\t\t\t\t->union(getPPorts().providedInterface)\n\t\t\t\t\t->select(oclIsKindOf(ClientServerInterface)).oclAsType(ClientServerInterface)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<ClientServerInterface> getUsingClientServerInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.port\n\t\t\t\t\t->select(oclIsKindOf(RPortPrototype)).oclAsType(RPortPrototype)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<RPortPrototype> getRPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.port\n\t\t\t\t\t->select(oclIsKindOf(PPortPrototype)).oclAsType(PPortPrototype)\n\t\t\t\t\t->asOrderedSet()'"
	 * @generated
	 */
	EList<PPortPrototype> getPPorts();
} // AtomicSwComponentType
