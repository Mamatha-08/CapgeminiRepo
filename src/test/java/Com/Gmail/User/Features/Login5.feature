Feature: Testing the POM with BDD here.
 
@sce1
Scenario Outline: Data driven testing with BDD implementing POM with page Factory.
 
Given I navigated to main page "http://demo.guru99.com/test/newtours/"
#And I entered username and password
When I inserted the "<userName>" and "<passWord>"
When After I have clicked signin button
Then It got navigated to the home page "<output>"
 
 
@Invalid
Examples:
 
| userName | passWord | output |
 
| mercury | mercury | Login Successfully |
 
| Ravindra | Jadeja | Login Successfully |
 
| Ronaldo | Cr7 | Enter your userName and password correct |
 
 