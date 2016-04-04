/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MemoryMappingImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MemoryMappingImpl#getMemorySectionSymbolName <em>Memory Section Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MemoryMappingImpl extends ModuleReferrableImpl implements MemoryMapping {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySectionSymbolName() <em>Memory Section Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySectionSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_SECTION_SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemorySectionSymbolName() <em>Memory Section Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySectionSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String memorySectionSymbolName = MEMORY_SECTION_SYMBOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.MEMORY_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MEMORY_MAPPING__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemorySectionSymbolName() {
		return memorySectionSymbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySectionSymbolName(String newMemorySectionSymbolName) {
		String oldMemorySectionSymbolName = memorySectionSymbolName;
		memorySectionSymbolName = newMemorySectionSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME, oldMemorySectionSymbolName, memorySectionSymbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.MEMORY_MAPPING__PREFIX:
				return getPrefix();
			case ModulePackage.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME:
				return getMemorySectionSymbolName();
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
			case ModulePackage.MEMORY_MAPPING__PREFIX:
				setPrefix((String)newValue);
				return;
			case ModulePackage.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME:
				setMemorySectionSymbolName((String)newValue);
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
			case ModulePackage.MEMORY_MAPPING__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case ModulePackage.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME:
				setMemorySectionSymbolName(MEMORY_SECTION_SYMBOL_NAME_EDEFAULT);
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
			case ModulePackage.MEMORY_MAPPING__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case ModulePackage.MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME:
				return MEMORY_SECTION_SYMBOL_NAME_EDEFAULT == null ? memorySectionSymbolName != null : !MEMORY_SECTION_SYMBOL_NAME_EDEFAULT.equals(memorySectionSymbolName);
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
		result.append(" (prefix: "); //$NON-NLS-1$
		result.append(prefix);
		result.append(", memorySectionSymbolName: "); //$NON-NLS-1$
		result.append(memorySectionSymbolName);
		result.append(')');
		return result.toString();
	}

} //MemoryMappingImpl
