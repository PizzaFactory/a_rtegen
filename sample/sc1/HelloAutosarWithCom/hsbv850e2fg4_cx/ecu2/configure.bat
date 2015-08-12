@echo off
rem #
rem #  TOPPERS/A-RTEGEN
rem #      Automotive Runtime Environment Generator
rem #
rem #  Copyright (C) 2014-2015 by FUJI SOFT INCORPORATED, JAPAN
rem #
rem #  ��L���쌠�҂́C�ȉ���(1)�`(4)�̏����𖞂����ꍇ�Ɍ���C�{�\�t�g�E�F
rem #  �A�i�{�\�t�g�E�F�A�����ς������̂��܂ށD�ȉ������j���g�p�E�����E��
rem #  �ρE�Ĕz�z�i�ȉ��C���p�ƌĂԁj���邱�Ƃ𖳏��ŋ�������D
rem #  (1) �{�\�t�g�E�F�A���\�[�X�R�[�h�̌`�ŗ��p����ꍇ�ɂ́C��L�̒���
rem #      ���\���C���̗��p��������щ��L�̖��ۏ؋K�肪�C���̂܂܂̌`�Ń\�[
rem #      �X�R�[�h���Ɋ܂܂�Ă��邱�ƁD
rem #  (2) �{�\�t�g�E�F�A���C���C�u�����`���ȂǁC���̃\�t�g�E�F�A�J���Ɏg
rem #      �p�ł���`�ōĔz�z����ꍇ�ɂ́C�Ĕz�z�ɔ����h�L�������g�i���p
rem #      �҃}�j���A���Ȃǁj�ɁC��L�̒��쌠�\���C���̗��p��������щ��L
rem #      �̖��ۏ؋K����f�ڂ��邱�ƁD
rem #  (3) �{�\�t�g�E�F�A���C�@��ɑg�ݍ��ނȂǁC���̃\�t�g�E�F�A�J���Ɏg
rem #      �p�ł��Ȃ��`�ōĔz�z����ꍇ�ɂ́C���̂����ꂩ�̏����𖞂�����
rem #      �ƁD
rem #    (a) �Ĕz�z�ɔ����h�L�������g�i���p�҃}�j���A���Ȃǁj�ɁC��L�̒�
rem #        �쌠�\���C���̗��p��������щ��L�̖��ۏ؋K����f�ڂ��邱�ƁD
rem #    (b) �Ĕz�z�̌`�Ԃ��C�ʂɒ�߂���@�ɂ���āCTOPPERS�v���W�F�N�g��
rem #        �񍐂��邱�ƁD
rem #  (4) �{�\�t�g�E�F�A�̗��p�ɂ�蒼�ړI�܂��͊ԐړI�ɐ����邢���Ȃ鑹
rem #      �Q������C��L���쌠�҂����TOPPERS�v���W�F�N�g��Ɛӂ��邱�ƁD
rem #      �܂��C�{�\�t�g�E�F�A�̃��[�U�܂��̓G���h���[�U����̂����Ȃ闝
rem #      �R�Ɋ�Â�����������C��L���쌠�҂����TOPPERS�v���W�F�N�g��
rem #      �Ɛӂ��邱�ƁD
rem #
rem #  �{�\�t�g�E�F�A�́CAUTOSAR�iAUTomotive Open System ARchitecture�j�d
rem #  �l�Ɋ�Â��Ă���D��L�̋����́CAUTOSAR�̒m�I���Y��������������̂�
rem #  �͂Ȃ��DAUTOSAR�́CAUTOSAR�d�l�Ɋ�Â����\�t�g�E�F�A�����p�ړI�ŗ�
rem #  �p����҂ɑ΂��āCAUTOSAR�p�[�g�i�[�ɂȂ邱�Ƃ����߂Ă���D
rem #
rem #  �{�\�t�g�E�F�A�́C���ۏ؂Œ񋟂���Ă�����̂ł���D��L���쌠�҂�
rem #  ���TOPPERS�v���W�F�N�g�́C�{�\�t�g�E�F�A�Ɋւ��āC����̎g�p�ړI
rem #  �ɑ΂���K�������܂߂āC�����Ȃ�ۏ؂��s��Ȃ��D�܂��C�{�\�t�g�E�F
rem #  �A�̗��p�ɂ�蒼�ړI�܂��͊ԐړI�ɐ����������Ȃ鑹�Q�Ɋւ��Ă��C��
rem #  �̐ӔC�𕉂�Ȃ��D
rem #
rem #  $Id: hsbv850e2fg4_cx_common.yaml 470 2014-10-10 05:33:29Z ksigihar $
rem #

set RUBY_HOME=c:/cygwin/bin
set PATH=%PATH%;%RUBY_HOME%
set PATH=%PATH%;C:\Program Files\Renesas Electronics\CS+\CACX
set PATH=%PATH%;C:\Program Files (x86)\Renesas Electronics\CS+\CACX

set OS_DIR=../../../../../../atk2-sc1
set CFG_DIR=%OS_DIR%/cfg/cfg
set ABREX_DIR=%OS_DIR%/utils/abrex
set TARGET_DIR=%OS_DIR%/target/hsbv850e2fg4_gcc
set COMSTACK_PATH=../../../../../../a-comstack/
set RTE_DIR=../../../../../../a-rtegen

set APP_NAME=HelloAutosarWithCom_ECU2


ruby %ABREX_DIR%/abrex.rb ../../%APP_NAME%.yaml ../hsbv850e2fg4_cx_common.yaml
move ..\..\%APP_NAME%.arxml . > nul


echo execute RTE generator
call %RTE_DIR%/bin/bin/rtegen.bat %TARGET_DIR%/target_hw_counter.arxml ../../../../general/HelloAutosar/SystemDesk_WithCom_EcuInstance2.arxml ./%APP_NAME%.arxml

echo execute cfg Com
start /b %CFG_DIR%/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file %COMSTACK_PATH%/com/com.ini --api-table %COMSTACK_PATH%/com/com.csv -T %COMSTACK_PATH%/com/com.tf %APP_NAME%.arxml

echo execute cfg PduR
start /b %CFG_DIR%/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file %COMSTACK_PATH%/pdur/pdur.ini --api-table %COMSTACK_PATH%/pdur/pdur.csv -T %COMSTACK_PATH%/pdur/pdur.tf %APP_NAME%.arxml

echo execute cfg CanIf
start /b %CFG_DIR%/cfg.exe --omit-symbol --pass 2 --kernel atk2 --ini-file %COMSTACK_PATH%/canif/canif.ini --api-table %COMSTACK_PATH%/canif/canif.csv -T %COMSTACK_PATH%/canif/canif.tf %APP_NAME%.arxml

echo execute cfg Can

if exist cfg1_out.* del /F cfg1_out.*
if exist cancfg rmdir /S /Q cancfg
echo /* this is dummy */ > Can_Cfg.h
copy configure.mtpj cancfg.mtpj > nul
copy ..\cancfg.py .  > nul
CubeSuite+.exe /ps cancfg.py cancfg.mtpj
move .\cancfg\cfg1_out.srec . > nul

start /b %CFG_DIR%/cfg.exe --cfg1-def-table %COMSTACK_PATH%/can/arch/fcn/prc_def.csv --pass 2 --kernel atk2 --ini-file %COMSTACK_PATH%/can/can.ini --api-table %COMSTACK_PATH%/can/can.csv -I %COMSTACK_PATH%/can -I %COMSTACK_PATH%/can/arch/fcn -T %COMSTACK_PATH%/can/target/hsbv850e2fg4_cx/Can_Target.tf %APP_NAME%.arxml %TARGET_DIR%/target_hw_counter.arxml

pause
exit
