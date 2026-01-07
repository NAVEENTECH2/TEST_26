package com.stepdefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPage {
	public static WebDriver driver;
	public  static WebDriverWait wait;
	@Given("Launch to the Application URL {string}")
	public void launch_to_the_application_url(String url) {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	}
	
	@When("Enter the Mobile name {string}")
	public void enter_the_mobile_name(String mobil) {
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(mobil);
	}
	
	@When("Click the Search icon")
	public void click_the_search_icon() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("Validate the purchase")
	public void validate_the_purchase() {
	    System.out.println("Complete");
	}
	
	@Given("Purchase to the flipKart Application")
	public void Purchase_to_the_flipKart_Application() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("RedMi 15 5g");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@When("The Application Window Scroll Down")
	public void the_application_window_scroll_down() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
	}
	
	@When("Click the mobile page")
	public void click_the_mobile_page()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement clkpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='i2eZXn'])[6]")));
		clkpage.click();
	}
	
	@When("Get the page  Mobile name and Price")
	public void get_the_page_mobile_name_and_price() {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	     List<WebElement> name = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='RG5Slk']"))); 
		 List<WebElement> price = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='hZ3P6w DeU9vF']")));
		 int mobilecount = Math.min(name.size(),price.size());
		 for (int i = 0; i < mobilecount; i++) {
			String mobileName = name.get(i).getText();
			String mobilePrice = price.get(i).getText();
			System.out.println(mobileName + " " + mobilePrice);
		}
	}

	@Then("Validate mobile pages")
	public void validate_mobile_pages() {
	    System.out.println("Completed this page");
	    driver.quit();
	}
}
