@loginFea
Feature: Store login
This feature deals with the login functionality.
Background:
	Given I navigate to Browser
	When I navigate "https://demo.guru99.com/test/newtours/index.php"
@test1

Scenario: Login with correct username and correct password


	
	When I enter the "mercury" and "mercury"
	
	And I clicked Submit button
	
	Then Its navigates the UI

@test2	
Scenario: Login with incorrect username and incorrect password


	Given I navigate to Browser

	#When I navigate "https://demo.guru99.com/test/newtours/index.php"
	
	But I enter the Wrong "mamatha" and "2004"
	
	And I clicked Submit button
	
	Then Its not navigates the UI
	
@test3
Scenario: Login with DataProvider 


	Given I navigate to Browser

	#When I navigate "https://demo.guru99.com/test/newtours/index.php"
	
	#When I enter the "mercury" and "mercury"
	When I entered following details

			| userName | passWord |
			
			| mercury | mercury |
			|mamatha | M2004 |


	And I clicked the signin button

	#Then Its navigated to the home page
	
	
	#And I clicked Submit button
	
	Then Its navigates the UI
	
	
	