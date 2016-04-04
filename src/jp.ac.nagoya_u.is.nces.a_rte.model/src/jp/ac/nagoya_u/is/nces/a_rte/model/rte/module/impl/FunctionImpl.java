/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl#getParam <em>Param</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl#getLocalVariable <em>Local Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl#getLocalType <em>Local Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl#getSymbolName <em>Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionImpl extends ModuleReferrableImpl implements Function {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> param;

	/**
	 * The cached value of the '{@link #getLocalVariable() <em>Local Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> localVariable;

	/**
	 * The cached value of the '{@link #getLocalType() <em>Local Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> localType;

	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapping memoryMapping;

	/**
	 * The default value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String symbolName = SYMBOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		if (returnType != null && ((EObject)returnType).eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.FUNCTION__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.FUNCTION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<Parameter>(Parameter.class, this, ModulePackage.FUNCTION__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getLocalVariable() {
		if (localVariable == null) {
			localVariable = new EObjectContainmentWithInverseEList<LocalVariable>(LocalVariable.class, this, ModulePackage.FUNCTION__LOCAL_VARIABLE, ModulePackage.LOCAL_VARIABLE__PARENT);
		}
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getLocalType() {
		if (localType == null) {
			localType = new EObjectContainmentEList<Type>(Type.class, this, ModulePackage.FUNCTION__LOCAL_TYPE);
		}
		return localType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping getMemoryMapping() {
		if (memoryMapping != null && ((EObject)memoryMapping).eIsProxy()) {
			InternalEObject oldMemoryMapping = (InternalEObject)memoryMapping;
			memoryMapping = (MemoryMapping)eResolveProxy(oldMemoryMapping);
			if (memoryMapping != oldMemoryMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.FUNCTION__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
			}
		}
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping basicGetMemoryMapping() {
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapping(MemoryMapping newMemoryMapping) {
		MemoryMapping oldMemoryMapping = memoryMapping;
		memoryMapping = newMemoryMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.FUNCTION__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolName() {
		return symbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolName(String newSymbolName) {
		String oldSymbolName = symbolName;
		symbolName = newSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.FUNCTION__SYMBOL_NAME, oldSymbolName, symbolName));
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
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalVariable()).basicAdd(otherEnd, msgs);
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
			case ModulePackage.FUNCTION__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
				return ((InternalEList<?>)getLocalVariable()).basicRemove(otherEnd, msgs);
			case ModulePackage.FUNCTION__LOCAL_TYPE:
				return ((InternalEList<?>)getLocalType()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.FUNCTION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case ModulePackage.FUNCTION__PARAM:
				return getParam();
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
				return getLocalVariable();
			case ModulePackage.FUNCTION__LOCAL_TYPE:
				return getLocalType();
			case ModulePackage.FUNCTION__MEMORY_MAPPING:
				if (resolve) return getMemoryMapping();
				return basicGetMemoryMapping();
			case ModulePackage.FUNCTION__SYMBOL_NAME:
				return getSymbolName();
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
			case ModulePackage.FUNCTION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case ModulePackage.FUNCTION__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
				getLocalVariable().clear();
				getLocalVariable().addAll((Collection<? extends LocalVariable>)newValue);
				return;
			case ModulePackage.FUNCTION__LOCAL_TYPE:
				getLocalType().clear();
				getLocalType().addAll((Collection<? extends Type>)newValue);
				return;
			case ModulePackage.FUNCTION__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)newValue);
				return;
			case ModulePackage.FUNCTION__SYMBOL_NAME:
				setSymbolName((String)newValue);
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
			case ModulePackage.FUNCTION__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case ModulePackage.FUNCTION__PARAM:
				getParam().clear();
				return;
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
				getLocalVariable().clear();
				return;
			case ModulePackage.FUNCTION__LOCAL_TYPE:
				getLocalType().clear();
				return;
			case ModulePackage.FUNCTION__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)null);
				return;
			case ModulePackage.FUNCTION__SYMBOL_NAME:
				setSymbolName(SYMBOL_NAME_EDEFAULT);
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
			case ModulePackage.FUNCTION__RETURN_TYPE:
				return returnType != null;
			case ModulePackage.FUNCTION__PARAM:
				return param != null && !param.isEmpty();
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
				return localVariable != null && !localVariable.isEmpty();
			case ModulePackage.FUNCTION__LOCAL_TYPE:
				return localType != null && !localType.isEmpty();
			case ModulePackage.FUNCTION__MEMORY_MAPPING:
				return memoryMapping != null;
			case ModulePackage.FUNCTION__SYMBOL_NAME:
				return SYMBOL_NAME_EDEFAULT == null ? symbolName != null : !SYMBOL_NAME_EDEFAULT.equals(symbolName);
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
		result.append(" (symbolName: "); //$NON-NLS-1$
		result.append(symbolName);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
