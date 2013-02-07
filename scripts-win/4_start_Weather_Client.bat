@echo off
REM Start client
cd ..\bin
"%JAVA_HOME%\bin\java" -Djava.security.policy=..\java.mypolicy Weather
cd ..\scripts