/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bswm Mock Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockSourceImpl#getExecutableEntity <em>Executable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.BswmMockSourceImpl#getBswmName <em>Bswm Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswmMockSourceImpl extends SourceFileImpl implements BswmMockSource {
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
	 * The default value of the '{@link #getBswmName() <em>Bswm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswmName()
	 * @generated
	 * @ordered
	 */
	protected static final String BSWM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBswmName() <em>Bswm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswmName()
	 * @generated
	 * @ordered
	 */
	protected String bswmName = BSWM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswmMockSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RteTestPackage.Literals.BSWM_MOCK_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntity> getExecutableEntity() {
		if (executableEntity == null) {
			executableEntity = new EObjectResolvingEList<ExecutableEntity>(ExecutableEntity.class, this, RteTestPackage.BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY);
		}
		return executableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBswmName() {
		return bswmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBswmName(String newBswmName) {
		String oldBswmName = bswmName;
		bswmName = newBswmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.BSWM_MOCK_SOURCE__BSWM_NAME, oldBswmName, bswmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RteTestPackage.BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY:
				return getExecutableEntity();
			case RteTestPackage.BSWM_MOCK_SOURCE__BSWM_NAME:
				return getBswmName();
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
			case RteTestPackage.BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY:
				getExecutableEntity().clear();
				getExecutableEntity().addAll((Collection<? extends ExecutableEntity>)newValue);
				return;
			case RteTestPackage.BSWM_MOCK_SOURCE__BSWM_NAME:
				setBswmName((String)newValue);
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
			case RteTestPackage.BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY:
				getExecutableEntity().clear();
				return;
			case RteTestPackage.BSWM_MOCK_SOURCE__BSWM_NAME:
				setBswmName(BSWM_NAME_EDEFAULT);
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
			case RteTestPackage.BSWM_MOCK_SOURCE__EXECUTABLE_ENTITY:
				return executableEntity != null && !executableEntity.isEmpty();
			case RteTestPackage.BSWM_MOCK_SOURCE__BSWM_NAME:
				return BSWM_NAME_EDEFAULT == null ? bswmName != null : !BSWM_NAME_EDEFAULT.equals(bswmName);
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
		result.append(" (bswmName: ");
		result.append(bswmName);
		result.append(')');
		return result.toString();
	}

} //BswmMockSourceImpl
