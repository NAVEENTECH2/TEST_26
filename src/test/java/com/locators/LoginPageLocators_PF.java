package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

import io.cucumber.java.Before;

public class LoginPageLocators_PF extends Utility {
	 public LoginPageLocators_PF() {
		 PageFactory.initElements(driver, this);
	}
	
     public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	 @FindBy (id = "username")
     private WebElement username;
     
     @FindBy (id = "password")
     private WebElement password;
     
}
