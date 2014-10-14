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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_APPLICATION_TRUSTED_FUNCTION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_EVENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_RESOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_SPINLOCK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.OS_TASK;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.BSWM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_INTERLINK_HEADER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.PRIMITIVE_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_APPLICATION_HEADER;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_MODULE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.SWC;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.TYPE__SYMBOL_NAME;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasAttr;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;

import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.SymbolNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.util.FileNames;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module.util.TestFileNames;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignal;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplicationTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsResource;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsSpinlock;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource;

public class RteTestFileModelBuilder {

	private final TestModuleModelBuildContext context;

	public RteTestFileModelBuilder(TestModuleModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		this.context.cache.rteModule = this.context.query.findSingleByKind(RTE_MODULE);
		this.context.cache.osApplicationType = findBuiltinType(SymbolNames.OS_APPLICATION_TYPE_NAME);
		this.context.cache.osTrustedFunctionIndexType = findBuiltinType(SymbolNames.OS_TRUSTED_FUNCTION_INDEX_TYPE_NAME);
		this.context.cache.osTaskType = findBuiltinType(SymbolNames.OS_TASK_TYPE_NAME);
		this.context.cache.osEventMaskType = findBuiltinType(SymbolNames.OS_EVENT_MASK_TYPE_NAME);
		this.context.cache.osResourceType = findBuiltinType(SymbolNames.OS_RESOURCE_TYPE_NAME);
		this.context.cache.osSpinlockIdType = findBuiltinType(SymbolNames.OS_SPINLOCK_ID_TYPE_NAME);
		this.context.cache.comSignalIdType = findBuiltinType(SymbolNames.COM_SIGNAL_ID_TYPE_NAME);

		this.context.cache.rteTest = RteTestFactory.eINSTANCE.createRteTest();
		this.context.cache.rteTestRoot.setRteTest(this.context.cache.rteTest);
		this.context.cache.rteTestModule = RteTestFactory.eINSTANCE.createRteTestModule();
		this.context.cache.rteTestRoot.setRteTestModule(this.context.cache.rteTestModule);

		buildOsStubConstants(this.context.cache.rteTest);
		buildOsStubHeader(this.context.cache.rteTestModule, this.context.cache.rteTest.getOsStubConstant());

		buildComStubConstants(this.context.cache.rteTest);
		buildComStubHeader(this.context.cache.rteTestModule, this.context.cache.rteTest.getComStubConstant());

		buildIocMock(this.context.cache.rteTestModule);

		buildSwcMocks(this.context.cache.rteTestModule);
		buildBswmMocks(this.context.cache.rteTestModule);
	}

	private PrimitiveType findBuiltinType(String symbolName) throws ModelException {
		return this.context.query.findSingle(isKindOf(PRIMITIVE_TYPE).AND(hasAttr(TYPE__SYMBOL_NAME, symbolName)));
	}

	private void buildOsStubConstants(RteTest targetRteTest) {
		buildOsApplicationStubConstants(targetRteTest);
		buildOsTrustedFunctionIndexStubConstants(targetRteTest);
		buildOsTaskStubConstants(targetRteTest);
		buildOsEventStubConstants(targetRteTest);
		buildOsResourceStubConstants(targetRteTest);
		buildOsSpinlockStubConstants(targetRteTest);
	}

	private void buildOsApplicationStubConstants(RteTest targetRteTest) {
		int appIndex = 1;
		for (OsApplication sourceOsApplication : this.context.query.<OsApplication> findByKind(OS_APPLICATION)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsApplication.getShortName());
			constant.setType(this.context.cache.osApplicationType);
			constant.setValue(String.valueOf(appIndex));
			targetRteTest.getOsStubConstant().add(constant);

			appIndex++;
		}
	}

	private void buildOsTrustedFunctionIndexStubConstants(RteTest targetRteTest) {
		int tfIndex = 1;
		for (OsApplicationTrustedFunction sourceOsTrustedFunction : this.context.query.<OsApplicationTrustedFunction> findByKind(OS_APPLICATION_TRUSTED_FUNCTION)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsTrustedFunction.getShortName());
			constant.setType(this.context.cache.osTrustedFunctionIndexType);
			constant.setValue(String.valueOf(tfIndex));
			targetRteTest.getOsStubConstant().add(constant);

			tfIndex++;
		}
	}

	private void buildOsTaskStubConstants(RteTest targetRteTest) {
		int taskIndex = 1;
		for (OsTask sourceOsTask : this.context.query.<OsTask> findByKind(OS_TASK)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsTask.getShortName());
			constant.setType(this.context.cache.osTaskType);
			constant.setValue(String.valueOf(taskIndex));
			targetRteTest.getOsStubConstant().add(constant);

			taskIndex++;
		}
	}

	private void buildOsEventStubConstants(RteTest targetRteTest) {
		int eventMask = 1;
		for (OsEvent sourceOsEvent : this.context.query.<OsEvent> findByKind(OS_EVENT)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsEvent.getShortName());
			constant.setType(this.context.cache.osEventMaskType);
			constant.setValue(String.valueOf(eventMask));
			targetRteTest.getOsStubConstant().add(constant);

			eventMask <<= 1;
		}
	}

	private void buildOsResourceStubConstants(RteTest targetRteTest) {
		int resourceIndex = 1;
		for (OsResource sourceOsResource : this.context.query.<OsResource> findByKind(OS_RESOURCE)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsResource.getShortName());
			constant.setType(this.context.cache.osResourceType);
			constant.setValue(String.valueOf(resourceIndex));
			targetRteTest.getOsStubConstant().add(constant);

			resourceIndex++;
		}
	}

	private void buildOsSpinlockStubConstants(RteTest targetRteTest) {
		int spinlockIndex = 1;
		for (OsSpinlock sourceOsSpinlock : this.context.query.<OsSpinlock> findByKind(OS_SPINLOCK)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(sourceOsSpinlock.getShortName());
			constant.setType(this.context.cache.osSpinlockIdType);
			constant.setValue(String.valueOf(spinlockIndex));
			targetRteTest.getOsStubConstant().add(constant);

			spinlockIndex++;
		}
	}

	private void buildOsStubHeader(RteTestModule targetTestModule, List<Constant> osStubConstants) {
		targetTestModule.setOsStubHeader(createOsStubHeader(osStubConstants));
	}

	private OsStubHeader createOsStubHeader(List<Constant> osStubConstants) {
		OsStubHeader osStubHeader = RteTestFactory.eINSTANCE.createOsStubHeader();
		osStubHeader.setFileName(TestFileNames.OS_STUB_HEADER_NAME);
		osStubHeader.setGuardName(TestFileNames.OS_STUB_HEADER_GUARD_NAME);
		osStubHeader.getConstant().addAll(osStubConstants);
		return osStubHeader;
	}

	private void buildComStubConstants(RteTest targetRteTest) {
		int comSignalIndex = 1;
		for (ComSignal sourceComSignal : this.context.query.<ComSignal> findByKind(COM_SIGNAL)) {
			Constant constant = ModuleFactory.eINSTANCE.createConstant();
			constant.setSymbolName(SymbolNames.createComSignalSymbolicName(sourceComSignal));
			constant.setType(this.context.cache.comSignalIdType);
			constant.setValue(String.valueOf(comSignalIndex));
			targetRteTest.getComStubConstant().add(constant);

			comSignalIndex++;
		}
	}

	private void buildComStubHeader(RteTestModule targetTestModule, List<Constant> comStubConstants) {
		targetTestModule.setComStubHeader(createComStubHeader(comStubConstants));
	}

	private ComStubHeader createComStubHeader(List<Constant> comStubConstants) {
		ComStubHeader comStubHeader = RteTestFactory.eINSTANCE.createComStubHeader();
		comStubHeader.setFileName(TestFileNames.COM_STUB_HEADER_NAME);
		comStubHeader.setGuardName(TestFileNames.COM_STUB_HEADER_GUARD_NAME);
		comStubHeader.getConstant().addAll(comStubConstants);
		return comStubHeader;
	}

	private void buildIocMock(RteTestModule targetTestModule) {
		IocMockHeader mockHeader = createIocMockHeader();
		targetTestModule.setIocMockHeader(mockHeader);
		targetTestModule.setIocMockSource(createIocMockSource(mockHeader));
	}

	private IocMockSource createIocMockSource(IocMockHeader mockHeader) {
		IocMockSource mockSource = RteTestFactory.eINSTANCE.createIocMockSource();
		mockSource.setFileName(TestFileNames.IOC_MOCK_SOURCE_NAME);
		mockSource.getDependentHeaders().add(mockHeader);
		mockSource.getIocApi().addAll(this.context.query.<IocApi> findByKind(IOC_API));
		return mockSource;
	}

	private IocMockHeader createIocMockHeader() {
		IocMockHeader mockHeader = RteTestFactory.eINSTANCE.createIocMockHeader();
		mockHeader.setFileName(TestFileNames.IOC_MOCK_HEADER_NAME);
		mockHeader.setGuardName(TestFileNames.IOC_MOCK_HEADER_GUARD_NAME);
		mockHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteTypeHeader());
		mockHeader.getIocApi().addAll(this.context.query.<IocApi> findByKind(IOC_API));
		return mockHeader;
	}

	private void buildSwcMocks(RteTestModule targetTestModule) throws ModelException {
		for (Swc sourceSwc : this.context.query.<Swc> findByKind(SWC)) {
			SwcMockHeader mockHeader = createSwcMockHeader(sourceSwc);
			targetTestModule.getSwcMockHeader().add(mockHeader);
			targetTestModule.getSwcMockSource().add(createSwcMockSource(sourceSwc, mockHeader));
		}
	}

	private SwcMockSource createSwcMockSource(Swc sourceSwc, SwcMockHeader mockHeader) throws ModelException {
		RteApplicationHeader applicationHeader = this.context.builtQuery.findDest(RTE_APPLICATION_HEADER, sourceSwc);

		SwcMockSource mockSource = RteTestFactory.eINSTANCE.createSwcMockSource();
		mockSource.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + TestFileNames.CC_POSTFIX);
		mockSource.getDependentHeaders().add(applicationHeader);
		mockSource.getDependentHeaders().add(mockHeader);
		mockSource.setSwcName(sourceSwc.getCompartmentName());
		mockSource.getExecutableEntity().addAll(sourceSwc.getDependentExecutableEntity());
		return mockSource;
	}

	private SwcMockHeader createSwcMockHeader(Swc sourceSwc) {
		SwcMockHeader mockHeader = RteTestFactory.eINSTANCE.createSwcMockHeader();
		mockHeader.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceSwc.getCompartmentName() + FileNames.H_POSTFIX);
		mockHeader.setGuardName(TestFileNames.MOCK_HEADER_GUARD_NAME_PREFIX + sourceSwc.getCompartmentName() + TestFileNames.HEADER_GUARD_NAME_POSTFIX);
		mockHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteTypeHeader());
		mockHeader.setSwcName(sourceSwc.getCompartmentName());
		mockHeader.getExecutableEntity().addAll(sourceSwc.getDependentExecutableEntity());
		return mockHeader;
	}
	private void buildBswmMocks(RteTestModule targetTestModule) throws ModelException {
		for (Bswm sourceBswm : this.context.query.<Bswm> findByKind(BSWM)) {
			BswmMockHeader mockHeader = createBswmMockHeader(sourceBswm);
			targetTestModule.getBswmMockHeader().add(mockHeader);
			targetTestModule.getBswmMockSource().add(createBswmMockSource(sourceBswm, mockHeader));
		}
	}

	private BswmMockSource createBswmMockSource(Bswm sourceBswm, BswmMockHeader mockHeader) throws ModelException {
		ModuleInterlinkHeader moduleInterlinkHeader = this.context.builtQuery.findDest(MODULE_INTERLINK_HEADER, sourceBswm);

		BswmMockSource mockSource = RteTestFactory.eINSTANCE.createBswmMockSource();
		mockSource.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + TestFileNames.CC_POSTFIX);
		mockSource.getDependentHeaders().add(moduleInterlinkHeader);
		mockSource.getDependentHeaders().add(mockHeader);
		mockSource.setBswmName(sourceBswm.getCompartmentName());
		for (PartedBswm partedBswm : sourceBswm.getPartedBswm()) {
			mockSource.getExecutableEntity().addAll(partedBswm.getDependentExecutableEntity());
		}
		return mockSource;
	}

	private BswmMockHeader createBswmMockHeader(Bswm sourceBswm) {
		BswmMockHeader mockHeader = RteTestFactory.eINSTANCE.createBswmMockHeader();
		mockHeader.setFileName(TestFileNames.MOCK_FILE_NAME_PREFIX + sourceBswm.getCompartmentName() + FileNames.H_POSTFIX);
		mockHeader.setGuardName(TestFileNames.MOCK_HEADER_GUARD_NAME_PREFIX + sourceBswm.getCompartmentName() + TestFileNames.HEADER_GUARD_NAME_POSTFIX);
		mockHeader.getDependentHeaders().add(this.context.cache.rteModule.getRteTypeHeader());
		mockHeader.setBswmName(sourceBswm.getCompartmentName());
		for (PartedBswm partedBswm : sourceBswm.getPartedBswm()) {
			mockHeader.getExecutableEntity().addAll(partedBswm.getDependentExecutableEntity());
		}
		return mockHeader;
	}

}
