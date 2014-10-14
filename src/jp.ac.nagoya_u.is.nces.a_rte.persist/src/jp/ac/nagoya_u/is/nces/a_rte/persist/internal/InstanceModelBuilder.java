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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.IINSTANCE_OBJECT__INSTANCE_ID;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.INSTANCE_REFERRABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ECUC_VALUE_COLLECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.PPORT_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.RPORT_PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.IInstanceObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.util.InstanceModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AssemblySwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DelegationSwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucValueCollection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RootSwCompositionPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.System;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.PersistException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Optional;

public class InstanceModelBuilder {

	private final Resource eResource;
	private final ModelQuery query;
	private RootSwCompositionPrototype rootSwCompositionPrototype;
	private InstanceRoot instanceRoot;

	public InstanceModelBuilder(Resource eResource) {
		this.eResource = eResource;
		this.query = new ModelQuery(eResource);
	}

	public void build() throws PersistException {
		try {
			Optional<EcucValueCollection> ecucValueCollection = this.query.tryFindSingleByKind(ECUC_VALUE_COLLECTION);
			System system = ecucValueCollection.isPresent() ? ecucValueCollection.get().getEcuExtract() : null;
			this.rootSwCompositionPrototype = system != null ? system.getRootSoftwareComposition() : null;

			InstanceRoot instanceRoot = InstanceFactory.eINSTANCE.createInstanceRoot();
			this.eResource.getContents().add(instanceRoot);
			this.instanceRoot = instanceRoot;

			buildInstanceModelsInSwc();
			buildInstanceModelsInComposition();
			buildInstanceModelsInSystem();
			resolveReference();

			buildConnectionOfInstanceModels();

			buildModelIds();
		} catch (ModelException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new PersistException("Internal error occurred while resolving AUTOSAR instance references.", e);

		} catch (InternalPersistException e) {
			throw new PersistException("Error occurred while resolving AUTOSAR instance references. " + e.getMessage(), e);
		}
	}

	private void buildInstanceModelsInSwc() {
		for (RPortPrototype rPortPrototype : this.query.<RPortPrototype> findByKind(RPORT_PROTOTYPE)) {
			if (rPortPrototype.getRequiredInterface() instanceof SenderReceiverInterface) {
				SenderReceiverInterface senderReceiverInterface = (SenderReceiverInterface) rPortPrototype.getRequiredInterface();
				for (VariableDataPrototype dataElement : senderReceiverInterface.getDataElement()) {
					RVariableDataInstanceInSwc dataInstanceInSwc = InstanceFactory.eINSTANCE.createRVariableDataInstanceInSwc();
					dataInstanceInSwc.setContextPort(rPortPrototype);
					dataInstanceInSwc.setPrototype(dataElement);
					this.instanceRoot.getVariableDataInstanceInSwc().add(dataInstanceInSwc);
				}
			} else if (rPortPrototype.getRequiredInterface() instanceof ClientServerInterface) { // COVERAGE ���true(������Interface��SenderReceiverInterface��ClientServerInterface�Τ����줫�Ǥ��뤿��)
				ClientServerInterface clientServerInterface = (ClientServerInterface) rPortPrototype.getRequiredInterface();
				for (ClientServerOperation operation : clientServerInterface.getOperation()) {
					ROperationInstanceInSwc operationInstanceInSwc = InstanceFactory.eINSTANCE.createROperationInstanceInSwc();
					operationInstanceInSwc.setContextPort(rPortPrototype);
					operationInstanceInSwc.setPrototype(operation);
					this.instanceRoot.getOperationInstanceInSwc().add(operationInstanceInSwc);
				}
			}
		}

		for (PPortPrototype pPortPrototype : this.query.<PPortPrototype> findByKind(PPORT_PROTOTYPE)) {
			if (pPortPrototype.getProvidedInterface() instanceof SenderReceiverInterface) {
				SenderReceiverInterface senderReceiverInterface = (SenderReceiverInterface) pPortPrototype.getProvidedInterface();
				for (VariableDataPrototype dataElement : senderReceiverInterface.getDataElement()) {
					PVariableDataInstanceInSwc dataInstanceInSwc = InstanceFactory.eINSTANCE.createPVariableDataInstanceInSwc();
					dataInstanceInSwc.setContextPort(pPortPrototype);
					dataInstanceInSwc.setPrototype(dataElement);
					this.instanceRoot.getVariableDataInstanceInSwc().add(dataInstanceInSwc);
				}
			} else if (pPortPrototype.getProvidedInterface() instanceof ClientServerInterface) { // COVERAGE ���true(������Interface��SenderReceiverInterface��ClientServerInterface�Τ����줫�Ǥ��뤿��)
				ClientServerInterface clientServerInterface = (ClientServerInterface) pPortPrototype.getProvidedInterface();
				for (ClientServerOperation operation : clientServerInterface.getOperation()) {
					POperationInstanceInSwc operationInstanceInSwc = InstanceFactory.eINSTANCE.createPOperationInstanceInSwc();
					operationInstanceInSwc.setContextPort(pPortPrototype);
					operationInstanceInSwc.setPrototype(operation);
					this.instanceRoot.getOperationInstanceInSwc().add(operationInstanceInSwc);
				}
			}
		}
	}

	private void buildInstanceModelsInComposition() {
		if (this.rootSwCompositionPrototype == null) {
			return;
		}

		for (SwComponentPrototype swComponentPrototype : this.rootSwCompositionPrototype.getSoftwareComposition().getComponent()) {
			for (PortPrototype portPrototype : swComponentPrototype.getType().getPort()) {
				PortInstanceInComposition portInstanceInComposition = InstanceFactory.eINSTANCE.createPortInstanceInComposition();
				portInstanceInComposition.setContextComponent(swComponentPrototype);
				portInstanceInComposition.setPrototype(portPrototype);
				this.instanceRoot.getPortInstanceInComposition().add(portInstanceInComposition);

				for (VariableDataInstanceInSwc dataInstanceInSwc : this.query.<VariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					VariableDataInstanceInComposition dataInstanceInComposition = InstanceFactory.eINSTANCE.createVariableDataInstanceInComposition();
					dataInstanceInComposition.setPrototype(dataInstanceInSwc);
					portInstanceInComposition.getDataElement().add(dataInstanceInComposition);
				}

				for (OperationInstanceInSwc operationInstanceInSwc : this.query.<OperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, portPrototype))) {
					OperationInstanceInComposition operationInstanceInComposition = InstanceFactory.eINSTANCE.createOperationInstanceInComposition();
					operationInstanceInComposition.setPrototype(operationInstanceInSwc);
					portInstanceInComposition.getOperation().add(operationInstanceInComposition);
				}
			}
		}
	}

	private void buildInstanceModelsInSystem() {
		if (this.rootSwCompositionPrototype == null) {
			return;
		}

		for (SwComponentPrototype swComponentPrototype : this.rootSwCompositionPrototype.getSoftwareComposition().getComponent()) {
			SwComponentInstanceInSystem componentInstanceInSystem = InstanceFactory.eINSTANCE.createSwComponentInstanceInSystem();
			componentInstanceInSystem.setContextRootComposition(this.rootSwCompositionPrototype);
			componentInstanceInSystem.setPrototype(swComponentPrototype);
			this.instanceRoot.getSwComponentInstanceInSystem().add(componentInstanceInSystem);
		}
	}

	private void buildConnectionOfInstanceModels() throws ModelException {
		if (this.rootSwCompositionPrototype == null) {
			return;
		}

		for (SwConnector swConnector : this.rootSwCompositionPrototype.getSoftwareComposition().getConnector()) {
			if (swConnector instanceof AssemblySwConnector) {
				AssemblySwConnector assemblySwConnector = (AssemblySwConnector) swConnector;
				buildElementConnectionsOfAssemblyConnector(assemblySwConnector);
			} else if (swConnector instanceof DelegationSwConnector) { // COVERAGE ���true(SwConnector��AssemblySwConnector��DelegationSwConnector�Τ����줫�Ǥ��뤿��)
				DelegationSwConnector delegationSwConnector = (DelegationSwConnector) swConnector;
				buildElementConnectionsOfDelegationConnector(delegationSwConnector);
			}
		}
	}

	private void buildElementConnectionsOfDelegationConnector(DelegationSwConnector delegationSwConnector) {
		for (VariableDataInstanceInComposition innerDataElement : delegationSwConnector.getInnerPort().getDataElement()) {
			Optional<VariableDataInstanceInSwc> outerDataElement = this.query.tryFindSingle(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, delegationSwConnector.getOuterPort()).AND(
					hasOp(VARIABLE_DATA_INSTANCE_IN_SWC___GET_TARGET_SHORT_NAME, innerDataElement.getTargetShortName())));
			if (outerDataElement == null) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			DelegationDataInstanceConnector dataInstanceConnector = InstanceFactory.eINSTANCE.createDelegationDataInstanceConnector();
			dataInstanceConnector.setInner(innerDataElement);
			dataInstanceConnector.setOuter(outerDataElement.get());
			this.instanceRoot.getDelegationDataInstanceConnector().add(dataInstanceConnector);
		}
	}

	private void buildElementConnectionsOfAssemblyConnector(AssemblySwConnector assemblySwConnector) throws ModelException {
		for (VariableDataInstanceInComposition providerDataElement : assemblySwConnector.getProvider().getDataElement()) {
			Optional<VariableDataInstanceInComposition> requesterDataElement = this.query.trySelectSingle(assemblySwConnector.getRequester().getDataElement(),
					hasOp(VARIABLE_DATA_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME, providerDataElement.getTargetShortName()));
			if (!requesterDataElement.isPresent()) {
				continue;
			}

			AssemblyDataInstanceConnector dataInstanceConnector = InstanceFactory.eINSTANCE.createAssemblyDataInstanceConnector();
			dataInstanceConnector.setProvider(providerDataElement);
			dataInstanceConnector.setRequester(requesterDataElement.get());
			this.instanceRoot.getAssemblyDataInstanceConnector().add(dataInstanceConnector);
		}

		for (OperationInstanceInComposition providerOperation : assemblySwConnector.getProvider().getOperation()) {
			Optional<OperationInstanceInComposition> requesterOperation = this.query.trySelectSingle(assemblySwConnector.getRequester().getOperation(),
					hasOp(OPERATION_INSTANCE_IN_COMPOSITION___GET_TARGET_SHORT_NAME, providerOperation.getTargetShortName()));
			if (!requesterOperation.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			AssemblyOperationInstanceConnector operationInstanceConnector = InstanceFactory.eINSTANCE.createAssemblyOperationInstanceConnector();
			operationInstanceConnector.setProvider(providerOperation);
			operationInstanceConnector.setRequester(requesterOperation.get());
			this.instanceRoot.getAssemblyOperationInstanceConnector().add(operationInstanceConnector);
		}
	}

	private void resolveReference() throws InternalPersistException {
		TreeIterator<EObject> eAllContents = this.eResource.getAllContents();
		while (eAllContents.hasNext()) {
			EObject eObject = eAllContents.next();
			resolveReferenceOf(eObject);
		}
	}

	private <T extends IInstanceObject> Optional<T> resolveInstance(IInstanceRef instanceRef) {
		return this.query.tryFindSingle(hasAttr(IINSTANCE_OBJECT__INSTANCE_ID, instanceRef.getInstanceRef()));
	}

	private void resolveReferenceOf(EObject eObject) throws InternalPersistException {
		for (EReference eReference : eObject.eClass().getEAllReferences()) {
			if (eReference.isContainment()) {
				continue;
			}

			EStructuralFeature eIrefFeature = eObject.eClass().getEStructuralFeature(M2ModelUtils.getIrefRoleNameOfRoleFeature(eReference));
			if (eIrefFeature == null) {
				continue;
			}

			IInstanceRef instanceRef = (IInstanceRef) eObject.eGet(eIrefFeature);
			Optional<IInstanceObject> referred = resolveInstance(instanceRef);
			if (!referred.isPresent()) {
				throw new InternalPersistException("The referenced object " + ModelLabels.getLabelOfInstanceRef(instanceRef) + " does not exist for the parameter '" + eReference.getName() + "' of "
						+ ModelLabels.getLabel(eObject) + ".");
			}
			if (!eReference.getEType().isInstance(referred.get())) { // ���̤ã���Զ����Τ���ã��
				throw new InternalPersistException("The referenced object " + ModelLabels.getLabelOfInstanceRef(instanceRef) + " is not typed with " + eReference.getEType().getName()
						+ " for the parameter '" + eReference.getName() + "' of " + ModelLabels.getLabel(eObject) + ".");
			}
			if (eReference.isMany()) { // COVERAGE ���false(�����Υġ������ե��Ǥ�true���̤�ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
				@SuppressWarnings("unchecked")
				EList<EObject> list = (EList<EObject>) eObject.eGet(eReference);
				list.add(referred.get());
			} else {
				eObject.eSet(eReference, referred.get());
			}
		}
	}

	private void buildModelIds() {
		int idIndex = 1;
		for (InstanceReferrable instanceReferrable : this.query.<InstanceReferrable> findByKind(INSTANCE_REFERRABLE)) {
			instanceReferrable.setId(InstanceModelUtils.ID_PREFIX + instanceReferrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}

}
