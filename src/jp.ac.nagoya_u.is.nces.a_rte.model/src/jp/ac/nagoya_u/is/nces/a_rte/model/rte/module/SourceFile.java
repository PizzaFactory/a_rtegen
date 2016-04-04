/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile#getIncludeHeader <em>Include Header</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSourceFile()
 * @model abstract="true"
 * @generated
 */
public interface SourceFile extends File {
	/**
	 * Returns the value of the '<em><b>Include Header</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Header</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Header</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSourceFile_IncludeHeader()
	 * @model
	 * @generated
	 */
	EList<HeaderFile> getIncludeHeader();

} // SourceFile
