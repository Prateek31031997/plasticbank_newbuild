To execute TestScript follow these steps.

SetUp Test Environment:

1.Install Appium server (version 1.22.3-4 )
	
	install nodejs

2.Install Android Studio - 

	2.1 Device : pixel 4 API 30
		Android 11
		
3.Install Ide :

	 Eclipse/IntelliJ IDEA

4.Download Java 17 and set path for it in Environment Variable

5.Install Newman
	
	Use Command:
	5.1 npm install -g newman


Execute Test Script:

1.Run testng.xml file as TestNg suite

2.Open Allure Results (follow steps below to generate report)-

	2.1 After Execution refresh Package Explorer
	2.2 Copy the path of allure-results in package Explorer

	2.2 Open cmd write command : 
		allure serve <path of allure-results>


