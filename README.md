# uSayCompareTest
#Project Title: AutomationPractice

#Technology/Features: 

	I used Intellij as an IDE,I used Selenium as an Automation tool and I done my coding in java (version 1.8)
	I used Maven as a build tool so that when I enable auto import I can download the dependency automatically and I do not have to go every now and then to look for dependencies 
	I used Cucumber as an integration tool where I integrate my BDD feature file framework using Gherkin language in GIVE, WHEN THEN format.
	Given, When, Then will create snippets when I first run the scenarios and then I copy those snippets into Steps directory
	I also create Utils.java class where I write my all reusable methods such as click, sendKeys, Explicit wait, clear etc.
	The Page Object Model helps me to create .java class for each page I will navigate to.
	In the Page object class define my locators at the top and create reusable methods at the bottom.
	This allows me to avoid duplication of code and easy maintenance when I need to change anything in the code.I can also integrate Jenkins to my framework so that regression can run in nightly build by adding just a line of code such as “System.getProperty(“browser”) in BrowserSelector.javaclass

#Test Run:

Steps to get the project running.
Can run the test from the “RunTest” (test\java\UsayCompare\Runner\RunTest.java) 
Here You can change the tag : @regression if you want to run separate scenarios from the feature file by giving .feature file tag e.g. tag: @register  just to run registration scenario of the project

#Installation:

Need Git Blash
Maven 3 
Java 1.8
GitHub account
IDE (I prefer Intelliji) 
Selenium
JUnit
TestNG

#How to use:

Navigate to repository page on GitHub click this link 

https://github.com/patelkaus99/uSayCompareTest.git

Click the green button labeled Code, then click on download zip file it will download the whole file to your computer in Downloads
Unzip the folder and store the file to any location you like
Open it in Intelliji IDe as it is been used to create this projet so you can run it in that 

Or

In order to utilise this project you need to have the following installed locally:
•	Maven 3
•	Chrome and Chromedriver 
•	Java 1.8
To run all modules, navigate to AutomationPractice directory and run: cmd from the file location and type:

mvn clean install

This will open browser and run the project without any IDE in your computer
