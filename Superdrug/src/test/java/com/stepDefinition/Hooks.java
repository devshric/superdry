package com.stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	String URL="https://www.superdry.com/";
	
	
	@Before
	public void start() {
	try {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CEX\\Documents\\DevshriClasses\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
      //implicitWait.applyImplicitWait();
	  driver.get(URL);
	}catch (Exception e) {
		System.out.print("homepage not loading");
		
	}
	}

	//@After
	//public void close() {
		//driver.close();
	}
		
	}

