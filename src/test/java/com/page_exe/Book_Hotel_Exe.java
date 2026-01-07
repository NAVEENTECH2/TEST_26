package com.page_exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;
import com.locators.Book_Hotel_Locators;

public class Book_Hotel_Exe extends Select_Hotel_Exe {
	
     public static void firsName() {
		 new Utility().type(Book_Hotel_Locators.getFirstName(), null);
    	 
     }
     
     public static void  lastName() {
    	 new Utility().type(Book_Hotel_Locators.getLastName(), null);
     	 
      }
     
     public static void  bAddreess() {
    	 new Utility().type(Book_Hotel_Locators.getBAddress(), null);
    	 
       }
     
     public static void  creaditNo() {
    	 new Utility().type(Book_Hotel_Locators.getCreaditNo(), null);
      	 
       }
     
     public static void  creadiType() {
    	 new Utility().type(Book_Hotel_Locators.getCreaditType() , null);
       	 
        }
     
     public static void expiryDate() {
    	 new Utility().type(Book_Hotel_Locators.getExpiryDate(), null);
       	 
        }
     
     public static void cvvNum() {
    	 new Utility().type(Book_Hotel_Locators.getCvvNo(), null);
       	 
        }
     
}
