Feature:FlipKart WebSite module
    
@flip_page1
Scenario:Validate the for flipKart Application
    Given Launch to the Application URL "https://www.flipkart.com/"
    When Enter the Mobile name "RedMi 15 5g"
    And Click the Search icon
    Then Validate the purchase

@flip_page2    
Scenario:Validation the mobile pages
    Given Purchase to the flipKart Application 
    When The Application Window Scroll Down
    And Click the mobile page
    And Get the page  Mobile name and Price
    Then Validate mobile pages
    
    
