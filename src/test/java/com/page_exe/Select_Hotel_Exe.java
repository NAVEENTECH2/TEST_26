package com.page_exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Utility;

public class Select_Hotel_Exe extends Search_Hotel_Exe {
      
	  public  void selectHotel(String locator) {
		 new Utility().getElement(By.id("radiobutton_0")).click();;
		 
	  }
	  
	  public void continueBtn() {
		  new Utility().getElement(By.id("continue")).click();
	  }
	  
	  
}
