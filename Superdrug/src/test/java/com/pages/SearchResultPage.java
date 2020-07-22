package com.pages;

import org.junit.Assert;
import com.runner.BaseClass;

public class SearchResultPage extends BaseClass{
	
	public void verifyValidSearchResults() {
		
		Assert.assertEquals("Superdry "+globalSearchWord,driver.getTitle());
		
	}
	
	public void verifyInvalidSearchResults() {
		
		Assert.assertEquals("https://www.superdry.com/search/"+globalSearchWord,driver.getCurrentUrl());
	}

	public void verifyAutoFill() {
		
		Assert.assertEquals("Superdry women’s coats", driver.getTitle());
	}
}
