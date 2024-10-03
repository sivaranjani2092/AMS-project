Feature: Search Employee by Email id

  Scenario Outline: Search Employee by Email id
    Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    And Enter the email id as "sivaranjani@dell.com"
    When Enter the password "Test@123"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    Given Click on the employee icon 
    Then Click on the search box and enter the "<email id>"
    When User should found search result of the particular employee
    And Close the browser 
    
    
   Examples: 
  |  email id |
  | Siva@dell.com |    