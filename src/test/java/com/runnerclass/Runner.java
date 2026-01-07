package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\feature",
      glue ="com.stepdefinition",
      tags = "@flip_page2",
      dryRun = false,
      publish = true,
      monochrome = true
      
   )
public class Runner {		
	
}
