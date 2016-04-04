/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getCoreId <em>Core Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getIsMasterCore <em>Is Master Core</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getRteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getSchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreImpl extends LogicalCompartmentImpl implements Core {
	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partition;

	/**
	 * The default value of the '{@link #getCoreId() <em>Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoreId() <em>Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreId()
	 * @generated
	 * @ordered
	 */
	protected Integer coreId = CORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMasterCore() <em>Is Master Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMasterCore()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MASTER_CORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMasterCore() <em>Is Master Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMasterCore()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMasterCore = IS_MASTER_CORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRteCoreStartApiImpl() <em>Rte Core Start Api Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCoreStartApiImpl()
	 * @generated
	 * @ordered
	 */
	protected RteCoreStartApiImpl rteCoreStartApiImpl;

	/**
	 * The cached value of the '{@link #getSchmCoreInitApiImpl() <em>Schm Core Init Api Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmCoreInitApiImpl()
	 * @generated
	 * @ordered
	 */
	protected SchmCoreInitApiImpl schmCoreInitApiImpl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getPartition() {
		if (partition == null) {
			partition = new EObjectContainmentWithInverseEList<Partition>(Partition.class, this, ModulePackage.CORE__PARTITION, ModulePackage.PARTITION__PARENT);
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCoreId() {
		return coreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreId(Integer newCoreId) {
		Integer oldCoreId = coreId;
		coreId = newCoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__CORE_ID, oldCoreId, coreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMasterCore() {
		return isMasterCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMasterCore(Boolean newIsMasterCore) {
		Boolean oldIsMasterCore = isMasterCore;
		isMasterCore = newIsMasterCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__IS_MASTER_CORE, oldIsMasterCore, isMasterCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl getRteCoreStartApiImpl() {
		return rteCoreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteCoreStartApiImpl(RteCoreStartApiImpl newRteCoreStartApiImpl, NotificationChain msgs) {
		RteCoreStartApiImpl oldRteCoreStartApiImpl = rteCoreStartApiImpl;
		rteCoreStartApiImpl = newRteCoreStartApiImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__RTE_CORE_START_API_IMPL, oldRteCoreStartApiImpl, newRteCoreStartApiImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCoreStartApiImpl(RteCoreStartApiImpl newRteCoreStartApiImpl) {
		if (newRteCoreStartApiImpl != rteCoreStartApiImpl) {
			NotificationChain msgs = null;
			if (rteCoreStartApiImpl != null)
				msgs = ((InternalEObject)rteCoreStartApiImpl).eInverseRemove(this, ModulePackage.RTE_CORE_START_API_IMPL__PARENT, RteCoreStartApiImpl.class, msgs);
			if (newRteCoreStartApiImpl != null)
				msgs = ((InternalEObject)newRteCoreStartApiImpl).eInverseAdd(this, ModulePackage.RTE_CORE_START_API_IMPL__PARENT, RteCoreStartApiImpl.class, msgs);
			msgs = basicSetRteCoreStartApiImpl(newRteCoreStartApiImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__RTE_CORE_START_API_IMPL, newRteCoreStartApiImpl, newRteCoreStartApiImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl getSchmCoreInitApiImpl() {
		return schmCoreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchmCoreInitApiImpl(SchmCoreInitApiImpl newSchmCoreInitApiImpl, NotificationChain msgs) {
		SchmCoreInitApiImpl oldSchmCoreInitApiImpl = schmCoreInitApiImpl;
		schmCoreInitApiImpl = newSchmCoreInitApiImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL, oldSchmCoreInitApiImpl, newSchmCoreInitApiImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmCoreInitApiImpl(SchmCoreInitApiImpl newSchmCoreInitApiImpl) {
		if (newSchmCoreInitApiImpl != schmCoreInitApiImpl) {
			NotificationChain msgs = null;
			if (schmCoreInitApiImpl != null)
				msgs = ((InternalEObject)schmCoreInitApiImpl).eInverseRemove(this, ModulePackage.SCHM_CORE_INIT_API_IMPL__PARENT, SchmCoreInitApiImpl.class, msgs);
			if (newSchmCoreInitApiImpl != null)
				msgs = ((InternalEObject)newSchmCoreInitApiImpl).eInverseAdd(this, ModulePackage.SCHM_CORE_INIT_API_IMPL__PARENT, SchmCoreInitApiImpl.class, msgs);
			msgs = basicSetSchmCoreInitApiImpl(newSchmCoreInitApiImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL, newSchmCoreInitApiImpl, newSchmCoreInitApiImpl));
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
			case ModulePackage.CORE__PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartition()).basicAdd(otherEnd, msgs);
			case ModulePackage.CORE__RTE_CORE_START_API_IMPL:
				if (rteCoreStartApiImpl != null)
					msgs = ((InternalEObject)rteCoreStartApiImpl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CORE__RTE_CORE_START_API_IMPL, null, msgs);
				return basicSetRteCoreStartApiImpl((RteCoreStartApiImpl)otherEnd, msgs);
			case ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL:
				if (schmCoreInitApiImpl != null)
					msgs = ((InternalEObject)schmCoreInitApiImpl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL, null, msgs);
				return basicSetSchmCoreInitApiImpl((SchmCoreInitApiImpl)otherEnd, msgs);
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
			case ModulePackage.CORE__PARTITION:
				return ((InternalEList<?>)getPartition()).basicRemove(otherEnd, msgs);
			case ModulePackage.CORE__RTE_CORE_START_API_IMPL:
				return basicSetRteCoreStartApiImpl(null, msgs);
			case ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL:
				return basicSetSchmCoreInitApiImpl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.CORE__PARTITION:
				return getPartition();
			case ModulePackage.CORE__CORE_ID:
				return getCoreId();
			case ModulePackage.CORE__IS_MASTER_CORE:
				return getIsMasterCore();
			case ModulePackage.CORE__RTE_CORE_START_API_IMPL:
				return getRteCoreStartApiImpl();
			case ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL:
				return getSchmCoreInitApiImpl();
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
			case ModulePackage.CORE__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends Partition>)newValue);
				return;
			case ModulePackage.CORE__CORE_ID:
				setCoreId((Integer)newValue);
				return;
			case ModulePackage.CORE__IS_MASTER_CORE:
				setIsMasterCore((Boolean)newValue);
				return;
			case ModulePackage.CORE__RTE_CORE_START_API_IMPL:
				setRteCoreStartApiImpl((RteCoreStartApiImpl)newValue);
				return;
			case ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL:
				setSchmCoreInitApiImpl((SchmCoreInitApiImpl)newValue);
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
			case ModulePackage.CORE__PARTITION:
				getPartition().clear();
				return;
			case ModulePackage.CORE__CORE_ID:
				setCoreId(CORE_ID_EDEFAULT);
				return;
			case ModulePackage.CORE__IS_MASTER_CORE:
				setIsMasterCore(IS_MASTER_CORE_EDEFAULT);
				return;
			case ModulePackage.CORE__RTE_CORE_START_API_IMPL:
				setRteCoreStartApiImpl((RteCoreStartApiImpl)null);
				return;
			case ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL:
				setSchmCoreInitApiImpl((SchmCoreInitApiImpl)null);
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
			case ModulePackage.CORE__PARTITION:
				return partition != null && !partition.isEmpty();
			case ModulePackage.CORE__CORE_ID:
				return CORE_ID_EDEFAULT == null ? coreId != null : !CORE_ID_EDEFAULT.equals(coreId);
			case ModulePackage.CORE__IS_MASTER_CORE:
				return IS_MASTER_CORE_EDEFAULT == null ? isMasterCore != null : !IS_MASTER_CORE_EDEFAULT.equals(isMasterCore);
			case ModulePackage.CORE__RTE_CORE_START_API_IMPL:
				return rteCoreStartApiImpl != null;
			case ModulePackage.CORE__SCHM_CORE_INIT_API_IMPL:
				return schmCoreInitApiImpl != null;
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
		result.append(" (coreId: "); //$NON-NLS-1$
		result.append(coreId);
		result.append(", isMasterCore: "); //$NON-NLS-1$
		result.append(isMasterCore);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
