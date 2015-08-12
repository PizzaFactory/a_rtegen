package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_RECEIVER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.INTERNAL_ECU_SENDER__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODE_MACHINE_INSTANCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswRequiredModeGroupConnection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSwitchEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeActivationKind;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeInBswModuleDescriptionInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.SendInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import com.google.common.base.Optional;
import com.google.common.collect.ListMultimap;

public class ModuleRules {

	private final ModuleModelBuildContext context;

	public ModuleRules(ModuleModelBuildContext context) {
		this.context = context;
	}

	public boolean usesInlineSrProvidedApi(PVariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		if (!canUseInlineApi()) {
			return false;
		}
		if (!isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort())) {
			return false;
		}
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuSender sender = this.context.query.findSingle(ref(INTERNAL_ECU_SENDER__SOURCE, dataInstanceInComposition));
		if (sender.getSendInteraction().isEmpty()) {
			return true;
		} else if (sender.getSendInteraction().size() == 1) {
			SendInteraction sendInteraction = sender.getSendInteraction().get(0);
			if (sendInteraction.getImplementation() instanceof RteSendImplementation) {
				ReceiveInteraction receiveInteraction = sendInteraction.getReceiveInteraction();
				// 1:N�ϥ���饤���оݳ��ʤΤǡ�0���ܸ���ǳ�ǧ����
				InternalEcuReceiver receiver = receiveInteraction.getInternalEcuReceivers().get(0);
				RVariableDataInstanceInSwc rDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
				if (!rDataInstanceInSwc.isFilterEnabled()) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean usesInlineSrRequiredApi(RVariableDataInstanceInSwc dataInstanceInSwc) throws ModelException {
		if (!canUseInlineApi()) {
			return false;
		}
		if (!isEnableTakeAddressFalse(dataInstanceInSwc.getContextPort())) {
			return false;
		}
		VariableDataInstanceInComposition dataInstanceInComposition = dataInstanceInSwc.getInstance().get(0);
		InternalEcuReceiver receiver = this.context.query.findSingle(ref(INTERNAL_ECU_RECEIVER__SOURCE, dataInstanceInComposition));
		if (receiver.getReceiveInteraction().isEmpty()) {
			return true;
		}
		ReceiveInteraction receiveInteraction = receiver.getReceiveInteraction().get(0);
		if (receiveInteraction.getValueBufferImplementation() instanceof IocValueBufferImplementation
		// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
		// IOC�ϥ���饤�󲽤��ʤ�
				|| receiveInteraction.getValueBufferImplementation() instanceof ComValueBufferImplementation) {
			return false;
		}
		if (!receiver.getExternalEcuSenders().isEmpty()) {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// ECU�֤ϥ���饤�󲽤��ʤ�
			return false;
		}
		return true;
	}

	public boolean usesInlineCsApi(EcucPartition clientEcucPartition, EcucPartition serverPartition, ROperationInstanceInSwc rOperationInstanceInSwc) {
		if (clientEcucPartition == null && serverPartition == null) {
			return true;
		} else if (clientEcucPartition == null || serverPartition == null) {
			// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			// ecucPartition, pEcucPartition �Τ����줫��null�ΤȤ��Ϥ��ꤨ�ʤ�
			return false;
		}

		if (clientEcucPartition != serverPartition) {
			if (!clientEcucPartition.isTrusted()) {
				// �̥ѡ��ƥ������ξ��ϥ���饤�󲽤�Ԥ�ʤ�
				return false;
			}
			// �̥ѡ��ƥ������������������Ȥ�˿���Ǥ����硢���ޥ�ɥ饤�󥪥ץ����ǥ���饤��Ƚ���Ԥ�
		}

		return usesInlineCsApi(rOperationInstanceInSwc);
	}

	public boolean usesInlineCsApi(ROperationInstanceInSwc rOperationInstanceInSwc) {
		if (!canUseInlineApi()) {
			return false;
		}
		return isEnableTakeAddressFalse(rOperationInstanceInSwc.getContextPort());
	}

	public boolean usesInlineIrvApi() {
		return canUseInlineApi();
	}

	public boolean usesInlineExcludeApi() {
		return canUseInlineApi();
	}

	private boolean canUseInlineApi() {
		// generationPhase�Ǥʤ����ϥ���饤�󲽤�Ԥ�ʤ�
		if (!this.context.options.generationPhase) {
			return false;
		}

		// ���ޥ�ɥ饤�󥪥ץ���󤬻��ꤵ��Ƥ������ϥ���饤�󲽤�Ԥ�ʤ�
		if (this.context.options.withoutStaticInline) {
			return false;
		}

		return true;
	}

	private boolean isEnableTakeAddressFalse(PortPrototype portPrototype) {
		// EnableTakeAddress��false�ξ�祤��饤���о�
		if (portPrototype.getPortApiOption().isEmpty()) {
			return false;
		}
		return !portPrototype.getPortApiOption().get(0).getEnableTakeAddress();
	}

	public boolean needsExclusionForSendOperation(RteBufferNonqueuedSendOperation sendOperation) {
		Type type = sendOperation.getAccessVariable().getValueVariable().getType();
		return sendOperation.getAccessVariable().getStatusVariable() != null || sendOperation.getFilterOperation() != null || !Types.isAtomicType(type);
	}

	public boolean needsExclusionForReadOperation(RteBufferNonqueuedReadOperation readOperation) {
		Type type = readOperation.getAccessVariable().getValueVariable().getType();
		return readOperation.getAccessVariable().getStatusVariable() != null || !Types.isAtomicType(type);
	}

	public boolean needsExclusionForIrvOperation(Type sourceType) {
		return !Types.isAtomicType(sourceType);
	}

	/**
	 * ͭ����(ȯ�Ф����ǽ���Τ���)BSW���٥�Ȥ���Ƚ�ꤹ��
	 * @param sourceBswEvent Ƚ���оݤ�BSW���٥��
	 * @return ͭ����BSW���٥�Ȥξ�硢true������ʳ��ξ�硢false��
	 */
	public boolean isEnabledBswEvent(BswEvent sourceBswEvent) {
		// BSW���٥�ȶ��̤�ͭ����̵��Ƚ��
		if (!checksEnabledOfBswEventCommonPart(sourceBswEvent)) {
			return false;
		}

		// ��BSW���٥�ȸ�ͭ��ͭ����̵��Ƚ��
		if (sourceBswEvent instanceof BswModeSwitchEvent) {
			// �⡼�����إ��٥��
			return checksEnabledOfBswModeSwitchEventSpecificPart((BswModeSwitchEvent) sourceBswEvent);
		} else {
			// ����¾���٥��
			return true; // ��ͭ�Υ����å��ʤ�
		}
	}

	// BSW���٥�Ȥ�ͭ���Ǥ��뤫��Ƚ��(�⡼�����إ��٥�ȸ�ͭ����ʬ�Τߥ����å�)
	private boolean checksEnabledOfBswModeSwitchEventSpecificPart(BswModeSwitchEvent sourceBswModeSwitchEvent) {
		// NOTE ����onEntry�Τߥ��ݡ��Ȥ��Ƥ��뤿�ᡢonEntry�ʳ�(onTransition��onExit)��̵���ʥ��٥�Ȥ�Ƚ�ꤹ��
		if (!ModeActivationKind.ON_ENTRY.equals(sourceBswModeSwitchEvent.getActivation())) {
			return false;
		}

		ModeInBswModuleDescriptionInstanceRef onEntryModeIref = sourceBswModeSwitchEvent.getModeIref().get(0);

		// ���٥�Ȥ�ȯ�и��Ȥʤ�⡼��������롼�ץץ�ȥ����פ˥����������ʤ���С�̵���ʥ��٥�Ȥ�Ƚ��
		if (!sourceBswModeSwitchEvent.getStartsOnEvent().getAccessedModeGroup().contains(onEntryModeIref.getContextModeDeclarationGroup())) {
			return false;
		}

		// ���٥�Ȥ�ȯ�и��Ȥʤ�⡼�ɤ�̵��������Ƥ���С�̵���ʥ��٥�Ȥ�Ƚ��
		for (ModeInBswModuleDescriptionInstanceRef disabledInModeIref : sourceBswModeSwitchEvent.getDisabledInMode()) {
			if (onEntryModeIref.getContextModeDeclarationGroup() == disabledInModeIref.getContextModeDeclarationGroup() && onEntryModeIref.getTargetMode() == disabledInModeIref.getTargetMode()) {
				return false;
			}
		}

		return true;
	}

	// BSW���٥�Ȥ�ͭ���Ǥ��뤫��Ƚ��(��BSW���٥�ȶ��̤���ʬ�Τߥ����å�)
	private boolean checksEnabledOfBswEventCommonPart(BswEvent bswEvent) {
		return !isBswEventDisabledByMode(bswEvent);
	}

	// BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ��뤫��Ƚ��
	private boolean isBswEventDisabledByMode(BswEvent bswEvent) {
		// �⡼�ɰ�¸̵����������оݤȤʤ�⡼��������롼�ץץ�ȥ����פ�ñ�̤˥��롼�ײ�
		ListMultimap<ModeDeclarationGroupPrototype, ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefsGroupByContextModeGroup = this.context.query.groupByKey(bswEvent.getDisabledInMode(),
				MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__CONTEXT_MODE_DECLARATION_GROUP);

		// �ƥ⡼��������롼�ץץ�ȥ����פˤĤ��ơ�BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ��뤫��Ƚ��
		for (ModeDeclarationGroupPrototype disabledInModeContextModeGroup : disabledInModeIrefsGroupByContextModeGroup.keySet()) {
			List<ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefs = disabledInModeIrefsGroupByContextModeGroup.get(disabledInModeContextModeGroup);
			List<ModeDeclaration> disabledInModeTargetModes = this.context.query.collect(disabledInModeIrefs, MODE_IN_BSW_MODULE_DESCRIPTION_INSTANCE_REF__TARGET_MODE);

			// ͭ������¦�Ǥ��뤫���⤷���ϡ� �׵�¦�򻲾Ȥ��Ƥ���Ȥ��ˡ�ͭ������¦�����뤫������å�
			ModeDeclarationGroupPrototype enabledProvidedPrototype = getEnableProvidedModeDeclarationGroupPrototype(disabledInModeContextModeGroup);
			if (enabledProvidedPrototype == null) {
				// ͭ������¦��¸�ߤ��ʤ����
				// NOTE ͭ������¦��¸�ߤ��ʤ���Х⡼�ɤ�����⡼�ɰʳ������ܤ��뤳�ȤϤʤ��Τǡ�����⡼�ɤ�̵��������Ƥ���С�BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ����Ƚ�ꤹ��
				if (disabledInModeTargetModes.contains(disabledInModeContextModeGroup.getType().getInitialMode())) {
					return true;
				}
			} else {
				// ͭ������¦��¸�ߤ�����
				// �⡼��������롼�ץץ�ȥ����פ����⡼�ɤ�̵��������Ƥ���С�BSW���٥�Ȥ��⡼�ɰ�¸̵��������ˤ��̵��������Ƥ����Ƚ�ꤹ��
				if (disabledInModeTargetModes.containsAll(disabledInModeContextModeGroup.getType().getModeDeclaration())) {
					return true;
				}
			}
		}

		return false;
	}

	private ModeDeclarationGroupPrototype getEnableProvidedModeDeclarationGroupPrototype(ModeDeclarationGroupPrototype prototype) {
		// ͭ������¦�Ǥ���С�������֤�
		Optional<ModeMachineInstance> providedInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, prototype);
		if (providedInstance.isPresent()) {
			return prototype;
		}

		// �׵�¦�ξ�硢ͭ������¦������Ф�����֤�
		Optional<RteBswRequiredModeGroupConnection> connection = this.context.query.tryFindSingle(isKindOf(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION)
				.AND(ref(RTE_BSW_REQUIRED_MODE_GROUP_CONNECTION__RTE_BSW_REQUIRED_MODE_GROUP, prototype)));
		if (connection.isPresent()) { // 1:1(n)
			Optional<ModeMachineInstance> modeInstance = this.context.builtQuery.tryFindDest(MODE_MACHINE_INSTANCE, connection.get().getRteBswProvidedModeGroup());
			if (modeInstance.isPresent()) {
				return connection.get().getRteBswProvidedModeGroup();
			}
		}
		return null;
	}
}
