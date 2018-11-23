set projectLocation=E:\Devops\Eclipse\testNG_demo
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\src\improved_testng.xml
pause