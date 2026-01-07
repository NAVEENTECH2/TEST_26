package com.prop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Properties_file  {
    public static Properties prop;
	 public static void propRead() {
		 try {
			FileReader fr = new FileReader(new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\config.properties"));
		    prop = new Properties();
			prop.load(fr);
			String url = prop.getProperty("url");
			    System.out.println(url);
			String user = prop.getProperty("username");
			    System.out.println(user);
			String pass = prop.getProperty("password");
			    System.out.println(pass);
			    
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	
	 public static String getUser(String user) {
		return prop.getProperty(user);
		 
	 }
	 public static String getPass(String pass) {
		return prop.getProperty(pass);
		 
	 }
}
