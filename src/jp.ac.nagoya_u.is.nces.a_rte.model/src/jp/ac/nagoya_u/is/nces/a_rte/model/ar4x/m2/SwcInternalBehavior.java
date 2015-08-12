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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swc Internal Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getEvent <em>Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getPortApiOption <em>Port Api Option</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getIncludedDataTypeSet <em>Included Data Type Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getExplicitInterRunnableVariable <em>Explicit Inter Runnable Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior()
 * @model
 * @generated
 */
public interface SwcInternalBehavior extends Identifiable, InternalBehavior {
	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_Runnable()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<RunnableEntity> getRunnable();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteEvent> getEvent();

	/**
	 * Returns the value of the '<em><b>Port Api Option</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Api Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Api Option</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_PortApiOption()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortApiOption> getPortApiOption();

	/**
	 * Returns the value of the '<em><b>Included Data Type Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Data Type Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Data Type Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_IncludedDataTypeSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludedDataTypeSet> getIncludedDataTypeSet();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior <em>Internal Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AtomicSwComponentType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType#getInternalBehavior
	 * @model opposite="internalBehavior" required="true" transient="false" derived="true"
	 * @generated
	 */
	AtomicSwComponentType getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AtomicSwComponentType value);

	/**
	 * Returns the value of the '<em><b>Explicit Inter Runnable Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Inter Runnable Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Inter Runnable Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package#getSwcInternalBehavior_ExplicitInterRunnableVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDataPrototype> getExplicitInterRunnableVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���ץꥱ�������ǡ������򻲾Ȥ���IncludedDataTypeSet�μ���
	 * <!-- end-model-doc -->
	 * @model ordered="false" dataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.includedDataTypeSet\n\t\t\t\t\t->select(i | i.dataType->includes(dataType))'"
	 * @generated
	 */
	EList<IncludedDataTypeSet> getReferencerIncludedDataTypeSets(ApplicationDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �����ǡ������򻲾Ȥ���IncludedDataTypeSet�μ���
	 * <!-- end-model-doc -->
	 * @model ordered="false" dataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.includedDataTypeSet\n\t\t\t\t\t->select(i | i.dataType\n\t\t\t\t\t\t->collect(t | getImplementationDataType(t))\n\t\t\t\t\t\t->includes(dataType))'"
	 * @generated
	 */
	EList<IncludedDataTypeSet> getReferencerIncludedDataTypeSets(ImplementationDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���Ѥ��Ƥ���AUTOSAR�ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.includedDataTypeSet.dataType->asOrderedSet()'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if dataType.oclIsKindOf(ImplementationDataType)\n\t\t\t\t\tthen dataType.oclAsType(ImplementationDataType)\n\t\t\t\t\telse self.getImplementationDataType(dataType.oclAsType(ApplicationDataType))\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType(AutosarDataType dataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" applicationDataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implDataType : ImplementationDataType = getImplementationDataTypes(applicationDataType)->any(true)\n\t\t\t\tin if implDataType.oclIsUndefined()\n\t\t\t\t\tthen null\n\t\t\t\t\telse implDataType\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType(ApplicationDataType applicationDataType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" applicationDataTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.dataTypeMapping.dataTypeMap->select(m | m.applicationDataType = applicationDataType).implementationDataType->asOrderedSet()'"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes(ApplicationDataType applicationDataType);

} // SwcInternalBehavior
