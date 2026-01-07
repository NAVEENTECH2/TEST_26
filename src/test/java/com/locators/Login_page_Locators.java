package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class Login_page_Locators extends Utility{
	 
	 public static WebElement getFirstValue() {
		return driver.findElement(By.id("username"));
		
	}
	 
	 public static WebElement getSecondValue() {
	    return driver.findElement(By.id("password"));
			
    }
	 
	 public void getLoginBtn () {
		 getElement(By.id("login")).click();
	}
}
