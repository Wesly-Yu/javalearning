@echo off
echo path:%~dp0

::取得bat文件所在的当前目录
set base=%~dp0

set class=%base%\classes
set libs=%base%\libs

set class_path=%class%;

java -classpath %class_path% selenium.Situations.createTestReport.Main
@pause