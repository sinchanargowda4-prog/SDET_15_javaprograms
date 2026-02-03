# LearningJavaATB15xprogram — RestAssured Test Example

This project contains a minimal RestAssured + TestNG example and a Maven POM to manage dependencies.

Prerequisites
- Java JDK installed (the project pom uses `release` 21; Java 21 or compatible is recommended).
- Maven installed and on PATH, or use the included full-path helper script.

Files of interest
- `pom.xml` — Maven project file (rest-assured, testng, slf4j-simple dependencies).
- `src/test/java/restassured/Example1Test.java` — the TestNG + RestAssured test.
- `testng.xml` — TestNG suite referencing the test class.
- `run-with-maven.bat` — helper script that checks for `mvn` and runs the test.

Run the test (preferred)
1) If Maven is available on PATH, open a new Command Prompt and run:

```cmd
cd /d "c:\Users\sinchana\git\repository\SDET_15_javaprograms\LearningJavaATB15xprogram"
mvn -Dsurefire.suiteXmlFiles=testng.xml test
```

2) Or run the helper (will instruct how to install Maven if missing):

```cmd
cd /d "c:\Users\sinchana\git\repository\SDET_15_javaprograms\LearningJavaATB15xprogram"
run-with-maven.bat
```

Notes
- If you recently installed Maven, open a new terminal so the updated PATH is picked up.
- If you prefer running a single test class instead of the suite file, run:

```cmd
mvn -Dtest=restassured.Example1Test test
```

Troubleshooting
- If dependency download fails, check network/proxy and add proxy settings in `~/.m2/settings.xml`.
- If TestNG reports no tests run, ensure the test class is under `src/test/java` and named according to Surefire patterns (e.g., `*Test`).

If you want, I can import the project into Eclipse and verify the test runs inside the IDE as well.
