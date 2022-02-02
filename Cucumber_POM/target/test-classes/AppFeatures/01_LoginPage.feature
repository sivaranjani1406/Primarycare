Feature: login functionality

  Scenario: Login page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Primary Care"


  Scenario: Check Login with valid credentials
    Given user is on login page
    When user enters username 'pcfrontdeskuat@gmail.com'
    And user enters password 'Primarycare@123'
    And user clicks on the Login button
    Then user gets the title of the page
    And page title should be "Primary Care"
