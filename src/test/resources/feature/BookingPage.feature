Feature: AdacTin Hotel
        
  @test1_Map
  Scenario: Enter the details for AdaTin Hotel page
      Given Login to the AdacTin Application
      When Enter the search for Hotel fields
          | Location         | New York     |
          | Hotels           |Hotel Sunshine|
          | Room Type        | Double       |
          | Number of Rooms  | 2 - Two      |    
          | Check In Date    | 02/01/2026   |
          | Check Out Date   | 05/01/2026   |          
          | Adults per Room  | 3 - three    |
          | Children per Room| 1 - One      |
          
  @test1_List
  Scenario: Enter the details for AdaTin Hotel page
      Given Login to the AdacTin Application
      When Enter the search for Hotel fields using list
          | New York     |
          |Hotel Sunshine|
          | Double       |
          | 2 - Two      |   
     
     
   @test2_Booking
   Scenario: Validate the Hotel booking page
       Given Enter the deaTails for Hotel booking 
       When Enter the select for hotel booking fields 
       And Enter the Last name""
       And Enter the Build address""
       And Enter the CreaDit card no""