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
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.Autosar;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceState;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class M2ModelMerger {
	/**
	 * �����Υ��֥������Ȥ���˰��פ��ʤ���ΤȤ��ƥޥå��󥰤�Ԥ�EObjectMatcher
	 */
	private static class NeverMatchEObjectMatcher implements IEObjectMatcher {
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.emf.compare.match.eobject.IEObjectMatcher#createMatches
		 * (org.eclipse.emf.compare.Comparison, java.util.Iterator,
		 * java.util.Iterator, java.util.Iterator,
		 * org.eclipse.emf.common.util.Monitor)
		 */
		@Override
		public void createMatches(Comparison comparison, Iterator<? extends EObject> leftEObjects, Iterator<? extends EObject> rightEObjects, Iterator<? extends EObject> originEObjects,
				Monitor monitor) {

			// ���դΥ��֥������ȤΥޥå�����
			for (EObject eObject : Lists.newArrayList(leftEObjects)) {
				Match parentMatch = comparison.getMatch(eObject.eContainer());
				if (parentMatch == null) { // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
					continue;
				}

				Match match = CompareFactory.eINSTANCE.createMatch();
				match.setLeft(eObject);
				parentMatch.getSubmatches().add(match);
			}

			// ���դΥ��֥������ȤΥޥå�����
			for (EObject eObject : Lists.newArrayList(rightEObjects)) {
				Match parentMatch = comparison.getMatch(eObject.eContainer());
				if (parentMatch == null) { // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
					continue;
				}

				Match match = CompareFactory.eINSTANCE.createMatch();
				match.setRight(eObject);
				parentMatch.getSubmatches().add(match);
			}

			// ���ꥸ�ʥ�Υ��֥������ȤΥޥå�����
			for (EObject eObject : Lists.newArrayList(originEObjects)) { // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
				Match parentMatch = comparison.getMatch(eObject.eContainer());
				if (parentMatch == null) {
					continue;
				}

				Match match = CompareFactory.eINSTANCE.createMatch();
				match.setOrigin(eObject);
				parentMatch.getSubmatches().add(match);
			}
		}
	}

	private final static Logger LOGGER = Logger.getLogger(M2ModelMerger.class.getName());

	private final EMFCompare comparator;

	public M2ModelMerger() {
		IEObjectMatcher matcher = new IdentifierEObjectMatcher(new NeverMatchEObjectMatcher());
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		this.comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
	}

	public void merge(Autosar mergeTargetAutosar, Autosar appendAutosar) {
		Comparison comparison = compareModels(mergeTargetAutosar, appendAutosar);
		mergeToTargetModel(comparison);
	}

	private Comparison compareModels(Autosar mergeTargetAutosar, Autosar appendAutosar) {
		DefaultComparisonScope scope = new DefaultComparisonScope(appendAutosar, mergeTargetAutosar, null);
		return this.comparator.compare(scope);
	}

	private void mergeToTargetModel(Comparison comparison) {
		for (Diff diff : comparison.getDifferences()) {
			switch (diff.getKind()) {
			case ADD:
			case MOVE:
				if (diff instanceof ReferenceChange) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
					ReferenceChange referenceChange = (ReferenceChange) diff;
					if (!referenceChange.getReference().isContainment()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
						LOGGER.finest("discarding a diff. it is not a containment reference diff. " + diff);
						diff.discard();

					} else if (referenceChange.getMatch().getLeft() == null || referenceChange.getMatch().getRight() == null) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
						LOGGER.finest("discarding a diff. it is of a submatch. " + diff);
						diff.discard();

					} else if (referenceChange.getValue().eContainer() == referenceChange.getMatch().getRight()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
						LOGGER.finest("discarding a diff. it is of the merge target. " + diff);
						diff.discard();

					} else if (isRightAlreadyContainsValue(referenceChange)) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
						LOGGER.finest("discarding a diff. the value of it already exists in the merge target. " + diff);
						diff.discard();
					}
				} else { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
					LOGGER.finest("discarding a diff. it is not a reference diff. " + diff);
					diff.discard();
				}
				break;
			case CHANGE:
			case DELETE:
			default:
				LOGGER.finest("discarding a diff. it is change or delete diff. " + diff);
				diff.discard();
				break;
			}
		}

		// �ޡ���
		for (Diff diff : comparison.getDifferences()) {
			mergeDiff(diff);
		}
	}

	private boolean isRightAlreadyContainsValue(ReferenceChange referenceChange) {
		final String diffObjectId = EcoreUtil.getID(referenceChange.getValue());
		if (diffObjectId == null) {
			// ID������ʤ���硤�ޤޤ�Ƥ��ʤ���Τ�Ƚ�Ǥ��롥
			return false;
		}

		List<EObject> eObjects = EmfUtils.getFeatureValues(referenceChange.getMatch().getRight(), referenceChange.getReference());
		return Iterables.any(eObjects, new Predicate<EObject>() {
			@Override
			public boolean apply(EObject input) {
				return Objects.equal(EcoreUtil.getID(input), diffObjectId);
			}
		});
	}

	private void mergeDiff(Diff diff) {
		if (diff.getState() != DifferenceState.UNRESOLVED) {
			return;
		}

		// ��˰�¸�����ӷ�̤Υޡ�����»�
		for (Diff requiresDiff : diff.getRequires()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			mergeDiff(requiresDiff);
		}

		// �ޡ���
		if (diff instanceof ReferenceChange) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�) 
			ReferenceChange referenceChange = (ReferenceChange) diff;
			LOGGER.finest("merging " + referenceChange);

			if (referenceChange.getReference().isMany()) {
				@SuppressWarnings("unchecked")
				List<EObject> list = (List<EObject>) referenceChange.getMatch().getRight().eGet(referenceChange.getReference());
				list.add(referenceChange.getValue());
			} else {
				diff.getMatch().getRight().eSet(referenceChange.getReference(), referenceChange.getValue());
			}
			referenceChange.setState(DifferenceState.MERGED);
		}
	}
}