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
package jp.ac.nagoya_u.is.nces.a_rte.model.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.internal.CollectionCondition;
import jp.ac.nagoya_u.is.nces.a_rte.model.internal.EObjectOperationValueCondition;
import jp.ac.nagoya_u.is.nces.a_rte.model.internal.EObjectStructuralFeatureValuesCondition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.query.conditions.Condition;
import org.eclipse.emf.query.conditions.Not;
import org.eclipse.emf.query.conditions.ObjectInstanceCondition;
import org.eclipse.emf.query.conditions.booleans.BooleanCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectInstanceCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.TypeRelation;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectReferenceValueCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectReferencerCondition;
import org.eclipse.emf.query.conditions.numbers.NumberCondition.IntegerValue;
import org.eclipse.emf.query.conditions.strings.StringValue;

/**
 * EMF�Υ��֥������Ȥθ��������󶡤��롥
 */
public class EObjectConditions { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)
	/**
	 * ������Ƚ��ξ����������롥 �ܾ��ϡ����֥������Ȥ�Ƚ���оݤη���Ʊ��η����⤷���Ϥ��η��Υ��֥��饹�Ǥ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eClass Ƚ���оݤη�
	 * @return ������Ƚ��ξ�
	 */
	public static EObjectCondition isKindOf(EClass eClass) {
		return new EObjectTypeRelationCondition(eClass, TypeRelation.SAMETYPE_OR_SUBTYPE_LITERAL);
	}

	/**
	 * ��ե���󥹤��Ͱ���Ƚ��ξ����������롥
	 * �ܾ��ϡ����֥������Ȥ�Ƚ���оݤΥ�ե���󥹤���������Υ�ե���󥹤λ����褬Ƚ���оݤΥ��֥������ȤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eReference Ƚ���оݤΥ�ե����
	 * @param value Ƚ���оݤΥ��֥�������
	 * @return ��ե���󥹤��Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition ref(EReference eReference, EObject value) {
		return new EObjectReferenceValueCondition(eReference, value == null ? EObjectInstanceCondition.IS_NULL : new EObjectInstanceCondition(value));
	}

	/**
	 * ��ե���󥹤�¸��Ƚ��ξ����������롥
	 * �ܾ��ϡ����֥������Ȥ�Ƚ���оݤΥ�ե���󥹤���������Υ�ե���󥹤ˤ�ꤤ���줫�Υ��֥������Ȥ򻲾Ȥ��Ƥ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eReference Ƚ���оݤΥ�ե����
	 * @return ��ե���󥹤��Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition refExists(EReference eReference) {
		Condition valueCondition = eReference.isMany() ? new Not(CollectionCondition.EMPTY) : new Not(EObjectInstanceCondition.IS_NULL); // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
		return new EObjectStructuralFeatureValuesCondition(eReference, valueCondition);
	}

	/**
	 * ��ե���󥹤ˤ�ꤢ�륪�֥������Ȥ򻲾Ȥ��Ƥ��뤫��Ƚ��ξ����������롥
	 * �ܾ��ϡ����֥������ȤΤ����줫�Υ�ե���󥹤λ����褬Ƚ���оݤΥ��֥������ȤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param value Ƚ���оݤΥ��֥�������
	 * @return ��ե���󥹤��Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition ref(EObject value) {
		return new EObjectReferencerCondition(value);
	}

	/**
	 * °�����Ͱ���Ƚ��ξ����������롥 �ܾ��ϡ����֥������Ȥ�Ƚ���оݤ�°�������������°�����ͤ�Ƚ���оݤ�ʸ�����ͤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eAttribute Ƚ���оݤ�°��
	 * @param value Ƚ���оݤ�ʸ������
	 * @return °�����Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition hasAttr(EAttribute eAttribute, String value) {
		return new EObjectStructuralFeatureValuesCondition(eAttribute, createStringValueCondition(value));
	}

	/**
	 * °�����Ͱ���Ƚ��ξ����������롥 �ܾ��ϡ����֥������Ȥ�Ƚ���оݤ�°�������������°�����ͤ�Ƚ���оݤ������ͤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eAttribute Ƚ���оݤ�°��
	 * @param value Ƚ���оݤ�������
	 * @return °�����Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition hasAttr(EAttribute eAttribute, Integer value) {
		return new EObjectStructuralFeatureValuesCondition(eAttribute, createIntegerValueCondition(value));
	}

	/**
	 * °�����Ͱ���Ƚ��ξ����������롥 �ܾ��ϡ����֥������Ȥ�Ƚ���оݤ�°�������������°�����ͤ�Ƚ���оݤ��ͤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eAttribute Ƚ���оݤ�°��
	 * @param value Ƚ���оݤ���
	 * @return °�����Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition hasAttr(EAttribute eAttribute, Object value) {
		return new EObjectStructuralFeatureValuesCondition(eAttribute, value == null ? ObjectInstanceCondition.IS_NULL : new ObjectInstanceCondition(value)); // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/**
	 * ���ڥ졼����������̤��Ͱ���Ƚ��ξ����������롥
	 * �ܾ��ϡ����֥������Ȥ�Ƚ���оݤΥ��ڥ졼��������������Υ��ڥ졼�����ν�����̤�Ƚ���оݤ������ͤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eOperation Ƚ��˻��Ѥ��륪�ڥ졼�����
	 * @param result Ƚ���оݤ�������
	 * @return ���ڥ졼����������̤��Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition hasOp(EOperation eOperation, Boolean result) {
		return hasOp(eOperation, createBooleanValueCondition(result), new Object[0]);
	}

	/**
	 * ���ڥ졼����������̤��Ͱ���Ƚ��ξ����������롥
	 * �ܾ��ϡ����֥������Ȥ�Ƚ���оݤΥ��ڥ졼��������������Υ��ڥ졼�����ν�����̤�Ƚ���оݤο��ͤȰ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eOperation Ƚ��˻��Ѥ��륪�ڥ졼�����
	 * @param result Ƚ���оݤο���
	 * @return ���ڥ졼����������̤��Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition hasOp(EOperation eOperation, Integer result) {
		return hasOp(eOperation, createIntegerValueCondition(result), new Object[0]);
	}

	/**
	 * ���ڥ졼����������̤��Ͱ���Ƚ��ξ����������롥
	 * �ܾ��ϡ����֥������Ȥ�Ƚ���оݤΥ��ڥ졼��������������Υ��ڥ졼�����ν�����̤�Ƚ���оݤ�ʸ����Ȱ��פ����硤����Ƚ�ꤹ�롥
	 * 
	 * @param eOperation Ƚ��˻��Ѥ��륪�ڥ졼�����
	 * @param result Ƚ���оݤ�ʸ����
	 * @return ���ڥ졼����������̤��Ͱ���Ƚ�ꡥ
	 */
	public static EObjectCondition hasOp(EOperation eOperation, String result) {
		return hasOp(eOperation, createStringValueCondition(result), new Object[0]);
	}

	private static EObjectCondition hasOp(EOperation eOperation, Condition valueCondition, Object... arguments) {
		return new EObjectOperationValueCondition(eOperation, arguments, valueCondition);
	}

	private static Condition createIntegerValueCondition(Integer value) {
		return value == null ? ObjectInstanceCondition.IS_NULL : new Not(ObjectInstanceCondition.IS_NULL).AND(new IntegerValue(value));
	}

	private static Condition createBooleanValueCondition(Boolean value) {
		return value == null ? ObjectInstanceCondition.IS_NULL : new BooleanCondition(value); // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	private static Condition createStringValueCondition(String value) {
		return value == null ? ObjectInstanceCondition.IS_NULL : new Not(ObjectInstanceCondition.IS_NULL).AND(new StringValue(value)); // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}
}
