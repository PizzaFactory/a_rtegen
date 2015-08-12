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
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_VALUE_COLLECTION;

import java.util.logging.Logger;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util.EcucModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucAbstractReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucInstanceReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucParameterValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucReferenceValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucTextualParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Optional;

public class M2ToEcucMapper {
	private final static Logger LOGGER = Logger.getLogger(M2ToEcucMapper.class.getName());

	private final Resource eResource;
	private final ModelQuery query;
	private EcucRoot ecucRoot;

	public M2ToEcucMapper(Resource eResource) {
		this.eResource = eResource;
		this.query = new ModelQuery(eResource);
	}

	public void map() throws PersistException {
		this.ecucRoot = EcucFactory.eINSTANCE.createEcucRoot();
		this.eResource.getContents().add(this.ecucRoot);

		mapEcuc();
		resolveReference();
	}

	private void mapEcuc() throws PersistException {
		Optional<EcucValueCollection> ecucValueCollection = this.query.tryFindSingleByKind(ECUC_VALUE_COLLECTION);
		if (!ecucValueCollection.isPresent()) {
			return;
		}

		try {
			for (EcucModuleConfigurationValues ecucModuleConfigurationValues : ecucValueCollection.get().getEcucValue()) {
				mapModule(ecucModuleConfigurationValues);
			}
		} catch (InternalPersistException e) {
			throw new PersistException("Error occurred while loading ECU Configuration. " + e.getMessage(), e);
		}
	}

	private void mapModule(EcucModuleConfigurationValues m2Module) throws InternalPersistException {
		EStructuralFeature moduleFeature = this.ecucRoot.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(m2Module.getDefinitionRef()));
		if (moduleFeature == null) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}

		EcucModule ecucModule = createEcucModuleByFeature(moduleFeature);
		setRoleValue(this.ecucRoot, moduleFeature, ecucModule);

		ecucModule.setReferenceBase(M2ModelUtils.getReferenceBase(m2Module));
		ecucModule.setShortName(m2Module.getShortName());
		ecucModule.setSource(m2Module);

		LOGGER.finest("mapped " + m2Module + " to " + ecucModule);

		for (EcucContainerValue m2Container : m2Module.getContainer()) {
			mapContainer(ecucModule, m2Container);
		}
	}

	private void mapContainer(EcucReferrable ecucParentContainer, EcucContainerValue m2Container) throws InternalPersistException {
		EStructuralFeature containerFeature = ecucParentContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(m2Container.getDefinitionRef()));
		if (containerFeature == null) {
			return;
		}

		EcucContainer ecucContainer = createEcucContainerByFeature(containerFeature);
		setRoleValue(ecucParentContainer, containerFeature, ecucContainer);

		ecucContainer.setShortName(m2Container.getShortName());
		ecucContainer.setSource(m2Container);

		LOGGER.finest("mapped " + m2Container + " to " + ecucContainer);

		for (EcucParameterValue parameterValue : m2Container.getParameterValue()) {
			mapParameter(ecucContainer, parameterValue);
		}

		for (EcucAbstractReferenceValue referenceValue : m2Container.getReferenceValue()) {
			if (referenceValue instanceof EcucReferenceValue) {
				mapReference(ecucContainer, (EcucReferenceValue) referenceValue);
			} else if (referenceValue instanceof EcucInstanceReferenceValue) { // COVERAGE ���true(�����Υ��ݡ����ϰϤǤϡ�EcucAbstractReferenceValue��EcucReferenceValue��EcucInstanceReferenceValue�Τ����줫�Ǥ��뤿��)
				mapInstanceReference(ecucContainer, (EcucInstanceReferenceValue) referenceValue);
			}
		}

		for (EcucContainerValue subContainer : m2Container.getSubContainer()) {
			mapContainer(ecucContainer, subContainer);
		}
	}

	private void mapParameter(EcucReferrable ecucContainer, EcucParameterValue m2Parameter) throws InternalPersistException {
		EStructuralFeature parameterFeature = ecucContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfParameterDef(m2Parameter.getDefinitionRef()));
		if (parameterFeature == null) {
			return;
		}

		try {
			if (m2Parameter instanceof EcucNumericalParamValue) {
				EcucNumericalParamValue ecucNumericalParamValue = (EcucNumericalParamValue) m2Parameter;
				setRoleValue(ecucContainer, parameterFeature, M2ModelUtils.convertValueForFeature(ecucNumericalParamValue.getValue(), parameterFeature));
			} else if (m2Parameter instanceof EcucTextualParamValue) { // COVERAGE ���true(�����Υ��ݡ����ϰϤǤϡ�EcucParameterValue��EcucNumericalParamValue��EcucTextualParamValue�Τ����줫�Ǥ��뤿��)
				EcucTextualParamValue ecucTextualParamValue = (EcucTextualParamValue) m2Parameter;
				setRoleValue(ecucContainer, parameterFeature, M2ModelUtils.convertValueForFeature(ecucTextualParamValue.getValue(), parameterFeature));
			}
		} catch (ModelException e) {
			throw new InternalPersistException("Error found in the parameter '" + parameterFeature.getName() + "' of " + ModelLabels.getLabel(ecucContainer) + ". " + e.getMessage(), e);
		}

		LOGGER.finest("mapped " + m2Parameter + " to " + ecucContainer + " " + parameterFeature);
	}

	private void mapReference(EcucObject ecucContainer, EcucReferenceValue m2Reference) throws InternalPersistException {
		EStructuralFeature roleFeature = ecucContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfReferenceDef(m2Reference.getDefinitionRef()));
		if (roleFeature == null) {
			return;
		}

		if (M2Package.eINSTANCE.equals(roleFeature.getEType().getEPackage())) {
			// ������äƤ��뤫���ǧ����
			if (!roleFeature.getEType().isInstance(m2Reference.getValue())) {
				throw new InternalPersistException("The referenced object " + m2Reference.getValue().getReference() + " is not typed with "
						+ roleFeature.getEType().getName() + " for the parameter '" + roleFeature.getName() + "' of "
						+ ModelLabels.getLabel(ecucContainer) + ".");
			}
			setRoleValue(ecucContainer, roleFeature, m2Reference.getValue());

		} else if (EcucPackage.eINSTANCE.equals(roleFeature.getEType().getEPackage())) { // COVERAGE ���true(EcucReferenceValue�λ��������Ǥϡ�m2��ecuc�Τ����줫�Υѥå������Τ�ΤǤ��뤿��)
			// ECUC�Υ��֥������Ȥ���������λ���Ƥ��ʤ��Τǡ������֥������Ȥ�������˥�ե���󥹤�Ž��ľ����
			ecucContainer.addUnresolvedReference((EReference) roleFeature, EcucModelUtils.ID_PREFIX + m2Reference.getValue().getReference());
		}
		LOGGER.finest("mapped " + m2Reference + " to " + ecucContainer + " " + roleFeature);
	}

	private void mapInstanceReference(EcucReferrable ecucContainer, EcucInstanceReferenceValue m2InstanceReference) throws InternalPersistException {
		EStructuralFeature roleFeature = ecucContainer.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfInstanceReferenceDef(m2InstanceReference.getDefinitionRef()));
		if (roleFeature == null) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			return;
		}

		if (!roleFeature.getEType().isInstance(m2InstanceReference.getValue())) {
			throw new InternalPersistException("The referenced object " + ModelLabels.getLabelOfInstanceRef(m2InstanceReference.getValueIref()) + " is not typed with "
					+ roleFeature.getEType().getName() + " for the parameter '" + roleFeature.getName() + "' of "
					+ ModelLabels.getLabel(ecucContainer) + ".");
		}
		setRoleValue(ecucContainer, roleFeature, m2InstanceReference.getValue());
		LOGGER.finest("mapped " + m2InstanceReference + " to " + ecucContainer + " " + roleFeature);
	}

	private void resolveReference() throws PersistException {
		try {
			TreeIterator<EObject> eAllContents = this.ecucRoot.eAllContents();
			while (eAllContents.hasNext()) {
				ExtendedEObject eObject = (ExtendedEObject) eAllContents.next();
				eObject.resolveReferences();
			}
		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new PersistException("Internal error occurred while resolving autosar references of ECU Configuration. " + e.getMessage(), e);
		}
	}

	private void setRoleValue(EObject ecucObject, EStructuralFeature ecucFeature, Object value) {
		if (ecucFeature.isMany()) {
			@SuppressWarnings("unchecked")
			EList<Object> containerList = (EList<Object>) ecucObject.eGet(ecucFeature);
			containerList.add(value);
		} else {
			ecucObject.eSet(ecucFeature, value);
		}
	}

	private EcucModule createEcucModuleByFeature(EStructuralFeature ecucFeature) {
		EClass eClass = (EClass) ecucFeature.getEType();
		return (EcucModule) EcucFactory.eINSTANCE.create(eClass);
	}

	private EcucContainer createEcucContainerByFeature(EStructuralFeature ecucFeature) {
		EClass eClass = (EClass) ecucFeature.getEType();
		return (EcucContainer) EcucFactory.eINSTANCE.create(eClass);
	}
}
