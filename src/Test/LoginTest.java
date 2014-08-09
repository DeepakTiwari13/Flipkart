package Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Pages.Flipkart.FlipkartLogin;
import Deepak.Utility.Flipkart.Constants;
import Deepak.Utility.Flipkart.Utils;

public class LoginTest extends TestBase {

	Logger APPLICATION_Logs = Logger.getLogger("LoginTest");

	@BeforeTest
	public void InitTest() throws IOException {
		InitConf();
		InitDriver();
	}

	@Test
	public void FlipkartUserLoginTest() throws IOException, InterruptedException {
		APPLICATION_Logs.info("Launching Flipkart Login test");
		driver.get(CON.getProperty("URL"));
		Utils.getServerResponse(driver.getCurrentUrl());
		FlipkartLogin lt = PageFactory
				.initElements(driver, FlipkartLogin.class);
		lt.FlipkartAccountLogin(CON.getProperty("UserName"),
				CON.getProperty("Password"));
		Assert.assertNotNull(driver.findElement(By.xpath(Constants.Whoisloggedin)));
		Utils.getScreenshot("FlipkartUserLoginTest");
	}

}
