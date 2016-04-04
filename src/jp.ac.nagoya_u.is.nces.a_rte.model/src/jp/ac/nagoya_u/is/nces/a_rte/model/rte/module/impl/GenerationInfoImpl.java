/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl#getGeneratorName <em>Generator Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl#getGeneratorVersion <em>Generator Version</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl#getGenerationDate <em>Generation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenerationInfoImpl extends ModuleObjectImpl implements GenerationInfo {
	/**
	 * The default value of the '{@link #getGeneratorName() <em>Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorName() <em>Generator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorName()
	 * @generated
	 * @ordered
	 */
	protected String generatorName = GENERATOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratorVersion() <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorVersion() <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorVersion()
	 * @generated
	 * @ordered
	 */
	protected String generatorVersion = GENERATOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerationDate() <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationDate() <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDate()
	 * @generated
	 * @ordered
	 */
	protected String generationDate = GENERATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.GENERATION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorName() {
		return generatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorName(String newGeneratorName) {
		String oldGeneratorName = generatorName;
		generatorName = newGeneratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GENERATION_INFO__GENERATOR_NAME, oldGeneratorName, generatorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorVersion() {
		return generatorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorVersion(String newGeneratorVersion) {
		String oldGeneratorVersion = generatorVersion;
		generatorVersion = newGeneratorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GENERATION_INFO__GENERATOR_VERSION, oldGeneratorVersion, generatorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationDate() {
		return generationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationDate(String newGenerationDate) {
		String oldGenerationDate = generationDate;
		generationDate = newGenerationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GENERATION_INFO__GENERATION_DATE, oldGenerationDate, generationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.GENERATION_INFO__GENERATOR_NAME:
				return getGeneratorName();
			case ModulePackage.GENERATION_INFO__GENERATOR_VERSION:
				return getGeneratorVersion();
			case ModulePackage.GENERATION_INFO__GENERATION_DATE:
				return getGenerationDate();
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
			case ModulePackage.GENERATION_INFO__GENERATOR_NAME:
				setGeneratorName((String)newValue);
				return;
			case ModulePackage.GENERATION_INFO__GENERATOR_VERSION:
				setGeneratorVersion((String)newValue);
				return;
			case ModulePackage.GENERATION_INFO__GENERATION_DATE:
				setGenerationDate((String)newValue);
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
			case ModulePackage.GENERATION_INFO__GENERATOR_NAME:
				setGeneratorName(GENERATOR_NAME_EDEFAULT);
				return;
			case ModulePackage.GENERATION_INFO__GENERATOR_VERSION:
				setGeneratorVersion(GENERATOR_VERSION_EDEFAULT);
				return;
			case ModulePackage.GENERATION_INFO__GENERATION_DATE:
				setGenerationDate(GENERATION_DATE_EDEFAULT);
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
			case ModulePackage.GENERATION_INFO__GENERATOR_NAME:
				return GENERATOR_NAME_EDEFAULT == null ? generatorName != null : !GENERATOR_NAME_EDEFAULT.equals(generatorName);
			case ModulePackage.GENERATION_INFO__GENERATOR_VERSION:
				return GENERATOR_VERSION_EDEFAULT == null ? generatorVersion != null : !GENERATOR_VERSION_EDEFAULT.equals(generatorVersion);
			case ModulePackage.GENERATION_INFO__GENERATION_DATE:
				return GENERATION_DATE_EDEFAULT == null ? generationDate != null : !GENERATION_DATE_EDEFAULT.equals(generationDate);
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
		result.append(" (generatorName: "); //$NON-NLS-1$
		result.append(generatorName);
		result.append(", generatorVersion: "); //$NON-NLS-1$
		result.append(generatorVersion);
		result.append(", generationDate: "); //$NON-NLS-1$
		result.append(generationDate);
		result.append(')');
		return result.toString();
	}

} //GenerationInfoImpl
