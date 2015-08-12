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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsTask;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Schedulable Entity Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.BswSchedulableEntityExImpl#getModeDeclarationGroupPrototypeEx <em>Mode Declaration Group Prototype Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswSchedulableEntityExImpl extends ExtendedEObjectImpl implements BswSchedulableEntityEx {
	/**
	 * The cached value of the '{@link #getModeDeclarationGroupPrototypeEx() <em>Mode Declaration Group Prototype Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclarationGroupPrototypeEx()
	 * @generated
	 * @ordered
	 */
	protected ModeDeclarationGroupPrototypeEx modeDeclarationGroupPrototypeEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswSchedulableEntityExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototypeEx getModeDeclarationGroupPrototypeEx() {
		if (modeDeclarationGroupPrototypeEx != null && ((EObject)modeDeclarationGroupPrototypeEx).eIsProxy()) {
			InternalEObject oldModeDeclarationGroupPrototypeEx = (InternalEObject)modeDeclarationGroupPrototypeEx;
			modeDeclarationGroupPrototypeEx = (ModeDeclarationGroupPrototypeEx)eResolveProxy(oldModeDeclarationGroupPrototypeEx);
			if (modeDeclarationGroupPrototypeEx != oldModeDeclarationGroupPrototypeEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX, oldModeDeclarationGroupPrototypeEx, modeDeclarationGroupPrototypeEx));
			}
		}
		return modeDeclarationGroupPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupPrototypeEx basicGetModeDeclarationGroupPrototypeEx() {
		return modeDeclarationGroupPrototypeEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeDeclarationGroupPrototypeEx(ModeDeclarationGroupPrototypeEx newModeDeclarationGroupPrototypeEx) {
		ModeDeclarationGroupPrototypeEx oldModeDeclarationGroupPrototypeEx = modeDeclarationGroupPrototypeEx;
		modeDeclarationGroupPrototypeEx = newModeDeclarationGroupPrototypeEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX, oldModeDeclarationGroupPrototypeEx, modeDeclarationGroupPrototypeEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Using Partition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingPartition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_PARTITION_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EcucPartition> getUsingPartition(BswSchedulableEntity this_) {
		try {
			return (EList<EcucPartition>)GET_USING_PARTITION_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BswSchedulableEntity> getCallRootBswSchedulableEntities(BswSchedulableEntity this_) {
		EList<BswSchedulableEntity> callRootBswSchedulableEntities = new BasicEList<BswSchedulableEntity>();

		// ������ĥ꡼�Υ롼�Ȥ�BSW�������塼��֥��õ��
		Deque<BswSchedulableEntity> searchUndoneBswSchedulableEntities = new ArrayDeque<BswSchedulableEntity>();
		List<BswSchedulableEntity> searchDoneBswSchedulableEntities = new ArrayList<BswSchedulableEntity>();

		searchUndoneBswSchedulableEntities.add(this_);
		while (!searchUndoneBswSchedulableEntities.isEmpty()) {
			BswSchedulableEntity searchTargetBswSchedulableEntity = searchUndoneBswSchedulableEntities.pop();

			// ������롼�Ȥ���Ƚ��
			EList<OsTask> mappedTasks = getMappedTasks(searchTargetBswSchedulableEntity);
			EList<BswSchedulableEntity> callerBswSchedulableEntities = getCallerBswSchedulableEntities(searchTargetBswSchedulableEntity);
			if (!mappedTasks.isEmpty()) {
				// ������롼��(���������դ���)
				// ���������դ���Τ��ᡢ��ü��Ƚ��
				callRootBswSchedulableEntities.add(searchTargetBswSchedulableEntity);
			} else if (callerBswSchedulableEntities.isEmpty()) {
				// ������롼��(���������դʤ�)
				// ���������դʤ������ĸƤӽФ�����BSW�������塼��֥뤬¸�ߤ��ʤ����ᡢ��ü��Ƚ��
				callRootBswSchedulableEntities.add(searchTargetBswSchedulableEntity);
			} else {
				// �󥳡���롼��
				// ���⤷�ʤ�
			}

			// õ���ѤߤǤ��뤳�Ȥ�ޡ���
			searchDoneBswSchedulableEntities.add(searchTargetBswSchedulableEntity);

			// �ƤӽФ�����BSW�������塼��֥�򼡤�õ���оݤ��ɲ�
			// NOTE BSW�������塼��֥�˥��������դ�������Ǥ⡢�ƤӽФ�����BSW�������塼��֥뤬¸�ߤ����礬���뤳�Ȥ����
			// (BSW�������塼��֥��BswEvent��ʣ�����ꡢ��������ư��ľ�ܳ��Ϥ����ߤ�������)
			for (BswSchedulableEntity callerBswSchedulableEntity : callerBswSchedulableEntities) {
				// �۴ĥ������õ�����ʵפ˽����ʤ���ǽ�������뤿�ᡢ����õ���ѤߤΤ�Τ�õ�������������
				if (!searchDoneBswSchedulableEntities.contains(callerBswSchedulableEntity)) {
					searchUndoneBswSchedulableEntities.push(callerBswSchedulableEntity);
				}
			}
		}

		return callRootBswSchedulableEntities;
	}

	/**
	 * The cached invocation delegate for the '{@link #getMappedTasks(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Mapped Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedTasks(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MAPPED_TASKS_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OsTask> getMappedTasks(BswSchedulableEntity this_) {
		try {
			return (EList<OsTask>)GET_MAPPED_TASKS_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getCallerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Caller Bsw Schedulable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerBswSchedulableEntities(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BswSchedulableEntity> getCallerBswSchedulableEntities(BswSchedulableEntity this_) {
		try {
			return (EList<BswSchedulableEntity>)GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getCallerBswSchedulableEntitiesByMode(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity) <em>Get Caller Bsw Schedulable Entities By Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerBswSchedulableEntitiesByMode(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BswSchedulableEntity> getCallerBswSchedulableEntitiesByMode(BswSchedulableEntity this_) {
		try {
			return (EList<BswSchedulableEntity>)GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE_BSW_SCHEDULABLE_ENTITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				if (resolve) return getModeDeclarationGroupPrototypeEx();
				return basicGetModeDeclarationGroupPrototypeEx();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				setModeDeclarationGroupPrototypeEx((ModeDeclarationGroupPrototypeEx)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				setModeDeclarationGroupPrototypeEx((ModeDeclarationGroupPrototypeEx)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX__MODE_DECLARATION_GROUP_PROTOTYPE_EX:
				return modeDeclarationGroupPrototypeEx != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_USING_PARTITION__BSWSCHEDULABLEENTITY:
				return getUsingPartition((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_CALL_ROOT_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY:
				return getCallRootBswSchedulableEntities((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_MAPPED_TASKS__BSWSCHEDULABLEENTITY:
				return getMappedTasks((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES__BSWSCHEDULABLEENTITY:
				return getCallerBswSchedulableEntities((BswSchedulableEntity)arguments.get(0));
			case ExPackage.BSW_SCHEDULABLE_ENTITY_EX___GET_CALLER_BSW_SCHEDULABLE_ENTITIES_BY_MODE__BSWSCHEDULABLEENTITY:
				return getCallerBswSchedulableEntitiesByMode((BswSchedulableEntity)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BswSchedulableEntityExImpl
