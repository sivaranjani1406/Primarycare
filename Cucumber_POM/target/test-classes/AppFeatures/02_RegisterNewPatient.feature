Feature: login functionality

Background:
Given user has already logged in to application
|username|password|
|pcfrontdeskuat@gmail.com|Primarycare@123|

Scenario: Register New Patient screen
Given user is on Dashboard page 
Then User clicks on Registernewpatient button
And user clicks on RegisterPatient button
And user fills Patient Details
