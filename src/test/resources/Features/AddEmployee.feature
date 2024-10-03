Feature: Add Employee manually 
 
  Scenario Outline: Add Employee manually 
  
  
   Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    And Enter the email id as "sivaranjani@dell.com"
    When Enter the password "Test@123"
    Then Click on the login button
    And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    Given Click on the employee icon  
    When Click on the Add employee button 
    Then Enter the "<FirstName>", "<LastName>","<EmailId>"," <employeeId>"," <PhoneNumber> "
    And Select the company 
    Then Click on the Add button "Employee already registered" 

    Examples: 
      | FirstName  | LastName | EmailId  | employeeId | PhoneNumber |
      | sam |    S | sam | 9011 | 9828999999 |
      #| velan  |    S | velan | 9005 | 9828888888 |
	
#		Feature: Checking the added Employee  
 
  #Scenario Outline: Already added Employee 
  #
  #
   #Given Open the browser and enter the url "https://dev-atndnz.offrd.co/"
    #And Enter the email id as "sivaranjani@dell.com"
    #When Enter the password "Test@123"
    #Then Click on the login button
    #And I should be redirected to the home page "https://dev-atndnz.offrd.co/home"
    #Given Click on the employee icon  
    #When Click on the Add employee button 
    #Then Enter the "<FirstName>", "<LastName>","<EmailId>"," <employeeId>"," <PhoneNumber> "
    #And Select the company 
    #Then Click on the Add button "Employee ID already exists" 
#
    #Examples: 
      #| FirstName  | LastName | EmailId  | employeeId | PhoneNumber |
      #| sethal |    S | sethal | 9006 | 98289878787 |
      #| velan  |    S | velan | 9005 | 9828888888 |
