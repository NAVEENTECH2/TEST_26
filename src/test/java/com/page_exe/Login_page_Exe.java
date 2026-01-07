package com.page_exe;

import org.apache.poi.xdgf.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;
import com.locators.Book_Hotel_Locators;
import com.locators.Login_page_Locators;
import com.prop.Properties_file;


public class Login_page_Exe extends Properties_file {
	  
	  public static void firstValue(String username) {
		  new Utility().type(Login_page_Locators.getFirstValue(), getUser(username));
	  }
	  
	  public static void secondValue(String password) {
		  new Utility().type(Login_page_Locators.getSecondValue(), getPass(password));
	  }
	  
	 public void loginBtn(By locator) {
		  new Utility().click(locator);
	 }

	 
		  
}
