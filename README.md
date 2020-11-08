# Automation Task - ReadMe


This is testing task which covers automation of tasks/areas mentioned below:
- Create a project with Maven, WebDriver and TestNG.
- Write a test using WebDriver and TestNG to perform following actions:
- Load page http://book.theautomatedtester.co.uk/
- Click on link Chapter1
- Check that text «Assert that this text is on the page» is present on the page
- Navigate back to the first page with click on link Home Page
- It is preferrable to use PageObject pattern (describe the first Home and the second Chapter1 pages as Page
Object). 
- It will be great to use Selenide or HTML Yandex elements libraries. 
- TestNG suite needs to be created and this suite has to contain new Test. Suite must be marked as default for Maven surefire plugin.

### Prerequisities

Before Executing the scripts, make sure to have following resources:
- java jdk 1.8(preferrable)
- maven
- any IDE(intellij IDEA preferrable)



## Getting Started

- Pull the project folder from git repo in your local drive
- Open the project's pom.xml in your IDE as a project
- Wait for dependencies to load
- Once dependencies downloaded successfully, goto terminal at the bottom of the IDE
- run mvn clean test

	
## After Execution

- When the test suite execution is completed, check the html report from <<Project Location>>\target\surefire-reports\index.html
