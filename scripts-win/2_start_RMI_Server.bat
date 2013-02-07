@echo off

REM Set Java Home
call 0_set_Env.bat

REM Start RMI registry
"%JAVA_HOME%\bin\rmiregistry" 1099
