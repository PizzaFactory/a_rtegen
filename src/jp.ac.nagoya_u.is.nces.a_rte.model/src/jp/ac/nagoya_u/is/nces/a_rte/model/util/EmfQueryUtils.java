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

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * EMF�Υ��֥������Ȥθ�����Ԥ���
 */
public class EmfQueryUtils { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public static <T extends EObject> T findSingle(EObject eObject, EObjectCondition eCondition) throws ModelException {
		return getSingleObject(find(Collections.singletonList(eObject), eCondition)); // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eResource �����оݤΥ꥽����
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥�������
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public static <T extends EObject> T findSingle(Resource eResource, EObjectCondition eCondition) throws ModelException {
		return getSingleObject(find(eResource, eCondition));
	}

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȡ�
	 */
	public static <T extends EObject> Optional<T> tryFindSingle(EObject eObject, EObjectCondition eCondition) {
		return getOptionalSingleObject(find(eObject, eCondition));
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eResource �����оݤΥ꥽����
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȡ�
	 */
	public static <T extends EObject> Optional<T> tryFindSingle(Resource eResource, EObjectCondition eCondition) {
		return getOptionalSingleObject(find(eResource, eCondition));
	}

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ʣ���Υ��֥������Ȥ򸡺����롥
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 */
	public static <T extends EObject> List<T> find(EObject eObject, EObjectCondition eCondition) {
		return find(Collections.singletonList(eObject), eCondition);
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ʣ���Υ��֥������Ȥ򸡺����롥
	 * 
	 * @param eResource �����оݤΥ꥽����
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 */
	public static <T extends EObject> List<T> find(Resource eResource, EObjectCondition eCondition) {
		return find(eResource.getContents(), eCondition);
	}

	private static <T extends EObject> List<T> find(List<EObject> eObjects, EObjectCondition eCondition) {
		IQueryResult result = new SELECT(new FROM(eObjects), new WHERE(eCondition)).execute();
		return convertToList(result);
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥˡ��������ɾ����̤����Ȥʤ륪�֥������Ȥ�¸�ߤ��뤫��Ƚ�ꤹ�롥
	 * 
	 * @param eObjects Ƚ���оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return���������ɾ����̤����Ȥʤ륪�֥������Ȥ�¸�ߤ����硤true������ʳ��ξ�硤false��
	 */
	public static boolean exists(List<? extends EObject> eObjects, EObjectCondition eCondition) {
		return !select(eObjects, eCondition).isEmpty();
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤�������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return ���򤵤줿���֥������ȡ�
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public static <F extends EObject, T extends F> T selectSingle(Collection<F> eObjects, EObjectCondition eCondition) throws ModelException {
		return getSingleObject(select(eObjects, eCondition));
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤�������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return ���򤵤줿���֥������ȡ�
	 */
	public static <F extends EObject, T extends F> Optional<T> trySelectSingle(Collection<F> eObjects, EObjectCondition eCondition) {
		return getOptionalSingleObject(select(eObjects, eCondition));
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤�������ɾ����̤����Ȥʤ�ʣ���Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return ���򤵤줿���֥������ȤΥꥹ�ȡ�
	 */
	public static <F extends EObject, T extends F> List<T> select(Collection<F> eObjects, final EObjectCondition eCondition) {
		Collection<F> result = Collections2.filter(eObjects, new Predicate<F>() {
			@Override
			public boolean apply(F input) {
				return eCondition.isSatisfied(input);
			}
		});
		return convertToList(result);
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> List<T> convertToList(Collection<?> result) {
		return Lists.newArrayList((Collection<T>) result);
	}

	@SuppressWarnings("unchecked")
	private static <T> T getSingleObject(Collection<?> result) throws ModelException {
		if (result.isEmpty()) // COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("�������������֥������Ȥ����Ĥ���ޤ���Ǥ���"); // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)

		return (T) result.iterator().next();
	}

	@SuppressWarnings("unchecked")
	private static <T> Optional<T> getOptionalSingleObject(Collection<?> result) {
		return result.isEmpty() ? Optional.<T> absent() : Optional.of((T) result.iterator().next());
	}

	@SuppressWarnings("unchecked")
	public static <T extends EObject> T findByID(Resource eResource, String id) throws ModelException {
		EObject eObject = eResource.getEObject(id);
		if (eObject == null) { // COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("�������������֥������Ȥ����Ĥ���ޤ���Ǥ���");
		}
		return (T) eObject;
	}
}
