/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getApiMappingName <em>Api Mapping Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getIsInline <em>Is Inline</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getInlineConstant <em>Inline Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getInlineGlobalVariable <em>Inline Global Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl#getInlineRunnableEntity <em>Inline Runnable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RteApiImpl extends FunctionImpl implements RteApi {
	/**
	 * The default value of the '{@link #getApiMappingName() <em>Api Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiMappingName()
	 * @generated
	 * @ordered
	 */
	protected static final String API_MAPPING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiMappingName() <em>Api Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiMappingName()
	 * @generated
	 * @ordered
	 */
	protected String apiMappingName = API_MAPPING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONNECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConnected()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConnected = IS_CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsInline() <em>Is Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInline()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInline() <em>Is Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInline()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInline = IS_INLINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected Value returnValue;

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
	 * The cached value of the '{@link #getInlineGlobalVariable() <em>Inline Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> inlineGlobalVariable;

	/**
	 * The cached value of the '{@link #getInlineRunnableEntity() <em>Inline Runnable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineRunnableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableEntity> inlineRunnableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swc getParent() {
		if (eContainerFeatureID() != ModulePackage.RTE_API__PARENT) return null;
		return (Swc)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Swc newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModulePackage.RTE_API__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Swc newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModulePackage.RTE_API__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModulePackage.SWC__RTE_API, Swc.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_API__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiMappingName() {
		return apiMappingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiMappingName(String newApiMappingName) {
		String oldApiMappingName = apiMappingName;
		apiMappingName = newApiMappingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_API__API_MAPPING_NAME, oldApiMappingName, apiMappingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConnected() {
		return isConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConnected(Boolean newIsConnected) {
		Boolean oldIsConnected = isConnected;
		isConnected = newIsConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_API__IS_CONNECTED, oldIsConnected, isConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInline() {
		return isInline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInline(Boolean newIsInline) {
		Boolean oldIsInline = isInline;
		isInline = newIsInline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_API__IS_INLINE, oldIsInline, isInline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getReturnValue() {
		if (returnValue != null && ((EObject)returnValue).eIsProxy()) {
			InternalEObject oldReturnValue = (InternalEObject)returnValue;
			returnValue = (Value)eResolveProxy(oldReturnValue);
			if (returnValue != oldReturnValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_API__RETURN_VALUE, oldReturnValue, returnValue));
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(Value newReturnValue) {
		Value oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_API__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getInlineConstant() {
		if (inlineConstant == null) {
			inlineConstant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_API__INLINE_CONSTANT);
		}
		return inlineConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getInlineGlobalVariable() {
		if (inlineGlobalVariable == null) {
			inlineGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.RTE_API__INLINE_GLOBAL_VARIABLE);
		}
		return inlineGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableEntity> getInlineRunnableEntity() {
		if (inlineRunnableEntity == null) {
			inlineRunnableEntity = new EObjectResolvingEList<RunnableEntity>(RunnableEntity.class, this, ModulePackage.RTE_API__INLINE_RUNNABLE_ENTITY);
		}
		return inlineRunnableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_API__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Swc)otherEnd, msgs);
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
			case ModulePackage.RTE_API__PARENT:
				return basicSetParent(null, msgs);
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
			case ModulePackage.RTE_API__PARENT:
				return eInternalContainer().eInverseRemove(this, ModulePackage.SWC__RTE_API, Swc.class, msgs);
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
			case ModulePackage.RTE_API__PARENT:
				return getParent();
			case ModulePackage.RTE_API__API_MAPPING_NAME:
				return getApiMappingName();
			case ModulePackage.RTE_API__IS_CONNECTED:
				return getIsConnected();
			case ModulePackage.RTE_API__IS_INLINE:
				return getIsInline();
			case ModulePackage.RTE_API__RETURN_VALUE:
				if (resolve) return getReturnValue();
				return basicGetReturnValue();
			case ModulePackage.RTE_API__INLINE_CONSTANT:
				return getInlineConstant();
			case ModulePackage.RTE_API__INLINE_GLOBAL_VARIABLE:
				return getInlineGlobalVariable();
			case ModulePackage.RTE_API__INLINE_RUNNABLE_ENTITY:
				return getInlineRunnableEntity();
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
			case ModulePackage.RTE_API__PARENT:
				setParent((Swc)newValue);
				return;
			case ModulePackage.RTE_API__API_MAPPING_NAME:
				setApiMappingName((String)newValue);
				return;
			case ModulePackage.RTE_API__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
				return;
			case ModulePackage.RTE_API__IS_INLINE:
				setIsInline((Boolean)newValue);
				return;
			case ModulePackage.RTE_API__RETURN_VALUE:
				setReturnValue((Value)newValue);
				return;
			case ModulePackage.RTE_API__INLINE_CONSTANT:
				getInlineConstant().clear();
				getInlineConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE_API__INLINE_GLOBAL_VARIABLE:
				getInlineGlobalVariable().clear();
				getInlineGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.RTE_API__INLINE_RUNNABLE_ENTITY:
				getInlineRunnableEntity().clear();
				getInlineRunnableEntity().addAll((Collection<? extends RunnableEntity>)newValue);
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
			case ModulePackage.RTE_API__PARENT:
				setParent((Swc)null);
				return;
			case ModulePackage.RTE_API__API_MAPPING_NAME:
				setApiMappingName(API_MAPPING_NAME_EDEFAULT);
				return;
			case ModulePackage.RTE_API__IS_CONNECTED:
				setIsConnected(IS_CONNECTED_EDEFAULT);
				return;
			case ModulePackage.RTE_API__IS_INLINE:
				setIsInline(IS_INLINE_EDEFAULT);
				return;
			case ModulePackage.RTE_API__RETURN_VALUE:
				setReturnValue((Value)null);
				return;
			case ModulePackage.RTE_API__INLINE_CONSTANT:
				getInlineConstant().clear();
				return;
			case ModulePackage.RTE_API__INLINE_GLOBAL_VARIABLE:
				getInlineGlobalVariable().clear();
				return;
			case ModulePackage.RTE_API__INLINE_RUNNABLE_ENTITY:
				getInlineRunnableEntity().clear();
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
			case ModulePackage.RTE_API__PARENT:
				return getParent() != null;
			case ModulePackage.RTE_API__API_MAPPING_NAME:
				return API_MAPPING_NAME_EDEFAULT == null ? apiMappingName != null : !API_MAPPING_NAME_EDEFAULT.equals(apiMappingName);
			case ModulePackage.RTE_API__IS_CONNECTED:
				return IS_CONNECTED_EDEFAULT == null ? isConnected != null : !IS_CONNECTED_EDEFAULT.equals(isConnected);
			case ModulePackage.RTE_API__IS_INLINE:
				return IS_INLINE_EDEFAULT == null ? isInline != null : !IS_INLINE_EDEFAULT.equals(isInline);
			case ModulePackage.RTE_API__RETURN_VALUE:
				return returnValue != null;
			case ModulePackage.RTE_API__INLINE_CONSTANT:
				return inlineConstant != null && !inlineConstant.isEmpty();
			case ModulePackage.RTE_API__INLINE_GLOBAL_VARIABLE:
				return inlineGlobalVariable != null && !inlineGlobalVariable.isEmpty();
			case ModulePackage.RTE_API__INLINE_RUNNABLE_ENTITY:
				return inlineRunnableEntity != null && !inlineRunnableEntity.isEmpty();
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
		result.append(" (apiMappingName: "); //$NON-NLS-1$
		result.append(apiMappingName);
		result.append(", isConnected: "); //$NON-NLS-1$
		result.append(isConnected);
		result.append(", isInline: "); //$NON-NLS-1$
		result.append(isInline);
		result.append(')');
		return result.toString();
	}

} //RteApiImpl
