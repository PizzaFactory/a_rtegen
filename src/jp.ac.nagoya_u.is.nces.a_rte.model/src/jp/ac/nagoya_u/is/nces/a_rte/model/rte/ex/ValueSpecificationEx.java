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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage#getValueSpecificationEx()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ValueSpecificationEx extends ExtendedEObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if this_.oclIsKindOf(m2::ConstantReference)\n\t\t\t\t\t\tthen this_.oclAsType(m2::ConstantReference).getEndValueSpec()\n\t\t\t\t\telse this_\n\t\t\t\t\tendif'"
	 * @generated
	 */
	ValueSpecification getEndValueSpec(ValueSpecification this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ����ͤ�ʸ�������
	 * <!-- end-model-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.String" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let endValueSpec : m2::ValueSpecification = getEndValueSpec(this_)\n\t\t\t\tin if endValueSpec.oclIsKindOf(ar4x::m2::NumericalValueSpecification)\n\t\t\t\t\t\tthen endValueSpec.oclAsType(ar4x::m2::NumericalValueSpecification).value.toString()\n\t\t\t\t\telse if endValueSpec.oclIsKindOf(ar4x::m2::TextValueSpecification)\n\t\t\t\t\t\tthen endValueSpec.oclAsType(ar4x::m2::TextValueSpecification).value\n\t\t\t\t\telse null\n\t\t\t\t\tendif endif'"
	 * @generated
	 */
	String getValueSpecAsText(ValueSpecification this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" this_Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(this_)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::NumericalValueSpecification) or end.oclIsKindOf(ar4x::m2::TextValueSpecification)'"
	 * @generated
	 */
	Boolean isForVALUE(ValueSpecification this_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::ArrayValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::ArrayValueSpecification).element->size() = type.subElement->first().arraySize\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::ArrayValueSpecification).element->forAll(v | isForVALUE(v))'"
	 * @generated
	 */
	Boolean isForARRAY(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::RecordValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->size() = type.subElement->size()\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->forAll(v | isForVALUE(v))'"
	 * @generated
	 */
	Boolean isForSTRUCTURE(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::RecordValueSpecification)\n\t\t\t\tand\n\t\t\t\tend.oclAsType(ar4x::m2::RecordValueSpecification).field->size() = 1\n\t\t\t\tand\n\t\t\t\tisForVALUE(end.oclAsType(ar4x::m2::RecordValueSpecification).field->first())'"
	 * @generated
	 */
	Boolean isForUNION(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet end : ar4x::m2::ValueSpecification = getEndValueSpec(value)\n\t\t\t\tin\n\t\t\t\tend.oclIsKindOf(ar4x::m2::NumericalValueSpecification)'"
	 * @generated
	 */
	Boolean isForDATA_REFERENCE(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" valueRequired="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif type.category = \'VALUE\' then\n\t\t\t\t\tisForVALUE(value)\n\t\t\t\telse if type.category = \'ARRAY\' then\n\t\t\t\t\tisForARRAY(value, type)\n\t\t\t\telse if type.category = \'STRUCTURE\' then\n\t\t\t\t\tisForSTRUCTURE(value, type)\n\t\t\t\telse if type.category = \'UNION\' then\n\t\t\t\t\tisForUNION(value, type)\n\t\t\t\telse if type.category = \'DATA_REFERENCE\' then\n\t\t\t\t\tisForDATA_REFERENCE(value)\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif endif endif endif endif'"
	 * @generated
	 */
	Boolean isValidValue(ValueSpecification value, ImplementationDataType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Boolean" required="true" v1Required="true" v2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet endV1 : ar4x::m2::ValueSpecification = getEndValueSpec(v1),\n\t\t\t\t\tendV2 : ar4x::m2::ValueSpecification = getEndValueSpec(v2)\n\t\t\t\tin\n\t\t\t\tif endV1.oclIsTypeOf(ar4x::m2::ArrayValueSpecification) then\n\t\t\t\t\tlet arrayV1 : ar4x::m2::ArrayValueSpecification = endV1.oclAsType(ar4x::m2::ArrayValueSpecification),\n\t\t\t\t\t\tarrayV2 : ar4x::m2::ArrayValueSpecification = endV2.oclAsType(ar4x::m2::ArrayValueSpecification)\n\t\t\t\t\tin\n\t\t\t\t\tif arrayV1.element->size() <> arrayV2.element->size() then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tSequence{1..(arrayV1.element->size())}->iterate(i : Integer;\n\t\t\t\t\t\t\tflag : Boolean = true | flag and equalsInitValue(arrayV1.element->at(i), arrayV2.element->at(i)))\n\t\t\t\t\tendif\n\t\t\t\telse if endV1.oclIsTypeOf(ar4x::m2::RecordValueSpecification) then\n\t\t\t\t\tlet recV1 : ar4x::m2::RecordValueSpecification = endV1.oclAsType(ar4x::m2::RecordValueSpecification),\n\t\t\t\t\t\trecV2 : ar4x::m2::RecordValueSpecification = endV2.oclAsType(ar4x::m2::RecordValueSpecification)\n\t\t\t\t\tin\n\t\t\t\t\tif recV1.field->size() <> recV2.field->size() then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tSequence{1..(recV1.field->size())}->iterate(i : Integer;\n\t\t\t\t\t\t\tflag : Boolean = true | flag and equalsInitValue(recV1.field->at(i), recV2.field->at(i)))\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tgetValueSpecAsText(endV1) = getValueSpecAsText(endV2)\n\t\t\t\tendif endif'"
	 * @generated
	 */
	Boolean equalsInitValue(ValueSpecification v1, ValueSpecification v2);

} // ValueSpecificationEx
