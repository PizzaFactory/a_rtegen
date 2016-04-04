/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BlackboxType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteNonqueuedSendTrustedFunctionParamType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteQueuedSendTrustedFunctionParamType;

import com.google.common.base.Optional;

/**
 * モデル変換元，もしくはモデル変換先のモデルを一時的に格納するクラス．
 * このクラスは，モデル変換中の一時的なモデルの格納のみに利用され，モデル変換完了後に破棄されることに注意してください．
 */
public class ModuleModelBuildCache {
	// 生成元モデル
	public Optional<Os> sourceOs;
	public Optional<EcucPartition> sourceMasterBswPartition;

	// ルートモデル
	public ModuleRoot moduleRoot;
	public Rte rte;
	public RteModule rteModule;

	// 論理区画
	public Partition masterBswPartition;

	// 組込の型
	public BlackboxType voidType;
	public PrimitiveType booleanType;
	public PrimitiveType uint8Type;
	public PrimitiveType uint16Type;
	public PrimitiveType uint32Type;
	public PrimitiveType stdReturnType;
	public PrimitiveType osStatusType;
	public PrimitiveType osApplicationType;
	public PrimitiveType osTaskType;
	public PrimitiveType osEventMaskType;
	public PrimitiveType osResourceType;
	public PrimitiveType osSpinlockIdType;
	public PrimitiveType osTfIndexType;
	public BlackboxType osTfParamRefType;
	public PrimitiveType comSignalIdType;
	public BlackboxType comMetaDataTypeMemberOffsetType;
	public BlackboxType comMetaDataType;
	public PrimitiveType comProxyFunctionTableIndexType;

	// 組込の定数
	public Constant rteErrorOkConstant;
	public Constant rteErrorInvalidConstant;
	public Constant rteErrorMaxAgeExceededConstant;
	public Constant rteTransimitAckConstant;
	public Constant booleanFalse;
	
	// 内部実装用の定義型
	public Optional<RteQueuedSendTrustedFunctionParamType> rteQueuedSendTfParamType;
	public Optional<RteNonqueuedSendTrustedFunctionParamType> rteNonqueuedSendTfParamType;
	public Optional<ComSendTrustedFunctionParamType> comSendSignalTfParamType;
	public Optional<ComSendTrustedFunctionParamType> comSendSignalGroupTfParamType;

	// R内部実装用の定義関数
	public Optional<ComSendSignalTrustedFunction> comSendSignalTf;
	public Optional<ComSendSignalTrustedFunction> comSendSignalGroupTf;

	// ファイル
	public Optional<BlackboxHeader> comHeader;
	public Optional<BlackboxHeader> iocHeader;

}
