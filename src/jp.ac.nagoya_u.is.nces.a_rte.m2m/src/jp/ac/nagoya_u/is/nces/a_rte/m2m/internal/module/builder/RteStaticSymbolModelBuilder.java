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

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.ECUC_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.RTE_BSW_GENERAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.ATOMIC_SW_COMPONENT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.BSW_MODULE_DESCRIPTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.IMPLEMENTATION_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.REFERRABLE__SHORT_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.OS_TASK_EX___GET_OWNER_PARTITION__OSTASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.EXTERNAL_ECU_SENDER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RTE_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.CONSTANT__VALUE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.RoleNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.Types;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComGroupSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucContainer;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswGeneral;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.POperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.ROperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.RVariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationError;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModeSenderPolicy;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuScale;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataTypeMappingSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IncludedDataTypeSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclaration;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeRequestTypeMap;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortApiOption;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortDefinedArgumentValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecArrayTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecCompositeTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordElementMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderRecRecordTypeMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SystemSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ExternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsEventSetEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.OsTaskActivateEntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TimingTriggeringEntityStartImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.TrustedFunctionComSendImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ArrayType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * RTE����Ū����ܥ�(��������������Х��ѿ�)�Υ�ǥ���ۤ��롣
 */
public class RteStaticSymbolModelBuilder {

	private final ModuleModelBuildContext context;
	private final MemoryMappingModelBuilder memmapBuilder;
	private final LocalSymbolModelBuilder localSymbolModelBuilder;

	public RteStaticSymbolModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.memmapBuilder = new MemoryMappingModelBuilder(context);
		this.localSymbolModelBuilder = new LocalSymbolModelBuilder(context);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * ��Ū����ܥ�Υ���ܥ��ǥ�(API)���ۤ��롣
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildApiSymbols() throws ModelException {
		buildDataTypeApiSymbols();
		buildSrApiSymbols();
		buildCsApiSymbols();
		buildModeApiSymbols();
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(�ǡ�����)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildDataTypeApiSymbols() throws ModelException {
		// �����ǡ������ι���
		List<ImplementationDataType> sourceDataTypes = this.context.query.<ImplementationDataType> findByKind(IMPLEMENTATION_DATA_TYPE);
		sortImplementationDataTypes(sourceDataTypes);
		for (ImplementationDataType sourceDataType : sourceDataTypes) {
			// �����������������Τ��⻲�Ȥ��������ǽ��������(�������Composite)���ᡢ��������¸�ߤ��ʤ��ʤ������������ˤ��Ƥ��롣
			getOrBuildImplementationDataType(sourceDataType);
		}

		// ����͡������͡����������ι���
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
	
			Swc targetSwc = optionalSwc.get();
	
			// ����͡�����Ӳ���������ι���
			for (ApplicationDataType sourceApplicationDataType : this.context.query.select(sourceSwComponentType.getUsingApplicationDataTypes(),
					hasOp(APPLICATION_DATA_TYPE_EX___PROVIDES_UPPER_LOWER_LIMIT_CONSTANT__APPLICATIONDATATYPE, true))) {
				buildUpperLowerLimitConstant(targetSwc, sourceApplicationDataType, sourceSwComponentType);
			}
	
			// ���������ι���
			for (AutosarDataType sourceDataType : sourceSwComponentType.getUsingDataTypes()) {
				ApplicationDataType sourceApplicationDataType;
				ImplementationDataType sourceImplementationDataType;
				if (sourceDataType instanceof ApplicationDataType) {
					sourceApplicationDataType = (ApplicationDataType) sourceDataType;
					sourceImplementationDataType = sourceSwComponentType.getImplementationDataType(sourceApplicationDataType);
				} else {
					sourceApplicationDataType = null;
					sourceImplementationDataType = (ImplementationDataType) sourceDataType;
				}
	
				if (this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE, sourceApplicationDataType)) {
					CompuMethod sourceCompuMethod = this.context.query.get(sourceImplementationDataType, IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE,
							sourceApplicationDataType);
					buildEnumConstant(targetSwc, sourceSwComponentType, sourceImplementationDataType, sourceCompuMethod);
				}
			}
	
		}
	}

	private void sortImplementationDataTypes(List<? extends ImplementationDataType> targetTypes) {
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(REFERRABLE__SHORT_NAME));
		Collections.sort(targetTypes, ordering);
	}

	private Type getOrBuildImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		// �����Ѥߤʤ����Ѥ���
		try {
			return this.context.builtQuery.findDestType(sourceDataType);
		} catch (ModelException e) {
			// ̤����
			// do nothing
		}

		// Ʊ�쥷��ܥ�ʤ����Ѥ���
		try {
			Type destType = this.context.query.selectSingle(this.context.cache.rte.getImplementationDataType(), hasAttr(TYPE__SYMBOL_NAME, sourceDataType.getShortName()));
			destType.getSource().add(sourceDataType);
			return destType;
		} catch (ModelException e) {
			// ̤����
			// do nothing
		}
		
		// ̤�����ʤΤ���������
		Type destType;
		if (sourceDataType.isRedefinitionType()) {
			destType = createRedefinitionImplementationDataType(sourceDataType);
		} else {
			if (sourceDataType.isArrayType()) {
				destType = createArrayImplementationDataType(sourceDataType);
			} else if (sourceDataType.isStructType()) {
				destType = createStructImplementationDataTypeType(sourceDataType);
			} else if (sourceDataType.isUnionType()) {
				destType = createUnionImplementationDataType(sourceDataType);
			} else if (sourceDataType.isPointerType()) {
				destType = createPointerImplementationDataType(sourceDataType);
			} else {
				destType = createPrimitiveImplementationDataType(sourceDataType);
			}
		}
		// ���������������뤫��Ƚ�̡��������ʤ���硤��¸���Ȥ������
		if (this.context.query.get(sourceDataType, IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE)) {
			this.context.cache.rte.getImplementationDataType().add(destType);
		} else {
			this.context.cache.rte.getDependentType().add(destType);
		}
		return destType;
	}

	private PrimitiveType createPrimitiveImplementationDataType(ImplementationDataType sourceDataType) {
		PrimitiveType destType = ModuleFactory.eINSTANCE.createPrimitiveType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);
		destType.setOriginalTypeSymbolName(sourceDataType.getBaseType().getNativeDeclaration());
		destType.setSize(sourceDataType.getBaseType().getBaseTypeSize());
		destType.setSignedness(Types.getSignedness(sourceDataType));
		return destType;
	}

	private Type createRedefinitionImplementationDataType(ImplementationDataType sourceImplType) throws ModelException {
		ImplementationDataType sourceSourceImplType = sourceImplType.getSwDataDefProps().getImplementationDataType();
		Type destSourceType = getOrBuildImplementationDataType(sourceSourceImplType);

		RedefinitionType destType = null;
		if (sourceSourceImplType.isPrimitiveType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionPrimitiveType();
		} else if (sourceSourceImplType.isArrayType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionArrayType();
		} else if (sourceSourceImplType.isStructType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionStructType();
		} else if (sourceSourceImplType.isUnionType()) {
			destType = ModuleFactory.eINSTANCE.createRedefinitionUnionType();
		} else if (sourceSourceImplType.isPointerType()) { // COVERAGE (������������ˤ⳺�����ʤ��ѥ������¸�ߤ��ʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
			destType = ModuleFactory.eINSTANCE.createRedefinitionPointerType();
		}
		
		destType.setSymbolName(sourceImplType.getShortName());
		destType.setOriginalTypeSymbolName(destSourceType.getOriginalTypeSymbolName()); // �縵��symbolName��Ʊ���ˤ���
		destType.setSingleSource(sourceImplType);
		destType.setSourceType(destSourceType);
		destType.setSize(destSourceType.getSize());
		destType.setSignedness(destSourceType.getSignedness());
		return destType;
	}

	private PointerType createPointerImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		PointerType destType = ModuleFactory.eINSTANCE.createPointerType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);
		
		// NOTE ̤���ݡ���
//		destType.setIsConstPointer(sourceDataType.getSwDataDefProps().getSwImplPolicy() == SwImplPolicyEnum.CONST);
//		destType.setIsConstTarget(sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getSwImplPolicy() == SwImplPolicyEnum.CONST);
		
		SwBaseType sourceRefBaseType = sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getBaseType();
		if (sourceRefBaseType != null) {
			Type destRefType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, sourceRefBaseType.getNativeDeclaration()));
			destType.setType(destRefType);
		} else {
			ImplementationDataType sourceRefImplType = sourceDataType.getSwDataDefProps().getSwPointerTargetProps().getSwDataDefProps().getImplementationDataType();
			destType.setType(getOrBuildImplementationDataType(sourceRefImplType));
		}
		return destType;
	}

	private ArrayType createArrayImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		ImplementationDataTypeElement sourceImplementationDataTypeElement = sourceDataType.getSubElement().get(0);

		ArrayType destType = ModuleFactory.eINSTANCE.createArrayType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);
		if (sourceImplementationDataTypeElement.isRedefinitionType()) {
			// Category��TYPE_REFERENCE�ξ�硢sign��original type symbolname�������ˡ���ѹ�
			ImplementationDataType sourceElementDataType = sourceImplementationDataTypeElement.getSwDataDefProps().getImplementationDataType();
			getOrBuildImplementationDataType(sourceElementDataType); // ��¸��η�����˺�������Ͽ����(����ѥ���������꤬�Ф뤿��)
			destType.setSignedness(Types.getSignedness(sourceElementDataType));
			destType.setOriginalTypeSymbolName(sourceElementDataType.getShortName());
		} else {
			destType.setSignedness(Types.getSignedness(sourceImplementationDataTypeElement));
			destType.setOriginalTypeSymbolName(sourceImplementationDataTypeElement.getSwDataDefProps().getBaseType().getNativeDeclaration());
		}
		destType.setArraySize(sourceImplementationDataTypeElement.getArraySize());
		return destType;
	}

	private StructType createStructImplementationDataTypeType(ImplementationDataType sourceDataType) throws ModelException {
		StructType destType = ModuleFactory.eINSTANCE.createStructType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);

		for (ImplementationDataTypeElement sourceElement : sourceDataType.getSubElement()) {
			StructMember destMember = ModuleFactory.eINSTANCE.createStructMember();
			destMember.setMemberName(sourceElement.getShortName());
			
			Type destMemberType;
			if (sourceElement.isRedefinitionType()) {
				// Category��TYPE_REFERENCE�ξ�硢�Ƶ�Ū�˽�����Ԥ�
				destMemberType = getOrBuildImplementationDataType(sourceElement.getSwDataDefProps().getImplementationDataType());
			} else {
				String nativeName = sourceElement.getSwDataDefProps().getBaseType().getNativeDeclaration();
				destMemberType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, nativeName));
			}
			destMember.setType(destMemberType);
			destType.getMember().add(destMember);
		}
		return destType;
	}
	
	private UnionType createUnionImplementationDataType(ImplementationDataType sourceDataType) throws ModelException {
		UnionType destType = ModuleFactory.eINSTANCE.createUnionType();
		destType.setSymbolName(sourceDataType.getShortName());
		destType.setSingleSource(sourceDataType);

		for (ImplementationDataTypeElement sourceElement : sourceDataType.getSubElement()) {
			UnionMember destMember = ModuleFactory.eINSTANCE.createUnionMember();
			destMember.setMemberName(sourceElement.getShortName());

			Type destMemberType;
			if (sourceElement.isRedefinitionType()) {
				// Category��TYPE_REFERENCE�ξ�硢�Ƶ�Ū�˽�����Ԥ�
				destMemberType = getOrBuildImplementationDataType(sourceElement.getSwDataDefProps().getImplementationDataType());
			} else {
				String nativeName = sourceElement.getSwDataDefProps().getBaseType().getNativeDeclaration();
				destMemberType = this.context.query.selectSingle(this.context.cache.rte.getDependentType(), hasAttr(TYPE__SYMBOL_NAME, nativeName));
			}
			destMember.setType(destMemberType);
			destType.getMember().add(destMember);
		}
		return destType;
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, ApplicationDataType sourceApplicationDataType, AtomicSwComponentType sourceSwComponentType) throws ModelException {
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, sourceSwComponentType.getImplementationDataType(sourceApplicationDataType));
		List<IncludedDataTypeSet> sourceIncludedDataTypeSets = sourceSwComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(sourceApplicationDataType);
		Set<String> sourceLiteralPrefixes = ImmutableSet.copyOf(this.context.query.<String> collect(sourceIncludedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));
	
		// ����͡������ͤ�����
		if (sourceLiteralPrefixes.isEmpty()) {
			buildUpperLowerLimitConstant(targetSwc, Optional.<String> absent(), sourceApplicationDataType, type);
		} else {
			for (String sourceLiteralPrefix : sourceLiteralPrefixes) {
				buildUpperLowerLimitConstant(targetSwc, Optional.of(sourceLiteralPrefix), sourceApplicationDataType, type);
			}
		}
	}

	private void buildUpperLowerLimitConstant(Swc targetSwc, Optional<String> sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		targetSwc.getApiUpperLowerLimitConstant().add(createUpperLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
		targetSwc.getApiUpperLowerLimitConstant().add(createLowerLimitConstant(sourceLiteralPrefix, sourceApplicationDataType, type));
	}

	private Constant createLowerLimitConstant(Optional<String> sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant destLowerLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		destLowerLimitConstant.setSymbolName(SymbolNames.createLowerLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		destLowerLimitConstant.setType(type);
		destLowerLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getLowerLimitValue());
		return destLowerLimitConstant;
	}

	private Constant createUpperLimitConstant(Optional<String> sourceLiteralPrefix, ApplicationDataType sourceApplicationDataType, PrimitiveType type) {
		Constant destUpperLimitConstant = ModuleFactory.eINSTANCE.createConstant();
		destUpperLimitConstant.setSymbolName(SymbolNames.createUpperLimitConstantName(sourceLiteralPrefix, sourceApplicationDataType));
		destUpperLimitConstant.setType(type);
		destUpperLimitConstant.setValue(sourceApplicationDataType.getDataConstr().getUpperLimitValue());
		return destUpperLimitConstant;
	}

	private void buildEnumConstant(Swc targetSwc, AtomicSwComponentType sourceSwComponentType, ImplementationDataType sourceImplementationDataType, CompuMethod sourceCompuMethod)
			throws ModelException {
		// ����͡������ͤ�����
		PrimitiveType type = this.context.builtQuery.findDest(TYPE, sourceImplementationDataType);
		List<IncludedDataTypeSet> sourceIncludedDataTypeSets = sourceSwComponentType.getInternalBehavior().getReferencerIncludedDataTypeSets(sourceImplementationDataType);
		Set<String> sourceLiteralPrefixes = ImmutableSet.copyOf(this.context.query.<String> collect(sourceIncludedDataTypeSets, INCLUDED_DATA_TYPE_SET__LITERAL_PREFIX));
	
		if (sourceLiteralPrefixes.isEmpty()) {
			for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
				if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
					targetSwc.getApiEnumConstant().add(createEnumConstant(Optional.<String> absent(), sourceCompuScale, type));
				}
			}
		} else {
			for (String sourceLiteralPrefix : sourceLiteralPrefixes) {
				for (CompuScale sourceCompuScale : sourceCompuMethod.getCompuInternalToPhys().getCompuScale()) {
					if (this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___PROVIDES_ENUM_CONSTANT__COMPUSCALE)) {
						targetSwc.getApiEnumConstant().add(createEnumConstant(Optional.of(sourceLiteralPrefix), sourceCompuScale, type));
					}
				}
			}
		}
	}

	private Constant createEnumConstant(Optional<String> sourceLiteralPrefix, CompuScale sourceCompuScale, PrimitiveType type) throws ModelException {
		String enumLiteral = this.context.query.get(sourceCompuScale, COMPU_SCALE_EX___GET_ENUM_LITERAL__COMPUSCALE);
	
		Constant destEnumConstant = ModuleFactory.eINSTANCE.createConstant();
		destEnumConstant.setSymbolName(SymbolNames.createEnumConstantName(sourceLiteralPrefix, enumLiteral));
		destEnumConstant.setType(type);
		destEnumConstant.setValue(sourceCompuScale.getLowerLimit().getValue());
		return destEnumConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(S/R)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSrApiSymbols() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Swc targetSwc = optionalSwc.get();

			// ���������ι���
			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						ImplementationDataType sourceImplType = sourceDataInstanceInSwc.getImplementationDataType();
						if (sourceImplType.isPrimitiveType() || sourceImplType.isPointerType()) {
							targetSwc.getSrApiInitValueConstant().add(createSrApiInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
						}
					}
				}
			}
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						ImplementationDataType sourceImplType = sourceDataInstanceInSwc.getImplementationDataType();
						if (sourceImplType.isPrimitiveType() || sourceImplType.isPointerType()) {
							targetSwc.getSrApiInitValueConstant().add(createSrApiInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
						}
					}
				}
			}
		}
	}

	private Constant createSrApiInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createSrInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createSrApiInitValueConstantName(sourceDataInstanceInSwc), RoleNames.SR_API_INIT_VALUE_ROLE_NAME);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(C/S)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildCsApiSymbols() {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Swc targetSwc = optionalSwc.get();

			// ���ץꥱ������󥨥顼����ι���
			targetSwc.getCsApiApplicationErrorConstant().addAll(createCsApplicationErrorConstants(sourceSwComponentType));
		}
	}

	private List<Constant> createCsApplicationErrorConstants(AtomicSwComponentType sourceSwComponentType) {
		// ���ץꥱ������󥨥顼����ι���
		List<Constant> destApplicationErrorConstants = Lists.newArrayList();
		for (ClientServerInterface sourceClientServerInterface : sourceSwComponentType.getUsingClientServerInterfaces()) {
			for (ApplicationError sourceApplicationError : sourceClientServerInterface.getPossibleError()) {
				// ���ץꥱ������󥨥顼���������
				destApplicationErrorConstants.add(createCsApplicationErrorConstant(sourceApplicationError));
			}
		}

		// ���ץꥱ������󥨥顼���������ʥ���ܥ�̾�ν�ʣ�����������������
		List<Constant> normalizedApplicationErrorConstants = Lists.newArrayList();

		ListMultimap<String, Constant> symbolName2ConstantMap = this.context.query.groupByKey(destApplicationErrorConstants, CONSTANT__SYMBOL_NAME);
		for (String keySymbolName : symbolName2ConstantMap.keys()) {
			List<Constant> constants = symbolName2ConstantMap.get(keySymbolName);

			Constant firstConstant = constants.get(0);
			for (Constant anotherConstant : constants.subList(1, constants.size())) {
				firstConstant.getSource().addAll(anotherConstant.getSource());
			}
			normalizedApplicationErrorConstants.add(firstConstant);
		}
		return normalizedApplicationErrorConstants;
	}

	private Constant createCsApplicationErrorConstant(ApplicationError sourceApplicationError) {
		Constant destApplicationErrorConstant = ModuleFactory.eINSTANCE.createConstant();
		destApplicationErrorConstant.setSymbolName(SymbolNames.createCsApplicationErrorConstantName(sourceApplicationError));
		destApplicationErrorConstant.setType(this.context.cache.stdReturnType);
		destApplicationErrorConstant.setValue(String.valueOf(sourceApplicationError.getErrorCode()));
		return destApplicationErrorConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(�⡼��)(API)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildModeApiSymbols() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Bswm targetBswm = optionalTargetBswm.get();
			buildModeDeclarationGroups(targetBswm, sourceBswModuleDescription);
		}
	}

	private void buildModeDeclarationGroups(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswm������Ȥ������Ȥ�ͭ����behavior��¸�ߤ��뤿�ᡢnull�����å�����

		for (DataTypeMappingSet sourceMappingSet : sourceBehavior.getDataTypeMapping()) {
			for (ModeRequestTypeMap sourceModeRequestTypeMap : sourceMappingSet.getModeRequestTypeMap()) {
				targetBswm.getModeDeclarationGroup().add(createModeDeclarationGroup(sourceBswModuleDescription, sourceModeRequestTypeMap.getModeGroup(), sourceModeRequestTypeMap));
			}
		}
	}

	private jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup createModeDeclarationGroup(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroup sourceModeDeclarationGroup, ModeRequestTypeMap sourceModeRequestTypeMap) throws ModelException {
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup destModeDeclarationGroup = ModuleFactory.eINSTANCE.createModeDeclarationGroup();
		destModeDeclarationGroup.setSingleSource(sourceModeDeclarationGroup);

		// �⡼�ɷ��ι���
		ModeType destModeType = createModeType(sourceModeRequestTypeMap.getModeGroup(), sourceModeRequestTypeMap);
		destModeDeclarationGroup.setModeType(destModeType);

		// �⡼�ɤμ������ι���
		destModeDeclarationGroup.setImplementationDataType(destModeType.getImplementationDataType());
		
		// �⡼����������ι���
		Constant destModeTransitionStatusConstant = ModuleFactory.eINSTANCE.createConstant();
		destModeTransitionStatusConstant.setExternalSymbolName(SymbolNames.createExternalModeTransitionConstantName(sourceModeDeclarationGroup));
		destModeTransitionStatusConstant.setSymbolName(SymbolNames.createModeTransitionConstantName(sourceBswModuleDescription, sourceModeDeclarationGroup));
		destModeTransitionStatusConstant.setType(destModeType.getImplementationDataType());
		destModeTransitionStatusConstant.setValue(String.valueOf(sourceModeDeclarationGroup.getModeDeclaration().size()));
		destModeDeclarationGroup.setModeTransitionStatusConstant(destModeTransitionStatusConstant);

		int idx = 0;
		for (ModeDeclaration sourceModeDeclaration : sourceModeDeclarationGroup.getModeDeclaration()) {
			// �⡼������ι���
			Constant destModeConstant = ModuleFactory.eINSTANCE.createConstant();
			destModeConstant.setSingleSource(sourceModeDeclaration);
			destModeConstant.setExternalSymbolName(SymbolNames.createExternalModeConstantName(sourceModeDeclarationGroup, sourceModeDeclaration));
			destModeConstant.setSymbolName(SymbolNames.createModeConstantName(sourceBswModuleDescription, sourceModeDeclarationGroup, sourceModeDeclaration));
			destModeConstant.setType(destModeType.getImplementationDataType());
			destModeConstant.setValue(String.valueOf(idx));
			destModeDeclarationGroup.getModeConstant().add(destModeConstant);

			// ����⡼������ι���
			if (sourceModeDeclaration == sourceModeDeclarationGroup.getInitialMode()) {
				Constant destInitModeConstant = ModuleFactory.eINSTANCE.createConstant();
				destInitModeConstant.setSymbolName(SymbolNames.createModeInitModeConstantName(sourceBswModuleDescription, sourceModeDeclarationGroup));
				destInitModeConstant.setType(destModeType.getImplementationDataType());
				destInitModeConstant.setValue(String.valueOf(idx));
				destModeDeclarationGroup.setInitModeConstant(destInitModeConstant);
			}
			idx++;
		}

		return destModeDeclarationGroup;
	}

	private ModeType createModeType(ModeDeclarationGroup sourceModeDeclarationGroup, ModeRequestTypeMap sourceModeRequestTypeMap) throws ModelException {
		ModeType destType = ModuleFactory.eINSTANCE.createModeType();
		destType.setSymbolName(SymbolNames.createModeTypeName(sourceModeDeclarationGroup));
		destType.setImplementationDataType(getOrBuildImplementationDataType(sourceModeRequestTypeMap.getImplementationDataType()));
		destType.setGuardName(SymbolNames.createModeTypeGuardName(sourceModeDeclarationGroup));
		return destType;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * ��Ū����ܥ�Υ���ܥ��ǥ�(����������)���ۤ��롣
	 * 
	 * @throws ModelException ��ǥ��Ѵ���ɬ�פȤʤ��ǥ�μ����˼��Ԥ������
	 */
	public void buildImplSymbols() throws ModelException {
		buildOsAccessImplSymbols();
		buildComAccessImplSymbols();
		buildEntityStartImplSymbols();
		buildSrImplSymbols();
		buildCsImplSymbols();
		buildModeImplSymbols();
		buildIrvImplSymbols();
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(OS��������)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildOsAccessImplSymbols() throws ModelException {
		buildOsTrustedMacros();
	}

	private void buildOsTrustedMacros() throws ModelException {
		for (EcucPartition sourceEcucPartition : this.context.query.<EcucPartition> findByKind(ECUC_PARTITION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceEcucPartition);
	
			targetPartition.setOsTrustedMacro(createOsTrustedMacro(sourceEcucPartition));
		}
	}

	private Macro createOsTrustedMacro(EcucPartition sourceEcucPartition) {
		Macro destMacro = ModuleFactory.eINSTANCE.createMacro();
		destMacro.setSingleSource(sourceEcucPartition);
		destMacro.setSymbolName(sourceEcucPartition.isTrusted() ? SymbolNames.OS_TRUSTED_MACRO : SymbolNames.OS_NON_TRUSTED_MACRO);
		return destMacro;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(COM��������)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildComAccessImplSymbols() throws ModelException {
		buildComMetaDataSymbols();
		buildComAccessFunctionAliasMacros();
		buildComReceiveBuffers();
		buildComTrustedFunctionParamTypes();
		buildComProxyFunctionTable();
	}

	// COM�᥿����ι���
	private void buildComMetaDataSymbols() throws ModelException {
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceDataInstanceInCompositions.isEmpty()) {
				continue;
			}
			buildComMetaDataSymbols(sourceComSignalGroup, sourceDataInstanceInCompositions.get(0).getPrototype());
		}
	}

	private void buildComMetaDataSymbols(ComSignalGroup sourceComSignalGroup, VariableDataInstanceInSwc sourceDataInstanceInSwc)
			throws ModelException {

		SenderReceiverToSignalGroupMapping sourceSignalMapping = getSenderReceiverToSignalGroupMapping(sourceComSignalGroup);
		SenderRecCompositeTypeMapping sourceCompositeTypeMapping = sourceSignalMapping.getTypeMapping();
	
		// Rte_BufferTypeComSignal���������ι���
		Constant destComGroupSignalMetaDataInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getImmediateConstant().add(destComGroupSignalMetaDataInitValueConstant);
	
		// Rte_BufferTypeOffset���������ι���
		Constant destTypeMemberOffsetMetaDataInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getImmediateConstant().add(destTypeMemberOffsetMetaDataInitValueConstant);
	
		// Rte_BufferTypeComSignal��Rte_BufferTypeOffset�Υ��Ф���
		ImplementationDataType sourceDataType = ((ImplementationDataType) sourceDataInstanceInSwc.getPrototype().getType()).getLeafImplementationDataType();
		Type destDataType = this.context.builtQuery.findDestType(sourceDataType);
		
		for (ImplementationDataTypeElement sourceElement : sourceDataType.getSubElement()) {
			if (destDataType instanceof ArrayType) {
				EList<SenderRecArrayElementMapping> sourceElementMapping = ((SenderRecArrayTypeMapping) sourceCompositeTypeMapping).getArrayElementMapping();
				for (int idx = 0; idx < sourceElementMapping.size(); idx++) {
					for (SenderRecArrayElementMapping senderRecArrayElementMapping : sourceElementMapping) {
						if(senderRecArrayElementMapping.getIndexedArrayElement().getIndex() == idx) {
							ComGroupSignal sourceGroupSignal = getComGroupSignal(sourceComSignalGroup, senderRecArrayElementMapping.getSystemSignal());
							addConstantMember(destComGroupSignalMetaDataInitValueConstant, SymbolNames.createComSignalSymbolicName(Optional.fromNullable(sourceGroupSignal)));
							addConstantMember(destTypeMemberOffsetMetaDataInitValueConstant, "(" + String.valueOf(idx) + "U * sizeof(" + destDataType.getOriginalTypeSymbolName() + "))");
						}
					}
				}
			} else if (destDataType instanceof StructType || destDataType instanceof UnionType) { // COVERAGE (ʬ������Ϥ���Ƥ���Τǥƥ����׷���������Ƥ���)
				for (SenderRecRecordElementMapping sourceElementMapping : ((SenderRecRecordTypeMapping) sourceCompositeTypeMapping).getRecordElementMapping()) {
					if (sourceElement == sourceElementMapping.getImplementationRecordElement()) {
						ComGroupSignal sourceGroupSignal = getComGroupSignal(sourceComSignalGroup, sourceElementMapping.getSystemSignal());
						addConstantMember(destComGroupSignalMetaDataInitValueConstant, SymbolNames.createComSignalSymbolicName(Optional.fromNullable(sourceGroupSignal)));
						addConstantMember(destTypeMemberOffsetMetaDataInitValueConstant, "Rte_offsetof(" + destDataType.getSymbolName() + ", " + sourceElement.getShortName() + ")");
						break;
					}
				}
			}
		}
	
		// COM�᥿����Υ���ܥ�Υ��åȤ���
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;

		GlobalVariableSet destComMetaDataVariableSet = ModuleFactory.eINSTANCE.createGlobalVariableSet();
		destComMetaDataVariableSet.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(sourcePartition));
		destComMetaDataVariableSet.setSymbolName(SymbolNames.createGlobalSetName(sourceComSignalGroup));
		destComMetaDataVariableSet.setHasStatic(false);
		destComMetaDataVariableSet.setHasConst(false);
		destComMetaDataVariableSet.setInitWithConstantValue(false);
	
		// Rte_BufferTypeComSignal�ι���
		GlobalVariable destComGroupSignalMetaDataVariable = createGlobalVariable(
				SymbolNames.createComMetaComGroupSignalVariableName(sourceComSignalGroup) + "[" + String.valueOf(sourceComSignalGroup.getComGroupSignal().size()) + "]", this.context.cache.comSignalIdType,
				destComGroupSignalMetaDataInitValueConstant, true);
		destComGroupSignalMetaDataVariable.setHasStatic(true);
		destComGroupSignalMetaDataVariable.setHasConst(true);
		destComGroupSignalMetaDataVariable.setInitWithConstantValue(true);
		destComMetaDataVariableSet.getGlobalVariable().add(0, destComGroupSignalMetaDataVariable);
	
		// Rte_BufferTypeOffset�ι���
		GlobalVariable destTypeMemberOffsetMetaDataVariable = createGlobalVariable(
				SymbolNames.createComMetaTypeMemberOffsetVariableName(sourceComSignalGroup) + "[" + String.valueOf(sourceComSignalGroup.getComGroupSignal().size()) + "]",
				this.context.cache.comMetaDataTypeMemberOffsetType, destTypeMemberOffsetMetaDataInitValueConstant, true);
		destTypeMemberOffsetMetaDataVariable.setHasStatic(true);
		destTypeMemberOffsetMetaDataVariable.setHasConst(true);
		destTypeMemberOffsetMetaDataVariable.setInitWithConstantValue(true);
		destComMetaDataVariableSet.getGlobalVariable().add(1, destTypeMemberOffsetMetaDataVariable);
	
		// Rte_BufferComMetaComplexData�ι���
		Constant destComMetaDataInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		addConstantMember(destComMetaDataInitValueConstant, SymbolNames.createComSignalSymbolicName(Optional.of(sourceComSignalGroup)));
		addConstantMember(destComMetaDataInitValueConstant, String.valueOf(sourceComSignalGroup.getComGroupSignal().size()) + "U");
		addConstantMember(destComMetaDataInitValueConstant, "&" + SymbolNames.createComMetaComGroupSignalVariableName(sourceComSignalGroup) + "[0]");
		addConstantMember(destComMetaDataInitValueConstant, "&" + SymbolNames.createComMetaTypeMemberOffsetVariableName(sourceComSignalGroup) + "[0]");
		this.context.cache.rte.getImmediateConstant().add(destComMetaDataInitValueConstant);
	
		GlobalVariable destComMetaDataVariable = createGlobalVariable(SymbolNames.createComMetaVariableName(sourceComSignalGroup), this.context.cache.comMetaDataType, destComMetaDataInitValueConstant, true);
		destComMetaDataVariable.setHasStatic(false);
		destComMetaDataVariable.setHasConst(false);
		destComMetaDataVariable.setInitWithConstantValue(true);
		destComMetaDataVariableSet.getGlobalVariable().add(2, destComMetaDataVariable);
	
		// ����������Ͽ
		targetPartition.getComMetaDataVariableSet().add(destComMetaDataVariableSet);
	}

	private SenderReceiverToSignalGroupMapping getSenderReceiverToSignalGroupMapping(ComSignalGroup comSigGroup) throws ModelException {
		SystemSignalGroup sysSigGroup = comSigGroup.getComSystemTemplateSignalGroup().getISignalGroup().getSystemSignalGroup();
		SenderReceiverToSignalGroupMapping mapping = this.context.query.findSingle(ref(SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP, sysSigGroup));
		return mapping;
	}

	private ComGroupSignal getComGroupSignal(ComSignalGroup comSignalGroup, SystemSignal sysSig) {
		for (ComGroupSignal cgSignal : comSignalGroup.getComGroupSignal()) {
			if (cgSignal.getComSystemTemplateSystemSignal().getISignal().getSystemSignal() == sysSig) {
				return cgSignal;
			}
		}
		// COVERAGE ���̤ã(���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
		return null;
	}

	// COM���������ؿ������ꥢ���ޥ���ι���
	private void buildComAccessFunctionAliasMacros() throws ModelException {
		// COM���������ؿ��ؤΥ����ꥢ���ޥ��������̵ͭ��Ƚ��
		// S/R�ǻ��Ѥ���Ƥ���COM�����ʥ륰�롼�פ�¸�ߤ������������
		boolean requiresSendFunctionAlias = false;
		boolean requiresReceiveFunctionAlias = false;
		for (ComSignalGroup sourceComSignalGroup : this.context.query.<ComSignalGroup> findByKind(COM_SIGNAL_GROUP)) {
			List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
			if (sourceDataInstanceInCompositions.isEmpty()) {
				continue;
			}

			ImplementationDataType sourceImplType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
			if (sourceImplType.isComplexType()) { // COVERAGE ���true(������ComSignalGroup��PrimitiveType�Ȥʤ�ѥ�����¸�ߤ��ʤ�����)
				VariableDataInstanceInSwc sourceDataInstanceInSwc = sourceDataInstanceInCompositions.get(0).getPrototype();
				if (sourceDataInstanceInSwc instanceof PVariableDataInstanceInSwc) {
					// ����¦�ޥ���ι���
					requiresSendFunctionAlias = true;
				} else {
					// ����¦�ޥ���ι���
					requiresReceiveFunctionAlias = true;
				}
			}
		}
	
		// COM���������ؿ��ؤΥ����ꥢ���ޥ���ι���
		Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
		Partition targetPartition = this.context.cache.masterBswPartition;
	
		// COM�����ؿ��ؤΥ����ꥢ���ޥ���ι���
		if (requiresSendFunctionAlias) {
			targetPartition.getComSignalApiAlias().add(createComSendSignalGroupFunctionAliasMacro(sourcePartition));
		}
	
		// COM�����ؿ��ؤΥ����ꥢ���ޥ���ι���
		if (requiresReceiveFunctionAlias) {
			targetPartition.getComSignalApiAlias().add(createComReceiveSignalGroupFunctionAliasMacro(sourcePartition));
		}
	}

	private FunctionMacro createComSendSignalGroupFunctionAliasMacro(Optional<EcucPartition> sourcePartition) {
		FunctionMacro destFunctionMacro = ModuleFactory.eINSTANCE.createFunctionMacro();
		destFunctionMacro.setSymbolName(SymbolNames.createComSendSignalGroupWrapperFunctionAliasName(sourcePartition));
		destFunctionMacro.setFunctionName(isShadowSignalApi()
				? SymbolNames.createComSendSignalGroupWithUpdateShadowSignalName(sourcePartition)
				: SymbolNames.createComSendSignalGroupWithoutUpdateShadowSignalName(sourcePartition));
		return destFunctionMacro;
	}

	private FunctionMacro createComReceiveSignalGroupFunctionAliasMacro(Optional<EcucPartition> sourcePartition) {
		FunctionMacro destFunctionMacro = ModuleFactory.eINSTANCE.createFunctionMacro();
		destFunctionMacro.setSymbolName(SymbolNames.createComReceiveSignalGroupWrapperFunctionAliasName(sourcePartition));
		destFunctionMacro.setFunctionName(isShadowSignalApi()
				? SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withShadowSignal(sourcePartition)
				: SymbolNames.createComReceiveSignalGroupWrapperFunctionName_withoutShadowSignal(sourcePartition));
		return destFunctionMacro;
	}

	private boolean isShadowSignalApi() {
		for (RteBswGeneral rteBswGeneral : this.context.query.<RteBswGeneral> findByKind(RTE_BSW_GENERAL)) {
			if (rteBswGeneral.getRteUseComShadowSignalApi()) {
				return true;
			}
		}
		
		return false;
	}

	// ʣ��ǡ�������COM�����Хåե��ι���
	private void buildComReceiveBuffers() throws ModelException {
        Optional<EcucPartition> sourcePartition = this.context.cache.sourceMasterBswPartition;
        Partition targetPartition = this.context.cache.masterBswPartition;

        for (ExternalEcuSender sourceExternalEcuSender : this.context.query.<ExternalEcuSender> findByKind(EXTERNAL_ECU_SENDER)) {
            if (this.context.query.get(sourceExternalEcuSender, EXTERNAL_ECU_SENDER_EX___PROVIDES_COM_CALLBACK__EXTERNALECUSENDER)) {
                Optional<RteBufferVariableSet> destComReceiveBuffer = checkAndCreateComReceiveBuffer(sourceExternalEcuSender, sourcePartition);
                if (destComReceiveBuffer.isPresent()) {
                    targetPartition.getComReceiveBufferVariableSet().add(destComReceiveBuffer.get());
                }
            }
        }
	}

    private Optional<RteBufferVariableSet> checkAndCreateComReceiveBuffer(ExternalEcuSender sourceExternalEcuSender, Optional<EcucPartition> sourcePartition) throws ModelException {
        if (sourceExternalEcuSender.getSourceSignalGroup() != null) {
            ComSignalGroup sourceComSignalGroup = sourceExternalEcuSender.getSourceSignalGroup();
            List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignalGroup, COM_SIGNAL_GROUP_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNALGROUP);
            if (sourceDataInstanceInCompositions.isEmpty()) { // COVERAGE ���false(sourceDataInstanceInCompositions��¸�ߤ����оݤ���ExternalEcuSender�Ȥʤ�ʤ�����)
                return Optional.absent();
            }

            ImplementationDataType sourceImplType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
            if (sourceImplType.isComplexType()) { // COVERAGE ���true(������ComSingnalGroup��PrimitiveType�Ȥʤ�ѥ�����¸�ߤ��ʤ�����)
            	Type type = this.context.builtQuery.findDestType(sourceImplType);
                return Optional.of(createComReceiveBuffer(sourceComSignalGroup, sourceDataInstanceInCompositions.get(0), type, sourcePartition));
            }
        } else if (sourceExternalEcuSender.getSourceSignal() != null) {
            ComSignal sourceComSignal = sourceExternalEcuSender.getSourceSignal();
            List<VariableDataInstanceInComposition> sourceDataInstanceInCompositions = this.context.query.get(sourceComSignal, COM_SIGNAL_EX___GET_VARIABLE_DATA_INSTANCE_IN_COMPOSITIONS__COMSIGNAL);
            if (sourceDataInstanceInCompositions.isEmpty()) { // COVERAGE ���false(sourceDataInstanceInCompositions��¸�ߤ����оݤ���ExternalEcuSender�Ȥʤ�ʤ�����)
                return Optional.absent();
            }

            ImplementationDataType sourceImplType = sourceDataInstanceInCompositions.get(0).getPrototype().getImplementationDataType();
            if (sourceImplType.isComplexType()) {
            	Type type = this.context.builtQuery.findDestType(sourceImplType);
                return Optional.of(createComReceiveBuffer(sourceComSignal, sourceDataInstanceInCompositions.get(0), type, sourcePartition));
            }
        }
        return Optional.absent();
    }

	private RteBufferVariableSet createComReceiveBuffer(EcucContainer sourceComSignalOrComSignalGroup, VariableDataInstanceInComposition sourceDataInstanceInComposition, Type type, Optional<EcucPartition> sourcePartition) throws ModelException {
		GlobalVariable destValueVariable = createComReceiveBufferValueVariable(sourceComSignalOrComSignalGroup, type);
		destValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataInstanceInComposition));

		RteBufferVariableSet destComReceiveBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destComReceiveBuffer.setSingleSource(sourceComSignalOrComSignalGroup);
		destComReceiveBuffer.setComplexVariable(destValueVariable);
		return destComReceiveBuffer;
	}

	private GlobalVariable createComReceiveBufferValueVariable(EcucContainer sourceComSignalOrComSignalGroup, Type type) {
		GlobalVariable destValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destValueVariable.setSymbolName(SymbolNames.createComReceiveBufferVariableName(sourceComSignalOrComSignalGroup));
		destValueVariable.setType(type);
		destValueVariable.setHasStatic(false);
		destValueVariable.setHasConst(false);
		return destValueVariable;
	}

	// ����ؿ���ͳCOM�����Ѱ������ι���
	private void buildComTrustedFunctionParamTypes() {
		Rte targetRte = this.context.cache.rte;

		this.context.cache.comSendSignalTfParamType = Optional.absent();
		this.context.cache.comSendSignalGroupTfParamType = Optional.absent();
		Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignal = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL)));
		if (sourceComSendImplForComSignal.isPresent()) {
			buildComSendSignalTrustedFunctionParamType(targetRte);
		}

		Optional<TrustedFunctionComSendImplementation> sourceComSendImplForComSignalGroup = this.context.query.tryFindSingle(isKindOf(TRUSTED_FUNCTION_COM_SEND_IMPLEMENTATION).AND(
				refExists(COM_SEND_IMPLEMENTATION__COM_SIGNAL_GROUP)));
		if (sourceComSendImplForComSignalGroup.isPresent()) {
			buildComSendSignalGroupTrustedFunctionParamType(targetRte);
		}
	}

	private void buildComSendSignalTrustedFunctionParamType(Rte targetRte) {
		ComSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType();
		destType.setSymbolName(SymbolNames.COM_SEND_SIGNAL_TF_PARAM_TYPE_NAME);
		destType.setIsGroup(false);
		this.context.cache.comSendSignalTfParamType = Optional.of(destType);
		targetRte.setComSendSignalTfParamType(destType);
	}

	private void buildComSendSignalGroupTrustedFunctionParamType(Rte targetRte) {
		ComSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType();
		destType.setSymbolName(SymbolNames.COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE_NAME);
		destType.setIsGroup(true);
		this.context.cache.comSendSignalGroupTfParamType = Optional.of(destType);
		targetRte.setComSendSignalGroupTfParamType(destType);
	}

	// �ץ�����ͳCOM�����Υϥ�ɥ�ؿ��ơ��֥�ι���
	private void buildComProxyFunctionTable() throws ModelException {
		Partition targetPartition = this.context.cache.masterBswPartition;
		if (!needToCreateComProxyFunctionTable()) {
			return;
		}

		// COM�ץ����Υϥ�ɥ�ؿ��ơ��֥����
		Constant destFunctionTableInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		this.context.cache.rte.getImmediateConstant().add(destFunctionTableInitValueConstant);

		GlobalVariable destFunctionTableVariable = ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable();
		destFunctionTableVariable.setSymbolName(SymbolNames.createComProxyFunctionTableVariableName());
		destFunctionTableVariable.setType(this.context.cache.voidType);
		destFunctionTableVariable.setInitValueConstant(destFunctionTableInitValueConstant);
		destFunctionTableVariable.setInitAtDefinition(true);

		destFunctionTableVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) targetPartition.getSingleSource())));
		destFunctionTableVariable.setHasStatic(true);
		destFunctionTableVariable.setHasConst(false);
		destFunctionTableVariable.setInitWithConstantValue(true);
		targetPartition.setComProxyFunctionTableVariable(destFunctionTableVariable);

		List<Constant> destFunctionTableIndexConstants = new ArrayList<Constant>();

		for (ComSendProxy sourceComSendProxy : this.context.query.<ComSendProxy> findByKind(COM_SEND_PROXY)) {
			for (ComSendProxyInteraction sourceComSendProxyInteraction : sourceComSendProxy.getInteraction()) {
				if (sourceComSendProxyInteraction.getSignalDataType().isPrimitiveType())
					continue;

				ProxyComSendImplementation sourceSendImplementation = this.context.query.<ProxyComSendImplementation> findSingle(ref(PROXY_COM_SEND_IMPLEMENTATION__PROXY_INTERACTION, sourceComSendProxyInteraction));
				InternalEcuSender sourceSender = sourceSendImplementation.getParent().getInternalEcuSenders().get(0);
				PVariableDataInstanceInSwc sourceDataInstanceInSwc = (PVariableDataInstanceInSwc) sourceSender.getSource().getPrototype();
				Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceDataInstanceInSwc.getOwnerAtomicSwc());
				if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
					continue;
				}

				// COM�����ʥ������COM�ץ����Хåե�����
				if (sourceSendImplementation.getComSignal() != null) {
					destFunctionTableIndexConstants.add(createComProxyFunctionIndexConstant(sourceDataInstanceInSwc,
							SymbolNames.createComProxyFunctionTableIndexConstantName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal())));
					addConstantMember(destFunctionTableInitValueConstant, "&" + SymbolNames.createComProxyFunctionName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal()));
					if (sourceComSendProxy instanceof PeriodicComSendProxy) {
						buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createPeriodicComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal()));
					} else {
						buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createImmediateComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignal()));
					}
				}

				// COM�����ʥ륰�롼�׸�����COM�ץ����Хåե�����
				if (sourceSendImplementation.getComSignalGroup() != null) {
					destFunctionTableIndexConstants.add(createComProxyFunctionIndexConstant(sourceDataInstanceInSwc,
							SymbolNames.createComProxyFunctionTableIndexConstantName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup())));
					addConstantMember(destFunctionTableInitValueConstant, "&" + SymbolNames.createComProxyFunctionName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup()));
					if (sourceComSendProxy instanceof PeriodicComSendProxy) {
						buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createPeriodicComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup()));
					} else {
						buildComProxyBuffer(targetPartition, sourceDataInstanceInSwc, SymbolNames.createImmediateComProxyBufferVariableName(sourceDataInstanceInSwc, sourceSendImplementation.getComSignalGroup()));
					}
				}
			}
		}

		// COM�ץ����Υϥ�ɥ�ؿ��ơ��֥�Υ��Фȳƥ��Ф�ID����򥽡���
		Ordering<EObject> orderingBySymbolName = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(CONSTANT__SYMBOL_NAME));
		Collections.sort(destFunctionTableIndexConstants, orderingBySymbolName);

		Ordering<EObject> orderingByConstantValue = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(CONSTANT__VALUE));
		ECollections.sort(destFunctionTableInitValueConstant.getMember(), orderingByConstantValue);

		// ID�����ID�����
		int index = 0;
		for (Constant targetConstant : destFunctionTableIndexConstants) {
			targetConstant.setValue(String.valueOf(index));
			index++;
		}

		// ��������ID���������������Ͽ
		targetPartition.getComProxyFunctionTableIndexConstant().addAll(destFunctionTableIndexConstants);

		// �ơ��֥륵�����������
		targetPartition.setComProxyFunctionTableSizeConstant(createComProxyFunctionTableSizeConstant(index));
	}

	private boolean needToCreateComProxyFunctionTable() {
		for (ComSendProxyInteraction proxyInteraction : this.context.query.<ComSendProxyInteraction> findByKind(COM_SEND_PROXY_INTERACTION)) {
			if (proxyInteraction.getSignalDataType().isComplexType()) {
				return true;
			}
		}
		return false;
	}

	private Constant createComProxyFunctionIndexConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, String symbolName) {
		Constant destIndexConstant = ModuleFactory.eINSTANCE.createConstant();
		destIndexConstant.setSingleSource(sourceDataInstanceInSwc);
		destIndexConstant.setSymbolName(symbolName);
		return destIndexConstant;
	}

	private void buildComProxyBuffer(Partition targetPartition, PVariableDataInstanceInSwc sourceDataInstanceInSwc, String symbol) throws ModelException {
		GlobalVariable destComProxyBufferVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destComProxyBufferVariable.setSymbolName(symbol);
		destComProxyBufferVariable.setType(this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType()));
		destComProxyBufferVariable.setHasStatic(false);
		destComProxyBufferVariable.setHasConst(false);
		destComProxyBufferVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable((EcucPartition) targetPartition.getSingleSource())));

		RteBufferVariableSet destComProxyBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destComProxyBuffer.setComplexVariable(destComProxyBufferVariable);
		targetPartition.getComProxyBufferVariableSet().add(destComProxyBuffer);
	}

	private Constant createComProxyFunctionTableSizeConstant(int tableSize) {
		Constant destFunctionTableSizeConstant = ModuleFactory.eINSTANCE.createConstant();
		destFunctionTableSizeConstant.setSymbolName(SymbolNames.COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT_NAME);
		destFunctionTableSizeConstant.setValue(String.valueOf(tableSize));
		return destFunctionTableSizeConstant;
	}

	private void addConstantMember(Constant targetConstant, String symbol) {
		ConstantMember member = ModuleFactory.eINSTANCE.createConstantMember();
		member.setValue(symbol);
		targetConstant.getMember().add(member);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(S/R)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildSrImplSymbols() throws ModelException {
		buildSrRteSendTrustedFunctionParamTypes();
		buildSrDataTypeImplConstants();
		buildSrRteBufferSymbols();
		buildSrFilterSymbols();
	}

	private void buildSrRteSendTrustedFunctionParamTypes() {
		Rte targetRte = this.context.cache.rte;
		this.context.cache.rteSendTfParamType = Optional.absent();

		if (!this.context.query.findByKind(TRUSTED_FUNCTION_RTE_SEND_IMPLEMENTATION).isEmpty()) {
			RteSendTrustedFunctionParamType destType = ModuleFactory.eINSTANCE.createRteSendTrustedFunctionParamType();
			destType.setSymbolName(SymbolNames.RTE_SEND_TRUSTED_FUNCTION_PARAM_TYPE_NAME);
			targetRte.setSrRteSendTfParamType(destType);
			this.context.cache.rteSendTfParamType = Optional.of(destType);
		}
	}

	private void buildSrDataTypeImplConstants() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Swc targetSwc = optionalSwc.get();
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					// ̵��������ι���
					if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
						buildSrImplInvalidValueConstant(targetSwc, sourceDataInstanceInSwc);
					}

					// RTE�����������������ι���
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getSrImplInitValueConstant().add(createSrImplInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
					}
				}
			}

			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				for (PVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<PVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					// ̵��������ι���
					if (sourceDataInstanceInSwc.isInvalidationEnabled()) {
						buildSrImplInvalidValueConstant(targetSwc, sourceDataInstanceInSwc);
					}

					// RTE�����������������ι���
					if (this.context.query.get(sourceDataInstanceInSwc, VARIABLE_DATA_INSTANCE_IN_SWC_EX___PROVIDES_INIT_VALUE_CONSTANT__VARIABLEDATAINSTANCEINSWC)) {
						targetSwc.getSrImplInitValueConstant().add(createSrImplInitValueConstant(sourceDataInstanceInSwc, sourceDataInstanceInSwc.getInitValue()));
					}
				}
			}
		}
	}

	private Constant createSrImplInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc) throws ModelException {
		return createSrInitValueConstant(sourceDataInstanceInSwc, sourceInitValueInSwc, SymbolNames.createSrImplInitValueConstantName(sourceDataInstanceInSwc), RoleNames.SR_IMPL_INIT_VALUE_ROLE_NAME);
	}

	private void buildSrImplInvalidValueConstant(Swc targetSwc, VariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());
		ValueSpecification sourceInvalidValue = sourceDataInstanceInSwc.getInvalidValue();

		// ̵�������������
		Constant destInvalidValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInvalidValueConstant.setSingleSource(sourceDataInstanceInSwc);
		destInvalidValueConstant.setRoleName(RoleNames.SR_INVALID_VALUE_ROLE_NAME);
		destInvalidValueConstant.setSymbolName(SymbolNames.createSrInvalidValueConstantName(sourceDataInstanceInSwc));
		destInvalidValueConstant.setType(type);
		destInvalidValueConstant.setValue(this.context.query.<String> get(sourceInvalidValue, VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION));

		this.localSymbolModelBuilder.buildConstantValueType(destInvalidValueConstant, sourceInvalidValue);
		targetSwc.getSrImplInvalidValueConstant().add(destInvalidValueConstant);
	}

	private void buildSrRteBufferSymbols() throws ModelException {
		for (RteValueBufferImplementation sourceValueBufferImplementation : this.context.query.<RteValueBufferImplementation> findByKind(RTE_VALUE_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceValueBufferImplementation.getOwnerPartition());

			InternalEcuReceiver receiver = sourceValueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			if (receiver.getSource().getPrototype().isEventSemantics()) {
				Constant destMaxLengthConstant = createSrRteBufferQueueMaxLengthConstant(sourceValueBufferImplementation, receiver);
				this.context.cache.rte.getSrRteBufferQueueMaxLengthConstant().add(destMaxLengthConstant);

				RteBufferQueueType destQueueType = createSrRteBufferQueueType(sourceValueBufferImplementation, receiver, destMaxLengthConstant);
				this.context.cache.rte.getSrRteBufferQueueType().add(destQueueType);

				RteBufferQueuedVariable destQueuedVariable = createSrRteBufferQueuedVariable(sourceValueBufferImplementation, receiver, destQueueType);
				destQueuedVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), receiver.getSource()));
				targetPartition.getSrRteBufferQueuedVariable().add(destQueuedVariable);

			} else {
				buildSrRteBufferVariableSet(targetPartition, sourceValueBufferImplementation, receiver);
			}
		}

		// NOTE: ���������ϸ��̲ս�ǥ����Ȥ򤫤������ˤȤ��Ƥ��뤿�ᡢRteBufferQueueType�ϥ�����
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(TYPE__SYMBOL_NAME));
		ECollections.sort(this.context.cache.rte.getSrRteBufferQueueType(), ordering);
	}

	private void buildSrRteBufferVariableSet(Partition targetPartition, RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceReceiver.getSource().getPrototype().getImplementationDataType());

		// RTE�Хåե��ν��������ι���
		Constant destInitValueConstant = createSrRteBufferInitValueConstant(sourceValueBufferImplementation, sourceReceiver, type);
		targetPartition.getSrRteBufferInitValueConstant().add(destInitValueConstant);

		// RTE�Хåե��ι���
		targetPartition.getSrRteBufferVariableSet().add(createSrRteBufferVariableSet(sourceValueBufferImplementation, sourceReceiver, type, destInitValueConstant));
	}

	private RteBufferVariableSet createSrRteBufferVariableSet(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Type type, Constant initValueConstant)
			throws ModelException {
		boolean initAtDefinition = this.context.query.<Boolean> get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION);
	
		RteBufferVariableSet destRteBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destRteBuffer.setSingleSource(sourceValueBufferImplementation);
		destRteBuffer.setSymbolName(SymbolNames.createSrRteBufferVariableName(sourceReceiver.getSource())); // NOTE C�����ˤϸ���ʤ����ۥ���ܥ�����������Ȥ��Թ�奷��ܥ�̾�����ꤷ�Ƥ���
	
		GlobalVariable destValueVariable = createSrRteBufferValueVariable(sourceValueBufferImplementation, sourceReceiver, type, initValueConstant, initAtDefinition);
		destValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), sourceReceiver.getSource()));
		destRteBuffer.setValueVariable(destValueVariable);
		
		if (sourceValueBufferImplementation.getHasStatus()) {
			GlobalVariable destStatusVariable = createSrRteBufferStatusVariable(sourceValueBufferImplementation, sourceReceiver, initAtDefinition);
			destStatusVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition())));
			destRteBuffer.setStatusVariable(destStatusVariable);
		}
		
		if (!initValueConstant.getMember().isEmpty()) {
			GlobalVariable destInitValueVariable = createSrRteBufferInitValueVariable(sourceValueBufferImplementation, sourceReceiver, type, initValueConstant);
			destInitValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(Optional.fromNullable(sourceValueBufferImplementation.getOwnerPartition()), sourceReceiver.getSource()));
			destInitValueVariable.setHasConst(true);
			destInitValueVariable.setHasStatic(false);
			initValueConstant.setRepresentedVariableName(destInitValueVariable.getSymbolName());
			destRteBuffer.setInitValueVariable(destInitValueVariable);
		}
	
		return destRteBuffer;
	}

	private Constant createSrRteBufferInitValueConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver, Type type) throws ModelException {
		ValueSpecification sourceInitValue = this.context.query.get(receiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
	
		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSingleSource(sourceValueBufferImplementation);
		destInitValueConstant.setSymbolName(SymbolNames.createSrRteBufferInitValueConstantName(receiver.getSource()));
		destInitValueConstant.setType(type);
	
		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	private GlobalVariable createSrRteBufferValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Type type, Constant initValueConstant,
			boolean initAtDefinition) {
		GlobalVariable destValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destValueVariable.setSymbolName(SymbolNames.createSrRteBufferValueVariableName(sourceReceiver.getSource()));
		destValueVariable.setHasConst(false);
		destValueVariable.setHasStatic(false);
		destValueVariable.setType(type);
		destValueVariable.setInitValueConstant(initValueConstant);
		destValueVariable.setInitAtDefinition(initAtDefinition);
		return destValueVariable;
	}

	private GlobalVariable createSrRteBufferInitValueVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Type type, Constant initValueConstant) {
		GlobalVariable destValueVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destValueVariable.setSymbolName(SymbolNames.createSrRteBufferInitValueVariableName(sourceReceiver.getSource()));
		destValueVariable.setHasConst(false);
		destValueVariable.setHasStatic(false);
		destValueVariable.setType(type);
		destValueVariable.setInitValueConstant(initValueConstant);
		destValueVariable.setInitAtDefinition(true);
		return destValueVariable;
	}

	private GlobalVariable createSrRteBufferStatusVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, boolean initAtDefinition) {
		GlobalVariable destStatusVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destStatusVariable.setSymbolName(SymbolNames.createSrRteBufferStatusVariableName(sourceReceiver.getSource()));
		destStatusVariable.setHasConst(false);
		destStatusVariable.setHasStatic(false);
		destStatusVariable.setType(this.context.cache.stdReturnType);
		destStatusVariable.setInitValueConstant(this.context.cache.rteErrorOkConstant);
		destStatusVariable.setInitAtDefinition(initAtDefinition);
		return destStatusVariable;
	}

	private RteBufferQueueType createSrRteBufferQueueType(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, Constant maxLengthConstant)
			throws ModelException {
		RteBufferQueueType destQueueType = ModuleFactory.eINSTANCE.createRteBufferQueueType();
		destQueueType.setSingleSource(sourceValueBufferImplementation);
		destQueueType.setSymbolName(SymbolNames.createSrRteBufferQueueTypeName(sourceReceiver.getSource()));
		destQueueType.setElementType(this.context.builtQuery.findDestType(sourceReceiver.getSource().getPrototype().getImplementationDataType()));			
		destQueueType.setMaxLengthConstant(maxLengthConstant);
		return destQueueType;
	}

	private RteBufferQueuedVariable createSrRteBufferQueuedVariable(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver sourceReceiver, RteBufferQueueType queueType)
			throws ModelException {
		RteBufferQueuedVariable destQueuedVariable = ModuleFactory.eINSTANCE.createRteBufferQueuedVariable();
		destQueuedVariable.setSingleSource(sourceValueBufferImplementation);
		destQueuedVariable.setSymbolName(SymbolNames.createSrRteBufferQueuedVariableName(sourceReceiver.getSource()));
		destQueuedVariable.setType(queueType);
		destQueuedVariable.setHasConst(false);
		destQueuedVariable.setHasStatic(false);
	
		destQueuedVariable.setInitAtDefinition(this.context.query.<Boolean> get(sourceReceiver.getSource(), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_DECLARATION__VARIABLEDATAINSTANCEINCOMPOSITION));
		return destQueuedVariable;
	}

	private Constant createSrRteBufferQueueMaxLengthConstant(RteValueBufferImplementation sourceValueBufferImplementation, InternalEcuReceiver receiver) {
		RVariableDataInstanceInSwc sourceDataInstanceInSwc = (RVariableDataInstanceInSwc) receiver.getSource().getPrototype();
	
		Constant destMaxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		destMaxLengthConstant.setSymbolName(SymbolNames.createSrRteBufferQueueMaxLengthConstantName(receiver.getSource()));
		destMaxLengthConstant.setType(this.context.cache.uint32Type);
		destMaxLengthConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getQueueLength()));
		destMaxLengthConstant.setSingleSource(sourceValueBufferImplementation);
		return destMaxLengthConstant;
	}

	private void buildSrFilterSymbols() throws ModelException {
		// �ե��륿����ι���
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
		
			Swc targetSwc = optionalSwc.get();
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (RVariableDataInstanceInSwc sourceDataInstanceInSwc : this.context.query.<RVariableDataInstanceInSwc> find(ref(VARIABLE_DATA_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (sourceDataInstanceInSwc.isFilterEnabled()) {
						buildSrFilterConstant(targetSwc, sourceDataInstanceInSwc);
					}
				}
			}
		}
	
		// �ե��륿�ѿ��ι���
		for (FilterBufferImplementation sourceFilterBufferImplementation : this.context.query.<FilterBufferImplementation> findByKind(FILTER_BUFFER_IMPLEMENTATION)) {
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceFilterBufferImplementation.getOwnerPartition());
			buildSrFilterVariable(targetPartition, sourceFilterBufferImplementation);
		}
	}

	private void buildSrFilterConstant(Swc targetSwc, RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		switch (sourceDataInstanceInSwc.getFilter().getDataFilterType()) {
		case MASKED_NEW_DIFFERS_MASKED_OLD: {
			targetSwc.getSrFilterConstant().add(createSrFilterMaskConstant(sourceDataInstanceInSwc));
			break;
		}
		case MASKED_NEW_DIFFERS_X:
		case MASKED_NEW_EQUALS_X: {
			targetSwc.getSrFilterConstant().add(createSrFilterMaskConstant(sourceDataInstanceInSwc));
			targetSwc.getSrFilterConstant().add(createSrFilterXConstant(sourceDataInstanceInSwc));
			break;
		}
		case NEW_IS_OUTSIDE:
		case NEW_IS_WITHIN: {
			targetSwc.getSrFilterConstant().add(createSrFilterMinConstant(sourceDataInstanceInSwc));
			targetSwc.getSrFilterConstant().add(createSrFilterMaxConstant(sourceDataInstanceInSwc));
			break;
		}
		case ONE_EVERY_N: {
			targetSwc.getSrFilterConstant().add(createSrFilterPeriodConstant(sourceDataInstanceInSwc));
			targetSwc.getSrFilterConstant().add(createSrFilterOffsetConstant(sourceDataInstanceInSwc));
			break;
		}
		case ALWAYS:
		case NEVER:
		default:
			break;
		}
	}

	private Constant createSrFilterMaskConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_MASK_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterMaskConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMask()));
		return destConstant;
	}

	private Constant createSrFilterXConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_X_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterXConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getX()));
		return destConstant;
	}

	private Constant createSrFilterMinConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_MIN_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterMinConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMin()));
		return destConstant;
	}

	private Constant createSrFilterMaxConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) throws ModelException {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_MAX_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterMaxConstantName(sourceDataInstanceInSwc));
		destConstant.setType(this.context.builtQuery.findDestPrimitiveType(sourceDataInstanceInSwc.getImplementationDataType()));
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getMax()));
		return destConstant;
	}

	private Constant createSrFilterPeriodConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) {
		PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceDataInstanceInSwc.getFilter().getPeriod());

		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_PERIOD_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterPeriodConstantName(sourceDataInstanceInSwc));
		destConstant.setType(type);
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getPeriod()));
		return destConstant;
	}

	private Constant createSrFilterOffsetConstant(RVariableDataInstanceInSwc sourceDataInstanceInSwc) {
		PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceDataInstanceInSwc.getFilter().getPeriod());

		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceDataInstanceInSwc);
		destConstant.setRoleName(RoleNames.SR_FILTER_OFFSET_ROLE_NAME);
		destConstant.setSymbolName(SymbolNames.createSrFilterOffsetConstantName(sourceDataInstanceInSwc));
		destConstant.setType(type);
		destConstant.setValue(String.valueOf(sourceDataInstanceInSwc.getFilter().getOffset()));
		return destConstant;
	}

	private void buildSrFilterVariable(Partition targetPartition, FilterBufferImplementation sourceFilterBufferImplementation) throws ModelException {
		InternalEcuReceiver sourceReceiver = sourceFilterBufferImplementation.getParent().getInternalEcuReceivers().get(0);
		RVariableDataInstanceInSwc sourceDataInstance = (RVariableDataInstanceInSwc) sourceReceiver.getSource().getPrototype();
	
		// �ե��륿�Хåե�������
		if (this.context.query.get(sourceDataInstance, RVARIABLE_DATA_INSTANCE_IN_SWC_EX___REQUIRES_FILTER_OLD_VALUE_VARIABLE__RVARIABLEDATAINSTANCEINSWC)) {
			// �ե��륿����ͥХåե�������
			PrimitiveType type = this.context.builtQuery.findDestPrimitiveType(sourceDataInstance.getImplementationDataType());
	
			GlobalVariable destFilterVariable = createSrFilterOldValueVariable(sourceFilterBufferImplementation, sourceReceiver, type);
			targetPartition.getSrFilterOldValueVariable().add(destFilterVariable);
		} else {
			// �ե��륿����Хåե�������
			PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceDataInstance.getFilter().getPeriod());
	
			Constant destFilterOccurrenceInitValue = createSrFilterOccurrenceInitValueConstant(sourceFilterBufferImplementation, sourceReceiver, sourceDataInstance, type);
			targetPartition.getSrFilterConstant().add(destFilterOccurrenceInitValue);
	
			GlobalVariable destFilterVariable = createSrFilterOccurrenceVariable(sourceFilterBufferImplementation, sourceReceiver, type, destFilterOccurrenceInitValue);
			targetPartition.getSrFilterOccurrenceVariable().add(destFilterVariable);
		}
	}

	private Constant createSrFilterOccurrenceInitValueConstant(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver sourceReceiver,
			RVariableDataInstanceInSwc sourceDataInstanceInSwc, PrimitiveType type) {
		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourceFilterBufferImplementation);
		destConstant.setSymbolName(SymbolNames.createSrFilterOccurrenceInitValueConstantName(sourceReceiver.getSource()));
		destConstant.setType(type);
		destConstant.setValue("0");
		return destConstant;
	}

	private GlobalVariable createSrFilterOccurrenceVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver sourceReceiver, PrimitiveType type,
			Constant filterOccurrenceInitValue) {
		GlobalVariable destFilterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destFilterVariable.setSingleSource(sourceFilterBufferImplementation);
		destFilterVariable.setSymbolName(SymbolNames.createSrFilterOccurrenceVariableName(sourceReceiver.getSource()));
		destFilterVariable.setType(type);
		destFilterVariable.setInitValueConstant(filterOccurrenceInitValue);
		destFilterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		destFilterVariable.setHasStatic(false);
		destFilterVariable.setHasConst(false);
		return destFilterVariable;
	}

	private GlobalVariable createSrFilterOldValueVariable(FilterBufferImplementation sourceFilterBufferImplementation, InternalEcuReceiver sourceReceiver, PrimitiveType type) throws ModelException {
		Constant initValueConstant = this.context.builtQuery.findDest(CONSTANT, sourceFilterBufferImplementation.getParent().getValueBufferImplementation());
	
		GlobalVariable destFilterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destFilterVariable.setSymbolName(SymbolNames.createSrFilterOldValueVariableName(sourceReceiver.getSource()));
		destFilterVariable.setType(type);
		destFilterVariable.setSingleSource(sourceFilterBufferImplementation);
		destFilterVariable.setInitValueConstant(initValueConstant);
		destFilterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceFilterBufferImplementation.getOwnerPartition())));
		destFilterVariable.setHasStatic(false);
		destFilterVariable.setHasConst(false);
		return destFilterVariable;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(C/S)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildCsImplSymbols() throws ModelException {
		// �ݡ��������������ι���
		buildCsPortDefinedValueConstants();

		// ����ؿ���ͳ������˻��Ѥ��륷��ܥ�ι���
		buildCsSymbolsForCsTrustedFunction();
	}

	private void buildCsPortDefinedValueConstants() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
		
			Swc targetSwc = optionalSwc.get();
			for (PPortPrototype sourcePortPrototype : sourceSwComponentType.getPPorts()) {
				if (!sourcePortPrototype.getPortApiOption().isEmpty()) {
					PortApiOption sourcePortApiOption = sourcePortPrototype.getPortApiOption().get(0);
					buildCsPortArgValueConstants(targetSwc, sourcePortApiOption);
				}
			}
		}
	}
	
	private void buildCsPortArgValueConstants(Swc targetSwc, PortApiOption sourcePortApiOption) throws ModelException {
		Partition targetPartition = targetSwc.getParent();
		EcucPartition sourcePartition = (EcucPartition) targetPartition.getSingleSource();

		int i = 0;
		for (PortDefinedArgumentValue sourcePortDefinedArgumentValue : sourcePortApiOption.getPortArgValue()) {
			Constant destPortArgValueConstant = createCsPortArgValueConstant(sourcePortDefinedArgumentValue, i);
			targetSwc.getCsPortArgValueConstant().add(destPortArgValueConstant);

			if (!destPortArgValueConstant.getMember().isEmpty()) {
				destPortArgValueConstant.getSource().clear(); // NOTE query�Ǽ�������Ȥ����ѿ��Τۤ������������

				GlobalVariable destPortArgValueVariable = createCsPortArgValueVariable(sourcePortDefinedArgumentValue, i, Optional.fromNullable(sourcePartition), destPortArgValueConstant);
				targetSwc.getCsPortArgValueVariable().add(destPortArgValueVariable);
			}
			i++;
		}
	}

	private GlobalVariable createCsPortArgValueVariable(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index, Optional<EcucPartition> sourcePartition, Constant portArgValueConstant)
			throws ModelException {
		String symbol = SymbolNames.createCsPortArgValueVariableName(sourcePortDefinedArgumentValue, index);
		Type type = this.context.builtQuery.findDestType(sourcePortDefinedArgumentValue.getValueType());

		GlobalVariable destPortArgValueVariable = createGlobalVariable(symbol, type, portArgValueConstant, true);
		destPortArgValueVariable.setSingleSource(sourcePortDefinedArgumentValue);
		destPortArgValueVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(sourcePartition));
		destPortArgValueVariable.setHasConst(true);
		destPortArgValueVariable.setHasStatic(false);
		destPortArgValueVariable.setInitValueConstant(portArgValueConstant);
		return destPortArgValueVariable;
	}

	private Constant createCsPortArgValueConstant(PortDefinedArgumentValue sourcePortDefinedArgumentValue, int index) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourcePortDefinedArgumentValue.getValueType());

		Constant destConstant = ModuleFactory.eINSTANCE.createConstant();
		destConstant.setSingleSource(sourcePortDefinedArgumentValue);
		destConstant.setSymbolName(SymbolNames.createCsPortArgValueConstantName(sourcePortDefinedArgumentValue, index));
		destConstant.setType(type);
		this.localSymbolModelBuilder.buildConstantValue(destConstant, sourcePortDefinedArgumentValue.getValue(), type);
		return destConstant;
	}

	private void buildCsSymbolsForCsTrustedFunction() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
	
			Swc targetSwc = optionalSwc.get();
			Partition targetPartition = targetSwc.getParent();
			
			boolean isCsTfParamTypeCreated = false;
			int idx = 0;
			for (RPortPrototype sourcePortPrototype : sourceSwComponentType.getRPorts()) {
				for (ROperationInstanceInSwc sourceOperationInstanceInSwc : this.context.query.<ROperationInstanceInSwc> find(ref(OPERATION_INSTANCE_IN_SWC__CONTEXT_PORT, sourcePortPrototype))) {
					if (this.context.query.get(sourceOperationInstanceInSwc, ROPERATION_INSTANCE_IN_SWC_EX___PROVIDES_CALL_API__ROPERATIONINSTANCEINSWC)) {
						Swc clientSwc = targetSwc;
						Swc serverSwc = getPSwc(sourceOperationInstanceInSwc);
						if (serverSwc == null)
							continue;

						EcucPartition sourceClientEcucPartition = (EcucPartition)clientSwc.getParent().getSingleSource();
						EcucPartition sourceServerEcucPartition = (EcucPartition)serverSwc.getParent().getSingleSource();
						 // COVERAGE (ecucPartition��null�ΤȤ���pEcucPartition��null�Ǥ��뤿�ᥫ�Х�å����ѥ����ʤ��������ɥ�ӥ塼������ʤ����Ȥ��ǧ)
						if (sourceClientEcucPartition == null || sourceServerEcucPartition == null) 
							continue;

						if (!sourceClientEcucPartition.isTrusted() && sourceServerEcucPartition.isTrusted()) {
							// ���������ꡢ����������ξ�硢����ؿ�����
							// C/S�������ѿ���ؿ�����������
							if (!isCsTfParamTypeCreated) {
								CsTrustedFunctionParamType destCsTrustedFunctionParamType = createCsTrustedFunctionParamType(sourceSwComponentType);
								this.context.cache.rte.getCsTfParamType().add(destCsTrustedFunctionParamType);
								isCsTfParamTypeCreated = true;
							}
							
							// C/S�������ѿ���ؿ��ǻ��Ѥ��륪�ڥ졼�����μ���ID����
							Constant destOpidConstant = createCsTfOpidConstant(sourceOperationInstanceInSwc, idx);
							targetPartition.getCsTfOpidConstant().add(destOpidConstant);
						}
					}
					idx++;
				}
			}
		}

		// NOTE: ���������ϸ��̲ս�ǥ����Ȥ򤫤������ˤȤ��Ƥ��뤿�ᡢCsTrustedFunctionParamType�ϥ�����
		Ordering<EObject> ordering = Ordering.natural().onResultOf(this.context.query.<String> feature2Function(TYPE__SYMBOL_NAME));
		ECollections.sort(this.context.cache.rte.getCsTfParamType(), ordering);
	}

	private Constant createCsTfOpidConstant(ROperationInstanceInSwc soureOperationInstanceInSwc, int opid) {
		Constant destOpidConstant = ModuleFactory.eINSTANCE.createConstant();
		destOpidConstant.setSymbolName(SymbolNames.createCsTfOpidConstantName(soureOperationInstanceInSwc));
		destOpidConstant.setValue(String.valueOf(opid) + "U");
		return destOpidConstant;
	}

	private CsTrustedFunctionParamType createCsTrustedFunctionParamType(AtomicSwComponentType sourceSwComponentType) {
		CsTrustedFunctionParamType destParamType = ModuleFactory.eINSTANCE.createCsTrustedFunctionParamType();
		destParamType.setSymbolName(SymbolNames.createCsTrustedFunctionParamTypeName(sourceSwComponentType));
		return destParamType;
	}

	private Swc getPSwc(ROperationInstanceInSwc operationInstanceInSwc) throws ModelException {
		OperationInstanceInComposition operationInstanceInComposition = operationInstanceInSwc.getInstance().get(0);
		if (operationInstanceInComposition.getProviderConnection().isEmpty()) {
			return null;
		}

		OperationInstanceInComposition providedOperationInstanceInComposition = operationInstanceInComposition.getProviderConnection().get(0).getProvider();
		POperationInstanceInSwc providedOperationInstanceInSwc = (POperationInstanceInSwc) providedOperationInstanceInComposition.getPrototype();
		SwComponentType swType = providedOperationInstanceInSwc.getOwnerAtomicSwc();
		return this.context.builtQuery.findDest(SWC, swType);
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(�⡼��)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildModeImplSymbols() throws ModelException {
		for (BswModuleDescription sourceBswModuleDescription : this.context.query.<BswModuleDescription> findByKind(BSW_MODULE_DESCRIPTION)) {
			Optional<Bswm> optionalTargetBswm = this.context.builtQuery.tryFindDest(BSWM, sourceBswModuleDescription);
			if (!optionalTargetBswm.isPresent()) {	// COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}

			Bswm targetBswm = optionalTargetBswm.get();
			buildModeMachineInstances(targetBswm, sourceBswModuleDescription);
		}
	}

	private void buildModeMachineInstances(Bswm targetBswm, BswModuleDescription sourceBswModuleDescription) throws ModelException {
		BswInternalBehavior sourceBehavior = sourceBswModuleDescription.getEnableInternalBehavior(); // NOTE: Bswm������Ȥ������Ȥ�ͭ����behavior��¸�ߤ��뤿�ᡢnull�����å�����

		for (ModeDeclarationGroupPrototype sourceProvidedModeGroup : sourceBswModuleDescription.getProvidedModeGroup()) {
			BswModeSenderPolicy sourceBswModeSenderPolicy = findBswModeSenderPolicyByModePrototype(sourceBehavior, sourceProvidedModeGroup);

			// �⡼�ɥޥ��󥤥󥹥��󥹤�����������
			// NOTE �ѡ��ƥ��������Ϣ�ȤΤߤ򥵥ݡ��Ȥ��뤿�ᡢ������ѡ��ƥ�������1�Ĥ˷�ޤ�
			Collection<EcucPartition> sourceUsingEcucPartitions = this.context.query.get(sourceProvidedModeGroup, MODE_DECLARATION_GROUP_PROTOTYPE_EX___GET_USING_PARTITION_FOR_MANAGER__MODEDECLARATIONGROUPPROTOTYPE);
			EcucPartition sourceUsingEcucPartition = Iterables.getFirst(sourceUsingEcucPartitions, null); // NOTE nrte_sws_0345�ˤ�ꡢ�⡼��������롼�ץץ�ȥ����פ���Ѥ���ѡ��ƥ�������¿���٤�0..1
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceUsingEcucPartition);
			PartedBswm targetPartedBswm = targetBswm.getSinglePartedBswm(targetPartition);

			// �⡼�ɥޥ��󥤥󥹥��󥹤�ɬ������Ƚ��
			if (!isUsedPrototype(sourceProvidedModeGroup, targetPartedBswm)) {
				continue;
			}
			if (sourceBswModeSenderPolicy == null) {
				// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				// BswModeSenderPolicy�����뤳�Ȥ�validation���ݾ�
				continue;
			}
			
			// �⡼�ɥޥ��󥤥󥹥��󥹤���
			buildModeMachineInstance(targetPartedBswm, sourceBswModuleDescription, sourceProvidedModeGroup, sourceBswModeSenderPolicy, Optional.fromNullable(sourceUsingEcucPartition));
		}
	}

	private boolean isUsedPrototype(ModeDeclarationGroupPrototype prototype, PartedBswm partedBswm) {
		for (BswSchedulableEntity bswSchedulableEntity : partedBswm.getDependentBswSchedulableEntity()) {
			jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity sourceEntity = (jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) bswSchedulableEntity.getSingleSource();
			if (sourceEntity.getManagedModeGroup().contains(prototype)) {
				return true;
			}
		}
		return false;
	}

	private BswModeSenderPolicy findBswModeSenderPolicyByModePrototype(BswInternalBehavior behavior, ModeDeclarationGroupPrototype modePrototype) {
		for (BswModeSenderPolicy bswModeSenderPolicy : behavior.getModeSenderPolicy()) {
			if (bswModeSenderPolicy.getProvidedModeGroup() == modePrototype) {
				return bswModeSenderPolicy;
			}
		}
	
		// COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
		// BswModeSenderPolicy�����뤳�Ȥ�validation���ݾ�
		return null;
	}

	private void buildModeMachineInstance(PartedBswm targetPartedBswm, BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModePrototype,
			BswModeSenderPolicy sourceSenderPolicy, Optional<EcucPartition> sourcePartition) throws ModelException {
		Bswm sourceBswm = this.context.builtQuery.findDest(BSWM, sourceBswModuleDescription);
		jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup modeDeclarationGroup = this.context.builtQuery.selectDest(sourceBswm.getModeDeclarationGroup(), sourceModePrototype.getType());

		ModeMachineInstance destModeMachineInstance = ModuleFactory.eINSTANCE.createModeMachineInstance();
		destModeMachineInstance.setSingleSource(sourceModePrototype);

		// �⡼�������׵ᥭ�塼�ι���
		ModeQueueType destModeQueueType = createModeQueueType(sourceBswModuleDescription, sourceModePrototype, sourceSenderPolicy, modeDeclarationGroup.getImplementationDataType());
		destModeMachineInstance.setRequestModeQueueType(destModeQueueType);

		ModeQueuedVariable destModeQueuedVariable = createModeQueueVariable(sourceBswModuleDescription, sourceModePrototype, destModeQueueType);
		destModeQueuedVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(sourcePartition, sourceModePrototype));
		destModeMachineInstance.setRequestModeQueue(destModeQueuedVariable);

		// ���ߥ⡼���ѿ��ι���
		GlobalVariable destCurrentModeVariable = createCurrentModeVariable(sourceBswModuleDescription, sourceModePrototype, modeDeclarationGroup.getImplementationDataType());
		destCurrentModeVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(sourcePartition, sourceModePrototype));
		destModeMachineInstance.setCurrentModeVariable(destCurrentModeVariable);
		
		// ���⡼���ѿ��ι���
		GlobalVariable destNextModeVariable = createNextModeVariable(sourceBswModuleDescription, sourceModePrototype, modeDeclarationGroup.getImplementationDataType());
		destNextModeVariable.setMemoryMapping(this.memmapBuilder.buildModeDeclarationMemoryMapping(sourcePartition, sourceModePrototype));
		destModeMachineInstance.setNextModeVariable(destNextModeVariable);
	
		// ����⡼�ɤؤλ��Ȥ��ɲ�
		destModeMachineInstance.setInitModeConstant(modeDeclarationGroup.getInitModeConstant());

		// ����������Ͽ
		targetPartedBswm.getModeMachineInstance().add(destModeMachineInstance);
	}

	private ModeQueueType createModeQueueType(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, BswModeSenderPolicy sourceSenderPolicy, Type type) {
		Constant destMaxLengthConstant = createModeQueueMaxLengthConstant(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype, sourceSenderPolicy);

		ModeQueueType destModeQueueType = ModuleFactory.eINSTANCE.createModeQueueType();
		destModeQueueType.setSymbolName(SymbolNames.createModeQueueTypeName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		destModeQueueType.setElementType(type);
		destModeQueueType.setMaxLengthConstant(destMaxLengthConstant);
		return destModeQueueType;
	}

	private Constant createModeQueueMaxLengthConstant(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype,
			BswModeSenderPolicy sourceBswModeSenderPolicy) {
		Constant destMaxLengthConstant = ModuleFactory.eINSTANCE.createConstant();
		destMaxLengthConstant.setSymbolName(SymbolNames.createModeMaxLengthConstantName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		destMaxLengthConstant.setType(this.context.cache.uint32Type);
		destMaxLengthConstant.setValue(sourceBswModeSenderPolicy.getQueueLength().toString());
		return destMaxLengthConstant;
	}

	private ModeQueuedVariable createModeQueueVariable(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModeDeclarationGroupPrototype, ModeQueueType modeQueueType) {
		ModeQueuedVariable destModeQueuedVariable = ModuleFactory.eINSTANCE.createModeQueuedVariable();
		destModeQueuedVariable.setType(modeQueueType);
		destModeQueuedVariable.setHasStatic(false);
		destModeQueuedVariable.setSymbolName(SymbolNames.createSchmModeQueueVariableName(sourceBswModuleDescription, sourceModeDeclarationGroupPrototype));
		return destModeQueuedVariable;
	}

	private GlobalVariable createCurrentModeVariable(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype soureModePrototype, Type type) {
		GlobalVariable destCurrentVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destCurrentVariable.setType(type);
		destCurrentVariable.setHasStatic(false);
		destCurrentVariable.setSymbolName(SymbolNames.createSchmCurrentModeName(sourceBswModuleDescription, soureModePrototype));
		return destCurrentVariable;
	}

	private GlobalVariable createNextModeVariable(BswModuleDescription sourceBswModuleDescription, ModeDeclarationGroupPrototype sourceModePrototype, Type type) {
		GlobalVariable destNextVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destNextVariable.setType(type);
		destNextVariable.setHasStatic(false);
		destNextVariable.setSymbolName(SymbolNames.createSchmNextModeName(sourceBswModuleDescription, sourceModePrototype));
		return destNextVariable;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(IRV)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildIrvImplSymbols() throws ModelException {
		for (AtomicSwComponentType sourceSwComponentType : this.context.query.<AtomicSwComponentType> findByKind(ATOMIC_SW_COMPONENT_TYPE)) {
			Optional<Swc> optionalSwc = this.context.builtQuery.tryFindDest(SWC, sourceSwComponentType);
			if (!optionalSwc.isPresent()) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				continue;
			}
	
			Swc targetSwc = optionalSwc.get();
			Partition targetPartition = targetSwc.getParent();
			Optional<EcucPartition> sourcePartition = Optional.fromNullable((EcucPartition) targetPartition.getSingleSource());

			// IRV�ν����
			for (VariableDataPrototype sourceDataPrototype : sourceSwComponentType.getInternalBehavior().getExplicitInterRunnableVariable()) {
				Constant destInitValueConstant = createIrvBufferInitValueConstant(sourceSwComponentType, sourceDataPrototype);
				targetSwc.getIrvBufferInitValueConstant().add(destInitValueConstant);
				targetSwc.getIrvBufferVariableSet().add(createIrvBuffer(sourceSwComponentType, sourceDataPrototype, destInitValueConstant, sourcePartition));
			}
		}
	}

	private Constant createIrvBufferInitValueConstant(AtomicSwComponentType sourceSwComponentType, VariableDataPrototype sourceDataPrototype) throws ModelException {
		Type type = this.context.builtQuery.findDestType((ImplementationDataType)sourceDataPrototype.getType());
		ValueSpecification sourceInitValue = sourceDataPrototype.getInitValue();
	
		// ��������������
		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSingleSource(sourceDataPrototype);
		destInitValueConstant.setSymbolName(SymbolNames.createRteIrvBufferInitValueConstantName(sourceSwComponentType, sourceDataPrototype));
		destInitValueConstant.setType(type);
	
		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	private RteBufferVariableSet createIrvBuffer(AtomicSwComponentType sourceSwComponentType, VariableDataPrototype sourceDataPrototype, Constant initValueConstant,
			Optional<EcucPartition> sourcePartition) throws ModelException {
		boolean initAtDefinition = this.context.query.<Boolean> get(sourceDataPrototype, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_DECLARATION__VARIABLEDATAPROTOTYPE);

		RteBufferVariableSet destIrvBuffer = ModuleFactory.eINSTANCE.createRteBufferVariableSet();
		destIrvBuffer.setSingleSource(sourceDataPrototype);
		destIrvBuffer.setSymbolName(SymbolNames.createRteIrvBufferVariableName(sourceSwComponentType, sourceDataPrototype)); // NOTE C�����ˤϸ���ʤ����ۥ���ܥ�����������Ȥ��Թ�奷��ܥ�̾�����ꤷ�Ƥ���
	
		Type type = this.context.builtQuery.findDestType(sourceDataPrototype.getImplementationDataType());
		GlobalVariable destValueVariable = createGlobalVariable(SymbolNames.createRteIrvBufferValueVariableName(sourceSwComponentType, sourceDataPrototype), type, initValueConstant, initAtDefinition);
		destValueVariable.setSingleSource(sourceDataPrototype);
		destValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataPrototype));
		destIrvBuffer.setValueVariable(destValueVariable);
		
		if (!initValueConstant.getMember().isEmpty()) {
			GlobalVariable destInitValueVariable = createGlobalVariable(SymbolNames.createRteIrvBufferInitValueVariableName(sourceSwComponentType, sourceDataPrototype), type, initValueConstant, true);
			destInitValueVariable.setMemoryMapping(this.memmapBuilder.buildDataElementMemoryMapping(sourcePartition, sourceDataPrototype));
			destInitValueVariable.setHasConst(true);
			destInitValueVariable.setHasStatic(false);
			initValueConstant.setRepresentedVariableName(destInitValueVariable.getSymbolName());
			destIrvBuffer.setInitValueVariable(destInitValueVariable);
		}
	
		return destIrvBuffer;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(����ƥ��ƥ�ư��)(����������)
	//-------------------------------------------------------------------------------------------------------------------------------------
	private void buildEntityStartImplSymbols() throws ModelException {
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			EcucPartition sourceEcucPartition = this.context.query.get(sourceOsTask, OS_TASK_EX___GET_OWNER_PARTITION__OSTASK);
			Partition targetPartition = this.context.builtQuery.findDestPartition(sourceEcucPartition);
	
			Optional<OsTaskActivateEntityStarter> sourceOsTaskActivateEntityStarter = this.context.query.tryFindSingle(ref(OS_TASK_ACTIVATE_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
			List<OsEventSetEntityStarter> sourceOsEventSetEntityStarters = this.context.query.find(ref(OS_EVENT_SET_ENTITY_STARTER__SOURCE_OS_TASK, sourceOsTask));
	
			if (sourceOsTaskActivateEntityStarter.isPresent()) {
				// ���ʥ֥뵯ư�ˤĤ��ƤΥ����Х��ѿ�����������������
				buildEntityStartImplSymbols(targetPartition, sourceOsTaskActivateEntityStarter.get(), sourceOsTask, Optional.<OsEvent> absent());
	
			} else if (!sourceOsEventSetEntityStarters.isEmpty()) {
				// ���ʥ֥뵯ư�ˤĤ��ƤΥ����Х��ѿ�����������������
				for (OsEventSetEntityStarter sourceEntityStarter : sourceOsEventSetEntityStarters) {
					buildEntityStartImplSymbols(targetPartition, sourceEntityStarter, sourceOsTask, Optional.fromNullable(sourceEntityStarter.getSourceOsEvent()));
				}
			}
		}
	}

	private void buildEntityStartImplSymbols(Partition targetPartition, EntityStarter sourceEntityStarter, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent) {
		// ����Ĵ���������ѿ��ι���
		if (sourceEntityStarter.getCycleCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getCycleCounterImplementation().getMaxCount());
	
			targetPartition.getEntityStartConstant().add(createEntityCycleMaxConstant(sourceEntityStarter.getCycleCounterImplementation(), sourceOsTask, sourceOsEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityCycleCounterVariable(sourceEntityStarter.getCycleCounterImplementation(), sourceOsTask, sourceOsEvent, type));
		}

		// ���ϥ��ե��å�Ĵ���������ѿ��ι���
		if (sourceEntityStarter.getStartOffsetCounterImplementation() != null) {
			PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getStartOffsetCounterImplementation().getMaxCount());
	
			targetPartition.getEntityStartConstant().add(createEntityStartOffsetMaxConstant(sourceEntityStarter.getStartOffsetCounterImplementation(), sourceOsTask, sourceOsEvent, type));
			targetPartition.getEntityStartVariable().add(createEntityStartOffsetCounterVariable(sourceEntityStarter.getStartOffsetCounterImplementation(), sourceOsTask, sourceOsEvent, type));
		}

		// ����Ĵ�������ϥ��ե��å�Ĵ���Ѥ�����ι���
		for (EntityStartInteraction sourceStartInteraction : sourceEntityStarter.getStartInteraction()) {
			if (sourceStartInteraction.getImplementation() instanceof TimingTriggeringEntityStartImplementation) { // COVERAGE ���true(������EntityStartImplementation��TimingTriggeringEntityStartImplementation�ΤߤΤ���)
				TimingTriggeringEntityStartImplementation timingTriggeringEntityStartImplementation = (TimingTriggeringEntityStartImplementation) sourceStartInteraction.getImplementation();
	
				if (timingTriggeringEntityStartImplementation.requiresCycleAdjust()) {
					PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getCycleCounterImplementation().getMaxCount());
	
					targetPartition.getEntityStartConstant().add(
							createEntityCyclePeriodConstant(timingTriggeringEntityStartImplementation, sourceOsTask, sourceOsEvent, sourceStartInteraction, type));
					targetPartition.getEntityStartConstant().add(
							createEntityCycleOffsetConstant(timingTriggeringEntityStartImplementation, sourceOsTask, sourceOsEvent, sourceStartInteraction, type));
				}
	
				if (timingTriggeringEntityStartImplementation.requiresStartOffsetAdjust()) {
					PrimitiveType type = this.context.builtQuery.getAppropriateUintTypeForRange(sourceEntityStarter.getStartOffsetCounterImplementation().getMaxCount());
	
					targetPartition.getEntityStartConstant().add(
							createEntityStartOffsetConstant(timingTriggeringEntityStartImplementation, sourceOsTask, sourceOsEvent, sourceStartInteraction, type));
				}
			}
		}
	}

	private Constant createEntityStartOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent,
			EntityStartInteraction sourceEntityStartInteraction, Type type) {
		Constant destStartOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		destStartOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		destStartOffsetConstant.setRoleName(RoleNames.EXECUTABLE_START_OFFSET_ROLE_NAME);
		destStartOffsetConstant.setSymbolName(SymbolNames.createEntityStartOffsetConstantName(sourceOsTask, sourceOsEvent, sourceEntityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		destStartOffsetConstant.setType(type);
		destStartOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getStartOffset()));
		return destStartOffsetConstant;
	}

	private Constant createEntityCycleOffsetConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent,
			EntityStartInteraction sourceEntityStartInteraction, Type type) {
		Constant destCycleOffsetConstant = ModuleFactory.eINSTANCE.createConstant();
		destCycleOffsetConstant.setSingleSource(sourceEntityStartImplementation);
		destCycleOffsetConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_OFFSET_ROLE_NAME);
		destCycleOffsetConstant.setSymbolName(SymbolNames.createEntityCycleOffsetConstantName(sourceOsTask, sourceOsEvent, sourceEntityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		destCycleOffsetConstant.setType(type);
		destCycleOffsetConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCycleOffset()));
		return destCycleOffsetConstant;
	}

	private Constant createEntityCyclePeriodConstant(TimingTriggeringEntityStartImplementation sourceEntityStartImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent,
			EntityStartInteraction sourceEntityStartInteraction, Type type) {
		Constant destCyclePeriodConstant = ModuleFactory.eINSTANCE.createConstant();
		destCyclePeriodConstant.setSingleSource(sourceEntityStartImplementation);
		destCyclePeriodConstant.setRoleName(RoleNames.EXECUTABLE_CYCLE_PERIOD_ROLE_NAME);
		destCyclePeriodConstant.setSymbolName(SymbolNames.createEntityCyclePeriodConstantName(sourceOsTask, sourceOsEvent, sourceEntityStartInteraction.getEventToTaskMapping().getEvent().getStartOnEvent()));
		destCyclePeriodConstant.setType(type);
		destCyclePeriodConstant.setValue(String.valueOf(sourceEntityStartImplementation.getCyclePeriod()));
		return destCyclePeriodConstant;
	}

	private GlobalVariable createEntityStartOffsetCounterVariable(StartOffsetCounterImplementation sourceCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		GlobalVariable destStartOffsetCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destStartOffsetCounterVariable.setSingleSource(sourceCounterImplementation);
		destStartOffsetCounterVariable.setSymbolName(SymbolNames.createEntityStartOffsetCounterName(sourceOsTask, sourceOsEvent));
		destStartOffsetCounterVariable.setType(type);
		destStartOffsetCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		destStartOffsetCounterVariable.setHasStatic(false);
		destStartOffsetCounterVariable.setHasConst(false);
		return destStartOffsetCounterVariable;
	}

	private Constant createEntityStartOffsetMaxConstant(StartOffsetCounterImplementation sourceStartOffsetCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		Constant destStartOffsetMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		destStartOffsetMaxConstant.setSingleSource(sourceStartOffsetCounterImplementation);
		destStartOffsetMaxConstant.setSymbolName(SymbolNames.createEntityMaxStartOffsetConstantName(sourceOsTask, sourceOsEvent));
		destStartOffsetMaxConstant.setType(type);
		destStartOffsetMaxConstant.setValue(String.valueOf(sourceStartOffsetCounterImplementation.getMaxCount()));
		return destStartOffsetMaxConstant;
	}

	private GlobalVariable createEntityCycleCounterVariable(CycleCounterImplementation sourceCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		GlobalVariable destCycleCounterVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destCycleCounterVariable.setSingleSource(sourceCounterImplementation);
		destCycleCounterVariable.setSymbolName(SymbolNames.createEntityCycleCounterName(sourceOsTask, sourceOsEvent));
		destCycleCounterVariable.setType(type);
		destCycleCounterVariable.setMemoryMapping(this.memmapBuilder.buildRteVariableMemoryMapping(Optional.fromNullable(sourceCounterImplementation.getOwnerPartition())));
		destCycleCounterVariable.setHasStatic(false);
		destCycleCounterVariable.setHasConst(false);
		return destCycleCounterVariable;
	}

	private Constant createEntityCycleMaxConstant(CycleCounterImplementation sourceCycleCounterImplementation, OsTask sourceOsTask, Optional<OsEvent> sourceOsEvent, PrimitiveType type) {
		Constant destCycleMaxConstant = ModuleFactory.eINSTANCE.createConstant();
		destCycleMaxConstant.setSingleSource(sourceCycleCounterImplementation);
		destCycleMaxConstant.setSymbolName(SymbolNames.createEntityMaxCycleConstantName(sourceOsTask, sourceOsEvent));
		destCycleMaxConstant.setType(type);
		destCycleMaxConstant.setValue(String.valueOf(sourceCycleCounterImplementation.getMaxCount()));
		return destCycleMaxConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ�(S/R)�ѤΥ桼�ƥ���ƥ�
	//-------------------------------------------------------------------------------------------------------------------------------------
	private Constant createSrInitValueConstant(VariableDataInstanceInSwc sourceDataInstanceInSwc, ValueSpecification sourceInitValueInSwc, String symbolName, String roleName) throws ModelException {
		Type type = this.context.builtQuery.findDestType(sourceDataInstanceInSwc.getImplementationDataType());

		ValueSpecification sourceInitValue;
		if (sourceDataInstanceInSwc.getInstance().isEmpty()) {
			sourceInitValue = sourceInitValueInSwc;
		} else {
			sourceInitValue = this.context.query.get(sourceDataInstanceInSwc.getInstance().get(0), VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___GET_INIT_VALUE__VARIABLEDATAINSTANCEINCOMPOSITION);
		}

		// ��������������
		Constant destInitValueConstant = ModuleFactory.eINSTANCE.createConstant();
		destInitValueConstant.setSingleSource(sourceDataInstanceInSwc);
		destInitValueConstant.setRoleName(roleName);
		destInitValueConstant.setSymbolName(symbolName);
		destInitValueConstant.setType(type);

		this.localSymbolModelBuilder.buildConstantValue(destInitValueConstant, sourceInitValue, type);
		return destInitValueConstant;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------
	// ����ܥ������ѤΥ桼�ƥ���ƥ�
	//-------------------------------------------------------------------------------------------------------------------------------------
	private GlobalVariable createGlobalVariable(String symbol, Type type, Constant initValueConstant, boolean initAtDefinition) {
		GlobalVariable destVariable = ModuleFactory.eINSTANCE.createGlobalVariable();
		destVariable.setSymbolName(symbol);
		destVariable.setType(type);
		destVariable.setInitValueConstant(initValueConstant);
		destVariable.setInitAtDefinition(initAtDefinition);
		destVariable.setHasStatic(false);
		destVariable.setHasConst(false);
		return destVariable;
	}
}
