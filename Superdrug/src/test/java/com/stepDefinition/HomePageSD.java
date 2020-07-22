package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSD extends BaseClass {
	
	@Given("^I am on Home Page$")
	public void i_am_on_Home_Page() throws Throwable {
		homePage.verifyHomePage();
		}

	@When("^I enter the valid \"([^\"]*)\" details$")
	public void i_enter_the_valid_details(String search) throws Throwable {
	    homePage.searchForTheValidProducts(search);
	}
    

    @When("^I enter the invalid \"([^\"]*)\" details$")
    public void i_enter_the_invalid_details(String search) throws Throwable {
		homePage.searchForTheInvalidProducts(search);
	    
	}
	
	@When("^I enter first few characters in Search field$")
	public void i_enter_first_few_characters_in_Search_field() throws Throwable {
		homePage.searchWithAutoFill();
	}

}




