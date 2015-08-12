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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacroGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getIsBswPartition <em>Is Bsw Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSwc <em>Swc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRteBufferVariableSet <em>Rte Buffer Variable Set</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getFilterOldValueVariable <em>Filter Old Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getFilterOccurrenceVariable <em>Filter Occurrence Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRestartPartitionApi <em>Restart Partition Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getPartitionTerminatedApi <em>Partition Terminated Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getPartitionRestartingApi <em>Partition Restarting Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getTaskBody <em>Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRteBufferQueuedVariable <em>Rte Buffer Queued Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRteBufferInitValueConstant <em>Rte Buffer Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getEntityStartVariable <em>Entity Start Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getEntityStartConstant <em>Entity Start Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getFilterConstant <em>Filter Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRteBufferSendTrustedFunction <em>Rte Buffer Send Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getOsTrustedMacro <em>Os Trusted Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getPartedBswm <em>Parted Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getFunctionMacroGroup <em>Function Macro Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getRteInternalVariable <em>Rte Internal Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getSignalApi <em>Signal Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl#getProxyApi <em>Proxy Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionImpl extends LogicalCompartmentImpl implements Partition {
	/**
	 * The default value of the '{@link #getIsBswPartition() <em>Is Bsw Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBswPartition()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BSW_PARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBswPartition() <em>Is Bsw Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBswPartition()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBswPartition = IS_BSW_PARTITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwc() <em>Swc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc()
	 * @generated
	 * @ordered
	 */
	protected EList<Swc> swc;

	/**
	 * The cached value of the '{@link #getRteBufferVariableSet() <em>Rte Buffer Variable Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBufferVariableSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferVariableSet> rteBufferVariableSet;

	/**
	 * The cached value of the '{@link #getFilterOldValueVariable() <em>Filter Old Value Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOldValueVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> filterOldValueVariable;

	/**
	 * The cached value of the '{@link #getFilterOccurrenceVariable() <em>Filter Occurrence Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOccurrenceVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> filterOccurrenceVariable;

	/**
	 * The cached value of the '{@link #getRestartPartitionApi() <em>Restart Partition Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPartitionApi()
	 * @generated
	 * @ordered
	 */
	protected RestartPartitionApi restartPartitionApi;

	/**
	 * The cached value of the '{@link #getPartitionTerminatedApi() <em>Partition Terminated Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionTerminatedApi()
	 * @generated
	 * @ordered
	 */
	protected PartitionTerminatedApi partitionTerminatedApi;

	/**
	 * The cached value of the '{@link #getPartitionRestartingApi() <em>Partition Restarting Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionRestartingApi()
	 * @generated
	 * @ordered
	 */
	protected PartitionRestartingApi partitionRestartingApi;

	/**
	 * The cached value of the '{@link #getTaskBody() <em>Task Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBody()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskBody> taskBody;

	/**
	 * The cached value of the '{@link #getRteBufferQueuedVariable() <em>Rte Buffer Queued Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBufferQueuedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBufferQueuedVariable> rteBufferQueuedVariable;

	/**
	 * The cached value of the '{@link #getRteBufferInitValueConstant() <em>Rte Buffer Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBufferInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> rteBufferInitValueConstant;

	/**
	 * The cached value of the '{@link #getEntityStartVariable() <em>Entity Start Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityStartVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> entityStartVariable;

	/**
	 * The cached value of the '{@link #getEntityStartConstant() <em>Entity Start Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityStartConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> entityStartConstant;

	/**
	 * The cached value of the '{@link #getFilterConstant() <em>Filter Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> filterConstant;

	/**
	 * The cached value of the '{@link #getRteBufferSendTrustedFunction() <em>Rte Buffer Send Trusted Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteBufferSendTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustedFunction> rteBufferSendTrustedFunction;

	/**
	 * The cached value of the '{@link #getOsTrustedMacro() <em>Os Trusted Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsTrustedMacro()
	 * @generated
	 * @ordered
	 */
	protected Macro osTrustedMacro;

	/**
	 * The cached value of the '{@link #getPartedBswm() <em>Parted Bswm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartedBswm()
	 * @generated
	 * @ordered
	 */
	protected EList<PartedBswm> partedBswm;

	/**
	 * The cached value of the '{@link #getFunctionMacroGroup() <em>Function Macro Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionMacroGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionMacroGroup> functionMacroGroup;

	/**
	 * The cached value of the '{@link #getRteInternalVariable() <em>Rte Internal Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInternalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> rteInternalVariable;

	/**
	 * The cached value of the '{@link #getSignalApi() <em>Signal Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalApi()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalApi> signalApi;

	/**
	 * The cached value of the '{@link #getProxyApi() <em>Proxy Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyApi()
	 * @generated
	 * @ordered
	 */
	protected EList<ProxyApi> proxyApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBswPartition() {
		return isBswPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBswPartition(Boolean newIsBswPartition) {
		Boolean oldIsBswPartition = isBswPartition;
		isBswPartition = newIsBswPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__IS_BSW_PARTITION, oldIsBswPartition, isBswPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getParent() {
		if (eContainerFeatureID() != ModulePackage.PARTITION__PARENT) return null;
		return (Core)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Core newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.PARTITION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Core newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.PARTITION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.CORE__PARTITION, Core.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Swc> getSwc() {
		if (swc == null) {
			swc = new EObjectContainmentWithInverseEList<Swc>(Swc.class, this, ModulePackage.PARTITION__SWC, ModulePackage.SWC__PARENT);
		}
		return swc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferVariableSet> getRteBufferVariableSet() {
		if (rteBufferVariableSet == null) {
			rteBufferVariableSet = new EObjectContainmentEList<RteBufferVariableSet>(RteBufferVariableSet.class, this, ModulePackage.PARTITION__RTE_BUFFER_VARIABLE_SET);
		}
		return rteBufferVariableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getFilterOldValueVariable() {
		if (filterOldValueVariable == null) {
			filterOldValueVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__FILTER_OLD_VALUE_VARIABLE);
		}
		return filterOldValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getFilterOccurrenceVariable() {
		if (filterOccurrenceVariable == null) {
			filterOccurrenceVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__FILTER_OCCURRENCE_VARIABLE);
		}
		return filterOccurrenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartPartitionApi getRestartPartitionApi() {
		return restartPartitionApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestartPartitionApi(RestartPartitionApi newRestartPartitionApi, NotificationChain msgs) {
		RestartPartitionApi oldRestartPartitionApi = restartPartitionApi;
		restartPartitionApi = newRestartPartitionApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__RESTART_PARTITION_API, oldRestartPartitionApi, newRestartPartitionApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartPartitionApi(RestartPartitionApi newRestartPartitionApi) {
		if (newRestartPartitionApi != restartPartitionApi) {
			NotificationChain msgs = null;
			if (restartPartitionApi != null)
				msgs = ((InternalEObject)restartPartitionApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__RESTART_PARTITION_API, null, msgs);
			if (newRestartPartitionApi != null)
				msgs = ((InternalEObject)newRestartPartitionApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__RESTART_PARTITION_API, null, msgs);
			msgs = basicSetRestartPartitionApi(newRestartPartitionApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__RESTART_PARTITION_API, newRestartPartitionApi, newRestartPartitionApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionTerminatedApi getPartitionTerminatedApi() {
		return partitionTerminatedApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionTerminatedApi(PartitionTerminatedApi newPartitionTerminatedApi, NotificationChain msgs) {
		PartitionTerminatedApi oldPartitionTerminatedApi = partitionTerminatedApi;
		partitionTerminatedApi = newPartitionTerminatedApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_TERMINATED_API, oldPartitionTerminatedApi, newPartitionTerminatedApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionTerminatedApi(PartitionTerminatedApi newPartitionTerminatedApi) {
		if (newPartitionTerminatedApi != partitionTerminatedApi) {
			NotificationChain msgs = null;
			if (partitionTerminatedApi != null)
				msgs = ((InternalEObject)partitionTerminatedApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_TERMINATED_API, null, msgs);
			if (newPartitionTerminatedApi != null)
				msgs = ((InternalEObject)newPartitionTerminatedApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_TERMINATED_API, null, msgs);
			msgs = basicSetPartitionTerminatedApi(newPartitionTerminatedApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_TERMINATED_API, newPartitionTerminatedApi, newPartitionTerminatedApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionRestartingApi getPartitionRestartingApi() {
		return partitionRestartingApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionRestartingApi(PartitionRestartingApi newPartitionRestartingApi, NotificationChain msgs) {
		PartitionRestartingApi oldPartitionRestartingApi = partitionRestartingApi;
		partitionRestartingApi = newPartitionRestartingApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_RESTARTING_API, oldPartitionRestartingApi, newPartitionRestartingApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionRestartingApi(PartitionRestartingApi newPartitionRestartingApi) {
		if (newPartitionRestartingApi != partitionRestartingApi) {
			NotificationChain msgs = null;
			if (partitionRestartingApi != null)
				msgs = ((InternalEObject)partitionRestartingApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_RESTARTING_API, null, msgs);
			if (newPartitionRestartingApi != null)
				msgs = ((InternalEObject)newPartitionRestartingApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__PARTITION_RESTARTING_API, null, msgs);
			msgs = basicSetPartitionRestartingApi(newPartitionRestartingApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__PARTITION_RESTARTING_API, newPartitionRestartingApi, newPartitionRestartingApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskBody> getTaskBody() {
		if (taskBody == null) {
			taskBody = new EObjectContainmentEList<TaskBody>(TaskBody.class, this, ModulePackage.PARTITION__TASK_BODY);
		}
		return taskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBufferQueuedVariable> getRteBufferQueuedVariable() {
		if (rteBufferQueuedVariable == null) {
			rteBufferQueuedVariable = new EObjectContainmentEList<RteBufferQueuedVariable>(RteBufferQueuedVariable.class, this, ModulePackage.PARTITION__RTE_BUFFER_QUEUED_VARIABLE);
		}
		return rteBufferQueuedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getRteBufferInitValueConstant() {
		if (rteBufferInitValueConstant == null) {
			rteBufferInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT);
		}
		return rteBufferInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getEntityStartVariable() {
		if (entityStartVariable == null) {
			entityStartVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__ENTITY_START_VARIABLE);
		}
		return entityStartVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getEntityStartConstant() {
		if (entityStartConstant == null) {
			entityStartConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__ENTITY_START_CONSTANT);
		}
		return entityStartConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getFilterConstant() {
		if (filterConstant == null) {
			filterConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.PARTITION__FILTER_CONSTANT);
		}
		return filterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustedFunction> getRteBufferSendTrustedFunction() {
		if (rteBufferSendTrustedFunction == null) {
			rteBufferSendTrustedFunction = new EObjectContainmentEList<TrustedFunction>(TrustedFunction.class, this, ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION);
		}
		return rteBufferSendTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macro getOsTrustedMacro() {
		return osTrustedMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsTrustedMacro(Macro newOsTrustedMacro, NotificationChain msgs) {
		Macro oldOsTrustedMacro = osTrustedMacro;
		osTrustedMacro = newOsTrustedMacro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__OS_TRUSTED_MACRO, oldOsTrustedMacro, newOsTrustedMacro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsTrustedMacro(Macro newOsTrustedMacro) {
		if (newOsTrustedMacro != osTrustedMacro) {
			NotificationChain msgs = null;
			if (osTrustedMacro != null)
				msgs = ((InternalEObject)osTrustedMacro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__OS_TRUSTED_MACRO, null, msgs);
			if (newOsTrustedMacro != null)
				msgs = ((InternalEObject)newOsTrustedMacro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION__OS_TRUSTED_MACRO, null, msgs);
			msgs = basicSetOsTrustedMacro(newOsTrustedMacro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION__OS_TRUSTED_MACRO, newOsTrustedMacro, newOsTrustedMacro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartedBswm> getPartedBswm() {
		if (partedBswm == null) {
			partedBswm = new EObjectContainmentWithInverseEList<PartedBswm>(PartedBswm.class, this, ModulePackage.PARTITION__PARTED_BSWM, ModulePackage.PARTED_BSWM__PARENT);
		}
		return partedBswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionMacroGroup> getFunctionMacroGroup() {
		if (functionMacroGroup == null) {
			functionMacroGroup = new EObjectContainmentEList<FunctionMacroGroup>(FunctionMacroGroup.class, this, ModulePackage.PARTITION__FUNCTION_MACRO_GROUP);
		}
		return functionMacroGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getRteInternalVariable() {
		if (rteInternalVariable == null) {
			rteInternalVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.PARTITION__RTE_INTERNAL_VARIABLE);
		}
		return rteInternalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalApi> getSignalApi() {
		if (signalApi == null) {
			signalApi = new EObjectContainmentWithInverseEList<SignalApi>(SignalApi.class, this, ModulePackage.PARTITION__SIGNAL_API, ModulePackage.SIGNAL_API__PARENT);
		}
		return signalApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProxyApi> getProxyApi() {
		if (proxyApi == null) {
			proxyApi = new EObjectContainmentWithInverseEList<ProxyApi>(ProxyApi.class, this, ModulePackage.PARTITION__PROXY_API, ModulePackage.PROXY_API__PARENT);
		}
		return proxyApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.PARTITION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Core)otherEnd, msgs);
			case ModulePackage.PARTITION__SWC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwc()).basicAdd(otherEnd, msgs);
			case ModulePackage.PARTITION__PARTED_BSWM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartedBswm()).basicAdd(otherEnd, msgs);
			case ModulePackage.PARTITION__SIGNAL_API:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignalApi()).basicAdd(otherEnd, msgs);
			case ModulePackage.PARTITION__PROXY_API:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProxyApi()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.PARTITION__PARENT:
				return basicSetParent(null, msgs);
			case ModulePackage.PARTITION__SWC:
				return ((InternalEList<?>)getSwc()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RTE_BUFFER_VARIABLE_SET:
				return ((InternalEList<?>)getRteBufferVariableSet()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__FILTER_OLD_VALUE_VARIABLE:
				return ((InternalEList<?>)getFilterOldValueVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__FILTER_OCCURRENCE_VARIABLE:
				return ((InternalEList<?>)getFilterOccurrenceVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				return basicSetRestartPartitionApi(null, msgs);
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				return basicSetPartitionTerminatedApi(null, msgs);
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				return basicSetPartitionRestartingApi(null, msgs);
			case ModulePackage.PARTITION__TASK_BODY:
				return ((InternalEList<?>)getTaskBody()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RTE_BUFFER_QUEUED_VARIABLE:
				return ((InternalEList<?>)getRteBufferQueuedVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getRteBufferInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				return ((InternalEList<?>)getEntityStartVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				return ((InternalEList<?>)getEntityStartConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__FILTER_CONSTANT:
				return ((InternalEList<?>)getFilterConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				return ((InternalEList<?>)getRteBufferSendTrustedFunction()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				return basicSetOsTrustedMacro(null, msgs);
			case ModulePackage.PARTITION__PARTED_BSWM:
				return ((InternalEList<?>)getPartedBswm()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__FUNCTION_MACRO_GROUP:
				return ((InternalEList<?>)getFunctionMacroGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__RTE_INTERNAL_VARIABLE:
				return ((InternalEList<?>)getRteInternalVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__SIGNAL_API:
				return ((InternalEList<?>)getSignalApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.PARTITION__PROXY_API:
				return ((InternalEList<?>)getProxyApi()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModulePackage.PARTITION__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.CORE__PARTITION, Core.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				return getIsBswPartition();
			case ModulePackage.PARTITION__PARENT:
				return getParent();
			case ModulePackage.PARTITION__SWC:
				return getSwc();
			case ModulePackage.PARTITION__RTE_BUFFER_VARIABLE_SET:
				return getRteBufferVariableSet();
			case ModulePackage.PARTITION__FILTER_OLD_VALUE_VARIABLE:
				return getFilterOldValueVariable();
			case ModulePackage.PARTITION__FILTER_OCCURRENCE_VARIABLE:
				return getFilterOccurrenceVariable();
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				return getRestartPartitionApi();
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				return getPartitionTerminatedApi();
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				return getPartitionRestartingApi();
			case ModulePackage.PARTITION__TASK_BODY:
				return getTaskBody();
			case ModulePackage.PARTITION__RTE_BUFFER_QUEUED_VARIABLE:
				return getRteBufferQueuedVariable();
			case ModulePackage.PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT:
				return getRteBufferInitValueConstant();
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				return getEntityStartVariable();
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				return getEntityStartConstant();
			case ModulePackage.PARTITION__FILTER_CONSTANT:
				return getFilterConstant();
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				return getRteBufferSendTrustedFunction();
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				return getOsTrustedMacro();
			case ModulePackage.PARTITION__PARTED_BSWM:
				return getPartedBswm();
			case ModulePackage.PARTITION__FUNCTION_MACRO_GROUP:
				return getFunctionMacroGroup();
			case ModulePackage.PARTITION__RTE_INTERNAL_VARIABLE:
				return getRteInternalVariable();
			case ModulePackage.PARTITION__SIGNAL_API:
				return getSignalApi();
			case ModulePackage.PARTITION__PROXY_API:
				return getProxyApi();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				setIsBswPartition((Boolean)newValue);
				return;
			case ModulePackage.PARTITION__PARENT:
				setParent((Core)newValue);
				return;
			case ModulePackage.PARTITION__SWC:
				getSwc().clear();
				getSwc().addAll((Collection<? extends Swc>)newValue);
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_VARIABLE_SET:
				getRteBufferVariableSet().clear();
				getRteBufferVariableSet().addAll((Collection<? extends RteBufferVariableSet>)newValue);
				return;
			case ModulePackage.PARTITION__FILTER_OLD_VALUE_VARIABLE:
				getFilterOldValueVariable().clear();
				getFilterOldValueVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__FILTER_OCCURRENCE_VARIABLE:
				getFilterOccurrenceVariable().clear();
				getFilterOccurrenceVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				setRestartPartitionApi((RestartPartitionApi)newValue);
				return;
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				setPartitionTerminatedApi((PartitionTerminatedApi)newValue);
				return;
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				setPartitionRestartingApi((PartitionRestartingApi)newValue);
				return;
			case ModulePackage.PARTITION__TASK_BODY:
				getTaskBody().clear();
				getTaskBody().addAll((Collection<? extends TaskBody>)newValue);
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_QUEUED_VARIABLE:
				getRteBufferQueuedVariable().clear();
				getRteBufferQueuedVariable().addAll((Collection<? extends RteBufferQueuedVariable>)newValue);
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT:
				getRteBufferInitValueConstant().clear();
				getRteBufferInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				getEntityStartVariable().clear();
				getEntityStartVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				getEntityStartConstant().clear();
				getEntityStartConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__FILTER_CONSTANT:
				getFilterConstant().clear();
				getFilterConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				getRteBufferSendTrustedFunction().clear();
				getRteBufferSendTrustedFunction().addAll((Collection<? extends TrustedFunction>)newValue);
				return;
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				setOsTrustedMacro((Macro)newValue);
				return;
			case ModulePackage.PARTITION__PARTED_BSWM:
				getPartedBswm().clear();
				getPartedBswm().addAll((Collection<? extends PartedBswm>)newValue);
				return;
			case ModulePackage.PARTITION__FUNCTION_MACRO_GROUP:
				getFunctionMacroGroup().clear();
				getFunctionMacroGroup().addAll((Collection<? extends FunctionMacroGroup>)newValue);
				return;
			case ModulePackage.PARTITION__RTE_INTERNAL_VARIABLE:
				getRteInternalVariable().clear();
				getRteInternalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.PARTITION__SIGNAL_API:
				getSignalApi().clear();
				getSignalApi().addAll((Collection<? extends SignalApi>)newValue);
				return;
			case ModulePackage.PARTITION__PROXY_API:
				getProxyApi().clear();
				getProxyApi().addAll((Collection<? extends ProxyApi>)newValue);
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
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				setIsBswPartition(IS_BSW_PARTITION_EDEFAULT);
				return;
			case ModulePackage.PARTITION__PARENT:
				setParent((Core)null);
				return;
			case ModulePackage.PARTITION__SWC:
				getSwc().clear();
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_VARIABLE_SET:
				getRteBufferVariableSet().clear();
				return;
			case ModulePackage.PARTITION__FILTER_OLD_VALUE_VARIABLE:
				getFilterOldValueVariable().clear();
				return;
			case ModulePackage.PARTITION__FILTER_OCCURRENCE_VARIABLE:
				getFilterOccurrenceVariable().clear();
				return;
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				setRestartPartitionApi((RestartPartitionApi)null);
				return;
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				setPartitionTerminatedApi((PartitionTerminatedApi)null);
				return;
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				setPartitionRestartingApi((PartitionRestartingApi)null);
				return;
			case ModulePackage.PARTITION__TASK_BODY:
				getTaskBody().clear();
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_QUEUED_VARIABLE:
				getRteBufferQueuedVariable().clear();
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT:
				getRteBufferInitValueConstant().clear();
				return;
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				getEntityStartVariable().clear();
				return;
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				getEntityStartConstant().clear();
				return;
			case ModulePackage.PARTITION__FILTER_CONSTANT:
				getFilterConstant().clear();
				return;
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				getRteBufferSendTrustedFunction().clear();
				return;
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				setOsTrustedMacro((Macro)null);
				return;
			case ModulePackage.PARTITION__PARTED_BSWM:
				getPartedBswm().clear();
				return;
			case ModulePackage.PARTITION__FUNCTION_MACRO_GROUP:
				getFunctionMacroGroup().clear();
				return;
			case ModulePackage.PARTITION__RTE_INTERNAL_VARIABLE:
				getRteInternalVariable().clear();
				return;
			case ModulePackage.PARTITION__SIGNAL_API:
				getSignalApi().clear();
				return;
			case ModulePackage.PARTITION__PROXY_API:
				getProxyApi().clear();
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
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				return IS_BSW_PARTITION_EDEFAULT == null ? isBswPartition != null : !IS_BSW_PARTITION_EDEFAULT.equals(isBswPartition);
			case ModulePackage.PARTITION__PARENT:
				return getParent() != null;
			case ModulePackage.PARTITION__SWC:
				return swc != null && !swc.isEmpty();
			case ModulePackage.PARTITION__RTE_BUFFER_VARIABLE_SET:
				return rteBufferVariableSet != null && !rteBufferVariableSet.isEmpty();
			case ModulePackage.PARTITION__FILTER_OLD_VALUE_VARIABLE:
				return filterOldValueVariable != null && !filterOldValueVariable.isEmpty();
			case ModulePackage.PARTITION__FILTER_OCCURRENCE_VARIABLE:
				return filterOccurrenceVariable != null && !filterOccurrenceVariable.isEmpty();
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
				return restartPartitionApi != null;
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
				return partitionTerminatedApi != null;
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
				return partitionRestartingApi != null;
			case ModulePackage.PARTITION__TASK_BODY:
				return taskBody != null && !taskBody.isEmpty();
			case ModulePackage.PARTITION__RTE_BUFFER_QUEUED_VARIABLE:
				return rteBufferQueuedVariable != null && !rteBufferQueuedVariable.isEmpty();
			case ModulePackage.PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT:
				return rteBufferInitValueConstant != null && !rteBufferInitValueConstant.isEmpty();
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
				return entityStartVariable != null && !entityStartVariable.isEmpty();
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
				return entityStartConstant != null && !entityStartConstant.isEmpty();
			case ModulePackage.PARTITION__FILTER_CONSTANT:
				return filterConstant != null && !filterConstant.isEmpty();
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
				return rteBufferSendTrustedFunction != null && !rteBufferSendTrustedFunction.isEmpty();
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
				return osTrustedMacro != null;
			case ModulePackage.PARTITION__PARTED_BSWM:
				return partedBswm != null && !partedBswm.isEmpty();
			case ModulePackage.PARTITION__FUNCTION_MACRO_GROUP:
				return functionMacroGroup != null && !functionMacroGroup.isEmpty();
			case ModulePackage.PARTITION__RTE_INTERNAL_VARIABLE:
				return rteInternalVariable != null && !rteInternalVariable.isEmpty();
			case ModulePackage.PARTITION__SIGNAL_API:
				return signalApi != null && !signalApi.isEmpty();
			case ModulePackage.PARTITION__PROXY_API:
				return proxyApi != null && !proxyApi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isBswPartition: ");
		result.append(isBswPartition);
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
