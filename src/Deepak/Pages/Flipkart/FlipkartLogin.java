package Deepak.Pages.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Deepak.Utility.Flipkart.Constants;

public class FlipkartLogin {

	@FindBy(xpath = Constants.LoginLinkClick)
	WebElement LoginLink;
	@FindBy(xpath = Constants.LoginName)
	WebElement UserName;
	@FindBy(xpath = Constants.LoginPwd)
	WebElement Password;
	@FindBy(xpath = Constants.EnterButton)
	WebElement LoginButton;
	@FindBy(xpath = Constants.Whoisloggedin)
	WebElement LogginUserName;
	WebDriver driver;
	
	public FlipkartLogin(WebDriver dr){
		driver =dr;
	}

	public void FlipkartAccountLogin(String username, String password) throws InterruptedException {
		LoginLink.click();
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
	}

}
