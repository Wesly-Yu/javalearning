@echo off
echo path:%~dp0

::ȡ��bat�ļ����ڵĵ�ǰĿ¼
set base=%~dp0

set class=%base%\classes
set libs=%base%\libs

set class_path=%class%;

java -classpath %class_path% selenium.Situations.createTestReport.Main
@pause