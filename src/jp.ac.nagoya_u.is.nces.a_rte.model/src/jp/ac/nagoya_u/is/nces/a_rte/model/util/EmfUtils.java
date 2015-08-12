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

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.IteratorKind;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import com.google.common.base.Optional;

/**
 * EMF�˴ؤ���桼�ƥ���ƥ���ǽ���󶡤��롣
 */
public class EmfUtils { // COVERAGE ���̤ã(���󥹥����������Ԥʤ��Ƥ��ʤ������桼�ƥ���ƥ��Ǥ��뤿������ʤ�)
	private static final char ID_PREFIX_SEPARATOR = '.';

	// ���Υơ������ͭ���Ǥ��뤳�Ȥ򼨤���
	private static final String ANNOTATION_ENABLED_VALUE = "true";

	// ��ǥ�Υ��ƥ쥪�����פ˴ؤ��륢�Υơ������
	private static final String STEREOTYPES_ANNOTATION = "stereotypes";
	private static final String EX_PACKAGE_STEREOTYPE = "extension";

	// ��������Υ��Υơ������
	private static final String TAGS_ANNOTATION = "tags";

	/**
	 * EObject���Ф�����ĥ���ڥ졼������¹Ԥ��롥
	 * @param eObject ��ĥ���ڥ졼�����μ¹��оݤΥ��֥�������
	 * @param eOperation ��ĥ���ڥ졼�����
	 * @return ��ĥ���ڥ졼�����μ¹Է�̤��֤���.
	 * @throws ModelException ��ĥ���ڥ졼�����μ¹Ԥ˼��Ԥ������
	 */
	public static <T> T exInvoke(EObject eObject, EOperation eOperation) throws ModelException {
		return exInvoke(eObject, eOperation, new Object[0]);
	}

	/**
	 * EObject���Ф�����ĥ���ڥ졼������¹Ԥ��롥
	 * @param eObject ��ĥ���ڥ졼�����μ¹��оݤΥ��֥�������
	 * @param eOperation ��ĥ���ڥ졼�����
	 * @param arguments ��ĥ���ڥ졼�������Ϥ�����������
	 * @return ��ĥ���ڥ졼�����μ¹Է�̤��֤���.
	 * @throws ModelException ��ĥ���ڥ졼�����μ¹Ԥ˼��Ԥ������
	 */
	@SuppressWarnings("unchecked")
	public static <T> T exInvoke(EObject eObject, EOperation eOperation, Object... arguments) throws ModelException {
		try {
			if (!isExtensionOperation(eOperation)) {
				return (T) eObject.eInvoke(eOperation, new BasicEList<Object>(Arrays.asList(arguments)));
			} else {
				Resource eResource = eObject.eResource();
				EObject extensionObject = findExtensionObject(eResource, eOperation.getEContainingClass());

				BasicEList<Object> exArguments = new BasicEList<Object>();
				exArguments.add(eObject);
				Collections.addAll(exArguments, arguments);

				return (T) extensionObject.eInvoke(eOperation, exArguments);
			}
		} catch (InvocationTargetException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("Internal error occurred while accessing a model.", e);
		}
	}

	private static EObject findExtensionObject(Resource eResource, EClass extensionClass) throws ModelException {
		Optional<EObject> foundObject = tryFindExtensionObject(eResource, extensionClass);
		if (!foundObject.isPresent())// COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("An extension object of " + extensionClass.getName() + " does not exist in a resource.");

		return foundObject.get();
	}

	/**
	 * �꥽�������¸�ߤ��롢���ꤵ�줿���γ�ĥ���֥������Ȥ򸡺����롣
	 * ��ĥ���֥������Ȥ����Ĥ���ʤ����ϡ���ĥ���֥������Ȥ��ۤ����꥽�������ɲä��롣
	 * @param eResource �����оݤ�{@link Resource}
	 * @param extensionClass ��ĥ���֥������Ȥη�
	 * @return �꥽�������¸�ߤ����ĥ���֥�������
	 */
	public static EObject findOrBuildExtensionObject(Resource eResource, EClass extensionClass) {
		Optional<EObject> foundExtensionObject = tryFindExtensionObject(eResource, extensionClass);
		if (!foundExtensionObject.isPresent()) {
			// ��ĥ���ڥ졼�������ݻ����륪�֥������Ȥ�¸�ߤ��ʤ���硤�������롥
			EObject extensionObject = extensionClass.getEPackage().getEFactoryInstance().create(extensionClass);
			eResource.getContents().add(extensionObject);

			for (EReference eReference : extensionObject.eClass().getEAllReferences()) {
				EClass eReferenceeClass = (EClass) eReference.getEType();
				if (isExtensionClass(eReferenceeClass)) { // COVERAGE ���true(�����Υġ������ե��Ǥ�false���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
					extensionObject.eSet(eReference, findOrBuildExtensionObject(eResource, eReferenceeClass));
				}
			}
			return extensionObject;
		} else {
			return foundExtensionObject.get();
		}
	}

	private static Optional<EObject> tryFindExtensionObject(Resource eResource, EClass extensionClass) {
		IQueryResult result = new SELECT(new FROM(eResource.getContents(), IteratorKind.FLAT_LITERAL), new WHERE(new EObjectTypeRelationCondition(extensionClass))).execute();
		return result.isEmpty() ? Optional.<EObject> absent() : Optional.of(result.iterator().next());
	}

	/**
	 * <p>���֥������Ȥ��Ф������ꤷ��{@link EOperation}��Ŭ�ѤǤ��뤫��Ƚ�ꤹ�롣</p>
	 * @param eObject Ƚ���оݤ�{@link EObject}
	 * @param eOperation Ƚ���оݤ�{@link EOperation}
	 * @return ���֥������Ȥ��Ф������ꤷ��{@link EOperation}��Ŭ�ѤǤ����硢true������ʳ��ξ�硢false��
	 */
	public static boolean isOperationApplicable(EObject eObject, EOperation eOperation) {
		if (isExtensionOperation(eOperation)) {
			// ��ĥ���ڥ졼�����
			if (eOperation.getEParameters().isEmpty()) {// COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
				return false;
			} else {
				return eOperation.getEParameters().get(0).getEType().isInstance(eObject);
			}
		} else {
			// ɸ�४�ڥ졼�����
			return eOperation.getEContainingClass().isInstance(eObject);
		}
	}

	private static boolean isExtensionOperation(EOperation eOperation) {
		return isExtensionPackage(eOperation.getEContainingClass().getEPackage());
	}

	private static boolean isExtensionClass(EClass eClass) {
		return isExtensionPackage(eClass.getEPackage());
	}

	private static boolean isExtensionPackage(EPackage ePackage) {
		return ANNOTATION_ENABLED_VALUE.equals(EcoreUtil.getAnnotation(ePackage, STEREOTYPES_ANNOTATION, EX_PACKAGE_STEREOTYPE));
	}

	/**
	 * ��ǥ�ĥ꡼��ξ�̥��֥������ȤΤ��������ꤵ�줿���Ǥ��ꡢ����ľ��Υ��֥������Ȥ򸡺����롣
	 * @param eObject �����ε����Ȥʤ륪�֥�������
	 * @param eClass �����оݤξ�̥��֥������Ȥη�
	 * @return ��ǥ�ĥ꡼��ξ�̥��֥������ȤΤ��������ꤵ�줿���Ǥ��ꡢ����ľ��Υ��֥�������
	 */
	@SuppressWarnings("unchecked")
	public static <T> Optional<T> tryFindNearestAncestorOfType(EObject eObject, EClass eClass) {
		EObject parent = eObject.eContainer();
		while (parent != null) {
			if (eClass.isInstance(parent)) {
				return Optional.of((T) parent);
			}
			parent = parent.eContainer();
		}
		return Optional.absent();
	}

	/**
	 * <p>���ꤵ�줿���֥������ȤȤ����۲��Υ��֥������ȤΥ��ԡ���������롣</p>
	 * <p>NOTE �۲��Υ��֥������ȤˤĤ��Ƥ�Ʊ�ͤ˥��ԡ�����뤳�Ȥ���ա�</p>
	 * @param eObject ���ԡ����Υ��֥�������
	 * @return ���ԡ���̤Υ��֥�������
	 */
	public static <T extends EObject> T copy(T eObject) {
		return EcoreUtil.copy(eObject);
	}

	/**
	 * <p>���ꤵ�줿���֥������ȤΥ��ԡ���������롣</p>
	 * <p>NOTE �۲��Υ��֥������Ȥϥ��ԡ����ʤ����Ȥ���ա�</p>
	 * @param eObject ���ԡ����Υ��֥�������
	 * @return ���ԡ���̤Υ��֥�������
	 */
	public static <T extends EObject> T copyItself(T eObject) {
		Copier copier = new ItselfCopier();
		EObject result = copier.copy(eObject);
		copier.copyReferences();

		@SuppressWarnings("unchecked")
		T t = (T) result;
		return t;
	}

	private static class ItselfCopier extends Copier {
		private static final long serialVersionUID = 1L;

		@Override
		protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
			// nop
		}
	}

	/**
	 * ���֥������Ȥ���{@link EStructuralFeature}���ͤΥꥹ�Ȥ�������롣
	 * @param eObject �����оݤ�{@link EObject}
	 * @param eReference �����оݤ�{@link EStructuralFeature}
	 * @return ���֥������Ȥ����������{@link EStructuralFeature}���ͤΥꥹ��
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> getFeatureValues(EObject eObject, EStructuralFeature eReference) {
		if (eReference.isMany()) {
			return (List<T>) eObject.eGet(eReference);
		} else {
			T value = (T) eObject.eGet(eReference);
			return value == null ? Collections.<T> emptyList() : Collections.singletonList(value);
		}
	}

	/**
	 * <p>���֥������Ȥ�ID���ե���󥹤��Ѵ����롣</p>
	 * <p>NOTE ��ե���󥹤Ϥ����ǥ���ǥ��֥������Ȥ��դ˼��̡����Ȥ���ʸ����(ID����ID��Ƭ������������)�Ǥ��롣</p>
	 * @param id �Ѵ��оݤΥ��֥�������ID
	 * @return �Ѵ���̤Υ�ե����
	 */
	public static String idToReference(String id) {
		int idPrefixEnd = id.indexOf(ID_PREFIX_SEPARATOR);
		if (idPrefixEnd == -1) {// COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			return id;
		}

		return id.substring(idPrefixEnd + 1);
	}

	/**
	 * {@link EStructuralFeature}�����ꤵ�줿��������(tags���Υơ������)��ʸ�����������롣
	 * @param eStructuralFeature �����оݤ�{@link EStructuralFeature}
	 * @param tag ��������̾
	 * @return {@link EStructuralFeature}�����ꤵ�줿��������(tags)
	 */
	public static Optional<String> tryGetTag(EStructuralFeature eStructuralFeature, String tag) {
		String tagValue = EcoreUtil.getAnnotation(eStructuralFeature, TAGS_ANNOTATION, tag);
		return Optional.fromNullable(tagValue);
	}

	/**
	 * {@link EModelElement}�����ꤵ�줿���ƥ쥪�����פ���Ĥ���Ƚ�ꤹ�롣
	 * @param eModelElement Ƚ���оݤ�{@link EModelElement}
	 * @param stereotype Ƚ���оݤΥ��ƥ쥪������
	 * @return {@link EModelElement}�����ꤵ�줿���ƥ쥪�����פ���ľ�硢true������ʳ��ξ�硢false��
	 */
	public static boolean hasStereotype(EModelElement eModelElement, String stereotype) {
		return ANNOTATION_ENABLED_VALUE.equals(EcoreUtil.getAnnotation(eModelElement, STEREOTYPES_ANNOTATION, stereotype));
	}

	/**
	 * {@link EStructuralFeature}�����ꤵ�줿��������(tags���Υơ������)�ο����ͤ�������롣
	 * �����������ꤵ��Ƥ��ʤ���硢�ǥե�����ͤ��֤���
	 * @param eStructuralFeature �����оݤ�{@link EStructuralFeature}
	 * @param tag ��������̾
	 * @param defaultValue �ǥե������
	 * @return �����������ꤵ��Ƥ����硢{@link EStructuralFeature}�����ꤵ�줿��������(tags���Υơ������)�ο����͡�����ʳ��ξ�硢�ǥե�����͡�
	 */
	public static boolean getBooleanTagValue(EStructuralFeature eStructuralFeature, String tag, boolean defaultValue) {
		Optional<String> tagValue = tryGetTag(eStructuralFeature, tag);
		return tagValue.isPresent() ? ANNOTATION_ENABLED_VALUE.equals(tagValue.get()) : defaultValue;
	}
}
