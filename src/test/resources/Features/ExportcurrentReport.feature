Feature: Get the export report fo the csv

  @SmokeTest
  Scenario:  Check if login is successful with valid credentials
  
    Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    And Enter the email id as "sivaranjani@dell.com"
    When Enter the password "Test@123"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    When Click on the report button
    And Click on the export button and get the current report of the month 
    