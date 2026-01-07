package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search_Hotel_Locators extends Login_page_Locators{
      
	 public static WebElement getLocation() {
		   return driver.findElement(By.name("location"));	 
	 }
	 
	 public static WebElement getHotels() {
			return driver.findElement(By.name("hotels"));	 
     }
	 
	 public static WebElement getRoomType() {
			return driver.findElement(By.name("room_type"));	 
	 }
	 
	 public static WebElement getNumberOfRooms() {
			return driver.findElement(By.name("room_nos"));	 
	 }
	 
	 public static WebElement getCheckInDate() {
			return driver.findElement(By.name("datepick_in"));	 
	 }
	 
	 public static WebElement getCheckOutDate() {
			return driver.findElement(By.name("datepick_out"));	 
	 }
	 
	 public static WebElement getAdultperRoom() {
			return driver.findElement(By.name("adult_room"));	 
	 }
	 
	 public static WebElement getChildrenperRoom() {
			return driver.findElement(By.name("child_room"));	 
	 }
	 
	 public void getSearchBtn() {
		    getElement(By.id("Submit")).click();
	 }
	 
}
