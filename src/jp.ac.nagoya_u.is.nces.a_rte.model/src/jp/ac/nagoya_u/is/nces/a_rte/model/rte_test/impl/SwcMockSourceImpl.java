/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc Mock Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockSourceImpl#getSwcName <em>Swc Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.SwcMockSourceImpl#getExecutableEntity <em>Executable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcMockSourceImpl extends SourceFileImpl implements SwcMockSource {
	/**
	 * The default value of the '{@link #getSwcName() <em>Swc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcName()
	 * @generated
	 * @ordered
	 */
	protected static final String SWC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwcName() <em>Swc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcName()
	 * @generated
	 * @ordered
	 */
	protected String swcName = SWC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutableEntity() <em>Executable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntity> executableEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcMockSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RteTestPackage.Literals.SWC_MOCK_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwcName() {
		return swcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwcName(String newSwcName) {
		String oldSwcName = swcName;
		swcName = newSwcName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.SWC_MOCK_SOURCE__SWC_NAME, oldSwcName, swcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntity> getExecutableEntity() {
		if (executableEntity == null) {
			executableEntity = new EObjectResolvingEList<ExecutableEntity>(ExecutableEntity.class, this, RteTestPackage.SWC_MOCK_SOURCE__EXECUTABLE_ENTITY);
		}
		return executableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RteTestPackage.SWC_MOCK_SOURCE__SWC_NAME:
				return getSwcName();
			case RteTestPackage.SWC_MOCK_SOURCE__EXECUTABLE_ENTITY:
				return getExecutableEntity();
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
			case RteTestPackage.SWC_MOCK_SOURCE__SWC_NAME:
				setSwcName((String)newValue);
				return;
			case RteTestPackage.SWC_MOCK_SOURCE__EXECUTABLE_ENTITY:
				getExecutableEntity().clear();
				getExecutableEntity().addAll((Collection<? extends ExecutableEntity>)newValue);
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
			case RteTestPackage.SWC_MOCK_SOURCE__SWC_NAME:
				setSwcName(SWC_NAME_EDEFAULT);
				return;
			case RteTestPackage.SWC_MOCK_SOURCE__EXECUTABLE_ENTITY:
				getExecutableEntity().clear();
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
			case RteTestPackage.SWC_MOCK_SOURCE__SWC_NAME:
				return SWC_NAME_EDEFAULT == null ? swcName != null : !SWC_NAME_EDEFAULT.equals(swcName);
			case RteTestPackage.SWC_MOCK_SOURCE__EXECUTABLE_ENTITY:
				return executableEntity != null && !executableEntity.isEmpty();
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
		result.append(" (swcName: ");
		result.append(swcName);
		result.append(')');
		return result.toString();
	}

} //SwcMockSourceImpl
