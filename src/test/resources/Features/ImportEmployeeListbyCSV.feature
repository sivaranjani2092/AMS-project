Feature:  Import a CSV file containing a list of employees to be added to the employee roster


  Scenario:  Check CSV file has been successfully imported into the employee list
  
    Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    And Enter the email id as "sivaranjani@dell.com"
    When Enter the password "Test@123"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    When 