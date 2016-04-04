/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getIsAnonymous <em>Is Anonymous</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getSignedness <em>Signedness</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getOriginalTypeSymbolName <em>Original Type Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends ModuleReferrableImpl implements Type {
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
	 * The default value of the '{@link #getIsAnonymous() <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ANONYMOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAnonymous() <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnonymous()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAnonymous = IS_ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignedness() <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedness()
	 * @generated
	 * @ordered
	 */
	protected static final SignednessEnum SIGNEDNESS_EDEFAULT = SignednessEnum.SIGNED;

	/**
	 * The cached value of the '{@link #getSignedness() <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedness()
	 * @generated
	 * @ordered
	 */
	protected SignednessEnum signedness = SIGNEDNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalTypeSymbolName() <em>Original Type Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTypeSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalTypeSymbolName() <em>Original Type Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTypeSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String originalTypeSymbolName = ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__SYMBOL_NAME, oldSymbolName, symbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAnonymous() {
		return isAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAnonymous(Boolean newIsAnonymous) {
		Boolean oldIsAnonymous = isAnonymous;
		isAnonymous = newIsAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__IS_ANONYMOUS, oldIsAnonymous, isAnonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignednessEnum getSignedness() {
		return signedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedness(SignednessEnum newSignedness) {
		SignednessEnum oldSignedness = signedness;
		signedness = newSignedness == null ? SIGNEDNESS_EDEFAULT : newSignedness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__SIGNEDNESS, oldSignedness, signedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalTypeSymbolName() {
		return originalTypeSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalTypeSymbolName(String newOriginalTypeSymbolName) {
		String oldOriginalTypeSymbolName = originalTypeSymbolName;
		originalTypeSymbolName = newOriginalTypeSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME, oldOriginalTypeSymbolName, originalTypeSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TYPE__SYMBOL_NAME:
				return getSymbolName();
			case ModulePackage.TYPE__IS_ANONYMOUS:
				return getIsAnonymous();
			case ModulePackage.TYPE__SIGNEDNESS:
				return getSignedness();
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				return getOriginalTypeSymbolName();
			case ModulePackage.TYPE__SIZE:
				return getSize();
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
			case ModulePackage.TYPE__SYMBOL_NAME:
				setSymbolName((String)newValue);
				return;
			case ModulePackage.TYPE__IS_ANONYMOUS:
				setIsAnonymous((Boolean)newValue);
				return;
			case ModulePackage.TYPE__SIGNEDNESS:
				setSignedness((SignednessEnum)newValue);
				return;
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				setOriginalTypeSymbolName((String)newValue);
				return;
			case ModulePackage.TYPE__SIZE:
				setSize((Integer)newValue);
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
			case ModulePackage.TYPE__SYMBOL_NAME:
				setSymbolName(SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.TYPE__IS_ANONYMOUS:
				setIsAnonymous(IS_ANONYMOUS_EDEFAULT);
				return;
			case ModulePackage.TYPE__SIGNEDNESS:
				setSignedness(SIGNEDNESS_EDEFAULT);
				return;
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				setOriginalTypeSymbolName(ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT);
				return;
			case ModulePackage.TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case ModulePackage.TYPE__SYMBOL_NAME:
				return SYMBOL_NAME_EDEFAULT == null ? symbolName != null : !SYMBOL_NAME_EDEFAULT.equals(symbolName);
			case ModulePackage.TYPE__IS_ANONYMOUS:
				return IS_ANONYMOUS_EDEFAULT == null ? isAnonymous != null : !IS_ANONYMOUS_EDEFAULT.equals(isAnonymous);
			case ModulePackage.TYPE__SIGNEDNESS:
				return signedness != SIGNEDNESS_EDEFAULT;
			case ModulePackage.TYPE__ORIGINAL_TYPE_SYMBOL_NAME:
				return ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT == null ? originalTypeSymbolName != null : !ORIGINAL_TYPE_SYMBOL_NAME_EDEFAULT.equals(originalTypeSymbolName);
			case ModulePackage.TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(", isAnonymous: "); //$NON-NLS-1$
		result.append(isAnonymous);
		result.append(", signedness: "); //$NON-NLS-1$
		result.append(signedness);
		result.append(", originalTypeSymbolName: "); //$NON-NLS-1$
		result.append(originalTypeSymbolName);
		result.append(", size: "); //$NON-NLS-1$
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
