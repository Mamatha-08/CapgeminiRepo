Feature: Store login
This feature deals with the login functionality.

Background:
	Given I navigate to login page
@TC1
Scenario: Login with correct username and correct password
 
	
	And I entered username and password
	And I clicked signin button
	Then Its navigated to the HomePage
	
@TC2	
Scenario: Login with correct username and Incorrect password
 
	And I entered correct username
	And I clicked signin button
	But Invalid pwd
	Then Its navigated to the error msg

	