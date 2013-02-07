@echo off

REM Set Java Home
call 0_set_Env.bat

REM Compile java classes
"%JAVA_HOME%\bin\javac" -d ..\bin ..\src\org\antczak\rmi\resources\*.java
"%JAVA_HOME%\bin\javac" -d ..\bin ..\src\org\antczak\rmi\remote\*.java
"%JAVA_HOME%\bin\javac" -d ..\bin ..\src\org\antczak\rmi\*.java
copy ..\src\org\antczak\rmi\resources\*.properties ..\bin\org\antczak\rmi\resources\ >nul

REM Generate RMI Stub
cd ..\bin
"%JAVA_HOME%\bin\rmic" org.antczak.rmi.remote.WeatherForecast
cd ..\scripts-win

echo Done.