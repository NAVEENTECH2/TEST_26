package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page_exe.Book_Hotel_Exe;
import com.page_exe.Login_page_Exe;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinPage extends Book_Hotel_Exe {
	public static WebDriver driver;
	
	@Given("Login to the Web URL {string}")
	public void login_to_the_Web_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	@When("Enter the firstValue {string}")
	public void enter_the_first_Value(String username) {
	    Login_page_Exe.firstValue(username);
	   
	}
	@When("Enter the secondValue {string}")
	public void enter_the_second_Value(String password) {
	    Login_page_Exe.secondValue(password);
	}
	@When("Click to the Application login button")
	public void click_to_the_Application_login_button(By locator) {
	    loginBtn(locator);
	}
	@Then("Validate the hotel page")
	public void validate_the_hotel_page() {
	    System.out.println("Successful");
	}
}