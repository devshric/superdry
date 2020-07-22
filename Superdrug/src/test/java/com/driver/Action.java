package com.driver;

import org.openqa.selenium.By;


import com.runner.BaseClass;

public class Action extends BaseClass{

	public void updateSearchBox1(By element) {
		driver.findElement(element).click(); 
    }
	
	public By updateSearchBox2(By element,String search) {
		driver.findElement(element).clear();
	    driver.findElement(element).sendKeys(search);  
		return element;
    }
	
	public void clickOnSearchButton(By element) {
		driver.findElements(element).get(1).click();
	}
	
	public void updateLoginBox(By element,String search) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(search);  
    }
	
	public void updatePasswordBox(By element,String search) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(search);  
	}
	
	public void clickOnLoginButton(By element) {
		driver.findElement(element).click();;
	}
	
	public void clickOnLoginIcon(By element) {
		driver.findElement(element).click();
	}
}
