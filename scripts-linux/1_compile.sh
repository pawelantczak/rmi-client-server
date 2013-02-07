# Compile java classes

export CLASSPATH=../bin

javac -d ../bin ../src/*/*/*/*/*.java
javac -d ../bin ../src/*/*/*/*.java
cp ../src/org/antczak/rmi/resources/*.properties ../bin/org/antczak/rmi/resources/


# Generate RMI Stub
cd ../bin
rmic org.antczak.rmi.remote.WeatherForecast
cd ../scripts-linux

echo Done.