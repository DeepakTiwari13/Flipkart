package Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Pages.Flipkart.LandingPage;
import Deepak.Utility.Flipkart.Utils;

public class LandingPageTest extends TestBase {
	
	Logger APPLICATION_Logs = Logger.getLogger("LandingPageTest");

/*	@BeforeSuite
	public void InitTest() throws IOException {
		InitConf();
		InitDriver();
	}*/
	@Test
	public void LandingPageElementListTest() throws IOException{
		APPLICATION_Logs.info("Launching Flipkart Landing Page element list page");
		driver.get(CON.getProperty("URL"));
		Utils.getServerResponse(driver.getCurrentUrl());
		LandingPage lp = PageFactory.initElements(driver, LandingPage.class);
		lp.ElectronicItemList();
		lp.FashionList();
		lp.BookList();
		lp.OtherStores();
		lp.MainTopMenuList();
		lp.SubMenuList();
		Assert.assertNotNull(lp);
		Utils.getScreenshot("LandingPageElementListTest");
	}


}
