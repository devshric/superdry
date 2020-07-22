package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class MyAccountPageSD extends BaseClass{
	@Then("^I should successfully log in$")
	public void i_should_successfully_log_in() throws Throwable {

		myAccountPage.verifyAccountPage();
	}

	 @Then("^I should see the error message$")
		public void i_should_see_the_error_message() throws Throwable {
		    myAccountPage.verifyInvalidAccountPage();
 }
}
