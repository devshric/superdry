package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class SearchResultSD extends BaseClass{
	

	@Then("^I should see related search products$")
	public void i_should_see_related_search_products() throws Throwable {
		searchResultPage.verifyValidSearchResults(); 
    }

	    
     @Then("^I should see a message$")
	 public void i_should_see_a_message() throws Throwable {
	    searchResultPage.verifyInvalidSearchResults();
	    	
	}
	    
	 @Then("^Auto suggestion should be displayed$")
	 public void auto_suggestion_should_be_displayed() throws Throwable {
		  searchResultPage.verifyAutoFill();  
    }
	 
	
}
