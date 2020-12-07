
# monefy-mobile

**This is the Gradle subproject containing mobile automation framework and tests for Monefy  Android app.**

This assignment is done using Java as programming language, Serenity as Junit wrapper and Appium. BDD approach & Single-responsibility principle (SRP) is followed while creating the framework.

Note - APK file is downloaded from internet as link to APK is not working in the home assignment PDF file. Monefy lite APK file is used to develop the tests. Test should work on main Monefy app also but the package name in id (for e.g. com.monefy.app.lite:id/income_button) used as locator maybe different for the main Monefy APK. APK file is already present inside src/test/resources/ folder.

**Testing Scope** - Only few business critical scenarios are automated. 

Requirements :
1.  Java 1.8+ should be installed on the machine.
2.  Gradle should be installed on the machine.

Steps :
1.  Start  Appium server with localhost and spin up an Android emulator or connect a real android device.  
2. Clone the repo using - git clone  [https://github.com/hbanafal/hemant-banafal.git](https://github.com/hbanafal/hemant-banafal.git)
3.  Go to the subproject directory - cd hemant-banafal/monefy-mobile
4.  Run tests using command - ./gradlew clean test 
5.  Generate Serenity Reports using - ./gradlew aggregate
6.  Open report from the path - monefy-mobile/target/site/serenity/index.html
7.  Click on Test Results in the report and check the stories and steps involved in the test.

Configuration - /serenity.properties contains Appium capabilities. Please update the appium.hub if appium server is not running on localhost.

