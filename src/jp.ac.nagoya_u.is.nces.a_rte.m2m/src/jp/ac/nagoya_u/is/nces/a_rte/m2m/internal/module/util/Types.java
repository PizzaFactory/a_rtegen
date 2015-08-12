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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

public class Types { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)

	public static SignednessEnum getSignedness(ImplementationDataType sourceDataType) {
		if (SwBaseType.BASE_TYPE_ENCODING_NONE.equals(sourceDataType.getBaseType().getBaseTypeEncoding())) {
			return SignednessEnum.UNSIGNED;

		} else if (SwBaseType.BASE_TYPE_ENCODING_BOOLEAN.equals(sourceDataType.getBaseType().getBaseTypeEncoding())) {
			return SignednessEnum.UNSIGNED;

		} else {
			// ����ʳ��Υ��󥳡��ǥ��󥰤���椢���ǧ��
			return SignednessEnum.SIGNED;
		}
	}

	public static SignednessEnum getSignedness(ImplementationDataTypeElement sourceDataType) {
		if (SwBaseType.BASE_TYPE_ENCODING_NONE.equals(sourceDataType.getSwDataDefProps().getBaseType().getBaseTypeEncoding())) {
			return SignednessEnum.UNSIGNED;

		} else if (SwBaseType.BASE_TYPE_ENCODING_BOOLEAN.equals(sourceDataType.getSwDataDefProps().getBaseType().getBaseTypeEncoding())) {
			return SignednessEnum.UNSIGNED;

		} else {
			// ����ʳ��Υ��󥳡��ǥ��󥰤���椢���ǧ��
			return SignednessEnum.SIGNED;
		}
	}

	/**
	 * ���ȥߥå��˥��������Ǥ���{@link Type}�Ǥ��뤫��Ƚ�ꤷ�ޤ���
	 * @param type Ƚ���оݤ�{@link Type}
	 * @return ���ȥߥå��˥��������Ǥ���{@link Type}�Ǥ����硢true������ʳ��ξ�硢false��
	 */
	public static boolean isAtomicType(Type type) {
		Type leafType;
		if (type instanceof RedefinitionType) {
			leafType = ((RedefinitionType) type).getLeafType();
		} else {
			leafType = type;
		}

		return (leafType instanceof PrimitiveType && !isDestOfFloat64ImplementationDataType(leafType)) || leafType instanceof PointerType;
	}

	/**
	 * float64��{@link ImplementationDataType}�����������줿{@link Type}�Ǥ��뤫��Ƚ�ꤹ�롣
	 * @param destType Ƚ���оݤ�{@link Type}
	 * @return float64��{@link ImplementationDataType}�����������줿{@link Type}�Ǥ����硢true������ʳ��ξ�硢false��
	 */
	private static boolean isDestOfFloat64ImplementationDataType(Type destType) {
		if (!(destType.getSingleSource() instanceof ImplementationDataType)) {	// COVERAGE ���true(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			return false;
		}

		ImplementationDataType sourceImplDataType = (ImplementationDataType) destType.getSingleSource();

		if (!(destType instanceof PrimitiveType)) {	// COVERAGE ���true(�ƤӽФ����ǻ��������å����Ƥ��뤿�ᡤ̤���Х�å�������ʤ�)
			return false;
		}

		return SwBaseType.BASE_TYPE_ENCODING_IEEE754.equals(sourceImplDataType.getBaseType().getBaseTypeEncoding()) && destType.getSize() == 64;
	}
}
