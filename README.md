With maven (both Linux/Windows)
-------
1. Install Maven 3
2. Just run `make.bat`/`make.sh`
3. Run `target\scala-cgdk-jar-with-dependencies.jar`


Windows
--------
1. Install scala [http://www.scala-lang.org/download/]
2. Set SCALA_HOME to lib folder of installation. In my case it was
   `C:\Program Files(x86)\scala\lib`

   WARNING: path shall be specified without quotes
3. Make sure PATH variable points to `scalac.bat` and 'javac.exe`
4. Run `compile-scala.bat`
5. If succeeded - run `run-scala.bat`

Linux
---------
1. Install scala (it was just `apt-get install scala` for Ubuntu)
2. Set SCALA_HOME to folder where 'scala-library.jar' is located. In my case it was
   `/usr/share/java`
3. Make sure PATH variable points to `scalac` and `javac` (usually it does)
4. Run `compile-scala.sh`
5. If succeeded - run `run-scala.sh`