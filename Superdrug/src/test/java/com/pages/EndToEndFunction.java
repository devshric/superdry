package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

import Constants.EndToEndConstants;
import Constants.SearchConstants;

public class EndToEndFunction extends BaseClass {
	
	
	public void addProductsToTheBasket() throws InterruptedException {
		
		//product search
		action.updateSearchBox1(SearchConstants.SEARCHTEXTBOX1);
		action.updateSearchBox2(SearchConstants.SEARCHTEXTBOX2,"jeans");
		action.clickOnSearchButton(SearchConstants.SEARCHBUTTON);
		Assert.assertEquals("Superdry jeans" ,driver.getTitle());
		
		/*driver.findElement(SEARCHTEXTBOX1).click();;
		driver.findElement(SEARCHTEXTBOX2).clear();
		driver.findElement(SEARCHTEXTBOX2).sendKeys("jeans");
		driver.findElements(SEARCHBUTTON).get(1).click();*/
		
		
		//Sort By Drop Down
		explicitWait.visibilityOfElementClick(By.cssSelector("button[data-id='category-sorting']"), 5);
		//driver.findElement(By.cssSelector("button[data-id='category-sorting']")).click();
		Thread.sleep(5000);
		driver.findElements(By.cssSelector("li[data-original-index='2']")).get(1).click();
	  
		
		//Adding first product
		Thread.sleep(5000);
	    driver.findElement(By.cssSelector("#product153543")).click();
	    Assert.assertEquals("Mens - Conor Taper Jeans in Byrom Dark Blue | Superdry",driver.getTitle());
	    
	    
	    //select Size from Drop Down
	    Select sizeDropDown=new Select(driver.findElement(By.name("size-dropdown")));
	    sizeDropDown.selectByIndex(5);
	    driver.findElement(EndToEndConstants.addToBagButton).click();
	    Thread.sleep(3000);
	    
	    //product search
	    Thread.sleep(5000);
	    action.updateSearchBox1(SearchConstants.SEARCHTEXTBOX1);
	    Thread.sleep(5000);
	    explicitWait.visibilityOfElement(action.updateSearchBox2(SearchConstants.SEARCHTEXTBOX2,"polos"));
	    //action.updateSearchBox2(SearchConstants.SEARCHTEXTBOX2,"polos");
	    action.clickOnSearchButton(SearchConstants.SEARCHBUTTON);
		Assert.assertEquals("https://www.superdry.com/search/polos", driver.getCurrentUrl());
	    
	    /*driver.findElement(SEARCHTEXTBOX1).click();;
	    Thread.sleep(10000);
	    driver.findElement(SEARCHTEXTBOX2).clear();
		driver.findElement(SEARCHTEXTBOX2).sendKeys("polos");
		driver.findElements(SEARCHBUTTON).get(1).click();*/
		
		
		//Adding second product
		Thread.sleep(10000);
	    driver.findElement(By.cssSelector("#product171349")).click();
	    Assert.assertEquals("Mens - Classic Superstate Polo Shirt in Ensign Blue Twist | Superdry",driver.getTitle());
	    
		
	    //Select size from Drop Down
	    Select sizeDropDown1=new Select (driver.findElement(By.xpath("//*[@id='add_to_bag_desktop']/div[1]/div[2]/select")));
	    Thread.sleep(5000);
	    sizeDropDown1.selectByVisibleText("L");;
	    driver.findElement(EndToEndConstants.addToBagButton).click();	    
	   
	   
	    //Click on Basket Button
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("a[title='View Bag']")).click();
	  	   }
	
	
	
	
	    
	    public void verifyCheckoutButton() throws InterruptedException {
	    	  Thread.sleep(5000);
	    	 driver.findElement(By.cssSelector("#checkout-submit")).click();
			 Assert.assertEquals("Log in - Superdry", driver.getTitle());
	    }
	    	
	    public void verifyGuestCustomer() throws InterruptedException{
	    	Thread.sleep(5000);
		    driver.findElement(By.cssSelector("a[title='continue as guest']")).click();
		    Assert.assertEquals("Checkout - Superdry", driver.getTitle());
		    driver.findElement(By.cssSelector(".btn.dropdown-toggle.btn-default.GBR")).click();
		    driver.findElement(By.cssSelector(".bs-searchbox .form-control")).clear();
		    driver.findElement(By.cssSelector(".bs-searchbox .form-control")).sendKeys("United Kingdom");
		    driver.findElement(By.cssSelector(".country-option.GBR.selected.active")).click();
		    driver.findElement(By.cssSelector("#delivery-type-domestic")).click();
		    
		    driver.findElement(By.cssSelector("#shipping_first_name")).clear();
		    driver.findElement(By.cssSelector("#shipping_first_name")).sendKeys("Disha");
		    
		    driver.findElement(By.cssSelector("#shipping_last_name")).clear();
		    driver.findElement(By.cssSelector("#shipping_last_name")).sendKeys("Singh");
		    
		    driver.findElement(By.cssSelector("#billing_phone")).clear();
		    driver.findElement(By.cssSelector("#billing_phone")).sendKeys("12345678");
		    
		    
		    driver.findElement(By.cssSelector("#billing_email")).clear();
		    driver.findElement(By.cssSelector("#billing_email")).sendKeys("disha_0912@yahoo.com");
		   
		    driver.findElement(By.cssSelector("#billing_confirmemail")).clear();
		    driver.findElement(By.cssSelector("#billing_confirmemail")).sendKeys("disha_0912@yahoo.com");
		    
		    driver.findElement(By.cssSelector("#shipping-address-search")).clear();
		    driver.findElement(By.cssSelector("#shipping-address-search")).sendKeys("NW9 9BP");
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector(".pcadescription")).click();
		   // Thread.sleep(4000);
		    //driver.findElement(By.cssSelector("div[title='Flat 18, Acacia Court, Alpine Road']")).click();
		    
		    
		   
		    
		    
		    
		    
		    
		    }
	    
	    
	    
	        
	

}
