# spring-core-training

### Use spring profiles to use different properties files for different environments
It's possible to have different application.properties files for different environments.  
But you have to tell spring which one to use when starting up the application.  
Spring will use the application.properties default, but you have the possibility to set  
another profile as active and will thereby include another application-{profile}.properties file.

**Example:**  
I want another configuration (url, username, password) for my database in development environment.  
I can then create a new file called application-dev.properties and override the default values 
found in application.properties file.    
Set the profile to dev (spring.profiles.active=**dev**) to tell Spring to also read from the application-dev.properties file.   
Beware that the 'dev' will have to match the file name application-**dev**.properties.  

There are a number of ways to set the spring.profiles.active property, but one way is to add it in the application.properties, as 
we do here. Another way is to add it as an argument to the JVM or as an environment variable.
branch: tutorial2-different-profiles

spring.profiles.active=dev

Check the example:  
git clone -b tutorial2-different-profiles https://github.com/crille/spring-core-training.git