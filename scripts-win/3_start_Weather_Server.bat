@echo off

REM Set Java Home
call 0_set_Env.bat

REM Start server
cd ..\bin
"%JAVA_HOME%\bin\java" -Djava.security.policy=..\java.mypolicy org.antczak.rmi.WeatherServer
cd ..\scripts-win