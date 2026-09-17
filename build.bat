@echo off
if exist out rmdir /s /q out
mkdir out

echo Compiling...
javac -d out ^
  src\ru\university\lab1\Main.java ^
  src\ru\university\lab1\numbers\*.java ^
  src\ru\university\lab1\strings\*.java ^
  src\ru\university\lab1\arrays\*.java ^
  src\ru\university\lab1\methods\*.java

if errorlevel 1 (
    echo Compilation failed!
    exit /b 1
)

echo Creating JAR...
jar cfm app.jar manifest.mf -C out .

echo.
echo ================================
echo Gotovo! Zapusti: java -jar app.jar
echo ================================