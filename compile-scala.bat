@echo off
for %%X in (javac.exe) do (set JAVA_FOUND=%%~$PATH:X)
for %%X in (scalac.bat) do (set SCALA_FOUND=%%~$PATH:X)
for %%X in (scala-library.jar) do (set SCALA_LIB_FOUND=%%~$CLASSPATH:X)


if "%JAVA_FOUND%"=="" (
    echo "Cannot find 'javac.exe'. Make sure it is in PATH" > compilation.log
    exit 1
)

if "%SCALA_FOUND%"=="" (
    echo "Cannot find 'scala.bat'. Make sure it is in PATH and 'scala-library.jar' is in classpath" > compilation.log
    exit 1
)

if "%SCALA_LIB_FOUND%"=="" (
    echo "Cannot find 'scala-library.jar'. Make sure it is in CLASSPATH" > compilation.log
    exit 1
)

if not exist src\main\java\Runner.java (
    echo Unable to find src\main\java\Runner.java > compilation.log
    exit 1
)

if not exist src\main\scala\MyStrategy.scala (
    echo Unable to find src\main\scala\MyStrategy.scala > compilation.log
    exit 1
)

rd /Q /S classes
md classes

call scalac -encoding UTF-8 -sourcepath "src/main/scala" -d classes "src/main/scala/MyStrategy.scala" "src/main/scala/model/PlayerContext.scala" > compilation.log

if not exist classes\MyStrategy.class (
    echo Unable to find classes\MyStrategy.class >> compilation.log
    exit 1
)

javac -encoding UTF-8 -sourcepath "src/main/java" -classpath "classes;scala-library.jar" -d classes "src/main/java/Runner.java" > compilation.log

if not exist classes\Runner.class (
    echo Unable to find classes\Runner.class >> compilation.log
    exit 1
)

jar cvfe "./scala-cgdk.jar" Runner -C "./classes" .

:end