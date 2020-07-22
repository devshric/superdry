package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndToEndSD extends BaseClass{
	
	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
	    homePage.verifyHomePage();
	}

	@When("^I add products to the basket$")
	public void i_add_products_to_the_basket() throws Throwable {
	   endToEnd.addProductsToTheBasket();
		
	}

	@When("^I click on checkout button$")
	public void i_click_on_checkout_button() throws Throwable {
	    endToEnd.verifyCheckoutButton();
		
	}

	@When("^I continue as a guest user$")
	public void i_continue_as_a_guest_user() throws Throwable {
	    endToEnd.verifyGuestCustomer();
	}

	@When("^I click on Buy now$")
	public void i_click_on_Buy_now() throws Throwable {
	    
	}

	@Then("^I will be able to successfully place the order$")
	public void i_will_be_able_to_successfully_place_the_order() throws Throwable {
	    
	}



}
