/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTest;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestRootImpl#getRteTestModule <em>Rte Test Module</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestRootImpl#getRteTest <em>Rte Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteTestRootImpl extends MinimalEObjectImpl.Container implements RteTestRoot {
	/**
	 * The cached value of the '{@link #getRteTestModule() <em>Rte Test Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteTestModule()
	 * @generated
	 * @ordered
	 */
	protected RteTestModule rteTestModule;

	/**
	 * The cached value of the '{@link #getRteTest() <em>Rte Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteTest()
	 * @generated
	 * @ordered
	 */
	protected RteTest rteTest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteTestRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RteTestPackage.Literals.RTE_TEST_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTestModule getRteTestModule() {
		return rteTestModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteTestModule(RteTestModule newRteTestModule, NotificationChain msgs) {
		RteTestModule oldRteTestModule = rteTestModule;
		rteTestModule = newRteTestModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE, oldRteTestModule, newRteTestModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteTestModule(RteTestModule newRteTestModule) {
		if (newRteTestModule != rteTestModule) {
			NotificationChain msgs = null;
			if (rteTestModule != null)
				msgs = ((InternalEObject)rteTestModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE, null, msgs);
			if (newRteTestModule != null)
				msgs = ((InternalEObject)newRteTestModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE, null, msgs);
			msgs = basicSetRteTestModule(newRteTestModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE, newRteTestModule, newRteTestModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteTest getRteTest() {
		return rteTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteTest(RteTest newRteTest, NotificationChain msgs) {
		RteTest oldRteTest = rteTest;
		rteTest = newRteTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_ROOT__RTE_TEST, oldRteTest, newRteTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteTest(RteTest newRteTest) {
		if (newRteTest != rteTest) {
			NotificationChain msgs = null;
			if (rteTest != null)
				msgs = ((InternalEObject)rteTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_ROOT__RTE_TEST, null, msgs);
			if (newRteTest != null)
				msgs = ((InternalEObject)newRteTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_ROOT__RTE_TEST, null, msgs);
			msgs = basicSetRteTest(newRteTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_ROOT__RTE_TEST, newRteTest, newRteTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE:
				return basicSetRteTestModule(null, msgs);
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST:
				return basicSetRteTest(null, msgs);
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
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE:
				return getRteTestModule();
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST:
				return getRteTest();
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
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE:
				setRteTestModule((RteTestModule)newValue);
				return;
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST:
				setRteTest((RteTest)newValue);
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
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE:
				setRteTestModule((RteTestModule)null);
				return;
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST:
				setRteTest((RteTest)null);
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
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST_MODULE:
				return rteTestModule != null;
			case RteTestPackage.RTE_TEST_ROOT__RTE_TEST:
				return rteTest != null;
		}
		return super.eIsSet(featureID);
	}

} //RteTestRootImpl
