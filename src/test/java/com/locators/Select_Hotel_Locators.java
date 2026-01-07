package com.locators;

import org.openqa.selenium.By;

public class Select_Hotel_Locators extends Search_Hotel_Locators{
	
	 public void getselectHotel() {
		 getElement(By.xpath("//input[@type='radio']")).click();
		 
	 }
	 
	 public void getContinue() {
		 getElement(By.id("continue")).click();
		 
	 }	 
	 
}
