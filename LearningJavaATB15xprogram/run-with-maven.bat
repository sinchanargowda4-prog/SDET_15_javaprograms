@echo off
REM Helper to run RestAssured Test via Maven if mvn is installed
setlocal

REM check mvn on PATH
where mvn >nul 2>nul
if errorlevel 1 (
  echo Maven not found on PATH.
  echo.
  echo To install Maven on Windows (two easy options):
  echo  A) Using Chocolatey (recommended if you have Chocolatey):
  echo     choco install maven -y
  echo  B) Manual install:
  echo     1) Download the binary zip from: https://maven.apache.org/download.cgi
  echo     2) Extract, e.g. to C:\Program Files\Apache\maven
  echo     3) Add the Maven bin folder to PATH, e.g.:
  echo        setx PATH "%%PATH%%;C:\\Program Files\\Apache\\maven\\bin"
  echo     4) Open a new command prompt and run: mvn -v
  echo.
  echo Alternatively run from an IDE (Eclipse): Import as Existing Maven Project or right-click the project -> Run As -> Maven test
  exit /b 1
)

echo Running test restassured.example1 via Maven...
cd /d "%~dp0"
mvn -Dtest=restassured.example1 test
endlocal
pause