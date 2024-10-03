@SmokeScenario
Feature: Test login functionality

  @SmokeTest
  Scenario:  Check if login is successful with valid credentials
  
    Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    And Enter the email id as "sivaranjani@dell.com"
    When Enter the password "Test@123"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    
    
  	
  Scenario Outline: Login Data Driven
  
    Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    And Enter the email id as "<email>"
    When Enter the password "<password>"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    
    Examples:
    | email | password |
    | sivaranjani@dell.com | Test@123|
    | sivaranjani1@dell.com | Test@123|