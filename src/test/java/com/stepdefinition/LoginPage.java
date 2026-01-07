package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver =null;
	@Given("Login to the Application URL {string}")
	public void login_to_the_application_url(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        

	}
	@Then("Enter the UserName {string}")
	public void enter_the_user_name(String user) {
	    driver.findElement(By.id("username")).sendKeys(user);
	    
	}
	@Then("Enter the password {string}")
	public void enter_the_password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@Then("Click the login button")
	public void click_the_login_button() {
         driver.findElement(By.name("login")).click();
	}
	
	@Then("Validate the home page")
	public void validate_the_home_page() {
	     System.out.println("error result");
	     driver.quit();
	}
	@When("Enter the User {string}")
	public void enter_the_user(String user) {
	     driver.findElement(By.id("username")).sendKeys(user);
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String pass) {
		 driver.findElement(By.id("password")).sendKeys(pass);
	}
	@Given("Login to the AdacTin Application")
	public void login_to_the_adac_tin_application() {
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.get("https://adactinhotelapp.com/");
	     driver.findElement(By.id("username")).sendKeys("Naveen004");
	     driver.findElement(By.id("password")).sendKeys("Naveen2001");
	     driver.findElement(By.name("login")).click();
	}
	@When("Enter the search for Hotel fields")
	public void enter_the_search_for_hotel_fields(DataTable dataTable) {
		 Map<String, String> data = dataTable.asMap();
	     WebElement element = driver.findElement(By.name("location"));
	     Select s = new Select(element);
	     s.selectByVisibleText(data.get("Location"));
	     
	     WebElement element1 = driver.findElement(By.name("hotels"));
	     Select s1 = new Select(element1);
	     s1.selectByVisibleText(data.get("Hotels"));
	     
	     WebElement element2 = driver.findElement(By.name("room_type"));
	     Select s2 = new Select(element2);
	     s2.selectByVisibleText(data.get("Room Type"));
	     
	     WebElement element3 = driver.findElement(By.name("room_nos"));
	     Select s3 = new Select(element3);
	     s3.selectByVisibleText(data.get("Number of Rooms"));
	     
	    
	     
	     
	}
	@When("Enter the search for Hotel fields using list")
	public void enter_the_search_for_hotel_fields_using_list(DataTable dataTable) {
		 List<String> asList = dataTable.asList();
	     WebElement element = driver.findElement(By.name("room_type"));
	     Select s = new Select(element);
	     s.selectByVisibleText(asList.get(2));
	     
	}
}
