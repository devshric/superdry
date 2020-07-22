package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.driver.ExplicitWait;
import com.driver.Implicitwait;
import com.pages.EndToEndFunction;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MyAccountPage;
import com.pages.SearchResultPage;


public class BaseClass{

	public static WebDriver driver;
	public static String globalSearchWord;
	public static HomePage homePage = new HomePage();
	public static SearchResultPage searchResultPage = new SearchResultPage();
	public static LoginPage loginPage = new LoginPage();
    public static MyAccountPage myAccountPage = new MyAccountPage();
	public static EndToEndFunction endToEnd=new EndToEndFunction();
	public static Action action=new Action();
	public static Implicitwait implicitWait=new Implicitwait();
	public static ExplicitWait explicitWait=new ExplicitWait();
	
}