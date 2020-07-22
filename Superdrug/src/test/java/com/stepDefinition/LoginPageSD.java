package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageSD extends BaseClass{
	@Given("^I am on Login Page$")
	public void i_am_on_Login_Page() throws Throwable {
		loginPage.verifyLoginPage();
		
	}

	@When("^I enter valid details$")
	public void i_enter_valid_details(DataTable loginTable) throws Throwable {
		loginPage.verifyLoginWithValidDetails(loginTable);
	    
	}

	@When("^I enter invalid details$")
	public void i_enter_invalid_details(DataTable loginTable) throws Throwable {
	  loginPage.verifyLoginWithInvalidDetails(loginTable);  
	}

	
	

}
