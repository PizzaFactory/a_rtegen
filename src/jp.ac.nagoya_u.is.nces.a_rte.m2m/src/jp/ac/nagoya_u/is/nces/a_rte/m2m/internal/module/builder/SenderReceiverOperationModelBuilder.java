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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERACTION_END__OWNER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_RECEIVE_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.COM_SEND_SIGNAL_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_READ_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_RECEIVE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_SEND_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_SEND_GROUP_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.OS_SET_EVENT_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_QUEUED_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_WRITE_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.DirectComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionRteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

public class SenderReceiverOperationModelBuilder {

	private final ModuleModelBuildContext context;
	private ExcludeOperationModelBuilder excludeOperationBuilder;

	public SenderReceiverOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public RteBufferNonqueuedReadOperation createRteBufferNonqueuedReadOperation(ReceiveInteraction sourceReceiveInteraction, Parameter dataParam, LocalVariable returnValueVariable)
			throws ModelException {
		RteBufferVariableSet rteBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceReceiveInteraction.getValueBufferImplementation());

		RteBufferNonqueuedReadOperation rteBufferNonqueuedReadOperation = ModuleFactory.eINSTANCE.createRteBufferNonqueuedReadOperation();
		buildReadOperation(rteBufferNonqueuedReadOperation, dataParam, returnValueVariable);
		rteBufferNonqueuedReadOperation.setAccessVariable(rteBuffer);
		if (rteBuffer.getStatusVariable() != null) {
			rteBufferNonqueuedReadOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceReceiveInteraction.receivesInterCore()));
		}
		return rteBufferNonqueuedReadOperation;
	}

	public RteBufferQueuedReadOperation createRteBufferQueuedReadOperation(ReceiveInteraction sourceReceiveInteraction, Parameter dataParam, LocalVariable returnValueVariable) throws ModelException {
		RteBufferQueuedVariable queuedVariable = this.context.builtQuery.findDest(RTE_BUFFER_QUEUED_VARIABLE, sourceReceiveInteraction.getValueBufferImplementation());

		RteBufferQueuedReadOperation rteBufferQueuedReadOperation = ModuleFactory.eINSTANCE.createRteBufferQueuedReadOperation();
		buildReadOperation(rteBufferQueuedReadOperation, dataParam, returnValueVariable);
		rteBufferQueuedReadOperation.setAccessVariable(queuedVariable);
		rteBufferQueuedReadOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceReceiveInteraction.receivesInterCore()));
		return rteBufferQueuedReadOperation;
	}

	public IocNonqueuedReadOperation createIocNonqueuedReadOperation(IocValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable)
			throws ModelException {
		IocReadApi iocReadApi = this.context.builtQuery.findDest(IOC_READ_API, sourceValueBufferImplementation.getOsIocCommunication());

		IocNonqueuedReadOperation iocNonqueuedReadOperation = ModuleFactory.eINSTANCE.createIocNonqueuedReadOperation();
		buildReadOperation(iocNonqueuedReadOperation, dataParam, returnValueVariable);
		iocNonqueuedReadOperation.setAccessApi(iocReadApi);
		return iocNonqueuedReadOperation;
	}

	public IocQueuedReadOperation createIocQueuedReceiveOperation(IocValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable)
			throws ModelException {
		IocReceiveApi iocReceiveApi = this.context.builtQuery.findDest(IOC_RECEIVE_API, sourceValueBufferImplementation.getOsIocCommunication());

		IocQueuedReadOperation iocQueuedReceiveOperation = ModuleFactory.eINSTANCE.createIocQueuedReadOperation();
		buildReadOperation(iocQueuedReceiveOperation, dataParam, returnValueVariable);
		iocQueuedReceiveOperation.setAccessApi(iocReceiveApi);
		return iocQueuedReceiveOperation;
	}

	public ComReadOperation createComReadOperation(ComValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable) throws ModelException {
		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, sourceValueBufferImplementation.getComSignal());

		ComReadOperation comReadOperation = ModuleFactory.eINSTANCE.createComReadOperation();
		buildReadOperation(comReadOperation, dataParam, returnValueVariable);
		comReadOperation.setAccessApi(comReceiveSignalApi);
		return comReadOperation;
	}

	public NeverReadOperation createNeverReadOperation(RVariableDataInstanceInSwc sourceDataInstanceInSwc, Parameter dataParam) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.IMPL_INIT_VALUE);

		NeverReadOperation readOperation = ModuleFactory.eINSTANCE.createNeverReadOperation();
		buildReadOperation(readOperation, dataParam, null);
		readOperation.setInitValueConstant(initValueConstant);
		return readOperation;
	}

	private void buildReadOperation(ReadOperation targetReadOperation, Parameter dataParam, LocalVariable returnValueVariable) {
		targetReadOperation.setReadValueVariable(dataParam);
		targetReadOperation.setReadStatusVariable(returnValueVariable);
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForWriteApi(SendInteraction sourceSendInteraction, Parameter dataParam, LocalVariable filterResultVariable)
			throws ModelException {
		RteBufferNonqueuedSendOperation rteNonqueuedSendOperation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, dataParam, this.context.cache.rteErrorOkConstant);
	
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstanceInSwc1 = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
		if (dataInstanceInSwc1.isFilterEnabled()) {
			rteNonqueuedSendOperation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
		}

		buildExcludeOperation(rteNonqueuedSendOperation, sourceSendInteraction);
		return rteNonqueuedSendOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForInvalidateApi(SendInteraction sourceSendInteraction, Constant invalidValueConstant, LocalVariable filterResultVariable)
			throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
	
		RteBufferNonqueuedSendOperation operation;

		HandleInvalidEnum handleInvalid = rDataInstanceInSwc.isInvalidationEnabled() ? rDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE;
		switch (handleInvalid) {
		case KEEP: {
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, receiveInteraction.getValueBufferImplementation());
	
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, initValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (rDataInstanceInSwc.isFilterEnabled()) {
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		default: {
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (rDataInstanceInSwc.isFilterEnabled()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		}

		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComReceiveCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender, LocalVariable dataVariable, LocalVariable filterResultVariable) throws ModelException {
		RteBufferNonqueuedSendOperation operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, dataVariable,
				this.context.cache.rteErrorOkConstant);
	
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
		if (dataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) {
			operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
		}
	
		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComInvalidateCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender, LocalVariable filterResultVariable)
			throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
	
		RteBufferNonqueuedSendOperation operation;

		HandleInvalidEnum handleInvalid = dataInstanceInSwc.isInvalidationEnabled() ? dataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE; // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		switch (handleInvalid) {
		case KEEP: {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, dataInstanceInSwc, RoleNames.INVALID_VALUE);
	
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, receiveInteraction.getValueBufferImplementation());
	
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, initValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (dataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) {
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		default: {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, dataInstanceInSwc, RoleNames.INVALID_VALUE);
	
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (dataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		}
		
		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComReceiveTimeoutCallback(SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue) throws ModelException {
		RteBufferNonqueuedSendOperation operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, sendValue, sendStatusValue);
		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForWriteTrustedFunction(SendInteraction sourceSendInteraction, LocalVariable dataVariable, LocalVariable filterResultVariable) throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
	
		RteBufferNonqueuedSendOperation operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, dataVariable, this.context.cache.rteErrorOkConstant);
		if (rDataInstanceInSwc.isFilterEnabled()) {
			operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
		}

		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForInvalidateTrustedFunction(SendInteraction sourceSendInteraction, LocalVariable filterResultVariable) throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
		
		HandleInvalidEnum handleInvalid = rDataInstanceInSwc.isInvalidationEnabled() ? rDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE; // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, rDataInstanceInSwc, RoleNames.INVALID_VALUE);
	
		RteBufferNonqueuedSendOperation operation;
		switch (handleInvalid) {
		case KEEP: {
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, receiveInteraction.getValueBufferImplementation());
	
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, initValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (rDataInstanceInSwc.isFilterEnabled()) {
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		default: {
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (rDataInstanceInSwc.isFilterEnabled()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		}

		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	private RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation(SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue) throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		RteBufferVariableSet rteBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, receiveInteraction.getValueBufferImplementation());

		RteBufferNonqueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createRteBufferNonqueuedSendOperation();
		sendOperation.setSingleSource(sourceSendInteraction);
		sendOperation.setAccessVariable(rteBuffer);
		sendOperation.setSendValue(sendValue);
		if (rteBuffer.getStatusVariable() != null) {
			sendOperation.setSendStatus(sendStatusValue);
		}
		return sendOperation;
	}

	private void buildExcludeOperation(RteBufferNonqueuedSendOperation targetSendOperation, SendInteraction sourceSendInteraction) {
		if (targetSendOperation.getAccessVariable().getStatusVariable() != null || targetSendOperation.getFilterOperation() != null) {
			targetSendOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceSendInteraction.getReceiveInteraction().receivesInterCore()));
		}
	}

	public TrustedFunctionRteBufferWriteSendOperation createTrustedFunctionRteBufferWriteSendOperation(TrustedFunctionRteSendImplementation sourceSendImplementation,
			Variable dataVariable, Variable returnValueVariable) throws ModelException {
		RteBufferWriteTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_WRITE_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferWriteSendOperation sendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferWriteSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessTrustedFunction(trustedFunction);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setReturnVariable(returnValueVariable);
		return sendOperation;
	}

	public TrustedFunctionRteBufferInvalidateSendOperation createTrustedFunctionRteBufferInvalidateSendOperation(SendInteraction sourceSendInteraction,
			TrustedFunctionRteSendImplementation sourceSendImplementation, Variable returnValueVariable) throws ModelException {
		RteBufferInvalidateTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferInvalidateSendOperation sendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferInvalidateSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessTrustedFunction(trustedFunction);
		sendOperation.setReturnVariable(returnValueVariable);
		return sendOperation;
	}

	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperation(SendInteraction sourceSendInteraction, Variable dataVariable) throws ModelException {
		return createRteBufferQueuedSendOperation(sourceSendInteraction, dataVariable, null, null);
	}

	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperation(SendInteraction sourceSendInteraction, Variable dataVariable, Variable returnValueVariable, Variable tempReturnValueVariable)
			throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		RteBufferQueuedVariable queuedVariable = this.context.builtQuery.findDest(RTE_BUFFER_QUEUED_VARIABLE, receiveInteraction.getValueBufferImplementation());

		RteBufferQueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createRteBufferQueuedSendOperation();
		sendOperation.setSingleSource(sourceSendInteraction);
		sendOperation.setAccessVariable(queuedVariable);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setReturnVariable(returnValueVariable);
		sendOperation.setTempReturnVariable(tempReturnValueVariable);
		sendOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(receiveInteraction.receivesInterCore()));
		return sendOperation;
	}

	public IocNonqueuedSendOperation createIocNonqueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable) throws ModelException {
		IocWriteApi iocWriteApi = this.context.builtQuery.findDest(IOC_WRITE_API, sourceSendImplementation.getOcIocSenderProperties());

		IocNonqueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createIocNonqueuedSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessApi(iocWriteApi);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setReturnVariable(returnValueVariable);
		return sendOperation;
	}

	public SendOperation createIocQueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable) throws ModelException {
		IocSendApi iocSendApi = this.context.builtQuery.findDest(IOC_SEND_API, sourceSendImplementation.getOcIocSenderProperties());

		IocQueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createIocQueuedSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessApi(iocSendApi);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setReturnVariable(returnValueVariable);
		return sendOperation;
	}

	public DirectComSendOperation createDirectComSendOperation(DirectComSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable) throws ModelException {
		DirectComSendOperation directComSendOperation = ModuleFactory.eINSTANCE.createDirectComSendOperation();
		buildComSendOperation(directComSendOperation, sourceSendImplementation, dataVariable, returnValueVariable);
		return directComSendOperation;
	}

	public TrustedFunctionComSendOperation createTrustedFunctionComSendOperation(TrustedFunctionComSendImplementation sourceSendImplementation, Variable dataVariable,
			LocalVariable returnValueVariable, LocalVariable trustedFunctionParamVariable) throws ModelException {
		TrustedFunctionComSendOperation trustedFunctionComSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionComSendOperation();
		buildComSendOperation(trustedFunctionComSendOperation, sourceSendImplementation, dataVariable, returnValueVariable);
		trustedFunctionComSendOperation.setAccessTrustedFunction(this.context.cache.comSendSignalTrustedFunction.get());
		trustedFunctionComSendOperation.setTrustedFunctionParamVariable(trustedFunctionParamVariable);
		return trustedFunctionComSendOperation;
	}

	public ImmediateProxyComSendOperation createImmediateProxyComSendOperation(ImmediateProxyComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable)
			throws ModelException {
		OsSetEventApi activationApi = this.context.builtQuery.findDest(OS_SET_EVENT_API, sourceSendImplementation.getProxyInteraction().getProxy());

		ImmediateProxyComSendOperation immediateProxyComSendOperation = ModuleFactory.eINSTANCE.createImmediateProxyComSendOperation();
		buildProxyComSendOperation(immediateProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable);
		immediateProxyComSendOperation.setActivationApi(activationApi);
		return immediateProxyComSendOperation;
	}

	public PeriodicProxyComSendOperation createPeriodicProxyComSendOperation(PeriodicProxyComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable)
			throws ModelException {
		PeriodicProxyComSendOperation periodicProxyComSendOperation = ModuleFactory.eINSTANCE.createPeriodicProxyComSendOperation();
		buildProxyComSendOperation(periodicProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable);
		return periodicProxyComSendOperation;
	}

	private void buildProxyComSendOperation(ProxyComSendOperation targetProxyComSendOperation, ProxyComSendImplementation proxyComSendImplementation, Value dataValue, LocalVariable returnValueVariable)
			throws ModelException {
		IocSendGroupApi proxyApi = this.context.builtQuery.findDest(IOC_SEND_GROUP_API, proxyComSendImplementation.getProxyInteraction().getOsIocCommunication().getOsIocSenderProperties().get(0));

		buildComSendOperation(targetProxyComSendOperation, proxyComSendImplementation, dataValue, returnValueVariable);
		targetProxyComSendOperation.setAccessProxyApi(proxyApi);
	}

	private void buildComSendOperation(ComSendOperation targetComSendOperation, ComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable) throws ModelException {
		ComSendSignalApi comSendSignalApi = this.context.builtQuery.findDest(COM_SEND_SIGNAL_API, sourceSendImplementation.getComSignal());
		targetComSendOperation.setSingleSource(sourceSendImplementation.getParent());
		targetComSendOperation.setAccessApi(comSendSignalApi);
		targetComSendOperation.setSendValue(dataValue);
		targetComSendOperation.setReturnVariable(returnValueVariable);
	}

	public FilterOperation createFilterOperation(ReceiveInteraction sourceReceiveInteraction, Variable filterResultVariable) throws ModelException {
		InternalEcuReceiver receiver = sourceReceiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc receiverDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();

		switch (receiverDataInstanceInSwc.getFilter().getDataFilterType()) {
		case MASKED_NEW_DIFFERS_MASKED_OLD: {
			GlobalVariable filterOldValueVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceReceiveInteraction.getFilterBufferImplementation());
			Constant maskConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MASK_ROLE_NAME);

			MaskedNewDiffersMaskedOldFilterOperation maskedNewDiffersMaskedOldFilterOperation = ModuleFactory.eINSTANCE.createMaskedNewDiffersMaskedOldFilterOperation();
			maskedNewDiffersMaskedOldFilterOperation.setFilterResultVariable(filterResultVariable);
			maskedNewDiffersMaskedOldFilterOperation.setMask(maskConstant);
			maskedNewDiffersMaskedOldFilterOperation.setOldValueVariable(filterOldValueVariable);
			return maskedNewDiffersMaskedOldFilterOperation;
		}
		case MASKED_NEW_DIFFERS_X: {
			Constant maskConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MASK_ROLE_NAME);
			Constant xConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_X_ROLE_NAME);

			MaskedNewDiffersXFilterOperation maskedNewDiffersXFilterOperation = ModuleFactory.eINSTANCE.createMaskedNewDiffersXFilterOperation();
			maskedNewDiffersXFilterOperation.setFilterResultVariable(filterResultVariable);
			maskedNewDiffersXFilterOperation.setMask(maskConstant);
			maskedNewDiffersXFilterOperation.setX(xConstant);
			return maskedNewDiffersXFilterOperation;
		}
		case MASKED_NEW_EQUALS_X: {
			Constant maskConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MASK_ROLE_NAME);
			Constant xConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_X_ROLE_NAME);

			MaskedNewEqualsXFilterOperation maskedNewEqualsXFilterOperation = ModuleFactory.eINSTANCE.createMaskedNewEqualsXFilterOperation();
			maskedNewEqualsXFilterOperation.setFilterResultVariable(filterResultVariable);
			maskedNewEqualsXFilterOperation.setMask(maskConstant);
			maskedNewEqualsXFilterOperation.setX(xConstant);
			return maskedNewEqualsXFilterOperation;
		}
		case NEW_IS_OUTSIDE: {
			Constant minConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MIN_ROLE_NAME);
			Constant maxConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MAX_ROLE_NAME);

			NewIsOutsideFilterOperation newIsOutsideFilterOperation = ModuleFactory.eINSTANCE.createNewIsOutsideFilterOperation();
			newIsOutsideFilterOperation.setFilterResultVariable(filterResultVariable);
			newIsOutsideFilterOperation.setMin(minConstant);
			newIsOutsideFilterOperation.setMax(maxConstant);
			return newIsOutsideFilterOperation;
		}
		case NEW_IS_WITHIN: {
			Constant minConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MIN_ROLE_NAME);
			Constant maxConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_MAX_ROLE_NAME);

			NewIsWithinFilterOperation newIsWithinFilterOperation = ModuleFactory.eINSTANCE.createNewIsWithinFilterOperation();
			newIsWithinFilterOperation.setFilterResultVariable(filterResultVariable);
			newIsWithinFilterOperation.setMin(minConstant);
			newIsWithinFilterOperation.setMax(maxConstant);
			return newIsWithinFilterOperation;
		}
		case ONE_EVERY_N: {
			GlobalVariable filterOccurrenceVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, sourceReceiveInteraction.getFilterBufferImplementation());

			Constant periodConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_PERIOD_ROLE_NAME);
			Constant offsetConstant = this.context.builtQuery.findDest(CONSTANT, receiverDataInstanceInSwc, RoleNames.FILTER_OFFSET_ROLE_NAME);

			OneEveryNFilterOperation oneEveryNFilterOperation = ModuleFactory.eINSTANCE.createOneEveryNFilterOperation();
			oneEveryNFilterOperation.setFilterResultVariable(filterResultVariable);
			oneEveryNFilterOperation.setOccurrenceVariable(filterOccurrenceVariable);
			oneEveryNFilterOperation.setPeriod(periodConstant);
			oneEveryNFilterOperation.setOffset(offsetConstant);
			return oneEveryNFilterOperation;
		}
		case ALWAYS:
		case NEVER:
		default: // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			assert false;
			return null;
		}
	}

	public InterPartitionTimeoutOperation createInterPartitionTimeoutOperation(EcucPartition sourcePartition) throws ModelException {
		InterPartitionTimeoutOperation timeoutOperation = ModuleFactory.eINSTANCE.createInterPartitionTimeoutOperation();
		for (InternalEcuSender sourceSender : this.context.query.<InternalEcuSender> find(isKindOf(INTERNAL_ECU_SENDER).AND(ref(INTERACTION_END__OWNER_PARTITION, sourcePartition)))) {
			for (SendInteraction sourceSendInteraction : this.context.query.select(sourceSender.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true))) {
				ValueBufferImplementation sourceValueBufferImplementation = sourceSendInteraction.getReceiveInteraction().getValueBufferImplementation();
				if (sourceValueBufferImplementation == null) {
					continue;
				}
				if (!sourceValueBufferImplementation.getHasStatus()) {
					continue;
				}

				// NOTE ���������ơ���������ĤΤϥǡ������ޥ�ƥ��å�����RTE�Хåե��Τ�
				if (sourceValueBufferImplementation instanceof RteValueBufferImplementation) { // COVERAGE ���true(�������ѡ��ƥ������֤Υ����ॢ�������Τ�Ԥ���硤���RteValueBufferImplementation�Ǥ��뤿��)
					RteBufferVariableSet rteBufferVariableSet = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceValueBufferImplementation);
					timeoutOperation.getTimeoutVariable().add(rteBufferVariableSet);
				}
			}
		}

		List<RteValueBufferImplementation> sourceBufferImplementations = this.context.query.collect(timeoutOperation.getTimeoutVariable(), MODULE_OBJECT__SOURCE);
		if (isMultipleSenderCoreExists(sourceBufferImplementations)) {
			timeoutOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(true));
		}
		return timeoutOperation;
	}

	private boolean isMultipleSenderCoreExists(List<RteValueBufferImplementation> sourceBufferImplementations) {
		for (RteValueBufferImplementation sourceBufferImplementation : sourceBufferImplementations) {
			ReceiveInteraction receiveInteraction = sourceBufferImplementation.getParent();
			if (receiveInteraction.receivesFromMultipleCores()) {
				return true;
			}
		}
		return false;
	}
}
