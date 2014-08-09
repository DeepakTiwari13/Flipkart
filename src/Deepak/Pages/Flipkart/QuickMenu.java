package Deepak.Pages.Flipkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Utility.Flipkart.Constants;

public class QuickMenu extends TestBase {
	@FindBy(xpath = Constants.Gotoquickmobile)
	WebElement QuickMobiles;
	@FindBy(xpath = Constants.Gotoquicktablets)
	WebElement QuickTablets;
	@FindBy(xpath = Constants.Gotoquickmobileaccessories)
	WebElement QuickMobileAccessories;
	@FindBy(xpath = Constants.GotoquickLaptops)
	WebElement QuickLaptops;
	@FindBy(xpath = Constants.GotoquickPenDrives)
	WebElement QuickPenDrives;
	@FindBy(xpath = Constants.GotoquickTVs)
	WebElement QuickTvs;
	@FindBy(xpath = Constants.GotoquickAcs)
	WebElement QuickAcs;
	@FindBy(xpath = Constants.Gotoquickwatches)
	WebElement QuickWatches;
	@FindBy(xpath = Constants.GotoquickToys)
	WebElement QuickToys;
	@FindBy(xpath = Constants.GotoquickSunglasses)
	WebElement QuickSunglasses;
	@FindBy(xpath = Constants.GotoquickPerfumes)
	WebElement QuickPerfumes;
	@FindBy(xpath = Constants.GotoquickGiftVoucher)
	WebElement QuickGiftVoucher;
	Logger APPLICATION_Logs = Logger.getLogger("QuickMenu");

	WebDriver driver;

	public QuickMenu(WebDriver driver) {
		this.driver = driver;
		System.out.println("In to QuickMenu page constructor");
	}

	public void GotoMobile() {
		QuickMobiles.click();
		APPLICATION_Logs.info("Quick Mobiles clicked");
	}

	public void GotoTablets() {
		QuickTablets.click();
		APPLICATION_Logs.info("Quick Tablets clicked");

	}

	public void GotoMobileAccessories() {
		QuickMobileAccessories.click();
		APPLICATION_Logs.info("Quick Mobile accessories clicked");
	}

	public void GotoLaptops() {
		QuickLaptops.click();
		APPLICATION_Logs.info("Quick Laptop clicked");
	}

	public void GotoPenDrives() {
		QuickPenDrives.click();
		APPLICATION_Logs.info("Quick Pendrive clicked");
	}

	public void GotoTVs() {
		QuickTvs.click();
		APPLICATION_Logs.info("Quick TVs clicked");
	}

	public void GotoAcs() {
		QuickAcs.click();
		APPLICATION_Logs.info("Quick ACs clicked");
	}

	public void GotoWatches() {
		QuickWatches.click();
		APPLICATION_Logs.info("Quick Watches clicked");
	}

	public void GotoToys() {
		QuickToys.click();
		APPLICATION_Logs.info("Quick Toys clicked");
	}

	public void GotoSunglasses() {
		QuickSunglasses.click();
		APPLICATION_Logs.info("Quick Sunglasses clicked");

	}

	public void GotoPerfumes() {
		QuickPerfumes.click();
		APPLICATION_Logs.info("Quick Perfumes clicked");
	}

	public void GotoGiftVoucher() {
		QuickGiftVoucher.click();
		APPLICATION_Logs.info("Quick Gift voucher clicked");

	}
}
