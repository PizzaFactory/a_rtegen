package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.SEND_INTERACTION___IS_INTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import com.google.common.base.Optional;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Sender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ValueBufferImplementation;

public class InteractionRules {
	private final InteractionModelBuildContext context;

	public InteractionRules(InteractionModelBuildContext context) {
		this.context = context;
	}

	public boolean usesRteBufferForReceiveInteraction(ReceiveInteraction sourceReceiveInteraction, InternalEcuReceiver sourceReceiver) {
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
		boolean isInterEcuExists = !sourceReceiver.getExternalEcuSenders().isEmpty();
		boolean isInterPartitionExists = this.context.query.exists(sourceReceiveInteraction.getSendInteraction(), hasOp(SEND_INTERACTION___IS_INTER_PARTITION, true));

		// �ե��륿�����������ॢ���ȡ�̵�����Τ����줫��ͭ���Ǥ���С�RTE�Хåե������
		if (sourceDataInstance.isFilterEnabled()) {
			return true;
		}
		if (sourceDataInstance.isAliveTimeoutEnabled()) {
			return true;
		}
		if (sourceDataInstance.isInvalidationEnabled()) {
			return true;
		}

		if (isInterEcuExists) {
			// ECU��Ϣ�Ȥ�ޤ��硢RTE�Хåե������
			return true;
		} else if (isInterPartitionExists) {
			// ECU��Ϣ�Ȥ�ޤޤ����ѡ��ƥ�������Ϣ�Ȥ�ޤ��硢untrusted�ѡ��ƥ������˽�°��������¦��¸�ߤ��ʤ����RTE�Хåե�����Ѥ���
			for (SendInteraction sourceSendInteraction : sourceReceiveInteraction.getSendInteraction()) {
				for (Sender sourceSender : sourceSendInteraction.getSender()) {
					if (!sourceSender.getOwnerPartition().isTrusted()) {
						return false;
					}
				}
			}
			return true;
		} else {
			// ECU��Ϣ�ȡ��ѡ��ƥ�������Ϣ�Ȥ�ޤޤʤ���硢RTE�Хåե������
			return true;
		}
	}

	public boolean appliesSrComValueBufferOptimization(ReceiveInteraction sourceAndTargetReceiveInteraction, InternalEcuReceiver sourceReceiver) throws ModelException {
		RVariableDataInstanceInSwc sourceDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();

		// Receive RTE�Хåե��Ǥʤ����Ϻ�Ŭ���оݳ�
		if (!(sourceAndTargetReceiveInteraction.getValueBufferImplementation() instanceof RteValueBufferImplementation)) {
			return false;
		}

		// ���ޥ�ƥ�����Ƚ��:���٥�Ȥξ��Ϻ�Ŭ���оݳ�
		if (sourceDataInstanceInSwc.isEventSemantics()) {
			return false;
		}

		// �����ॢ���Ȥ����ꤵ��Ƥ�����Ϻ�Ŭ���оݳ�
		if (sourceDataInstanceInSwc.isAliveTimeoutEnabled()) {
			return false;
		}

		// �����Ԥ�ExternalEcuSender��¸�ߤ��ʤ����Ϻ�Ŭ���оݳ�
		if (sourceReceiver.getExternalEcuSenders().isEmpty()) {
			return false;
		}

		// �����Ԥ�ʣ���ξ��Ϻ�Ŭ���оݳ�
		if (sourceReceiver.hasMultipleSenders()) {
			return false;
		}

		// RTE�ˤ��̵�������⤷���ϥե��륿��ɬ�פʾ��Ϻ�Ŭ���оݳ�
		ExternalEcuSender sourceExternalEcuSender = sourceReceiver.getExternalEcuSenders().get(0);
		if (sourceExternalEcuSender.getRequiresRteInvalidation() || sourceExternalEcuSender.getRequiresRteInitialization() || sourceExternalEcuSender.getRequiresRteFilter()) {
			return false;
		}

		// A-COM�ȼ����ͥ��ץ���������ʳ��ϥޥ���������BSWPartition�Ǥʤ����Ϻ�Ŭ���оݳ�
		if (!this.context.options.comMultiCore) {
			if (sourceReceiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceReceiver.getOwnerCore())));
				if ((sourceReceiver.getOwnerPartition() != bswPartition) || 
					(this.context.query.get(sourceReceiver.getOwnerPartition(), ECUC_PARTITION_EX___IS_IN_MASTER_CORE__ECUCPARTITION) == Boolean.FALSE)) {
					return false;
				}
			}
		} else {
			// BSWPartition�Ǥʤ����Ϻ�Ŭ���оݳ�
			if (sourceReceiver.getOwnerPartition() != null) {
				EcucPartition bswPartition = this.context.query.findSingle(hasAttr(ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, true).AND(
						hasOp(ECUC_PARTITION___GET_OWNER_CORE, sourceReceiver.getOwnerCore())));
				if (sourceReceiver.getOwnerPartition() != bswPartition) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean needsSpinlockForRteInternalExclusion() {

		// �ޥ������OSȽ��
		if (!this.context.cache.sourceOs.getOsOS().isMulticoreOs()) {
			return false;
		}

		for (InternalEcuReceiver sourceReceiver : this.context.query.<InternalEcuReceiver> findByKind(INTERNAL_ECU_RECEIVER)) {

			if (sourceReceiver.getReceiveInteraction().isEmpty()) {
				continue;
			}

			// �����٤�Ƚ��
			// �ʲ��ϡ�SenderReceiverImplementationModelBuilder:buildReceiveImplementations�ˤ�ReceiveInteraction�ˡ�0�פΤߤ����ꤷ�Ƥ��뤿�ᡢƱ�ͤ˼���
			ReceiveInteraction sourceReceiveInteraction = sourceReceiver.getReceiveInteraction().get(0);
			if (!sourceReceiveInteraction.receivesInterCore()) {
				// �����٤��Ǥʤ���硢���ԥ��å��ʤ�
				continue;
			}

			// �֥��ޥ�ƥ������ס֥����ॢ���ȡס֥ե��륿����Ƚ��
			RVariableDataInstanceInSwc sourceDataInstanceInSwc = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
			ImplementationDataType sourceDataType = sourceDataInstanceInSwc.getImplementationDataType();
			if (!isNestedType(sourceDataType) &&
				!(sourceDataInstanceInSwc.isEventSemantics()) && 
				!(sourceDataInstanceInSwc.isAliveTimeoutEnabled()) &&
				!(sourceDataInstanceInSwc.isFilterEnabled()))
			{
				// ��Primitive�� and �֥ǡ������ޥ�ƥ������� and �֥����ॢ����̵���� and �֥ե��륿��̵���פξ�硢���ԥ��å��ʤ�
				continue;
			}

			// �¸�����Ƚ��
			ValueBufferImplementation sourceValueBufferImplementation = sourceReceiveInteraction.getValueBufferImplementation();
			if (!isSrRteBufferImplementation(sourceValueBufferImplementation)) {
				// �¸�������RteValueBufferImplementation�Ǥʤ���硢���ԥ��å��ʤ�
				continue;
			}

			// ���ԥ��å�����
			return true;
		}

		return false;
	}

	private boolean isNestedType(ImplementationDataType sourceDataType) {
		return sourceDataType.isArrayType() || sourceDataType.isStructType() || sourceDataType.isUnionType();
	}

	private boolean isSrRteBufferImplementation(ValueBufferImplementation implementation) {
		return implementation instanceof RteValueBufferImplementation;
	}

	public boolean needsTrustedFunctionForCsCall(ROperationInstanceInSwc sourceOperationInstanceInSwc) throws ModelException {
		Optional<EcucPartition> sourceRPartition = tryGetREcucPartition(sourceOperationInstanceInSwc);
		Optional<EcucPartition> sourcePPartition = tryGetPEcucPartition(sourceOperationInstanceInSwc);

		// COVERAGE (ecucPartition��!isPresent()�ΤȤ���pEcucPartition��!isPresent()�Ǥ��뤿�ᥫ�Х�å����ѥ����ʤ��������ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		return this.context.query.<Boolean> get(sourceOperationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC) && sourceRPartition.isPresent()
				&& sourcePPartition.isPresent() && !sourceRPartition.get().isTrusted() && sourcePPartition.get().isTrusted();
	}

	// NOTE �Ǥ����ex��ǥ����������ۤ����褤
	private Optional<EcucPartition> tryGetREcucPartition(ROperationInstanceInSwc rOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition rOpInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, rOperationInstanceInSwc));
		PortInstanceInComposition rPortInComposition = rOpInComposition.getParent();
		if (rPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
			return Optional.absent();
		}

		return Optional.of(rPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0));
	}

	// NOTE �Ǥ����ex��ǥ����������ۤ����褤
	private Optional<EcucPartition> tryGetPEcucPartition(ROperationInstanceInSwc rOperationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition rOpInComposition = this.context.query.<OperationInstanceInComposition> findSingle(ref(OPERATION_INSTANCE_IN_COMPOSITION__PROTOTYPE, rOperationInstanceInSwc));
		Optional<AssemblyOperationInstanceConnector> connector = this.context.query.<AssemblyOperationInstanceConnector> tryFindSingle(ref(ASSEMBLY_OPERATION_INSTANCE_CONNECTOR__REQUESTER, rOpInComposition));
		if (!connector.isPresent()) {
			return Optional.absent();
		}

		PortInstanceInComposition pPortInComposition = connector.get().getProvider().getParent();
		if (pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().isEmpty()) {
			return Optional.absent();
		}

		return Optional.of(pPortInComposition.getContextComponent().getInstance().get(0).getOwnerPartition().get(0));
	}
}
