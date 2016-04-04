/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl#getIncludeHeader <em>Include Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SourceFileImpl extends FileImpl implements SourceFile {
	/**
	 * The cached value of the '{@link #getIncludeHeader() <em>Include Header</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderFile> includeHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SOURCE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderFile> getIncludeHeader() {
		if (includeHeader == null) {
			includeHeader = new EObjectResolvingEList<HeaderFile>(HeaderFile.class, this, ModulePackage.SOURCE_FILE__INCLUDE_HEADER);
		}
		return includeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SOURCE_FILE__INCLUDE_HEADER:
				return getIncludeHeader();
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
			case ModulePackage.SOURCE_FILE__INCLUDE_HEADER:
				getIncludeHeader().clear();
				getIncludeHeader().addAll((Collection<? extends HeaderFile>)newValue);
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
			case ModulePackage.SOURCE_FILE__INCLUDE_HEADER:
				getIncludeHeader().clear();
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
			case ModulePackage.SOURCE_FILE__INCLUDE_HEADER:
				return includeHeader != null && !includeHeader.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceFileImpl
