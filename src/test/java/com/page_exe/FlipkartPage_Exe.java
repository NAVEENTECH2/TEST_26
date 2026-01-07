	package com.page_exe;
	
	import java.time.Duration;
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.base.Utility;
	import com.locators.FlipkartPage_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class FlipkartPage_Exe extends FlipkartPage_Locators {
		
	
		 public static  WebDriverWait wait ;
		 public static void mobile() {
			 new Utility().type(FlipkartPage_Locators.getMobile(), "Redmi 15 5g");
		 }
		 
		 public static  void searchClk(By locator) {
			  getElement(locator).click();
		 }
		 
		 public static void scrollDown() {
			    WebDriverManager.chromedriver().setup(); 
			    driver = new ChromeDriver();
			    driver.get("https://www.flipkart.com/");
			    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("RedMi 15 5g");
			    driver.findElement(By.xpath("//button[@type='submit']")).click(); 
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,9000)");
		 }
	     
		 public static void pageClk() throws InterruptedException {
			    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				WebElement clkpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='i2eZXn'])[6]")));
				Thread.sleep(2000);
				clkpage.click();
			 
		 }
		 
		 public static void mobilenameAndPrice() {
			 wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		     List<WebElement> name = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='RG5Slk'])[1]")));
		     for (int i = 0; i < name.size(); i++) {
		    	 System.out.println(name.get(i).getText());
		     
		     
			 List<WebElement> price = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='hZ3P6w DeU9vF'])[1]")));
				for (int j = 0; j < price.size(); j++) {
					System.out.println(price.get(j).getText());
		       }
		     }
		  }
	}
