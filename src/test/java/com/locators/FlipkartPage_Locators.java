package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class FlipkartPage_Locators extends Utility {
       
	   public static WebElement getMobile() {
		return driver.findElement(By.xpath("//input[@name='q']"));
		   
	   }
	   
	   public static WebElement getSearchClk() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
		   
	   }
	   
	   public static void getscrollDown() {
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,9000)");
	   }
	   
	   public static WebElement getPageClk() {
		return driver.findElement(By.xpath("(//a[@class='i2eZXn'])[6]"));
		   
	   }
	   
	   public static WebElement getMobilename() {
		return driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]"));
		
	   }
	  
	   public static WebElement getPrice() {
		return driver.findElement(By.xpath("(//div[@class='hZ3P6w DeU9vF'])[1]"));
		   
	   }
	   
}
