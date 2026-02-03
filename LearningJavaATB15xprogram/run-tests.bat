@echo off
setlocal enabledelayedexpansion

REM Project paths (this script assumes it's placed in the project root)
set PROJECT_ROOT=%~dp0
set SRC=%PROJECT_ROOT%src
set BIN=%PROJECT_ROOT%bin

REM JAR locations (using your Eclipse p2 plugins folder)
set TESTNG=%USERPROFILE%\.p2\pool\plugins\org.testng_7.11.0.r202503091654.jar
set JCMD=%USERPROFILE%\.p2\pool\plugins\com.beust.jcommander_1.83.0.jar
set SLF=%USERPROFILE%\.p2\pool\plugins\slf4j.api_2.0.17.jar

if not exist "%BIN%" mkdir "%BIN%"
necho Collecting Java sources...
set SRCS=
for /R "%SRC%" %%f in (*.java) do (
  set SRCS=!SRCS! "%%f"
)
necho Compiling sources...
javac -cp "%TESTNG%;%JCMD%;%SLF%" -d "%BIN%" %SRCS%
if errorlevel 1 (
  echo Compilation failed.
  pause
  exit /b 1
)
necho Running TestNG...
java -cp "%BIN%;%TESTNG%;%JCMD%;%SLF%" org.testng.TestNG -testclass annotations.annotaionexample1
nendlocal
pause
