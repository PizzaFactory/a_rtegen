/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferSendTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferSendSendOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusted Function Rte Buffer Send Send Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferSendSendOperationImpl#getAccessTrustedFunction <em>Access Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustedFunctionRteBufferSendSendOperationImpl extends TrustedFunctionRteOperationImpl implements TrustedFunctionRteBufferSendSendOperation {
	/**
	 * The cached value of the '{@link #getAccessTrustedFunction() <em>Access Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected RteBufferSendTrustedFunction accessTrustedFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustedFunctionRteBufferSendSendOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferSendTrustedFunction getAccessTrustedFunction() {
		if (accessTrustedFunction != null && ((EObject)accessTrustedFunction).eIsProxy()) {
			InternalEObject oldAccessTrustedFunction = (InternalEObject)accessTrustedFunction;
			accessTrustedFunction = (RteBufferSendTrustedFunction)eResolveProxy(oldAccessTrustedFunction);
			if (accessTrustedFunction != oldAccessTrustedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION, oldAccessTrustedFunction, accessTrustedFunction));
			}
		}
		return accessTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferSendTrustedFunction basicGetAccessTrustedFunction() {
		return accessTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTrustedFunction(RteBufferSendTrustedFunction newAccessTrustedFunction) {
		RteBufferSendTrustedFunction oldAccessTrustedFunction = accessTrustedFunction;
		accessTrustedFunction = newAccessTrustedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION, oldAccessTrustedFunction, accessTrustedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				if (resolve) return getAccessTrustedFunction();
				return basicGetAccessTrustedFunction();
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				setAccessTrustedFunction((RteBufferSendTrustedFunction)newValue);
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				setAccessTrustedFunction((RteBufferSendTrustedFunction)null);
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
			case ModulePackage.TRUSTED_FUNCTION_RTE_BUFFER_SEND_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION:
				return accessTrustedFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //TrustedFunctionRteBufferSendSendOperationImpl
