package Test;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Pages.Flipkart.FlipkartTvs;
import Deepak.Pages.Flipkart.QuickMenu;
import Deepak.Utility.Flipkart.Constants;
import Deepak.Utility.Flipkart.Utils;

public class TVsTest extends TestBase{
	Logger APPLICATION_Logs = Logger.getLogger("TVsTest");
	@BeforeTest
	public void InitTest() throws IOException {
		InitConf();
		InitDriver();
	}
	@Test
	public void TVsatFlipkarttest() throws IOException{
		APPLICATION_Logs.info("Launching TVs available at Flipkart test");
		driver.get(CON.getProperty("URL"));
		QuickMenu qm = PageFactory.initElements(driver, QuickMenu.class);
		qm.GotoTVs();
		Utils.getServerResponse(driver.getCurrentUrl());
		FlipkartTvs FTv = PageFactory.initElements(driver, FlipkartTvs.class);
		FTv.getYourTV();
		WebElement TV =driver.findElement(By.xpath(Constants.DisplayedTv));
		List<WebElement> AllTV = TV.findElements(By.tagName("a"));
		for(int i=0;i<AllTV.size();i++){
			System.out.println("================================");
			System.out.println(AllTV.get(i).getText());
			APPLICATION_Logs.info(AllTV.get(i).getText());
		}
		Utils.getScreenshot("TVsatFlipkarttest");
		
	
	}

}
