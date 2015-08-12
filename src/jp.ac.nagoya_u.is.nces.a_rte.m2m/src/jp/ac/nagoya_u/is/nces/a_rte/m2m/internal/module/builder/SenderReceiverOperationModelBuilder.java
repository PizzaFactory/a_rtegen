/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.HandleInvalidEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi;
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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

public class SenderReceiverOperationModelBuilder {

	private final ModuleModelBuildContext context;
	private ExcludeOperationModelBuilder excludeOperationBuilder;

	public SenderReceiverOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public RteBufferNonqueuedReadOperation createRteBufferNonqueuedReadOperation(Swc swc, ReceiveInteraction sourceReceiveInteraction, Parameter dataParam, LocalVariable returnValueVariable, boolean isForInline)
			throws ModelException {
		RteBufferVariableSet rteBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, sourceReceiveInteraction.getValueBufferImplementation());
		RteBufferNonqueuedReadOperation rteBufferNonqueuedReadOperation = ModuleFactory.eINSTANCE.createRteBufferNonqueuedReadOperation();
		buildReadOperation(rteBufferNonqueuedReadOperation, dataParam, returnValueVariable);
		rteBufferNonqueuedReadOperation.setAccessVariable(rteBuffer);
		if (isForInline) {
			addGlovalVariable(swc.getInlineGlobalVariables(), rteBuffer.getValueVariable());
			if (rteBuffer.getStatusVariable() != null) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// ECU間はインライン化しない
				addGlovalVariable(swc.getInlineGlobalVariables(), rteBuffer.getStatusVariable());
			}
		}
		Type type = rteBuffer.getValueVariable().getType();
		if (type instanceof RedefinitionType) {
			type = ((RedefinitionType)type).getLeafType();
		}
		if (rteBuffer.getStatusVariable() != null
		 || isFloat64(type)
		 || type instanceof ArrayType
		 || type instanceof StructType
		 || type instanceof UnionType) {
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

	public IocQueuedReadOperation createIocQueuedReceiveOperation(IocValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable, Variable tempReturnValueVariable)
			throws ModelException {
		IocReceiveApi iocReceiveApi = this.context.builtQuery.findDest(IOC_RECEIVE_API, sourceValueBufferImplementation.getOsIocCommunication());

		IocQueuedReadOperation iocQueuedReceiveOperation = ModuleFactory.eINSTANCE.createIocQueuedReadOperation();
		buildReadOperation(iocQueuedReceiveOperation, dataParam, returnValueVariable);
		iocQueuedReceiveOperation.setAccessApi(iocReceiveApi);
		iocQueuedReceiveOperation.setTempReturnVariable(tempReturnValueVariable);
		return iocQueuedReceiveOperation;
	}

	public ComReadOperation createComReadOperation(ComValueBufferImplementation sourceValueBufferImplementation, Parameter dataParam, LocalVariable returnValueVariable, RVariableDataInstanceInSwc sourceDataInstanceInSwc, LocalVariable tempReturnValueVariable) throws ModelException {
		ComReadOperation comReadOperation = ModuleFactory.eINSTANCE.createComReadOperation();
		buildReadOperation(comReadOperation, dataParam, returnValueVariable);
		EcucContainer ecucContainer = sourceValueBufferImplementation.getComSignal() != null ? sourceValueBufferImplementation.getComSignal() : sourceValueBufferImplementation.getComSignalGroup();
		ComReceiveSignalApi comReceiveSignalApi = this.context.builtQuery.findDest(COM_RECEIVE_SIGNAL_API, ecucContainer);
		comReadOperation.setAccessApi(comReceiveSignalApi);
		comReadOperation.setTempReturnVariable(tempReturnValueVariable);
		return comReadOperation;
	}

	public NeverReadOperation createNeverReadOperation(Swc swc, RVariableDataInstanceInSwc sourceDataInstanceInSwc, Parameter dataParam, boolean isForInline) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceDataInstanceInSwc, RoleNames.IMPL_INIT_VALUE);

		NeverReadOperation readOperation = ModuleFactory.eINSTANCE.createNeverReadOperation();
		buildReadOperation(readOperation, dataParam, null);
		readOperation.setInitValueConstant(initValueConstant);
		if (isForInline) {
			addConstant(swc.getInlineConstant(), initValueConstant);
		}
		return readOperation;
	}

	private void buildReadOperation(ReadOperation targetReadOperation, Parameter dataParam, LocalVariable returnValueVariable) {
		targetReadOperation.setReadValueVariable(dataParam);
		targetReadOperation.setReadStatusVariable(returnValueVariable);
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForWriteApi(Swc swc, SendInteraction sourceSendInteraction, Parameter dataParam, LocalVariable filterResultVariable, WriteApi api)
			throws ModelException {
		RteBufferNonqueuedSendOperation rteNonqueuedSendOperation = createRteBufferNonqueuedSendOperation(swc, sourceSendInteraction, dataParam, this.context.cache.rteErrorOkConstant, api.getIsInline());
	
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc dataInstanceInSwc1 = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
		if (dataInstanceInSwc1.isFilterEnabled()) {
			rteNonqueuedSendOperation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
		}

		buildExcludeOperation(rteNonqueuedSendOperation, sourceSendInteraction);
		return rteNonqueuedSendOperation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForInvalidateApi(Swc swc, SendInteraction sourceSendInteraction, Constant invalidValueConstant, LocalVariable filterResultVariable, InvalidateApi api)
			throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
	
		RteBufferNonqueuedSendOperation operation;
		HandleInvalidEnum handleInvalid = rDataInstanceInSwc.isInvalidationEnabled() ? rDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE;
		switch (handleInvalid) {
		case KEEP: {
			operation = createRteBufferNonqueuedSendOperation(swc, sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant, api.getIsInline());
			break;
		}
		case REPLACE: {
			Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, receiveInteraction.getValueBufferImplementation());
	
			operation = createRteBufferNonqueuedSendOperation(swc, sourceSendInteraction, initValueConstant,
					this.context.cache.rteErrorOkConstant, api.getIsInline());
			if (rDataInstanceInSwc.isFilterEnabled()) {
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		case DONT_INVALIDATE: // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		default: {
			operation = createRteBufferNonqueuedSendOperation(swc, sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant, api.getIsInline());
			if (rDataInstanceInSwc.isFilterEnabled()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		}

		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	public RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperationForComReceiveCallback(SendInteraction sourceSendInteraction, ExternalEcuSender sourceExternalEcuSender, Variable dataVariable, LocalVariable filterResultVariable) throws ModelException {
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

		HandleInvalidEnum handleInvalid = dataInstanceInSwc.isInvalidationEnabled() ? dataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE; // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
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
		case DONT_INVALIDATE: // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		default: {
			Constant invalidValueConstant = this.context.builtQuery.findDest(CONSTANT, dataInstanceInSwc, RoleNames.INVALID_VALUE);
	
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (dataInstanceInSwc.isFilterEnabled() && sourceExternalEcuSender.getRequiresRteFilter()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
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
		
		HandleInvalidEnum handleInvalid = rDataInstanceInSwc.isInvalidationEnabled() ? rDataInstanceInSwc.getInvalidationPolicy().getHandleInvalid() : HandleInvalidEnum.DONT_INVALIDATE; // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
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
		case DONT_INVALIDATE: // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
		default: {
			operation = createRteBufferNonqueuedSendOperation(sourceSendInteraction, invalidValueConstant,
					this.context.cache.rteErrorOkConstant);
			if (rDataInstanceInSwc.isFilterEnabled()) { // COVERAGE (常用ケースではないため，コードレビューで問題ないことを確認)
				operation.setFilterOperation(createFilterOperation(receiveInteraction, filterResultVariable));
			}
			break;
		}
		}

		buildExcludeOperation(operation, sourceSendInteraction);
		return operation;
	}

	// swcはinlineでなければ不要(null)
	private RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation(Swc swc, SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue, boolean isForInline) throws ModelException {
		ReceiveInteraction receiveInteraction = sourceSendInteraction.getReceiveInteraction();
		RteBufferVariableSet rteBuffer = this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, receiveInteraction.getValueBufferImplementation());

		RteBufferNonqueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createRteBufferNonqueuedSendOperation();
		sendOperation.setSingleSource(sourceSendInteraction);
		sendOperation.setAccessVariable(rteBuffer);
		sendOperation.setSendValue(sendValue);
		if (isForInline) {
			addGlovalVariable(swc.getInlineGlobalVariables(), rteBuffer.getValueVariable());
			if (sendValue instanceof Constant) {
				addConstant(swc.getInlineConstant(), (Constant)sendValue);
			}
		}
		if (rteBuffer.getStatusVariable() != null) {
			sendOperation.setSendStatus(sendStatusValue);
			if (isForInline) {
				// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
				// ECU間はインライン化しない
				addGlovalVariable(swc.getInlineGlobalVariables(), rteBuffer.getStatusVariable());
			}
		}
		return sendOperation;
	}
	
	private RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation(SendInteraction sourceSendInteraction, Value sendValue, Constant sendStatusValue) throws ModelException {
		return createRteBufferNonqueuedSendOperation(null, sourceSendInteraction, sendValue, sendStatusValue, false);
	}

	private void buildExcludeOperation(RteBufferNonqueuedSendOperation targetSendOperation, SendInteraction sourceSendInteraction) {
		Type type = targetSendOperation.getAccessVariable().getValueVariable().getType();
		if (type instanceof RedefinitionType) {
			type = ((RedefinitionType)type).getLeafType();
		}
		if (targetSendOperation.getAccessVariable().getStatusVariable() != null
		 || targetSendOperation.getFilterOperation() != null
		 || isFloat64(type)
		 || type instanceof ArrayType
		 || type instanceof StructType
		 || type instanceof UnionType) {
			targetSendOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(sourceSendInteraction.getReceiveInteraction().receivesInterCore()));
		}
	}
	
	private boolean isFloat64(Type type) {
		if (!(type instanceof PrimitiveType)) {
			return false;
		}
		if (Identifiers.BASE_TYPE_ENCODING_IEEE754.equals(((ImplementationDataType)type.getSingleSource()).getBaseType().getBaseTypeEncoding())
				&& type.getSize() == 64) {
			return true;
		}
		return false;
	}

	public TrustedFunctionRteBufferWriteSendOperation createTrustedFunctionRteBufferWriteSendOperation(TrustedFunctionRteSendImplementation sourceSendImplementation,
			Variable dataVariable, Variable returnValueVariable, Variable tempReturnValueVariable) throws ModelException {
		RteBufferWriteTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_WRITE_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferWriteSendOperation sendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferWriteSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessTrustedFunction(trustedFunction);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setReturnVariable(returnValueVariable);
		sendOperation.setTempReturnVariable(tempReturnValueVariable);
		return sendOperation;
	}

	public TrustedFunctionRteBufferInvalidateSendOperation createTrustedFunctionRteBufferInvalidateSendOperation(SendInteraction sourceSendInteraction,
			TrustedFunctionRteSendImplementation sourceSendImplementation, Variable returnValueVariable, Variable tempReturnValueVariable) throws ModelException {
		RteBufferInvalidateTrustedFunction trustedFunction = this.context.builtQuery.findDest(RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION, sourceSendImplementation);

		TrustedFunctionRteBufferInvalidateSendOperation sendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferInvalidateSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessTrustedFunction(trustedFunction);
		sendOperation.setReturnVariable(returnValueVariable);
		sendOperation.setTempReturnVariable(tempReturnValueVariable);
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
		sendOperation.setType(dataVariable.getType());
		sendOperation.setReturnVariable(returnValueVariable);
		sendOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(receiveInteraction.receivesInterCore()));
		return sendOperation;
	}

	public RteBufferQueuedSendOperation createRteBufferQueuedSendOperationForWriteTrustedFunction(SendInteraction sourceSendInteraction, LocalVariable dataVariable, LocalVariable filterResultVariable) throws ModelException {
		RteBufferQueuedSendOperation operation = createRteBufferQueuedSendOperation(sourceSendInteraction, dataVariable, null, null);
		return operation;
	}
	
	public IocNonqueuedSendOperation createIocNonqueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable) throws ModelException {
		IocWriteApi iocWriteApi = this.context.builtQuery.findDest(IOC_WRITE_API, sourceSendImplementation.getOcIocSenderProperties());

		IocNonqueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createIocNonqueuedSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessApi(iocWriteApi);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setType(dataVariable.getType());
		sendOperation.setReturnVariable(returnValueVariable);
		return sendOperation;
	}

	public SendOperation createIocQueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable) throws ModelException {
		// COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
		// S/Rの実現方式の選択方針が変更となりECU間ではIOCバッファを使用しなくなった関係上,当メソッドは使用されない.
		return createIocQueuedSendOperation(sourceSendImplementation, dataVariable, returnValueVariable, null);
	}

	public SendOperation createIocQueuedSendOperation(IocSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable, Variable tempReturnValueVariable) throws ModelException {
		IocSendApi iocSendApi = this.context.builtQuery.findDest(IOC_SEND_API, sourceSendImplementation.getOcIocSenderProperties());
		IocQueuedSendOperation sendOperation = ModuleFactory.eINSTANCE.createIocQueuedSendOperation();
		sendOperation.setSingleSource(sourceSendImplementation.getParent());
		sendOperation.setAccessApi(iocSendApi);
		sendOperation.setSendValue(dataVariable);
		sendOperation.setType(dataVariable.getType());
		sendOperation.setReturnVariable(returnValueVariable);
		sendOperation.setTempReturnVariable(tempReturnValueVariable);
		return sendOperation;
	}

	public DirectComSendOperation createDirectComSendOperation(DirectComSendImplementation sourceSendImplementation, Variable dataVariable, LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable) throws ModelException {
		DirectComSendOperation directComSendOperation = ModuleFactory.eINSTANCE.createDirectComSendOperation();
		buildComSendOperation(directComSendOperation, sourceSendImplementation, dataVariable, returnValueVariable);
		directComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		return directComSendOperation;
	}

	public TrustedFunctionRteSendOperation createTrustedFunctionRteSendOperation(TrustedFunctionRteSendImplementation sourceSendImplementation, Variable dataVariable,
			LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable, Type type) throws ModelException {
		TrustedFunctionRteSendOperation trustedFunctionRteSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionRteSendOperation();
		buildRteSendOperation(trustedFunctionRteSendOperation, dataVariable, returnValueVariable);
		trustedFunctionRteSendOperation.setTempReturnVariable(tempReturnValueVariable);
		trustedFunctionRteSendOperation.setType(type);
		trustedFunctionRteSendOperation.setSrSendTfSymbolName(sourceSendImplementation.getWriteOsTrustedFunction().getShortName());
		return trustedFunctionRteSendOperation;
	}
	
	public TrustedFunctionComSendOperation createTrustedFunctionComSendOperation(TrustedFunctionComSendImplementation sourceSendImplementation, Variable dataVariable,
			LocalVariable returnValueVariable, LocalVariable trustedFunctionParamVariable, LocalVariable tempReturnValueVariable, Type type) throws ModelException {
		TrustedFunctionComSendOperation trustedFunctionComSendOperation = ModuleFactory.eINSTANCE.createTrustedFunctionComSendOperation();
		buildComSendOperation(trustedFunctionComSendOperation, sourceSendImplementation, dataVariable, returnValueVariable);
		trustedFunctionComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		if (sourceSendImplementation.getComSignal() != null) {
			trustedFunctionComSendOperation.setAccessTrustedFunction(this.context.cache.comSendSignalTrustedFunction.get());
		} else {
			trustedFunctionComSendOperation.setAccessTrustedFunction(this.context.cache.comSendSignalGroupTrustedFunction.get());
		}
		trustedFunctionComSendOperation.setTrustedFunctionParamVariable(trustedFunctionParamVariable);
		trustedFunctionComSendOperation.setType(type);
		trustedFunctionComSendOperation.setIsGroup(sourceSendImplementation.getComSignalGroup() != null);
		return trustedFunctionComSendOperation;
	}

	public ImmediateProxyComSendOperation createImmediateProxyComSendOperation(ImmediateProxyComSendImplementation sourceSendImplementation, Value dataValue,
			LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable, Type type)
			throws ModelException {
		OsSetEventApi activationApi = this.context.builtQuery.findDest(OS_SET_EVENT_API, sourceSendImplementation.getProxyInteraction().getProxy());
		ImmediateProxyComSendOperation immediateProxyComSendOperation = ModuleFactory.eINSTANCE.createImmediateProxyComSendOperation();
		if (type instanceof PrimitiveType) {
			buildProxyComSendOperation(immediateProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable, IOC_SEND_GROUP_API);
			immediateProxyComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		} else {
			buildProxyComSendOperationWithCompositeDataType(immediateProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable, IOC_SEND_API);
			immediateProxyComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		}
		immediateProxyComSendOperation.setActivationApi(activationApi);
		immediateProxyComSendOperation.setType(type);
		
		return immediateProxyComSendOperation;
	}

	public PeriodicProxyComSendOperation createPeriodicProxyComSendOperation(PeriodicProxyComSendImplementation sourceSendImplementation, Value dataValue,
			LocalVariable returnValueVariable, LocalVariable tempReturnValueVariable, Type type)
			throws ModelException {
		PeriodicProxyComSendOperation periodicProxyComSendOperation = ModuleFactory.eINSTANCE.createPeriodicProxyComSendOperation();
		if (type instanceof PrimitiveType) {
			buildProxyComSendOperation(periodicProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable, IOC_SEND_GROUP_API);
			periodicProxyComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		} else {
			buildProxyComSendOperationWithCompositeDataType(periodicProxyComSendOperation, sourceSendImplementation, dataValue, returnValueVariable, IOC_SEND_API);
			periodicProxyComSendOperation.setTempReturnVariable(tempReturnValueVariable);
		}
		periodicProxyComSendOperation.setType(type);

		return periodicProxyComSendOperation;
	}

	private void buildProxyComSendOperationWithCompositeDataType(ProxyComSendOperation targetProxyComSendOperation, ProxyComSendImplementation proxyComSendImplementation, Value dataValue, LocalVariable returnValueVariable, EClass eClass) throws ModelException {
		buildProxyComSendOperation(targetProxyComSendOperation, proxyComSendImplementation, dataValue, returnValueVariable, eClass);
		IocSendApi iocApi = this.context.builtQuery.findDest(eClass, proxyComSendImplementation.getProxyInteraction().getOsIocCommunicationForComplexValue().getOsIocSenderProperties().get(0));
		targetProxyComSendOperation.setAccessIocApi(iocApi);
	}

	private void buildProxyComSendOperation(ProxyComSendOperation targetProxyComSendOperation, ProxyComSendImplementation proxyComSendImplementation, Value dataValue, LocalVariable returnValueVariable, EClass eClass)
			throws ModelException {
		IocSendApi proxyApi = this.context.builtQuery.findDest(eClass, proxyComSendImplementation.getProxyInteraction().getOsIocCommunication().getOsIocSenderProperties().get(0));
		buildComSendOperation(targetProxyComSendOperation, proxyComSendImplementation, dataValue, returnValueVariable);
		InternalEcuSender sender = proxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
		VariableDataInstanceInSwc dataInstanceInSwc = sender.getSource().getPrototype();
		EcucReferrable signal = proxyComSendImplementation.getComSignal() != null ? proxyComSendImplementation.getComSignal() : proxyComSendImplementation.getComSignalGroup();
		targetProxyComSendOperation.setFunctionTableSymbolName(Identifiers.createProxyFunctionTableName(dataInstanceInSwc, signal));
		targetProxyComSendOperation.setAccessProxyApi(proxyApi);
	}

	private void buildRteSendOperation(SendOperation targetComSendOperation, Value dataValue, LocalVariable returnValueVariable) throws ModelException {
		targetComSendOperation.setSendValue(dataValue);
		targetComSendOperation.setReturnVariable(returnValueVariable);
	}
	
	private void buildComSendOperation(ComSendOperation targetComSendOperation, ComSendImplementation sourceSendImplementation, Value dataValue, LocalVariable returnValueVariable) throws ModelException {
		EcucContainer ecucContainer = sourceSendImplementation.getComSignal() != null ? sourceSendImplementation.getComSignal() : sourceSendImplementation.getComSignalGroup();
		ComSendSignalApi comSendSignalApi = this.context.builtQuery.findDest(COM_SEND_SIGNAL_API, ecucContainer);
		targetComSendOperation.setSingleSource(sourceSendImplementation.getParent());
		targetComSendOperation.setAccessApi(comSendSignalApi);
		targetComSendOperation.setSendValue(dataValue);

		if (ecucContainer instanceof ComSignalGroup) {
			Parameter param =  (Parameter)dataValue;
			param.setHasConst(true);
		}
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
		default: // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
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

				// NOTE 現状，ステータスを持つのはデータセマンティックスのRTEバッファのみ
				if (sourceValueBufferImplementation instanceof RteValueBufferImplementation) { // COVERAGE 常にtrue(現状，パーティション間のタイムアウト通知を行う場合，常にRteValueBufferImplementationであるため)
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

	private void addGlovalVariable(EList<GlobalVariable> variables, GlobalVariable glovalVariable) {
		if (! variables.contains(glovalVariable)) {
			variables.add(glovalVariable);
		}
	}

	private void addConstant(EList<Constant> constants, Constant constant) {
		if (! constants.contains(constant)) {
			constants.add(constant);
		}
	}
}
