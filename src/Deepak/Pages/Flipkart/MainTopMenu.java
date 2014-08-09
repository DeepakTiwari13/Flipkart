package Deepak.Pages.Flipkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Utility.Flipkart.Constants;

public class MainTopMenu extends TestBase {

	@FindBy(xpath = Constants.Eheader)
	private WebElement Electronicheader;
	@FindBy(xpath = Constants.MHeader)
	private WebElement Menheader;
	@FindBy(xpath = Constants.WomenTab)
	private WebElement Women;
	@FindBy(xpath = Constants.BabyandKidsTab)
	private WebElement BabyandKids;
	@FindBy(xpath = Constants.BooksandmediaTab)
	private WebElement BooksandMedia;
	@FindBy(xpath = Constants.HomeandKitchenTab)
	private WebElement HomeandKitchen;
	@FindBy(xpath = Constants.MoreStoreTab)
	private WebElement MoreStore;
	@FindBy(xpath = Constants.Offerzonetab)
	private WebElement OfferZone;
	@FindBy(xpath = Constants.FK)
	WebElement Flipkart;

	Logger APPLICATION_Logs = Logger.getLogger("MainTopMenu");
	WebDriver driver;

	public MainTopMenu(WebDriver driver) {
		this.driver = driver;
		System.out.println("In to MainTopMenu page constructor");

	}

	public LandingPage FlipkartHome() {
		Flipkart.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}

	public void getElectronics() {
		System.out.println("Mouse hover to ELECTRONIC");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = Electronicheader;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to ELECTRONIC");
	}

	public void getMen() {
		System.out.println("Mouse hover to MEN");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = Menheader;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to MEN");
	}

	public void getWomen() {
		System.out.println("Mouse hover to WOMEN");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = Women;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to WOMEN");
	}

	public void getBabyandKids() {
		System.out.println("Mouse hover to BABYANDKIDS");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = BabyandKids;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to BABYANDKIDS");
	}

	public void getBooksandMedia() {
		System.out.println("Mouse hover to BOOKSANDMEDIA");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = BooksandMedia;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to BOOKSANDMEDIA");
	}

	public void getHomeandKitchen() {
		System.out.println("Mouse hover to HOMEANDKITCHEN");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = HomeandKitchen;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to HOMEANDKITCHEN");
	}

	public void getMoreStores() {
		System.out.println("Mouse hover to MORESTORE");
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = MoreStore;
		actions.moveToElement(menuHoverLink).build().perform();
		APPLICATION_Logs.info("Mouse hover to MORESTORE");
	}

	public void getOffersZone() {
		OfferZone.click();
		APPLICATION_Logs.info("Clicked offer zone");
	}
}