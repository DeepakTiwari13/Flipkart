package Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Pages.Flipkart.MainTopMenu;
import Deepak.Utility.Flipkart.Constants;
import Deepak.Utility.Flipkart.Utils;

public class OfferZoneTest extends TestBase {
	
	Logger APPLICATION_Logs = Logger.getLogger("OfferZone");
	
	@BeforeTest
	public void InitTest() throws IOException {
		InitConf();
		InitDriver();
	}
	
	@Test
	public void DailyOfferTest() throws IOException{
		APPLICATION_Logs.info("Launching daily offer test");
		driver.get(CON.getProperty("URL"));
		MainTopMenu Mtp = PageFactory.initElements(driver, MainTopMenu.class);
		Mtp.getOffersZone();
		Utils.getServerResponse(driver.getCurrentUrl());
		String Part1 = Constants.Deal1;
		String Part2 = Constants.Deal2;
		for(int i=2;i<9;i++){
			String Deals =driver.findElement(By.xpath(Part1+i+Part2)).getText();
			System.out.println("=============================================");
			System.out.println(Deals);
			APPLICATION_Logs.info(Deals);
		}
		Utils.getScreenshot("DailyOfferTest");
		}
	}
	


