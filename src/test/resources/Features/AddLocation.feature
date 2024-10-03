Feature: Test Addlocation functionality

  Scenario: Check if adding a location is successful with valid data
  
    Given Open the browser and enter the url "https://dev-atndnz.offrd.co"
    And Enter the email id as "sivaranjani@dell.com"
    When Enter the password "Test@123"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    Then Click on the location icon 
    And Click on the add location button
    When Enter the name, abbervation ,city, state,pincode, country and address
    Then Click on the add location button to create a new location
    And User can view confirmation alter message "Location added successfully