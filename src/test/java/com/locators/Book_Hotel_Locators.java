package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Book_Hotel_Locators extends Select_Hotel_Locators {
     
	   public static WebElement getFirstName() {
			return driver.findElement(By.id("first_name")); 	  
	  }
	   
	   public static WebElement getLastName() {
			return driver.findElement(By.id("last_name"));
	    	  
	  }
	   
	   public static WebElement getBAddress() {
		   return driver.findElement(By.name("address"));
		   
	   }
	   
	   public static WebElement getCreaditNo() {
		   return driver.findElement(By.name("cc_num"));
		   
	   }
	   
	   public static WebElement getCreaditType() {
		   return driver.findElement(By.name("cc_type"));
		   
	   }
	   
	   public static WebElement getExpiryDate() {
		   return driver.findElement(By.name("cc_exp_month"));
		   
	   }
	   
	   public static WebElement getCvvNo() {
		   return driver.findElement(By.name("cc_cvv"));
		   
	   }
	   
	   public void getBookClk() {
    	   getElement(By.name("book_now")).click();
      }
	   
	   
}
