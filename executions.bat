cd .\src
javac -d ..\build Main.java
cd ..\build
java -cp ..\src\library-mysql-connector-java; Main

pause;