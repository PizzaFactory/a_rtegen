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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;

import java.math.BigDecimal;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArrayValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.NumericalValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RecordValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.TextValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import org.eclipse.emf.common.util.EList;

import com.google.common.base.Optional;

public class IocCommunicationModelBuilder {

	private final ModuleModelBuildContext context;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;

	public IocCommunicationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
	}

	public void build() throws ModelException {
		buildSenderReceiverIocCommunications(this.context.cache.rte);
		buildComProxyIocCommunications(this.context.cache.rte);
	}

	private void buildSenderReceiverIocCommunications(Rte targetRte) throws ModelException {
		for (IocValueBufferImplementation iocValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			InternalEcuReceiver receiver = iocValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);

			if (receiver.getSource().getPrototype().isEventSemantics()) {
				buildIocQueuedCommunication(targetRte, iocValueBufferImplementation);
			} else {
				buildIocNonqueuedCommunication(targetRte, iocValueBufferImplementation);
			}
		}
	}

	private boolean buildIocQueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		return targetRte.getDependentIocCommunication().add(createIocQueuedCommunication(sourceValueBufferImplementation));
	}

	private IocQueuedCommunication createIocQueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		IocQueuedCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();

		IocReceiveApi iocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		iocReceiveApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		iocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		iocReceiveApi.setMappingName(SymbolNames.createIocReceiveApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(iocReceiveApi, sourceValueBufferImplementation.getOsIocCommunication());
		iocCommunication.setReceiveApi(iocReceiveApi);

		IocEmptyQueueApi iocEmptyQueueApi = ModuleFactory.eINSTANCE.createIocEmptyQueueApi();
		iocEmptyQueueApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		iocEmptyQueueApi.setSymbolName(SymbolNames.createIocEmptyQueueApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		iocEmptyQueueApi.setMappingName(SymbolNames.createIocEmptyQueueApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		iocEmptyQueueApi.setReturnType(this.context.cache.osStatusType);
		iocCommunication.setIocEmptyQueueApi(iocEmptyQueueApi);

		for (OsIocSenderProperties osIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocSendApi iocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
			iocSendApi.setSingleSource(osIocSenderProperties);
			iocSendApi.setSymbolName(SymbolNames.createIocSendApiName(osIocSenderProperties));
			iocSendApi.setMappingName(SymbolNames.createIocSendApiMappingName(osIocSenderProperties));
			buildSenderIocApiSignature(iocSendApi, sourceValueBufferImplementation.getOsIocCommunication());
			iocCommunication.getSendApi().add(iocSendApi);
		}
		return iocCommunication;
	}

	private void buildIocNonqueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		OsIocDataProperties osIocDataProperties = sourceValueBufferImplementation.getOsIocCommunication().getOsIocDataProperties().get(0);
		Type type = this.context.builtQuery.findDest(TYPE, osIocDataProperties.getOsIocDataType());

		// IOC���������ι���
		Constant initValueConstant = createIocInitValueConstant(sourceValueBufferImplementation, osIocDataProperties, type);
		targetRte.getIocInitValueConstant().add(initValueConstant);
	 	
		// IOCϢ�Ȥι���
		IocNonqueuedCommunication iocCommunication = createIocNonqueuedCommunication(sourceValueBufferImplementation, initValueConstant);
		targetRte.getDependentIocCommunication().add(iocCommunication);
	}

	private IocNonqueuedCommunication createIocNonqueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation, Constant initValueConstant) throws ModelException {
		IocNonqueuedCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocNonqueuedCommunication();
		iocCommunication.setInitValue(initValueConstant);

		IocReadApi iocReadApi = ModuleFactory.eINSTANCE.createIocReadApi();
		iocReadApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		iocReadApi.setSymbolName(SymbolNames.createIocReadApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		iocReadApi.setMappingName(SymbolNames.createIocReadApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(iocReadApi, sourceValueBufferImplementation.getOsIocCommunication());
		iocCommunication.setReadApi(iocReadApi);

		for (OsIocSenderProperties osIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocWriteApi iocWriteApi = ModuleFactory.eINSTANCE.createIocWriteApi();
			iocWriteApi.setSingleSource(osIocSenderProperties);
			iocWriteApi.setSymbolName(SymbolNames.createIocWriteApiName(osIocSenderProperties));
			iocWriteApi.setMappingName(SymbolNames.createIocWriteApiMappingName(osIocSenderProperties));
			buildSenderIocApiSignature(iocWriteApi, sourceValueBufferImplementation.getOsIocCommunication());
			iocCommunication.getWriteApi().add(iocWriteApi);
		}
		if (!initValueConstant.getMember().isEmpty()) {
			ReceiveInteraction receiveInteraction = sourceValueBufferImplementation.getParent();
			InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);

			MemoryMappingModelBuilder memmapBuilder = new MemoryMappingModelBuilder(this.context);
			GlobalVariable initValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
			initValueVariable.setSymbolName(SymbolNames.createRteBufferInitValueVariableName(receiver.getSource()));
			initValueVariable.setHasConst(false);
			initValueVariable.setHasStatic(false);
			initValueVariable.setType(initValueConstant.getType());
			initValueVariable.setInitValueConstant(initValueConstant);
			initValueVariable.setInitAtDefinition(true);
			initValueVariable.setMemoryMapping(memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0).getSource()));
			initValueConstant.setRepresentedVariableName(initValueVariable.getSymbolName());
			iocCommunication.setInitValueVariable(initValueVariable);

			RteBufferVariableSet rteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
			Optional<EcucPartition> masterBswPartition = context.query.tryFindSingle(hasOp(ECUC_PARTITION_EX___IS_MASTER_BSW_PARTITION__ECUCPARTITION, true));
			Partition targetPartition = this.context.builtQuery.findPartition(masterBswPartition.get());
			rteBuffer.setInitValueVariable(initValueVariable);
			rteBuffer.setHasConst(false);
			rteBuffer.setHasStatic(false);
			targetPartition.getRteBufferVariableSet().add(rteBuffer);
		}

		return iocCommunication;
	}

	private Constant createIocInitValueConstant(IocValueBufferImplementation sourceValueBufferImplementation, OsIocDataProperties osIocDataProperties, Type type) throws ModelException {
		Constant initValueConstant = ModuleFactory.eINSTANCE.createConstant();
		initValueConstant.setSymbolName(SymbolNames.createIocInitValueConstantName(sourceValueBufferImplementation.getOsIocCommunication()));
		initValueConstant.setType(type);
		ValueSpecification initValue = createValueSpecification(type, osIocDataProperties.getOsIocInitValue());
		this.localSymbolModelBuilder.setupConstant(initValueConstant, type, initValue);
		return initValueConstant;
	}

	private ValueSpecification createValueSpecification(Type type, String osIocInitValue) throws ModelException {
		// TODO ����Ū�ˤ�¿�����ˤ��б� ex. {1, {2, 3}, 4}
		if (type instanceof ArrayType) {
			ArrayValueSpecification value = M2Factory.eINSTANCE.createArrayValueSpecification();
			createValueSpecificationMembers(value.getElement(), osIocInitValue);
			return value;
		} else if (type instanceof StructType || type instanceof UnionType) {
			RecordValueSpecification value = M2Factory.eINSTANCE.createRecordValueSpecification();
			createValueSpecificationMembers(value.getField(), osIocInitValue);
			return value;
		} else {
			return createValueSpecification(osIocInitValue);
		}
	}

	private void createValueSpecificationMembers(EList<ValueSpecification> members, String osIocInitValue) throws ModelException {
		int from = osIocInitValue.indexOf("{", 0);
		int to = osIocInitValue.lastIndexOf("}", osIocInitValue.length() - 1);
		if (from == -1 || to <= from) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("Error occurred while parsing OsIocInitValue.");
		}
		osIocInitValue = osIocInitValue.substring(from + 1, to);
		
		String[] values = osIocInitValue.split(",");
		for (int i = 0; i < values.length; i++) {
			members.add(createValueSpecification(values[i]));
		}
	}
	
	private ValueSpecification createValueSpecification(String valueString) {
		try {
			BigDecimal numerical = M2ModelUtils.parseNumerical(valueString);
			NumericalValueSpecification value = M2Factory.eINSTANCE.createNumericalValueSpecification();
			value.setValue(numerical);
			return value;
		} catch(Exception e) {
			// BigDecimal���Ѵ���ǽ�ʤ顢TextValueSpecification���������
			TextValueSpecification value = M2Factory.eINSTANCE.createTextValueSpecification();
			value.setValue(valueString);
			return value;
		}
	}

	private void buildComProxyIocCommunications(Rte targetRte) throws ModelException {
		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			Type type = this.context.builtQuery.findType(proxyInteraction.getSignalDataType());
			if (type instanceof PrimitiveType) {
				createIocQueuedGroupCommunication(targetRte, proxyInteraction);
			} else {
				createIocQueuedCommunication(targetRte, proxyInteraction);
			}
		}
	}

	private void createIocQueuedGroupCommunication(Rte targetRte, ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		IocQueuedGroupCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocQueuedGroupCommunication();

		IocReceiveGroupApi iocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveGroupApi();
		iocReceiveApi.setSingleSource(sourceProxyInteraction.getOsIocCommunication());
		iocReceiveApi.setSymbolName(SymbolNames.createIocReceiveGroupApiName(sourceProxyInteraction.getOsIocCommunication()));
		iocReceiveApi.setMappingName(SymbolNames.createIocReceiveGroupApiMappingName(sourceProxyInteraction.getOsIocCommunication()));
		buildReceiverIocApiSignature(iocReceiveApi, sourceProxyInteraction.getOsIocCommunication());
		iocCommunication.setReceiveApi(iocReceiveApi);

		// ���롼���̿��Ǥ������ץ�ѥƥ���ɬ��1��
		OsIocSenderProperties osIocSenderProperties = sourceProxyInteraction.getOsIocCommunication().getOsIocSenderProperties().get(0);
		IocSendGroupApi iocSendApi = ModuleFactory.eINSTANCE.createIocSendGroupApi();
		iocSendApi.setSingleSource(osIocSenderProperties);
		iocSendApi.setSymbolName(SymbolNames.createIocSendGroupApiName(osIocSenderProperties));
		iocSendApi.setMappingName(SymbolNames.createIocSendGroupApiMappingName(osIocSenderProperties));
		buildSenderIocApiSignature(iocSendApi, sourceProxyInteraction.getOsIocCommunication());
		iocCommunication.setSendApi(iocSendApi);

		targetRte.getDependentIocCommunication().add(iocCommunication);
	}

	private void createIocQueuedCommunication(Rte targetRte, ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		// �ؿ��ơ��֥���
		IocQueuedCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();
		IocReceiveApi iocReceiveApi = createIocReceiveApi(sourceProxyInteraction.getOsIocCommunication());
		iocCommunication.setReceiveApi(iocReceiveApi);
		IocSendApi iocSendApi = createIocSendApi(sourceProxyInteraction.getOsIocCommunication());
		iocCommunication.getSendApi().add(iocSendApi);
		targetRte.getDependentIocCommunication().add(iocCommunication);

		// �ͤ������
		createIocCommunication(targetRte, sourceProxyInteraction.getOsIocCommunicationForComplexValue());
	}

	private void createIocCommunication(Rte targetRte, OsIocCommunication iocCom) throws ModelException {
		IocQueuedCommunication iocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();
		iocCommunication.setReceiveApi(createIocReceiveApi(iocCom));
		iocCommunication.getSendApi().add(createIocSendApi(iocCom));
		targetRte.getDependentIocCommunication().add(iocCommunication);
	}

	private IocReceiveApi createIocReceiveApi(OsIocCommunication osIocCommunication) throws ModelException {
		IocReceiveApi iocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		iocReceiveApi.setSingleSource(osIocCommunication);
		iocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(osIocCommunication));
		iocReceiveApi.setMappingName(SymbolNames.createIocReceiveApiMappingName(osIocCommunication));
		buildReceiverIocApiSignature(iocReceiveApi, osIocCommunication);
		return iocReceiveApi;
	}

	private IocSendApi createIocSendApi(OsIocCommunication osIocCommunication) throws ModelException {
		// Complex�ѤǤ������ץ�ѥƥ���ɬ��1��
		IocSendApi iocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
		OsIocSenderProperties osIocSenderProperties = osIocCommunication.getOsIocSenderProperties().get(0);
		iocSendApi.setSingleSource(osIocSenderProperties);
		iocSendApi.setSymbolName(SymbolNames.createIocSendApiName(osIocSenderProperties));
		iocSendApi.setMappingName(SymbolNames.createIocSendApiMappingName(osIocSenderProperties));
		buildSenderIocApiSignature(iocSendApi, osIocCommunication);
		return iocSendApi;
	}

	private void buildReceiverIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties osIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(createIocParam(osIocDataProperties, ParameterPassTypeEnum.REFERENCE));
		}
	}

	private void buildSenderIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties osIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(createIocParam(osIocDataProperties, localSymbolModelBuilder.getInParameterPassType(this.context.builtQuery.findType(osIocDataProperties.getOsIocDataType()))));
		}
	}

	private Parameter createIocParam(OsIocDataProperties osIocDataProperties, ParameterPassTypeEnum type) throws ModelException {
		Parameter iocParam = ModuleFactory.eINSTANCE.createParameter();
		iocParam.setSymbolName(osIocDataProperties.getShortName());
		iocParam.setType(this.context.builtQuery.findType(osIocDataProperties.getOsIocDataType()));
		iocParam.setPassType(type);
		return iocParam;
	}
}
