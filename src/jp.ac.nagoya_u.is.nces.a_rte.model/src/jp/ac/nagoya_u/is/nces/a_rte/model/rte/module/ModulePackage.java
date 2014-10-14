/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "module";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/rte/module";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "module";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModulePackage eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleObjectImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleObject()
	 * @generated
	 */
	int MODULE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OBJECT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OBJECT__SINGLE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OBJECT__ROLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleReferrableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleReferrable()
	 * @generated
	 */
	int MODULE_REFERRABLE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERRABLE__SOURCE = MODULE_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERRABLE__SINGLE_SOURCE = MODULE_OBJECT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERRABLE__ROLE_NAME = MODULE_OBJECT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERRABLE__ID = MODULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERRABLE_FEATURE_COUNT = MODULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERRABLE_OPERATION_COUNT = MODULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SOURCE = MODULE_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SINGLE_SOURCE = MODULE_OBJECT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ROLE_NAME = MODULE_OBJECT__ROLE_NAME;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MODULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = MODULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = MODULE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_TYPE = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAM = MODULE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LOCAL_VARIABLE = MODULE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LOCAL_TYPE = MODULE_REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MEMORY_MAPPING = MODULE_REFERRABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SYMBOL_NAME = MODULE_REFERRABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl <em>Rte Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApi()
	 * @generated
	 */
	int RTE_API = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__API_MAPPING_NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__RETURN_VALUE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__IS_CONNECTED = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API__PARENT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rte Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rte Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.WriteApiImpl <em>Write Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.WriteApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getWriteApi()
	 * @generated
	 */
	int WRITE_API = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API__DATA_PARAM = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Write Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl <em>Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSendOperation()
	 * @generated
	 */
	int SEND_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__SEND_VALUE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__SEND_STATUS = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__EXCLUDE_OPERATION = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION__RETURN_VARIABLE = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl <em>Rte Buffer Nonqueued Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferNonqueuedSendOperation()
	 * @generated
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Buffer Nonqueued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Buffer Nonqueued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl <em>Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getReadOperation()
	 * @generated
	 */
	int READ_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__INVALID_VALUE_CONSTANT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__READ_VALUE_VARIABLE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__READ_STATUS_VARIABLE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION__EXCLUDE_OPERATION = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedReadOperationImpl <em>Rte Buffer Nonqueued Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferNonqueuedReadOperation()
	 * @generated
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__SOURCE = READ_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__SINGLE_SOURCE = READ_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__ROLE_NAME = READ_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__INVALID_VALUE_CONSTANT = READ_OPERATION__INVALID_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__READ_VALUE_VARIABLE = READ_OPERATION__READ_VALUE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__READ_STATUS_VARIABLE = READ_OPERATION__READ_STATUS_VARIABLE;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__EXCLUDE_OPERATION = READ_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Access Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION__ACCESS_VARIABLE = READ_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Buffer Nonqueued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION_FEATURE_COUNT = READ_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Buffer Nonqueued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_NONQUEUED_READ_OPERATION_OPERATION_COUNT = READ_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadApiImpl <em>Read Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getReadApi()
	 * @generated
	 */
	int READ_API = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API__DATA_PARAM = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Read Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Read Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl <em>Rte Buffer Variable Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferVariableSet()
	 * @generated
	 */
	int RTE_BUFFER_VARIABLE_SET = 9;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FileImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 14;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl <em>Rte Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteSource()
	 * @generated
	 */
	int RTE_SOURCE = 10;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 13;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl <em>Rte Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteModule()
	 * @generated
	 */
	int RTE_MODULE = 12;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 16;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LocalVariableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 17;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl <em>Rte Application Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApplicationHeader()
	 * @generated
	 */
	int RTE_APPLICATION_HEADER = 18;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCore()
	 * @generated
	 */
	int CORE = 21;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 22;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl <em>Swc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSwc()
	 * @generated
	 */
	int SWC = 23;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteHeaderImpl <em>Rte Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteHeader()
	 * @generated
	 */
	int RTE_HEADER = 24;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl <em>Rte Lifecycle Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteLifecycleHeader()
	 * @generated
	 */
	int RTE_LIFECYCLE_HEADER = 25;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationTypeHeaderImpl <em>Rte Application Type Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationTypeHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApplicationTypeHeader()
	 * @generated
	 */
	int RTE_APPLICATION_TYPE_HEADER = 26;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteVfbTraceHeaderImpl <em>Rte Vfb Trace Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteVfbTraceHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteVfbTraceHeader()
	 * @generated
	 */
	int RTE_VFB_TRACE_HEADER = 27;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteConfigurationHeaderImpl <em>Rte Configuration Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteConfigurationHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteConfigurationHeader()
	 * @generated
	 */
	int RTE_CONFIGURATION_HEADER = 28;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCallbackHeaderImpl <em>Rte Callback Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCallbackHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteCallbackHeader()
	 * @generated
	 */
	int RTE_CALLBACK_HEADER = 29;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl <em>Rte Type Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteTypeHeader()
	 * @generated
	 */
	int RTE_TYPE_HEADER = 30;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl <em>Invalidate Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInvalidateApi()
	 * @generated
	 */
	int INVALIDATE_API = 31;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedSendOperationImpl <em>Ioc Nonqueued Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocNonqueuedSendOperation()
	 * @generated
	 */
	int IOC_NONQUEUED_SEND_OPERATION = 32;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl <em>Com Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendOperation()
	 * @generated
	 */
	int COM_SEND_OPERATION = 45;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectComSendOperationImpl <em>Direct Com Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectComSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getDirectComSendOperation()
	 * @generated
	 */
	int DIRECT_COM_SEND_OPERATION = 33;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl <em>Trusted Function Com Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionComSendOperation()
	 * @generated
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION = 34;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedReadOperationImpl <em>Ioc Nonqueued Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocNonqueuedReadOperation()
	 * @generated
	 */
	int IOC_NONQUEUED_READ_OPERATION = 37;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReadOperationImpl <em>Com Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReadOperation()
	 * @generated
	 */
	int COM_READ_OPERATION = 38;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl <em>Ioc Nonqueued Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocNonqueuedCommunication()
	 * @generated
	 */
	int IOC_NONQUEUED_COMMUNICATION = 39;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocApiImpl <em>Ioc Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocApi()
	 * @generated
	 */
	int IOC_API = 97;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocWriteApiImpl <em>Ioc Write Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocWriteApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocWriteApi()
	 * @generated
	 */
	int IOC_WRITE_API = 40;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReadApiImpl <em>Ioc Read Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReadApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocReadApi()
	 * @generated
	 */
	int IOC_READ_API = 41;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComApiImpl <em>Com Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComApi()
	 * @generated
	 */
	int COM_API = 96;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalApiImpl <em>Com Send Signal Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalApi()
	 * @generated
	 */
	int COM_SEND_SIGNAL_API = 42;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveSignalApiImpl <em>Com Receive Signal Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveSignalApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReceiveSignalApi()
	 * @generated
	 */
	int COM_RECEIVE_SIGNAL_API = 43;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackImpl <em>Com Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComCallback()
	 * @generated
	 */
	int COM_CALLBACK = 46;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveCallbackImpl <em>Com Receive Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveCallbackImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReceiveCallback()
	 * @generated
	 */
	int COM_RECEIVE_CALLBACK = 44;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveTimeoutCallbackImpl <em>Com Receive Timeout Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveTimeoutCallbackImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReceiveTimeoutCallback()
	 * @generated
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK = 47;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvalidateCallbackImpl <em>Com Invalidate Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvalidateCallbackImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComInvalidateCallback()
	 * @generated
	 */
	int COM_INVALIDATE_CALLBACK = 48;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityImpl <em>Bsw Schedulable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswSchedulableEntity()
	 * @generated
	 */
	int BSW_SCHEDULABLE_ENTITY = 83;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateEntityImpl <em>Com Send Signal Immediate Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalImmediateEntity()
	 * @generated
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY = 49;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FilterOperationImpl <em>Filter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFilterOperation()
	 * @generated
	 */
	int FILTER_OPERATION = 51;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersMaskedOldFilterOperationImpl <em>Masked New Differs Masked Old Filter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersMaskedOldFilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMaskedNewDiffersMaskedOldFilterOperation()
	 * @generated
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION = 52;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersXFilterOperationImpl <em>Masked New Differs XFilter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersXFilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMaskedNewDiffersXFilterOperation()
	 * @generated
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION = 53;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsWithinFilterOperationImpl <em>New Is Within Filter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsWithinFilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getNewIsWithinFilterOperation()
	 * @generated
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION = 54;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsOutsideFilterOperationImpl <em>New Is Outside Filter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsOutsideFilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getNewIsOutsideFilterOperation()
	 * @generated
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION = 55;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewEqualsXFilterOperationImpl <em>Masked New Equals XFilter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewEqualsXFilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMaskedNewEqualsXFilterOperation()
	 * @generated
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION = 56;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl <em>One Every NFilter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOneEveryNFilterOperation()
	 * @generated
	 */
	int ONE_EVERY_NFILTER_OPERATION = 57;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiImpl <em>Rte Lifecycle Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteLifecycleApi()
	 * @generated
	 */
	int RTE_LIFECYCLE_API = 63;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RestartPartitionApiImpl <em>Restart Partition Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RestartPartitionApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRestartPartitionApi()
	 * @generated
	 */
	int RESTART_PARTITION_API = 60;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionRestartingApiImpl <em>Partition Restarting Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionRestartingApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartitionRestartingApi()
	 * @generated
	 */
	int PARTITION_RESTARTING_API = 61;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl <em>Send Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSendApi()
	 * @generated
	 */
	int SEND_API = 64;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl <em>Receive Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getReceiveApi()
	 * @generated
	 */
	int RECEIVE_API = 65;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedSendOperationImpl <em>Rte Buffer Queued Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueuedSendOperation()
	 * @generated
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION = 66;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedVariableImpl <em>Rte Buffer Queued Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedVariableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueuedVariable()
	 * @generated
	 */
	int RTE_BUFFER_QUEUED_VARIABLE = 67;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl <em>Ioc Queued Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedCommunication()
	 * @generated
	 */
	int IOC_QUEUED_COMMUNICATION = 69;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveApiImpl <em>Ioc Receive Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocReceiveApi()
	 * @generated
	 */
	int IOC_RECEIVE_API = 70;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendApiImpl <em>Ioc Send Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocSendApi()
	 * @generated
	 */
	int IOC_SEND_API = 71;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedSendOperationImpl <em>Ioc Queued Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedSendOperation()
	 * @generated
	 */
	int IOC_QUEUED_SEND_OPERATION = 72;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedReadOperationImpl <em>Ioc Queued Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedReadOperation()
	 * @generated
	 */
	int IOC_QUEUED_READ_OPERATION = 73;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallApiImpl <em>Call Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCallApi()
	 * @generated
	 */
	int CALL_API = 74;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExcludeOperationImpl <em>Exclude Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExcludeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExcludeOperation()
	 * @generated
	 */
	int EXCLUDE_OPERATION = 77;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.AllInterruptBlockExcludeOperationImpl <em>All Interrupt Block Exclude Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.AllInterruptBlockExcludeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getAllInterruptBlockExcludeOperation()
	 * @generated
	 */
	int ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION = 78;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsInterruptBlockExcludeOperationImpl <em>Os Interrupt Block Exclude Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsInterruptBlockExcludeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsInterruptBlockExcludeOperation()
	 * @generated
	 */
	int OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION = 79;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSpinlockExcludeOperationImpl <em>Os Spinlock Exclude Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSpinlockExcludeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsSpinlockExcludeOperation()
	 * @generated
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION = 80;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsResourceExcludeOperationImpl <em>Os Resource Exclude Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsResourceExcludeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsResourceExcludeOperation()
	 * @generated
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION = 81;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 82;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl <em>Context Activation Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getContextActivationOperation()
	 * @generated
	 */
	int CONTEXT_ACTIVATION_OPERATION = 90;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationOperationImpl <em>Os Task Activation Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsTaskActivationOperation()
	 * @generated
	 */
	int OS_TASK_ACTIVATION_OPERATION = 88;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetActivationOperationImpl <em>Os Event Set Activation Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetActivationOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsEventSetActivationOperation()
	 * @generated
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION = 89;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CycleCountupOperationImpl <em>Cycle Countup Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CycleCountupOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCycleCountupOperation()
	 * @generated
	 */
	int CYCLE_COUNTUP_OPERATION = 92;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyImpl <em>Task Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTaskBody()
	 * @generated
	 */
	int TASK_BODY = 94;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocEmptyQueueApiImpl <em>Ioc Empty Queue Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocEmptyQueueApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocEmptyQueueApi()
	 * @generated
	 */
	int IOC_EMPTY_QUEUE_API = 95;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl <em>Rte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRte()
	 * @generated
	 */
	int RTE = 98;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ValueImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 99;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = MODULE_REFERRABLE__ID;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 105;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SOURCE = VALUE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SINGLE_SOURCE = VALUE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ROLE_NAME = VALUE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MEMBER = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SYMBOL_NAME = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__SOURCE = VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__SINGLE_SOURCE = VARIABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ROLE_NAME = VARIABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__MEMBER = VARIABLE__MEMBER;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__SYMBOL_NAME = VARIABLE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Init Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__INIT_VALUE_CONSTANT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__MEMORY_MAPPING = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init At Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__INIT_AT_DEFINITION = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__SOURCE = GLOBAL_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__SINGLE_SOURCE = GLOBAL_VARIABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__ROLE_NAME = GLOBAL_VARIABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__ID = GLOBAL_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__TYPE = GLOBAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__MEMBER = GLOBAL_VARIABLE__MEMBER;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__SYMBOL_NAME = GLOBAL_VARIABLE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Init Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__INIT_VALUE_CONSTANT = GLOBAL_VARIABLE__INIT_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__MEMORY_MAPPING = GLOBAL_VARIABLE__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Init At Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__INIT_AT_DEFINITION = GLOBAL_VARIABLE__INIT_AT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Value Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE = GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Buffer Variable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Buffer Variable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_VARIABLE_SET_OPERATION_COUNT = GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 126;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = MODULE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_NAME = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GENERATION_INFO = MODULE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__SOURCE = FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__SINGLE_SOURCE = FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__ROLE_NAME = FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__GENERATION_INFO = FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__DEPENDENT_HEADERS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__SOURCE = SOURCE_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__SINGLE_SOURCE = SOURCE_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__ROLE_NAME = SOURCE_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__ID = SOURCE_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__FILE_NAME = SOURCE_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__GENERATION_INFO = SOURCE_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__DEPENDENT_HEADERS = SOURCE_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Global Variable Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__GLOBAL_VARIABLE_GROUP = SOURCE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bsw Schedulable Entity Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP = SOURCE_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rte Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__RTE_API_GROUP = SOURCE_FILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Lifecycle Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__RTE_LIFECYCLE_API_GROUP = SOURCE_FILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Body Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__TASK_BODY_GROUP = SOURCE_FILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Com Callback Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__COM_CALLBACK_GROUP = SOURCE_FILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trusted Function Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__TRUSTED_FUNCTION_GROUP = SOURCE_FILE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Macro</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__SOURCE_MACRO = SOURCE_FILE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Schm Lifecycle Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP = SOURCE_FILE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schm Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE__SCHM_API_GROUP = SOURCE_FILE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Rte Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE_FEATURE_COUNT = SOURCE_FILE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Rte Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_SOURCE_OPERATION_COUNT = SOURCE_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Common Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_COMMON_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Rte Partition Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_PARTITION_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Rte Application Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_APPLICATION_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Rte Application Type Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_APPLICATION_TYPE_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Rte Lifecycle Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_LIFECYCLE_HEADER = 4;

	/**
	 * The feature id for the '<em><b>Rte Callback Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_CALLBACK_HEADER = 5;

	/**
	 * The feature id for the '<em><b>Rte Configuration Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_CONFIGURATION_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Rte Vfb Trace Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_VFB_TRACE_HEADER = 7;

	/**
	 * The feature id for the '<em><b>Rte Type Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_TYPE_HEADER = 8;

	/**
	 * The feature id for the '<em><b>Rte Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_HEADER = 9;

	/**
	 * The feature id for the '<em><b>Rte Common Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_COMMON_HEADER = 10;

	/**
	 * The feature id for the '<em><b>Rte Partition Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_PARTITION_HEADER = 11;

	/**
	 * The feature id for the '<em><b>Rte Utility Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__RTE_UTILITY_HEADER = 12;

	/**
	 * The feature id for the '<em><b>Dependent Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__DEPENDENT_HEADER = 13;

	/**
	 * The feature id for the '<em><b>Bsw Memory Mapping Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__BSW_MEMORY_MAPPING_HEADER = 14;

	/**
	 * The feature id for the '<em><b>Swc Memory Mapping Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__SWC_MEMORY_MAPPING_HEADER = 15;

	/**
	 * The feature id for the '<em><b>Module Interlink Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__MODULE_INTERLINK_HEADER = 16;

	/**
	 * The feature id for the '<em><b>Module Interlink Type Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER = 17;

	/**
	 * The number of structural features of the '<em>Rte Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Rte Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_MODULE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SOURCE = VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SINGLE_SOURCE = VARIABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ROLE_NAME = VARIABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MEMBER = VARIABLE__MEMBER;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SYMBOL_NAME = VARIABLE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Pass Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PASS_TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = MODULE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SYMBOL_NAME = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_ANONYMOUS = MODULE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__SOURCE = VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__SINGLE_SOURCE = VARIABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__ROLE_NAME = VARIABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__MEMBER = VARIABLE__MEMBER;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__SYMBOL_NAME = VARIABLE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Init Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__INIT_VALUE_CONSTANT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__PARENT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.HeaderFileImpl <em>Header File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.HeaderFileImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getHeaderFile()
	 * @generated
	 */
	int HEADER_FILE = 125;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__SOURCE = FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__SINGLE_SOURCE = FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__ROLE_NAME = FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__GENERATION_INFO = FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__GUARD_NAME = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE__DEPENDENT_HEADERS = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Header File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Rte Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__RTE_API_GROUP = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__CONSTANT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP = HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rte Application Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rte Application Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LogicalCompartmentImpl <em>Logical Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LogicalCompartmentImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getLogicalCompartment()
	 * @generated
	 */
	int LOGICAL_COMPARTMENT = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT__ID = MODULE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT__COMPARTMENT_NAME = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPARTMENT_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__SOURCE = LOGICAL_COMPARTMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__SINGLE_SOURCE = LOGICAL_COMPARTMENT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__ROLE_NAME = LOGICAL_COMPARTMENT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__ID = LOGICAL_COMPARTMENT__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__COMPARTMENT_NAME = LOGICAL_COMPARTMENT__COMPARTMENT_NAME;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PARTITION = LOGICAL_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Start Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__RTE_START_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CORE_ID = LOGICAL_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Master Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__IS_MASTER_CORE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schm Init Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__SCHM_INIT_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = LOGICAL_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SOURCE = LOGICAL_COMPARTMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SINGLE_SOURCE = LOGICAL_COMPARTMENT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ROLE_NAME = LOGICAL_COMPARTMENT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = LOGICAL_COMPARTMENT__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__COMPARTMENT_NAME = LOGICAL_COMPARTMENT__COMPARTMENT_NAME;

	/**
	 * The feature id for the '<em><b>Is Bsw Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__IS_BSW_PARTITION = LOGICAL_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARENT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SWC = LOGICAL_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rte Buffer Variable Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__RTE_BUFFER_VARIABLE_SET = LOGICAL_COMPARTMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filter Old Value Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__FILTER_OLD_VALUE_VARIABLE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filter Occurrence Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__FILTER_OCCURRENCE_VARIABLE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Restart Partition Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__RESTART_PARTITION_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Partition Terminated Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITION_TERMINATED_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Partition Restarting Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITION_RESTARTING_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Task Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TASK_BODY = LOGICAL_COMPARTMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rte Buffer Queued Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__RTE_BUFFER_QUEUED_VARIABLE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rte Buffer Init Value Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Entity Start Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ENTITY_START_VARIABLE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Entity Start Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ENTITY_START_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Filter Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__FILTER_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rte Buffer Send Trusted Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION = LOGICAL_COMPARTMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Os Trusted Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__OS_TRUSTED_MACRO = LOGICAL_COMPARTMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Parted Bswm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTED_BSWM = LOGICAL_COMPARTMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = LOGICAL_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SOURCE = LOGICAL_COMPARTMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SINGLE_SOURCE = LOGICAL_COMPARTMENT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__ROLE_NAME = LOGICAL_COMPARTMENT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__ID = LOGICAL_COMPARTMENT__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__COMPARTMENT_NAME = LOGICAL_COMPARTMENT__COMPARTMENT_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__PARENT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Api</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__RTE_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Init Value Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__API_INIT_VALUE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Api Application Error Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__API_APPLICATION_ERROR_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Api Enum Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__API_ENUM_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Api Upper Lower Limit Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__API_UPPER_LOWER_LIMIT_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filter Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__FILTER_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port Arg Value Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__PORT_ARG_VALUE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dependent Executable Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__DEPENDENT_EXECUTABLE_ENTITY = LOGICAL_COMPARTMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__INVALID_VALUE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Impl Init Value Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__IMPL_INIT_VALUE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Swc Memory Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SWC_MEMORY_MAPPING = LOGICAL_COMPARTMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_FEATURE_COUNT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Swc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_OPERATION_COUNT = LOGICAL_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The number of structural features of the '<em>Rte Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Rte Lifecycle Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schm Lifecycle Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Lifecycle Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Lifecycle Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER__CONSTANT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Application Type Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Application Type Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_APPLICATION_TYPE_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The number of structural features of the '<em>Rte Vfb Trace Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Vfb Trace Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_VFB_TRACE_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The number of structural features of the '<em>Rte Configuration Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Configuration Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CONFIGURATION_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Com Callback Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Callback Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Callback Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CALLBACK_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Rte Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__RTE_TYPE = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rte Type Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER__RTE_TYPE_CONSTANT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Type Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Type Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invalidate Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Invalidate Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATE_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION__ACCESS_API = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Nonqueued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Nonqueued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION__ACCESS_API = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__SOURCE = COM_SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__SINGLE_SOURCE = COM_SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__ROLE_NAME = COM_SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__SEND_VALUE = COM_SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__SEND_STATUS = COM_SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__EXCLUDE_OPERATION = COM_SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__RETURN_VARIABLE = COM_SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION__ACCESS_API = COM_SEND_OPERATION__ACCESS_API;

	/**
	 * The number of structural features of the '<em>Direct Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION_FEATURE_COUNT = COM_SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COM_SEND_OPERATION_OPERATION_COUNT = COM_SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__SOURCE = COM_SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__SINGLE_SOURCE = COM_SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__ROLE_NAME = COM_SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__SEND_VALUE = COM_SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__SEND_STATUS = COM_SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__EXCLUDE_OPERATION = COM_SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__RETURN_VARIABLE = COM_SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_API = COM_SEND_OPERATION__ACCESS_API;

	/**
	 * The feature id for the '<em><b>Access Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION = COM_SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trusted Function Param Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE = COM_SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trusted Function Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION_FEATURE_COUNT = COM_SEND_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trusted Function Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_COM_SEND_OPERATION_OPERATION_COUNT = COM_SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl <em>Proxy Com Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getProxyComSendOperation()
	 * @generated
	 */
	int PROXY_COM_SEND_OPERATION = 119;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__SOURCE = COM_SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__SINGLE_SOURCE = COM_SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__ROLE_NAME = COM_SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__SEND_VALUE = COM_SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__SEND_STATUS = COM_SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__EXCLUDE_OPERATION = COM_SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__RETURN_VARIABLE = COM_SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__ACCESS_API = COM_SEND_OPERATION__ACCESS_API;

	/**
	 * The feature id for the '<em><b>Access Proxy Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION__ACCESS_PROXY_API = COM_SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION_FEATURE_COUNT = COM_SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proxy Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_COM_SEND_OPERATION_OPERATION_COUNT = COM_SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ImmediateProxyComSendOperationImpl <em>Immediate Proxy Com Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ImmediateProxyComSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getImmediateProxyComSendOperation()
	 * @generated
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION = 35;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__SOURCE = PROXY_COM_SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__SINGLE_SOURCE = PROXY_COM_SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__ROLE_NAME = PROXY_COM_SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__SEND_VALUE = PROXY_COM_SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__SEND_STATUS = PROXY_COM_SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__EXCLUDE_OPERATION = PROXY_COM_SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__RETURN_VARIABLE = PROXY_COM_SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__ACCESS_API = PROXY_COM_SEND_OPERATION__ACCESS_API;

	/**
	 * The feature id for the '<em><b>Access Proxy Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__ACCESS_PROXY_API = PROXY_COM_SEND_OPERATION__ACCESS_PROXY_API;

	/**
	 * The feature id for the '<em><b>Activation Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API = PROXY_COM_SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Proxy Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION_FEATURE_COUNT = PROXY_COM_SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Immediate Proxy Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_PROXY_COM_SEND_OPERATION_OPERATION_COUNT = PROXY_COM_SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PeriodicProxyComSendOperationImpl <em>Periodic Proxy Com Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PeriodicProxyComSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPeriodicProxyComSendOperation()
	 * @generated
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION = 36;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__SOURCE = PROXY_COM_SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__SINGLE_SOURCE = PROXY_COM_SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__ROLE_NAME = PROXY_COM_SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__SEND_VALUE = PROXY_COM_SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__SEND_STATUS = PROXY_COM_SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__EXCLUDE_OPERATION = PROXY_COM_SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__RETURN_VARIABLE = PROXY_COM_SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__ACCESS_API = PROXY_COM_SEND_OPERATION__ACCESS_API;

	/**
	 * The feature id for the '<em><b>Access Proxy Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION__ACCESS_PROXY_API = PROXY_COM_SEND_OPERATION__ACCESS_PROXY_API;

	/**
	 * The number of structural features of the '<em>Periodic Proxy Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION_FEATURE_COUNT = PROXY_COM_SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Proxy Com Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PROXY_COM_SEND_OPERATION_OPERATION_COUNT = PROXY_COM_SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__SOURCE = READ_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__SINGLE_SOURCE = READ_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__ROLE_NAME = READ_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__INVALID_VALUE_CONSTANT = READ_OPERATION__INVALID_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__READ_VALUE_VARIABLE = READ_OPERATION__READ_VALUE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__READ_STATUS_VARIABLE = READ_OPERATION__READ_STATUS_VARIABLE;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__EXCLUDE_OPERATION = READ_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION__ACCESS_API = READ_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Nonqueued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION_FEATURE_COUNT = READ_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Nonqueued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_READ_OPERATION_OPERATION_COUNT = READ_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__SOURCE = READ_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__SINGLE_SOURCE = READ_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__ROLE_NAME = READ_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__INVALID_VALUE_CONSTANT = READ_OPERATION__INVALID_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__READ_VALUE_VARIABLE = READ_OPERATION__READ_VALUE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__READ_STATUS_VARIABLE = READ_OPERATION__READ_STATUS_VARIABLE;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__EXCLUDE_OPERATION = READ_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION__ACCESS_API = READ_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION_FEATURE_COUNT = READ_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_READ_OPERATION_OPERATION_COUNT = READ_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocCommunicationImpl <em>Ioc Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocCommunicationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocCommunication()
	 * @generated
	 */
	int IOC_COMMUNICATION = 118;

	/**
	 * The number of structural features of the '<em>Ioc Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_COMMUNICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ioc Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Write Api</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_COMMUNICATION__WRITE_API = IOC_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_COMMUNICATION__READ_API = IOC_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_COMMUNICATION__INIT_VALUE = IOC_COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ioc Nonqueued Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_COMMUNICATION_FEATURE_COUNT = IOC_COMMUNICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ioc Nonqueued Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_NONQUEUED_COMMUNICATION_OPERATION_COUNT = IOC_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API__PARENT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Write Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Write Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_WRITE_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Read Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Read Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_READ_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Com Signal Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API__COM_SIGNAL_SYMBOL_NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__SOURCE = COM_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__SINGLE_SOURCE = COM_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__ROLE_NAME = COM_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__ID = COM_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__RETURN_TYPE = COM_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__PARAM = COM_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__LOCAL_VARIABLE = COM_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__LOCAL_TYPE = COM_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__MEMORY_MAPPING = COM_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__SYMBOL_NAME = COM_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Com Signal Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API__COM_SIGNAL_SYMBOL_NAME = COM_API__COM_SIGNAL_SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Com Send Signal Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API_FEATURE_COUNT = COM_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Send Signal Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_API_OPERATION_COUNT = COM_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__SOURCE = COM_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__SINGLE_SOURCE = COM_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__ROLE_NAME = COM_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__ID = COM_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__RETURN_TYPE = COM_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__PARAM = COM_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__LOCAL_VARIABLE = COM_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__LOCAL_TYPE = COM_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__MEMORY_MAPPING = COM_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__SYMBOL_NAME = COM_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Com Signal Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API__COM_SIGNAL_SYMBOL_NAME = COM_API__COM_SIGNAL_SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Com Receive Signal Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API_FEATURE_COUNT = COM_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Receive Signal Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_SIGNAL_API_OPERATION_COUNT = COM_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Com Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__SOURCE = COM_CALLBACK__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__SINGLE_SOURCE = COM_CALLBACK__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__ROLE_NAME = COM_CALLBACK__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__ID = COM_CALLBACK__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__RETURN_TYPE = COM_CALLBACK__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__PARAM = COM_CALLBACK__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__LOCAL_VARIABLE = COM_CALLBACK__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__LOCAL_TYPE = COM_CALLBACK__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__MEMORY_MAPPING = COM_CALLBACK__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__SYMBOL_NAME = COM_CALLBACK__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__OPERATION = COM_CALLBACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__DATA_VARIABLE = COM_CALLBACK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK__ACCESS_API = COM_CALLBACK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Com Receive Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK_FEATURE_COUNT = COM_CALLBACK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Com Receive Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_CALLBACK_OPERATION_COUNT = COM_CALLBACK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__SOURCE = COM_CALLBACK__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__SINGLE_SOURCE = COM_CALLBACK__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__ROLE_NAME = COM_CALLBACK__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__ID = COM_CALLBACK__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__RETURN_TYPE = COM_CALLBACK__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__PARAM = COM_CALLBACK__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__LOCAL_VARIABLE = COM_CALLBACK__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__LOCAL_TYPE = COM_CALLBACK__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__MEMORY_MAPPING = COM_CALLBACK__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__SYMBOL_NAME = COM_CALLBACK__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__OPERATION = COM_CALLBACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__DATA_VARIABLE = COM_CALLBACK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK__ACCESS_API = COM_CALLBACK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Com Receive Timeout Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK_FEATURE_COUNT = COM_CALLBACK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Com Receive Timeout Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RECEIVE_TIMEOUT_CALLBACK_OPERATION_COUNT = COM_CALLBACK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__SOURCE = COM_CALLBACK__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__SINGLE_SOURCE = COM_CALLBACK__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__ROLE_NAME = COM_CALLBACK__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__ID = COM_CALLBACK__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__RETURN_TYPE = COM_CALLBACK__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__PARAM = COM_CALLBACK__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__LOCAL_VARIABLE = COM_CALLBACK__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__LOCAL_TYPE = COM_CALLBACK__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__MEMORY_MAPPING = COM_CALLBACK__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__SYMBOL_NAME = COM_CALLBACK__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__OPERATION = COM_CALLBACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK__FILTER_RESULT_VARIABLE = COM_CALLBACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Invalidate Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK_FEATURE_COUNT = COM_CALLBACK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Invalidate Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INVALIDATE_CALLBACK_OPERATION_COUNT = COM_CALLBACK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Bsw Schedulable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bsw Schedulable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__SOURCE = BSW_SCHEDULABLE_ENTITY__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__SINGLE_SOURCE = BSW_SCHEDULABLE_ENTITY__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__ROLE_NAME = BSW_SCHEDULABLE_ENTITY__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__ID = BSW_SCHEDULABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__RETURN_TYPE = BSW_SCHEDULABLE_ENTITY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__PARAM = BSW_SCHEDULABLE_ENTITY__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__LOCAL_VARIABLE = BSW_SCHEDULABLE_ENTITY__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__LOCAL_TYPE = BSW_SCHEDULABLE_ENTITY__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__MEMORY_MAPPING = BSW_SCHEDULABLE_ENTITY__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__SYMBOL_NAME = BSW_SCHEDULABLE_ENTITY__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY__OPERATION = BSW_SCHEDULABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Send Signal Immediate Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY_FEATURE_COUNT = BSW_SCHEDULABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Send Signal Immediate Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_ENTITY_OPERATION_COUNT = BSW_SCHEDULABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalPeriodicEntityImpl <em>Com Send Signal Periodic Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalPeriodicEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalPeriodicEntity()
	 * @generated
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY = 50;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__SOURCE = BSW_SCHEDULABLE_ENTITY__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__SINGLE_SOURCE = BSW_SCHEDULABLE_ENTITY__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__ROLE_NAME = BSW_SCHEDULABLE_ENTITY__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__ID = BSW_SCHEDULABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__RETURN_TYPE = BSW_SCHEDULABLE_ENTITY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__PARAM = BSW_SCHEDULABLE_ENTITY__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__LOCAL_VARIABLE = BSW_SCHEDULABLE_ENTITY__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__LOCAL_TYPE = BSW_SCHEDULABLE_ENTITY__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__MEMORY_MAPPING = BSW_SCHEDULABLE_ENTITY__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__SYMBOL_NAME = BSW_SCHEDULABLE_ENTITY__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY__OPERATION = BSW_SCHEDULABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Send Signal Periodic Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY_FEATURE_COUNT = BSW_SCHEDULABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Send Signal Periodic Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_PERIODIC_ENTITY_OPERATION_COUNT = BSW_SCHEDULABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION__FILTER_RESULT_VARIABLE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__SOURCE = FILTER_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__SINGLE_SOURCE = FILTER_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__ROLE_NAME = FILTER_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__FILTER_RESULT_VARIABLE = FILTER_OPERATION__FILTER_RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Old Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE = FILTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK = FILTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Masked New Differs Masked Old Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION_FEATURE_COUNT = FILTER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Masked New Differs Masked Old Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION_OPERATION_COUNT = FILTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION__SOURCE = FILTER_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION__SINGLE_SOURCE = FILTER_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION__ROLE_NAME = FILTER_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION__FILTER_RESULT_VARIABLE = FILTER_OPERATION__FILTER_RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK = FILTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION__X = FILTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Masked New Differs XFilter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION_FEATURE_COUNT = FILTER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Masked New Differs XFilter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_DIFFERS_XFILTER_OPERATION_OPERATION_COUNT = FILTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION__SOURCE = FILTER_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION__SINGLE_SOURCE = FILTER_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION__ROLE_NAME = FILTER_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION__FILTER_RESULT_VARIABLE = FILTER_OPERATION__FILTER_RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION__MIN = FILTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION__MAX = FILTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Is Within Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION_FEATURE_COUNT = FILTER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>New Is Within Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_WITHIN_FILTER_OPERATION_OPERATION_COUNT = FILTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION__SOURCE = FILTER_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION__SINGLE_SOURCE = FILTER_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION__ROLE_NAME = FILTER_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION__FILTER_RESULT_VARIABLE = FILTER_OPERATION__FILTER_RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION__MIN = FILTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION__MAX = FILTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Is Outside Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION_FEATURE_COUNT = FILTER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>New Is Outside Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_IS_OUTSIDE_FILTER_OPERATION_OPERATION_COUNT = FILTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION__SOURCE = FILTER_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION__SINGLE_SOURCE = FILTER_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION__ROLE_NAME = FILTER_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION__FILTER_RESULT_VARIABLE = FILTER_OPERATION__FILTER_RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION__MASK = FILTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION__X = FILTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Masked New Equals XFilter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION_FEATURE_COUNT = FILTER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Masked New Equals XFilter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKED_NEW_EQUALS_XFILTER_OPERATION_OPERATION_COUNT = FILTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__SOURCE = FILTER_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__SINGLE_SOURCE = FILTER_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__ROLE_NAME = FILTER_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__FILTER_RESULT_VARIABLE = FILTER_OPERATION__FILTER_RESULT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Occurrence Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE = FILTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__PERIOD = FILTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION__OFFSET = FILTER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>One Every NFilter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION_FEATURE_COUNT = FILTER_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>One Every NFilter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_EVERY_NFILTER_OPERATION_OPERATION_COUNT = FILTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Rte Lifecycle Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Lifecycle Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCoreStartApiImplImpl <em>Rte Core Start Api Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCoreStartApiImplImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteCoreStartApiImpl()
	 * @generated
	 */
	int RTE_CORE_START_API_IMPL = 58;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__OPERATION = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL__PARENT = RTE_LIFECYCLE_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Core Start Api Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Core Start Api Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_CORE_START_API_IMPL_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStopApiImpl <em>Rte Stop Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStopApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteStopApi()
	 * @generated
	 */
	int RTE_STOP_API = 59;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Rte Stop Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Stop Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_STOP_API_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__EREFERENCE0 = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__EREFERENCE1 = RTE_LIFECYCLE_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API__OPERATION = RTE_LIFECYCLE_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Restart Partition Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Restart Partition Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_PARTITION_API_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API__OPERATION = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partition Restarting Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partition Restarting Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RESTARTING_API_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionTerminatedApiImpl <em>Partition Terminated Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionTerminatedApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartitionTerminatedApi()
	 * @generated
	 */
	int PARTITION_TERMINATED_API = 62;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API__OPERATION = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partition Terminated Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partition Terminated Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_TERMINATED_API_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__DATA_PARAM = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__STATUS_VARIABLE = RTE_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trusted Function Param Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE = RTE_API_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API__FILTER_RESULT_VARIABLE = RTE_API_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Send Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Send Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__DATA_PARAM = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API__STATUS_VARIABLE = RTE_API_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Receive Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Receive Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__ACCESS_VARIABLE = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temp Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Buffer Queued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Buffer Queued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__SOURCE = GLOBAL_VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__SINGLE_SOURCE = GLOBAL_VARIABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__ROLE_NAME = GLOBAL_VARIABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__ID = GLOBAL_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__TYPE = GLOBAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__MEMBER = GLOBAL_VARIABLE__MEMBER;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__SYMBOL_NAME = GLOBAL_VARIABLE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Init Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__INIT_VALUE_CONSTANT = GLOBAL_VARIABLE__INIT_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__MEMORY_MAPPING = GLOBAL_VARIABLE__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Init At Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__INIT_AT_DEFINITION = GLOBAL_VARIABLE__INIT_AT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Queue Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE__QUEUE_TYPE = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Buffer Queued Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Buffer Queued Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_VARIABLE_OPERATION_COUNT = GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedReadOperationImpl <em>Rte Buffer Queued Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueuedReadOperation()
	 * @generated
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION = 68;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__SOURCE = READ_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__SINGLE_SOURCE = READ_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__ROLE_NAME = READ_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__INVALID_VALUE_CONSTANT = READ_OPERATION__INVALID_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__READ_VALUE_VARIABLE = READ_OPERATION__READ_VALUE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__READ_STATUS_VARIABLE = READ_OPERATION__READ_STATUS_VARIABLE;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__EXCLUDE_OPERATION = READ_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Access Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION__ACCESS_VARIABLE = READ_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Buffer Queued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION_FEATURE_COUNT = READ_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Buffer Queued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUED_READ_OPERATION_OPERATION_COUNT = READ_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Api</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_COMMUNICATION__SEND_API = IOC_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_COMMUNICATION__RECEIVE_API = IOC_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ioc Empty Queue Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API = IOC_COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ioc Queued Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_COMMUNICATION_FEATURE_COUNT = IOC_COMMUNICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ioc Queued Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_COMMUNICATION_OPERATION_COUNT = IOC_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Receive Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Receive Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Send Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Send Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION__ACCESS_API = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Queued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Queued Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__SOURCE = READ_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__SINGLE_SOURCE = READ_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__ROLE_NAME = READ_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__INVALID_VALUE_CONSTANT = READ_OPERATION__INVALID_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__READ_VALUE_VARIABLE = READ_OPERATION__READ_VALUE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__READ_STATUS_VARIABLE = READ_OPERATION__READ_STATUS_VARIABLE;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__EXCLUDE_OPERATION = READ_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION__ACCESS_API = READ_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Queued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION_FEATURE_COUNT = READ_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Queued Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_READ_OPERATION_OPERATION_COUNT = READ_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Param</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__OPERATION_PARAM = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Arg Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__PORT_ARG_VALUE = RTE_API_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API__RETURN_VARIABLE = RTE_API_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Call Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Call Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableStartOperationImpl <em>Executable Start Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableStartOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExecutableStartOperation()
	 * @generated
	 */
	int EXECUTABLE_START_OPERATION = 75;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION__START_EXECUTABLE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Start Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Executable Start Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_START_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityImpl <em>Executable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExecutableEntity()
	 * @generated
	 */
	int EXECUTABLE_ENTITY = 76;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Role Param</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__ROLE_PARAM = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Parted Bswm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY__PARENT_PARTED_BSWM = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Executable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The number of structural features of the '<em>Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION__SOURCE = EXCLUDE_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION__SINGLE_SOURCE = EXCLUDE_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION__ROLE_NAME = EXCLUDE_OPERATION__ROLE_NAME;

	/**
	 * The number of structural features of the '<em>All Interrupt Block Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION_FEATURE_COUNT = EXCLUDE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All Interrupt Block Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION_OPERATION_COUNT = EXCLUDE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION__SOURCE = EXCLUDE_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION__SINGLE_SOURCE = EXCLUDE_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION__ROLE_NAME = EXCLUDE_OPERATION__ROLE_NAME;

	/**
	 * The number of structural features of the '<em>Os Interrupt Block Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION_FEATURE_COUNT = EXCLUDE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Interrupt Block Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION_OPERATION_COUNT = EXCLUDE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION__SOURCE = EXCLUDE_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION__SINGLE_SOURCE = EXCLUDE_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION__ROLE_NAME = EXCLUDE_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Os Spinlock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID = EXCLUDE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Spinlock Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION_FEATURE_COUNT = EXCLUDE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Spinlock Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SPINLOCK_EXCLUDE_OPERATION_OPERATION_COUNT = EXCLUDE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION__SOURCE = EXCLUDE_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION__SINGLE_SOURCE = EXCLUDE_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION__ROLE_NAME = EXCLUDE_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Os Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID = EXCLUDE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Resource Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION_FEATURE_COUNT = EXCLUDE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Resource Exclude Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_RESOURCE_EXCLUDE_OPERATION_OPERATION_COUNT = EXCLUDE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SOURCE = VALUE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SINGLE_SOURCE = VALUE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ROLE_NAME = VALUE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SYMBOL_NAME = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__CONSTANT_TYPE = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteEnterApiImpl <em>Rte Enter Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteEnterApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteEnterApi()
	 * @generated
	 */
	int RTE_ENTER_API = 84;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Enter Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Enter Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_ENTER_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteExitApiImpl <em>Rte Exit Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteExitApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteExitApi()
	 * @generated
	 */
	int RTE_EXIT_API = 85;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__SOURCE = RTE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__SINGLE_SOURCE = RTE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__ROLE_NAME = RTE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__ID = RTE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__RETURN_TYPE = RTE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__PARAM = RTE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__LOCAL_VARIABLE = RTE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__LOCAL_TYPE = RTE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__MEMORY_MAPPING = RTE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__SYMBOL_NAME = RTE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Api Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__API_MAPPING_NAME = RTE_API__API_MAPPING_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__RETURN_VALUE = RTE_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__IS_CONNECTED = RTE_API__IS_CONNECTED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__PARENT = RTE_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API__OPERATION = RTE_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Exit Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API_FEATURE_COUNT = RTE_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Exit Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_EXIT_API_OPERATION_COUNT = RTE_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY__OS_TASK_ID = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationExecutableTaskBodyImpl <em>Os Task Activation Executable Task Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationExecutableTaskBodyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsTaskActivationExecutableTaskBody()
	 * @generated
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY = 86;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__SOURCE = TASK_BODY__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__SINGLE_SOURCE = TASK_BODY__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__ROLE_NAME = TASK_BODY__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__ID = TASK_BODY__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__RETURN_TYPE = TASK_BODY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__PARAM = TASK_BODY__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__LOCAL_VARIABLE = TASK_BODY__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__LOCAL_TYPE = TASK_BODY__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__MEMORY_MAPPING = TASK_BODY__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__SYMBOL_NAME = TASK_BODY__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__OS_TASK_ID = TASK_BODY__OS_TASK_ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__OPERATION = TASK_BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Task Activation Executable Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY_FEATURE_COUNT = TASK_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Task Activation Executable Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY_OPERATION_COUNT = TASK_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl <em>Os Event Set Executable Task Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsEventSetExecutableTaskBody()
	 * @generated
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY = 87;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__SOURCE = TASK_BODY__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__SINGLE_SOURCE = TASK_BODY__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__ROLE_NAME = TASK_BODY__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__ID = TASK_BODY__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__RETURN_TYPE = TASK_BODY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__PARAM = TASK_BODY__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__LOCAL_VARIABLE = TASK_BODY__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__LOCAL_TYPE = TASK_BODY__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__MEMORY_MAPPING = TASK_BODY__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__SYMBOL_NAME = TASK_BODY__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_TASK_ID = TASK_BODY__OS_TASK_ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION = TASK_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Event Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID = TASK_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Checks Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID = TASK_BODY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE = TASK_BODY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Os Event Set Executable Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY_FEATURE_COUNT = TASK_BODY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Os Event Set Executable Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_EXECUTABLE_TASK_BODY_OPERATION_COUNT = TASK_BODY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Executable Start Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cycle Countup Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Offset Countup Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context Activation Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Context Activation Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTIVATION_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION__SOURCE = CONTEXT_ACTIVATION_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION__SINGLE_SOURCE = CONTEXT_ACTIVATION_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION__ROLE_NAME = CONTEXT_ACTIVATION_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Executable Start Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION = CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION;

	/**
	 * The feature id for the '<em><b>Cycle Countup Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION = CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION;

	/**
	 * The feature id for the '<em><b>Start Offset Countup Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION = CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION;

	/**
	 * The number of structural features of the '<em>Os Task Activation Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION_FEATURE_COUNT = CONTEXT_ACTIVATION_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Task Activation Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_ACTIVATION_OPERATION_OPERATION_COUNT = CONTEXT_ACTIVATION_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__SOURCE = CONTEXT_ACTIVATION_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__SINGLE_SOURCE = CONTEXT_ACTIVATION_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__ROLE_NAME = CONTEXT_ACTIVATION_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Executable Start Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION = CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION;

	/**
	 * The feature id for the '<em><b>Cycle Countup Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION = CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION;

	/**
	 * The feature id for the '<em><b>Start Offset Countup Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION = CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION;

	/**
	 * The feature id for the '<em><b>Activation Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID = CONTEXT_ACTIVATION_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Event Set Activation Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION_FEATURE_COUNT = CONTEXT_ACTIVATION_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Os Event Set Activation Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_SET_ACTIVATION_OPERATION_OPERATION_COUNT = CONTEXT_ACTIVATION_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl <em>Timing Triggering Executable Start Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTimingTriggeringExecutableStartOperation()
	 * @generated
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION = 91;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_EXECUTABLE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycle Period Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cycle Offset Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Offset Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Offset Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE = OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cycle Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE = OPERATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Timing Triggering Executable Start Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Timing Triggering Executable Start Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TRIGGERING_EXECUTABLE_START_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION__MAX_CONSTANT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cycle Countup Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cycle Countup Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_COUNTUP_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.StartOffsetCountupOperationImpl <em>Start Offset Countup Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.StartOffsetCountupOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getStartOffsetCountupOperation()
	 * @generated
	 */
	int START_OFFSET_COUNTUP_OPERATION = 93;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Offset Countup Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Offset Countup Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OFFSET_COUNTUP_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Empty Queue Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Empty Queue Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_EMPTY_QUEUE_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__SOURCE = LOGICAL_COMPARTMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__SINGLE_SOURCE = LOGICAL_COMPARTMENT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__ROLE_NAME = LOGICAL_COMPARTMENT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__ID = LOGICAL_COMPARTMENT__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__COMPARTMENT_NAME = LOGICAL_COMPARTMENT__COMPARTMENT_NAME;

	/**
	 * The feature id for the '<em><b>Core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__CORE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Callback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__COM_CALLBACK = LOGICAL_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Com Send Signal Periodic Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY = LOGICAL_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Com Send Signal Immediate Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY = LOGICAL_COMPARTMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Com Send Signal Trusted Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION = LOGICAL_COMPARTMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependent Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__DEPENDENT_TYPE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rte Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_TYPE = LOGICAL_COMPARTMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dependent Os Api</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__DEPENDENT_OS_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dependent Ioc Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__DEPENDENT_IOC_COMMUNICATION = LOGICAL_COMPARTMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dependent Com Api</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__DEPENDENT_COM_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rte Start Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_START_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ioc Init Value Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__IOC_INIT_VALUE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dependent Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__DEPENDENT_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Com Send Signal Immediate Task Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY = LOGICAL_COMPARTMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rte Stop Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_STOP_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rte Type Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_TYPE_CONSTANT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rte Memory Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__RTE_MEMORY_MAPPING = LOGICAL_COMPARTMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__GENERATION_INFO = LOGICAL_COMPARTMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Bswm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__BSWM = LOGICAL_COMPARTMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Schm Init Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__SCHM_INIT_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Schm Deinit Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE__SCHM_DEINIT_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Rte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_FEATURE_COUNT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Rte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_OPERATION_COUNT = LOGICAL_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionImpl <em>Trusted Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunction()
	 * @generated
	 */
	int TRUSTED_FUNCTION = 100;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Trusted Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalTrustedFunctionImpl <em>Com Send Signal Trusted Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalTrustedFunctionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalTrustedFunction()
	 * @generated
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION = 101;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__SOURCE = TRUSTED_FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__SINGLE_SOURCE = TRUSTED_FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__ROLE_NAME = TRUSTED_FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__ID = TRUSTED_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__RETURN_TYPE = TRUSTED_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__PARAM = TRUSTED_FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__LOCAL_VARIABLE = TRUSTED_FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__LOCAL_TYPE = TRUSTED_FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__MEMORY_MAPPING = TRUSTED_FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__SYMBOL_NAME = TRUSTED_FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Trusted Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX = TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX;

	/**
	 * The number of structural features of the '<em>Com Send Signal Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION_FEATURE_COUNT = TRUSTED_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Send Signal Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_TRUSTED_FUNCTION_OPERATION_COUNT = TRUSTED_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsApiImpl <em>Os Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsApi()
	 * @generated
	 */
	int OS_API = 103;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Os Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSetEventApiImpl <em>Os Set Event Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSetEventApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsSetEventApi()
	 * @generated
	 */
	int OS_SET_EVENT_API = 102;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__SOURCE = OS_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__SINGLE_SOURCE = OS_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__ROLE_NAME = OS_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__ID = OS_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__RETURN_TYPE = OS_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__PARAM = OS_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__LOCAL_VARIABLE = OS_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__LOCAL_TYPE = OS_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__MEMORY_MAPPING = OS_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__SYMBOL_NAME = OS_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__OS_TASK_ID = OS_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API__OS_EVENT_ID = OS_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Set Event Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API_FEATURE_COUNT = OS_API_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os Set Event Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SET_EVENT_API_OPERATION_COUNT = OS_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl <em>Com Send Signal Immediate Task Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalImmediateTaskBody()
	 * @generated
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY = 104;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__SOURCE = TASK_BODY__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__SINGLE_SOURCE = TASK_BODY__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__ROLE_NAME = TASK_BODY__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__ID = TASK_BODY__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__RETURN_TYPE = TASK_BODY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__PARAM = TASK_BODY__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__LOCAL_VARIABLE = TASK_BODY__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__LOCAL_TYPE = TASK_BODY__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__MEMORY_MAPPING = TASK_BODY__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__SYMBOL_NAME = TASK_BODY__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_TASK_ID = TASK_BODY__OS_TASK_ID;

	/**
	 * The feature id for the '<em><b>Start Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY = TASK_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID = TASK_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Send Signal Immediate Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY_FEATURE_COUNT = TASK_BODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Send Signal Immediate Task Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY_OPERATION_COUNT = TASK_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendProxyOperationImpl <em>Com Send Proxy Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendProxyOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendProxyOperation()
	 * @generated
	 */
	int COM_SEND_PROXY_OPERATION = 106;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION__SINGLE_SOURCE = OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION__ROLE_NAME = OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION__ACCESS_API = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Id Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Com Send Proxy Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Com Send Proxy Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_PROXY_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveGroupApiImpl <em>Ioc Receive Group Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveGroupApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocReceiveGroupApi()
	 * @generated
	 */
	int IOC_RECEIVE_GROUP_API = 107;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Receive Group Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Receive Group Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_RECEIVE_GROUP_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleRootImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleRoot()
	 * @generated
	 */
	int MODULE_ROOT = 108;

	/**
	 * The feature id for the '<em><b>Rte Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROOT__RTE_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Rte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROOT__RTE = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InterPartitionTimeoutOperationImpl <em>Inter Partition Timeout Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InterPartitionTimeoutOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInterPartitionTimeoutOperation()
	 * @generated
	 */
	int INTER_PARTITION_TIMEOUT_OPERATION = 109;

	/**
	 * The feature id for the '<em><b>Timeout Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PARTITION_TIMEOUT_OPERATION__TIMEOUT_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PARTITION_TIMEOUT_OPERATION__EXCLUDE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Inter Partition Timeout Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PARTITION_TIMEOUT_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inter Partition Timeout Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PARTITION_TIMEOUT_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InitializeOperationImpl <em>Initialize Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InitializeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInitializeOperation()
	 * @generated
	 */
	int INITIALIZE_OPERATION = 110;

	/**
	 * The number of structural features of the '<em>Initialize Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Initialize Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableInitializeOperationImpl <em>Variable Initialize Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableInitializeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVariableInitializeOperation()
	 * @generated
	 */
	int VARIABLE_INITIALIZE_OPERATION = 111;

	/**
	 * The feature id for the '<em><b>Init Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZE_OPERATION__INIT_VARIABLE = INITIALIZE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZE_OPERATION__EXCLUDE_OPERATION = INITIALIZE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Initialize Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZE_OPERATION_FEATURE_COUNT = INITIALIZE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Initialize Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIALIZE_OPERATION_OPERATION_COUNT = INITIALIZE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocInitializeOperationImpl <em>Ioc Initialize Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocInitializeOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocInitializeOperation()
	 * @generated
	 */
	int IOC_INITIALIZE_OPERATION = 112;

	/**
	 * The feature id for the '<em><b>Init Ioc Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_INITIALIZE_OPERATION__INIT_IOC_API = INITIALIZE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ioc Initialize Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_INITIALIZE_OPERATION_FEATURE_COUNT = INITIALIZE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ioc Initialize Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_INITIALIZE_OPERATION_OPERATION_COUNT = INITIALIZE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSuspendAllInterruptsApiImpl <em>Os Suspend All Interrupts Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSuspendAllInterruptsApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsSuspendAllInterruptsApi()
	 * @generated
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API = 113;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__SOURCE = OS_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__SINGLE_SOURCE = OS_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__ROLE_NAME = OS_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__ID = OS_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__RETURN_TYPE = OS_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__PARAM = OS_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__LOCAL_VARIABLE = OS_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__LOCAL_TYPE = OS_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__MEMORY_MAPPING = OS_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API__SYMBOL_NAME = OS_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Os Suspend All Interrupts Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API_FEATURE_COUNT = OS_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Suspend All Interrupts Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_SUSPEND_ALL_INTERRUPTS_API_OPERATION_COUNT = OS_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsGetSpinlockApiImpl <em>Os Get Spinlock Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsGetSpinlockApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsGetSpinlockApi()
	 * @generated
	 */
	int OS_GET_SPINLOCK_API = 114;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__SOURCE = OS_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__SINGLE_SOURCE = OS_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__ROLE_NAME = OS_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__ID = OS_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__RETURN_TYPE = OS_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__PARAM = OS_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__LOCAL_VARIABLE = OS_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__LOCAL_TYPE = OS_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__MEMORY_MAPPING = OS_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API__SYMBOL_NAME = OS_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Os Get Spinlock Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API_FEATURE_COUNT = OS_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os Get Spinlock Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GET_SPINLOCK_API_OPERATION_COUNT = OS_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreRteStartApiImpl <em>Multicore Rte Start Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreRteStartApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMulticoreRteStartApi()
	 * @generated
	 */
	int MULTICORE_RTE_START_API = 115;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Core Start Api Impl</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API__CORE_START_API_IMPL = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multicore Rte Start Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multicore Rte Start Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_RTE_START_API_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferWriteTrustedFunctionImpl <em>Rte Buffer Write Trusted Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferWriteTrustedFunctionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferWriteTrustedFunction()
	 * @generated
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION = 116;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__SOURCE = TRUSTED_FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__SINGLE_SOURCE = TRUSTED_FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__ROLE_NAME = TRUSTED_FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__ID = TRUSTED_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__RETURN_TYPE = TRUSTED_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__PARAM = TRUSTED_FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__LOCAL_VARIABLE = TRUSTED_FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__LOCAL_TYPE = TRUSTED_FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__MEMORY_MAPPING = TRUSTED_FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__SYMBOL_NAME = TRUSTED_FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Trusted Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX = TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__OPERATION = TRUSTED_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION__DATA_VARIABLE = TRUSTED_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Buffer Write Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION_FEATURE_COUNT = TRUSTED_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Buffer Write Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_WRITE_TRUSTED_FUNCTION_OPERATION_COUNT = TRUSTED_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferWriteSendOperationImpl <em>Trusted Function Rte Buffer Write Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferWriteSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionRteBufferWriteSendOperation()
	 * @generated
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION = 117;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trusted Function Rte Buffer Write Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trusted Function Rte Buffer Write Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendGroupApiImpl <em>Ioc Send Group Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendGroupApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocSendGroupApi()
	 * @generated
	 */
	int IOC_SEND_GROUP_API = 120;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__SOURCE = IOC_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__SINGLE_SOURCE = IOC_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__ROLE_NAME = IOC_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__ID = IOC_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__RETURN_TYPE = IOC_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__PARAM = IOC_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__LOCAL_VARIABLE = IOC_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__LOCAL_TYPE = IOC_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__MEMORY_MAPPING = IOC_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API__SYMBOL_NAME = IOC_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Ioc Send Group Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API_FEATURE_COUNT = IOC_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ioc Send Group Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_SEND_GROUP_API_OPERATION_COUNT = IOC_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl <em>Ioc Queued Group Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedGroupCommunication()
	 * @generated
	 */
	int IOC_QUEUED_GROUP_COMMUNICATION = 121;

	/**
	 * The feature id for the '<em><b>Receive Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API = IOC_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_GROUP_COMMUNICATION__SEND_API = IOC_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ioc Queued Group Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_GROUP_COMMUNICATION_FEATURE_COUNT = IOC_COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ioc Queued Group Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_QUEUED_GROUP_COMMUNICATION_OPERATION_COUNT = IOC_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectExecutableStartOperationImpl <em>Direct Executable Start Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectExecutableStartOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getDirectExecutableStartOperation()
	 * @generated
	 */
	int DIRECT_EXECUTABLE_START_OPERATION = 122;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION__SOURCE = EXECUTABLE_START_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION__SINGLE_SOURCE = EXECUTABLE_START_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION__ROLE_NAME = EXECUTABLE_START_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION = EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Start Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION__START_EXECUTABLE = EXECUTABLE_START_OPERATION__START_EXECUTABLE;

	/**
	 * The number of structural features of the '<em>Direct Executable Start Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION_FEATURE_COUNT = EXECUTABLE_START_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Executable Start Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_EXECUTABLE_START_OPERATION_OPERATION_COUNT = EXECUTABLE_START_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStartApiImpl <em>Rte Start Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStartApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteStartApi()
	 * @generated
	 */
	int RTE_START_API = 124;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__SOURCE = RTE_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__SINGLE_SOURCE = RTE_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__ROLE_NAME = RTE_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__ID = RTE_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__RETURN_TYPE = RTE_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__PARAM = RTE_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__LOCAL_VARIABLE = RTE_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__LOCAL_TYPE = RTE_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__MEMORY_MAPPING = RTE_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API__SYMBOL_NAME = RTE_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Rte Start Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API_FEATURE_COUNT = RTE_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Start Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_START_API_OPERATION_COUNT = RTE_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreRteStartApiImpl <em>Singlecore Rte Start Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreRteStartApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSinglecoreRteStartApi()
	 * @generated
	 */
	int SINGLECORE_RTE_START_API = 123;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__SOURCE = RTE_START_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__SINGLE_SOURCE = RTE_START_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__ROLE_NAME = RTE_START_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__ID = RTE_START_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__RETURN_TYPE = RTE_START_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__PARAM = RTE_START_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__LOCAL_VARIABLE = RTE_START_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__LOCAL_TYPE = RTE_START_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__MEMORY_MAPPING = RTE_START_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__SYMBOL_NAME = RTE_START_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API__OPERATION = RTE_START_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singlecore Rte Start Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API_FEATURE_COUNT = RTE_START_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Singlecore Rte Start Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_RTE_START_API_OPERATION_COUNT = RTE_START_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl <em>Rte Internal Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteInternalHeader()
	 * @generated
	 */
	int RTE_INTERNAL_HEADER = 127;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__CONSTANT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Variable Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trusted Function Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP = HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bsw Schedulable Entity Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP = HEADER_FILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rte Core Start Api Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL = HEADER_FILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP = HEADER_FILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schm Core Init Api Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL = HEADER_FILE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rte Internal Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Rte Internal Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INTERNAL_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 128;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SINGLE_SOURCE = TYPE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ROLE_NAME = TYPE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SYMBOL_NAME = TYPE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_ANONYMOUS = TYPE__IS_ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Original Type Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ORIGINAL_TYPE_SYMBOL_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signedness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SIGNEDNESS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 129;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__SINGLE_SOURCE = TYPE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ROLE_NAME = TYPE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__SYMBOL_NAME = TYPE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__IS_ANONYMOUS = TYPE__IS_ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__MEMBER = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxTypeImpl <em>Blackbox Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBlackboxType()
	 * @generated
	 */
	int BLACKBOX_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE__SINGLE_SOURCE = TYPE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE__ROLE_NAME = TYPE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE__SYMBOL_NAME = TYPE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE__IS_ANONYMOUS = TYPE__IS_ANONYMOUS;

	/**
	 * The number of structural features of the '<em>Blackbox Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackbox Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionMemberImpl <em>Union Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionMemberImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getUnionMember()
	 * @generated
	 */
	int UNION_MEMBER = 131;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__MEMBER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Union Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Union Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableMemberImpl <em>Variable Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableMemberImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVariableMember()
	 * @generated
	 */
	int VARIABLE_MEMBER = 132;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__SOURCE = VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__SINGLE_SOURCE = VARIABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__ROLE_NAME = VARIABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__MEMBER = VARIABLE__MEMBER;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__SYMBOL_NAME = VARIABLE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER__PARENT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MEMBER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteUtilityHeaderImpl <em>Rte Utility Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteUtilityHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteUtilityHeader()
	 * @generated
	 */
	int RTE_UTILITY_HEADER = 133;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The number of structural features of the '<em>Rte Utility Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rte Utility Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_UTILITY_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxHeaderImpl <em>Blackbox Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBlackboxHeader()
	 * @generated
	 */
	int BLACKBOX_HEADER = 134;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The number of structural features of the '<em>Blackbox Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackbox Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueueTypeImpl <em>Rte Buffer Queue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueueTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueueType()
	 * @generated
	 */
	int RTE_BUFFER_QUEUE_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__SOURCE = BLACKBOX_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__SINGLE_SOURCE = BLACKBOX_TYPE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__ROLE_NAME = BLACKBOX_TYPE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__ID = BLACKBOX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__SYMBOL_NAME = BLACKBOX_TYPE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__IS_ANONYMOUS = BLACKBOX_TYPE__IS_ANONYMOUS;

	/**
	 * The feature id for the '<em><b>Max Length Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT = BLACKBOX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE = BLACKBOX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rte Buffer Queue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE_FEATURE_COUNT = BLACKBOX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rte Buffer Queue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_QUEUE_TYPE_OPERATION_COUNT = BLACKBOX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendTrustedFunctionParamTypeImpl <em>Com Send Trusted Function Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendTrustedFunctionParamTypeImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendTrustedFunctionParamType()
	 * @generated
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE = 136;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__SOURCE = BLACKBOX_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__SINGLE_SOURCE = BLACKBOX_TYPE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__ROLE_NAME = BLACKBOX_TYPE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__ID = BLACKBOX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__SYMBOL_NAME = BLACKBOX_TYPE__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE__IS_ANONYMOUS = BLACKBOX_TYPE__IS_ANONYMOUS;

	/**
	 * The number of structural features of the '<em>Com Send Trusted Function Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE_FEATURE_COUNT = BLACKBOX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Send Trusted Function Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE_OPERATION_COUNT = BLACKBOX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NeverReadOperationImpl <em>Never Read Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NeverReadOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getNeverReadOperation()
	 * @generated
	 */
	int NEVER_READ_OPERATION = 137;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__SOURCE = READ_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__SINGLE_SOURCE = READ_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__ROLE_NAME = READ_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Invalid Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__INVALID_VALUE_CONSTANT = READ_OPERATION__INVALID_VALUE_CONSTANT;

	/**
	 * The feature id for the '<em><b>Read Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__READ_VALUE_VARIABLE = READ_OPERATION__READ_VALUE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Read Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__READ_STATUS_VARIABLE = READ_OPERATION__READ_STATUS_VARIABLE;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__EXCLUDE_OPERATION = READ_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Init Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION__INIT_VALUE_CONSTANT = READ_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Never Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION_FEATURE_COUNT = READ_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Never Read Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_READ_OPERATION_OPERATION_COUNT = READ_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferInvalidateTrustedFunctionImpl <em>Rte Buffer Invalidate Trusted Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferInvalidateTrustedFunctionImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferInvalidateTrustedFunction()
	 * @generated
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION = 138;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__SOURCE = TRUSTED_FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__SINGLE_SOURCE = TRUSTED_FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__ROLE_NAME = TRUSTED_FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__ID = TRUSTED_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__RETURN_TYPE = TRUSTED_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__PARAM = TRUSTED_FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__LOCAL_VARIABLE = TRUSTED_FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__LOCAL_TYPE = TRUSTED_FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__MEMORY_MAPPING = TRUSTED_FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__SYMBOL_NAME = TRUSTED_FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Trusted Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX = TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__OPERATION = TRUSTED_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Buffer Invalidate Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION_FEATURE_COUNT = TRUSTED_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Buffer Invalidate Trusted Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION_OPERATION_COUNT = TRUSTED_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferInvalidateSendOperationImpl <em>Trusted Function Rte Buffer Invalidate Send Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferInvalidateSendOperationImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionRteBufferInvalidateSendOperation()
	 * @generated
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION = 139;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__SOURCE = SEND_OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__SINGLE_SOURCE = SEND_OPERATION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ROLE_NAME = SEND_OPERATION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Send Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__SEND_VALUE = SEND_OPERATION__SEND_VALUE;

	/**
	 * The feature id for the '<em><b>Send Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__SEND_STATUS = SEND_OPERATION__SEND_STATUS;

	/**
	 * The feature id for the '<em><b>Exclude Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__EXCLUDE_OPERATION = SEND_OPERATION__EXCLUDE_OPERATION;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__RETURN_VARIABLE = SEND_OPERATION__RETURN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Access Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION = SEND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION_FEATURE_COUNT = SEND_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION_OPERATION_COUNT = SEND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MemoryMappingImpl <em>Memory Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MemoryMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMemoryMapping()
	 * @generated
	 */
	int MEMORY_MAPPING = 140;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__ID = MODULE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__PREFIX = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory Section Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME = MODULE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingImpl <em>Swc Memory Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSwcMemoryMapping()
	 * @generated
	 */
	int SWC_MEMORY_MAPPING = 141;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING__SOURCE = MEMORY_MAPPING__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING__SINGLE_SOURCE = MEMORY_MAPPING__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING__ROLE_NAME = MEMORY_MAPPING__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING__ID = MEMORY_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING__PREFIX = MEMORY_MAPPING__PREFIX;

	/**
	 * The feature id for the '<em><b>Memory Section Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME = MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Swc Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_FEATURE_COUNT = MEMORY_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Swc Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_OPERATION_COUNT = MEMORY_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingImpl <em>Bsw Memory Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswMemoryMapping()
	 * @generated
	 */
	int BSW_MEMORY_MAPPING = 142;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING__SOURCE = MEMORY_MAPPING__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING__SINGLE_SOURCE = MEMORY_MAPPING__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING__ROLE_NAME = MEMORY_MAPPING__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING__ID = MEMORY_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING__PREFIX = MEMORY_MAPPING__PREFIX;

	/**
	 * The feature id for the '<em><b>Memory Section Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME = MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Bsw Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_FEATURE_COUNT = MEMORY_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bsw Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_OPERATION_COUNT = MEMORY_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableGroupImpl <em>Global Variable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getGlobalVariableGroup()
	 * @generated
	 */
	int GLOBAL_VARIABLE_GROUP = 143;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP__SOURCE = MODULE_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP__SINGLE_SOURCE = MODULE_OBJECT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP__ROLE_NAME = MODULE_OBJECT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP__GLOBAL_VARIABLE = MODULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP__MEMORY_MAPPING = MODULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global Variable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP_FEATURE_COUNT = MODULE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Global Variable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_GROUP_OPERATION_COUNT = MODULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionGroupImpl <em>Function Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFunctionGroup()
	 * @generated
	 */
	int FUNCTION_GROUP = 144;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP__SOURCE = MODULE_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP__SINGLE_SOURCE = MODULE_OBJECT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP__ROLE_NAME = MODULE_OBJECT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP__MEMORY_MAPPING = MODULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP__FUNCTION = MODULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP_FEATURE_COUNT = MODULE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_GROUP_OPERATION_COUNT = MODULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiGroupImpl <em>Rte Api Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApiGroup()
	 * @generated
	 */
	int RTE_API_GROUP = 145;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Rte Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP__RTE_API = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_API_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiGroupImpl <em>Rte Lifecycle Api Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteLifecycleApiGroup()
	 * @generated
	 */
	int RTE_LIFECYCLE_API_GROUP = 146;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Rte Lifecycle Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP__RTE_LIFECYCLE_API = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rte Lifecycle Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rte Lifecycle Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_LIFECYCLE_API_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyGroupImpl <em>Task Body Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTaskBodyGroup()
	 * @generated
	 */
	int TASK_BODY_GROUP = 147;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Task Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP__TASK_BODY = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Body Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Body Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_BODY_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityGroupImpl <em>Bsw Schedulable Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswSchedulableEntityGroup()
	 * @generated
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP = 148;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Bsw Schedulable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP__BSW_SCHEDULABLE_ENTITY = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Schedulable Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Schedulable Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_SCHEDULABLE_ENTITY_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackGroupImpl <em>Com Callback Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComCallbackGroup()
	 * @generated
	 */
	int COM_CALLBACK_GROUP = 149;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Com Callback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP__COM_CALLBACK = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Callback Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Callback Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_CALLBACK_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionGroupImpl <em>Trusted Function Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionGroup()
	 * @generated
	 */
	int TRUSTED_FUNCTION_GROUP = 150;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Trusted Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP__TRUSTED_FUNCTION = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trusted Function Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trusted Function Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_FUNCTION_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityGroupImpl <em>Executable Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExecutableEntityGroup()
	 * @generated
	 */
	int EXECUTABLE_ENTITY_GROUP = 151;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Executable Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP__EXECUTABLE_ENTITY = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executable Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ENTITY_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingHeaderImpl <em>Bsw Memory Mapping Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswMemoryMappingHeader()
	 * @generated
	 */
	int BSW_MEMORY_MAPPING_HEADER = 152;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bsw Memory Mapping Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bsw Memory Mapping Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSW_MEMORY_MAPPING_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingHeaderImpl <em>Swc Memory Mapping Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSwcMemoryMappingHeader()
	 * @generated
	 */
	int SWC_MEMORY_MAPPING_HEADER = 153;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swc Memory Mapping Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swc Memory Mapping Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_MEMORY_MAPPING_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl <em>Generation Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getGenerationInfo()
	 * @generated
	 */
	int GENERATION_INFO = 154;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO__SOURCE = MODULE_OBJECT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO__SINGLE_SOURCE = MODULE_OBJECT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO__ROLE_NAME = MODULE_OBJECT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Generator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO__GENERATOR_NAME = MODULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO__GENERATOR_VERSION = MODULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO__GENERATION_DATE = MODULE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO_FEATURE_COUNT = MODULE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INFO_OPERATION_COUNT = MODULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MacroImpl <em>Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MacroImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMacro()
	 * @generated
	 */
	int MACRO = 155;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__SOURCE = MODULE_REFERRABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__SINGLE_SOURCE = MODULE_REFERRABLE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__ROLE_NAME = MODULE_REFERRABLE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__ID = MODULE_REFERRABLE__ID;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__SYMBOL_NAME = MODULE_REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_FEATURE_COUNT = MODULE_REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OPERATION_COUNT = MODULE_REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiImpl <em>Schm Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmApi()
	 * @generated
	 */
	int SCHM_API = 156;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__RETURN_VALUE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API__PARENT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schm Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schm Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiImpl <em>Schm Lifecycle Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmLifecycleApi()
	 * @generated
	 */
	int SCHM_LIFECYCLE_API = 157;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__SOURCE = FUNCTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__SINGLE_SOURCE = FUNCTION__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__ROLE_NAME = FUNCTION__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__RETURN_TYPE = FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__PARAM = FUNCTION__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__LOCAL_VARIABLE = FUNCTION__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__LOCAL_TYPE = FUNCTION__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__MEMORY_MAPPING = FUNCTION__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API__SYMBOL_NAME = FUNCTION__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Schm Lifecycle Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schm Lifecycle Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmEnterApiImpl <em>Schm Enter Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmEnterApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmEnterApi()
	 * @generated
	 */
	int SCHM_ENTER_API = 158;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__SOURCE = SCHM_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__SINGLE_SOURCE = SCHM_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__ROLE_NAME = SCHM_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__ID = SCHM_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__RETURN_TYPE = SCHM_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__PARAM = SCHM_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__LOCAL_VARIABLE = SCHM_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__LOCAL_TYPE = SCHM_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__MEMORY_MAPPING = SCHM_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__SYMBOL_NAME = SCHM_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__RETURN_VALUE = SCHM_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__PARENT = SCHM_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API__OPERATION = SCHM_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schm Enter Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API_FEATURE_COUNT = SCHM_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schm Enter Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_ENTER_API_OPERATION_COUNT = SCHM_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmExitApiImpl <em>Schm Exit Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmExitApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmExitApi()
	 * @generated
	 */
	int SCHM_EXIT_API = 159;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__SOURCE = SCHM_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__SINGLE_SOURCE = SCHM_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__ROLE_NAME = SCHM_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__ID = SCHM_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__RETURN_TYPE = SCHM_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__PARAM = SCHM_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__LOCAL_VARIABLE = SCHM_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__LOCAL_TYPE = SCHM_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__MEMORY_MAPPING = SCHM_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__SYMBOL_NAME = SCHM_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__RETURN_VALUE = SCHM_API__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__PARENT = SCHM_API__PARENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API__OPERATION = SCHM_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schm Exit Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API_FEATURE_COUNT = SCHM_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schm Exit Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_EXIT_API_OPERATION_COUNT = SCHM_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkHeaderImpl <em>Interlink Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleInterlinkHeader()
	 * @generated
	 */
	int MODULE_INTERLINK_HEADER = 160;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Schm Api Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__SCHM_API_GROUP = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER__CONSTANT = HEADER_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interlink Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interlink Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiGroupImpl <em>Schm Api Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmApiGroup()
	 * @generated
	 */
	int SCHM_API_GROUP = 161;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Schm Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP__SCHM_API = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schm Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schm Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_API_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl <em>Interlink Type Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleInterlinkTypeHeader()
	 * @generated
	 */
	int MODULE_INTERLINK_TYPE_HEADER = 162;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__SOURCE = HEADER_FILE__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__SINGLE_SOURCE = HEADER_FILE__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__ROLE_NAME = HEADER_FILE__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__ID = HEADER_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__FILE_NAME = HEADER_FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Generation Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__GENERATION_INFO = HEADER_FILE__GENERATION_INFO;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__GUARD_NAME = HEADER_FILE__GUARD_NAME;

	/**
	 * The feature id for the '<em><b>Dependent Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__DEPENDENT_HEADERS = HEADER_FILE__DEPENDENT_HEADERS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER__CONSTANT = HEADER_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interlink Type Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER_FEATURE_COUNT = HEADER_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interlink Type Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INTERLINK_TYPE_HEADER_OPERATION_COUNT = HEADER_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiGroupImpl <em>Schm Lifecycle Api Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiGroupImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmLifecycleApiGroup()
	 * @generated
	 */
	int SCHM_LIFECYCLE_API_GROUP = 163;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP__SOURCE = FUNCTION_GROUP__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP__SINGLE_SOURCE = FUNCTION_GROUP__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP__ROLE_NAME = FUNCTION_GROUP__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP__MEMORY_MAPPING = FUNCTION_GROUP__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP__FUNCTION = FUNCTION_GROUP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Schm Lifecycle Api</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP__SCHM_LIFECYCLE_API = FUNCTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schm Lifecycle Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP_FEATURE_COUNT = FUNCTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schm Lifecycle Api Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_LIFECYCLE_API_GROUP_OPERATION_COUNT = FUNCTION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartedBswmImpl <em>Parted Bswm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartedBswmImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartedBswm()
	 * @generated
	 */
	int PARTED_BSWM = 164;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__SOURCE = LOGICAL_COMPARTMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__SINGLE_SOURCE = LOGICAL_COMPARTMENT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__ROLE_NAME = LOGICAL_COMPARTMENT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__ID = LOGICAL_COMPARTMENT__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__COMPARTMENT_NAME = LOGICAL_COMPARTMENT__COMPARTMENT_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__PARENT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent Executable Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__DEPENDENT_EXECUTABLE_ENTITY = LOGICAL_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schm Api</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__SCHM_API = LOGICAL_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bsw Memory Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__BSW_MEMORY_MAPPING = LOGICAL_COMPARTMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bswm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM__BSWM = LOGICAL_COMPARTMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parted Bswm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM_FEATURE_COUNT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parted Bswm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTED_BSWM_OPERATION_COUNT = LOGICAL_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswmImpl <em>Bswm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswmImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswm()
	 * @generated
	 */
	int BSWM = 165;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM__SOURCE = LOGICAL_COMPARTMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM__SINGLE_SOURCE = LOGICAL_COMPARTMENT__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM__ROLE_NAME = LOGICAL_COMPARTMENT__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM__ID = LOGICAL_COMPARTMENT__ID;

	/**
	 * The feature id for the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM__COMPARTMENT_NAME = LOGICAL_COMPARTMENT__COMPARTMENT_NAME;

	/**
	 * The feature id for the '<em><b>Parted Bswm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM__PARTED_BSWM = LOGICAL_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bswm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_FEATURE_COUNT = LOGICAL_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Single Parted Bswm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM___GET_SINGLE_PARTED_BSWM__PARTITION = LOGICAL_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bswm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWM_OPERATION_COUNT = LOGICAL_COMPARTMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmDeinitApiImpl <em>Schm Deinit Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmDeinitApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmDeinitApi()
	 * @generated
	 */
	int SCHM_DEINIT_API = 166;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__SOURCE = SCHM_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__SINGLE_SOURCE = SCHM_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__ROLE_NAME = SCHM_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__ID = SCHM_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__RETURN_TYPE = SCHM_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__PARAM = SCHM_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__LOCAL_VARIABLE = SCHM_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__LOCAL_TYPE = SCHM_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__MEMORY_MAPPING = SCHM_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API__SYMBOL_NAME = SCHM_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Schm Deinit Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API_FEATURE_COUNT = SCHM_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schm Deinit Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_DEINIT_API_OPERATION_COUNT = SCHM_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl <em>Schm Init Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmInitApi()
	 * @generated
	 */
	int SCHM_INIT_API = 167;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__SOURCE = SCHM_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__SINGLE_SOURCE = SCHM_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__ROLE_NAME = SCHM_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__ID = SCHM_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__RETURN_TYPE = SCHM_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__PARAM = SCHM_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__LOCAL_VARIABLE = SCHM_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__LOCAL_TYPE = SCHM_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__MEMORY_MAPPING = SCHM_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API__SYMBOL_NAME = SCHM_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The number of structural features of the '<em>Schm Init Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API_FEATURE_COUNT = SCHM_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schm Init Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_INIT_API_OPERATION_COUNT = SCHM_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreSchmInitApiImpl <em>Singlecore Schm Init Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreSchmInitApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSinglecoreSchmInitApi()
	 * @generated
	 */
	int SINGLECORE_SCHM_INIT_API = 168;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__SOURCE = SCHM_INIT_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__SINGLE_SOURCE = SCHM_INIT_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__ROLE_NAME = SCHM_INIT_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__ID = SCHM_INIT_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__RETURN_TYPE = SCHM_INIT_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__PARAM = SCHM_INIT_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__LOCAL_VARIABLE = SCHM_INIT_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__LOCAL_TYPE = SCHM_INIT_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__MEMORY_MAPPING = SCHM_INIT_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__SYMBOL_NAME = SCHM_INIT_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API__OPERATION = SCHM_INIT_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singlecore Schm Init Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API_FEATURE_COUNT = SCHM_INIT_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Singlecore Schm Init Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLECORE_SCHM_INIT_API_OPERATION_COUNT = SCHM_INIT_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreSchmInitApiImpl <em>Multicore Schm Init Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreSchmInitApiImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMulticoreSchmInitApi()
	 * @generated
	 */
	int MULTICORE_SCHM_INIT_API = 169;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__SOURCE = SCHM_INIT_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__SINGLE_SOURCE = SCHM_INIT_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__ROLE_NAME = SCHM_INIT_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__ID = SCHM_INIT_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__RETURN_TYPE = SCHM_INIT_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__PARAM = SCHM_INIT_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__LOCAL_VARIABLE = SCHM_INIT_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__LOCAL_TYPE = SCHM_INIT_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__MEMORY_MAPPING = SCHM_INIT_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__SYMBOL_NAME = SCHM_INIT_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Core Init Api Impl</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL = SCHM_INIT_API_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multicore Schm Init Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API_FEATURE_COUNT = SCHM_INIT_API_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multicore Schm Init Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICORE_SCHM_INIT_API_OPERATION_COUNT = SCHM_INIT_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmCoreInitApiImplImpl <em>Schm Core Init Api Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmCoreInitApiImplImpl
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmCoreInitApiImpl()
	 * @generated
	 */
	int SCHM_CORE_INIT_API_IMPL = 170;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__SOURCE = SCHM_LIFECYCLE_API__SOURCE;

	/**
	 * The feature id for the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__SINGLE_SOURCE = SCHM_LIFECYCLE_API__SINGLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__ROLE_NAME = SCHM_LIFECYCLE_API__ROLE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__ID = SCHM_LIFECYCLE_API__ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__RETURN_TYPE = SCHM_LIFECYCLE_API__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__PARAM = SCHM_LIFECYCLE_API__PARAM;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__LOCAL_VARIABLE = SCHM_LIFECYCLE_API__LOCAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__LOCAL_TYPE = SCHM_LIFECYCLE_API__LOCAL_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__MEMORY_MAPPING = SCHM_LIFECYCLE_API__MEMORY_MAPPING;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__SYMBOL_NAME = SCHM_LIFECYCLE_API__SYMBOL_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__PARENT = SCHM_LIFECYCLE_API_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL__OPERATION = SCHM_LIFECYCLE_API_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schm Core Init Api Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL_FEATURE_COUNT = SCHM_LIFECYCLE_API_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schm Core Init Api Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHM_CORE_INIT_API_IMPL_OPERATION_COUNT = SCHM_LIFECYCLE_API_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum <em>Parameter Pass Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getParameterPassTypeEnum()
	 * @generated
	 */
	int PARAMETER_PASS_TYPE_ENUM = 171;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum <em>Signedness Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSignednessEnum()
	 * @generated
	 */
	int SIGNEDNESS_ENUM = 172;

	/**
	 * The meta object id for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum <em>Constant Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getConstantTypeEnum()
	 * @generated
	 */
	int CONSTANT_TYPE_ENUM = 173;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getString()
	 * @generated
	 */
	int STRING = 174;

	/**
	 * The meta object id for the '<em>Verbatim String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVerbatimString()
	 * @generated
	 */
	int VERBATIM_STRING = 175;

	/**
	 * The meta object id for the '<em>CIdentifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCIdentifier()
	 * @generated
	 */
	int CIDENTIFIER = 176;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 177;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 178;

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject
	 * @generated
	 */
	EClass getModuleObject();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSource()
	 * @see #getModuleObject()
	 * @generated
	 */
	EReference getModuleObject_Source();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSingleSource <em>Single Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSingleSource()
	 * @see #getModuleObject()
	 * @generated
	 */
	EReference getModuleObject_SingleSource();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getRoleName()
	 * @see #getModuleObject()
	 * @generated
	 */
	EAttribute getModuleObject_RoleName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable
	 * @generated
	 */
	EClass getModuleReferrable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable#getId()
	 * @see #getModuleReferrable()
	 * @generated
	 */
	EAttribute getModuleReferrable_Id();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi <em>Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi
	 * @generated
	 */
	EClass getWriteApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi#getOperation()
	 * @see #getWriteApi()
	 * @generated
	 */
	EReference getWriteApi_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi#getDataParam <em>Data Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.WriteApi#getDataParam()
	 * @see #getWriteApi()
	 * @generated
	 */
	EReference getWriteApi_DataParam();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation <em>Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation
	 * @generated
	 */
	EClass getSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getSendValue <em>Send Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getSendValue()
	 * @see #getSendOperation()
	 * @generated
	 */
	EReference getSendOperation_SendValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getSendStatus <em>Send Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Status</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getSendStatus()
	 * @see #getSendOperation()
	 * @generated
	 */
	EReference getSendOperation_SendStatus();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getExcludeOperation()
	 * @see #getSendOperation()
	 * @generated
	 */
	EReference getSendOperation_ExcludeOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getReturnVariable <em>Return Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation#getReturnVariable()
	 * @see #getSendOperation()
	 * @generated
	 */
	EReference getSendOperation_ReturnVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation <em>Rte Buffer Nonqueued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation
	 * @generated
	 */
	EClass getRteBufferNonqueuedSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getAccessVariable <em>Access Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getAccessVariable()
	 * @see #getRteBufferNonqueuedSendOperation()
	 * @generated
	 */
	EReference getRteBufferNonqueuedSendOperation_AccessVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getFilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getFilterOperation()
	 * @see #getRteBufferNonqueuedSendOperation()
	 * @generated
	 */
	EReference getRteBufferNonqueuedSendOperation_FilterOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation <em>Rte Buffer Nonqueued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation
	 * @generated
	 */
	EClass getRteBufferNonqueuedReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation#getAccessVariable <em>Access Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation#getAccessVariable()
	 * @see #getRteBufferNonqueuedReadOperation()
	 * @generated
	 */
	EReference getRteBufferNonqueuedReadOperation_AccessVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation <em>Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation
	 * @generated
	 */
	EClass getReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getInvalidValueConstant <em>Invalid Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invalid Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getInvalidValueConstant()
	 * @see #getReadOperation()
	 * @generated
	 */
	EReference getReadOperation_InvalidValueConstant();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadValueVariable <em>Read Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read Value Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadValueVariable()
	 * @see #getReadOperation()
	 * @generated
	 */
	EReference getReadOperation_ReadValueVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadStatusVariable <em>Read Status Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read Status Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getReadStatusVariable()
	 * @see #getReadOperation()
	 * @generated
	 */
	EReference getReadOperation_ReadStatusVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation#getExcludeOperation()
	 * @see #getReadOperation()
	 * @generated
	 */
	EReference getReadOperation_ExcludeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi <em>Read Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi
	 * @generated
	 */
	EClass getReadApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi#getOperation()
	 * @see #getReadApi()
	 * @generated
	 */
	EReference getReadApi_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi#getDataParam <em>Data Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadApi#getDataParam()
	 * @see #getReadApi()
	 * @generated
	 */
	EReference getReadApi_DataParam();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet <em>Rte Buffer Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Variable Set</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet
	 * @generated
	 */
	EClass getRteBufferVariableSet();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getValueVariable <em>Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getValueVariable()
	 * @see #getRteBufferVariableSet()
	 * @generated
	 */
	EReference getRteBufferVariableSet_ValueVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getStatusVariable <em>Status Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet#getStatusVariable()
	 * @see #getRteBufferVariableSet()
	 * @generated
	 */
	EReference getRteBufferVariableSet_StatusVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource <em>Rte Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource
	 * @generated
	 */
	EClass getRteSource();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getGlobalVariableGroup <em>Global Variable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getGlobalVariableGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_GlobalVariableGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bsw Schedulable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getBswSchedulableEntityGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_BswSchedulableEntityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getRteApiGroup <em>Rte Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getRteApiGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_RteApiGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Lifecycle Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getRteLifecycleApiGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_RteLifecycleApiGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getTaskBodyGroup <em>Task Body Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Body Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getTaskBodyGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_TaskBodyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getComCallbackGroup <em>Com Callback Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Callback Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getComCallbackGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_ComCallbackGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getTrustedFunctionGroup <em>Trusted Function Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trusted Function Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getTrustedFunctionGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_TrustedFunctionGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSourceMacro <em>Source Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Macro</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSourceMacro()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_SourceMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schm Lifecycle Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSchmLifecycleApiGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_SchmLifecycleApiGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSchmApiGroup <em>Schm Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schm Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSchmApiGroup()
	 * @see #getRteSource()
	 * @generated
	 */
	EReference getRteSource_SchmApiGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi <em>Rte Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi
	 * @generated
	 */
	EClass getRteApi();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getApiMappingName <em>Api Mapping Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Mapping Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getApiMappingName()
	 * @see #getRteApi()
	 * @generated
	 */
	EAttribute getRteApi_ApiMappingName();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getReturnValue()
	 * @see #getRteApi()
	 * @generated
	 */
	EReference getRteApi_ReturnValue();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getIsConnected()
	 * @see #getRteApi()
	 * @generated
	 */
	EAttribute getRteApi_IsConnected();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getParent()
	 * @see #getRteApi()
	 * @generated
	 */
	EReference getRteApi_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule <em>Rte Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Module</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule
	 * @generated
	 */
	EClass getRteModule();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonSource <em>Rte Common Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Common Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonSource()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteCommonSource();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRtePartitionSource <em>Rte Partition Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Partition Source</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRtePartitionSource()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RtePartitionSource();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteApplicationHeader <em>Rte Application Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Application Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteApplicationHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteApplicationHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteApplicationTypeHeader <em>Rte Application Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Application Type Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteApplicationTypeHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteApplicationTypeHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteLifecycleHeader <em>Rte Lifecycle Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Lifecycle Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteLifecycleHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteLifecycleHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCallbackHeader <em>Rte Callback Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Callback Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCallbackHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteCallbackHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteConfigurationHeader <em>Rte Configuration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Configuration Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteConfigurationHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteConfigurationHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteVfbTraceHeader <em>Rte Vfb Trace Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Vfb Trace Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteVfbTraceHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteVfbTraceHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteTypeHeader <em>Rte Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Type Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteTypeHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteTypeHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteHeader <em>Rte Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonHeader <em>Rte Common Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Common Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteCommonHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRtePartitionHeader <em>Rte Partition Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Partition Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRtePartitionHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RtePartitionHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteUtilityHeader <em>Rte Utility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Utility Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteUtilityHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_RteUtilityHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getDependentHeader <em>Dependent Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getDependentHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_DependentHeader();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getBswMemoryMappingHeader <em>Bsw Memory Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bsw Memory Mapping Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getBswMemoryMappingHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_BswMemoryMappingHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getSwcMemoryMappingHeader <em>Swc Memory Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc Memory Mapping Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getSwcMemoryMappingHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_SwcMemoryMappingHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getModuleInterlinkHeader <em>Module Interlink Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Interlink Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getModuleInterlinkHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_ModuleInterlinkHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getModuleInterlinkTypeHeader <em>Module Interlink Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Interlink Type Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getModuleInterlinkTypeHeader()
	 * @see #getRteModule()
	 * @generated
	 */
	EReference getRteModule_ModuleInterlinkTypeHeader();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable#getInitValueConstant <em>Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable#getInitValueConstant()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_InitValueConstant();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable#getMemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable#getMemoryMapping()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_MemoryMapping();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable#getInitAtDefinition <em>Init At Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init At Definition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable#getInitAtDefinition()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_InitAtDefinition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File#getFileName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileName();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File#getGenerationInfo <em>Generation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generation Info</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.File#getGenerationInfo()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_GenerationInfo();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getPassType <em>Pass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getPassType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_PassType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSymbolName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_SymbolName();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getIsAnonymous <em>Is Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Anonymous</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getIsAnonymous()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsAnonymous();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable#getInitValueConstant <em>Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable#getInitValueConstant()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_InitValueConstant();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable#getParent()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader <em>Rte Application Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Application Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader
	 * @generated
	 */
	EClass getRteApplicationHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getRteApiGroup <em>Rte Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getRteApiGroup()
	 * @see #getRteApplicationHeader()
	 * @generated
	 */
	EReference getRteApplicationHeader_RteApiGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getConstant()
	 * @see #getRteApplicationHeader()
	 * @generated
	 */
	EReference getRteApplicationHeader_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Executable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getDependentExecutableEntityGroup()
	 * @see #getRteApplicationHeader()
	 * @generated
	 */
	EReference getRteApplicationHeader_DependentExecutableEntityGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getSymbolName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_SymbolName();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getParam()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getLocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getLocalVariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_LocalVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getLocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getLocalType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_LocalType();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getMemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function#getMemoryMapping()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_MemoryMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment <em>Logical Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Compartment</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment
	 * @generated
	 */
	EClass getLogicalCompartment();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment#getCompartmentName <em>Compartment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment#getCompartmentName()
	 * @see #getLogicalCompartment()
	 * @generated
	 */
	EAttribute getLogicalCompartment_CompartmentName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getPartition()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Partition();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getRteStartApi <em>Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Start Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getRteStartApi()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_RteStartApi();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getCoreId <em>Core Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getCoreId()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_CoreId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getIsMasterCore <em>Is Master Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Master Core</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getIsMasterCore()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_IsMasterCore();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getSchmInitApi <em>Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schm Init Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core#getSchmInitApi()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_SchmInitApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getIsBswPartition <em>Is Bsw Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bsw Partition</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getIsBswPartition()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_IsBswPartition();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getParent()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSwc <em>Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSwc()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Swc();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferVariableSet <em>Rte Buffer Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Buffer Variable Set</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferVariableSet()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_RteBufferVariableSet();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getFilterOldValueVariable <em>Filter Old Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Old Value Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getFilterOldValueVariable()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_FilterOldValueVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getFilterOccurrenceVariable <em>Filter Occurrence Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Occurrence Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getFilterOccurrenceVariable()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_FilterOccurrenceVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRestartPartitionApi <em>Restart Partition Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restart Partition Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRestartPartitionApi()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_RestartPartitionApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionTerminatedApi <em>Partition Terminated Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Terminated Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionTerminatedApi()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_PartitionTerminatedApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionRestartingApi <em>Partition Restarting Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Restarting Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartitionRestartingApi()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_PartitionRestartingApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getTaskBody <em>Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getTaskBody()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_TaskBody();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferQueuedVariable <em>Rte Buffer Queued Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Buffer Queued Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferQueuedVariable()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_RteBufferQueuedVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferInitValueConstant <em>Rte Buffer Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Buffer Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferInitValueConstant()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_RteBufferInitValueConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getEntityStartVariable <em>Entity Start Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Start Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getEntityStartVariable()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_EntityStartVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getEntityStartConstant <em>Entity Start Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Start Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getEntityStartConstant()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_EntityStartConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getFilterConstant <em>Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getFilterConstant()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_FilterConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferSendTrustedFunction <em>Rte Buffer Send Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Buffer Send Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getRteBufferSendTrustedFunction()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_RteBufferSendTrustedFunction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getOsTrustedMacro <em>Os Trusted Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Trusted Macro</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getOsTrustedMacro()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_OsTrustedMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartedBswm <em>Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parted Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartedBswm()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_PartedBswm();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc <em>Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc
	 * @generated
	 */
	EClass getSwc();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getFilterConstant <em>Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getFilterConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_FilterConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getPortArgValueConstant <em>Port Arg Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Arg Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getPortArgValueConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_PortArgValueConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getDependentExecutableEntity <em>Dependent Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getDependentExecutableEntity()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_DependentExecutableEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getInvalidValueConstant <em>Invalid Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invalid Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getInvalidValueConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_InvalidValueConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getImplInitValueConstant <em>Impl Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impl Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getImplInitValueConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_ImplInitValueConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSwcMemoryMapping <em>Swc Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSwcMemoryMapping()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_SwcMemoryMapping();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getParent()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getRteApi <em>Rte Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getRteApi()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_RteApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiInitValueConstant <em>Api Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Api Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiInitValueConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_ApiInitValueConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiApplicationErrorConstant <em>Api Application Error Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Api Application Error Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiApplicationErrorConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_ApiApplicationErrorConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiEnumConstant <em>Api Enum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Api Enum Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiEnumConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_ApiEnumConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiUpperLowerLimitConstant <em>Api Upper Lower Limit Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Api Upper Lower Limit Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiUpperLowerLimitConstant()
	 * @see #getSwc()
	 * @generated
	 */
	EReference getSwc_ApiUpperLowerLimitConstant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader <em>Rte Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteHeader
	 * @generated
	 */
	EClass getRteHeader();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader <em>Rte Lifecycle Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Lifecycle Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader
	 * @generated
	 */
	EClass getRteLifecycleHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Lifecycle Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader#getRteLifecycleApiGroup()
	 * @see #getRteLifecycleHeader()
	 * @generated
	 */
	EReference getRteLifecycleHeader_RteLifecycleApiGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schm Lifecycle Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader#getSchmLifecycleApiGroup()
	 * @see #getRteLifecycleHeader()
	 * @generated
	 */
	EReference getRteLifecycleHeader_SchmLifecycleApiGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader <em>Rte Application Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Application Type Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader
	 * @generated
	 */
	EClass getRteApplicationTypeHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader#getConstant()
	 * @see #getRteApplicationTypeHeader()
	 * @generated
	 */
	EReference getRteApplicationTypeHeader_Constant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader <em>Rte Vfb Trace Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Vfb Trace Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteVfbTraceHeader
	 * @generated
	 */
	EClass getRteVfbTraceHeader();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader <em>Rte Configuration Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Configuration Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteConfigurationHeader
	 * @generated
	 */
	EClass getRteConfigurationHeader();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader <em>Rte Callback Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Callback Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader
	 * @generated
	 */
	EClass getRteCallbackHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader#getComCallbackGroup <em>Com Callback Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Callback Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCallbackHeader#getComCallbackGroup()
	 * @see #getRteCallbackHeader()
	 * @generated
	 */
	EReference getRteCallbackHeader_ComCallbackGroup();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader <em>Rte Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Type Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader
	 * @generated
	 */
	EClass getRteTypeHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getRteType <em>Rte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rte Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getRteType()
	 * @see #getRteTypeHeader()
	 * @generated
	 */
	EReference getRteTypeHeader_RteType();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getRteTypeConstant <em>Rte Type Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rte Type Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getRteTypeConstant()
	 * @see #getRteTypeHeader()
	 * @generated
	 */
	EReference getRteTypeHeader_RteTypeConstant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi <em>Invalidate Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalidate Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi
	 * @generated
	 */
	EClass getInvalidateApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi#getOperation()
	 * @see #getInvalidateApi()
	 * @generated
	 */
	EReference getInvalidateApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation <em>Ioc Nonqueued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Nonqueued Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation
	 * @generated
	 */
	EClass getIocNonqueuedSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedSendOperation#getAccessApi()
	 * @see #getIocNonqueuedSendOperation()
	 * @generated
	 */
	EReference getIocNonqueuedSendOperation_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation <em>Direct Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Com Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectComSendOperation
	 * @generated
	 */
	EClass getDirectComSendOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation <em>Trusted Function Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function Com Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation
	 * @generated
	 */
	EClass getTrustedFunctionComSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation#getAccessTrustedFunction()
	 * @see #getTrustedFunctionComSendOperation()
	 * @generated
	 */
	EReference getTrustedFunctionComSendOperation_AccessTrustedFunction();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trusted Function Param Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionComSendOperation#getTrustedFunctionParamVariable()
	 * @see #getTrustedFunctionComSendOperation()
	 * @generated
	 */
	EReference getTrustedFunctionComSendOperation_TrustedFunctionParamVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation <em>Immediate Proxy Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Proxy Com Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation
	 * @generated
	 */
	EClass getImmediateProxyComSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation#getActivationApi <em>Activation Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ImmediateProxyComSendOperation#getActivationApi()
	 * @see #getImmediateProxyComSendOperation()
	 * @generated
	 */
	EReference getImmediateProxyComSendOperation_ActivationApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation <em>Periodic Proxy Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Proxy Com Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PeriodicProxyComSendOperation
	 * @generated
	 */
	EClass getPeriodicProxyComSendOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation <em>Ioc Nonqueued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Nonqueued Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation
	 * @generated
	 */
	EClass getIocNonqueuedReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedReadOperation#getAccessApi()
	 * @see #getIocNonqueuedReadOperation()
	 * @generated
	 */
	EReference getIocNonqueuedReadOperation_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation <em>Com Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation
	 * @generated
	 */
	EClass getComReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReadOperation#getAccessApi()
	 * @see #getComReadOperation()
	 * @generated
	 */
	EReference getComReadOperation_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication <em>Ioc Nonqueued Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Nonqueued Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication
	 * @generated
	 */
	EClass getIocNonqueuedCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getWriteApi <em>Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Write Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getWriteApi()
	 * @see #getIocNonqueuedCommunication()
	 * @generated
	 */
	EReference getIocNonqueuedCommunication_WriteApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getReadApi <em>Read Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getReadApi()
	 * @see #getIocNonqueuedCommunication()
	 * @generated
	 */
	EReference getIocNonqueuedCommunication_ReadApi();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getInitValue()
	 * @see #getIocNonqueuedCommunication()
	 * @generated
	 */
	EReference getIocNonqueuedCommunication_InitValue();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi <em>Ioc Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Write Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi
	 * @generated
	 */
	EClass getIocWriteApi();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi#getParent()
	 * @see #getIocWriteApi()
	 * @generated
	 */
	EReference getIocWriteApi_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi <em>Ioc Read Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Read Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReadApi
	 * @generated
	 */
	EClass getIocReadApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi <em>Com Send Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Signal Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalApi
	 * @generated
	 */
	EClass getComSendSignalApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi <em>Com Receive Signal Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Receive Signal Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveSignalApi
	 * @generated
	 */
	EClass getComReceiveSignalApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback <em>Com Receive Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Receive Callback</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback
	 * @generated
	 */
	EClass getComReceiveCallback();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback#getOperation()
	 * @see #getComReceiveCallback()
	 * @generated
	 */
	EReference getComReceiveCallback_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback#getDataVariable <em>Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback#getDataVariable()
	 * @see #getComReceiveCallback()
	 * @generated
	 */
	EReference getComReceiveCallback_DataVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveCallback#getAccessApi()
	 * @see #getComReceiveCallback()
	 * @generated
	 */
	EReference getComReceiveCallback_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation <em>Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation
	 * @generated
	 */
	EClass getComSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendOperation#getAccessApi()
	 * @see #getComSendOperation()
	 * @generated
	 */
	EReference getComSendOperation_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback <em>Com Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Callback</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback
	 * @generated
	 */
	EClass getComCallback();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback <em>Com Receive Timeout Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Receive Timeout Callback</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback
	 * @generated
	 */
	EClass getComReceiveTimeoutCallback();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback#getOperation()
	 * @see #getComReceiveTimeoutCallback()
	 * @generated
	 */
	EReference getComReceiveTimeoutCallback_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback#getDataVariable <em>Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback#getDataVariable()
	 * @see #getComReceiveTimeoutCallback()
	 * @generated
	 */
	EReference getComReceiveTimeoutCallback_DataVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComReceiveTimeoutCallback#getAccessApi()
	 * @see #getComReceiveTimeoutCallback()
	 * @generated
	 */
	EReference getComReceiveTimeoutCallback_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback <em>Com Invalidate Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Invalidate Callback</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback
	 * @generated
	 */
	EClass getComInvalidateCallback();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback#getOperation()
	 * @see #getComInvalidateCallback()
	 * @generated
	 */
	EReference getComInvalidateCallback_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback#getFilterResultVariable <em>Filter Result Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Result Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComInvalidateCallback#getFilterResultVariable()
	 * @see #getComInvalidateCallback()
	 * @generated
	 */
	EReference getComInvalidateCallback_FilterResultVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Signal Immediate Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity
	 * @generated
	 */
	EClass getComSendSignalImmediateEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity#getOperation()
	 * @see #getComSendSignalImmediateEntity()
	 * @generated
	 */
	EReference getComSendSignalImmediateEntity_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Signal Periodic Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity
	 * @generated
	 */
	EClass getComSendSignalPeriodicEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity#getOperation()
	 * @see #getComSendSignalPeriodicEntity()
	 * @generated
	 */
	EReference getComSendSignalPeriodicEntity_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation
	 * @generated
	 */
	EClass getFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation#getFilterResultVariable <em>Filter Result Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Result Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FilterOperation#getFilterResultVariable()
	 * @see #getFilterOperation()
	 * @generated
	 */
	EReference getFilterOperation_FilterResultVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation <em>Masked New Differs Masked Old Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation
	 * @generated
	 */
	EClass getMaskedNewDiffersMaskedOldFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getOldValueVariable <em>Old Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getOldValueVariable()
	 * @see #getMaskedNewDiffersMaskedOldFilterOperation()
	 * @generated
	 */
	EReference getMaskedNewDiffersMaskedOldFilterOperation_OldValueVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mask</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getMask()
	 * @see #getMaskedNewDiffersMaskedOldFilterOperation()
	 * @generated
	 */
	EReference getMaskedNewDiffersMaskedOldFilterOperation_Mask();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation <em>Masked New Differs XFilter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masked New Differs XFilter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation
	 * @generated
	 */
	EClass getMaskedNewDiffersXFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mask</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getMask()
	 * @see #getMaskedNewDiffersXFilterOperation()
	 * @generated
	 */
	EReference getMaskedNewDiffersXFilterOperation_Mask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getX()
	 * @see #getMaskedNewDiffersXFilterOperation()
	 * @generated
	 */
	EReference getMaskedNewDiffersXFilterOperation_X();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation <em>New Is Within Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Is Within Filter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation
	 * @generated
	 */
	EClass getNewIsWithinFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMin()
	 * @see #getNewIsWithinFilterOperation()
	 * @generated
	 */
	EReference getNewIsWithinFilterOperation_Min();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMax()
	 * @see #getNewIsWithinFilterOperation()
	 * @generated
	 */
	EReference getNewIsWithinFilterOperation_Max();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation <em>New Is Outside Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Is Outside Filter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation
	 * @generated
	 */
	EClass getNewIsOutsideFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation#getMin()
	 * @see #getNewIsOutsideFilterOperation()
	 * @generated
	 */
	EReference getNewIsOutsideFilterOperation_Min();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsOutsideFilterOperation#getMax()
	 * @see #getNewIsOutsideFilterOperation()
	 * @generated
	 */
	EReference getNewIsOutsideFilterOperation_Max();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation <em>Masked New Equals XFilter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masked New Equals XFilter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation
	 * @generated
	 */
	EClass getMaskedNewEqualsXFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mask</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation#getMask()
	 * @see #getMaskedNewEqualsXFilterOperation()
	 * @generated
	 */
	EReference getMaskedNewEqualsXFilterOperation_Mask();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewEqualsXFilterOperation#getX()
	 * @see #getMaskedNewEqualsXFilterOperation()
	 * @generated
	 */
	EReference getMaskedNewEqualsXFilterOperation_X();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation <em>One Every NFilter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Every NFilter Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation
	 * @generated
	 */
	EClass getOneEveryNFilterOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOccurrenceVariable <em>Occurrence Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occurrence Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOccurrenceVariable()
	 * @see #getOneEveryNFilterOperation()
	 * @generated
	 */
	EReference getOneEveryNFilterOperation_OccurrenceVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getPeriod()
	 * @see #getOneEveryNFilterOperation()
	 * @generated
	 */
	EReference getOneEveryNFilterOperation_Period();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offset</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOffset()
	 * @see #getOneEveryNFilterOperation()
	 * @generated
	 */
	EReference getOneEveryNFilterOperation_Offset();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Core Start Api Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl
	 * @generated
	 */
	EClass getRteCoreStartApiImpl();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl#getOperation()
	 * @see #getRteCoreStartApiImpl()
	 * @generated
	 */
	EReference getRteCoreStartApiImpl_Operation();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl#getParent()
	 * @see #getRteCoreStartApiImpl()
	 * @generated
	 */
	EReference getRteCoreStartApiImpl_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi <em>Rte Stop Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Stop Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi
	 * @generated
	 */
	EClass getRteStopApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile <em>Header File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header File</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile
	 * @generated
	 */
	EClass getHeaderFile();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile#getGuardName <em>Guard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile#getGuardName()
	 * @see #getHeaderFile()
	 * @generated
	 */
	EAttribute getHeaderFile_GuardName();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile#getDependentHeaders <em>Dependent Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependent Headers</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile#getDependentHeaders()
	 * @see #getHeaderFile()
	 * @generated
	 */
	EReference getHeaderFile_DependentHeaders();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile#getDependentHeaders <em>Dependent Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependent Headers</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SourceFile#getDependentHeaders()
	 * @see #getSourceFile()
	 * @generated
	 */
	EReference getSourceFile_DependentHeaders();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader <em>Rte Internal Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Internal Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader
	 * @generated
	 */
	EClass getRteInternalHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getConstant()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getGlobalVariableGroup <em>Global Variable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getGlobalVariableGroup()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_GlobalVariableGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getTrustedFunctionGroup <em>Trusted Function Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trusted Function Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getTrustedFunctionGroup()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_TrustedFunctionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bsw Schedulable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getBswSchedulableEntityGroup()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_BswSchedulableEntityGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getRteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rte Core Start Api Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getRteCoreStartApiImpl()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_RteCoreStartApiImpl();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Executable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getDependentExecutableEntityGroup()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_DependentExecutableEntityGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getSchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schm Core Init Api Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getSchmCoreInitApiImpl()
	 * @see #getRteInternalHeader()
	 * @generated
	 */
	EReference getRteInternalHeader_SchmCoreInitApiImpl();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType#getOriginalTypeSymbolName <em>Original Type Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Type Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType#getOriginalTypeSymbolName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_OriginalTypeSymbolName();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType#getSignedness <em>Signedness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signedness</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType#getSignedness()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Signedness();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionType#getMember()
	 * @see #getUnionType()
	 * @generated
	 */
	EReference getUnionType_Member();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType <em>Blackbox Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackbox Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType
	 * @generated
	 */
	EClass getBlackboxType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember <em>Union Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Member</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember
	 * @generated
	 */
	EClass getUnionMember();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember#getMemberName()
	 * @see #getUnionMember()
	 * @generated
	 */
	EAttribute getUnionMember_MemberName();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.UnionMember#getType()
	 * @see #getUnionMember()
	 * @generated
	 */
	EReference getUnionMember_Type();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember <em>Variable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Member</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember
	 * @generated
	 */
	EClass getVariableMember();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember#getParent()
	 * @see #getVariableMember()
	 * @generated
	 */
	EReference getVariableMember_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader <em>Rte Utility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Utility Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteUtilityHeader
	 * @generated
	 */
	EClass getRteUtilityHeader();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader <em>Blackbox Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackbox Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader
	 * @generated
	 */
	EClass getBlackboxHeader();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType <em>Rte Buffer Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Queue Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType
	 * @generated
	 */
	EClass getRteBufferQueueType();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getMaxLengthConstant <em>Max Length Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Length Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getMaxLengthConstant()
	 * @see #getRteBufferQueueType()
	 * @generated
	 */
	EReference getRteBufferQueueType_MaxLengthConstant();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getElementType()
	 * @see #getRteBufferQueueType()
	 * @generated
	 */
	EReference getRteBufferQueueType_ElementType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType <em>Com Send Trusted Function Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Trusted Function Param Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType
	 * @generated
	 */
	EClass getComSendTrustedFunctionParamType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation <em>Never Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Never Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation
	 * @generated
	 */
	EClass getNeverReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation#getInitValueConstant <em>Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation#getInitValueConstant()
	 * @see #getNeverReadOperation()
	 * @generated
	 */
	EReference getNeverReadOperation_InitValueConstant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction <em>Rte Buffer Invalidate Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction
	 * @generated
	 */
	EClass getRteBufferInvalidateTrustedFunction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferInvalidateTrustedFunction#getOperation()
	 * @see #getRteBufferInvalidateTrustedFunction()
	 * @generated
	 */
	EReference getRteBufferInvalidateTrustedFunction_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation <em>Trusted Function Rte Buffer Invalidate Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation
	 * @generated
	 */
	EClass getTrustedFunctionRteBufferInvalidateSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation#getAccessTrustedFunction()
	 * @see #getTrustedFunctionRteBufferInvalidateSendOperation()
	 * @generated
	 */
	EReference getTrustedFunctionRteBufferInvalidateSendOperation_AccessTrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping
	 * @generated
	 */
	EClass getMemoryMapping();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping#getPrefix()
	 * @see #getMemoryMapping()
	 * @generated
	 */
	EAttribute getMemoryMapping_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping#getMemorySectionSymbolName <em>Memory Section Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Section Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping#getMemorySectionSymbolName()
	 * @see #getMemoryMapping()
	 * @generated
	 */
	EAttribute getMemoryMapping_MemorySectionSymbolName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping <em>Swc Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping
	 * @generated
	 */
	EClass getSwcMemoryMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping <em>Bsw Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping
	 * @generated
	 */
	EClass getBswMemoryMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup <em>Global Variable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup
	 * @generated
	 */
	EClass getGlobalVariableGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup#getGlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Global Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup#getGlobalVariable()
	 * @see #getGlobalVariableGroup()
	 * @generated
	 */
	EReference getGlobalVariableGroup_GlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup#getMemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup#getMemoryMapping()
	 * @see #getGlobalVariableGroup()
	 * @generated
	 */
	EReference getGlobalVariableGroup_MemoryMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup <em>Function Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup
	 * @generated
	 */
	EClass getFunctionGroup();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup#getMemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup#getMemoryMapping()
	 * @see #getFunctionGroup()
	 * @generated
	 */
	EReference getFunctionGroup_MemoryMapping();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionGroup#getFunction()
	 * @see #getFunctionGroup()
	 * @generated
	 */
	EReference getFunctionGroup_Function();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup <em>Rte Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup
	 * @generated
	 */
	EClass getRteApiGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup#getRteApi <em>Rte Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rte Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup#getRteApi()
	 * @see #getRteApiGroup()
	 * @generated
	 */
	EReference getRteApiGroup_RteApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Lifecycle Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup
	 * @generated
	 */
	EClass getRteLifecycleApiGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup#getRteLifecycleApi <em>Rte Lifecycle Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rte Lifecycle Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup#getRteLifecycleApi()
	 * @see #getRteLifecycleApiGroup()
	 * @generated
	 */
	EReference getRteLifecycleApiGroup_RteLifecycleApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup <em>Task Body Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Body Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup
	 * @generated
	 */
	EClass getTaskBodyGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup#getTaskBody <em>Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup#getTaskBody()
	 * @see #getTaskBodyGroup()
	 * @generated
	 */
	EReference getTaskBodyGroup_TaskBody();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Schedulable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup
	 * @generated
	 */
	EClass getBswSchedulableEntityGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup#getBswSchedulableEntity <em>Bsw Schedulable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bsw Schedulable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup#getBswSchedulableEntity()
	 * @see #getBswSchedulableEntityGroup()
	 * @generated
	 */
	EReference getBswSchedulableEntityGroup_BswSchedulableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup <em>Com Callback Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Callback Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup
	 * @generated
	 */
	EClass getComCallbackGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup#getComCallback <em>Com Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Com Callback</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup#getComCallback()
	 * @see #getComCallbackGroup()
	 * @generated
	 */
	EReference getComCallbackGroup_ComCallback();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup <em>Trusted Function Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup
	 * @generated
	 */
	EClass getTrustedFunctionGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup#getTrustedFunction <em>Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup#getTrustedFunction()
	 * @see #getTrustedFunctionGroup()
	 * @generated
	 */
	EReference getTrustedFunctionGroup_TrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup <em>Executable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup
	 * @generated
	 */
	EClass getExecutableEntityGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup#getExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup#getExecutableEntity()
	 * @see #getExecutableEntityGroup()
	 * @generated
	 */
	EReference getExecutableEntityGroup_ExecutableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader <em>Bsw Memory Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Memory Mapping Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader
	 * @generated
	 */
	EClass getBswMemoryMappingHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader#getMemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader#getMemoryMapping()
	 * @see #getBswMemoryMappingHeader()
	 * @generated
	 */
	EReference getBswMemoryMappingHeader_MemoryMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader <em>Swc Memory Mapping Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swc Memory Mapping Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader
	 * @generated
	 */
	EClass getSwcMemoryMappingHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader#getMemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader#getMemoryMapping()
	 * @see #getSwcMemoryMappingHeader()
	 * @generated
	 */
	EReference getSwcMemoryMappingHeader_MemoryMapping();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo <em>Generation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Info</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo
	 * @generated
	 */
	EClass getGenerationInfo();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo#getGeneratorName <em>Generator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo#getGeneratorName()
	 * @see #getGenerationInfo()
	 * @generated
	 */
	EAttribute getGenerationInfo_GeneratorName();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo#getGeneratorVersion <em>Generator Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Version</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo#getGeneratorVersion()
	 * @see #getGenerationInfo()
	 * @generated
	 */
	EAttribute getGenerationInfo_GeneratorVersion();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo#getGenerationDate <em>Generation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Date</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo#getGenerationDate()
	 * @see #getGenerationInfo()
	 * @generated
	 */
	EAttribute getGenerationInfo_GenerationDate();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro
	 * @generated
	 */
	EClass getMacro();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro#getSymbolName()
	 * @see #getMacro()
	 * @generated
	 */
	EAttribute getMacro_SymbolName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi <em>Schm Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi
	 * @generated
	 */
	EClass getSchmApi();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi#getReturnValue()
	 * @see #getSchmApi()
	 * @generated
	 */
	EReference getSchmApi_ReturnValue();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi#getParent()
	 * @see #getSchmApi()
	 * @generated
	 */
	EReference getSchmApi_Parent();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi <em>Schm Lifecycle Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Lifecycle Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi
	 * @generated
	 */
	EClass getSchmLifecycleApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi <em>Schm Enter Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Enter Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi
	 * @generated
	 */
	EClass getSchmEnterApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmEnterApi#getOperation()
	 * @see #getSchmEnterApi()
	 * @generated
	 */
	EReference getSchmEnterApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi <em>Schm Exit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Exit Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi
	 * @generated
	 */
	EClass getSchmExitApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmExitApi#getOperation()
	 * @see #getSchmExitApi()
	 * @generated
	 */
	EReference getSchmExitApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader <em>Interlink Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interlink Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader
	 * @generated
	 */
	EClass getModuleInterlinkHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getSchmApiGroup <em>Schm Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schm Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getSchmApiGroup()
	 * @see #getModuleInterlinkHeader()
	 * @generated
	 */
	EReference getModuleInterlinkHeader_SchmApiGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Executable Entity Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getDependentExecutableEntityGroup()
	 * @see #getModuleInterlinkHeader()
	 * @generated
	 */
	EReference getModuleInterlinkHeader_DependentExecutableEntityGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getConstant()
	 * @see #getModuleInterlinkHeader()
	 * @generated
	 */
	EReference getModuleInterlinkHeader_Constant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup <em>Schm Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup
	 * @generated
	 */
	EClass getSchmApiGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup#getSchmApi <em>Schm Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schm Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup#getSchmApi()
	 * @see #getSchmApiGroup()
	 * @generated
	 */
	EReference getSchmApiGroup_SchmApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader <em>Interlink Type Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interlink Type Header</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader
	 * @generated
	 */
	EClass getModuleInterlinkTypeHeader();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader#getConstant()
	 * @see #getModuleInterlinkTypeHeader()
	 * @generated
	 */
	EReference getModuleInterlinkTypeHeader_Constant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Lifecycle Api Group</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup
	 * @generated
	 */
	EClass getSchmLifecycleApiGroup();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup#getSchmLifecycleApi <em>Schm Lifecycle Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schm Lifecycle Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup#getSchmLifecycleApi()
	 * @see #getSchmLifecycleApiGroup()
	 * @generated
	 */
	EReference getSchmLifecycleApiGroup_SchmLifecycleApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm <em>Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parted Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm
	 * @generated
	 */
	EClass getPartedBswm();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getParent()
	 * @see #getPartedBswm()
	 * @generated
	 */
	EReference getPartedBswm_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getDependentExecutableEntity <em>Dependent Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getDependentExecutableEntity()
	 * @see #getPartedBswm()
	 * @generated
	 */
	EReference getPartedBswm_DependentExecutableEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getSchmApi <em>Schm Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schm Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getSchmApi()
	 * @see #getPartedBswm()
	 * @generated
	 */
	EReference getPartedBswm_SchmApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswMemoryMapping <em>Bsw Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bsw Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswMemoryMapping()
	 * @see #getPartedBswm()
	 * @generated
	 */
	EReference getPartedBswm_BswMemoryMapping();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswm <em>Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswm()
	 * @see #getPartedBswm()
	 * @generated
	 */
	EReference getPartedBswm_Bswm();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm <em>Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm
	 * @generated
	 */
	EClass getBswm();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm#getPartedBswm <em>Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parted Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm#getPartedBswm()
	 * @see #getBswm()
	 * @generated
	 */
	EReference getBswm_PartedBswm();

	/**
	 * Returns the meta object for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm#getSinglePartedBswm(jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition) <em>Get Single Parted Bswm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Single Parted Bswm</em>' operation.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm#getSinglePartedBswm(jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition)
	 * @generated
	 */
	EOperation getBswm__GetSinglePartedBswm__Partition();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi <em>Schm Deinit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Deinit Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi
	 * @generated
	 */
	EClass getSchmDeinitApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi <em>Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Init Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi
	 * @generated
	 */
	EClass getSchmInitApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi <em>Singlecore Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singlecore Schm Init Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi
	 * @generated
	 */
	EClass getSinglecoreSchmInitApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreSchmInitApi#getOperation()
	 * @see #getSinglecoreSchmInitApi()
	 * @generated
	 */
	EReference getSinglecoreSchmInitApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi <em>Multicore Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicore Schm Init Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi
	 * @generated
	 */
	EClass getMulticoreSchmInitApi();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi#getCoreInitApiImpl <em>Core Init Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Core Init Api Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi#getCoreInitApiImpl()
	 * @see #getMulticoreSchmInitApi()
	 * @generated
	 */
	EReference getMulticoreSchmInitApi_CoreInitApiImpl();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schm Core Init Api Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl
	 * @generated
	 */
	EClass getSchmCoreInitApiImpl();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl#getParent()
	 * @see #getSchmCoreInitApiImpl()
	 * @generated
	 */
	EReference getSchmCoreInitApiImpl_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl#getOperation()
	 * @see #getSchmCoreInitApiImpl()
	 * @generated
	 */
	EReference getSchmCoreInitApiImpl_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi <em>Restart Partition Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restart Partition Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi
	 * @generated
	 */
	EClass getRestartPartitionApi();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi#getEReference0()
	 * @see #getRestartPartitionApi()
	 * @generated
	 */
	EReference getRestartPartitionApi_EReference0();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi#getEReference1()
	 * @see #getRestartPartitionApi()
	 * @generated
	 */
	EReference getRestartPartitionApi_EReference1();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RestartPartitionApi#getOperation()
	 * @see #getRestartPartitionApi()
	 * @generated
	 */
	EReference getRestartPartitionApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi <em>Partition Restarting Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Restarting Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi
	 * @generated
	 */
	EClass getPartitionRestartingApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionRestartingApi#getOperation()
	 * @see #getPartitionRestartingApi()
	 * @generated
	 */
	EReference getPartitionRestartingApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi <em>Partition Terminated Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Terminated Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi
	 * @generated
	 */
	EClass getPartitionTerminatedApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi#getOperation()
	 * @see #getPartitionTerminatedApi()
	 * @generated
	 */
	EReference getPartitionTerminatedApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi <em>Rte Lifecycle Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Lifecycle Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApi
	 * @generated
	 */
	EClass getRteLifecycleApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi <em>Send Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi
	 * @generated
	 */
	EClass getSendApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getOperation()
	 * @see #getSendApi()
	 * @generated
	 */
	EReference getSendApi_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getDataParam <em>Data Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getDataParam()
	 * @see #getSendApi()
	 * @generated
	 */
	EReference getSendApi_DataParam();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getStatusVariable <em>Status Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getStatusVariable()
	 * @see #getSendApi()
	 * @generated
	 */
	EReference getSendApi_StatusVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trusted Function Param Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getTrustedFunctionParamVariable()
	 * @see #getSendApi()
	 * @generated
	 */
	EReference getSendApi_TrustedFunctionParamVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getFilterResultVariable <em>Filter Result Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Result Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getFilterResultVariable()
	 * @see #getSendApi()
	 * @generated
	 */
	EReference getSendApi_FilterResultVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi <em>Receive Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi
	 * @generated
	 */
	EClass getReceiveApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi#getOperation()
	 * @see #getReceiveApi()
	 * @generated
	 */
	EReference getReceiveApi_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi#getDataParam <em>Data Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi#getDataParam()
	 * @see #getReceiveApi()
	 * @generated
	 */
	EReference getReceiveApi_DataParam();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi#getStatusVariable <em>Status Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReceiveApi#getStatusVariable()
	 * @see #getReceiveApi()
	 * @generated
	 */
	EReference getReceiveApi_StatusVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation <em>Rte Buffer Queued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Queued Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation
	 * @generated
	 */
	EClass getRteBufferQueuedSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation#getAccessVariable <em>Access Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation#getAccessVariable()
	 * @see #getRteBufferQueuedSendOperation()
	 * @generated
	 */
	EReference getRteBufferQueuedSendOperation_AccessVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation#getTempReturnVariable <em>Temp Return Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temp Return Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedSendOperation#getTempReturnVariable()
	 * @see #getRteBufferQueuedSendOperation()
	 * @generated
	 */
	EReference getRteBufferQueuedSendOperation_TempReturnVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable <em>Rte Buffer Queued Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Queued Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable
	 * @generated
	 */
	EClass getRteBufferQueuedVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable#getQueueType <em>Queue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedVariable#getQueueType()
	 * @see #getRteBufferQueuedVariable()
	 * @generated
	 */
	EReference getRteBufferQueuedVariable_QueueType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation <em>Rte Buffer Queued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Queued Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation
	 * @generated
	 */
	EClass getRteBufferQueuedReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation#getAccessVariable <em>Access Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueuedReadOperation#getAccessVariable()
	 * @see #getRteBufferQueuedReadOperation()
	 * @generated
	 */
	EReference getRteBufferQueuedReadOperation_AccessVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication <em>Ioc Queued Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Queued Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication
	 * @generated
	 */
	EClass getIocQueuedCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getSendApi <em>Send Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getSendApi()
	 * @see #getIocQueuedCommunication()
	 * @generated
	 */
	EReference getIocQueuedCommunication_SendApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getReceiveApi <em>Receive Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getReceiveApi()
	 * @see #getIocQueuedCommunication()
	 * @generated
	 */
	EReference getIocQueuedCommunication_ReceiveApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getIocEmptyQueueApi <em>Ioc Empty Queue Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ioc Empty Queue Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedCommunication#getIocEmptyQueueApi()
	 * @see #getIocQueuedCommunication()
	 * @generated
	 */
	EReference getIocQueuedCommunication_IocEmptyQueueApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi <em>Ioc Receive Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Receive Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveApi
	 * @generated
	 */
	EClass getIocReceiveApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi <em>Ioc Send Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Send Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendApi
	 * @generated
	 */
	EClass getIocSendApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation <em>Ioc Queued Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Queued Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation
	 * @generated
	 */
	EClass getIocQueuedSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedSendOperation#getAccessApi()
	 * @see #getIocQueuedSendOperation()
	 * @generated
	 */
	EReference getIocQueuedSendOperation_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation <em>Ioc Queued Read Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Queued Read Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation
	 * @generated
	 */
	EClass getIocQueuedReadOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedReadOperation#getAccessApi()
	 * @see #getIocQueuedReadOperation()
	 * @generated
	 */
	EReference getIocQueuedReadOperation_AccessApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi <em>Call Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi
	 * @generated
	 */
	EClass getCallApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getOperation()
	 * @see #getCallApi()
	 * @generated
	 */
	EReference getCallApi_Operation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getOperationParam <em>Operation Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getOperationParam()
	 * @see #getCallApi()
	 * @generated
	 */
	EReference getCallApi_OperationParam();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getPortArgValue <em>Port Arg Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Arg Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getPortArgValue()
	 * @see #getCallApi()
	 * @generated
	 */
	EReference getCallApi_PortArgValue();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getReturnVariable <em>Return Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CallApi#getReturnVariable()
	 * @see #getCallApi()
	 * @generated
	 */
	EReference getCallApi_ReturnVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation <em>Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Start Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation
	 * @generated
	 */
	EClass getExecutableStartOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation#getExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation#getExcludeOperation()
	 * @see #getExecutableStartOperation()
	 * @generated
	 */
	EReference getExecutableStartOperation_ExcludeOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation#getStartExecutable <em>Start Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Executable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableStartOperation#getStartExecutable()
	 * @see #getExecutableStartOperation()
	 * @generated
	 */
	EReference getExecutableStartOperation_StartExecutable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity <em>Executable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity
	 * @generated
	 */
	EClass getExecutableEntity();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity#getRoleParam <em>Role Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Param</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity#getRoleParam()
	 * @see #getExecutableEntity()
	 * @generated
	 */
	EReference getExecutableEntity_RoleParam();

	/**
	 * Returns the meta object for the container reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity#getParentPartedBswm <em>Parent Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Parted Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntity#getParentPartedBswm()
	 * @see #getExecutableEntity()
	 * @generated
	 */
	EReference getExecutableEntity_ParentPartedBswm();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation
	 * @generated
	 */
	EClass getExcludeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation <em>All Interrupt Block Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Interrupt Block Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.AllInterruptBlockExcludeOperation
	 * @generated
	 */
	EClass getAllInterruptBlockExcludeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation <em>Os Interrupt Block Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Interrupt Block Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsInterruptBlockExcludeOperation
	 * @generated
	 */
	EClass getOsInterruptBlockExcludeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation <em>Os Spinlock Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Spinlock Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation
	 * @generated
	 */
	EClass getOsSpinlockExcludeOperation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation#getOsSpinlockId <em>Os Spinlock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Spinlock Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation#getOsSpinlockId()
	 * @see #getOsSpinlockExcludeOperation()
	 * @generated
	 */
	EAttribute getOsSpinlockExcludeOperation_OsSpinlockId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation <em>Os Resource Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Resource Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation
	 * @generated
	 */
	EClass getOsResourceExcludeOperation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation#getOsResourceId <em>Os Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Resource Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation#getOsResourceId()
	 * @see #getOsResourceExcludeOperation()
	 * @generated
	 */
	EAttribute getOsResourceExcludeOperation_OsResourceId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getSymbolName()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_SymbolName();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant#getConstantType()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_ConstantType();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity <em>Bsw Schedulable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bsw Schedulable Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity
	 * @generated
	 */
	EClass getBswSchedulableEntity();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi <em>Rte Enter Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Enter Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi
	 * @generated
	 */
	EClass getRteEnterApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteEnterApi#getOperation()
	 * @see #getRteEnterApi()
	 * @generated
	 */
	EReference getRteEnterApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi <em>Rte Exit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Exit Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi
	 * @generated
	 */
	EClass getRteExitApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi#getOperation()
	 * @see #getRteExitApi()
	 * @generated
	 */
	EReference getRteExitApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody <em>Os Task Activation Executable Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Task Activation Executable Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody
	 * @generated
	 */
	EClass getOsTaskActivationExecutableTaskBody();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationExecutableTaskBody#getOperation()
	 * @see #getOsTaskActivationExecutableTaskBody()
	 * @generated
	 */
	EReference getOsTaskActivationExecutableTaskBody_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody <em>Os Event Set Executable Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Event Set Executable Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody
	 * @generated
	 */
	EClass getOsEventSetExecutableTaskBody();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getOperation()
	 * @see #getOsEventSetExecutableTaskBody()
	 * @generated
	 */
	EReference getOsEventSetExecutableTaskBody_Operation();

	/**
	 * Returns the meta object for the attribute list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getOsEventId <em>Os Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Os Event Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getOsEventId()
	 * @see #getOsEventSetExecutableTaskBody()
	 * @generated
	 */
	EAttribute getOsEventSetExecutableTaskBody_OsEventId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getChecksOsEventId <em>Checks Os Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checks Os Event Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getChecksOsEventId()
	 * @see #getOsEventSetExecutableTaskBody()
	 * @generated
	 */
	EAttribute getOsEventSetExecutableTaskBody_ChecksOsEventId();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getEventVariable <em>Event Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getEventVariable()
	 * @see #getOsEventSetExecutableTaskBody()
	 * @generated
	 */
	EReference getOsEventSetExecutableTaskBody_EventVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation <em>Os Task Activation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Task Activation Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskActivationOperation
	 * @generated
	 */
	EClass getOsTaskActivationOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation <em>Os Event Set Activation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Event Set Activation Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation
	 * @generated
	 */
	EClass getOsEventSetActivationOperation();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation#getActivationOsEventId <em>Activation Os Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Os Event Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation#getActivationOsEventId()
	 * @see #getOsEventSetActivationOperation()
	 * @generated
	 */
	EAttribute getOsEventSetActivationOperation_ActivationOsEventId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation <em>Context Activation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Activation Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation
	 * @generated
	 */
	EClass getContextActivationOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation#getExecutableStartOperation <em>Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Start Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation#getExecutableStartOperation()
	 * @see #getContextActivationOperation()
	 * @generated
	 */
	EReference getContextActivationOperation_ExecutableStartOperation();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation#getCycleCountupOperation <em>Cycle Countup Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cycle Countup Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation#getCycleCountupOperation()
	 * @see #getContextActivationOperation()
	 * @generated
	 */
	EReference getContextActivationOperation_CycleCountupOperation();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation#getStartOffsetCountupOperation <em>Start Offset Countup Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Offset Countup Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ContextActivationOperation#getStartOffsetCountupOperation()
	 * @see #getContextActivationOperation()
	 * @generated
	 */
	EReference getContextActivationOperation_StartOffsetCountupOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation <em>Timing Triggering Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Triggering Executable Start Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation
	 * @generated
	 */
	EClass getTimingTriggeringExecutableStartOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCyclePeriodConstant <em>Cycle Period Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cycle Period Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCyclePeriodConstant()
	 * @see #getTimingTriggeringExecutableStartOperation()
	 * @generated
	 */
	EReference getTimingTriggeringExecutableStartOperation_CyclePeriodConstant();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleOffsetConstant <em>Cycle Offset Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cycle Offset Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleOffsetConstant()
	 * @see #getTimingTriggeringExecutableStartOperation()
	 * @generated
	 */
	EReference getTimingTriggeringExecutableStartOperation_CycleOffsetConstant();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetConstant <em>Start Offset Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Offset Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetConstant()
	 * @see #getTimingTriggeringExecutableStartOperation()
	 * @generated
	 */
	EReference getTimingTriggeringExecutableStartOperation_StartOffsetConstant();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetCounterVariable <em>Start Offset Counter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Offset Counter Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetCounterVariable()
	 * @see #getTimingTriggeringExecutableStartOperation()
	 * @generated
	 */
	EReference getTimingTriggeringExecutableStartOperation_StartOffsetCounterVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleCounterVariable <em>Cycle Counter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cycle Counter Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleCounterVariable()
	 * @see #getTimingTriggeringExecutableStartOperation()
	 * @generated
	 */
	EReference getTimingTriggeringExecutableStartOperation_CycleCounterVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation <em>Cycle Countup Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle Countup Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation
	 * @generated
	 */
	EClass getCycleCountupOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation#getCounterVariable <em>Counter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counter Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation#getCounterVariable()
	 * @see #getCycleCountupOperation()
	 * @generated
	 */
	EReference getCycleCountupOperation_CounterVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation#getMaxConstant <em>Max Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CycleCountupOperation#getMaxConstant()
	 * @see #getCycleCountupOperation()
	 * @generated
	 */
	EReference getCycleCountupOperation_MaxConstant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation <em>Start Offset Countup Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Offset Countup Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation
	 * @generated
	 */
	EClass getStartOffsetCountupOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getCounterVariable <em>Counter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counter Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getCounterVariable()
	 * @see #getStartOffsetCountupOperation()
	 * @generated
	 */
	EReference getStartOffsetCountupOperation_CounterVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getMaxConstant <em>Max Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getMaxConstant()
	 * @see #getStartOffsetCountupOperation()
	 * @generated
	 */
	EReference getStartOffsetCountupOperation_MaxConstant();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody <em>Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody
	 * @generated
	 */
	EClass getTaskBody();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody#getOsTaskId <em>Os Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Task Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody#getOsTaskId()
	 * @see #getTaskBody()
	 * @generated
	 */
	EAttribute getTaskBody_OsTaskId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi <em>Ioc Empty Queue Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Empty Queue Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi
	 * @generated
	 */
	EClass getIocEmptyQueueApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi <em>Com Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi
	 * @generated
	 */
	EClass getComApi();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi#getComSignalSymbolName <em>Com Signal Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Signal Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi#getComSignalSymbolName()
	 * @see #getComApi()
	 * @generated
	 */
	EAttribute getComApi_ComSignalSymbolName();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi <em>Ioc Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi
	 * @generated
	 */
	EClass getIocApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte
	 * @generated
	 */
	EClass getRte();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Core</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getCore()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_Core();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComCallback <em>Com Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Callback</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComCallback()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_ComCallback();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Send Signal Periodic Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalPeriodicEntity()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_ComSendSignalPeriodicEntity();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Send Signal Immediate Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateEntity()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_ComSendSignalImmediateEntity();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Send Signal Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTrustedFunction()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_ComSendSignalTrustedFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentType <em>Dependent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentType()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_DependentType();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteType <em>Rte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteType()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteType();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentOsApi <em>Dependent Os Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Os Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentOsApi()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_DependentOsApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentIocCommunication <em>Dependent Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentIocCommunication()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_DependentIocCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentComApi <em>Dependent Com Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Com Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentComApi()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_DependentComApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStartApi <em>Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Start Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStartApi()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteStartApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getIocInitValueConstant <em>Ioc Init Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ioc Init Value Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getIocInitValueConstant()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_IocInitValueConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentConstant <em>Dependent Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentConstant()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_DependentConstant();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Send Signal Immediate Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateTaskBody()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_ComSendSignalImmediateTaskBody();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStopApi <em>Rte Stop Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Stop Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStopApi()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteStopApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteTypeConstant <em>Rte Type Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Type Constant</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteTypeConstant()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteTypeConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteMemoryMapping <em>Rte Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Memory Mapping</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteMemoryMapping()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_RteMemoryMapping();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getGenerationInfo <em>Generation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation Info</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getGenerationInfo()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_GenerationInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getBswm <em>Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bswm</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getBswm()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_Bswm();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmInitApi <em>Schm Init Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schm Init Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmInitApi()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_SchmInitApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmDeinitApi <em>Schm Deinit Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schm Deinit Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmDeinitApi()
	 * @see #getRte()
	 * @generated
	 */
	EReference getRte_SchmDeinitApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction <em>Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction
	 * @generated
	 */
	EClass getTrustedFunction();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction#getTrustedFunctionIndex <em>Trusted Function Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trusted Function Index</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction#getTrustedFunctionIndex()
	 * @see #getTrustedFunction()
	 * @generated
	 */
	EAttribute getTrustedFunction_TrustedFunctionIndex();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Signal Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction
	 * @generated
	 */
	EClass getComSendSignalTrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi <em>Os Set Event Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Set Event Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi
	 * @generated
	 */
	EClass getOsSetEventApi();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsTaskId <em>Os Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Task Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsTaskId()
	 * @see #getOsSetEventApi()
	 * @generated
	 */
	EAttribute getOsSetEventApi_OsTaskId();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsEventId <em>Os Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Event Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsEventId()
	 * @see #getOsSetEventApi()
	 * @generated
	 */
	EAttribute getOsSetEventApi_OsEventId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi <em>Os Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi
	 * @generated
	 */
	EClass getOsApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Signal Immediate Task Body</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody
	 * @generated
	 */
	EClass getComSendSignalImmediateTaskBody();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody#getStartEntity <em>Start Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Entity</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody#getStartEntity()
	 * @see #getComSendSignalImmediateTaskBody()
	 * @generated
	 */
	EReference getComSendSignalImmediateTaskBody_StartEntity();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody#getOsEventId <em>Os Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Event Id</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody#getOsEventId()
	 * @see #getComSendSignalImmediateTaskBody()
	 * @generated
	 */
	EAttribute getComSendSignalImmediateTaskBody_OsEventId();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getSymbolName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_SymbolName();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getMember()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Member();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation <em>Com Send Proxy Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Send Proxy Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation
	 * @generated
	 */
	EClass getComSendProxyOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation#getReadValueVariable <em>Read Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read Value Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation#getReadValueVariable()
	 * @see #getComSendProxyOperation()
	 * @generated
	 */
	EReference getComSendProxyOperation_ReadValueVariable();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation#getAccessApi <em>Access Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation#getAccessApi()
	 * @see #getComSendProxyOperation()
	 * @generated
	 */
	EReference getComSendProxyOperation_AccessApi();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation#getSignalIdVariable <em>Signal Id Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Id Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendProxyOperation#getSignalIdVariable()
	 * @see #getComSendProxyOperation()
	 * @generated
	 */
	EReference getComSendProxyOperation_SignalIdVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi <em>Ioc Receive Group Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Receive Group Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocReceiveGroupApi
	 * @generated
	 */
	EClass getIocReceiveGroupApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot
	 * @generated
	 */
	EClass getModuleRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRteModule <em>Rte Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte Module</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRteModule()
	 * @see #getModuleRoot()
	 * @generated
	 */
	EReference getModuleRoot_RteModule();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rte</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRte()
	 * @see #getModuleRoot()
	 * @generated
	 */
	EReference getModuleRoot_Rte();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation <em>Inter Partition Timeout Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Partition Timeout Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation
	 * @generated
	 */
	EClass getInterPartitionTimeoutOperation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation#getTimeoutVariable <em>Timeout Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeout Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation#getTimeoutVariable()
	 * @see #getInterPartitionTimeoutOperation()
	 * @generated
	 */
	EReference getInterPartitionTimeoutOperation_TimeoutVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation#getExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation#getExcludeOperation()
	 * @see #getInterPartitionTimeoutOperation()
	 * @generated
	 */
	EReference getInterPartitionTimeoutOperation_ExcludeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation <em>Initialize Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialize Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation
	 * @generated
	 */
	EClass getInitializeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation <em>Variable Initialize Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Initialize Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation
	 * @generated
	 */
	EClass getVariableInitializeOperation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getInitVariable <em>Init Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getInitVariable()
	 * @see #getVariableInitializeOperation()
	 * @generated
	 */
	EReference getVariableInitializeOperation_InitVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getExcludeOperation <em>Exclude Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation#getExcludeOperation()
	 * @see #getVariableInitializeOperation()
	 * @generated
	 */
	EReference getVariableInitializeOperation_ExcludeOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation <em>Ioc Initialize Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Initialize Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation
	 * @generated
	 */
	EClass getIocInitializeOperation();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation#getInitIocApi <em>Init Ioc Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Ioc Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation#getInitIocApi()
	 * @see #getIocInitializeOperation()
	 * @generated
	 */
	EReference getIocInitializeOperation_InitIocApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSuspendAllInterruptsApi <em>Os Suspend All Interrupts Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Suspend All Interrupts Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSuspendAllInterruptsApi
	 * @generated
	 */
	EClass getOsSuspendAllInterruptsApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsGetSpinlockApi <em>Os Get Spinlock Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Get Spinlock Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsGetSpinlockApi
	 * @generated
	 */
	EClass getOsGetSpinlockApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi <em>Multicore Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicore Rte Start Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi
	 * @generated
	 */
	EClass getMulticoreRteStartApi();

	/**
	 * Returns the meta object for the reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi#getCoreStartApiImpl <em>Core Start Api Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Core Start Api Impl</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi#getCoreStartApiImpl()
	 * @see #getMulticoreRteStartApi()
	 * @generated
	 */
	EReference getMulticoreRteStartApi_CoreStartApiImpl();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction <em>Rte Buffer Write Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Buffer Write Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction
	 * @generated
	 */
	EClass getRteBufferWriteTrustedFunction();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction#getOperation()
	 * @see #getRteBufferWriteTrustedFunction()
	 * @generated
	 */
	EReference getRteBufferWriteTrustedFunction_Operation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction#getDataVariable <em>Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Variable</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferWriteTrustedFunction#getDataVariable()
	 * @see #getRteBufferWriteTrustedFunction()
	 * @generated
	 */
	EReference getRteBufferWriteTrustedFunction_DataVariable();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation <em>Trusted Function Rte Buffer Write Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation
	 * @generated
	 */
	EClass getTrustedFunctionRteBufferWriteSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Trusted Function</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation#getAccessTrustedFunction()
	 * @see #getTrustedFunctionRteBufferWriteSendOperation()
	 * @generated
	 */
	EReference getTrustedFunctionRteBufferWriteSendOperation_AccessTrustedFunction();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication <em>Ioc Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication
	 * @generated
	 */
	EClass getIocCommunication();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation <em>Proxy Com Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Com Send Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation
	 * @generated
	 */
	EClass getProxyComSendOperation();

	/**
	 * Returns the meta object for the reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getAccessProxyApi <em>Access Proxy Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Proxy Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyComSendOperation#getAccessProxyApi()
	 * @see #getProxyComSendOperation()
	 * @generated
	 */
	EReference getProxyComSendOperation_AccessProxyApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi <em>Ioc Send Group Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Send Group Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocSendGroupApi
	 * @generated
	 */
	EClass getIocSendGroupApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication <em>Ioc Queued Group Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Queued Group Communication</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication
	 * @generated
	 */
	EClass getIocQueuedGroupCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getReceiveApi <em>Receive Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getReceiveApi()
	 * @see #getIocQueuedGroupCommunication()
	 * @generated
	 */
	EReference getIocQueuedGroupCommunication_ReceiveApi();

	/**
	 * Returns the meta object for the containment reference '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getSendApi <em>Send Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocQueuedGroupCommunication#getSendApi()
	 * @see #getIocQueuedGroupCommunication()
	 * @generated
	 */
	EReference getIocQueuedGroupCommunication_SendApi();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectExecutableStartOperation <em>Direct Executable Start Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Executable Start Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.DirectExecutableStartOperation
	 * @generated
	 */
	EClass getDirectExecutableStartOperation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi <em>Singlecore Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singlecore Rte Start Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi
	 * @generated
	 */
	EClass getSinglecoreRteStartApi();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SinglecoreRteStartApi#getOperation()
	 * @see #getSinglecoreRteStartApi()
	 * @generated
	 */
	EReference getSinglecoreRteStartApi_Operation();

	/**
	 * Returns the meta object for class '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi <em>Rte Start Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Start Api</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi
	 * @generated
	 */
	EClass getRteStartApi();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum <em>Parameter Pass Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Pass Type Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum
	 * @generated
	 */
	EEnum getParameterPassTypeEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum <em>Signedness Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signedness Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum
	 * @generated
	 */
	EEnum getSignednessEnum();

	/**
	 * Returns the meta object for enum '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum <em>Constant Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constant Type Enum</em>'.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum
	 * @generated
	 */
	EEnum getConstantTypeEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Verbatim String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verbatim String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getVerbatimString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CIdentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CIdentifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModuleFactory getModuleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleObjectImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleObject()
		 * @generated
		 */
		EClass MODULE_OBJECT = eINSTANCE.getModuleObject();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_OBJECT__SOURCE = eINSTANCE.getModuleObject_Source();

		/**
		 * The meta object literal for the '<em><b>Single Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_OBJECT__SINGLE_SOURCE = eINSTANCE.getModuleObject_SingleSource();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_OBJECT__ROLE_NAME = eINSTANCE.getModuleObject_RoleName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleReferrableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleReferrable()
		 * @generated
		 */
		EClass MODULE_REFERRABLE = eINSTANCE.getModuleReferrable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_REFERRABLE__ID = eINSTANCE.getModuleReferrable_Id();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.WriteApiImpl <em>Write Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.WriteApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getWriteApi()
		 * @generated
		 */
		EClass WRITE_API = eINSTANCE.getWriteApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_API__OPERATION = eINSTANCE.getWriteApi_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_API__DATA_PARAM = eINSTANCE.getWriteApi_DataParam();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl <em>Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSendOperation()
		 * @generated
		 */
		EClass SEND_OPERATION = eINSTANCE.getSendOperation();

		/**
		 * The meta object literal for the '<em><b>Send Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OPERATION__SEND_VALUE = eINSTANCE.getSendOperation_SendValue();

		/**
		 * The meta object literal for the '<em><b>Send Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OPERATION__SEND_STATUS = eINSTANCE.getSendOperation_SendStatus();

		/**
		 * The meta object literal for the '<em><b>Exclude Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OPERATION__EXCLUDE_OPERATION = eINSTANCE.getSendOperation_ExcludeOperation();

		/**
		 * The meta object literal for the '<em><b>Return Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OPERATION__RETURN_VARIABLE = eINSTANCE.getSendOperation_ReturnVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl <em>Rte Buffer Nonqueued Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferNonqueuedSendOperation()
		 * @generated
		 */
		EClass RTE_BUFFER_NONQUEUED_SEND_OPERATION = eINSTANCE.getRteBufferNonqueuedSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_NONQUEUED_SEND_OPERATION__ACCESS_VARIABLE = eINSTANCE.getRteBufferNonqueuedSendOperation_AccessVariable();

		/**
		 * The meta object literal for the '<em><b>Filter Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_NONQUEUED_SEND_OPERATION__FILTER_OPERATION = eINSTANCE.getRteBufferNonqueuedSendOperation_FilterOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedReadOperationImpl <em>Rte Buffer Nonqueued Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferNonqueuedReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferNonqueuedReadOperation()
		 * @generated
		 */
		EClass RTE_BUFFER_NONQUEUED_READ_OPERATION = eINSTANCE.getRteBufferNonqueuedReadOperation();

		/**
		 * The meta object literal for the '<em><b>Access Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_NONQUEUED_READ_OPERATION__ACCESS_VARIABLE = eINSTANCE.getRteBufferNonqueuedReadOperation_AccessVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl <em>Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getReadOperation()
		 * @generated
		 */
		EClass READ_OPERATION = eINSTANCE.getReadOperation();

		/**
		 * The meta object literal for the '<em><b>Invalid Value Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_OPERATION__INVALID_VALUE_CONSTANT = eINSTANCE.getReadOperation_InvalidValueConstant();

		/**
		 * The meta object literal for the '<em><b>Read Value Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_OPERATION__READ_VALUE_VARIABLE = eINSTANCE.getReadOperation_ReadValueVariable();

		/**
		 * The meta object literal for the '<em><b>Read Status Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_OPERATION__READ_STATUS_VARIABLE = eINSTANCE.getReadOperation_ReadStatusVariable();

		/**
		 * The meta object literal for the '<em><b>Exclude Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_OPERATION__EXCLUDE_OPERATION = eINSTANCE.getReadOperation_ExcludeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadApiImpl <em>Read Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getReadApi()
		 * @generated
		 */
		EClass READ_API = eINSTANCE.getReadApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_API__OPERATION = eINSTANCE.getReadApi_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_API__DATA_PARAM = eINSTANCE.getReadApi_DataParam();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl <em>Rte Buffer Variable Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferVariableSetImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferVariableSet()
		 * @generated
		 */
		EClass RTE_BUFFER_VARIABLE_SET = eINSTANCE.getRteBufferVariableSet();

		/**
		 * The meta object literal for the '<em><b>Value Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE = eINSTANCE.getRteBufferVariableSet_ValueVariable();

		/**
		 * The meta object literal for the '<em><b>Status Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE = eINSTANCE.getRteBufferVariableSet_StatusVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl <em>Rte Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteSource()
		 * @generated
		 */
		EClass RTE_SOURCE = eINSTANCE.getRteSource();

		/**
		 * The meta object literal for the '<em><b>Global Variable Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__GLOBAL_VARIABLE_GROUP = eINSTANCE.getRteSource_GlobalVariableGroup();

		/**
		 * The meta object literal for the '<em><b>Bsw Schedulable Entity Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP = eINSTANCE.getRteSource_BswSchedulableEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Rte Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__RTE_API_GROUP = eINSTANCE.getRteSource_RteApiGroup();

		/**
		 * The meta object literal for the '<em><b>Rte Lifecycle Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__RTE_LIFECYCLE_API_GROUP = eINSTANCE.getRteSource_RteLifecycleApiGroup();

		/**
		 * The meta object literal for the '<em><b>Task Body Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__TASK_BODY_GROUP = eINSTANCE.getRteSource_TaskBodyGroup();

		/**
		 * The meta object literal for the '<em><b>Com Callback Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__COM_CALLBACK_GROUP = eINSTANCE.getRteSource_ComCallbackGroup();

		/**
		 * The meta object literal for the '<em><b>Trusted Function Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__TRUSTED_FUNCTION_GROUP = eINSTANCE.getRteSource_TrustedFunctionGroup();

		/**
		 * The meta object literal for the '<em><b>Source Macro</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__SOURCE_MACRO = eINSTANCE.getRteSource_SourceMacro();

		/**
		 * The meta object literal for the '<em><b>Schm Lifecycle Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP = eINSTANCE.getRteSource_SchmLifecycleApiGroup();

		/**
		 * The meta object literal for the '<em><b>Schm Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_SOURCE__SCHM_API_GROUP = eINSTANCE.getRteSource_SchmApiGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl <em>Rte Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApi()
		 * @generated
		 */
		EClass RTE_API = eINSTANCE.getRteApi();

		/**
		 * The meta object literal for the '<em><b>Api Mapping Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_API__API_MAPPING_NAME = eINSTANCE.getRteApi_ApiMappingName();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_API__RETURN_VALUE = eINSTANCE.getRteApi_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_API__IS_CONNECTED = eINSTANCE.getRteApi_IsConnected();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_API__PARENT = eINSTANCE.getRteApi_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl <em>Rte Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteModuleImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteModule()
		 * @generated
		 */
		EClass RTE_MODULE = eINSTANCE.getRteModule();

		/**
		 * The meta object literal for the '<em><b>Rte Common Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_COMMON_SOURCE = eINSTANCE.getRteModule_RteCommonSource();

		/**
		 * The meta object literal for the '<em><b>Rte Partition Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_PARTITION_SOURCE = eINSTANCE.getRteModule_RtePartitionSource();

		/**
		 * The meta object literal for the '<em><b>Rte Application Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_APPLICATION_HEADER = eINSTANCE.getRteModule_RteApplicationHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Application Type Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_APPLICATION_TYPE_HEADER = eINSTANCE.getRteModule_RteApplicationTypeHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Lifecycle Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_LIFECYCLE_HEADER = eINSTANCE.getRteModule_RteLifecycleHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Callback Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_CALLBACK_HEADER = eINSTANCE.getRteModule_RteCallbackHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Configuration Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_CONFIGURATION_HEADER = eINSTANCE.getRteModule_RteConfigurationHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Vfb Trace Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_VFB_TRACE_HEADER = eINSTANCE.getRteModule_RteVfbTraceHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Type Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_TYPE_HEADER = eINSTANCE.getRteModule_RteTypeHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_HEADER = eINSTANCE.getRteModule_RteHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Common Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_COMMON_HEADER = eINSTANCE.getRteModule_RteCommonHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Partition Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_PARTITION_HEADER = eINSTANCE.getRteModule_RtePartitionHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Utility Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__RTE_UTILITY_HEADER = eINSTANCE.getRteModule_RteUtilityHeader();

		/**
		 * The meta object literal for the '<em><b>Dependent Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__DEPENDENT_HEADER = eINSTANCE.getRteModule_DependentHeader();

		/**
		 * The meta object literal for the '<em><b>Bsw Memory Mapping Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__BSW_MEMORY_MAPPING_HEADER = eINSTANCE.getRteModule_BswMemoryMappingHeader();

		/**
		 * The meta object literal for the '<em><b>Swc Memory Mapping Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__SWC_MEMORY_MAPPING_HEADER = eINSTANCE.getRteModule_SwcMemoryMappingHeader();

		/**
		 * The meta object literal for the '<em><b>Module Interlink Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__MODULE_INTERLINK_HEADER = eINSTANCE.getRteModule_ModuleInterlinkHeader();

		/**
		 * The meta object literal for the '<em><b>Module Interlink Type Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER = eINSTANCE.getRteModule_ModuleInterlinkTypeHeader();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Init Value Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__INIT_VALUE_CONSTANT = eINSTANCE.getGlobalVariable_InitValueConstant();

		/**
		 * The meta object literal for the '<em><b>Memory Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__MEMORY_MAPPING = eINSTANCE.getGlobalVariable_MemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Init At Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__INIT_AT_DEFINITION = eINSTANCE.getGlobalVariable_InitAtDefinition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FileImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_NAME = eINSTANCE.getFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Generation Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__GENERATION_INFO = eINSTANCE.getFile_GenerationInfo();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ParameterImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Pass Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PASS_TYPE = eINSTANCE.getParameter_PassType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SYMBOL_NAME = eINSTANCE.getType_SymbolName();

		/**
		 * The meta object literal for the '<em><b>Is Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__IS_ANONYMOUS = eINSTANCE.getType_IsAnonymous();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LocalVariableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Init Value Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__INIT_VALUE_CONSTANT = eINSTANCE.getLocalVariable_InitValueConstant();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__PARENT = eINSTANCE.getLocalVariable_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl <em>Rte Application Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApplicationHeader()
		 * @generated
		 */
		EClass RTE_APPLICATION_HEADER = eINSTANCE.getRteApplicationHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_APPLICATION_HEADER__RTE_API_GROUP = eINSTANCE.getRteApplicationHeader_RteApiGroup();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_APPLICATION_HEADER__CONSTANT = eINSTANCE.getRteApplicationHeader_Constant();

		/**
		 * The meta object literal for the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP = eINSTANCE.getRteApplicationHeader_DependentExecutableEntityGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__SYMBOL_NAME = eINSTANCE.getFunction_SymbolName();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAM = eINSTANCE.getFunction_Param();

		/**
		 * The meta object literal for the '<em><b>Local Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__LOCAL_VARIABLE = eINSTANCE.getFunction_LocalVariable();

		/**
		 * The meta object literal for the '<em><b>Local Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__LOCAL_TYPE = eINSTANCE.getFunction_LocalType();

		/**
		 * The meta object literal for the '<em><b>Memory Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__MEMORY_MAPPING = eINSTANCE.getFunction_MemoryMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LogicalCompartmentImpl <em>Logical Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.LogicalCompartmentImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getLogicalCompartment()
		 * @generated
		 */
		EClass LOGICAL_COMPARTMENT = eINSTANCE.getLogicalCompartment();

		/**
		 * The meta object literal for the '<em><b>Compartment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_COMPARTMENT__COMPARTMENT_NAME = eINSTANCE.getLogicalCompartment_CompartmentName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__PARTITION = eINSTANCE.getCore_Partition();

		/**
		 * The meta object literal for the '<em><b>Rte Start Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__RTE_START_API = eINSTANCE.getCore_RteStartApi();

		/**
		 * The meta object literal for the '<em><b>Core Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__CORE_ID = eINSTANCE.getCore_CoreId();

		/**
		 * The meta object literal for the '<em><b>Is Master Core</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__IS_MASTER_CORE = eINSTANCE.getCore_IsMasterCore();

		/**
		 * The meta object literal for the '<em><b>Schm Init Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__SCHM_INIT_API = eINSTANCE.getCore_SchmInitApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Is Bsw Partition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__IS_BSW_PARTITION = eINSTANCE.getPartition_IsBswPartition();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARENT = eINSTANCE.getPartition_Parent();

		/**
		 * The meta object literal for the '<em><b>Swc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__SWC = eINSTANCE.getPartition_Swc();

		/**
		 * The meta object literal for the '<em><b>Rte Buffer Variable Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__RTE_BUFFER_VARIABLE_SET = eINSTANCE.getPartition_RteBufferVariableSet();

		/**
		 * The meta object literal for the '<em><b>Filter Old Value Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__FILTER_OLD_VALUE_VARIABLE = eINSTANCE.getPartition_FilterOldValueVariable();

		/**
		 * The meta object literal for the '<em><b>Filter Occurrence Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__FILTER_OCCURRENCE_VARIABLE = eINSTANCE.getPartition_FilterOccurrenceVariable();

		/**
		 * The meta object literal for the '<em><b>Restart Partition Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__RESTART_PARTITION_API = eINSTANCE.getPartition_RestartPartitionApi();

		/**
		 * The meta object literal for the '<em><b>Partition Terminated Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTITION_TERMINATED_API = eINSTANCE.getPartition_PartitionTerminatedApi();

		/**
		 * The meta object literal for the '<em><b>Partition Restarting Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTITION_RESTARTING_API = eINSTANCE.getPartition_PartitionRestartingApi();

		/**
		 * The meta object literal for the '<em><b>Task Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__TASK_BODY = eINSTANCE.getPartition_TaskBody();

		/**
		 * The meta object literal for the '<em><b>Rte Buffer Queued Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__RTE_BUFFER_QUEUED_VARIABLE = eINSTANCE.getPartition_RteBufferQueuedVariable();

		/**
		 * The meta object literal for the '<em><b>Rte Buffer Init Value Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__RTE_BUFFER_INIT_VALUE_CONSTANT = eINSTANCE.getPartition_RteBufferInitValueConstant();

		/**
		 * The meta object literal for the '<em><b>Entity Start Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__ENTITY_START_VARIABLE = eINSTANCE.getPartition_EntityStartVariable();

		/**
		 * The meta object literal for the '<em><b>Entity Start Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__ENTITY_START_CONSTANT = eINSTANCE.getPartition_EntityStartConstant();

		/**
		 * The meta object literal for the '<em><b>Filter Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__FILTER_CONSTANT = eINSTANCE.getPartition_FilterConstant();

		/**
		 * The meta object literal for the '<em><b>Rte Buffer Send Trusted Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION = eINSTANCE.getPartition_RteBufferSendTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Os Trusted Macro</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__OS_TRUSTED_MACRO = eINSTANCE.getPartition_OsTrustedMacro();

		/**
		 * The meta object literal for the '<em><b>Parted Bswm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTED_BSWM = eINSTANCE.getPartition_PartedBswm();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl <em>Swc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSwc()
		 * @generated
		 */
		EClass SWC = eINSTANCE.getSwc();

		/**
		 * The meta object literal for the '<em><b>Filter Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__FILTER_CONSTANT = eINSTANCE.getSwc_FilterConstant();

		/**
		 * The meta object literal for the '<em><b>Port Arg Value Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__PORT_ARG_VALUE_CONSTANT = eINSTANCE.getSwc_PortArgValueConstant();

		/**
		 * The meta object literal for the '<em><b>Dependent Executable Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__DEPENDENT_EXECUTABLE_ENTITY = eINSTANCE.getSwc_DependentExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Invalid Value Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__INVALID_VALUE_CONSTANT = eINSTANCE.getSwc_InvalidValueConstant();

		/**
		 * The meta object literal for the '<em><b>Impl Init Value Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__IMPL_INIT_VALUE_CONSTANT = eINSTANCE.getSwc_ImplInitValueConstant();

		/**
		 * The meta object literal for the '<em><b>Swc Memory Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__SWC_MEMORY_MAPPING = eINSTANCE.getSwc_SwcMemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__PARENT = eINSTANCE.getSwc_Parent();

		/**
		 * The meta object literal for the '<em><b>Rte Api</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__RTE_API = eINSTANCE.getSwc_RteApi();

		/**
		 * The meta object literal for the '<em><b>Api Init Value Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__API_INIT_VALUE_CONSTANT = eINSTANCE.getSwc_ApiInitValueConstant();

		/**
		 * The meta object literal for the '<em><b>Api Application Error Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__API_APPLICATION_ERROR_CONSTANT = eINSTANCE.getSwc_ApiApplicationErrorConstant();

		/**
		 * The meta object literal for the '<em><b>Api Enum Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__API_ENUM_CONSTANT = eINSTANCE.getSwc_ApiEnumConstant();

		/**
		 * The meta object literal for the '<em><b>Api Upper Lower Limit Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__API_UPPER_LOWER_LIMIT_CONSTANT = eINSTANCE.getSwc_ApiUpperLowerLimitConstant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteHeaderImpl <em>Rte Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteHeader()
		 * @generated
		 */
		EClass RTE_HEADER = eINSTANCE.getRteHeader();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl <em>Rte Lifecycle Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteLifecycleHeader()
		 * @generated
		 */
		EClass RTE_LIFECYCLE_HEADER = eINSTANCE.getRteLifecycleHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Lifecycle Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP = eINSTANCE.getRteLifecycleHeader_RteLifecycleApiGroup();

		/**
		 * The meta object literal for the '<em><b>Schm Lifecycle Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP = eINSTANCE.getRteLifecycleHeader_SchmLifecycleApiGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationTypeHeaderImpl <em>Rte Application Type Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationTypeHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApplicationTypeHeader()
		 * @generated
		 */
		EClass RTE_APPLICATION_TYPE_HEADER = eINSTANCE.getRteApplicationTypeHeader();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_APPLICATION_TYPE_HEADER__CONSTANT = eINSTANCE.getRteApplicationTypeHeader_Constant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteVfbTraceHeaderImpl <em>Rte Vfb Trace Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteVfbTraceHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteVfbTraceHeader()
		 * @generated
		 */
		EClass RTE_VFB_TRACE_HEADER = eINSTANCE.getRteVfbTraceHeader();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteConfigurationHeaderImpl <em>Rte Configuration Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteConfigurationHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteConfigurationHeader()
		 * @generated
		 */
		EClass RTE_CONFIGURATION_HEADER = eINSTANCE.getRteConfigurationHeader();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCallbackHeaderImpl <em>Rte Callback Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCallbackHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteCallbackHeader()
		 * @generated
		 */
		EClass RTE_CALLBACK_HEADER = eINSTANCE.getRteCallbackHeader();

		/**
		 * The meta object literal for the '<em><b>Com Callback Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_CALLBACK_HEADER__COM_CALLBACK_GROUP = eINSTANCE.getRteCallbackHeader_ComCallbackGroup();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl <em>Rte Type Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteTypeHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteTypeHeader()
		 * @generated
		 */
		EClass RTE_TYPE_HEADER = eINSTANCE.getRteTypeHeader();

		/**
		 * The meta object literal for the '<em><b>Rte Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TYPE_HEADER__RTE_TYPE = eINSTANCE.getRteTypeHeader_RteType();

		/**
		 * The meta object literal for the '<em><b>Rte Type Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TYPE_HEADER__RTE_TYPE_CONSTANT = eINSTANCE.getRteTypeHeader_RteTypeConstant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl <em>Invalidate Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InvalidateApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInvalidateApi()
		 * @generated
		 */
		EClass INVALIDATE_API = eINSTANCE.getInvalidateApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALIDATE_API__OPERATION = eINSTANCE.getInvalidateApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedSendOperationImpl <em>Ioc Nonqueued Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocNonqueuedSendOperation()
		 * @generated
		 */
		EClass IOC_NONQUEUED_SEND_OPERATION = eINSTANCE.getIocNonqueuedSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_NONQUEUED_SEND_OPERATION__ACCESS_API = eINSTANCE.getIocNonqueuedSendOperation_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectComSendOperationImpl <em>Direct Com Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectComSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getDirectComSendOperation()
		 * @generated
		 */
		EClass DIRECT_COM_SEND_OPERATION = eINSTANCE.getDirectComSendOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl <em>Trusted Function Com Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionComSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionComSendOperation()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION_COM_SEND_OPERATION = eINSTANCE.getTrustedFunctionComSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Trusted Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_COM_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionComSendOperation_AccessTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Trusted Function Param Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_COM_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE = eINSTANCE.getTrustedFunctionComSendOperation_TrustedFunctionParamVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ImmediateProxyComSendOperationImpl <em>Immediate Proxy Com Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ImmediateProxyComSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getImmediateProxyComSendOperation()
		 * @generated
		 */
		EClass IMMEDIATE_PROXY_COM_SEND_OPERATION = eINSTANCE.getImmediateProxyComSendOperation();

		/**
		 * The meta object literal for the '<em><b>Activation Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_PROXY_COM_SEND_OPERATION__ACTIVATION_API = eINSTANCE.getImmediateProxyComSendOperation_ActivationApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PeriodicProxyComSendOperationImpl <em>Periodic Proxy Com Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PeriodicProxyComSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPeriodicProxyComSendOperation()
		 * @generated
		 */
		EClass PERIODIC_PROXY_COM_SEND_OPERATION = eINSTANCE.getPeriodicProxyComSendOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedReadOperationImpl <em>Ioc Nonqueued Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocNonqueuedReadOperation()
		 * @generated
		 */
		EClass IOC_NONQUEUED_READ_OPERATION = eINSTANCE.getIocNonqueuedReadOperation();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_NONQUEUED_READ_OPERATION__ACCESS_API = eINSTANCE.getIocNonqueuedReadOperation_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReadOperationImpl <em>Com Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReadOperation()
		 * @generated
		 */
		EClass COM_READ_OPERATION = eINSTANCE.getComReadOperation();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_READ_OPERATION__ACCESS_API = eINSTANCE.getComReadOperation_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl <em>Ioc Nonqueued Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocNonqueuedCommunicationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocNonqueuedCommunication()
		 * @generated
		 */
		EClass IOC_NONQUEUED_COMMUNICATION = eINSTANCE.getIocNonqueuedCommunication();

		/**
		 * The meta object literal for the '<em><b>Write Api</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_NONQUEUED_COMMUNICATION__WRITE_API = eINSTANCE.getIocNonqueuedCommunication_WriteApi();

		/**
		 * The meta object literal for the '<em><b>Read Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_NONQUEUED_COMMUNICATION__READ_API = eINSTANCE.getIocNonqueuedCommunication_ReadApi();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_NONQUEUED_COMMUNICATION__INIT_VALUE = eINSTANCE.getIocNonqueuedCommunication_InitValue();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocWriteApiImpl <em>Ioc Write Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocWriteApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocWriteApi()
		 * @generated
		 */
		EClass IOC_WRITE_API = eINSTANCE.getIocWriteApi();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_WRITE_API__PARENT = eINSTANCE.getIocWriteApi_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReadApiImpl <em>Ioc Read Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReadApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocReadApi()
		 * @generated
		 */
		EClass IOC_READ_API = eINSTANCE.getIocReadApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalApiImpl <em>Com Send Signal Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalApi()
		 * @generated
		 */
		EClass COM_SEND_SIGNAL_API = eINSTANCE.getComSendSignalApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveSignalApiImpl <em>Com Receive Signal Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveSignalApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReceiveSignalApi()
		 * @generated
		 */
		EClass COM_RECEIVE_SIGNAL_API = eINSTANCE.getComReceiveSignalApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveCallbackImpl <em>Com Receive Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveCallbackImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReceiveCallback()
		 * @generated
		 */
		EClass COM_RECEIVE_CALLBACK = eINSTANCE.getComReceiveCallback();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RECEIVE_CALLBACK__OPERATION = eINSTANCE.getComReceiveCallback_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RECEIVE_CALLBACK__DATA_VARIABLE = eINSTANCE.getComReceiveCallback_DataVariable();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RECEIVE_CALLBACK__ACCESS_API = eINSTANCE.getComReceiveCallback_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl <em>Com Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendOperation()
		 * @generated
		 */
		EClass COM_SEND_OPERATION = eINSTANCE.getComSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_OPERATION__ACCESS_API = eINSTANCE.getComSendOperation_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackImpl <em>Com Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComCallback()
		 * @generated
		 */
		EClass COM_CALLBACK = eINSTANCE.getComCallback();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveTimeoutCallbackImpl <em>Com Receive Timeout Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComReceiveTimeoutCallbackImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComReceiveTimeoutCallback()
		 * @generated
		 */
		EClass COM_RECEIVE_TIMEOUT_CALLBACK = eINSTANCE.getComReceiveTimeoutCallback();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RECEIVE_TIMEOUT_CALLBACK__OPERATION = eINSTANCE.getComReceiveTimeoutCallback_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RECEIVE_TIMEOUT_CALLBACK__DATA_VARIABLE = eINSTANCE.getComReceiveTimeoutCallback_DataVariable();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RECEIVE_TIMEOUT_CALLBACK__ACCESS_API = eINSTANCE.getComReceiveTimeoutCallback_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvalidateCallbackImpl <em>Com Invalidate Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComInvalidateCallbackImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComInvalidateCallback()
		 * @generated
		 */
		EClass COM_INVALIDATE_CALLBACK = eINSTANCE.getComInvalidateCallback();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_INVALIDATE_CALLBACK__OPERATION = eINSTANCE.getComInvalidateCallback_Operation();

		/**
		 * The meta object literal for the '<em><b>Filter Result Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_INVALIDATE_CALLBACK__FILTER_RESULT_VARIABLE = eINSTANCE.getComInvalidateCallback_FilterResultVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateEntityImpl <em>Com Send Signal Immediate Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalImmediateEntity()
		 * @generated
		 */
		EClass COM_SEND_SIGNAL_IMMEDIATE_ENTITY = eINSTANCE.getComSendSignalImmediateEntity();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_SIGNAL_IMMEDIATE_ENTITY__OPERATION = eINSTANCE.getComSendSignalImmediateEntity_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalPeriodicEntityImpl <em>Com Send Signal Periodic Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalPeriodicEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalPeriodicEntity()
		 * @generated
		 */
		EClass COM_SEND_SIGNAL_PERIODIC_ENTITY = eINSTANCE.getComSendSignalPeriodicEntity();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_SIGNAL_PERIODIC_ENTITY__OPERATION = eINSTANCE.getComSendSignalPeriodicEntity_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FilterOperationImpl <em>Filter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFilterOperation()
		 * @generated
		 */
		EClass FILTER_OPERATION = eINSTANCE.getFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Filter Result Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_OPERATION__FILTER_RESULT_VARIABLE = eINSTANCE.getFilterOperation_FilterResultVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersMaskedOldFilterOperationImpl <em>Masked New Differs Masked Old Filter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersMaskedOldFilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMaskedNewDiffersMaskedOldFilterOperation()
		 * @generated
		 */
		EClass MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION = eINSTANCE.getMaskedNewDiffersMaskedOldFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Old Value Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__OLD_VALUE_VARIABLE = eINSTANCE.getMaskedNewDiffersMaskedOldFilterOperation_OldValueVariable();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKED_NEW_DIFFERS_MASKED_OLD_FILTER_OPERATION__MASK = eINSTANCE.getMaskedNewDiffersMaskedOldFilterOperation_Mask();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersXFilterOperationImpl <em>Masked New Differs XFilter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewDiffersXFilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMaskedNewDiffersXFilterOperation()
		 * @generated
		 */
		EClass MASKED_NEW_DIFFERS_XFILTER_OPERATION = eINSTANCE.getMaskedNewDiffersXFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKED_NEW_DIFFERS_XFILTER_OPERATION__MASK = eINSTANCE.getMaskedNewDiffersXFilterOperation_Mask();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKED_NEW_DIFFERS_XFILTER_OPERATION__X = eINSTANCE.getMaskedNewDiffersXFilterOperation_X();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsWithinFilterOperationImpl <em>New Is Within Filter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsWithinFilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getNewIsWithinFilterOperation()
		 * @generated
		 */
		EClass NEW_IS_WITHIN_FILTER_OPERATION = eINSTANCE.getNewIsWithinFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_IS_WITHIN_FILTER_OPERATION__MIN = eINSTANCE.getNewIsWithinFilterOperation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_IS_WITHIN_FILTER_OPERATION__MAX = eINSTANCE.getNewIsWithinFilterOperation_Max();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsOutsideFilterOperationImpl <em>New Is Outside Filter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NewIsOutsideFilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getNewIsOutsideFilterOperation()
		 * @generated
		 */
		EClass NEW_IS_OUTSIDE_FILTER_OPERATION = eINSTANCE.getNewIsOutsideFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_IS_OUTSIDE_FILTER_OPERATION__MIN = eINSTANCE.getNewIsOutsideFilterOperation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_IS_OUTSIDE_FILTER_OPERATION__MAX = eINSTANCE.getNewIsOutsideFilterOperation_Max();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewEqualsXFilterOperationImpl <em>Masked New Equals XFilter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MaskedNewEqualsXFilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMaskedNewEqualsXFilterOperation()
		 * @generated
		 */
		EClass MASKED_NEW_EQUALS_XFILTER_OPERATION = eINSTANCE.getMaskedNewEqualsXFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKED_NEW_EQUALS_XFILTER_OPERATION__MASK = eINSTANCE.getMaskedNewEqualsXFilterOperation_Mask();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKED_NEW_EQUALS_XFILTER_OPERATION__X = eINSTANCE.getMaskedNewEqualsXFilterOperation_X();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl <em>One Every NFilter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OneEveryNFilterOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOneEveryNFilterOperation()
		 * @generated
		 */
		EClass ONE_EVERY_NFILTER_OPERATION = eINSTANCE.getOneEveryNFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Occurrence Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_EVERY_NFILTER_OPERATION__OCCURRENCE_VARIABLE = eINSTANCE.getOneEveryNFilterOperation_OccurrenceVariable();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_EVERY_NFILTER_OPERATION__PERIOD = eINSTANCE.getOneEveryNFilterOperation_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_EVERY_NFILTER_OPERATION__OFFSET = eINSTANCE.getOneEveryNFilterOperation_Offset();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCoreStartApiImplImpl <em>Rte Core Start Api Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteCoreStartApiImplImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteCoreStartApiImpl()
		 * @generated
		 */
		EClass RTE_CORE_START_API_IMPL = eINSTANCE.getRteCoreStartApiImpl();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_CORE_START_API_IMPL__OPERATION = eINSTANCE.getRteCoreStartApiImpl_Operation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_CORE_START_API_IMPL__PARENT = eINSTANCE.getRteCoreStartApiImpl_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStopApiImpl <em>Rte Stop Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStopApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteStopApi()
		 * @generated
		 */
		EClass RTE_STOP_API = eINSTANCE.getRteStopApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.HeaderFileImpl <em>Header File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.HeaderFileImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getHeaderFile()
		 * @generated
		 */
		EClass HEADER_FILE = eINSTANCE.getHeaderFile();

		/**
		 * The meta object literal for the '<em><b>Guard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_FILE__GUARD_NAME = eINSTANCE.getHeaderFile_GuardName();

		/**
		 * The meta object literal for the '<em><b>Dependent Headers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_FILE__DEPENDENT_HEADERS = eINSTANCE.getHeaderFile_DependentHeaders();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SourceFileImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Dependent Headers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE__DEPENDENT_HEADERS = eINSTANCE.getSourceFile_DependentHeaders();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl <em>Rte Internal Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteInternalHeader()
		 * @generated
		 */
		EClass RTE_INTERNAL_HEADER = eINSTANCE.getRteInternalHeader();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__CONSTANT = eINSTANCE.getRteInternalHeader_Constant();

		/**
		 * The meta object literal for the '<em><b>Global Variable Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP = eINSTANCE.getRteInternalHeader_GlobalVariableGroup();

		/**
		 * The meta object literal for the '<em><b>Trusted Function Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP = eINSTANCE.getRteInternalHeader_TrustedFunctionGroup();

		/**
		 * The meta object literal for the '<em><b>Bsw Schedulable Entity Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP = eINSTANCE.getRteInternalHeader_BswSchedulableEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Rte Core Start Api Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL = eINSTANCE.getRteInternalHeader_RteCoreStartApiImpl();

		/**
		 * The meta object literal for the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP = eINSTANCE.getRteInternalHeader_DependentExecutableEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Schm Core Init Api Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL = eINSTANCE.getRteInternalHeader_SchmCoreInitApiImpl();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PrimitiveTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Original Type Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__ORIGINAL_TYPE_SYMBOL_NAME = eINSTANCE.getPrimitiveType_OriginalTypeSymbolName();

		/**
		 * The meta object literal for the '<em><b>Signedness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__SIGNEDNESS = eINSTANCE.getPrimitiveType_Signedness();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_TYPE__MEMBER = eINSTANCE.getUnionType_Member();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxTypeImpl <em>Blackbox Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBlackboxType()
		 * @generated
		 */
		EClass BLACKBOX_TYPE = eINSTANCE.getBlackboxType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionMemberImpl <em>Union Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.UnionMemberImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getUnionMember()
		 * @generated
		 */
		EClass UNION_MEMBER = eINSTANCE.getUnionMember();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION_MEMBER__MEMBER_NAME = eINSTANCE.getUnionMember_MemberName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_MEMBER__TYPE = eINSTANCE.getUnionMember_Type();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableMemberImpl <em>Variable Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableMemberImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVariableMember()
		 * @generated
		 */
		EClass VARIABLE_MEMBER = eINSTANCE.getVariableMember();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MEMBER__PARENT = eINSTANCE.getVariableMember_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteUtilityHeaderImpl <em>Rte Utility Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteUtilityHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteUtilityHeader()
		 * @generated
		 */
		EClass RTE_UTILITY_HEADER = eINSTANCE.getRteUtilityHeader();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxHeaderImpl <em>Blackbox Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BlackboxHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBlackboxHeader()
		 * @generated
		 */
		EClass BLACKBOX_HEADER = eINSTANCE.getBlackboxHeader();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueueTypeImpl <em>Rte Buffer Queue Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueueTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueueType()
		 * @generated
		 */
		EClass RTE_BUFFER_QUEUE_TYPE = eINSTANCE.getRteBufferQueueType();

		/**
		 * The meta object literal for the '<em><b>Max Length Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_QUEUE_TYPE__MAX_LENGTH_CONSTANT = eINSTANCE.getRteBufferQueueType_MaxLengthConstant();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_QUEUE_TYPE__ELEMENT_TYPE = eINSTANCE.getRteBufferQueueType_ElementType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendTrustedFunctionParamTypeImpl <em>Com Send Trusted Function Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendTrustedFunctionParamTypeImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendTrustedFunctionParamType()
		 * @generated
		 */
		EClass COM_SEND_TRUSTED_FUNCTION_PARAM_TYPE = eINSTANCE.getComSendTrustedFunctionParamType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NeverReadOperationImpl <em>Never Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.NeverReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getNeverReadOperation()
		 * @generated
		 */
		EClass NEVER_READ_OPERATION = eINSTANCE.getNeverReadOperation();

		/**
		 * The meta object literal for the '<em><b>Init Value Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEVER_READ_OPERATION__INIT_VALUE_CONSTANT = eINSTANCE.getNeverReadOperation_InitValueConstant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferInvalidateTrustedFunctionImpl <em>Rte Buffer Invalidate Trusted Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferInvalidateTrustedFunctionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferInvalidateTrustedFunction()
		 * @generated
		 */
		EClass RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION = eINSTANCE.getRteBufferInvalidateTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_INVALIDATE_TRUSTED_FUNCTION__OPERATION = eINSTANCE.getRteBufferInvalidateTrustedFunction_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferInvalidateSendOperationImpl <em>Trusted Function Rte Buffer Invalidate Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferInvalidateSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionRteBufferInvalidateSendOperation()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION = eINSTANCE.getTrustedFunctionRteBufferInvalidateSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Trusted Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionRteBufferInvalidateSendOperation_AccessTrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MemoryMappingImpl <em>Memory Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MemoryMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMemoryMapping()
		 * @generated
		 */
		EClass MEMORY_MAPPING = eINSTANCE.getMemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAPPING__PREFIX = eINSTANCE.getMemoryMapping_Prefix();

		/**
		 * The meta object literal for the '<em><b>Memory Section Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAPPING__MEMORY_SECTION_SYMBOL_NAME = eINSTANCE.getMemoryMapping_MemorySectionSymbolName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingImpl <em>Swc Memory Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSwcMemoryMapping()
		 * @generated
		 */
		EClass SWC_MEMORY_MAPPING = eINSTANCE.getSwcMemoryMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingImpl <em>Bsw Memory Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswMemoryMapping()
		 * @generated
		 */
		EClass BSW_MEMORY_MAPPING = eINSTANCE.getBswMemoryMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableGroupImpl <em>Global Variable Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getGlobalVariableGroup()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE_GROUP = eINSTANCE.getGlobalVariableGroup();

		/**
		 * The meta object literal for the '<em><b>Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE_GROUP__GLOBAL_VARIABLE = eINSTANCE.getGlobalVariableGroup_GlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Memory Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE_GROUP__MEMORY_MAPPING = eINSTANCE.getGlobalVariableGroup_MemoryMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionGroupImpl <em>Function Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getFunctionGroup()
		 * @generated
		 */
		EClass FUNCTION_GROUP = eINSTANCE.getFunctionGroup();

		/**
		 * The meta object literal for the '<em><b>Memory Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_GROUP__MEMORY_MAPPING = eINSTANCE.getFunctionGroup_MemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_GROUP__FUNCTION = eINSTANCE.getFunctionGroup_Function();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiGroupImpl <em>Rte Api Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApiGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteApiGroup()
		 * @generated
		 */
		EClass RTE_API_GROUP = eINSTANCE.getRteApiGroup();

		/**
		 * The meta object literal for the '<em><b>Rte Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_API_GROUP__RTE_API = eINSTANCE.getRteApiGroup_RteApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiGroupImpl <em>Rte Lifecycle Api Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteLifecycleApiGroup()
		 * @generated
		 */
		EClass RTE_LIFECYCLE_API_GROUP = eINSTANCE.getRteLifecycleApiGroup();

		/**
		 * The meta object literal for the '<em><b>Rte Lifecycle Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_LIFECYCLE_API_GROUP__RTE_LIFECYCLE_API = eINSTANCE.getRteLifecycleApiGroup_RteLifecycleApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyGroupImpl <em>Task Body Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTaskBodyGroup()
		 * @generated
		 */
		EClass TASK_BODY_GROUP = eINSTANCE.getTaskBodyGroup();

		/**
		 * The meta object literal for the '<em><b>Task Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_BODY_GROUP__TASK_BODY = eINSTANCE.getTaskBodyGroup_TaskBody();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityGroupImpl <em>Bsw Schedulable Entity Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswSchedulableEntityGroup()
		 * @generated
		 */
		EClass BSW_SCHEDULABLE_ENTITY_GROUP = eINSTANCE.getBswSchedulableEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Bsw Schedulable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_SCHEDULABLE_ENTITY_GROUP__BSW_SCHEDULABLE_ENTITY = eINSTANCE.getBswSchedulableEntityGroup_BswSchedulableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackGroupImpl <em>Com Callback Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComCallbackGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComCallbackGroup()
		 * @generated
		 */
		EClass COM_CALLBACK_GROUP = eINSTANCE.getComCallbackGroup();

		/**
		 * The meta object literal for the '<em><b>Com Callback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_CALLBACK_GROUP__COM_CALLBACK = eINSTANCE.getComCallbackGroup_ComCallback();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionGroupImpl <em>Trusted Function Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionGroup()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION_GROUP = eINSTANCE.getTrustedFunctionGroup();

		/**
		 * The meta object literal for the '<em><b>Trusted Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_GROUP__TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionGroup_TrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityGroupImpl <em>Executable Entity Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExecutableEntityGroup()
		 * @generated
		 */
		EClass EXECUTABLE_ENTITY_GROUP = eINSTANCE.getExecutableEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Executable Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ENTITY_GROUP__EXECUTABLE_ENTITY = eINSTANCE.getExecutableEntityGroup_ExecutableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingHeaderImpl <em>Bsw Memory Mapping Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswMemoryMappingHeader()
		 * @generated
		 */
		EClass BSW_MEMORY_MAPPING_HEADER = eINSTANCE.getBswMemoryMappingHeader();

		/**
		 * The meta object literal for the '<em><b>Memory Mapping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING = eINSTANCE.getBswMemoryMappingHeader_MemoryMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingHeaderImpl <em>Swc Memory Mapping Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSwcMemoryMappingHeader()
		 * @generated
		 */
		EClass SWC_MEMORY_MAPPING_HEADER = eINSTANCE.getSwcMemoryMappingHeader();

		/**
		 * The meta object literal for the '<em><b>Memory Mapping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING = eINSTANCE.getSwcMemoryMappingHeader_MemoryMapping();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl <em>Generation Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GenerationInfoImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getGenerationInfo()
		 * @generated
		 */
		EClass GENERATION_INFO = eINSTANCE.getGenerationInfo();

		/**
		 * The meta object literal for the '<em><b>Generator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INFO__GENERATOR_NAME = eINSTANCE.getGenerationInfo_GeneratorName();

		/**
		 * The meta object literal for the '<em><b>Generator Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INFO__GENERATOR_VERSION = eINSTANCE.getGenerationInfo_GeneratorVersion();

		/**
		 * The meta object literal for the '<em><b>Generation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INFO__GENERATION_DATE = eINSTANCE.getGenerationInfo_GenerationDate();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MacroImpl <em>Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MacroImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMacro()
		 * @generated
		 */
		EClass MACRO = eINSTANCE.getMacro();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO__SYMBOL_NAME = eINSTANCE.getMacro_SymbolName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiImpl <em>Schm Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmApi()
		 * @generated
		 */
		EClass SCHM_API = eINSTANCE.getSchmApi();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_API__RETURN_VALUE = eINSTANCE.getSchmApi_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_API__PARENT = eINSTANCE.getSchmApi_Parent();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiImpl <em>Schm Lifecycle Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmLifecycleApi()
		 * @generated
		 */
		EClass SCHM_LIFECYCLE_API = eINSTANCE.getSchmLifecycleApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmEnterApiImpl <em>Schm Enter Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmEnterApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmEnterApi()
		 * @generated
		 */
		EClass SCHM_ENTER_API = eINSTANCE.getSchmEnterApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_ENTER_API__OPERATION = eINSTANCE.getSchmEnterApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmExitApiImpl <em>Schm Exit Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmExitApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmExitApi()
		 * @generated
		 */
		EClass SCHM_EXIT_API = eINSTANCE.getSchmExitApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_EXIT_API__OPERATION = eINSTANCE.getSchmExitApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkHeaderImpl <em>Interlink Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleInterlinkHeader()
		 * @generated
		 */
		EClass MODULE_INTERLINK_HEADER = eINSTANCE.getModuleInterlinkHeader();

		/**
		 * The meta object literal for the '<em><b>Schm Api Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INTERLINK_HEADER__SCHM_API_GROUP = eINSTANCE.getModuleInterlinkHeader_SchmApiGroup();

		/**
		 * The meta object literal for the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INTERLINK_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP = eINSTANCE.getModuleInterlinkHeader_DependentExecutableEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INTERLINK_HEADER__CONSTANT = eINSTANCE.getModuleInterlinkHeader_Constant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiGroupImpl <em>Schm Api Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmApiGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmApiGroup()
		 * @generated
		 */
		EClass SCHM_API_GROUP = eINSTANCE.getSchmApiGroup();

		/**
		 * The meta object literal for the '<em><b>Schm Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_API_GROUP__SCHM_API = eINSTANCE.getSchmApiGroup_SchmApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl <em>Interlink Type Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleInterlinkTypeHeaderImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleInterlinkTypeHeader()
		 * @generated
		 */
		EClass MODULE_INTERLINK_TYPE_HEADER = eINSTANCE.getModuleInterlinkTypeHeader();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INTERLINK_TYPE_HEADER__CONSTANT = eINSTANCE.getModuleInterlinkTypeHeader_Constant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiGroupImpl <em>Schm Lifecycle Api Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmLifecycleApiGroupImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmLifecycleApiGroup()
		 * @generated
		 */
		EClass SCHM_LIFECYCLE_API_GROUP = eINSTANCE.getSchmLifecycleApiGroup();

		/**
		 * The meta object literal for the '<em><b>Schm Lifecycle Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_LIFECYCLE_API_GROUP__SCHM_LIFECYCLE_API = eINSTANCE.getSchmLifecycleApiGroup_SchmLifecycleApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartedBswmImpl <em>Parted Bswm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartedBswmImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartedBswm()
		 * @generated
		 */
		EClass PARTED_BSWM = eINSTANCE.getPartedBswm();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTED_BSWM__PARENT = eINSTANCE.getPartedBswm_Parent();

		/**
		 * The meta object literal for the '<em><b>Dependent Executable Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTED_BSWM__DEPENDENT_EXECUTABLE_ENTITY = eINSTANCE.getPartedBswm_DependentExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Schm Api</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTED_BSWM__SCHM_API = eINSTANCE.getPartedBswm_SchmApi();

		/**
		 * The meta object literal for the '<em><b>Bsw Memory Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTED_BSWM__BSW_MEMORY_MAPPING = eINSTANCE.getPartedBswm_BswMemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Bswm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTED_BSWM__BSWM = eINSTANCE.getPartedBswm_Bswm();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswmImpl <em>Bswm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswmImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswm()
		 * @generated
		 */
		EClass BSWM = eINSTANCE.getBswm();

		/**
		 * The meta object literal for the '<em><b>Parted Bswm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSWM__PARTED_BSWM = eINSTANCE.getBswm_PartedBswm();

		/**
		 * The meta object literal for the '<em><b>Get Single Parted Bswm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BSWM___GET_SINGLE_PARTED_BSWM__PARTITION = eINSTANCE.getBswm__GetSinglePartedBswm__Partition();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmDeinitApiImpl <em>Schm Deinit Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmDeinitApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmDeinitApi()
		 * @generated
		 */
		EClass SCHM_DEINIT_API = eINSTANCE.getSchmDeinitApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl <em>Schm Init Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmInitApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmInitApi()
		 * @generated
		 */
		EClass SCHM_INIT_API = eINSTANCE.getSchmInitApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreSchmInitApiImpl <em>Singlecore Schm Init Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreSchmInitApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSinglecoreSchmInitApi()
		 * @generated
		 */
		EClass SINGLECORE_SCHM_INIT_API = eINSTANCE.getSinglecoreSchmInitApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLECORE_SCHM_INIT_API__OPERATION = eINSTANCE.getSinglecoreSchmInitApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreSchmInitApiImpl <em>Multicore Schm Init Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreSchmInitApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMulticoreSchmInitApi()
		 * @generated
		 */
		EClass MULTICORE_SCHM_INIT_API = eINSTANCE.getMulticoreSchmInitApi();

		/**
		 * The meta object literal for the '<em><b>Core Init Api Impl</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICORE_SCHM_INIT_API__CORE_INIT_API_IMPL = eINSTANCE.getMulticoreSchmInitApi_CoreInitApiImpl();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmCoreInitApiImplImpl <em>Schm Core Init Api Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SchmCoreInitApiImplImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSchmCoreInitApiImpl()
		 * @generated
		 */
		EClass SCHM_CORE_INIT_API_IMPL = eINSTANCE.getSchmCoreInitApiImpl();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_CORE_INIT_API_IMPL__PARENT = eINSTANCE.getSchmCoreInitApiImpl_Parent();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHM_CORE_INIT_API_IMPL__OPERATION = eINSTANCE.getSchmCoreInitApiImpl_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RestartPartitionApiImpl <em>Restart Partition Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RestartPartitionApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRestartPartitionApi()
		 * @generated
		 */
		EClass RESTART_PARTITION_API = eINSTANCE.getRestartPartitionApi();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTART_PARTITION_API__EREFERENCE0 = eINSTANCE.getRestartPartitionApi_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTART_PARTITION_API__EREFERENCE1 = eINSTANCE.getRestartPartitionApi_EReference1();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTART_PARTITION_API__OPERATION = eINSTANCE.getRestartPartitionApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionRestartingApiImpl <em>Partition Restarting Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionRestartingApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartitionRestartingApi()
		 * @generated
		 */
		EClass PARTITION_RESTARTING_API = eINSTANCE.getPartitionRestartingApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_RESTARTING_API__OPERATION = eINSTANCE.getPartitionRestartingApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionTerminatedApiImpl <em>Partition Terminated Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionTerminatedApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getPartitionTerminatedApi()
		 * @generated
		 */
		EClass PARTITION_TERMINATED_API = eINSTANCE.getPartitionTerminatedApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_TERMINATED_API__OPERATION = eINSTANCE.getPartitionTerminatedApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiImpl <em>Rte Lifecycle Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteLifecycleApi()
		 * @generated
		 */
		EClass RTE_LIFECYCLE_API = eINSTANCE.getRteLifecycleApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl <em>Send Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SendApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSendApi()
		 * @generated
		 */
		EClass SEND_API = eINSTANCE.getSendApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_API__OPERATION = eINSTANCE.getSendApi_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_API__DATA_PARAM = eINSTANCE.getSendApi_DataParam();

		/**
		 * The meta object literal for the '<em><b>Status Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_API__STATUS_VARIABLE = eINSTANCE.getSendApi_StatusVariable();

		/**
		 * The meta object literal for the '<em><b>Trusted Function Param Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_API__TRUSTED_FUNCTION_PARAM_VARIABLE = eINSTANCE.getSendApi_TrustedFunctionParamVariable();

		/**
		 * The meta object literal for the '<em><b>Filter Result Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_API__FILTER_RESULT_VARIABLE = eINSTANCE.getSendApi_FilterResultVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl <em>Receive Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReceiveApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getReceiveApi()
		 * @generated
		 */
		EClass RECEIVE_API = eINSTANCE.getReceiveApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_API__OPERATION = eINSTANCE.getReceiveApi_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_API__DATA_PARAM = eINSTANCE.getReceiveApi_DataParam();

		/**
		 * The meta object literal for the '<em><b>Status Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_API__STATUS_VARIABLE = eINSTANCE.getReceiveApi_StatusVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedSendOperationImpl <em>Rte Buffer Queued Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueuedSendOperation()
		 * @generated
		 */
		EClass RTE_BUFFER_QUEUED_SEND_OPERATION = eINSTANCE.getRteBufferQueuedSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_QUEUED_SEND_OPERATION__ACCESS_VARIABLE = eINSTANCE.getRteBufferQueuedSendOperation_AccessVariable();

		/**
		 * The meta object literal for the '<em><b>Temp Return Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_QUEUED_SEND_OPERATION__TEMP_RETURN_VARIABLE = eINSTANCE.getRteBufferQueuedSendOperation_TempReturnVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedVariableImpl <em>Rte Buffer Queued Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedVariableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueuedVariable()
		 * @generated
		 */
		EClass RTE_BUFFER_QUEUED_VARIABLE = eINSTANCE.getRteBufferQueuedVariable();

		/**
		 * The meta object literal for the '<em><b>Queue Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_QUEUED_VARIABLE__QUEUE_TYPE = eINSTANCE.getRteBufferQueuedVariable_QueueType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedReadOperationImpl <em>Rte Buffer Queued Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferQueuedReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferQueuedReadOperation()
		 * @generated
		 */
		EClass RTE_BUFFER_QUEUED_READ_OPERATION = eINSTANCE.getRteBufferQueuedReadOperation();

		/**
		 * The meta object literal for the '<em><b>Access Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_QUEUED_READ_OPERATION__ACCESS_VARIABLE = eINSTANCE.getRteBufferQueuedReadOperation_AccessVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl <em>Ioc Queued Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedCommunicationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedCommunication()
		 * @generated
		 */
		EClass IOC_QUEUED_COMMUNICATION = eINSTANCE.getIocQueuedCommunication();

		/**
		 * The meta object literal for the '<em><b>Send Api</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_COMMUNICATION__SEND_API = eINSTANCE.getIocQueuedCommunication_SendApi();

		/**
		 * The meta object literal for the '<em><b>Receive Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_COMMUNICATION__RECEIVE_API = eINSTANCE.getIocQueuedCommunication_ReceiveApi();

		/**
		 * The meta object literal for the '<em><b>Ioc Empty Queue Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_COMMUNICATION__IOC_EMPTY_QUEUE_API = eINSTANCE.getIocQueuedCommunication_IocEmptyQueueApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveApiImpl <em>Ioc Receive Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocReceiveApi()
		 * @generated
		 */
		EClass IOC_RECEIVE_API = eINSTANCE.getIocReceiveApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendApiImpl <em>Ioc Send Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocSendApi()
		 * @generated
		 */
		EClass IOC_SEND_API = eINSTANCE.getIocSendApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedSendOperationImpl <em>Ioc Queued Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedSendOperation()
		 * @generated
		 */
		EClass IOC_QUEUED_SEND_OPERATION = eINSTANCE.getIocQueuedSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_SEND_OPERATION__ACCESS_API = eINSTANCE.getIocQueuedSendOperation_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedReadOperationImpl <em>Ioc Queued Read Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedReadOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedReadOperation()
		 * @generated
		 */
		EClass IOC_QUEUED_READ_OPERATION = eINSTANCE.getIocQueuedReadOperation();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_READ_OPERATION__ACCESS_API = eINSTANCE.getIocQueuedReadOperation_AccessApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallApiImpl <em>Call Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CallApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCallApi()
		 * @generated
		 */
		EClass CALL_API = eINSTANCE.getCallApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_API__OPERATION = eINSTANCE.getCallApi_Operation();

		/**
		 * The meta object literal for the '<em><b>Operation Param</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_API__OPERATION_PARAM = eINSTANCE.getCallApi_OperationParam();

		/**
		 * The meta object literal for the '<em><b>Port Arg Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_API__PORT_ARG_VALUE = eINSTANCE.getCallApi_PortArgValue();

		/**
		 * The meta object literal for the '<em><b>Return Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_API__RETURN_VARIABLE = eINSTANCE.getCallApi_ReturnVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableStartOperationImpl <em>Executable Start Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableStartOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExecutableStartOperation()
		 * @generated
		 */
		EClass EXECUTABLE_START_OPERATION = eINSTANCE.getExecutableStartOperation();

		/**
		 * The meta object literal for the '<em><b>Exclude Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_START_OPERATION__EXCLUDE_OPERATION = eINSTANCE.getExecutableStartOperation_ExcludeOperation();

		/**
		 * The meta object literal for the '<em><b>Start Executable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_START_OPERATION__START_EXECUTABLE = eINSTANCE.getExecutableStartOperation_StartExecutable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityImpl <em>Executable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExecutableEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExecutableEntity()
		 * @generated
		 */
		EClass EXECUTABLE_ENTITY = eINSTANCE.getExecutableEntity();

		/**
		 * The meta object literal for the '<em><b>Role Param</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ENTITY__ROLE_PARAM = eINSTANCE.getExecutableEntity_RoleParam();

		/**
		 * The meta object literal for the '<em><b>Parent Parted Bswm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ENTITY__PARENT_PARTED_BSWM = eINSTANCE.getExecutableEntity_ParentPartedBswm();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExcludeOperationImpl <em>Exclude Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ExcludeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getExcludeOperation()
		 * @generated
		 */
		EClass EXCLUDE_OPERATION = eINSTANCE.getExcludeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.AllInterruptBlockExcludeOperationImpl <em>All Interrupt Block Exclude Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.AllInterruptBlockExcludeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getAllInterruptBlockExcludeOperation()
		 * @generated
		 */
		EClass ALL_INTERRUPT_BLOCK_EXCLUDE_OPERATION = eINSTANCE.getAllInterruptBlockExcludeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsInterruptBlockExcludeOperationImpl <em>Os Interrupt Block Exclude Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsInterruptBlockExcludeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsInterruptBlockExcludeOperation()
		 * @generated
		 */
		EClass OS_INTERRUPT_BLOCK_EXCLUDE_OPERATION = eINSTANCE.getOsInterruptBlockExcludeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSpinlockExcludeOperationImpl <em>Os Spinlock Exclude Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSpinlockExcludeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsSpinlockExcludeOperation()
		 * @generated
		 */
		EClass OS_SPINLOCK_EXCLUDE_OPERATION = eINSTANCE.getOsSpinlockExcludeOperation();

		/**
		 * The meta object literal for the '<em><b>Os Spinlock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_SPINLOCK_EXCLUDE_OPERATION__OS_SPINLOCK_ID = eINSTANCE.getOsSpinlockExcludeOperation_OsSpinlockId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsResourceExcludeOperationImpl <em>Os Resource Exclude Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsResourceExcludeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsResourceExcludeOperation()
		 * @generated
		 */
		EClass OS_RESOURCE_EXCLUDE_OPERATION = eINSTANCE.getOsResourceExcludeOperation();

		/**
		 * The meta object literal for the '<em><b>Os Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_RESOURCE_EXCLUDE_OPERATION__OS_RESOURCE_ID = eINSTANCE.getOsResourceExcludeOperation_OsResourceId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ConstantImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__SYMBOL_NAME = eINSTANCE.getConstant_SymbolName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__CONSTANT_TYPE = eINSTANCE.getConstant_ConstantType();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityImpl <em>Bsw Schedulable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswSchedulableEntityImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBswSchedulableEntity()
		 * @generated
		 */
		EClass BSW_SCHEDULABLE_ENTITY = eINSTANCE.getBswSchedulableEntity();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteEnterApiImpl <em>Rte Enter Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteEnterApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteEnterApi()
		 * @generated
		 */
		EClass RTE_ENTER_API = eINSTANCE.getRteEnterApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_ENTER_API__OPERATION = eINSTANCE.getRteEnterApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteExitApiImpl <em>Rte Exit Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteExitApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteExitApi()
		 * @generated
		 */
		EClass RTE_EXIT_API = eINSTANCE.getRteExitApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_EXIT_API__OPERATION = eINSTANCE.getRteExitApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationExecutableTaskBodyImpl <em>Os Task Activation Executable Task Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationExecutableTaskBodyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsTaskActivationExecutableTaskBody()
		 * @generated
		 */
		EClass OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY = eINSTANCE.getOsTaskActivationExecutableTaskBody();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK_ACTIVATION_EXECUTABLE_TASK_BODY__OPERATION = eINSTANCE.getOsTaskActivationExecutableTaskBody_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl <em>Os Event Set Executable Task Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsEventSetExecutableTaskBody()
		 * @generated
		 */
		EClass OS_EVENT_SET_EXECUTABLE_TASK_BODY = eINSTANCE.getOsEventSetExecutableTaskBody();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION = eINSTANCE.getOsEventSetExecutableTaskBody_Operation();

		/**
		 * The meta object literal for the '<em><b>Os Event Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID = eINSTANCE.getOsEventSetExecutableTaskBody_OsEventId();

		/**
		 * The meta object literal for the '<em><b>Checks Os Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID = eINSTANCE.getOsEventSetExecutableTaskBody_ChecksOsEventId();

		/**
		 * The meta object literal for the '<em><b>Event Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE = eINSTANCE.getOsEventSetExecutableTaskBody_EventVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationOperationImpl <em>Os Task Activation Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsTaskActivationOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsTaskActivationOperation()
		 * @generated
		 */
		EClass OS_TASK_ACTIVATION_OPERATION = eINSTANCE.getOsTaskActivationOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetActivationOperationImpl <em>Os Event Set Activation Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetActivationOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsEventSetActivationOperation()
		 * @generated
		 */
		EClass OS_EVENT_SET_ACTIVATION_OPERATION = eINSTANCE.getOsEventSetActivationOperation();

		/**
		 * The meta object literal for the '<em><b>Activation Os Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_EVENT_SET_ACTIVATION_OPERATION__ACTIVATION_OS_EVENT_ID = eINSTANCE.getOsEventSetActivationOperation_ActivationOsEventId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl <em>Context Activation Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ContextActivationOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getContextActivationOperation()
		 * @generated
		 */
		EClass CONTEXT_ACTIVATION_OPERATION = eINSTANCE.getContextActivationOperation();

		/**
		 * The meta object literal for the '<em><b>Executable Start Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ACTIVATION_OPERATION__EXECUTABLE_START_OPERATION = eINSTANCE.getContextActivationOperation_ExecutableStartOperation();

		/**
		 * The meta object literal for the '<em><b>Cycle Countup Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ACTIVATION_OPERATION__CYCLE_COUNTUP_OPERATION = eINSTANCE.getContextActivationOperation_CycleCountupOperation();

		/**
		 * The meta object literal for the '<em><b>Start Offset Countup Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ACTIVATION_OPERATION__START_OFFSET_COUNTUP_OPERATION = eINSTANCE.getContextActivationOperation_StartOffsetCountupOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl <em>Timing Triggering Executable Start Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TimingTriggeringExecutableStartOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTimingTriggeringExecutableStartOperation()
		 * @generated
		 */
		EClass TIMING_TRIGGERING_EXECUTABLE_START_OPERATION = eINSTANCE.getTimingTriggeringExecutableStartOperation();

		/**
		 * The meta object literal for the '<em><b>Cycle Period Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT = eINSTANCE.getTimingTriggeringExecutableStartOperation_CyclePeriodConstant();

		/**
		 * The meta object literal for the '<em><b>Cycle Offset Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT = eINSTANCE.getTimingTriggeringExecutableStartOperation_CycleOffsetConstant();

		/**
		 * The meta object literal for the '<em><b>Start Offset Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT = eINSTANCE.getTimingTriggeringExecutableStartOperation_StartOffsetConstant();

		/**
		 * The meta object literal for the '<em><b>Start Offset Counter Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE = eINSTANCE.getTimingTriggeringExecutableStartOperation_StartOffsetCounterVariable();

		/**
		 * The meta object literal for the '<em><b>Cycle Counter Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE = eINSTANCE.getTimingTriggeringExecutableStartOperation_CycleCounterVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CycleCountupOperationImpl <em>Cycle Countup Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CycleCountupOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCycleCountupOperation()
		 * @generated
		 */
		EClass CYCLE_COUNTUP_OPERATION = eINSTANCE.getCycleCountupOperation();

		/**
		 * The meta object literal for the '<em><b>Counter Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE_COUNTUP_OPERATION__COUNTER_VARIABLE = eINSTANCE.getCycleCountupOperation_CounterVariable();

		/**
		 * The meta object literal for the '<em><b>Max Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE_COUNTUP_OPERATION__MAX_CONSTANT = eINSTANCE.getCycleCountupOperation_MaxConstant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.StartOffsetCountupOperationImpl <em>Start Offset Countup Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.StartOffsetCountupOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getStartOffsetCountupOperation()
		 * @generated
		 */
		EClass START_OFFSET_COUNTUP_OPERATION = eINSTANCE.getStartOffsetCountupOperation();

		/**
		 * The meta object literal for the '<em><b>Counter Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_OFFSET_COUNTUP_OPERATION__COUNTER_VARIABLE = eINSTANCE.getStartOffsetCountupOperation_CounterVariable();

		/**
		 * The meta object literal for the '<em><b>Max Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_OFFSET_COUNTUP_OPERATION__MAX_CONSTANT = eINSTANCE.getStartOffsetCountupOperation_MaxConstant();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyImpl <em>Task Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TaskBodyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTaskBody()
		 * @generated
		 */
		EClass TASK_BODY = eINSTANCE.getTaskBody();

		/**
		 * The meta object literal for the '<em><b>Os Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_BODY__OS_TASK_ID = eINSTANCE.getTaskBody_OsTaskId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocEmptyQueueApiImpl <em>Ioc Empty Queue Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocEmptyQueueApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocEmptyQueueApi()
		 * @generated
		 */
		EClass IOC_EMPTY_QUEUE_API = eINSTANCE.getIocEmptyQueueApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComApiImpl <em>Com Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComApi()
		 * @generated
		 */
		EClass COM_API = eINSTANCE.getComApi();

		/**
		 * The meta object literal for the '<em><b>Com Signal Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_API__COM_SIGNAL_SYMBOL_NAME = eINSTANCE.getComApi_ComSignalSymbolName();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocApiImpl <em>Ioc Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocApi()
		 * @generated
		 */
		EClass IOC_API = eINSTANCE.getIocApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl <em>Rte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRte()
		 * @generated
		 */
		EClass RTE = eINSTANCE.getRte();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__CORE = eINSTANCE.getRte_Core();

		/**
		 * The meta object literal for the '<em><b>Com Callback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__COM_CALLBACK = eINSTANCE.getRte_ComCallback();

		/**
		 * The meta object literal for the '<em><b>Com Send Signal Periodic Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY = eINSTANCE.getRte_ComSendSignalPeriodicEntity();

		/**
		 * The meta object literal for the '<em><b>Com Send Signal Immediate Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY = eINSTANCE.getRte_ComSendSignalImmediateEntity();

		/**
		 * The meta object literal for the '<em><b>Com Send Signal Trusted Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION = eINSTANCE.getRte_ComSendSignalTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Dependent Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__DEPENDENT_TYPE = eINSTANCE.getRte_DependentType();

		/**
		 * The meta object literal for the '<em><b>Rte Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_TYPE = eINSTANCE.getRte_RteType();

		/**
		 * The meta object literal for the '<em><b>Dependent Os Api</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__DEPENDENT_OS_API = eINSTANCE.getRte_DependentOsApi();

		/**
		 * The meta object literal for the '<em><b>Dependent Ioc Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__DEPENDENT_IOC_COMMUNICATION = eINSTANCE.getRte_DependentIocCommunication();

		/**
		 * The meta object literal for the '<em><b>Dependent Com Api</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__DEPENDENT_COM_API = eINSTANCE.getRte_DependentComApi();

		/**
		 * The meta object literal for the '<em><b>Rte Start Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_START_API = eINSTANCE.getRte_RteStartApi();

		/**
		 * The meta object literal for the '<em><b>Ioc Init Value Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__IOC_INIT_VALUE_CONSTANT = eINSTANCE.getRte_IocInitValueConstant();

		/**
		 * The meta object literal for the '<em><b>Dependent Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__DEPENDENT_CONSTANT = eINSTANCE.getRte_DependentConstant();

		/**
		 * The meta object literal for the '<em><b>Com Send Signal Immediate Task Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY = eINSTANCE.getRte_ComSendSignalImmediateTaskBody();

		/**
		 * The meta object literal for the '<em><b>Rte Stop Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_STOP_API = eINSTANCE.getRte_RteStopApi();

		/**
		 * The meta object literal for the '<em><b>Rte Type Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_TYPE_CONSTANT = eINSTANCE.getRte_RteTypeConstant();

		/**
		 * The meta object literal for the '<em><b>Rte Memory Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__RTE_MEMORY_MAPPING = eINSTANCE.getRte_RteMemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Generation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__GENERATION_INFO = eINSTANCE.getRte_GenerationInfo();

		/**
		 * The meta object literal for the '<em><b>Bswm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__BSWM = eINSTANCE.getRte_Bswm();

		/**
		 * The meta object literal for the '<em><b>Schm Init Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__SCHM_INIT_API = eINSTANCE.getRte_SchmInitApi();

		/**
		 * The meta object literal for the '<em><b>Schm Deinit Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE__SCHM_DEINIT_API = eINSTANCE.getRte_SchmDeinitApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ValueImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionImpl <em>Trusted Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunction()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION = eINSTANCE.getTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Trusted Function Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTED_FUNCTION__TRUSTED_FUNCTION_INDEX = eINSTANCE.getTrustedFunction_TrustedFunctionIndex();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalTrustedFunctionImpl <em>Com Send Signal Trusted Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalTrustedFunctionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalTrustedFunction()
		 * @generated
		 */
		EClass COM_SEND_SIGNAL_TRUSTED_FUNCTION = eINSTANCE.getComSendSignalTrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSetEventApiImpl <em>Os Set Event Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSetEventApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsSetEventApi()
		 * @generated
		 */
		EClass OS_SET_EVENT_API = eINSTANCE.getOsSetEventApi();

		/**
		 * The meta object literal for the '<em><b>Os Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_SET_EVENT_API__OS_TASK_ID = eINSTANCE.getOsSetEventApi_OsTaskId();

		/**
		 * The meta object literal for the '<em><b>Os Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_SET_EVENT_API__OS_EVENT_ID = eINSTANCE.getOsSetEventApi_OsEventId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsApiImpl <em>Os Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsApi()
		 * @generated
		 */
		EClass OS_API = eINSTANCE.getOsApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl <em>Com Send Signal Immediate Task Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendSignalImmediateTaskBodyImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendSignalImmediateTaskBody()
		 * @generated
		 */
		EClass COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY = eINSTANCE.getComSendSignalImmediateTaskBody();

		/**
		 * The meta object literal for the '<em><b>Start Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__START_ENTITY = eINSTANCE.getComSendSignalImmediateTaskBody_StartEntity();

		/**
		 * The meta object literal for the '<em><b>Os Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY__OS_EVENT_ID = eINSTANCE.getComSendSignalImmediateTaskBody_OsEventId();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SYMBOL_NAME = eINSTANCE.getVariable_SymbolName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__MEMBER = eINSTANCE.getVariable_Member();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendProxyOperationImpl <em>Com Send Proxy Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ComSendProxyOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getComSendProxyOperation()
		 * @generated
		 */
		EClass COM_SEND_PROXY_OPERATION = eINSTANCE.getComSendProxyOperation();

		/**
		 * The meta object literal for the '<em><b>Read Value Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_OPERATION__READ_VALUE_VARIABLE = eINSTANCE.getComSendProxyOperation_ReadValueVariable();

		/**
		 * The meta object literal for the '<em><b>Access Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_OPERATION__ACCESS_API = eINSTANCE.getComSendProxyOperation_AccessApi();

		/**
		 * The meta object literal for the '<em><b>Signal Id Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SEND_PROXY_OPERATION__SIGNAL_ID_VARIABLE = eINSTANCE.getComSendProxyOperation_SignalIdVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveGroupApiImpl <em>Ioc Receive Group Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocReceiveGroupApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocReceiveGroupApi()
		 * @generated
		 */
		EClass IOC_RECEIVE_GROUP_API = eINSTANCE.getIocReceiveGroupApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleRootImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getModuleRoot()
		 * @generated
		 */
		EClass MODULE_ROOT = eINSTANCE.getModuleRoot();

		/**
		 * The meta object literal for the '<em><b>Rte Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ROOT__RTE_MODULE = eINSTANCE.getModuleRoot_RteModule();

		/**
		 * The meta object literal for the '<em><b>Rte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ROOT__RTE = eINSTANCE.getModuleRoot_Rte();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InterPartitionTimeoutOperationImpl <em>Inter Partition Timeout Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InterPartitionTimeoutOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInterPartitionTimeoutOperation()
		 * @generated
		 */
		EClass INTER_PARTITION_TIMEOUT_OPERATION = eINSTANCE.getInterPartitionTimeoutOperation();

		/**
		 * The meta object literal for the '<em><b>Timeout Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_PARTITION_TIMEOUT_OPERATION__TIMEOUT_VARIABLE = eINSTANCE.getInterPartitionTimeoutOperation_TimeoutVariable();

		/**
		 * The meta object literal for the '<em><b>Exclude Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_PARTITION_TIMEOUT_OPERATION__EXCLUDE_OPERATION = eINSTANCE.getInterPartitionTimeoutOperation_ExcludeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InitializeOperationImpl <em>Initialize Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.InitializeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInitializeOperation()
		 * @generated
		 */
		EClass INITIALIZE_OPERATION = eINSTANCE.getInitializeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableInitializeOperationImpl <em>Variable Initialize Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.VariableInitializeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVariableInitializeOperation()
		 * @generated
		 */
		EClass VARIABLE_INITIALIZE_OPERATION = eINSTANCE.getVariableInitializeOperation();

		/**
		 * The meta object literal for the '<em><b>Init Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INITIALIZE_OPERATION__INIT_VARIABLE = eINSTANCE.getVariableInitializeOperation_InitVariable();

		/**
		 * The meta object literal for the '<em><b>Exclude Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INITIALIZE_OPERATION__EXCLUDE_OPERATION = eINSTANCE.getVariableInitializeOperation_ExcludeOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocInitializeOperationImpl <em>Ioc Initialize Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocInitializeOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocInitializeOperation()
		 * @generated
		 */
		EClass IOC_INITIALIZE_OPERATION = eINSTANCE.getIocInitializeOperation();

		/**
		 * The meta object literal for the '<em><b>Init Ioc Api</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_INITIALIZE_OPERATION__INIT_IOC_API = eINSTANCE.getIocInitializeOperation_InitIocApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSuspendAllInterruptsApiImpl <em>Os Suspend All Interrupts Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsSuspendAllInterruptsApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsSuspendAllInterruptsApi()
		 * @generated
		 */
		EClass OS_SUSPEND_ALL_INTERRUPTS_API = eINSTANCE.getOsSuspendAllInterruptsApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsGetSpinlockApiImpl <em>Os Get Spinlock Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsGetSpinlockApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getOsGetSpinlockApi()
		 * @generated
		 */
		EClass OS_GET_SPINLOCK_API = eINSTANCE.getOsGetSpinlockApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreRteStartApiImpl <em>Multicore Rte Start Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.MulticoreRteStartApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getMulticoreRteStartApi()
		 * @generated
		 */
		EClass MULTICORE_RTE_START_API = eINSTANCE.getMulticoreRteStartApi();

		/**
		 * The meta object literal for the '<em><b>Core Start Api Impl</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICORE_RTE_START_API__CORE_START_API_IMPL = eINSTANCE.getMulticoreRteStartApi_CoreStartApiImpl();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferWriteTrustedFunctionImpl <em>Rte Buffer Write Trusted Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteBufferWriteTrustedFunctionImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteBufferWriteTrustedFunction()
		 * @generated
		 */
		EClass RTE_BUFFER_WRITE_TRUSTED_FUNCTION = eINSTANCE.getRteBufferWriteTrustedFunction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_WRITE_TRUSTED_FUNCTION__OPERATION = eINSTANCE.getRteBufferWriteTrustedFunction_Operation();

		/**
		 * The meta object literal for the '<em><b>Data Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_BUFFER_WRITE_TRUSTED_FUNCTION__DATA_VARIABLE = eINSTANCE.getRteBufferWriteTrustedFunction_DataVariable();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferWriteSendOperationImpl <em>Trusted Function Rte Buffer Write Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.TrustedFunctionRteBufferWriteSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getTrustedFunctionRteBufferWriteSendOperation()
		 * @generated
		 */
		EClass TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION = eINSTANCE.getTrustedFunctionRteBufferWriteSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Trusted Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTED_FUNCTION_RTE_BUFFER_WRITE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION = eINSTANCE.getTrustedFunctionRteBufferWriteSendOperation_AccessTrustedFunction();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocCommunicationImpl <em>Ioc Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocCommunicationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocCommunication()
		 * @generated
		 */
		EClass IOC_COMMUNICATION = eINSTANCE.getIocCommunication();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl <em>Proxy Com Send Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ProxyComSendOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getProxyComSendOperation()
		 * @generated
		 */
		EClass PROXY_COM_SEND_OPERATION = eINSTANCE.getProxyComSendOperation();

		/**
		 * The meta object literal for the '<em><b>Access Proxy Api</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_COM_SEND_OPERATION__ACCESS_PROXY_API = eINSTANCE.getProxyComSendOperation_AccessProxyApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendGroupApiImpl <em>Ioc Send Group Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocSendGroupApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocSendGroupApi()
		 * @generated
		 */
		EClass IOC_SEND_GROUP_API = eINSTANCE.getIocSendGroupApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl <em>Ioc Queued Group Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.IocQueuedGroupCommunicationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getIocQueuedGroupCommunication()
		 * @generated
		 */
		EClass IOC_QUEUED_GROUP_COMMUNICATION = eINSTANCE.getIocQueuedGroupCommunication();

		/**
		 * The meta object literal for the '<em><b>Receive Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_GROUP_COMMUNICATION__RECEIVE_API = eINSTANCE.getIocQueuedGroupCommunication_ReceiveApi();

		/**
		 * The meta object literal for the '<em><b>Send Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOC_QUEUED_GROUP_COMMUNICATION__SEND_API = eINSTANCE.getIocQueuedGroupCommunication_SendApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectExecutableStartOperationImpl <em>Direct Executable Start Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.DirectExecutableStartOperationImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getDirectExecutableStartOperation()
		 * @generated
		 */
		EClass DIRECT_EXECUTABLE_START_OPERATION = eINSTANCE.getDirectExecutableStartOperation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreRteStartApiImpl <em>Singlecore Rte Start Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SinglecoreRteStartApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSinglecoreRteStartApi()
		 * @generated
		 */
		EClass SINGLECORE_RTE_START_API = eINSTANCE.getSinglecoreRteStartApi();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLECORE_RTE_START_API__OPERATION = eINSTANCE.getSinglecoreRteStartApi_Operation();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStartApiImpl <em>Rte Start Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteStartApiImpl
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getRteStartApi()
		 * @generated
		 */
		EClass RTE_START_API = eINSTANCE.getRteStartApi();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum <em>Parameter Pass Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getParameterPassTypeEnum()
		 * @generated
		 */
		EEnum PARAMETER_PASS_TYPE_ENUM = eINSTANCE.getParameterPassTypeEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum <em>Signedness Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getSignednessEnum()
		 * @generated
		 */
		EEnum SIGNEDNESS_ENUM = eINSTANCE.getSignednessEnum();

		/**
		 * The meta object literal for the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum <em>Constant Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ConstantTypeEnum
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getConstantTypeEnum()
		 * @generated
		 */
		EEnum CONSTANT_TYPE_ENUM = eINSTANCE.getConstantTypeEnum();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Verbatim String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getVerbatimString()
		 * @generated
		 */
		EDataType VERBATIM_STRING = eINSTANCE.getVerbatimString();

		/**
		 * The meta object literal for the '<em>CIdentifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getCIdentifier()
		 * @generated
		 */
		EDataType CIDENTIFIER = eINSTANCE.getCIdentifier();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModulePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

	}

} //ModulePackage
