package com.pages;

import java.util.Map;

import org.junit.Assert;

import com.runner.BaseClass;

import Constants.LoginConstants;
import cucumber.api.DataTable;

public class LoginPage extends BaseClass{
	
	
	public void verifyLoginPage() {
		
		action.clickOnLoginIcon(LoginConstants.LOGINICON);
		Assert.assertEquals("https://www.superdry.com/my-account",driver.getCurrentUrl());
	
		//driver.findElement(LOGINICON).click();
	}

	public void verifyLoginWithValidDetails(DataTable loginTable) {
		
		Map<String, String> loginDetails=loginTable.asMap(String.class, String.class);
		String username = loginDetails.get("email");
		String password = loginDetails.get("Password");
		
		/*driver.findElement(USERNAME).clear();
		driver.findElement(USERNAME).sendKeys(username);
		driver.findElement(PASSWORD).clear();
		driver.findElement(PASSWORD).sendKeys(password);*/
		//driver.findElement(LOGINBUTTON).click();
		
		action.updateLoginBox(LoginConstants.USERNAME, username);
		action.updateLoginBox(LoginConstants.PASSWORD, password);
		action.clickOnLoginButton(LoginConstants.LOGINBUTTON);
		}
	
public void verifyLoginWithInvalidDetails(DataTable loginTable) throws InterruptedException {
		
		Map<String, String> loginDetails=loginTable.asMap(String.class, String.class);
		String username = loginDetails.get("email");
		String password = loginDetails.get("Password");
		
		Thread.sleep(3000);
		/*driver.findElement(USERNAME).clear();
		driver.findElement(USERNAME).sendKeys(loginDetails.get("email"));
		driver.findElement(PASSWORD).clear();
		driver.findElement(PASSWORD).sendKeys(loginDetails.get("password"));*/
		//driver.findElement(LOGINBUTTON).click();
		
		action.updateLoginBox(LoginConstants.USERNAME, username);
		action.updateLoginBox(LoginConstants.PASSWORD, password);
		action.clickOnLoginButton(LoginConstants.LOGINBUTTON);
		
		
		}
	
	
}
