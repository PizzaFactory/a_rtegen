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

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocDataProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocSenderProperties;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import com.google.common.base.Optional;

/**
 * RTE����¸����IOC�̿��Υ�ǥ���ۤ��롣
 */
public class IocCommunicationModelBuilder {

	final ModuleModelBuildContext context;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;
	private final MemoryMappingModelBuilder memmapBuilder;

	public IocCommunicationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
		this.memmapBuilder = new MemoryMappingModelBuilder(this.context);
	}

	public void build() throws ModelException {
		buildSrInterPartitionIocCommunications(this.context.cache.rte);
		buildComProxyIocCommunications(this.context.cache.rte);
	}

	private void buildSrInterPartitionIocCommunications(Rte targetRte) throws ModelException {
		for (IocValueBufferImplementation sourceIocValueBufferImplementation : this.context.query.<IocValueBufferImplementation> findByKind(IOC_VALUE_BUFFER_IMPLEMENTATION)) {
			InternalEcuReceiver sourceReceiver = sourceIocValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);

			if (sourceReceiver.getSource().getPrototype().isEventSemantics()) {
				buildSrInterPartitionIocQueuedCommunication(targetRte, sourceIocValueBufferImplementation);
			} else {
				buildSrInterPartitionIocNonqueuedCommunication(targetRte, sourceIocValueBufferImplementation);
			}
		}
	}

	private void buildSrInterPartitionIocQueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		targetRte.getDependentIocCommunication().add(createSrInterPartitionIocQueuedCommunication(sourceValueBufferImplementation));
	}

	private IocQueuedCommunication createSrInterPartitionIocQueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		IocQueuedCommunication destIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();

		IocReceiveApi destIocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		destIocReceiveApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		destIocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocReceiveApi.setMappingName(SymbolNames.createIocReceiveApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(destIocReceiveApi, sourceValueBufferImplementation.getOsIocCommunication());
		destIocCommunication.setReceiveApi(destIocReceiveApi);

		IocEmptyQueueApi destIocEmptyQueueApi = ModuleFactory.eINSTANCE.createIocEmptyQueueApi();
		destIocEmptyQueueApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		destIocEmptyQueueApi.setSymbolName(SymbolNames.createIocEmptyQueueApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocEmptyQueueApi.setMappingName(SymbolNames.createIocEmptyQueueApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocEmptyQueueApi.setReturnType(this.context.cache.osStatusType);
		destIocCommunication.setIocEmptyQueueApi(destIocEmptyQueueApi);

		for (OsIocSenderProperties sourceOsIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocSendApi destIocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
			destIocSendApi.setSingleSource(sourceOsIocSenderProperties);
			destIocSendApi.setSymbolName(SymbolNames.createIocSendApiName(sourceOsIocSenderProperties));
			destIocSendApi.setMappingName(SymbolNames.createIocSendApiMappingName(sourceOsIocSenderProperties));
			buildSenderIocApiSignature(destIocSendApi, sourceValueBufferImplementation.getOsIocCommunication());
			destIocCommunication.getSendApi().add(destIocSendApi);
		}
		return destIocCommunication;
	}

	private void buildSrInterPartitionIocNonqueuedCommunication(Rte targetRte, IocValueBufferImplementation sourceValueBufferImplementation) throws ModelException {
		OsIocDataProperties sourceOsIocDataProperties = sourceValueBufferImplementation.getOsIocCommunication().getOsIocDataProperties().get(0);

		Type type = this.context.builtQuery.findDest(TYPE, sourceOsIocDataProperties.getOsIocDataType());

		// IOC���������ι���
		Constant destInitValueConstant = createSrInterPartitionIocInitValueConstant(sourceValueBufferImplementation, sourceOsIocDataProperties, type);
		targetRte.getIocInitValueConstant().add(destInitValueConstant);

		// IOCϢ�Ȥι���
		IocNonqueuedCommunication destIocCommunication = createSrInterPartitionIocNonqueuedCommunication(sourceValueBufferImplementation, destInitValueConstant);
		targetRte.getDependentIocCommunication().add(destIocCommunication);
	}

	private IocNonqueuedCommunication createSrInterPartitionIocNonqueuedCommunication(IocValueBufferImplementation sourceValueBufferImplementation, Constant initValueConstant) throws ModelException {
		IocNonqueuedCommunication destIocCommunication = ModuleFactory.eINSTANCE.createIocNonqueuedCommunication();

		IocReadApi destIocReadApi = ModuleFactory.eINSTANCE.createIocReadApi();
		destIocReadApi.setSingleSource(sourceValueBufferImplementation.getOsIocCommunication());
		destIocReadApi.setSymbolName(SymbolNames.createIocReadApiName(sourceValueBufferImplementation.getOsIocCommunication()));
		destIocReadApi.setMappingName(SymbolNames.createIocReadApiMappingName(sourceValueBufferImplementation.getOsIocCommunication()));
		buildReceiverIocApiSignature(destIocReadApi, sourceValueBufferImplementation.getOsIocCommunication());
		destIocCommunication.setReadApi(destIocReadApi);

		for (OsIocSenderProperties sourceOsIocSenderProperties : sourceValueBufferImplementation.getOsIocCommunication().getOsIocSenderProperties()) {
			IocWriteApi destIocWriteApi = ModuleFactory.eINSTANCE.createIocWriteApi();
			destIocWriteApi.setSingleSource(sourceOsIocSenderProperties);
			destIocWriteApi.setSymbolName(SymbolNames.createIocWriteApiName(sourceOsIocSenderProperties));
			destIocWriteApi.setMappingName(SymbolNames.createIocWriteApiMappingName(sourceOsIocSenderProperties));
			buildSenderIocApiSignature(destIocWriteApi, sourceValueBufferImplementation.getOsIocCommunication());
			destIocCommunication.getWriteApi().add(destIocWriteApi);
		}

		destIocCommunication.setInitValue(initValueConstant);

		// ʣ��ǡ����������ν�����������
		if (!initValueConstant.getMember().isEmpty()) {
			Optional<EcucPartition> sourcePartition = Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition());
			InternalEcuReceiver sourceReceiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition sourceDataInstanceInComposition = sourceReceiver.getSource();

			Rte targetRte = this.context.cache.rte;

			GlobalVariable destInitValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
			destInitValueVariable.setSymbolName(SymbolNames.createSrRteBufferInitValueVariableName(sourceDataInstanceInComposition));
			destInitValueVariable.setHasConst(false);
			destInitValueVariable.setHasStatic(false);
			destInitValueVariable.setType(initValueConstant.getType());
			destInitValueVariable.setInitValueConstant(initValueConstant);
			destInitValueVariable.setInitAtDefinition(true);
			destInitValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataInstanceInComposition));

			RteBufferVariableSet destInitValueVariableSet = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
			destInitValueVariableSet.setInitValueVariable(destInitValueVariable);
			targetRte.getIocInitValueVariableSet().add(destInitValueVariableSet);

			// IOC�̿�������������Constant�ȴ�Ϣ��
			destIocCommunication.setInitValueVariable(destInitValueVariable);
			initValueConstant.setRepresentedVariableName(destInitValueVariable.getSymbolName());
		}

		return destIocCommunication;
	}

	private Constant createSrInterPartitionIocInitValueConstant(IocValueBufferImplementation sourceValueBufferImplementation, OsIocDataProperties sourceOsIocDataProperties, Type type) throws ModelException {
		ValueSpecification sourceInitValue = parseAsValueSpecification(type, sourceOsIocDataProperties.getOsIocInitValue());

		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSymbolName(SymbolNames.createIocInitValueConstantName(sourceValueBufferImplementation.getOsIocCommunication()));
		destInitValueConstant.setType(type);
		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	private ValueSpecification parseAsValueSpecification(Type type, String osIocInitValue) throws ModelException {
		if (type instanceof ArrayType) {
			ArrayValueSpecification value = M2Factory.eINSTANCE.createArrayValueSpecification();
			value.getElement().addAll(parseAsPrimitiveValueSpecifications(osIocInitValue));
			return value;
		} else if (type instanceof StructType || type instanceof UnionType) {
			RecordValueSpecification value = M2Factory.eINSTANCE.createRecordValueSpecification();
			value.getField().addAll(parseAsPrimitiveValueSpecifications(osIocInitValue));
			return value;
		} else {
			return parseAsPrimitiveValueSpecification(osIocInitValue);
		}
	}

	private List<ValueSpecification> parseAsPrimitiveValueSpecifications(String osIocInitValue) throws ModelException {
		List<ValueSpecification> values = new ArrayList<ValueSpecification>();

		int from = osIocInitValue.indexOf("{", 0);
		int to = osIocInitValue.lastIndexOf("}", osIocInitValue.length() - 1);
		if (from == -1 || to <= from) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("Error occurred while parsing OsIocInitValue.");
		}
		String trimmedOsIocInitValue = osIocInitValue.substring(from + 1, to);

		String[] valueStrings = trimmedOsIocInitValue.split(",");
		for (String valueString : valueStrings) {
			values.add(parseAsPrimitiveValueSpecification(valueString));
		}
		return values;
	}

	private ValueSpecification parseAsPrimitiveValueSpecification(String valueString) {
		try {
			BigDecimal numerical = M2ModelUtils.parseNumerical(valueString);
			NumericalValueSpecification value = M2Factory.eINSTANCE.createNumericalValueSpecification();
			value.setValue(numerical);
			return value;
		} catch (Exception e) {
			// BigDecimal���Ѵ���ǽ�ʤ顢TextValueSpecification���������
			TextValueSpecification value = M2Factory.eINSTANCE.createTextValueSpecification();
			value.setValue(valueString);
			return value;
		}
	}

	private void buildComProxyIocCommunications(Rte targetRte) throws ModelException {
		for (ComSendProxyInteraction sourceProxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			if (sourceProxyInteraction.getSignalDataType().isPrimitiveType()) {
				buildComProxyIocCommunicationForPrimitiveType(targetRte, sourceProxyInteraction);
			} else {
				buildComProxyIocCommunicationForComplexType(targetRte, sourceProxyInteraction);
			}
		}
	}

	private void buildComProxyIocCommunicationForPrimitiveType(Rte targetRte, ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		// NOTE ���롼���̿��Ǥ������ץ�ѥƥ���ɬ��1��
		OsIocSenderProperties sourceOsIocSenderProperties = sourceProxyInteraction.getRequestOsIocCommunication().getOsIocSenderProperties().get(0);

		IocQueuedGroupCommunication destIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedGroupCommunication();

		IocReceiveGroupApi destIocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveGroupApi();
		destIocReceiveApi.setSingleSource(sourceProxyInteraction.getRequestOsIocCommunication());
		destIocReceiveApi.setSymbolName(SymbolNames.createIocReceiveGroupApiName(sourceProxyInteraction.getRequestOsIocCommunication()));
		destIocReceiveApi.setMappingName(SymbolNames.createIocReceiveGroupApiMappingName(sourceProxyInteraction.getRequestOsIocCommunication()));
		buildReceiverIocApiSignature(destIocReceiveApi, sourceProxyInteraction.getRequestOsIocCommunication());
		destIocCommunication.setReceiveApi(destIocReceiveApi);

		IocSendGroupApi destIocSendApi = ModuleFactory.eINSTANCE.createIocSendGroupApi();
		destIocSendApi.setSingleSource(sourceOsIocSenderProperties);
		destIocSendApi.setSymbolName(SymbolNames.createIocSendGroupApiName(sourceOsIocSenderProperties));
		destIocSendApi.setMappingName(SymbolNames.createIocSendGroupApiMappingName(sourceOsIocSenderProperties));
		buildSenderIocApiSignature(destIocSendApi, sourceProxyInteraction.getRequestOsIocCommunication());
		destIocCommunication.setSendApi(destIocSendApi);

		targetRte.getDependentIocCommunication().add(destIocCommunication);
	}

	private void buildComProxyIocCommunicationForComplexType(Rte targetRte, ComSendProxyInteraction sourceProxyInteraction) throws ModelException {
		// COM�ץ��������׵���
		OsIocCommunication sourceRequestOsIocCommunication = sourceProxyInteraction.getRequestOsIocCommunication();

		IocQueuedCommunication destRequestIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();
		destRequestIocCommunication.setReceiveApi(createIocReceiveApi(sourceRequestOsIocCommunication));
		destRequestIocCommunication.getSendApi().add(createIocSendApi(sourceRequestOsIocCommunication));
		targetRte.getDependentIocCommunication().add(destRequestIocCommunication);

		// �ͤ������
		OsIocCommunication sourceValueOsIocCommunication = sourceProxyInteraction.getValueOsIocCommunicationForComplexType();

		IocQueuedCommunication destValueIocCommunication = ModuleFactory.eINSTANCE.createIocQueuedCommunication();
		destValueIocCommunication.setReceiveApi(createIocReceiveApi(sourceValueOsIocCommunication));
		destValueIocCommunication.getSendApi().add(createIocSendApi(sourceValueOsIocCommunication));
		targetRte.getDependentIocCommunication().add(destValueIocCommunication);
	}

	private IocReceiveApi createIocReceiveApi(OsIocCommunication sourceOsIocCommunication) throws ModelException {
		IocReceiveApi destIocReceiveApi = ModuleFactory.eINSTANCE.createIocReceiveApi();
		destIocReceiveApi.setSingleSource(sourceOsIocCommunication);
		destIocReceiveApi.setSymbolName(SymbolNames.createIocReceiveApiName(sourceOsIocCommunication));
		destIocReceiveApi.setMappingName(SymbolNames.createIocReceiveApiMappingName(sourceOsIocCommunication));
		buildReceiverIocApiSignature(destIocReceiveApi, sourceOsIocCommunication);
		return destIocReceiveApi;
	}

	private IocSendApi createIocSendApi(OsIocCommunication sourceOsIocCommunication) throws ModelException {
		// NOTE Complex�ѤǤ������ץ�ѥƥ���ɬ��1��
		OsIocSenderProperties sourceOsIocSenderProperties = sourceOsIocCommunication.getOsIocSenderProperties().get(0);

		IocSendApi destIocSendApi = ModuleFactory.eINSTANCE.createIocSendApi();
		destIocSendApi.setSingleSource(sourceOsIocSenderProperties);
		destIocSendApi.setSymbolName(SymbolNames.createIocSendApiName(sourceOsIocSenderProperties));
		destIocSendApi.setMappingName(SymbolNames.createIocSendApiMappingName(sourceOsIocSenderProperties));
		buildSenderIocApiSignature(destIocSendApi, sourceOsIocCommunication);
		return destIocSendApi;
	}

	private void buildReceiverIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties sourceOsIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(this.localSymbolModelBuilder.createIocOutDataParam(sourceOsIocDataProperties));
		}
	}

	private void buildSenderIocApiSignature(IocApi targetIocApi, OsIocCommunication sourceOsIocCommunication) throws ModelException {
		targetIocApi.setReturnType(this.context.cache.osStatusType);
		for (OsIocDataProperties sourceOsIocDataProperties : sourceOsIocCommunication.getOsIocDataProperties()) {
			targetIocApi.getParam().add(this.localSymbolModelBuilder.createIocInDataParam(sourceOsIocDataProperties));
		}
	}
}
