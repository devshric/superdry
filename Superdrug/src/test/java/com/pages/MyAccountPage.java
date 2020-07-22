package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

public class MyAccountPage extends BaseClass{
	
	public void verifyAccountPage() throws InterruptedException {
		
		Assert.assertEquals("Account Maintenance - Superdry", driver.getTitle());
		
	}
	
    public void verifyInvalidAccountPage() throws InterruptedException {
		
    	Thread.sleep(3000);
    	
		Assert.assertEquals("Your email address has not been recognised", driver.findElement(By.cssSelector(".error")).getText());
		
	}
	
}
