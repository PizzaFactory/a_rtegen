/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantMember;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantValueTypeEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getExternalSymbolName <em>External Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getValue <em>Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getConstantValueType <em>Constant Value Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getMember <em>Member</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl#getRepresentedVariableName <em>Represented Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantImpl extends ValueImpl implements Constant {
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
	 * The default value of the '{@link #getExternalSymbolName() <em>External Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalSymbolName() <em>External Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String externalSymbolName = EXTERNAL_SYMBOL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstantValueType() <em>Constant Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ConstantValueTypeEnum CONSTANT_VALUE_TYPE_EDEFAULT = ConstantValueTypeEnum.NUMERICAL_VALUE;

	/**
	 * The cached value of the '{@link #getConstantValueType() <em>Constant Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValueType()
	 * @generated
	 * @ordered
	 */
	protected ConstantValueTypeEnum constantValueType = CONSTANT_VALUE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstantMember> member;

	/**
	 * The default value of the '{@link #getRepresentedVariableName() <em>Represented Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTED_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentedVariableName() <em>Represented Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedVariableName()
	 * @generated
	 * @ordered
	 */
	protected String representedVariableName = REPRESENTED_VARIABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CONSTANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONSTANT__SYMBOL_NAME, oldSymbolName, symbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalSymbolName() {
		return externalSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalSymbolName(String newExternalSymbolName) {
		String oldExternalSymbolName = externalSymbolName;
		externalSymbolName = newExternalSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONSTANT__EXTERNAL_SYMBOL_NAME, oldExternalSymbolName, externalSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && ((EObject)type).eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.CONSTANT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONSTANT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONSTANT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantValueTypeEnum getConstantValueType() {
		return constantValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantValueType(ConstantValueTypeEnum newConstantValueType) {
		ConstantValueTypeEnum oldConstantValueType = constantValueType;
		constantValueType = newConstantValueType == null ? CONSTANT_VALUE_TYPE_EDEFAULT : newConstantValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONSTANT__CONSTANT_VALUE_TYPE, oldConstantValueType, constantValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstantMember> getMember() {
		if (member == null) {
			member = new EObjectContainmentWithInverseEList<ConstantMember>(ConstantMember.class, this, ModulePackage.CONSTANT__MEMBER, ModulePackage.CONSTANT_MEMBER__PARENT);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentedVariableName() {
		return representedVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedVariableName(String newRepresentedVariableName) {
		String oldRepresentedVariableName = representedVariableName;
		representedVariableName = newRepresentedVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CONSTANT__REPRESENTED_VARIABLE_NAME, oldRepresentedVariableName, representedVariableName));
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
			case ModulePackage.CONSTANT__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
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
			case ModulePackage.CONSTANT__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.CONSTANT__SYMBOL_NAME:
				return getSymbolName();
			case ModulePackage.CONSTANT__EXTERNAL_SYMBOL_NAME:
				return getExternalSymbolName();
			case ModulePackage.CONSTANT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ModulePackage.CONSTANT__VALUE:
				return getValue();
			case ModulePackage.CONSTANT__CONSTANT_VALUE_TYPE:
				return getConstantValueType();
			case ModulePackage.CONSTANT__MEMBER:
				return getMember();
			case ModulePackage.CONSTANT__REPRESENTED_VARIABLE_NAME:
				return getRepresentedVariableName();
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
			case ModulePackage.CONSTANT__SYMBOL_NAME:
				setSymbolName((String)newValue);
				return;
			case ModulePackage.CONSTANT__EXTERNAL_SYMBOL_NAME:
				setExternalSymbolName((String)newValue);
				return;
			case ModulePackage.CONSTANT__TYPE:
				setType((Type)newValue);
				return;
			case ModulePackage.CONSTANT__VALUE:
				setValue((String)newValue);
				return;
			case ModulePackage.CONSTANT__CONSTANT_VALUE_TYPE:
				setConstantValueType((ConstantValueTypeEnum)newValue);
				return;
			case ModulePackage.CONSTANT__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends ConstantMember>)newValue);
				return;
			case ModulePackage.CONSTANT__REPRESENTED_VARIABLE_NAME:
				setRepresentedVariableName((String)newValue);
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
			case ModulePackage.CONSTANT__SYMBOL_NAME:
				setSymbolName(SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.CONSTANT__EXTERNAL_SYMBOL_NAME:
				setExternalSymbolName(EXTERNAL_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.CONSTANT__TYPE:
				setType((Type)null);
				return;
			case ModulePackage.CONSTANT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModulePackage.CONSTANT__CONSTANT_VALUE_TYPE:
				setConstantValueType(CONSTANT_VALUE_TYPE_EDEFAULT);
				return;
			case ModulePackage.CONSTANT__MEMBER:
				getMember().clear();
				return;
			case ModulePackage.CONSTANT__REPRESENTED_VARIABLE_NAME:
				setRepresentedVariableName(REPRESENTED_VARIABLE_NAME_EDEFAULT);
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
			case ModulePackage.CONSTANT__SYMBOL_NAME:
				return SYMBOL_NAME_EDEFAULT == null ? symbolName != null : !SYMBOL_NAME_EDEFAULT.equals(symbolName);
			case ModulePackage.CONSTANT__EXTERNAL_SYMBOL_NAME:
				return EXTERNAL_SYMBOL_NAME_EDEFAULT == null ? externalSymbolName != null : !EXTERNAL_SYMBOL_NAME_EDEFAULT.equals(externalSymbolName);
			case ModulePackage.CONSTANT__TYPE:
				return type != null;
			case ModulePackage.CONSTANT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ModulePackage.CONSTANT__CONSTANT_VALUE_TYPE:
				return constantValueType != CONSTANT_VALUE_TYPE_EDEFAULT;
			case ModulePackage.CONSTANT__MEMBER:
				return member != null && !member.isEmpty();
			case ModulePackage.CONSTANT__REPRESENTED_VARIABLE_NAME:
				return REPRESENTED_VARIABLE_NAME_EDEFAULT == null ? representedVariableName != null : !REPRESENTED_VARIABLE_NAME_EDEFAULT.equals(representedVariableName);
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
		result.append(", externalSymbolName: "); //$NON-NLS-1$
		result.append(externalSymbolName);
		result.append(", value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", constantValueType: "); //$NON-NLS-1$
		result.append(constantValueType);
		result.append(", representedVariableName: "); //$NON-NLS-1$
		result.append(representedVariableName);
		result.append(')');
		return result.toString();
	}

} //ConstantImpl
