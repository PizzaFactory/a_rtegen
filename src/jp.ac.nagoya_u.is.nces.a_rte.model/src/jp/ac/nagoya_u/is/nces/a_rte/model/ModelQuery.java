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
package jp.ac.nagoya_u.is.nces.a_rte.model;

import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfQueryUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimaps;

public class ModelQuery {

	private final Resource eResource;

	/**
	 * @param eResource �����оݤΥ꥽����
	 */
	public ModelQuery(Resource eResource) {
		this.eResource = eResource;
	}

	/**
	 * EObject���Ф�����ĥ���ڥ졼������¹Ԥ�����̤�������롥
	 * 
	 * @param eObject ��ĥ���ڥ졼�����μ¹��оݤΥ��֥�������
	 * @param eOperation ��ĥ���ڥ졼�����
	 * @return ��ĥ���ڥ졼�����μ¹Է�̤��֤���.
	 * @throws ModelException ��ĥ���ڥ졼�����μ¹Ԥ˼��Ԥ������
	 */
	public <T> T get(EObject eObject, EOperation eOperation) throws ModelException {
		return EmfUtils.exInvoke(eObject, eOperation);
	}

	/**
	 * EObject���Ф�����ĥ���ڥ졼������¹Ԥ�����̤�������롥
	 * 
	 * @param eObject ��ĥ���ڥ졼�����μ¹��оݤΥ��֥�������
	 * @param eOperation ��ĥ���ڥ졼�����
	 * @param arguments ��ĥ���ڥ졼�������Ϥ�����������
	 * @return ��ĥ���ڥ졼�����μ¹Է�̤��֤���.
	 * @throws ModelException ��ĥ���ڥ졼�����μ¹Ԥ˼��Ԥ������
	 */
	public <T> T get(EObject eObject, EOperation eOperation, Object... arguments) throws ModelException {
		return EmfUtils.exInvoke(eObject, eOperation, arguments);
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤���ΰ��פ���ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eClass �����оݤη�
	 * @return ���Ĥ��ä����֥������ȡ�
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public <T extends EObject> T findSingleByKind(EClass eClass) throws ModelException {
		return EmfQueryUtils.findSingle(this.eResource, isKindOf(eClass));
	}

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȡ�
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public <T extends EObject> T findSingle(EObject eObject, EObjectCondition eCondition) throws ModelException {
		return EmfQueryUtils.findSingle(eObject, eCondition); // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȡ�
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public <T extends EObject> T findSingle(EObjectCondition eCondition) throws ModelException {
		return EmfQueryUtils.findSingle(this.eResource, eCondition);
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤���ΰ��פ���ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eClass �����оݤη�
	 * @return ���Ĥ��ä����֥������ȡ�
	 */
	public <T extends EObject> Optional<T> tryFindSingleByKind(EClass eClass) {
		return EmfQueryUtils.tryFindSingle(this.eResource, isKindOf(eClass));
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȡ�
	 */
	public <T extends EObject> Optional<T> tryFindSingle(EObjectCondition eCondition) {
		return EmfQueryUtils.tryFindSingle(this.eResource, eCondition);
	}

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ򸡺����롥
	 * ʣ���Υ��֥������Ȥ����Ĥ��ä���硤��Ƭ�Υ��֥������ȤΤߤ��֤���
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȡ�
	 */
	public <T extends EObject> Optional<T> tryFindSingle(EObject eObject, EObjectCondition eCondition) {
		return EmfQueryUtils.tryFindSingle(eObject, eCondition);
	}

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤���ΰ��פ���ʣ���Υ��֥������Ȥ򸡺����롥
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eClass �����оݤη�
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 */
	public <T extends EObject> List<T> findByKind(EObject eObject, EClass eClass) {
		return EmfQueryUtils.find(eObject, isKindOf(eClass));
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤���ΰ��פ���ʣ���Υ��֥������Ȥ򸡺����롥
	 * 
	 * @param eClass �����оݤη�
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 */
	public <T extends EObject> List<T> findByKind(EClass eClass) {
		return EmfQueryUtils.find(this.eResource, isKindOf(eClass));
	}

	/**
	 * �оݥ��֥��������۲���¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ʣ���Υ��֥������Ȥ򸡺����롥
	 * 
	 * @param eObject �����оݤΥ��֥�������
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 */
	public <T extends EObject> List<T> find(EObject eObject, EObjectCondition eCondition) {
		return EmfQueryUtils.find(eObject, eCondition);
	}

	/**
	 * �꥽�������¸�ߤ��������֥������Ȥ��顤��������ɾ����̤����Ȥʤ�ʣ���Υ��֥������Ȥ򸡺����롥
	 * 
	 * @param eCondition �������
	 * @return ���Ĥ��ä����֥������ȤΥꥹ�ȡ�
	 */
	public <T extends EObject> List<T> find(EObjectCondition eCondition) {
		return EmfQueryUtils.find(this.eResource, eCondition);
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤�������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return ���򤵤줿���֥������ȡ�
	 * @throws ModelException ���֥������Ȥ����Ĥ���ʤ����
	 */
	public <F extends EObject, T extends F> T selectSingle(Collection<F> eObjects, EObjectCondition eCondition) throws ModelException {
		return EmfQueryUtils.selectSingle(eObjects, eCondition);
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤�������ɾ����̤����Ȥʤ�ñ��Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return ���򤵤줿���֥������ȡ�
	 */
	public <F extends EObject, T extends F> Optional<T> trySelectSingle(Collection<F> eObjects, EObjectCondition eCondition) {
		return EmfQueryUtils.trySelectSingle(eObjects, eCondition);
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤���ΰ��פ���ʣ���Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eClass �����оݤη�
	 * @return ���򤵤줿���֥������ȤΥꥹ�ȡ�
	 */
	public <F extends EObject, T extends F> List<T> selectByKind(Collection<F> eObjects, EClass eClass) {
		return this.select(eObjects, isKindOf(eClass));
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥ��顤�������ɾ����̤����Ȥʤ�ʣ���Υ��֥������Ȥ����򤹤롥
	 * 
	 * @param eObjects �����оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return ���򤵤줿���֥������ȤΥꥹ�ȡ�
	 */
	public <F extends EObject, T extends F> List<T> select(Collection<F> eObjects, EObjectCondition eCondition) {
		return EmfQueryUtils.select(eObjects, eCondition);
	}

	/**
	 * �����оݤΥ��֥������ȤΥꥹ�Ȥˡ��������ɾ����̤����Ȥʤ륪�֥������Ȥ�¸�ߤ��뤫��Ƚ�ꤹ�롥
	 * 
	 * @param eObjects Ƚ���оݤΥ��֥������ȤΥꥹ��
	 * @param eCondition ������
	 * @return���������ɾ����̤����Ȥʤ륪�֥������Ȥ�¸�ߤ����硤true������ʳ��ξ�硤false��
	 */
	public boolean exists(List<? extends EObject> eObjects, EObjectCondition eObjectCondition) {
		return EmfQueryUtils.exists(eObjects, eObjectCondition);
	}

	/**
	 * �Ѵ��оݤΥ��֥������ȤΥꥹ�Ȥ��顤�ƥ��֥������Ȥ�°�����ͤΥꥹ�Ȥ�������롥
	 * 
	 * @param eObjects �Ѵ��оݤΥ��֥������ȤΥꥹ��
	 * @param eStructuralFeature ��������ե�������
	 * @return ���֥������Ȥ�°�����ͤΥꥹ�ȡ�
	 */
	public <T> List<T> collect(List<? extends EObject> eObjects, final EStructuralFeature eStructuralFeature) {
		Iterable<?> originalCollection = Iterables.transform(eObjects, new Function<EObject, Object>() {
			@Override
			public Object apply(EObject input) {
				return input.eGet(eStructuralFeature);
			}
		});

		return flattenResult(Iterables.filter(originalCollection, Predicates.notNull()), eStructuralFeature);
	}

	/**
	 * �Ѵ��оݤΥ��֥������ȤΥꥹ�Ȥ��顤�ƥ��֥������Ȥ�°�����ͤΥꥹ�Ȥ�������롥
	 * °����ʣ������ꤵ�줿��硤����°�����ͤΥꥹ�Ȥ��Ф��ơ�����°�����ͤΥꥹ�Ȥ���������롥
	 * 
	 * @param eObjects �Ѵ��оݤΥ��֥������ȤΥꥹ��
	 * @param eStructuralFeatures ��������ե�������Υꥹ��
	 * @return ���֥������Ȥ�°�����ͤΥꥹ�ȡ�
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> collect(List<? extends EObject> eObjects, final EStructuralFeature... eStructuralFeatures) {
		List<?> collected = eObjects;
		for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			collected = collect((List<? extends EObject>) collected, eStructuralFeature);
		}
		return (List<T>) collected;
	}

	/**
	 * �Ѵ��оݤΥ��֥������ȤΥꥹ�Ȥ��顤�ƥ��֥������Ȥ�°�����ͤΥꥹ�Ȥ�������롥
	 * 
	 * @param eObjects �Ѵ��оݤΥ��֥������ȤΥꥹ��
	 * @param eAttribute ��������°��
	 * @return ���֥������Ȥ�°�����ͤΥꥹ�ȡ�
	 * @throws ModelException ���ڥ졼�����μ¹�����㳰��ȯ������
	 */
	public <T> List<T> collect(List<? extends EObject> eObjects, final EOperation eOperation, final Object... arguments) throws ModelException {
		final List<ModelException> caughtExceptions = Lists.newArrayList();

		Iterable<?> originalCollection = Iterables.transform(eObjects, new Function<EObject, Object>() {
			@Override
			public Object apply(EObject input) {
				try {
					return EmfUtils.exInvoke(input, eOperation, arguments);
				} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
					caughtExceptions.add(e);
					return null;
				}
			}
		});

		if (!caughtExceptions.isEmpty()) {// COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			throw caughtExceptions.get(0);
		}

		return flattenResult(Iterables.filter(originalCollection, Predicates.notNull()), eOperation);
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> flattenResult(Iterable<?> originalCollection, final ETypedElement eTypedElement) {
		if (eTypedElement.isMany()) {
			return Lists.newArrayList(Iterables.concat((Iterable<Iterable<T>>) originalCollection));
		} else {
			return Lists.newArrayList((Iterable<T>) originalCollection);
		}
	}

	public <T extends EObject> List<T> uniqueByKeys(List<T> eObjects, final EStructuralFeature... keyFeatures) {
		ListMultimap<List<Object>, T> keys2Objects = groupByKeys(eObjects, keyFeatures);

		List<T> uniqueObjects = Lists.newArrayList();
		for (List<Object> key : keys2Objects.keys()) {
			List<T> values = keys2Objects.get(key);
			uniqueObjects.add(values.get(0));
		}
		return uniqueObjects;
	}

	@SuppressWarnings("unchecked")
	public <K, V extends EObject> ListMultimap<K, V> groupByKey(List<V> eObjects, final EStructuralFeature keyFeature) {
		return Multimaps.index(eObjects, new Function<V, K>() {
			@Override
			public K apply(V input) {
				return (K) input.eGet(keyFeature);
			}
		});
	}

	private <T extends EObject> ListMultimap<List<Object>, T> groupByKeys(List<T> eObjects, final EStructuralFeature... keyFeatures) {
		return Multimaps.index(eObjects, new Function<T, List<Object>>() {
			@Override
			public List<Object> apply(T input) {
				List<Object> keys = Lists.newArrayList();
				for (EStructuralFeature eStructuralFeature : keyFeatures) {
					keys.add(input.eGet(eStructuralFeature));
				}
				return keys;
			}
		});
	}

	public <T extends EObject> T findByID(String id) throws ModelException {
		return EmfQueryUtils.findByID(this.eResource, id);
	}

	public <T> com.google.common.base.Function<EObject, T> operation2Function(final EOperation eOperation) {
		return new com.google.common.base.Function<EObject, T>() {
			@Override
			public T apply(EObject input) {
				List<T> collected;
				try {
					collected = collect(Collections.singletonList(input), eOperation);
					return Iterables.getFirst(collected, null);
				} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
					return null;
				}
			}
		};
	}

	public <T> com.google.common.base.Function<EObject, T> features2Function(final EStructuralFeature... eStructuralFeatures) {
		return new com.google.common.base.Function<EObject, T>() {
			@Override
			public T apply(EObject input) {
				List<T> collected = collect(Collections.singletonList(input), eStructuralFeatures);
				return Iterables.getFirst(collected, null);
			}
		};
	}

	public <T> com.google.common.base.Function<EObject, T> feature2Function(final EStructuralFeature eStructuralFeature) {
		return features2Function(eStructuralFeature);
	}
}
