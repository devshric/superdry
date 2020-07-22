package Constants;

import org.openqa.selenium.By;

public interface LoginConstants {
	
	By LOGINICON = By.cssSelector(".custom-icon.my-account");
	By USERNAME = By.cssSelector("#username_login");
    By PASSWORD = By.cssSelector("#passwd_login");
	By LOGINBUTTON = By.cssSelector("input[name='Submit']");
	

}
