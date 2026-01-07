Feature:AdacTin hotel page module

@demo_Auto
Scenario: Validate the correct firstValue and secondValue
  Given Login to the Web URL "https://adactinhotelapp.com/"
  When Enter the firstValue "Naveen004"
  And Enter the secondValue "Naveen2001"
  And Click to the Application login button
  Then Validate the hotel page