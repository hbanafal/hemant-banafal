
# bestbuy-api

**This is the Gradle subproject containing api automation framework and tests for Best Buy API playground.**

This assignment is done using Java as programming language, Serenity as Junit wrapper, io.rest-assured Java library. POJO is used to serialize and deserialize into JSON object. BDD approach & Single-responsibility principle (SRP) is followed while creating the framework.

**Testing scope** - Products service is used for api automation. All the CRUD operations are automated. 

Requirements :
1.  Java 1.8+ should be installed on the machine.
2.  Gradle should be installed on the machine.

Steps :
1.  Start Best Buy API server using instructions given in [https://github.com/BestBuy/api-playground/blob/master/README.md](README.md)
2.  Clone the repo using - git clone  [https://github.com/hbanafal/hemant-banafal.git](https://github.com/hbanafal/hemant-banafal.git)
3.  Go to the subproject directory - cd hemant-banafal/bestbuy-api
4.  Run tests using command - ./gradlew clean test 
5.  Generate Serenity Reports using - ./gradlew aggregate
6.  Open report from the path - bestbuy-api/target/site/serenity/index.html
7.  Click on Test Results in the report and check the stories and steps involved in the test.

Configuration - /src/main/resources/config.properties contains BaseURI. Please update the BaseURI if required.
