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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Instance In Swc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getContextPort <em>Context Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc()
 * @model abstract="true"
 * @generated
 */
public interface VariableDataInstanceInSwc extends VariableDataInstance {
	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(VariableDataPrototype)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc_Prototype()
	 * @model required="true"
	 * @generated
	 */
	VariableDataPrototype getPrototype();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(VariableDataPrototype value);

	/**
	 * Returns the value of the '<em><b>Context Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Port</em>' reference.
	 * @see #setContextPort(PortPrototype)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc_ContextPort()
	 * @model required="true"
	 * @generated
	 */
	PortPrototype getContextPort();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc#getContextPort <em>Context Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Port</em>' reference.
	 * @see #getContextPort()
	 * @generated
	 */
	void setContextPort(PortPrototype value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage#getVariableDataInstanceInSwc_Instance()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition#getPrototype
	 * @model opposite="prototype" derived="true"
	 * @generated
	 */
	EList<VariableDataInstanceInComposition> getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Identifier" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.prototype.shortName'"
	 * @generated
	 */
	String getTargetShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���٥�ȥ��ޥ�ƥ��������ɤ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='getSwImplPolicy() = m2::SwImplPolicyEnum::queued'"
	 * @generated
	 */
	Boolean isEventSemantics();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���եȥ��������������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not applType.getSwImplPolicy().oclIsUndefined() and applType.getSwImplPolicy() <> m2::SwImplPolicyEnum::unspecified\n\t\t\t\t\t\tthen applType.getSwImplPolicy()\n\t\t\t\t\telse if not implType.getSwImplPolicy().oclIsUndefined() and implType.getSwImplPolicy() <> m2::SwImplPolicyEnum::unspecified\n\t\t\t\t\t\tthen implType.getSwImplPolicy()\n\t\t\t\t\telse self.prototype.getSwImplPolicy()\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	SwImplPolicyEnum getSwImplPolicy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �١������ν���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not implType.baseType.oclIsUndefined()\n\t\t\t\t\t\tthen implType.baseType\n\t\t\t\t\telse null\n\t\t\t\t\tendif'"
	 * @generated
	 */
	SwBaseType getBaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ̵���ͤμ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not applType.invalidValue.oclIsUndefined()\n\t\t\t\t\t\tthen applType.invalidValue\n\t\t\t\t\telse if not implType.invalidValue.oclIsUndefined()\n\t\t\t\t\t\tthen implType.invalidValue\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	ValueSpecification getInvalidValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���ɥ�å��������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType() , applType : m2::ApplicationDataType\n\t\t\t\t\t= getApplicationDataType()\n\t\t\t\tin if not self.prototype.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen self.prototype.swAddrMethod\n\t\t\t\t\telse if not implType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAddrMethod\n\t\t\t\t\telse if not applType.swAddrMethod.oclIsUndefined()\n\t\t\t\t\t\tthen applType.swAddrMethod\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif endif'"
	 * @generated
	 */
	SwAddrMethod getSwAddrMethod();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���饤����Ȥμ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AlignmentType" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let implType : m2::ImplementationDataType = getImplementationDataType()\n\t\t\t\tin if not self.prototype.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen self.prototype.swAlignment\n\t\t\t\t\telse if not implType.swAlignment.oclIsUndefined()\n\t\t\t\t\t\tthen implType.swAlignment\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	String getSwAlignment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���ץꥱ�������ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.prototype.type.oclIsKindOf(m2::ApplicationDataType)\n\t\t\t\t\tthen self.prototype.type.oclAsType(m2::ApplicationDataType)\n\t\t\t\t\telse null\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ApplicationDataType getApplicationDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * �����ǡ������μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.prototype.type.oclIsKindOf(m2::ImplementationDataType)\n\t\t\t\t\tthen self.prototype.type.oclAsType(m2::ImplementationDataType)\n\t\t\t\t\telse\n\t\t\t\t\t\tgetOwnerAtomicSwc().getImplementationDataType(self.prototype.type.oclAsType(m2::ApplicationPrimitiveDataType))\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ���ȥߥå�SW-C�μ���
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.contextPort.parent.oclAsType(m2::AtomicSwComponentType)'"
	 * @generated
	 */
	AtomicSwComponentType getOwnerAtomicSwc();

} // VariableDataInstanceInSwc
