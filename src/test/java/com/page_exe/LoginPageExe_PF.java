package com.page_exe;

import org.openqa.selenium.WebElement;

import com.base.Utility;
import com.locators.LoginPageLocators_PF;

public class LoginPageExe_PF extends LoginPageLocators_PF{
	
	  public static void username() {
		  new Utility().type(new LoginPageLocators_PF().getUsername(), null);
	  }
	 

}
