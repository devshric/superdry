package com.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.runner.BaseClass;
import Constants.SearchConstants;


public class HomePage extends BaseClass {
	
	
public void verifyHomePage() {
	Assert.assertEquals("Superdry Summer Sale Now On - Mens & Womens Clothing - Superdry", driver.getTitle());
}

public void searchForTheValidProducts(String search)
{
	globalSearchWord=search;
	action.updateSearchBox1(SearchConstants.SEARCHTEXTBOX1);
	action.updateSearchBox2(SearchConstants.SEARCHTEXTBOX2,search);
	action.clickOnSearchButton(SearchConstants.SEARCHBUTTON);
    

	//driver.findElement(SEARCHTEXTBOX1).click();
	//driver.findElements(SEARCHBUTTON).get(1).click();
}
public void searchForTheInvalidProducts(String search) {

	globalSearchWord=search;
	action.updateSearchBox1(SearchConstants.SEARCHTEXTBOX1);
	action.updateSearchBox2(SearchConstants.SEARCHTEXTBOX2,search);
	action.clickOnSearchButton(SearchConstants.SEARCHBUTTON);
	
	//driver.findElement(SEARCHTEXTBOX1).click();
	//driver.findElements(SEARCHBUTTON).get(1).click();
	
}
public void searchWithAutoFill() {
	
	action.updateSearchBox1(SearchConstants.SEARCHTEXTBOX1);
	//driver.findElement(SEARCHTEXTBOX1).click();
	
	action.updateSearchBox2(SearchConstants.SEARCHTEXTBOX2,"wom");
	for (int i=0; i<=3; i++) {
		
		//action.updateSearchBoxTwo(SearchConstants.SEARCHTEXTBOX2,Keys.ARROW_DOWN);
		driver.findElement(SearchConstants.SEARCHTEXTBOX2).sendKeys(Keys.ARROW_DOWN);
		
	}
	driver.findElement(SearchConstants.SEARCHTEXTBOX2).sendKeys(Keys.ENTER);
	
}
}





