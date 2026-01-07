package com.page_exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class Search_Hotel_Exe extends Login_page_Exe  {
	
      public WebElement location() {
		 return new Utility().getElement(By.id("location"));
		  
    	  
      }
      
      public WebElement hotels() {
		 return new Utility().getElement(By.id("hotels"));
    	  
      }
      
      public WebElement roomType() {
		 return new Utility().getElement(By.name("room_type"));
		
    	  
      }
      
      public WebElement NumberOfRooms() {
		 return new Utility().getElement(By.name("room_nos"));
    	  
      }
      
      public WebElement CheckInDate() {
    	  return new Utility().getElement(By.id("datepick_in"));
      }
      
      public WebElement CheckOutDate() {
    	  return new Utility().getElement(By.id("datepick_out"));
      }
      
      public WebElement adultsperRoom() {
		 return new Utility().getElement(By.id("adult_room"));	  
      
      }
      
      public WebElement childrenperRoom() {
  		 return new Utility().getElement(By.id("child_room"));
  		
        
      }
      
      public void searchClk(String locator) {
    	  new Utility().getElement(By.id("Submit")).click();;
      }
      
      
}
