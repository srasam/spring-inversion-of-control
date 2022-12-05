


About the project:
This is a sample java/spring application that can be used to understand the concept of dependency injection in spring. The project demonstrates constructor and setter injections in spring

Technologies and tools used
1. Java 11
2. Spring 5.3.9
3. Eclipse IDE

How to download spring jar files and add it to the lib folder of your project:
1. Go to this URL: https://repo.spring.io/ui/packages
2. Use the path below to choose the latest version of spring version to download the libraries
	Path: Artifactory->choose artifacts->libs-release->org->springframework->spring->choose latest version->download spring dist.zip
3. unzip file->libs->copy all jar files->paste in lib folder of the project
4. Add these jar file to java build path (Classpath)

Instructions:
1. How to checkout the code from git?
clone this repository: https://github.com/srasam/spring-dependency-injection.git

2. How to Run the code locally?
There are several ways to run a Spring application on your local machine. One way is to execute the main method in the com.demo.spring.HelloSpringApp class from your IDE.

3. How to deploy to Tomcat locally and on remote server?
This project does not require a tomcat server. This is a simple spring application 

4. How to run standalone in a Linux server?
5. How to generate a runnable executable?


Development process:

define the dependency interface and class
FortuneService.java- interface
HappyFortune.java- implementation of the fortune service interface
HelloSpringApp- main method

create a constructor in your class for injections
public class TrackCoach implements Coach {
private FortuneService fortuneService;
public TrackCoach(FortuneService fortuneService) { - (constructor injection)
this.fortuneService = fortuneService;
}

configure the dependency injection in spring config file
<bean id="happyFortune" class="com.demo.spring.HappyFortune">
</bean> <!-- (define dependency)-->
<bean id="basketballCoach" class="com.demo.spring.BasketballCoach">
<constructor-arg ref="happyFortune" /> <!--inject dependency using constructor injection-->
</bean>

Behind the scene(BTS) spring will create and manage objects:
HappyFortune MyFortune= new HappyFortune ();
BasketballCoach myCoach= new BasketballCoach(MyFortune);

setter injection:

public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

<bean id="cricketCoach" class="com.demo.spring.CricketCoach">
		<property name="fortuneService" ref="myFortune" />

BTS: CricketCoach myCricketCoach= new CricketCoach();
CricketCoach.setFortuneService(myFortune);


TODO:
- Execute the same project using Maven instead of downloading the lirbaries manually
