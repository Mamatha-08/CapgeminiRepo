Feature: Store login

This feature deals with the login functionality.

Scenario Outline: Login with correct username and correct password

#Given I navigate to Browser
Given  I navigate "https://demo.guru99.com/test/newtours/index.php"

Then I navigate to RegisterPage

When I insert "<First-Name>" and "<Last-Name>" and "<phone>" and "<email>" and "<password>" and "<confirmPassword>"

And I clicked the submit button

# Then Its navigates the UI "<expected Result>"
Then Its navigated to the Successfull Registration


Examples:

| First-Name | Last-Name | phone | email | username | password | confirmPassword |

| mercury | mercury | 9876545443 | amhscg@gmail.com | mercury | M123456 | M123456 |

