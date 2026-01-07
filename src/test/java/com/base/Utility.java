package com.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver = null;
	public static  JavascriptExecutor js;
	public static Actions actions;

	// **** 1. Launch Browser ****
	public WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("Invalid browser: " + browserName);
		}
	//	driver.manage().timeouts().implicitlyWait(0, null);
		return driver;
	}

	// **** 2. Open URL ****
	public void openUrl(String url) {
		driver.get(url);
	}

	// **** 3. Get Page Title ****
	public String getPageTitle() {
		return driver.getTitle();
	}

	// **** 4. Find Element ****
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// **** 5. Find Elements ****
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// **** 6. Click ****
	public void click(By locator) {
		getElement(locator).click();
	}

	// **** 7. Send Keys ****
	public WebElement type(WebElement locator, String text) {
		
		locator.clear();
		locator.sendKeys(text);
		return locator;
	}

	// **** 8. Get Text ****
	public String getText(By locator) {
		return getElement(locator).getText();
	}
}
