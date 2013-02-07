@echo off
REM Set Java Home
set JAVA_HOME=c:\Program Files\Java\jdk1.6.0_33

REM Compile java classes
"%JAVA_HOME%\bin\javac" -d ..\bin ..\src\*.java
@cd ..\bin\

REM Generate RMI Stub
"%JAVA_HOME%\bin\rmic" WeatherServer$WeatherForecast
@cd ..\scripts

echo Done.