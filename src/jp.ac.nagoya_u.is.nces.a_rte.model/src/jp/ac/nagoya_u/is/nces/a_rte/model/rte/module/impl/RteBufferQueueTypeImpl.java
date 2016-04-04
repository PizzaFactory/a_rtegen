/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Buffer Queue Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueueTypeImpl#getMaxLengthConstant <em>Max Length Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueueTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteBufferQueueTypeImpl extends TypeImpl implements RteBufferQueueType {
	/**
	 * The cached value of the '{@link #getMaxLengthConstant() <em>Max Length Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLengthConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant maxLengthConstant;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Type elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteBufferQueueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_BUFFER_QUEUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getMaxLengthConstant() {
		if (maxLengthConstant != null && ((EObject)maxLengthConstant).eIsProxy()) {
			InternalEObject oldMaxLengthConstant = (InternalEObject)maxLengthConstant;
			maxLengthConstant = (Constant)eResolveProxy(oldMaxLengthConstant);
			if (maxLengthConstant != oldMaxLengthConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT, oldMaxLengthConstant, maxLengthConstant));
			}
		}
		return maxLengthConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetMaxLengthConstant() {
		return maxLengthConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLengthConstant(Constant newMaxLengthConstant) {
		Constant oldMaxLengthConstant = maxLengthConstant;
		maxLengthConstant = newMaxLengthConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT, oldMaxLengthConstant, maxLengthConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getElementType() {
		if (elementType != null && ((EObject)elementType).eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (Type)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(Type newElementType) {
		Type oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT:
				if (resolve) return getMaxLengthConstant();
				return basicGetMaxLengthConstant();
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
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
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT:
				setMaxLengthConstant((Constant)newValue);
				return;
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE:
				setElementType((Type)newValue);
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
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT:
				setMaxLengthConstant((Constant)null);
				return;
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE:
				setElementType((Type)null);
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
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT:
				return maxLengthConstant != null;
			case ModulePackage.RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}

} //RteBufferQueueTypeImpl
