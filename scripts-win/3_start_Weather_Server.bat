@echo off
REM Start server
cd ..\bin
"%JAVA_HOME%\bin\java" -Djava.security.policy=..\java.mypolicy WeatherServer
cd ..\scripts