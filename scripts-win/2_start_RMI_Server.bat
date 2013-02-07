@echo off
set CLASSPATH=..\bin
REM Start RMI registry
"%JAVA_HOME%\bin\rmiregistry" 1099
