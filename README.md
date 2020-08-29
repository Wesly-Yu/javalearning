Selenium HUB

Pre-requisites
1) We should have driver and browser on local and  remote system
2) Make local system as HUB server  then register all the VM's with hub 
3) Write test case then execcute on remote system

Convert your local system as hubserver
---------------------------------------------

java -jar selenium-server-standalone-3.141.59.jar -role hub -port 44444

Nodes should register to http://192.168.0.4:44444/grid/register/

Client should connect to http://192.168.0.4:44444/wd/hub

1)Windows(Hub)-------------->Windows(Chrome)
2)Windows(Hub)-------------->Linux(Firefox)


java -Dwebdriver.chrome.driver="E:\javalearning\src\main\resources\webdriver\chromedriver.exe"  -jar selenium-server-standalone-3.141.59.jar -role node  -hub http://192.168.0.4:44444/grid/register/

Check Hub is running or not
----------------------------
http://localhost:44444/grid/console