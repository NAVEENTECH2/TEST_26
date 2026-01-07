Feature: Login Page Module

@test1
Scenario: Validate the correct userName and password
  Given Login to the Application URL "https://adactinhotelapp.com/"
  When Enter the UserName "Naveen004"
  And Enter the password "Naveen2001"
  And Click the login button
  Then Validate the home page
  
@test2
Scenario:  Validate the incorrect userName and password
  Given Login to the Application URL "https://adactinhotelapp.com/"
  When Enter the UserName "Naveen456004"
  And Enter the password "Naveen2035@01"
  And Click the login button
  Then Validate the home page
  
@test3
Scenario Outline:Validate the login page
  Given Login to the Application URL "https://adactinhotelapp.com/"
  When Enter the User "<userName>"
  And Enter the pass "<password>"
  And Click the login button
  Then Validate the home page
  
  Examples:
     | userName | password |
     | Naveen1  | 12345    |
     | Naveen2  | 67890    |