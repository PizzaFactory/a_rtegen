/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tf Call Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfParamTypeName <em>Cs Tf Param Type Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfArgcConstantName <em>Cs Tf Argc Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfOpidConstantName <em>Cs Tf Opid Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getCsTfName <em>Cs Tf Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TfCallApiImpl#getNeedsCheckArg <em>Needs Check Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TfCallApiImpl extends CallApiImpl implements TfCallApi {
	/**
	 * The default value of the '{@link #getCsTfParamTypeName() <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_PARAM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfParamTypeName() <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfParamTypeName()
	 * @generated
	 * @ordered
	 */
	protected String csTfParamTypeName = CS_TF_PARAM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsTfArgcConstantName() <em>Cs Tf Argc Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfArgcConstantName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_ARGC_CONSTANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfArgcConstantName() <em>Cs Tf Argc Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfArgcConstantName()
	 * @generated
	 * @ordered
	 */
	protected String csTfArgcConstantName = CS_TF_ARGC_CONSTANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsTfOpidConstantName() <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_OPID_CONSTANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfOpidConstantName() <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 * @ordered
	 */
	protected String csTfOpidConstantName = CS_TF_OPID_CONSTANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsTfName() <em>Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfName() <em>Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfName()
	 * @generated
	 * @ordered
	 */
	protected String csTfName = CS_TF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedsCheckArg() <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCheckArg()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEEDS_CHECK_ARG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedsCheckArg() <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsCheckArg()
	 * @generated
	 * @ordered
	 */
	protected Boolean needsCheckArg = NEEDS_CHECK_ARG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TfCallApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TF_CALL_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfParamTypeName() {
		return csTfParamTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfParamTypeName(String newCsTfParamTypeName) {
		String oldCsTfParamTypeName = csTfParamTypeName;
		csTfParamTypeName = newCsTfParamTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME, oldCsTfParamTypeName, csTfParamTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfArgcConstantName() {
		return csTfArgcConstantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfArgcConstantName(String newCsTfArgcConstantName) {
		String oldCsTfArgcConstantName = csTfArgcConstantName;
		csTfArgcConstantName = newCsTfArgcConstantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME, oldCsTfArgcConstantName, csTfArgcConstantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfOpidConstantName() {
		return csTfOpidConstantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfOpidConstantName(String newCsTfOpidConstantName) {
		String oldCsTfOpidConstantName = csTfOpidConstantName;
		csTfOpidConstantName = newCsTfOpidConstantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME, oldCsTfOpidConstantName, csTfOpidConstantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfName() {
		return csTfName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfName(String newCsTfName) {
		String oldCsTfName = csTfName;
		csTfName = newCsTfName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__CS_TF_NAME, oldCsTfName, csTfName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNeedsCheckArg() {
		return needsCheckArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsCheckArg(Boolean newNeedsCheckArg) {
		Boolean oldNeedsCheckArg = needsCheckArg;
		needsCheckArg = newNeedsCheckArg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG, oldNeedsCheckArg, needsCheckArg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				return getCsTfParamTypeName();
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				return getCsTfArgcConstantName();
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				return getCsTfOpidConstantName();
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				return getCsTfName();
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				return getNeedsCheckArg();
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
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				setCsTfParamTypeName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				setCsTfArgcConstantName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				setCsTfOpidConstantName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				setCsTfName((String)newValue);
				return;
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				setNeedsCheckArg((Boolean)newValue);
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
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				setCsTfParamTypeName(CS_TF_PARAM_TYPE_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				setCsTfArgcConstantName(CS_TF_ARGC_CONSTANT_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				setCsTfOpidConstantName(CS_TF_OPID_CONSTANT_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				setCsTfName(CS_TF_NAME_EDEFAULT);
				return;
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				setNeedsCheckArg(NEEDS_CHECK_ARG_EDEFAULT);
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
			case ModulePackage.TF_CALL_API__CS_TF_PARAM_TYPE_NAME:
				return CS_TF_PARAM_TYPE_NAME_EDEFAULT == null ? csTfParamTypeName != null : !CS_TF_PARAM_TYPE_NAME_EDEFAULT.equals(csTfParamTypeName);
			case ModulePackage.TF_CALL_API__CS_TF_ARGC_CONSTANT_NAME:
				return CS_TF_ARGC_CONSTANT_NAME_EDEFAULT == null ? csTfArgcConstantName != null : !CS_TF_ARGC_CONSTANT_NAME_EDEFAULT.equals(csTfArgcConstantName);
			case ModulePackage.TF_CALL_API__CS_TF_OPID_CONSTANT_NAME:
				return CS_TF_OPID_CONSTANT_NAME_EDEFAULT == null ? csTfOpidConstantName != null : !CS_TF_OPID_CONSTANT_NAME_EDEFAULT.equals(csTfOpidConstantName);
			case ModulePackage.TF_CALL_API__CS_TF_NAME:
				return CS_TF_NAME_EDEFAULT == null ? csTfName != null : !CS_TF_NAME_EDEFAULT.equals(csTfName);
			case ModulePackage.TF_CALL_API__NEEDS_CHECK_ARG:
				return NEEDS_CHECK_ARG_EDEFAULT == null ? needsCheckArg != null : !NEEDS_CHECK_ARG_EDEFAULT.equals(needsCheckArg);
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
		result.append(" (csTfParamTypeName: "); //$NON-NLS-1$
		result.append(csTfParamTypeName);
		result.append(", csTfArgcConstantName: "); //$NON-NLS-1$
		result.append(csTfArgcConstantName);
		result.append(", csTfOpidConstantName: "); //$NON-NLS-1$
		result.append(csTfOpidConstantName);
		result.append(", csTfName: "); //$NON-NLS-1$
		result.append(csTfName);
		result.append(", needsCheckArg: "); //$NON-NLS-1$
		result.append(needsCheckArg);
		result.append(')');
		return result.toString();
	}

} //TfCallApiImpl
