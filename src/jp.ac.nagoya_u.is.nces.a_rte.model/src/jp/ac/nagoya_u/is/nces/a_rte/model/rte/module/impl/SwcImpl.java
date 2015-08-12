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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getRteApi <em>Rte Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getApiInitValueConstant <em>Api Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getApiApplicationErrorConstant <em>Api Application Error Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getApiEnumConstant <em>Api Enum Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getApiUpperLowerLimitConstant <em>Api Upper Lower Limit Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getFilterConstant <em>Filter Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getPortArgValueConstant <em>Port Arg Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getDependentExecutableEntity <em>Dependent Executable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getInvalidValueConstant <em>Invalid Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getImplInitValueConstant <em>Impl Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getSwcMemoryMapping <em>Swc Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getInlineGlobalVariables <em>Inline Global Variables</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getInlineConstant <em>Inline Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl#getInlineExecutableEntity <em>Inline Executable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcImpl extends LogicalCompartmentImpl implements Swc {
	/**
	 * The cached value of the '{@link #getRteApi() <em>Rte Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApi()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApi> rteApi;

	/**
	 * The cached value of the '{@link #getApiInitValueConstant() <em>Api Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> apiInitValueConstant;

	/**
	 * The cached value of the '{@link #getApiApplicationErrorConstant() <em>Api Application Error Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiApplicationErrorConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> apiApplicationErrorConstant;

	/**
	 * The cached value of the '{@link #getApiEnumConstant() <em>Api Enum Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnumConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> apiEnumConstant;

	/**
	 * The cached value of the '{@link #getApiUpperLowerLimitConstant() <em>Api Upper Lower Limit Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiUpperLowerLimitConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> apiUpperLowerLimitConstant;

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
	 * The cached value of the '{@link #getPortArgValueConstant() <em>Port Arg Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortArgValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> portArgValueConstant;

	/**
	 * The cached value of the '{@link #getDependentExecutableEntity() <em>Dependent Executable Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentExecutableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntity> dependentExecutableEntity;

	/**
	 * The cached value of the '{@link #getInvalidValueConstant() <em>Invalid Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> invalidValueConstant;

	/**
	 * The cached value of the '{@link #getImplInitValueConstant() <em>Impl Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> implInitValueConstant;

	/**
	 * The cached value of the '{@link #getSwcMemoryMapping() <em>Swc Memory Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcMemoryMapping> swcMemoryMapping;

	/**
	 * The cached value of the '{@link #getInlineGlobalVariables() <em>Inline Global Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineGlobalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> inlineGlobalVariables;

	/**
	 * The cached value of the '{@link #getInlineConstant() <em>Inline Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> inlineConstant;

	/**
	 * The cached value of the '{@link #getInlineExecutableEntity() <em>Inline Executable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineExecutableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntity> inlineExecutableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getFilterConstant() {
		if (filterConstant == null) {
			filterConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__FILTER_CONSTANT);
		}
		return filterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getPortArgValueConstant() {
		if (portArgValueConstant == null) {
			portArgValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__PORT_ARG_VALUE_CONSTANT);
		}
		return portArgValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntity> getDependentExecutableEntity() {
		if (dependentExecutableEntity == null) {
			dependentExecutableEntity = new EObjectContainmentEList<ExecutableEntity>(ExecutableEntity.class, this, ModulePackage.SWC__DEPENDENT_EXECUTABLE_ENTITY);
		}
		return dependentExecutableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getInvalidValueConstant() {
		if (invalidValueConstant == null) {
			invalidValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__INVALID_VALUE_CONSTANT);
		}
		return invalidValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getImplInitValueConstant() {
		if (implInitValueConstant == null) {
			implInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__IMPL_INIT_VALUE_CONSTANT);
		}
		return implInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcMemoryMapping> getSwcMemoryMapping() {
		if (swcMemoryMapping == null) {
			swcMemoryMapping = new EObjectContainmentEList<SwcMemoryMapping>(SwcMemoryMapping.class, this, ModulePackage.SWC__SWC_MEMORY_MAPPING);
		}
		return swcMemoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getInlineGlobalVariables() {
		if (inlineGlobalVariables == null) {
			inlineGlobalVariables = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.SWC__INLINE_GLOBAL_VARIABLES);
		}
		return inlineGlobalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getInlineConstant() {
		if (inlineConstant == null) {
			inlineConstant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.SWC__INLINE_CONSTANT);
		}
		return inlineConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntity> getInlineExecutableEntity() {
		if (inlineExecutableEntity == null) {
			inlineExecutableEntity = new EObjectResolvingEList<ExecutableEntity>(ExecutableEntity.class, this, ModulePackage.SWC__INLINE_EXECUTABLE_ENTITY);
		}
		return inlineExecutableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getParent() {
		if (eContainerFeatureID() != ModulePackage.SWC__PARENT) return null;
		return (Partition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Partition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.SWC__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Partition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.SWC__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.PARTITION__SWC, Partition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.SWC__PARENT, newParent, newParent));
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
			case ModulePackage.SWC__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Partition)otherEnd, msgs);
			case ModulePackage.SWC__RTE_API:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRteApi()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApi> getRteApi() {
		if (rteApi == null) {
			rteApi = new EObjectContainmentWithInverseEList<RteApi>(RteApi.class, this, ModulePackage.SWC__RTE_API, ModulePackage.RTE_API__PARENT);
		}
		return rteApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getApiInitValueConstant() {
		if (apiInitValueConstant == null) {
			apiInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__API_INIT_VALUE_CONSTANT);
		}
		return apiInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getApiApplicationErrorConstant() {
		if (apiApplicationErrorConstant == null) {
			apiApplicationErrorConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__API_APPLICATION_ERROR_CONSTANT);
		}
		return apiApplicationErrorConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getApiEnumConstant() {
		if (apiEnumConstant == null) {
			apiEnumConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__API_ENUM_CONSTANT);
		}
		return apiEnumConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getApiUpperLowerLimitConstant() {
		if (apiUpperLowerLimitConstant == null) {
			apiUpperLowerLimitConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT);
		}
		return apiUpperLowerLimitConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.SWC__PARENT:
				return basicSetParent(null, msgs);
			case ModulePackage.SWC__RTE_API:
				return ((InternalEList<?>)getRteApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__API_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getApiInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__API_APPLICATION_ERROR_CONSTANT:
				return ((InternalEList<?>)getApiApplicationErrorConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				return ((InternalEList<?>)getApiEnumConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				return ((InternalEList<?>)getApiUpperLowerLimitConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__FILTER_CONSTANT:
				return ((InternalEList<?>)getFilterConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__PORT_ARG_VALUE_CONSTANT:
				return ((InternalEList<?>)getPortArgValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__DEPENDENT_EXECUTABLE_ENTITY:
				return ((InternalEList<?>)getDependentExecutableEntity()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__INVALID_VALUE_CONSTANT:
				return ((InternalEList<?>)getInvalidValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__IMPL_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getImplInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				return ((InternalEList<?>)getSwcMemoryMapping()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.SWC__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.PARTITION__SWC, Partition.class, msgs);
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
			case ModulePackage.SWC__PARENT:
				return getParent();
			case ModulePackage.SWC__RTE_API:
				return getRteApi();
			case ModulePackage.SWC__API_INIT_VALUE_CONSTANT:
				return getApiInitValueConstant();
			case ModulePackage.SWC__API_APPLICATION_ERROR_CONSTANT:
				return getApiApplicationErrorConstant();
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				return getApiEnumConstant();
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				return getApiUpperLowerLimitConstant();
			case ModulePackage.SWC__FILTER_CONSTANT:
				return getFilterConstant();
			case ModulePackage.SWC__PORT_ARG_VALUE_CONSTANT:
				return getPortArgValueConstant();
			case ModulePackage.SWC__DEPENDENT_EXECUTABLE_ENTITY:
				return getDependentExecutableEntity();
			case ModulePackage.SWC__INVALID_VALUE_CONSTANT:
				return getInvalidValueConstant();
			case ModulePackage.SWC__IMPL_INIT_VALUE_CONSTANT:
				return getImplInitValueConstant();
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				return getSwcMemoryMapping();
			case ModulePackage.SWC__INLINE_GLOBAL_VARIABLES:
				return getInlineGlobalVariables();
			case ModulePackage.SWC__INLINE_CONSTANT:
				return getInlineConstant();
			case ModulePackage.SWC__INLINE_EXECUTABLE_ENTITY:
				return getInlineExecutableEntity();
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
			case ModulePackage.SWC__PARENT:
				setParent((Partition)newValue);
				return;
			case ModulePackage.SWC__RTE_API:
				getRteApi().clear();
				getRteApi().addAll((Collection<? extends RteApi>)newValue);
				return;
			case ModulePackage.SWC__API_INIT_VALUE_CONSTANT:
				getApiInitValueConstant().clear();
				getApiInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__API_APPLICATION_ERROR_CONSTANT:
				getApiApplicationErrorConstant().clear();
				getApiApplicationErrorConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				getApiEnumConstant().clear();
				getApiEnumConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				getApiUpperLowerLimitConstant().clear();
				getApiUpperLowerLimitConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__FILTER_CONSTANT:
				getFilterConstant().clear();
				getFilterConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__PORT_ARG_VALUE_CONSTANT:
				getPortArgValueConstant().clear();
				getPortArgValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__DEPENDENT_EXECUTABLE_ENTITY:
				getDependentExecutableEntity().clear();
				getDependentExecutableEntity().addAll((Collection<? extends ExecutableEntity>)newValue);
				return;
			case ModulePackage.SWC__INVALID_VALUE_CONSTANT:
				getInvalidValueConstant().clear();
				getInvalidValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__IMPL_INIT_VALUE_CONSTANT:
				getImplInitValueConstant().clear();
				getImplInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				getSwcMemoryMapping().clear();
				getSwcMemoryMapping().addAll((Collection<? extends SwcMemoryMapping>)newValue);
				return;
			case ModulePackage.SWC__INLINE_GLOBAL_VARIABLES:
				getInlineGlobalVariables().clear();
				getInlineGlobalVariables().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.SWC__INLINE_CONSTANT:
				getInlineConstant().clear();
				getInlineConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.SWC__INLINE_EXECUTABLE_ENTITY:
				getInlineExecutableEntity().clear();
				getInlineExecutableEntity().addAll((Collection<? extends ExecutableEntity>)newValue);
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
			case ModulePackage.SWC__PARENT:
				setParent((Partition)null);
				return;
			case ModulePackage.SWC__RTE_API:
				getRteApi().clear();
				return;
			case ModulePackage.SWC__API_INIT_VALUE_CONSTANT:
				getApiInitValueConstant().clear();
				return;
			case ModulePackage.SWC__API_APPLICATION_ERROR_CONSTANT:
				getApiApplicationErrorConstant().clear();
				return;
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				getApiEnumConstant().clear();
				return;
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				getApiUpperLowerLimitConstant().clear();
				return;
			case ModulePackage.SWC__FILTER_CONSTANT:
				getFilterConstant().clear();
				return;
			case ModulePackage.SWC__PORT_ARG_VALUE_CONSTANT:
				getPortArgValueConstant().clear();
				return;
			case ModulePackage.SWC__DEPENDENT_EXECUTABLE_ENTITY:
				getDependentExecutableEntity().clear();
				return;
			case ModulePackage.SWC__INVALID_VALUE_CONSTANT:
				getInvalidValueConstant().clear();
				return;
			case ModulePackage.SWC__IMPL_INIT_VALUE_CONSTANT:
				getImplInitValueConstant().clear();
				return;
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				getSwcMemoryMapping().clear();
				return;
			case ModulePackage.SWC__INLINE_GLOBAL_VARIABLES:
				getInlineGlobalVariables().clear();
				return;
			case ModulePackage.SWC__INLINE_CONSTANT:
				getInlineConstant().clear();
				return;
			case ModulePackage.SWC__INLINE_EXECUTABLE_ENTITY:
				getInlineExecutableEntity().clear();
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
			case ModulePackage.SWC__PARENT:
				return getParent() != null;
			case ModulePackage.SWC__RTE_API:
				return rteApi != null && !rteApi.isEmpty();
			case ModulePackage.SWC__API_INIT_VALUE_CONSTANT:
				return apiInitValueConstant != null && !apiInitValueConstant.isEmpty();
			case ModulePackage.SWC__API_APPLICATION_ERROR_CONSTANT:
				return apiApplicationErrorConstant != null && !apiApplicationErrorConstant.isEmpty();
			case ModulePackage.SWC__API_ENUM_CONSTANT:
				return apiEnumConstant != null && !apiEnumConstant.isEmpty();
			case ModulePackage.SWC__API_UPPER_LOWER_LIMIT_CONSTANT:
				return apiUpperLowerLimitConstant != null && !apiUpperLowerLimitConstant.isEmpty();
			case ModulePackage.SWC__FILTER_CONSTANT:
				return filterConstant != null && !filterConstant.isEmpty();
			case ModulePackage.SWC__PORT_ARG_VALUE_CONSTANT:
				return portArgValueConstant != null && !portArgValueConstant.isEmpty();
			case ModulePackage.SWC__DEPENDENT_EXECUTABLE_ENTITY:
				return dependentExecutableEntity != null && !dependentExecutableEntity.isEmpty();
			case ModulePackage.SWC__INVALID_VALUE_CONSTANT:
				return invalidValueConstant != null && !invalidValueConstant.isEmpty();
			case ModulePackage.SWC__IMPL_INIT_VALUE_CONSTANT:
				return implInitValueConstant != null && !implInitValueConstant.isEmpty();
			case ModulePackage.SWC__SWC_MEMORY_MAPPING:
				return swcMemoryMapping != null && !swcMemoryMapping.isEmpty();
			case ModulePackage.SWC__INLINE_GLOBAL_VARIABLES:
				return inlineGlobalVariables != null && !inlineGlobalVariables.isEmpty();
			case ModulePackage.SWC__INLINE_CONSTANT:
				return inlineConstant != null && !inlineConstant.isEmpty();
			case ModulePackage.SWC__INLINE_EXECUTABLE_ENTITY:
				return inlineExecutableEntity != null && !inlineExecutableEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwcImpl
